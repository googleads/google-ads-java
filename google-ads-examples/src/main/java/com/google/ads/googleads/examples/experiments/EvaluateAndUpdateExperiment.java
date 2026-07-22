package com.google.ads.googleads.examples.experiments;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v25.common.Metrics;
import com.google.ads.googleads.v25.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v25.enums.ExperimentTypeEnum.ExperimentType;
import com.google.ads.googleads.v25.errors.GoogleAdsError;
import com.google.ads.googleads.v25.errors.GoogleAdsException;
import com.google.ads.googleads.v25.resources.CampaignBudget;
import com.google.ads.googleads.v25.services.CampaignBudgetMapping;
import com.google.ads.googleads.v25.services.CampaignBudgetOperation;
import com.google.ads.googleads.v25.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v25.services.ExperimentServiceClient;
import com.google.ads.googleads.v25.services.GoogleAdsRow;
import com.google.ads.googleads.v25.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v25.services.MutateCampaignBudgetsResponse;
import com.google.ads.googleads.v25.services.SearchGoogleAdsRequest;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.common.collect.Iterables;
import com.google.protobuf.Empty;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

/**
 * Retrieves performance metrics for an experiment, evaluates the performance and takes action on
 * the experiment accordingly.
 *
 * <p>It shows how to query statistical significance metrics for the experiment, and how to execute
 * actions such as promoting, ending, or graduating an experiment.
 */
public class EvaluateAndUpdateExperiment {
  private static final double P_VALUE_THRESHOLD = 0.05;

  private static class EvaluateAndUpdateExperimentParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.EXPERIMENT_ID, required = true)
    private Long experimentId;
  }

  public static void main(String[] args) {
    EvaluateAndUpdateExperimentParams params = new EvaluateAndUpdateExperimentParams();
    if (!params.parseArguments(args)) {
      throw new IllegalArgumentException("Invalid or missing command line arguments");
    }

    GoogleAdsClient googleAdsClient = null;
    try {
      googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
          "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      System.exit(1);
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      System.exit(1);
    }

    try {
      new EvaluateAndUpdateExperiment()
          .runExample(googleAdsClient, params.customerId, params.experimentId);
    } catch (GoogleAdsException gae) {
      System.err.printf(
          "Request ID %s failed due to GoogleAdsException. Underlying errors:%n",
          gae.getRequestId());
      int i = 0;
      for (GoogleAdsError googleAdsError : gae.getGoogleAdsFailure().getErrorsList()) {
        System.err.printf("  Error %d: %s%n", i++, googleAdsError);
      }
      System.exit(1);
    }
  }

  /**
   * Runs the example.
   *
   * @param googleAdsClient the googleAdsClient.
   * @param customerId the customer ID.
   * @param experimentId the experiment ID.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long experimentId) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {

      // Query to retrieve the experiment.
      // Notice that we request the statistical metrics (for example, p-value, point estimate,
      // margin of error) which are populated based on the treatment arm.
      String query =
          String.format(
              "SELECT "
                  + "experiment.resource_name, "
                  + "experiment.name, "
                  + "experiment.experiment_id, "
                  + "experiment.type, "
                  + "metrics.conversions_absolute_change_p_value, "
                  + "metrics.conversions_absolute_change_point_estimate, "
                  + "metrics.conversions_absolute_change_margin_of_error, "
                  + "metrics.clicks_p_value, "
                  + "metrics.clicks_point_estimate, "
                  + "metrics.clicks_margin_of_error "
                  + "FROM experiment "
                  + "WHERE experiment.experiment_id = %d",
              experimentId);

      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setQuery(query)
              .build();

      GoogleAdsServiceClient.SearchPagedResponse response = googleAdsServiceClient.search(request);

      Iterable<GoogleAdsRow> rows = response.iterateAll();
      if (Iterables.isEmpty(rows)) {
        System.out.printf("No experiment found for experiment ID: %d%n", experimentId);
        return;
      }
      GoogleAdsRow row = Iterables.getOnlyElement(rows);
      System.out.printf("Found experiment: %s%n", row.getExperiment().getName());
      System.out.printf("  Resource Name: %s%n", row.getExperiment().getResourceName());

      evaluateExperiment(googleAdsClient, customerId, row);
    }
  }

  /**
   * Evaluates the performance of the experiment and updates it accordingly (for example, promotes,
   * ends, or graduates).
   *
   * <p>Checks conversion and click metrics against statistical significance thresholds to determine
   * the appropriate action to take on the experiment.
   */
  // [START evaluate_and_update_experiment_1]
  private void evaluateExperiment(
      GoogleAdsClient googleAdsClient, long customerId, GoogleAdsRow row) {
    Metrics metrics = row.getMetrics();
    String experimentResourceName = row.getExperiment().getResourceName();

    // 1. Evaluate conversion success as a primary success signal if available.
    // - Point Estimate: Represents the estimated average lift or difference in conversions.
    // - Margin of Error: Outlines the confidence interval bounds. Note that the margin_of_error
    //   provided by the API is calculated for a preset confidence level which is set based on the
    //   experiment type.
    // - Lower Bound: (Point Estimate - Margin of Error). If this value is above 0,
    //   we have statistical significance that performance has improved.
    double convPValue = metrics.getConversionsAbsoluteChangePValue();
    double convLift = metrics.getConversionsAbsoluteChangePointEstimate();
    double convError = metrics.getConversionsAbsoluteChangeMarginOfError();
    double convLowerBound = convLift - convError;

    if (convPValue <= P_VALUE_THRESHOLD) {
      if (convLowerBound > 0) {
        System.out.printf(
            "Significant Success: Conversions increased. Even at the lower bound, the lift is %.2f."
                + " Promoting changes.%n",
            convLowerBound);
        promoteExperiment(googleAdsClient, customerId, experimentResourceName);
        return;
      } else if ((convLift + convError) < 0) {
        System.out.printf(
            "Significant Decline: Even the upper bound (%.2f) is below zero. Ending experiment.%n",
            convLift + convError);
        endExperiment(googleAdsClient, customerId, experimentResourceName);
        return;
      }
    }

    // 2. Fall back to evaluating click metrics if conversions are inconclusive.
    double clickPValue = metrics.getClicksPValue();
    double clickLift = metrics.getClicksPointEstimate();
    double clickError = metrics.getClicksMarginOfError();
    double clickLowerBound = clickLift - clickError;

    if (clickPValue <= P_VALUE_THRESHOLD && clickLowerBound > 0) {
      System.out.printf("Click volume is significantly up (+%.1f%%).%n", clickLift * 100);

      // Graduation is only supported for separate campaign experiments, not
      // intra-campaign experiments where there is no separate treatment campaign.
      ExperimentType experimentType = row.getExperiment().getType();
      if (experimentType != ExperimentType.ADOPT_BROAD_MATCH_KEYWORDS
          && experimentType != ExperimentType.ADOPT_AI_MAX) {
        System.out.println("Graduating treatment campaign for further manual analysis.");
        graduateExperiment(googleAdsClient, customerId, experimentResourceName);
      } else {
        System.out.println(
            "Intra-campaign trial detected: graduation is not supported. Continuing to run the"
                + " experiment to gather more conversion data.");
      }
    } else {
      // 3. Print status if no action was taken.
      System.out.printf(
          "Inconclusive: No significant lift in Conversions (p=%.2f) or Clicks (p=%.2f). Current"
              + " estimated lift: %.2f +/- %.2f. Allowing the experiment to continue running.%n",
          convPValue, clickPValue, convLift, convError);
    }
  }

  // [END evaluate_and_update_experiment_1]

  /**
   * Promotes the experiment trial campaign to the base campaign.
   *
   * <p>Promotion is an asynchronous long-running process that copies the trial campaign's settings
   * and creatives back to the base campaign and subsequently ends the experiment.
   */
  private void promoteExperiment(
      GoogleAdsClient googleAdsClient, long customerId, String experimentResourceName) {
    try (ExperimentServiceClient experimentServiceClient =
        googleAdsClient.getLatestVersion().createExperimentServiceClient()) {
      // This method returns a long running operation (LRO).
      // - To block until the operation is complete: call operationResponse.get()
      // - For non-blocking status checks: use operationResponse.isDone()
      // - For manual polling or persistent tracking: store operationResponse.getName()
      //
      // For more information on handling LROs, see:
      // https://developers.google.com/google-ads/api/docs/concepts/long-running-operations
      OperationFuture<Empty, ?> operationResponse =
          experimentServiceClient.promoteExperimentAsync(experimentResourceName);
      System.out.printf("Started promotion for experiment: %s%n", experimentResourceName);
      System.out.printf(
          "The promotion is running asynchronously. You can track its progress using the"
              + " long-running operation: %s%n",
          operationResponse.getName());
      System.out.println(
          "Best Practice: If the promotion fails, you can retrieve the full list of errors by"
              + " calling ExperimentService.ListExperimentAsyncErrors.");
    } catch (Exception e) {
      System.out.printf("Failed to promote experiment: %s%n", e.getMessage());
    }
  }

  /**
   * Immediately ends the experiment.
   *
   * <p>Terminates the traffic split and sets the end date to the current time.
   */
  private void endExperiment(
      GoogleAdsClient googleAdsClient, long customerId, String experimentResourceName) {
    try (ExperimentServiceClient experimentServiceClient =
        googleAdsClient.getLatestVersion().createExperimentServiceClient()) {
      experimentServiceClient.endExperiment(experimentResourceName);
      System.out.printf("Successfully ended experiment: %s%n", experimentResourceName);
    }
  }

  /**
   * Graduates the experiment to a full standalone campaign.
   *
   * <p>This process involves creating a new budget and mapping the treatment campaign to it.
   */
  private void graduateExperiment(
      GoogleAdsClient googleAdsClient, long customerId, String experimentResourceName) {
    String budgetResourceName;
    try (CampaignBudgetServiceClient campaignBudgetServiceClient =
        googleAdsClient.getLatestVersion().createCampaignBudgetServiceClient()) {
      // 1. Create a new campaign budget for the graduating campaign.
      CampaignBudget campaignBudget =
          CampaignBudget.newBuilder()
              .setName("Graduated Experiment Budget #" + UUID.randomUUID())
              .setAmountMicros(50_000_000L)
              .setDeliveryMethod(BudgetDeliveryMethod.STANDARD)
              .build();

      CampaignBudgetOperation operation =
          CampaignBudgetOperation.newBuilder().setCreate(campaignBudget).build();

      MutateCampaignBudgetsResponse response =
          campaignBudgetServiceClient.mutateCampaignBudgets(
              Long.toString(customerId), Collections.singletonList(operation));
      budgetResourceName = response.getResults(0).getResourceName();
      System.out.printf(
          "Created new standalone campaign budget with resource name: %s%n", budgetResourceName);
    }

    String treatmentCampaignResourceName = null;
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // 2. Query the experiment_arm to retrieve the treatment campaign's resource name.
      // The treatment arm has control set to FALSE.
      String query =
          String.format(
              "SELECT experiment_arm.campaigns FROM experiment_arm WHERE experiment_arm.experiment"
                  + " = '%s' AND experiment_arm.control = FALSE",
              experimentResourceName);

      GoogleAdsServiceClient.SearchPagedResponse searchResponse =
          googleAdsServiceClient.search(Long.toString(customerId), query);

      // Find the resource name of the treatment campaign.
      for (GoogleAdsRow row : searchResponse.iterateAll()) {
        if (row.getExperimentArm().getCampaignsCount() > 0) {
          treatmentCampaignResourceName = row.getExperimentArm().getCampaigns(0);
          break;
        }
      }
    }

    // Verify that a treatment campaign was found.
    if (treatmentCampaignResourceName == null) {
      System.out.println("Could not find the treatment campaign associated with this experiment.");
      return;
    }

    try (ExperimentServiceClient experimentServiceClient =
        googleAdsClient.getLatestVersion().createExperimentServiceClient()) {
      // 3. Build the budget mapping and execute the graduation request.
      CampaignBudgetMapping budgetMapping =
          CampaignBudgetMapping.newBuilder()
              .setExperimentCampaign(treatmentCampaignResourceName)
              .setCampaignBudget(budgetResourceName)
              .build();

      experimentServiceClient.graduateExperiment(
          experimentResourceName, Collections.singletonList(budgetMapping));
      System.out.printf(
          "Successfully graduated experiment campaign %s with new budget %s%n",
          treatmentCampaignResourceName, budgetResourceName);
    }
  }
}

package com.google.ads.googleads.examples.experiments;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v24.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v24.enums.ExperimentTypeEnum.ExperimentType;
import com.google.ads.googleads.v24.errors.GoogleAdsError;
import com.google.ads.googleads.v24.errors.GoogleAdsException;
import com.google.ads.googleads.v24.resources.CampaignBudget;
import com.google.ads.googleads.v24.common.Metrics;
import com.google.ads.googleads.v24.services.CampaignBudgetMapping;
import com.google.ads.googleads.v24.services.CampaignBudgetOperation;
import com.google.ads.googleads.v24.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v24.services.ExperimentServiceClient;
import com.google.ads.googleads.v24.services.GoogleAdsRow;
import com.google.ads.googleads.v24.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v24.services.MutateCampaignBudgetsResponse;
import com.google.ads.googleads.v24.services.SearchGoogleAdsRequest;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.protobuf.Empty;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.UUID;

/**
 * This example illustrates how to retrieve performance metrics for an experiment.
 *
 * <p>It shows how to query statistical significance metrics for the experiment,
 * and how to execute actions such as promoting, ending, or graduating an experiment.
 */
public class GetExperimentPerformance {
  private static final double P_VALUE_THRESHOLD = 0.05;

  private static class GetExperimentPerformanceParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.EXPERIMENT_ID, required = true)
    private Long experimentId;
  }

  public static void main(String[] args) {
    GetExperimentPerformanceParams params = new GetExperimentPerformanceParams();
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
      new GetExperimentPerformance().runExample(googleAdsClient, params.customerId, params.experimentId);
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

      boolean experimentFound = false;
      for (GoogleAdsRow row : response.iterateAll()) {
        experimentFound = true;
        System.out.printf("Found experiment: %s%n", row.getExperiment().getName());
        System.out.printf("  Resource Name: %s%n", row.getExperiment().getResourceName());

        evaluateExperiment(googleAdsClient, customerId, row);
      }

      if (!experimentFound) {
        System.out.printf("No experiment found for experiment ID: %d%n", experimentId);
      }
    }
  }

  // [START get_experiment_performance_1]
  private void evaluateExperiment(GoogleAdsClient googleAdsClient, long customerId, GoogleAdsRow row) {
    Metrics metrics = row.getMetrics();
    String experimentResourceName = row.getExperiment().getResourceName();

    double convPValue = metrics.getConversionsAbsoluteChangePValue();
    double convLift = metrics.getConversionsAbsoluteChangePointEstimate();
    double convError = metrics.getConversionsAbsoluteChangeMarginOfError();
    double convLowerBound = convLift - convError;

    if (convPValue <= P_VALUE_THRESHOLD) {
      if (convLowerBound > 0) {
        System.out.printf(
            "Significant Success: Conversions increased. Even at the lower bound, the lift is %.2f. Promoting changes.%n",
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

    double clickPValue = metrics.getClicksPValue();
    double clickLift = metrics.getClicksPointEstimate();
    double clickError = metrics.getClicksMarginOfError();
    double clickLowerBound = clickLift - clickError;

    if (clickPValue <= P_VALUE_THRESHOLD && clickLowerBound > 0) {
      System.out.printf(
          "Click volume is significantly up (+%.1f%%). Graduating treatment for further manual analysis.%n",
          clickLift * 100);

      ExperimentType experimentType = row.getExperiment().getType();
      if (experimentType != ExperimentType.ADOPT_BROAD_MATCH_KEYWORDS
          && experimentType != ExperimentType.ADOPT_AI_MAX) {
        graduateExperiment(googleAdsClient, customerId, experimentResourceName);
      } else {
        System.out.println(
            "Intra-campaign trial detected: Graduation is not supported because there is only one campaign. Continuing to run to gather more conversion data.");
      }
    } else {
      System.out.printf(
          "Inconclusive: No significant lift in Conversions (p=%.2f) or Clicks (p=%.2f). Current estimated lift: %.2f +/- %.2f. Continue running.%n",
          convPValue, clickPValue, convLift, convError);
    }
  }
  // [END get_experiment_performance_1]

  private void promoteExperiment(GoogleAdsClient googleAdsClient, long customerId, String experimentResourceName) {
    try (ExperimentServiceClient experimentServiceClient =
        googleAdsClient.getLatestVersion().createExperimentServiceClient()) {
      OperationFuture<Empty, ?> operationResponse =
          experimentServiceClient.promoteExperimentAsync(experimentResourceName);
      System.out.printf("Started promotion for experiment: %s%n", experimentResourceName);
      System.out.printf(
          "The promotion is running asynchronously. You can track its progress using the long-running operation: %s%n",
          operationResponse.getName());
      System.out.println(
          "Best Practice: If the promotion fails, you can retrieve the full list of errors by calling ExperimentService.ListExperimentAsyncErrors.");
    } catch (Exception e) {
      System.out.printf("Failed to promote experiment: %s%n", e.getMessage());
    }
  }

  private void endExperiment(GoogleAdsClient googleAdsClient, long customerId, String experimentResourceName) {
    try (ExperimentServiceClient experimentServiceClient =
        googleAdsClient.getLatestVersion().createExperimentServiceClient()) {
      experimentServiceClient.endExperiment(experimentResourceName);
      System.out.printf("Successfully ended experiment: %s%n", experimentResourceName);
    }
  }

  private void graduateExperiment(GoogleAdsClient googleAdsClient, long customerId, String experimentResourceName) {
    String budgetResourceName;
    try (CampaignBudgetServiceClient campaignBudgetServiceClient =
        googleAdsClient.getLatestVersion().createCampaignBudgetServiceClient()) {
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
      String query =
          String.format(
              "SELECT experiment_arm.campaigns FROM experiment_arm WHERE experiment_arm.experiment = '%s' AND experiment_arm.control = FALSE",
              experimentResourceName);

      GoogleAdsServiceClient.SearchPagedResponse searchResponse =
          googleAdsServiceClient.search(Long.toString(customerId), query);

      for (GoogleAdsRow row : searchResponse.iterateAll()) {
        if (row.getExperimentArm().getCampaignsCount() > 0) {
          treatmentCampaignResourceName = row.getExperimentArm().getCampaigns(0);
          break;
        }
      }
    }

    if (treatmentCampaignResourceName == null) {
      System.out.println("Could not find the treatment campaign associated with this experiment.");
      return;
    }

    try (ExperimentServiceClient experimentServiceClient =
        googleAdsClient.getLatestVersion().createExperimentServiceClient()) {
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

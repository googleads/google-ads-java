// Copyright 2022 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.examples.optimization;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v10.enums.RecommendationTypeEnum.RecommendationType;
import com.google.ads.googleads.v10.errors.GoogleAdsError;
import com.google.ads.googleads.v10.errors.GoogleAdsException;
import com.google.ads.googleads.v10.resources.Campaign;
import com.google.ads.googleads.v10.resources.Customer;
import com.google.ads.googleads.v10.resources.CustomerClient;
import com.google.ads.googleads.v10.resources.Recommendation;
import com.google.ads.googleads.v10.resources.Recommendation.RecommendationImpact;
import com.google.ads.googleads.v10.resources.Recommendation.RecommendationMetrics;
import com.google.ads.googleads.v10.resources.RecommendationName;
import com.google.ads.googleads.v10.services.GoogleAdsRow;
import com.google.ads.googleads.v10.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest;
import com.google.ads.googleads.v10.services.SearchGoogleAdsStreamResponse;
import com.google.api.gax.rpc.ServerStream;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.FieldMask;
import de.siegmar.fastcsv.writer.CsvWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Acquires suggested recommendations using the Google Ads Query Language (GAQL) and saves them to a
 * CSV file.
 *
 * <p>This is intended to be used with ApplyRecommendations.java which reads the CSV file and
 * applies any optimizations it found.
 */
public class AcquireOptimizations {

  static final String RECOMMENDATION_DIR_PREFIX = "recommendation_";
  static final String OPTI_SCORE_CSV = "optiScore.csv";
  static final String RECOMMENDATIONS_CSV = "recommendations.csv";

  private static class AcquireOptimizationsParams extends CodeSampleParams {

    @Parameter(
        names = ArgumentNames.CUSTOMER_IDS,
        description =
            "Optionally specify a comma-separated list of customer IDs to retrieve recommendations"
                + " from.")
    private List<Long> customerIds;

    @Parameter(
        names = ArgumentNames.LOGIN_CUSTOMER_ID,
        description =
            "Optionally specify the manager account ID which provides access to the customer IDs.")
    private Long loginCustomerId;

    @Parameter(
        names = ArgumentNames.RECOMMENDATION_TYPES,
        description = "Optionally specify the types of recommendations to retrieve.")
    private List<RecommendationType> recommendationTypes =
        ImmutableList.of(
            RecommendationType.CAMPAIGN_BUDGET,
            RecommendationType.KEYWORD,
            RecommendationType.TEXT_AD,
            RecommendationType.TARGET_CPA_OPT_IN);

    @Parameter(
        names = "--reportDirectory",
        description = "Optionally specify the path of directory to persist the generated reports.")
    private String reportDirectory =
        Paths.get(System.getProperty("user.home"), "opti-reports").toString();
  }

  /**
   * Represents a recommendation and its related campaign, ad group, campaign budget, etc. This is
   * used to hold a recommendation together with the related resources.
   */
  private static class AggregatedRecommendation {

    private final Recommendation recommendation;
    private final Campaign campaign;

    private AggregatedRecommendation(Recommendation recommendation, Campaign campaign) {
      this.recommendation = recommendation;
      this.campaign = campaign;
    }
  }

  public static void main(String[] args) {
    AcquireOptimizationsParams params = new AcquireOptimizationsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerIds = ImmutableList.of(Long.valueOf("INSERT_CUSTOMER_ID_HERE"));
      params.loginCustomerId = Long.valueOf("INSERT_LOGIN_CUSTOMER_ID_HERE");
      params.recommendationTypes =
          ImmutableList.of(RecommendationType.valueOf("INSERT_RECOMMENDATION_TYPE_HERE"));
      params.reportDirectory = "INSERT_REPORT_DIRECTORY_HERE";
    }

    GoogleAdsClient googleAdsClient = null;
    try {
      GoogleAdsClient.Builder builder = GoogleAdsClient.newBuilder().fromPropertiesFile();
      if (params.loginCustomerId != null) {
        builder.setLoginCustomerId(params.loginCustomerId);
      }
      googleAdsClient = builder.build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
          "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      System.exit(1);
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      System.exit(1);
    }

    try {
      new AcquireOptimizations()
          .runExample(
              googleAdsClient,
              params.customerIds,
              params.loginCustomerId,
              params.recommendationTypes,
              params.reportDirectory);
    } catch (GoogleAdsException gae) {
      // GoogleAdsException is the base class for most exceptions thrown by an API request.
      // Instances of this exception have a message and a GoogleAdsFailure that contains a
      // collection of GoogleAdsErrors that indicate the underlying causes of the
      // GoogleAdsException.
      System.err.printf(
          "Request ID %s failed due to GoogleAdsException. Underlying errors:%n",
          gae.getRequestId());
      int i = 0;
      for (GoogleAdsError googleAdsError : gae.getGoogleAdsFailure().getErrorsList()) {
        System.err.printf("  Error %d: %s%n", i++, googleAdsError);
      }
      System.exit(1);
    } catch (IOException ioe) {
      System.err.printf("Failed to generate reports. Exception: %s%n", ioe);
      System.exit(1);
    }
  }

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerIds the customer IDs to retrieve recommendations from.
   * @param loginCustomerId the manager account ID which provides access to the customer IDs.
   * @param recommendationTypes the types of recommendations to retrieve.
   * @param reportDirectory the path of directory to persist the generated reports.
   * @throws IOException if a failure occurs when trying to generate reports.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      List<Long> customerIds,
      Long loginCustomerId,
      List<RecommendationType> recommendationTypes,
      String reportDirectory)
      throws IOException {
    Path reportDir = Paths.get(reportDirectory);
    if (!Files.exists(reportDir)) {
      Files.createDirectories(reportDir);
    }

    // Retrieves recommendations and generates reports.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      if (customerIds == null) {
        customerIds = getSubAccountIDs(googleAdsServiceClient, loginCustomerId);
      }

      for (Long customerId : customerIds) {
        Customer customer = getCustomerInformation(googleAdsServiceClient, customerId);
        List<AggregatedRecommendation> aggregatedRecommendations =
            getRecommendations(googleAdsServiceClient, customerId, recommendationTypes);
        generateReports(customer, aggregatedRecommendations, reportDirectory);
      }
    }
    System.out.printf(
        "Succeeded to generate recommendation reports for %d customers to %s.%n",
        customerIds.size(), reportDirectory);
  }

  /**
   * Retrieves the customer IDs of all direct and indirect sub-accounts under the manager account
   * specified with loginCustomerId.
   *
   * @param googleAdsServiceClient the Google Ads Service client.
   * @param loginCustomerId the ID of manager account.
   * @return a list of sub-account IDs.
   */
  private List<Long> getSubAccountIDs(
      GoogleAdsServiceClient googleAdsServiceClient, Long loginCustomerId) {
    List<Long> customerIds = new ArrayList<>();

    // Creates a query that retrieves all nested accounts of the manager account specified with
    // loginCustomerId. level = 0 means self link, e.g. the manager itself, so it's excluded.
    // level = 1 means directly linked customers, level > 1 means indirectly linked customers. So
    // level >= 1 is included in the query to retrieve all nested accounts.
    String query =
        "SELECT customer_client.id FROM customer_client WHERE customer_client.level >= 1";
    SearchGoogleAdsStreamRequest request =
        SearchGoogleAdsStreamRequest.newBuilder()
            .setCustomerId(String.valueOf(loginCustomerId))
            .setQuery(query)
            .build();

    ServerStream<SearchGoogleAdsStreamResponse> stream =
        googleAdsServiceClient.searchStreamCallable().call(request);
    for (SearchGoogleAdsStreamResponse response : stream) {
      for (GoogleAdsRow googleAdsRow : response.getResultsList()) {
        CustomerClient customerClient = googleAdsRow.getCustomerClient();
        customerIds.add(customerClient.getId());
        System.out.printf("Found customer account with ID %d.%n", customerClient.getId());
      }
    }

    return customerIds;
  }

  /**
   * Gets the account-level information of a customer.
   *
   * @param googleAdsServiceClient the Google Ads Service client.
   * @param customerId the client customer ID.
   * @return a Customer instance.
   */
  private Customer getCustomerInformation(
      GoogleAdsServiceClient googleAdsServiceClient, Long customerId) {
    String query =
        "SELECT customer.id, customer.descriptive_name, customer.optimization_score FROM customer";
    SearchGoogleAdsStreamRequest request =
        SearchGoogleAdsStreamRequest.newBuilder()
            .setCustomerId(String.valueOf(customerId))
            .setQuery(query)
            .build();

    ServerStream<SearchGoogleAdsStreamResponse> stream =
        googleAdsServiceClient.searchStreamCallable().call(request);
    for (SearchGoogleAdsStreamResponse response : stream) {
      for (GoogleAdsRow googleAdsRow : response.getResultsList()) {
        return googleAdsRow.getCustomer();
      }
    }

    throw new RuntimeException("Customer not found with ID " + customerId);
  }

  /**
   * Retrieves recommendations and the targeted campaigns of a customer with specified types.
   *
   * @param googleAdsServiceClient the Google Ads Service client.
   * @param customerId the client customer ID.
   * @param recommendationTypes the list of recommendation types.
   * @return a list of AggregatedRecommendation instances containing Recommendation and Campaign.
   */
  private List<AggregatedRecommendation> getRecommendations(
      GoogleAdsServiceClient googleAdsServiceClient,
      Long customerId,
      List<RecommendationType> recommendationTypes) {
    List<AggregatedRecommendation> aggregatedRecommendations = new ArrayList<>();
    for (RecommendationType recommendationType : recommendationTypes) {
      String query =
          String.format(
              "SELECT recommendation.resource_name, recommendation.type, recommendation.impact,"
                  + " recommendation.%s_recommendation, campaign.id, campaign.optimization_score"
                  + " FROM recommendation WHERE recommendation.type = '%s'",
              recommendationType.toString().toLowerCase(), recommendationType);
      SearchGoogleAdsStreamRequest request =
          SearchGoogleAdsStreamRequest.newBuilder()
              .setCustomerId(String.valueOf(customerId))
              .setQuery(query)
              .build();

      ServerStream<SearchGoogleAdsStreamResponse> stream =
          googleAdsServiceClient.searchStreamCallable().call(request);
      for (SearchGoogleAdsStreamResponse response : stream) {
        for (GoogleAdsRow googleAdsRow : response.getResultsList()) {
          aggregatedRecommendations.add(
              new AggregatedRecommendation(
                  googleAdsRow.getRecommendation(), googleAdsRow.getCampaign()));
        }
      }
    }

    return aggregatedRecommendations;
  }

  /**
   * Generates recommendation reports to the report directory.
   *
   * @param customer the customer to be reported.
   * @param aggregatedRecommendations the list of AggregatedRecommendation instances.
   * @param reportDirectory the path of the report directory.
   * @throws IOException if a failure occurs when trying to create and write CSV files.
   */
  private void generateReports(
      Customer customer,
      List<AggregatedRecommendation> aggregatedRecommendations,
      String reportDirectory)
      throws IOException {
    Path recoDir = Paths.get(reportDirectory, RECOMMENDATION_DIR_PREFIX + customer.getId());
    if (!Files.exists(recoDir)) {
      Files.createDirectories(recoDir);
    }

    // Generates optiScore.csv to persist the customer's account-level information.
    Path path = recoDir.resolve(OPTI_SCORE_CSV);
    try (CsvWriter csv = CsvWriter.builder().build(path, StandardCharsets.UTF_8)) {
      csv.writeRow("CID", "AccountName", "OptiScore")
          .writeRow(
              String.valueOf(customer.getId()),
              customer.getDescriptiveName(),
              String.valueOf(customer.getOptimizationScore()));
    }

    // Generates recommendations.csv to persist the retrieved recommendations line by line.
    path = recoDir.resolve(RECOMMENDATIONS_CSV);
    try (CsvWriter csv = CsvWriter.builder().build(path, StandardCharsets.UTF_8)) {
      csv.writeRow(
          "ID",
          "Type",
          "Impact",
          "Details",
          "CampaignId",
          "CampaignOptiScore",
          "BaseImpressions",
          "PotentialImpressions",
          "BaseClicks",
          "PotentialClicks",
          "BaseCost",
          "PotentialCost",
          "BaseConversions",
          "PotentialConversions",
          "BaseVideoViews",
          "PotentialVideoViews");
      for (AggregatedRecommendation aggregatedRecommendation : aggregatedRecommendations) {
        Recommendation recommendation = aggregatedRecommendation.recommendation;
        Campaign campaign = aggregatedRecommendation.campaign;
        RecommendationImpact impact = recommendation.getImpact();
        RecommendationMetrics baseMetrics = impact.getBaseMetrics();
        RecommendationMetrics potentialMetrics = impact.getPotentialMetrics();
        csv.writeRow(
            RecommendationName.parse(recommendation.getResourceName()).getRecommendationId(),
            recommendation.getType().toString(),
            getHumanReadableDescription(impact),
            getHumanReadableDescription(recommendation),
            String.valueOf(campaign.getId()),
            String.valueOf(campaign.getOptimizationScore()),
            String.valueOf(baseMetrics.getImpressions()),
            String.valueOf(potentialMetrics.getImpressions()),
            String.valueOf(baseMetrics.getClicks()),
            String.valueOf(potentialMetrics.getClicks()),
            String.valueOf(baseMetrics.getCostMicros()),
            String.valueOf(potentialMetrics.getCostMicros()),
            String.valueOf(baseMetrics.getConversions()),
            String.valueOf(potentialMetrics.getConversions()),
            String.valueOf(baseMetrics.getVideoViews()),
            String.valueOf(potentialMetrics.getVideoViews()));
      }
    }
  }

  /**
   * Gets the human-readable description of the impact .
   *
   * @param impact the impact of the change as described in the retrieve recommendation.
   * @return a human-readable description of the impact.
   */
  private String getHumanReadableDescription(RecommendationImpact impact) {
    RecommendationMetrics baseMetrics = impact.getBaseMetrics();
    RecommendationMetrics potentialMetrics = impact.getPotentialMetrics();
    return String.format(
        "Increase Impressions by %s, Clicks by %s, Cost(in micros) by %s, Conversions by %s, Video"
            + " views by %s.",
        potentialMetrics.getImpressions() - baseMetrics.getImpressions(),
        potentialMetrics.getClicks() - baseMetrics.getClicks(),
        potentialMetrics.getCostMicros() - baseMetrics.getCostMicros(),
        potentialMetrics.getConversions() - baseMetrics.getConversions(),
        potentialMetrics.getVideoViews() - baseMetrics.getVideoViews());
  }

  /**
   * Gets the human-readable description of a recommendation.
   *
   * @param recommendation the retrieved recommendation.
   * @return a human-readable description of the recommendation.
   */
  private String getHumanReadableDescription(Recommendation recommendation) {
    FieldMask allSetFieldsOf = FieldMasks.allSetFieldsOf(recommendation);
    return allSetFieldsOf.getPathsList().stream()
        .filter(
            path ->
                !(path.equals("resource_name") || path.equals("type") || path.startsWith("impact")))
        .map(
            path ->
                path.substring(path.indexOf('.') + 1)
                    + ": "
                    + FieldMasks.getFieldValue(path, recommendation))
        .collect(Collectors.joining("\n"));
  }
}

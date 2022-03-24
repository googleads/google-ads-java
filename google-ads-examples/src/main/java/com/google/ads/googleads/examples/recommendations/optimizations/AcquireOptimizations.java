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

package com.google.ads.googleads.examples.recommendations.optimizations;

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
import com.google.ads.googleads.v10.services.GoogleAdsServiceClient.SearchPagedResponse;
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
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Acquires the suggested optimizations (optimization scores and recommendations) using the Google
 * Ads Query Language (GAQL), and saves them into the recommendation reports of CSV format.
 *
 * <p>This is intended to be used with ApplyRecommendations.java which reads the recommendation
 * reports and applies the loaded recommendations.
 */
public class AcquireOptimizations {

  static final String DEFAULT_REPORT_DIRECTORY =
      Paths.get(System.getProperty("user.home"), "opti-reports").toString();

  static final String RECOMMENDATION_DIR_PREFIX = "recommendation_";
  static final String RECO_OPTIMIZATION_SCORE_CSV = "optiScore.csv";
  static final String[] RECO_OPTIMIZATION_SCORE_CSV_COLUMNS = {"CID", "AccountName", "OptiScore"};
  static final String RECO_RECOMMENDATIONS_CSV = "recommendations.csv";
  static final String[] RECO_RECOMMENDATIONS_CSV_COLUMNS = {
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
    "PotentialVideoViews"
  };

  private static class AcquireOptimizationsParams extends CodeSampleParams {

    @Parameter(
        names = ArgumentNames.CUSTOMER_IDS,
        description =
            "Specify a comma-separated list of customer IDs to retrieve recommendations from. You"
                + " must provide at least one of "
                + ArgumentNames.CUSTOMER_IDS
                + " or "
                + ArgumentNames.LOGIN_CUSTOMER_ID
                + ".")
    private List<Long> customerIds;

    @Parameter(
        names = ArgumentNames.LOGIN_CUSTOMER_ID,
        description =
            "Optionally specify the manager account ID which provides access to the customer IDs.")
    private Long loginCustomerId;

    @Parameter(
        names = ArgumentNames.RECOMMENDATION_TYPES,
        description = "The types of recommendations to retrieve.")
    private List<RecommendationType> recommendationTypes =
        ImmutableList.of(
            RecommendationType.CAMPAIGN_BUDGET,
            RecommendationType.KEYWORD,
            RecommendationType.TEXT_AD,
            RecommendationType.TARGET_CPA_OPT_IN);

    @Parameter(
        names = "--reportDirectory",
        description = "The path of the directory to persist the generated reports.")
    private String reportDirectory = DEFAULT_REPORT_DIRECTORY;
  }

  /**
   * Represents a recommendation, the related campaign and the recommendation's description string.
   * This is used to hold a recommendation together with its related information.
   */
  static class AggregatedRecommendation {

    final Recommendation recommendation;
    final Campaign campaign;
    final String description;

    private AggregatedRecommendation(Recommendation recommendation, Campaign campaign) {
      this.recommendation = recommendation;
      this.campaign = campaign;
      this.description = null;
    }

    AggregatedRecommendation(Recommendation recommendation, Campaign campaign, String description) {
      this.recommendation = recommendation;
      this.campaign = campaign;
      this.description = description;
    }
  }

  public static void main(String[] args) {
    AcquireOptimizationsParams params = new AcquireOptimizationsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerIds = ImmutableList.of(Long.valueOf("INSERT_CUSTOMER_ID_HERE"));

      // Optional: Specify the login customer ID if your access to the CIDs is via a manager
      // account.
      // params.loginCustomerId = Long.valueOf("INSERT_LOGIN_CUSTOMER_ID_HERE");

      // Optional: To use different recommendation types from the default specified above, uncomment
      // the line below and insert the desired values.
      // params.recommendationTypes =
      //     ImmutableList.of(RecommendationType.valueOf("INSERT_RECOMMENDATION_TYPE_HERE"));

      // Optional: To use a different report directory from the default specified above, uncomment
      // the line below and insert the desired value.
      // params.reportDirectory = "INSERT_REPORT_DIRECTORY_HERE";
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

    if (params.customerIds == null && googleAdsClient.getLoginCustomerId() == null) {
      System.err.println("loginCustomerId must be set if customerIds are not provided.");
      System.exit(1);
    }

    try {
      new AcquireOptimizations()
          .runExample(
              googleAdsClient,
              params.customerIds,
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
   * @param recommendationTypes the desired recommendation types.
   * @param reportDirectory the path of the directory to persist the generated reports.
   * @throws IOException if a failure occurs when trying to generate recommendation reports.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      List<Long> customerIds,
      List<RecommendationType> recommendationTypes,
      String reportDirectory)
      throws IOException {
    Path reportDir = Paths.get(reportDirectory);
    if (!Files.exists(reportDir)) {
      Files.createDirectories(reportDir);
    }

    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      if (customerIds == null) {
        // If 'customerIds' is not provided, sets it to all the sub-accounts under the managed
        // account specified by 'loginCustomerId'.
        customerIds =
            getSubAccountIDs(googleAdsServiceClient, googleAdsClient.getLoginCustomerId());
      }

      // Retrieves optimization scores and recommendations, then generates the recommendation
      // reports.
      for (long customerId : customerIds) {
        Customer customer = getCustomerInfo(googleAdsServiceClient, customerId);
        List<AggregatedRecommendation> aggregatedRecommendations =
            getRecommendations(googleAdsServiceClient, customerId, recommendationTypes);

        generateRecommendationReports(customer, aggregatedRecommendations, reportDirectory);
      }
    }

    System.out.printf(
        "Generated recommendation reports for %d customers in total to '%s'.%n",
        customerIds.size(), reportDirectory);
  }

  /**
   * Retrieves the customer IDs of all direct and indirect sub-accounts under the manager account.
   *
   * @param googleAdsServiceClient the Google Ads Service client.
   * @param loginCustomerId the ID of the manager account.
   * @return a list of sub-account IDs.
   */
  private List<Long> getSubAccountIDs(
      GoogleAdsServiceClient googleAdsServiceClient, long loginCustomerId) {
    List<Long> customerIds = new ArrayList<>();

    // Creates a query that retrieves all sub-accounts under the manager account specified by
    // 'loginCustomerId'.
    // 1. level = 0 means self link, i.e. the manager account itself.
    // 2. level = 1 means directly linked customers.
    // 3. level > 1 means indirectly linked customers.
    //
    // So level >= 1 is used in the query to retrieve all sub-accounts.
    String query =
        "SELECT customer_client.id FROM customer_client WHERE customer_client.level >= 1";

    SearchPagedResponse response =
        googleAdsServiceClient.search(String.valueOf(loginCustomerId), query);
    for (GoogleAdsRow googleAdsRow : response.iterateAll()) {
      CustomerClient customerClient = googleAdsRow.getCustomerClient();
      customerIds.add(customerClient.getId());
      System.out.printf("Found customer account with ID %d.%n", customerClient.getId());
    }

    return customerIds;
  }

  /**
   * Gets the account-level information of a {@link Customer}.
   *
   * @param googleAdsServiceClient the Google Ads Service client.
   * @param customerId the client customer ID.
   * @return a {@link Customer} instance.
   */
  static Customer getCustomerInfo(GoogleAdsServiceClient googleAdsServiceClient, long customerId) {
    String query =
        "SELECT customer.id, customer.descriptive_name, customer.optimization_score FROM customer";

    SearchPagedResponse response = googleAdsServiceClient.search(String.valueOf(customerId), query);
    Iterator<GoogleAdsRow> iterator = response.iterateAll().iterator();
    if (iterator.hasNext()) {
      return iterator.next().getCustomer();
    }

    throw new IllegalArgumentException("Customer not found with ID " + customerId);
  }

  /**
   * Retrieves recommendations with specified types and its targeted campaigns from a customer.
   *
   * @param googleAdsServiceClient the Google Ads Service client.
   * @param customerId the client customer ID.
   * @param recommendationTypes the list of recommendation types.
   * @return a list of {@link AggregatedRecommendation} instances.
   */
  private List<AggregatedRecommendation> getRecommendations(
      GoogleAdsServiceClient googleAdsServiceClient,
      long customerId,
      List<RecommendationType> recommendationTypes) {
    List<AggregatedRecommendation> aggregatedRecommendations = new ArrayList<>();
    String query =
        String.format(
            "SELECT recommendation.resource_name, recommendation.type, recommendation.impact, "
                + "%s, campaign.id, campaign.optimization_score "
                + "FROM recommendation WHERE recommendation.type in (%s)",
            recommendationTypes.stream()
                .map(
                    type ->
                        String.format(
                            "recommendation.%s_recommendation", type.toString().toLowerCase()))
                .collect(Collectors.joining(", ")),
            recommendationTypes.stream()
                .map(type -> String.format("'%s'", type))
                .collect(Collectors.joining(", ")));

    SearchPagedResponse response = googleAdsServiceClient.search(String.valueOf(customerId), query);
    for (GoogleAdsRow googleAdsRow : response.iterateAll()) {
      aggregatedRecommendations.add(
          new AggregatedRecommendation(
              googleAdsRow.getRecommendation(), googleAdsRow.getCampaign()));
    }

    return aggregatedRecommendations;
  }

  /**
   * Generates the recommendation reports to the report directory.
   *
   * @param customer the {@link Customer} to generate for.
   * @param aggregatedRecommendations the list of {@link AggregatedRecommendation} instances.
   * @param reportDirectory the path of the directory to persist the generated reports.
   * @throws IOException if a failure occurs when trying to create or write CSV files.
   */
  private void generateRecommendationReports(
      Customer customer,
      List<AggregatedRecommendation> aggregatedRecommendations,
      String reportDirectory)
      throws IOException {
    Path recoDir = Paths.get(reportDirectory, RECOMMENDATION_DIR_PREFIX + customer.getId());
    if (!Files.exists(recoDir)) {
      Files.createDirectories(recoDir);
    }

    // Generates 'optiScore.csv' to persist the customer's account-level information.
    Path csvPath = recoDir.resolve(RECO_OPTIMIZATION_SCORE_CSV);
    try (CsvWriter csv = CsvWriter.builder().build(csvPath, StandardCharsets.UTF_8)) {
      csv.writeRow(RECO_OPTIMIZATION_SCORE_CSV_COLUMNS)
          .writeRow(
              String.valueOf(customer.getId()),
              customer.getDescriptiveName(),
              String.valueOf(customer.getOptimizationScore()));
    }

    // Generates 'recommendations.csv' to persist the acquired recommendations line by line.
    csvPath = recoDir.resolve(RECO_RECOMMENDATIONS_CSV);
    try (CsvWriter csv = CsvWriter.builder().build(csvPath, StandardCharsets.UTF_8)) {
      csv.writeRow(RECO_RECOMMENDATIONS_CSV_COLUMNS);
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
   * Gets the human-readable description of a {@link RecommendationImpact}.
   *
   * @param impact the impact of the change as described in the retrieved recommendation.
   * @return a human-readable description of the impact.
   */
  private String getHumanReadableDescription(RecommendationImpact impact) {
    RecommendationMetrics baseMetrics = impact.getBaseMetrics();
    RecommendationMetrics potentialMetrics = impact.getPotentialMetrics();
    return String.format(
        "Increases Impressions by %.2f, Clicks by %.2f, Cost(in micros) by %d, Conversions by %.2f,"
            + " Video views by %.2f.",
        potentialMetrics.getImpressions() - baseMetrics.getImpressions(),
        potentialMetrics.getClicks() - baseMetrics.getClicks(),
        potentialMetrics.getCostMicros() - baseMetrics.getCostMicros(),
        potentialMetrics.getConversions() - baseMetrics.getConversions(),
        potentialMetrics.getVideoViews() - baseMetrics.getVideoViews());
  }

  /**
   * Gets the human-readable description of a {@link Recommendation}.
   *
   * @param recommendation the retrieved recommendation.
   * @return a human-readable description of the recommendation.
   */
  private String getHumanReadableDescription(Recommendation recommendation) {
    FieldMask allSetFields = FieldMasks.allSetFieldsOf(recommendation);
    return allSetFields.getPathsList().stream()
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

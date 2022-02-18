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
 * <p> This is intended to be used with ApplyRecommendations.java which reads the CSV file and
 * applies any optimizations it found.
 */
public class AcquireOptimizations {

  private static class AcquireOptimizationsParams extends CodeSampleParams {

    @Parameter(
        names = ArgumentNames.CUSTOMER_IDS,
        description =
            "Optionally specify a comma-separated list of CIDs to retrieve recommendations from.")
    private List<Long> customerIds;
    @Parameter(
        names = ArgumentNames.LOGIN_CUSTOMER_ID,
        description =
            "Optionally specify the manager account ID which provides access to the customer IDs.")
    private Long loginCustomerId;
    @Parameter(
        names = ArgumentNames.RECOMMENDATION_TYPES,
        description = "Optionally specify the type of recommendations to retrieve.")
    private List<RecommendationType> recommendationTypes =
        ImmutableList.of(
            RecommendationType.CAMPAIGN_BUDGET,
            RecommendationType.KEYWORD,
            RecommendationType.TEXT_AD,
            RecommendationType.TARGET_CPA_OPT_IN);
    @Parameter(
        names = "--reportDirectory",
        description = "Optionally specify the path of directory to store the generated reports.")
    private String reportDirectory = ".";
  }

  /**
   * Represents Recommendation and its related Campaign, AdGroup, CampaignBudget. This is used to
   * hold a recommendation together with the related resources.
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
      // Optional: You may pass the customerIds on the command line or specify a customerIds here.
      // If neither are set, a list of all nested customers IDs of loginCustomerId will be passed to
      // the runExample method, and the example will retrieve the recommendations of all nested
      // customer IDs.
      params.customerIds = ImmutableList.of(Long.valueOf("INSERT_CUSTOMER_ID_HERE"));
      // Optional: You may pass the loginCustomerId on the command line or specify a loginCustomerId
      // here if and only if your access to the CIDs is via a manage account.
      params.loginCustomerId = Long.valueOf("INSERT_LOGIN_CUSTOMER_ID_HERE");
      // Optional: You may pass the recommendationTypes on the command line or specify a
      // recommendationTypes here. If neither are set, [CAMPAIGN_BUDGET, KEYWORD] will be passed to
      // the runExample method, and the example will retrieve the recommendations of all types.
      params.recommendationTypes =
          ImmutableList.of(RecommendationType.valueOf("INSERT_RECOMMENDATION_TYPE_HERE"));
      // Optional: You may pass the reportDirectory on the command line or specify a reportDirectory
      // here. If neither are set, "." will be passed to the runExample method, and the example
      // will generate reports to current directory.
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
   * @param customerIds the list of CIDs to retrieve recommendations from.
   * @param loginCustomerId the manager account ID which provides access to the customer IDs.
   * @param recommendationTypes the type of recommendations to retrieve.
   * @param reportDirectory the path of directory to store the generated reports.
   * @throws IOException if a failure occurs when trying to generate reports.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      List<Long> customerIds,
      Long loginCustomerId,
      List<RecommendationType> recommendationTypes,
      String reportDirectory)
      throws IOException {
    // Parses the command line parameters to determine what requests to make.
    Path dir = Paths.get(reportDirectory);
    if (!Files.exists(dir)) {
      Files.createDirectories(dir);
    }
    if (customerIds == null) {
      customerIds = getAllSubAccounts(googleAdsClient, loginCustomerId);
    }
    // Retrieves recommendations and generates reports.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      for (Long customerId : customerIds) {
        Customer customer = getCustomerInformation(googleAdsClient, customerId);
        List<AggregatedRecommendation> aggregatedRecommendations =
            getRecommendations(googleAdsServiceClient, customerId, recommendationTypes);
        generateReports(customer, aggregatedRecommendations, reportDirectory);
      }
    }
    System.out.printf(
        "Succeeded to generate recommendation reports for %d customers in %s. %n",
        customerIds.size(), reportDirectory);
  }

  /**
   * Retrieves a list of CIDs of all direct and indirect sub accounts under the MCC specified with
   * loginCustomerId.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param loginCustomerId the ID of manager account.
   * @return a list of customer IDs.
   */
  private List<Long> getAllSubAccounts(GoogleAdsClient googleAdsClient, Long loginCustomerId) {
    List<Long> customerIds = new ArrayList<>();
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
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
          System.out.println("Found customer account with CID " + customerClient.getId());
        }
      }
    }
    return customerIds;
  }

  /**
   * Gets account-level information of a customer.
   *
   * @param googleAdsClient the google ads client.
   * @param customerId the ID of the customer to get.
   * @return the acquired customer.
   */
  private Customer getCustomerInformation(GoogleAdsClient googleAdsClient, Long customerId) {
    String query =
        "SELECT customer.id, customer.descriptive_name, customer.optimization_score FROM customer";
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      SearchGoogleAdsStreamRequest request =
          SearchGoogleAdsStreamRequest.newBuilder()
              .setCustomerId(String.valueOf(customerId))
              .setQuery(query)
              .build();
      ServerStream<SearchGoogleAdsStreamResponse> stream =
          googleAdsServiceClient.searchStreamCallable().call(request);
      for (SearchGoogleAdsStreamResponse response : stream) {
        for (GoogleAdsRow row : response.getResultsList()) {
          return row.getCustomer();
        }
      }
    }
    throw new RuntimeException("Failed to lookup customer " + customerId);
  }

  /**
   * Gets recommendations and their targeted campaigns of a customer with specified types.
   *
   * @param googleAdsServiceClient the googleAds service client.
   * @param customerId the client customer ID.
   * @param recommendationTypes the list of recommendation types.
   * @return a list of aggregated recommendations containing Recommendation and Campaign.
   */
  private List<AggregatedRecommendation> getRecommendations(
      GoogleAdsServiceClient googleAdsServiceClient,
      Long customerId,
      List<RecommendationType> recommendationTypes) {
    List<AggregatedRecommendation> aggregatedRecommendations = new ArrayList<>();
    for (RecommendationType recommendationType : recommendationTypes) {
      String recommendationQuery =
          String.format(
              "SELECT recommendation.resource_name, recommendation.type, recommendation.impact,"
                  + " recommendation.%s_recommendation, campaign.id, campaign.optimization_score"
                  + " FROM recommendation WHERE recommendation.type = '%s'",
              recommendationType.toString().toLowerCase(), recommendationType);
      SearchGoogleAdsStreamRequest request =
          SearchGoogleAdsStreamRequest.newBuilder()
              .setCustomerId(String.valueOf(customerId))
              .setQuery(recommendationQuery)
              .build();
      ServerStream<SearchGoogleAdsStreamResponse> stream =
          googleAdsServiceClient.searchStreamCallable().call(request);
      for (SearchGoogleAdsStreamResponse response : stream) {
        for (GoogleAdsRow recommendationRow : response.getResultsList()) {
          aggregatedRecommendations.add(
              new AggregatedRecommendation(
                  recommendationRow.getRecommendation(), recommendationRow.getCampaign()));
        }
      }
    }
    return aggregatedRecommendations;
  }

  /**
   * Generates recommendation reports to report directory.
   *
   * @param customer the customer to be reported.
   * @param aggregatedRecommendations the list of aggregated recommendations.
   * @param reportDirectory the path of report directory.
   * @throws IOException if a failure occurs when trying to create and write CSV files.
   */
  private void generateReports(
      Customer customer,
      List<AggregatedRecommendation> aggregatedRecommendations,
      String reportDirectory)
      throws IOException {
    Path dir = Paths.get(reportDirectory, "recommendation_" + customer.getId());
    if (!Files.exists(dir)) {
      Files.createDirectories(dir);
    }
    // Generates optiScore.csv to store the customer's account-level information.
    Path path = Paths.get(dir.toString(), "optiScore.csv");
    try (CsvWriter csv = CsvWriter.builder().build(path, StandardCharsets.UTF_8)) {
      csv.writeRow("CID", "AccountName", "OptiScore")
          .writeRow(
              String.valueOf(customer.getId()),
              customer.getDescriptiveName(),
              String.valueOf(customer.getOptimizationScore()));
    }
    // Generates recommendations.csv to store retrieved recommendations line by line.
    path = Paths.get(dir.toString(), "recommendations.csv");
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
        Recommendation.RecommendationImpact impact = recommendation.getImpact();
        Recommendation.RecommendationMetrics base = impact.getBaseMetrics();
        Recommendation.RecommendationMetrics potential = impact.getPotentialMetrics();
        csv.writeRow(
            RecommendationName.parse(recommendation.getResourceName()).getRecommendationId(),
            recommendation.getType().toString(),
            getHumanReadableDescription(impact),
            getHumanReadableDescription(recommendation),
            String.valueOf(campaign.getId()),
            String.valueOf(campaign.getOptimizationScore()),
            String.valueOf(base.getImpressions()),
            String.valueOf(potential.getImpressions()),
            String.valueOf(base.getClicks()),
            String.valueOf(potential.getClicks()),
            String.valueOf(base.getCostMicros()),
            String.valueOf(potential.getCostMicros()),
            String.valueOf(base.getConversions()),
            String.valueOf(potential.getConversions()),
            String.valueOf(base.getVideoViews()),
            String.valueOf(potential.getVideoViews()));
      }
    }
  }

  /**
   * Gets the description of impact which a human can understand.
   *
   * @param impact the impact of making the change as described in the retrieve recommendation.
   * @return a human readable description of the impact.
   */
  private String getHumanReadableDescription(Recommendation.RecommendationImpact impact) {
    Recommendation.RecommendationMetrics base = impact.getBaseMetrics();
    Recommendation.RecommendationMetrics potential = impact.getPotentialMetrics();
    return String.format(
        "Increase Impressions by %s, Clicks by %s, Cost(in micros) by %s, Conversions by %s, Video"
            + " views by %s.",
        potential.getImpressions() - base.getImpressions(),
        potential.getClicks() - base.getClicks(),
        potential.getCostMicros() - base.getCostMicros(),
        potential.getConversions() - base.getConversions(),
        potential.getVideoViews() - base.getVideoViews());
  }

  /**
   * Gets the description of a recommendation which a human can understand.
   *
   * @param recommendation the retrieved recommendation.
   * @return a human readable description of the recommendation.
   */
  private String getHumanReadableDescription(Recommendation recommendation) {
    FieldMask allSetFieldsOf = FieldMasks.allSetFieldsOf(recommendation);
    return allSetFieldsOf.getPathsList().stream()
        .filter(
            path ->
                !(path.equals("resource_name") || path.equals("type") || path.startsWith("impact")))
        .map(path -> path.substring(path.indexOf('.') + 1) + ": " + FieldMasks
            .getFieldValue(path, recommendation))
        .collect(Collectors.joining("\n"));
  }
}

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

import static com.google.ads.googleads.examples.optimization.AcquireOptimizations.OPTI_SCORE_CSV;
import static com.google.ads.googleads.examples.optimization.AcquireOptimizations.RECOMMENDATIONS_CSV;
import static com.google.ads.googleads.examples.optimization.AcquireOptimizations.RECOMMENDATION_DIR_PREFIX;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v10.enums.RecommendationTypeEnum.RecommendationType;
import com.google.ads.googleads.v10.errors.GoogleAdsError;
import com.google.ads.googleads.v10.errors.GoogleAdsException;
import com.google.ads.googleads.v10.resources.Campaign;
import com.google.ads.googleads.v10.resources.CampaignName;
import com.google.ads.googleads.v10.resources.Customer;
import com.google.ads.googleads.v10.resources.CustomerName;
import com.google.ads.googleads.v10.resources.Recommendation;
import com.google.ads.googleads.v10.resources.RecommendationName;
import com.google.ads.googleads.v10.services.ApplyRecommendationOperation;
import com.google.ads.googleads.v10.services.ApplyRecommendationResponse;
import com.google.ads.googleads.v10.services.ApplyRecommendationResult;
import com.google.ads.googleads.v10.services.GoogleAdsRow;
import com.google.ads.googleads.v10.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v10.services.RecommendationServiceClient;
import com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest;
import com.google.ads.googleads.v10.services.SearchGoogleAdsStreamResponse;
import com.google.api.gax.rpc.ServerStream;
import com.google.common.collect.ImmutableList;
import de.siegmar.fastcsv.reader.NamedCsvReader;
import de.siegmar.fastcsv.reader.NamedCsvRow;
import de.siegmar.fastcsv.writer.CsvWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ApplyRecommendations {

  static final String OPTIMIZATION_DIR_PREFIX = "optimization_";

  private static class ApplyRecommendationsParams extends CodeSampleParams {

    @Parameter(
        names = ArgumentNames.CUSTOMER_IDS,
        description =
            "Optionally specify a comma-separated list of customer IDs to apply recommendations"
                + " to.")
    private List<Long> customerIds;

    @Parameter(
        names = ArgumentNames.LOGIN_CUSTOMER_ID,
        description =
            "Optionally specify the manager account ID which provides access to the customer IDs.")
    private Long loginCustomerId;

    @Parameter(
        names = "--reportDirectory",
        description =
            "Optionally specify the path of directory to read the recommendation reports and"
                + " persist the generated optimization reports.")
    private String reportDirectory =
        Paths.get(System.getProperty("user.home"), "opti-reports").toString();
  }

  /**
   * Represents a recommendation, campaign, ad group, campaign budget and the recommendation's
   * description string. This is used to hold a recommendation together with other related
   * information.
   */
  private static class AggregatedRecommendation {

    private final Recommendation recommendation;
    private final Campaign campaign;
    private final String description;

    private AggregatedRecommendation(
        Recommendation recommendation, Campaign campaign, String description) {
      this.recommendation = recommendation;
      this.campaign = campaign;
      this.description = description;
    }
  }

  public static void main(String[] args) {
    ApplyRecommendationsParams params = new ApplyRecommendationsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerIds = ImmutableList.of(Long.valueOf("INSERT_CUSTOMER_ID_HERE"));
      params.loginCustomerId = Long.valueOf("INSERT_LOGIN_CUSTOMER_ID_HERE");
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
      new ApplyRecommendations()
          .runExample(googleAdsClient, params.customerIds, params.reportDirectory);
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
   * @param customerIds the customer IDs to apply recommendations to.
   * @param reportDirectory the path of directory to read and generate reports.
   * @throws IOException if a failure occurs when trying to read or generate reports.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, List<Long> customerIds, String reportDirectory)
      throws IOException {
    Path reportDir = Paths.get(reportDirectory);
    if (!Files.isDirectory(reportDir)) {
      throw new RuntimeException("Not a directory: " + reportDirectory);
    }

    if (customerIds == null) {
      applyAllRecommendations(googleAdsClient, reportDirectory);
    } else {
      int numRecommendations = 0;
      for (Long customerId : customerIds) {
        numRecommendations +=
            applyRecommendationsToCustomer(googleAdsClient, reportDirectory, customerId);
      }
      System.out.printf(
          "Applied %s recommendations totally to %s customers.%n",
          numRecommendations, customerIds.size());
    }
  }

  /**
   * Applies all suggested recommendations found in reportDirectory, and generates optimization
   * reports.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param reportDirectory the path of directory to read and generate reports.
   * @throws IOException if failure occurs when trying to read or generate reports.
   */
  private void applyAllRecommendations(GoogleAdsClient googleAdsClient, String reportDirectory)
      throws IOException {
    int numCustomers = 0;
    int numSkips = 0;
    int numRecommendations = 0;
    for (File file : new File(reportDirectory).listFiles()) {
      if (file.isDirectory() && file.getName().startsWith(RECOMMENDATION_DIR_PREFIX)) {
        String folderName = file.getName();
        long customerId = Long.parseLong(folderName.substring(RECOMMENDATION_DIR_PREFIX.length()));
        numRecommendations +=
            applyRecommendationsToCustomer(googleAdsClient, reportDirectory, customerId);
        numCustomers++;
      } else {
        numSkips++;
        System.out.println(file + " is skipped.");
      }
    }

    System.out.printf(
        "Skipped %s files totally in %s.%nApplied %s recommendations totally for %s customers.%n",
        numSkips, reportDirectory, numRecommendations, numCustomers);
  }

  /**
   * Applies suggested recommendations for customerId found in reportDirectory and generates
   * optimization reports.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param reportDirectory the path of directory to read and generate reports.
   * @param customerId the customer ID to apply recommendations.
   * @return the number of successfully applied recommendations for the customer.
   * @throws IOException if a failure occurs when trying to read or generate reports.
   */
  private int applyRecommendationsToCustomer(
      GoogleAdsClient googleAdsClient, String reportDirectory, Long customerId) throws IOException {
    Customer originalCustomer =
        getOriginalCustomer(
            Paths.get(reportDirectory, RECOMMENDATION_DIR_PREFIX + customerId, OPTI_SCORE_CSV));
    Map<String, AggregatedRecommendation> aggregatedRecommendationMap =
        getRecommendationsFromReport(
            Paths.get(reportDirectory, RECOMMENDATION_DIR_PREFIX + customerId, RECOMMENDATIONS_CSV),
            customerId);
    List<ApplyRecommendationResult> results =
        applyRecommendations(
            googleAdsClient, customerId, new ArrayList<>(aggregatedRecommendationMap.values()));
    generateReports(
        googleAdsClient, originalCustomer, reportDirectory, results, aggregatedRecommendationMap);
    return results.size();
  }

  /**
   * Constructs an original customer with customerId, name and optiScore from optiScore.csv.
   *
   * @param path the path to optiScore.csv.
   * @return the original information of the customer.
   * @throws IOException if a failure occurs when trying to read CSV files.
   * @throws RuntimeException if the first row of NamedCsv is not present.
   */
  private Customer getOriginalCustomer(Path path) throws IOException {
    final Optional<NamedCsvRow> csv =
        NamedCsvReader.builder().build(path, StandardCharsets.UTF_8).stream().findFirst();
    if (csv.isPresent()) {
      NamedCsvRow row = csv.get();
      String customerId = row.getField("CID");
      return Customer.newBuilder()
          .setResourceName(CustomerName.format(customerId))
          .setId(Long.parseLong(customerId))
          .setDescriptiveName(row.getField("AccountName"))
          .setOptimizationScore(Double.parseDouble(row.getField("OptiScore")))
          .build();
    } else {
      throw new RuntimeException("Failed to construct a customer from " + path);
    }
  }

  /**
   * Creates a map between a recommendation ID and the aggregated recommendation constructed from
   * recommendations.csv.
   *
   * @param path the path of recommendations.csv.
   * @param customerId the ID of customer whose recommendations to read.
   * @return a map between a recommendation ID and its aggregated recommendation.
   * @throws IOException if a failure occurs when trying to read recommendations.csv.
   */
  private Map<String, AggregatedRecommendation> getRecommendationsFromReport(
      Path path, long customerId) throws IOException {
    Map<String, AggregatedRecommendation> aggregatedRecommendationMap = new HashMap<>();
    NamedCsvReader.builder()
        .build(path, StandardCharsets.UTF_8)
        .forEach(
            row -> {
              String recommendationId = row.getField("ID");
              String recommendationType = row.getField("Type");
              String campaignId = row.getField("CampaignId");
              String campaignOptiScore = row.getField("CampaignOptiScore");
              String description = row.getField("Details");
              Recommendation recommendation =
                  Recommendation.newBuilder()
                      .setResourceName(
                          RecommendationName.format(String.valueOf(customerId), recommendationId))
                      .setType(RecommendationType.valueOf(recommendationType))
                      .build();
              Campaign campaign =
                  Campaign.newBuilder()
                      .setResourceName(CampaignName.format(String.valueOf(customerId), campaignId))
                      .setId(Long.parseLong(campaignId))
                      .setOptimizationScore(Double.parseDouble(campaignOptiScore))
                      .build();
              aggregatedRecommendationMap.put(
                  recommendationId,
                  new AggregatedRecommendation(recommendation, campaign, description));
            });
    return aggregatedRecommendationMap;
  }

  /**
   * Applies the provided recommendations to a customer.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the customer ID to apply recommendations to.
   * @param aggregatedRecommendations the list of aggregated recommendations.
   * @return a list of results of applying recommendations.
   */
  private List<ApplyRecommendationResult> applyRecommendations(
      GoogleAdsClient googleAdsClient,
      Long customerId,
      List<AggregatedRecommendation> aggregatedRecommendations) {
    List<ApplyRecommendationOperation> operations = new ArrayList<>();
    for (AggregatedRecommendation aggregatedRecommendation : aggregatedRecommendations) {
      operations.add(
          ApplyRecommendationOperation.newBuilder()
              .setResourceName(aggregatedRecommendation.recommendation.getResourceName())
              .build());
    }

    try (RecommendationServiceClient recommendationServiceClient =
        googleAdsClient.getLatestVersion().createRecommendationServiceClient()) {
      ApplyRecommendationResponse response =
          recommendationServiceClient.applyRecommendation(Long.toString(customerId), operations);
      return response.getResultsList();
    }
  }

  /**
   * Generates optimization reports to the report directory for the applied recommendations.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customer the customer to be reported with original optiScore before optimization.
   * @param reportDirectory the path of directory to generate reports.
   * @param results the list of ApplyRecommendationResult.
   * @param aggregatedRecommendationMap the map between a recommendation ID and its aggregated
   *     recommendation.
   * @throws IOException if a failure occurs when trying to generate reports.
   */
  private void generateReports(
      GoogleAdsClient googleAdsClient,
      Customer customer,
      String reportDirectory,
      List<ApplyRecommendationResult> results,
      Map<String, AggregatedRecommendation> aggregatedRecommendationMap)
      throws IOException {
    Path optiDir = Paths.get(reportDirectory, OPTIMIZATION_DIR_PREFIX + customer.getId());
    if (!Files.exists(optiDir)) {
      Files.createDirectories(optiDir);
    }

    Path path = Paths.get(optiDir.toString(), OPTI_SCORE_CSV);
    try (CsvWriter csv = CsvWriter.builder().build(path, StandardCharsets.UTF_8)) {
      csv.writeRow("CID", "AccountName", "OldOptiScore", "NewOptiScore")
          .writeRow(
              String.valueOf(customer.getId()),
              customer.getDescriptiveName(),
              String.valueOf(customer.getOptimizationScore()),
              String.valueOf(
                  getOptiScoreOfCustomer(googleAdsClient, String.valueOf(customer.getId()))));
    }

    generateReportsForRecommendations(
        googleAdsClient,
        customer.getId(),
        results,
        aggregatedRecommendationMap,
        Paths.get(optiDir.toString(), RECOMMENDATIONS_CSV));
  }

  /**
   * Gets the optimization score for a customer.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @return the customer's optimization score.
   */
  private double getOptiScoreOfCustomer(GoogleAdsClient googleAdsClient, String customerId) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      String query = "SELECT customer.optimization_score FROM customer";
      SearchGoogleAdsStreamRequest request =
          SearchGoogleAdsStreamRequest.newBuilder()
              .setCustomerId(customerId)
              .setQuery(query)
              .build();

      ServerStream<SearchGoogleAdsStreamResponse> stream =
          googleAdsServiceClient.searchStreamCallable().call(request);
      for (SearchGoogleAdsStreamResponse response : stream) {
        for (GoogleAdsRow row : response.getResultsList()) {
          return row.getCustomer().getOptimizationScore();
        }
      }
    }

    throw new RuntimeException("Customer not found with ID " + customerId);
  }

  /**
   * Generates recommendations.csv to persist the results of the successfully applied
   * recommendations line by line.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the customer ID to generate reports for.
   * @param results the list of results of successfully applied recommendations.
   * @param aggregatedRecommendationMap the map between a recommendationID and its
   *     aggregatedRecommendation.
   * @param path the path to recommendations.csv.
   * @throws IOException if a failure occurs when trying to write CSV files.
   */
  private void generateReportsForRecommendations(
      GoogleAdsClient googleAdsClient,
      long customerId,
      List<ApplyRecommendationResult> results,
      Map<String, AggregatedRecommendation> aggregatedRecommendationMap,
      Path path)
      throws IOException {
    try (CsvWriter csv = CsvWriter.builder().build(path, StandardCharsets.UTF_8)) {
      csv.writeRow("ID", "Type", "Details", "CampaignId", "OldOptiScore", "NewOptiScore");
      for (ApplyRecommendationResult result : results) {
        AggregatedRecommendation aggregatedRecommendation =
            aggregatedRecommendationMap.get(
                RecommendationName.parse(result.getResourceName()).getRecommendationId());
        Recommendation recommendation = aggregatedRecommendation.recommendation;
        Campaign oldCampaign = aggregatedRecommendation.campaign;
        // The campaign field of Recommendation will be set only when the recommendation affects a
        // single campaign. Otherwise, the query for recommendations will return campaigns whose ID
        // are 0, then all the columns about campaign in recommendations reports will be set 0.0. In
        // that case, just set NewOptiScore to 0.0 in optimization reports.
        csv.writeRow(
            RecommendationName.parse(recommendation.getResourceName()).getRecommendationId(),
            recommendation.getType().toString(),
            aggregatedRecommendation.description,
            String.valueOf(oldCampaign.getId()),
            String.valueOf(oldCampaign.getOptimizationScore()),
            String.valueOf(
                oldCampaign.getId() == 0
                    ? 0.0
                    : getOptiScoreOfCampaign(
                        googleAdsClient,
                        String.valueOf(customerId),
                        String.valueOf(oldCampaign.getId()))));
      }
    }
  }

  /**
   * Gets the optimization score of campaign.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the customer ID.
   * @param campaignId the campaign ID.
   * @return the optimization score of the customer's campaign.
   */
  private double getOptiScoreOfCampaign(
      GoogleAdsClient googleAdsClient, String customerId, String campaignId) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      String query =
          "SELECT campaign.optimization_score FROM campaign WHERE campaign.id = " + campaignId;
      SearchGoogleAdsStreamRequest request =
          SearchGoogleAdsStreamRequest.newBuilder()
              .setCustomerId(customerId)
              .setQuery(query)
              .build();

      ServerStream<SearchGoogleAdsStreamResponse> stream =
          googleAdsServiceClient.searchStreamCallable().call(request);
      for (SearchGoogleAdsStreamResponse response : stream) {
        for (GoogleAdsRow row : response.getResultsList()) {
          return row.getCampaign().getOptimizationScore();
        }
      }
    }
    throw new RuntimeException(
        "Failed to look up campaign " + campaignId + " for customer " + customerId);
  }
}

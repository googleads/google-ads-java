// Copyright 2023 Google LLC
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

package com.google.ads.googleads.examples.planning;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v22.common.KeywordPlanHistoricalMetrics;
import com.google.ads.googleads.v22.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork;
import com.google.ads.googleads.v22.errors.GoogleAdsError;
import com.google.ads.googleads.v22.errors.GoogleAdsException;
import com.google.ads.googleads.v22.services.GenerateKeywordHistoricalMetricsRequest;
import com.google.ads.googleads.v22.services.GenerateKeywordHistoricalMetricsResponse;
import com.google.ads.googleads.v22.services.GenerateKeywordHistoricalMetricsResult;
import com.google.ads.googleads.v22.services.KeywordPlanIdeaServiceClient;
import com.google.ads.googleads.v22.utils.ResourceNames;
import com.google.common.base.Joiner;
import com.google.common.collect.ComparisonChain;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * Generates historical metrics for keyword planning.
 *
 * <p>Guide:
 * https://developers.google.com/google-ads/api/docs/keyword-planning/generate-historical-metrics
 */
public class GenerateHistoricalMetrics {

  private static class GenerateForecastMetricsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID)
    public Long customerId;
  }

  public static void main(String[] args) {
    GenerateForecastMetricsParams params = new GenerateForecastMetricsParams();
    if (!params.parseArguments(args)) {

      // Optional, specify the customer ID under which to create a new keyword plan.
      params.customerId = Long.valueOf("INSERT_CUSTOMER_ID");
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
      new GenerateHistoricalMetrics().runExample(googleAdsClient, params.customerId);
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
    }
  }

  /**
   * Runs the code example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   */
  // [START generate_historical_metrics]
  private void runExample(GoogleAdsClient googleAdsClient, Long customerId) {
    GenerateKeywordHistoricalMetricsRequest request =
        GenerateKeywordHistoricalMetricsRequest.newBuilder()
            .setCustomerId(String.valueOf(customerId))
            .addAllKeywords(Arrays.asList("mars cruise", "cheap cruise", "jupiter cruise"))
            // See https://developers.google.com/google-ads/api/reference/data/geotargets for the
            // list of geo target IDs.
            // Geo target constant 2840 is for USA.
            .addGeoTargetConstants(ResourceNames.geoTargetConstant(2840))
            .setKeywordPlanNetwork(KeywordPlanNetwork.GOOGLE_SEARCH)
            // See
            // https://developers.google.com/google-ads/api/reference/data/codes-formats#languages
            // for the list of language constant IDs.
            // Language constant 1000 is for English.
            .setLanguage(ResourceNames.languageConstant(1000))
            .build();

    try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient =
        googleAdsClient.getLatestVersion().createKeywordPlanIdeaServiceClient()) {
      GenerateKeywordHistoricalMetricsResponse response =
          keywordPlanIdeaServiceClient.generateKeywordHistoricalMetrics(request);
      for (GenerateKeywordHistoricalMetricsResult result : response.getResultsList()) {
        KeywordPlanHistoricalMetrics metrics = result.getKeywordMetrics();
        System.out.printf("The search query: %s%n", result.getText());
        System.out.printf(
            "and the following variants: %s%n", Joiner.on(",").join(result.getCloseVariantsList()));
        System.out.println("generated the following historical metrics:");

        // Approximate number of monthly searches on this query averaged for the past 12
        // months.
        System.out.printf(
            "Approximate monthly searches: %s%n",
            metrics.hasAvgMonthlySearches() ? metrics.getAvgMonthlySearches() : null);

        // The competition level for this search query.
        System.out.printf("Competition level: %s%n", metrics.getCompetition());

        // The competition index for the query in the range [0,100]. This shows how
        // competitive ad placement is for a keyword. The level of competition from 0-100 is
        // determined by the number of ad slots filled divided by the total number of slots
        // available. If not enough data is available, null will be returned.
        System.out.printf(
            "Competition index: %s%n",
            metrics.hasCompetitionIndex() ? metrics.getCompetitionIndex() : null);

        // Top of page bid low range (20th percentile) in micros for the keyword.
        System.out.printf(
            "Top of page bid low range: %s%n",
            metrics.hasLowTopOfPageBidMicros() ? metrics.getLowTopOfPageBidMicros() : null);

        // Top of page bid high range (80th percentile) in micros for the keyword.
        System.out.printf(
            "Top of page bid high range: %s%n",
            metrics.hasHighTopOfPageBidMicros() ? metrics.getHighTopOfPageBidMicros() : null);

        // Approximate number of searches on this query for the past twelve months.
        metrics.getMonthlySearchVolumesList().stream()
            // Orders the monthly search volumes by descending year, then descending month.
            .sorted(
                (a, b) ->
                    ComparisonChain.start()
                        .compare(b.getYear(), a.getYear())
                        .compare(b.getMonth(), a.getMonth())
                        .result())
            // Prints each monthly search volume.
            .forEachOrdered(
                monthlySearchVolume ->
                    System.out.printf(
                        "Approximately %d searches in %s, %s%n",
                        monthlySearchVolume.getMonthlySearches(),
                        monthlySearchVolume.getMonth(),
                        monthlySearchVolume.getYear()));
      }
    }
  }
  // [END generate_historical_metrics]
}

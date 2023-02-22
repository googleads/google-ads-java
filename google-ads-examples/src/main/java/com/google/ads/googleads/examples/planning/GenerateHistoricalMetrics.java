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

package com.google.ads.googleads.examples.planning;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v13.common.MonthlySearchVolume;
import com.google.ads.googleads.v13.errors.GoogleAdsError;
import com.google.ads.googleads.v13.errors.GoogleAdsException;
import com.google.ads.googleads.v13.services.GenerateHistoricalMetricsResponse;
import com.google.ads.googleads.v13.services.KeywordPlanKeywordHistoricalMetrics;
import com.google.ads.googleads.v13.services.KeywordPlanServiceClient;
import com.google.ads.googleads.v13.utils.ResourceNames;
import com.google.protobuf.ProtocolStringList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * Generates historical metrics for a keyword plan. To create a keyword plan, run the {@link
 * AddKeywordPlan} example.
 */
public class GenerateHistoricalMetrics {

  private static class GenerateHistoricalMetricsParams extends CodeSampleParams {

    @Parameter(
        names = ArgumentNames.CUSTOMER_ID,
        description = "The customer in which to create a new keyword plan.")
    public Long customerId;

    @Parameter(
        names = ArgumentNames.KEYWORD_PLAN_ID,
        description = "The keyword plan ID for which to generate metrics.")
    public Long keywordPlanId;
  }

  public static void main(String[] args) {
    GenerateHistoricalMetricsParams params = new GenerateHistoricalMetricsParams();
    if (!params.parseArguments(args)) {

      // Optional, specify the customer ID for which the call is made.
      params.customerId = Long.valueOf("INSERT_CUSTOMER_ID");

      params.keywordPlanId = Long.valueOf("INSERT_KEYWORD_PLAN_ID");
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
      new GenerateHistoricalMetrics()
          .runExample(googleAdsClient, params.customerId, params.keywordPlanId);
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
   * @param planId the plan ID.
   */
  // [START generate_historical_metrics]
  private void runExample(GoogleAdsClient googleAdsClient, Long customerId, Long planId) {
    String resourceName = ResourceNames.keywordPlan(customerId, planId);

    try (KeywordPlanServiceClient keywordPlanServiceClient =
        googleAdsClient.getLatestVersion().createKeywordPlanServiceClient()) {
      GenerateHistoricalMetricsResponse response =
          keywordPlanServiceClient.generateHistoricalMetrics(resourceName);

      for (KeywordPlanKeywordHistoricalMetrics metric : response.getMetricsList()) {
        // These metrics include those for both the search query and any close variants included in
        // the response.

        List<String> variants = metric.getCloseVariantsList();
        String variantsList =
            (variants.isEmpty())
                ? ""
                : String.format(" (and the following variants: %s)", String.join(", ", variants));

        System.out.printf(
            "The search query '%s'%s generated the following historical metrics:%n",
            metric.getSearchQuery(), variantsList);

        // Approximate number of monthly searches on this query averaged for the past 12 months.
        System.out.printf(
            "\tApproximate monthly searches: %d.%n",
            metric.getKeywordMetrics().getAvgMonthlySearches());

        // The competition level for this search query.
        System.out.printf(
            "\tCompetition level: %s.%n", metric.getKeywordMetrics().getCompetition().name());

        // The competition index for the query in the range [0, 100]. This shows how competitive ad
        // placement is for a keyword. The level of competition from 0-100 is determined by the
        // number of ad slots filled divided by the total number of ad slots available. If not
        // enough data is available, None will be returned.
        if (metric.getKeywordMetrics().hasCompetitionIndex()) {
          System.out.printf(
              "\tCompetition index: %d.%n", metric.getKeywordMetrics().getCompetitionIndex());
        }

        // Top of page bid low range (20th percentile) in micros for the keyword.
        if (metric.getKeywordMetrics().hasLowTopOfPageBidMicros()) {
          System.out.printf(
              "\tTop of page bid low range %d.%n",
              metric.getKeywordMetrics().getLowTopOfPageBidMicros());
        }

        // Top of page bid high range (80th percentile) in micros for the keyword.
        if (metric.getKeywordMetrics().hasHighTopOfPageBidMicros()) {
          System.out.printf(
              "\tTop of page bid high range %d.%n",
              metric.getKeywordMetrics().getHighTopOfPageBidMicros());
        }

        // Approximate number of searches on this query for the past twelve months.
        for (MonthlySearchVolume month : metric.getKeywordMetrics().getMonthlySearchVolumesList()) {
          System.out.printf(
              "\tApproximately %d searches in %s, %d.%n",
              month.getMonthlySearches(), month.getMonth().name(), month.getYear());
        }
      }
    }
  }
  // [END generate_historical_metrics]
}

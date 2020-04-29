// Copyright 2019 Google LLC
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
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.ads.googleads.v3.services.ForecastMetrics;
import com.google.ads.googleads.v3.services.GenerateForecastMetricsResponse;
import com.google.ads.googleads.v3.services.KeywordPlanKeywordForecast;
import com.google.ads.googleads.v3.services.KeywordPlanServiceClient;
import com.google.ads.googleads.v3.utils.ResourceNames;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Creates a keyword plan, which can be reused for retrieving forecast metrics and historic metrics.
 */
public class GenerateForecastMetrics {

  private static class GenerateForecastMetricParams extends CodeSampleParams {

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
    GenerateForecastMetricParams params = new GenerateForecastMetricParams();
    if (!params.parseArguments(args)) {

      // Optional, specify the customer ID for which the call is made.
      params.customerId = Long.valueOf("INSERT_CUSTOMER_ID");

      params.keywordPlanId = Long.valueOf("INSERT_KEYWORD_PLAN_ID");
    }
    GoogleAdsClient googleAdsClient;
    try {
      googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
          "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      return;
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      return;
    }

    try {
      new GenerateForecastMetrics()
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
    }
  }

  /**
   * Runs the code example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param planId the plan ID.
   */
  private void runExample(GoogleAdsClient googleAdsClient, Long customerId, Long planId) {
    String planResourceName = ResourceNames.keywordPlan(customerId, planId);

    try (KeywordPlanServiceClient client =
        googleAdsClient.getLatestVersion().createKeywordPlanServiceClient()) {
      GenerateForecastMetricsResponse response = client.generateForecastMetrics(planResourceName);
      int i = 0;
      for (KeywordPlanKeywordForecast forecast : response.getKeywordForecastsList()) {
        ForecastMetrics metrics = forecast.getKeywordForecast();
        System.out.printf(
            "%d Keyword ID: %s%n", ++i, forecast.getKeywordPlanAdGroupKeyword().getValue());
        System.out.printf("Estimated daily clicks: %f%n", metrics.getClicks().getValue());
        System.out.printf("Estimated daily impressions: %f%n", metrics.getImpressions().getValue());
        System.out.printf(
            "Estimated average cpc (micros): %d%n%n", metrics.getAverageCpc().getValue());
      }
    }
  }
}

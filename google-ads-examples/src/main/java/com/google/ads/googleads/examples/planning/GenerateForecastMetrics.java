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
import com.google.ads.googleads.v16.common.DateRange;
import com.google.ads.googleads.v16.common.KeywordInfo;
import com.google.ads.googleads.v16.enums.KeywordMatchTypeEnum.KeywordMatchType;
import com.google.ads.googleads.v16.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork;
import com.google.ads.googleads.v16.errors.GoogleAdsError;
import com.google.ads.googleads.v16.errors.GoogleAdsException;
import com.google.ads.googleads.v16.services.BiddableKeyword;
import com.google.ads.googleads.v16.services.CampaignToForecast;
import com.google.ads.googleads.v16.services.CampaignToForecast.CampaignBiddingStrategy;
import com.google.ads.googleads.v16.services.CriterionBidModifier;
import com.google.ads.googleads.v16.services.ForecastAdGroup;
import com.google.ads.googleads.v16.services.GenerateKeywordForecastMetricsRequest;
import com.google.ads.googleads.v16.services.GenerateKeywordForecastMetricsResponse;
import com.google.ads.googleads.v16.services.KeywordForecastMetrics;
import com.google.ads.googleads.v16.services.KeywordPlanIdeaServiceClient;
import com.google.ads.googleads.v16.services.ManualCpcBiddingStrategy;
import com.google.ads.googleads.v16.utils.ResourceNames;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * Generates forecast metrics for keyword planning.
 *
 * <p>Guide:
 * https://developers.google.com/google-ads/api/docs/keyword-planning/generate-forecast-metrics
 */
public class GenerateForecastMetrics {

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
      new GenerateForecastMetrics().runExample(googleAdsClient, params.customerId);
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
  // [START generate_forecast_metrics]
  private void runExample(GoogleAdsClient googleAdsClient, Long customerId) {
    CampaignToForecast campaignToForecast = createCampaignToForecast(googleAdsClient);
    GenerateKeywordForecastMetricsRequest request =
        GenerateKeywordForecastMetricsRequest.newBuilder()
            .setCustomerId(String.valueOf(customerId))
            .setCampaign(campaignToForecast)
            .setForecastPeriod(
                DateRange.newBuilder()
                    // Sets the forecast start date to tomorrow.
                    .setStartDate(new DateTime().plusDays(1).toString("yyyy-MM-dd"))
                    // Sets the forecast end date to 30 days from today.
                    .setEndDate(new DateTime().plusDays(30).toString("yyyy-MM-dd")))
            .build();
    try (KeywordPlanIdeaServiceClient keywordPlanIdeaServiceClient =
        googleAdsClient.getLatestVersion().createKeywordPlanIdeaServiceClient()) {
      GenerateKeywordForecastMetricsResponse response =
          keywordPlanIdeaServiceClient.generateKeywordForecastMetrics(request);
      KeywordForecastMetrics metrics = response.getCampaignForecastMetrics();
      System.out.printf(
          "Estimated daily clicks: %s%n", metrics.hasClicks() ? metrics.getClicks() : null);
      System.out.printf(
          "Estimated daily impressions: %s%n",
          metrics.hasImpressions() ? metrics.getImpressions() : null);
      System.out.printf(
          "Estimated average CPC (micros): %s%n",
          metrics.hasAverageCpcMicros() ? metrics.getAverageCpcMicros() : null);
    }
  }

  /**
   * Creates the campaign to forecast. A campaign to forecast lets you try out various
   * configurations and keywords to find the best optimization for your future campaigns. Once
   * you've found the best campaign configuration, create a serving campaign in your Google Ads
   * account with similar values and keywords. For more details, see:
   *
   * <p>https://support.google.com/google-ads/answer/3022575
   *
   * @param googleAdsClient
   * @return
   */
  private CampaignToForecast createCampaignToForecast(GoogleAdsClient googleAdsClient) {
    CampaignToForecast.Builder campaignToForecastBuilder =
        CampaignToForecast.newBuilder()
            .setKeywordPlanNetwork(KeywordPlanNetwork.GOOGLE_SEARCH)
            .setBiddingStrategy(
                CampaignBiddingStrategy.newBuilder()
                    .setManualCpcBiddingStrategy(
                        ManualCpcBiddingStrategy.newBuilder().setMaxCpcBidMicros(1_000_000L)));

    // See https://developers.google.com/google-ads/api/reference/data/geotargets for the list of
    // geo target IDs.
    campaignToForecastBuilder.addGeoModifiers(
        CriterionBidModifier.newBuilder()
            // Geo target constant 2840 is for USA.
            .setGeoTargetConstant(ResourceNames.geoTargetConstant(2840)));

    // See https://developers.google.com/google-ads/api/reference/data/codes-formats#languages for
    // the list of language criteria IDs. Language constant 1000 is for English.
    campaignToForecastBuilder.addLanguageConstants(ResourceNames.languageConstant(1000));

    // Create forecast ad group based on themes such as creative relevance, product category, or
    // cost per click.
    ForecastAdGroup.Builder forecastAdGroupBuilder = ForecastAdGroup.newBuilder();
    forecastAdGroupBuilder.addBiddableKeywords(
        BiddableKeyword.newBuilder()
            .setMaxCpcBidMicros(2_500_000)
            .setKeyword(
                KeywordInfo.newBuilder()
                    .setText("mars cruise")
                    .setMatchType(KeywordMatchType.BROAD)));

    forecastAdGroupBuilder.addBiddableKeywords(
        BiddableKeyword.newBuilder()
            .setMaxCpcBidMicros(1_500_000)
            .setKeyword(
                KeywordInfo.newBuilder()
                    .setText("cheap cruise")
                    .setMatchType(KeywordMatchType.PHRASE)));

    forecastAdGroupBuilder.addBiddableKeywords(
        BiddableKeyword.newBuilder()
            .setMaxCpcBidMicros(1_990_000)
            .setKeyword(
                KeywordInfo.newBuilder()
                    .setText("jupiter cruise")
                    .setMatchType(KeywordMatchType.BROAD)));

    forecastAdGroupBuilder.addNegativeKeywords(
        KeywordInfo.newBuilder().setText("moon walk").setMatchType(KeywordMatchType.BROAD));

    campaignToForecastBuilder.addAdGroups(forecastAdGroupBuilder.build());
    return campaignToForecastBuilder.build();
  }
  // [END generate_forecast_metrics]
}

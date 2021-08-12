// Copyright 2021 Google LLC
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

package com.google.ads.googleads.examples.advancedoperations;

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v8.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v8.enums.SeasonalityEventScopeEnum.SeasonalityEventScope;
import com.google.ads.googleads.v8.errors.GoogleAdsError;
import com.google.ads.googleads.v8.errors.GoogleAdsException;
import com.google.ads.googleads.v8.resources.BiddingSeasonalityAdjustment;
import com.google.ads.googleads.v8.services.BiddingSeasonalityAdjustmentOperation;
import com.google.ads.googleads.v8.services.BiddingSeasonalityAdjustmentServiceClient;
import com.google.ads.googleads.v8.services.MutateBiddingSeasonalityAdjustmentsResponse;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Adds a customer-level seasonality adjustment that adjusts Smart Bidding behavior by the expected
 * change in conversion rate for the given future time interval.
 *
 * <p>For more information on using seasonality adjustments, see
 * https://developers.google.com/google-ads/api/docs/campaigns/bidding/seasonality-adjustments.
 */
public class AddBiddingSeasonalityAdjustment {

  private static class AddBiddingSeasonalityAdjustmentParams extends CodeSampleParams {

    @Parameter(
        names = ArgumentNames.CUSTOMER_ID,
        required = true,
        description =
            "The client customer ID of the Google Ads account that the seasonality adjustment will"
                + " be added to.")
    private Long customerId;

    @Parameter(
        names = ArgumentNames.START_DATE_TIME,
        required = true,
        description =
            "The start date time in yyyy-MM-dd HH:mm:ss format of the conversion rate adjustment"
                + " period.")
    private String startDateTime;

    @Parameter(
        names = ArgumentNames.END_DATE_TIME,
        required = true,
        description =
            "The end date time in yyyy-MM-dd HH:mm:ss format of the conversion rate adjustment"
                + " period.")
    private String endDateTime;

    @Parameter(
        names = ArgumentNames.CONVERSION_RATE_MODIFIER,
        required = true,
        description =
            "The conversion rate modifier that will be applied during the adjustment interval.")
    private Double conversionRateModifer;
  }

  public static void main(String[] args) throws IOException {
    AddBiddingSeasonalityAdjustmentParams params = new AddBiddingSeasonalityAdjustmentParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.startDateTime = "INSERT_START_DATE_TIME_HERE";
      params.endDateTime = "INSERT_END_DATE_TIME_HERE";
      params.conversionRateModifer = Double.parseDouble("INSERT_CONVERSION_RATE_MODIFIER_HERE");
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
      new AddBiddingSeasonalityAdjustment()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.startDateTime,
              params.endDateTime,
              params.conversionRateModifer);
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
   * Adds a "CUSTOMER" scoped seasonality adjustment for the client customer ID, dates, and
   * conversion modifier rate specified.
   *
   * @param googleAdsClient the GoogleAdsClient
   * @param customerId the client ID of the Google Ads account
   * @param startDateTime the start time of the seasonality adjustment (in yyyy-MM-dd HH:mm:ss
   *     format) in the account's timezone
   * @param endDateTime the end time of the seasonality adjustment (in yyyy-MM-dd HH:mm:ss format)
   *     in the account's timezone
   * @param conversionRateModifier the conversion rate adjustment (an increase or a decrease), which
   *     accounts for estimated changes in conversion rate due to a future event
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      Long customerId,
      String startDateTime,
      String endDateTime,
      Double conversionRateModifier) {

    try (BiddingSeasonalityAdjustmentServiceClient seasonalityAdjustmentServiceClient =
        googleAdsClient.getLatestVersion().createBiddingSeasonalityAdjustmentServiceClient()) {

      // [START add_bidding_seasonality_adjustment]
      BiddingSeasonalityAdjustment seasonalityAdjustment =
          BiddingSeasonalityAdjustment.newBuilder()
              // A unique name is required for every seasonality adjustment.
              .setName("Seasonality adjustment #" + getPrintableDateTime())
              // The CHANNEL scope applies the conversionRateModifier to all campaigns of specific
              // advertising channel types. In this example, the conversionRateModifier will only
              // apply to Search campaigns. Use the CAMPAIGN scope to instead limit the scope to
              // specific campaigns.
              .setScope(SeasonalityEventScope.CHANNEL)
              .addAdvertisingChannelTypes(AdvertisingChannelType.SEARCH)
              // If setting scope CAMPAIGN, add individual campaign resource name(s) according to
              // the commented out line below.
              // .addCampaigns("INSERT_CAMPAIGN_RESOURCE_NAME_HERE")
              .setStartDateTime(startDateTime)
              .setEndDateTime(endDateTime)
              // The conversionRateModifier is the expected future conversion rate change. When this
              // field is unset or set to 1.0, no adjustment will be applied to traffic. The allowed
              // range is 0.1 to 10.0.
              .setConversionRateModifier(conversionRateModifier)
              .build();

      BiddingSeasonalityAdjustmentOperation operation =
          BiddingSeasonalityAdjustmentOperation.newBuilder()
              .setCreate(seasonalityAdjustment)
              .build();

      MutateBiddingSeasonalityAdjustmentsResponse response =
          seasonalityAdjustmentServiceClient.mutateBiddingSeasonalityAdjustments(
              customerId.toString(), ImmutableList.of(operation));
      System.out.printf(
          "Added seasonality adjustment with resource name: %s%n",
          response.getResults(0).getResourceName());
      // [END add_bidding_seasonality_adjustment]
    }
  }
}

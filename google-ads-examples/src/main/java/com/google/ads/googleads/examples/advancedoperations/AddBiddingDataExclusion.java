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
import com.google.ads.googleads.v15.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v15.enums.SeasonalityEventScopeEnum.SeasonalityEventScope;
import com.google.ads.googleads.v15.errors.GoogleAdsError;
import com.google.ads.googleads.v15.errors.GoogleAdsException;
import com.google.ads.googleads.v15.resources.BiddingDataExclusion;
import com.google.ads.googleads.v15.services.BiddingDataExclusionOperation;
import com.google.ads.googleads.v15.services.BiddingDataExclusionServiceClient;
import com.google.ads.googleads.v15.services.MutateBiddingDataExclusionsResponse;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Adds a data exclusion for all search campaigns that excludes conversions from being used by Smart
 * Bidding for the time interval specified.
 *
 * <p>For more information on using data exclusions, see
 * https://developers.google.com/google-ads/api/docs/campaigns/bidding/data-exclusions.
 */
public class AddBiddingDataExclusion {

  private static class AddBiddingDataExclusionParams extends CodeSampleParams {

    @Parameter(
        names = ArgumentNames.CUSTOMER_ID,
        required = true,
        description =
            "The client customer ID of the Google Ads account that the data exclusion will"
                + " be added to.")
    private Long customerId;

    @Parameter(
        names = ArgumentNames.START_DATE_TIME,
        required = true,
        description =
            "The start date time in yyyy-MM-dd HH:mm:ss format of the data exclusion period.")
    private String startDateTime;

    @Parameter(
        names = ArgumentNames.END_DATE_TIME,
        required = true,
        description =
            "The end date time in yyyy-MM-dd HH:mm:ss format of the data exclusion period.")
    private String endDateTime;
  }

  public static void main(String[] args) throws IOException {
    AddBiddingDataExclusionParams params = new AddBiddingDataExclusionParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.startDateTime = "INSERT_START_DATE_TIME_HERE";
      params.endDateTime = "INSERT_END_DATE_TIME_HERE";
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
      new AddBiddingDataExclusion()
          .runExample(googleAdsClient, params.customerId, params.startDateTime, params.endDateTime);
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
   * Adds a "CHANNEL" scoped data exclusion for the client customer ID and dates specified.
   *
   * @param googleAdsClient the GoogleAdsClient
   * @param customerId the client ID of the Google Ads account
   * @param startDateTime the start time of the data exclusion (in yyyy-MM-dd HH:mm:ss format) in
   *     the account's timezone
   * @param endDateTime the end time of the data exclusion (in yyyy-MM-dd HH:mm:ss format) in the
   *     account's timezone
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, Long customerId, String startDateTime, String endDateTime) {

    try (BiddingDataExclusionServiceClient DataExclusionServiceClient =
        googleAdsClient.getLatestVersion().createBiddingDataExclusionServiceClient()) {

      // [START add_bidding_data_exclusion]
      BiddingDataExclusion DataExclusion =
          BiddingDataExclusion.newBuilder()
              // A unique name is required for every data exclusion.
              .setName("Data exclusion #" + getPrintableDateTime())
              // The CHANNEL scope applies the data exclusion to all campaigns of specific
              // advertising channel types. In this example, the exclusion will only apply to
              // Search campaigns. Use the CAMPAIGN scope to instead limit the scope to specific
              // campaigns.
              .setScope(SeasonalityEventScope.CHANNEL)
              .addAdvertisingChannelTypes(AdvertisingChannelType.SEARCH)
              // If setting scope CAMPAIGN, add individual campaign resource name(s) according to
              // the commented out line below.
              // .addCampaigns("INSERT_CAMPAIGN_RESOURCE_NAME_HERE")
              .setStartDateTime(startDateTime)
              .setEndDateTime(endDateTime)
              .build();

      BiddingDataExclusionOperation operation =
          BiddingDataExclusionOperation.newBuilder().setCreate(DataExclusion).build();

      MutateBiddingDataExclusionsResponse response =
          DataExclusionServiceClient.mutateBiddingDataExclusions(
              customerId.toString(), ImmutableList.of(operation));
      System.out.printf(
          "Added data exclusion with resource name: %s%n",
          response.getResults(0).getResourceName());
      // [END add_bidding_data_exclusion]
    }
  }
}

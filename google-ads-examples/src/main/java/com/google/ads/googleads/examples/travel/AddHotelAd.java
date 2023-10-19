// Copyright 2018 Google LLC
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

package com.google.ads.googleads.examples.travel;

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v15.common.HotelAdInfo;
import com.google.ads.googleads.v15.common.PercentCpc;
import com.google.ads.googleads.v15.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v15.enums.AdGroupStatusEnum.AdGroupStatus;
import com.google.ads.googleads.v15.enums.AdGroupTypeEnum.AdGroupType;
import com.google.ads.googleads.v15.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v15.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v15.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v15.errors.GoogleAdsError;
import com.google.ads.googleads.v15.errors.GoogleAdsException;
import com.google.ads.googleads.v15.resources.Ad;
import com.google.ads.googleads.v15.resources.AdGroup;
import com.google.ads.googleads.v15.resources.AdGroupAd;
import com.google.ads.googleads.v15.resources.Campaign;
import com.google.ads.googleads.v15.resources.Campaign.HotelSettingInfo;
import com.google.ads.googleads.v15.resources.Campaign.NetworkSettings;
import com.google.ads.googleads.v15.resources.CampaignBudget;
import com.google.ads.googleads.v15.services.AdGroupAdOperation;
import com.google.ads.googleads.v15.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v15.services.AdGroupOperation;
import com.google.ads.googleads.v15.services.AdGroupServiceClient;
import com.google.ads.googleads.v15.services.CampaignBudgetOperation;
import com.google.ads.googleads.v15.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v15.services.CampaignOperation;
import com.google.ads.googleads.v15.services.CampaignServiceClient;
import com.google.ads.googleads.v15.services.MutateAdGroupAdResult;
import com.google.ads.googleads.v15.services.MutateAdGroupResult;
import com.google.ads.googleads.v15.services.MutateCampaignBudgetsResponse;
import com.google.ads.googleads.v15.services.MutateCampaignResult;
import com.google.ads.googleads.v15.services.MutateCampaignsResponse;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;

/**
 * Creates a hotel campaign, a hotel ad group and a hotel ad group ad.
 *
 * <p>Prerequisite: You need to have access to the Hotel Ads Center, which can be granted during
 * integration with Google Hotels. The integration instructions can be found at:
 * https://support.google.com/hotelprices/answer/6101897.
 */
public class AddHotelAd {

  private static class AddHotelAdParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.HOTEL_CENTER_ACCOUNT_ID, required = true)
    private Long hotelCenterAccountId;

    @Parameter(names = ArgumentNames.CPC_BID_CEILING_MICRO_AMOUNT)
    private Long cpcBidCeilingMicroAmount = 20_000_000L;
  }

  public static void main(String[] args) {
    AddHotelAdParams params = new AddHotelAdParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.hotelCenterAccountId = Long.parseLong("INSERT_HOTEL_CENTER_ACCOUNT_ID_HERE");
      params.cpcBidCeilingMicroAmount = Long.parseLong("INSERT_CPC_BID_CEILING_MICRO_AMOUNT_HERE");
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
      new AddHotelAd()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.hotelCenterAccountId,
              params.cpcBidCeilingMicroAmount);
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
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param hotelCenterAccountId the Hotel Center account ID.
   * @param cpcBidCeilingMicroAmount the maximum bid limit that can be set when creating a campaign
   *     using the Percent CPC bidding strategy.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START add_hotel_ad]
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long hotelCenterAccountId,
      long cpcBidCeilingMicroAmount) {

    // Creates a budget to be used by the campaign that will be created below.
    String budgetResourceName = addCampaignBudget(googleAdsClient, customerId);

    // Creates a hotel campaign.
    String campaignResourceName =
        addHotelCampaign(
            googleAdsClient,
            customerId,
            budgetResourceName,
            hotelCenterAccountId,
            cpcBidCeilingMicroAmount);

    // Creates a hotel ad group.
    String adGroupResourceName = addHotelAdGroup(googleAdsClient, customerId, campaignResourceName);

    // Creates a hotel ad group ad.
    addHotelAdGroupAd(googleAdsClient, customerId, adGroupResourceName);
  }
  // [END add_hotel_ad]

  /**
   * Creates a new campaign budget in the specified client account.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @return resource name of the newly created budget.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private String addCampaignBudget(GoogleAdsClient googleAdsClient, long customerId) {
    CampaignBudget budget =
        CampaignBudget.newBuilder()
            .setName("Interplanetary Cruise Budget #" + getPrintableDateTime())
            .setDeliveryMethod(BudgetDeliveryMethod.STANDARD)
            .setAmountMicros(5_000_000)
            .build();

    CampaignBudgetOperation op = CampaignBudgetOperation.newBuilder().setCreate(budget).build();

    try (CampaignBudgetServiceClient campaignBudgetServiceClient =
        googleAdsClient.getLatestVersion().createCampaignBudgetServiceClient()) {
      MutateCampaignBudgetsResponse response =
          campaignBudgetServiceClient.mutateCampaignBudgets(
              Long.toString(customerId), ImmutableList.of(op));
      String budgetResourceName = response.getResults(0).getResourceName();
      System.out.printf("Added a budget with resource name: '%s'%n", budgetResourceName);
      return budgetResourceName;
    }
  }

  /**
   * Creates a new hotel campaign in the specified client account.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param budgetResourceName the resource name of the budget for the campaign.
   * @param hotelCenterAccountId the Hotel Center account ID.
   * @param cpcBidCeilingMicroAmount the maximum bid limit that can be set when creating a campaign
   *     using the Percent CPC bidding strategy.
   * @return resource name of the newly created campaign.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private String addHotelCampaign(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String budgetResourceName,
      long hotelCenterAccountId,
      long cpcBidCeilingMicroAmount) {

    // Configures the hotel settings.
    HotelSettingInfo hotelSettingInfo =
        HotelSettingInfo.newBuilder().setHotelCenterId(hotelCenterAccountId).build();

    // Configures the campaign network options. Only Google Search is allowed for
    // hotel campaigns.
    NetworkSettings networkSettings =
        NetworkSettings.newBuilder().setTargetGoogleSearch(true).build();

    // [START add_hotel_ad_1]
    // Creates the campaign.
    Campaign campaign =
        Campaign.newBuilder()
            .setName("Interplanetary Cruise #" + getPrintableDateTime())
            // Configures settings related to hotel campaigns including advertising channel type
            // and hotel setting info.
            .setAdvertisingChannelType(AdvertisingChannelType.HOTEL)
            .setHotelSetting(hotelSettingInfo)
            // Recommendation: Sets the campaign to PAUSED when creating it to prevent
            // the ads from immediately serving. Set to ENABLED once you've added
            // targeting and the ads are ready to serve
            .setStatus(CampaignStatus.PAUSED)
            // Sets the bidding strategy to Percent CPC. Only Manual CPC and Percent CPC can be used
            // for hotel campaigns.
            .setPercentCpc(
                PercentCpc.newBuilder().setCpcBidCeilingMicros(cpcBidCeilingMicroAmount).build())
            // Sets the budget.
            .setCampaignBudget(budgetResourceName)
            // Adds the networkSettings configured above.
            .setNetworkSettings(networkSettings)
            .build();
    // [END add_hotel_ad_1]

    // Creates a campaign operation.
    CampaignOperation operation = CampaignOperation.newBuilder().setCreate(campaign).build();

    // Issues a mutate request to add the campaign.
    try (CampaignServiceClient campaignServiceClient =
        googleAdsClient.getLatestVersion().createCampaignServiceClient()) {
      MutateCampaignsResponse response =
          campaignServiceClient.mutateCampaigns(
              Long.toString(customerId), Collections.singletonList(operation));
      MutateCampaignResult result = response.getResults(0);
      System.out.printf(
          "Added a hotel campaign with resource name: '%s'%n", result.getResourceName());
      return result.getResourceName();
    }
  }

  /**
   * Creates a new hotel ad group in the specified campaign.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignResourceName the resource name of the campaign that the new ad group will belong
   *     to.
   * @return resource name of the newly created ad group.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START add_hotel_ad_2]
  private String addHotelAdGroup(
      GoogleAdsClient googleAdsClient, long customerId, String campaignResourceName) {
    // Creates an ad group.
    AdGroup adGroup =
        AdGroup.newBuilder()
            .setName("Earth to Mars Cruises #" + getPrintableDateTime())
            .setCampaign(campaignResourceName)
            // Sets the ad group type to HOTEL_ADS. This cannot be set to other types.
            .setType(AdGroupType.HOTEL_ADS)
            .setCpcBidMicros(1_000_000L)
            .setStatus(AdGroupStatus.ENABLED)
            .build();

    // Creates an ad group operation.
    AdGroupOperation operation = AdGroupOperation.newBuilder().setCreate(adGroup).build();

    // Issues a mutate request to add an ad group.
    try (AdGroupServiceClient adGroupServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupServiceClient()) {
      MutateAdGroupResult mutateAdGroupResult =
          adGroupServiceClient
              .mutateAdGroups(Long.toString(customerId), Collections.singletonList(operation))
              .getResults(0);
      System.out.printf(
          "Added a hotel ad group with resource name: '%s'%n",
          mutateAdGroupResult.getResourceName());
      return mutateAdGroupResult.getResourceName();
    }
  }
  // [END add_hotel_ad_2]

  /**
   * Creates a new hotel ad group ad in the specified ad group.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupResourceName the resource name of the ad group that the new ad group ad will
   *     belong to.
   * @return resource name of the newly created ad group ad.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START add_hotel_ad_3]
  private String addHotelAdGroupAd(
      GoogleAdsClient googleAdsClient, long customerId, String adGroupResourceName) {
    // Creates a new hotel ad.
    Ad ad = Ad.newBuilder().setHotelAd(HotelAdInfo.newBuilder().build()).build();
    // Creates a new ad group ad and sets the hotel ad to it.
    AdGroupAd adGroupAd =
        AdGroupAd.newBuilder()
            // Sets the ad to the ad created above.
            .setAd(ad)
            // Set the ad group ad to enabled.  Setting this to paused will cause an error
            // for hotel campaigns.  For hotels pausing should happen at either the ad group or
            // campaign level.
            .setStatus(AdGroupAdStatus.ENABLED)
            // Sets the ad group.
            .setAdGroup(adGroupResourceName)
            .build();

    // Creates an ad group ad operation.
    AdGroupAdOperation operation = AdGroupAdOperation.newBuilder().setCreate(adGroupAd).build();

    // Issues a mutate request to add an ad group ad.
    try (AdGroupAdServiceClient adGroupAdServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupAdServiceClient()) {
      MutateAdGroupAdResult mutateAdGroupAdResult =
          adGroupAdServiceClient
              .mutateAdGroupAds(Long.toString(customerId), Collections.singletonList(operation))
              .getResults(0);
      System.out.printf(
          "Added a hotel ad group ad with resource name: '%s'%n",
          mutateAdGroupAdResult.getResourceName());
      return mutateAdGroupAdResult.getResourceName();
    }
  }
  // [END add_hotel_ad_3]
}

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

package com.google.ads.googleads.examples.travel;

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v18.common.MaximizeConversionValue;
import com.google.ads.googleads.v18.common.TravelAdInfo;
import com.google.ads.googleads.v18.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v18.enums.AdGroupStatusEnum.AdGroupStatus;
import com.google.ads.googleads.v18.enums.AdGroupTypeEnum.AdGroupType;
import com.google.ads.googleads.v18.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType;
import com.google.ads.googleads.v18.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v18.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v18.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v18.errors.GoogleAdsError;
import com.google.ads.googleads.v18.errors.GoogleAdsException;
import com.google.ads.googleads.v18.resources.Ad;
import com.google.ads.googleads.v18.resources.AdGroup;
import com.google.ads.googleads.v18.resources.AdGroupAd;
import com.google.ads.googleads.v18.resources.Campaign;
import com.google.ads.googleads.v18.resources.Campaign.NetworkSettings;
import com.google.ads.googleads.v18.resources.Campaign.TravelCampaignSettings;
import com.google.ads.googleads.v18.resources.CampaignBudget;
import com.google.ads.googleads.v18.services.AdGroupAdOperation;
import com.google.ads.googleads.v18.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v18.services.AdGroupOperation;
import com.google.ads.googleads.v18.services.AdGroupServiceClient;
import com.google.ads.googleads.v18.services.CampaignBudgetOperation;
import com.google.ads.googleads.v18.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v18.services.CampaignOperation;
import com.google.ads.googleads.v18.services.CampaignServiceClient;
import com.google.ads.googleads.v18.services.MutateAdGroupAdResult;
import com.google.ads.googleads.v18.services.MutateAdGroupResult;
import com.google.ads.googleads.v18.services.MutateCampaignBudgetsResponse;
import com.google.ads.googleads.v18.services.MutateCampaignResult;
import com.google.ads.googleads.v18.services.MutateCampaignsResponse;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;

/**
 * Creates a Things to do campaign, an ad group and a Things to do ad.
 *
 * <p>Prerequisite: You need to have an access to the Things to Do Center. The integration
 * instructions can be found at: https://support.google.com/google-ads/answer/13387362.
 */
public class AddThingsToDoAd {

  private static class AddThingsToDoAdParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.THINGS_TO_DO_CENTER_ACCOUNT_ID, required = true)
    private Long thingsToDoCenterAccountId;
  }

  public static void main(String[] args) {
    AddThingsToDoAdParams params = new AddThingsToDoAdParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.thingsToDoCenterAccountId =
          Long.parseLong("INSERT_THINGS_TO_DO_CENTER_ACCOUNT_ID_HERE");
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
      new AddThingsToDoAd()
          .runExample(googleAdsClient, params.customerId, params.thingsToDoCenterAccountId);
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
   * @param thingsToDoCenterAccountId the Things to Do Center account ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, long thingsToDoCenterAccountId) {

    // Creates a budget to be used by the campaign that will be created below.
    String budgetResourceName = addCampaignBudget(googleAdsClient, customerId);

    // Creates a Things to do campaign.
    String campaignResourceName =
        addThingsToDoCampaign(
            googleAdsClient, customerId, budgetResourceName, thingsToDoCenterAccountId);

    // Creates an ad group.
    String adGroupResourceName = addAdGroup(googleAdsClient, customerId, campaignResourceName);

    // Creates an ad group ad.
    addAddGroupAd(googleAdsClient, customerId, adGroupResourceName);
  }

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
            // Sets the amount of the budget.
            .setAmountMicros(5_000_000)
            // Makes the budget explicitly shared. You cannot set it to false for Things to do
            // campaigns.
            .setExplicitlyShared(true)
            .build();

    // Creates a campaign budget operation.
    CampaignBudgetOperation op = CampaignBudgetOperation.newBuilder().setCreate(budget).build();

    // Issues a mutate request.
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
   * Creates a new Things to do campaign in the specified client account.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param budgetResourceName the resource name of the budget for the campaign.
   * @param thingsToDoCenterAccountId the Things to Do Center account ID.
   * @return resource name of the newly created campaign.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START add_things_to_do_ad]
  private String addThingsToDoCampaign(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String budgetResourceName,
      long thingsToDoCenterAccountId) {
    // [START add_things_to_do_ad_1]
    // Creates the campaign.
    Campaign campaign =
        Campaign.newBuilder()
            .setName("Interplanetary Cruise #" + getPrintableDateTime())
            // Configures settings related to Things to do campaigns including advertising channel
            // type, advertising channel sub type and travel campaign settings.
            .setAdvertisingChannelType(AdvertisingChannelType.TRAVEL)
            .setAdvertisingChannelSubType(AdvertisingChannelSubType.TRAVEL_ACTIVITIES)
            .setTravelCampaignSettings(
                TravelCampaignSettings.newBuilder().setTravelAccountId(thingsToDoCenterAccountId))
            // Recommendation: Sets the campaign to PAUSED when creating it to prevent
            // the ads from immediately serving. Set to ENABLED once you've added
            // targeting and the ads are ready to serve
            .setStatus(CampaignStatus.PAUSED)
            // Sets the bidding strategy to MaximizeConversionValue. Only this type can be used
            // for Things to do campaigns.
            .setMaximizeConversionValue(MaximizeConversionValue.newBuilder())
            // Sets the budget.
            .setCampaignBudget(budgetResourceName)
            // Configures the campaign network options. Only Google Search is allowed for
            // Things to do campaigns.
            .setNetworkSettings(NetworkSettings.newBuilder().setTargetGoogleSearch(true))
            .build();
    // [END add_things_to_do_ad_1]

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
          "Added a Things to do campaign with resource name: '%s'%n", result.getResourceName());
      return result.getResourceName();
    }
  }
  // [END add_things_to_do_ad]

  /**
   * Creates a new ad group in the specified Things to do campaign.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignResourceName the resource name of the campaign that the new ad group will belong
   *     to.
   * @return resource name of the newly created ad group.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START add_things_to_do_ad_2]
  private String addAdGroup(
      GoogleAdsClient googleAdsClient, long customerId, String campaignResourceName) {
    // Creates an ad group.
    AdGroup adGroup =
        AdGroup.newBuilder()
            .setName("Earth to Mars Cruises #" + getPrintableDateTime())
            .setCampaign(campaignResourceName)
            // Sets the ad group type to TRAVEL_ADS. This cannot be set to other types.
            .setType(AdGroupType.TRAVEL_ADS)
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
          "Added an ad group with resource name: '%s'%n", mutateAdGroupResult.getResourceName());
      return mutateAdGroupResult.getResourceName();
    }
  }
  // [END add_things_to_do_ad_2]

  /**
   * Creates a new ad group ad in the specified ad group.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupResourceName the resource name of the ad group that the new ad group ad will
   *     belong to.
   * @return resource name of the newly created ad group ad.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START add_things_to_do_ad_3]
  private String addAddGroupAd(
      GoogleAdsClient googleAdsClient, long customerId, String adGroupResourceName) {
    // Creates a new travel ad.
    Ad ad = Ad.newBuilder().setTravelAd(TravelAdInfo.newBuilder()).build();
    // Creates a new ad group ad and sets its ad to the travel ad.
    AdGroupAd adGroupAd =
        AdGroupAd.newBuilder()
            // Sets the ad to the ad created above.
            .setAd(ad)
            // Set the ad group ad to enabled. Setting this to paused will cause an error for
            // Things to do campaigns. Pausing should happen at either the ad group or campaign
            // level.
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
          "Added an ad group ad with resource name: '%s'%n",
          mutateAdGroupAdResult.getResourceName());
      return mutateAdGroupAdResult.getResourceName();
    }
  }
  // [END add_things_to_do_ad_3]
}

// Copyright 2020 Google LLC
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
import static com.google.ads.googleads.v22.enums.EuPoliticalAdvertisingStatusEnum.EuPoliticalAdvertisingStatus.DOES_NOT_CONTAIN_EU_POLITICAL_ADVERTISING;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v22.common.AdTextAsset;
import com.google.ads.googleads.v22.common.AppAdInfo;
import com.google.ads.googleads.v22.common.LanguageInfo;
import com.google.ads.googleads.v22.common.LocationInfo;
import com.google.ads.googleads.v22.common.TargetCpa;
import com.google.ads.googleads.v22.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v22.enums.AdGroupStatusEnum.AdGroupStatus;
import com.google.ads.googleads.v22.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType;
import com.google.ads.googleads.v22.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v22.enums.AppCampaignAppStoreEnum.AppCampaignAppStore;
import com.google.ads.googleads.v22.enums.AppCampaignBiddingStrategyGoalTypeEnum.AppCampaignBiddingStrategyGoalType;
import com.google.ads.googleads.v22.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v22.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v22.errors.GoogleAdsError;
import com.google.ads.googleads.v22.errors.GoogleAdsException;
import com.google.ads.googleads.v22.resources.Ad;
import com.google.ads.googleads.v22.resources.AdGroup;
import com.google.ads.googleads.v22.resources.AdGroupAd;
import com.google.ads.googleads.v22.resources.Campaign;
import com.google.ads.googleads.v22.resources.Campaign.AppCampaignSetting;
import com.google.ads.googleads.v22.resources.CampaignBudget;
import com.google.ads.googleads.v22.resources.CampaignCriterion;
import com.google.ads.googleads.v22.services.AdGroupAdOperation;
import com.google.ads.googleads.v22.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v22.services.AdGroupOperation;
import com.google.ads.googleads.v22.services.AdGroupServiceClient;
import com.google.ads.googleads.v22.services.CampaignBudgetOperation;
import com.google.ads.googleads.v22.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v22.services.CampaignCriterionOperation;
import com.google.ads.googleads.v22.services.CampaignCriterionServiceClient;
import com.google.ads.googleads.v22.services.CampaignOperation;
import com.google.ads.googleads.v22.services.CampaignServiceClient;
import com.google.ads.googleads.v22.services.MutateAdGroupAdsResponse;
import com.google.ads.googleads.v22.services.MutateAdGroupsResponse;
import com.google.ads.googleads.v22.services.MutateCampaignBudgetsResponse;
import com.google.ads.googleads.v22.services.MutateCampaignCriteriaResponse;
import com.google.ads.googleads.v22.services.MutateCampaignCriterionResult;
import com.google.ads.googleads.v22.services.MutateCampaignsResponse;
import com.google.ads.googleads.v22.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTime;

/** Adds a new App Campaign. */
public class AddAppCampaign {
  private static class AddAppCampaignParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    AddAppCampaignParams params = new AddAppCampaignParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
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
      new AddAppCampaign().runExample(googleAdsClient, params.customerId);
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

  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates a budget for the campaign.
    String budgetResourceName = createBudget(googleAdsClient, customerId);

    // Creates the campaign.
    String campaignResourceName = createCampaign(googleAdsClient, customerId, budgetResourceName);

    // Sets campaign targeting.
    setCampaignTargetingCriteria(googleAdsClient, customerId, campaignResourceName);

    // Creates an ad group.
    String adGroupResourceName = createAdGroup(googleAdsClient, customerId, campaignResourceName);

    // Creates ad App ad.
    createAppAd(googleAdsClient, customerId, adGroupResourceName);
  }

  /**
   * Creates a budget under the given customer ID.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the customer ID.
   * @return the resource name of the newly created campaign budget.
   */
  private String createBudget(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates a campaign budget.
    CampaignBudget campaignBudget =
        CampaignBudget.newBuilder()
            .setName("Interplanetary Cruise #" + getPrintableDateTime())
            .setAmountMicros(50_000_000)
            .setDeliveryMethod(BudgetDeliveryMethod.STANDARD)
            // An App campaign cannot use a shared campaign budget.
            // explicitly_shared must be set to false.
            .setExplicitlyShared(false)
            .build();

    // Creates a campaign budget operation.
    CampaignBudgetOperation operation =
        CampaignBudgetOperation.newBuilder().setCreate(campaignBudget).build();

    // Creates the campaign budget service client.
    try (CampaignBudgetServiceClient campaignBudgetServiceClient =
        googleAdsClient.getLatestVersion().createCampaignBudgetServiceClient()) {
      // Adds the campaign budget.
      MutateCampaignBudgetsResponse response =
          campaignBudgetServiceClient.mutateCampaignBudgets(
              Long.toString(customerId), ImmutableList.of(operation));
      // Prints and returns the resource name.
      String budgetResourceName = response.getResults(0).getResourceName();
      System.out.printf("Created campaign budget with resource name '%s'.%n", budgetResourceName);
      return budgetResourceName;
    }
  }

  /**
   * Creates an App campaign under the given customer ID.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the customer ID.
   * @param budgetResourceName the resource name of the budget to associate with the campaign.
   * @return the resource name of the newly created App campaign.
   */
  private String createCampaign(
      GoogleAdsClient googleAdsClient, long customerId, String budgetResourceName) {
    // Creates a campaign.
    Campaign campaign =
        Campaign.newBuilder()
            .setName("Interplanetary Cruise App #" + getPrintableDateTime())
            .setCampaignBudget(budgetResourceName)
            // Recommendation: Set the campaign to PAUSED when creating it to prevent
            // the ads from immediately serving. Set to ENABLED once you've added
            // targeting and the ads are ready to serve.
            .setStatus(CampaignStatus.PAUSED)
            // All App campaigns have an advertising_channel_type of
            // MULTI_CHANNEL to reflect the fact that ads from these campaigns are
            // eligible to appear on multiple channels.
            .setAdvertisingChannelType(AdvertisingChannelType.MULTI_CHANNEL)
            .setAdvertisingChannelSubType(AdvertisingChannelSubType.APP_CAMPAIGN)
            // Sets the target CPA to $1 / app install.
            //
            // campaign_bidding_strategy is a 'oneof' message so setting target_cpa
            // is mutually exclusive with other bidding strategies such as
            // manual_cpc, commission, maximize_conversions, etc.
            // See https://developers.google.com/google-ads/api/reference/rpc
            // under current version / resources / Campaign.
            .setTargetCpa(TargetCpa.newBuilder().setTargetCpaMicros(1000000).build())
            // Sets the App campaign settings.
            .setAppCampaignSetting(
                AppCampaignSetting.newBuilder()
                    .setAppId("com.google.android.apps.adwords")
                    .setAppStore(AppCampaignAppStore.GOOGLE_APP_STORE)
                    // Optional: Optimize this campaign for getting new users for your app.
                    .setBiddingStrategyGoalType(
                        AppCampaignBiddingStrategyGoalType.OPTIMIZE_INSTALLS_TARGET_INSTALL_COST)
                    .build())
            // Declares whether this campaign serves political ads targeting the EU.
            .setContainsEuPoliticalAdvertising(DOES_NOT_CONTAIN_EU_POLITICAL_ADVERTISING)
            // Optional fields.
            .setStartDate(new DateTime().plusDays(1).toString("yyyyMMdd"))
            .setEndDate(new DateTime().plusDays(365).toString("yyyyMMdd"))
            // If you select the
            // OPTIMIZE_IN_APP_CONVERSIONS_TARGET_INSTALL_COST goal type, then also
            // specify your in-app conversion types so the Google Ads API can focus
            // your campaign on people who are most likely to complete the
            // corresponding in-app actions.
            // .setSelectiveOptimization(SelectiveOptimization.newBuilder()
            //     .addConversionActions("INSERT_CONVERSION_TYPE_ID_HERE")
            //     .build())
            .build();

    // Creates a campaign operation.
    CampaignOperation operation = CampaignOperation.newBuilder().setCreate(campaign).build();

    // Create a campaign service client.
    try (CampaignServiceClient campaignServiceClient =
        googleAdsClient.getLatestVersion().createCampaignServiceClient()) {
      // Adds the campaign.
      MutateCampaignsResponse response =
          campaignServiceClient.mutateCampaigns(
              Long.toString(customerId), ImmutableList.of(operation));
      // Prints and returns the campaign resource name.
      String campaignResourceName = response.getResults(0).getResourceName();
      System.out.printf("Created App campaign with resource name '%s'.%n", campaignResourceName);
      return campaignResourceName;
    }
  }

  /**
   * Sets campaign targeting criteria for a given campaign.
   *
   * <p>Both location and language targeting are illustrated.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the customer ID.
   * @param campaignResourceName the resource name of the campaign to apply targeting to.
   */
  private void setCampaignTargetingCriteria(
      GoogleAdsClient googleAdsClient, long customerId, String campaignResourceName) {
    List<CampaignCriterionOperation> operations = new ArrayList<>();

    // Creates the location campaign criteria.
    // Besides using location_id, you can also search by location names from
    // GeoTargetConstantService.suggestGeoTargetConstants() and directly
    // apply GeoTargetConstant.resource_name here. An example can be found
    // in GetGeoTargetConstantByNames.java.
    List<Integer> locationIds =
        Arrays.asList(
            21137, // California
            2484 // Mexico
            );

    for (int locationId : locationIds) {
      // Creates a campaign criterion.
      CampaignCriterion campaignCriterion =
          CampaignCriterion.newBuilder()
              .setCampaign(campaignResourceName)
              .setLocation(
                  LocationInfo.newBuilder()
                      .setGeoTargetConstant(ResourceNames.geoTargetConstant(locationId))
                      .build())
              .build();

      // Creates a campaign criterion operation.
      CampaignCriterionOperation operation =
          CampaignCriterionOperation.newBuilder().setCreate(campaignCriterion).build();

      operations.add(operation);
    }

    // Creates the language campaign criteria.
    List<Integer> languageIds =
        Arrays.asList(
            1000, // English
            1003 // Spanish
            );

    for (int languageId : languageIds) {
      // Creates a campaign criterion.
      CampaignCriterion campaignCriterion =
          CampaignCriterion.newBuilder()
              .setCampaign(campaignResourceName)
              .setLanguage(
                  LanguageInfo.newBuilder()
                      .setLanguageConstant(ResourceNames.languageConstant(languageId))
                      .build())
              .build();

      // Creates a campaign criterion operation.
      CampaignCriterionOperation operation =
          CampaignCriterionOperation.newBuilder().setCreate(campaignCriterion).build();

      operations.add(operation);
    }

    // Creates the campaign criterion service client.
    try (CampaignCriterionServiceClient campaignCriterionServiceClient =
        googleAdsClient.getLatestVersion().createCampaignCriterionServiceClient()) {
      // Submits the criteria operations and prints their information.
      MutateCampaignCriteriaResponse response =
          campaignCriterionServiceClient.mutateCampaignCriteria(
              Long.toString(customerId), operations);
      System.out.printf(
          "Created %d campaign criteria with resource names:%n", response.getResultsCount());
      for (MutateCampaignCriterionResult result : response.getResultsList()) {
        System.out.println(result.getResourceName());
      }
    }
  }

  /**
   * Creates an ad group for a given campaign
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the customer ID.
   * @param campaignResourceName resource name of the campaign to add the ad group to.
   * @return the resource name of the newly created ad group.
   */
  private String createAdGroup(
      GoogleAdsClient googleAdsClient, long customerId, String campaignResourceName) {
    // Creates an ad group.
    // Note that the ad group type must not be set.
    // Since the advertising_channel_sub_type is APP_CAMPAIGN,
    //   1. you cannot override bid settings at the ad group level.
    //   2. you cannot add ad group criteria.
    AdGroup adGroup =
        AdGroup.newBuilder()
            .setName("Earth to Mars cruises #" + getPrintableDateTime())
            .setStatus(AdGroupStatus.ENABLED)
            .setCampaign(campaignResourceName)
            .build();

    // Creates an ad group operation.
    AdGroupOperation operation = AdGroupOperation.newBuilder().setCreate(adGroup).build();

    // Creates the ad group service client.
    try (AdGroupServiceClient adGroupServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupServiceClient()) {
      // Submits the ad group operation to add the ad group and prints the results.
      MutateAdGroupsResponse response =
          adGroupServiceClient.mutateAdGroups(
              Long.toString(customerId), ImmutableList.of(operation));
      // Prints and returns the ad group resource name.
      String adGroupResourceName = response.getResults(0).getResourceName();
      System.out.printf("Created an ad group with resource name '%s'.%n", adGroupResourceName);
      return adGroupResourceName;
    }
  }

  /**
   * Creates an App ad for a given ad group
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the customer ID.
   * @param adGroupResourceName the resource name of the ad group to add the App ad to.
   */
  private void createAppAd(
      GoogleAdsClient googleAdsClient, long customerId, String adGroupResourceName) {
    // Creates an ad group ad.
    AdGroupAd adGroupAd =
        AdGroupAd.newBuilder()
            .setStatus(AdGroupAdStatus.ENABLED)
            .setAdGroup(adGroupResourceName)
            .setAd(
                // ad_data is a 'oneof' message so setting app_ad
                // is mutually exclusive with ad data fields such as
                // text_ad, gmail_ad, etc.
                Ad.newBuilder()
                    .setAppAd(
                        AppAdInfo.newBuilder()
                            .addAllHeadlines(
                                ImmutableList.of(
                                    AdTextAsset.newBuilder().setText("A cool puzzle game").build(),
                                    AdTextAsset.newBuilder()
                                        .setText("Remove connected blocks")
                                        .build()))
                            .addAllDescriptions(
                                ImmutableList.of(
                                    AdTextAsset.newBuilder().setText("3 difficulty levels").build(),
                                    AdTextAsset.newBuilder()
                                        .setText("4 colorful fun skins")
                                        .build()))
                            // Optional: You can set up to 20 image assets for your campaign.
                            // .addAllImages(
                            //     ImmutableList.of(
                            //         AdImageAsset.newBuilder()
                            //             .setAsset("INSERT_AD_IMAGE_ASSET_ID")
                            //             .build()))
                            .build())
                    .build())
            .build();

    // Creates an ad group ad operation.
    AdGroupAdOperation operation = AdGroupAdOperation.newBuilder().setCreate(adGroupAd).build();

    // Creates the ad group ad service client.
    try (AdGroupAdServiceClient adGroupAdServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupAdServiceClient()) {
      // Submits the ad group ad operation to add the ad group ad and prints the results.
      MutateAdGroupAdsResponse response =
          adGroupAdServiceClient.mutateAdGroupAds(
              Long.toString(customerId), ImmutableList.of(operation));
      System.out.printf(
          "Created an ad group ad with ad with resource name '%s'%n",
          response.getResults(0).getResourceName());
    }
  }
}

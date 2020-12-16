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

package com.google.ads.googleads.examples.shoppingads;

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v6.common.ListingGroupInfo;
import com.google.ads.googleads.v6.common.MaximizeConversionValue;
import com.google.ads.googleads.v6.common.ShoppingSmartAdInfo;
import com.google.ads.googleads.v6.enums.AdGroupCriterionStatusEnum.AdGroupCriterionStatus;
import com.google.ads.googleads.v6.enums.AdGroupStatusEnum.AdGroupStatus;
import com.google.ads.googleads.v6.enums.AdGroupTypeEnum.AdGroupType;
import com.google.ads.googleads.v6.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType;
import com.google.ads.googleads.v6.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v6.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v6.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v6.enums.ListingGroupTypeEnum.ListingGroupType;
import com.google.ads.googleads.v6.errors.GoogleAdsError;
import com.google.ads.googleads.v6.errors.GoogleAdsException;
import com.google.ads.googleads.v6.resources.Ad;
import com.google.ads.googleads.v6.resources.AdGroup;
import com.google.ads.googleads.v6.resources.AdGroupAd;
import com.google.ads.googleads.v6.resources.AdGroupCriterion;
import com.google.ads.googleads.v6.resources.Campaign;
import com.google.ads.googleads.v6.resources.Campaign.ShoppingSetting;
import com.google.ads.googleads.v6.resources.CampaignBudget;
import com.google.ads.googleads.v6.services.AdGroupAdOperation;
import com.google.ads.googleads.v6.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v6.services.AdGroupCriterionOperation;
import com.google.ads.googleads.v6.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v6.services.AdGroupOperation;
import com.google.ads.googleads.v6.services.AdGroupServiceClient;
import com.google.ads.googleads.v6.services.CampaignBudgetOperation;
import com.google.ads.googleads.v6.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v6.services.CampaignOperation;
import com.google.ads.googleads.v6.services.CampaignServiceClient;
import com.google.ads.googleads.v6.services.MutateAdGroupAdResult;
import com.google.ads.googleads.v6.services.MutateAdGroupCriterionResult;
import com.google.ads.googleads.v6.services.MutateAdGroupResult;
import com.google.ads.googleads.v6.services.MutateCampaignBudgetsResponse;
import com.google.ads.googleads.v6.services.MutateCampaignResult;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;

/**
 * Creates a Smart Shopping campaign, a Smart Shopping ad group, a Smart Shopping ad group ad and a
 * listing group for "All products".
 *
 * <p>Prerequisite: You need to have access to a Merchant Center account. You can find instructions
 * to create a Merchant Center account here: https://support.google.com/merchants/answer/188924.
 * This account must be linked to your Google Ads account. The integration instructions can be found
 * at: https://developers.google.com/adwords/shopping/full-automation/articles/t15.
 */
public class AddShoppingSmartAd {

  private static class AddShoppingSmartAdParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.MERCHANT_CENTER_ACCOUNT_ID, required = true)
    private Long merchantCenterAccountId;

    @Parameter(names = ArgumentNames.CREATE_DEFAULT_LISTING_GROUP, required = true, arity = 1)
    private Boolean createDefaultListingGroup;
  }

  public static void main(String[] args) {
    AddShoppingSmartAdParams params = new AddShoppingSmartAdParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.merchantCenterAccountId = Long.parseLong("INSERT_MERCHANT_CENTER_ACCOUNT_ID_HERE");
      params.createDefaultListingGroup =
          Boolean.parseBoolean("INSERT_CREATE_DEFAULT_LISTING_GROUP_HERE");
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
      new AddShoppingSmartAd()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.merchantCenterAccountId,
              params.createDefaultListingGroup);
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
   * @param merchantCenterAccountId the Merchant Center account ID.
   * @param createDefaultListingGroup the boolean to indicate if a default listing group should be
   *     created for the ad group. Set to false if the listing group will be constructed elsewhere.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long merchantCenterAccountId,
      boolean createDefaultListingGroup) {

    // Creates a budget to be used by the campaign that will be created below.
    String budgetResourceName = addCampaignBudget(googleAdsClient, customerId);

    // Creates a Smart Shopping campaign.
    String campaignResourceName =
        addSmartShoppingCampaign(
            googleAdsClient, customerId, budgetResourceName, merchantCenterAccountId);

    // Creates a Smart Shopping ad group.
    String adGroupResourceName =
        addSmartShoppingAdGroup(googleAdsClient, customerId, campaignResourceName);

    // Creates a Smart Shopping ad group ad.
    addSmartShoppingAdGroupAd(googleAdsClient, customerId, adGroupResourceName);

    if (createDefaultListingGroup) {
      // A product group is a subset of inventory. Listing groups are the equivalent of product
      // groups in the API and allow you to bid on the chosen group or exclude a group from bidding.
      // This method creates an ad group criterion containing a listing group.
      addShoppingListingGroup(googleAdsClient, customerId, adGroupResourceName);
    }
  }

  /**
   * Creates a new campaign budget for Smart Shopping ads in the specified client account.
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
            // The budget is specified in the local currency of the account.
            // The amount should be specified in micros, where one million is equivalent to one
            // unit.
            .setAmountMicros(5_000_000L)
            // Budgets for Smart Shopping campaigns cannot be shared.
            .setExplicitlyShared(false)
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
   * Creates a new shopping campaign for Smart Shopping ads in the specified client account.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param budgetResourceName the resource name of the budget for the campaign.
   * @param merchantCenterAccountId the Merchant Center account ID.
   * @return resource name of the newly created campaign.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START AddShoppingSmartAd_3]
  private String addSmartShoppingCampaign(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String budgetResourceName,
      long merchantCenterAccountId) {

    // Configures the shopping settings for Smart Shopping campaigns.
    ShoppingSetting shoppingSetting =
        ShoppingSetting.newBuilder()
            // Sets the sales country of products to include in the campaign.
            // Only products from Merchant Center targeting this country will appear in the
            // campaign.
            .setSalesCountry("US")
            .setMerchantId(merchantCenterAccountId)
            .build();

    // [START AddShoppingSmartAd]
    // Creates the campaign.
    Campaign campaign =
        Campaign.newBuilder()
            .setName("Interplanetary Cruise #" + getPrintableDateTime())
            // Configures settings related to shopping campaigns including advertising channel type,
            // advertising sub-type and shopping setting.
            .setAdvertisingChannelType(AdvertisingChannelType.SHOPPING)
            .setAdvertisingChannelSubType(AdvertisingChannelSubType.SHOPPING_SMART_ADS)
            .setShoppingSetting(shoppingSetting)
            // Recommendation: Sets the campaign to PAUSED when creating it to prevent
            // the ads from immediately serving. Set to ENABLED once you've added
            // targeting and the ads are ready to serve.
            .setStatus(CampaignStatus.PAUSED)
            // Bidding strategy must be set directly on the campaign.
            // Setting a portfolio bidding strategy by resourceName is not supported.
            // Maximize conversion value is the only strategy supported for Smart Shopping
            // campaigns.
            // An optional ROAS (Return on Advertising Spend) can be set for
            // MaximizeConversionValue.
            // The ROAS value must be specified as a ratio in the API. It is calculated by dividing
            // "total value" by "total spend".
            // For more information on maximize conversion value, see the support article:
            // http://support.google.com/google-ads/answer/7684216)
            .setMaximizeConversionValue(
                MaximizeConversionValue.newBuilder().setTargetRoas(3.5).build())
            // Sets the budget.
            .setCampaignBudget(budgetResourceName)
            .build();
    // [END AddShoppingSmartAd]

    // Creates a campaign operation.
    CampaignOperation operation = CampaignOperation.newBuilder().setCreate(campaign).build();

    // Issues a mutate request to add the campaign.
    try (CampaignServiceClient campaignServiceClient =
        googleAdsClient.getLatestVersion().createCampaignServiceClient()) {
      MutateCampaignResult result =
          campaignServiceClient
              .mutateCampaigns(Long.toString(customerId), Collections.singletonList(operation))
              .getResults(0);
      System.out.printf(
          "Added a Smart Shopping campaign with resource name: '%s'%n", result.getResourceName());
      return result.getResourceName();
    }
  }
  // [END AddShoppingSmartAd_3]

  /**
   * Creates a new ad group in the specified Smart Shopping campaign.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignResourceName the resource name of the campaign that the new ad group will belong
   *     to.
   * @return resource name of the newly created ad group.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START AddShoppingSmartAd_2]
  private String addSmartShoppingAdGroup(
      GoogleAdsClient googleAdsClient, long customerId, String campaignResourceName) {
    // Creates an ad group.
    AdGroup adGroup =
        AdGroup.newBuilder()
            .setName("Earth to Mars Cruises #" + getPrintableDateTime())
            .setCampaign(campaignResourceName)
            // Sets the ad group type to SHOPPING_SMART_ADS. This cannot be set to other types.
            .setType(AdGroupType.SHOPPING_SMART_ADS)
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
          "Added a Smart Shopping ad group with resource name: '%s'%n",
          mutateAdGroupResult.getResourceName());
      return mutateAdGroupResult.getResourceName();
    }
  }
  // [END AddShoppingSmartAd_2]

  /**
   * Creates a new ad group ad in the specified Smart Shopping ad group.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupResourceName the resource name of the ad group that the new ad group ad will
   *     belong to.
   * @return resource name of the newly created ad group ad.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START AddShoppingSmartAd_1]
  private String addSmartShoppingAdGroupAd(
      GoogleAdsClient googleAdsClient, long customerId, String adGroupResourceName) {
    // Creates a new Smart Shopping ad.
    Ad ad = Ad.newBuilder().setShoppingSmartAd(ShoppingSmartAdInfo.newBuilder().build()).build();
    // Creates a new ad group ad and sets the Smart Shopping ad to it.
    AdGroupAd adGroupAd =
        AdGroupAd.newBuilder()
            // Sets the ad to the ad created above.
            .setAd(ad)
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
          "Added a Smart Shopping ad group ad with resource name: '%s'%n",
          mutateAdGroupAdResult.getResourceName());
      return mutateAdGroupAdResult.getResourceName();
    }
  }
  // [END AddShoppingSmartAd_1]

  /**
   * Creates a new Shopping listing group for the specified ad group. This is known as a "product
   * group" in the Google Ads user interface. The listing group will be added to the ad group using
   * an "ad group criterion". For more information on listing groups see the Google Ads API Shopping
   * guide: https://developers.google.com/google-ads/api/docs/shopping-ads/overview
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupResourceName the resource name of the ad group that the new listing group will
   *     belong to.
   * @return resource name of the newly created ad group criterion containing the listing group.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private String addShoppingListingGroup(
      GoogleAdsClient googleAdsClient, long customerId, String adGroupResourceName) {
    // Creates a new ad group criterion. This will contain a listing group.
    // This will be the listing group for 'All products' and will contain a single root node.
    AdGroupCriterion adGroupCriterion =
        AdGroupCriterion.newBuilder()
            .setAdGroup(adGroupResourceName)
            .setStatus(AdGroupCriterionStatus.ENABLED)
            // Creates a new listing group. This will be the top level listing group (root node)
            // Set the type of the listing group to be a unit.
            .setListingGroup(ListingGroupInfo.newBuilder().setType(ListingGroupType.UNIT).build())
            // Note: Listing groups do not require bids for Smart Shopping campaigns.
            .build();

    AdGroupCriterionOperation operation =
        AdGroupCriterionOperation.newBuilder().setCreate(adGroupCriterion).build();

    try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupCriterionServiceClient()) {
      MutateAdGroupCriterionResult mutateAdGroupCriteriaResult =
          adGroupCriterionServiceClient
              .mutateAdGroupCriteria(
                  Long.toString(customerId), Collections.singletonList(operation))
              .getResults(0);
      System.out.printf(
          "Added an ad group criterion containing a listing group with resource name: '%s'%n",
          mutateAdGroupCriteriaResult.getResourceName());
      return mutateAdGroupCriteriaResult.getResourceName();
    }
  }
}

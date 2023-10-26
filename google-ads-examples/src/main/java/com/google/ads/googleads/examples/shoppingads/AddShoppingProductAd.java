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
import com.google.ads.googleads.v15.common.ListingGroupInfo;
import com.google.ads.googleads.v15.common.ManualCpc;
import com.google.ads.googleads.v15.common.ShoppingProductAdInfo;
import com.google.ads.googleads.v15.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v15.enums.AdGroupCriterionStatusEnum.AdGroupCriterionStatus;
import com.google.ads.googleads.v15.enums.AdGroupStatusEnum.AdGroupStatus;
import com.google.ads.googleads.v15.enums.AdGroupTypeEnum.AdGroupType;
import com.google.ads.googleads.v15.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v15.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v15.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v15.enums.ListingGroupTypeEnum.ListingGroupType;
import com.google.ads.googleads.v15.errors.GoogleAdsError;
import com.google.ads.googleads.v15.errors.GoogleAdsException;
import com.google.ads.googleads.v15.resources.Ad;
import com.google.ads.googleads.v15.resources.AdGroup;
import com.google.ads.googleads.v15.resources.AdGroupAd;
import com.google.ads.googleads.v15.resources.AdGroupCriterion;
import com.google.ads.googleads.v15.resources.Campaign;
import com.google.ads.googleads.v15.resources.Campaign.ShoppingSetting;
import com.google.ads.googleads.v15.resources.CampaignBudget;
import com.google.ads.googleads.v15.services.AdGroupAdOperation;
import com.google.ads.googleads.v15.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v15.services.AdGroupCriterionOperation;
import com.google.ads.googleads.v15.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v15.services.AdGroupOperation;
import com.google.ads.googleads.v15.services.AdGroupServiceClient;
import com.google.ads.googleads.v15.services.CampaignBudgetOperation;
import com.google.ads.googleads.v15.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v15.services.CampaignOperation;
import com.google.ads.googleads.v15.services.CampaignServiceClient;
import com.google.ads.googleads.v15.services.MutateAdGroupAdResult;
import com.google.ads.googleads.v15.services.MutateAdGroupCriterionResult;
import com.google.ads.googleads.v15.services.MutateAdGroupResult;
import com.google.ads.googleads.v15.services.MutateCampaignBudgetsResponse;
import com.google.ads.googleads.v15.services.MutateCampaignResult;
import com.google.ads.googleads.v15.services.MutateCampaignsResponse;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;

/**
 * Creates a standard shopping campaign, a shopping product ad group and a shopping product ad.
 *
 * <p>Prerequisite: You need to have access to a Merchant Center account. You can find instructions
 * to create a Merchant Center account here: https://support.google.com/merchants/answer/188924.
 * This account must be linked to your Google Ads account.
 */
public class AddShoppingProductAd {

  private static class AddShoppingProductAdParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.MERCHANT_CENTER_ACCOUNT_ID, required = true)
    private Long merchantCenterAccountId;

    @Parameter(names = ArgumentNames.CREATE_DEFAULT_LISTING_GROUP, required = true, arity = 1)
    private Boolean createDefaultListingGroup;
  }

  public static void main(String[] args) {
    AddShoppingProductAdParams params = new AddShoppingProductAdParams();
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
      new AddShoppingProductAd()
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
   *     See AddShoppingProductListingGroupTree for a more comprehensive example.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long merchantCenterAccountId,
      boolean createDefaultListingGroup) {

    // Creates a budget to be used by the campaign that will be created below.
    String budgetResourceName = addCampaignBudget(googleAdsClient, customerId);

    // Creates a standard shopping campaign.
    String campaignResourceName =
        addStandardShoppingCampaign(
            googleAdsClient, customerId, budgetResourceName, merchantCenterAccountId);

    // Creates a shopping product ad group.
    String adGroupResourceName =
        addShoppingProductAdGroup(googleAdsClient, customerId, campaignResourceName);

    // Creates a shopping product ad group ad.
    addShoppingProductAdGroupAd(googleAdsClient, customerId, adGroupResourceName);

    if (createDefaultListingGroup) {
      // Creates an ad group criterion containing a listing group.
      // This will be the listing group tree for 'All products' and will contain a single biddable
      // unit node.
      addDefaultShoppingListingGroup(googleAdsClient, customerId, adGroupResourceName);
    }
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
            .setAmountMicros(5_000_000L)
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
   * Creates a new standard shopping campaign in the specified client account.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param budgetResourceName the resource name of the budget for the campaign.
   * @param merchantCenterAccountId the Merchant Center account ID.
   * @return resource name of the newly created campaign.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START add_shopping_product_ad_2]
  private String addStandardShoppingCampaign(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String budgetResourceName,
      long merchantCenterAccountId) {

    // Configures the shopping settings.
    ShoppingSetting shoppingSetting =
        ShoppingSetting.newBuilder()
            // Sets the priority of the campaign. Higher numbers take priority over lower numbers.
            // For Shopping product ad campaigns, allowed values are between 0 and 2, inclusive.
            .setCampaignPriority(0)
            .setMerchantId(merchantCenterAccountId)
            // Enables local inventory ads for this campaign.
            .setEnableLocal(true)
            .build();

    // Create the standard shopping campaign.
    Campaign campaign =
        Campaign.newBuilder()
            .setName("Interplanetary Cruise #" + getPrintableDateTime())
            // Configures settings related to shopping campaigns including advertising channel type
            // and shopping setting.
            .setAdvertisingChannelType(AdvertisingChannelType.SHOPPING)
            .setShoppingSetting(shoppingSetting)
            // Recommendation: Sets the campaign to PAUSED when creating it to prevent
            // the ads from immediately serving. Set to ENABLED once you've added
            // targeting and the ads are ready to serve.
            .setStatus(CampaignStatus.PAUSED)
            // Sets the bidding strategy to Manual CPC (with eCPC disabled). eCPC for standard
            // Shopping campaigns is deprecated. If eCPC is set to true, Google Ads ignores the
            // the setting and behaves as if the setting was false. See this blog post for more
            // information: https://ads-developers.googleblog.com/2023/09/google-ads-shopping-campaign-enhanced.html
            // Recommendation: Use one of the automated bidding strategies for Shopping campaigns
            // to help you optimize your advertising spend. More information can be found here:
            // https://support.google.com/google-ads/answer/6309029.
            .setManualCpc(ManualCpc.newBuilder().setEnhancedCpcEnabled(false).build())
            // Sets the budget.
            .setCampaignBudget(budgetResourceName)
            .build();

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
          "Added a standard shopping campaign with resource name: '%s'%n",
          result.getResourceName());
      return result.getResourceName();
    }
  }

  // [END add_shopping_product_ad_2]

  /**
   * Creates a new shopping product ad group in the specified campaign.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignResourceName the resource name of the shopping campaign that the new ad group
   *     will belong to.
   * @return resource name of the newly created ad group.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START add_shopping_product_ad_1]
  private String addShoppingProductAdGroup(
      GoogleAdsClient googleAdsClient, long customerId, String campaignResourceName) {
    // Creates an ad group.
    AdGroup adGroup =
        AdGroup.newBuilder()
            .setName("Earth to Mars Cruises #" + getPrintableDateTime())
            .setCampaign(campaignResourceName)
            // Sets the ad group type to SHOPPING_PRODUCT_ADS. This is the only value possible for
            // ad groups that contain shopping product ads.
            .setType(AdGroupType.SHOPPING_PRODUCT_ADS)
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
          "Added a product shopping ad group with resource name: '%s'%n",
          mutateAdGroupResult.getResourceName());
      return mutateAdGroupResult.getResourceName();
    }
  }

  // [END add_shopping_product_ad_1]

  /**
   * Creates a new shopping product ad group ad in the specified ad group.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupResourceName the resource name of the ad group that the new ad group ad will
   *     belong to.
   * @return resource name of the newly created ad group ad.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START add_shopping_product_ad]
  private String addShoppingProductAdGroupAd(
      GoogleAdsClient googleAdsClient, long customerId, String adGroupResourceName) {
    // Creates a new shopping product ad.
    Ad ad =
        Ad.newBuilder().setShoppingProductAd(ShoppingProductAdInfo.newBuilder().build()).build();
    // Creates a new ad group ad and sets the shopping product ad to it.
    AdGroupAd adGroupAd =
        AdGroupAd.newBuilder()
            // Sets the ad to the ad created above.
            .setAd(ad)
            .setStatus(AdGroupAdStatus.PAUSED)
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
          "Added a product shopping ad group ad with resource name: '%s'%n",
          mutateAdGroupAdResult.getResourceName());
      return mutateAdGroupAdResult.getResourceName();
    }
  }

  // [END add_shopping_product_ad]

  /**
   * Creates a new default shopping listing group for the specified ad group. A listing group is the
   * Google Ads API representation of a "product group" described in the Google Ads user interface.
   * The listing group will be added to the ad group using an "ad group criterion". The criterion
   * will contain the bid for a given listing group.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupResourceName the resource name of the ad group that the new listing group will
   *     belong to.
   * @return resource name of the newly created ad group criterion containing the listing group.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private String addDefaultShoppingListingGroup(
      GoogleAdsClient googleAdsClient, long customerId, String adGroupResourceName) {
    // Creates a new ad group criterion. This will contain the "default" listing group (All
    // products).
    AdGroupCriterion adGroupCriterion =
        AdGroupCriterion.newBuilder()
            .setAdGroup(adGroupResourceName)
            .setStatus(AdGroupCriterionStatus.ENABLED)
            // Creates a new listing group. This will be the top-level "root" node.
            // Sets the type of the listing group to be a biddable unit.
            .setListingGroup(ListingGroupInfo.newBuilder().setType(ListingGroupType.UNIT).build())
            // Sets the bid for products in this listing group unit.
            .setCpcBidMicros(500_000L)
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

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

package com.google.ads.googleads.examples.remarketing;

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v11.common.AdImageAsset;
import com.google.ads.googleads.v11.common.AdTextAsset;
import com.google.ads.googleads.v11.common.ImageAsset;
import com.google.ads.googleads.v11.common.ManualCpc;
import com.google.ads.googleads.v11.common.ResponsiveDisplayAdInfo;
import com.google.ads.googleads.v11.common.UserListInfo;
import com.google.ads.googleads.v11.enums.AdGroupStatusEnum.AdGroupStatus;
import com.google.ads.googleads.v11.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v11.enums.AssetTypeEnum.AssetType;
import com.google.ads.googleads.v11.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v11.enums.DisplayAdFormatSettingEnum.DisplayAdFormatSetting;
import com.google.ads.googleads.v11.errors.GoogleAdsError;
import com.google.ads.googleads.v11.errors.GoogleAdsException;
import com.google.ads.googleads.v11.resources.Ad;
import com.google.ads.googleads.v11.resources.AdGroup;
import com.google.ads.googleads.v11.resources.AdGroupAd;
import com.google.ads.googleads.v11.resources.AdGroupCriterion;
import com.google.ads.googleads.v11.resources.Asset;
import com.google.ads.googleads.v11.resources.Campaign;
import com.google.ads.googleads.v11.resources.Campaign.ShoppingSetting;
import com.google.ads.googleads.v11.services.AdGroupAdOperation;
import com.google.ads.googleads.v11.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v11.services.AdGroupCriterionOperation;
import com.google.ads.googleads.v11.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v11.services.AdGroupOperation;
import com.google.ads.googleads.v11.services.AdGroupServiceClient;
import com.google.ads.googleads.v11.services.AssetOperation;
import com.google.ads.googleads.v11.services.AssetServiceClient;
import com.google.ads.googleads.v11.services.CampaignOperation;
import com.google.ads.googleads.v11.services.CampaignServiceClient;
import com.google.ads.googleads.v11.services.MutateAdGroupAdsResponse;
import com.google.ads.googleads.v11.services.MutateAdGroupCriteriaResponse;
import com.google.ads.googleads.v11.services.MutateAdGroupsResponse;
import com.google.ads.googleads.v11.services.MutateAssetsResponse;
import com.google.ads.googleads.v11.services.MutateCampaignsResponse;
import com.google.ads.googleads.v11.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import com.google.common.io.ByteStreams;
import com.google.protobuf.ByteString;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

/**
 * Creates a shopping campaign associated with an existing merchant center account, along with a
 * related ad group and dynamic display ad, and targets a user list for remarketing purposes.
 */
public class AddMerchantCenterDynamicRemarketingCampaign {
  private static class AddMerchantCenterDynamicRemarketingCampaignParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private long customerId;

    @Parameter(names = ArgumentNames.MERCHANT_CENTER_ACCOUNT_ID, required = true)
    private long merchantCenterAccountId;

    @Parameter(names = ArgumentNames.CAMPAIGN_BUDGET_ID, required = true)
    private long campaignBudgetId;

    @Parameter(names = ArgumentNames.USER_LIST_ID, required = true)
    private long userListId;
  }

  public static void main(String[] args) throws IOException {
    AddMerchantCenterDynamicRemarketingCampaignParams params =
        new AddMerchantCenterDynamicRemarketingCampaignParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.merchantCenterAccountId = Long.parseLong("INSERT_MERCHANT_CENTER_ACCOUNT_ID_HERE");
      params.campaignBudgetId = Long.parseLong("INSERT_CAMPAIGN_BUDGET_ID_HERE");
      params.userListId = Long.parseLong("INSERT_USER_LIST_ID_HERE");
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
      new AddMerchantCenterDynamicRemarketingCampaign().runExample(googleAdsClient, params);
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
   * @param params the AddMerchantCenterDynamicRemarketingCampaignParams for the example.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, AddMerchantCenterDynamicRemarketingCampaignParams params)
      throws IOException {
    // Creates a shopping campaign associated with a given merchant center account.
    String campaignResourceName =
        createCampaign(
            googleAdsClient,
            params.customerId,
            params.merchantCenterAccountId,
            params.campaignBudgetId);
    // Creates an ad group for the campaign.
    String adGroupResourceName =
        createAdGroup(googleAdsClient, params.customerId, campaignResourceName);
    // Creates a dynamic display ad in the ad group.
    createAd(googleAdsClient, params.customerId, adGroupResourceName);
    // Targets a specific user list for remarketing.
    attachUserList(googleAdsClient, params.customerId, adGroupResourceName, params.userListId);
  }

  /**
   * Creates a campaign linked to a Merchant Center product feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param merchantCenterAccountId the Merchant Center account ID.
   * @param campaignBudgetId the campaign budget ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START add_merchant_center_dynamic_remarketing_campaign_2]
  private String createCampaign(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long merchantCenterAccountId,
      long campaignBudgetId) {
    String budgetResourceName = ResourceNames.campaignBudget(customerId, campaignBudgetId);

    // Creates the campaign.
    Campaign campaign =
        Campaign.newBuilder()
            .setName("Shopping campaign #" + getPrintableDateTime())
            // Dynamic remarketing campaigns are only available on the Google Display Network.
            .setAdvertisingChannelType(AdvertisingChannelType.DISPLAY)
            .setStatus(CampaignStatus.PAUSED)
            .setCampaignBudget(budgetResourceName)
            .setManualCpc(ManualCpc.newBuilder().build())
            // The settings for the shopping campaign.
            // This connects the campaign to the merchant center account.
            .setShoppingSetting(
                ShoppingSetting.newBuilder()
                    .setCampaignPriority(0)
                    .setMerchantId(merchantCenterAccountId)
                    // Display Network campaigns do not support partition by country. The only
                    // supported value is "ZZ". This signals that products from all countries are
                    // available in the campaign. The actual products which serve are based on
                    // the products tagged in the user list entry.
                    .setSalesCountry("ZZ")
                    .setEnableLocal(true)
                    .build())
            .build();

    // Creates the campaign operation.
    CampaignOperation operation = CampaignOperation.newBuilder().setCreate(campaign).build();

    // Creates the campaign service client.
    try (CampaignServiceClient campaignServiceClient =
        googleAdsClient.getLatestVersion().createCampaignServiceClient()) {
      // Adds the campaign.
      MutateCampaignsResponse response =
          campaignServiceClient.mutateCampaigns(
              Long.toString(customerId), ImmutableList.of(operation));
      String campaignResourceName = response.getResults(0).getResourceName();
      System.out.printf("Created campaign with resource name '%s'.%n", campaignResourceName);
      return campaignResourceName;
    }
  }
  // [END add_merchant_center_dynamic_remarketing_campaign_2]

  /**
   * Creates an ad group for the remarketing campaign.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignResourceName the campaign resource name.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START add_merchant_center_dynamic_remarketing_campaign_1]
  private String createAdGroup(
      GoogleAdsClient googleAdsClient, long customerId, String campaignResourceName) {
    // Creates the ad group.
    AdGroup adGroup =
        AdGroup.newBuilder()
            .setName("Dynamic remarketing ad group")
            .setCampaign(campaignResourceName)
            .setStatus(AdGroupStatus.ENABLED)
            .build();

    // Creates the ad group operation.
    AdGroupOperation operation = AdGroupOperation.newBuilder().setCreate(adGroup).build();

    // Creates the ad group service client.
    try (AdGroupServiceClient adGroupServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupServiceClient()) {
      // Adds the ad group.
      MutateAdGroupsResponse response =
          adGroupServiceClient.mutateAdGroups(
              Long.toString(customerId), ImmutableList.of(operation));
      String adGroupResourceName = response.getResults(0).getResourceName();
      System.out.printf("Created ad group with resource name '%s'.%n", adGroupResourceName);
      return adGroupResourceName;
    }
  }
  // [END add_merchant_center_dynamic_remarketing_campaign_1]

  /**
   * Creates the responsive display ad.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupResourceName the campaign resource name.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START add_merchant_center_dynamic_remarketing_campaign]
  private void createAd(
      GoogleAdsClient googleAdsClient, long customerId, String adGroupResourceName)
      throws IOException {
    String marketingImageUrl = "https://gaagl.page.link/Eit5";
    String marketingImageName = "Marketing Image";
    String marketingImageResourceName =
        uploadAsset(googleAdsClient, customerId, marketingImageUrl, marketingImageName);
    String squareMarketingImageName = "Square Marketing Image";
    String squareMarketingImageUrl = "https://gaagl.page.link/bjYi";
    String squareMarketingImageResourceName =
        uploadAsset(googleAdsClient, customerId, squareMarketingImageUrl, squareMarketingImageName);

    // Creates the responsive display ad info object.
    ResponsiveDisplayAdInfo responsiveDisplayAdInfo =
        ResponsiveDisplayAdInfo.newBuilder()
            .addMarketingImages(
                AdImageAsset.newBuilder().setAsset(marketingImageResourceName).build())
            .addSquareMarketingImages(
                AdImageAsset.newBuilder().setAsset(squareMarketingImageResourceName).build())
            .addHeadlines(AdTextAsset.newBuilder().setText("Travel").build())
            .setLongHeadline(AdTextAsset.newBuilder().setText("Travel the World").build())
            .addDescriptions(AdTextAsset.newBuilder().setText("Take to the air!").build())
            .setBusinessName("Interplanetary Cruises")
            // Optional: Call to action text.
            // Valid texts: https://support.google.com/adwords/answer/7005917
            .setCallToActionText("Apply Now")
            // Optional: Sets the ad colors.
            .setMainColor("#0000ff")
            .setAccentColor("#ffff00")
            // Optional: Sets to false to strictly render the ad using the colors.
            .setAllowFlexibleColor(false)
            // Optional: Sets the format setting that the ad will be served in.
            .setFormatSetting(DisplayAdFormatSetting.NON_NATIVE)
            // Optional: Creates a logo image and sets it to the ad.
            /*
            .addLogoImages(
                AdImageAsset.newBuilder()
                    .setAsset(StringValue.of("INSERT_LOGO_IMAGE_RESOURCE_NAME_HERE"))
                    .build())
            */
            // Optional: Creates a square logo image and sets it to the ad.
            /*
            .addSquareLogoImages(
                AdImageAsset.newBuilder()
                    .setAsset(StringValue.of("INSERT_SQUARE_LOGO_IMAGE_RESOURCE_NAME_HERE"))
                    .build())
            */
            .build();

    // Creates the ad.
    Ad ad =
        Ad.newBuilder()
            .setResponsiveDisplayAd(responsiveDisplayAdInfo)
            .addFinalUrls("http://www.example.com/")
            .build();

    // Creates the ad group ad.
    AdGroupAd adGroupAd = AdGroupAd.newBuilder().setAdGroup(adGroupResourceName).setAd(ad).build();

    // Creates the ad group ad operation.
    AdGroupAdOperation operation = AdGroupAdOperation.newBuilder().setCreate(adGroupAd).build();

    // Creates the ad group ad service client.
    try (AdGroupAdServiceClient adGroupAdServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupAdServiceClient()) {
      // Adds the ad group ad.
      MutateAdGroupAdsResponse response =
          adGroupAdServiceClient.mutateAdGroupAds(
              Long.toString(customerId), ImmutableList.of(operation));
      System.out.printf(
          "Created ad group ad with resource name '%s'.%n",
          response.getResults(0).getResourceName());
    }
  }
  // [END add_merchant_center_dynamic_remarketing_campaign]

  /**
   * Adds an image to the Google Ads account.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param imageUrl the url of the image.
   * @param assetName the name of the asset.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private String uploadAsset(
      GoogleAdsClient googleAdsClient, long customerId, String imageUrl, String assetName)
      throws IOException {
    byte[] imageData = ByteStreams.toByteArray(new URL(imageUrl).openStream());

    // Creates the image asset.
    Asset asset =
        Asset.newBuilder()
            .setName(assetName)
            .setType(AssetType.IMAGE)
            .setImageAsset(ImageAsset.newBuilder().setData(ByteString.copyFrom(imageData)).build())
            .build();

    // Creates the asset operation.
    AssetOperation operation = AssetOperation.newBuilder().setCreate(asset).build();

    // Creates the asset service client.
    try (AssetServiceClient assetServiceClient =
        googleAdsClient.getLatestVersion().createAssetServiceClient()) {
      // Adds the image asset.
      MutateAssetsResponse response =
          assetServiceClient.mutateAssets(Long.toString(customerId), ImmutableList.of(operation));
      String imageResourceName = response.getResults(0).getResourceName();
      System.out.printf("Created image asset with resource name '%s'.%n", imageResourceName);
      return imageResourceName;
    }
  }

  /**
   * Targets a user list.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupResourceName the campaign resource name.
   * @param userListId ID of the user list.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START add_merchant_center_dynamic_remarketing_campaign_3]
  private void attachUserList(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String adGroupResourceName,
      long userListId) {
    String userListResourceName = ResourceNames.userList(customerId, userListId);
    // Creates the ad group criterion that targets the user list.
    AdGroupCriterion adGroupCriterion =
        AdGroupCriterion.newBuilder()
            .setAdGroup(adGroupResourceName)
            .setUserList(UserListInfo.newBuilder().setUserList(userListResourceName).build())
            .build();

    // Creates the ad group criterion operation.
    AdGroupCriterionOperation operation =
        AdGroupCriterionOperation.newBuilder().setCreate(adGroupCriterion).build();

    // Creates the ad group criterion service client.
    try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupCriterionServiceClient()) {
      // Adds the ad group criterion.
      MutateAdGroupCriteriaResponse response =
          adGroupCriterionServiceClient.mutateAdGroupCriteria(
              Long.toString(customerId), ImmutableList.of(operation));
      System.out.printf(
          "Created ad group criterion with resource name '%s'.%n",
          response.getResults(0).getResourceName());
    }
  }
  // [END add_merchant_center_dynamic_remarketing_campaign_3]
}

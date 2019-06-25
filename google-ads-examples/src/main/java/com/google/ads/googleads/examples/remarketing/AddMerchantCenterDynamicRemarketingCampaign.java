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

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v1.common.AdImageAsset;
import com.google.ads.googleads.v1.common.AdTextAsset;
import com.google.ads.googleads.v1.common.ImageAsset;
import com.google.ads.googleads.v1.common.ManualCpc;
import com.google.ads.googleads.v1.common.ResponsiveDisplayAdInfo;
import com.google.ads.googleads.v1.common.UserListInfo;
import com.google.ads.googleads.v1.enums.AdGroupStatusEnum.AdGroupStatus;
import com.google.ads.googleads.v1.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v1.enums.AssetTypeEnum.AssetType;
import com.google.ads.googleads.v1.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v1.errors.GoogleAdsError;
import com.google.ads.googleads.v1.errors.GoogleAdsException;
import com.google.ads.googleads.v1.resources.Ad;
import com.google.ads.googleads.v1.resources.AdGroup;
import com.google.ads.googleads.v1.resources.AdGroupAd;
import com.google.ads.googleads.v1.resources.AdGroupCriterion;
import com.google.ads.googleads.v1.resources.Asset;
import com.google.ads.googleads.v1.resources.Campaign;
import com.google.ads.googleads.v1.resources.Campaign.ShoppingSetting;
import com.google.ads.googleads.v1.services.AdGroupAdOperation;
import com.google.ads.googleads.v1.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v1.services.AdGroupCriterionOperation;
import com.google.ads.googleads.v1.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v1.services.AdGroupOperation;
import com.google.ads.googleads.v1.services.AdGroupServiceClient;
import com.google.ads.googleads.v1.services.AssetOperation;
import com.google.ads.googleads.v1.services.AssetServiceClient;
import com.google.ads.googleads.v1.services.CampaignOperation;
import com.google.ads.googleads.v1.services.CampaignServiceClient;
import com.google.ads.googleads.v1.services.MutateAdGroupAdsResponse;
import com.google.ads.googleads.v1.services.MutateAdGroupCriteriaResponse;
import com.google.ads.googleads.v1.services.MutateAdGroupsResponse;
import com.google.ads.googleads.v1.services.MutateAssetsResponse;
import com.google.ads.googleads.v1.services.MutateCampaignsResponse;
import com.google.ads.googleads.v1.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import com.google.common.io.ByteStreams;
import com.google.protobuf.BoolValue;
import com.google.protobuf.ByteString;
import com.google.protobuf.BytesValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

/**
 *  Creates a shopping campaign associated with an existing merchant center account, along with a
 *  related ad group and dynamic display ad, and targets a user list for remarketing purposes.
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
      params.merchantCenterAccountId = Long.parseLong("INSERT_MERCHANT_CENTER_ID_HERE");
      params.campaignBudgetId = Long.parseLong("INSERT_CAMPAIGN_BUDGET_ID_HERE");
      params.userListId = Long.parseLong("INSERT_USER_LIST_ID_HERE");
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
      new AddMerchantCenterDynamicRemarketingCampaign()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.merchantCenterAccountId,
              params.campaignBudgetId,
              params.userListId);
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
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID in which to create criterion.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long merchantCenterId,
      long budgetId,
      long userListId)
      throws IOException {
    // Creates a shopping campaign associated with a given merchant center account.
    String campaignResourceName =
        createCampaign(googleAdsClient, customerId, merchantCenterId, budgetId);
    // Creates an ad group for the campaign.
    String adGroupResourceName = createAdGroup(googleAdsClient, customerId, campaignResourceName);
    // Creates a dynamic display ad in the ad group.
    createAd(googleAdsClient, customerId, adGroupResourceName);
    // Targets a specific user list for remarketing.
    attachUserList(googleAdsClient, customerId, adGroupResourceName, userListId);
  }

  /**
   * Creates a campaign linked to a Merchant Center product feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID in which to create criterion.
   * @param merchantCenterId the merchant center account ID.
   * @param budgetId the campaign budget ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private String createCampaign(
      GoogleAdsClient googleAdsClient, long customerId, long merchantCenterId, long budgetId) {
    String budgetResourceName = ResourceNames.campaignBudget(customerId, budgetId);

    // Creates the campaign.
    Campaign campaign =
        Campaign.newBuilder()
            .setName(StringValue.of("Shopping campaign #" + System.currentTimeMillis()))
            .setAdvertisingChannelType(AdvertisingChannelType.DISPLAY)
            .setStatus(CampaignStatus.PAUSED)
            .setCampaignBudget(StringValue.of(budgetResourceName))
            .setManualCpc(ManualCpc.newBuilder().build())
            // The settings for the shopping campaign.
            // This connects the campaign to the merchant center account.
            .setShoppingSetting(
                ShoppingSetting.newBuilder()
                    .setCampaignPriority(Int32Value.of(0))
                    .setMerchantId(Int64Value.of(merchantCenterId))
                    .setSalesCountry(StringValue.of("ZZ"))
                    .setEnableLocal(BoolValue.of(true))
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

  /**
   * Creates an ad group for the remarketing campaign.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID in which to create criterion.
   * @param campaignResourceName the campaign resource name.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private String createAdGroup(
      GoogleAdsClient googleAdsClient, long customerId, String campaignResourceName) {
    // Creates the ad group.
    AdGroup adGroup =
        AdGroup.newBuilder()
            .setName(StringValue.of("Dynamic remarketing ad group"))
            .setCampaign(StringValue.of(campaignResourceName))
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

  /**
   * Creates the responsive display ad.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID in which to create criterion.
   * @param adGroupResourceName the campaign resource name.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void createAd(
      GoogleAdsClient googleAdsClient, long customerId, String adGroupResourceName)
      throws IOException {
    String marketingImageUrl = "https://goo.gl/3b9Wfh";
    String marketingImageName = "Marketing Image";
    String marketingImageResourceName =
        uploadAsset(googleAdsClient, customerId, marketingImageUrl, marketingImageName);
    String logoImageName = "Logo Image";
    String logoImageUrl = "https://goo.gl/mtt54n";
    String logoImageResourceName =
        uploadAsset(googleAdsClient, customerId, logoImageUrl, logoImageName);

    // Creates the responsive display ad info object.
    ResponsiveDisplayAdInfo responsiveDisplayAdInfo =
        ResponsiveDisplayAdInfo.newBuilder()
            .addMarketingImages(
                AdImageAsset.newBuilder()
                    .setAsset(StringValue.of(marketingImageResourceName))
                    .build())
            .addSquareMarketingImages(
                AdImageAsset.newBuilder().setAsset(StringValue.of(logoImageResourceName)).build())
            .addHeadlines(AdTextAsset.newBuilder().setText(StringValue.of("Travel")).build())
            .setLongHeadline(
                AdTextAsset.newBuilder().setText(StringValue.of("Travel the World")).build())
            .addDescriptions(
                AdTextAsset.newBuilder().setText(StringValue.of("Take to the air!")).build())
            .setBusinessName(StringValue.of("Interplanetary Cruises"))
            // Optional: Call to action text.
            // Valid texts: https://support.google.com/adwords/answer/7005917
            .setCallToActionText(StringValue.of("Apply Now"))
            // Optional: Creates a logo image and set it to the ad.
            .addLogoImages(
                AdImageAsset.newBuilder().setAsset(StringValue.of(logoImageResourceName)).build())
            // Optional: Creates a logo image and set it to the ad.
            .addSquareLogoImages(
                AdImageAsset.newBuilder().setAsset(StringValue.of(logoImageResourceName)).build())
            // Whitelisted accounts only: Sets color settings using hexadecimal values.
            // Sets allowFlexibleColor to false if you want your ads to render by always
            // using your colors strictly.
            /*
            .setMainColor(StringValue.of("#0000ff"))
            .setAccentColor(StringValue.of("#ffff00"))
            .setAllowFlexibleColor(BoolValue.of(false))
            */
            // Whitelisted accounts only: Sets the format setting that the ad will be
            // served in.
            /*
            .setFormatSetting(DisplayAdFormatSetting.NON_NATIVE)
            */
            .build();

    // Creates the ad.
    Ad ad =
        Ad.newBuilder()
            .setResponsiveDisplayAd(responsiveDisplayAdInfo)
            .addFinalUrls(StringValue.of("http://www.example.com/"))
            .build();

    // Creates the ad group ad.
    AdGroupAd adGroupAd =
        AdGroupAd.newBuilder().setAdGroup(StringValue.of(adGroupResourceName)).setAd(ad).build();

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

  /**
   * Adds an image to the Google Ads account.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID in which to create criterion.
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
            .setName(StringValue.of(assetName))
            .setType(AssetType.IMAGE)
            .setImageAsset(
                ImageAsset.newBuilder()
                    .setData(BytesValue.of(ByteString.copyFrom(imageData)))
                    .build())
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
   * @param customerId the client customer ID in which to create criterion.
   * @param adGroupResourceName the campaign resource name.
   * @param userListId ID of the user list.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void attachUserList(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String adGroupResourceName,
      long userListId) {
    String userListResourceName = ResourceNames.userList(customerId, userListId);
    // Creates the ad group criterion that targets the user list.
    AdGroupCriterion adGroupCriterion =
        AdGroupCriterion.newBuilder()
            .setAdGroup(StringValue.of(adGroupResourceName))
            .setUserList(
                UserListInfo.newBuilder().setUserList(StringValue.of(userListResourceName)).build())
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
}

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

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v6.utils.ResourceNames;
import com.google.ads.googleads.v6.common.AdImageAsset;
import com.google.ads.googleads.v6.common.AdTextAsset;
import com.google.ads.googleads.v6.common.ImageAsset;
import com.google.ads.googleads.v6.common.ResponsiveDisplayAdInfo;
import com.google.ads.googleads.v6.common.TargetCpa;
import com.google.ads.googleads.v6.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v6.enums.AdGroupStatusEnum.AdGroupStatus;
import com.google.ads.googleads.v6.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType;
import com.google.ads.googleads.v6.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v6.enums.AssetTypeEnum.AssetType;
import com.google.ads.googleads.v6.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v6.errors.GoogleAdsError;
import com.google.ads.googleads.v6.errors.GoogleAdsException;
import com.google.ads.googleads.v6.resources.Ad;
import com.google.ads.googleads.v6.resources.AdGroup;
import com.google.ads.googleads.v6.resources.AdGroupAd;
import com.google.ads.googleads.v6.resources.Asset;
import com.google.ads.googleads.v6.resources.Campaign;
import com.google.ads.googleads.v6.resources.CampaignBudget;
import com.google.ads.googleads.v6.services.AdGroupAdOperation;
import com.google.ads.googleads.v6.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v6.services.AdGroupOperation;
import com.google.ads.googleads.v6.services.AdGroupServiceClient;
import com.google.ads.googleads.v6.services.AssetOperation;
import com.google.ads.googleads.v6.services.AssetServiceClient;
import com.google.ads.googleads.v6.services.CampaignBudgetOperation;
import com.google.ads.googleads.v6.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v6.services.CampaignOperation;
import com.google.ads.googleads.v6.services.CampaignServiceClient;
import com.google.ads.googleads.v6.services.MutateAdGroupAdsResponse;
import com.google.ads.googleads.v6.services.MutateAdGroupsResponse;
import com.google.ads.googleads.v6.services.MutateAssetsResponse;
import com.google.ads.googleads.v6.services.MutateCampaignBudgetsResponse;
import com.google.ads.googleads.v6.services.MutateCampaignsResponse;
import com.google.common.collect.ImmutableList;
import com.google.common.io.ByteStreams;
import com.google.protobuf.ByteString;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import org.joda.time.DateTime;

/**
 * This example adds a Smart Display campaign, an ad group and a responsive display ad. More
 * information about Smart Display campaigns can be found at
 * https://support.google.com/google-ads/answer/7020281.
 *
 * <p>IMPORTANT: The AssetService requires you to reuse what you've uploaded previously. Therefore,
 * you cannot create multiple image assets with the exact same bytes. In case you want to run this
 * example more than once, note down the created assets' resource names and specify them as
 * command-line arguments for marketing and square marketing images.
 *
 * <p>Alternatively, you can modify the image URLs' constants directly to use other images. You can
 * find image specifications in {@link ResponsiveDisplayAdInfo}.
 */
public class AddSmartDisplayAd {

  // See the descriptions of the 'marketingImages' and 'squareMarketingImages' fields in
  // ResponsiveDisplayAdInfo for specifications of marketing and square marketing images.
  // They can be used to create an image asset for your customer account only once.
  private static final String MARKETING_IMAGE_URL = "https://goo.gl/3b9Wfh";
  private static final String SQUARE_MARKETING_IMAGE_URL = "https://goo.gl/mtt54n";

  private static class AddSmartDisplayAdParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.MARKETING_IMAGE_ASSET_ID, required = false)
    private Long marketingImageAssetResourceName;

    @Parameter(names = ArgumentNames.SQUARE_MARKETING_IMAGE_ID, required = false)
    private Long squareMarketingImageAssetResourceName;
  }

  public static void main(String[] args) throws IOException {
    AddSmartDisplayAdParams params = new AddSmartDisplayAdParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      // Optional: Specify the resource name of an existing marketing image.
      params.marketingImageAssetResourceName = null;
      // Optional: Specify the resource name of an existing square marketing image.
      params.squareMarketingImageAssetResourceName = null;
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
      new AddSmartDisplayAd()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.marketingImageAssetResourceName,
              params.squareMarketingImageAssetResourceName);
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
   * @param marketingImageAssetId
   * @param squareMarketingImageAssetId
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      Long marketingImageAssetId,
      Long squareMarketingImageAssetId)
      throws IOException {
    String budgetResourceName = createCampaignBudget(googleAdsClient, customerId);
    String campaignResourceName =
        createSmartDisplayCampaign(googleAdsClient, customerId, budgetResourceName);
    String adGroupResourceName = createAdGroup(googleAdsClient, customerId, campaignResourceName);

    createResponsiveDisplayAd(
        googleAdsClient,
        customerId,
        adGroupResourceName,
        marketingImageAssetId == null
            ? null
            : ResourceNames.asset(customerId, marketingImageAssetId),
        squareMarketingImageAssetId == null
            ? null
            : ResourceNames.asset(customerId, squareMarketingImageAssetId));
  }

  /**
   * Adds a campaign budget.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @return the campaign budget resource name.
   */
  // [START add_smart_display_ad]
  private static String createCampaignBudget(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates the budget.
    CampaignBudget campaignBudget =
        CampaignBudget.newBuilder()
            .setName("Interplanetary Cruise Budget #" + getPrintableDateTime())
            .setAmountMicros(5_000_000)
            .setDeliveryMethod(BudgetDeliveryMethod.STANDARD)
            .build();

    // Creates the operation.
    CampaignBudgetOperation operation =
        CampaignBudgetOperation.newBuilder().setCreate(campaignBudget).build();

    // Creates the campaign budget service client.
    try (CampaignBudgetServiceClient campaignBudgetServiceClient =
        googleAdsClient.getLatestVersion().createCampaignBudgetServiceClient()) {
      // Adds the campaign budget.
      MutateCampaignBudgetsResponse response =
          campaignBudgetServiceClient.mutateCampaignBudgets(
              Long.toString(customerId), ImmutableList.of(operation));
      // Displays the result.
      String budgetResourceName = response.getResults(0).getResourceName();
      System.out.printf("Added budget with resource name '%s'.%n", budgetResourceName);
      return budgetResourceName;
    }
  }
  // [END add_smart_display_ad]

  /**
   * Adds a Smart Display campaign.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param budgetResourceName the campaign budget resource name.
   * @return the campaign resource name.
   */
  // [START add_smart_display_ad_1]
  private static String createSmartDisplayCampaign(
      GoogleAdsClient googleAdsClient, long customerId, String budgetResourceName) {
    // Creates the campaign.
    Campaign campaign =
        Campaign.newBuilder()
            .setName("Smart Display Campaign #" + getPrintableDateTime())
            // Smart Display campaign requires the advertising channel type as 'DISPLAY'.
            .setAdvertisingChannelType(AdvertisingChannelType.DISPLAY)
            // Smart Display campaign requires the advertising channel sub type as
            // 'DISPLAY_SMART_CAMPAIGN'.
            .setAdvertisingChannelSubType(AdvertisingChannelSubType.DISPLAY_SMART_CAMPAIGN)
            // Smart Display campaign requires the TargetCpa bidding strategy.
            .setTargetCpa(TargetCpa.newBuilder().setTargetCpaMicros(5_000_000).build())
            .setCampaignBudget(budgetResourceName)
            // Optional: Sets the start and end dates for the campaign, beginning one day from
            // now and ending a month from now.
            .setStartDate(new DateTime().plusDays(1).toString("yyyyMMdd"))
            .setEndDate(new DateTime().plusMonths(1).toString("yyyyMMdd"))
            .build();

    // Creates the operation.
    CampaignOperation operation = CampaignOperation.newBuilder().setCreate(campaign).build();

    // Creates the campaign service client.
    try (CampaignServiceClient campaignServiceClient =
        googleAdsClient.getLatestVersion().createCampaignServiceClient()) {
      // Adds the campaign.
      MutateCampaignsResponse response =
          campaignServiceClient.mutateCampaigns(
              Long.toString(customerId), ImmutableList.of(operation));

      String campaignResourceName = response.getResults(0).getResourceName();
      // Displays the results.
      System.out.printf(
          "Added Smart Display campaign with resource name '%s'.%n", campaignResourceName);
      return campaignResourceName;
    }
  }
  // [END add_smart_display_ad_1]

  /**
   * Adds an ad group.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignResourceName the campaign resource name.
   * @return the ad group resource name.
   */
  // [START add_smart_display_ad_4]
  private static String createAdGroup(
      GoogleAdsClient googleAdsClient, long customerId, String campaignResourceName) {
    // Creates the ad group.
    AdGroup adGroup =
        AdGroup.newBuilder()
            .setName("Earth to Mars Cruises #" + getPrintableDateTime())
            .setCampaign(campaignResourceName)
            .setStatus(AdGroupStatus.PAUSED)
            .build();

    // Creates the operation.
    AdGroupOperation operation = AdGroupOperation.newBuilder().setCreate(adGroup).build();

    // Creates the ad group service client.
    try (AdGroupServiceClient adGroupServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupServiceClient()) {
      MutateAdGroupsResponse response =
          adGroupServiceClient.mutateAdGroups(
              Long.toString(customerId), ImmutableList.of(operation));
      String adGroupResourceName = response.getResults(0).getResourceName();
      // Displays the results.
      System.out.printf("Added ad group with resource name '%s'.%n", adGroupResourceName);
      return adGroupResourceName;
    }
  }
  // [END add_smart_display_ad_4]

  /**
   * Adds a responsive display ad, which is a recommended ad type for Smart Display campaigns.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupResourceName the ad group resource name.
   * @param marketingImageAssetResourceName optional, the resource name of the marketing image
   *     asset.
   * @param squareMarketingImageAssetResourceName optional, the resource name of the square
   *     marketing image asset.
   */
  // [START add_smart_display_ad_2]
  private static void createResponsiveDisplayAd(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String adGroupResourceName,
      String marketingImageAssetResourceName,
      String squareMarketingImageAssetResourceName)
      throws IOException {
    // Creates a new image asset for marketing image and square marketing image if there are no
    // asset resource names specified.
    if (marketingImageAssetResourceName == null) {
      marketingImageAssetResourceName =
          createImageAsset(googleAdsClient, customerId, MARKETING_IMAGE_URL, "Marketing Image");
    }
    if (squareMarketingImageAssetResourceName == null) {
      squareMarketingImageAssetResourceName =
          createImageAsset(
              googleAdsClient, customerId, SQUARE_MARKETING_IMAGE_URL, "Square Marketing Image");
    }

    // Creates a responsive display ad info.
    ResponsiveDisplayAdInfo responsiveDisplayAdInfo =
        ResponsiveDisplayAdInfo.newBuilder()
            // Sets some basic required information for the responsive display ad.
            .addHeadlines(AdTextAsset.newBuilder().setText("Travel"))
            .setLongHeadline(AdTextAsset.newBuilder().setText("Travel the World"))
            .addDescriptions(AdTextAsset.newBuilder().setText("Take to the air!"))
            .setBusinessName("Google")
            // Sets the marketing image and square marketing image to the previously created image
            // assets.
            .addMarketingImages(AdImageAsset.newBuilder().setAsset(marketingImageAssetResourceName))
            .addSquareMarketingImages(
                AdImageAsset.newBuilder().setAsset(squareMarketingImageAssetResourceName))
            // Optional: Sets call to action text, price prefix, and promotion text.
            .setCallToActionText("Shop Now")
            .setPricePrefix("as low as")
            .setPromoText("Free shipping!")
            .build();

    // Creates an ad group ad with the created responsive display ad info.
    AdGroupAd adGroupAd =
        AdGroupAd.newBuilder()
            .setAdGroup(adGroupResourceName)
            .setStatus(AdGroupAdStatus.PAUSED)
            .setAd(
                Ad.newBuilder()
                    .addFinalUrls("https://www.example.com")
                    .setResponsiveDisplayAd(responsiveDisplayAdInfo))
            .build();

    // Creates the operation.
    AdGroupAdOperation operation = AdGroupAdOperation.newBuilder().setCreate(adGroupAd).build();

    // Creates the ad group ad service client.
    try (AdGroupAdServiceClient adGroupAdServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupAdServiceClient()) {
      // Adds the responsive display ad.
      MutateAdGroupAdsResponse response =
          adGroupAdServiceClient.mutateAdGroupAds(
              Long.toString(customerId), ImmutableList.of(operation));
      // Displays the response.
      System.out.printf(
          "Added ad group ad with resource name '%s'.%n", response.getResults(0).getResourceName());
    }
  }
  // [END add_smart_display_ad_2]

  /**
   * Creates an image asset to be used for creating ads.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param imageUrl the image URL to be downloaded.
   * @param imageName the image name.
   * @return the created image asset's resource name.
   */
  // [START add_smart_display_ad_3]
  private static String createImageAsset(
      GoogleAdsClient googleAdsClient, long customerId, String imageUrl, String imageName)
      throws IOException {
    // Creates a media file.
    byte[] assetBytes = ByteStreams.toByteArray(new URL(imageUrl).openStream());
    Asset asset =
        Asset.newBuilder()
            .setName(imageName)
            .setType(AssetType.IMAGE)
            .setImageAsset(ImageAsset.newBuilder().setData(ByteString.copyFrom(assetBytes)).build())
            .build();

    // Creates an asset operation.
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
  // [END add_smart_display_ad_3]
}

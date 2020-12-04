// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.examples.advancedoperations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v6.common.AdImageAsset;
import com.google.ads.googleads.v6.common.AdTextAsset;
import com.google.ads.googleads.v6.common.AdVideoAsset;
import com.google.ads.googleads.v6.common.ImageAsset;
import com.google.ads.googleads.v6.common.LocalAdInfo;
import com.google.ads.googleads.v6.common.MaximizeConversionValue;
import com.google.ads.googleads.v6.common.YoutubeVideoAsset;
import com.google.ads.googleads.v6.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v6.enums.AdGroupStatusEnum.AdGroupStatus;
import com.google.ads.googleads.v6.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType;
import com.google.ads.googleads.v6.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v6.enums.AssetTypeEnum.AssetType;
import com.google.ads.googleads.v6.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v6.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v6.enums.LocationSourceTypeEnum.LocationSourceType;
import com.google.ads.googleads.v6.enums.OptimizationGoalTypeEnum.OptimizationGoalType;
import com.google.ads.googleads.v6.errors.GoogleAdsError;
import com.google.ads.googleads.v6.errors.GoogleAdsException;
import com.google.ads.googleads.v6.resources.Ad;
import com.google.ads.googleads.v6.resources.AdGroup;
import com.google.ads.googleads.v6.resources.AdGroupAd;
import com.google.ads.googleads.v6.resources.Asset;
import com.google.ads.googleads.v6.resources.Campaign;
import com.google.ads.googleads.v6.resources.Campaign.LocalCampaignSetting;
import com.google.ads.googleads.v6.resources.Campaign.OptimizationGoalSetting;
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

/**
 * Adds an Local campaign.
 *
 * <p>Prerequisite: To create a Local campaign, you need to define the store locations you want to
 * promote by linking your Google My Business account or selecting affiliate locations. More
 * information about Local campaigns can be found at:
 * https://support.google.com/google-ads/answer/9118422.
 */
public class AddLocalCampaign {

  private static final String MARKETING_IMAGE_URL = "https://goo.gl/3b9Wfh";
  private static final String LOGO_IMAGE_URL = "https://goo.gl/mtt54n";
  private static final String YOUTUBE_VIDEO_ID = "t1fDo0VyeEo";

  private static class AddLocalCampaignParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID)
    private long customerId;
  }

  public static void main(String[] args) throws IOException {
    AddLocalCampaignParams params = new AddLocalCampaignParams();
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
      new AddLocalCampaign().runExample(googleAdsClient, params.customerId);
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

  /** Runs the example. */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) throws IOException {
    // Creates a budget for the campaign.
    String budgetResourceName = createCampaignBudget(googleAdsClient, customerId);

    // Creates a local campaign.
    String campaignResourceName =
        createLocalCampaign(googleAdsClient, customerId, budgetResourceName);

    // Creates a local campaign ad group.
    String adGroupResourceName = createAdGroup(googleAdsClient, customerId, campaignResourceName);

    // Creates a local ad.
    createLocalAd(googleAdsClient, customerId, adGroupResourceName);
  }

  /** Creates a campaign budget. */
  private String createCampaignBudget(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates a CampaignBudget object.
    CampaignBudget budget =
        CampaignBudget.newBuilder()
            .setAmountMicros(50000000)
            .setName("Interplanetary Cruise Budget #" + System.currentTimeMillis())
            .setDeliveryMethod(BudgetDeliveryMethod.STANDARD)
            // A Local campaign cannot use a shared campaign budget.
            .setExplicitlyShared(false)
            .build();

    // Creates an operation to add the campaign.
    CampaignBudgetOperation operation =
        CampaignBudgetOperation.newBuilder().setCreate(budget).build();

    // Connects to the API.
    try (CampaignBudgetServiceClient campaignBudgetServiceClient =
        googleAdsClient.getLatestVersion().createCampaignBudgetServiceClient()) {
      // Issues the mutate request.
      MutateCampaignBudgetsResponse response =
          campaignBudgetServiceClient.mutateCampaignBudgets(
              String.valueOf(customerId), ImmutableList.of(operation));

      // Prints some debugging information.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Created campaign budget with resource name: '%s'.%n", resourceName);
      return resourceName;
    }
  }

  /** Creates a local campaign. */
  private String createLocalCampaign(
      GoogleAdsClient googleAdsClient, long customerId, String budgetResourceName) {
    // Creates a Campaign object.
    Campaign campaign =
        Campaign.newBuilder()
            .setName("Interplanetary Cruise Budget #" + System.currentTimeMillis())
            .setCampaignBudget(budgetResourceName)
            // Recommendation: Set the campaign to PAUSED when creating it to prevent the ads from
            // immediately serving. Set to ENABLED once you've added targeting and the ads are ready
            // to serve.
            .setStatus(CampaignStatus.PAUSED)
            // Sets the advertisingChannelType to LOCAL and advertisingChannelSubType to
            // LOCAL_CAMPAIGN.
            .setAdvertisingChannelType(AdvertisingChannelType.LOCAL)
            .setAdvertisingChannelSubType(AdvertisingChannelSubType.LOCAL_CAMPAIGN)
            // Sets the bidding strategy. Note that this must be set directly on the campaign.
            //   - Setting a portfolio bidding strategy by resource name is not supported.
            //   - Maximize conversion value is the only strategy supported for Local
            //     campaigns.
            //   - An optional ROAS (Return on Advertising Spend) can be set for
            //     MaximizeConversionValue.
            //   - Specify the ROAS value must as a ratio. It is calculated by
            //     dividing "total value" by "total spend". For example, to target 350% ROAS, set
            //     targetRoas=3.5.
            //   - For more information on maximize conversion value, see the support article:
            //     http://support.google.com/google-ads/answer/7684216.
            .setMaximizeConversionValue(
                MaximizeConversionValue.newBuilder().setTargetRoas(3.5).build())
            // Configures the Local campaign setting.
            .setLocalCampaignSetting(
                LocalCampaignSetting.newBuilder()
                    // Use the locations associated with the customer's linked Google My Business
                    // account.
                    .setLocationSourceType(LocationSourceType.GOOGLE_MY_BUSINESS))
            .setOptimizationGoalSetting(
                OptimizationGoalSetting.newBuilder()
                    // Optimization goal setting is mandatory for Local campaigns. This example
                    // selects driving directions and call clicks as goals.
                    .addOptimizationGoalTypes(OptimizationGoalType.CALL_CLICKS)
                    .addOptimizationGoalTypes(OptimizationGoalType.DRIVING_DIRECTIONS)
                    .build())
            .build();

    // Creates a operation to add the campaign.
    CampaignOperation operation = CampaignOperation.newBuilder().setCreate(campaign).build();

    // Connects to the API.
    try (CampaignServiceClient client =
        googleAdsClient.getLatestVersion().createCampaignServiceClient()) {
      // Sends the mutate request.
      MutateCampaignsResponse response =
          client.mutateCampaigns(String.valueOf(customerId), ImmutableList.of(operation));

      // Prints some debugging information.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Created Local campaign with resource name: '%s'.%n", resourceName);
      return resourceName;
    }
  }

  /** Creates a local campaign ad-group. */
  private String createAdGroup(
      GoogleAdsClient googleAdsClient, long customerId, String campaignResourceName) {
    // Creates an ad group. Note that the ad group type must not be set.
    // Also, since the advertisingChannelSubType is LOCAL_CAMPAIGN:
    //   1. you cannot override bid settings at the ad group level.
    //   2. you cannot add ad group criteria.
    AdGroup adGroup =
        AdGroup.newBuilder()
            .setName("Earth to Mars Cruises #" + System.currentTimeMillis())
            .setStatus(AdGroupStatus.ENABLED)
            .setCampaign(campaignResourceName)
            .build();

    // Creates an operation to add the ad group.
    AdGroupOperation operation = AdGroupOperation.newBuilder().setCreate(adGroup).build();

    // Connects to the API.
    try (AdGroupServiceClient client =
        googleAdsClient.getLatestVersion().createAdGroupServiceClient()) {
      // Issues the mutate request.
      MutateAdGroupsResponse response =
          client.mutateAdGroups(String.valueOf(customerId), ImmutableList.of(operation));

      // Prints some debugging information.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Created ad group with resource name: '%s'.%n", resourceName);
      return resourceName;
    }
  }

  /** Creates a local ad. */
  private void createLocalAd(
      GoogleAdsClient googleAdsClient, long customerId, String adGroupResourceName)
      throws IOException {
    // Creates the local ad object.
    Ad ad =
        Ad.newBuilder()
            .addFinalUrls("https://www.example.com")
            .setLocalAd(
                LocalAdInfo.newBuilder()
                    // Adds headline text to the ad.
                    .addHeadlines(createTextAsset("Best Space Cruise Line"))
                    .addHeadlines(createTextAsset("Experience the Stars"))

                    // Adds description text to the ad.
                    .addDescriptions(createTextAsset("Buy your tickets now"))
                    .addDescriptions(createTextAsset("Visit the Red Planet"))

                    // Adds a call to action text to the ad.
                    .addCallToActions(createTextAsset("Shop Now"))

                    // Adds various rich media types to the ad.
                    .addMarketingImages(
                        createImageAsset(
                            googleAdsClient, customerId, MARKETING_IMAGE_URL, "Marketing Image"))
                    .addLogoImages(
                        createImageAsset(
                            googleAdsClient, customerId, LOGO_IMAGE_URL, "Square Marketing Image"))
                    .addVideos(
                        createYoutubeVideoAsset(
                            googleAdsClient, customerId, YOUTUBE_VIDEO_ID, "Local Campaigns"))
                    .build())
            .build();

    // Creates the ad group ad object.
    AdGroupAd adGroupAd =
        AdGroupAd.newBuilder()
            .setAdGroup(adGroupResourceName)
            .setStatus(AdGroupAdStatus.ENABLED)
            .setAd(ad)
            .build();

    // Creates an operation to add the AdGroupAd.
    AdGroupAdOperation operation = AdGroupAdOperation.newBuilder().setCreate(adGroupAd).build();

    // Connects to the API.
    try (AdGroupAdServiceClient client =
        googleAdsClient.getLatestVersion().createAdGroupAdServiceClient()) {
      // Issues the mutate request.
      MutateAdGroupAdsResponse response =
          client.mutateAdGroupAds(String.valueOf(customerId), ImmutableList.of(operation));

      // Prints some debugging information.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Created ad group ad with resource name: '%s'.%n", resourceName);
    }
  }

  // --------------------------------- Utility functions -------------------------------------------

  /** Converts a String to a {@link AdTextAsset}. */
  private AdTextAsset createTextAsset(String s) {
    return AdTextAsset.newBuilder().setText(s).build();
  }

  /** Creates an {@link AdImageAsset}. */
  private static AdImageAsset createImageAsset(
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

      // Wraps the asset resource name in AdImageAsset.
      return AdImageAsset.newBuilder().setAsset(imageResourceName).build();
    }
  }

  /** Creates a {@link AdVideoAsset}. */
  private AdVideoAsset createYoutubeVideoAsset(
      GoogleAdsClient googleAdsClient, long customerId, String youtubeVideoId, String videoName) {
    // Creates an Asset object.
    Asset asset =
        Asset.newBuilder()
            .setName(videoName)
            .setType(AssetType.YOUTUBE_VIDEO)
            .setYoutubeVideoAsset(YoutubeVideoAsset.newBuilder().setYoutubeVideoId(youtubeVideoId))
            .build();

    // Creates an operation to add the asset.
    AssetOperation operation = AssetOperation.newBuilder().setCreate(asset).build();

    // Connects to the API.
    try (AssetServiceClient assetServiceClient =
        googleAdsClient.getLatestVersion().createAssetServiceClient()) {
      // Issues the mutate request.
      MutateAssetsResponse response =
          assetServiceClient.mutateAssets(String.valueOf(customerId), ImmutableList.of(operation));

      // Prints some debugging information.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf(
          "A new YouTube video asset has been added with resource name: '%s'.%n", resourceName);

      // Wraps the result in an AdVideoAsset.
      return AdVideoAsset.newBuilder().setAsset(resourceName).build();
    }
  }
}

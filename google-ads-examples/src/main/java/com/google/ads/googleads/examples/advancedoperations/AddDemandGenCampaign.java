// Copyright 2024 Google LLC
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

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleHelper;
import com.google.ads.googleads.examples.utils.MediaUtils;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v20.common.AdImageAsset;
import com.google.ads.googleads.v20.common.AdTextAsset;
import com.google.ads.googleads.v20.common.AdVideoAsset;
import com.google.ads.googleads.v20.common.DemandGenAdGroupSettings;
import com.google.ads.googleads.v20.common.DemandGenVideoResponsiveAdInfo;
import com.google.ads.googleads.v20.common.ImageAsset;
import com.google.ads.googleads.v20.common.VideoAsset;
import com.google.ads.googleads.v20.enums.AdGroupStatusEnum.AdGroupStatus;
import com.google.ads.googleads.v20.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v20.enums.AssetTypeEnum.AssetType;
import com.google.ads.googleads.v20.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v20.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v20.errors.GoogleAdsError;
import com.google.ads.googleads.v20.errors.GoogleAdsException;
import com.google.ads.googleads.v20.resources.Ad;
import com.google.ads.googleads.v20.resources.AdGroup;
import com.google.ads.googleads.v20.resources.AdGroupAd;
import com.google.ads.googleads.v20.resources.Asset;
import com.google.ads.googleads.v20.resources.Campaign;
import com.google.ads.googleads.v20.resources.CampaignBudget;
import com.google.ads.googleads.v20.services.AdGroupAdOperation;
import com.google.ads.googleads.v20.services.AdGroupOperation;
import com.google.ads.googleads.v20.services.AssetOperation;
import com.google.ads.googleads.v20.services.CampaignBudgetOperation;
import com.google.ads.googleads.v20.services.CampaignOperation;
import com.google.ads.googleads.v20.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v20.services.MutateGoogleAdsRequest;
import com.google.ads.googleads.v20.services.MutateGoogleAdsResponse;
import com.google.ads.googleads.v20.services.MutateOperation;
import com.google.ads.googleads.v20.services.MutateOperationResponse;
import com.google.ads.googleads.v20.utils.ResourceNames;
import com.google.protobuf.ByteString;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Creates a Demand Gen campaign, which features a fully automated campaign construction and bidding
 * process. It aims to achieve your advertising goals by serving your ads across YouTube, Gmail and
 * Discover. For more information about Demand Gen campaigns, see the <a
 * href="https://support.google.com/google-ads/answer/13935200">Demand Gen campaigns</a> help page.
 *
 * <p>This example uses the Google Ads API V20.
 *
 * <p>Prerequisites:
 *
 * <ul>
 *   <li>You must have an existing Google Ads account.
 *   <li>You must have a YouTube video ID to use for the ad. This video should be public or
 *       unlisted.
 *   <li>You must have a URL for a logo image. This image will be used for the ad.
 * </ul>
 */
public class AddDemandGenCampaign {

  // Temporary IDs for resources created in this example.
  // These are negative numbers, which are used internally by the API to reference previously
  // created resources in the same request.
  private static final long BUDGET_TEMPORARY_ID = -1L;
  private static final long CAMPAIGN_TEMPORARY_ID = -2L;
  private static final long AD_GROUP_TEMPORARY_ID = -3L;
  private static final long LOGO_ASSET_TEMPORARY_ID = -4L;
  private static final long VIDEO_ASSET_TEMPORARY_ID = -5L;

  // This is a logo image URL that will be used for the Demand Gen ad.
  // Using a common Google logo for demonstration purposes.
  private static final String LOGO_IMAGE_URL =
      "https://www.gstatic.com/images/branding/googlelogo/2x/googlelogo_color_150x54dp.png";

  /** Contains command line argument formats for running this example. */
  private static class Options extends ArgumentNames {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true, description = "The Google Ads customer ID.")
    private Long customerId;

    @Parameter(
        names = ArgumentNames.VIDEO_ID,
        required = true,
        description = "The YouTube video ID to use in the Demand Gen ad (e.g., 'videoid123').")
    private String videoId;
  }

  /**
   * Main method.
   *
   * @param args command line arguments for running the example.
   * @throws IOException if the Google Ads client could not be created.
   */
  public static void main(String[] args) throws IOException {
    Options options = new Options();
    if (!CodeSampleHelper.parseArguments(args, options, System.out)) {
      return;
    }

    GoogleAdsClient googleAdsClient;
    try {
      googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
          "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      System.exit(1);
      return;
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      System.exit(1);
      return;
    }

    try {
      new AddDemandGenCampaign()
          .run(googleAdsClient, options.customerId, options.videoId);
    } catch (GoogleAdsException gae) {
      // GoogleAdsException is the base class for most exceptions thrown by an API request.
      // Instances of this exception have a message and a GoogleAdsFailure that contains a
      // collection of GoogleAdsError instances that detail the underlying causes of the
      // GoogleAdsException.
      System.err.printf(
          "Request ID %s failed due to GoogleAdsException. Underlying errors:%n",
          gae.getRequestId());
      int i = 0;
      for (GoogleAdsError googleAdsError : gae.getGoogleAdsFailure().getErrorsList()) {
        System.err.printf("  Error %d: %s%n", i++, googleAdsError.getMessage());
      }
      System.exit(1);
    }
  }

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param videoId the YouTube video ID for the ad.
   * @throws IOException if an I/O error occurs, for example, when downloading the logo image.
   */
  private void run(GoogleAdsClient googleAdsClient, long customerId, String videoId)
      throws IOException {
    String budgetResourceName =
        ResourceNames.campaignBudget(customerId, BUDGET_TEMPORARY_ID);
    String campaignResourceName =
        ResourceNames.campaign(customerId, CAMPAIGN_TEMPORARY_ID);
    String adGroupResourceName =
        ResourceNames.adGroup(customerId, AD_GROUP_TEMPORARY_ID);
    String logoAssetResourceName =
        ResourceNames.asset(customerId, LOGO_ASSET_TEMPORARY_ID);
    String videoAssetResourceName =
        ResourceNames.asset(customerId, VIDEO_ASSET_TEMPORARY_ID);

    List<MutateOperation> operations = new ArrayList<>();
    operations.add(createCampaignBudgetOperation(budgetResourceName));
    operations.add(
        createDemandGenCampaignOperation(campaignResourceName, budgetResourceName));
    operations.add(createAdGroupOperation(adGroupResourceName, campaignResourceName));
    operations.add(createImageAssetOperation(logoAssetResourceName, LOGO_IMAGE_URL));
    operations.add(createVideoAssetOperation(videoAssetResourceName, videoId));
    operations.add(
        createDemandGenAdOperation(
            adGroupResourceName, logoAssetResourceName, videoAssetResourceName));

    // Issues a single mutate request to create all entities.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      MutateGoogleAdsRequest request =
          MutateGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .addAllMutateOperations(operations)
              .build();

      MutateGoogleAdsResponse response = googleAdsServiceClient.mutateGoogleAds(request);

      System.out.printf(
          "Created Demand Gen campaign with %d operations:%n", operations.size());
      for (MutateOperationResponse operationResponse :
          response.getMutateOperationResponsesList()) {
        if (operationResponse.hasCampaignBudgetResult()) {
          System.out.printf(
              "\tCreated Campaign Budget with resource name: '%s'%n",
              operationResponse.getCampaignBudgetResult().getResourceName());
        } else if (operationResponse.hasCampaignResult()) {
          System.out.printf(
              "\tCreated Campaign with resource name: '%s'%n",
              operationResponse.getCampaignResult().getResourceName());
        } else if (operationResponse.hasAdGroupResult()) {
          System.out.printf(
              "\tCreated Ad Group with resource name: '%s'%n",
              operationResponse.getAdGroupResult().getResourceName());
        } else if (operationResponse.hasAssetResult()) {
          System.out.printf(
              "\tCreated Asset with resource name: '%s'%n",
              operationResponse.getAssetResult().getResourceName());
        } else if (operationResponse.hasAdGroupAdResult()) {
          System.out.printf(
              "\tCreated Ad Group Ad with resource name: '%s'%n",
              operationResponse.getAdGroupAdResult().getResourceName());
        }
      }
    }
  }

  /**
   * Creates a new campaign budget operation.
   *
   * @param budgetResourceName the resource name for the campaign budget.
   * @return a {@link MutateOperation} to create the campaign budget.
   */
  private MutateOperation createCampaignBudgetOperation(String budgetResourceName) {
    CampaignBudget budget =
        CampaignBudget.newBuilder()
            .setResourceName(budgetResourceName)
            .setName("Demand Gen Campaign Budget #" + System.currentTimeMillis())
            .setAmountMicros(5_000_000L) // 5 USD
            .setDeliveryMethod(BudgetDeliveryMethod.STANDARD)
            // A budget can be shared across campaigns. This budget is not shared.
            .setExplicitlyShared(false)
            .build();

    return MutateOperation.newBuilder()
        .setCampaignBudgetOperation(
            CampaignBudgetOperation.newBuilder().setCreate(budget))
        .build();
  }

  /**
   * Creates a new Demand Gen campaign operation.
   *
   * @param campaignResourceName the resource name for the campaign.
   * @param budgetResourceName the resource name of the budget to associate with this campaign.
   * @return a {@link MutateOperation} to create the Demand Gen campaign.
   */
  private MutateOperation createDemandGenCampaignOperation(
      String campaignResourceName, String budgetResourceName) {
    Campaign campaign =
        Campaign.newBuilder()
            .setResourceName(campaignResourceName)
            .setName("Demand Gen Campaign #" + System.currentTimeMillis())
            .setCampaignBudget(budgetResourceName)
            .setAdvertisingChannelType(AdvertisingChannelType.DEMAND_GEN)
            // Recommendation: Set the campaign to PAUSED when creating it to prevent
            // the ads from immediately serving. Set to ENABLED once you've added
            // targeting and the ads are ready to serve.
            .setStatus(CampaignStatus.PAUSED)
            // Optional: Set a bidding strategy. If not set, the campaign will use
            // the TargetCpa bidding strategy.
            // .setBiddingStrategyConfiguration(...)
            .build();

    return MutateOperation.newBuilder()
        .setCampaignOperation(CampaignOperation.newBuilder().setCreate(campaign))
        .build();
  }

  /**
   * Creates a new ad group operation for the Demand Gen campaign.
   *
   * @param adGroupResourceName the resource name for the ad group.
   * @param campaignResourceName the resource name of the campaign to associate with this ad group.
   * @return a {@link MutateOperation} to create the ad group.
   */
  private MutateOperation createAdGroupOperation(
      String adGroupResourceName, String campaignResourceName) {
    AdGroup adGroup =
        AdGroup.newBuilder()
            .setResourceName(adGroupResourceName)
            .setName("Demand Gen Ad Group #" + System.currentTimeMillis())
            .setCampaign(campaignResourceName)
            // Sets the ad group status to ENABLED. Ad group ads will be able to serve
            // once the campaign status is also set to ENABLED.
            .setStatus(AdGroupStatus.ENABLED)
            // Optional: Set targeting criteria for the ad group.
            // .putTargetingSetting(FieldType.PLACEMENT, TargetingSetting.newBuilder().build())
            // Sets the Demand Gen specific settings for the ad group.
            .setDemandGenAdGroupSettings(
                DemandGenAdGroupSettings.newBuilder()
                    // Optional: Defines the channel controls for this ad group, allowing
                    // you to specify which channels (e.g., Discover, Gmail, YouTube)
                    // your ads can serve on. If not set, ads may serve on all
                    // available channels.
                    // .addAllChannelControls(...) // Example: add a control for YouTube
                    )
            .build();

    return MutateOperation.newBuilder()
        .setAdGroupOperation(AdGroupOperation.newBuilder().setCreate(adGroup))
        .build();
  }

  /**
   * Creates a new image asset operation.
   *
   * @param assetResourceName the resource name for the image asset.
   * @param imageUrl the URL of the image.
   * @return a {@link MutateOperation} to create the image asset.
   * @throws IOException if the image data cannot be fetched from the URL.
   */
  private MutateOperation createImageAssetOperation(String assetResourceName, String imageUrl)
      throws IOException {
    byte[] imageBytes = MediaUtils.getAsByteArray(new URL(imageUrl));
    Asset imageAsset =
        Asset.newBuilder()
            .setResourceName(assetResourceName)
            .setName("Demand Gen Logo Asset #" + System.currentTimeMillis())
            .setType(AssetType.IMAGE)
            .setImageAsset(ImageAsset.newBuilder().setData(ByteString.copyFrom(imageBytes)))
            .build();

    return MutateOperation.newBuilder()
        .setAssetOperation(AssetOperation.newBuilder().setCreate(imageAsset))
        .build();
  }

  /**
   * Creates a new YouTube video asset operation.
   *
   * @param assetResourceName the resource name for the video asset.
   * @param youtubeVideoId the ID of the YouTube video.
   * @return a {@link MutateOperation} to create the video asset.
   */
  private MutateOperation createVideoAssetOperation(
      String assetResourceName, String youtubeVideoId) {
    Asset videoAsset =
        Asset.newBuilder()
            .setResourceName(assetResourceName)
            .setName("Demand Gen Video Asset #" + System.currentTimeMillis())
            .setType(AssetType.YOUTUBE_VIDEO)
            .setYoutubeVideoAsset(VideoAsset.newBuilder().setYoutubeVideoId(youtubeVideoId))
            .build();

    return MutateOperation.newBuilder()
        .setAssetOperation(AssetOperation.newBuilder().setCreate(videoAsset))
        .build();
  }

  /**
   * Creates a new Demand Gen ad operation.
   *
   * @param adGroupResourceName the resource name of the ad group to associate this ad with.
   * @param logoAssetResourceName the resource name of the logo image asset.
   * @param videoAssetResourceName the resource name of the video asset.
   * @return a {@link MutateOperation} to create the Demand Gen ad.
   */
  private MutateOperation createDemandGenAdOperation(
      String adGroupResourceName, String logoAssetResourceName, String videoAssetResourceName) {
    AdGroupAd adGroupAd =
        AdGroupAd.newBuilder()
            .setAdGroup(adGroupResourceName)
            // The status of the ad group ad is inherited from the ad group status.
            // For example, if the ad group is PAUSED, the ad group ad status is also PAUSED.
            .setAd(
                Ad.newBuilder()
                    .addFinalUrls("https://www.example.com")
                    .setDemandGenVideoResponsiveAd(
                        DemandGenVideoResponsiveAdInfo.newBuilder()
                            .addVideos(AdVideoAsset.newBuilder().setAsset(videoAssetResourceName))
                            .addLogoImages(
                                AdImageAsset.newBuilder().setAsset(logoAssetResourceName))
                            .addHeadlines(AdTextAsset.newBuilder().setText("Headline 1 - Experience the Magic"))
                            .addHeadlines(AdTextAsset.newBuilder().setText("Headline 2 - Discover New Horizons"))
                            .addHeadlines(AdTextAsset.newBuilder().setText("Headline 3 - Your Adventure Awaits"))
                            .addLongHeadlines(AdTextAsset.newBuilder().setText("Long Headline 1 - Unlock Exclusive Content and Explore a World of Possibilities Today!"))
                            .addLongHeadlines(AdTextAsset.newBuilder().setText("Long Headline 2 - Join Our Community and Get Access to Premium Features and Support."))
                            .addDescriptions(AdTextAsset.newBuilder().setText("Description 1 - Sign up now and transform your experience."))
                            .addDescriptions(AdTextAsset.newBuilder().setText("Description 2 - Limited time offer: Don't miss out!"))
                            .setBusinessName("Your Awesome Company Inc.")
                            .setCallToAction("LEARN_MORE") // See CallToActionType in the API reference
                            // Optional: Set a different call to action for non-video ads.
                            // .setCallToActionNonVideo("INSTALL") // Example for non-video
                            ))
            .build();

    return MutateOperation.newBuilder()
        .setAdGroupAdOperation(AdGroupAdOperation.newBuilder().setCreate(adGroupAd))
        .build();
  }
}

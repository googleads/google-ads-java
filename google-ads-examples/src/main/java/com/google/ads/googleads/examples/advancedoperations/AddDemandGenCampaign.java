// Copyright 2025 Google LLC
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

import static com.google.ads.googleads.v22.enums.EuPoliticalAdvertisingStatusEnum.EuPoliticalAdvertisingStatus.DOES_NOT_CONTAIN_EU_POLITICAL_ADVERTISING;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v22.common.AdImageAsset;
import com.google.ads.googleads.v22.common.AdTextAsset;
import com.google.ads.googleads.v22.common.AdVideoAsset;
import com.google.ads.googleads.v22.common.DemandGenVideoResponsiveAdInfo;
import com.google.ads.googleads.v22.common.ImageAsset;
import com.google.ads.googleads.v22.common.TargetCpa;
import com.google.ads.googleads.v22.common.YoutubeVideoAsset;
import com.google.ads.googleads.v22.enums.AdGroupStatusEnum.AdGroupStatus;
import com.google.ads.googleads.v22.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v22.enums.AssetTypeEnum.AssetType;
import com.google.ads.googleads.v22.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v22.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v22.errors.GoogleAdsError;
import com.google.ads.googleads.v22.errors.GoogleAdsException;
import com.google.ads.googleads.v22.resources.Ad;
import com.google.ads.googleads.v22.resources.AdGroup;
import com.google.ads.googleads.v22.resources.AdGroup.DemandGenAdGroupSettings;
import com.google.ads.googleads.v22.resources.AdGroup.DemandGenAdGroupSettings.DemandGenChannelControls;
import com.google.ads.googleads.v22.resources.AdGroup.DemandGenAdGroupSettings.DemandGenChannelControls.DemandGenSelectedChannels;
import com.google.ads.googleads.v22.resources.AdGroupAd;
import com.google.ads.googleads.v22.resources.Asset;
import com.google.ads.googleads.v22.resources.Campaign;
import com.google.ads.googleads.v22.resources.CampaignBudget;
import com.google.ads.googleads.v22.services.AdGroupAdOperation;
import com.google.ads.googleads.v22.services.AdGroupOperation;
import com.google.ads.googleads.v22.services.AssetOperation;
import com.google.ads.googleads.v22.services.CampaignBudgetOperation;
import com.google.ads.googleads.v22.services.CampaignOperation;
import com.google.ads.googleads.v22.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v22.services.MutateGoogleAdsResponse;
import com.google.ads.googleads.v22.services.MutateOperation;
import com.google.ads.googleads.v22.utils.ResourceNames;
import com.google.protobuf.ByteString;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

/**
 * This example creates a Demand Gen campaign, an ad group, and a discovery ad in a single mutate
 * request.
 *
 * <p>Prerequisites:
 *
 * <ul>
 * <li>You must have a Google Ads account.
 * <li>You must have a login customer ID.
 * </ul>
 */
public class AddDemandGenCampaign {
  private static class AddDemandGenCampaignParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(
        names = "--youTubeVideoId",
        description = "The YouTube video ID for the Demand Gen ad.",
        required = true)
    private String youTubeVideoId;
  }

  // URLs for the assets required by this example.
  private static final String LOGO_IMAGE_URL = "https://gaagl.page.link/bjYi";

  public static void main(String[] args) throws IOException {
    AddDemandGenCampaignParams params = new AddDemandGenCampaignParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for more information.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.youTubeVideoId = "INSERT_VIDEO_ID_HERE";
    }

    GoogleAdsClient googleAdsClient = null;
    try {
      googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
    } catch (IOException e) {
      System.err.printf(
          "Failed to build GoogleAdsClient from properties file. Exception: %s%n", e.getMessage());
      System.exit(1);
    }

    try {
      new AddDemandGenCampaign()
          .runExample(googleAdsClient, params.customerId, params.youTubeVideoId);
    } catch (GoogleAdsException gae) {
      // GoogleAdsException is the base class for most exceptions thrown by an API request.
      // Instances of this exception have a message and a failure object, which contains information
      // about the error codes and trigger flows.
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
   * @param youTubeVideoId the YouTube video ID for the ad.
   * @throws GoogleAdsException if an API call fails.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, String youTubeVideoId)
      throws IOException {

    // [START add_demand_gen_campaign_1]
    // The below methods create and return MutateOperations that we later provide to
    // the GoogleAdsService.Mutate method in order to create the entities in a single
    // request. Since the entities for a Demand Gen campaign are closely tied to one-another
    // it's considered a best practice to create them in a single Mutate request; the
    // entities will either all complete successfully or fail entirely, leaving no
    // orphaned entities. See:
    // https://developers.google.com/google-ads/api/docs/mutating/overview
    List<MutateOperation> operations = new ArrayList<>();
    // A utility to create temporary IDs for the resources.
    AtomicLong tempId = new AtomicLong(-1);

    // Creates a new campaign budget operation and adds it to the list of operations.
    String budgetResourceName = ResourceNames.campaignBudget(customerId, tempId.getAndDecrement());
    operations.add(
        MutateOperation.newBuilder()
            .setCampaignBudgetOperation(createCampaignBudgetOperation(budgetResourceName))
            .build());

    // Creates a new campaign operation and adds it to the list of operations.
    String campaignResourceName = ResourceNames.campaign(customerId, tempId.getAndDecrement());
    operations.add(
        MutateOperation.newBuilder()
            .setCampaignOperation(
                createDemandGenCampaignOperation(campaignResourceName, budgetResourceName))
            .build());

    // Creates a new ad group operation and adds it to the list of operations.
    String adGroupResourceName = ResourceNames.adGroup(customerId, tempId.getAndDecrement());
    operations.add(
        MutateOperation.newBuilder()
            .setAdGroupOperation(
                createDemandGenAdGroupOperation(adGroupResourceName, campaignResourceName))
            .build());

    // Creates the asset operations for the ad.
    Map<String, String> assetResourceNames = new HashMap<>();
    operations.addAll(
        createAssetOperations(customerId, youTubeVideoId, tempId, assetResourceNames));

    // Creates a new ad group ad operation and adds it to the list of operations.
    operations.add(
        MutateOperation.newBuilder()
            .setAdGroupAdOperation(
                createDemandGenAdGroupAdOperation(adGroupResourceName, assetResourceNames))
            .build());

    // Creates the service client.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Sends the mutate request.
      MutateGoogleAdsResponse response =
          googleAdsServiceClient.mutate(String.valueOf(customerId), operations);

      // Prints the results.
      System.out.printf(
          "Created campaign with resource name: %s%n",
          response
              .getMutateOperationResponses(1)
              .getCampaignResult()
              .getResourceName());
      System.out.printf(
          "Created ad group with resource name: %s%n",
          response
              .getMutateOperationResponses(2)
              .getAdGroupResult()
              .getResourceName());
      for (Map.Entry<String, String> entry : assetResourceNames.entrySet()) {
        System.out.printf(
            "Created asset with temporary resource name '%s' and final resource name '%s'.%n",
            entry.getValue(),
            response
                .getMutateOperationResponses(
                    operations.indexOf(getOperationForAsset(operations, entry.getValue())))
                .getAssetResult()
                .getResourceName());
      }
      System.out.printf(
          "Created ad group ad with resource name: %s%n",
          response
              .getMutateOperationResponses(operations.size() - 1)
              .getAdGroupAdResult()
              .getResourceName());
    }
    // [END add_demand_gen_campaign_1]
  }

  /**
   * Creates a new campaign budget operation.
   *
   * @param budgetResourceName the resource name of the budget.
   * @return the campaign budget operation.
   */
  private CampaignBudgetOperation createCampaignBudgetOperation(String budgetResourceName) {
    // Creates the campaign budget.
    CampaignBudget budget =
        CampaignBudget.newBuilder()
            .setResourceName(budgetResourceName)
            .setName("Demand Gen campaign budget #" + System.currentTimeMillis())
            .setDeliveryMethod(BudgetDeliveryMethod.STANDARD)
            // A budget of 50,000,000 micros (50 USD) is created.
            .setAmountMicros(50_000_000L)
            // An explicit budget must be shared.
            .setExplicitlyShared(true)
            .build();

    // Creates the operation.
    return CampaignBudgetOperation.newBuilder().setCreate(budget).build();
  }

  /**
   * Creates a new Demand Gen campaign operation.
   *
   * @param campaignResourceName the resource name of the campaign.
   * @param budgetResourceName the resource name of the budget for the campaign.
   * @return the campaign operation.
   */
  private CampaignOperation createDemandGenCampaignOperation(
      String campaignResourceName, String budgetResourceName) {
    // [START add_demand_gen_campaign_2]
    // Creates the campaign.
    Campaign campaign =
        Campaign.newBuilder()
            .setResourceName(campaignResourceName)
            .setName("Demand Gen campaign " + System.currentTimeMillis())
            // Demand Gen campaigns are supported in the DEMAND_GEN channel.
            .setAdvertisingChannelType(AdvertisingChannelType.DEMAND_GEN)
            // Sets the campaign status to PAUSED. The campaign is enabled later.
            .setStatus(CampaignStatus.PAUSED)
            .setCampaignBudget(budgetResourceName)
            // Declares whether this campaign serves political ads targeting the EU.
            .setContainsEuPoliticalAdvertising(DOES_NOT_CONTAIN_EU_POLITICAL_ADVERTISING)
            // Sets the bidding strategy.
            .setTargetCpa(TargetCpa.newBuilder().setTargetCpaMicros(10_000_000L).build())
            .build();

    // Creates the operation.
    return CampaignOperation.newBuilder().setCreate(campaign).build();
    // [END add_demand_gen_campaign_2]
  }

  /**
   * Creates a new Demand Gen ad group operation.
   *
   * @param adGroupResourceName the resource name of the ad group.
   * @param campaignResourceName the resource name of the campaign for the ad group.
   * @return the ad group operation.
   */
  private AdGroupOperation createDemandGenAdGroupOperation(
      String adGroupResourceName, String campaignResourceName) {
    // [START add_demand_gen_campaign_3]
    // Creates the ad group.
    AdGroup adGroup =
        AdGroup.newBuilder()
            .setResourceName(adGroupResourceName)
            .setName("Demand Gen ad group " + System.currentTimeMillis())
            .setCampaign(campaignResourceName)
            .setStatus(AdGroupStatus.ENABLED)
            // [START add_demand_gen_campaign_5]
            // Selects the specific channels for the ad group.
            // For further information on Demand Gen channel controls, see
            // https://developers.google.com/google-ads/api/docs/demand-gen/channel-controls
            .setDemandGenAdGroupSettings(
                DemandGenAdGroupSettings.newBuilder()
                    .setChannelControls(
                        DemandGenChannelControls.newBuilder()
                            .setSelectedChannels(DemandGenSelectedChannels.newBuilder()
                                .setGmail(false)
                                .setDiscover(false)
                                .setDisplay(false)
                                .setYoutubeInFeed(true)
                                .setYoutubeInStream(true)
                                .setYoutubeShorts(true)
                            .build())
                        .build())
                .build())
            .build();
            // [END add_demand_gen_campaign_5]

    // Creates the operation.
    return AdGroupOperation.newBuilder().setCreate(adGroup).build();
    // [END add_demand_gen_campaign_3]
  }

  /**
   * Creates a list of asset operations.
   *
   * @param customerId the client customer ID.
   * @param youTubeVideoId the YouTube video ID for the ad.
   * @param tempId the temporary ID generator.
   * @param assetResourceNames a map to store the temporary resource names of the assets.
   * @return a list of mutate operations for the assets.
   */
  private List<MutateOperation> createAssetOperations(
      long customerId,
      String youTubeVideoId,
      AtomicLong tempId,
      Map<String, String> assetResourceNames)
      throws IOException {
    List<MutateOperation> operations = new ArrayList<>();

    // Creates the logo image asset.
    String logoImageResourceName = ResourceNames.asset(customerId, tempId.getAndDecrement());
    assetResourceNames.put("LogoImage", logoImageResourceName);
    operations.add(
        MutateOperation.newBuilder()
            .setAssetOperation(
                createAssetOperation("LogoImage", logoImageResourceName, LOGO_IMAGE_URL))
            .build());

    // Creates the video asset.
    String videoResourceName = ResourceNames.asset(customerId, tempId.getAndDecrement());
    assetResourceNames.put("Video", videoResourceName);
    operations.add(
        MutateOperation.newBuilder()
            .setAssetOperation(createAssetOperation("Video", videoResourceName, youTubeVideoId))
            .build());

    return operations;
  }

  /**
   * Creates an asset operation.
   *
   * @param name the name of the asset.
   * @param resourceName the resource name of the asset.
   * @param url the URL of the asset.
   * @return the asset operation.
   */
  private AssetOperation createAssetOperation(String name, String resourceName, String url)
      throws IOException {
    String assetName =
        name + " " + ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME);
    Asset.Builder assetBuilder = Asset.newBuilder().setName(assetName).setResourceName(resourceName);

    if (url.length() == 11) {
      // It's a YouTube video ID.
      assetBuilder
          .setType(AssetType.YOUTUBE_VIDEO)
          .setYoutubeVideoAsset(YoutubeVideoAsset.newBuilder().setYoutubeVideoId(url));
    } else {
      // It's an image URL.
      byte[] assetBytes = getAssetBytesFromUrl(url);
      assetBuilder
          .setType(AssetType.IMAGE)
          .setImageAsset(ImageAsset.newBuilder().setData(ByteString.copyFrom(assetBytes)));
    }

    return AssetOperation.newBuilder().setCreate(assetBuilder.build()).build();
  }

  /**
   * Creates a new Demand Gen ad group ad operation.
   *
   * @param adGroupResourceName the resource name of the ad group for the ad.
   * @param assetResourceNames a map of asset names to their resource names.
   * @return the ad group ad operation.
   */
  private AdGroupAdOperation createDemandGenAdGroupAdOperation(
      String adGroupResourceName, Map<String, String> assetResourceNames) {

    // [START add_demand_gen_campaign_4]
    DemandGenVideoResponsiveAdInfo.Builder videoResponsiveAdbuilder =
        DemandGenVideoResponsiveAdInfo.newBuilder()
            .setBusinessName(
                AdTextAsset.newBuilder()
                .setText("Interplanetary Cruises")
                .build()
            )
            .addVideos(
                AdVideoAsset.newBuilder()
                .setAsset(assetResourceNames.get("Video"))
                .build()
            )
            .addAllLongHeadlines(
                Arrays.asList("Long headline 1").stream()
                .map(s -> AdTextAsset.newBuilder().setText(s).build())
                .collect(Collectors.toList())
            )
            .addAllHeadlines(
                Arrays.asList("Headline 1", "Headline 2", "Headline 3").stream()
                    .map(s -> AdTextAsset.newBuilder().setText(s).build())
                    .collect(Collectors.toList()))
            .addAllDescriptions(
                Arrays.asList("Description 1", "Description 2").stream()
                    .map(s -> AdTextAsset.newBuilder().setText(s).build())
                    .collect(Collectors.toList()))
            .addLogoImages(AdImageAsset.newBuilder().setAsset(assetResourceNames.get("LogoImage")));

    AdGroupAd adGroupAd =
        AdGroupAd.newBuilder()
            .setAdGroup(adGroupResourceName)
            .setAd(
                Ad.newBuilder()
                    .setName("Demand gen video responsive ad")
                    .addFinalUrls("https://www.example.com")
                    .setDemandGenVideoResponsiveAd(videoResponsiveAdbuilder.build())
                    .build())
            .build();

    return AdGroupAdOperation.newBuilder().setCreate(adGroupAd).build();
    // [END add_demand_gen_campaign_4]
  }

  /**
   * Reads the bytes from a URL.
   *
   * @param urlString the URL to read from.
   * @return the bytes from the URL.
   */
  private byte[] getAssetBytesFromUrl(String urlString) throws IOException {
    URL url = new URL(urlString);
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    try (InputStream is = url.openStream()) {
      byte[] buffer = new byte[1024];
      int n;
      while ((n = is.read(buffer)) != -1) {
        baos.write(buffer, 0, n);
      }
    }
    return baos.toByteArray();
  }

  /**
   * Finds the mutate operation for a given asset resource name.
   *
   * @param operations the list of mutate operations.
   * @param resourceName the resource name of the asset.
   * @return the mutate operation for the asset.
   */
  private MutateOperation getOperationForAsset(
      List<MutateOperation> operations, String resourceName) {
    return operations.stream()
        .filter(
            op ->
                op.hasAssetOperation()
                    && op.getAssetOperation().getCreate().getResourceName().equals(resourceName))
        .findFirst()
        .orElse(null);
  }
}

// Copyright 2021 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//  http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.examples.extensions;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v8.common.PromotionAsset;
import com.google.ads.googleads.v8.common.PromotionFeedItem;
import com.google.ads.googleads.v8.enums.AssetFieldTypeEnum.AssetFieldType;
import com.google.ads.googleads.v8.errors.GoogleAdsError;
import com.google.ads.googleads.v8.errors.GoogleAdsException;
import com.google.ads.googleads.v8.resources.AdGroup;
import com.google.ads.googleads.v8.resources.AdGroupAsset;
import com.google.ads.googleads.v8.resources.AdGroupExtensionSetting;
import com.google.ads.googleads.v8.resources.Asset;
import com.google.ads.googleads.v8.resources.Campaign;
import com.google.ads.googleads.v8.resources.CampaignAsset;
import com.google.ads.googleads.v8.resources.CampaignExtensionSetting;
import com.google.ads.googleads.v8.resources.ExtensionFeedItem;
import com.google.ads.googleads.v8.resources.FeedItem;
import com.google.ads.googleads.v8.services.AdGroupAssetOperation;
import com.google.ads.googleads.v8.services.AdGroupAssetServiceClient;
import com.google.ads.googleads.v8.services.AssetOperation;
import com.google.ads.googleads.v8.services.AssetServiceClient;
import com.google.ads.googleads.v8.services.CampaignAssetOperation;
import com.google.ads.googleads.v8.services.CampaignAssetServiceClient;
import com.google.ads.googleads.v8.services.GoogleAdsRow;
import com.google.ads.googleads.v8.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v8.services.MutateAdGroupAssetResult;
import com.google.ads.googleads.v8.services.MutateAdGroupAssetsResponse;
import com.google.ads.googleads.v8.services.MutateAssetsResponse;
import com.google.ads.googleads.v8.services.MutateCampaignAssetResult;
import com.google.ads.googleads.v8.services.MutateCampaignAssetsResponse;
import com.google.ads.googleads.v8.services.SearchGoogleAdsStreamRequest;
import com.google.ads.googleads.v8.services.SearchGoogleAdsStreamResponse;
import com.google.ads.googleads.v8.utils.ResourceNames;
import com.google.api.gax.rpc.ServerStream;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Retrieves the full details of a Promotion Feed-based extension and creates a matching Promotion
 * asset-based extension. The new Asset-based extension will then be associated with the same
 * campaigns and ad groups as the original Feed-based extension. Finally, the Feed-based extension
 * will be mutated to no longer serve.
 * Once copied, you should remove the Feed-based extension; see
 * RemoveEntireSitelinkCampaignExtensionSetting.java for an example.
 */
public class MigratePromotionFeedToAsset {

  private static class MigratePromotionFeedToAssetParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.FEED_ITEM_ID, required = true)
    private Long extensionFeedItemId;
  }

  public static void main(String[] args) {
    MigratePromotionFeedToAssetParams params = new MigratePromotionFeedToAssetParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.extensionFeedItemId = Long.parseLong("INSERT_EXTENSION_FEED_ITEM_ID_HERE");
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
      new MigratePromotionFeedToAsset()
          .runExample(googleAdsClient, params.customerId, params.extensionFeedItemId);
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
  private void runExample(
      GoogleAdsClient googleAdsClient, Long customerId, Long extensionFeedItemId) {
    try (GoogleAdsServiceClient client =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      String extensionFeedItemResourceName =
          ResourceNames.extensionFeedItem(customerId, extensionFeedItemId);

      ExtensionFeedItem extensionFeedItem =
          getExtensionFeedItem(client, customerId, extensionFeedItemId);

      // Gets all campaign IDs associated with the extension feed item.
      List<Long> campaignIds =
          getTargetedCampaignIds(client, customerId, extensionFeedItemResourceName);
      // Gets all ad group IDs associated with the extension feed item.
      List<Long> adGroupIds =
          getTargetedAdGroupIds(client, customerId, extensionFeedItemResourceName);
      // Creates a new Promotion asset that matches the target extension feed item.
      String promotionAssetResourceName =
          createPromotionAssetFromFeed(googleAdsClient, customerId, extensionFeedItem);
      // Associates the new Promotion asset with the same campaigns as the original.
      associateAssetWithCampaigns(
          googleAdsClient, customerId, promotionAssetResourceName, campaignIds);
      // Associates the new Promotion asset with the same ad groups as the original.
      associateAssetWithAdGroups(
          googleAdsClient, customerId, promotionAssetResourceName, adGroupIds);
    }
  }

  /**
   * Gets the requested Promotion-type extension feed item.
   *
   * <p>Note that extensions can also be created via Feed, FeedItem, etc. If you have this type of
   * extensions you will need to alter the queries and return types to match your feed type. To do
   * so you will need to read the Feed Item via the Feed Mapping and create an asset from the
   * contents.
   */
  private ExtensionFeedItem getExtensionFeedItem(
      GoogleAdsServiceClient client, Long customerId, Long extensionFeedItemId) {
    // Creates a query that will retrieve the requested Promotion-type extension feed item and
    // ensures that all fields are populated.
    String extensionFeedItemQuery =
        "SELECT"
            + "  extension_feed_item.id,"
            + "  extension_feed_item.ad_schedules,"
            + "  extension_feed_item.device,"
            + "  extension_feed_item.status,"
            + "  extension_feed_item.start_date_time,"
            + "  extension_feed_item.end_date_time,"
            + "  extension_feed_item.targeted_campaign,"
            + "  extension_feed_item.targeted_ad_group,"
            + "  extension_feed_item.promotion_feed_item.discount_modifier,"
            + "  extension_feed_item.promotion_feed_item.final_mobile_urls,"
            + "  extension_feed_item.promotion_feed_item.final_url_suffix,"
            + "  extension_feed_item.promotion_feed_item.final_urls,"
            + "  extension_feed_item.promotion_feed_item.language_code,"
            + "  extension_feed_item.promotion_feed_item.money_amount_off.amount_micros,"
            + "  extension_feed_item.promotion_feed_item.money_amount_off.currency_code,"
            + "  extension_feed_item.promotion_feed_item.occasion,"
            + "  extension_feed_item.promotion_feed_item.orders_over_amount.amount_micros,"
            + "  extension_feed_item.promotion_feed_item.orders_over_amount.currency_code,"
            + "  extension_feed_item.promotion_feed_item.percent_off,"
            + "  extension_feed_item.promotion_feed_item.promotion_code,"
            + "  extension_feed_item.promotion_feed_item.promotion_end_date,"
            + "  extension_feed_item.promotion_feed_item.promotion_start_date,"
            + "  extension_feed_item.promotion_feed_item.promotion_target,"
            + "  extension_feed_item.promotion_feed_item.tracking_url_template "
            + "FROM extension_feed_item "
            + "WHERE "
            + "  extension_feed_item.extension_type = 'PROMOTION' "
            + "  AND extension_feed_item.id = "
            + extensionFeedItemId
            + " LIMIT 1";
    ServerStream<SearchGoogleAdsStreamResponse> serverStream =
        client
            .searchStreamCallable()
            .call(
                SearchGoogleAdsStreamRequest.newBuilder()
                    .setCustomerId(String.valueOf(customerId))
                    .setQuery(extensionFeedItemQuery)
                    .build());
    Optional<ExtensionFeedItem> extensionFeedItemResult =
        StreamSupport.stream(serverStream.spliterator(), false)
            .flatMap(r -> r.getResultsList().stream())
            .map(r -> r.getExtensionFeedItem())
            .findFirst();
    if (!extensionFeedItemResult.isPresent()) {
      throw new RuntimeException(
          "Unable to find extension feed item in customer ID "
              + customerId
              + " with ID "
              + extensionFeedItemId);
    }
    ExtensionFeedItem extensionFeedItem = extensionFeedItemResult.get();
    System.out.println("Retrieved details for ad extension with ID " + extensionFeedItemId);

    // Creates a query to retrieve any URL customer parameters attached to the feed item.
    String urlParametersQuery =
        "SELECT feed_item.url_custom_parameters "
            + "FROM feed_item "
            + "WHERE feed_item.id = "
            + extensionFeedItemId;
    // Issues a search request to get any URL custom parameters.
    serverStream =
        client
            .searchStreamCallable()
            .call(
                SearchGoogleAdsStreamRequest.newBuilder()
                    .setCustomerId(String.valueOf(customerId))
                    .setQuery(urlParametersQuery)
                    .build());

    Optional<FeedItem> urlCustomParametersResult =
        StreamSupport.stream(serverStream.spliterator(), false)
            .flatMap(r -> r.getResultsList().stream())
            .map(r -> r.getFeedItem())
            .findFirst();
    // Checks for URL custom parameters and adds to the extension feed item if present.
    if (urlCustomParametersResult.isPresent()) {
      FeedItem feedItem = urlCustomParametersResult.get();
      // Converts the ExtensionFeedItem to a builder and populates the URL custom parameters.
      ExtensionFeedItem.Builder builder = extensionFeedItem.toBuilder();
      builder
          .getPromotionFeedItemBuilder()
          .addAllUrlCustomParameters(feedItem.getUrlCustomParametersList());
      extensionFeedItem = builder.build();

      System.out.println(
          "Retrieved "
              + feedItem.getUrlCustomParametersCount()
              + " attached URL custom parameters.");
    }
    return extensionFeedItem;
  }

  /**
   * Finds and returns all of the campaigns that are associated with the specified Promotion
   * extension feed item.
   */
  // [START migrate_promotion_feed_to_asset_1]
  private List<Long> getTargetedCampaignIds(
      GoogleAdsServiceClient client, Long customerId, String extensionFeedItemResourceName) {
    String query =
        "SELECT campaign.id, campaign_extension_setting.extension_feed_items "
            + "FROM campaign_extension_setting "
            + "WHERE campaign_extension_setting.extension_type = 'PROMOTION' "
            + "  AND campaign.status != 'REMOVED'";
    ServerStream<SearchGoogleAdsStreamResponse> serverStream =
        client
            .searchStreamCallable()
            .call(
                SearchGoogleAdsStreamRequest.newBuilder()
                    .setCustomerId(String.valueOf(customerId))
                    .setQuery(query)
                    .build());
    List<Long> campaignIds = new ArrayList<>();
    for (SearchGoogleAdsStreamResponse response : serverStream) {
      for (GoogleAdsRow row : response.getResultsList()) {
        Campaign campaign = row.getCampaign();
        CampaignExtensionSetting extensionSetting = row.getCampaignExtensionSetting();
        // Adds the campaign ID to the list of IDs if the extension feed item is
        // associated with this extension setting.
        if (extensionSetting.getExtensionFeedItemsList().contains(extensionFeedItemResourceName)) {
          campaignIds.add(campaign.getId());
          System.out.println("Found matching campaign with ID " + campaign.getId());
        }
      }
    }
    return campaignIds;
  }
  // [END migrate_promotion_feed_to_asset_1]

  /**
   * Finds and returns all of the ad groups that are associated with the specified Promotion
   * extension feed item.
   */
  private List<Long> getTargetedAdGroupIds(
      GoogleAdsServiceClient client, Long customerId, String extensionFeedItemResourceName) {
    String query =
        "SELECT ad_group.id, ad_group_extension_setting.extension_feed_items "
            + "FROM ad_group_extension_setting "
            + "WHERE ad_group_extension_setting.extension_type = 'PROMOTION' "
            + "  AND ad_group.status != 'REMOVED'";
    ServerStream<SearchGoogleAdsStreamResponse> serverStream =
        client
            .searchStreamCallable()
            .call(
                SearchGoogleAdsStreamRequest.newBuilder()
                    .setCustomerId(String.valueOf(customerId))
                    .setQuery(query)
                    .build());
    List<Long> adGroupIds = new ArrayList<>();
    for (SearchGoogleAdsStreamResponse response : serverStream) {
      for (GoogleAdsRow row : response.getResultsList()) {
        AdGroup adGroup = row.getAdGroup();
        AdGroupExtensionSetting extensionSetting = row.getAdGroupExtensionSetting();
        // Adds the ad group ID to the list of IDs if the extension feed item is
        // associated with this extension setting.
        if (extensionSetting.getExtensionFeedItemsList().contains(extensionFeedItemResourceName)) {
          adGroupIds.add(adGroup.getId());
          System.out.println("Found matching ad group with ID " + adGroup.getId());
        }
      }
    }
    return adGroupIds;
  }

  /** Creates a Promotion asset that copies values from the specified extension feed item. */
  // [START migrate_promotion_feed_to_asset]
  private String createPromotionAssetFromFeed(
      GoogleAdsClient googleAdsClient, Long customerId, ExtensionFeedItem extensionFeedItem) {
    PromotionFeedItem promotionFeedItem = extensionFeedItem.getPromotionFeedItem();
    // Creates the Promotion asset.
    Asset.Builder asset =
        Asset.newBuilder()
            .setName("Migrated from feed item " + extensionFeedItem.getId())
            .setTrackingUrlTemplate(promotionFeedItem.getTrackingUrlTemplate())
            .setFinalUrlSuffix(promotionFeedItem.getFinalUrlSuffix())
            .setPromotionAsset(
                PromotionAsset.newBuilder()
                    .setPromotionTarget(promotionFeedItem.getPromotionTarget())
                    .setDiscountModifier(promotionFeedItem.getDiscountModifier())
                    .setRedemptionEndDate(promotionFeedItem.getPromotionStartDate())
                    .setRedemptionEndDate(promotionFeedItem.getPromotionEndDate())
                    .setOccasion(promotionFeedItem.getOccasion())
                    .setLanguageCode(promotionFeedItem.getLanguageCode())
                    .addAllAdScheduleTargets(extensionFeedItem.getAdSchedulesList()))
            .addAllFinalUrls(promotionFeedItem.getFinalUrlsList())
            .addAllFinalMobileUrls(promotionFeedItem.getFinalMobileUrlsList())
            .addAllUrlCustomParameters(promotionFeedItem.getUrlCustomParametersList());

    // Either PercentOff or MoneyAmountOff must be set.
    if (promotionFeedItem.getPercentOff() > 0) {
      // Adjusts the percent off scale when copying.
      asset.getPromotionAssetBuilder().setPercentOff(promotionFeedItem.getPercentOff() / 100);
    } else {
      asset.getPromotionAssetBuilder().setMoneyAmountOff(promotionFeedItem.getMoneyAmountOff());
    }
    // Either PromotionCode or OrdersOverAmount must be set.
    if (promotionFeedItem.getPromotionCode() != null
        && promotionFeedItem.getPromotionCode().length() > 0) {
      asset.getPromotionAssetBuilder().setPromotionCode(promotionFeedItem.getPromotionCode());
    } else {
      asset.getPromotionAssetBuilder().setOrdersOverAmount(promotionFeedItem.getOrdersOverAmount());
    }
    // Sets the start and end dates if set in the existing extension.
    if (extensionFeedItem.hasStartDateTime()) {
      asset.getPromotionAssetBuilder().setStartDate(extensionFeedItem.getStartDateTime());
    }
    if (extensionFeedItem.hasEndDateTime()) {
      asset.getPromotionAssetBuilder().setEndDate(extensionFeedItem.getEndDateTime());
    }
    // Builds an operation to create the Promotion asset.
    AssetOperation operation = AssetOperation.newBuilder().setCreate(asset).build();
    // Gets the Asset Service client.
    try (AssetServiceClient assetServiceClient =
        googleAdsClient.getLatestVersion().createAssetServiceClient()) {
      // Issues the request and returns the resource name of the new Promotion asset.
      MutateAssetsResponse response =
          assetServiceClient.mutateAssets(String.valueOf(customerId), ImmutableList.of(operation));
      String resourceName = response.getResults(0).getResourceName();
      System.out.println("Created Promotion asset with resource name " + resourceName);
      return resourceName;
    }
  }
  // [END migrate_promotion_feed_to_asset]

  /** Associates the specified Promotion asset with the specified campaigns. */
  // [START migrate_promotion_feed_to_asset_2]
  private void associateAssetWithCampaigns(
      GoogleAdsClient googleAdsClient,
      Long customerId,
      String promotionAssetResourceName,
      List<Long> campaignIds) {
    if (campaignIds.isEmpty()) {
      System.out.println("Asset was not associated with any campaigns.");
      return;
    }

    // Constructs an operation to associate the asset with each campaign.
    List<CampaignAssetOperation> campaignAssetOperations =
        campaignIds.stream()
            .map(
                id ->
                    CampaignAssetOperation.newBuilder()
                        .setCreate(
                            CampaignAsset.newBuilder()
                                .setAsset(promotionAssetResourceName)
                                .setFieldType(AssetFieldType.PROMOTION)
                                .setCampaign(ResourceNames.campaign(customerId, id)))
                        .build())
            .collect(Collectors.toList());

    // Creates a service client.
    try (CampaignAssetServiceClient campaignAssetServiceClient =
        googleAdsClient.getLatestVersion().createCampaignAssetServiceClient()) {
      // Issues the mutate request.
      MutateCampaignAssetsResponse response =
          campaignAssetServiceClient.mutateCampaignAssets(
              String.valueOf(customerId), campaignAssetOperations);
      // Prints some information about the result.
      for (MutateCampaignAssetResult result : response.getResultsList()) {
        System.out.println("Created campaign asset with resource name " + result.getResourceName());
      }
    }
  }
  // [END migrate_promotion_feed_to_asset_2]

  /** Associates the specified Promotion asset with the specified ad groups. */
  private void associateAssetWithAdGroups(
      GoogleAdsClient googleAdsClient,
      Long customerId,
      String promotionAssetResourceName,
      List<Long> adGroupIds) {
    if (adGroupIds.isEmpty()) {
      System.out.println("Asset was not associated with any ad groups.");
      return;
    }

    // Creates an operation to associate the asset with each ad group.
    List<AdGroupAssetOperation> adGroupAssetOperations =
        adGroupIds.stream()
            .map(
                id ->
                    AdGroupAssetOperation.newBuilder()
                        .setCreate(
                            AdGroupAsset.newBuilder()
                                .setAsset(promotionAssetResourceName)
                                .setFieldType(AssetFieldType.PROMOTION)
                                .setAdGroup(ResourceNames.adGroup(customerId, id)))
                        .build())
            .collect(Collectors.toList());

    // Creates a service client.
    try (AdGroupAssetServiceClient adGroupAssetServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupAssetServiceClient()) {
      // Issues the mutate request.
      MutateAdGroupAssetsResponse response =
          adGroupAssetServiceClient.mutateAdGroupAssets(
              String.valueOf(customerId), adGroupAssetOperations);
      // Prints some information about the result.
      for (MutateAdGroupAssetResult result : response.getResultsList()) {
        System.out.println("Created campaign asset with resource name " + result.getResourceName());
      }
    }
  }
}

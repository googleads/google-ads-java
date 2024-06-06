// Copyright 2021 Google LLC
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
import com.google.ads.googleads.v17.common.AudienceInfo;
import com.google.ads.googleads.v17.common.ImageAsset;
import com.google.ads.googleads.v17.common.LanguageInfo;
import com.google.ads.googleads.v17.common.LocationInfo;
import com.google.ads.googleads.v17.common.MaximizeConversionValue;
import com.google.ads.googleads.v17.common.TextAsset;
import com.google.ads.googleads.v17.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v17.enums.AssetFieldTypeEnum.AssetFieldType;
import com.google.ads.googleads.v17.enums.AssetGroupStatusEnum.AssetGroupStatus;
import com.google.ads.googleads.v17.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v17.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v17.errors.GoogleAdsError;
import com.google.ads.googleads.v17.errors.GoogleAdsException;
import com.google.ads.googleads.v17.resources.Asset;
import com.google.ads.googleads.v17.resources.AssetGroup;
import com.google.ads.googleads.v17.resources.AssetGroupAsset;
import com.google.ads.googleads.v17.resources.AssetGroupSignal;
import com.google.ads.googleads.v17.resources.Campaign;
import com.google.ads.googleads.v17.resources.CampaignBudget;
import com.google.ads.googleads.v17.resources.CampaignCriterion;
import com.google.ads.googleads.v17.services.AssetGroupAssetOperation;
import com.google.ads.googleads.v17.services.AssetGroupOperation;
import com.google.ads.googleads.v17.services.AssetGroupSignalOperation;
import com.google.ads.googleads.v17.services.AssetOperation;
import com.google.ads.googleads.v17.services.CampaignBudgetOperation;
import com.google.ads.googleads.v17.services.CampaignCriterionOperation;
import com.google.ads.googleads.v17.services.CampaignOperation;
import com.google.ads.googleads.v17.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v17.services.MutateGoogleAdsResponse;
import com.google.ads.googleads.v17.services.MutateOperation;
import com.google.ads.googleads.v17.services.MutateOperationResponse;
import com.google.ads.googleads.v17.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import com.google.common.io.ByteStreams;
import com.google.protobuf.ByteString;
import com.google.protobuf.Descriptors.FieldDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.joda.time.DateTime;

/**
 * This example shows how to create a Performance Max campaign.
 *
 * <p>For more information about Performance Max campaigns, see
 * https://developers.google.com/google-ads/api/docs/performance-max/overview
 *
 * <p>Prerequisites: - You must have at least one conversion action in the account. For more about
 * conversion actions, see
 * https://developers.google.com/google-ads/api/docs/conversions/overview#conversion_actions
 *
 * <p>This example uses the default customer conversion goals. For an example of setting
 * campaign-specific conversion goals, see {@link
 * com.google.ads.googleads.examples.shoppingads.AddPerformanceMaxRetailCampaign}.
 */
public class AddPerformanceMaxCampaign {

  // We specify temporary IDs that are specific to a single mutate request. Temporary IDs are always
  // negative and unique within one mutate request.
  //
  // <p>See https://developers.google.com/google-ads/api/docs/mutating/best-practices for further
  // details.
  //
  // <p>These temporary IDs are fixed because they are used in multiple places.
  private static final int BUDGET_TEMPORARY_ID = -1;
  private static final int PERFORMANCE_MAX_CAMPAIGN_TEMPORARY_ID = -2;
  private static final int ASSET_GROUP_TEMPORARY_ID = -3;

  // There are also entities that will be created in the same request but do not
  // need to be fixed temporary IDs because they are referenced only once.
  private static long temporaryId = ASSET_GROUP_TEMPORARY_ID - 1;

  private static class AddPerformanceMaxCampaignParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(
        names = ArgumentNames.AUDIENCE_ID,
        description =
            "An audience ID to use to improve the targeting of the Performance Max campaign")
    private Long audienceId;
  }

  public static void main(String[] args) throws IOException {
    AddPerformanceMaxCampaignParams params = new AddPerformanceMaxCampaignParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");

      // Optional: Specify an audience ID.
      // params.audienceId = Long.parseLong("INSERT_AUDIENCE_ID_HERE");
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
      new AddPerformanceMaxCampaign()
          .runExample(googleAdsClient, params.customerId, params.audienceId);
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

  // [START add_performance_max_campaign]
  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param audienceId the optional audience ID.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, Long audienceId)
      throws IOException {
    // [START add_performance_max_campaign_1]
    // Performance Max campaigns require that repeated assets such as headlines
    // and descriptions be created before the campaign.
    // For the list of required assets for a Performance Max campaign, see
    // https://developers.google.com/google-ads/api/docs/performance-max/assets
    //
    // Creates the headlines.
    List<String> headlines = ImmutableList.of("Travel", "Travel Reviews", "Book travel");
    List<String> headlineAssetResourceNames =
        createMultipleTextAssets(googleAdsClient, customerId, headlines);
    // Creates the descriptions.
    List<String> descriptions = ImmutableList.of("Take to the air!", "Fly to the sky!");
    List<String> descriptionAssetResourceNames =
        createMultipleTextAssets(googleAdsClient, customerId, descriptions);

    // The below methods create and return MutateOperations that we later
    // provide to the GoogleAdsService.Mutate method in order to create the
    // entities in a single request. Since the entities for a Performance Max
    // campaign are closely tied to one-another, it's considered a best practice
    // to create them in a single Mutate request, so they all complete
    // successfully or fail entirely, leaving no orphaned entities. See:
    // https://developers.google.com/google-ads/api/docs/mutating/overview
    List<MutateOperation> mutateOperations = new ArrayList<>();
    mutateOperations.add(createCampaignBudgetOperation(customerId));
    mutateOperations.add(createPerformanceMaxCampaignOperation(customerId));
    mutateOperations.addAll(createCampaignCriterionOperations(customerId));
    String assetGroupResourceName = ResourceNames.assetGroup(customerId, ASSET_GROUP_TEMPORARY_ID);
    mutateOperations.addAll(
        createAssetGroupOperations(
            customerId,
            assetGroupResourceName,
            headlineAssetResourceNames,
            descriptionAssetResourceNames));
    if (audienceId != null) {
      mutateOperations.addAll(
          createAssetGroupSignalOperations(customerId, assetGroupResourceName, audienceId));
    }

    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      MutateGoogleAdsResponse response =
          googleAdsServiceClient.mutate(Long.toString(customerId), mutateOperations);
      printResponseDetails(response);
    }
    // [END add_performance_max_campaign_1]
  }

  // [START add_performance_max_campaign_2]
  /** Creates a MutateOperation that creates a new CampaignBudget. */
  private MutateOperation createCampaignBudgetOperation(long customerId) {
    CampaignBudget campaignBudget =
        CampaignBudget.newBuilder()
            .setName("Performance Max campaign budget #" + getPrintableDateTime())
            // The budget period already defaults to DAILY.
            .setAmountMicros(50_000_000)
            .setDeliveryMethod(BudgetDeliveryMethod.STANDARD)
            // A Performance Max campaign cannot use a shared campaign budget.
            .setExplicitlyShared(false)
            // Set a temporary ID in the budget's resource name, so it can be referenced
            // by the campaign in later steps.
            .setResourceName(ResourceNames.campaignBudget(customerId, BUDGET_TEMPORARY_ID))
            .build();

    return MutateOperation.newBuilder()
        .setCampaignBudgetOperation(
            CampaignBudgetOperation.newBuilder().setCreate(campaignBudget).build())
        .build();
  }
  // [END add_performance_max_campaign_2]

  // [START add_performance_max_campaign_3]
  /** Creates a MutateOperation that creates a new Performance Max campaign. */
  private MutateOperation createPerformanceMaxCampaignOperation(long customerId) {
    Campaign performanceMaxCampaign =
        Campaign.newBuilder()
            .setName("Performance Max campaign #" + getPrintableDateTime())
            // Sets the campaign status as PAUSED. The campaign is the only entity in
            // the mutate request that should have its status set.
            .setStatus(CampaignStatus.PAUSED)
            // All Performance Max campaigns have an advertising_channel_type of
            // PERFORMANCE_MAX. The advertising_channel_sub_type should not be set.
            .setAdvertisingChannelType(AdvertisingChannelType.PERFORMANCE_MAX)
            // Bidding strategy must be set directly on the campaign.
            // Setting a portfolio bidding strategy by resource name is not supported.
            // Max Conversion and Maximize Conversion Value are the only strategies
            // supported for Performance Max campaigns.
            // An optional ROAS (Return on Advertising Spend) can be set for
            // maximize_conversion_value. The ROAS value must be specified as a ratio in
            // the API. It is calculated by dividing "total value" by "total spend".
            // For more information on Maximize Conversion Value, see the support
            // article: http://support.google.com/google-ads/answer/7684216.
            // A targetRoas of 3.5 corresponds to a 350% return on ad spend.
            .setMaximizeConversionValue(
                MaximizeConversionValue.newBuilder().setTargetRoas(3.5).build())
            // Sets the Final URL expansion opt out. This flag is specific to
            // Performance Max campaigns. If opted out (True), only the final URLs in
            // the asset group or URLs specified in the advertiser's Google Merchant
            // Center or business data feeds are targeted.
            // If opted in (False), the entire domain will be targeted. For best
            // results, set this value to false to opt in and allow URL expansions. You
            // can optionally add exclusions to limit traffic to parts of your website.
            .setUrlExpansionOptOut(false)
            // Assigns the resource name with a temporary ID.
            .setResourceName(
                ResourceNames.campaign(customerId, PERFORMANCE_MAX_CAMPAIGN_TEMPORARY_ID))
            // Sets the budget using the given budget resource name.
            .setCampaignBudget(ResourceNames.campaignBudget(customerId, BUDGET_TEMPORARY_ID))
            // Optional fields.
            .setStartDate(new DateTime().plusDays(1).toString("yyyyMMdd"))
            .setEndDate(new DateTime().plusDays(365).toString("yyyyMMdd"))
            .build();

    return MutateOperation.newBuilder()
        .setCampaignOperation(
            CampaignOperation.newBuilder().setCreate(performanceMaxCampaign).build())
        .build();
  }
  // [END add_performance_max_campaign_3]

  // [START add_performance_max_campaign_4]
  /** Creates a list of MutateOperations that create new campaign criteria. */
  private List<MutateOperation> createCampaignCriterionOperations(long customerId) {
    String campaignResourceName =
        ResourceNames.campaign(customerId, PERFORMANCE_MAX_CAMPAIGN_TEMPORARY_ID);
    List<CampaignCriterion> campaignCriteria = new ArrayList<>();
    // Sets the LOCATION campaign criteria.
    // Targets all of New York City except Brooklyn.
    // Location IDs are listed here:
    // https://developers.google.com/google-ads/api/reference/data/geotargets
    // and they can also be retrieved using the GeoTargetConstantService as shown
    // here: https://developers.google.com/google-ads/api/docs/targeting/location-targeting
    //
    // We will add one positive location target for New York City (ID=1023191)
    // and one negative location target for Brooklyn (ID=1022762).
    // First, adds the positive (negative = False) for New York City.
    campaignCriteria.add(
        CampaignCriterion.newBuilder()
            .setCampaign(campaignResourceName)
            .setLocation(
                LocationInfo.newBuilder()
                    .setGeoTargetConstant(ResourceNames.geoTargetConstant(1023191))
                    .build())
            .setNegative(false)
            .build());
    // Next adds the negative target for Brooklyn.
    campaignCriteria.add(
        CampaignCriterion.newBuilder()
            .setCampaign(campaignResourceName)
            .setLocation(
                LocationInfo.newBuilder()
                    .setGeoTargetConstant(ResourceNames.geoTargetConstant(1022762))
                    .build())
            .setNegative(true)
            .build());
    // Sets the LANGUAGE campaign criterion.
    campaignCriteria.add(
        CampaignCriterion.newBuilder()
            .setCampaign(campaignResourceName)
            // Sets the language.
            // For a list of all language codes, see:
            // https://developers.google.com/google-ads/api/reference/data/codes-formats#expandable-7
            .setLanguage(
                LanguageInfo.newBuilder()
                    .setLanguageConstant(ResourceNames.languageConstant(1000)) // English
                    .build())
            .build());
    // Returns a list of mutate operations with one operation per criterion.
    return campaignCriteria.stream()
        .map(
            criterion ->
                MutateOperation.newBuilder()
                    .setCampaignCriterionOperation(
                        CampaignCriterionOperation.newBuilder().setCreate(criterion).build())
                    .build())
        .collect(Collectors.toList());
  }
  // [END add_performance_max_campaign_4]

  // [START add_performance_max_campaign_5]
  /** Creates multiple text assets and returns the list of resource names. */
  private List<String> createMultipleTextAssets(
      GoogleAdsClient googleAdsClient, long customerId, List<String> texts) {
    List<MutateOperation> mutateOperations = new ArrayList<>();
    for (String text : texts) {
      Asset asset = Asset.newBuilder().setTextAsset(TextAsset.newBuilder().setText(text)).build();
      AssetOperation assetOperation = AssetOperation.newBuilder().setCreate(asset).build();
      mutateOperations.add(MutateOperation.newBuilder().setAssetOperation(assetOperation).build());
    }

    List<String> assetResourceNames = new ArrayList<>();
    // Creates the service client.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Sends the operations in a single Mutate request.
      MutateGoogleAdsResponse response =
          googleAdsServiceClient.mutate(Long.toString(customerId), mutateOperations);
      for (MutateOperationResponse result : response.getMutateOperationResponsesList()) {
        if (result.hasAssetResult()) {
          assetResourceNames.add(result.getAssetResult().getResourceName());
        }
      }
      printResponseDetails(response);
    }
    return assetResourceNames;
  }
  // [END add_performance_max_campaign_5]

  // [START add_performance_max_campaign_6]
  /** Creates a list of MutateOperations that create a new AssetGroup. */
  private List<MutateOperation> createAssetGroupOperations(
      long customerId,
      String assetGroupResourceName,
      List<String> headlineAssetResourceNames,
      List<String> descriptionAssetResourceNames)
      throws IOException {
    List<MutateOperation> mutateOperations = new ArrayList<>();
    String campaignResourceName =
        ResourceNames.campaign(customerId, PERFORMANCE_MAX_CAMPAIGN_TEMPORARY_ID);
    // Creates the AssetGroup.
    AssetGroup assetGroup =
        AssetGroup.newBuilder()
            .setName("Performance Max asset group #" + getPrintableDateTime())
            .setCampaign(campaignResourceName)
            .addFinalUrls("http://www.example.com")
            .addFinalMobileUrls("http://www.example.com")
            .setStatus(AssetGroupStatus.PAUSED)
            .setResourceName(assetGroupResourceName)
            .build();
    AssetGroupOperation assetGroupOperation =
        AssetGroupOperation.newBuilder().setCreate(assetGroup).build();
    mutateOperations.add(
        MutateOperation.newBuilder().setAssetGroupOperation(assetGroupOperation).build());

    // For the list of required assets for a Performance Max campaign, see
    // https://developers.google.com/google-ads/api/docs/performance-max/assets

    // An AssetGroup is linked to an Asset by creating a new AssetGroupAsset
    // and providing:
    //   the resource name of the AssetGroup
    //   the resource name of the Asset
    //   the field_type of the Asset in this AssetGroup.

    // To learn more about AssetGroups, see
    // https://developers.google.com/google-ads/api/docs/performance-max/asset-groups

    // Links the previously created multiple text assets.

    // Links the headline assets.
    for (String resourceName : headlineAssetResourceNames) {
      AssetGroupAsset assetGroupAsset =
          AssetGroupAsset.newBuilder()
              .setFieldType(AssetFieldType.HEADLINE)
              .setAssetGroup(assetGroupResourceName)
              .setAsset(resourceName)
              .build();
      AssetGroupAssetOperation assetGroupAssetOperation =
          AssetGroupAssetOperation.newBuilder().setCreate(assetGroupAsset).build();
      mutateOperations.add(
          MutateOperation.newBuilder()
              .setAssetGroupAssetOperation(assetGroupAssetOperation)
              .build());
    }

    // Links the description assets.
    for (String resourceName : descriptionAssetResourceNames) {
      AssetGroupAsset assetGroupAsset =
          AssetGroupAsset.newBuilder()
              .setFieldType(AssetFieldType.DESCRIPTION)
              .setAssetGroup(assetGroupResourceName)
              .setAsset(resourceName)
              .build();
      AssetGroupAssetOperation assetGroupAssetOperation =
          AssetGroupAssetOperation.newBuilder().setCreate(assetGroupAsset).build();
      mutateOperations.add(
          MutateOperation.newBuilder()
              .setAssetGroupAssetOperation(assetGroupAssetOperation)
              .build());
    }

    // Creates and links the long headline text asset.
    List<MutateOperation> createAndLinkTextAssetOperations =
        createAndLinkTextAsset(customerId, "Travel the World", AssetFieldType.LONG_HEADLINE);
    mutateOperations.addAll(createAndLinkTextAssetOperations);

    // Creates and links the business name text asset.
    createAndLinkTextAssetOperations =
        createAndLinkTextAsset(customerId, "Interplanetary Cruises", AssetFieldType.BUSINESS_NAME);
    mutateOperations.addAll(createAndLinkTextAssetOperations);

    // Creates and links the image assets.

    // Creates and links the Logo Asset.
    createAndLinkTextAssetOperations =
        createAndLinkImageAsset(
            customerId, "https://gaagl.page.link/bjYi", AssetFieldType.LOGO, "Marketing Logo");
    mutateOperations.addAll(createAndLinkTextAssetOperations);

    // Creates and links the Marketing Image Asset.
    createAndLinkTextAssetOperations =
        createAndLinkImageAsset(
            customerId,
            "https://gaagl.page.link/Eit5",
            AssetFieldType.MARKETING_IMAGE,
            "Marketing Image");
    mutateOperations.addAll(createAndLinkTextAssetOperations);

    // Creates and links the Square Marketing Image Asset.
    createAndLinkTextAssetOperations =
        createAndLinkImageAsset(
            customerId,
            "https://gaagl.page.link/bjYi",
            AssetFieldType.SQUARE_MARKETING_IMAGE,
            "Square Marketing Image");
    mutateOperations.addAll(createAndLinkTextAssetOperations);

    return mutateOperations;
  }
  // [END add_performance_max_campaign_6]

  // [START add_performance_max_campaign_7]
  /** Creates a list of MutateOperations that create a new linked text asset. */
  List<MutateOperation> createAndLinkTextAsset(
      long customerId, String text, AssetFieldType assetFieldType) {
    List<MutateOperation> mutateOperations = new ArrayList<>();
    String assetResourceName = ResourceNames.asset(customerId, getNextTemporaryId());
    // Creates the Text Asset.
    Asset asset =
        Asset.newBuilder()
            .setResourceName(assetResourceName)
            .setTextAsset(TextAsset.newBuilder().setText(text).build())
            .build();
    AssetOperation assetOperation = AssetOperation.newBuilder().setCreate(asset).build();
    mutateOperations.add(MutateOperation.newBuilder().setAssetOperation(assetOperation).build());

    // Creates an AssetGroupAsset to link the Asset to the AssetGroup.
    AssetGroupAsset assetGroupAsset =
        AssetGroupAsset.newBuilder()
            .setFieldType(assetFieldType)
            .setAssetGroup(ResourceNames.assetGroup(customerId, ASSET_GROUP_TEMPORARY_ID))
            .setAsset(assetResourceName)
            .build();
    AssetGroupAssetOperation assetGroupAssetOperation =
        AssetGroupAssetOperation.newBuilder().setCreate(assetGroupAsset).build();
    mutateOperations.add(
        MutateOperation.newBuilder().setAssetGroupAssetOperation(assetGroupAssetOperation).build());

    return mutateOperations;
  }
  // [END add_performance_max_campaign_7]

  // [START add_performance_max_campaign_8]
  /** Creates a list of MutateOperations that create a new linked image asset. */
  List<MutateOperation> createAndLinkImageAsset(
      long customerId, String url, AssetFieldType assetFieldType, String assetName)
      throws IOException {
    List<MutateOperation> mutateOperations = new ArrayList<>();
    String assetResourceName = ResourceNames.asset(customerId, getNextTemporaryId());
    // Creates a media file.
    byte[] assetBytes = ByteStreams.toByteArray(new URL(url).openStream());

    // Creates the Image Asset.
    Asset asset =
        Asset.newBuilder()
            .setResourceName(assetResourceName)
            .setImageAsset(ImageAsset.newBuilder().setData(ByteString.copyFrom(assetBytes)).build())
            // Provides a unique friendly name to identify your asset. When there is an existing
            // image asset with the same content but a different name, the new name will be dropped
            // silently.
            .setName(assetName)
            .build();
    AssetOperation assetOperation = AssetOperation.newBuilder().setCreate(asset).build();
    mutateOperations.add(MutateOperation.newBuilder().setAssetOperation(assetOperation).build());

    // Creates an AssetGroupAsset to link the Asset to the AssetGroup.
    AssetGroupAsset assetGroupAsset =
        AssetGroupAsset.newBuilder()
            .setFieldType(assetFieldType)
            .setAssetGroup(ResourceNames.assetGroup(customerId, ASSET_GROUP_TEMPORARY_ID))
            .setAsset(assetResourceName)
            .build();
    AssetGroupAssetOperation assetGroupAssetOperation =
        AssetGroupAssetOperation.newBuilder().setCreate(assetGroupAsset).build();
    mutateOperations.add(
        MutateOperation.newBuilder().setAssetGroupAssetOperation(assetGroupAssetOperation).build());

    return mutateOperations;
  }
  // [END add_performance_max_campaign_8]

  // [START add_performance_max_campaign_9]
  /**
   * Creates a list of MutateOperations that create {@link
   * com.google.ads.googleads.v17.resources.AssetGroupSignal} objects.
   */
  private List<MutateOperation> createAssetGroupSignalOperations(
      long customerId, String assetGroupResourceName, Long audienceId) {
    List<MutateOperation> mutateOperations = new ArrayList<>();
    AssetGroupSignal assetGroupSignal =
        AssetGroupSignal.newBuilder()
            .setAssetGroup(assetGroupResourceName)
            .setAudience(
                AudienceInfo.newBuilder()
                    .setAudience(ResourceNames.audience(customerId, audienceId)))
            .build();
    // Adds an operation to the list to create the asset group signal.
    mutateOperations.add(
        MutateOperation.newBuilder()
            .setAssetGroupSignalOperation(
                AssetGroupSignalOperation.newBuilder().setCreate(assetGroupSignal))
            .build());
    return mutateOperations;
  }
  // [END add_performance_max_campaign_9]

  /**
   * Prints the details of a MutateGoogleAdsResponse.
   *
   * <p>Parses the "response" oneof field name and uses it to extract the new entity's name and
   * resource name.
   */
  private void printResponseDetails(MutateGoogleAdsResponse response) {
    // Parses the Mutate response to print details about the entities that were created by the
    // request.
    String suffix = "_result";
    for (MutateOperationResponse result : response.getMutateOperationResponsesList()) {
      for (Entry<FieldDescriptor, Object> responseFields : result.getAllFields().entrySet()) {
        String fieldName = responseFields.getKey().getName();
        String value = responseFields.getValue().toString().trim();
        if (fieldName.endsWith(suffix)) {
          fieldName = fieldName.substring(0, fieldName.length() - suffix.length());
        }
        System.out.printf("Created a(n) %s with %s.%n", fieldName, value);
      }
    }
  }

  /** Returns the next temporary ID and decreases it by one. */
  private long getNextTemporaryId() {
    return temporaryId--;
  }
  // [END add_performance_max_campaign]
}

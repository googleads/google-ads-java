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

package com.google.ads.googleads.examples.shoppingads;

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v18.common.ImageAsset;
import com.google.ads.googleads.v18.common.LanguageInfo;
import com.google.ads.googleads.v18.common.LocationInfo;
import com.google.ads.googleads.v18.common.MaximizeConversionValue;
import com.google.ads.googleads.v18.common.TextAsset;
import com.google.ads.googleads.v18.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v18.enums.AssetFieldTypeEnum.AssetFieldType;
import com.google.ads.googleads.v18.enums.AssetGroupStatusEnum.AssetGroupStatus;
import com.google.ads.googleads.v18.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v18.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v18.enums.ConversionActionCategoryEnum.ConversionActionCategory;
import com.google.ads.googleads.v18.enums.ConversionOriginEnum.ConversionOrigin;
import com.google.ads.googleads.v18.enums.ListingGroupFilterListingSourceEnum.ListingGroupFilterListingSource;
import com.google.ads.googleads.v18.enums.ListingGroupFilterTypeEnum.ListingGroupFilterType;
import com.google.ads.googleads.v18.errors.GoogleAdsError;
import com.google.ads.googleads.v18.errors.GoogleAdsException;
import com.google.ads.googleads.v18.resources.Asset;
import com.google.ads.googleads.v18.resources.AssetGroup;
import com.google.ads.googleads.v18.resources.AssetGroupAsset;
import com.google.ads.googleads.v18.resources.AssetGroupListingGroupFilter;
import com.google.ads.googleads.v18.resources.Campaign;
import com.google.ads.googleads.v18.resources.Campaign.ShoppingSetting;
import com.google.ads.googleads.v18.resources.CampaignBudget;
import com.google.ads.googleads.v18.resources.CampaignConversionGoal;
import com.google.ads.googleads.v18.resources.CampaignCriterion;
import com.google.ads.googleads.v18.resources.CustomerConversionGoal;
import com.google.ads.googleads.v18.services.AssetGroupAssetOperation;
import com.google.ads.googleads.v18.services.AssetGroupListingGroupFilterOperation;
import com.google.ads.googleads.v18.services.AssetGroupOperation;
import com.google.ads.googleads.v18.services.AssetOperation;
import com.google.ads.googleads.v18.services.CampaignBudgetOperation;
import com.google.ads.googleads.v18.services.CampaignConversionGoalOperation;
import com.google.ads.googleads.v18.services.CampaignCriterionOperation;
import com.google.ads.googleads.v18.services.CampaignOperation;
import com.google.ads.googleads.v18.services.GoogleAdsRow;
import com.google.ads.googleads.v18.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v18.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v18.services.MutateGoogleAdsResponse;
import com.google.ads.googleads.v18.services.MutateOperation;
import com.google.ads.googleads.v18.services.MutateOperationResponse;
import com.google.ads.googleads.v18.utils.ResourceNames;
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
 * This example shows how to create a Performance Max retail campaign.
 *
 * <p>This will be created for "All products".
 *
 * <p>For more information about Performance Max retail campaigns, see
 * https://developers.google.com/google-ads/api/docs/performance-max/retail
 *
 * <p>Prerequisites: - You need to have access to a Merchant Center account. You can find
 * instructions to create a Merchant Center account here:
 * https://support.google.com/merchants/answer/188924. This account must be linked to your Google
 * Ads account. The integration instructions can be found at:
 * https://developers.google.com/google-ads/api/docs/shopping-ads/merchant-center - You need your
 * Google Ads account to track conversions. The different ways to track conversions can be found
 * here: https://support.google.com/google-ads/answer/1722054. - You must have at least one
 * conversion action in the account. For more about conversion actions, see
 * https://developers.google.com/google-ads/api/docs/conversions/overview#conversion_actions
 */
public class AddPerformanceMaxRetailCampaign {

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

  private static class AddPerformanceMaxRetailCampaignParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(
        names = ArgumentNames.MERCHANT_CENTER_ACCOUNT_ID,
        required = true,
        description = "The Merchant Center account ID.")
    private long merchantCenterAccountId;

    @Parameter(
        names = ArgumentNames.SALES_COUNTRY,
        description = "The sales country of products to include in the campaign.")
    private String salesCountry = "US";

    @Parameter(
        names = ArgumentNames.FINAL_URL,
        required = true,
        description =
            "The final url for the generated ads. Must have the same domain as the Merchant Center"
                + " account.")
    private String finalUrl;
  }

  public static void main(String[] args) throws IOException {
    AddPerformanceMaxRetailCampaignParams params = new AddPerformanceMaxRetailCampaignParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.merchantCenterAccountId = Long.parseLong("INSERT_MERCHANT_CENTER_ACCOUNT_ID_HERE");
      params.finalUrl = "INSERT_FINAL_URL_HERE";

      // Optionally set the sales country.
      // params.salesCountry = "INSERT_SALES_COUNTRY_HERE";
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
      new AddPerformanceMaxRetailCampaign()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.merchantCenterAccountId,
              params.salesCountry,
              params.finalUrl);
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

  // [START add_performance_max_retail_campaign]
  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param merchantCenterAccountId the Merchant Center account ID.
   * @param salesCountry sales country of products to include in the campaign.
   * @param finalUrl final URL for the asset group of the campaign.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long merchantCenterAccountId,
      String salesCountry,
      String finalUrl)
      throws IOException {
    // [START add_performance_max_retail_campaign_1]
    // This campaign will override the customer conversion goals. For more information see
    // https://developers.google.com/google-ads/api/docs/conversions/goals/campaign-goals.
    // Retrieve the current list of customer conversion goals.
    List<CustomerConversionGoal> customerConversionGoals =
        getCustomerConversionGoals(googleAdsClient, customerId);

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
    mutateOperations.add(
        createPerformanceMaxCampaignOperation(customerId, merchantCenterAccountId, salesCountry));
    mutateOperations.addAll(createCampaignCriterionOperations(customerId));
    String assetGroupResourceName = ResourceNames.assetGroup(customerId, ASSET_GROUP_TEMPORARY_ID);
    mutateOperations.add(createAssetGroupOperation(customerId, assetGroupResourceName, finalUrl));
    // Retail Performance Max campaigns require listing groups, which are created via the
    // AssetGroupListingGroupFilter resource.
    mutateOperations.add(createAssetGroupListingGroupFilterOperation(assetGroupResourceName));
    mutateOperations.addAll(
        createAssetAndAssetGroupAssetOperations(
            customerId,
            assetGroupResourceName,
            headlineAssetResourceNames,
            descriptionAssetResourceNames));
    mutateOperations.addAll(createConversionGoalOperations(customerId, customerConversionGoals));

    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      MutateGoogleAdsResponse response =
          googleAdsServiceClient.mutate(Long.toString(customerId), mutateOperations);
      printResponseDetails(response);
    }
    // [END add_performance_max_retail_campaign_1]
  }

  // [START add_performance_max_retail_campaign_2]
  /** Creates a MutateOperation that creates a new CampaignBudget. */
  private MutateOperation createCampaignBudgetOperation(long customerId) {
    CampaignBudget campaignBudget =
        CampaignBudget.newBuilder()
            .setName("Performance Max retail campaign budget #" + getPrintableDateTime())
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

  // [END add_performance_max_retail_campaign_2]

  // [START add_performance_max_retail_campaign_3]
  /** Creates a MutateOperation that creates a new Performance Max campaign. */
  private MutateOperation createPerformanceMaxCampaignOperation(
      long customerId, long merchantCenterAccountId, String salesCountry) {
    Campaign performanceMaxCampaign =
        Campaign.newBuilder()
            .setName("Performance Max retail campaign #" + getPrintableDateTime())
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
            // For first time users, it's recommended not to set a target ROAS value. Although
            // the target ROAS value is optional, you still need to define the enclosing
            // maximize_conversion_value.
            .setMaximizeConversionValue(
                MaximizeConversionValue.newBuilder()
                    // .setTargetRoas(3.5)
                    .build())
            // Below is what you would use if you want to maximize conversions:
            // .setMaximizeConversions(
            //     MaximizeConversions.newBuilder()
            //         // The target CPA is optional. This is the average amount that you would like
            //         // to spend per conversion action.
            //         // .setTargetCpaMicros(1_000_000)
            //         .build())
            // Sets the shopping settings.
            .setShoppingSetting(
                ShoppingSetting.newBuilder()
                    .setMerchantId(merchantCenterAccountId)
                    // Optional: To use products only from a specific feed, set FeedLabel to the
                    // feed label used in Merchant Center. See:
                    // https://support.google.com/merchants/answer/12453549.
                    // Removing the feedLabel field will use products from all feeds.
                    // .setFeedLabel("INSERT_FEED_LABEL_HERE")
                    .build())
            // Sets the Final URL expansion opt out. This flag is specific to
            // Performance Max campaigns. If opted out (true), only the final URLs in
            // the asset group or URLs specified in the advertiser's Google Merchant
            // Center or business data feeds are targeted.
            //
            // If opted in (false), the entire domain will be targeted. For best
            // results, set this value to false to opt in and allow URL expansions. You
            // can optionally add exclusions to limit traffic to parts of your website.
            //
            // Sets to true for this Retail campaign so the final URLs will be limited to those
            // explicitly surfaced via Google Merchant Center.
            .setUrlExpansionOptOut(true)
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

  // [END add_performance_max_retail_campaign_3]

  // [START add_performance_max_retail_campaign_4]
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
    campaignCriteria.add(
        CampaignCriterion.newBuilder()
            .setCampaign(campaignResourceName)
            // Adds one positive location target for New York City (ID=1023191), specifically adding
            // the positive criteria before the negative one.
            .setLocation(
                LocationInfo.newBuilder()
                    .setGeoTargetConstant(ResourceNames.geoTargetConstant(1023191))
                    .build())
            .setNegative(false)
            .build());
    // Next adds the negative target for Brooklyn (ID=1022762).
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

  // [END add_performance_max_retail_campaign_4]

  // [START add_performance_max_retail_campaign_5]
  /**
   * Creates multiple text assets and returns the list of resource names.
   *
   * <p>These repeated assets must be created in a separate request prior to creating the campaign.
   */
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

  // [END add_performance_max_retail_campaign_5]

  // [START add_performance_max_retail_campaign_10]
  /** Creates a MutateOperation that create a new AssetGroup. */
  private MutateOperation createAssetGroupOperation(
      long customerId, String assetGroupResourceName, String finalUrl) {
    List<MutateOperation> mutateOperations = new ArrayList<>();
    String campaignResourceName =
        ResourceNames.campaign(customerId, PERFORMANCE_MAX_CAMPAIGN_TEMPORARY_ID);
    // Creates the AssetGroup.
    AssetGroup assetGroup =
        AssetGroup.newBuilder()
            .setName("Performance Max retail asset group #" + getPrintableDateTime())
            .setCampaign(campaignResourceName)
            .addFinalUrls(finalUrl)
            .addFinalMobileUrls(finalUrl)
            .setStatus(AssetGroupStatus.PAUSED)
            .setResourceName(assetGroupResourceName)
            .build();
    AssetGroupOperation assetGroupOperation =
        AssetGroupOperation.newBuilder().setCreate(assetGroup).build();
    return MutateOperation.newBuilder().setAssetGroupOperation(assetGroupOperation).build();
  }

  // [END add_performance_max_retail_campaign_10]

  // [START add_performance_max_retail_campaign_6]
  /** Creates a list of MutateOperations that create a new AssetGroup. */
  private List<MutateOperation> createAssetAndAssetGroupAssetOperations(
      long customerId,
      String assetGroupResourceName,
      List<String> headlineAssetResourceNames,
      List<String> descriptionAssetResourceNames)
      throws IOException {
    List<MutateOperation> mutateOperations = new ArrayList<>();

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
    mutateOperations.addAll(
        createAndLinkTextAsset(
            customerId, assetGroupResourceName, "Travel the World", AssetFieldType.LONG_HEADLINE));

    // Creates and links the business name text asset.
    mutateOperations.addAll(
        createAndLinkTextAsset(
            customerId,
            assetGroupResourceName,
            "Interplanetary Cruises",
            AssetFieldType.BUSINESS_NAME));

    // Creates and links the image assets.

    // Creates and links the Logo Asset.
    mutateOperations.addAll(
        createAndLinkImageAsset(
            customerId,
            assetGroupResourceName,
            "https://gaagl.page.link/1Crm",
            AssetFieldType.LOGO,
            "Logo Image"));

    // Creates and links the Marketing Image Asset.
    mutateOperations.addAll(
        createAndLinkImageAsset(
            customerId,
            assetGroupResourceName,
            "https://gaagl.page.link/Eit5",
            AssetFieldType.MARKETING_IMAGE,
            "Marketing Image"));

    // Creates and links the Square Marketing Image Asset.
    mutateOperations.addAll(
        createAndLinkImageAsset(
            customerId,
            assetGroupResourceName,
            "https://gaagl.page.link/bjYi",
            AssetFieldType.SQUARE_MARKETING_IMAGE,
            "Square Marketing Image"));

    return sortAssetAndAssetGroupAssetOperations(mutateOperations);
  }

  // [END add_performance_max_retail_campaign_6]

  // [START add_performance_max_retail_campaign_7]
  /** Creates a list of MutateOperations that create a new linked text asset. */
  List<MutateOperation> createAndLinkTextAsset(
      long customerId, String assetGroupResourceName, String text, AssetFieldType assetFieldType) {
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
            .setAssetGroup(assetGroupResourceName)
            .setAsset(assetResourceName)
            .build();
    AssetGroupAssetOperation assetGroupAssetOperation =
        AssetGroupAssetOperation.newBuilder().setCreate(assetGroupAsset).build();
    mutateOperations.add(
        MutateOperation.newBuilder().setAssetGroupAssetOperation(assetGroupAssetOperation).build());

    return mutateOperations;
  }

  // [END add_performance_max_retail_campaign_7]

  // [START add_performance_max_retail_campaign_8]
  /** Creates a list of MutateOperations that create a new linked image asset. */
  List<MutateOperation> createAndLinkImageAsset(
      long customerId,
      String assetGroupResourceName,
      String url,
      AssetFieldType assetFieldType,
      String assetName)
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
            .setAssetGroup(assetGroupResourceName)
            .setAsset(assetResourceName)
            .build();
    AssetGroupAssetOperation assetGroupAssetOperation =
        AssetGroupAssetOperation.newBuilder().setCreate(assetGroupAsset).build();
    mutateOperations.add(
        MutateOperation.newBuilder().setAssetGroupAssetOperation(assetGroupAssetOperation).build());

    return mutateOperations;
  }

  // [END add_performance_max_retail_campaign_8]

  // [START add_performance_max_retail_campaign_12]
  /**
   * Sorts a list of asset and asset group asset operations.
   *
   * <p>This sorts the list such that all asset operations precede all asset group asset operations.
   * If asset group assets are created before assets then an error will be returned by the API.
   */
  private List<MutateOperation> sortAssetAndAssetGroupAssetOperations(
      List<MutateOperation> operations) {
    List<MutateOperation> sortedOperations =
        operations.stream().filter(o -> o.hasAssetOperation()).collect(Collectors.toList());
    sortedOperations.addAll(
        operations.stream()
            .filter(o -> o.hasAssetGroupAssetOperation())
            .collect(Collectors.toList()));
    return sortedOperations;
  }

  // [END add_performance_max_retail_campaign_12]

  // [START add_performance_max_retail_campaign_9]
  /** Retrieves the list of customer conversion goals. */
  private static List<CustomerConversionGoal> getCustomerConversionGoals(
      GoogleAdsClient googleAdsClient, long customerId) {
    String query =
        "SELECT customer_conversion_goal.category, customer_conversion_goal.origin "
            + "FROM customer_conversion_goal";

    List<CustomerConversionGoal> customerConversionGoals = new ArrayList<>();
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // The number of conversion goals is typically less than 50, so we use
      // GoogleAdsService.search instead of search_stream.
      SearchPagedResponse response =
          googleAdsServiceClient.search(Long.toString(customerId), query);
      for (GoogleAdsRow googleAdsRow : response.iterateAll()) {
        customerConversionGoals.add(googleAdsRow.getCustomerConversionGoal());
      }
    }

    return customerConversionGoals;
  }

  /** Creates a list of MutateOperations that override customer conversion goals. */
  private static List<MutateOperation> createConversionGoalOperations(
      long customerId, List<CustomerConversionGoal> customerConversionGoals) {
    List<MutateOperation> mutateOperations = new ArrayList<>();
    // To override the customer conversion goals, we will change the
    // biddability of each of the customer conversion goals so that only
    // the desired conversion goal is biddable in this campaign.
    for (CustomerConversionGoal customerConversionGoal : customerConversionGoals) {
      ConversionActionCategory category = customerConversionGoal.getCategory();
      ConversionOrigin origin = customerConversionGoal.getOrigin();
      String campaignConversionGoalResourceName =
          ResourceNames.campaignConversionGoal(
              customerId, PERFORMANCE_MAX_CAMPAIGN_TEMPORARY_ID, category, origin);
      CampaignConversionGoal.Builder campaignConversionGoalBuilder =
          CampaignConversionGoal.newBuilder().setResourceName(campaignConversionGoalResourceName);
      // Change the biddability for the campaign conversion goal.
      // Set biddability to True for the desired (category, origin).
      // Set biddability to False for all other conversion goals.
      // Note:
      //  1- It is assumed that this Conversion Action
      //     (category=PURCHASE, origin=WEBSITE) exists in this account.
      //  2- More than one goal can be biddable if desired. This example
      //     shows only one.
      if (category == ConversionActionCategory.PURCHASE && origin == ConversionOrigin.WEBSITE) {
        campaignConversionGoalBuilder.setBiddable(true);
      } else {
        campaignConversionGoalBuilder.setBiddable(false);
      }
      CampaignConversionGoal campaignConversionGoal = campaignConversionGoalBuilder.build();
      CampaignConversionGoalOperation campaignConversionGoalOperation =
          CampaignConversionGoalOperation.newBuilder()
              .setUpdate(campaignConversionGoal)
              .setUpdateMask(FieldMasks.allSetFieldsOf(campaignConversionGoal))
              .build();
      mutateOperations.add(
          MutateOperation.newBuilder()
              .setCampaignConversionGoalOperation(campaignConversionGoalOperation)
              .build());
    }
    return mutateOperations;
  }

  // [END add_performance_max_retail_campaign_9]

  // [START add_performance_max_retail_campaign_11]
  /** Creates a MutateOperation that creates a new asset group listing group filter. */
  private MutateOperation createAssetGroupListingGroupFilterOperation(
      String assetGroupResourceName) {

    // Creates a new asset group listing group filter containing the "default" listing group (All
    // products).
    AssetGroupListingGroupFilter listingGroupFilter =
        AssetGroupListingGroupFilter.newBuilder()
            .setAssetGroup(assetGroupResourceName)
            // Does not set the parentListingGroupFilter since this is the root node. For all other
            // nodes, this would refer to the parent listing group filter resource name.
            // .setParentListingGroupFilter("<PARENT FILTER RESOURCE NAME>")

            // Sets the type to UNIT_INCLUDED since this node has no children.
            .setType(ListingGroupFilterType.UNIT_INCLUDED)
            // Specifies that this uses the SHOPPING listing source, as required for a Performance
            // Max retail campaign.
            .setListingSource(ListingGroupFilterListingSource.SHOPPING)
            .build();

    // Returns an operation to the list to create the listing group filter.
    return MutateOperation.newBuilder()
        .setAssetGroupListingGroupFilterOperation(
            AssetGroupListingGroupFilterOperation.newBuilder().setCreate(listingGroupFilter))
        .build();
  }

  // [END add_performance_max_retail_campaign_11]

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
  // [END add_performance_max_retail_campaign]
}

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

package com.google.ads.googleads.examples.basicoperations;

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v13.common.AdTextAsset;
import com.google.ads.googleads.v13.common.ImageAsset;
import com.google.ads.googleads.v13.common.ImageFeedItem;
import com.google.ads.googleads.v13.common.KeywordInfo;
import com.google.ads.googleads.v13.common.LocationInfo;
import com.google.ads.googleads.v13.common.ResponsiveSearchAdInfo;
import com.google.ads.googleads.v13.common.TargetSpend;
import com.google.ads.googleads.v13.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v13.enums.AdGroupCriterionStatusEnum.AdGroupCriterionStatus;
import com.google.ads.googleads.v13.enums.AdGroupStatusEnum.AdGroupStatus;
import com.google.ads.googleads.v13.enums.AdGroupTypeEnum.AdGroupType;
import com.google.ads.googleads.v13.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v13.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v13.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v13.enums.ExtensionTypeEnum.ExtensionType;
import com.google.ads.googleads.v13.enums.KeywordMatchTypeEnum.KeywordMatchType;
import com.google.ads.googleads.v13.enums.MimeTypeEnum.MimeType;
import com.google.ads.googleads.v13.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType;
import com.google.ads.googleads.v13.errors.GoogleAdsError;
import com.google.ads.googleads.v13.errors.GoogleAdsException;
import com.google.ads.googleads.v13.resources.Ad;
import com.google.ads.googleads.v13.resources.AdGroup;
import com.google.ads.googleads.v13.resources.AdGroupAd;
import com.google.ads.googleads.v13.resources.AdGroupCriterion;
import com.google.ads.googleads.v13.resources.Asset;
import com.google.ads.googleads.v13.resources.Campaign;
import com.google.ads.googleads.v13.resources.Campaign.NetworkSettings;
import com.google.ads.googleads.v13.resources.CampaignBudget;
import com.google.ads.googleads.v13.resources.CampaignCriterion;
import com.google.ads.googleads.v13.resources.CampaignExtensionSetting;
import com.google.ads.googleads.v13.resources.ExtensionFeedItem;
import com.google.ads.googleads.v13.resources.GeoTargetConstant;
import com.google.ads.googleads.v13.services.AdGroupAdOperation;
import com.google.ads.googleads.v13.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v13.services.AdGroupCriterionOperation;
import com.google.ads.googleads.v13.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v13.services.AdGroupOperation;
import com.google.ads.googleads.v13.services.AdGroupServiceClient;
import com.google.ads.googleads.v13.services.AssetOperation;
import com.google.ads.googleads.v13.services.AssetServiceClient;
import com.google.ads.googleads.v13.services.CampaignBudgetOperation;
import com.google.ads.googleads.v13.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v13.services.CampaignCriterionOperation;
import com.google.ads.googleads.v13.services.CampaignCriterionServiceClient;
import com.google.ads.googleads.v13.services.CampaignExtensionSettingOperation;
import com.google.ads.googleads.v13.services.CampaignExtensionSettingServiceClient;
import com.google.ads.googleads.v13.services.CampaignOperation;
import com.google.ads.googleads.v13.services.CampaignServiceClient;
import com.google.ads.googleads.v13.services.ExtensionFeedItemOperation;
import com.google.ads.googleads.v13.services.ExtensionFeedItemServiceClient;
import com.google.ads.googleads.v13.services.GeoTargetConstantServiceClient;
import com.google.ads.googleads.v13.services.GeoTargetConstantSuggestion;
import com.google.ads.googleads.v13.services.MutateAdGroupAdsResponse;
import com.google.ads.googleads.v13.services.MutateAdGroupCriteriaResponse;
import com.google.ads.googleads.v13.services.MutateAdGroupCriterionResult;
import com.google.ads.googleads.v13.services.MutateAdGroupsResponse;
import com.google.ads.googleads.v13.services.MutateAssetsResponse;
import com.google.ads.googleads.v13.services.MutateCampaignBudgetsResponse;
import com.google.ads.googleads.v13.services.MutateCampaignCriteriaResponse;
import com.google.ads.googleads.v13.services.MutateCampaignCriterionResult;
import com.google.ads.googleads.v13.services.MutateCampaignExtensionSettingsResponse;
import com.google.ads.googleads.v13.services.MutateCampaignsResponse;
import com.google.ads.googleads.v13.services.MutateExtensionFeedItemsResponse;
import com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsRequest;
import com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsRequest.LocationNames;
import com.google.ads.googleads.v13.services.SuggestGeoTargetConstantsResponse;
import com.google.common.collect.ImmutableList;
import com.google.common.io.ByteStreams;
import com.google.protobuf.ByteString;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.joda.time.DateTime;

/**
 * Creates a complete Responsive Search ad.
 *
 * <p>Includes creation of: budget, campaign, ad group, ad group ad, keywords, geo targeting, and
 * image extensions.
 *
 * <p>More details on Responsive Search ads can be found here:
 * https://support.google.com/google-ads/answer/7684791
 */
public class AddResponsiveSearchAd {

  private static class AddResponsiveSearchAdParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(
        names = ArgumentNames.INCLUDE_IMAGE_EXTENSIONS,
        required = false,
        arity = 1,
        description = "Whether to include image extensions in the created campaign.")
    private Boolean includeImageExtensions = true;
  }

  public static void main(String[] args) {
    AddResponsiveSearchAdParams params = new AddResponsiveSearchAdParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.includeImageExtensions = Boolean.parseBoolean("INSERT_INCLUDE_IMAGE_EXTENSIONS_HERE");
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
      new AddResponsiveSearchAd()
          .runExample(googleAdsClient, params.customerId, params.includeImageExtensions);
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
   * @param includeImageExtensions whether to include image extensions in the campaign.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, boolean includeImageExtensions) {
    String campaignBudgetResourceName = createCampaignBudget(googleAdsClient, customerId);

    String campaignResourceName =
        createCampaign(googleAdsClient, customerId, campaignBudgetResourceName);
    String adGroupResourceName = createAdGroup(googleAdsClient, customerId, campaignResourceName);
    createAdGroupAd(googleAdsClient, customerId, adGroupResourceName);

    addKeywords(googleAdsClient, customerId, adGroupResourceName);
    addGeoTargeting(googleAdsClient, customerId, campaignResourceName);

    // This is optional but recommended for an RSA.
    // To add image extensions, the account has to follow these requirements:
    // https://support.google.com/google-ads/answer/9566341
    // If the account meets the requirements, set below variable to true.
    if (includeImageExtensions) {
      addImages(googleAdsClient, customerId, campaignResourceName);
    }
  }

  /**
   * Creates a new CampaignBudget in the specified client account.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @return resource name of the newly created budget.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private static String createCampaignBudget(GoogleAdsClient googleAdsClient, long customerId) {
    CampaignBudget budget =
        CampaignBudget.newBuilder()
            .setName("Campaign budget #" + getPrintableDateTime())
            .setDeliveryMethod(BudgetDeliveryMethod.STANDARD)
            .setAmountMicros(500_000)
            .build();

    CampaignBudgetOperation op = CampaignBudgetOperation.newBuilder().setCreate(budget).build();

    try (CampaignBudgetServiceClient campaignBudgetServiceClient =
        googleAdsClient.getLatestVersion().createCampaignBudgetServiceClient()) {
      MutateCampaignBudgetsResponse response =
          campaignBudgetServiceClient.mutateCampaignBudgets(
              Long.toString(customerId), ImmutableList.of(op));
      String budgetResourceName = response.getResults(0).getResourceName();
      System.out.printf("Created campaign budget: %s%n", budgetResourceName);
      return budgetResourceName;
    }
  }

  /**
   * Creates a new Campaign.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignBudgetResourceName the resource name of the campaign budget to use with the new
   *     campaign.
   * @return the resource name of the new campaign.
   */
  private String createCampaign(
      GoogleAdsClient googleAdsClient, long customerId, String campaignBudgetResourceName) {

    Campaign campaign =
        Campaign.newBuilder()
            .setName("Testing RSA via API #" + getPrintableDateTime())
            .setAdvertisingChannelType(AdvertisingChannelType.SEARCH)
            // Recommendation: Set the campaign to PAUSED when creating it to prevent
            // the ads from immediately serving. Set to ENABLED once you've added
            // targeting and the ads are ready to serve.
            .setStatus(CampaignStatus.PAUSED)
            // Sets the bidding strategy.
            // The API bidding strategy for "Maximize Clicks" in the UI is TargetSpend. See other
            // bidding strategies you can select in the link below:
            // https://developers.google.com/google-ads/api/reference/rpc/latest/Campaign#campaign_bidding_strategy
            .setTargetSpend(
                TargetSpend.newBuilder()
                    // The target_spend_micros field is deprecated so don't set its value.
                    .build())
            // Sets the budget.
            .setCampaignBudget(campaignBudgetResourceName)
            // Sets the network settings.
            .setNetworkSettings(
                NetworkSettings.newBuilder()
                    .setTargetGoogleSearch(true)
                    .setTargetSearchNetwork(true)
                    .setTargetPartnerSearchNetwork(false)
                    // Enable Display Expansion on Search campaigns. For more details see:
                    // https://support.google.com/google-ads/answer/7193800
                    .setTargetContentNetwork(true)
                    .build())
            // Optional: Sets the start & end dates.
            .setStartDate(new DateTime().plusDays(1).toString("yyyyMMdd"))
            .setEndDate(new DateTime().plusWeeks(4).toString("yyyyMMdd"))
            .build();

    CampaignOperation campaignOperation =
        CampaignOperation.newBuilder().setCreate(campaign).build();
    try (CampaignServiceClient campaignServiceClient =
        googleAdsClient.getLatestVersion().createCampaignServiceClient()) {
      MutateCampaignsResponse response =
          campaignServiceClient.mutateCampaigns(
              Long.toString(customerId), Collections.singletonList(campaignOperation));
      String campaignResourceName = response.getResults(0).getResourceName();
      System.out.printf("Created campaign: %s%n", campaignResourceName);
      return campaignResourceName;
    }
  }

  /**
   * Creates a new AdGroup.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignResourceName the resource name of the campaign for the new ad group.
   * @return the resource name of the new ad group.
   */
  private String createAdGroup(
      GoogleAdsClient googleAdsClient, long customerId, String campaignResourceName) {
    AdGroup adGroup =
        AdGroup.newBuilder()
            .setName("Testing RSA via API #" + getPrintableDateTime())
            .setStatus(AdGroupStatus.ENABLED)
            .setCampaign(campaignResourceName)
            .setType(AdGroupType.SEARCH_STANDARD)
            // If you want to set up a max CPC bid, uncomment the line below.
            // .setCpcBidMicros(10_000_000)
            .build();

    // Creates an ad group operation and adds it to the operations list.
    AdGroupOperation operation = AdGroupOperation.newBuilder().setCreate(adGroup).build();

    try (AdGroupServiceClient adGroupServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupServiceClient()) {
      MutateAdGroupsResponse response =
          adGroupServiceClient.mutateAdGroups(
              Long.toString(customerId), Collections.singletonList(operation));
      String adGroupResourceName = response.getResults(0).getResourceName();
      System.out.printf("Created ad group: %s%n", adGroupResourceName);
      return adGroupResourceName;
    }
  }

  /**
   * Creates a new AdGroupAd.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupResourceName the resource name of the ad group for the new ad group ad.
   */
  private void createAdGroupAd(
      GoogleAdsClient googleAdsClient, long customerId, String adGroupResourceName) {

    // Creates the responsive search ad info.
    // https://developers.google.com/google-ads/api/reference/rpc/latest/ResponsiveSearchAdInfo
    ResponsiveSearchAdInfo.Builder responsiveSearchAdInfoBuilder =
        ResponsiveSearchAdInfo.newBuilder();

    // Sets a pinning to always choose this asset for HEADLINE_1. Pinning is optional; if no pinning
    // is set, then headlines and descriptions will be rotated and the ones that perform best will
    // be used more often.
    // Headline 1
    responsiveSearchAdInfoBuilder.addHeadlines(
        createAdTextAsset("Headline 1 testing", ServedAssetFieldType.HEADLINE_1));
    // Headlines 2 and 3
    responsiveSearchAdInfoBuilder
        .addHeadlines(createAdTextAsset("Headline 2 testing"))
        .addHeadlines(createAdTextAsset("Headline 3 testing"));

    // Descriptions 1 and 2
    responsiveSearchAdInfoBuilder
        .addDescriptions(createAdTextAsset("Desc 1 testing"))
        .addDescriptions(createAdTextAsset("Desc 2 testing"));

    // Paths
    // First and second part of text that can be appended to the URL in the ad.
    // If you use the examples below, the ad will show
    // https://www.example.com/all-inclusive/deals
    responsiveSearchAdInfoBuilder.setPath1("all-inclusive").setPath2("deals");

    // Wraps the ResponsiveSearchAdInfo in an Ad object.
    Ad ad =
        Ad.newBuilder()
            .setResponsiveSearchAd(responsiveSearchAdInfoBuilder)
            // Sets the list of possible final URLs after all cross-domain redirects for the ad.
            .addFinalUrls("https://www.example.com/")
            .build();

    // Wraps the Ad in an AdGroupAd object.
    AdGroupAd adGroupAd =
        AdGroupAd.newBuilder()
            .setAdGroup(adGroupResourceName)
            .setStatus(AdGroupAdStatus.ENABLED)
            .setAd(ad)
            .build();

    // Creates the operation.
    AdGroupAdOperation operation = AdGroupAdOperation.newBuilder().setCreate(adGroupAd).build();

    // Creates the AdGroupAdServiceClient.
    try (AdGroupAdServiceClient adGroupAdServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupAdServiceClient()) {
      // Adds the AdGroupAd.
      MutateAdGroupAdsResponse response =
          adGroupAdServiceClient.mutateAdGroupAds(
              Long.toString(customerId), Collections.singletonList(operation));
      String adGroupAdResourceName = response.getResults(0).getResourceName();
      System.out.printf(
          "Created responsive search ad with resource name: %s.%n", adGroupAdResourceName);
    }
  }

  /**
   * Creates an AdTextAsset from a given string. The asset will not be pinned.
   *
   * @param text the text string to insert in the AdTextAsset.
   * @return the AdTextAsset.
   */
  private AdTextAsset createAdTextAsset(String text) {
    return createAdTextAsset(text, null);
  }

  /**
   * Creates an AdTextAsset from a given string.
   *
   * @param text the text string to insert in the AdTextAsset.
   * @param pinnedFieldType if not null, pins the text asset so it always shows in the ad.
   * @return the AdTextAsset.
   */
  private AdTextAsset createAdTextAsset(String text, ServedAssetFieldType pinnedFieldType) {
    AdTextAsset.Builder textAssetBuilder = AdTextAsset.newBuilder().setText(text);
    if (pinnedFieldType != null) {
      textAssetBuilder.setPinnedField(pinnedFieldType);
    }
    return textAssetBuilder.build();
  }

  /**
   * Creates keywords.
   *
   * <p>Creates 3 keyword match types: EXACT, PHRASE, and BROAD.
   *
   * <ul>
   *   <li>EXACT: ads may show on searches that ARE the same meaning as your keyword.
   *   <li>PHRASE: ads may show on searches that INCLUDE the meaning of your keyword.
   *   <li>BROAD: ads may show on searches that RELATE to your keyword.
   * </ul>
   *
   * For smart bidding, BROAD is the recommended one.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupResourceName the resource name of the ad group where the keywords will be added.
   */
  private void addKeywords(
      GoogleAdsClient googleAdsClient, long customerId, String adGroupResourceName) {
    // Creates keyword 1 with EXACT match.
    AdGroupCriterion keyword1 =
        AdGroupCriterion.newBuilder()
            .setAdGroup(adGroupResourceName)
            .setStatus(AdGroupCriterionStatus.ENABLED)
            .setKeyword(
                KeywordInfo.newBuilder()
                    .setText("example of exact match")
                    .setMatchType(KeywordMatchType.EXACT))
            // Uncomment the below line if you want to change this keyword to a negative target.
            // .setNegative(true)
            // Optional repeated field
            // .addFinalUrls("https://www.example.com")
            .build();

    // Creates keyword 2 with PHRASE match.
    AdGroupCriterion keyword2 =
        AdGroupCriterion.newBuilder()
            .setAdGroup(adGroupResourceName)
            .setStatus(AdGroupCriterionStatus.ENABLED)
            .setKeyword(
                KeywordInfo.newBuilder()
                    .setText("example of phrase match")
                    .setMatchType(KeywordMatchType.PHRASE))
            // Uncomment the below line if you want to change this keyword to a negative target.
            // .setNegative(true)
            // Optional repeated field
            // .addFinalUrls("https://www.example.com")
            .build();

    // Creates keyword 3 with BROAD match.
    AdGroupCriterion keyword3 =
        AdGroupCriterion.newBuilder()
            .setAdGroup(adGroupResourceName)
            .setStatus(AdGroupCriterionStatus.ENABLED)
            .setKeyword(
                KeywordInfo.newBuilder()
                    .setText("example of broad match")
                    .setMatchType(KeywordMatchType.BROAD))
            // Uncomment the below line if you want to change this keyword to a negative target.
            // .setNegative(true)
            // Optional repeated field
            // .addFinalUrls("https://www.example.com")
            .build();

    // Creates the set of operations to add all the keywords.
    List<AdGroupCriterionOperation> operations =
        Arrays.asList(keyword1, keyword2, keyword3).stream()
            .map(agc -> AdGroupCriterionOperation.newBuilder().setCreate(agc).build())
            .collect(Collectors.toList());

    try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupCriterionServiceClient()) {
      MutateAdGroupCriteriaResponse response =
          adGroupCriterionServiceClient.mutateAdGroupCriteria(
              Long.toString(customerId), operations);
      for (MutateAdGroupCriterionResult result : response.getResultsList()) {
        System.out.printf("Created keyword ad group criterion: %s%n", result.getResourceName());
      }
    }
  }

  /**
   * Creates geo targets for a campaign.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignResourceName the resource name of the campaign.
   */
  private void addGeoTargeting(
      GoogleAdsClient googleAdsClient, long customerId, String campaignResourceName) {

    // Search by location names from GeoTargetConstantService.suggestGeoTargetConstants() and
    // directly apply GeoTargetConstant.resource_name.
    List<CampaignCriterionOperation> campaignCriterionOperations = new ArrayList<>();
    try (GeoTargetConstantServiceClient geoTargetConstantServiceClient =
        googleAdsClient.getLatestVersion().createGeoTargetConstantServiceClient()) {
      SuggestGeoTargetConstantsRequest geoTargetConstantsRequest =
          SuggestGeoTargetConstantsRequest.newBuilder()
              .setLocale("es")
              .setCountryCode("AR")
              .setLocationNames(
                  LocationNames.newBuilder()
                      .addNames("Buenos aires")
                      .addNames("San Isidro")
                      .addNames("Mar del Plata")
                      .build())
              .build();
      SuggestGeoTargetConstantsResponse suggestGeoTargetConstantsResponse =
          geoTargetConstantServiceClient.suggestGeoTargetConstants(geoTargetConstantsRequest);
      List<CampaignCriterion> campaignCriteria = new ArrayList<>();
      for (GeoTargetConstantSuggestion suggestion :
          suggestGeoTargetConstantsResponse.getGeoTargetConstantSuggestionsList()) {
        // Prints information about the geo target constant suggestion.
        GeoTargetConstant geoTargetConstant = suggestion.getGeoTargetConstant();
        System.out.printf(
            "%s (%s, %s, %s, %s) is found in locale '%s' with reach %,d from search term '%s'%n",
            geoTargetConstant.getResourceName(),
            geoTargetConstant.getName(),
            geoTargetConstant.getCountryCode(),
            geoTargetConstant.getTargetType(),
            geoTargetConstant.getStatus(),
            suggestion.getLocale(),
            suggestion.getReach(),
            suggestion.getSearchTerm());
        // Constructs a CampaignCriterionOperation to add a CampaignCriterion for the suggestion's
        // geo target constant.
        campaignCriterionOperations.add(
            CampaignCriterionOperation.newBuilder()
                .setCreate(
                    CampaignCriterion.newBuilder()
                        .setCampaign(campaignResourceName)
                        .setLocation(
                            LocationInfo.newBuilder()
                                .setGeoTargetConstant(geoTargetConstant.getResourceName())
                                .build())
                        .build())
                .build());
      }
    }

    try (CampaignCriterionServiceClient campaignCriterionServiceClient =
        googleAdsClient.getLatestVersion().createCampaignCriterionServiceClient()) {
      // Sends the mutate request to create the campaign criteria.
      MutateCampaignCriteriaResponse response =
          campaignCriterionServiceClient.mutateCampaignCriteria(
              Long.toString(customerId), campaignCriterionOperations);
      for (MutateCampaignCriterionResult result : response.getResultsList()) {
        System.out.printf("Created geo target campaign criterion: %s%n", result.getResourceName());
      }
    }
  }

  /**
   * Creates image extensions for a campaign.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignResourceName the resource name of the campaign.
   */
  private void addImages(
      GoogleAdsClient googleAdsClient, long customerId, String campaignResourceName) {

    byte[] imageData;
    try {
      imageData = ByteStreams.toByteArray(new URL("https://gaagl.page.link/Eit5").openStream());
    } catch (IOException e) {
      throw new IllegalArgumentException(e);
    }
    Asset imageAsset =
        Asset.newBuilder()
            .setImageAsset(
                ImageAsset.newBuilder()
                    .setData(ByteString.copyFrom(imageData))
                    .setFileSize(imageData.length)
                    // MIME type of the image (IMAGE_JPEG, IMAGE_PNG, etc.).
                    // See more types on the link below.
                    // https://developers.google.com/google-ads/api/reference/rpc/latest/MimeTypeEnum.MimeType
                    .setMimeType(MimeType.IMAGE_PNG)
                    .build())
            // Provide a unique friendly name to identify your asset.
            // When there is an existing image asset with the same content but a different name, the
            // new name will be dropped silently.
            .setName("Testing Image via API #" + getPrintableDateTime())
            .build();
    AssetOperation assetOperation = AssetOperation.newBuilder().setCreate(imageAsset).build();
    String imageAssetResourceName;
    try (AssetServiceClient assetServiceClient =
        googleAdsClient.getLatestVersion().createAssetServiceClient()) {
      MutateAssetsResponse mutateAssetsResponse =
          assetServiceClient.mutateAssets(
              Long.toString(customerId), Collections.singletonList(assetOperation));
      imageAssetResourceName = mutateAssetsResponse.getResults(0).getResourceName();
      System.out.printf("Created image asset: %s%n", imageAssetResourceName);
    }

    // Creates an image extension.
    ExtensionFeedItem extensionFeedItem =
        ExtensionFeedItem.newBuilder()
            .setImageFeedItem(ImageFeedItem.newBuilder().setImageAsset(imageAssetResourceName))
            .build();
    ExtensionFeedItemOperation extensionFeedItemOperation =
        ExtensionFeedItemOperation.newBuilder().setCreate(extensionFeedItem).build();

    String extensionFeedItemResourceName;
    try (ExtensionFeedItemServiceClient extensionFeedItemServiceClient =
        googleAdsClient.getLatestVersion().createExtensionFeedItemServiceClient()) {
      MutateExtensionFeedItemsResponse mutateExtensionFeedItemsResponse =
          extensionFeedItemServiceClient.mutateExtensionFeedItems(
              Long.toString(customerId), Collections.singletonList(extensionFeedItemOperation));
      extensionFeedItemResourceName =
          mutateExtensionFeedItemsResponse.getResults(0).getResourceName();
      System.out.printf("Created image extension: %s%n", extensionFeedItemResourceName);
    }

    // Links the image extension to the responsive search ad.
    CampaignExtensionSetting campaignExtensionSetting =
        CampaignExtensionSetting.newBuilder()
            .setCampaign(campaignResourceName)
            .setExtensionType(ExtensionType.IMAGE)
            .addExtensionFeedItems(extensionFeedItemResourceName)
            .build();
    CampaignExtensionSettingOperation campaignExtensionSettingOperation =
        CampaignExtensionSettingOperation.newBuilder().setCreate(campaignExtensionSetting).build();
    try (CampaignExtensionSettingServiceClient campaignExtensionSettingServiceClient =
        googleAdsClient.getLatestVersion().createCampaignExtensionSettingServiceClient()) {
      MutateCampaignExtensionSettingsResponse mutateCampaignExtensionSettingsResponse =
          campaignExtensionSettingServiceClient.mutateCampaignExtensionSettings(
              Long.toString(customerId),
              Collections.singletonList(campaignExtensionSettingOperation));
      String campaignExtensionSettingResourceName =
          mutateCampaignExtensionSettingsResponse.getResults(0).getResourceName();
      System.out.printf(
          "Created campaign extension setting: %s%n", campaignExtensionSettingResourceName);
    }
  }
}

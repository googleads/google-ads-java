// Copyright 2023 Google LLC
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

package com.google.ads.googleads.examples.travel;

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleHelper;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v17.common.CallToActionAsset;
import com.google.ads.googleads.v17.common.HotelPropertyAsset;
import com.google.ads.googleads.v17.common.ImageAsset;
import com.google.ads.googleads.v17.common.MaximizeConversionValue;
import com.google.ads.googleads.v17.common.TextAsset;
import com.google.ads.googleads.v17.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v17.enums.AssetFieldTypeEnum.AssetFieldType;
import com.google.ads.googleads.v17.enums.AssetGroupStatusEnum.AssetGroupStatus;
import com.google.ads.googleads.v17.enums.AssetSetTypeEnum.AssetSetType;
import com.google.ads.googleads.v17.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v17.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v17.enums.HotelAssetSuggestionStatusEnum.HotelAssetSuggestionStatus;
import com.google.ads.googleads.v17.errors.GoogleAdsError;
import com.google.ads.googleads.v17.errors.GoogleAdsException;
import com.google.ads.googleads.v17.resources.Asset;
import com.google.ads.googleads.v17.resources.AssetGroup;
import com.google.ads.googleads.v17.resources.AssetGroupAsset;
import com.google.ads.googleads.v17.resources.AssetSet;
import com.google.ads.googleads.v17.resources.AssetSetAsset;
import com.google.ads.googleads.v17.resources.Campaign;
import com.google.ads.googleads.v17.resources.CampaignBudget;
import com.google.ads.googleads.v17.services.AssetGroupAssetOperation;
import com.google.ads.googleads.v17.services.AssetGroupOperation;
import com.google.ads.googleads.v17.services.AssetOperation;
import com.google.ads.googleads.v17.services.AssetSetAssetOperation;
import com.google.ads.googleads.v17.services.AssetSetOperation;
import com.google.ads.googleads.v17.services.AssetSetServiceClient;
import com.google.ads.googleads.v17.services.CampaignBudgetOperation;
import com.google.ads.googleads.v17.services.CampaignOperation;
import com.google.ads.googleads.v17.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v17.services.HotelAssetSuggestion;
import com.google.ads.googleads.v17.services.HotelImageAsset;
import com.google.ads.googleads.v17.services.HotelTextAsset;
import com.google.ads.googleads.v17.services.MutateAssetSetsResponse;
import com.google.ads.googleads.v17.services.MutateGoogleAdsResponse;
import com.google.ads.googleads.v17.services.MutateOperation;
import com.google.ads.googleads.v17.services.MutateOperationResponse;
import com.google.ads.googleads.v17.services.MutateOperationResponse.ResponseCase;
import com.google.ads.googleads.v17.services.SuggestTravelAssetsRequest;
import com.google.ads.googleads.v17.services.SuggestTravelAssetsResponse;
import com.google.ads.googleads.v17.services.TravelAssetSuggestionServiceClient;
import com.google.ads.googleads.v17.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.ByteStreams;
import com.google.protobuf.ByteString;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.joda.time.DateTime;

/**
 * This example shows how to create a Performance Max for travel goals campaign. It also uses
 * TravelAssetSuggestionService to fetch suggested assets for creating an asset group. In case there
 * are not enough assets for the asset group (required by Performance Max), this example will create
 * more assets to fulfill the requirements.
 *
 * <p>For more information about Performance Max campaigns, see
 * https://developers.google.com/google-ads/api/docs/performance-max/overview.
 *
 * <p>Prerequisites:
 *
 * <ul>
 *   <li>You must have at least one conversion action in the account. For more about conversion
 *       actions, see
 *       https://developers.google.com/google-ads/api/docs/conversions/overview#conversion_actions.
 * </ul>
 *
 * <p>Notes:
 *
 * <ul>
 *   <li>This example uses the default customer conversion goals. For an example of setting
 *       campaign-specific conversion goals, see {@link
 *       com.google.ads.googleads.examples.shoppingads.AddPerformanceMaxRetailCampaign}.
 *   <li>To learn how to create asset group signals, see {@link
 *       com.google.ads.googleads.examples.advancedoperations.AddPerformanceMaxCampaign}.
 * </ul>
 */
public class AddPerformanceMaxForTravelGoalsCampaign {

  // Minimum requirements of assets required in a Performance Max asset group.
  // See https://developers.google.com/google-ads/api/docs/performance-max/assets for details.
  private static Map<AssetFieldType, Integer> MIN_REQUIRED_TEXT_ASSET_COUNTS =
      ImmutableMap.<AssetFieldType, Integer>builder()
          .put(AssetFieldType.HEADLINE, 3)
          .put(AssetFieldType.LONG_HEADLINE, 1)
          .put(AssetFieldType.DESCRIPTION, 2)
          .put(AssetFieldType.BUSINESS_NAME, 1)
          .build();

  private static Map<AssetFieldType, Integer> MIN_REQUIRED_IMAGE_ASSET_COUNTS =
      ImmutableMap.<AssetFieldType, Integer>builder()
          .put(AssetFieldType.MARKETING_IMAGE, 1)
          .put(AssetFieldType.SQUARE_MARKETING_IMAGE, 1)
          .put(AssetFieldType.LOGO, 1)
          .build();

  // Texts and URLs used to create text and image assets when the TravelAssetSuggestionService
  // doesn't return enough assets required for creating an asset group.
  private static Map<AssetFieldType, List<String>> DEFAULT_TEXT_ASSETS_INFO =
      ImmutableMap.<AssetFieldType, List<String>>builder()
          .put(AssetFieldType.HEADLINE, ImmutableList.of("Hotel", "Travel Reviews", "Book travel"))
          .put(AssetFieldType.LONG_HEADLINE, ImmutableList.of("Travel the World"))
          .put(
              AssetFieldType.DESCRIPTION,
              ImmutableList.of("Great deal for your beloved hotel", "Best rate guaranteed"))
          .put(AssetFieldType.BUSINESS_NAME, ImmutableList.of("Interplanetary Cruises"))
          .build();
  private static Map<AssetFieldType, List<String>> DEFAULT_IMAGE_ASSETS_INFO =
      ImmutableMap.<AssetFieldType, List<String>>builder()
          .put(AssetFieldType.MARKETING_IMAGE, ImmutableList.of("https://gaagl.page.link/Eit5"))
          .put(
              AssetFieldType.SQUARE_MARKETING_IMAGE,
              ImmutableList.of("https://gaagl.page.link/bjYi"))
          .put(AssetFieldType.LOGO, ImmutableList.of("https://gaagl.page.link/bjYi"))
          .build();

  // We specify temporary IDs that are specific to a single mutate request. Temporary IDs are always
  // negative and unique within one mutate request.
  //
  // <p>See https://developers.google.com/google-ads/api/docs/mutating/best-practices for further
  // details.
  //
  // <p>These temporary IDs are fixed because they are used in multiple places.
  private static final int ASSET_TEMPORARY_ID = -1;
  private static final int BUDGET_TEMPORARY_ID = -2;
  private static final int CAMPAIGN_TEMPORARY_ID = -3;
  private static final int ASSET_GROUP_TEMPORARY_ID = -4;

  // There are also entities that will be created in the same request but do not
  // need to be fixed temporary IDs because they are referenced only once.
  private static long temporaryId = ASSET_GROUP_TEMPORARY_ID - 1;

  /** Parameters for the example. */
  private static class AddPerformanceMaxForTravelGoalsCampaignParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(
        names = ArgumentNames.PLACE_ID,
        required = true,
        description =
            "The place ID of a hotel property. A place ID uniquely identifies a place in the Google"
                + " Places database. See https://developers.google.com/places/web-service/place-id"
                + " to learn more.")
    private String placeId;
  }

  public static void main(String[] args) {
    AddPerformanceMaxForTravelGoalsCampaignParams params =
        new AddPerformanceMaxForTravelGoalsCampaignParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.placeId = "INSERT_PLACE_ID_HERE";
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
      new AddPerformanceMaxForTravelGoalsCampaign()
          .runExample(googleAdsClient, params.customerId, params.placeId);
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
   * @param placeId the place ID for a hotel property asset.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, String placeId) {
    // Gets hotel asset suggestion using the TravelAssetSuggestionService.
    HotelAssetSuggestion hotelAssetSuggestion =
        getHotelAssetSuggestion(googleAdsClient, customerId, placeId);

    // Performance Max campaigns require that repeated assets such as headlines and descriptions be
    // created before the campaign. For the list of required assets for a Performance Max campaign,
    // see
    // https://developers.google.com/google-ads/api/docs/performance-max/assets.
    //
    // This step is the same for any type of Performance Max campaign.

    // Creates the headlines using the hotel asset suggestion.
    List<String> headlineAssetResourceNames =
        createMultipleTextAssets(
            googleAdsClient, customerId, AssetFieldType.HEADLINE, hotelAssetSuggestion);

    // Creates the descriptions using the hotel asset suggestion.
    List<String> descriptionAssetResourceNames =
        createMultipleTextAssets(
            googleAdsClient, customerId, AssetFieldType.DESCRIPTION, hotelAssetSuggestion);

    // Creates a hotel property asset set, which will be used later to link with a newly created
    // campaign.
    String hotelPropertyAssetSetResourceName = createHotelAssetSet(googleAdsClient, customerId);

    // Creates a hotel property asset and link it with the previously created hotel property asset
    // set. This asset will also be linked to an asset group in the later steps. In the real-world
    // scenario, you'd need to create many assets for all your hotel properties. We use one hotel
    // property here for simplicity. Both asset and asset set need to be created before creating a
    // campaign, so we cannot bundle them with other mutate operations below.
    String hotelPropertyAssetResourceName =
        createHotelAsset(googleAdsClient, customerId, placeId, hotelPropertyAssetSetResourceName);

    // It's important to create the below entities in this order because they depend on
    // each other.
    // The below methods create and return mutate operations that we later provide to the
    // GoogleAdsService.Mutate method in order to create the entities in a single request.
    // Since the entities for a Performance Max campaign are closely tied to one-another, it's
    // considered a best practice to create them in a single Mutate request so they all complete
    // successfully or fail entirely, leaving no orphaned entities. See:
    // https://developers.google.com/google-ads/api/docs/mutating/overview.
    List<MutateOperation> mutateOperations = new ArrayList<>();
    mutateOperations.add(createCampaignBudgetOperation(customerId));
    mutateOperations.add(createCampaignOperation(customerId, hotelPropertyAssetSetResourceName));
    mutateOperations.addAll(
        createAssetGroupOperations(
            customerId,
            hotelPropertyAssetResourceName,
            headlineAssetResourceNames,
            descriptionAssetResourceNames,
            hotelAssetSuggestion));

    // Issues a mutate request to create everything and prints the results.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      MutateGoogleAdsResponse response =
          googleAdsServiceClient.mutate(Long.toString(customerId), mutateOperations);
      System.out.println(
          "Created the following entities for a campaign budget, a campaign, and an asset group for"
              + " Performance Max for travel goals:");
      printResponseDetails(response);
    }
  }

  /**
   * Returns hotel asset suggestion obtained from TravelAssetsSuggestionService.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param placeId the place ID for a hotel property asset.
   * @return a hotel asset suggestion.
   */
  // [START get_hotel_asset_suggestion]
  private HotelAssetSuggestion getHotelAssetSuggestion(
      GoogleAdsClient googleAdsClient, long customerId, String placeId) {

    try (TravelAssetSuggestionServiceClient travelAssetSuggestionServiceClient =
        googleAdsClient.getLatestVersion().createTravelAssetSuggestionServiceClient()) {
      // Sends a request to suggest assets to be created as an asset group for the Performance Max
      // for travel goals campaign.
      SuggestTravelAssetsResponse suggestTravelAssetsResponse =
          travelAssetSuggestionServiceClient.suggestTravelAssets(
              SuggestTravelAssetsRequest.newBuilder()
                  .setCustomerId(Long.toString(customerId))
                  // Uses 'en-US' as an example. It can be any language specifications in BCP 47
                  // format.
                  .setLanguageOption("en-US")
                  // The service accepts several place IDs. We use only one here for demonstration.
                  .addPlaceIds(placeId)
                  .build());
      System.out.printf("Fetched a hotel asset suggestion for the place ID '%s'.%n", placeId);
      return suggestTravelAssetsResponse.getHotelAssetSuggestions(0);
    }
  }
  // [END get_hotel_asset_suggestion]

  /**
   * Creates multiple text assets and returns the list of resource names. The hotel asset suggestion
   * is used to create a text asset first. If the number of created text assets is still fewer than
   * the minimum required number of assets of the specified asset field type, adds more text assets
   * to fulfill the requirement.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param assetFieldType the asset field type that the text assets will be created for.
   * @param hotelAssetSuggestion the hotel asset suggestion.
   * @return the resource names of the created text assets.
   */
  private List<String> createMultipleTextAssets(
      GoogleAdsClient googleAdsClient,
      long customerId,
      AssetFieldType assetFieldType,
      HotelAssetSuggestion hotelAssetSuggestion) {

    // Uses the GoogleAdService to create multiple text assets in a single request.
    List<MutateOperation> mutateOperations = new ArrayList<>();

    // First, adds all the text assets of the specified asset field type.
    // Filters to only the specified asset field type.
    // Constructs a mutate operation to create the asset.
    // Adds the operation to the list.
    if (HotelAssetSuggestionStatus.SUCCESS.equals(hotelAssetSuggestion.getStatus())) {
      for (HotelTextAsset asset : hotelAssetSuggestion.getTextAssetsList()) {
        if (asset.getAssetFieldType().equals(assetFieldType)) {
          MutateOperation build =
              MutateOperation.newBuilder()
                  .setAssetOperation(
                      AssetOperation.newBuilder()
                          .setCreate(
                              Asset.newBuilder()
                                  .setTextAsset(
                                      TextAsset.newBuilder().setText(asset.getText()).build())
                                  .build()))
                  .build();
          mutateOperations.add(build);
        }
      }
    }

    // If the added assets are still less than the minimum required assets for the asset field type,
    // add more text assets using the default texts.
    int i = 0;
    while (mutateOperations.size() < MIN_REQUIRED_TEXT_ASSET_COUNTS.get(assetFieldType)) {
      String text = DEFAULT_TEXT_ASSETS_INFO.get(assetFieldType).get(i++);
      // Creates a mutate operation for a text asset, using the default text.
      mutateOperations.add(
          MutateOperation.newBuilder()
              .setAssetOperation(
                  AssetOperation.newBuilder()
                      .setCreate(
                          Asset.newBuilder()
                              .setTextAsset(TextAsset.newBuilder().setText(text).build())
                              .build()))
              .build());
    }

    // Issues a mutate request to add all assets.
    List<String> assetResourceNames;
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      MutateGoogleAdsResponse response =
          googleAdsServiceClient.mutate(Long.toString(customerId), mutateOperations);
      assetResourceNames =
          response.getMutateOperationResponsesList().stream()
              .map(resp -> resp.getAssetResult().getResourceName())
              .collect(Collectors.toList());
      System.out.printf(
          "The following assets were created for the asset field type '%s':%n", assetFieldType);
      printResponseDetails(response);
    }

    return assetResourceNames;
  }

  /**
   * Creates a hotel property asset set.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @return the created hotel property asset set resource name.
   */
  // [START create_hotel_asset_set]
  private String createHotelAssetSet(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates an asset set operation for a hotel property asset set.
    AssetSetOperation assetSetOperation =
        AssetSetOperation.newBuilder()
            .setCreate(
                AssetSet.newBuilder()
                    .setName(
                        "My Hotel propery asset set #" + CodeSampleHelper.getPrintableDateTime())
                    .setType(AssetSetType.HOTEL_PROPERTY))
            .build();
    try (AssetSetServiceClient assetSetServiceClient =
        googleAdsClient.getLatestVersion().createAssetSetServiceClient()) {
      MutateAssetSetsResponse mutateAssetSetsResponse =
          assetSetServiceClient.mutateAssetSets(
              Long.toString(customerId), ImmutableList.of(assetSetOperation));
      String assetSetResourceName = mutateAssetSetsResponse.getResults(0).getResourceName();
      System.out.printf("Created an asset set with resource name: '%s'%n", assetSetResourceName);
      return assetSetResourceName;
    }
  }
  // [END create_hotel_asset_set]

  /**
   * Creates a hotel property asset using the specified place ID. The place ID must belong to a
   * hotel property. Then, links it to the specified asset set.
   *
   * <p>See https://developers.google.com/places/web-service/place-id to search for a hotel place
   * ID.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param placeId the place ID for a hotel.
   * @param hotelPropertyAssetSetResourceName the hotel asset set resource name.
   * @return the created hotel property asset resource name.
   */
  // [START create_hotel_asset]
  private String createHotelAsset(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String placeId,
      String hotelPropertyAssetSetResourceName) {
    // Uses the GoogleAdService to create an asset and asset set asset in a single request.
    List<MutateOperation> mutateOperations = new ArrayList<>();
    String assetResourceName = ResourceNames.asset(customerId, ASSET_TEMPORARY_ID);
    // Creates a mutate operation for a hotel property asset.
    Asset hotelPropertyAsset =
        Asset.newBuilder()
            .setResourceName(assetResourceName)
            .setHotelPropertyAsset(HotelPropertyAsset.newBuilder().setPlaceId(placeId))
            .build();
    mutateOperations.add(
        MutateOperation.newBuilder()
            .setAssetOperation(AssetOperation.newBuilder().setCreate(hotelPropertyAsset))
            .build());

    // Creates a mutate operation for an asset set asset.
    AssetSetAsset assetSetAsset =
        AssetSetAsset.newBuilder()
            .setAsset(assetResourceName)
            .setAssetSet(hotelPropertyAssetSetResourceName)
            .build();
    mutateOperations.add(
        MutateOperation.newBuilder()
            .setAssetSetAssetOperation(AssetSetAssetOperation.newBuilder().setCreate(assetSetAsset))
            .build());
    // Issues a mutate request to create all entities.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      MutateGoogleAdsResponse mutateGoogleAdsResponse =
          googleAdsServiceClient.mutate(Long.toString(customerId), mutateOperations);
      System.out.println("Created the following entities for the hotel asset:");
      printResponseDetails(mutateGoogleAdsResponse);
      // Returns the created asset resource name, which will be used later to create an asset
      // group. Other resource names are not used later.
      return mutateGoogleAdsResponse
          .getMutateOperationResponses(0)
          .getAssetResult()
          .getResourceName();
    }
  }
  // [END create_hotel_asset]

  /**
   * Creates a mutate operation that creates a new campaign budget.
   *
   * <p>A temporary ID will be assigned to this campaign budget so that it can be referenced by
   * other objects being created in the same mutate request.
   *
   * @param customerId the client customer ID.
   * @return a mutate operation that creates a campaign budget.
   */
  private MutateOperation createCampaignBudgetOperation(long customerId) {
    CampaignBudget campaignBudget =
        CampaignBudget.newBuilder()
            .setName("Performance Max for travel goals campaign budget #" + getPrintableDateTime())
            // The budget period already defaults to DAILY.
            .setAmountMicros(50_000_000)
            .setDeliveryMethod(BudgetDeliveryMethod.STANDARD)
            // A Performance Max campaign cannot use a shared campaign budget.
            .setExplicitlyShared(false)
            // Sets a temporary ID in the budget's resource name, so it can be referenced
            // by the campaign in later steps.
            .setResourceName(ResourceNames.campaignBudget(customerId, BUDGET_TEMPORARY_ID))
            .build();

    return MutateOperation.newBuilder()
        .setCampaignBudgetOperation(
            CampaignBudgetOperation.newBuilder().setCreate(campaignBudget).build())
        .build();
  }

  /**
   * Creates a mutate operation that creates a new Performance Max campaign. Links the specified
   * hotel property asset set to this campaign.
   *
   * <p>A temporary ID will be assigned to this campaign so that it can be referenced by other
   * objects being created in the same mutate request.
   *
   * @param customerId the client customer ID.
   * @param hotelPropertyAssetSetResourceName
   * @return the mutate operation that creates a campaign.
   */
  // [START create_campaign]
  private MutateOperation createCampaignOperation(
      long customerId, String hotelPropertyAssetSetResourceName) {
    Campaign performanceMaxCampaign =
        Campaign.newBuilder()
            .setName("Performance Max for travel goals campaign #" + getPrintableDateTime())
            // Sets the campaign status as PAUSED. The campaign is the only entity in
            // the mutate request that should have its status set.
            .setStatus(CampaignStatus.PAUSED)
            // All Performance Max campaigns have an advertising_channel_type of
            // PERFORMANCE_MAX. The advertising_channel_sub_type should not be set.
            .setAdvertisingChannelType(AdvertisingChannelType.PERFORMANCE_MAX)
            // To create a Performance Max for travel goals campaign, you need to set
            // `hotel_property_asset_set`.
            .setHotelPropertyAssetSet(hotelPropertyAssetSetResourceName)
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
            // Assigns the resource name with a temporary ID.
            .setResourceName(ResourceNames.campaign(customerId, CAMPAIGN_TEMPORARY_ID))
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
  // [END create_campaign]

  /**
   * Creates a list of mutate operations that create a new asset group, composed of suggested
   * assets. In case the number of suggested assets is not enough for the requirements, creates more
   * assets to meet the requirement.
   *
   * <p>For the list of required assets for a Performance Max campaign, see
   * https://developers.google.com/google-ads/api/docs/performance-max/assets.
   *
   * @param hotelPropertyAssetResourceName the hotel property asset resource name that will be used
   *     to create an asset group
   * @param headlineAssetResourceNames a list of headline resource names
   * @param descriptionAssetResourceNames a list of description resource names
   * @param hotelAssetSuggestion the hotel asset suggestion
   * @return a list of mutate operations that create the asset group
   */
  private List<MutateOperation> createAssetGroupOperations(
      long customerId,
      String hotelPropertyAssetResourceName,
      List<String> headlineAssetResourceNames,
      List<String> descriptionAssetResourceNames,
      HotelAssetSuggestion hotelAssetSuggestion) {
    List<MutateOperation> mutateOperations = new ArrayList<>();

    // Creates a new mutate operation that creates an asset group using suggested information when
    // available.
    String assetGroupName;
    List<String> assetGroupFinalUrls;
    if (HotelAssetSuggestionStatus.SUCCESS.equals(hotelAssetSuggestion.getStatus())) {
      assetGroupName = hotelAssetSuggestion.getHotelName();
      assetGroupFinalUrls = ImmutableList.of(hotelAssetSuggestion.getFinalUrl());
    } else {
      assetGroupName = "Performance Max for travel goals asset group #" + getPrintableDateTime();
      assetGroupFinalUrls = ImmutableList.of("https://www.example.com");
    }
    String assetGroupResourceName = ResourceNames.assetGroup(customerId, ASSET_GROUP_TEMPORARY_ID);
    AssetGroup assetGroup =
        AssetGroup.newBuilder()
            .setResourceName(assetGroupResourceName)
            .setName(assetGroupName)
            .setCampaign(ResourceNames.campaign(customerId, CAMPAIGN_TEMPORARY_ID))
            .addAllFinalUrls(assetGroupFinalUrls)
            .setStatus(AssetGroupStatus.PAUSED)
            .build();
    mutateOperations.add(
        MutateOperation.newBuilder()
            .setAssetGroupOperation(AssetGroupOperation.newBuilder().setCreate(assetGroup))
            .build());

    // An asset group is linked to an asset by creating a new asset group asset
    // and providing:
    // -  the resource name of the asset group
    // -  the resource name of the asset
    // -  the field_type of the asset in this asset group
    //
    // To learn more about asset groups, see
    // https://developers.google.com/google-ads/api/docs/performance-max/asset-groups.

    // Headline and description assets were created at the first step of this example. So, we
    // just need to link them with the created asset group.

    // Builds the AssetGroupAssets to link headline assets to the asset group.
    List<AssetGroupAsset> assetGroupAssets = new ArrayList<>();
    assetGroupAssets.addAll(
        headlineAssetResourceNames.stream()
            .map(
                headlineAssetResourceName ->
                    AssetGroupAsset.newBuilder()
                        .setAsset(headlineAssetResourceName)
                        .setAssetGroup(assetGroupResourceName)
                        .setFieldType(AssetFieldType.HEADLINE)
                        .build())
            .collect(Collectors.toList()));
    // Builds the AssetGroupAssets to link description assets to the asset group.
    assetGroupAssets.addAll(
        descriptionAssetResourceNames.stream()
            .map(
                descriptionAssetResourceName ->
                    AssetGroupAsset.newBuilder()
                        .setAsset(descriptionAssetResourceName)
                        .setAssetGroup(assetGroupResourceName)
                        .setFieldType(AssetFieldType.DESCRIPTION)
                        .build())
            .collect(Collectors.toList()));

    // Adds operations to create the AssetGroupAssets for headlines and descriptions.
    mutateOperations.addAll(
        assetGroupAssets.stream()
            .map(
                assetGroupAsset ->
                    MutateOperation.newBuilder()
                        .setAssetGroupAssetOperation(
                            AssetGroupAssetOperation.newBuilder()
                                .setCreate(assetGroupAsset)
                                .build())
                        .build())
            .collect(Collectors.toList()));

    // [START link_hotel_asset]
    // Link the previously created hotel property asset to the asset group. In the real-world
    // scenario, you'd need to do this step several times for each hotel property asset.
    AssetGroupAsset hotelProperyAssetGroupAsset =
        AssetGroupAsset.newBuilder()
            .setAsset(hotelPropertyAssetResourceName)
            .setAssetGroup(assetGroupResourceName)
            .setFieldType(AssetFieldType.HOTEL_PROPERTY)
            .build();
    // Adds an operation to link the hotel property asset to the asset group.
    mutateOperations.add(
        MutateOperation.newBuilder()
            .setAssetGroupAssetOperation(
                AssetGroupAssetOperation.newBuilder().setCreate(hotelProperyAssetGroupAsset))
            .build());
    // [END link_hotel_asset]

    // Creates the rest of the required text assets and links them to the asset group.
    mutateOperations.addAll(
        createOperationsForTextAssetsAndAssetGroupAssets(
            customerId, hotelAssetSuggestion, assetGroupResourceName));

    // Creates the image assets and links them to the asset group. Some optional image assets
    // suggested by the TravelAssetSuggestionService might be created too.
    mutateOperations.addAll(
        createOperationsForImageAssetsAndAssetGroupAssets(
            customerId, hotelAssetSuggestion, assetGroupResourceName));
    if (HotelAssetSuggestionStatus.SUCCESS.equals(hotelAssetSuggestion.getStatus())) {
      // Creates a new mutate operation for a suggested call-to-action asset and links it
      // to the asset group.
      Asset callToActionAsset =
          Asset.newBuilder()
              .setResourceName(ResourceNames.asset(customerId, temporaryId))
              .setName("Suggested call-to-action asset #" + CodeSampleHelper.getPrintableDateTime())
              .setCallToActionAsset(
                  CallToActionAsset.newBuilder()
                      .setCallToAction(hotelAssetSuggestion.getCallToAction()))
              .build();
      // Adds an operation to create the call-to-action asset.
      mutateOperations.add(
          MutateOperation.newBuilder()
              .setAssetOperation(AssetOperation.newBuilder().setCreate(callToActionAsset))
              .build());

      AssetGroupAsset callToActionAssetGroupAsset =
          AssetGroupAsset.newBuilder()
              .setAsset(callToActionAsset.getResourceName())
              .setAssetGroup(assetGroupResourceName)
              .setFieldType(AssetFieldType.CALL_TO_ACTION_SELECTION)
              .build();
      // Adds an operation to link the call-to-action asset to the asset group.
      mutateOperations.add(
          MutateOperation.newBuilder()
              .setAssetGroupAssetOperation(
                  AssetGroupAssetOperation.newBuilder().setCreate(callToActionAssetGroupAsset))
              .build());

      temporaryId--;
    }
    return mutateOperations;
  }

  /**
   * Creates text assets required for an asset group using the suggested hotel text assets. It adds
   * more text assets to fulfill the requirements if the suggested hotel text assets are not enough.
   *
   * @param customerId the client customer ID.
   * @param hotelAssetSuggestion the hotel asset suggestion.
   * @return a list of mutate operations that create text assets and asset group assets.
   */
  private List<MutateOperation> createOperationsForTextAssetsAndAssetGroupAssets(
      long customerId, HotelAssetSuggestion hotelAssetSuggestion, String assetGroupResourceName) {
    // Creates mutate operations for the suggested text assets except for headlines and
    // descriptions, which were created previously.
    List<MutateOperation> mutateOperations = new ArrayList<>();
    // Creates a map of asset field type to list of text values to create.
    Map<AssetFieldType, List<String>> textByFieldType = new HashMap<>();

    if (HotelAssetSuggestionStatus.SUCCESS.equals(hotelAssetSuggestion.getStatus())) {
      // Adds text values of suggested text assets.
      for (HotelTextAsset hotelTextAsset : hotelAssetSuggestion.getTextAssetsList()) {
        AssetFieldType assetFieldType = hotelTextAsset.getAssetFieldType();
        if (AssetFieldType.HEADLINE.equals(assetFieldType)
            || AssetFieldType.DESCRIPTION.equals(assetFieldType)) {
          // Headlines and descriptions were already created at the first step of this code example.
          continue;
        }
        System.out.printf(
            "A text asset with text '%s' is suggested for the asset field type '%s'.%n",
            hotelTextAsset.getText(), assetFieldType);

        textByFieldType
            .computeIfAbsent(assetFieldType, ft -> new ArrayList<>())
            .add(hotelTextAsset.getText());
      }
    }

    // Collects more text values by field type to fulfill the requirements.
    for (Entry<AssetFieldType, Integer> requiredEntry : MIN_REQUIRED_TEXT_ASSET_COUNTS.entrySet()) {
      AssetFieldType assetFieldType = requiredEntry.getKey();
      if (AssetFieldType.HEADLINE.equals(assetFieldType)
          || AssetFieldType.DESCRIPTION.equals(assetFieldType)) {
        // Headlines and descriptions were already created at the first step of this code example.
        continue;
      }
      textByFieldType.computeIfAbsent(assetFieldType, k -> new ArrayList<>());
      int i = 0;
      while (textByFieldType.get(assetFieldType).size() < requiredEntry.getValue()) {
        String textFromDefaults = DEFAULT_TEXT_ASSETS_INFO.get(assetFieldType).get(i++);
        System.out.printf(
            "A default text '%s' is used to create a text asset for the asset field type '%s'.%n",
            textFromDefaults, assetFieldType);
        textByFieldType
            .computeIfAbsent(assetFieldType, ft -> new ArrayList<>())
            .add(textFromDefaults);
      }
    }

    // Converts the list of text values by field type into AssetOperations and
    // AssetGroupAssetOperations.
    for (Entry<AssetFieldType, List<String>> fieldTypeEntry : textByFieldType.entrySet()) {
      for (String text : fieldTypeEntry.getValue()) {
        // Builds the Asset.
        Asset asset =
            Asset.newBuilder()
                .setResourceName(ResourceNames.asset(customerId, temporaryId--))
                .setTextAsset(TextAsset.newBuilder().setText(text))
                .build();
        // Adds an operation to create the Asset.
        mutateOperations.add(
            MutateOperation.newBuilder()
                .setAssetOperation(AssetOperation.newBuilder().setCreate(asset))
                .build());

        // Builds the AssetGroupAsset.
        AssetGroupAsset assetGroupAsset =
            AssetGroupAsset.newBuilder()
                // References the Asset above by resource name.
                .setAsset(asset.getResourceName())
                .setAssetGroup(assetGroupResourceName)
                .setFieldType(fieldTypeEntry.getKey())
                .build();
        // Adds an operation to link the Asset to the AssetGroup.
        mutateOperations.add(
            MutateOperation.newBuilder()
                .setAssetGroupAssetOperation(
                    AssetGroupAssetOperation.newBuilder().setCreate(assetGroupAsset))
                .build());
      }
    }
    return mutateOperations;
  }

  /**
   * Creates image assets required for an asset group using the suggested hotel image assets. It
   * adds more image assets to fulfill the requirements if the suggested hotel image assets are not
   * enough.
   *
   * @param customerId the client customer ID.
   * @param hotelAssetSuggestion the hotel asset suggestion.
   * @return a list of mutate operations that create image assets and asset group assets.
   */
  private List<MutateOperation> createOperationsForImageAssetsAndAssetGroupAssets(
      long customerId, HotelAssetSuggestion hotelAssetSuggestion, String assetGroupResourceName) {
    // Creates mutate operations for the suggested image assets.
    List<MutateOperation> mutateOperations = new ArrayList<>();
    // Creates a map of asset field type to list of image URLs for which this method will create
    // assets and asset group assets.
    Map<AssetFieldType, List<String>> imageUrlsByFieldType = new HashMap<>();

    if (HotelAssetSuggestionStatus.SUCCESS.equals(hotelAssetSuggestion.getStatus())) {
      // Adds URLs of suggested image assets.
      for (HotelImageAsset hotelImageAsset : hotelAssetSuggestion.getImageAssetsList()) {
        AssetFieldType assetFieldType = hotelImageAsset.getAssetFieldType();
        System.out.printf(
            "An image asset with URL '%s' is suggested for the asset field type '%s'.%n",
            hotelImageAsset.getUri(), assetFieldType);

        imageUrlsByFieldType
            .computeIfAbsent(assetFieldType, ft -> new ArrayList<>())
            .add(hotelImageAsset.getUri());
      }
    }

    // Collects more image URLs by field type to fulfill the requirements.
    for (Entry<AssetFieldType, Integer> requiredEntry :
        MIN_REQUIRED_IMAGE_ASSET_COUNTS.entrySet()) {
      AssetFieldType assetFieldType = requiredEntry.getKey();
      imageUrlsByFieldType.computeIfAbsent(assetFieldType, k -> new ArrayList<>());
      int i = 0;
      while (imageUrlsByFieldType.get(assetFieldType).size() < requiredEntry.getValue()) {
        String imageUrlFromDefaults = DEFAULT_IMAGE_ASSETS_INFO.get(assetFieldType).get(i++);
        System.out.printf(
            "A default image URL '%s' is used to create an image asset for the asset field type"
                + " '%s'.%n",
            imageUrlFromDefaults, assetFieldType);
        imageUrlsByFieldType
            .computeIfAbsent(assetFieldType, ft -> new ArrayList<>())
            .add(imageUrlFromDefaults);
      }
    }

    // Converts the list of URLs by field type into AssetOperations and AssetGroupAssetOperations.
    for (Entry<AssetFieldType, List<String>> fieldTypeEntry : imageUrlsByFieldType.entrySet()) {
      AssetFieldType assetFieldType = fieldTypeEntry.getKey();
      for (String url : fieldTypeEntry.getValue()) {
        // Retrieves the image data from the URL.
        byte[] imageData;
        try {
          imageData = ByteStreams.toByteArray(new URL(url).openStream());
        } catch (IOException e) {
          throw new RuntimeException("Failed to retrieve image data from URL: " + url, e);
        }

        // Builds the image asset.
        Asset asset =
            Asset.newBuilder()
                .setResourceName(ResourceNames.asset(customerId, temporaryId--))
                // Provide a unique friendly name to identify your asset.
                // When there is an existing image asset with the same content but a different name,
                // the
                // new name will be dropped silently.
                .setName(
                    String.format(
                        "%s#%s", assetFieldType, CodeSampleHelper.getShortPrintableDateTime()))
                .setImageAsset(ImageAsset.newBuilder().setData(ByteString.copyFrom(imageData)))
                .build();
        // Adds an operation to create the Asset.
        mutateOperations.add(
            MutateOperation.newBuilder()
                .setAssetOperation(AssetOperation.newBuilder().setCreate(asset))
                .build());

        // Builds the AssetGroupAsset.
        AssetGroupAsset assetGroupAsset =
            AssetGroupAsset.newBuilder()
                // References the Asset above by resource name.
                .setAsset(asset.getResourceName())
                .setAssetGroup(assetGroupResourceName)
                .setFieldType(assetFieldType)
                .build();
        // Adds an operation to link the Asset to the AssetGroup.
        mutateOperations.add(
            MutateOperation.newBuilder()
                .setAssetGroupAssetOperation(
                    AssetGroupAssetOperation.newBuilder().setCreate(assetGroupAsset))
                .build());
      }
    }
    return mutateOperations;
  }

  /**
   * Prints the details of a MutateGoogleAdsResponse. Parses the "response" oneof field name and
   * uses it to extract the new entity's name and resource name.
   *
   * @param response the mutate Google Ads response.
   */
  private void printResponseDetails(MutateGoogleAdsResponse response) {
    for (MutateOperationResponse operationResponse : response.getMutateOperationResponsesList()) {
      ResponseCase responseCase = operationResponse.getResponseCase();
      String resourceName;
      switch (responseCase) {
        case ASSET_RESULT:
          resourceName = operationResponse.getAssetResult().getResourceName();
          break;
        case ASSET_GROUP_RESULT:
          resourceName = operationResponse.getAssetGroupResult().getResourceName();
          break;
        case ASSET_GROUP_ASSET_RESULT:
          resourceName = operationResponse.getAssetGroupAssetResult().getResourceName();
          break;
        case ASSET_SET_ASSET_RESULT:
          resourceName = operationResponse.getAssetSetAssetResult().getResourceName();
          break;
        case CAMPAIGN_BUDGET_RESULT:
          resourceName = operationResponse.getCampaignBudgetResult().getResourceName();
          break;
        case CAMPAIGN_RESULT:
          resourceName = operationResponse.getCampaignResult().getResourceName();
          break;
        default:
          throw new IllegalArgumentException("Unexpected response case: " + responseCase);
      }
      System.out.printf("Created a(n) %s with resource name: '%s'%n", responseCase, resourceName);
    }
  }
}

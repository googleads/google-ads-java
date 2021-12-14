// Copyright 2021 Google LLC
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
import com.google.ads.googleads.examples.utils.CodeSampleHelper;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v9.common.AdScheduleInfo;
import com.google.ads.googleads.v9.common.AdTextAsset;
import com.google.ads.googleads.v9.common.KeywordThemeInfo;
import com.google.ads.googleads.v9.common.LocationInfo;
import com.google.ads.googleads.v9.common.SmartCampaignAdInfo;
import com.google.ads.googleads.v9.enums.AdGroupTypeEnum.AdGroupType;
import com.google.ads.googleads.v9.enums.AdTypeEnum.AdType;
import com.google.ads.googleads.v9.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType;
import com.google.ads.googleads.v9.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v9.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v9.enums.BudgetTypeEnum.BudgetType;
import com.google.ads.googleads.v9.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v9.enums.DayOfWeekEnum.DayOfWeek;
import com.google.ads.googleads.v9.enums.MinuteOfHourEnum.MinuteOfHour;
import com.google.ads.googleads.v9.errors.GoogleAdsError;
import com.google.ads.googleads.v9.errors.GoogleAdsException;
import com.google.ads.googleads.v9.resources.Ad;
import com.google.ads.googleads.v9.resources.KeywordThemeConstant;
import com.google.ads.googleads.v9.resources.SmartCampaignSetting;
import com.google.ads.googleads.v9.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v9.services.KeywordThemeConstantServiceClient;
import com.google.ads.googleads.v9.services.MutateGoogleAdsResponse;
import com.google.ads.googleads.v9.services.MutateOperation;
import com.google.ads.googleads.v9.services.MutateOperationResponse;
import com.google.ads.googleads.v9.services.SmartCampaignSuggestServiceClient;
import com.google.ads.googleads.v9.services.SmartCampaignSuggestionInfo;
import com.google.ads.googleads.v9.services.SmartCampaignSuggestionInfo.BusinessContext;
import com.google.ads.googleads.v9.services.SmartCampaignSuggestionInfo.LocationList;
import com.google.ads.googleads.v9.services.SuggestKeywordThemeConstantsRequest;
import com.google.ads.googleads.v9.services.SuggestKeywordThemeConstantsResponse;
import com.google.ads.googleads.v9.services.SuggestKeywordThemesRequest;
import com.google.ads.googleads.v9.services.SuggestKeywordThemesResponse;
import com.google.ads.googleads.v9.services.SuggestSmartCampaignAdRequest;
import com.google.ads.googleads.v9.services.SuggestSmartCampaignAdResponse;
import com.google.ads.googleads.v9.services.SuggestSmartCampaignBudgetOptionsRequest;
import com.google.ads.googleads.v9.services.SuggestSmartCampaignBudgetOptionsResponse;
import com.google.ads.googleads.v9.services.SuggestSmartCampaignBudgetOptionsResponse.BudgetOption;
import com.google.ads.googleads.v9.utils.ResourceNames;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.Message;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** Demonstrates how to create a Smart Campaign. */
public class AddSmartCampaign {
  private static final long GEO_TARGET_CONSTANT = 1023191;
  private static final String COUNTRY_CODE = "US";
  private static final String LANGUAGE_CODE = "en";
  private static final String LANDING_PAGE_URL = "http://www.example.com";
  private static final String PHONE_NUMBER = "555-555-5555";
  private static final long BUDGET_TEMPORARY_ID = -1;
  private static final long SMART_CAMPAIGN_TEMPORARY_ID = -2;
  private static final long AD_GROUP_TEMPORARY_ID = -3;
  private static final int NUM_REQUIRED_HEADLINES = 3;
  private static final int NUM_REQUIRED_DESCRIPTIONS = 2;

  private static class AddSmartCampaignParams extends CodeSampleParams {

    @Parameter(
        names = ArgumentNames.CUSTOMER_ID,
        description = "The Google Ads customer ID",
        required = true)
    private long customerId;

    @Parameter(
        names = ArgumentNames.KEYWORD_TEXT,
        description =
            "A keyword text used to retrieve keyword theme constant suggestions from the"
                + " KeywordThemeConstantService. These keyword theme suggestions are generated"
                + " using auto-completion data for the given text and may help improve the"
                + " performance of the Smart campaign.")
    private String keyword;

    @Parameter(
        names = ArgumentNames.FREEFORM_KEYWORD_TEXT,
        description =
            "A keyword text used to create a freeform keyword theme, which is entirely"
                + " user-specified and not derived from any suggestion service. Using free-form"
                + " keyword themes is typically not recommended because they are less effective"
                + " than suggested keyword themes, however they are useful in situations where a"
                + " very specific term needs to be targeted.")
    private String freeFormKeywordText;

    @Parameter(
        names = ArgumentNames.BUSINESS_LOCATION_ID,
        description =
            "The ID of a Business Profile location. This is required if a business name is not"
                + " provided. It can be retrieved using the Business Profile API, for details see:"
                + " https://developers.google.com/my-business/reference/rest/v4/accounts.locations")
    private String locationId;

    @Parameter(
        names = ArgumentNames.BUSINESS_NAME,
        description =
            "The name of a Business Profile business. This is required if a business"
                + " location ID is not provided.")
    private String businessName;
  }

  public static void main(String[] args) throws IOException {
    AddSmartCampaignParams params = new AddSmartCampaignParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");

      // Optionally specifies a seed keyword.
      params.keyword = null;
      // Optionally specifies a keyword that should be included as-is.
      params.freeFormKeywordText = null;

      // Must specify one of location ID or business name.
      params.locationId = "INSERT_BUSINESS_LOCATION_ID_HERE";
      params.businessName = "INSERT_BUSINESS_NAME";
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
      new AddSmartCampaign()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.keyword,
              params.freeFormKeywordText,
              params.locationId,
              params.businessName);
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

  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String keyword,
      String freeFormKeywordText,
      String locationId,
      String businessName) {
    if (locationId == null && businessName == null) {
      throw new RuntimeException("Must provider either --locationId or --businessName");
    }

    // [START add_smart_campaign_14]
    // Converts the location ID to unsigned long (potentially contains IDs with the most significant
    // bit set).
    Long locationIdParsed = (locationId == null ? null : Long.parseUnsignedLong(locationId));
    // [END add_smart_campaign_14]

    // [START add_smart_campaign_12]
    // Gets the SmartCampaignSuggestionInfo object which acts as the basis for many of the
    // entities necessary to create a Smart campaign. It will be reused a number of times to
    // retrieve suggestions for keyword themes, budget amount, ad creatives, and campaign criteria.
    SmartCampaignSuggestionInfo suggestionInfo =
        getSmartCampaignSuggestionInfo(googleAdsClient, locationIdParsed, businessName);

    // Generates a list of keyword themes using the SuggestKeywordThemes method on the
    // SmartCampaignSuggestService. It is strongly recommended that you use this strategy for
    // generating keyword themes.
    List<KeywordThemeConstant> keywordThemeConstants =
        getKeywordThemeSuggestions(googleAdsClient, customerId, suggestionInfo);

    // Optionally retrieves auto-complete suggestions for the given keyword text and adds them to
    // the list of keyWordThemeConstants.
    if (keyword != null) {
      keywordThemeConstants.addAll(getKeywordTextAutoCompletions(googleAdsClient, keyword));
    }

    // Converts the KeywordThemeConstants to KeywordThemeInfos.
    List<KeywordThemeInfo> keywordThemeInfos = getKeywordThemeInfos(keywordThemeConstants);

    // Optionally includes any freeform keywords in verbatim.
    // [START add_smart_campaign_13]
    if (freeFormKeywordText != null) {
      keywordThemeInfos.add(
          KeywordThemeInfo.newBuilder().setFreeFormKeywordTheme(freeFormKeywordText).build());
    }
    // [END add_smart_campaign_13]

    // Includes the keyword suggestions in the overall SuggestionInfo object.
    suggestionInfo = suggestionInfo.toBuilder().addAllKeywordThemes(keywordThemeInfos).build();
    // [END add_smart_campaign_12]

    // Generates a suggested daily budget.
    long suggestedDailyBudgetMicros =
        getBudgetSuggestions(googleAdsClient, customerId, suggestionInfo);

    // Creates adSuggestions.
    SmartCampaignAdInfo adSuggestions =
        getAdSuggestions(googleAdsClient, customerId, suggestionInfo);

    // Creates an array of operations which will create the campaign and related entities.
    List<MutateOperation> operations =
        new ArrayList(
            Arrays.asList(
                createCampaignBudgetOperation(customerId, suggestedDailyBudgetMicros),
                createSmartCampaignOperation(customerId),
                createSmartCampaignSettingOperation(customerId, locationIdParsed, businessName),
                createAdGroupOperation(customerId),
                createAdGroupAdOperation(customerId, adSuggestions)));
    operations.addAll(
        createCampaignCriterionOperations(customerId, keywordThemeInfos, suggestionInfo));

    // Issues a mutate request to add the various entities required for a smart campaign.
    sendMutateRequest(googleAdsClient, customerId, operations);
  }

  /** Retrieves KeywordThemeConstants suggestions with the suggestKeywordThemes service. */
  // [START add_smart_campaign_11]
  private List<KeywordThemeConstant> getKeywordThemeSuggestions(
      GoogleAdsClient googleAdsClient,
      long customerId,
      SmartCampaignSuggestionInfo suggestionInfo) {
    // Creates the service client.
    try (SmartCampaignSuggestServiceClient client =
        googleAdsClient.getLatestVersion().createSmartCampaignSuggestServiceClient()) {
      // Sends the request.
      SuggestKeywordThemesResponse response =
          client.suggestKeywordThemes(
              SuggestKeywordThemesRequest.newBuilder()
                  .setSuggestionInfo(suggestionInfo)
                  .setCustomerId(String.valueOf(customerId))
                  .build());
      // Prints some information about the result.
      System.out.printf(
          "Retrieved %d keyword theme constant suggestions from the SuggestKeywordThemes method.%n",
          response.getKeywordThemesCount());
      return new ArrayList(response.getKeywordThemesList());
    }
  }
  // [END add_smart_campaign_11]

  /**
   * Retrieves KeywordThemeConstants that are derived from autocomplete data for the given keyword
   * text.
   */
  // [START add_smart_campaign]
  private List<KeywordThemeConstant> getKeywordTextAutoCompletions(
      GoogleAdsClient googleAdsClient, String keywordText) {
    try (KeywordThemeConstantServiceClient client =
        googleAdsClient.getLatestVersion().createKeywordThemeConstantServiceClient()) {
      SuggestKeywordThemeConstantsRequest request =
          SuggestKeywordThemeConstantsRequest.newBuilder()
              .setQueryText(keywordText)
              .setCountryCode(COUNTRY_CODE)
              .setLanguageCode(LANGUAGE_CODE)
              .build();
      SuggestKeywordThemeConstantsResponse response = client.suggestKeywordThemeConstants(request);
      return response.getKeywordThemeConstantsList();
    }
  }
  // [END add_smart_campaign]

  /**
   * Builds a SmartCampaignSuggestionInfo object with business details.
   *
   * <p>The details are used by the SmartCampaignSuggestService to suggest a budget amount as well
   * as creatives for the ad.
   *
   * <p>Note that when retrieving ad creative suggestions it's required that the "final_url",
   * "language_code" and "keyword_themes" fields are set on the SmartCampaignSuggestionInfo
   * instance.
   *
   * @return SmartCampaignSuggestionInfo a SmartCampaignSuggestionInfo instance.
   */
  // [START add_smart_campaign_9]
  private SmartCampaignSuggestionInfo getSmartCampaignSuggestionInfo(
      GoogleAdsClient googleAdsClient, Long locationId, String businessName) {
    SmartCampaignSuggestionInfo.Builder suggestionInfoBuilder =
        SmartCampaignSuggestionInfo.newBuilder()
            // Adds the URL of the campaign's landing page.
            .setFinalUrl(LANDING_PAGE_URL)
            // Adds the language code for the campaign.
            .setLanguageCode(LANGUAGE_CODE)
            // Constructs location information using the given geo target constant. It's also
            // possible to provide a geographic proximity using the "proximity" field,
            // for example:
            // .setProximity(
            //     ProximityInfo.newBuilder()
            //         .setAddress(
            //             AddressInfo.newBuilder()
            //                 .setPostalCode(INSERT_POSTAL_CODE)
            //                 .setProvinceCode(INSERT_PROVINCE_CODE)
            //                 .setCountryCode(INSERT_COUNTRY_CODE)
            //                 .setProvinceName(INSERT_PROVINCE_NAME)
            //                 .setStreetAddress(INSERT_STREET_ADDRESS)
            //                 .setStreetAddress2(INSERT_STREET_ADDRESS_2)
            //                 .setCityName(INSERT_CITY_NAME)
            //                 .build())
            //         .setRadius(INSERT_RADIUS)
            //         .setRadiusUnits(INSERT_RADIUS_UNITS)
            //         .build())
            // For more information on proximities see:
            // https://developers.google.com/google-ads/api/reference/rpc/latest/ProximityInfo
            //
            // Adds LocationInfo objects to the list of locations. You have the option of
            // providing multiple locations when using location-based suggestions.
            .setLocationList(
                LocationList.newBuilder()
                    // Sets one location to the resource name of the given geo target constant.
                    .addLocations(
                        LocationInfo.newBuilder()
                            .setGeoTargetConstant(
                                ResourceNames.geoTargetConstant(GEO_TARGET_CONSTANT))
                            .build())
                    .build())
            // Adds a schedule detailing which days of the week the business is open.
            // This schedule describes a schedule in which the business is open on
            // Mondays from 9am to 5pm.
            .addAdSchedules(
                AdScheduleInfo.newBuilder()
                    // Sets the day of this schedule as Monday.
                    .setDayOfWeek(DayOfWeek.MONDAY)
                    // Sets the start hour to 9am.
                    .setStartHour(9)
                    // Sets the end hour to 5pm.
                    .setEndHour(17)
                    // Sets the start and end minute of zero, for example: 9:00 and 5:00.
                    .setStartMinute(MinuteOfHour.ZERO)
                    .setEndMinute(MinuteOfHour.ZERO)
                    .build());

    // Sets either of the business_location_id or business_name, depending on whichever is
    // provided.
    if (locationId != null) {
      suggestionInfoBuilder.setBusinessLocationId(locationId);
    } else {
      suggestionInfoBuilder.setBusinessContext(
          BusinessContext.newBuilder().setBusinessName(businessName).build());
    }
    return suggestionInfoBuilder.build();
  }
  // [END add_smart_campaign_9]

  /**
   * Retrieves a suggested budget amount for a new budget.
   *
   * <p>Using the SmartCampaignSuggestService to determine a daily budget for new and existing Smart
   * campaigns is highly recommended because it helps the campaigns achieve optimal performance.
   *
   * @return the recommended budget amount in micros ($1 = 1_000_000 micros).
   */
  // [START add_smart_campaign_1]
  private long getBudgetSuggestions(
      GoogleAdsClient googleAdsClient,
      long customerId,
      SmartCampaignSuggestionInfo suggestionInfo) {
    SuggestSmartCampaignBudgetOptionsRequest.Builder request =
        SuggestSmartCampaignBudgetOptionsRequest.newBuilder()
            .setCustomerId(String.valueOf(customerId));

    // You can retrieve suggestions for an existing campaign by setting the
    // "campaign" field of the request equal to the resource name of a campaign
    // and leaving the rest of the request fields below unset:
    // request.setCampaign("INSERT_CAMPAIGN_RESOURCE_NAME_HERE");

    // Uses the suggestion_info field instead, since these suggestions are for a new campaign.
    request.setSuggestionInfo(suggestionInfo);

    // Issues a request to retrieve a budget suggestion.
    try (SmartCampaignSuggestServiceClient client =
        googleAdsClient.getLatestVersion().createSmartCampaignSuggestServiceClient()) {
      SuggestSmartCampaignBudgetOptionsResponse response =
          client.suggestSmartCampaignBudgetOptions(request.build());
      BudgetOption recommendation = response.getRecommended();
      System.out.printf(
          "A daily budget amount of %d micros was suggested, garnering an estimated minimum of %d"
              + " clicks and an estimated maximum of %d per day.%n",
          recommendation.getDailyAmountMicros(),
          recommendation.getMetrics().getMinDailyClicks(),
          recommendation.getMetrics().getMaxDailyClicks());
      return recommendation.getDailyAmountMicros();
    }
  }
  // [END add_smart_campaign_1]

  /**
   * Retrieves creative suggestions for a Smart campaign ad.
   *
   * <p>Using the SmartCampaignSuggestService to suggest creatives for new and existing Smart
   * campaigns is highly recommended because it helps the campaigns achieve optimal performance.
   *
   * @return SmartCampaignAdInfo a SmartCampaignAdInfo instance with suggested headlines and
   *     descriptions.
   */
  // [START add_smart_campaign_10]
  private SmartCampaignAdInfo getAdSuggestions(
      GoogleAdsClient googleAdsClient,
      long customerId,
      SmartCampaignSuggestionInfo suggestionInfo) {
    // Unlike the SuggestSmartCampaignBudgetOptions method, it's only possible to use
    // suggestion_info to retrieve ad creative suggestions.

    // Issues a request to retrieve ad creative suggestions.
    try (SmartCampaignSuggestServiceClient smartCampaignSuggestService =
        googleAdsClient.getLatestVersion().createSmartCampaignSuggestServiceClient()) {
      SuggestSmartCampaignAdResponse response =
          smartCampaignSuggestService.suggestSmartCampaignAd(
              SuggestSmartCampaignAdRequest.newBuilder()
                  .setCustomerId(Long.toString(customerId))
                  .setSuggestionInfo(suggestionInfo)
                  .build());

      // The SmartCampaignAdInfo object in the response contains a list of up to three headlines
      // and two descriptions. Note that some of the suggestions may have empty strings as text.
      // Before setting these on the ad you should review them and filter out any empty values.
      SmartCampaignAdInfo adSuggestions = response.getAdInfo();
      for (AdTextAsset headline : adSuggestions.getHeadlinesList()) {
        System.out.println(!headline.getText().isEmpty() ? headline.getText() : "None");
      }
      for (AdTextAsset description : adSuggestions.getDescriptionsList()) {
        System.out.println(!description.getText().isEmpty() ? description.getText() : "None");
      }
      return adSuggestions;
    }
  }
  // [END add_smart_campaign_10]

  /**
   * Creates a MutateOperation that creates a new CampaignBudget.
   *
   * <p>A temporary ID will be assigned to this campaign budget so that it can be referenced by
   * other objects being created in the same Mutate request.
   */
  // [START add_smart_campaign_2]
  private MutateOperation createCampaignBudgetOperation(long customerId, long dailyBudgetMicros) {
    MutateOperation.Builder builder = MutateOperation.newBuilder();
    builder
        .getCampaignBudgetOperationBuilder()
        .getCreateBuilder()
        .setName("Smart campaign budget " + CodeSampleHelper.getShortPrintableDateTime())
        .setDeliveryMethod(BudgetDeliveryMethod.STANDARD)
        // A budget used for Smart campaigns must have the type SMART_CAMPAIGN.
        .setType(BudgetType.SMART_CAMPAIGN)
        // The suggested budget amount from the SmartCampaignSuggestService is for a _daily_ budget.
        // We don't need to specify that here, because the budget period already defaults to DAILY.
        .setAmountMicros(dailyBudgetMicros)
        // Sets a temporary ID in the budget's resource name so it can be referenced by the campaign
        // in later steps.
        .setResourceName(ResourceNames.campaignBudget(customerId, BUDGET_TEMPORARY_ID));
    return builder.build();
  }
  // [END add_smart_campaign_2]

  /**
   * Creates a MutateOperation that creates a new Smart campaign.
   *
   * <p>A temporary ID will be assigned to this campaign so that it can be referenced by other
   * objects being created in the same Mutate request.
   */
  // [START add_smart_campaign_3]
  private MutateOperation createSmartCampaignOperation(long customerId) {
    MutateOperation.Builder builder = MutateOperation.newBuilder();
    builder
        .getCampaignOperationBuilder()
        .getCreateBuilder()
        .setName("Smart campaign " + CodeSampleHelper.getShortPrintableDateTime())
        .setStatus(CampaignStatus.PAUSED)
        .setAdvertisingChannelType(AdvertisingChannelType.SMART)
        .setAdvertisingChannelSubType(AdvertisingChannelSubType.SMART_CAMPAIGN)
        // Assigns the resource name with a temporary ID.
        .setResourceName(ResourceNames.campaign(customerId, SMART_CAMPAIGN_TEMPORARY_ID))
        .setCampaignBudget(ResourceNames.campaignBudget(customerId, BUDGET_TEMPORARY_ID));
    return builder.build();
  }
  // [END add_smart_campaign_3]

  /**
   * Creates a MutateOperation to create a new SmartCampaignSetting.
   *
   * <p>SmartCampaignSettings are unique in that they only support UPDATE operations, which are used
   * to update and create them. Below we will use a temporary ID in the resource name to associate
   * it with the campaign created in the previous step.
   */
  // [START add_smart_campaign_4]
  private MutateOperation createSmartCampaignSettingOperation(
      long customerId, Long locationId, String businessName) {
    MutateOperation.Builder builder = MutateOperation.newBuilder();
    SmartCampaignSetting.Builder settingBuilder =
        builder
            .getSmartCampaignSettingOperationBuilder()
            .getUpdateBuilder()
            .setResourceName(
                ResourceNames.smartCampaignSetting(customerId, SMART_CAMPAIGN_TEMPORARY_ID))
            .setFinalUrl(LANDING_PAGE_URL)
            .setAdvertisingLanguageCode(LANGUAGE_CODE);
    settingBuilder
        .getPhoneNumberBuilder()
        .setCountryCode(COUNTRY_CODE)
        .setPhoneNumber(PHONE_NUMBER);
    if (locationId != null) {
      settingBuilder.setBusinessLocationId(locationId);
    } else {
      settingBuilder.setBusinessName(businessName);
    }
    builder
        .getSmartCampaignSettingOperationBuilder()
        .setUpdateMask(FieldMasks.allSetFieldsOf(settingBuilder.build()));
    return builder.build();
  }
  // [END add_smart_campaign_4]

  /**
   * Creates a MutateOperation that creates a new ad group.
   *
   * <p>A temporary ID will be used in the campaign resource name for this ad group to associate it
   * with the Smart campaign created in earlier steps. A temporary ID will also be used for its own
   * resource name so that we can associate an ad group ad with it later in the process.
   *
   * <p>Only one ad group can be created for a given Smart campaign.
   */
  // [START add_smart_campaign_5]
  private MutateOperation createAdGroupOperation(long customerId) {
    MutateOperation.Builder builder = MutateOperation.newBuilder();
    builder
        .getAdGroupOperationBuilder()
        .getCreateBuilder()
        .setResourceName(ResourceNames.adGroup(customerId, AD_GROUP_TEMPORARY_ID))
        .setName("Smart campaign ad group " + CodeSampleHelper.getShortPrintableDateTime())
        .setCampaign(ResourceNames.campaign(customerId, SMART_CAMPAIGN_TEMPORARY_ID))
        .setType(AdGroupType.SMART_CAMPAIGN_ADS);
    return builder.build();
  }
  // [END add_smart_campaign_5]

  /**
   * Creates a MutateOperation that creates a new ad group ad.
   *
   * <p>A temporary ID will be used in the ad group resource name for this ad group ad to associate
   * it with the ad group created in earlier steps.
   */
  // [START add_smart_campaign_6]
  private MutateOperation createAdGroupAdOperation(
      long customerId, SmartCampaignAdInfo adSuggestions) {
    MutateOperation.Builder opBuilder = MutateOperation.newBuilder();

    // Constructs an Ad instance containing a SmartCampaignAd.
    Ad.Builder adBuilder = Ad.newBuilder();
    adBuilder
        .setType(AdType.SMART_CAMPAIGN_AD)
        // The SmartCampaignAdInfo object includes headlines and descriptions retrieved
        // from the suggestSmartCampaignAd method. It's recommended that users review and approve or
        // update these creatives before they're set on the ad. It's possible that some or all of
        // these assets may contain empty texts, which should not be set on the ad and instead
        // should be replaced with meaningful texts from the user. Below we just accept the
        // creatives that were suggested while filtering out empty assets, but individual workflows
        // will vary here.
        .getSmartCampaignAdBuilder()
        .addAllHeadlines(
            adSuggestions.getHeadlinesList().stream()
                .filter(h -> h.hasText())
                .collect(Collectors.toList()))
        .addAllDescriptions(
            adSuggestions.getDescriptionsList().stream()
                .filter(d -> d.hasText())
                .collect(Collectors.toList()));

    // Adds additional headlines + descriptions if we didn't get enough back from the suggestion
    // service.
    int numHeadlines = adBuilder.getSmartCampaignAdBuilder().getHeadlinesCount();
    if (numHeadlines < NUM_REQUIRED_HEADLINES) {
      for (int i = 0; i < NUM_REQUIRED_HEADLINES - numHeadlines; ++i) {
        adBuilder
            .getSmartCampaignAdBuilder()
            .addHeadlines(AdTextAsset.newBuilder().setText("Placeholder headline " + i).build());
      }
    }
    if (adSuggestions.getDescriptionsCount() < NUM_REQUIRED_DESCRIPTIONS) {
      int numDescriptions = adBuilder.getSmartCampaignAdBuilder().getDescriptionsCount();
      for (int i = 0; i < NUM_REQUIRED_DESCRIPTIONS - numDescriptions; ++i) {
        adBuilder
            .getSmartCampaignAdBuilder()
            .addDescriptions(
                AdTextAsset.newBuilder().setText("Placeholder description " + i).build());
      }
    }

    opBuilder
        .getAdGroupAdOperationBuilder()
        .getCreateBuilder()
        .setAdGroup(ResourceNames.adGroup(customerId, AD_GROUP_TEMPORARY_ID))
        .setAd(adBuilder);
    return opBuilder.build();
  }
  // [END add_smart_campaign_6]

  // [START add_smart_campaign_8]
  /**
   * Creates {@link com.google.ads.googleads.v9.resources.CampaignCriterion} operations for add each
   * {@link KeywordThemeInfo}.
   */
  private Collection<? extends MutateOperation> createCampaignCriterionOperations(
      long customerId,
      List<KeywordThemeInfo> keywordThemeInfos,
      SmartCampaignSuggestionInfo suggestionInfo) {
    List<MutateOperation> keywordThemeOperations =
        keywordThemeInfos.stream()
            .map(
                keywordTheme -> {
                  MutateOperation.Builder builder = MutateOperation.newBuilder();
                  builder
                      .getCampaignCriterionOperationBuilder()
                      .getCreateBuilder()
                      .setCampaign(ResourceNames.campaign(customerId, SMART_CAMPAIGN_TEMPORARY_ID))
                      .setKeywordTheme(keywordTheme);
                  return builder.build();
                })
            .collect(Collectors.toList());

    List<MutateOperation> locationOperations =
        suggestionInfo.getLocationList().getLocationsList().stream()
            .map(
                location -> {
                  MutateOperation.Builder builder = MutateOperation.newBuilder();
                  builder
                      .getCampaignCriterionOperationBuilder()
                      .getCreateBuilder()
                      .setCampaign(ResourceNames.campaign(customerId, SMART_CAMPAIGN_TEMPORARY_ID))
                      .setLocation(location);
                  return builder.build();
                })
            .collect(Collectors.toList());

    return Stream.concat(keywordThemeOperations.stream(), locationOperations.stream())
        .collect(Collectors.toList());
  }
  // [END add_smart_campaign_8]

  // [START add_smart_campaign_7]
  /**
   * Sends a mutate request with a group of mutate operations.
   *
   * <p>The {@link GoogleAdsServiceClient} allows batching together a list of operations. These are
   * executed sequentially, and later operations my refer to previous operations via temporary IDs.
   * For more detail on this, please refer to
   * https://developers.google.com/google-ads/api/docs/batch-processing/temporary-ids.
   */
  private void sendMutateRequest(
      GoogleAdsClient googleAdsClient, long customerId, List<MutateOperation> operations) {
    try (GoogleAdsServiceClient client =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      MutateGoogleAdsResponse outerResponse = client.mutate(String.valueOf(customerId), operations);
      for (MutateOperationResponse innerResponse :
          outerResponse.getMutateOperationResponsesList()) {
        OneofDescriptor oneofDescriptor =
            innerResponse.getDescriptorForType().getOneofs().stream()
                .filter(o -> o.getName().equals("response"))
                .findFirst()
                .get();
        Message createdEntity =
            (Message)
                innerResponse.getField(innerResponse.getOneofFieldDescriptor(oneofDescriptor));
        String resourceName =
            (String)
                createdEntity.getField(
                    createdEntity.getDescriptorForType().findFieldByName("resource_name"));
        System.out.printf(
            "Created a(n) %s with resource name: '%s'.%n",
            createdEntity.getClass().getSimpleName(), resourceName);
      }
    }
  }
  // [END add_smart_campaign_7]

  /**
   * Provides a helper method to convert {@link KeywordThemeConstant} to {@link KeywordThemeInfo}.
   */
  private List<KeywordThemeInfo> getKeywordThemeInfos(
      List<KeywordThemeConstant> keywordThemeConstants) {
    return keywordThemeConstants.stream()
        .map(
            k -> KeywordThemeInfo.newBuilder().setKeywordThemeConstant(k.getResourceName()).build())
        .collect(Collectors.toCollection(ArrayList::new));
  }
}

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
import com.google.ads.googleads.v13.common.AdScheduleInfo;
import com.google.ads.googleads.v13.common.AdTextAsset;
import com.google.ads.googleads.v13.common.KeywordThemeInfo;
import com.google.ads.googleads.v13.common.LocationInfo;
import com.google.ads.googleads.v13.common.SmartCampaignAdInfo;
import com.google.ads.googleads.v13.enums.AdGroupTypeEnum.AdGroupType;
import com.google.ads.googleads.v13.enums.AdTypeEnum.AdType;
import com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType;
import com.google.ads.googleads.v13.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v13.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v13.enums.BudgetTypeEnum.BudgetType;
import com.google.ads.googleads.v13.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v13.enums.DayOfWeekEnum.DayOfWeek;
import com.google.ads.googleads.v13.enums.MinuteOfHourEnum.MinuteOfHour;
import com.google.ads.googleads.v13.errors.GoogleAdsError;
import com.google.ads.googleads.v13.errors.GoogleAdsException;
import com.google.ads.googleads.v13.resources.Ad;
import com.google.ads.googleads.v13.resources.SmartCampaignSetting;
import com.google.ads.googleads.v13.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v13.services.KeywordThemeConstantServiceClient;
import com.google.ads.googleads.v13.services.MutateGoogleAdsResponse;
import com.google.ads.googleads.v13.services.MutateOperation;
import com.google.ads.googleads.v13.services.MutateOperationResponse;
import com.google.ads.googleads.v13.services.SmartCampaignSuggestServiceClient;
import com.google.ads.googleads.v13.services.SmartCampaignSuggestionInfo;
import com.google.ads.googleads.v13.services.SmartCampaignSuggestionInfo.BusinessContext;
import com.google.ads.googleads.v13.services.SmartCampaignSuggestionInfo.LocationList;
import com.google.ads.googleads.v13.services.SuggestKeywordThemeConstantsRequest;
import com.google.ads.googleads.v13.services.SuggestKeywordThemeConstantsResponse;
import com.google.ads.googleads.v13.services.SuggestKeywordThemesRequest;
import com.google.ads.googleads.v13.services.SuggestKeywordThemesResponse;
import com.google.ads.googleads.v13.services.SuggestKeywordThemesResponse.KeywordTheme;
import com.google.ads.googleads.v13.services.SuggestSmartCampaignAdRequest;
import com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse;
import com.google.ads.googleads.v13.services.SuggestSmartCampaignBudgetOptionsRequest;
import com.google.ads.googleads.v13.services.SuggestSmartCampaignBudgetOptionsResponse;
import com.google.ads.googleads.v13.services.SuggestSmartCampaignBudgetOptionsResponse.BudgetOption;
import com.google.ads.googleads.v13.utils.ResourceNames;
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
    private String keywordText;

    @Parameter(
        names = ArgumentNames.FREE_FORM_KEYWORD_TEXT,
        description =
            "A keyword text used to create a freeForm keyword theme, which is entirely"
                + " user-specified and not derived from any suggestion service. Using free-form"
                + " keyword themes is typically not recommended because they are less effective"
                + " than suggested keyword themes, however they are useful in situations where a"
                + " very specific term needs to be targeted.")
    private String freeFormKeywordText;

    @Parameter(
        names = ArgumentNames.BUSINESS_PROFILE_LOCATION,
        description =
            "The resource name of a Business Profile location. This is required if a business name"
                + " is not provided. It can be retrieved using the Business Profile API"
                + " (https://developers.google.com/my-business/reference/businessinformation/rest/v1/accounts.locations)"
                + " or from the Business Profile UI"
                + " (https://support.google.com/business/answer/10737668")
    private String businessProfileLocation;

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
      params.keywordText = null;
      // Optionally specifies a keyword that should be included as-is.
      params.freeFormKeywordText = null;

      // Must specify one of business profile location or business name.
      params.businessProfileLocation = "INSERT_BUSINESS_PROFILE_LOCATION_HERE";
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
              params.keywordText,
              params.freeFormKeywordText,
              params.businessProfileLocation,
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
      String keywordText,
      String freeFormKeywordText,
      String businessProfileLocation,
      String businessName) {
    // Checks that exactly one of businessProfileLocation and businessName is set.
    if (businessProfileLocation != null && businessName != null) {
      throw new IllegalArgumentException(
          "Both the business location resource name and business name are provided but they are"
              + " mutually exclusive. Please only set a value for one of them.");
    }
    if (businessProfileLocation == null && businessName == null) {
      throw new IllegalArgumentException(
          "Neither the business location resource name nor the business name are provided. Please"
              + " set a value for one of them.");
    }

    // [START add_smart_campaign_12]
    // Gets the SmartCampaignSuggestionInfo object which acts as the basis for many of the
    // entities necessary to create a Smart campaign. It will be reused a number of times to
    // retrieve suggestions for keyword themes, budget amount, ad creatives, and campaign criteria.
    SmartCampaignSuggestionInfo suggestionInfo =
        getSmartCampaignSuggestionInfo(googleAdsClient, businessProfileLocation, businessName);

    // Generates a list of keyword themes using the SuggestKeywordThemes method on the
    // SmartCampaignSuggestService. It is strongly recommended that you use this strategy for
    // generating keyword themes.
    List<KeywordTheme> keywordThemes =
        getKeywordThemeSuggestions(googleAdsClient, customerId, suggestionInfo);

    // If a keyword text is given, retrieves keyword theme constant suggestions from the
    // KeywordThemeConstantService, maps them to KeywordThemes, and appends them to the existing
    // list.
    // This logic should ideally only be used if the suggestions from the
    // getKeywordThemeSuggestions function are insufficient.
    if (keywordText != null) {
      keywordThemes.addAll(getKeywordTextAutoCompletions(googleAdsClient, keywordText));
    }

    // Converts the list of KeywordThemes to a list of KeywordThemes objects.
    List<KeywordThemeInfo> keywordThemeInfos = getKeywordThemeInfos(keywordThemes);

    // Optionally includes any freeForm keywords in verbatim.
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
                createSmartCampaignSettingOperation(
                    customerId, businessProfileLocation, businessName),
                createAdGroupOperation(customerId),
                createAdGroupAdOperation(customerId, adSuggestions)));
    operations.addAll(
        createCampaignCriterionOperations(customerId, keywordThemeInfos, suggestionInfo));

    // Issues a mutate request to add the various entities required for a smart campaign.
    sendMutateRequest(googleAdsClient, customerId, operations);
  }

  /**
   * Retrieves KeywordThemes using the given suggestion info.
   *
   * <p>Here we use the SuggestKeywordThemes method, which uses all of the business details included
   * in the given SmartCampaignSuggestionInfo instance to generate keyword theme suggestions. This
   * is the recommended way to generate keyword themes because it uses detailed information about
   * your business, its location, and website content to generate keyword themes.
   */
  // [START add_smart_campaign_11]
  private List<KeywordTheme> getKeywordThemeSuggestions(
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
          "Retrieved %d keyword theme suggestions from the SuggestKeywordThemes method.%n",
          response.getKeywordThemesCount());
      return new ArrayList(response.getKeywordThemesList());
    }
  }
  // [END add_smart_campaign_11]

  /**
   * Retrieves KeywordThemeConstants that are derived from autocomplete data for the given keyword
   * text, which are converted to a list of KeywordTheme objects before being returned.
   */
  // [START add_smart_campaign]
  private List<KeywordTheme> getKeywordTextAutoCompletions(
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
      // Converts the keyword theme constants to KeywordTheme instances for consistency with the
      // response from SmartCampaignSuggestService.SuggestKeywordThemes.
      return response.getKeywordThemeConstantsList().stream()
          .map(
              keywordThemeConstant ->
                  KeywordTheme.newBuilder().setKeywordThemeConstant(keywordThemeConstant).build())
          .collect(Collectors.toList());
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
      GoogleAdsClient googleAdsClient, String businessProfileLocation, String businessName) {
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

    // Sets either of the business_profile_location or business_name, depending on whichever is
    // provided.
    if (businessProfileLocation != null) {
      suggestionInfoBuilder.setBusinessProfileLocation(businessProfileLocation);
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
      long customerId, String businessProfileLocation, String businessName) {
    MutateOperation.Builder builder = MutateOperation.newBuilder();
    SmartCampaignSetting.Builder settingBuilder =
        builder
            .getSmartCampaignSettingOperationBuilder()
            .getUpdateBuilder()
            // Sets a temporary ID in the campaign setting's resource name to associate it with
            // the campaign created in the previous step.
            .setResourceName(
                ResourceNames.smartCampaignSetting(customerId, SMART_CAMPAIGN_TEMPORARY_ID));
    // Configures the SmartCampaignSetting using many of the same details used to
    // generate a budget suggestion.
    settingBuilder
        .setFinalUrl(LANDING_PAGE_URL)
        .setAdvertisingLanguageCode(LANGUAGE_CODE)
        .getPhoneNumberBuilder()
        .setCountryCode(COUNTRY_CODE)
        .setPhoneNumber(PHONE_NUMBER);

    // It's required that either a business profile location resource name or a business name is
    // added to the SmartCampaignSetting.
    if (businessProfileLocation != null) {
      settingBuilder.setBusinessProfileLocation(businessProfileLocation);
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
   * Creates {@link com.google.ads.googleads.v13.resources.CampaignCriterion} operations for add
   * each {@link KeywordThemeInfo}.
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
   * Provides a helper method to convert a list of {@link KeywordTheme} objects to a list of {@link
   * KeywordThemeInfo} objects.
   */
  private List<KeywordThemeInfo> getKeywordThemeInfos(List<KeywordTheme> keywordThemes) {
    return keywordThemes.stream()
        .map(
            keywordTheme -> {
              KeywordThemeInfo.Builder keywordThemeInfoBuilder = KeywordThemeInfo.newBuilder();
              // Checks if the keyword_theme_constant field is set.
              if (keywordTheme.hasKeywordThemeConstant()) {
                return keywordThemeInfoBuilder
                    .setKeywordThemeConstant(
                        keywordTheme.getKeywordThemeConstant().getResourceName())
                    .build();
              } else if (keywordTheme.hasFreeFormKeywordTheme()) {
                return keywordThemeInfoBuilder
                    .setFreeFormKeywordTheme(keywordTheme.getFreeFormKeywordTheme())
                    .build();
              } else {
                throw new IllegalArgumentException(
                    String.format("A malformed KeywordTheme was encountered: %s", keywordTheme));
              }
            })
        .collect(Collectors.toCollection(ArrayList::new));
  }
}

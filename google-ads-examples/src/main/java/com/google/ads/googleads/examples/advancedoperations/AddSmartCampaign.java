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
import com.google.ads.googleads.v8.common.AdTextAsset;
import com.google.ads.googleads.v8.common.KeywordThemeInfo;
import com.google.ads.googleads.v8.common.LocationInfo;
import com.google.ads.googleads.v8.enums.AdGroupTypeEnum.AdGroupType;
import com.google.ads.googleads.v8.enums.AdTypeEnum.AdType;
import com.google.ads.googleads.v8.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType;
import com.google.ads.googleads.v8.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v8.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v8.enums.BudgetTypeEnum.BudgetType;
import com.google.ads.googleads.v8.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v8.enums.CriterionTypeEnum.CriterionType;
import com.google.ads.googleads.v8.enums.DayOfWeekEnum.DayOfWeek;
import com.google.ads.googleads.v8.enums.MinuteOfHourEnum.MinuteOfHour;
import com.google.ads.googleads.v8.errors.GoogleAdsError;
import com.google.ads.googleads.v8.errors.GoogleAdsException;
import com.google.ads.googleads.v8.resources.Ad;
import com.google.ads.googleads.v8.resources.KeywordThemeConstant;
import com.google.ads.googleads.v8.resources.SmartCampaignSetting;
import com.google.ads.googleads.v8.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v8.services.KeywordThemeConstantServiceClient;
import com.google.ads.googleads.v8.services.MutateGoogleAdsResponse;
import com.google.ads.googleads.v8.services.MutateOperation;
import com.google.ads.googleads.v8.services.MutateOperationResponse;
import com.google.ads.googleads.v8.services.SmartCampaignSuggestServiceClient;
import com.google.ads.googleads.v8.services.SuggestKeywordThemeConstantsRequest;
import com.google.ads.googleads.v8.services.SuggestKeywordThemeConstantsResponse;
import com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsRequest;
import com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsResponse;
import com.google.ads.googleads.v8.services.SuggestSmartCampaignBudgetOptionsResponse.BudgetOption;
import com.google.ads.googleads.v8.utils.ResourceNames;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.Message;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/** Demonstrates how to create a Smart Campaign. */
public class AddSmartCampaign {

  private static final String DEFAULT_KEYWORD = "travel";
  private static final long GEO_TARGET_CONSTANT = 1023191;
  private static final String COUNTRY_CODE = "US";
  private static final String LANGUAGE_CODE = "en";
  private static final String LANDING_PAGE_URL = "http://www.example.com";
  private static final String PHONE_NUMBER = "555-555-5555";
  private static final long BUDGET_TEMPORARY_ID = -1;
  private static final long SMART_CAMPAIGN_TEMPORARY_ID = -2;
  private static final long AD_GROUP_TEMPORARY_ID = -3;

  private static class AddSmartCampaignParams extends CodeSampleParams {

    @Parameter(
        names = ArgumentNames.CUSTOMER_ID,
        description = "The Google Ads customer ID",
        required = true)
    private long customerId;

    @Parameter(
        names = ArgumentNames.KEYWORD_TEXT,
        description =
            "A keyword text used to generate a set of keyword themes, which are used to improve"
                + " the budget suggestion and performance of the Smart campaign. Default value is"
                + " 'travel'.")
    private String keyword = DEFAULT_KEYWORD;

    @Parameter(
        names = ArgumentNames.BUSINESS_LOCATION_ID,
        description =
            "The ID of a Google My Business (GMB) location. This is required if a business name is"
                + " not provided. It can be retrieved using the GMB API, for details see:"
                + " https://developers.google.com/my-business/reference/rest/v4/accounts.locations")
    private Long locationId;

    @Parameter(
        names = ArgumentNames.BUSINESS_NAME,
        description =
            "The name of a Google My Business (GMB) business. This is required if a business"
                + " location ID is not provided.")
    private String businessName;
  }

  public static void main(String[] args) throws IOException {
    AddSmartCampaignParams params = new AddSmartCampaignParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.keyword = "INSERT_KEYWORD HERE";

      // Must specify one of location ID or business name.
      params.locationId = Long.valueOf("INSERT_BUSINESS_LOCATION_ID_HERE");
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
      Long locationId,
      String businessName) {
    if (locationId == null && businessName == null) {
      throw new RuntimeException("Must provider either --locationId or --businessName");
    }

    // Generates some suggested keyword theme constants based on the --keywordText parameter.
    List<KeywordThemeConstant> keywordThemeConstants =
        getKeywordThemeConstants(googleAdsClient, keyword);

    // Converts the KeywordThemeConstants to KeywordThemeInfos.
    List<KeywordThemeInfo> keywordThemeInfos = getKeywordThemeInfos(keywordThemeConstants);

    // Generates a suggested daily budget.
    long suggestedDailyBudgetMicros =
        getBudgetSuggestions(googleAdsClient, customerId, locationId, keywordThemeInfos);

    // Creates an array of operations which will create the campaign and related entities.
    List<MutateOperation> operations =
        new ArrayList(
            Arrays.asList(
                createCampaignBudgetOperation(customerId, suggestedDailyBudgetMicros),
                createSmartCampaignOperation(customerId),
                createSmartCampaignSettingOperation(customerId, locationId, businessName),
                createAdGroupOperation(customerId),
                createAdGroupAdOperation(customerId)));
    operations.addAll(createCampaignCriterionOperations(customerId, keywordThemeInfos));

    // Issues a mutate request to add the various entities required for a smart campaign.
    sendMutateRequest(googleAdsClient, customerId, operations);
  }

  /** Retrieves KeywordThemeConstants for the given criteria. */
  // [START add_smart_campaign]
  private List<KeywordThemeConstant> getKeywordThemeConstants(
      GoogleAdsClient googleAdsClient, String keyword) {
    try (KeywordThemeConstantServiceClient client =
        googleAdsClient.getLatestVersion().createKeywordThemeConstantServiceClient()) {
      SuggestKeywordThemeConstantsRequest request =
          SuggestKeywordThemeConstantsRequest.newBuilder()
              .setQueryText(keyword)
              .setCountryCode(COUNTRY_CODE)
              .setLanguageCode(LANGUAGE_CODE)
              .build();
      SuggestKeywordThemeConstantsResponse response = client.suggestKeywordThemeConstants(request);
      return response.getKeywordThemeConstantsList();
    }
  }
  // [END add_smart_campaign]

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
      Long locationId,
      List<KeywordThemeInfo> keywordThemeInfos) {
    SuggestSmartCampaignBudgetOptionsRequest.Builder request =
        SuggestSmartCampaignBudgetOptionsRequest.newBuilder()
            .setCustomerId(String.valueOf(customerId));

    // You can retrieve suggestions for an existing campaign by setting the
    // "campaign" field of the request equal to the resource name of a campaign
    // and leaving the rest of the request fields below unset:
    // request.setCampaign("INSERT_CAMPAIGN_RESOURCE_NAME_HERE");

    // Uses the suggestion_info field instead, since these suggestions are for a new campaign.
    request
        .getSuggestionInfoBuilder()
        // Adds the URL of the campaign's landing page.
        .setFinalUrl(LANDING_PAGE_URL)
        // Appends keyword theme constants by mapping them to KeywordThemeInfos.
        .addAllKeywordThemes(keywordThemeInfos);

    // Constructs location information using the given geo target constant. It's
    // also possible to provide a geographic proximity using the "proximity"
    // field on suggestion_info, for example:
    // request
    //     .getSuggestionInfoBuilder()
    //     .getProximityBuilder()
    //     .getAddressBuilder()
    //     .setPostalCode("INSERT_POSTAL_CODE")
    //     .setProvinceCode("INSERT_PROVINCE_CODE")
    //     .setCountryCode("INSERT_COUNTRY_CODE")
    //     .setProvinceName("INSERT_PROVINCE_NAME")
    //     .setStreetAddress("INSERT_STREET_ADDRESS")
    //     .setStreetAddress2("INSERT_STREET_ADDRESS_2")
    //     .setCityName("INSERT_CITY_NAME");
    // request
    //     .getSuggestionInfoBuilder()
    //     .getProximityBuilder()
    //     .setRadius(INSERT_RADIUS)
    //     .setradiusunits(RADIUS_UNITS);
    //
    // For more information on proximities see:
    // https://developers.google.com/google-ads/api/reference/rpc/latest/ProximityInfo
    request
        .getSuggestionInfoBuilder()
        .getLocationListBuilder()
        .addLocations(
            LocationInfo.newBuilder()
                // Sets the location to the resource name of the given geo target constant.
                .setGeoTargetConstant(ResourceNames.geoTargetConstant(GEO_TARGET_CONSTANT))
                .build());

    // Adds a schedule detailing which days of the week the business is open.
    // The schedule below is for a business that is open on Mondays from 9am to 5pm.
    request
        .getSuggestionInfoBuilder()
        .addAdSchedulesBuilder()
        .setDayOfWeek(DayOfWeek.MONDAY)
        .setStartHour(9)
        .setEndHour(17)
        .setStartMinute(MinuteOfHour.ZERO)
        .setEndMinute(MinuteOfHour.ZERO);

    // Adds the GMB location ID, if provided.
    if (locationId != null) {
      request.getSuggestionInfoBuilder().setBusinessLocationId(locationId);
    }

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
   *
   * @return
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
            .setResourceName(ResourceNames.smartCampaignSetting(customerId, SMART_CAMPAIGN_TEMPORARY_ID))
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
  private MutateOperation createAdGroupAdOperation(long customerId) {
    MutateOperation.Builder opBuilder = MutateOperation.newBuilder();

    // Constructs an Ad instance containing a SmartCampaignAd.
    Ad.Builder adBuilder = Ad.newBuilder();
    adBuilder
        .setType(AdType.SMART_CAMPAIGN_AD)
        .getSmartCampaignAdBuilder()
        .addHeadlines(AdTextAsset.newBuilder().setText("Headline number one"))
        .addHeadlines(AdTextAsset.newBuilder().setText("Headline number two"))
        .addHeadlines(AdTextAsset.newBuilder().setText("Headline number three"))
        .addDescriptions(AdTextAsset.newBuilder().setText("Description number one"))
        .addDescriptions(AdTextAsset.newBuilder().setText("Description number two"));

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
   * Creates {@link com.google.ads.googleads.v8.resources.CampaignCriterion} operations for add each
   * {@link KeywordThemeInfo}.
   */
  private Collection<? extends MutateOperation> createCampaignCriterionOperations(
      long customerId, List<KeywordThemeInfo> keywordThemeInfos) {
    return keywordThemeInfos.stream()
        .map(
            keywordTheme -> {
              MutateOperation.Builder builder = MutateOperation.newBuilder();
              builder
                  .getCampaignCriterionOperationBuilder()
                  .getCreateBuilder()
                  .setCampaign(ResourceNames.campaign(customerId, SMART_CAMPAIGN_TEMPORARY_ID))
                  .setType(CriterionType.KEYWORD_THEME)
                  .setKeywordTheme(keywordTheme);
              return builder.build();
            })
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
        .collect(Collectors.toList());
  }
}

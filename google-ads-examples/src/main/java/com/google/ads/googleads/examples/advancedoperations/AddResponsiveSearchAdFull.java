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

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v20.common.LocationInfo;
import com.google.ads.googleads.v20.common.ManualCpc;
import com.google.ads.googleads.v20.resources.CampaignCriterion;
import com.google.ads.googleads.v20.services.CampaignCriterionOperation;
import com.google.ads.googleads.v20.services.CampaignCriterionServiceClient;
import com.google.ads.googleads.v20.services.GeoTargetConstantServiceClient;
import com.google.ads.googleads.v20.services.GeoTargetConstantSuggestion;
import com.google.ads.googleads.v20.services.MutateAdGroupCriteriaResponse;
import com.google.ads.googleads.v20.common.KeywordInfo;
import com.google.ads.googleads.v20.enums.AdGroupCriterionStatusEnum.AdGroupCriterionStatus;
import com.google.ads.googleads.v20.enums.KeywordMatchTypeEnum.KeywordMatchType;
import com.google.ads.googleads.v20.resources.AdGroupCriterion;
import com.google.ads.googleads.v20.services.AdGroupCriterionOperation;
import com.google.ads.googleads.v20.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v20.services.AdGroupOperation;
import com.google.ads.googleads.v20.services.AdGroupServiceClient;
import com.google.ads.googleads.v20.common.TargetSpend;
import com.google.ads.googleads.v20.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v20.enums.AdGroupStatusEnum.AdGroupStatus;
import com.google.ads.googleads.v20.enums.AdGroupTypeEnum.AdGroupType;
import com.google.ads.googleads.v20.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v20.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v20.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v20.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType;
import com.google.ads.googleads.v20.resources.AdGroup;
import com.google.ads.googleads.v20.resources.Campaign;
import com.google.ads.googleads.v20.resources.Campaign.NetworkSettings;
import com.google.ads.googleads.v20.resources.CampaignBudget;
import com.google.ads.googleads.v20.services.AdGroupAdOperation;
import com.google.ads.googleads.v20.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v20.services.CampaignBudgetOperation;
import com.google.ads.googleads.v20.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v20.services.CampaignOperation;
import com.google.ads.googleads.v20.services.CampaignServiceClient;
import com.google.ads.googleads.v20.services.MutateAdGroupAdsResponse;
import com.google.ads.googleads.v20.services.MutateAdGroupCriterionResult;
import com.google.ads.googleads.v20.services.MutateAdGroupsResponse;
import com.google.ads.googleads.v20.services.MutateCampaignBudgetsResponse;
import com.google.ads.googleads.v20.services.MutateCampaignCriteriaResponse;
import com.google.ads.googleads.v20.services.MutateCampaignCriterionResult;
import com.google.ads.googleads.v20.services.MutateCampaignsResponse;
import com.google.ads.googleads.v20.services.SuggestGeoTargetConstantsRequest;
import com.google.ads.googleads.v20.services.SuggestGeoTargetConstantsRequest.LocationNames;
import com.google.ads.googleads.v20.services.SuggestGeoTargetConstantsResponse;
import com.google.ads.googleads.v20.common.AdTextAsset;
import com.google.ads.googleads.v20.common.CustomizerValue;
import com.google.ads.googleads.v20.common.ResponsiveSearchAdInfo;
import com.google.ads.googleads.v20.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType;
import com.google.ads.googleads.v20.errors.GoogleAdsError;
import com.google.ads.googleads.v20.errors.GoogleAdsException;
import com.google.ads.googleads.v20.resources.Ad;
import com.google.ads.googleads.v20.resources.AdGroupAd;
import com.google.ads.googleads.v20.resources.CustomerCustomizer;
import com.google.ads.googleads.v20.resources.CustomizerAttribute;
import com.google.ads.googleads.v20.services.CustomerCustomizerOperation;
import com.google.ads.googleads.v20.services.CustomerCustomizerServiceClient;
import com.google.ads.googleads.v20.services.CustomizerAttributeOperation;
import com.google.ads.googleads.v20.services.CustomizerAttributeServiceClient;
import com.google.ads.googleads.v20.services.MutateCustomerCustomizersResponse;
import com.google.ads.googleads.v20.services.MutateCustomizerAttributesResponse;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.annotation.Nullable;

/**
 * This example shows how to create a complete Responsive Search Ad.
 *
 * <p>Includes creation of: budget, campaign, ad group, ad group ad, keywords, and geo targeting.
 *
 * <p>More details on Responsive Search Ads can be found here:
 * https://support.google.com/google-ads/answer/7684791
 */
public class AddResponsiveSearchAdFull {

  private static class AddResponsiveSearchAdFullParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    // The name of the customizer attribute to be used in the ad customizer, which must be unique.
    // To run this example multiple times, change this value or specify its corresponding argument.
    // Note that there is a limit for the number of enabled customizer attributes in one account,
    // so you shouldn't run this example more than necessary.
    // Visit
    // https://developers.google.com/google-ads/api/docs/ads/customize-responsive-search-ads?hl=en#rules_and_limitations
    // for details.
    //
    // Specify the customizer attribute name here or the default specified below will be used.
    @Parameter(names = ArgumentNames.CUSTOMIZER_ATTRIBUTE_NAME)
    private final String customizerAttributeName = "Price";
  }

  public static void main(String[] args) {
    AddResponsiveSearchAdFullParams params = new AddResponsiveSearchAdFullParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");

      // Optional: To use a different customizer attribute name from the default ("Price"),
      // uncomment the line below and insert the desired customizer attribute name.
      // params.customizerAttributeName = "INSERT_CUSTOMIZER_ATTRIBUTE_NAME_HERE";
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
      new AddResponsiveSearchAdFull()
          .runExample(googleAdsClient, params.customerId, params.customizerAttributeName);
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
   * @param customizerAttributeName the customizer attribute name.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, String customizerAttributeName) {
    if (customizerAttributeName != null && !customizerAttributeName.isEmpty()) {
      String customizerAttributeResourceName =
          createCustomizerAttribute(googleAdsClient, customerId, customizerAttributeName);

      linkCustomizerAttributeToCustomer(
          googleAdsClient, customerId, customizerAttributeResourceName);
    }

    String campaignBudget = createCampaignBudget(googleAdsClient, customerId);

    String campaignResourceName = createCampaign(googleAdsClient, customerId, campaignBudget);

    String adGroupResourceName = createAdGroup(googleAdsClient, customerId, campaignResourceName);

    createAdGroupAd(googleAdsClient, customerId, adGroupResourceName, customizerAttributeName);

    addKeywords(googleAdsClient, customerId, adGroupResourceName);

    addGeoTargeting(googleAdsClient, customerId, campaignResourceName);
  }

  // [START add_responsive_search_ad_full_1]
  /** Creates a customizer attribute with the specified customizer attribute name. */
  private static String createCustomizerAttribute(
      GoogleAdsClient googleAdsClient, long customerId, String customizerAttributeName) {
    // Creates a customizer attribute with the specified name.
    CustomizerAttribute customizerAttribute =
        CustomizerAttribute.newBuilder()
            .setName(customizerAttributeName)
            // Specifies the type to be 'PRICE' so that we can dynamically customize the part of the
            // ad's description that is a price of a product/service we advertise.
            .setType(CustomizerAttributeType.PRICE)
            .build();
    // Creates a customizer attribute operation for creating a customizer attribute.
    CustomizerAttributeOperation operation =
        CustomizerAttributeOperation.newBuilder().setCreate(customizerAttribute).build();

    try (CustomizerAttributeServiceClient customizerAttributeServiceClient =
        googleAdsClient.getLatestVersion().createCustomizerAttributeServiceClient()) {
      // Issues a mutate request to add the customizer attribute and prints its information.
      MutateCustomizerAttributesResponse response =
          customizerAttributeServiceClient.mutateCustomizerAttributes(
              Long.toString(customerId), ImmutableList.of(operation));
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Added a customizer with resource name '%s'.%n", resourceName);
      return resourceName;
    }
  }

  // [END add_responsive_search_ad_full_1]

  // [START add_responsive_search_ad_full_2]
  /**
   * Links the customizer attribute to the customer by providing a value to be used in a responsive
   * search ad that will be created in a later step.
   */
  private static void linkCustomizerAttributeToCustomer(
      GoogleAdsClient googleAdsClient, long customerId, String customizerAttributeResourceName) {
    // Creates a customer customizer with the value to be used in the responsive search ad.
    CustomerCustomizer customerCustomizer =
        CustomerCustomizer.newBuilder()
            .setCustomizerAttribute(customizerAttributeResourceName)
            // Specify '100USD' as a text value. The ad customizer will dynamically replace the
            // placeholder with this value when the ad serves.
            .setValue(
                CustomizerValue.newBuilder()
                    .setType(CustomizerAttributeType.PRICE)
                    .setStringValue("100USD")
                    .build())
            .build();

    // Creates a customer customizer operation.
    CustomerCustomizerOperation operation =
        CustomerCustomizerOperation.newBuilder().setCreate(customerCustomizer).build();

    try (CustomerCustomizerServiceClient customerCustomizerServiceClient =
        googleAdsClient.getLatestVersion().createCustomerCustomizerServiceClient()) {
      // Issues a mutate request to add the customer customizer and prints its information.
      MutateCustomerCustomizersResponse response =
          customerCustomizerServiceClient.mutateCustomerCustomizers(
              Long.toString(customerId), ImmutableList.of(operation));
      System.out.printf(
          "Added a customer customizer with resource name '%s'.%n",
          response.getResults(0).getResourceName());
    }
  }

  // [END add_responsive_search_ad_full_2]

  /**
   * Create an AdTextAsset.
   *
   * @param text: Text for headlines and descriptions.
   * @param pinnedField: To pin a text asset so it always shows in the ad.
   */
  private static AdTextAsset createAdTextAsset(
      String text, @Nullable ServedAssetFieldType pinnedField) {
    AdTextAsset.Builder adTextAsset = AdTextAsset.newBuilder().setText(text);
    if (pinnedField != null) {
      adTextAsset.setPinnedField(pinnedField);
    }
    return adTextAsset.build();
  }

  /**
   * Creates an AdTextAsset with a customizer.
   *
   * @param customizerAttributeResourceName: The resource name of the customizer attribute.
   */
  private static AdTextAsset createAdTextAssetWithCustomizer(
      String customizerAttributeResourceName) {

    // Creates this particular description using the ad customizer. Visit
    // https://developers.google.com/google-ads/api/docs/ads/customize-responsive-search-ads#ad_customizers_in_responsive_search_ads
    // for details about the placeholder format. The ad customizer replaces the placeholder with
    // the value we previously created and linked to the customer using CustomerCustomizer.
    AdTextAsset.Builder adTextAsset =
        AdTextAsset.newBuilder()
            .setText(String.format("Just {CUSTOMIZER.%s:10USD}", customizerAttributeResourceName));

    return adTextAsset.build();
  }

  /**
   * Creates the campaign budget resource.
   *
   * @param googleAdsClient: An initialized GoogleAdsClient instance.
   * @param customerId: A client customer ID.
   */
  private static String createCampaignBudget(GoogleAdsClient googleAdsClient, Long customerId) {
    // Creates the budget.
    CampaignBudget budget =
        CampaignBudget.newBuilder()
            .setName("Interplanetary Cruise Budget #" + getPrintableDateTime())
            .setDeliveryMethod(BudgetDeliveryMethod.STANDARD)
            .setAmountMicros(500000)
            .build();

    // Creates the operation.
    CampaignBudgetOperation operation =
        CampaignBudgetOperation.newBuilder().setCreate(budget).build();

    // Gets the CampaignBudgetService.
    try (CampaignBudgetServiceClient campaignBudgetServiceClient =
        googleAdsClient.getLatestVersion().createCampaignBudgetServiceClient()) {
      // Adds the campaign budget.
      MutateCampaignBudgetsResponse response =
          campaignBudgetServiceClient.mutateCampaignBudgets(
              Long.toString(customerId), ImmutableList.of(operation));

      // Displays the results.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Added budget with resource name %s.", resourceName);
      return resourceName;
    }
  }

  /**
   * Creates a campaign resource.
   *
   * @param googleAdsClient: An initialized GoogleAdsClient instance.
   * @param customerId: A client customer ID.
   * @param campaignBudget: A budget resource name.
   */
  private static String createCampaign(
      GoogleAdsClient googleAdsClient, Long customerId, String campaignBudget) {

    // Creates the campaign.
    Campaign.Builder campaignBuilder = Campaign.newBuilder();
    campaignBuilder.setName("Testing RSA via API #" + getPrintableDateTime());
    campaignBuilder.setAdvertisingChannelType(AdvertisingChannelType.SEARCH);
    campaignBuilder.setManualCpc(ManualCpc.getDefaultInstance());

    // Recommendation: Set the campaign to PAUSED when creating it to prevent the ads from
    // immediately serving. Set to ENABLED once you've added targeting and the ads are ready to
    // serve.
    campaignBuilder.setStatus(CampaignStatus.PAUSED);

    // Sets the bidding strategy and budget. The bidding strategy for Maximize Clicks is TargetSpend.
    // The targetSpendMicros is deprecated so don't put any value. See other bidding strategies you
    // can select in the link below.
    // https://developers.google.com/google-ads/api/reference/rpc/latest/Campaign#campaign_bidding_strategy
    campaignBuilder.setTargetSpend(TargetSpend.newBuilder().setTargetSpendMicros(0).build());
    campaignBuilder.setCampaignBudget(campaignBudget);

    // Sets the campaign network operations.
    campaignBuilder.setNetworkSettings(
        NetworkSettings.newBuilder()
            .setTargetGoogleSearch(true)
            .setTargetSearchNetwork(true)
            .setTargetPartnerSearchNetwork(false)
            // Enables Display Expansion on Search campaigns. For more details see:
            // https://support.google.com/google-ads/answer/7193800
            .setTargetContentNetwork(true)
            .build());

    // Optional: Sets the start date.
    // DateTime startTime = DateTime.now().plusDays(1);
    // campaignBuilder.setStartDate(startTime.toDate().toString());

    // Optional: Sets the end date.
    // DateTime endTime = startTime.plusWeeks(4);
    // campaignBuilder.setEndDate(endTime.toDate().toString());

    // Creates the operation.
    CampaignOperation operation =
        CampaignOperation.newBuilder().setCreate(campaignBuilder.build()).build();

    // Gets the CampaignService.
    try (CampaignServiceClient campaignServiceClient =
        googleAdsClient.getLatestVersion().createCampaignServiceClient()) {

      // Adds the campaign.
      MutateCampaignsResponse response =
          campaignServiceClient.mutateCampaigns(
              Long.toString(customerId), ImmutableList.of(operation));

      String resourceName = response.getResults(0).getResourceName();

      // Displays the result.
      System.out.printf("Added campaign with resource name %s", resourceName);
      return resourceName;
    }
  }

  /**
   * Creates an ad group.
   *
   * @param googleAdsClient: An initialized GoogleAdsClient instance.
   * @param customerId: A client customer ID.
   * @param campaignResourceName: An campaign resource name.
   */
  private static String createAdGroup(
      GoogleAdsClient googleAdsClient, Long customerId, String campaignResourceName) {

    // Creates the ad group.
    AdGroup adGroup =
        AdGroup.newBuilder()
            .setName("Testing RSA via API " + getPrintableDateTime())
            .setStatus(AdGroupStatus.ENABLED)
            .setCampaign(campaignResourceName)
            .setType(AdGroupType.SEARCH_STANDARD)
            .build();

    // If you want to set up a max CPC bid, uncomment the line below;
    // adGroup = adGroup.toBuilder().setCpcBidMicros(10000000).build();

    // Creates the operation.
    AdGroupOperation operation = AdGroupOperation.newBuilder().setCreate(adGroup).build();

    // Gets the AdGroupService.
    try (AdGroupServiceClient adGroupServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupServiceClient()) {
      // Add the ad group.
      MutateAdGroupsResponse response =
          adGroupServiceClient.mutateAdGroups(
              Long.toString(customerId), ImmutableList.of(operation));

      // Displays the result.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Added ad group with resource name %s.", resourceName);
      return resourceName;
    }
  }

  /**
   * Creates an ad group ad.
   *
   * @param googleAdsClient: An initialized GoogleAdsClient instance.
   * @param customerId: A client customer ID.
   * @param adGroupResourceName: An ad group resource name.
   * @param customizerAttributeName: (optional) If present, indicates the resource name of the
   *     custoimizer attribute to use in one of the descriptions.
   */
  private static void createAdGroupAd(
      GoogleAdsClient googleAdsClient,
      Long customerId,
      String adGroupResourceName,
      String customizerAttributeName) {

    // Creates an ad group ad to hold the ad.
    AdGroupAd.Builder adGroupAdBuilder = AdGroupAd.newBuilder().setStatus(AdGroupAdStatus.ENABLED);
    adGroupAdBuilder.setAdGroup(adGroupResourceName);

    // Creates the ad and set responsive search ad info.

    // The list of possible final URLs after all cross-domain redirects for the ad.
    Ad.Builder adBuilder = Ad.newBuilder().addFinalUrls("https://www.example.com/");

    // Sets a pinning to always choose this asset for HEADLINE_1. Pinning is optional; if no pinning
    // is set, then headlines and descriptions will be rotated and the ones that perform best will
    // be used more often.

    // Headline 1
    AdTextAsset pinned_headline =
        createAdTextAsset("Headline 1 testing", ServedAssetFieldType.HEADLINE_1);

    // Headline 2 and 3
    ResponsiveSearchAdInfo.Builder responsiveSearchAdBuilder =
        ResponsiveSearchAdInfo.newBuilder()
            .addAllHeadlines(
                ImmutableList.of(
                    pinned_headline,
                    createAdTextAsset("Headline 2 testing", null),
                    createAdTextAsset("Headline 3 testing", null)));

    // Description 1.
    AdTextAsset description1 = createAdTextAsset("Desc 1 testing", null);

    // Creates this particular description using the ad customizer.
    AdTextAsset description2 = null;
    if (customizerAttributeName != null) {
      description2 = createAdTextAssetWithCustomizer(customizerAttributeName);
    } else {
      description2 = createAdTextAsset("Desc 2 testing", null);
    }
    responsiveSearchAdBuilder.addAllDescriptions(ImmutableList.of(description1, description2));

    // Paths
    // First and second part of text that can be appended to the URL in the ad.
    // If you use the examples below, the ad will show https://www.example.com/all-inclusive/deals
    responsiveSearchAdBuilder.setPath1("all-inclusive");
    responsiveSearchAdBuilder.setPath2("deals");

    adBuilder.setResponsiveSearchAd(responsiveSearchAdBuilder);
    adGroupAdBuilder.setAd(adBuilder);

    // Creates an ad group ad operation.
    AdGroupAdOperation operation =
        AdGroupAdOperation.newBuilder().setCreate(adGroupAdBuilder).build();

    // Gets the AdGroupAdService.
    try (AdGroupAdServiceClient adGroupAdServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupAdServiceClient()) {

      // Sends a request to the server to add a responsive search ad
      MutateAdGroupAdsResponse response =
          adGroupAdServiceClient.mutateAdGroupAds(
              Long.toString(customerId), ImmutableList.of(operation));

      // Displays the result.
      System.out.printf(
          "Created responsive search ad with resource name '%s'.%n",
          response.getResults(0).getResourceName());
    }
  }

  /**
   * Creates keywords.
   *
   * <p>Creates 3 keyword match types: EXACT, PHRASE, BROAD.
   *
   * <p>EXACT: Ads may show on searches that ARE the same meaning as your keyword. PHRASE: Ads may
   * show on searches that INCLUDE the meaning of your keyword. BROAD: Ads may show on searches that
   * RELATE to your keyword.
   *
   * <p>For smart bidding, BROAD is the recommended match type.
   *
   * @param googleAdsClient: An initialized GoogleAdsClient instance.
   * @param customerId: A client customer ID.
   * @param adGroupResourceName: An ad group resource name.
   */
  private static void addKeywords(
      GoogleAdsClient googleAdsClient, Long customerId, String adGroupResourceName) {

    // Creates keyword 1.
    AdGroupCriterion.Builder keyword1 =
        AdGroupCriterion.newBuilder()
            .setAdGroup(adGroupResourceName)
            .setStatus(AdGroupCriterionStatus.ENABLED)
            .setKeyword(
                KeywordInfo.newBuilder()
                    .setText("example of exact match")
                    .setMatchType(KeywordMatchType.EXACT)
                    .build());

    // Uncomment the below line if you want to change this keyword to a negative target.
    // keyword1.setNegative(true);

    // Optional repeated field
    // keyword1.setFinalUrls(0, "https://www.example.com");

    AdGroupCriterionOperation operation1 =
        AdGroupCriterionOperation.newBuilder().setCreate(keyword1).build();

    // Creates keyword 2.
    AdGroupCriterion.Builder keyword2 =
        AdGroupCriterion.newBuilder()
            .setAdGroup(adGroupResourceName)
            .setStatus(AdGroupCriterionStatus.ENABLED)
            .setKeyword(
                KeywordInfo.newBuilder()
                    .setText("example of phrase match")
                    .setMatchType(KeywordMatchType.PHRASE));

    // Uncomment the below line if you want to change this keyword to a negative target.
    // keyword2.setNegative(true);

    // Optional repeated field
    // keyword2.setFinalUrls(0, "https://www.example.com");

    AdGroupCriterionOperation operation2 =
        AdGroupCriterionOperation.newBuilder().setCreate(keyword2).build();

    // Creates keyword 3.
    AdGroupCriterion.Builder keyword3 =
        AdGroupCriterion.newBuilder()
            .setAdGroup(adGroupResourceName)
            .setStatus(AdGroupCriterionStatus.ENABLED)
            .setKeyword(
                KeywordInfo.newBuilder()
                    .setText("example of broad match")
                    .setMatchType(KeywordMatchType.BROAD));

    // Uncomment the below line if you want to change this keyword to a negative target.
    // keyword3.setNegative(true);

    // Optional repeated field
    // keyword3.setFinalUrls(0, "https://www.example.com");

    AdGroupCriterionOperation operation3 =
        AdGroupCriterionOperation.newBuilder().setCreate(keyword3).build();

    // Gets the AdGroupCriterionService.
    try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupCriterionServiceClient()) {

      // Adds the keywords.
      MutateAdGroupCriteriaResponse response =
          adGroupCriterionServiceClient.mutateAdGroupCriteria(
              Long.toString(customerId), ImmutableList.of(operation1, operation2, operation3));

      // Displays the results.
      for (MutateAdGroupCriterionResult result : response.getResultsList()) {
        System.out.printf("Created keyword '%s'.%n", result.getResourceName());
      }
    }
  }

  /**
   * Creates geo targets.
   *
   * @param googleAdsClient: An initialized GoogleAdsClient instance.
   * @param customerId: A client customer ID.
   * @param campaignResourceName: A campaign resource name.
   */
  private static void addGeoTargeting(
      GoogleAdsClient googleAdsClient, Long customerId, String campaignResourceName) {

    // Searches by location names from GeoTargetConstantService.suggestGeoTargetConstants() and
    // directly apply GeoTargetConstant.resourceName.
    SuggestGeoTargetConstantsRequest.Builder gtcRequestBuilder =
        SuggestGeoTargetConstantsRequest.newBuilder().setLocale("es").setCountryCode("AR");

    // The location names to get suggested geo target constants.
    gtcRequestBuilder.setLocationNames(
        LocationNames.newBuilder()
            .addAllNames(ImmutableList.of("Buenos Aires", "San Isidro", "Mar del Plata"))
            .build());

    try (GeoTargetConstantServiceClient geoTargetConstantServiceClient =
        googleAdsClient.getLatestVersion().createGeoTargetConstantServiceClient()) {
      SuggestGeoTargetConstantsResponse results =
          geoTargetConstantServiceClient.suggestGeoTargetConstants(gtcRequestBuilder.build());

      ArrayList<CampaignCriterionOperation> operations =
          new ArrayList<CampaignCriterionOperation>();
      for (GeoTargetConstantSuggestion suggestion : results.getGeoTargetConstantSuggestionsList()) {
        System.out.printf(
            "geoTargetConstant: %s is found in LOCALE %s with reach %s from search term %s.",
            suggestion.getGeoTargetConstant().getResourceName(),
            suggestion.getLocale(),
            suggestion.getReach(),
            suggestion.getSearchTerm());

        // Creates the campaign criterion for loaction targeting.
        CampaignCriterion campaignCriterion =
            CampaignCriterion.newBuilder()
                .setCampaign(campaignResourceName)
                .setLocation(
                    LocationInfo.newBuilder()
                        .setGeoTargetConstant(suggestion.getGeoTargetConstant().getResourceName())
                        .build())
                .build();

        CampaignCriterionOperation operation =
            CampaignCriterionOperation.newBuilder().setCreate(campaignCriterion).build();
        operations.add(operation);
      }

      // Gets the CampaignCriterionService.
      try (CampaignCriterionServiceClient campaignCriterionServiceClient =
          googleAdsClient.getLatestVersion().createCampaignCriterionServiceClient()) {
        MutateCampaignCriteriaResponse response =
            campaignCriterionServiceClient.mutateCampaignCriteria(
                Long.toString(customerId), operations);

        // Displays the results.
        for (MutateCampaignCriterionResult result : response.getResultsList()) {
          System.out.printf("Added campaign criterion %s", result.getResourceName());
        }
      }
    }
  }
}

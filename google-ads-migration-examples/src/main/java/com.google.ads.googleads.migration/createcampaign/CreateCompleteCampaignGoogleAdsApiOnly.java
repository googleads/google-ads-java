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

package com.google.ads.googleads.migration.createcampaign;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.migration.utils.ArgumentNames;
import com.google.ads.googleads.migration.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v0.utils.ResourceNames;
import com.google.ads.googleads.v1.common.ExpandedTextAdInfo;
import com.google.ads.googleads.v1.common.KeywordInfo;
import com.google.ads.googleads.v1.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v1.enums.AdGroupCriterionStatusEnum.AdGroupCriterionStatus;
import com.google.ads.googleads.v1.enums.AdGroupStatusEnum.AdGroupStatus;
import com.google.ads.googleads.v1.enums.AdGroupTypeEnum.AdGroupType;
import com.google.ads.googleads.v1.enums.KeywordMatchTypeEnum.KeywordMatchType;
import com.google.ads.googleads.v1.errors.GoogleAdsException;
import com.google.ads.googleads.v1.common.ManualCpc;
import com.google.ads.googleads.v1.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v1.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v1.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v1.errors.GoogleAdsError;
import com.google.ads.googleads.v1.resources.*;
import com.google.ads.googleads.v1.resources.Campaign.NetworkSettings;
import com.google.ads.googleads.v1.services.*;
import com.google.ads.googleads.v1.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.BoolValue;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTime;

public class CreateCompleteCampaignGoogleAdsApiOnly {

  private static final int PAGE_SIZE = 1_000;

  /** The number of campaigns this example will add. */
  private static final int NUMBER_OF_ADS = 5;

  private static final List<String> KEYWORDS_TO_ADD = Arrays.asList("mars cruise", "space hotel");

  private static class CreateCompleteCampaignGoogleAdsApiOnlyParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    CreateCompleteCampaignGoogleAdsApiOnlyParams params =
      new CreateCompleteCampaignGoogleAdsApiOnlyParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
    }

    GoogleAdsClient googleAdsClient;
    try {
      googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
        "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      return;
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      return;
    }

    try {
      new CreateCompleteCampaignGoogleAdsApiOnly().runExample(googleAdsClient, params.customerId);
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
    }
  }

  /**
   * Retrieves the keyword ad group criteria.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param newResourceNames resource names of the new ad group criteria.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private List<AdGroupCriterion> getKeywords(GoogleAdsClient googleAdsClient, long customerId,
                                             List<String> newResourceNames) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
           googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {

      SearchGoogleAdsRequest request = SearchGoogleAdsRequest.newBuilder()
        .setCustomerId(Long.toString(customerId))
        .setPageSize(PAGE_SIZE)
        .setQuery(String.format("SELECT " +
          "ad_group.id, " +
          "ad_group.status," +
          "ad_group_criterion.criterion_id," +
          "ad_group_criterion.keyword.text" +
          "ad_group_criterion.keyword.match_type" +
          "FROM ad_group_criterion" +
          "WHERE ad_group_criterion.type = 'KEYWORD'" +
          "AND ad_group.status = 'ENABLED'" +
          "AND ad_group_criterion.status IN ('%s')",
          String.join(", ", newResourceNames)))
        .build();

      SearchPagedResponse response = googleAdsServiceClient.search(request);

      List<AdGroupCriterion> adGroupCriteria = new ArrayList<>();
      for (GoogleAdsRow googleAdsRow : response.iterateAll()) {
        adGroupCriteria.add(googleAdsRow.getAdGroupCriterion());
      }
      return adGroupCriteria;
    }
  }

  /**
   * Creates keywords ad group criteria.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroup the ad group for the new criteria.
   * @param keywordsToAdd the keywords to add to the text ads.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private List<AdGroupCriterion> createKeywords(GoogleAdsClient googleAdsClient, long customerId,
                             AdGroup adGroup, List<String> keywordsToAdd) {
    String adGroupResourceName = ResourceNames.adGroup(customerId, adGroup.getId().getValue());

    List<AdGroupCriterionOperation> operations = new ArrayList<>(keywordsToAdd.size());

    for (String keywordText : keywordsToAdd) {
      // Create the keyword criterion
      AdGroupCriterion adGroupCriterion = AdGroupCriterion.newBuilder()
        .setAdGroup(StringValue.of(adGroupResourceName))
        .setStatus(AdGroupCriterionStatus.ENABLED)
        .setKeyword(KeywordInfo.newBuilder()
          .setText(StringValue.of(keywordText))
          .setMatchType(KeywordMatchType.EXACT)
          .build())
        .build();

      AdGroupCriterionOperation op = AdGroupCriterionOperation
        .newBuilder().setCreate(adGroupCriterion).build();
      operations.add(op);
    }

    try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
           googleAdsClient.getLatestVersion()
      .createAdGroupCriterionServiceClient()) {
      MutateAdGroupCriteriaResponse response =
        adGroupCriterionServiceClient.mutateAdGroupCriteria(Long.toString(customerId), operations);
      System.out.printf("Added %d keywords:%n", response.getResultsCount());
      List <String> newCriteriaResourceNames = new ArrayList<>();
      for (MutateAdGroupCriterionResult result : response.getResultsList()) {
        newCriteriaResourceNames.add(result.getResourceName());
      }

      List <AdGroupCriterion> newCriteria =
        getKeywords(googleAdsClient, customerId, newCriteriaResourceNames);
      for (AdGroupCriterion newCriterion : newCriteria) {
        System.out.printf("Keyword with text=%s, id=%s, and match type=%s was retrieved for ad group=%s.",
          newCriterion.getKeyword().getText().getValue(),
          newCriterion.getCriterionId().getValue(),
          newCriterion.getKeyword().getMatchType(),
          newCriterion.getAdGroup());
      }

      return newCriteria;
    }
  }

  /**
   * Retrieves the ad group ads.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param newResourceNames resource names of the new ad group ad.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private List<AdGroupAd> getAdGroupAds(GoogleAdsClient googleAdsClient, long customerId,
                                             List<String> newResourceNames) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
           googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {

      SearchGoogleAdsRequest request = SearchGoogleAdsRequest.newBuilder()
        .setCustomerId(Long.toString(customerId))
        .setPageSize(PAGE_SIZE)
        .setQuery(String.format("SELECT " +
          "ad_group.id, " +
          "ad_group_ad.id, " +
          "ad_group_ad.ad.expanded_text_ad.headline_part1, " +
          "ad_group_ad.ad.expanded_text_ad.headline_part2, " +
          "ad_group_ad.status, " +
          "ad_group_ad.ad.final_urls, " +
          "ad_group_ad.resource_name " +
          "FROM ad_group_ad " +
          "WHERE ad_group_ad.resource_name IN ('%s')",
          String.join(", ", newResourceNames)))
        .build();

      SearchPagedResponse response = googleAdsServiceClient.search(request);

      List<AdGroupAd> adGroupAds = new ArrayList<>();
      for (GoogleAdsRow googleAdsRow : response.iterateAll()) {
        adGroupAds.add(googleAdsRow.getAdGroupAd());
      }
      return adGroupAds;
    }
  }

  /**
   * Creates text ads.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroup the ad group for the text ad.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private List<AdGroupAd> createTextAds(GoogleAdsClient googleAdsClient, long customerId,
                             AdGroup adGroup) {
    String adGroupResourceName = ResourceNames.adGroup(customerId, adGroup.getId().getValue());

    List<AdGroupAdOperation> operations = new ArrayList<>(NUMBER_OF_ADS);

    for (int i = 0; i < NUMBER_OF_ADS; i++) {

      // Create the text ad
      AdGroupAd adgroupAd = AdGroupAd.newBuilder()
        .setAdGroup(StringValue.of(adGroupResourceName))
        .setStatus(AdGroupAdStatus.PAUSED)
        .setAd(Ad.newBuilder()
          .setFinalUrls(i, StringValue.of("http://www.example.com/" + String.valueOf(i)))
          .setExpandedTextAd(ExpandedTextAdInfo.newBuilder()
            .setDescription(StringValue.of("Buy your tickets now!"))
            .setHeadlinePart1(StringValue.of("Cruise #" + String.valueOf(i) + " to Mars"))
            .setHeadlinePart2(StringValue.of("Best Space Cruise Line"))
            .setPath1(StringValue.of("path1"))
            .setPath2(StringValue.of("path2"))
            .build()))
        .build();

      AdGroupAdOperation op = AdGroupAdOperation.newBuilder().setCreate(adgroupAd).build();
      operations.add(op);
    }

    try (AdGroupAdServiceClient adGroupAdServiceClient = googleAdsClient.getLatestVersion()
      .createAdGroupAdServiceClient()) {
      MutateAdGroupAdsResponse response =
        adGroupAdServiceClient.mutateAdGroupAds(Long.toString(customerId), operations);
      List<String> newAdGroupAdResourceNames = new ArrayList<>();
      System.out.printf("Added %d text ads:%n", response.getResultsCount());
      for (MutateAdGroupAdResult result : response.getResultsList()) {
        newAdGroupAdResourceNames.add(result.getResourceName());
      }

      List<AdGroupAd> newAdGroupAds = getAdGroupAds(googleAdsClient, customerId, newAdGroupAdResourceNames);
      for (AdGroupAd newAdGroupAd : newAdGroupAds) {
        Ad ad = newAdGroupAd.getAd();
        ExpandedTextAdInfo expandedTextAdInfo = ad.getExpandedTextAd();
        System.out.printf("Expanded text ad with ID=%s, status=%s, " +
            "and headline='%s - %s' was found in ad group with ID=%s",
          ad.getId().getValue(), newAdGroupAd.getStatus(), expandedTextAdInfo.getHeadlinePart1().getValue(),
          expandedTextAdInfo.getHeadlinePart2().getValue(), adGroup.getId().getValue());
      }

      return newAdGroupAds;
    }
  }

  /**
   * Retrieves the ad group.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupResourceName resource names of the new ad group.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private AdGroup getAdGroup(GoogleAdsClient googleAdsClient, long customerId,
                                        String adGroupResourceName) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
           googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {

      SearchGoogleAdsRequest request = SearchGoogleAdsRequest.newBuilder()
        .setCustomerId(Long.toString(customerId))
        .setPageSize(PAGE_SIZE)
        .setQuery(String.format("SELECT ad_group.id, ad_group.name, ad_group.resource_name " +
          "FROM ad_group WHERE ad_group.resource_name = '%s'", adGroupResourceName))
        .build();

      SearchPagedResponse response = googleAdsServiceClient.search(request);
      return response.getPage().getResponse().getResults(0).getAdGroup();
    }
  }

  /**
   * Creates an ad group.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaign the campaign for the ad group.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private AdGroup createAdGroup(GoogleAdsClient googleAdsClient, long customerId,
                               Campaign campaign) {
    String campaignResourceName = ResourceNames.campaign(customerId, campaign.getId().getValue());

    // Create ad group, setting an optional CPC value.
    AdGroup adGroup =
      AdGroup.newBuilder()
        .setName(StringValue.of("Earth to Mars Cruises #" + System.currentTimeMillis()))
        .setStatus(AdGroupStatus.ENABLED)
        .setCampaign(StringValue.of(campaignResourceName))
        .setType(AdGroupType.SEARCH_STANDARD)
        .setCpcBidMicros(Int64Value.of(10_000_000L))
        .build();

    AdGroupOperation op = AdGroupOperation.newBuilder().setCreate(adGroup).build();

    try (AdGroupServiceClient adGroupServiceClient =
           googleAdsClient.getLatestVersion().createAdGroupServiceClient()) {
      MutateAdGroupsResponse response =
        adGroupServiceClient.mutateAdGroups(Long.toString(customerId), ImmutableList.of(op));
      String adGroupResourceName = response.getResults(0).getResourceName();
      AdGroup newAdGroup = getAdGroup(googleAdsClient, customerId, adGroupResourceName);
      System.out.printf("Ad group with ID=%s and name=%s was created",
        newAdGroup.getId().getValue(), newAdGroup.getName().getValue());
      return newAdGroup;
    }
  }

  /**
   * Retrieves the campaign.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignResourceName resource names of the new campaign.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private Campaign getCampaign(GoogleAdsClient googleAdsClient, long customerId,
                                   String campaignResourceName) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
           googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {

      SearchGoogleAdsRequest request = SearchGoogleAdsRequest.newBuilder()
        .setCustomerId(Long.toString(customerId))
        .setPageSize(PAGE_SIZE)
        .setQuery(String.format("SELECT campaign.id, campaign.name, campaign.resource_Name " +
          "FROM campaign " +
          "WHERE campaign.resource_name = '%s'", campaignResourceName))
        .build();

      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);
      return searchPagedResponse.getPage().getResponse().getResults(0).getCampaign();
    }
  }

  /**
   * Creates a campaign.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param budget the budget for the campaign.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private Campaign createCampaign(GoogleAdsClient googleAdsClient, long customerId,
                                CampaignBudget budget) {
    String budgetResourceName = ResourceNames.campaignBudget(customerId, budget.getId().getValue());

    // Configure the campaign network options
    NetworkSettings networkSettings =
      NetworkSettings.newBuilder()
        .setTargetGoogleSearch(BoolValue.of(true))
        .setTargetSearchNetwork(BoolValue.of(true))
        .setTargetContentNetwork(BoolValue.of(false))
        .setTargetPartnerSearchNetwork(BoolValue.of(false))
        .build();

    // Create the campaign.
    Campaign campaign =
      Campaign.newBuilder()
        .setName(StringValue.of("Interplanetary Cruise #" + System.currentTimeMillis()))
        .setAdvertisingChannelType(AdvertisingChannelType.SEARCH)
        // Recommendation: Set the campaign to PAUSED when creating it to prevent
        // the ads from immediately serving. Set to ENABLED once you've added
        // targeting and the ads are ready to serve
        .setStatus(CampaignStatus.PAUSED)
        // Set the bidding strategy and budget.
        .setManualCpc(ManualCpc.newBuilder().build())
        .setCampaignBudget(StringValue.of(budgetResourceName))
        // Add the networkSettings configured above.
        .setNetworkSettings(networkSettings)
        // Optional: Set the start & end dates.
        .setStartDate(StringValue.of(new DateTime().plusDays(1).toString("yyyyMMdd")))
        .setEndDate(StringValue.of(new DateTime().plusDays(30).toString("yyyyMMdd")))
        .build();

    CampaignOperation op = CampaignOperation.newBuilder().setCreate(campaign).build();

    try (CampaignServiceClient campaignServiceClient =
           googleAdsClient.getLatestVersion().createCampaignServiceClient()) {
      MutateCampaignsResponse response =
        campaignServiceClient.mutateCampaigns(Long.toString(customerId), ImmutableList.of(op));
      String campaignResourceName = response.getResults(0).getResourceName();
      Campaign newCampaign = getCampaign(googleAdsClient, customerId, campaignResourceName);
      System.out.printf("Campaign with ID=%s and name=%s was created.",
        campaign.getId().getValue(), campaign.getName().getValue());

      return newCampaign;
    }
  }

  /**
   * Retrieves the campaign budget.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param budgetResourceName resource names of the new campaign budget.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private CampaignBudget getBudget(GoogleAdsClient googleAdsClient, long customerId,
                                     String budgetResourceName) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
      googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {

      SearchGoogleAdsRequest request = SearchGoogleAdsRequest.newBuilder()
        .setCustomerId(Long.toString(customerId))
        .setPageSize(PAGE_SIZE)
        .setQuery(String.format("SELECT campaign_budget.id, campaign_budget.name, " +
          "campaign_budget.resource_name FROM campaign_budget " +
          "WHERE campaign_budget.resource_name = '%s'", budgetResourceName))
        .build();

      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);
      return searchPagedResponse.getPage().getResponse().getResults(0).getCampaignBudget();
    }
  }

  /**
   * Creates a budget.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private CampaignBudget createBudget(GoogleAdsClient googleAdsClient, long customerId) {
    CampaignBudget budget =
      CampaignBudget.newBuilder()
        .setName(StringValue.of("Interplanetary Cruise Budget #" + System.currentTimeMillis()))
        .setDeliveryMethod(BudgetDeliveryMethod.STANDARD)
        .setAmountMicros(Int64Value.of(500_000))
        .build();

    CampaignBudgetOperation op = CampaignBudgetOperation.newBuilder().setCreate(budget).build();

    try (CampaignBudgetServiceClient campaignBudgetServiceClient =
           googleAdsClient.getLatestVersion().createCampaignBudgetServiceClient()) {
      MutateCampaignBudgetsResponse response =
        campaignBudgetServiceClient.mutateCampaignBudgets(
          Long.toString(customerId), ImmutableList.of(op));
      String budgetResourceName = response.getResults(0).getResourceName();
      CampaignBudget newBudget = getBudget(googleAdsClient, customerId, budgetResourceName);
      System.out.printf("Budget with ID=%s and name=%s was created.",
        newBudget.getId().getValue(),
        newBudget.getName().getValue());

      return newBudget;
    }
  }

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    CampaignBudget budget = createBudget(googleAdsClient, customerId);
    Campaign campaign = createCampaign(googleAdsClient, customerId, budget);
    AdGroup adGroup = createAdGroup(googleAdsClient, customerId, campaign);
    createTextAds(googleAdsClient, customerId, adGroup);
    createKeywords(googleAdsClient, customerId, adGroup, KEYWORDS_TO_ADD);
  }
}

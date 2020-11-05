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
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.migration.utils.ArgumentNames;
import com.google.ads.googleads.migration.utils.CodeSampleParams;
import com.google.ads.googleads.v5.common.ExpandedTextAdInfo;
import com.google.ads.googleads.v5.common.KeywordInfo;
import com.google.ads.googleads.v5.common.ManualCpc;
import com.google.ads.googleads.v5.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v5.enums.AdGroupCriterionStatusEnum.AdGroupCriterionStatus;
import com.google.ads.googleads.v5.enums.AdGroupStatusEnum.AdGroupStatus;
import com.google.ads.googleads.v5.enums.AdGroupTypeEnum.AdGroupType;
import com.google.ads.googleads.v5.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v5.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v5.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v5.enums.KeywordMatchTypeEnum.KeywordMatchType;
import com.google.ads.googleads.v5.errors.GoogleAdsError;
import com.google.ads.googleads.v5.errors.GoogleAdsException;
import com.google.ads.googleads.v5.resources.Ad;
import com.google.ads.googleads.v5.resources.AdGroup;
import com.google.ads.googleads.v5.resources.AdGroupAd;
import com.google.ads.googleads.v5.resources.AdGroupCriterion;
import com.google.ads.googleads.v5.resources.Campaign;
import com.google.ads.googleads.v5.resources.Campaign.NetworkSettings;
import com.google.ads.googleads.v5.resources.CampaignBudget;
import com.google.ads.googleads.v5.services.AdGroupAdOperation;
import com.google.ads.googleads.v5.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v5.services.AdGroupCriterionOperation;
import com.google.ads.googleads.v5.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v5.services.AdGroupOperation;
import com.google.ads.googleads.v5.services.AdGroupServiceClient;
import com.google.ads.googleads.v5.services.CampaignBudgetOperation;
import com.google.ads.googleads.v5.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v5.services.CampaignOperation;
import com.google.ads.googleads.v5.services.CampaignServiceClient;
import com.google.ads.googleads.v5.services.GoogleAdsRow;
import com.google.ads.googleads.v5.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v5.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v5.services.MutateAdGroupAdResult;
import com.google.ads.googleads.v5.services.MutateAdGroupAdsResponse;
import com.google.ads.googleads.v5.services.MutateAdGroupCriteriaResponse;
import com.google.ads.googleads.v5.services.MutateAdGroupCriterionResult;
import com.google.ads.googleads.v5.services.MutateAdGroupsResponse;
import com.google.ads.googleads.v5.services.MutateCampaignBudgetsResponse;
import com.google.ads.googleads.v5.services.MutateCampaignsResponse;
import com.google.ads.googleads.v5.services.SearchGoogleAdsRequest;
import com.google.ads.googleads.v5.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.joda.time.DateTime;

/**
 * This code example is the last in a series of code examples that shows how to create a Search
 * campaign using the AdWords API, and then migrate it to the Google Ads API one functionality at a
 * time. See Step0 through Step5 for code examples in various stages of migration.
 *
 * <p>This code example represents the final state, where all the functionality - create a campaign
 * budget, a search campaign, an ad group, keywords, and expanded text ads have all been migrated to
 * using the Google Ads API. The AdWords API is not used.
 */
public class CreateCompleteCampaignGoogleAdsApiOnly {

  private static final int PAGE_SIZE = 1_000;

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

    // Initializes the Google Ads client.
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
    createTextAds(googleAdsClient, customerId, adGroup, NUMBER_OF_ADS);
    createKeywords(googleAdsClient, customerId, adGroup, KEYWORDS_TO_ADD);
  }

  /**
   * Creates a budget.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private CampaignBudget createBudget(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates the budget.
    CampaignBudget budget =
        CampaignBudget.newBuilder()
            .setName("Interplanetary Cruise Budget #" + System.currentTimeMillis())
            .setDeliveryMethod(BudgetDeliveryMethod.STANDARD)
            .setAmountMicros(10_000_000)
            .build();

    // Creates the operation.
    CampaignBudgetOperation op = CampaignBudgetOperation.newBuilder().setCreate(budget).build();

    // Gets the CampaignBudget service.
    try (CampaignBudgetServiceClient campaignBudgetServiceClient =
        googleAdsClient.getLatestVersion().createCampaignBudgetServiceClient()) {
      // Adds the budget.
      MutateCampaignBudgetsResponse response =
          campaignBudgetServiceClient.mutateCampaignBudgets(
              Long.toString(customerId), ImmutableList.of(op));
      String budgetResourceName = response.getResults(0).getResourceName();
      // Retrieves the budget.
      CampaignBudget newBudget = getBudget(googleAdsClient, customerId, budgetResourceName);
      // Displays the results.
      System.out.printf(
          "Budget with ID %s and name '%s' was created.%n", newBudget.getId(), newBudget.getName());
      return newBudget;
    }
  }

  /**
   * Retrieves the campaign budget.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param budgetResourceName resource name of the new campaign budget.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private CampaignBudget getBudget(
      GoogleAdsClient googleAdsClient, long customerId, String budgetResourceName) {
    // Gets the GoogleAdsService.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {

      // Creates the request.
      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setPageSize(PAGE_SIZE)
              .setQuery(
                  String.format(
                      "SELECT campaign_budget.id, campaign_budget.name, "
                          + "campaign_budget.resource_name FROM campaign_budget "
                          + "WHERE campaign_budget.resource_name = '%s'",
                      budgetResourceName))
              .build();

      // Retrieves the budget.
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);
      return searchPagedResponse.getPage().getResponse().getResults(0).getCampaignBudget();
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
  private Campaign createCampaign(
      GoogleAdsClient googleAdsClient, long customerId, CampaignBudget budget) {
    String budgetResourceName = ResourceNames.campaignBudget(customerId, budget.getId());

    // Configures the campaign network options
    NetworkSettings networkSettings =
        NetworkSettings.newBuilder()
            .setTargetGoogleSearch(true)
            .setTargetSearchNetwork(true)
            .setTargetContentNetwork(false)
            .setTargetPartnerSearchNetwork(false)
            .build();

    // Creates the campaign.
    Campaign campaign =
        Campaign.newBuilder()
            .setName("Interplanetary Cruise #" + System.currentTimeMillis())
            .setAdvertisingChannelType(AdvertisingChannelType.SEARCH)
            // Recommendation: Set the campaign to PAUSED when creating it to prevent
            // the ads from immediately serving. Set to ENABLED once you've added
            // targeting and the ads are ready to serve
            .setStatus(CampaignStatus.PAUSED)
            // Sets the bidding strategy and budget.
            .setManualCpc(ManualCpc.newBuilder().build())
            .setCampaignBudget(budgetResourceName)
            // Adds the networkSettings configured above.
            .setNetworkSettings(networkSettings)
            // Optional: sets the start & end dates.
            .setStartDate(new DateTime().plusDays(1).toString("yyyyMMdd"))
            .setEndDate(new DateTime().plusDays(30).toString("yyyyMMdd"))
            .build();

    // Creates the operation.
    CampaignOperation op = CampaignOperation.newBuilder().setCreate(campaign).build();

    // Gets the Campaign service.
    try (CampaignServiceClient campaignServiceClient =
        googleAdsClient.getLatestVersion().createCampaignServiceClient()) {
      // Adds the campaign.
      MutateCampaignsResponse response =
          campaignServiceClient.mutateCampaigns(Long.toString(customerId), ImmutableList.of(op));
      String campaignResourceName = response.getResults(0).getResourceName();
      // Retrieves the campaign.
      Campaign newCampaign = getCampaign(googleAdsClient, customerId, campaignResourceName);
      // Displays the results.
      System.out.printf(
          "Campaign with ID %s and name '%s' was created.%n",
          newCampaign.getId(), newCampaign.getName());
      return newCampaign;
    }
  }

  /**
   * Retrieves the campaign.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignResourceName resource name of the new campaign.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private Campaign getCampaign(
      GoogleAdsClient googleAdsClient, long customerId, String campaignResourceName) {
    // Gets the GoogleAdsService.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {

      // Creates the request.
      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setPageSize(PAGE_SIZE)
              .setQuery(
                  String.format(
                      "SELECT campaign.id, campaign.name, campaign.resource_name "
                          + "FROM campaign "
                          + "WHERE campaign.resource_name = '%s'",
                      campaignResourceName))
              .build();

      // Retrieves the campaign.
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);
      return searchPagedResponse.getPage().getResponse().getResults(0).getCampaign();
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
  private AdGroup createAdGroup(
      GoogleAdsClient googleAdsClient, long customerId, Campaign campaign) {
    String campaignResourceName = ResourceNames.campaign(customerId, campaign.getId());

    // Creates the ad group, setting an optional CPC value.
    AdGroup adGroup =
        AdGroup.newBuilder()
            .setName("Earth to Mars Cruises #" + System.currentTimeMillis())
            .setStatus(AdGroupStatus.ENABLED)
            .setCampaign(campaignResourceName)
            .setType(AdGroupType.SEARCH_STANDARD)
            .setCpcBidMicros(500_000L)
            .build();

    // Creates the operation.
    AdGroupOperation op = AdGroupOperation.newBuilder().setCreate(adGroup).build();

    // Gets the AdGroup Service.
    try (AdGroupServiceClient adGroupServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupServiceClient()) {
      // Adds the AdGroup.
      MutateAdGroupsResponse response =
          adGroupServiceClient.mutateAdGroups(Long.toString(customerId), ImmutableList.of(op));
      String adGroupResourceName = response.getResults(0).getResourceName();
      // Retrieves the AdGroup.
      AdGroup newAdGroup = getAdGroup(googleAdsClient, customerId, adGroupResourceName);
      // Displays the results.
      System.out.printf(
          "Ad group with ID %s and name '%s' was created.%n",
          newAdGroup.getId(), newAdGroup.getName());
      return newAdGroup;
    }
  }

  /**
   * Retrieves the ad group.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupResourceName resource name of the new ad group.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private AdGroup getAdGroup(
      GoogleAdsClient googleAdsClient, long customerId, String adGroupResourceName) {
    // Gets the GoogleAdsService.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {

      // Creates the request.
      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setPageSize(PAGE_SIZE)
              .setQuery(
                  String.format(
                      "SELECT ad_group.id, ad_group.name, ad_group.resource_name "
                          + "FROM ad_group WHERE ad_group.resource_name = '%s'",
                      adGroupResourceName))
              .build();
      // Retrieves the AdGroup.
      SearchPagedResponse response = googleAdsServiceClient.search(request);
      return response.getPage().getResponse().getResults(0).getAdGroup();
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
  private List<AdGroupAd> createTextAds(
      GoogleAdsClient googleAdsClient, long customerId, AdGroup adGroup, int numberOfAds) {
    String adGroupResourceName = ResourceNames.adGroup(customerId, adGroup.getId());

    List<AdGroupAdOperation> operations = new ArrayList<>();

    for (int i = 0; i < numberOfAds; i++) {
      // Creates the text ad
      AdGroupAd adgroupAd =
          AdGroupAd.newBuilder()
              .setAdGroup(adGroupResourceName)
              .setStatus(AdGroupAdStatus.PAUSED)
              .setAd(
                  Ad.newBuilder()
                      .addFinalUrls("http://www.example.com/" + String.valueOf(i))
                      .setExpandedTextAd(
                          ExpandedTextAdInfo.newBuilder()
                              .setDescription("Buy your tickets now!")
                              .setHeadlinePart1("Cruise #" + i + " to Mars")
                              .setHeadlinePart2("Best Space Cruise Line")
                              .setPath1("path1")
                              .setPath2("path2")
                              .build()))
              .build();

      // Creates the operation.
      AdGroupAdOperation op = AdGroupAdOperation.newBuilder().setCreate(adgroupAd).build();
      operations.add(op);
    }

    // Gets the AdGroupAd service.
    try (AdGroupAdServiceClient adGroupAdServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupAdServiceClient()) {
      // Adds the text ads.
      MutateAdGroupAdsResponse response =
          adGroupAdServiceClient.mutateAdGroupAds(Long.toString(customerId), operations);
      System.out.printf("Added %d text ads:%n", response.getResultsCount());
      // Creates a list of the text ad resource names.
      List<String> newAdGroupAdResourceNames = new ArrayList<>();
      for (MutateAdGroupAdResult result : response.getResultsList()) {
        newAdGroupAdResourceNames.add(result.getResourceName());
      }

      // Retrieves the expanded text ads.
      List<AdGroupAd> newAdGroupAds =
          getAdGroupAds(googleAdsClient, customerId, newAdGroupAdResourceNames);
      for (AdGroupAd newAdGroupAd : newAdGroupAds) {
        Ad ad = newAdGroupAd.getAd();
        ExpandedTextAdInfo expandedTextAdInfo = ad.getExpandedTextAd();
        // Displays the results.
        System.out.printf(
            "Expanded text ad with ID %s, status '%s', "
                + "and headline '%s - %s' was created in ad group with ID %s.%n",
            ad.getId(),
            newAdGroupAd.getStatus(),
            expandedTextAdInfo.getHeadlinePart1(),
            expandedTextAdInfo.getHeadlinePart2(),
            adGroup.getId());
      }
      return newAdGroupAds;
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
  private List<AdGroupAd> getAdGroupAds(
      GoogleAdsClient googleAdsClient, long customerId, List<String> newResourceNames) {
    // Gets the GoogleAdsService.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {

      // Creates the request.
      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setPageSize(PAGE_SIZE)
              .setQuery(
                  String.format(
                      "SELECT "
                          + "ad_group.id, "
                          + "ad_group_ad.ad.id, "
                          + "ad_group_ad.ad.expanded_text_ad.headline_part1, "
                          + "ad_group_ad.ad.expanded_text_ad.headline_part2, "
                          + "ad_group_ad.status, "
                          + "ad_group_ad.ad.final_urls, "
                          + "ad_group_ad.resource_name "
                          + "FROM ad_group_ad "
                          + "WHERE ad_group_ad.resource_name IN (%s)",
                      String.join(
                          ", ",
                          newResourceNames.stream()
                              .map(resourceName -> String.format("'%s'", resourceName))
                              .collect(Collectors.toList()))))
              .build();

      // Retrieves the ad group ads
      SearchPagedResponse response = googleAdsServiceClient.search(request);

      // Creates and returns a list of the ad group ads.
      List<AdGroupAd> adGroupAds = new ArrayList<>();
      for (GoogleAdsRow googleAdsRow : response.iterateAll()) {
        adGroupAds.add(googleAdsRow.getAdGroupAd());
      }
      return adGroupAds;
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
  private List<AdGroupCriterion> createKeywords(
      GoogleAdsClient googleAdsClient,
      long customerId,
      AdGroup adGroup,
      List<String> keywordsToAdd) {
    String adGroupResourceName = ResourceNames.adGroup(customerId, adGroup.getId());

    List<AdGroupCriterionOperation> operations = new ArrayList<>();

    for (String keywordText : keywordsToAdd) {
      // Creates the keyword criterion
      AdGroupCriterion adGroupCriterion =
          AdGroupCriterion.newBuilder()
              .setAdGroup(adGroupResourceName)
              .setStatus(AdGroupCriterionStatus.ENABLED)
              .setKeyword(
                  KeywordInfo.newBuilder()
                      .setText(keywordText)
                      .setMatchType(KeywordMatchType.EXACT)
                      .build())
              .build();

      // Creates the operation.
      AdGroupCriterionOperation op =
          AdGroupCriterionOperation.newBuilder().setCreate(adGroupCriterion).build();
      operations.add(op);
    }

    // Gets the AdGroupCriterionService.
    try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupCriterionServiceClient()) {
      // Adds the keywords
      MutateAdGroupCriteriaResponse response =
          adGroupCriterionServiceClient.mutateAdGroupCriteria(
              Long.toString(customerId), operations);
      System.out.printf("Added %d keywords:%n", response.getResultsCount());
      // Creates a list of new keyword resource names
      List<String> newCriteriaResourceNames = new ArrayList<>();
      for (MutateAdGroupCriterionResult result : response.getResultsList()) {
        newCriteriaResourceNames.add(result.getResourceName());
      }

      // Retrieves the newly created keywords.
      List<AdGroupCriterion> newCriteria =
          getKeywords(googleAdsClient, customerId, newCriteriaResourceNames);
      // Displays the results.
      for (AdGroupCriterion newCriterion : newCriteria) {
        System.out.printf(
            "Keyword with text '%s', ID %s, and match type '%s' was retrieved for ad group '%s'.%n",
            newCriterion.getKeyword().getText(),
            newCriterion.getCriterionId(),
            newCriterion.getKeyword().getMatchType(),
            adGroup.getName());
      }
      return newCriteria;
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
  private List<AdGroupCriterion> getKeywords(
      GoogleAdsClient googleAdsClient, long customerId, List<String> newResourceNames) {
    // Gets the GoogleAdsService.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {

      // Creates the request.
      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setPageSize(PAGE_SIZE)
              // Creates the search query.
              .setQuery(
                  String.format(
                      "SELECT "
                          + "ad_group.id, "
                          + "ad_group.status, "
                          + "ad_group_criterion.criterion_id, "
                          + "ad_group_criterion.keyword.text, "
                          + "ad_group_criterion.keyword.match_type "
                          + "FROM ad_group_criterion "
                          + "WHERE ad_group_criterion.type = 'KEYWORD' "
                          + "AND ad_group.status = 'ENABLED' "
                          + "AND ad_group_criterion.status IN ('ENABLED', 'PAUSED') "
                          + "AND ad_group_criterion.resource_name IN (%s) ",
                      String.join(
                          ", ",
                          newResourceNames.stream()
                              .map(resourceName -> String.format("'%s'", resourceName))
                              .collect(Collectors.toList()))))
              .build();

      // Retrieves the adGroupCriteria.
      SearchPagedResponse response = googleAdsServiceClient.search(request);

      // Creates and returns a list of adGroupCriteria
      List<AdGroupCriterion> adGroupCriteria = new ArrayList<>();
      for (GoogleAdsRow googleAdsRow : response.iterateAll()) {
        adGroupCriteria.add(googleAdsRow.getAdGroupCriterion());
      }
      return adGroupCriteria;
    }
  }
}

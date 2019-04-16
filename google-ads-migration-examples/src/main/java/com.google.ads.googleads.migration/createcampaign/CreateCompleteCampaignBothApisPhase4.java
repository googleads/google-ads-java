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

import static java.nio.charset.StandardCharsets.UTF_8;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.migration.utils.ArgumentNames;
import com.google.ads.googleads.migration.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v0.utils.ResourceNames;
import com.google.ads.googleads.v1.common.ExpandedTextAdInfo;
import com.google.ads.googleads.v1.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v1.enums.AdGroupStatusEnum.AdGroupStatus;
import com.google.ads.googleads.v1.enums.AdGroupTypeEnum.AdGroupType;
import com.google.ads.googleads.v1.errors.GoogleAdsException;
import com.google.ads.googleads.v1.common.ManualCpc;
import com.google.ads.googleads.v1.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v1.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v1.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v1.errors.GoogleAdsError;
import com.google.ads.googleads.v1.resources.Ad;
import com.google.ads.googleads.v1.resources.AdGroup;
import com.google.ads.googleads.v1.resources.AdGroupAd;
import com.google.ads.googleads.v1.resources.Campaign;
import com.google.ads.googleads.v1.resources.CampaignBudget;
import com.google.ads.googleads.v1.resources.Campaign.NetworkSettings;
import com.google.ads.googleads.v1.services.AdGroupAdOperation;
import com.google.ads.googleads.v1.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v1.services.AdGroupOperation;
import com.google.ads.googleads.v1.services.AdGroupServiceClient;
import com.google.ads.googleads.v1.services.CampaignOperation;
import com.google.ads.googleads.v1.services.CampaignServiceClient;
import com.google.ads.googleads.v1.services.CampaignBudgetOperation;
import com.google.ads.googleads.v1.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v1.services.GoogleAdsRow;
import com.google.ads.googleads.v1.services.MutateAdGroupAdResult;
import com.google.ads.googleads.v1.services.MutateAdGroupAdsResponse;
import com.google.ads.googleads.v1.services.MutateAdGroupsResponse;
import com.google.ads.googleads.v1.services.MutateCampaignBudgetsResponse;
import com.google.ads.googleads.v1.services.MutateCampaignsResponse;
import com.google.ads.googleads.v1.services.SearchGoogleAdsRequest;
import com.google.ads.googleads.v1.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v1.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201809.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201809.cm.Keyword;
import com.google.api.ads.adwords.axis.v201809.cm.KeywordMatchType;
import com.google.api.ads.adwords.axis.v201809.cm.Operator;
import com.google.api.ads.adwords.axis.v201809.cm.UrlList;
import com.google.api.ads.adwords.axis.v201809.cm.UserStatus;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.BoolValue;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.net.URLEncoder;

import org.joda.time.DateTime;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

/**
 * This code example is the fifth in a series of code examples that shows how to create a Search
 * campaign using the AdWords API, and then migrate it to the Google Ads API one functionality at a
 * time. See other examples for code examples in various stages of migration.
 *
 * In this code example, the functionality to create a campaign budget, a search campaign, an ad
 * group and expanded text ads have been migrated to the Google Ads API. The only remaining
 * functionality that uses the AdWords API is creating keywords.
 */
public class CreateCompleteCampaignBothApisPhase4 {

  private static final int PAGE_SIZE = 1_000;

  private static final int NUMBER_OF_ADS = 5;

  private static final List<String> KEYWORDS_TO_ADD = Arrays.asList("mars cruise", "space hotel");

  private static class CreateCompleteCampaignBothApisPhase4ParamsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    CreateCompleteCampaignBothApisPhase4ParamsParams params =
      new CreateCompleteCampaignBothApisPhase4ParamsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
    }

    // Initialize the Google Ads client.
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

    // Initialize the AdWords client.
    AdWordsSession session;
    try {
      // Generate a refreshable OAuth2 credential for AdWords API.
      Credential oAuth2Credential =
        new OfflineCredentials.Builder()
          .forApi(Api.ADWORDS)
          .fromFile()
          .build()
          .generateCredential();

      // Construct an AdWordsSession.
      session =
        new AdWordsSession.Builder().fromFile().withOAuth2Credential(oAuth2Credential).build();
    } catch (ConfigurationLoadException cle) {
      System.err.printf(
        "Failed to load configuration from the %s file. Exception: %s%n",
        DEFAULT_CONFIGURATION_FILENAME, cle);
      return;
    } catch (ValidationException ve) {
      System.err.printf(
        "Invalid configuration in the %s file. Exception: %s%n",
        DEFAULT_CONFIGURATION_FILENAME, ve);
      return;
    } catch (OAuthException oe) {
      System.err.printf(
        "Failed to create OAuth credentials. Check OAuth settings in the %s file. "
          + "Exception: %s%n",
        DEFAULT_CONFIGURATION_FILENAME, oe);
      return;
    }
    AdWordsServicesInterface adWordsServices = AdWordsServices.getInstance();

    try {
      new CreateCompleteCampaignBothApisPhase4()
        .runExample(googleAdsClient, adWordsServices, session, params.customerId);
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
    } catch (RemoteException re) {
      System.err.printf("Request failed unexpectedly due to RemoteException: %s%n", re);
    } catch (UnsupportedEncodingException ue) {
      System.err.printf("Example failed due to encoding exception: %s%n", ue);
    }
  }

  /**
   * Creates keywords ad group criteria.
   *
   * @param adWordsServices the Google AdWords services interface.
   * @param session the client session.
   * @param adGroup the ad group for the new criteria.
   * @param keywordsToAdd the keywords to add to the text ads.
   * @throws RemoteException if the API request failed due to other errors.
   * @throws UnsupportedEncodingException if encoding the final URL failed.
   */
  private AdGroupCriterion[] createKeywords(AdWordsServicesInterface adWordsServices,
                                            AdWordsSession session, AdGroup adGroup,
                                            List<String> keywordsToAdd)
    throws RemoteException, UnsupportedEncodingException {
    // Get the AdGroupCriterionService.
    AdGroupCriterionServiceInterface adGroupCriterionService =
      adWordsServices.get(session, AdGroupCriterionServiceInterface.class);

    AdGroupCriterionOperation[] ops = new AdGroupCriterionOperation[keywordsToAdd.size()];

    for (int i = 0; i < keywordsToAdd.size(); i++) {
      // Create the keyword.
      Keyword keyword = new Keyword();
      keyword.setText(keywordsToAdd.get(i));
      keyword.setMatchType(KeywordMatchType.EXACT);

      // Create biddable ad group criterion.
      BiddableAdGroupCriterion keywordBiddableAdGroupCriterion = new BiddableAdGroupCriterion();
      keywordBiddableAdGroupCriterion.setAdGroupId(adGroup.getId().getValue());
      keywordBiddableAdGroupCriterion.setCriterion(keyword);

      // You can optionally provide these field(s).
      keywordBiddableAdGroupCriterion.setUserStatus(UserStatus.PAUSED);

      String encodedFinalUrl = String.format("http://example.com/mars/cruise/?kw=%s",
        URLEncoder.encode(keyword.getText(), UTF_8.name()));
      keywordBiddableAdGroupCriterion.setFinalUrls(new UrlList(new String[]{encodedFinalUrl}));

      // Create the operation.
      AdGroupCriterionOperation keywordAdGroupCriterionOperation = new AdGroupCriterionOperation();
      keywordAdGroupCriterionOperation.setOperand(keywordBiddableAdGroupCriterion);
      keywordAdGroupCriterionOperation.setOperator(Operator.ADD);

      ops[i] = keywordAdGroupCriterionOperation;
    }


    // Add the keywords.
    AdGroupCriterionReturnValue result = adGroupCriterionService.mutate(ops);

    // Display the results.
    for (AdGroupCriterion adGroupCriterionResult : result.getValue()) {
      System.out.printf("Keyword ad group criterion with ad group ID %d, criterion ID %d, "
          + "text '%s', and match type '%s' was added.%n", adGroupCriterionResult.getAdGroupId(),
        adGroupCriterionResult.getCriterion().getId(),
        ((Keyword) adGroupCriterionResult.getCriterion()).getText(),
        ((Keyword) adGroupCriterionResult.getCriterion()).getMatchType());
    }
    return result.getValue();
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
    // Get the GoogleAdsService.
    try (GoogleAdsServiceClient googleAdsServiceClient =
           googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {

      // Create the request.
      SearchGoogleAdsRequest request = SearchGoogleAdsRequest.newBuilder()
        .setCustomerId(Long.toString(customerId))
        .setPageSize(PAGE_SIZE)
        .setQuery(String.format(
          "SELECT " +
            "ad_group.id, " +
            "ad_group_ad.ad.id, " +
            "ad_group_ad.ad.expanded_text_ad.headline_part1, " +
            "ad_group_ad.ad.expanded_text_ad.headline_part2, " +
            "ad_group_ad.status, " +
            "ad_group_ad.ad.final_urls, " +
            "ad_group_ad.resource_name " +
            "FROM ad_group_ad " +
            "WHERE ad_group_ad.resource_name IN (%s)",
          String.join(", ", newResourceNames.stream().map(
            resourceName -> String.format("'%s'", resourceName)).collect(Collectors.toList()))))
        .build();

      // Retrieve the ad group ads
      SearchPagedResponse response = googleAdsServiceClient.search(request);

      // Create and return a list of the ad group ads.
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
                                        AdGroup adGroup, int numberOfAds) {
    String adGroupResourceName = ResourceNames.adGroup(customerId, adGroup.getId().getValue());

    List<AdGroupAdOperation> operations = new ArrayList<>();

    for (int i = 0; i < numberOfAds; i++) {
      // Create the text ad
      AdGroupAd adgroupAd = AdGroupAd.newBuilder()
        .setAdGroup(StringValue.of(adGroupResourceName))
        .setStatus(AdGroupAdStatus.PAUSED)
        .setAd(Ad.newBuilder()
          .addFinalUrls(StringValue.of("http://www.example.com/" + String.valueOf(i)))
          .setExpandedTextAd(ExpandedTextAdInfo.newBuilder()
            .setDescription(StringValue.of("Buy your tickets now!"))
            .setHeadlinePart1(StringValue.of("Cruise #" + String.valueOf(i) + " to Mars"))
            .setHeadlinePart2(StringValue.of("Best Space Cruise Line"))
            .setPath1(StringValue.of("path1"))
            .setPath2(StringValue.of("path2"))
            .build()))
        .build();

      // Create the operation.
      AdGroupAdOperation op = AdGroupAdOperation.newBuilder().setCreate(adgroupAd).build();
      operations.add(op);
    }

    // Get the AdGroupAd service.
    try (AdGroupAdServiceClient adGroupAdServiceClient = googleAdsClient.getLatestVersion()
      .createAdGroupAdServiceClient()) {
      // Add the text ads.
      MutateAdGroupAdsResponse response =
        adGroupAdServiceClient.mutateAdGroupAds(Long.toString(customerId), operations);
      System.out.printf("Added %d text ads:%n", response.getResultsCount());
      // Create a list of the text ad resource names.
      List<String> newAdGroupAdResourceNames = new ArrayList<>();
      for (MutateAdGroupAdResult result : response.getResultsList()) {
        newAdGroupAdResourceNames.add(result.getResourceName());
      }

      // Retrieve the expanded text ads.
      List<AdGroupAd> newAdGroupAds =
        getAdGroupAds(googleAdsClient, customerId, newAdGroupAdResourceNames);
      for (AdGroupAd newAdGroupAd : newAdGroupAds) {
        Ad ad = newAdGroupAd.getAd();
        ExpandedTextAdInfo expandedTextAdInfo = ad.getExpandedTextAd();
        // Display the results.
        System.out.printf("Expanded text ad with ID %s, status '%s', " +
            "and headline '%s - %s' was created in ad group with ID %s.%n",
          ad.getId().getValue(), newAdGroupAd.getStatus(),
          expandedTextAdInfo.getHeadlinePart1().getValue(),
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
   * @param adGroupResourceName resource name of the new ad group.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private AdGroup getAdGroup(GoogleAdsClient googleAdsClient, long customerId,
                             String adGroupResourceName) {
    // Get the GoogleAdsService.
    try (GoogleAdsServiceClient googleAdsServiceClient =
           googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {

      // Create the request.
      SearchGoogleAdsRequest request = SearchGoogleAdsRequest.newBuilder()
        .setCustomerId(Long.toString(customerId))
        .setPageSize(PAGE_SIZE)
        .setQuery(String.format("SELECT ad_group.id, ad_group.name, ad_group.resource_name " +
          "FROM ad_group WHERE ad_group.resource_name = '%s'", adGroupResourceName))
        .build();
      // Retrieve the AdGroup.
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
  private AdGroup createAdGroup(GoogleAdsClient googleAdsClient,
                                long customerId, Campaign campaign) {
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

    // Create the operation.
    AdGroupOperation op = AdGroupOperation.newBuilder().setCreate(adGroup).build();

    // Get the AdGroup Service.
    try (AdGroupServiceClient adGroupServiceClient =
           googleAdsClient.getLatestVersion().createAdGroupServiceClient()) {
      // Add the AdGroup.
      MutateAdGroupsResponse response =
        adGroupServiceClient.mutateAdGroups(Long.toString(customerId), ImmutableList.of(op));
      String adGroupResourceName = response.getResults(0).getResourceName();
      // Retrieve the AdGroup.
      AdGroup newAdGroup = getAdGroup(googleAdsClient, customerId, adGroupResourceName);
      // Display the results.
      System.out.printf("Ad group with ID %s and name '%s' was created.%n",
        newAdGroup.getId().getValue(), newAdGroup.getName().getValue());
      return newAdGroup;
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
  private Campaign getCampaign(GoogleAdsClient googleAdsClient, long customerId,
                               String campaignResourceName) {
    // Get the GoogleAdsService.
    try (GoogleAdsServiceClient googleAdsServiceClient =
           googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {

      // Create the request.
      SearchGoogleAdsRequest request = SearchGoogleAdsRequest.newBuilder()
        .setCustomerId(Long.toString(customerId))
        .setPageSize(PAGE_SIZE)
        .setQuery(String.format("SELECT campaign.id, campaign.name, campaign.resource_name " +
          "FROM campaign " +
          "WHERE campaign.resource_name = '%s'", campaignResourceName))
        .build();

      // Retrieve the campaign.
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

    // Create the operation.
    CampaignOperation op = CampaignOperation.newBuilder().setCreate(campaign).build();

    // Get the Campaign service.
    try (CampaignServiceClient campaignServiceClient =
           googleAdsClient.getLatestVersion().createCampaignServiceClient()) {
      // Add the campaign.
      MutateCampaignsResponse response =
        campaignServiceClient.mutateCampaigns(Long.toString(customerId), ImmutableList.of(op));
      String campaignResourceName = response.getResults(0).getResourceName();
      // Retrieve the campaign.
      Campaign newCampaign = getCampaign(googleAdsClient, customerId, campaignResourceName);
      // Display the results.
      System.out.printf("Campaign with ID %s and name '%s' was created.%n",
        newCampaign.getId().getValue(), newCampaign.getName().getValue());
      return newCampaign;
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
  private CampaignBudget getBudget(GoogleAdsClient googleAdsClient, long customerId,
                                   String budgetResourceName) {
    // Get the GoogleAdsService.
    try (GoogleAdsServiceClient googleAdsServiceClient =
           googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {

      // Create the request.
      SearchGoogleAdsRequest request = SearchGoogleAdsRequest.newBuilder()
        .setCustomerId(Long.toString(customerId))
        .setPageSize(PAGE_SIZE)
        .setQuery(String.format("SELECT campaign_budget.id, campaign_budget.name, " +
          "campaign_budget.resource_name FROM campaign_budget " +
          "WHERE campaign_budget.resource_name = '%s'", budgetResourceName))
        .build();

      // Retrieve the budget.
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
    // Create the budget.
    CampaignBudget budget =
      CampaignBudget.newBuilder()
        .setName(StringValue.of("Interplanetary Cruise Budget #" + System.currentTimeMillis()))
        .setDeliveryMethod(BudgetDeliveryMethod.STANDARD)
        .setAmountMicros(Int64Value.of(500_000))
        .build();

    // Create the operation.
    CampaignBudgetOperation op = CampaignBudgetOperation.newBuilder().setCreate(budget).build();

    // Get the CampaignBudget service.
    try (CampaignBudgetServiceClient campaignBudgetServiceClient =
           googleAdsClient.getLatestVersion().createCampaignBudgetServiceClient()) {
      // Add the budget.
      MutateCampaignBudgetsResponse response =
        campaignBudgetServiceClient.mutateCampaignBudgets(
          Long.toString(customerId), ImmutableList.of(op));
      String budgetResourceName = response.getResults(0).getResourceName();
      // Retrieve the budget.
      CampaignBudget newBudget = getBudget(googleAdsClient, customerId, budgetResourceName);
      // Display the results.
      System.out.printf("Budget with ID %s and name '%s' was created.%n",
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
   * @throws RemoteException if the API request failed due to other errors.
   * @throws UnsupportedEncodingException if encoding the final URL failed.
   */
  private void runExample(GoogleAdsClient googleAdsClient, AdWordsServicesInterface adWordsServices,
                          AdWordsSession session, long customerId)
    throws RemoteException, UnsupportedEncodingException {
    CampaignBudget budget = createBudget(googleAdsClient, customerId);
    Campaign campaign = createCampaign(googleAdsClient, customerId, budget);
    AdGroup adGroup = createAdGroup(googleAdsClient, customerId, campaign);
    createTextAds(googleAdsClient, customerId, adGroup, NUMBER_OF_ADS);
    createKeywords(adWordsServices, session, adGroup, KEYWORDS_TO_ADD);
  }
}

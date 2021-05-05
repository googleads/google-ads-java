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

package com.google.ads.googleads.migration.campaignmanagement;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;
import static java.nio.charset.StandardCharsets.UTF_8;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.migration.utils.ArgumentNames;
import com.google.ads.googleads.migration.utils.CodeSampleParams;
import com.google.ads.googleads.v7.common.ManualCpc;
import com.google.ads.googleads.v7.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v7.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v7.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v7.errors.GoogleAdsError;
import com.google.ads.googleads.v7.errors.GoogleAdsException;
import com.google.ads.googleads.v7.resources.Campaign;
import com.google.ads.googleads.v7.resources.Campaign.NetworkSettings;
import com.google.ads.googleads.v7.resources.CampaignBudget;
import com.google.ads.googleads.v7.services.CampaignBudgetOperation;
import com.google.ads.googleads.v7.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v7.services.CampaignOperation;
import com.google.ads.googleads.v7.services.CampaignServiceClient;
import com.google.ads.googleads.v7.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v7.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v7.services.MutateCampaignBudgetsResponse;
import com.google.ads.googleads.v7.services.MutateCampaignsResponse;
import com.google.ads.googleads.v7.services.SearchGoogleAdsRequest;
import com.google.ads.googleads.v7.utils.ResourceNames;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupAdRotationMode;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupAdStatus;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupOperation;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupReturnValue;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupServiceInterface;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupStatus;
import com.google.api.ads.adwords.axis.v201809.cm.AdRotationMode;
import com.google.api.ads.adwords.axis.v201809.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201809.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201809.cm.Bids;
import com.google.api.ads.adwords.axis.v201809.cm.CpcBid;
import com.google.api.ads.adwords.axis.v201809.cm.ExpandedTextAd;
import com.google.api.ads.adwords.axis.v201809.cm.Keyword;
import com.google.api.ads.adwords.axis.v201809.cm.KeywordMatchType;
import com.google.api.ads.adwords.axis.v201809.cm.Money;
import com.google.api.ads.adwords.axis.v201809.cm.Operator;
import com.google.api.ads.adwords.axis.v201809.cm.UrlList;
import com.google.api.ads.adwords.axis.v201809.cm.UserStatus;
import com.google.api.ads.adwords.lib.client.AdWordsSession;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTime;

/**
 * This code example is the third in a series of code examples that shows how to create a Search
 * campaign using the AdWords API, and then migrate it to the Google Ads API one functionality at a
 * time. See other examples for code examples in various stages of migration.
 *
 * <p>In this code example, the functionality to create a campaign budget and search campaign have
 * been migrated to the Google Ads API. The rest of the functionality - creating ad groups, keywords
 * and expanded text ads are done using the AdWords API.
 */
public class CreateCompleteCampaignBothApisPhase2 {

  private static final int PAGE_SIZE = 1_000;

  private static final int NUMBER_OF_ADS = 5;

  private static final List<String> KEYWORDS_TO_ADD = Arrays.asList("mars cruise", "space hotel");

  private static class CreateCompleteCampaignBothApisPhase2Params extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    CreateCompleteCampaignBothApisPhase2Params params =
        new CreateCompleteCampaignBothApisPhase2Params();
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

    // Initializes the AdWords client.
    AdWordsSession session;
    try {
      // Generates a refreshable OAuth2 credential for AdWords API.
      Credential oAuth2Credential =
          new OfflineCredentials.Builder()
              .forApi(Api.ADWORDS)
              .fromFile()
              .build()
              .generateCredential();

      // Constructs an AdWordsSession.
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
      new CreateCompleteCampaignBothApisPhase2()
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
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   * @throws RemoteException if the API request failed due to other errors.
   * @throws UnsupportedEncodingException if encoding the final URL failed.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      long customerId)
      throws RemoteException, UnsupportedEncodingException {
    CampaignBudget budget = createBudget(googleAdsClient, customerId);
    Campaign campaign = createCampaign(googleAdsClient, customerId, budget);
    AdGroup adGroup = createAdGroup(adWordsServices, session, campaign);
    createTextAds(adWordsServices, session, adGroup, NUMBER_OF_ADS);
    createKeywords(adWordsServices, session, adGroup, KEYWORDS_TO_ADD);
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
   * @param adWordsServices the Google AdWords services interface.
   * @param session the client session.
   * @param campaign the campaign for the ad group.
   * @throws RemoteException if the API request failed due to other errors.
   */
  private AdGroup createAdGroup(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Campaign campaign)
      throws RemoteException {
    // Gets the AdGroupService.
    AdGroupServiceInterface adGroupService =
        adWordsServices.get(session, AdGroupServiceInterface.class);

    // Creates the ad group.
    AdGroup adGroup = new AdGroup();
    adGroup.setName("Earth to Mars Cruises #" + System.currentTimeMillis());
    adGroup.setStatus(AdGroupStatus.ENABLED);
    adGroup.setCampaignId(campaign.getId());

    // Sets the rotation mode.
    AdGroupAdRotationMode rotationMode = new AdGroupAdRotationMode(AdRotationMode.OPTIMIZE);
    adGroup.setAdGroupAdRotationMode(rotationMode);

    // Creates the ad group bid.
    BiddingStrategyConfiguration biddingStrategyConfiguration = new BiddingStrategyConfiguration();
    Money cpcBidMoney = new Money();
    cpcBidMoney.setMicroAmount(500_000L);
    CpcBid bid = new CpcBid();
    bid.setBid(cpcBidMoney);
    biddingStrategyConfiguration.setBids(new Bids[] {bid});
    adGroup.setBiddingStrategyConfiguration(biddingStrategyConfiguration);

    // Creates the operation.
    AdGroupOperation operation = new AdGroupOperation();
    operation.setOperand(adGroup);
    operation.setOperator(Operator.ADD);

    AdGroupOperation[] operations = new AdGroupOperation[] {operation};

    // Adds the ad group.
    AdGroupReturnValue result = adGroupService.mutate(operations);

    AdGroup adGroupResult = result.getValue(0);
    // Displays the new ad group.
    System.out.printf(
        "Ad group with ID %d and name '%s' was created.%n",
        adGroupResult.getId(), adGroupResult.getName());

    return adGroupResult;
  }

  /**
   * Creates text ads.
   *
   * @param adWordsServices the Google AdWords services interface.
   * @param session the client session.
   * @param adGroup the ad group for the text ad.
   * @throws RemoteException if the API request failed due to other errors.
   */
  private AdGroupAd[] createTextAds(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      AdGroup adGroup,
      int numberOfAds)
      throws RemoteException {

    // Gets the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    List<AdGroupAdOperation> operations = new ArrayList<>();

    for (int i = 0; i < numberOfAds; i++) {
      // Creates the expanded text ad.
      ExpandedTextAd expandedTextAd = new ExpandedTextAd();
      expandedTextAd.setDescription("Buy your tickets now!");
      expandedTextAd.setHeadlinePart1(String.format("Cruise #%d to Mars", i));
      expandedTextAd.setHeadlinePart2("Best Space Cruise Line");
      expandedTextAd.setFinalUrls(new String[] {"http://www.example.com/" + i});

      // Creates the ad group ad.
      AdGroupAd expandedTextAdGroupAd = new AdGroupAd();
      expandedTextAdGroupAd.setAdGroupId(adGroup.getId());
      expandedTextAdGroupAd.setAd(expandedTextAd);

      // Optional: sets the status.
      expandedTextAdGroupAd.setStatus(AdGroupAdStatus.PAUSED);

      // Creates the operation.
      AdGroupAdOperation adGroupAdOperation = new AdGroupAdOperation();
      adGroupAdOperation.setOperand(expandedTextAdGroupAd);
      adGroupAdOperation.setOperator(Operator.ADD);

      operations.add(adGroupAdOperation);
    }

    // Adds the ads.
    AdGroupAdReturnValue result =
        adGroupAdService.mutate(operations.toArray(new AdGroupAdOperation[0]));

    // Displays the ads.
    for (AdGroupAd adGroupAdResult : result.getValue()) {
      ExpandedTextAd newAd = (ExpandedTextAd) adGroupAdResult.getAd();
      System.out.printf(
          "Expanded text ad with ID %d "
              + "and headline '%s - %s' was created in ad group with ID %d.%n",
          newAd.getId(), newAd.getHeadlinePart1(), newAd.getHeadlinePart2(), adGroup.getId());
    }
    return result.getValue();
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
  private AdGroupCriterion[] createKeywords(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      AdGroup adGroup,
      List<String> keywordsToAdd)
      throws RemoteException, UnsupportedEncodingException {
    // Gets the AdGroupCriterionService.
    AdGroupCriterionServiceInterface adGroupCriterionService =
        adWordsServices.get(session, AdGroupCriterionServiceInterface.class);

    List<AdGroupCriterionOperation> operations = new ArrayList<>();

    for (String keywordToAdd : keywordsToAdd) {
      // Creates the keyword.
      Keyword keyword = new Keyword();
      keyword.setText(keywordToAdd);
      keyword.setMatchType(KeywordMatchType.EXACT);

      // Creates the biddable ad group criterion.
      BiddableAdGroupCriterion keywordBiddableAdGroupCriterion = new BiddableAdGroupCriterion();
      keywordBiddableAdGroupCriterion.setAdGroupId(adGroup.getId());
      keywordBiddableAdGroupCriterion.setCriterion(keyword);

      // You can optionally provide these field(s).
      keywordBiddableAdGroupCriterion.setUserStatus(UserStatus.PAUSED);

      String encodedFinalUrl =
          String.format(
              "http://example.com/mars/cruise/?kw=%s",
              URLEncoder.encode(keyword.getText(), UTF_8.name()));
      keywordBiddableAdGroupCriterion.setFinalUrls(new UrlList(new String[] {encodedFinalUrl}));

      // Creates the operation.
      AdGroupCriterionOperation keywordAdGroupCriterionOperation = new AdGroupCriterionOperation();
      keywordAdGroupCriterionOperation.setOperand(keywordBiddableAdGroupCriterion);
      keywordAdGroupCriterionOperation.setOperator(Operator.ADD);

      operations.add(keywordAdGroupCriterionOperation);
    }

    // Adds the keyword.
    AdGroupCriterionReturnValue result =
        adGroupCriterionService.mutate(operations.toArray(new AdGroupCriterionOperation[0]));

    // Displays the results.
    for (AdGroupCriterion adGroupCriterionResult : result.getValue()) {
      System.out.printf(
          "Keyword ad group criterion with ad group ID %d, criterion ID %d, "
              + "text '%s', and match type '%s' was added.%n",
          adGroupCriterionResult.getAdGroupId(),
          adGroupCriterionResult.getCriterion().getId(),
          ((Keyword) adGroupCriterionResult.getCriterion()).getText(),
          ((Keyword) adGroupCriterionResult.getCriterion()).getMatchType());
    }
    return result.getValue();
  }
}

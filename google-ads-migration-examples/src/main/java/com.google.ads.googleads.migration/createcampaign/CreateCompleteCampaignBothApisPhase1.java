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
import com.google.ads.googleads.v1.errors.GoogleAdsException;
import com.google.ads.googleads.v1.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v1.errors.GoogleAdsError;
import com.google.ads.googleads.v1.resources.CampaignBudget;
import com.google.ads.googleads.v1.services.CampaignBudgetOperation;
import com.google.ads.googleads.v1.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v1.services.MutateCampaignBudgetsResponse;
import com.google.ads.googleads.v1.services.SearchGoogleAdsRequest;
import com.google.ads.googleads.v1.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v1.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.api.ads.adwords.axis.factory.AdWordsServices;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroup;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupAd;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupAdOperation;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupAdReturnValue;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupAdServiceInterface;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupAdStatus;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterion;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionOperation;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionReturnValue;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupCriterionServiceInterface;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupOperation;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupReturnValue;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupAdRotationMode;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupServiceInterface;
import com.google.api.ads.adwords.axis.v201809.cm.AdGroupStatus;
import com.google.api.ads.adwords.axis.v201809.cm.AdRotationMode;
import com.google.api.ads.adwords.axis.v201809.cm.AdvertisingChannelType;
import com.google.api.ads.adwords.axis.v201809.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201809.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201809.cm.BiddingStrategyType;
import com.google.api.ads.adwords.axis.v201809.cm.Bids;
import com.google.api.ads.adwords.axis.v201809.cm.Budget;
import com.google.api.ads.adwords.axis.v201809.cm.Campaign;
import com.google.api.ads.adwords.axis.v201809.cm.CampaignOperation;
import com.google.api.ads.adwords.axis.v201809.cm.CampaignReturnValue;
import com.google.api.ads.adwords.axis.v201809.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201809.cm.CampaignStatus;
import com.google.api.ads.adwords.axis.v201809.cm.CpcBid;
import com.google.api.ads.adwords.axis.v201809.cm.ExpandedTextAd;
import com.google.api.ads.adwords.axis.v201809.cm.Keyword;
import com.google.api.ads.adwords.axis.v201809.cm.Money;
import com.google.api.ads.adwords.axis.v201809.cm.NetworkSetting;
import com.google.api.ads.adwords.axis.v201809.cm.Operator;
import com.google.api.ads.adwords.axis.v201809.cm.UrlList;
import com.google.api.ads.adwords.axis.v201809.cm.UserStatus;
import com.google.api.ads.adwords.lib.factory.AdWordsServicesInterface;
import com.google.api.ads.common.lib.conf.ConfigurationLoadException;
import com.google.api.ads.common.lib.exception.OAuthException;
import com.google.api.ads.common.lib.exception.ValidationException;
import com.google.common.collect.ImmutableList;
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
import java.net.URLEncoder;

import org.joda.time.DateTime;

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;

/**
 * This code example is the third in a series of code examples that shows how to create a Search
 * campaign using the AdWords API, and then migrate it to the Google Ads API one functionality at a
 * time. See other examples for code examples in various stages of migration.
 *
 * In this code example, the functionality to create campaign budget and search campaign have
 * been migrated to the Google Ads API. The rest of the functionality - creating ad groups,
 * keywords and expanded text ads are done using the AdWords API.
 */
public class CreateCompleteCampaignBothApisPhase1 {

  private static final int PAGE_SIZE = 1_000;

  private static final int NUMBER_OF_ADS = 5;

  private static final List<String> KEYWORDS_TO_ADD = Arrays.asList("mars cruise", "space hotel");

  private static class CreateCompleteCampaignBothApisParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    CreateCompleteCampaignBothApisParams params =
      new CreateCompleteCampaignBothApisParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
    }

    GoogleAdsClient googleAdsClient;
    AdWordsSession session;
    try {
      googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();

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
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
        "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      return;
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      return;
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
      new CreateCompleteCampaignBothApisPhase1()
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
    }
  }

  /**
   * Creates keywords ad group criteria.
   *
   * @param adWordsServices the Google AdWords services interface.
   * @param session the client session.
   * @param adGroup the ad group for the new criteria.
   * @param keywordsToAdd the keywords to add to the text ads.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
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
      keyword.setMatchType(com.google.api.ads.adwords.axis.v201809.cm.KeywordMatchType.EXACT);

      // Create biddable ad group criterion.
      BiddableAdGroupCriterion keywordBiddableAdGroupCriterion = new BiddableAdGroupCriterion();
      keywordBiddableAdGroupCriterion.setAdGroupId(adGroup.getId());
      keywordBiddableAdGroupCriterion.setCriterion(keyword);

      // You can optionally provide these field(s).
      keywordBiddableAdGroupCriterion.setUserStatus(UserStatus.PAUSED);

      String encodedFinalUrl = String.format("http://example.com/mars/cruise/?kw=%s",
        URLEncoder.encode(keyword.getText(), UTF_8.name()));
      keywordBiddableAdGroupCriterion.setFinalUrls(new UrlList(new String[]{encodedFinalUrl}));

      // Create operations.
      AdGroupCriterionOperation keywordAdGroupCriterionOperation = new AdGroupCriterionOperation();
      keywordAdGroupCriterionOperation.setOperand(keywordBiddableAdGroupCriterion);
      keywordAdGroupCriterionOperation.setOperator(Operator.ADD);

      ops[i] = keywordAdGroupCriterionOperation;
    }


    // Add keywords.
    AdGroupCriterionReturnValue result = adGroupCriterionService.mutate(ops);

    // Display results.
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
   * Creates text ads.
   * @param adWordsServices the Google AdWords services interface.
   * @param session the client session.
   * @param adGroup the ad group for the text ad.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private AdGroupAd[] createTextAds(AdWordsServicesInterface adWordsServices,
                                    AdWordsSession session, AdGroup adGroup)
    throws RemoteException {

    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
      adWordsServices.get(session, AdGroupAdServiceInterface.class);

    List<AdGroupAdOperation> operations = new ArrayList<>(NUMBER_OF_ADS);

    for (int i = 0; i < NUMBER_OF_ADS; i++) {
      // Create expanded text ad.
      ExpandedTextAd expandedTextAd = new ExpandedTextAd();
      expandedTextAd.setDescription("Buy your tickets now!");
      expandedTextAd.setHeadlinePart1(String.format("Cruise #%d to Mars", i));
      expandedTextAd.setHeadlinePart2("Best Space Cruise Line");
      expandedTextAd.setFinalUrls(new String[] {"http://www.example.com/" + i});

      // Create ad group ad.
      AdGroupAd expandedTextAdGroupAd = new AdGroupAd();
      expandedTextAdGroupAd.setAdGroupId(adGroup.getId());
      expandedTextAdGroupAd.setAd(expandedTextAd);

      // Optional: set the status.
      expandedTextAdGroupAd.setStatus(AdGroupAdStatus.PAUSED);

      // Create the operation.
      AdGroupAdOperation adGroupAdOperation = new AdGroupAdOperation();
      adGroupAdOperation.setOperand(expandedTextAdGroupAd);
      adGroupAdOperation.setOperator(Operator.ADD);

      operations.add(adGroupAdOperation);
    }

    // Add ads.
    AdGroupAdReturnValue result =
      adGroupAdService.mutate(operations.toArray(new AdGroupAdOperation[operations.size()]));

    // Display ads.
    Arrays.stream(result.getValue())
      .map(adGroupAdResult -> (ExpandedTextAd) adGroupAdResult.getAd())
      .forEach(
        newAd ->
          System.out.printf("Expanded text ad with ID %d" +
              "and headline '%s - %s' was found in ad group with ID %d.%n",
            newAd.getId(),
            newAd.getHeadlinePart1(),
            newAd.getHeadlinePart2(),
            adGroup.getId()));

    return result.getValue();
  }

  /**
   * Creates an ad group.
   *
   * @param adWordsServices the Google AdWords services interface.
   * @param session the client session.
   * @param campaign the campaign for the ad group.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private AdGroup createAdGroup(AdWordsServicesInterface adWordsServices,
                                AdWordsSession session, Campaign campaign)
    throws RemoteException {
    // Get the AdGroupService.
    AdGroupServiceInterface adGroupService =
      adWordsServices.get(session, AdGroupServiceInterface.class);

    // Create ad group.
    AdGroup adGroup = new AdGroup();
    adGroup.setName("Earth to Mars Cruises #" + System.currentTimeMillis());
    adGroup.setStatus(AdGroupStatus.ENABLED);
    adGroup.setCampaignId(campaign.getId());

    // Set the rotation mode.
    AdGroupAdRotationMode rotationMode = new AdGroupAdRotationMode(AdRotationMode.OPTIMIZE);
    adGroup.setAdGroupAdRotationMode(rotationMode);

    // Create ad group bid.
    BiddingStrategyConfiguration biddingStrategyConfiguration = new BiddingStrategyConfiguration();
    Money cpcBidMoney = new Money();
    cpcBidMoney.setMicroAmount(10_000_000L);
    CpcBid bid = new CpcBid();
    bid.setBid(cpcBidMoney);
    biddingStrategyConfiguration.setBids(new Bids[] {bid});
    adGroup.setBiddingStrategyConfiguration(biddingStrategyConfiguration);

    // Create operations.
    AdGroupOperation operation = new AdGroupOperation();
    operation.setOperand(adGroup);
    operation.setOperator(Operator.ADD);

    AdGroupOperation[] operations = new AdGroupOperation[] {operation};

    // Add ad groups.
    AdGroupReturnValue result = adGroupService.mutate(operations);

    AdGroup adGroupResult = result.getValue()[0];
    // Display new ad groups.
    System.out.printf("Ad group with ID '%d' and name %s was created.%n",
      adGroupResult.getId(), adGroupResult.getName());

    return adGroupResult;
  }

  /**
   * Creates a campaign.
   *
   * @param adWordsServices the Google AdWords services interface.
   * @param session the client session.
   * @param budget the budget for the campaign.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private Campaign createCampaign(AdWordsServicesInterface adWordsServices,
                                  AdWordsSession session, CampaignBudget budget)
    throws RemoteException {
    // Get the CampaignService.
    CampaignServiceInterface campaignService =
      adWordsServices.get(session, CampaignServiceInterface.class);

    // Create campaign.
    Campaign campaign = new Campaign();
    campaign.setName("Interplanetary Cruise #" + System.currentTimeMillis());

    // Recommendation: Set the campaign to PAUSED when creating it to prevent
    // the ads from immediately serving. Set to ENABLED once you've added
    // targeting and the ads are ready to serve.
    campaign.setStatus(CampaignStatus.PAUSED);

    BiddingStrategyConfiguration biddingStrategyConfiguration = new BiddingStrategyConfiguration();
    biddingStrategyConfiguration.setBiddingStrategyType(BiddingStrategyType.MANUAL_CPC);
    campaign.setBiddingStrategyConfiguration(biddingStrategyConfiguration);

    // You can optionally provide these field(s).
    campaign.setStartDate(new DateTime().plusDays(1).toString("yyyyMMdd"));
    campaign.setEndDate(new DateTime().plusDays(30).toString("yyyyMMdd"));

    // Only the budgetId should be sent, all other fields will be ignored by CampaignService.
    Budget newBudget = new Budget();
    newBudget.setBudgetId(budget.getId().getValue());
    campaign.setBudget(newBudget);

    campaign.setAdvertisingChannelType(AdvertisingChannelType.SEARCH);

    // Set the campaign network options to Search and Search Network.
    NetworkSetting networkSetting = new NetworkSetting();
    networkSetting.setTargetGoogleSearch(true);
    networkSetting.setTargetSearchNetwork(true);
    networkSetting.setTargetContentNetwork(false);
    networkSetting.setTargetPartnerSearchNetwork(false);
    campaign.setNetworkSetting(networkSetting);

    // Create operations.
    CampaignOperation operation = new CampaignOperation();
    operation.setOperand(campaign);
    operation.setOperator(Operator.ADD);

    CampaignOperation[] operations = new CampaignOperation[] {operation};

    // Add campaigns.
    CampaignReturnValue result = campaignService.mutate(operations);

    Campaign campaignResult = result.getValue(0);
    // Display campaigns.
    System.out.printf("Campaign with ID '%d' and name %s was created.%n",
      campaignResult.getId(),
      campaignResult.getName());
    return campaignResult;
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
      System.out.printf("Budget with ID %s and name %s was created.%n",
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
  private void runExample(GoogleAdsClient googleAdsClient, AdWordsServicesInterface adWordsServices,
                          AdWordsSession session, long customerId) {
    CampaignBudget budget = createBudget(googleAdsClient, customerId);
    try {
      Campaign campaign = createCampaign(adWordsServices, session, budget);
      AdGroup adGroup = createAdGroup(adWordsServices, session, campaign);
      createTextAds(adWordsServices, session, adGroup);
      createKeywords(adWordsServices, session, adGroup, KEYWORDS_TO_ADD);
    } catch (RemoteException re) {
      System.err.printf("Request failed unexpectedly due to RemoteException: %s%n", re);
    } catch (UnsupportedEncodingException ue) {
      System.err.printf("Example failed due to encoding exception: %s%n", ue);
    }
  }
}

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

import static com.google.api.ads.common.lib.utils.Builder.DEFAULT_CONFIGURATION_FILENAME;
import static java.nio.charset.StandardCharsets.UTF_8;

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
import com.google.api.ads.adwords.axis.v201809.cm.AdvertisingChannelType;
import com.google.api.ads.adwords.axis.v201809.cm.BiddableAdGroupCriterion;
import com.google.api.ads.adwords.axis.v201809.cm.BiddingStrategyConfiguration;
import com.google.api.ads.adwords.axis.v201809.cm.BiddingStrategyType;
import com.google.api.ads.adwords.axis.v201809.cm.Bids;
import com.google.api.ads.adwords.axis.v201809.cm.Budget;
import com.google.api.ads.adwords.axis.v201809.cm.BudgetBudgetDeliveryMethod;
import com.google.api.ads.adwords.axis.v201809.cm.BudgetOperation;
import com.google.api.ads.adwords.axis.v201809.cm.BudgetReturnValue;
import com.google.api.ads.adwords.axis.v201809.cm.BudgetServiceInterface;
import com.google.api.ads.adwords.axis.v201809.cm.Campaign;
import com.google.api.ads.adwords.axis.v201809.cm.CampaignOperation;
import com.google.api.ads.adwords.axis.v201809.cm.CampaignReturnValue;
import com.google.api.ads.adwords.axis.v201809.cm.CampaignServiceInterface;
import com.google.api.ads.adwords.axis.v201809.cm.CampaignStatus;
import com.google.api.ads.adwords.axis.v201809.cm.CpcBid;
import com.google.api.ads.adwords.axis.v201809.cm.ExpandedTextAd;
import com.google.api.ads.adwords.axis.v201809.cm.Keyword;
import com.google.api.ads.adwords.axis.v201809.cm.KeywordMatchType;
import com.google.api.ads.adwords.axis.v201809.cm.Money;
import com.google.api.ads.adwords.axis.v201809.cm.NetworkSetting;
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
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTime;

/**
 * This code example is the first in a series of code examples that shows how to create a Search
 * campaign using the AdWords API, and then migrate it to the Google Ads API one functionality at a
 * time. See other examples for code examples in various stages of migration.
 *
 * <p>This code example represents the initial state, where the AdWords API is used to create a
 * campaign budget, a Search campaign, ad groups, keywords and expanded text ads. The user has not
 * yet migrated any of the functionality to the Google Ads API.
 */
public class CreateCompleteCampaignAdWordsApiOnly {

  private static final int NUMBER_OF_ADS = 5;

  private static final List<String> KEYWORDS_TO_ADD = Arrays.asList("mars cruise", "space hotel");

  public static void main(String[] args) {
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
      new CreateCompleteCampaignAdWordsApiOnly().runExample(adWordsServices, session);
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
  private AdGroupCriterion[] createKeywords(
      AdWordsServicesInterface adWordsServices,
      AdWordsSession session,
      AdGroup adGroup,
      List<String> keywordsToAdd)
      throws RemoteException, UnsupportedEncodingException {
    // Get the AdGroupCriterionService.
    AdGroupCriterionServiceInterface adGroupCriterionService =
        adWordsServices.get(session, AdGroupCriterionServiceInterface.class);

    AdGroupCriterionOperation[] operations = new AdGroupCriterionOperation[keywordsToAdd.size()];

    for (int i = 0; i < keywordsToAdd.size(); i++) {
      // Create the keyword.
      Keyword keyword = new Keyword();
      keyword.setText(keywordsToAdd.get(i));
      keyword.setMatchType(KeywordMatchType.EXACT);

      // Create the biddable ad group criterion.
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

      // Create the operation.
      AdGroupCriterionOperation keywordAdGroupCriterionOperation = new AdGroupCriterionOperation();
      keywordAdGroupCriterionOperation.setOperand(keywordBiddableAdGroupCriterion);
      keywordAdGroupCriterionOperation.setOperator(Operator.ADD);

      operations[i] = keywordAdGroupCriterionOperation;
    }

    // Add the keywords.
    AdGroupCriterionReturnValue result = adGroupCriterionService.mutate(operations);

    // Display the results.
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

    // Get the AdGroupAdService.
    AdGroupAdServiceInterface adGroupAdService =
        adWordsServices.get(session, AdGroupAdServiceInterface.class);

    List<AdGroupAdOperation> operations = new ArrayList<>();

    for (int i = 0; i < numberOfAds; i++) {
      // Create the expanded text ad.
      ExpandedTextAd expandedTextAd = new ExpandedTextAd();
      expandedTextAd.setDescription("Buy your tickets now!");
      expandedTextAd.setHeadlinePart1(String.format("Cruise #%d to Mars", i));
      expandedTextAd.setHeadlinePart2("Best Space Cruise Line");
      expandedTextAd.setFinalUrls(new String[] {"http://www.example.com/" + i});

      // Create the ad group ad.
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

    // Add the ads.
    AdGroupAdReturnValue result =
        adGroupAdService.mutate(operations.toArray(new AdGroupAdOperation[operations.size()]));

    // Display the ads.
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

    // Create the operation.
    AdGroupOperation operation = new AdGroupOperation();
    operation.setOperand(adGroup);
    operation.setOperator(Operator.ADD);

    AdGroupOperation[] operations = new AdGroupOperation[] {operation};

    // Add the ad group.
    AdGroupReturnValue result = adGroupService.mutate(operations);

    AdGroup adGroupResult = result.getValue(0);
    // Display the new ad group.
    System.out.printf(
        "Ad group with ID %d and name '%s' was created.%n",
        adGroupResult.getId(), adGroupResult.getName());

    return adGroupResult;
  }

  /**
   * Creates a campaign.
   *
   * @param adWordsServices the Google AdWords services interface.
   * @param session the client session.
   * @param budget the budget for the campaign.
   * @throws RemoteException if the API request failed due to other errors.
   */
  private Campaign createCampaign(
      AdWordsServicesInterface adWordsServices, AdWordsSession session, Budget budget)
      throws RemoteException {
    // Get the CampaignService.
    CampaignServiceInterface campaignService =
        adWordsServices.get(session, CampaignServiceInterface.class);

    // Create the campaign.
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
    newBudget.setBudgetId(budget.getBudgetId());
    campaign.setBudget(newBudget);

    campaign.setAdvertisingChannelType(AdvertisingChannelType.SEARCH);

    // Set the campaign network options to Search and Search Network.
    NetworkSetting networkSetting = new NetworkSetting();
    networkSetting.setTargetGoogleSearch(true);
    networkSetting.setTargetSearchNetwork(true);
    networkSetting.setTargetContentNetwork(false);
    networkSetting.setTargetPartnerSearchNetwork(false);
    campaign.setNetworkSetting(networkSetting);

    // Create the operation.
    CampaignOperation operation = new CampaignOperation();
    operation.setOperand(campaign);
    operation.setOperator(Operator.ADD);

    CampaignOperation[] operations = new CampaignOperation[] {operation};

    // Add the campaign.
    CampaignReturnValue result = campaignService.mutate(operations);

    Campaign campaignResult = result.getValue(0);
    // Display the campaign.
    System.out.printf(
        "Campaign with ID %d and name '%s' was created.%n",
        campaignResult.getId(), campaignResult.getName());
    return campaignResult;
  }

  /**
   * Creates a budget.
   *
   * @param adWordsServices the Google AdWords services interface.
   * @param session the client session.
   * @throws RemoteException if the API request failed due to other errors.
   */
  private Budget createBudget(AdWordsServicesInterface adWordsServices, AdWordsSession session)
      throws RemoteException {
    // Get the BudgetService.
    BudgetServiceInterface budgetService =
        adWordsServices.get(session, BudgetServiceInterface.class);

    // Create a budget, which can be shared by multiple campaigns.
    Budget sharedBudget = new Budget();
    sharedBudget.setName("Interplanetary Cruise #" + System.currentTimeMillis());
    Money budgetAmount = new Money();
    budgetAmount.setMicroAmount(500_000L);
    sharedBudget.setAmount(budgetAmount);
    sharedBudget.setDeliveryMethod(BudgetBudgetDeliveryMethod.STANDARD);

    BudgetOperation budgetOperation = new BudgetOperation();
    budgetOperation.setOperand(sharedBudget);
    budgetOperation.setOperator(Operator.ADD);

    BudgetOperation[] operations = new BudgetOperation[] {budgetOperation};

    // Add the budget.
    BudgetReturnValue result = budgetService.mutate(operations);
    Budget budgetResult = result.getValue(0);
    // Display budget.
    System.out.printf(
        "Budget with ID %d and name '%s' was created.%n",
        budgetResult.getBudgetId(), budgetResult.getName());
    return budgetResult;
  }

  /**
   * Runs the example.
   *
   * @param adWordsServices the Google AdWords services interface.
   * @param session the client session.
   * @throws RemoteException if the API request failed due to other errors.
   * @throws UnsupportedEncodingException if encoding the final URL failed.
   */
  private void runExample(AdWordsServicesInterface adWordsServices, AdWordsSession session)
      throws RemoteException, UnsupportedEncodingException {
    Budget budget = createBudget(adWordsServices, session);
    Campaign campaign = createCampaign(adWordsServices, session, budget);
    AdGroup adGroup = createAdGroup(adWordsServices, session, campaign);
    createTextAds(adWordsServices, session, adGroup, NUMBER_OF_ADS);
    createKeywords(adWordsServices, session, adGroup, KEYWORDS_TO_ADD);
  }
}

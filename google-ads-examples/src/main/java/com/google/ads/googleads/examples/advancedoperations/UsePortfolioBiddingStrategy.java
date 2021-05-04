// Copyright 2018 Google LLC
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
import com.google.ads.googleads.v7.common.TargetSpend;
import com.google.ads.googleads.v7.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v7.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v7.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v7.errors.GoogleAdsError;
import com.google.ads.googleads.v7.errors.GoogleAdsException;
import com.google.ads.googleads.v7.resources.BiddingStrategy;
import com.google.ads.googleads.v7.resources.Campaign;
import com.google.ads.googleads.v7.resources.Campaign.NetworkSettings;
import com.google.ads.googleads.v7.resources.CampaignBudget;
import com.google.ads.googleads.v7.services.BiddingStrategyOperation;
import com.google.ads.googleads.v7.services.BiddingStrategyServiceClient;
import com.google.ads.googleads.v7.services.CampaignBudgetOperation;
import com.google.ads.googleads.v7.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v7.services.CampaignOperation;
import com.google.ads.googleads.v7.services.CampaignServiceClient;
import com.google.ads.googleads.v7.services.MutateBiddingStrategiesResponse;
import com.google.ads.googleads.v7.services.MutateBiddingStrategyResult;
import com.google.ads.googleads.v7.services.MutateCampaignBudgetResult;
import com.google.ads.googleads.v7.services.MutateCampaignBudgetsResponse;
import com.google.ads.googleads.v7.services.MutateCampaignResult;
import com.google.ads.googleads.v7.services.MutateCampaignsResponse;
import com.google.ads.googleads.v7.utils.ResourceNames;
import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.annotation.Nullable;

/** Adds a portfolio bidding strategy and uses it to construct a campaign. */
public class UsePortfolioBiddingStrategy {

  private static class UsePortfolioBiddingStrategyParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_BUDGET_ID)
    private Long campaignBudgetId;
  }

  public static void main(String[] args) {
    UsePortfolioBiddingStrategyParams params = new UsePortfolioBiddingStrategyParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");

      // Optional: Specify a campaign budget ID here if you'd like to use an existing shared budget.
      params.campaignBudgetId = null;
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
      new UsePortfolioBiddingStrategy()
          .runExample(googleAdsClient, params.customerId, params.campaignBudgetId);
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
   * @param campaignBudgetId the ID of the shared budget to use. If null, this example will create a
   *     new shared budget.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, Long customerId, @Nullable Long campaignBudgetId) {
    String biddingStrategyResourceName = createBiddingStrategy(googleAdsClient, customerId);
    String campaignBudgetResourceName = null;
    if (campaignBudgetId == null) {
      campaignBudgetResourceName = createSharedCampaignBudget(googleAdsClient, customerId);
    } else {
      campaignBudgetResourceName = ResourceNames.campaignBudget(customerId, campaignBudgetId);
    }

    createCampaignWithBiddingStrategy(
        googleAdsClient, customerId, biddingStrategyResourceName, campaignBudgetResourceName);
  }

  /**
   * Creates the bidding strategy object.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START use_portfolio_bidding_strategy_1]
  private String createBiddingStrategy(GoogleAdsClient googleAdsClient, long customerId) {
    try (BiddingStrategyServiceClient biddingStrategyServiceClient =
        googleAdsClient.getLatestVersion().createBiddingStrategyServiceClient()) {
      // Creates a portfolio bidding strategy.
      TargetSpend targetSpend = TargetSpend.newBuilder().setCpcBidCeilingMicros(2_000_000L).build();
      BiddingStrategy portfolioBiddingStrategy =
          BiddingStrategy.newBuilder()
              .setName("Maximize Clicks #" + getPrintableDateTime())
              .setTargetSpend(targetSpend)
              .build();
      // Constructs an operation that will create a portfolio bidding strategy.
      BiddingStrategyOperation operation =
          BiddingStrategyOperation.newBuilder().setCreate(portfolioBiddingStrategy).build();
      // Sends the operation in a mutate request.
      MutateBiddingStrategiesResponse response =
          biddingStrategyServiceClient.mutateBiddingStrategies(
              Long.toString(customerId), Lists.newArrayList(operation));

      MutateBiddingStrategyResult mutateBiddingStrategyResult = response.getResults(0);
      // Prints the resource name of the created object.
      System.out.printf(
          "Created portfolio bidding strategy with resource name: '%s'.%n",
          mutateBiddingStrategyResult.getResourceName());

      return mutateBiddingStrategyResult.getResourceName();
    }
  }
  // [END use_portfolio_bidding_strategy_1]

  /**
   * Creates an explicit budget to be used only to create the campaign.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START use_portfolio_bidding_strategy]
  private String createSharedCampaignBudget(GoogleAdsClient googleAdsClient, long customerId) {
    try (CampaignBudgetServiceClient campaignBudgetServiceClient =
        googleAdsClient.getLatestVersion().createCampaignBudgetServiceClient()) {
      // Creates a shared budget.
      CampaignBudget budget =
          CampaignBudget.newBuilder()
              .setName("Shared Interplanetary Budget #" + getPrintableDateTime())
              .setAmountMicros(50_000_000L)
              .setDeliveryMethod(BudgetDeliveryMethod.STANDARD)
              .setExplicitlyShared(true)
              .build();
      // Constructs an operation that will create a shared budget.
      CampaignBudgetOperation operation =
          CampaignBudgetOperation.newBuilder().setCreate(budget).build();
      // Sends the operation in a mutate request.
      MutateCampaignBudgetsResponse response =
          campaignBudgetServiceClient.mutateCampaignBudgets(
              Long.toString(customerId), Lists.newArrayList(operation));

      MutateCampaignBudgetResult mutateCampaignBudgetResult = response.getResults(0);
      // Prints the resource name of the created object.
      System.out.printf(
          "Created shared budget with resource name: '%s'.%n",
          mutateCampaignBudgetResult.getResourceName());

      return mutateCampaignBudgetResult.getResourceName();
    }
  }
  // [END use_portfolio_bidding_strategy]

  /**
   * Create a Campaign with a portfolio bidding strategy.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param biddingStrategyResourceName the bidding strategy resource name to use
   * @param campaignBudgetResourceName the shared budget resource name to use
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private String createCampaignWithBiddingStrategy(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String biddingStrategyResourceName,
      String campaignBudgetResourceName) {
    try (CampaignServiceClient campaignServiceClient =
        googleAdsClient.getLatestVersion().createCampaignServiceClient()) {
      // Creates the campaign.
      NetworkSettings networkSettings =
          NetworkSettings.newBuilder()
              .setTargetGoogleSearch(true)
              .setTargetSearchNetwork(true)
              .setTargetContentNetwork(true)
              .build();
      // [START use_portfolio_bidding_strategy_2]
      Campaign campaign =
          Campaign.newBuilder()
              .setName("Interplanetary Cruise #" + getPrintableDateTime())
              .setStatus(CampaignStatus.PAUSED)
              .setCampaignBudget(campaignBudgetResourceName)
              .setBiddingStrategy(biddingStrategyResourceName)
              .setAdvertisingChannelType(AdvertisingChannelType.SEARCH)
              .setNetworkSettings(networkSettings)
              .build();
      // [END use_portfolio_bidding_strategy_2]
      // Constructs an operation that will create a campaign.
      CampaignOperation operation = CampaignOperation.newBuilder().setCreate(campaign).build();
      // Sends the operation in a mutate request.
      MutateCampaignsResponse response =
          campaignServiceClient.mutateCampaigns(
              Long.toString(customerId), Lists.newArrayList(operation));

      MutateCampaignResult mutateCampaignResult = response.getResults(0);
      // Prints the resource name of the created object.
      System.out.printf(
          "Created campaign with resource name: '%s'.%n", mutateCampaignResult.getResourceName());

      return mutateCampaignResult.getResourceName();
    }
  }
}

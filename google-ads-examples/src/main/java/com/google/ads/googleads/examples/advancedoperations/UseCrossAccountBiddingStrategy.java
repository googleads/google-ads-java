// Copyright 2021 Google LLC
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
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v17.common.TargetSpend;
import com.google.ads.googleads.v17.errors.GoogleAdsError;
import com.google.ads.googleads.v17.errors.GoogleAdsException;
import com.google.ads.googleads.v17.resources.AccessibleBiddingStrategy;
import com.google.ads.googleads.v17.resources.BiddingStrategy;
import com.google.ads.googleads.v17.resources.BiddingStrategyName;
import com.google.ads.googleads.v17.resources.Campaign;
import com.google.ads.googleads.v17.services.BiddingStrategyOperation;
import com.google.ads.googleads.v17.services.BiddingStrategyServiceClient;
import com.google.ads.googleads.v17.services.CampaignOperation;
import com.google.ads.googleads.v17.services.CampaignServiceClient;
import com.google.ads.googleads.v17.services.GoogleAdsRow;
import com.google.ads.googleads.v17.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v17.services.MutateBiddingStrategiesResponse;
import com.google.ads.googleads.v17.services.MutateBiddingStrategyResult;
import com.google.ads.googleads.v17.services.MutateCampaignResult;
import com.google.ads.googleads.v17.services.MutateCampaignsResponse;
import com.google.ads.googleads.v17.services.SearchGoogleAdsStreamRequest;
import com.google.ads.googleads.v17.services.SearchGoogleAdsStreamResponse;
import com.google.ads.googleads.v17.utils.ResourceNames;
import com.google.api.gax.rpc.ServerStream;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Adds a cross-account bidding strategy to a manager account and attaches it to a client customer's
 * campaign. Also lists all manager-owned and customer accessible bidding strategies.
 */
public class UseCrossAccountBiddingStrategy {

  private static class UseCrossAccountBiddingStrategyParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.MANAGER_CUSTOMER_ID, required = true)
    private Long managerCustomerId;

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;
  }

  public static void main(String[] args) {
    UseCrossAccountBiddingStrategyParams params = new UseCrossAccountBiddingStrategyParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.managerCustomerId = Long.parseLong("INSERT_MANAGER_CUSTOMER_ID_HERE");
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
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
      new UseCrossAccountBiddingStrategy()
          .runExample(
              googleAdsClient, params.managerCustomerId, params.customerId, params.campaignId);
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
   * @param managerCustomerId the manager customer ID.
   * @param clientCustomerId the client customer ID.
   * @param campaignId the ID of an existing campaign in the client customer's account.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      Long managerCustomerId,
      Long clientCustomerId,
      Long campaignId) {
    String biddingStrategyResourceName = createBiddingStrategy(googleAdsClient, managerCustomerId);
    listManagerOwnedBiddingStrategies(googleAdsClient, managerCustomerId);
    listCustomerAccessibleBiddingStrategies(googleAdsClient, clientCustomerId);
    attachCrossAccountBiddingStrategyToCampaign(
        googleAdsClient, clientCustomerId, campaignId, biddingStrategyResourceName);
  }

  /**
   * Creates a new TargetSpend (Maximize Clicks) cross-account bidding strategy in the manager
   * account {@code managerCustomerId}.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param managerCustomerId the manager account's customer ID.
   * @return the resource name of the newly created bidding strategy.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START create_cross_account_strategy]
  private String createBiddingStrategy(GoogleAdsClient googleAdsClient, long managerCustomerId) {
    try (BiddingStrategyServiceClient biddingStrategyServiceClient =
        googleAdsClient.getLatestVersion().createBiddingStrategyServiceClient()) {
      // Creates a portfolio bidding strategy.
      // [START set_currency_code]
      BiddingStrategy portfolioBiddingStrategy =
          BiddingStrategy.newBuilder()
              .setName("Maximize Clicks #" + getPrintableDateTime())
              .setTargetSpend(TargetSpend.getDefaultInstance())
              // Sets the currency of the new bidding strategy. If not provided, the bidding
              // strategy uses the manager account's default currency.
              .setCurrencyCode("USD")
              .build();
      // [END set_currency_code]
      // Constructs an operation that will create a portfolio bidding strategy.
      BiddingStrategyOperation operation =
          BiddingStrategyOperation.newBuilder().setCreate(portfolioBiddingStrategy).build();
      // Sends the operation in a mutate request.
      MutateBiddingStrategiesResponse response =
          biddingStrategyServiceClient.mutateBiddingStrategies(
              Long.toString(managerCustomerId), ImmutableList.of(operation));

      // Prints the resource name of the created cross-account bidding strategy.
      MutateBiddingStrategyResult mutateBiddingStrategyResult = response.getResults(0);
      String resourceName = mutateBiddingStrategyResult.getResourceName();
      System.out.printf("Created cross-account bidding strategy: '%s'.%n", resourceName);

      return resourceName;
    }
  }
  // [END create_cross_account_strategy]

  /**
   * List all cross-account bidding strategies in manager account {@code managerCustomerId}.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param managerCustomerId the manager account's customer ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START list_manager_strategies]
  private void listManagerOwnedBiddingStrategies(
      GoogleAdsClient googleAdsClient, long managerCustomerId) throws GoogleAdsException {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      String query =
          "SELECT bidding_strategy.id, "
              + "bidding_strategy.name, "
              + "bidding_strategy.type, "
              + "bidding_strategy.currency_code "
              + "FROM bidding_strategy";
      // Constructs the SearchGoogleAdsStreamRequest.
      SearchGoogleAdsStreamRequest request =
          SearchGoogleAdsStreamRequest.newBuilder()
              .setCustomerId(Long.toString(managerCustomerId))
              .setQuery(query)
              .build();

      // Creates and issues a search Google Ads stream request that will retrieve all bidding
      // strategies.
      ServerStream<SearchGoogleAdsStreamResponse> stream =
          googleAdsServiceClient.searchStreamCallable().call(request);

      // Iterates through and prints all of the results in the stream response.
      System.out.printf(
          "Cross-account bid strategies in manager account %d: %n", managerCustomerId);
      for (SearchGoogleAdsStreamResponse response : stream) {
        for (GoogleAdsRow googleAdsRow : response.getResultsList()) {
          BiddingStrategy bs = googleAdsRow.getBiddingStrategy();
          System.out.printf("  ID: %d%n", bs.getId());
          System.out.printf("  Name: %s%n", bs.getName());
          System.out.printf("  Strategy type: %s%n", bs.getType());
          System.out.printf("  Currency: %s%n", bs.getCurrencyCode());
          System.out.println();
        }
      }
    }
  }
  // [END list_manager_strategies]

  /**
   * Lists all bidding strategies available to account {@code clientCustomerId}. This includes both
   * portfolio bidding strategies owned by account {@code clientCustomerId} and cross-account
   * bidding strategies shared by any of its managers.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param clientCustomerId the client account's customer ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START list_accessible_strategies]
  private void listCustomerAccessibleBiddingStrategies(
      GoogleAdsClient googleAdsClient, long clientCustomerId) throws GoogleAdsException {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      String query =
          "SELECT accessible_bidding_strategy.id, "
              + "accessible_bidding_strategy.name, "
              + "accessible_bidding_strategy.type, "
              + "accessible_bidding_strategy.owner_customer_id, "
              + "accessible_bidding_strategy.owner_descriptive_name "
              + "FROM accessible_bidding_strategy "
          // Uncomment the following WHERE clause to filter results to *only* cross-account bidding
          // strategies shared with the current customer by a manager (and not also include the
          // current customer's portfolio bidding strategies).
          // + "WHERE accessible_bidding_strategy.owner_customer_id != " + clientCustomerId;
          ;

      // Constructs the SearchGoogleAdsStreamRequest.
      SearchGoogleAdsStreamRequest request =
          SearchGoogleAdsStreamRequest.newBuilder()
              .setCustomerId(Long.toString(clientCustomerId))
              .setQuery(query)
              .build();

      // Creates and issues a search Google Ads stream request that will retrieve all accessible
      // bidding strategies.
      ServerStream<SearchGoogleAdsStreamResponse> stream =
          googleAdsServiceClient.searchStreamCallable().call(request);

      // Iterates through and prints all of the results in the stream response.
      System.out.printf("All bid strategies accessible by account %d: %n", clientCustomerId);
      for (SearchGoogleAdsStreamResponse response : stream) {
        for (GoogleAdsRow googleAdsRow : response.getResultsList()) {
          AccessibleBiddingStrategy bs = googleAdsRow.getAccessibleBiddingStrategy();
          System.out.printf("  ID: %d%n", bs.getId());
          System.out.printf("  Name: %s%n", bs.getName());
          System.out.printf("  Strategy type: %s%n", bs.getType());
          System.out.printf("  Owner customer ID: %d%n", bs.getOwnerCustomerId());
          System.out.printf("  Owner description: %s%n", bs.getOwnerDescriptiveName());
          System.out.println();
        }
      }
    }
  }
  // [END list_accessible_strategies]

  /**
   * Attaches the cross-account bidding strategy {@code biddingStrategyId} to campaign {@code
   * campaignId} in client account {@code clientCustomerId}.
   */
  // [START attach_strategy]
  private void attachCrossAccountBiddingStrategyToCampaign(
      GoogleAdsClient googleAdsClient,
      long clientCustomerId,
      long campaignId,
      String biddingStrategyResourceName)
      throws GoogleAdsException {

    try (CampaignServiceClient campaignServiceClient =
        googleAdsClient.getLatestVersion().createCampaignServiceClient()) {
      Campaign campaign =
          Campaign.newBuilder()
              .setResourceName(ResourceNames.campaign(clientCustomerId, campaignId))
              .setBiddingStrategy(biddingStrategyResourceName)
              .build();
      CampaignOperation operation =
          CampaignOperation.newBuilder()
              .setUpdate(campaign)
              .setUpdateMask(FieldMasks.allSetFieldsOf(campaign))
              .build();
      // Sends the operation in a mutate request.
      MutateCampaignsResponse response =
          campaignServiceClient.mutateCampaigns(
              Long.toString(clientCustomerId), ImmutableList.of(operation));

      MutateCampaignResult mutateCampaignResult = response.getResults(0);
      // Prints the resource name of the updated campaign.
      System.out.printf(
          "Updated campaign with resource name: '%s'.%n", mutateCampaignResult.getResourceName());
    }
  }
  // [END attach_strategy]
}

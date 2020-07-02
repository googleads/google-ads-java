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

package com.google.ads.googleads.examples.advancedoperations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v5.common.ExpandedDynamicSearchAdInfo;
import com.google.ads.googleads.v5.common.ManualCpc;
import com.google.ads.googleads.v5.common.WebpageConditionInfo;
import com.google.ads.googleads.v5.common.WebpageInfo;
import com.google.ads.googleads.v5.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v5.enums.AdGroupCriterionStatusEnum.AdGroupCriterionStatus;
import com.google.ads.googleads.v5.enums.AdGroupStatusEnum.AdGroupStatus;
import com.google.ads.googleads.v5.enums.AdGroupTypeEnum.AdGroupType;
import com.google.ads.googleads.v5.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v5.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v5.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v5.enums.WebpageConditionOperandEnum.WebpageConditionOperand;
import com.google.ads.googleads.v5.errors.GoogleAdsError;
import com.google.ads.googleads.v5.errors.GoogleAdsException;
import com.google.ads.googleads.v5.resources.Ad;
import com.google.ads.googleads.v5.resources.AdGroup;
import com.google.ads.googleads.v5.resources.AdGroupAd;
import com.google.ads.googleads.v5.resources.AdGroupCriterion;
import com.google.ads.googleads.v5.resources.Campaign;
import com.google.ads.googleads.v5.resources.Campaign.DynamicSearchAdsSetting;
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
import com.google.ads.googleads.v5.services.MutateAdGroupAdsResponse;
import com.google.ads.googleads.v5.services.MutateAdGroupCriteriaResponse;
import com.google.ads.googleads.v5.services.MutateAdGroupsResponse;
import com.google.ads.googleads.v5.services.MutateCampaignBudgetsResponse;
import com.google.ads.googleads.v5.services.MutateCampaignsResponse;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.joda.time.DateTime;

/** Adds a new dynamic search ad (DSA) and webpage targeting criteria for the DSA. */
public class AddDynamicSearchAds {
  private static class AddDynamicSearchAdsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    Long customerId;
  }

  public static void main(String[] args) {
    AddDynamicSearchAdsParams params = new AddDynamicSearchAdsParams();
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
      System.err.printf("Failed to create GoogleAdsClient. Exception %s%n", ioe);
      return;
    }

    try {
      new AddDynamicSearchAds().runExample(googleAdsClient, params.customerId);
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
  private static void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    String budgetResourceName = addCampaignBudget(googleAdsClient, customerId);
    String campaignResourceName = addCampaign(googleAdsClient, customerId, budgetResourceName);
    String adGroupResourceName = addAdGroup(googleAdsClient, customerId, campaignResourceName);
    addExpandedDSA(googleAdsClient, customerId, adGroupResourceName);
    addWebPageCriteria(googleAdsClient, customerId, adGroupResourceName);
  }

  /**
   * Adds a campaign budget.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @return the campaign budget resource name.
   */
  private static String addCampaignBudget(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates the budget.
    CampaignBudget campaignBudget =
        CampaignBudget.newBuilder()
            .setName("Interplanetary Cruise Budget #" + System.currentTimeMillis())
            .setAmountMicros(3_000_000)
            .setDeliveryMethod(BudgetDeliveryMethod.STANDARD)
            .build();

    // Creates the operation.
    CampaignBudgetOperation operation =
        CampaignBudgetOperation.newBuilder().setCreate(campaignBudget).build();

    // Creates the campaign budget service client.
    try (CampaignBudgetServiceClient campaignBudgetServiceClient =
        googleAdsClient.getLatestVersion().createCampaignBudgetServiceClient()) {
      // Adds the campaign budget.
      MutateCampaignBudgetsResponse response =
          campaignBudgetServiceClient.mutateCampaignBudgets(
              Long.toString(customerId), ImmutableList.of(operation));
      // Displays the result.
      String budgetResourceName = response.getResults(0).getResourceName();
      System.out.printf("Added budget with resource name '%s'.%n", budgetResourceName);
      return budgetResourceName;
    }
  }

  /**
   * Adds a campaign.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param budgetResourceName the campaign budget resource name.
   * @return the campaign resource name.
   */
  private static String addCampaign(
      GoogleAdsClient googleAdsClient, long customerId, String budgetResourceName) {
    // Creates the campaign.
    Campaign campaign =
        Campaign.newBuilder()
            .setName("Interplanetary Cruise #" + System.currentTimeMillis())
            .setAdvertisingChannelType(AdvertisingChannelType.SEARCH)
            .setStatus(CampaignStatus.PAUSED)
            .setManualCpc(ManualCpc.newBuilder().build())
            .setCampaignBudget(budgetResourceName)
            // Enables the campaign for DSAs.
            .setDynamicSearchAdsSetting(
                DynamicSearchAdsSetting.newBuilder()
                    .setDomainName("example.com")
                    .setLanguageCode("en")
                    .build())
            .setStartDate(new DateTime().plusDays(1).toString("yyyyMMdd"))
            .setEndDate(new DateTime().plusDays(30).toString("yyyyMMdd"))
            .build();

    // Creates the operation.
    CampaignOperation operation = CampaignOperation.newBuilder().setCreate(campaign).build();

    // Creates the campaign service client.
    try (CampaignServiceClient campaignServiceClient =
        googleAdsClient.getLatestVersion().createCampaignServiceClient()) {
      // Adds the campaign.
      MutateCampaignsResponse response =
          campaignServiceClient.mutateCampaigns(
              Long.toString(customerId), ImmutableList.of(operation));

      String campaignResourceName = response.getResults(0).getResourceName();
      // Displays the results.
      System.out.printf("Added campaign with resource name '%s'.%n", campaignResourceName);
      return campaignResourceName;
    }
  }

  /**
   * Adds an ad group.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignResourceName the campaign resource name.
   * @return the ad group resource name.
   */
  private static String addAdGroup(
      GoogleAdsClient googleAdsClient, long customerId, String campaignResourceName) {
    // Creates the ad group.
    AdGroup adGroup =
        AdGroup.newBuilder()
            .setName("Earth to Mars Cruises #" + System.currentTimeMillis())
            .setCampaign(campaignResourceName)
            .setType(AdGroupType.SEARCH_DYNAMIC_ADS)
            .setStatus(AdGroupStatus.PAUSED)
            .setTrackingUrlTemplate("http://tracker.examples.com/traveltracker/{escapedlpurl}")
            .setCpcBidMicros(50_000)
            .build();

    // Creates the operation.
    AdGroupOperation operation = AdGroupOperation.newBuilder().setCreate(adGroup).build();

    // Creates the ad group service client.
    try (AdGroupServiceClient adGroupServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupServiceClient()) {
      MutateAdGroupsResponse response =
          adGroupServiceClient.mutateAdGroups(
              Long.toString(customerId), ImmutableList.of(operation));
      String adGroupResourceName = response.getResults(0).getResourceName();
      // Displays the results.
      System.out.printf("Added ad group with resource name '%s'.%n", adGroupResourceName);
      return adGroupResourceName;
    }
  }

  /**
   * Adds an expanded dynamic search ad.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupResourceName the ad group resource name.
   */
  private static void addExpandedDSA(
      GoogleAdsClient googleAdsClient, long customerId, String adGroupResourceName) {
    // Creates an ad group ad.
    AdGroupAd adGroupAd =
        AdGroupAd.newBuilder()
            .setAdGroup(adGroupResourceName)
            .setStatus(AdGroupAdStatus.PAUSED)
            // Sets the ad as an expanded dynamic search ad
            .setAd(
                Ad.newBuilder()
                    .setExpandedDynamicSearchAd(
                        ExpandedDynamicSearchAdInfo.newBuilder()
                            .setDescription(StringValue.of("Buy tickets now!"))
                            .build())
                    .build())
            .build();

    // Creates the operation.
    AdGroupAdOperation operation = AdGroupAdOperation.newBuilder().setCreate(adGroupAd).build();

    // Creates the ad group ad service client.
    try (AdGroupAdServiceClient adGroupAdServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupAdServiceClient()) {
      // Adds the dynamic search ad.
      MutateAdGroupAdsResponse response =
          adGroupAdServiceClient.mutateAdGroupAds(
              Long.toString(customerId), ImmutableList.of(operation));
      // Displays the response.
      System.out.printf(
          "Added ad group ad with resource name '%s'.%n", response.getResults(0).getResourceName());
    }
  }

  /**
   * Adds webpage targeting criteria for the DSA.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupResourceName the ad group resource name.
   */
  private static void addWebPageCriteria(
      GoogleAdsClient googleAdsClient, long customerId, String adGroupResourceName) {
    // Creates the criteria.
    AdGroupCriterion adGroupCriterion =
        AdGroupCriterion.newBuilder()
            .setAdGroup(adGroupResourceName)
            .setCpcBidMicros(1_000_000)
            .setStatus(AdGroupCriterionStatus.PAUSED)
            // Sets the webpage targeting criteria.
            .setWebpage(
                WebpageInfo.newBuilder()
                    .setCriterionName("Special Offers")
                    // Adds the url targeting criteria.
                    .addConditions(
                        WebpageConditionInfo.newBuilder()
                            .setOperand(WebpageConditionOperand.URL)
                            .setArgument("/specialoffers")
                            .build())
                    // Adds the page title criteria.
                    // The list of webpage targeting conditions are
                    // and-ed together when evaluated for targeting.
                    .addConditions(
                        WebpageConditionInfo.newBuilder()
                            .setOperand(WebpageConditionOperand.PAGE_TITLE)
                            .setArgument("Special Offer")
                            .build())
                    .build())
            .build();

    // Creates the operation.
    AdGroupCriterionOperation operation =
        AdGroupCriterionOperation.newBuilder().setCreate(adGroupCriterion).build();

    // Creates the service client.
    try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupCriterionServiceClient()) {
      // Adds the criteria.
      MutateAdGroupCriteriaResponse response =
          adGroupCriterionServiceClient.mutateAdGroupCriteria(
              Long.toString(customerId), ImmutableList.of(operation));
      // Displays the results.
      System.out.printf(
          "Added ad group criterion with resource name '%s'.%n",
          response.getResults(0).getResourceName());
    }
  }
}

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

package com.google.ads.googleads.examples.basicoperations;

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v11.common.ManualCpc;
import com.google.ads.googleads.v11.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v11.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v11.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v11.errors.GoogleAdsError;
import com.google.ads.googleads.v11.errors.GoogleAdsException;
import com.google.ads.googleads.v11.resources.Campaign;
import com.google.ads.googleads.v11.resources.Campaign.NetworkSettings;
import com.google.ads.googleads.v11.resources.CampaignBudget;
import com.google.ads.googleads.v11.services.CampaignBudgetOperation;
import com.google.ads.googleads.v11.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v11.services.CampaignOperation;
import com.google.ads.googleads.v11.services.CampaignServiceClient;
import com.google.ads.googleads.v11.services.MutateCampaignBudgetsResponse;
import com.google.ads.googleads.v11.services.MutateCampaignResult;
import com.google.ads.googleads.v11.services.MutateCampaignsResponse;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/** Adds new campaigns to a client account. */
public class AddCampaigns {

  /** The number of campaigns this example will add. */
  private static final int NUMBER_OF_CAMPAIGNS_TO_ADD = 2;

  private static class AddCampaignsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    AddCampaignsParams params = new AddCampaignsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
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
      new AddCampaigns().runExample(googleAdsClient, params.customerId);
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
   * Creates a new CampaignBudget in the specified client account.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @return resource name of the newly created budget.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START add_campaigns]
  private static String addCampaignBudget(GoogleAdsClient googleAdsClient, long customerId) {
    CampaignBudget budget =
        CampaignBudget.newBuilder()
            .setName("Interplanetary Cruise Budget #" + getPrintableDateTime())
            .setDeliveryMethod(BudgetDeliveryMethod.STANDARD)
            .setAmountMicros(500_000)
            .build();

    CampaignBudgetOperation op = CampaignBudgetOperation.newBuilder().setCreate(budget).build();

    try (CampaignBudgetServiceClient campaignBudgetServiceClient =
        googleAdsClient.getLatestVersion().createCampaignBudgetServiceClient()) {
      MutateCampaignBudgetsResponse response =
          campaignBudgetServiceClient.mutateCampaignBudgets(
              Long.toString(customerId), ImmutableList.of(op));
      String budgetResourceName = response.getResults(0).getResourceName();
      System.out.printf("Added budget: %s%n", budgetResourceName);
      return budgetResourceName;
    }
  }
  // [END add_campaigns]

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {

    // Creates a single shared budget to be used by the campaigns added below.
    String budgetResourceName = addCampaignBudget(googleAdsClient, customerId);

    List<CampaignOperation> operations = new ArrayList<>(NUMBER_OF_CAMPAIGNS_TO_ADD);

    for (int i = 0; i < NUMBER_OF_CAMPAIGNS_TO_ADD; i++) {
      // Configures the campaign network options
      NetworkSettings networkSettings =
          NetworkSettings.newBuilder()
              .setTargetGoogleSearch(true)
              .setTargetSearchNetwork(true)
              // Enables Display Expansion on Search campaigns. See
              // https://support.google.com/google-ads/answer/7193800 to learn more.
              .setTargetContentNetwork(true)
              .setTargetPartnerSearchNetwork(false)
              .build();

      // [START add_campaigns_1]
      // Creates the campaign.
      Campaign campaign =
          Campaign.newBuilder()
              .setName("Interplanetary Cruise #" + getPrintableDateTime())
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
              // Optional: Sets the start & end dates.
              .setStartDate(new DateTime().plusDays(1).toString("yyyyMMdd"))
              .setEndDate(new DateTime().plusDays(30).toString("yyyyMMdd"))
              .build();
      // [END add_campaigns_1]

      CampaignOperation op = CampaignOperation.newBuilder().setCreate(campaign).build();
      operations.add(op);
    }

    try (CampaignServiceClient campaignServiceClient =
        googleAdsClient.getLatestVersion().createCampaignServiceClient()) {
      MutateCampaignsResponse response =
          campaignServiceClient.mutateCampaigns(Long.toString(customerId), operations);
      System.out.printf("Added %d campaigns:%n", response.getResultsCount());
      for (MutateCampaignResult result : response.getResultsList()) {
        System.out.println(result.getResourceName());
      }
    }
  }
}

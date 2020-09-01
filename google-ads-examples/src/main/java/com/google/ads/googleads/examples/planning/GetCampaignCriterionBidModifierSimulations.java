// Copyright 2020 Google LLC
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

package com.google.ads.googleads.examples.planning;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v5.common.BidModifierSimulationPoint;
import com.google.ads.googleads.v5.errors.GoogleAdsError;
import com.google.ads.googleads.v5.errors.GoogleAdsException;
import com.google.ads.googleads.v5.resources.CampaignCriterionSimulation;
import com.google.ads.googleads.v5.services.GoogleAdsRow;
import com.google.ads.googleads.v5.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v5.services.SearchGoogleAdsStreamRequest;
import com.google.ads.googleads.v5.services.SearchGoogleAdsStreamResponse;
import com.google.api.gax.rpc.ServerStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Gets all available criterion bid modifier simulations for a given campaign. To get campaigns, run
 * GetCampaigns.java.
 */
public class GetCampaignCriterionBidModifierSimulations {

  private static class GetCampaignCriterionBidModifierSimulationsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;
  }

  public static void main(String[] args) throws IOException {
    GetCampaignCriterionBidModifierSimulationsParams params =
        new GetCampaignCriterionBidModifierSimulationsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
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
      new GetCampaignCriterionBidModifierSimulations()
          .runExample(googleAdsClient, params.customerId, params.campaignId);
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
   * @param campaignId the campaign ID to get the criterion bid modifier simulations.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long campaignId) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Creates a query that retrieves the criterion bid modifier simulations.
      String query =
          String.format(
              "SELECT campaign_criterion_simulation.criterion_id, "
                  + "campaign_criterion_simulation.start_date, "
                  + "campaign_criterion_simulation.end_date, "
                  + "campaign_criterion_simulation.bid_modifier_point_list.points "
                  + "FROM campaign_criterion_simulation "
                  + "WHERE campaign_criterion_simulation.type = BID_MODIFIER "
                  + "AND campaign_criterion_simulation.campaign_id = %d",
              campaignId);
      // Constructs the SearchGoogleAdsStreamRequest.
      SearchGoogleAdsStreamRequest request =
          SearchGoogleAdsStreamRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setQuery(query)
              .build();

      // Creates and issues a search Google Ads stream request.
      ServerStream<SearchGoogleAdsStreamResponse> stream =
          googleAdsServiceClient.searchStreamCallable().call(request);

      // Iterates over all rows in all messages and prints the requested field values for
      // the campaign criterion bid modifier simulation in each row.
      for (SearchGoogleAdsStreamResponse response : stream) {
        for (GoogleAdsRow googleAdsRow : response.getResultsList()) {
          CampaignCriterionSimulation simulation = googleAdsRow.getCampaignCriterionSimulation();
          System.out.printf(
              "Found campaign-level criterion bid modifier simulation for "
                  + "criterion with ID %d, start date '%s', end date '%s', and points:%n'",
              simulation.getCriterionId(), simulation.getStartDate(), simulation.getEndDate());
          for (BidModifierSimulationPoint point :
              simulation.getBidModifierPointList().getPointsList()) {
            System.out.printf(
                " bid modifier: %.2f => clicks: %d, cost: %d, impressions: %d, "
                    + "parent clicks: %d, parent cost: %d, parent impressions: %d, "
                    + "parent required budget: %d%n",
                point.getBidModifier(),
                point.getClicks(),
                point.getCostMicros(),
                point.getImpressions(),
                point.getParentClicks(),
                point.getParentCostMicros(),
                point.getParentImpressions(),
                point.getParentRequiredBudgetMicros());
          }
        }
      }
    }
  }
}

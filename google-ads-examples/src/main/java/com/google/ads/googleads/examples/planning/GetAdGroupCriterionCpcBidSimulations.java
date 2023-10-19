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
import com.google.ads.googleads.v15.common.CpcBidSimulationPoint;
import com.google.ads.googleads.v15.errors.GoogleAdsError;
import com.google.ads.googleads.v15.errors.GoogleAdsException;
import com.google.ads.googleads.v15.resources.AdGroupCriterionSimulation;
import com.google.ads.googleads.v15.services.GoogleAdsRow;
import com.google.ads.googleads.v15.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v15.services.SearchGoogleAdsStreamRequest;
import com.google.ads.googleads.v15.services.SearchGoogleAdsStreamResponse;
import com.google.api.gax.rpc.ServerStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Gets all available ad group criterion CPC bid simulations for a given ad group. To get ad groups,
 * run GetAdGroups.java.
 */
public class GetAdGroupCriterionCpcBidSimulations {

  private static class GetAdGroupCriterionCpcBidSimulationsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
  }

  public static void main(String[] args) {
    GetAdGroupCriterionCpcBidSimulationsParams params =
        new GetAdGroupCriterionCpcBidSimulationsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
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
      new GetAdGroupCriterionCpcBidSimulations()
          .runExample(googleAdsClient, params.customerId, params.adGroupId);
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
   * @param adGroupId the ad group ID to get the ad group criterion CPC bid simulations for.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START get_ad_group_criterion_cpc_bid_simulations]
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long adGroupId) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Creates a query that retrieves the ad group criterion CPC bid simulations.
      String query =
          String.format(
              "SELECT ad_group_criterion_simulation.ad_group_id, "
                  + "ad_group_criterion_simulation.criterion_id, "
                  + "ad_group_criterion_simulation.start_date, "
                  + "ad_group_criterion_simulation.end_date, "
                  + "ad_group_criterion_simulation.cpc_bid_point_list.points "
                  + "FROM ad_group_criterion_simulation "
                  + "WHERE ad_group_criterion_simulation.type = CPC_BID "
                  + "AND ad_group_criterion_simulation.ad_group_id = %d",
              adGroupId);
      // Constructs the SearchGoogleAdsStreamRequest.
      SearchGoogleAdsStreamRequest request =
          SearchGoogleAdsStreamRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setQuery(query)
              .build();

      // Issues the search stream request.
      ServerStream<SearchGoogleAdsStreamResponse> stream =
          googleAdsServiceClient.searchStreamCallable().call(request);

      // Iterates over all rows in all messages and prints the requested field values for
      // the ad group criterion CPC bid simulation in each row.
      for (SearchGoogleAdsStreamResponse response : stream) {
        for (GoogleAdsRow googleAdsRow : response.getResultsList()) {
          AdGroupCriterionSimulation simulation = googleAdsRow.getAdGroupCriterionSimulation();
          System.out.printf(
              "Found ad group criterion CPC bid simulation for ad group ID %d, "
                  + "criterion ID %d, start date '%s', end date '%s', and points:%n",
              simulation.getAdGroupId(),
              simulation.getCriterionId(),
              simulation.getStartDate(),
              simulation.getEndDate());
          for (CpcBidSimulationPoint point : simulation.getCpcBidPointList().getPointsList()) {
            System.out.printf(
                "  bid: %d => clicks: %d, cost: %d, impressions: %d, "
                    + "biddable conversions: %.2f, biddable conversions value: %.2f%s",
                point.getCpcBidMicros(),
                point.getClicks(),
                point.getCostMicros(),
                point.getImpressions(),
                point.getBiddableConversions(),
                point.getBiddableConversions());
          }
        }
      }
    }
  }
  // [END get_ad_group_criterion_cpc_bid_simulations]
}

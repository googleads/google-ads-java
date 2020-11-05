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

package com.google.ads.googleads.examples.reporting;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v5.common.Metrics;
import com.google.ads.googleads.v5.errors.GoogleAdsError;
import com.google.ads.googleads.v5.errors.GoogleAdsException;
import com.google.ads.googleads.v5.resources.AdGroup;
import com.google.ads.googleads.v5.resources.AdGroupCriterion;
import com.google.ads.googleads.v5.resources.Campaign;
import com.google.ads.googleads.v5.services.GoogleAdsRow;
import com.google.ads.googleads.v5.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v5.services.SearchGoogleAdsStreamRequest;
import com.google.ads.googleads.v5.services.SearchGoogleAdsStreamResponse;
import com.google.api.gax.rpc.ServerStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Gets keyword performance statistics for the 50 keywords with the most impressions over the last 7
 * days.
 */
public class GetKeywordStats {

  private static class GetKeywordStatsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) throws IOException {
    GetKeywordStatsParams params = new GetKeywordStatsParams();
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
      new GetKeywordStats().runExample(googleAdsClient, params.customerId);
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
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      String searchQuery =
          "SELECT campaign.id, "
              + "campaign.name, "
              + "ad_group.id, "
              + "ad_group.name, "
              + "ad_group_criterion.criterion_id, "
              + "ad_group_criterion.keyword.text, "
              + "ad_group_criterion.keyword.match_type, "
              + "metrics.impressions, "
              + "metrics.clicks, "
              + "metrics.cost_micros "
              + "FROM keyword_view "
              + "WHERE segments.date DURING LAST_7_DAYS "
              + "AND campaign.advertising_channel_type = 'SEARCH' "
              + "AND ad_group.status = 'ENABLED' "
              + "AND ad_group_criterion.status IN ('ENABLED', 'PAUSED') "
              // Limits to the 50 keywords with the most impressions in the date range.
              + "ORDER BY metrics.impressions DESC "
              + "LIMIT 50";
      // Constructs the SearchGoogleAdsStreamRequest.
      SearchGoogleAdsStreamRequest request =
          SearchGoogleAdsStreamRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setQuery(searchQuery)
              .build();

      // Creates and issues a search Google Ads stream request that will retrieve all of the
      // requested field values for the keyword.
      ServerStream<SearchGoogleAdsStreamResponse> stream =
          googleAdsServiceClient.searchStreamCallable().call(request);

      // Iterates through the results in the stream response and prints all of the requested
      // field values for the keyword in each row.
      for (SearchGoogleAdsStreamResponse response : stream) {
        for (GoogleAdsRow googleAdsRow : response.getResultsList()) {
          Campaign campaign = googleAdsRow.getCampaign();
          AdGroup adGroup = googleAdsRow.getAdGroup();
          AdGroupCriterion adGroupCriterion = googleAdsRow.getAdGroupCriterion();
          Metrics metrics = googleAdsRow.getMetrics();

          System.out.printf(
              "Keyword text '%s' with "
                  + "match type '%s' "
                  + "and ID %d "
                  + "in ad group '%s' "
                  + "with ID %d "
                  + "in campaign '%s' "
                  + "with ID %d "
                  + "had %d impression(s), "
                  + "%d click(s), "
                  + "and %d cost (in micros) "
                  + "during the last 7 days.%n",
              adGroupCriterion.getKeyword().getText(),
              adGroupCriterion.getKeyword().getMatchType(),
              adGroupCriterion.getCriterionId(),
              adGroup.getName(),
              adGroup.getId(),
              campaign.getName(),
              campaign.getId(),
              metrics.getImpressions(),
              metrics.getClicks(),
              metrics.getCostMicros());
        }
      }
    }
  }
}

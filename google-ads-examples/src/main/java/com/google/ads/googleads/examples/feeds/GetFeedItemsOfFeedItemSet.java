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

package com.google.ads.googleads.examples.feeds;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v14.errors.GoogleAdsError;
import com.google.ads.googleads.v14.errors.GoogleAdsException;
import com.google.ads.googleads.v14.services.GoogleAdsRow;
import com.google.ads.googleads.v14.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v14.services.SearchGoogleAdsStreamRequest;
import com.google.ads.googleads.v14.services.SearchGoogleAdsStreamResponse;
import com.google.ads.googleads.v14.utils.ResourceNames;
import com.google.api.gax.rpc.ServerStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Gets all feed items of the specified feed item set by fetching all feed item set links. To create
 * a new feed item set, run CreateFeedItemSet.java. To link a feed item to a feed item set, run
 * LinkFeedItemSet.java.
 */
public class GetFeedItemsOfFeedItemSet {
  private static class GetFeedItemsOfFeedItemSetParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private long customerId;

    @Parameter(names = ArgumentNames.FEED_ID, required = true)
    private long feedId;

    @Parameter(names = ArgumentNames.FEED_ITEM_SET_ID, required = true)
    private long feedItemSetId;
  }

  public static void main(String[] args) {
    GetFeedItemsOfFeedItemSetParams params = new GetFeedItemsOfFeedItemSetParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.feedId = Long.parseLong("INSERT_FEED_ID_HERE");
      params.feedItemSetId = Long.parseLong("INSERT_FEED_ITEM_SET_ID_HERE");
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
      new GetFeedItemsOfFeedItemSet()
          .runExample(googleAdsClient, params.customerId, params.feedId, params.feedItemSetId);
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
        System.exit(1);
      }
    }
  }

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the customer ID.
   * @param feedId the feed ID.
   * @param feedItemSetId the feed item set ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, long feedId, long feedItemSetId) {
    // Creates a query that retrieves all feed item set links associated with the specified feed
    // item set.
    String query =
        String.format(
            "SELECT feed_item_set_link.feed_item "
                + "FROM feed_item_set_link "
                + "WHERE feed_item_set_link.feed_item_set = '%s'",
            ResourceNames.feedItemSet(customerId, feedId, feedItemSetId));

    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Constructs the SearchGoogleAdsStreamRequest.
      SearchGoogleAdsStreamRequest request =
          SearchGoogleAdsStreamRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setQuery(query)
              .build();

      // Creates and issues a search Google Ads stream request.
      ServerStream<SearchGoogleAdsStreamResponse> stream =
          googleAdsServiceClient.searchStreamCallable().call(request);

      System.out.printf(
          "The feed items with the following resource names are linked with the feed "
              + "item set with ID %d:%n",
          feedItemSetId);

      // Iterates through and prints all of the results in the stream response.
      for (SearchGoogleAdsStreamResponse response : stream) {
        for (GoogleAdsRow googleAdsRow : response.getResultsList()) {
          System.out.printf("%s%n", googleAdsRow.getFeedItemSetLink());
        }
      }
    }
  }
}

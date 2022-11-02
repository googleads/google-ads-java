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

package com.google.ads.googleads.examples.feeds;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v12.errors.GoogleAdsError;
import com.google.ads.googleads.v12.errors.GoogleAdsException;
import com.google.ads.googleads.v12.services.FeedItemOperation;
import com.google.ads.googleads.v12.services.FeedItemServiceClient;
import com.google.ads.googleads.v12.services.MutateFeedItemResult;
import com.google.ads.googleads.v12.services.MutateFeedItemsResponse;
import com.google.ads.googleads.v12.utils.ResourceNames;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Removes feed items from a feed. */
public class RemoveFeedItems {
  private static class RemoveFeedItemsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private long customerId;

    @Parameter(names = ArgumentNames.FEED_ID, required = true)
    private long feedId;

    @Parameter(names = ArgumentNames.FEED_ITEM_IDS, required = true)
    private List<Long> feedItemIds;
  }

  public static void main(String[] args) {
    RemoveFeedItemsParams params = new RemoveFeedItemsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.feedId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.feedItemIds =
          new ArrayList<>(
              Arrays.asList(
                  Long.parseLong("INSERT_FEED_ITEM_1_ID_HERE"),
                  Long.parseLong("INSERT_FEED_ITEM_2_ID_HERE"),
                  Long.parseLong("INSERT_FEED_ITEM_3_ID_HERE")));
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
      new RemoveFeedItems().runExample(googleAdsClient, params);
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
   * @param params the RemoveFeedItemsParams for the example.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, RemoveFeedItemsParams params) {
    List<FeedItemOperation> operations = new ArrayList<>();
    // Creates the remove operations.
    for (long feedItemId : params.feedItemIds) {
      String feedItem = ResourceNames.feedItem(params.customerId, params.feedId, feedItemId);
      FeedItemOperation operation = FeedItemOperation.newBuilder().setRemove(feedItem).build();
      operations.add(operation);
    }

    // Creates the feed item service client.
    try (FeedItemServiceClient feedItemServiceClient =
        googleAdsClient.getLatestVersion().createFeedItemServiceClient()) {
      // Issues the mutate request.
      MutateFeedItemsResponse response =
          feedItemServiceClient.mutateFeedItems(Long.toString(params.customerId), operations);
      for (MutateFeedItemResult result : response.getResultsList()) {
        System.out.printf("Removed feed item with resource name '%s'.%n", result.getResourceName());
      }
    }
  }
}

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
import com.google.ads.googleads.v15.errors.GoogleAdsError;
import com.google.ads.googleads.v15.errors.GoogleAdsException;
import com.google.ads.googleads.v15.resources.FeedItemSetLink;
import com.google.ads.googleads.v15.services.FeedItemSetLinkOperation;
import com.google.ads.googleads.v15.services.FeedItemSetLinkServiceClient;
import com.google.ads.googleads.v15.services.MutateFeedItemSetLinkResult;
import com.google.ads.googleads.v15.services.MutateFeedItemSetLinksResponse;
import com.google.ads.googleads.v15.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Links the specified feed item to the specified feed item set. The specified feed item set must
 * not be created as a dynamic set, i.e., neither {@code dynamicLocationSetFilter} nor {@code
 * dynamicAffiliateLocationSetFilter} should be set. In addition, the feed item must belong to the
 * feed associated with the feed item set.
 */
public class LinkFeedItemSet {
  private static class LinkFeedItemSetParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private long customerId;

    @Parameter(names = ArgumentNames.FEED_ID, required = true)
    private long feedId;

    @Parameter(names = ArgumentNames.FEED_ITEM_SET_ID, required = true)
    private long feedItemSetId;

    @Parameter(names = ArgumentNames.FEED_ITEM_ID, required = true)
    private long feedItemId;
  }

  public static void main(String[] args) {
    LinkFeedItemSetParams params = new LinkFeedItemSetParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.feedId = Long.parseLong("INSERT_FEED_ID_HERE");
      params.feedItemSetId = Long.parseLong("INSERT_FEED_ITEM_SET_ID_HERE");
      params.feedItemId = Long.parseLong("INSERT_FEED_ITEM_ID_HERE");
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
      new LinkFeedItemSet()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.feedId,
              params.feedItemSetId,
              params.feedItemId);
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
   * @param feedItemId the feed item ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long feedId,
      long feedItemSetId,
      long feedItemId) {
    // Creates a new feed item set link that binds the specified feed item set and feed item.
    String feedItemSetResourceName = ResourceNames.feedItemSet(customerId, feedId, feedItemSetId);
    String feedItemResourceName = ResourceNames.feedItem(customerId, feedId, feedItemId);
    FeedItemSetLink feedItemSetLink =
        FeedItemSetLink.newBuilder()
            .setFeedItemSet(feedItemSetResourceName)
            .setFeedItem(feedItemResourceName)
            .build();

    // Constructs a feed item set link operation.
    FeedItemSetLinkOperation feedItemSetLinkOperation =
        FeedItemSetLinkOperation.newBuilder().setCreate(feedItemSetLink).build();

    // Creates the feed item set link service client.
    try (FeedItemSetLinkServiceClient feedItemSetLinkServiceClient =
        googleAdsClient.getLatestVersion().createFeedItemSetLinkServiceClient()) {
      // Issues a mutate request to add the feed item set link on the server.
      MutateFeedItemSetLinksResponse response =
          feedItemSetLinkServiceClient.mutateFeedItemSetLinks(
              Long.toString(customerId), ImmutableList.of(feedItemSetLinkOperation));

      // Prints some information about the created feed item set link.
      for (MutateFeedItemSetLinkResult result : response.getResultsList()) {
        System.out.printf(
            "Created a feed item set link with resource name '%s' that links feed item set '%s' "
                + "to feed item '%s'.%n",
            result.getResourceName(), feedItemSetResourceName, feedItemResourceName);
      }
    }
  }
}

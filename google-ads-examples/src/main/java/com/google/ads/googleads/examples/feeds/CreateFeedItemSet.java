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
import com.google.ads.googleads.examples.utils.CodeSampleHelper;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v6.errors.GoogleAdsError;
import com.google.ads.googleads.v6.errors.GoogleAdsException;
import com.google.ads.googleads.v6.resources.FeedItemSet;
import com.google.ads.googleads.v6.services.FeedItemSetOperation;
import com.google.ads.googleads.v6.services.FeedItemSetServiceClient;
import com.google.ads.googleads.v6.services.MutateFeedItemSetResult;
import com.google.ads.googleads.v6.services.MutateFeedItemSetsResponse;
import com.google.ads.googleads.v6.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Creates a new feed item set for a specified feed, which must belong to either a Google Ads
 * location extension or an affiliate extension. This is equivalent to a "location group" in the
 * Google Ads UI. See https://support.google.com/google-ads/answer/9288588 for more details.
 */
public class CreateFeedItemSet {
  private static class CreateFeedItemSetParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private long customerId;

    @Parameter(names = ArgumentNames.FEED_ID, required = true)
    private long feedId;
  }

  public static void main(String[] args) {
    CreateFeedItemSetParams params = new CreateFeedItemSetParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.feedId = Long.parseLong("INSERT_FEED_ID_HERE");
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
      new CreateFeedItemSet().runExample(googleAdsClient, params.customerId, params.feedId);
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
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long feedId) {
    FeedItemSet.Builder feedItemSetBuilder =
        FeedItemSet.newBuilder()
            .setFeed(ResourceNames.feed(customerId, feedId))
            .setDisplayName("Feed Item Set #" + CodeSampleHelper.getPrintableDatetime());

    // A feed item set can be created as a dynamic set by setting an optional filter field
    // below. If your feed is a location extension, uncomment the code that calls
    // setDynamicLocationSetFilter. If instead your feed is an affiliate extension, uncomment the
    // code that calls setDynamicAffiliateLocationSetFilter.

    // 1) Location extension.
    /*
    feedItemSetBuilder.setDynamicLocationSetFilter(
        DynamicLocationSetFilter.newBuilder()
            // Dynamic location sets support filtering locations based on business name and/or
            // labels. If both are specified, the feed item set will only include locations that
            // satisfy both types of filters.
            .setBusinessNameFilter(
                // Adds a filter for a business name using exact matching.
                BusinessNameFilter.newBuilder()
                    .setBusinessName("INSERT_YOUR_BUSINESS_NAME_HERE")
                    .setFilterType(FeedItemSetStringFilterType.EXACT))
            // Adds a filter by feed item label resource name. If multiple labels are specified,
            // the feed item set will only include feed items with all of the specified labels.
            .addLabels("INSERT_BUSINESS_LABEL_HERE"));
     */

    // 2) Affiliate extension. This snippet adds one chain ID, but you can add a collection of
    // chain IDs using the addAllChainIds() builder method.
    /*
    feedItemSetBuilder.setDynamicAffiliateLocationSetFilter(
        DynamicAffiliateLocationSetFilter.newBuilder()
            .addChainIds(Long.parseLong("INSERT_CHAIN_ID_HERE")));
    */

    // Constructs an operation that will create a new feed item set.
    FeedItemSetOperation operation =
        FeedItemSetOperation.newBuilder().setCreate(feedItemSetBuilder.build()).build();

    // Creates the feed item set service client.
    try (FeedItemSetServiceClient feedItemSetServiceClient =
        googleAdsClient.getLatestVersion().createFeedItemSetServiceClient()) {
      // Issues a mutate request to add the feed item set on the server.
      MutateFeedItemSetsResponse response =
          feedItemSetServiceClient.mutateFeedItemSets(
              Long.toString(customerId), ImmutableList.of(operation));
      for (MutateFeedItemSetResult result : response.getResultsList()) {
        System.out.printf(
            "Created a feed item set with resource name '%s'.%n", result.getResourceName());
      }
    }
  }
}

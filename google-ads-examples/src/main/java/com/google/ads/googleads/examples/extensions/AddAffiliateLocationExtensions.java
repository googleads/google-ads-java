// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.ads.googleads.examples.extensions;

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v6.common.MatchingFunction;
import com.google.ads.googleads.v6.enums.AffiliateLocationFeedRelationshipTypeEnum.AffiliateLocationFeedRelationshipType;
import com.google.ads.googleads.v6.enums.AffiliateLocationPlaceholderFieldEnum.AffiliateLocationPlaceholderField;
import com.google.ads.googleads.v6.enums.FeedOriginEnum.FeedOrigin;
import com.google.ads.googleads.v6.enums.PlaceholderTypeEnum.PlaceholderType;
import com.google.ads.googleads.v6.errors.GoogleAdsError;
import com.google.ads.googleads.v6.errors.GoogleAdsException;
import com.google.ads.googleads.v6.resources.AttributeFieldMapping;
import com.google.ads.googleads.v6.resources.CampaignFeed;
import com.google.ads.googleads.v6.resources.CustomerFeed;
import com.google.ads.googleads.v6.resources.Feed;
import com.google.ads.googleads.v6.resources.Feed.AffiliateLocationFeedData;
import com.google.ads.googleads.v6.resources.FeedMapping;
import com.google.ads.googleads.v6.services.CampaignFeedOperation;
import com.google.ads.googleads.v6.services.CampaignFeedServiceClient;
import com.google.ads.googleads.v6.resources.FeedName;
import com.google.ads.googleads.v6.services.FeedOperation;
import com.google.ads.googleads.v6.services.FeedServiceClient;
import com.google.ads.googleads.v6.services.GoogleAdsRow;
import com.google.ads.googleads.v6.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v6.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v6.services.MutateCampaignFeedsResponse;
import com.google.ads.googleads.v6.services.MutateFeedsResponse;
import com.google.ads.googleads.v6.utils.ResourceNames;
import com.google.api.gax.grpc.GrpcStatusCode;
import com.google.api.gax.rpc.ApiException;
import com.google.common.collect.ImmutableList;
import io.grpc.Status.Code;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Adds a feed that syncs retail addresses for a given retail chain ID and associates the feed with
 * a campaign for serving affiliate location extensions.
 */
public class AddAffiliateLocationExtensions {
  private static final int MAX_FEEDMAPPING_RETRIEVAL_ATTEMPTS = 10;

  private static class AddAffiliateLocationExtensionsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private long campaignId;

    @Parameter(
        names = ArgumentNames.CHAIN_ID,
        description =
            "The retail chain ID. See"
                + " https://developers.google.com/google-ads/api/reference/data/codes-formats#chain-ids"
                + " a complete list of valid retail chain IDs",
        required = true)
    private long chainId;
  }

  public static void main(String[] args) throws IOException {
    AddAffiliateLocationExtensionsParams params = new AddAffiliateLocationExtensionsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
      params.chainId = Long.parseLong("INSERT_CHAIN_ID_HERE");
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
      new AddAffiliateLocationExtensions()
          .runExample(googleAdsClient, params.customerId, params.campaignId, params.chainId);
    } catch (GoogleAdsException gae) {
      // GoogleAdsException is the base class for most exceptions thrown by an API request.
      // Instances of this exception have a message and a GoogleAdsFailure that contains a
      // collection of GoogleAdsErrors that indicate the underlying causes of the
      // GoogleAdsException.
      gae.printStackTrace();
      System.err.printf(
          "Request ID %s failed due to GoogleAdsException. Underlying errors:%n",
          gae.getRequestId());
      int i = 0;
      for (GoogleAdsError googleAdsError : gae.getGoogleAdsFailure().getErrorsList()) {
        System.err.printf("  Error %d: %s%n", i++, googleAdsError);
      }
    }
  }

  /** Runs the example. */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, long campaignId, long chainId) {
    String feedResourceName =
        createAffiliateLocationExtensionFeed(googleAdsClient, customerId, chainId);
    // The feed created above will not be available for use in a campaign feed until the associated
    // feed mappings have been created by Google.
    FeedMapping feedMapping = waitForFeedToBeReady(googleAdsClient, customerId, feedResourceName);
    // Creates the campaign feed now that the feed mappings are ready.
    createCampaignFeed(
        googleAdsClient, customerId, campaignId, feedMapping, feedResourceName, chainId);
  }

  /** Creates an affiliate location extension feed. */
  // [START add_affiliate_location_extensions]
  private String createAffiliateLocationExtensionFeed(
      GoogleAdsClient googleAdsClient, long customerId, long chainId) {
    // Removes all existing location extension feeds. This is an optional step, but is required for
    // this code example to run correctly more than once. This is because:
    //   1. Google Ads only allows one location extension feed per email address.
    //   2. A Google Ads account cannot have a location extension feed and an affiliate
    // location extension feed at the same time.
    removeLocationExtensionFeeds(googleAdsClient, customerId);

    // Creates a feed that will sync to retail addresses for a given retail chain ID.
    // Do not add FeedAttributes to this object as Google Ads will add
    // them automatically because this will be a system generated feed.
    Feed feed =
        Feed.newBuilder()
            .setName("Affiliate Location Extension feed #" + getPrintableDateTime())
            .setAffiliateLocationFeedData(
                AffiliateLocationFeedData.newBuilder()
                    .addChainIds(chainId)
                    .setRelationshipType(AffiliateLocationFeedRelationshipType.GENERAL_RETAILER))
            // Since this feed's contents will be managed by Google,
            // you must set its origin to GOOGLE.
            .setOrigin(FeedOrigin.GOOGLE)
            .build();

    // Constructs an operation to create the feed.
    FeedOperation op = FeedOperation.newBuilder().setCreate(feed).build();

    // Creates the FeedServiceClient.
    try (FeedServiceClient feedService =
        googleAdsClient.getLatestVersion().createFeedServiceClient()) {
      // Issues a mutate request to add the feed.
      MutateFeedsResponse response =
          feedService.mutateFeeds(String.valueOf(customerId), ImmutableList.of(op));

      // Displays the results.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf(
          "Affliate location extension feed created with resource name: %s.%n", resourceName);

      return resourceName;
    }
  }
  // [END add_affiliate_location_extensions]

  /** Removes all location extension feeds. */
  private void removeLocationExtensionFeeds(GoogleAdsClient googleAdsClient, long customerId) {
    // Removes a location extension feed. Does this with the following steps:
    //   1. Retrieves the existing CustomerFeed links.
    //   2. Removes the CustomerFeed so that the location extensions from the feed stop serving.
    //   3. Removes the feed so that Google Ads will no longer sync from the GMB account.
    List<CustomerFeed> oldCustomerFeeds =
        getLocationExtensionCustomerFeeds(googleAdsClient, customerId);
    if (oldCustomerFeeds.isEmpty()) {
      // Optional: You may also want to remove the CampaignFeeds and AdGroupFeeds.
      removeCustomerFeeds(googleAdsClient, customerId, oldCustomerFeeds);
    }
    List<Feed> feeds = getLocationExtensionFeeds(googleAdsClient, customerId);

    if (!feeds.isEmpty()) {
      removeFeeds(googleAdsClient, customerId, feeds);
    }
  }

  /** Creates a CampaignFeed. This links a preexisting {@link Feed} to a campaign. */
  // [START add_affiliate_location_extensions_3]
  private void createCampaignFeed(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long campaignId,
      FeedMapping feedMapping,
      String feedResourceName,
      long chainId) {
    // Gets the attribute ID that is used for the chain ID. This will be used to filter the feed to
    // extract affiliate locations.
    long attributeIdForChainId = getAttributeIdForChainId(feedMapping);

    // Extracts the feed ID.
    long feedId = Long.valueOf(FeedName.parse(feedResourceName).getFeedId());

    // Constructs a matching function string which filters the Feed to extract affiliate locations.
    String matchingFunction =
        String.format("IN(FeedAttribute[%d, %d], %d)", feedId, attributeIdForChainId, chainId);

    // Creates a CampaignFeed object.
    CampaignFeed campaignFeed =
        CampaignFeed.newBuilder()
            .setFeed(feedResourceName)
            .addPlaceholderTypes(PlaceholderType.AFFILIATE_LOCATION)
            .setMatchingFunction(
                MatchingFunction.newBuilder().setFunctionString(matchingFunction).build())
            .setCampaign(ResourceNames.campaign(customerId, campaignId))
            .build();

    // Creates an operation to create the CampaignFeed.
    CampaignFeedOperation operation =
        CampaignFeedOperation.newBuilder().setCreate(campaignFeed).build();

    // Adds a CampaignFeed that associates the feed with this campaign for
    // the AFFILIATE_LOCATION placeholder type.
    try (CampaignFeedServiceClient feedServiceClient =
        googleAdsClient.getLatestVersion().createCampaignFeedServiceClient()) {
      MutateCampaignFeedsResponse response =
          feedServiceClient.mutateCampaignFeeds(
              String.valueOf(customerId), ImmutableList.of(operation));
      System.out.printf(
          "Campaign feed created with resource name: %s.%n",
          response.getResultsList().get(0).getResourceName());
    }
  }
  // [END add_affiliate_location_extensions_3]

  /** Gets the feed item attribute ID that specifies the chain ID. */
  // [START add_affiliate_location_extensions_4]
  private long getAttributeIdForChainId(FeedMapping feedMapping) {
    Optional<AttributeFieldMapping> fieldMapping =
        feedMapping.getAttributeFieldMappingsList().stream()
            .filter(
                m -> m.getAffiliateLocationField() == AffiliateLocationPlaceholderField.CHAIN_ID)
            .findFirst();
    if (!fieldMapping.isPresent()) {
      throw new RuntimeException("Affiliate location field mapping isn't setup correctly");
    }
    return fieldMapping.get().getFeedAttributeId();
  }
  // [END add_affiliate_location_extensions_4]

  /** Removes a list of feeds from the customerID. */
  private void removeFeeds(GoogleAdsClient googleAdsClient, long customerId, List<Feed> feeds) {
    List<FeedOperation> removeOperations =
        feeds.stream()
            .map(f -> FeedOperation.newBuilder().setRemove(f.getResourceName()).build())
            .collect(Collectors.toList());
    try (FeedServiceClient feedServiceClient =
        googleAdsClient.getLatestVersion().createFeedServiceClient()) {
      feedServiceClient.mutateFeeds(String.valueOf(customerId), removeOperations);
    }
  }

  /** Retrieves all location extension feeds from a specified customer ID. */
  private List<Feed> getLocationExtensionFeeds(GoogleAdsClient googleAdsClient, long customerId) {
    String query =
        "SELECT"
            + "  customer_feed.resource_name, "
            + "  customer_feed.feed, "
            + "  customer_feed.status, "
            + "  customer_feed.matching_function.function_string "
            + "FROM"
            + "  customer_feed "
            + "WHERE"
            + "  customer_feed.placeholder_types CONTAINS ANY(LOCATION, AFFILIATE_LOCATION)"
            + "  AND customer_feed.status = ENABLED";

    try (GoogleAdsServiceClient client =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      SearchPagedResponse response = client.search(String.valueOf(customerId), query);

      List<Feed> results = new ArrayList();
      response.iterateAll().forEach(row -> results.add(row.getFeed()));
      return results;
    }
  }

  /** Removes all feeds linked at the customer (global) level. */
  private void removeCustomerFeeds(
      GoogleAdsClient googleAdsClient, long customerId, List<CustomerFeed> oldCustomerFeeds) {
    List<FeedOperation> operations =
        oldCustomerFeeds.stream()
            .map(f -> FeedOperation.newBuilder().setRemove(f.getResourceName()).build())
            .collect(Collectors.toList());
    if (!operations.isEmpty()) {
      try (FeedServiceClient feedServiceClient =
          googleAdsClient.getLatestVersion().createFeedServiceClient()) {
        feedServiceClient.mutateFeeds(String.valueOf(customerId), operations);
      }
    }
  }

  /** Retrieves the location extension feeds linked to a customer ID. */
  private List<CustomerFeed> getLocationExtensionCustomerFeeds(
      GoogleAdsClient googleAdsClient, long customerId) {
    String query =
        "SELECT"
            + "  customer_feed.resource_name, "
            + "  customer_feed.feed, "
            + "  customer_feed.status, "
            + "  customer_feed.matching_function.function_string "
            + "FROM"
            + "  customer_feed "
            + "WHERE"
            + "  customer_feed.placeholder_types CONTAINS ANY(LOCATION, AFFILIATE_LOCATION) "
            + "  AND customer_feed.status = ENABLED";
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      SearchPagedResponse response =
          googleAdsServiceClient.search(String.valueOf(customerId), query);
      List<CustomerFeed> results = new ArrayList();
      response.iterateAll().forEach(row -> results.add(row.getCustomerFeed()));
      return results;
    }
  }

  /** Waits for a feed (identified by it's feedResourceName) to become ready. */
  // [START add_affiliate_location_extensions_2]
  private FeedMapping waitForFeedToBeReady(
      GoogleAdsClient googleAdsServiceClient, long customerId, String feedResourceName) {
    int numAttempts = 0;
    int sleepSeconds = 0;

    // Waits for Google's servers to setup the feed with feed attributes and attribute mapping.
    // This process is asynchronous, so we wait until the feed mapping is created, with exponential
    // backoff.
    while (numAttempts < MAX_FEEDMAPPING_RETRIEVAL_ATTEMPTS) {
      Optional<FeedMapping> feedMapping =
          getFeedMapping(googleAdsServiceClient, customerId, feedResourceName);

      if (feedMapping.isPresent()) {
        System.out.printf("Feed with resource name '%s' is now ready.%n", feedResourceName);
        return feedMapping.get();
      } else {
        numAttempts++;
        sleepSeconds = (int) (5 * Math.pow(2, numAttempts));
        System.out.printf(
            "Checked: %d time(s). Feed is not ready "
                + "yet. Waiting %d seconds before trying again.%n",
            numAttempts, sleepSeconds);
        try {
          Thread.sleep(sleepSeconds * 1000);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
          throw new RuntimeException(e);
        }
      }
    }
    throw new ApiException(
        String.format("Feed is not ready after %d retries.", numAttempts),
        null,
        GrpcStatusCode.of(Code.DEADLINE_EXCEEDED),
        true);
  }
  // [END add_affiliate_location_extensions_2]

  /** Retrieves the {@link FeedMapping} for a given feed. */
  // [START add_affiliate_location_extensions_1]
  private Optional<FeedMapping> getFeedMapping(
      GoogleAdsClient googleAdsServiceClient, long customerId, String feedResourceName) {
    String query =
        String.format(
            "SELECT"
                + "  feed_mapping.resource_name, "
                + "  feed_mapping.attribute_field_mappings, "
                + "  feed_mapping.status "
                + "FROM"
                + "  feed_mapping "
                + "WHERE feed_mapping.feed = '%s'"
                + "  AND feed_mapping.status = ENABLED "
                + "  AND feed_mapping.placeholder_type = AFFILIATE_LOCATION "
                + "LIMIT 1",
            feedResourceName);
    try (GoogleAdsServiceClient client =
        googleAdsServiceClient.getLatestVersion().createGoogleAdsServiceClient()) {
      SearchPagedResponse response = client.search(String.valueOf(customerId), query);
      Iterator<GoogleAdsRow> iterator = response.iterateAll().iterator();
      if (iterator.hasNext()) {
        return Optional.of(iterator.next().getFeedMapping());
      }
      return Optional.empty();
    }
  }
  // [END add_affiliate_location_extensions_1]
}

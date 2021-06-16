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

package com.google.ads.googleads.examples.extensions;

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v8.common.MatchingFunction;
import com.google.ads.googleads.v8.enums.FeedAttributeTypeEnum.FeedAttributeType;
import com.google.ads.googleads.v8.enums.FeedOriginEnum.FeedOrigin;
import com.google.ads.googleads.v8.enums.PlaceholderTypeEnum.PlaceholderType;
import com.google.ads.googleads.v8.enums.SitelinkPlaceholderFieldEnum.SitelinkPlaceholderField;
import com.google.ads.googleads.v8.errors.GoogleAdsError;
import com.google.ads.googleads.v8.errors.GoogleAdsException;
import com.google.ads.googleads.v8.resources.AttributeFieldMapping;
import com.google.ads.googleads.v8.resources.CampaignFeed;
import com.google.ads.googleads.v8.resources.Feed;
import com.google.ads.googleads.v8.resources.FeedAttribute;
import com.google.ads.googleads.v8.resources.FeedItem;
import com.google.ads.googleads.v8.resources.FeedItemAttributeValue;
import com.google.ads.googleads.v8.resources.FeedItemTarget;
import com.google.ads.googleads.v8.resources.FeedMapping;
import com.google.ads.googleads.v8.services.CampaignFeedOperation;
import com.google.ads.googleads.v8.services.CampaignFeedServiceClient;
import com.google.ads.googleads.v8.services.FeedItemOperation;
import com.google.ads.googleads.v8.services.FeedItemServiceClient;
import com.google.ads.googleads.v8.services.FeedItemTargetOperation;
import com.google.ads.googleads.v8.services.FeedItemTargetServiceClient;
import com.google.ads.googleads.v8.services.FeedMappingOperation;
import com.google.ads.googleads.v8.services.FeedMappingServiceClient;
import com.google.ads.googleads.v8.services.FeedOperation;
import com.google.ads.googleads.v8.services.FeedServiceClient;
import com.google.ads.googleads.v8.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v8.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v8.services.MutateCampaignFeedsResponse;
import com.google.ads.googleads.v8.services.MutateFeedItemResult;
import com.google.ads.googleads.v8.services.MutateFeedItemTargetsResponse;
import com.google.ads.googleads.v8.services.MutateFeedItemsResponse;
import com.google.ads.googleads.v8.services.MutateFeedMappingsResponse;
import com.google.ads.googleads.v8.services.MutateFeedsResponse;
import com.google.ads.googleads.v8.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Adds sitelinks to a campaign using feed services. To create a campaign, run AddCampaigns.java.
 */
public class AddSitelinksUsingFeeds {

  private static class AddSitelinksUsingFeedsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID)
    private Long adGroupId;
  }

  public static void main(String[] args) {
    AddSitelinksUsingFeedsParams params = new AddSitelinksUsingFeedsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");

      // Optional: specify an ad group to limit targeting to that ad group.
      params.adGroupId = null;
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
      new AddSitelinksUsingFeeds()
          .runExample(googleAdsClient, params.customerId, params.campaignId, params.adGroupId);
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
   * @param campaignId the campaign ID on which to ad the sitelinks.
   * @param adGroupId the ad group ID on which to ad the sitelinks.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, long campaignId, Long adGroupId) {
    // Creates a feed, which acts as a table to store data.
    Feed feed = createFeed(googleAdsClient, customerId);
    // Creates a feed mapping, which tells Google Ads how to interpret this data to display
    // additional sitelink information on ads.
    createFeedMapping(googleAdsClient, customerId, feed);
    // Creates feed items, which fill out the feed table with data.
    List<String> feedItems = createFeedItems(googleAdsClient, customerId, feed);
    // Creates a campaign feed, which tells Google Ads which campaigns to use the provided data
    // with.
    createCampaignFeed(googleAdsClient, customerId, feed, campaignId);
    // If an ad group is specified, limits targeting only to the given ad group.
    if (adGroupId != null) {
      createAdGroupTargeting(
          googleAdsClient, customerId, feed.getResourceName(), feedItems, adGroupId);
    }
  }

  /**
   * Creates a feed, which acts as a table to store data.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @return the newly created feed.
   */
  private Feed createFeed(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates the feed.
    Feed feed =
        Feed.newBuilder()
            .setName("Sitelinks Feed #" + getPrintableDateTime())
            .setOrigin(FeedOrigin.USER)
            // Specifies the column name and data type. This is just raw data at this point
            // and not yet linked to any particular purpose. The names are used to help us
            // remember what they are intended for later.
            .addAllAttributes(
                ImmutableList.of(
                    FeedAttribute.newBuilder()
                        .setName("Link Text")
                        .setType(FeedAttributeType.STRING)
                        .build(),
                    FeedAttribute.newBuilder()
                        .setName("Link Final URL")
                        .setType(FeedAttributeType.URL_LIST)
                        .build(),
                    FeedAttribute.newBuilder()
                        .setName("Line 1")
                        .setType(FeedAttributeType.STRING)
                        .build(),
                    FeedAttribute.newBuilder()
                        .setName("Line 2")
                        .setType(FeedAttributeType.STRING)
                        .build()))
            .build();

    // Creates the operation.
    FeedOperation operation = FeedOperation.newBuilder().setCreate(feed).build();

    // Creates the service client.
    try (FeedServiceClient feedServiceClient =
        googleAdsClient.getLatestVersion().createFeedServiceClient()) {
      // Adds the feed.
      MutateFeedsResponse response =
          feedServiceClient.mutateFeeds(Long.toString(customerId), ImmutableList.of(operation));
      String feedResourceName = response.getResults(0).getResourceName();
      System.out.printf("Created feed with resource name '%s'.%n", feedResourceName);

      // After we create the feed, we need to fetch it so we can use its resource name and attribute
      // information to create feed mappings and populate feed items.
      // Creates a search query to obtain the needed feed information.
      String query =
          String.format(
              "SELECT feed.resource_name, feed.attributes FROM feed WHERE feed.resource_name ="
                  + " '%s'",
              feedResourceName);
      // Creates the service client.
      try (GoogleAdsServiceClient googleAdsServiceClient =
          googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
        // Issues the search request and returns the feed.
        SearchPagedResponse searchPagedResponse =
            googleAdsServiceClient.search(Long.toString(customerId), query);
        return searchPagedResponse.getPage().getResponse().getResults(0).getFeed();
      }
    }
  }

  /**
   * Creates a feed mapping, which tells Google Ads how to interpret this data to display additional
   * sitelink information on ads.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param feed the feed to which the mapping is being applied.
   */
  private void createFeedMapping(GoogleAdsClient googleAdsClient, long customerId, Feed feed) {
    // Creates the feed mapping builder.
    FeedMapping.Builder feedMapping =
        FeedMapping.newBuilder()
            .setPlaceholderType(PlaceholderType.SITELINK)
            .setFeed(feed.getResourceName());

    // Adds the attribute field mappings to the feed mapping.
    SitelinkPlaceholderField sitelinkPlaceholderField;
    for (FeedAttribute feedAttribute : feed.getAttributesList()) {
      switch (feedAttribute.getName()) {
        case "Link Text":
          sitelinkPlaceholderField = SitelinkPlaceholderField.TEXT;
          break;
        case "Link Final URL":
          sitelinkPlaceholderField = SitelinkPlaceholderField.FINAL_URLS;
          break;
        case "Line 1":
          sitelinkPlaceholderField = SitelinkPlaceholderField.LINE_1;
          break;
        case "Line 2":
          sitelinkPlaceholderField = SitelinkPlaceholderField.LINE_2;
          break;
        default:
          throw new Error("Invalid attribute name.");
      }
      feedMapping.addAttributeFieldMappings(
          AttributeFieldMapping.newBuilder()
              .setFeedAttributeId(feedAttribute.getId())
              .setSitelinkField(sitelinkPlaceholderField)
              .build());
    }

    // Creates the operation.
    FeedMappingOperation operation =
        FeedMappingOperation.newBuilder().setCreate(feedMapping.build()).build();

    // Creates the service client.
    try (FeedMappingServiceClient feedMappingServiceClient =
        googleAdsClient.getLatestVersion().createFeedMappingServiceClient()) {
      // Adds the feed mapping and prints the result.
      MutateFeedMappingsResponse response =
          feedMappingServiceClient.mutateFeedMappings(
              Long.toString(customerId), ImmutableList.of(operation));
      System.out.printf("Created feed mapping: '%s'.%n", response.getResults(0).getResourceName());
    }
  }

  /**
   * Creates feed items, which fill out the feed table with data.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param feed the feed to which the feed items are being added.
   * @return the list of added feed items.
   */
  private List<String> createFeedItems(
      GoogleAdsClient googleAdsClient, long customerId, Feed feed) {
    List<FeedItemOperation> operations = new ArrayList<>();
    operations.add(
        createFeedItemOperation(feed, "Home", "http://example.com", "Home line 1", "Home line 2"));
    operations.add(
        createFeedItemOperation(
            feed, "Stores", "http://example.com/stores", "Stores line 1", "Stores line 2"));
    operations.add(
        createFeedItemOperation(
            feed, "On Sale", "http://example.com/sale", "On Sale line 1", "On Sale line 2"));
    operations.add(
        createFeedItemOperation(
            feed, "Support", "http://example.com/support", "Support line 1", "Support line 2"));
    operations.add(
        createFeedItemOperation(
            feed, "Products", "http://example.com/products", "Products line 1", "Products line 2"));
    operations.add(
        createFeedItemOperation(
            feed, "About Us", "http://example.com/about", "About Us line 1", "About Us line 2"));

    // Creates the service client.
    try (FeedItemServiceClient feedItemServiceClient =
        googleAdsClient.getLatestVersion().createFeedItemServiceClient()) {
      // Adds the feed items and prints the result.
      MutateFeedItemsResponse response =
          feedItemServiceClient.mutateFeedItems(Long.toString(customerId), operations);
      System.out.println("Created the following feed items:");
      List<String> feedItems = new ArrayList<>();
      for (MutateFeedItemResult result : response.getResultsList()) {
        String feedItemResourceName = result.getResourceName();
        System.out.println(feedItemResourceName);
        feedItems.add(feedItemResourceName);
      }
      return feedItems;
    }
  }

  /**
   * Creates a feed item operation provided attributes of a feed item.
   *
   * @param feed the feed for which the operations are being created.
   * @param linkText the link text of the feed item.
   * @param finalUrl the final url of the feed item.
   * @param line1 line 1 of the feed item.
   * @param line2 line 2 of the feed item.
   * @return FeedItemOperation.
   */
  private FeedItemOperation createFeedItemOperation(
      Feed feed, String linkText, String finalUrl, String line1, String line2) {
    // Creates a feed item.
    FeedItem.Builder feedItem = FeedItem.newBuilder().setFeed(feed.getResourceName());

    // Adds the attributes to the feed item.
    String stringValue;
    for (FeedAttribute feedAttribute : feed.getAttributesList()) {
      switch (feedAttribute.getName()) {
        case "Link Text":
          stringValue = linkText;
          break;
        case "Link Final URL":
          stringValue = finalUrl;
          break;
        case "Line 1":
          stringValue = line1;
          break;
        case "Line 2":
          stringValue = line2;
          break;
        default:
          throw new Error("Invalid attribute name.");
      }
      feedItem.addAttributeValues(
          FeedItemAttributeValue.newBuilder()
              .setFeedAttributeId(feedAttribute.getId())
              // This field will be ignored when the feed item attribute is a list of strings (i.e.
              // FINAL_URLS).
              .setStringValue(stringValue)
              // This field will be ignored when the feed item attribute is not a list of strings
              // (i.e. all fields other than FINAL_URLS).
              .addAllStringValues(ImmutableList.of(stringValue))
              .build());
    }
    return FeedItemOperation.newBuilder().setCreate(feedItem.build()).build();
  }

  /**
   * Creates a campaign feed, which tells Google Ads which campaigns to use the provided data with.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param feed the feed being used for the campaign feed.
   * @param campaignId the campaign ID.
   */
  private void createCampaignFeed(
      GoogleAdsClient googleAdsClient, long customerId, Feed feed, long campaignId) {
    // Creates a comma separated list of feed attribute IDs for the matching function.
    List<String> feedAttributesIds =
        feed.getAttributesList().stream()
            .map(feedAttribute -> String.valueOf(feedAttribute.getId()))
            .collect(Collectors.toList());
    String feedAttributesString = String.join( ",", feedAttributesIds);

    // Creates the campaign feed.
    CampaignFeed campaignFeed =
        CampaignFeed.newBuilder()
            .addPlaceholderTypes(PlaceholderType.SITELINK)
            .setFeed(feed.getResourceName())
            .setCampaign(ResourceNames.campaign(customerId, campaignId))
            .setMatchingFunction(
                MatchingFunction.newBuilder()
                    .setFunctionString(
                        String.format(
                            "AND(IN(FEED_ITEM_ID,{ %s }),EQUALS(CONTEXT.DEVICE,'Mobile'))",
                            feedAttributesString))
                    .build())
            .build();

    // Creates the operation.
    CampaignFeedOperation operation =
        CampaignFeedOperation.newBuilder().setCreate(campaignFeed).build();

    // Creates the service client.
    try (CampaignFeedServiceClient campaignFeedServiceClient =
        googleAdsClient.getLatestVersion().createCampaignFeedServiceClient()) {
      // Adds the campaign feed and prints the result.
      MutateCampaignFeedsResponse response =
          campaignFeedServiceClient.mutateCampaignFeeds(
              Long.toString(customerId), ImmutableList.of(operation));
      System.out.printf("Created campaign feed '%s'.%n", response.getResults(0).getResourceName());
    }
  }

  /**
   * limits targeting only to the given ad group.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param feedResourceName the resource name of the feed for which the targeting is being applied.
   * @param feedItems the feed items that were added to the feed.
   * @param adGroupId the ad group ID being targeted.
   */
  private void createAdGroupTargeting(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String feedResourceName,
      List<String> feedItems,
      long adGroupId) {
    // Creates the feed item target.
    FeedItemTarget feedItemTarget =
        FeedItemTarget.newBuilder()
            // You must set targeting on a per-feed-item basis. This will restrict the
            // first feed item we added to only serve for the given ad group.
            .setFeedItem(feedItems.get(0))
            .setAdGroup(ResourceNames.adGroup(customerId, adGroupId))
            .build();

    // Adds the operation.
    FeedItemTargetOperation operation =
        FeedItemTargetOperation.newBuilder().setCreate(feedItemTarget).build();

    // Creates the service client.
    try (FeedItemTargetServiceClient feedItemTargetServiceClient =
        googleAdsClient.getLatestVersion().createFeedItemTargetServiceClient()) {
      // Adds the feed item target and prints the result.
      MutateFeedItemTargetsResponse response =
          feedItemTargetServiceClient.mutateFeedItemTargets(
              Long.toString(customerId), ImmutableList.of(operation));
      System.out.printf(
          "Created feed item target '%s' for feed item '%s'.%n",
          response.getResults(0).getResourceName(), feedResourceName);
    }
  }
}

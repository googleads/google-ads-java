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

package com.google.ads.googleads.examples.advancedoperations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v1.enums.FeedAttributeTypeEnum.FeedAttributeType;
import com.google.ads.googleads.v1.enums.PlaceholderTypeEnum.PlaceholderType;
import com.google.ads.googleads.v1.enums.RealEstatePlaceholderFieldEnum.RealEstatePlaceholderField;
import com.google.ads.googleads.v1.errors.GoogleAdsError;
import com.google.ads.googleads.v1.errors.GoogleAdsException;
import com.google.ads.googleads.v1.resources.AttributeFieldMapping;
import com.google.ads.googleads.v1.resources.Feed;
import com.google.ads.googleads.v1.resources.FeedAttribute;
import com.google.ads.googleads.v1.resources.FeedItem;
import com.google.ads.googleads.v1.resources.FeedItemAttributeValue;
import com.google.ads.googleads.v1.resources.FeedMapping;
import com.google.ads.googleads.v1.services.FeedItemOperation;
import com.google.ads.googleads.v1.services.FeedItemServiceClient;
import com.google.ads.googleads.v1.services.FeedMappingOperation;
import com.google.ads.googleads.v1.services.FeedMappingServiceClient;
import com.google.ads.googleads.v1.services.FeedOperation;
import com.google.ads.googleads.v1.services.FeedServiceClient;
import com.google.ads.googleads.v1.services.GoogleAdsRow;
import com.google.ads.googleads.v1.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v1.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v1.services.MutateFeedItemResult;
import com.google.ads.googleads.v1.services.MutateFeedItemsResponse;
import com.google.ads.googleads.v1.services.MutateFeedMappingResult;
import com.google.ads.googleads.v1.services.MutateFeedMappingsResponse;
import com.google.ads.googleads.v1.services.MutateFeedsResponse;
import com.google.ads.googleads.v1.services.SearchGoogleAdsRequest;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddRealEstateFeed {
  private static final int PAGE_SIZE = 1_000;

  private static class AddRealEstateFeedParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private long customerId;
  }

  public static void main(String[] args) {
    AddRealEstateFeedParams params = new AddRealEstateFeedParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
    }

    GoogleAdsClient googleAdsClient;
    try {
      googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
          "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      return;
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      return;
    }

    try {
      new AddRealEstateFeed().runExample(googleAdsClient, params.customerId);
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
    }
  }

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID in which to create criterion.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    // Gets the page feed details. This code example creates a new feed, but you can
    // fetch and re-use an existing feed.
    String feedResourceName = createFeed(googleAdsClient, customerId);
    Map<RealEstatePlaceholderField, FeedAttribute> feedAttributes =
        getFeed(googleAdsClient, customerId, feedResourceName);
    createFeedMapping(googleAdsClient, customerId, feedAttributes, feedResourceName);
    createFeedItems(googleAdsClient, customerId, feedAttributes, feedResourceName);
    removeFeedItems(googleAdsClient, customerId);
  }

  /**
   * Creates a feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID in which to create criterion.
   * @return a String of the feed resource name.
   */
  private String createFeed(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates a Listing ID attribute.
    FeedAttribute listingIdAttribute =
        FeedAttribute.newBuilder()
            .setType(FeedAttributeType.STRING)
            .setName(StringValue.of("Listing ID"))
            .build();

    // Creates a Listing Name attribute.
    FeedAttribute listingNameAttribute =
        FeedAttribute.newBuilder()
            .setType(FeedAttributeType.STRING)
            .setName(StringValue.of("Listing Name"))
            .build();

    // Creates a Final URLs attribute.
    FeedAttribute finalUrlsAttribute =
        FeedAttribute.newBuilder()
            .setType(FeedAttributeType.URL_LIST)
            .setName(StringValue.of("Final URLs"))
            .build();

    // Creates an Image URL attribute
    FeedAttribute imageUrlAttribute =
        FeedAttribute.newBuilder()
            .setType(FeedAttributeType.URL)
            .setName(StringValue.of("Image URL"))
            .build();

    // Creates an Contextual Keywords attribute
    FeedAttribute contextualKeywordsAttribute =
        FeedAttribute.newBuilder()
            .setType(FeedAttributeType.STRING_LIST)
            .setName(StringValue.of("Contextual Keywords"))
            .build();

    // Creates the feed.
    Feed feed =
        Feed.newBuilder()
            .setName(StringValue.of("Real Estate Feed #" + System.currentTimeMillis()))
            .addAttributes(listingIdAttribute)
            .addAttributes(listingNameAttribute)
            .addAttributes(finalUrlsAttribute)
            .addAttributes(imageUrlAttribute)
            .addAttributes(contextualKeywordsAttribute)
            .build();

    // Creates the operation.
    FeedOperation operation = FeedOperation.newBuilder().setCreate(feed).build();

    // Creates the feed service client.
    try (FeedServiceClient feedServiceClient =
        googleAdsClient.getLatestVersion().createFeedServiceClient()) {
      // Adds the feed.
      MutateFeedsResponse response =
          feedServiceClient.mutateFeeds(String.valueOf(customerId), ImmutableList.of(operation));
      String feedResourceName = response.getResults(0).getResourceName();
      // Displays the result.
      System.out.printf("Feed with resource name '%s' was created.%n", feedResourceName);
      return feedResourceName;
    }
  }

  /**
   * Retrieves details about a feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID in which to create criterion.
   * @param feedResourceName the resource name of the feed.
   * @return a Map containing the DsaPageFeedCriterionField and FeedAttribute.
   */
  private Map<RealEstatePlaceholderField, FeedAttribute> getFeed(
      GoogleAdsClient googleAdsClient, long customerId, String feedResourceName) {
    // Constructs the query.
    String query =
        "SELECT feed.attributes FROM feed WHERE feed.resource_name = '" + feedResourceName + "'";

    // Constructs the request.
    SearchGoogleAdsRequest request =
        SearchGoogleAdsRequest.newBuilder()
            .setCustomerId(String.valueOf(customerId))
            .setPageSize(PAGE_SIZE)
            .setQuery(query)
            .build();

    // Issues the search request.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);
      // Gets the first result because we only need the single feed item we created previously.
      GoogleAdsRow googleAdsRow = searchPagedResponse.getPage().getResponse().getResults(0);
      // Gets the attributes list from the feed and creates a map with keys of each attribute and
      // values of each corresponding ID.
      List<FeedAttribute> feedAttributeList = googleAdsRow.getFeed().getAttributesList();
      Map<String, Long> feedAttributeMap = new HashMap<>();
      for (FeedAttribute feedAttribute : feedAttributeList) {
        feedAttributeMap.put(feedAttribute.getName().getValue(), feedAttribute.getId().getValue());
      }

      // Creates a map to return.
      Map<RealEstatePlaceholderField, FeedAttribute> feedAttributes = new HashMap<>();

      String listingIdName = "Listing ID";
      // Creates a FeedAttribute for the Listing ID.
      FeedAttribute listingIdAttribute =
          FeedAttribute.newBuilder()
              .setId(Int64Value.of(feedAttributeMap.get(listingIdName)))
              .setName(StringValue.of(listingIdName))
              .setType(FeedAttributeType.STRING)
              .build();

      // Adds the Listing ID attribute to the map.
      feedAttributes.put(RealEstatePlaceholderField.LISTING_ID, listingIdAttribute);

      String listingNameName = "Listing Name";
      // Creates a FeedAttribute for the Listing Name.
      FeedAttribute listingNameAttribute =
          FeedAttribute.newBuilder()
              .setId(Int64Value.of(feedAttributeMap.get(listingNameName)))
              .setName(StringValue.of(listingNameName))
              .setType(FeedAttributeType.STRING)
              .build();

      // Adds the Listing Name attribute to the map.
      feedAttributes.put(RealEstatePlaceholderField.LISTING_NAME, listingNameAttribute);

      String finalUrlsName = "Final URLs";
      // Creates a FeedAttribute for the Final URLs.
      FeedAttribute finalUrlsAttribute =
          FeedAttribute.newBuilder()
              .setId(Int64Value.of(feedAttributeMap.get(finalUrlsName)))
              .setName(StringValue.of(finalUrlsName))
              .setType(FeedAttributeType.URL_LIST)
              .build();

      // Adds the Listing Name attribute to the map.
      feedAttributes.put(RealEstatePlaceholderField.FINAL_URLS, finalUrlsAttribute);

      String ImageUrlName = "Image URL";
      // Creates a FeedAttribute for the Final URLs.
      FeedAttribute ImageUrlAttribute =
          FeedAttribute.newBuilder()
              .setId(Int64Value.of(feedAttributeMap.get(ImageUrlName)))
              .setName(StringValue.of(ImageUrlName))
              .setType(FeedAttributeType.URL)
              .build();

      // Adds the Listing Name attribute to the map.
      feedAttributes.put(RealEstatePlaceholderField.IMAGE_URL, ImageUrlAttribute);

      String contextualKeywordsName = "Contextual Keywords";
      // Creates a FeedAttribute for the Final URLs.
      FeedAttribute contextualKeywordsAttribute =
          FeedAttribute.newBuilder()
              .setId(Int64Value.of(feedAttributeMap.get(contextualKeywordsName)))
              .setName(StringValue.of(contextualKeywordsName))
              .setType(FeedAttributeType.STRING_LIST)
              .build();

      // Adds the Listing Name attribute to the map.
      feedAttributes.put(
          RealEstatePlaceholderField.CONTEXTUAL_KEYWORDS, contextualKeywordsAttribute);

      return feedAttributes;
    }
  }

  /**
   * Creates a feed mapping for a given feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID in which to create criterion.
   * @param feedAttributes the feed attributes.
   * @param feedResourceName the feed resource name.
   */
  private void createFeedMapping(
      GoogleAdsClient googleAdsClient,
      long customerId,
      Map<RealEstatePlaceholderField, FeedAttribute> feedAttributes,
      String feedResourceName) {
    // Maps the FeedAttributeIds to the fieldId constants.
    AttributeFieldMapping listingIdMapping =
        AttributeFieldMapping.newBuilder()
            .setFeedAttributeId(
                Int64Value.of(
                    feedAttributes.get(RealEstatePlaceholderField.LISTING_ID).getId().getValue()))
            .setRealEstateField(RealEstatePlaceholderField.LISTING_ID)
            .build();
    AttributeFieldMapping listingNameMapping =
        AttributeFieldMapping.newBuilder()
            .setFeedAttributeId(
                Int64Value.of(
                    feedAttributes.get(RealEstatePlaceholderField.LISTING_NAME).getId().getValue()))
            .setRealEstateField(RealEstatePlaceholderField.LISTING_NAME)
            .build();
    AttributeFieldMapping finalUrlsMapping =
        AttributeFieldMapping.newBuilder()
            .setFeedAttributeId(
                Int64Value.of(
                    feedAttributes.get(RealEstatePlaceholderField.FINAL_URLS).getId().getValue()))
            .setRealEstateField(RealEstatePlaceholderField.FINAL_URLS)
            .build();
    AttributeFieldMapping imageUrlMapping =
        AttributeFieldMapping.newBuilder()
            .setFeedAttributeId(
                Int64Value.of(
                    feedAttributes.get(RealEstatePlaceholderField.IMAGE_URL).getId().getValue()))
            .setRealEstateField(RealEstatePlaceholderField.IMAGE_URL)
            .build();
    AttributeFieldMapping contextualKeywordsMapping =
        AttributeFieldMapping.newBuilder()
            .setFeedAttributeId(
                Int64Value.of(
                    feedAttributes
                        .get(RealEstatePlaceholderField.CONTEXTUAL_KEYWORDS)
                        .getId()
                        .getValue()))
            .setRealEstateField(RealEstatePlaceholderField.CONTEXTUAL_KEYWORDS)
            .build();

    // Creates the feed mapping.
    FeedMapping feedMapping =
        FeedMapping.newBuilder()
            .setPlaceholderType(PlaceholderType.DYNAMIC_REAL_ESTATE)
            .setFeed(StringValue.of(feedResourceName))
            .addAttributeFieldMappings(listingIdMapping)
            .addAttributeFieldMappings(listingNameMapping)
            .addAttributeFieldMappings(finalUrlsMapping)
            .addAttributeFieldMappings(imageUrlMapping)
            .addAttributeFieldMappings(contextualKeywordsMapping)
            .build();

    // Creates the operation.
    FeedMappingOperation operation =
        FeedMappingOperation.newBuilder().setCreate(feedMapping).build();

    // Adds the FeedMapping.
    try (FeedMappingServiceClient feedMappingServiceClient =
        googleAdsClient.getLatestVersion().createFeedMappingServiceClient()) {
      MutateFeedMappingsResponse response =
          feedMappingServiceClient.mutateFeedMappings(
              Long.toString(customerId), ImmutableList.of(operation));

      // Displays the results.
      for (MutateFeedMappingResult result : response.getResultsList()) {
        System.out.printf(
            "Created feed mapping with resource name '%s'.%n", result.getResourceName());
      }
    }
  }

  /**
   * Adds the new items to the feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID in which to create criterion.
   * @param feedAttributes the feed attributes.
   * @param feedResourceName the feed resource name.
   */
  private void createFeedItems(
      GoogleAdsClient googleAdsClient,
      long customerId,
      Map<RealEstatePlaceholderField, FeedAttribute> feedAttributes,
      String feedResourceName) {

    // Creates the listing ID feed attribute value.
    FeedItemAttributeValue listingId =
        FeedItemAttributeValue.newBuilder()
            .setFeedAttributeId(
                Int64Value.of(
                    feedAttributes.get(RealEstatePlaceholderField.LISTING_ID).getId().getValue()))
            .setStringValue(StringValue.of("ABC123DEF"))
            .build();
    // Creates the listing name feed attribute value.
    FeedItemAttributeValue listingName =
        FeedItemAttributeValue.newBuilder()
            .setFeedAttributeId(
                Int64Value.of(
                    feedAttributes.get(RealEstatePlaceholderField.LISTING_NAME).getId().getValue()))
            .setStringValue(StringValue.of("Two bedroom with magnificent views"))
            .build();
    // Creates the final URLs feed attribute value.
    FeedItemAttributeValue finalUrls =
        FeedItemAttributeValue.newBuilder()
            .setFeedAttributeId(
                Int64Value.of(
                    feedAttributes.get(RealEstatePlaceholderField.FINAL_URLS).getId().getValue()))
            .addStringValues(StringValue.of("http://www.example.com/listings/"))
            .build();

    // Optionally insert additional attributes here, such as address, city, description, etc.

    // Creates the image URL feed attribute value.
    FeedItemAttributeValue imageUrl =
        FeedItemAttributeValue.newBuilder()
            .setFeedAttributeId(
                Int64Value.of(
                    feedAttributes.get(RealEstatePlaceholderField.IMAGE_URL).getId().getValue()))
            .setStringValue(
                StringValue.of("http://www.example.com/listings/images?listing_id=ABC123DEF"))
            .build();
    // Creates the contextual keywords feed attribute value.
    FeedItemAttributeValue finalUrl =
        FeedItemAttributeValue.newBuilder()
            .setFeedAttributeId(
                Int64Value.of(
                    feedAttributes
                        .get(RealEstatePlaceholderField.CONTEXTUAL_KEYWORDS)
                        .getId()
                        .getValue()))
            .addStringValues(StringValue.of("beach community"))
            .addStringValues(StringValue.of("ocean view"))
            .addStringValues(StringValue.of("two bedroom"))
            .build();

    // Creates the FeedItem, specifying the Feed ID and the attributes created above.
    FeedItem feedItem =
        FeedItem.newBuilder()
            .setFeed(StringValue.of(feedResourceName))
            .addAttributeValues(listingId)
            .addAttributeValues(listingName)
            .addAttributeValues(finalUrls)
            // Optionally include additional attributes.
            .addAttributeValues(imageUrl)
            .addAttributeValues(finalUrl)
            .build();

    // Creates an operation to add the FeedItem. You can include multiple feed items in a single
    // operation.
    FeedItemOperation operation = FeedItemOperation.newBuilder().setCreate(feedItem).build();
    // Creates the feed item service client.
    try (FeedItemServiceClient feedItemServiceClient =
        googleAdsClient.getLatestVersion().createFeedItemServiceClient()) {
      // Adds the feed items.
      MutateFeedItemsResponse response =
          feedItemServiceClient.mutateFeedItems(
              Long.toString(customerId), ImmutableList.of(operation));
      for (MutateFeedItemResult result : response.getResultsList()) {
        System.out.printf("Created feed item with resource name '%s'.%n", result.getResourceName());
      }
    }
  }

  /**
   * Removes items from the feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID in which to create criterion.
   */
  private void removeFeedItems(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates list of feed item resource names to remove.
    List<String> feedItems =
        new ArrayList<>(
            Arrays.asList(
                // feed item 1 resource name,
                // feed item 2 resource name,
                // feed item 3 resource name,
                ));

    List<FeedItemOperation> operations = new ArrayList<>();
    // Creates the remove operations.
    for (String feedItem : feedItems) {
      FeedItemOperation operation = FeedItemOperation.newBuilder().setRemove(feedItem).build();
      operations.add(operation);
    }

    // Creates the feed item service client.
    try (FeedItemServiceClient feedItemServiceClient =
        googleAdsClient.getLatestVersion().createFeedItemServiceClient()) {
      // Issues the mutate request.
      MutateFeedItemsResponse response =
          feedItemServiceClient.mutateFeedItems(Long.toString(customerId), operations);
      for (MutateFeedItemResult result : response.getResultsList()) {
        System.out.printf("Removed feed item with resource name '%s'.%n", result.getResourceName());
      }
    }
  }
}

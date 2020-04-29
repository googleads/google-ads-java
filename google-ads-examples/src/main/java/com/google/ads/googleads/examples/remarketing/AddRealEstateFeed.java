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

package com.google.ads.googleads.examples.remarketing;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v3.enums.FeedAttributeTypeEnum.FeedAttributeType;
import com.google.ads.googleads.v3.enums.PlaceholderTypeEnum.PlaceholderType;
import com.google.ads.googleads.v3.enums.RealEstatePlaceholderFieldEnum.RealEstatePlaceholderField;
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.ads.googleads.v3.resources.AttributeFieldMapping;
import com.google.ads.googleads.v3.resources.Feed;
import com.google.ads.googleads.v3.resources.FeedAttribute;
import com.google.ads.googleads.v3.resources.FeedItem;
import com.google.ads.googleads.v3.resources.FeedItemAttributeValue;
import com.google.ads.googleads.v3.resources.FeedMapping;
import com.google.ads.googleads.v3.services.FeedItemOperation;
import com.google.ads.googleads.v3.services.FeedItemServiceClient;
import com.google.ads.googleads.v3.services.FeedMappingOperation;
import com.google.ads.googleads.v3.services.FeedMappingServiceClient;
import com.google.ads.googleads.v3.services.FeedOperation;
import com.google.ads.googleads.v3.services.FeedServiceClient;
import com.google.ads.googleads.v3.services.GoogleAdsRow;
import com.google.ads.googleads.v3.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v3.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v3.services.MutateFeedItemResult;
import com.google.ads.googleads.v3.services.MutateFeedItemsResponse;
import com.google.ads.googleads.v3.services.MutateFeedMappingResult;
import com.google.ads.googleads.v3.services.MutateFeedMappingsResponse;
import com.google.ads.googleads.v3.services.MutateFeedsResponse;
import com.google.ads.googleads.v3.services.SearchGoogleAdsRequest;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Adds a real estate feed, creates the feed mapping, and adds items to the feed. */
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
      new AddRealEstateFeed().runExample(googleAdsClient, params);
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
   * @param params the AddRealEstateFeedParams for the example.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, AddRealEstateFeedParams params) {
    // Creates a new feed, but you can fetch and re-use an existing feed by skipping the
    // createFeed method and inserting the feed resource name of the existing feed into the
    // getFeed method.
    String feedResourceName = createFeed(googleAdsClient, params.customerId);
    // Gets the page feed details.
    Map<RealEstatePlaceholderField, FeedAttribute> feedAttributes =
        getFeed(googleAdsClient, params.customerId, feedResourceName);
    // Creates the feed mapping.
    createFeedMapping(googleAdsClient, params.customerId, feedAttributes, feedResourceName);
    // Creates feed items and adds them to the feed.
    createFeedItems(googleAdsClient, params.customerId, feedAttributes, feedResourceName);
  }

  /**
   * Creates a feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
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

    // Creates a Contextual Keywords attribute
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
   * Retrieves details about a feed. The initial query retrieves the FeedAttributes, or columns, of
   * the feed. Each FeedAttribute will also include the FeedAttributeId, which will be used in a
   * subsequent step. The example then inserts a new key, value pair into a map for each
   * FeedAttribute, which is the return value of the method. The keys are the placeholder types
   * that the columns will be. The values are the FeedAttributes.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param feedResourceName the resource name of the feed.
   * @return a Map containing the RealEstatePlaceholderField and FeedAttribute.
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
      // Creates a map to return.
      Map<RealEstatePlaceholderField, FeedAttribute> feedAttributes = new HashMap<>();
      // Loops through each of the feed attributes and populates the map.
      for (FeedAttribute feedAttribute : feedAttributeList) {
        switch(feedAttribute.getName().getValue()) {
          case "Listing ID":
            feedAttributes.put(RealEstatePlaceholderField.LISTING_ID, feedAttribute);
            break;
          case "Listing Name":
          feedAttributes.put(RealEstatePlaceholderField.LISTING_NAME, feedAttribute);
            break;
          case "Final URLs":
          feedAttributes.put(RealEstatePlaceholderField.FINAL_URLS, feedAttribute);
            break;
          case "Image URL":
          feedAttributes.put(RealEstatePlaceholderField.IMAGE_URL, feedAttribute);
            break;
          case "Contextual Keywords":
          feedAttributes.put(RealEstatePlaceholderField.CONTEXTUAL_KEYWORDS, feedAttribute);
            break;
          // Optionally add other RealEstatePlaceholderFields.
          default:
            throw new Error("Invalid attribute name.");
        }
      }
      return feedAttributes;
    }
  }

  /**
   * Creates a feed mapping for a given feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param feedAttributes the feed attributes.
   * @param feedResourceName the feed resource name.
   */
  private void createFeedMapping(
      GoogleAdsClient googleAdsClient,
      long customerId,
      Map<RealEstatePlaceholderField, FeedAttribute> feedAttributes,
      String feedResourceName) {
    // Maps the FeedAttributeIds to the placeholder values. The FeedAttributeId is the ID of the
    // FeedAttribute created in the createdFeed method. This can be thought of as the generic ID of
    // the column of the new feed. The placeholder value specifies the type of column this is in
    // the context of a real estate feed (e.g. a LISTING_ID or LISTING_NAME). The FeedMapping
    // associates the feed column by ID to this type and controls how the feed attributes are
    // presented in dynamic content.
    // See https://developers.google.com/google-ads/api/reference/rpc/google.ads.googleads.v3.enums#google.ads.googleads.v3.enums.RealEstatePlaceholderFieldEnum.RealEstatePlaceholderField
    // for the full list of placeholder values.
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
   * @param customerId the client customer ID.
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
    FeedItemAttributeValue contextualKeywords =
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
            .addAttributeValues(contextualKeywords)
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
}

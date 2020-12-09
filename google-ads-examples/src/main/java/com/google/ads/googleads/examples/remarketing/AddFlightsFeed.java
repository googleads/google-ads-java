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
import com.google.ads.googleads.examples.utils.CodeSampleHelper;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v6.enums.FeedAttributeTypeEnum.FeedAttributeType;
import com.google.ads.googleads.v6.enums.FlightPlaceholderFieldEnum.FlightPlaceholderField;
import com.google.ads.googleads.v6.enums.PlaceholderTypeEnum.PlaceholderType;
import com.google.ads.googleads.v6.errors.GoogleAdsError;
import com.google.ads.googleads.v6.errors.GoogleAdsException;
import com.google.ads.googleads.v6.resources.AttributeFieldMapping;
import com.google.ads.googleads.v6.resources.Feed;
import com.google.ads.googleads.v6.resources.FeedAttribute;
import com.google.ads.googleads.v6.resources.FeedItem;
import com.google.ads.googleads.v6.resources.FeedItemAttributeValue;
import com.google.ads.googleads.v6.resources.FeedMapping;
import com.google.ads.googleads.v6.services.FeedItemOperation;
import com.google.ads.googleads.v6.services.FeedItemServiceClient;
import com.google.ads.googleads.v6.services.FeedMappingOperation;
import com.google.ads.googleads.v6.services.FeedMappingServiceClient;
import com.google.ads.googleads.v6.services.FeedOperation;
import com.google.ads.googleads.v6.services.FeedServiceClient;
import com.google.ads.googleads.v6.services.GoogleAdsRow;
import com.google.ads.googleads.v6.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v6.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v6.services.MutateFeedItemResult;
import com.google.ads.googleads.v6.services.MutateFeedItemsResponse;
import com.google.ads.googleads.v6.services.MutateFeedMappingResult;
import com.google.ads.googleads.v6.services.MutateFeedMappingsResponse;
import com.google.ads.googleads.v6.services.MutateFeedsResponse;
import com.google.ads.googleads.v6.services.SearchGoogleAdsRequest;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Adds a flights feed, creates the associated feed mapping, and adds a feed item. */
public class AddFlightsFeed {
  private static final int PAGE_SIZE = 1_000;

  private static class AddFlightsFeedParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private long customerId;
  }

  public static void main(String[] args) {
    AddFlightsFeedParams params = new AddFlightsFeedParams();
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
      new AddFlightsFeed().runExample(googleAdsClient, params);
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
   * @param params the AddFlightsFeedParams for the example.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, AddFlightsFeedParams params) {
    // Creates a new flights feed.
    String feedResourceName = createFeed(googleAdsClient, params.customerId);
    // Get the newly creates feed's attributes and packages them into a map. This read operation
    // is required to retrieve the attribute IDs.
    Map<FlightPlaceholderField, FeedAttribute> feedAttributes =
        getFeed(googleAdsClient, params.customerId, feedResourceName);
    // Creates the feed mapping.
    createFeedMapping(googleAdsClient, params.customerId, feedAttributes, feedResourceName);
    // Creates a feed item.
    createFeedItem(googleAdsClient, params.customerId, feedAttributes, feedResourceName);
  }

  /**
   * Creates a flight feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @return a String of the feed resource name.
   */
  private String createFeed(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates a Flight Description attribute.
    FeedAttribute flightDescriptionAttribute =
        FeedAttribute.newBuilder()
            .setType(FeedAttributeType.STRING)
            .setName("Flight Description")
            .build();
    // Creates a Destination ID attribute.
    FeedAttribute destinationIdAttribute =
        FeedAttribute.newBuilder()
            .setType(FeedAttributeType.STRING)
            .setName("Destination ID")
            .build();
    // Creates a Flight Price attribute.
    FeedAttribute flightPriceAttribute =
        FeedAttribute.newBuilder()
            .setType(FeedAttributeType.STRING)
            .setName("Flight Price")
            .build();
    // Creates a Flight Sale Price attribute.
    FeedAttribute flightSalesPriceAttribute =
        FeedAttribute.newBuilder()
            .setType(FeedAttributeType.STRING)
            .setName("Flight Sale Price")
            .build();
    // Creates a Final URLs attribute.
    FeedAttribute finalUrlsAttribute =
        FeedAttribute.newBuilder()
            .setType(FeedAttributeType.URL_LIST)
            .setName("Final URLs")
            .build();

    // Creates the feed.
    Feed feed =
        Feed.newBuilder()
            .setName("Flights Feed #" + CodeSampleHelper.getPrintableDatetime())
            .addAttributes(flightDescriptionAttribute)
            .addAttributes(destinationIdAttribute)
            .addAttributes(flightPriceAttribute)
            .addAttributes(flightSalesPriceAttribute)
            .addAttributes(finalUrlsAttribute)
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
   * FeedAttribute, which is the return value of the method. The keys are the placeholder types that
   * the columns will be. The values are the FeedAttributes.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param feedResourceName the resource name of the feed.
   * @return a Map containing the FlightPlaceholderField and FeedAttribute.
   */
  public static Map<FlightPlaceholderField, FeedAttribute> getFeed(
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
      Map<FlightPlaceholderField, FeedAttribute> feedAttributes = new HashMap<>();
      // Loops through the feed attributes to populate the map.
      for (FeedAttribute feedAttribute : feedAttributeList) {
        switch (feedAttribute.getName()) {
          case "Flight Description":
            feedAttributes.put(FlightPlaceholderField.FLIGHT_DESCRIPTION, feedAttribute);
            break;
          case "Destination ID":
            feedAttributes.put(FlightPlaceholderField.DESTINATION_ID, feedAttribute);
            break;
          case "Flight Price":
            feedAttributes.put(FlightPlaceholderField.FLIGHT_PRICE, feedAttribute);
            break;
          case "Flight Sale Price":
            feedAttributes.put(FlightPlaceholderField.FLIGHT_SALE_PRICE, feedAttribute);
            break;
          case "Final URLs":
            feedAttributes.put(FlightPlaceholderField.FINAL_URLS, feedAttribute);
            break;
            // The full list of FlightPlaceholderFields can be found here
            // https://developers.google.com/google-ads/api/reference/rpc/latest/FlightPlaceholderFieldEnum.FlightPlaceholderField
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
      Map<FlightPlaceholderField, FeedAttribute> feedAttributes,
      String feedResourceName) {
    // Maps the FeedAttributeIds to the fieldId constants.
    AttributeFieldMapping flightDescriptionMapping =
        AttributeFieldMapping.newBuilder()
            .setFeedAttributeId(
                feedAttributes.get(FlightPlaceholderField.FLIGHT_DESCRIPTION).getId())
            .setFlightField(FlightPlaceholderField.FLIGHT_DESCRIPTION)
            .build();
    AttributeFieldMapping destinationIdMapping =
        AttributeFieldMapping.newBuilder()
            .setFeedAttributeId(feedAttributes.get(FlightPlaceholderField.DESTINATION_ID).getId())
            .setFlightField(FlightPlaceholderField.DESTINATION_ID)
            .build();
    AttributeFieldMapping flightPriceMapping =
        AttributeFieldMapping.newBuilder()
            .setFeedAttributeId(feedAttributes.get(FlightPlaceholderField.FLIGHT_PRICE).getId())
            .setFlightField(FlightPlaceholderField.FLIGHT_PRICE)
            .build();
    AttributeFieldMapping flightSalePriceMapping =
        AttributeFieldMapping.newBuilder()
            .setFeedAttributeId(
                feedAttributes.get(FlightPlaceholderField.FLIGHT_SALE_PRICE).getId())
            .setFlightField(FlightPlaceholderField.FLIGHT_SALE_PRICE)
            .build();
    AttributeFieldMapping finalUrlsMapping =
        AttributeFieldMapping.newBuilder()
            .setFeedAttributeId(feedAttributes.get(FlightPlaceholderField.FINAL_URLS).getId())
            .setFlightField(FlightPlaceholderField.FINAL_URLS)
            .build();

    // Creates the feed mapping.
    FeedMapping feedMapping =
        FeedMapping.newBuilder()
            .setPlaceholderType(PlaceholderType.DYNAMIC_FLIGHT)
            .setFeed(feedResourceName)
            .addAttributeFieldMappings(flightDescriptionMapping)
            .addAttributeFieldMappings(destinationIdMapping)
            .addAttributeFieldMappings(flightPriceMapping)
            .addAttributeFieldMappings(flightSalePriceMapping)
            .addAttributeFieldMappings(finalUrlsMapping)
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
   * Adds a new item to the feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param feedAttributes the feed attributes.
   * @param feedResourceName the feed resource name.
   */
  private void createFeedItem(
      GoogleAdsClient googleAdsClient,
      long customerId,
      Map<FlightPlaceholderField, FeedAttribute> feedAttributes,
      String feedResourceName) {

    // Creates the flight description feed attribute value.
    FeedItemAttributeValue flightDescription =
        FeedItemAttributeValue.newBuilder()
            .setFeedAttributeId(
                feedAttributes.get(FlightPlaceholderField.FLIGHT_DESCRIPTION).getId())
            .setStringValue("Earth to Mars")
            .build();
    // Creates the destination ID feed attribute value.
    FeedItemAttributeValue destinationId =
        FeedItemAttributeValue.newBuilder()
            .setFeedAttributeId(feedAttributes.get(FlightPlaceholderField.DESTINATION_ID).getId())
            .setStringValue("Mars")
            .build();
    // Creates the flight price feed attribute value.
    FeedItemAttributeValue flightPrice =
        FeedItemAttributeValue.newBuilder()
            .setFeedAttributeId(feedAttributes.get(FlightPlaceholderField.FLIGHT_PRICE).getId())
            .setStringValue("499.99 USD")
            .build();
    // Creates the flight sale price feed attribute value.
    FeedItemAttributeValue flightSalePrice =
        FeedItemAttributeValue.newBuilder()
            .setFeedAttributeId(
                feedAttributes.get(FlightPlaceholderField.FLIGHT_SALE_PRICE).getId())
            .setStringValue("299.99 USD")
            .build();
    // Creates the final URLs feed attribute value.
    FeedItemAttributeValue finalUrls =
        FeedItemAttributeValue.newBuilder()
            .setFeedAttributeId(feedAttributes.get(FlightPlaceholderField.FINAL_URLS).getId())
            .addStringValues("http://www.example.com/flights/")
            .build();

    // Creates the FeedItem, specifying the Feed ID and the attributes created above.
    FeedItem feedItem =
        FeedItem.newBuilder()
            .setFeed(feedResourceName)
            .addAttributeValues(flightDescription)
            .addAttributeValues(destinationId)
            .addAttributeValues(flightPrice)
            .addAttributeValues(flightSalePrice)
            .addAttributeValues(finalUrls)
            .build();

    // Creates an operation to add the FeedItem.
    FeedItemOperation operation = FeedItemOperation.newBuilder().setCreate(feedItem).build();

    // Creates the feed item service client.
    try (FeedItemServiceClient feedItemServiceClient =
        googleAdsClient.getLatestVersion().createFeedItemServiceClient()) {
      // Adds the feed item.
      MutateFeedItemsResponse response =
          feedItemServiceClient.mutateFeedItems(
              Long.toString(customerId), ImmutableList.of(operation));
      for (MutateFeedItemResult result : response.getResultsList()) {
        System.out.printf("Created feed item with resource name '%s'.%n", result.getResourceName());
      }
    }
  }
}

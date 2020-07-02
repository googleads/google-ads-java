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

package com.google.ads.googleads.examples.advancedoperations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v5.common.WebpageConditionInfo;
import com.google.ads.googleads.v5.common.WebpageInfo;
import com.google.ads.googleads.v5.enums.DsaPageFeedCriterionFieldEnum.DsaPageFeedCriterionField;
import com.google.ads.googleads.v5.enums.FeedAttributeTypeEnum.FeedAttributeType;
import com.google.ads.googleads.v5.enums.FeedMappingCriterionTypeEnum.FeedMappingCriterionType;
import com.google.ads.googleads.v5.enums.WebpageConditionOperandEnum.WebpageConditionOperand;
import com.google.ads.googleads.v5.errors.GoogleAdsError;
import com.google.ads.googleads.v5.errors.GoogleAdsException;
import com.google.ads.googleads.v5.resources.AdGroupCriterion;
import com.google.ads.googleads.v5.resources.AttributeFieldMapping;
import com.google.ads.googleads.v5.resources.Campaign;
import com.google.ads.googleads.v5.resources.Campaign.DynamicSearchAdsSetting;
import com.google.ads.googleads.v5.resources.Feed;
import com.google.ads.googleads.v5.resources.FeedAttribute;
import com.google.ads.googleads.v5.resources.FeedItem;
import com.google.ads.googleads.v5.resources.FeedItemAttributeValue;
import com.google.ads.googleads.v5.resources.FeedMapping;
import com.google.ads.googleads.v5.services.AdGroupCriterionOperation;
import com.google.ads.googleads.v5.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v5.services.CampaignOperation;
import com.google.ads.googleads.v5.services.CampaignServiceClient;
import com.google.ads.googleads.v5.services.FeedItemOperation;
import com.google.ads.googleads.v5.services.FeedItemServiceClient;
import com.google.ads.googleads.v5.services.FeedMappingOperation;
import com.google.ads.googleads.v5.services.FeedMappingServiceClient;
import com.google.ads.googleads.v5.services.FeedOperation;
import com.google.ads.googleads.v5.services.FeedServiceClient;
import com.google.ads.googleads.v5.services.GoogleAdsRow;
import com.google.ads.googleads.v5.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v5.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v5.services.MutateAdGroupCriteriaResponse;
import com.google.ads.googleads.v5.services.MutateCampaignsResponse;
import com.google.ads.googleads.v5.services.MutateFeedItemResult;
import com.google.ads.googleads.v5.services.MutateFeedItemsResponse;
import com.google.ads.googleads.v5.services.MutateFeedMappingsResponse;
import com.google.ads.googleads.v5.services.MutateFeedsResponse;
import com.google.ads.googleads.v5.services.SearchGoogleAdsRequest;
import com.google.ads.googleads.v5.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** Adds a page feed with URLs for a Dynamic Search Ads Campaign. */
public class AddDynamicPageFeed {

  private static final int PAGE_SIZE = 1_000;

  private static class AddDynamicPageFeedParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
  }

  public static void main(String[] args) {
    AddDynamicPageFeedParams params = new AddDynamicPageFeedParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
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
      new AddDynamicPageFeed()
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
    }
  }

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignId the campaign ID.
   * @param adGroupId the ad group ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, long campaignId, long adGroupId) {
    // The label for the DSA page URLs.
    String dsaPageUrlLabel = "discounts";

    // Creates the page feed details. This code example creates a new feed, but you can
    // fetch and re-use an existing feed.
    String feedResourceName = createFeed(googleAdsClient, customerId);
    Map<String, Long> feedDetails = getFeed(googleAdsClient, customerId, feedResourceName);
    createFeedMapping(googleAdsClient, customerId, feedDetails, feedResourceName);
    createFeedItems(googleAdsClient, customerId, feedDetails, feedResourceName, dsaPageUrlLabel);

    // Associates the page feed with the campaign.
    updateCampaignDsaSetting(googleAdsClient, customerId, feedResourceName, campaignId);

    // Optional: Targets web pages matching the feed's label in the ad group.
    addDsaTarget(googleAdsClient, customerId, adGroupId, dsaPageUrlLabel);

    System.out.printf("Dynamic page feed setup is complete for campaign with ID %d.%n", campaignId);
  }

  /**
   * Creates a feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the customer ID in which to create the feed.
   * @return the resource name of the newly created feed.
   */
  private static String createFeed(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates a URL attribute.
    FeedAttribute urlAttribute =
        FeedAttribute.newBuilder()
            .setType(FeedAttributeType.URL_LIST)
            .setName(StringValue.of("Page URL"))
            .build();

    // Creates a label attribute.
    FeedAttribute labelAttribute =
        FeedAttribute.newBuilder()
            .setType(FeedAttributeType.STRING_LIST)
            .setName(StringValue.of("Label"))
            .build();

    // Creates the feed.
    Feed feed =
        Feed.newBuilder()
            .setName(StringValue.of("DSA Feed #" + System.currentTimeMillis()))
            .addAllAttributes(ImmutableList.of(urlAttribute, labelAttribute))
            .build();

    // Creates a feed operation for creating a feed.
    FeedOperation feedOperation = FeedOperation.newBuilder().setCreate(feed).build();

    // Creates a feed service client.
    try (FeedServiceClient feedServiceClient =
        googleAdsClient.getLatestVersion().createFeedServiceClient()) {
      // Adds the feed.
      MutateFeedsResponse feedResponse =
          feedServiceClient.mutateFeeds(Long.toString(customerId), ImmutableList.of(feedOperation));
      String feedResourceName = feedResponse.getResults(0).getResourceName();
      System.out.printf("Added feed named '%s'.%n", feedResourceName);

      return feedResourceName;
    }
  }

  /**
   * Retrieves details about a feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the customer ID.
   * @param feedResourceName the resource name of the feed.
   * @return a map of the names and IDs of feed attributes.
   */
  private static Map<String, Long> getFeed(
      GoogleAdsClient googleAdsClient, long customerId, String feedResourceName) {
    String query =
        String.format(
            "SELECT feed.attributes FROM feed WHERE feed.resource_name = '%s'", feedResourceName);

    // Creates the request.
    SearchGoogleAdsRequest request =
        SearchGoogleAdsRequest.newBuilder()
            .setCustomerId(Long.toString(customerId))
            .setPageSize(PAGE_SIZE)
            .setQuery(query)
            .build();

    // Creates the service client.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Issues the search request.
      SearchPagedResponse response = googleAdsServiceClient.search(request);
      // Gets the first result because we only need the single feed item we created previously.
      GoogleAdsRow googleAdsRow = response.getPage().getResponse().getResults(0);
      // Gets the attributes list from the feed and creates a map with keys of each attribute and
      // values of each corresponding ID.
      List<FeedAttribute> feedAttributes = googleAdsRow.getFeed().getAttributesList();
      // Creates a map to return.
      Map<String, Long> feedDetails = new HashMap<>();
      // Adds each of the feed attributes and IDs to the map.
      for (FeedAttribute feedAttribute : feedAttributes) {
        feedDetails.put(feedAttribute.getName().getValue(), feedAttribute.getId().getValue());
      }

      return feedDetails;
    }
  }

  /**
   * Creates a feed mapping for a given feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the customer ID.
   * @param feedDetails a map of the names and IDs of feed attributes.
   * @param feedResourceName the resource name of the feed.
   */
  private static void createFeedMapping(
      GoogleAdsClient googleAdsClient,
      long customerId,
      Map<String, Long> feedDetails,
      String feedResourceName) {
    // Maps the feed attribute IDs to the field ID constants.
    AttributeFieldMapping urlFieldMapping =
        AttributeFieldMapping.newBuilder()
            .setFeedAttributeId(Int64Value.of(feedDetails.get("Page URL")))
            .setDsaPageFeedField(DsaPageFeedCriterionField.PAGE_URL)
            .build();

    AttributeFieldMapping labelFieldMapping =
        AttributeFieldMapping.newBuilder()
            .setFeedAttributeId(Int64Value.of(feedDetails.get("Label")))
            .setDsaPageFeedField(DsaPageFeedCriterionField.LABEL)
            .build();

    // Creates the feed mapping.
    FeedMapping feedMapping =
        FeedMapping.newBuilder()
            .setCriterionType(FeedMappingCriterionType.DSA_PAGE_FEED)
            .setFeed(StringValue.of(feedResourceName))
            .addAllAttributeFieldMappings(ImmutableList.of(urlFieldMapping, labelFieldMapping))
            .build();

    // Creates the operation.
    FeedMappingOperation operation =
        FeedMappingOperation.newBuilder().setCreate(feedMapping).build();

    // Creates the service client.
    try (FeedMappingServiceClient feedMappingServiceClient =
        googleAdsClient.getLatestVersion().createFeedMappingServiceClient()) {
      // Adds the feed mapping.
      MutateFeedMappingsResponse response =
          feedMappingServiceClient.mutateFeedMappings(
              Long.toString(customerId), ImmutableList.of(operation));
      // Displays the results.
      System.out.printf(
          "Created feed maping with resource name '%s'.%n",
          response.getResults(0).getResourceName());
    }
  }

  /**
   * Creates feed items for a given feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the customer ID.
   * @param feedDetails a map of the names and IDs of feed attributes.
   * @param feedResourceName the resource name of the feed.
   * @param dsaPageUrlLabel the label for the DSA page URLs.
   */
  private static void createFeedItems(
      GoogleAdsClient googleAdsClient,
      long customerId,
      Map<String, Long> feedDetails,
      String feedResourceName,
      String dsaPageUrlLabel) {
    List<String> urls =
        ImmutableList.of(
            "http://www.example.com/discounts/rental-cars",
            "http://www.example.com/discounts/hotel-deals",
            "http://www.example.com/discounts/flight-deals");

    // Creates a value for the label attribute.
    FeedItemAttributeValue labelAttributeValue =
        FeedItemAttributeValue.newBuilder()
            .setFeedAttributeId(Int64Value.of(feedDetails.get("Label")))
            .addAllStringValues(
                ImmutableList.of(StringValue.newBuilder().setValue(dsaPageUrlLabel).build()))
            .build();

    // Creates one operation per URL.
    List<FeedItemOperation> feedItemOperations = new ArrayList<>();
    for (String url : urls) {
      // Creates a url attribute.
      FeedItemAttributeValue urlAttributeValue =
          FeedItemAttributeValue.newBuilder()
              .setFeedAttributeId(Int64Value.of(feedDetails.get("Page URL")))
              .addAllStringValues(ImmutableList.of(StringValue.newBuilder().setValue(url).build()))
              .build();

      // Creates a feed item.
      FeedItem feedItem =
          FeedItem.newBuilder()
              .setFeed(StringValue.of(feedResourceName))
              .addAllAttributeValues(ImmutableList.of(urlAttributeValue, labelAttributeValue))
              .build();

      // Creates an operation and adds it to the list of operations.
      FeedItemOperation feedItemOperation =
          FeedItemOperation.newBuilder().setCreate(feedItem).build();
      feedItemOperations.add(feedItemOperation);
    }

    // Creates the service client.
    try (FeedItemServiceClient feedItemServiceClient =
        googleAdsClient.getLatestVersion().createFeedItemServiceClient()) {
      // Adds the feed items.
      MutateFeedItemsResponse response =
          feedItemServiceClient.mutateFeedItems(Long.toString(customerId), feedItemOperations);

      // Displays the results.
      for (MutateFeedItemResult result : response.getResultsList()) {
        System.out.printf("Created feed item with resource name '%s'.%n", result.getResourceName());
      }
    }
  }

  /**
   * Updates a campaign to set the DSA feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the customer ID.
   * @param feedResourceName the resource name of the feed.
   * @param campaignId the campaign ID of the campaign to update.
   */
  private static void updateCampaignDsaSetting(
      GoogleAdsClient googleAdsClient, long customerId, String feedResourceName, long campaignId) {
    // Retrieves the existing dynamic search ads settings for the campaign.
    DynamicSearchAdsSetting dsaSetting = getDsaSetting(googleAdsClient, customerId, campaignId);
    dsaSetting.toBuilder().addAllFeeds(ImmutableList.of(feedResourceName)).build();

    // Creates the campaign object to update.
    Campaign campaign =
        Campaign.newBuilder()
            .setResourceName(ResourceNames.campaign(customerId, campaignId))
            .setDynamicSearchAdsSetting(dsaSetting)
            .build();

    // Creates the update operation and sets the update mask.
    CampaignOperation operation =
        CampaignOperation.newBuilder()
            .setUpdate(campaign)
            .setUpdateMask(FieldMasks.allSetFieldsOf(campaign))
            .build();

    // Creates the service client.
    try (CampaignServiceClient campaignServiceClient =
        googleAdsClient.getLatestVersion().createCampaignServiceClient()) {
      // Updates the campaign.
      MutateCampaignsResponse response =
          campaignServiceClient.mutateCampaigns(
              Long.toString(customerId), ImmutableList.of(operation));

      // Displays the results.
      System.out.printf(
          "Updated campaign with resource name '%s'.%n", response.getResults(0).getResourceName());
    }
  }

  /**
   * Returns the DSA settings for a campaign. Throws an error if the campaign does not exist or is
   * not a DSA campaign.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the customer ID.
   * @param campaignId the campaign ID of the campaign to update.
   * @return the DSA settings for the campaign.
   */
  private static DynamicSearchAdsSetting getDsaSetting(
      GoogleAdsClient googleAdsClient, long customerId, long campaignId) {
    // Creates the query.
    // You must request all DSA fields in order to update the DSA settings in the following step.
    String query =
        String.format(
            "SELECT campaign.id, campaign.name, campaign.dynamic_search_ads_setting.domain_name,"
                + " campaign.dynamic_search_ads_setting.language_code,"
                + " campaign.dynamic_search_ads_setting.use_supplied_urls_only "
                + "FROM campaign "
                + "WHERE campaign.id = '%s'",
            campaignId);

    // Creates the request.
    SearchGoogleAdsRequest request =
        SearchGoogleAdsRequest.newBuilder()
            .setCustomerId(Long.toString(customerId))
            .setPageSize(PAGE_SIZE)
            .setQuery(query)
            .build();

    // Creates the service client.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Issues the search request.
      SearchPagedResponse response = googleAdsServiceClient.search(request);

      // Throws an exception if the campaign is not a DSA campaign.
      // The server will return an error when trying to update the campaign with the DSA feed in
      // the following step if the campaign is not a DSA campaign. However, this
      // exception is easier to interpret.
      if (!response
          .getPage()
          .getResponse()
          .getResults(0)
          .getCampaign()
          .hasDynamicSearchAdsSetting()) {
        throw new IllegalArgumentException(
            String.format("Campaign with ID '%s' is not a " + "DSA campaign.", campaignId));
      }

      // Retrieves and returns the DSA setting.
      return response
          .getPage()
          .getResponse()
          .getResults(0)
          .getCampaign()
          .getDynamicSearchAdsSetting();
    }
  }

  /**
   * Creates an ad group criterion targeting the DSA label.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the customer ID.
   * @param adGroupId the ad group ID.
   * @param dsaPageUrlLabel the label for the DSA page URLs.
   */
  private static void addDsaTarget(
      GoogleAdsClient googleAdsClient, long customerId, long adGroupId, String dsaPageUrlLabel) {
    String adGroupResourceName = ResourceNames.adGroup(customerId, adGroupId);

    // Creates the webpage condition info that targets an advertiser's webpages based on the
    // custom label specified by the dsaPageUrlLabel (e.g. "discounts").
    WebpageConditionInfo webpageConditionInfo =
        WebpageConditionInfo.newBuilder()
            .setOperand(WebpageConditionOperand.CUSTOM_LABEL)
            .setArgument(dsaPageUrlLabel)
            .build();

    // Creates the webpage info, or criterion for targeting webpages of an advertiser's website.
    WebpageInfo webpageInfo =
        WebpageInfo.newBuilder()
            .setCriterionName("Test Criterion")
            .addAllConditions(ImmutableList.of(webpageConditionInfo))
            .build();

    // Creates the ad group criterion.
    AdGroupCriterion adGroupCriterion =
        AdGroupCriterion.newBuilder()
            .setAdGroup(adGroupResourceName)
            .setWebpage(webpageInfo)
            .setCpcBidMicros(1_500_000)
            .build();

    // Creates the operation.
    AdGroupCriterionOperation operation =
        AdGroupCriterionOperation.newBuilder().setCreate(adGroupCriterion).build();

    // Creates the service client.
    try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupCriterionServiceClient()) {
      // Adds the ad group criterion.
      MutateAdGroupCriteriaResponse response =
          adGroupCriterionServiceClient.mutateAdGroupCriteria(
              Long.toString(customerId), ImmutableList.of(operation));

      // Displays the results.
      System.out.printf(
          "Created ad group criterion with resource name '%s'.%n",
          response.getResults(0).getResourceName());
    }
  }
}

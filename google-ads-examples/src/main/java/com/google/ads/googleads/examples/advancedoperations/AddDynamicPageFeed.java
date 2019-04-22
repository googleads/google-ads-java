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
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v1.common.WebpageConditionInfo;
import com.google.ads.googleads.v1.common.WebpageInfo;
import com.google.ads.googleads.v1.enums.DsaPageFeedCriterionFieldEnum.DsaPageFeedCriterionField;
import com.google.ads.googleads.v1.enums.FeedMappingCriterionTypeEnum.FeedMappingCriterionType;
import com.google.ads.googleads.v1.enums.WebpageConditionOperandEnum.WebpageConditionOperand;
import com.google.ads.googleads.v1.resources.AdGroupCriterion;
import com.google.ads.googleads.v1.resources.AttributeFieldMapping;
import com.google.ads.googleads.v1.resources.Campaign;
import com.google.ads.googleads.v1.resources.Feed;
import com.google.ads.googleads.v1.resources.FeedItem;
import com.google.ads.googleads.v1.resources.FeedItemAttributeValue;
import com.google.ads.googleads.v1.resources.FeedMapping;
import com.google.ads.googleads.v1.resources.FeedAttribute;
import com.google.ads.googleads.v1.resources.Campaign.DynamicSearchAdsSetting;
import com.google.ads.googleads.v1.services.AdGroupCriterionOperation;
import com.google.ads.googleads.v1.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v1.services.CampaignServiceClient;
import com.google.ads.googleads.v1.services.CampaignOperation;
import com.google.ads.googleads.v1.services.FeedItemOperation;
import com.google.ads.googleads.v1.services.FeedItemServiceClient;
import com.google.ads.googleads.v1.services.FeedMappingOperation;
import com.google.ads.googleads.v1.services.FeedMappingServiceClient;
import com.google.ads.googleads.v1.services.FeedOperation;
import com.google.ads.googleads.v1.services.FeedServiceClient;
import com.google.ads.googleads.v1.services.GoogleAdsRow;
import com.google.ads.googleads.v1.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v1.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v1.services.MutateAdGroupCriteriaResponse;
import com.google.ads.googleads.v1.services.MutateAdGroupCriterionResult;
import com.google.ads.googleads.v1.services.MutateCampaignResult;
import com.google.ads.googleads.v1.services.MutateCampaignsResponse;
import com.google.ads.googleads.v1.services.MutateFeedItemResult;
import com.google.ads.googleads.v1.services.MutateFeedItemsResponse;
import com.google.ads.googleads.v1.services.MutateFeedMappingResult;
import com.google.ads.googleads.v1.services.MutateFeedMappingsResponse;
import com.google.ads.googleads.v1.services.MutateFeedsResponse;
import com.google.ads.googleads.v1.services.SearchGoogleAdsRequest;
import com.google.ads.googleads.v1.utils.ResourceNames;
import com.google.ads.googleads.v1.enums.FeedAttributeTypeEnum.FeedAttributeType;
import com.google.ads.googleads.v1.enums.FeedOriginEnum.FeedOrigin;
import com.google.ads.googleads.v1.errors.GoogleAdsError;
import com.google.ads.googleads.v1.errors.GoogleAdsException;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * This code example adds a page feed to specify precisely which URLs to use with
 * your Dynamic Search Ads campaign.
 */
public class AddDynamicPageFeed {
  private static final int PAGE_SIZE = 1_000;

  private static class AddDynamicPageFeedParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private long campaignId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private long adGroupId;
  }

  private static class FeedDetails {
    private String feedResourceName;
    private long urlAttributeId;
    private long labelAttributeId;

    private FeedDetails(String feedResourceName, long urlAttributeId, long labelAttributeId) {
      this.feedResourceName = feedResourceName;
      this.urlAttributeId = urlAttributeId;
      this.labelAttributeId = labelAttributeId;
    }

    private String getFeedResourceName() {
      return this.feedResourceName;
    }

    private long getUrlAttributeId() {
      return this.urlAttributeId;
    }

    private long getLabelAttributeId() {
      return this.labelAttributeId;
    }
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
      new AddDynamicPageFeed().runExample(googleAdsClient,
        params.customerId, params.campaignId, params.adGroupId);
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
   * @param adGroupId the adGroup ID.
   * @param campaignId the campaign ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long campaignId,
      long adGroupId) {
    String dsaPageUrlLabel = "discounts";

    // Get the page feed details. This code example creates a new feed, but you can
    // fetch and re-use an existing feed.
    FeedDetails feedDetails = createFeed(googleAdsClient, customerId);
    createFeedMapping(googleAdsClient, customerId, feedDetails);
    createFeedItems(googleAdsClient, customerId, feedDetails, dsaPageUrlLabel);

    // Associate the page feed with the campaign.
    updateCampaignDsaSetting(googleAdsClient, customerId, feedDetails, campaignId);

    // Optional: Target web pages matching the feed's label in the ad group.
    addDsaTarget(googleAdsClient, customerId, adGroupId, dsaPageUrlLabel);

    System.out.printf("Dynamic page feed setup is complete for campaign ID %s.%n", campaignId);
  }

  /**
   * Creates a feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID in which to create criterion.
   * @return a FeedDetails object containing relevant information.
   */
  private FeedDetails createFeed(GoogleAdsClient googleAdsClient, long customerId) {
    // Create a URL attribute
    FeedAttribute urlAttribute = FeedAttribute.newBuilder()
      .setType(FeedAttributeType.URL_LIST)
      .setName(StringValue.of("Page URL"))
      .build();

    // Create a label attribute
    FeedAttribute labelAttribute = FeedAttribute.newBuilder()
      .setType(FeedAttributeType.STRING_LIST)
      .setName(StringValue.of("Label"))
      .build();

    // Create the feed.
    Feed feed = Feed.newBuilder()
      .setName(StringValue.of("DSA Feed #" + System.currentTimeMillis()))
      .addAttributes(urlAttribute)
      .addAttributes(labelAttribute)
      .setOrigin(FeedOrigin.USER)
      .build();

    // Create the operation.
    FeedOperation operation = FeedOperation.newBuilder().setCreate(feed).build();

    // Create the feed service client.
    try (FeedServiceClient feedServiceClient =
           googleAdsClient.getLatestVersion().createFeedServiceClient()) {
      // Add the feed.
      MutateFeedsResponse response =
        feedServiceClient.mutateFeeds(String.valueOf(customerId), ImmutableList.of(operation));
      String feedResourceName = response.getResults(0).getResourceName();
      // Display the result.
      System.out.printf(
        "Feed with resource name '%s' was created.%n", feedResourceName);

      // Return a FeedDetails object.
      return getFeed(googleAdsClient, customerId, feedResourceName);
    }

  }

  /**
   * Retrieves details about a feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID in which to create criterion.
   * @return a FeedDetails object containing relevant information.
   */
  private FeedDetails getFeed(GoogleAdsClient googleAdsClient, long customerId, String feedResourceName) {
    // Construct the query.
    String query =
      "SELECT feed.attributes FROM feed WHERE feed.resource_name = '" + feedResourceName + "'";

    // Construct the request.
    SearchGoogleAdsRequest request = SearchGoogleAdsRequest.newBuilder()
      .setCustomerId(String.valueOf(customerId))
      .setPageSize(PAGE_SIZE)
      .setQuery(query)
      .build();

    // Issue the search request.
    try (GoogleAdsServiceClient googleAdsServiceClient =
           googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);
      // Get the first result because we only need the single feed item we created previously.
      GoogleAdsRow googleAdsRow = searchPagedResponse.getPage().getResponse().getResults(0);
      // Get the attributes list from the feed and create a map with keys of each attribute and
      // values of each corresponding ID.
      List<FeedAttribute> feedAttributeList = googleAdsRow.getFeed().getAttributesList();
      Map<String, Long> feedAttributeMap = new Hashtable<>();
      for (FeedAttribute feedAttribute : feedAttributeList) {
        feedAttributeMap.put(feedAttribute.getName().getValue(), feedAttribute.getId().getValue());
      }
      // Finally, construct a FeedDetails object so that we have a nice small
      // wrapper around the details we care about for the next phase.
      FeedDetails feedDetails = new FeedDetails(
        googleAdsRow.getFeed().getResourceName(),
        feedAttributeMap.get("Page URL"),
        feedAttributeMap.get("Label"));

      return feedDetails;
    }
  }

  /**
   * Creates a field mapping for a given feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID in which to create criterion.
   * @param feedDetails the relevant information about the feed and its attributes.
   */
  private void createFeedMapping(GoogleAdsClient googleAdsClient, long customerId, FeedDetails feedDetails) {
    // Map the FeedAttributeIds to the fieldId constants.
    AttributeFieldMapping urlFieldMapping = AttributeFieldMapping.newBuilder()
      .setFeedAttributeId(Int64Value.of(feedDetails.getUrlAttributeId()))
      .setDsaPageFeedField(DsaPageFeedCriterionField.PAGE_URL)
      .build();
    AttributeFieldMapping labelFieldMapping = AttributeFieldMapping.newBuilder()
      .setFeedAttributeId(Int64Value.of(feedDetails.getLabelAttributeId()))
      .setDsaPageFeedField(DsaPageFeedCriterionField.LABEL)
      .build();

    // Map the FeedAttributeIds to the fieldId constants.
    FeedMapping feedMapping = FeedMapping.newBuilder()
      .setCriterionType(FeedMappingCriterionType.DSA_PAGE_FEED)
      .setFeed(StringValue.of(feedDetails.getFeedResourceName()))
      .addAttributeFieldMappings(urlFieldMapping)
      .addAttributeFieldMappings(labelFieldMapping)
      .build();

    // Create the operation
    FeedMappingOperation operation =
      FeedMappingOperation.newBuilder().setCreate(feedMapping).build();

    // Add the FeedMapping.
    try (FeedMappingServiceClient feedMappingServiceClient =
           googleAdsClient.getLatestVersion().createFeedMappingServiceClient()) {
      MutateFeedMappingsResponse response =
        feedMappingServiceClient.mutateFeedMappings(
          Long.toString(customerId),
          ImmutableList.of(operation));

      // Display the results
      for (MutateFeedMappingResult result : response.getResultsList()) {
        System.out.printf("Created feed mapping with resource name '%s'.%n", result.getResourceName());
      }
    }
    return;
  }

  /**
   * Creates feed items for a given feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID in which to create criterion.
   * @param feedDetails the relevant information about the feed and its attributes.
   * @param dsaPageUrlLabel the label for the DSA Page URLs.
   */
  private void createFeedItems(GoogleAdsClient googleAdsClient, long customerId,
                               FeedDetails feedDetails, String dsaPageUrlLabel) {
    List<String> urls = Arrays.asList(
      "http://www.example.com/discounts/rental-cars",
      "http://www.example.com/discounts/hotel-deals",
      "http://www.example.com/discounts/flight-deals"
    );

    List<FeedItemOperation> ops = new ArrayList<>();

    for (String url : urls) {
      // Create a url attribute.
      FeedItemAttributeValue urlAttributeValue = FeedItemAttributeValue.newBuilder()
        .setFeedAttributeId(
          Int64Value.of(feedDetails.getUrlAttributeId()))
        .setStringValue(StringValue.of(url))
        .build();
      // Create a label attribute.
      FeedItemAttributeValue labelAttributeValue = FeedItemAttributeValue.newBuilder()
        .setFeedAttributeId(
          Int64Value.of(feedDetails.getLabelAttributeId()))
        .setStringValue(StringValue.of(dsaPageUrlLabel))
        .build();
      // Create a feed item.
      FeedItem feedItem = FeedItem.newBuilder()
        .setFeed(StringValue.of(feedDetails.getFeedResourceName()))
        .addAttributeValues(urlAttributeValue)
        .addAttributeValues(labelAttributeValue)
        .build();
      // Create an operation.
      FeedItemOperation operation = FeedItemOperation.newBuilder()
        .setCreate(feedItem)
        .build();
      ops.add(operation);
    }

    // Create the feed item service client.
    try (FeedItemServiceClient feedItemServiceClient =
           googleAdsClient.getLatestVersion().createFeedItemServiceClient()) {
      // Add the feed items.
      MutateFeedItemsResponse response =
        feedItemServiceClient.mutateFeedItems(Long.toString(customerId), ops);
      // Display the results.
      for (MutateFeedItemResult result : response.getResultsList()) {
        System.out.printf("Created feed items with resource name '%s'.%n",
        result.getResourceName());
      }
    }
    return;
  }

  /**
   * Updates a campaign to set the DSA feed.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID in which to create criterion.
   * @param feedDetails the relevant information about the feed and its attributes.
   * @param campaignId the campaign ID of the campaign to update.
   */
  private void updateCampaignDsaSetting(GoogleAdsClient googleAdsClient, long customerId,
                                        FeedDetails feedDetails, long campaignId) {
    DynamicSearchAdsSetting dsaSetting =
      DynamicSearchAdsSetting.newBuilder(getDsaSetting(googleAdsClient, customerId, campaignId))
        .addFeeds(StringValue.of(feedDetails.getFeedResourceName()))
        .build();

    // Create the campaign.
    Campaign campaign = Campaign.newBuilder()
      .setResourceName(ResourceNames.campaign(customerId, campaignId))
      .setDynamicSearchAdsSetting(dsaSetting)
      .build();
    // Create the operation.
    CampaignOperation operation = CampaignOperation.newBuilder()
      .setUpdate(campaign)
      .setUpdateMask(FieldMasks.allSetFieldsOf(campaign))
      .build();
    // Create the campaign service.
    try (CampaignServiceClient campaignServiceClient =
           googleAdsClient.getLatestVersion().createCampaignServiceClient()) {
      // Update the campaign.
      MutateCampaignsResponse response = campaignServiceClient.mutateCampaigns(
        Long.toString(customerId), ImmutableList.of(operation));
      // Display the results.
      for (MutateCampaignResult mutateCampaignResult : response.getResultsList()) {
        System.out.printf(
          "Updated campaign with resourceName: %s.%n", mutateCampaignResult.getResourceName());
      }
    }
    return;
  }

  /**
   * Returns the DSA settings for a campaign. Throws an error if the
   * campaign does not exists or is not a DSA campaign.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID in which to create criterion.
   * @param campaignId the campaign ID.
   */
  private DynamicSearchAdsSetting getDsaSetting(
    GoogleAdsClient googleAdsClient, long customerId, long campaignId) {
    // Create the query.
    // You must request all DSA fields in order to update the DSA settings in the following step.
    String query =
      "SELECT " +
        "campaign.id, " +
        "campaign.name, " +
        "campaign.dynamic_search_ads_setting.domain_name, " +
        "campaign.dynamic_search_ads_setting.language_code, " +
        "campaign.dynamic_search_ads_setting.use_supplied_urls_only " +
      "FROM " +
        "campaign " +
      "WHERE " +
        "campaign.id = " + campaignId;
    // Create the request.
    SearchGoogleAdsRequest request = SearchGoogleAdsRequest.newBuilder()
      .setCustomerId(Long.toString(customerId))
      .setPageSize(PAGE_SIZE)
      .setQuery(query)
      .build();

    // Create the service client.
    try (GoogleAdsServiceClient googleAdsServiceClient =
           googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);

      // Throw an exception a campaign with the provided ID does not exist.
      if (searchPagedResponse.getPage().getResponse().getTotalResultsCount() == 0) {
        throw new IllegalArgumentException("No campaign found with ID: " + campaignId);
      }

      // Get the DSA settings.
      DynamicSearchAdsSetting dynamicSearchAdsSetting = searchPagedResponse
        .getPage()
        .getResponse()
        .getResults(0)
        .getCampaign()
        .getDynamicSearchAdsSetting();

      // Get the campaign domain name.
      String domainName = dynamicSearchAdsSetting
        .getDomainName()
        .getValue();

      // Throw an exception if the campaign is not a DSA campaign.
      if (domainName == null || domainName == "") {
        throw new IllegalArgumentException(
          "Campaign with ID " + campaignId + " is not a DSA campaign.");
      }
      return dynamicSearchAdsSetting;
    }
  }


  /**
   * Updates an ad group criterion targeting the DSA label.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID in which to create criterion.
   * @param adGroupId the ad group with which the criterion will be associated.
   * @param label the label for the criterion to target.
   */
  private void addDsaTarget(GoogleAdsClient googleAdsClient, long customerId,
                            long adGroupId, String label) {
    String adGroupResourceName = ResourceNames.adGroup(customerId, adGroupId);
    // Create the webpage condition info.
    WebpageConditionInfo webpageConditionInfo = WebpageConditionInfo.newBuilder()
      .setOperand(WebpageConditionOperand.CUSTOM_LABEL)
      .setArgument(StringValue.of(label))
      .build();
    // Create the webpage info.
    WebpageInfo webpageInfo = WebpageInfo.newBuilder()
      .setCriterionName(StringValue.of("Test Criterion"))
      .addConditions(webpageConditionInfo)
      .build();
    // Create the ad group criterion
    AdGroupCriterion adGroupCriterion = AdGroupCriterion.newBuilder()
      .setAdGroup(StringValue.of(adGroupResourceName))
      .setWebpage(webpageInfo)
      .setCpcBidMicros(Int64Value.of(1_500_000))
      .build();
    // Create the operation.
    AdGroupCriterionOperation operation =
      AdGroupCriterionOperation.newBuilder().setCreate(adGroupCriterion).build();
    // Create the ad group criterion service.
    try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
           googleAdsClient.getLatestVersion().createAdGroupCriterionServiceClient()) {
      // Add the ad group criterion.
      MutateAdGroupCriteriaResponse mutateAdGroupCriteriaResponse =
        adGroupCriterionServiceClient.mutateAdGroupCriteria(
          Long.toString(customerId), ImmutableList.of(operation));
      // Display the results.
      for (MutateAdGroupCriterionResult result : mutateAdGroupCriteriaResponse.getResultsList()) {
        System.out.printf(
          "Created ad group criterion with resource name '%s'.%n", result.getResourceName());
      }
    }
    return;
  }
}

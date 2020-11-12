// Copyright 2018 Google LLC
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

package com.google.ads.googleads.examples.accountmanagement;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v6.errors.GoogleAdsError;
import com.google.ads.googleads.v6.errors.GoogleAdsException;
import com.google.ads.googleads.v6.resources.ChangeStatus;
import com.google.ads.googleads.v6.services.GoogleAdsRow;
import com.google.ads.googleads.v6.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v6.services.GoogleAdsServiceClient.SearchPagedResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;

/** Gets the changes in the account made in the last 7 days. */
public class GetAccountChanges {

  private static class GetAccountChangesParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    GetAccountChangesParams params = new GetAccountChangesParams();
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
      new GetAccountChanges().runExample(googleAdsClient, params.customerId);
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
   * @param googleAdsClient the client instance.
   * @param customerId the customerId for which to retrieve change status.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    String query =
        "SELECT change_status.resource_name, "
            + "change_status.last_change_date_time, "
            + "change_status.resource_status, "
            + "change_status.resource_type, "
            + "change_status.ad_group, "
            + "change_status.ad_group_ad, "
            + "change_status.ad_group_bid_modifier, "
            + "change_status.ad_group_criterion, "
            + "change_status.ad_group_feed, "
            + "change_status.campaign, "
            + "change_status.campaign_criterion, "
            + "change_status.campaign_feed, "
            + "change_status.feed, "
            + "change_status.feed_item "
            + "FROM change_status "
            + "WHERE change_status.last_change_date_time DURING LAST_7_DAYS "
            + "ORDER BY change_status.last_change_date_time";

    try (GoogleAdsServiceClient client =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      SearchPagedResponse response = client.search(String.valueOf(customerId), query);

      for (GoogleAdsRow row : response.iterateAll()) {
        Optional<String> resourceNameOfChangedEntity =
            getResourceNameForResourceType(row.getChangeStatus());

        System.out.printf(
            "On '%s', change status '%s' shows a resource type of '%s' "
                + "with resource name '%s' was '%s'.%n",
            row.getChangeStatus().getLastChangeDateTime(),
            row.getChangeStatus().getResourceName(),
            row.getChangeStatus().getResourceType().name(),
            resourceNameOfChangedEntity.orElse(""),
            row.getChangeStatus().getResourceStatus().name());
      }
    }
  }

  /**
   * Each returned row contains all possible changed fields. This function returns the resource name
   * of the changed field based on the resource type. The changed field's parent is also populated
   * but is not used.
   *
   * @param changeStatus the change status for which to get affected resource name.
   * @return an Optional has a value when one could be obtained for the change resource type.
   */
  private static Optional<String> getResourceNameForResourceType(ChangeStatus changeStatus) {
    String resourceName = null;
    // This is the list of all known resource names but may be subject to change in the future.
    // See https://developers.google.com/google-ads/api/docs/change-status for a description.
    switch (changeStatus.getResourceType()) {
      case AD_GROUP:
        resourceName = changeStatus.getAdGroup();
        break;
      case AD_GROUP_AD:
        resourceName = changeStatus.getAdGroupAd();
        break;
      case AD_GROUP_BID_MODIFIER:
        resourceName = changeStatus.getAdGroupBidModifier();
        break;
      case AD_GROUP_CRITERION:
        resourceName = changeStatus.getAdGroup();
        break;
      case AD_GROUP_FEED:
        resourceName = changeStatus.getAdGroupFeed();
        break;
      case CAMPAIGN:
        resourceName = changeStatus.getCampaign();
        break;
      case CAMPAIGN_CRITERION:
        resourceName = changeStatus.getCampaignCriterion();
        break;
      case CAMPAIGN_FEED:
        resourceName = changeStatus.getCampaignFeed();
        break;
      case FEED:
        resourceName = changeStatus.getFeed();
        break;
      case FEED_ITEM:
        resourceName = changeStatus.getFeedItem();
        break;
    }
    return Optional.ofNullable(resourceName);
  }
}

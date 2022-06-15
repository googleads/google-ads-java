// Copyright 2021 Google LLC
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
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v11.enums.ChangeEventResourceTypeEnum.ChangeEventResourceType;
import com.google.ads.googleads.v11.enums.ResourceChangeOperationEnum.ResourceChangeOperation;
import com.google.ads.googleads.v11.errors.GoogleAdsError;
import com.google.ads.googleads.v11.errors.GoogleAdsException;
import com.google.ads.googleads.v11.resources.ChangeEvent;
import com.google.ads.googleads.v11.resources.ChangeEvent.ChangedResource;
import com.google.ads.googleads.v11.services.GoogleAdsRow;
import com.google.ads.googleads.v11.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v11.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.protobuf.Message;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.joda.time.LocalDate;

/**
 * Gets specific details about the most recent changes in your account, including which field
 * changed and the old and new values.
 */
public class GetChangeDetails {

  private static class GetChangeDetailsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    GetChangeDetailsParams params = new GetChangeDetailsParams();
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
      new GetChangeDetails().runExample(googleAdsClient, params.customerId);
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

  /** Runs the example. */
  // [START get_change_details]
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    // Defines a GAQL query to retrieve change_event instances from the last 14 days.
    String query =
        String.format(
            "SELECT"
                + "  change_event.resource_name,"
                + "  change_event.change_date_time,"
                + "  change_event.change_resource_name,"
                + "  change_event.user_email,"
                + "  change_event.client_type,"
                + "  change_event.change_resource_type,"
                + "  change_event.old_resource,"
                + "  change_event.new_resource,"
                + "  change_event.resource_change_operation,"
                + "  change_event.changed_fields "
                + "FROM "
                + "  change_event "
                + "WHERE "
                + "  change_event.change_date_time <= '%s' "
                + "  AND change_event.change_date_time >= '%s' "
                + "ORDER BY"
                + "  change_event.change_date_time DESC "
                + "LIMIT 5",
            LocalDate.now().toString("YYYY-MM-dd"),
            LocalDate.now().minusDays(14).toString("YYYY-MM-dd"));

    // Creates a GoogleAdsServiceClient instance.
    try (GoogleAdsServiceClient client =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Issues the search query.
      SearchPagedResponse response = client.search(String.valueOf(customerId), query);

      // Processes the rows of the response.
      for (GoogleAdsRow row : response.iterateAll()) {
        ChangeEvent event = row.getChangeEvent();

        // Prints some general information about the change event.
        System.out.printf(
            "On '%s', user '%s' used interface '%s' to perform a(n) '%s' operation on a '%s' with"
                + " resource name '%s'.%n",
            event.getChangeDateTime(),
            event.getUserEmail(),
            event.getClientType(),
            event.getResourceChangeOperation(),
            event.getChangeResourceType(),
            event.getResourceName());

        // Prints some detailed information about update and create operations.
        if (event.getResourceChangeOperation() == ResourceChangeOperation.UPDATE
            || event.getResourceChangeOperation() == ResourceChangeOperation.CREATE) {
          // Retrieves the entity that was changed.
          Optional<Message> oldResource =
              getResourceByType(event.getOldResource(), event.getChangeResourceType());
          Optional<Message> newResource =
              getResourceByType(event.getNewResource(), event.getChangeResourceType());

          // Prints the old and new values for each field that was updated/created.
          for (String changedPath : row.getChangeEvent().getChangedFields().getPathsList()) {
            // Uses the FieldMasks utility to retrieve a value from a . delimited path.
            List<? extends Object> oldValue =
                oldResource.isPresent()
                    ? FieldMasks.getFieldValue(changedPath, oldResource.get())
                    : Collections.emptyList();
            List<? extends Object> newValue =
                newResource.isPresent()
                    ? FieldMasks.getFieldValue(changedPath, newResource.get())
                    : Collections.emptyList();
            // Prints different messages for UPDATE and CREATE cases.
            if (event.getResourceChangeOperation() == ResourceChangeOperation.UPDATE) {
              System.out.printf("\t %s changed from %s to %s.%n", changedPath, oldValue, newValue);
            } else if (event.getResourceChangeOperation() == ResourceChangeOperation.CREATE) {
              System.out.printf("\t %s set to %s.%n", changedPath, newValue);
            }
          }
        }
      }
    }
  }
  // [END get_change_details]

  /** Retrieves the resource from a {@link ChangeEvent.ChangedResource} instance. */
  private Optional<Message> getResourceByType(
      ChangedResource resource, ChangeEventResourceType type) {
    switch (type) {
      case AD:
        return Optional.of(resource.getAd());
      case AD_GROUP:
        return Optional.of(resource.getAdGroup());
      case AD_GROUP_CRITERION:
        return Optional.of(resource.getAdGroupCriterion());
      case AD_GROUP_BID_MODIFIER:
        return Optional.of(resource.getAdGroupBidModifier());
      case AD_GROUP_ASSET:
        return Optional.of(resource.getAdGroupAsset());
      case ASSET:
        return Optional.of(resource.getAsset());
      case ASSET_SET:
        return Optional.of(resource.getAssetSet());
      case ASSET_SET_ASSET:
        return Optional.of(resource.getAssetSetAsset());
      case CAMPAIGN:
        return Optional.of(resource.getCampaign());
      case CAMPAIGN_ASSET:
        return Optional.of(resource.getCampaignAsset());
      case CAMPAIGN_ASSET_SET:
        return Optional.of(resource.getCampaignAssetSet());
      case CAMPAIGN_BUDGET:
        return Optional.of(resource.getCampaignBudget());
      case CAMPAIGN_CRITERION:
        return Optional.of(resource.getCampaignCriterion());
      case CUSTOMER_ASSET:
        return Optional.of(resource.getCustomerAsset());
      case AD_GROUP_FEED:
        return Optional.of(resource.getAdGroupFeed());
      case CAMPAIGN_FEED:
        return Optional.of(resource.getCampaignFeed());
      case FEED:
        return Optional.of(resource.getFeed());
      case FEED_ITEM:
        return Optional.of(resource.getFeedItem());
      default:
        System.out.println("Unknown entity type: " + type);
        return Optional.empty();
    }
  }
}

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

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v5.errors.GoogleAdsError;
import com.google.ads.googleads.v5.errors.GoogleAdsException;
import com.google.ads.googleads.v5.resources.ExtensionFeedItem;
import com.google.ads.googleads.v5.services.ExtensionFeedItemOperation;
import com.google.ads.googleads.v5.services.ExtensionFeedItemServiceClient;
import com.google.ads.googleads.v5.services.MutateExtensionFeedItemsResponse;
import com.google.ads.googleads.v5.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Adds a geo target to an extension feed item for targeting. */
public class AddGeoTarget {

  // A list of country codes can be referenced here:
  // https://developers.google.com/adwords/api/docs/appendix/geotargeting
  private static long GEO_TARGET_CONSTANT_ID = 2840L; // US

  private static class AddGeoTargetParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.FEED_ITEM_ID, required = true)
    private Long feedItemId;

    @Parameter(names = ArgumentNames.GEO_TARGET_CONSTANT_ID)
    private Long geoTargetConstantId;
  }

  public static void main(String[] args) {
    AddGeoTargetParams params = new AddGeoTargetParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.feedItemId = Long.parseLong("INSERT_FEED_ID_HERE");

      // Optional: Specify a geoTargetConstantId.
      params.geoTargetConstantId = GEO_TARGET_CONSTANT_ID;
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
      new AddGeoTarget()
          .runExample(
              googleAdsClient, params.customerId, params.feedItemId, params.geoTargetConstantId);
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
  ;

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param feedItemId the feed item ID.
   * @param geoTargetConstantId the geo target constant ID to add to the extension feed item.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, long feedItemId, long geoTargetConstantId) {
    // Creates an extension feed item using the specified feed item ID and geo target constant
    // ID for targeting.
    ExtensionFeedItem extensionFeedItem =
        ExtensionFeedItem.newBuilder()
            .setResourceName(ResourceNames.extensionFeedItem(customerId, feedItemId))
            .setTargetedGeoTargetConstant(
                StringValue.of(ResourceNames.geoTargetConstant(geoTargetConstantId)))
            .build();

    // Constructs an operation that will update the extension feed item, using the FieldMasks
    // utility to derive the update mask. This mask tells the Google Ads API which attributes of
    // the extension feed item you want to change.
    ExtensionFeedItemOperation extensionFeedItemOperation =
        ExtensionFeedItemOperation.newBuilder()
            .setUpdate(extensionFeedItem)
            .setUpdateMask(FieldMasks.allSetFieldsOf(extensionFeedItem))
            .build();

    // Creates the service client.
    try (ExtensionFeedItemServiceClient extensionFeedItemServiceClient =
        googleAdsClient.getLatestVersion().createExtensionFeedItemServiceClient()) {
      // Issues a mutate request to update the extension feed item.
      MutateExtensionFeedItemsResponse response =
          extensionFeedItemServiceClient.mutateExtensionFeedItems(
              Long.toString(customerId), ImmutableList.of(extensionFeedItemOperation));

      // Prints the resource name of the updated extension feed item.
      System.out.printf(
          "Updated feed item with resource name '%s'.%n", response.getResults(0).getResourceName());
    }
  }
}

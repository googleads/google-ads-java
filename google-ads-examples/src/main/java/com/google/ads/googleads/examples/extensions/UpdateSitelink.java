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
import com.google.ads.googleads.v14.common.SitelinkFeedItem;
import com.google.ads.googleads.v14.errors.GoogleAdsError;
import com.google.ads.googleads.v14.errors.GoogleAdsException;
import com.google.ads.googleads.v14.resources.ExtensionFeedItem;
import com.google.ads.googleads.v14.services.ExtensionFeedItemOperation;
import com.google.ads.googleads.v14.services.ExtensionFeedItemServiceClient;
import com.google.ads.googleads.v14.services.MutateExtensionFeedItemResult;
import com.google.ads.googleads.v14.services.MutateExtensionFeedItemsResponse;
import com.google.ads.googleads.v14.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Updates a sitelink extension feed item {@code SitelinkFeedItem} with the specified link text. */
public class UpdateSitelink {

  private static class UpdateSitelinkParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.FEED_ITEM_ID, required = true)
    private Long feedItemId;

    @Parameter(names = ArgumentNames.SITELINK_TEXT, required = true)
    private String sitelinkText;
  }

  public static void main(String[] args) {
    UpdateSitelinkParams params = new UpdateSitelinkParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.feedItemId = Long.parseLong("INSERT_FEED_ITEM_ID_HERE");
      params.sitelinkText = "INSERT_SITELINK_TEXT_HERE";
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
      new UpdateSitelink()
          .runExample(googleAdsClient, params.customerId, params.feedItemId, params.sitelinkText);
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
   * @param feedItemId the ID of the feed item to update.
   * @param sitelinkText the new sitelink text to update to.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START update_sitelink]
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, long feedItemId, String sitelinkText) {
    try (ExtensionFeedItemServiceClient extensionFeedItemServiceClient =
        googleAdsClient.getLatestVersion().createExtensionFeedItemServiceClient()) {
      // Creates an extension feed item using the specified feed item ID and sitelink text.
      ExtensionFeedItem extensionFeedItem =
          ExtensionFeedItem.newBuilder()
              .setResourceName(ResourceNames.extensionFeedItem(customerId, feedItemId))
              .setSitelinkFeedItem(SitelinkFeedItem.newBuilder().setLinkText(sitelinkText).build())
              .build();
      // Constructs an operation that will update the extension feed item, using the FieldMasks
      // utility to derive the update mask. This mask tells the Google Ads API which attributes of
      // the extension feed item you want to change.
      ExtensionFeedItemOperation operation =
          ExtensionFeedItemOperation.newBuilder()
              .setUpdate(extensionFeedItem)
              .setUpdateMask(FieldMasks.allSetFieldsOf(extensionFeedItem))
              .build();
      // Sends the operation in a mutate request.
      MutateExtensionFeedItemsResponse response =
          extensionFeedItemServiceClient.mutateExtensionFeedItems(
              Long.toString(customerId), ImmutableList.of(operation));
      // Prints the resource name of each updated object.
      for (MutateExtensionFeedItemResult mutateExtensionFeedItemResult :
          response.getResultsList()) {
        System.out.printf(
            "Updated extension feed item with the resource name: '%s'.%n",
            mutateExtensionFeedItemResult.getResourceName());
      }
    }
  }
  // [END update_sitelink]
}

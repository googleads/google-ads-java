// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
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
import com.google.ads.googleads.v6.enums.ExtensionTypeEnum.ExtensionType;
import com.google.ads.googleads.v6.errors.GoogleAdsError;
import com.google.ads.googleads.v6.errors.GoogleAdsException;
import com.google.ads.googleads.v6.services.CampaignExtensionSettingOperation;
import com.google.ads.googleads.v6.services.ExtensionFeedItemOperation;
import com.google.ads.googleads.v6.services.GoogleAdsRow;
import com.google.ads.googleads.v6.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v6.services.MutateGoogleAdsResponse;
import com.google.ads.googleads.v6.services.MutateOperation;
import com.google.ads.googleads.v6.services.MutateOperationResponse;
import com.google.ads.googleads.v6.services.SearchGoogleAdsStreamRequest;
import com.google.ads.googleads.v6.services.SearchGoogleAdsStreamResponse;
import com.google.ads.googleads.v6.utils.ResourceNames;
import com.google.api.gax.rpc.ServerStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Removes the entire sitelink campaign extension setting by removing both the sitelink campaign
 * extension setting itself and its associated sitelink extension feed items. This requires two
 * steps, since removing the campaign extension setting doesn't automatically remove its extension
 * feed items.
 *
 * <p>To make this example work with other types of extensions, find `ExtensionType::SITELINK` and
 * replace it with the extension type you wish to remove.
 */
public class RemoveEntireSitelinkCampaignExtensionSetting {

  private static class RemoveEntireSitelinkCampaignExtensionSettingParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private long campaignId;
  }

  public static void main(String[] args) {
    RemoveEntireSitelinkCampaignExtensionSettingParams params =
        new RemoveEntireSitelinkCampaignExtensionSettingParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
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
      new RemoveEntireSitelinkCampaignExtensionSetting()
          .runExample(googleAdsClient, params.customerId, params.campaignId);
    } catch (GoogleAdsException gae) {
      // GoogleAdsException is the base class for most exceptions thrown by an API request.
      // Instances of this exception have a message and a GoogleAdsFailure that contains a
      // collection of GoogleAdsErrors that indicate the underlying causes of the
      // GoogleAdsException.
      gae.printStackTrace();
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
  // [START RemoveEntireSitelinkCampaignExtensionSetting]
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long campaignId) {
    // Creates an operation to remove a campaign extension setting.
    CampaignExtensionSettingOperation extensionSettingOperation =
        CampaignExtensionSettingOperation.newBuilder()
            .setRemove(
                ResourceNames.campaignExtensionSetting(
                    customerId, campaignId, ExtensionType.SITELINK))
            .build();

    // Retrieves all sitelink extension feed items for a customer and campaign.
    List<String> extensionFeedItemResourceNames =
        getSitelinkExtensionFeedItems(googleAdsClient, customerId, campaignId);

    // Constructs operations to remove the extension feed item operations.
    List<MutateOperation> extensionFeedItemOperations =
        extensionFeedItemResourceNames.stream()
            .map(
                feedItem ->
                    MutateOperation.newBuilder()
                        .setExtensionFeedItemOperation(
                            ExtensionFeedItemOperation.newBuilder().setRemove(feedItem))
                        .build())
            .collect(Collectors.toList());

    // Creates a list of operations that contains both the campaign extension setting and the feed
    // item operations.
    List<MutateOperation> allOperations = new ArrayList();
    allOperations.add(
        MutateOperation.newBuilder()
            .setCampaignExtensionSettingOperation(extensionSettingOperation)
            .build());
    allOperations.addAll(extensionFeedItemOperations);

    // Connects to the API.
    try (GoogleAdsServiceClient client =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Issues the request.
      MutateGoogleAdsResponse response = client.mutate(String.valueOf(customerId), allOperations);

      // Prints the result of removing the campaign extension setting.
      // Each mutate operation response is returned in the same order as we passed its
      // corresponding operation. Therefore, the first belongs to the campaign setting operation,
      // and the rest belong to the extension feed item operations.
      System.out.printf(
          "Removed a campaign extension setting with resource name: '%s'.%n",
          response
              .getMutateOperationResponses(0)
              .getCampaignExtensionSettingResult()
              .getResourceName());

      // Prints the result of removing the extension feed items.
      for (MutateOperationResponse mutateResponse :
          response
              .getMutateOperationResponsesList()
              .subList(1, response.getMutateOperationResponsesList().size())) {
        System.out.printf(
            "Removed an extension feed item with resource name: '%s'.%n",
            mutateResponse.getExtensionFeedItemResult().getResourceName());
      }
    }
  }
  // [END RemoveEntireSitelinkCampaignExtensionSetting]

  /** Retrieves all sitelink extension feed items for a customer + campaign combination. */
  // [START RemoveEntireSitelinkCampaignExtensionSetting_1]
  private List<String> getSitelinkExtensionFeedItems(
      GoogleAdsClient googleAdsClient, long customerId, long campaignId) {
    // Defines a query to retrieve the sitelink extension feed items.
    String query =
        String.format(
            "SELECT campaign_extension_setting.campaign, "
                + "  campaign_extension_setting.extension_type, "
                + "  campaign_extension_setting.extension_feed_items "
                + "FROM "
                + "  campaign_extension_setting "
                + "WHERE "
                + "  campaign_extension_setting.campaign = '%s' "
                + "  AND campaign_extension_setting.extension_type = SITELINK",
            ResourceNames.campaign(customerId, campaignId));
    // Connects to the API.
    try (GoogleAdsServiceClient client =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Issues the search request.
      ServerStream<SearchGoogleAdsStreamResponse> response =
          client
              .searchStreamCallable()
              .call(
                  SearchGoogleAdsStreamRequest.newBuilder()
                      .setCustomerId(String.valueOf(customerId))
                      .setQuery(query)
                      .build());

      // Constructs the result (a list of resource names matching the query).
      List<String> result = new ArrayList();
      for (SearchGoogleAdsStreamResponse page : response) {
        for (GoogleAdsRow row : page.getResultsList()) {
          result.addAll(row.getCampaignExtensionSetting().getExtensionFeedItemsList());
        }
      }
      if (result.isEmpty()) {
        System.out.println(
            "The specified campaign does not contain a sitelink campaign extension setting.");
      }
      return result;
    }
  }
  // [END RemoveEntireSitelinkCampaignExtensionSetting_1]
}

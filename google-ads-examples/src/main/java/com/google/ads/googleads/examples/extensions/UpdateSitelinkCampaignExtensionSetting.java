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
import com.google.ads.googleads.v6.enums.ExtensionTypeEnum.ExtensionType;
import com.google.ads.googleads.v6.errors.GoogleAdsError;
import com.google.ads.googleads.v6.errors.GoogleAdsException;
import com.google.ads.googleads.v6.resources.CampaignExtensionSetting;
import com.google.ads.googleads.v6.services.CampaignExtensionSettingOperation;
import com.google.ads.googleads.v6.services.CampaignExtensionSettingServiceClient;
import com.google.ads.googleads.v6.services.MutateCampaignExtensionSettingsResponse;
import com.google.ads.googleads.v6.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Updates the sitelink campaign extension setting to replace its extension feed items. Note that
 * this doesn't completely remove your old extension feed items.
 *
 * <p>See https://developers.google.com/google-ads/api/docs/extensions/extension-settings/overview
 * for details.
 */
public class UpdateSitelinkCampaignExtensionSetting {

  private static class UpdateSitelinkCampaignExtensionSettingParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private long campaignId;

    @Parameter(names = ArgumentNames.FEED_ITEM_IDS, required = true)
    private List<Long> feedItemIds;
  }

  public static void main(String[] args) {
    UpdateSitelinkCampaignExtensionSettingParams params =
        new UpdateSitelinkCampaignExtensionSettingParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
      params.feedItemIds = ImmutableList.of(Long.parseLong("INSERT_FEED_ITEM_ID_HERE"));
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
      new UpdateSitelinkCampaignExtensionSetting()
          .runExample(googleAdsClient, params.customerId, params.campaignId, params.feedItemIds);
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
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, long campaignId, List<Long> feedItemIds) {
    // Converts the feed item IDs into resource names.
    List<String> feedItemResourceNames =
        feedItemIds.stream()
            .map(id -> ResourceNames.extensionFeedItem(customerId, id))
            .collect(Collectors.toList());

    // Creates a CampaignExtensionSetting object to update.
    CampaignExtensionSetting campaignExtensionSetting =
        CampaignExtensionSetting.newBuilder()
            .setResourceName(
                ResourceNames.campaignExtensionSetting(
                    customerId, campaignId, ExtensionType.SITELINK))
            .addAllExtensionFeedItems(feedItemResourceNames)
            .build();

    // Creates an operation to update CampaignExtensionSetting.
    CampaignExtensionSettingOperation operation =
        CampaignExtensionSettingOperation.newBuilder()
            .setUpdate(campaignExtensionSetting)
            .setUpdateMask(FieldMasks.allSetFieldsOf(campaignExtensionSetting))
            .build();

    // Connects to the API.
    try (CampaignExtensionSettingServiceClient client =
        googleAdsClient.getLatestVersion().createCampaignExtensionSettingServiceClient()) {
      // Issues the mutate request.
      MutateCampaignExtensionSettingsResponse response =
          client.mutateCampaignExtensionSettings(
              String.valueOf(customerId), ImmutableList.of(operation));

      // Prints some debugging information.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf(
          "Updated a campaign extension setting with resource name: '%s'.%n", resourceName);
    }
  }
}

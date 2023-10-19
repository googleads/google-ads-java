// Copyright 2021 Google LLC
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
import com.google.ads.googleads.v15.common.ImageFeedItem;
import com.google.ads.googleads.v15.enums.ExtensionTypeEnum.ExtensionType;
import com.google.ads.googleads.v15.errors.GoogleAdsError;
import com.google.ads.googleads.v15.errors.GoogleAdsException;
import com.google.ads.googleads.v15.resources.Asset;
import com.google.ads.googleads.v15.resources.CampaignExtensionSetting;
import com.google.ads.googleads.v15.resources.ExtensionFeedItem;
import com.google.ads.googleads.v15.services.CampaignExtensionSettingOperation;
import com.google.ads.googleads.v15.services.CampaignExtensionSettingServiceClient;
import com.google.ads.googleads.v15.services.ExtensionFeedItemOperation;
import com.google.ads.googleads.v15.services.ExtensionFeedItemServiceClient;
import com.google.ads.googleads.v15.services.MutateCampaignExtensionSettingResult;
import com.google.ads.googleads.v15.services.MutateCampaignExtensionSettingsResponse;
import com.google.ads.googleads.v15.services.MutateExtensionFeedItemsResponse;
import com.google.ads.googleads.v15.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Adds an image extension to a campaign. To create a campaign, run AddCampaigns.java. To create an
 * image asset, run UploadImageAsset.java.
 */
public class AddImageExtension {

  private static class AddImageExtensionParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private long campaignId;

    @Parameter(names = ArgumentNames.IMAGE_ASSET_ID, required = true)
    private long imageAssetId;
  }

  public static void main(String[] args) {
    AddImageExtensionParams params = new AddImageExtensionParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
      params.imageAssetId = Long.parseLong("INSERT_IMAGE_ASSET_ID_HERE");
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
      new AddImageExtension()
          .runExample(googleAdsClient, params.customerId, params.campaignId, params.imageAssetId);
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
      GoogleAdsClient googleAdsClient, long customerId, long campaignId, long imageAssetId) {
    // Creates an image ExtensionFeedItem.
    String imageExtensionResourceName =
        createImageExtensionFeedItem(googleAdsClient, customerId, imageAssetId);

    // Creates a CampaignExtensionSetting for the image ExtensionFeedItem.
    CampaignExtensionSetting campaignExtensionSetting =
        CampaignExtensionSetting.newBuilder()
            .setCampaign(ResourceNames.campaign(customerId, campaignId))
            .setExtensionType(ExtensionType.IMAGE)
            .addExtensionFeedItems(imageExtensionResourceName)
            .build();

    // Creates an operation to add the CampaignExtensionSetting.
    CampaignExtensionSettingOperation operation =
        CampaignExtensionSettingOperation.newBuilder().setCreate(campaignExtensionSetting).build();

    // Creates a CampaignExtensionSettingServiceClient.
    try (CampaignExtensionSettingServiceClient client =
        googleAdsClient.getLatestVersion().createCampaignExtensionSettingServiceClient()) {
      // Issues the mutate request.
      MutateCampaignExtensionSettingsResponse response =
          client.mutateCampaignExtensionSettings(
              String.valueOf(customerId), ImmutableList.of(operation));

      // Prints some information about the result.
      for (MutateCampaignExtensionSettingResult result : response.getResultsList()) {
        System.out.printf(
            "Created campaign extension setting with resource name '%s'.%n",
            result.getResourceName());
      }
    }
  }

  /** Creates an image extension from an (image) {@link Asset}. */
  private String createImageExtensionFeedItem(
      GoogleAdsClient googleAdsClient, long customerId, long imageAssetId) {
    // Creates an image feed item containing the asset.
    ImageFeedItem imageFeedItem =
        ImageFeedItem.newBuilder()
            .setImageAsset(ResourceNames.asset(customerId, imageAssetId))
            .build();

    // Creates an extension feed item for the ImageFeedItem.
    ExtensionFeedItem extensionFeedItem =
        ExtensionFeedItem.newBuilder().setImageFeedItem(imageFeedItem).build();

    // Creates an operation to add the ExtensionFeedItem.
    ExtensionFeedItemOperation operation =
        ExtensionFeedItemOperation.newBuilder().setCreate(extensionFeedItem).build();

    // Creates an ExtensionFeedItemServiceClient.
    try (ExtensionFeedItemServiceClient client =
        googleAdsClient.getLatestVersion().createExtensionFeedItemServiceClient()) {
      // Issues the mutate request.
      MutateExtensionFeedItemsResponse response =
          client.mutateExtensionFeedItems(String.valueOf(customerId), ImmutableList.of(operation));

      // Retrieves the resource name.
      return response.getResults(0).getResourceName();
    }
  }
}

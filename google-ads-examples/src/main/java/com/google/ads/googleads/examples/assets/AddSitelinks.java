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

package com.google.ads.googleads.examples.assets;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v21.common.SitelinkAsset;
import com.google.ads.googleads.v21.enums.AssetFieldTypeEnum.AssetFieldType;
import com.google.ads.googleads.v21.errors.GoogleAdsError;
import com.google.ads.googleads.v21.errors.GoogleAdsException;
import com.google.ads.googleads.v21.resources.Asset;
import com.google.ads.googleads.v21.resources.CampaignAsset;
import com.google.ads.googleads.v21.services.AssetOperation;
import com.google.ads.googleads.v21.services.AssetServiceClient;
import com.google.ads.googleads.v21.services.CampaignAssetOperation;
import com.google.ads.googleads.v21.services.CampaignAssetServiceClient;
import com.google.ads.googleads.v21.services.MutateAssetResult;
import com.google.ads.googleads.v21.services.MutateAssetsResponse;
import com.google.ads.googleads.v21.services.MutateCampaignAssetResult;
import com.google.ads.googleads.v21.services.MutateCampaignAssetsResponse;
import com.google.ads.googleads.v21.utils.ResourceNames;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/** Adds sitelinks to a campaign using Assets. To create a campaign, run AddCampaigns.java. */
public class AddSitelinks {

  private static class AddSitelinksParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;
  }

  public static void main(String[] args) {
    AddSitelinksParams params = new AddSitelinksParams();
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
      new AddSitelinks().runExample(googleAdsClient, params.customerId, params.campaignId);
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
   * @param campaignId the campaign ID on which to add the sitelinks.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long campaignId) {
    // Creates a sitelink asset.
    List<String> resourceNames = createSitelinkAssets(googleAdsClient, customerId);
    // Associates the sitelinks at the campaign level.
    linkSitelinksToCampaign(googleAdsClient, resourceNames, customerId, campaignId);
  }

  /** Creates a {@link SitelinkAsset} which can then be added to campaigns. */
  private List<String> createSitelinkAssets(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates some sitelink assets.
    SitelinkAsset storeLocatorSitelinkAsset =
        SitelinkAsset.newBuilder()
            .setDescription1("Get in touch")
            .setDescription2("Find your local store")
            .setLinkText("Store locator")
            .build();
    SitelinkAsset storeSitelinkAsset =
        SitelinkAsset.newBuilder()
            .setDescription1("Buy some stuff")
            .setDescription2("It's really good")
            .setLinkText("Store")
            .build();

    SitelinkAsset storeAdditionalSitelinkAsset =
        SitelinkAsset.newBuilder()
            .setDescription1("Even more stuff")
            .setDescription2("There's never enough")
            .setLinkText("Store for more")
            .build();
    // Wraps the sitelinks in an Asset and sets the URLs.
    List<Asset> assets = new ArrayList();
    assets.add(
        Asset.newBuilder()
            .setSitelinkAsset(storeLocatorSitelinkAsset)
            .addFinalUrls("http://example.com/contact/store-finder")
            // Optionally sets a different URL for mobile.
            .addFinalMobileUrls("http://example.com/mobile/contact/store-finder")
            .build());
    assets.add(
        Asset.newBuilder()
            .setSitelinkAsset(storeSitelinkAsset)
            .addFinalUrls("http://example.com/store")
            // Optionally sets a different URL for mobile.
            .addFinalMobileUrls("http://example.com/mobile/store")
            .build());
    assets.add(
        Asset.newBuilder()
            .setSitelinkAsset(storeAdditionalSitelinkAsset)
            .addFinalUrls("http://example.com/store/more")
            // Optionally sets a different URL for mobile.
            .addFinalMobileUrls("http://example.com/mobile/store/more")
            .build());
    // Creates an operation to add each asset.
    List<AssetOperation> operations =
        assets.stream()
            .map(a -> AssetOperation.newBuilder().setCreate(a).build())
            .collect(Collectors.toList());
    // Creates the service client.
    try (AssetServiceClient client =
        googleAdsClient.getLatestVersion().createAssetServiceClient()) {
      // Sends the mutate request.
      MutateAssetsResponse response = client.mutateAssets(String.valueOf(customerId), operations);
      // Prints some information about the result.
      List<String> resourceNames =
          response.getResultsList().stream()
              .map(MutateAssetResult::getResourceName)
              .collect(Collectors.toList());
      for (String resName : resourceNames) {
        System.out.printf("Created sitelink asset with resource name '%s'.%n", resName);
      }
      return resourceNames;
    }
  }

  /** Links the assets to a campaign. */
  private void linkSitelinksToCampaign(
      GoogleAdsClient googleAdsClient,
      List<String> sitelinkAssetResourceName,
      long customerId,
      long campaignId) {
    // Creates CampaignAssets representing the association between sitelinks and campaign.
    List<CampaignAssetOperation> campaignAssetOperations =
        sitelinkAssetResourceName.stream()
            // Creates the CampaignAsset link.
            .map(
                resName ->
                    CampaignAsset.newBuilder()
                        .setAsset(resName)
                        .setCampaign(ResourceNames.campaign(customerId, campaignId))
                        .setFieldType(AssetFieldType.SITELINK)
                        .build())
            // Creates a CampaignAssetOperation to create the CampaignAsset.
            .map(a -> CampaignAssetOperation.newBuilder().setCreate(a).build())
            .collect(Collectors.toList());
    // Creates the service client.
    try (CampaignAssetServiceClient client =
        googleAdsClient.getLatestVersion().createCampaignAssetServiceClient()) {
      // Sends the mutate request.
      MutateCampaignAssetsResponse response =
          client.mutateCampaignAssets(String.valueOf(customerId), campaignAssetOperations);
      // Prints some information about the result.
      for (MutateCampaignAssetResult result : response.getResultsList()) {
        System.out.printf(
            "Linked sitelink to campaign with resource name '%s'.%n", result.getResourceName());
      }
    }
  }
}

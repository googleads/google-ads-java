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

package com.google.ads.googleads.examples.remarketing;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleHelper;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v11.common.DynamicEducationAsset;
import com.google.ads.googleads.v11.enums.AssetSetTypeEnum.AssetSetType;
import com.google.ads.googleads.v11.errors.GoogleAdsError;
import com.google.ads.googleads.v11.errors.GoogleAdsException;
import com.google.ads.googleads.v11.resources.Asset;
import com.google.ads.googleads.v11.resources.AssetSet;
import com.google.ads.googleads.v11.resources.AssetSetAsset;
import com.google.ads.googleads.v11.resources.CampaignAssetSet;
import com.google.ads.googleads.v11.services.AssetOperation;
import com.google.ads.googleads.v11.services.AssetServiceClient;
import com.google.ads.googleads.v11.services.AssetSetAssetOperation;
import com.google.ads.googleads.v11.services.AssetSetAssetServiceClient;
import com.google.ads.googleads.v11.services.AssetSetOperation;
import com.google.ads.googleads.v11.services.AssetSetServiceClient;
import com.google.ads.googleads.v11.services.CampaignAssetSetOperation;
import com.google.ads.googleads.v11.services.CampaignAssetSetServiceClient;
import com.google.ads.googleads.v11.services.MutateAssetSetAssetsResponse;
import com.google.ads.googleads.v11.services.MutateAssetSetsResponse;
import com.google.ads.googleads.v11.services.MutateAssetsResponse;
import com.google.ads.googleads.v11.services.MutateCampaignAssetSetsResponse;
import com.google.ads.googleads.v11.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Adds an asset for use in dynamic remarketing. */
public class AddDynamicRemarketingAsset {

  public static class AddDynamicRemarketingAssetParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    public long customerId;

    // Specify a campaign type which supports dynamic remarketing, such as Display.
    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    public long campaignId;
  }

  public static void main(String[] args) throws IOException {
    AddDynamicRemarketingAssetParams params = new AddDynamicRemarketingAssetParams();
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
      new AddDynamicRemarketingAsset().runExample(googleAdsClient, params);
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

  /** Runs the exmaple. */
  private void runExample(
      GoogleAdsClient googleAdsClient, AddDynamicRemarketingAssetParams params) {
    // Creates an Asset.
    String assetResourceName = createAsset(googleAdsClient, params);
    // Creates an AssetSet - this is a collection of assets that can be associated with a campaign.
    // Note: do not confuse this with an AssetGroup. An AssetGroup replaces AdGroups in some types
    // of campaigns.
    String assetSetResourceName = createAssetSet(googleAdsClient, params);
    // Adds the Asset to the AssetSet.
    addAssetsToAssetSet(googleAdsClient, assetResourceName, assetSetResourceName, params);
    // Finally links the AssetSet to the Campaign.
    linkAssetSetToCampaign(googleAdsClient, assetSetResourceName, params);
  }

  /** Creates an Asset to use in dynamic remarketing. */
  private String createAsset(
      GoogleAdsClient googleAdsClient, AddDynamicRemarketingAssetParams params) {
    // [START add_asset]
    // Creates a DynamicEducationAsset.
    // See https://support.google.com/google-ads/answer/6053288?#zippy=%2Ceducation for a
    // detailed explanation of the field format.
    DynamicEducationAsset educationAsset =
        DynamicEducationAsset.newBuilder()
            // Defines meta-information about the school and program.
            .setSchoolName("The University of Unknown")
            .setAddress("Building 1, New York, 12345, USA")
            .setProgramName("BSc. Computer Science")
            .setSubject("Computer Science")
            .setProgramDescription("Slinging code for fun and profit!")
            // Sets up the program ID which is the ID that should be specified in the tracking
            // pixel.
            .setProgramId("bsc-cs-uofu")
            // Sets up the location ID which may additionally be specified in the tracking pixel.
            .setLocationId("nyc")
            .setImageUrl("https://gaagl.page.link/Eit5")
            .setAndroidAppLink("android-app://com.example.android/http/example.com/gizmos?1234")
            .setIosAppLink("exampleApp://content/page")
            .setIosAppStoreId(123L)
            .build();
    Asset asset =
        Asset.newBuilder()
            .setDynamicEducationAsset(educationAsset)
            .addFinalUrls("https://www.example.com")
            .build();
    // Creates an operation to add the asset.
    AssetOperation operation = AssetOperation.newBuilder().setCreate(asset).build();
    // Connects to the API.
    try (AssetServiceClient client =
        googleAdsClient.getLatestVersion().createAssetServiceClient()) {
      // Sends the mutate request.
      MutateAssetsResponse response =
          client.mutateAssets(String.valueOf(params.customerId), ImmutableList.of(operation));
      // Prints some information about the response.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Created a dynamic education asset with resource name %s.%n", resourceName);
      return resourceName;
    }
    // [END add_asset]
  }

  /** Creates an AssetSet. */
  private String createAssetSet(
      GoogleAdsClient googleAdsClient, AddDynamicRemarketingAssetParams params) {
    // [START add_asset_set]
    // Creates an AssetSet which will be used to link the dynamic remarketing assets to a campaign.
    AssetSet assetSet =
        AssetSet.newBuilder()
            .setName("My dynamic remarketing assets " + CodeSampleHelper.getPrintableDateTime())
            .setType(AssetSetType.DYNAMIC_EDUCATION)
            .build();
    // Creates an operation to add the link.
    AssetSetOperation operation = AssetSetOperation.newBuilder().setCreate(assetSet).build();
    try (AssetSetServiceClient serviceClient =
        googleAdsClient.getLatestVersion().createAssetSetServiceClient()) {
      // Sends the mutate request.
      MutateAssetSetsResponse response =
          serviceClient.mutateAssetSets(
              String.valueOf(params.customerId), ImmutableList.of(operation));
      // Prints some information about the response.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Created asset set with resource name %s.%n", resourceName);
      return resourceName;
    }
    // [END add_asset_set]
  }

  /** Adds an Asset to an AssetSet by creating an AssetSetAsset link. */
  private void addAssetsToAssetSet(
      GoogleAdsClient googleAdsClient,
      String assetResourceName,
      String assetSetResourceName,
      AddDynamicRemarketingAssetParams params) {
    // [START add_asset_set_asset]
    AssetSetAsset assetSetAsset =
        AssetSetAsset.newBuilder()
            .setAsset(assetResourceName)
            .setAssetSet(assetSetResourceName)
            .build();
    // Creates an operation to add the link.
    AssetSetAssetOperation operation =
        AssetSetAssetOperation.newBuilder().setCreate(assetSetAsset).build();
    try (AssetSetAssetServiceClient client =
        googleAdsClient.getLatestVersion().createAssetSetAssetServiceClient()) {
      // Sends the mutate request.
      // Note this is the point that the API will enforce uniqueness of the
      // DynamicEducationAsset.product_id field. You can have any number of assets with the same
      // product_id, however, only one Asset is allowed per AssetSet with the same product ID.
      MutateAssetSetAssetsResponse response =
          client.mutateAssetSetAssets(
              String.valueOf(params.customerId), ImmutableList.of(operation));
      // Prints some information about the response.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Created AssetSetAsset link with resource name %s.%n", resourceName);
    }
    // [END add_asset_set_asset]
  }

  /** Links an AssetSet to Campaign by creating a CampaignAssetSet. */
  private void linkAssetSetToCampaign(
      GoogleAdsClient googleAdsClient,
      String assetSetResourceName,
      AddDynamicRemarketingAssetParams params) {
    // [START add_campaign_asset_set]
    // Creates a CampaignAssetSet representing the link between an AssetSet and a Campaign.
    CampaignAssetSet campaignAssetSet =
        CampaignAssetSet.newBuilder()
            .setCampaign(ResourceNames.campaign(params.customerId, params.campaignId))
            .setAssetSet(assetSetResourceName)
            .build();
    // Creates an operation to add the CampaignAssetSet.
    CampaignAssetSetOperation operation =
        CampaignAssetSetOperation.newBuilder().setCreate(campaignAssetSet).build();
    // Creates an API connection.
    try (CampaignAssetSetServiceClient client =
        googleAdsClient.getLatestVersion().createCampaignAssetSetServiceClient()) {
      // Issues the mutate request.
      MutateCampaignAssetSetsResponse response =
          client.mutateCampaignAssetSets(
              String.valueOf(params.customerId), ImmutableList.of(operation));
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Created a CampaignAssetSet with resource name %s.%n", resourceName);
    }
    // [END add_campaign_asset_set]
  }
}

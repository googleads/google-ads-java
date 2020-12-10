//
// Copyright 2020 Google LLC
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

package com.google.ads.googleads.examples.misc;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v6.common.ImageAsset;
import com.google.ads.googleads.v6.enums.AssetTypeEnum.AssetType;
import com.google.ads.googleads.v6.errors.GoogleAdsError;
import com.google.ads.googleads.v6.errors.GoogleAdsException;
import com.google.ads.googleads.v6.resources.Asset;
import com.google.ads.googleads.v6.services.AssetOperation;
import com.google.ads.googleads.v6.services.AssetServiceClient;
import com.google.ads.googleads.v6.services.MutateAssetsResponse;
import com.google.common.collect.ImmutableList;
import com.google.common.io.ByteStreams;
import com.google.protobuf.ByteString;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

/** Uploads an image asset. To get image assets, run GetAllImageAssets.java */
public class UploadImageAsset {

  private static final String IMAGE_URL = "https://goo.gl/3b9Wfh";

  private static class UploadImageAssetParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) throws IOException {
    UploadImageAssetParams params = new UploadImageAssetParams();
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
      new UploadImageAsset().runExample(googleAdsClient, params.customerId);
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
   * @throws IOException if there are errors related to image processing.
   */
  // [START UploadImageAsset]
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) throws IOException {
    byte[] imageData = ByteStreams.toByteArray(new URL(IMAGE_URL).openStream());

    // Create the image asset.
    ImageAsset imageAsset = ImageAsset.newBuilder().setData(ByteString.copyFrom(imageData)).build();

    // Creates an asset.
    Asset asset =
        Asset.newBuilder()
            // Optional: Provide a unique friendly name to identify your asset.
            // If you specify the name field, then both the asset name and the image being
            // uploaded should be unique, and should not match another ACTIVE asset in this
            // customer account.
            // .setName("Jupiter Trip # " + getPrintableDatetime())
            .setType(AssetType.IMAGE)
            .setImageAsset(imageAsset)
            .build();

    // Creates the operation.
    AssetOperation operation = AssetOperation.newBuilder().setCreate(asset).build();

    // Creates the service client.
    try (AssetServiceClient assetServiceClient =
        googleAdsClient.getLatestVersion().createAssetServiceClient()) {
      // Issues a mutate request to add the asset.
      MutateAssetsResponse response =
          assetServiceClient.mutateAssets(Long.toString(customerId), ImmutableList.of(operation));
      // Prints the result.
      System.out.printf(
          "The image asset with resource name '%s' was created.%n",
          response.getResults(0).getResourceName());
    }
  }
  // [END UploadImageAsset]
}

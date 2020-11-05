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

package com.google.ads.googleads.examples.advancedoperations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v5.common.AdMediaBundleAsset;
import com.google.ads.googleads.v5.common.DisplayUploadAdInfo;
import com.google.ads.googleads.v5.common.MediaBundleAsset;
import com.google.ads.googleads.v5.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v5.enums.AssetTypeEnum.AssetType;
import com.google.ads.googleads.v5.enums.DisplayUploadProductTypeEnum.DisplayUploadProductType;
import com.google.ads.googleads.v5.errors.GoogleAdsError;
import com.google.ads.googleads.v5.errors.GoogleAdsException;
import com.google.ads.googleads.v5.resources.Ad;
import com.google.ads.googleads.v5.resources.AdGroupAd;
import com.google.ads.googleads.v5.resources.Asset;
import com.google.ads.googleads.v5.services.AdGroupAdOperation;
import com.google.ads.googleads.v5.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v5.services.AssetOperation;
import com.google.ads.googleads.v5.services.AssetServiceClient;
import com.google.ads.googleads.v5.services.MutateAdGroupAdsResponse;
import com.google.ads.googleads.v5.services.MutateAssetsResponse;
import com.google.ads.googleads.v5.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import com.google.common.io.ByteStreams;
import com.google.protobuf.ByteString;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

/** Adds a display upload ad to a given ad group. To get ad groups, run GetAdGroups.java. */
public class AddDisplayUploadAd {

  private static final String BUNDLE_URL = "https://goo.gl/9Y7qI2";

  private static class AddDisplayUploadAdParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
  }

  public static void main(String[] args) throws IOException {
    AddDisplayUploadAdParams params = new AddDisplayUploadAdParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
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
      new AddDisplayUploadAd().runExample(googleAdsClient, params.customerId, params.adGroupId);
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
   * @param adGroupId the ad group ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long adGroupId)
      throws IOException {
    // There are several types of display upload ads. For this example, we will create
    // an HTML5 upload ad, which requires a media bundle.
    // The DisplayUploadProductType field lists the available display upload types:
    // https://developers.google.com/google-ads/api/reference/rpc/v4/DisplayUploadAdInfo

    // Creates a new media bundle asset and returns the resource name.
    String adAssetResourceName = createMediaBundleAsset(googleAdsClient, customerId);

    // Creates a new display upload ad and associates it with the specified ad group.
    createDisplayUploadAdGroupAd(googleAdsClient, customerId, adGroupId, adAssetResourceName);
  }

  /**
   * Creates a media bundle from the assets in a zip file. The zip file contains the HTML5
   * components.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @return the resource name of the newly created media bundle.
   * @throws IOException if there is an error reading the media bundle.
   */
  private String createMediaBundleAsset(GoogleAdsClient googleAdsClient, long customerId)
      throws IOException {
    // The HTML5 zip file contains all the HTML, CSS, and images needed for the
    // HTML5 ad. For help on creating an HTML5 zip file, check out Google Web
    // Designer (https://www.google.com/webdesigner/).
    byte[] html5Zip = ByteStreams.toByteArray(new URL(BUNDLE_URL).openStream());

    // Creates the media bundle asset.
    Asset asset =
        Asset.newBuilder()
            .setType(AssetType.MEDIA_BUNDLE)
            .setMediaBundleAsset(
                MediaBundleAsset.newBuilder().setData(ByteString.copyFrom(html5Zip)).build())
            .build();

    // Creates the asset operation.
    AssetOperation operation = AssetOperation.newBuilder().setCreate(asset).build();

    // Gets the AssetService.
    try (AssetServiceClient assetServiceClient =
        googleAdsClient.getLatestVersion().createAssetServiceClient()) {
      // Adds the asset to the client account.
      MutateAssetsResponse response =
          assetServiceClient.mutateAssets(Long.toString(customerId), ImmutableList.of(operation));
      // Displays and returns the resulting resource name.
      String uploadedAssetResourceName = response.getResults(0).getResourceName();
      System.out.printf(
          "Uploaded media bundle with resource name: '%s'.%n", uploadedAssetResourceName);
      return uploadedAssetResourceName;
    }
  }

  /**
   * Creates a new HTML5 display upload ad and adds it to the specified ad group.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupId the ad group ID.
   * @param adAssetResourceName The ID of the ad group to which the new ad will be added.
   */
  private void createDisplayUploadAdGroupAd(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long adGroupId,
      String adAssetResourceName) {
    // Creates the ad with the required fields.
    Ad displayUploadAd =
        Ad.newBuilder()
            .setName("Ad for HTML5")
            .addFinalUrls("http://example.com/html5")
            // Exactly one ad data field must be included to specify the ad type. See
            // https://developers.google.com/google-ads/api/reference/rpc/v4/Ad for the full
            // list of available types.
            .setDisplayUploadAd(
                DisplayUploadAdInfo.newBuilder()
                    .setDisplayUploadProductType(DisplayUploadProductType.HTML5_UPLOAD_AD)
                    .setMediaBundle(
                        AdMediaBundleAsset.newBuilder().setAsset(adAssetResourceName).build())
                    .build())
            .build();

    // Creates an ad group ad for the new ad.
    AdGroupAd adGroupAd =
        AdGroupAd.newBuilder()
            .setAd(displayUploadAd)
            .setStatus(AdGroupAdStatus.PAUSED)
            .setAdGroup(ResourceNames.adGroup(customerId, adGroupId))
            .build();

    // Creates the ad group ad operation.
    AdGroupAdOperation operation = AdGroupAdOperation.newBuilder().setCreate(adGroupAd).build();

    // Creates the ad group ad service client.
    try (AdGroupAdServiceClient adGroupAdServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupAdServiceClient()) {
      // Adds the ad group ad to the client account.
      MutateAdGroupAdsResponse response =
          adGroupAdServiceClient.mutateAdGroupAds(
              Long.toString(customerId), ImmutableList.of(operation));

      // Displays the resulting ad group ad's resource name.
      System.out.printf(
          "Created new ad group ad with resource name: '%s'.%n",
          response.getResults(0).getResourceName());
    }
  }
}

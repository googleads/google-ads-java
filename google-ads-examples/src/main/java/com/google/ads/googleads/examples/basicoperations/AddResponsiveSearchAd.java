// Copyright 2019 Google LLC
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

package com.google.ads.googleads.examples.basicoperations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v3.common.AdTextAsset;
import com.google.ads.googleads.v3.common.ResponsiveSearchAdInfo;
import com.google.ads.googleads.v3.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v3.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType;
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.ads.googleads.v3.resources.Ad;
import com.google.ads.googleads.v3.resources.AdGroupAd;
import com.google.ads.googleads.v3.services.AdGroupAdOperation;
import com.google.ads.googleads.v3.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v3.services.MutateAdGroupAdResult;
import com.google.ads.googleads.v3.services.MutateAdGroupAdsResponse;
import com.google.ads.googleads.v3.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Adds a responsive search ad to a given ad group. To get ad groups, run
 * GetAdGroups.java.
 */
public class AddResponsiveSearchAd {

  private static class AddResponsiveSearchAdParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
  }

  public static void main(String[] args) {
    AddResponsiveSearchAdParams params = new AddResponsiveSearchAdParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
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
      new AddResponsiveSearchAd().runExample(googleAdsClient, params.customerId, params.adGroupId);
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
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long adGroupId) {
    String adGroupResourceName = ResourceNames.adGroup(customerId, adGroupId);

    // Sets a pinning to always choose this asset for HEADLINE_1. Pinning is optional; if no
    // pinning is set, then headlines and descriptions will be rotated and the ones that
    // perform best will be used more often.
    AdTextAsset pinnedHeadline =
        AdTextAsset.newBuilder()
            .setText(StringValue.of("Cruise to Mars #" + System.currentTimeMillis()))
            .setPinnedField(ServedAssetFieldType.HEADLINE_1)
            .build();

    // Creates the responsive search ad info.
    ResponsiveSearchAdInfo responsiveSearchAdInfo =
        ResponsiveSearchAdInfo.newBuilder()
            .addHeadlines(pinnedHeadline)
            .addHeadlines(createAdTextAsset("Best Space Cruise Line"))
            .addHeadlines(createAdTextAsset("Experience the Stars"))
            .addDescriptions(createAdTextAsset("Buy your tickets now"))
            .addDescriptions(createAdTextAsset("Visit the Red Planet"))
            .setPath1(StringValue.of("all-inclusive"))
            .setPath2(StringValue.of("deals"))
            .build();

    // Wraps the info in an Ad object.
    Ad ad =
        Ad.newBuilder()
            .setResponsiveSearchAd(responsiveSearchAdInfo)
            .addFinalUrls(StringValue.of("http://www.example.com"))
            .build();

    // Builds the final ad group ad representation.
    AdGroupAd adGroupAd =
        AdGroupAd.newBuilder()
            .setAdGroup(StringValue.of(adGroupResourceName))
            .setStatus(AdGroupAdStatus.PAUSED)
            .setAd(ad)
            .build();

    // Creates the operation.
    AdGroupAdOperation operation = AdGroupAdOperation.newBuilder().setCreate(adGroupAd).build();

    // Creates the AdGroupAdServiceClient.
    try (AdGroupAdServiceClient adGroupAdServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupAdServiceClient()) {
      // Adds the AdGroup.
      MutateAdGroupAdsResponse response =
          adGroupAdServiceClient.mutateAdGroupAds(
              Long.toString(customerId), ImmutableList.of(operation));
      for (MutateAdGroupAdResult result : response.getResultsList()) {
        System.out.printf(
            "Responsive search ad created with resource name: %s.%n", result.getResourceName());
      }
    }
  }

  /**
   * Creates an AdTextAsset from a given string.
   *
   * @param text the text string to insert in the AdTextAsset.
   * @return AdTextAsset.
   */
  private AdTextAsset createAdTextAsset(String text) {
    return AdTextAsset.newBuilder().setText(StringValue.of(text)).build();
  }
}

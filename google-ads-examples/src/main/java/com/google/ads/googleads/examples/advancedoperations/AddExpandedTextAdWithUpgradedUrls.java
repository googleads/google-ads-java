// Copyright 2018 Google LLC
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
import com.google.ads.googleads.v10.common.CustomParameter;
import com.google.ads.googleads.v10.common.ExpandedTextAdInfo;
import com.google.ads.googleads.v10.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v10.errors.GoogleAdsError;
import com.google.ads.googleads.v10.errors.GoogleAdsException;
import com.google.ads.googleads.v10.resources.Ad;
import com.google.ads.googleads.v10.resources.AdGroupAd;
import com.google.ads.googleads.v10.services.AdGroupAdOperation;
import com.google.ads.googleads.v10.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v10.services.MutateAdGroupAdResult;
import com.google.ads.googleads.v10.services.MutateAdGroupAdsResponse;
import com.google.ads.googleads.v10.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Adds expanded text ads to a given ad group. To get ad groups, run GetAdGroups.java. */
public class AddExpandedTextAdWithUpgradedUrls {

  private static class AddExpandedTextAdWithUpgradedUrlsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
  }

  public static void main(String[] args) throws IOException {
    AddExpandedTextAdWithUpgradedUrlsParams params = new AddExpandedTextAdWithUpgradedUrlsParams();
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
      new AddExpandedTextAdWithUpgradedUrls()
          .runExample(googleAdsClient, params.customerId, params.adGroupId);
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

    // Creates an expanded text ad.
    Ad ad =
        Ad.newBuilder()
            .setExpandedTextAd(
                ExpandedTextAdInfo.newBuilder()
                    .setDescription("Low-gravity fun for everyone!")
                    .setHeadlinePart1("Luxury Cruise to Mars")
                    .setHeadlinePart2("Visit the Red Planet in style.")
                    .build())
            // Specifies a tracking URL for 3rd party tracking provider. You may specify one at
            // customer, campaign, ad group, ad, criterion or feed item levels.
            .setTrackingUrlTemplate(
                "http://tracker.example.com/?season={_season}&promocode={_promocode}"
                    + "&u={lpurl}")
            // Since your tracking URL has two custom parameters, provide their values too. This can
            // be provided at campaign, ad group, ad, criterion or feed item levels.
            .addAllUrlCustomParameters(
                ImmutableList.of(
                    CustomParameter.newBuilder().setKey("season").setValue("christmas").build(),
                    CustomParameter.newBuilder().setKey("promocode").setValue("NY123").build()))
            // Specifies a list of final URLs. This field cannot be set if URL field is set. This
            // may be specified at ad, criterion and feed item levels.
            .addFinalUrls("http://www.example.com/cruise/space/")
            .addFinalUrls("http://www.example.com/locations/mars/")
            // Specifies a list of final mobile URLs. This field cannot be set if URL field is
            // set, or finalUrls is unset. This may be specified at ad, criterion and feed item
            // levels.
            /*
             .addFinalMobileUrls("http://mobile.example.com/cruise/space/")
             .addFinalMobileUrls("http://mobile.example.com/locations/mars/")
            */
            .build();

    // Creates an ad group ad containing the ad.
    AdGroupAd adGroupAd =
        AdGroupAd.newBuilder()
            .setAdGroup(adGroupResourceName)
            .setAd(ad)
            // Sets the status to PAUSED.
            .setStatus(AdGroupAdStatus.PAUSED)
            .build();

    try (AdGroupAdServiceClient adGroupAdServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupAdServiceClient()) {
      MutateAdGroupAdsResponse response =
          adGroupAdServiceClient.mutateAdGroupAds(
              Long.toString(customerId),
              ImmutableList.of(AdGroupAdOperation.newBuilder().setCreate(adGroupAd).build()));
      for (MutateAdGroupAdResult result : response.getResultsList()) {
        System.out.printf(
            "Added an expanded text ad with resource name '%s'.%n", result.getResourceName());
      }
    }
  }
}

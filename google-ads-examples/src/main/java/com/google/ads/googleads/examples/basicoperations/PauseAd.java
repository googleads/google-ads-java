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

package com.google.ads.googleads.examples.basicoperations;

import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v6.common.ManualCpc;
import com.google.ads.googleads.v6.errors.GoogleAdsError;
import com.google.ads.googleads.v6.errors.GoogleAdsException;
import com.google.ads.googleads.v6.resources.Campaign;
import com.google.protobuf.FieldMask;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Changes the status of a given ad to {@code PAUSED}. */
public class PauseAd {

  private static class PauseAdParams extends CodeSampleParams {}

  public static void main(String[] args) {
    PauseAdParams params = new PauseAdParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
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
      new PauseAd().runExample(googleAdsClient);
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
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient) {

    // String adGroupAdResourceName = ResourceNames.adGroupAd(customerId, adGroupId, adId);
    //
    // // Creates an ad representation with its status set to PAUSED.
    // AdGroupAd adGroupAd =
    //     AdGroupAd.newBuilder()
    //         .setResourceName(adGroupAdResourceName)
    //         .setStatus(AdGroupAdStatus.PAUSED)
    //         .build();
    //
    // AdGroupAdOperation op =
    //     AdGroupAdOperation.newBuilder()
    //         .setUpdate(adGroupAd)
    //         .setUpdateMask(FieldMasks.allSetFieldsOf(adGroupAd))
    //         .build();
    //
    // try (AdGroupAdServiceClient adGroupAdServiceClient =
    //     googleAdsClient.getLatestVersion().createAdGroupAdServiceClient()) {
    //   MutateAdGroupAdsResponse response =
    //       adGroupAdServiceClient.mutateAdGroupAds(Long.toString(customerId),
    // ImmutableList.of(op));
    //   for (MutateAdGroupAdResult result : response.getResultsList()) {
    //     System.out.printf("Ad with resource name '%s' is paused.%n", result.getResourceName());
    //   }
    // }

    Campaign campaign =
        Campaign.newBuilder()
            .setManualCpc(ManualCpc.newBuilder().setEnhancedCpcEnabled(false).build())
            .build();
    FieldMask fieldMask = FieldMasks.allSetFieldsOf(campaign);
    System.out.println(fieldMask.toString());
  }
}

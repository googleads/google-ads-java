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

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.GoogleAdsException;
import com.google.ads.googleads.lib.utils.ResourceNames;
import com.google.ads.googleads.v0.common.ExpandedTextAdInfo;
import com.google.ads.googleads.v0.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v0.errors.GoogleAdsError;
import com.google.ads.googleads.v0.resources.Ad;
import com.google.ads.googleads.v0.resources.AdGroupAd;
import com.google.ads.googleads.v0.services.AdGroupAdOperation;
import com.google.ads.googleads.v0.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v0.services.MutateAdGroupAdResult;
import com.google.ads.googleads.v0.services.MutateAdGroupAdsResponse;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** This code example adds expanded text ads to a given ad group. */
public class AddExpandedTextAds {

  /** Number of ads being added / updated in this code example. */
  private static final int NUMBER_OF_ADS_TO_ADD = 5;

  private static class AddExpandedTextAdsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
  }

  public static void main(String[] args) {
    AddExpandedTextAdsParams params = new AddExpandedTextAdsParams();
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
      new AddExpandedTextAds().runExample(googleAdsClient, params.customerId, params.adGroupId);
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

    List<AdGroupAdOperation> operations = new ArrayList<>();

    for (int i = 0; i < NUMBER_OF_ADS_TO_ADD; i++) {

      // Create the expanded text ad info.
      ExpandedTextAdInfo expandedTextAdInfo =
          ExpandedTextAdInfo.newBuilder()
              .setHeadlinePart1(StringValue.of(String.format("Cruise #%d to Mars", i)))
              .setHeadlinePart2(StringValue.of("Best Space Cruise Line"))
              .setDescription(StringValue.of("Buy your tickets now!"))
              .build();

      // Wrap the info in an Ad object.
      Ad ad =
          Ad.newBuilder()
              .setExpandedTextAd(expandedTextAdInfo)
              .addFinalUrls(StringValue.of("http://www.example.com"))
              .build();

      // Build the final ad group ad representation.
      AdGroupAd adGroupAd =
          AdGroupAd.newBuilder()
              .setAdGroup(StringValue.of(adGroupResourceName))
              .setStatus(AdGroupAdStatus.PAUSED)
              .setAd(ad)
              .build();

      AdGroupAdOperation op = AdGroupAdOperation.newBuilder().setCreate(adGroupAd).build();
      operations.add(op);
    }

    try (AdGroupAdServiceClient adGroupAdServiceClient =
        googleAdsClient.getAdGroupAdServiceClient()) {
      MutateAdGroupAdsResponse response =
          adGroupAdServiceClient.mutateAdGroupAds(Long.toString(customerId), operations);
      for (MutateAdGroupAdResult result : response.getResultsList()) {
        System.out.printf(
            "Expanded text ad created with resource name: %s%n", result.getResourceName());
      }
    }
  }
}

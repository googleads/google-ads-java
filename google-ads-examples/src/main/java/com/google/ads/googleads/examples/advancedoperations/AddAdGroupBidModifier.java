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
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.ads.googleads.v3.common.DeviceInfo;
import com.google.ads.googleads.v3.enums.DeviceEnum.Device;
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.resources.AdGroupBidModifier;
import com.google.ads.googleads.v3.resources.AdGroupName;
import com.google.ads.googleads.v3.services.AdGroupBidModifierOperation;
import com.google.ads.googleads.v3.services.AdGroupBidModifierServiceClient;
import com.google.ads.googleads.v3.services.MutateAdGroupBidModifierResult;
import com.google.ads.googleads.v3.services.MutateAdGroupBidModifiersResponse;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.DoubleValue;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Demonstrates how to add an ad group bid modifier for mobile devices. To get ad group
 * bid modifiers, see advancedoperations/GetAdGroupBidModifiers.java.
 */
public class AddAdGroupBidModifier {

  private static class AddAdGroupBidModifierParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;

    /** Specify the bid modifier value here or the default specified below will be used. */
    @Parameter(names = ArgumentNames.BID_MODIFIER)
    private Double bidModifier = 1.5;
  }

  public static void main(String[] args) {
    AddAdGroupBidModifierParams params = new AddAdGroupBidModifierParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
      // Optional: To use a different bid modifier value from the default (1.5), uncomment
      // the line below and insert the desired bid modifier value.
      // params.bidModifier = Double.parseDouble("INSERT_BID_MODIFIER_VALUE_HERE");
    }

    GoogleAdsClient googleAdsClient;
    try {
      googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
          "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      System.exit(1);
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      return;
    }

    try {
      new AddAdGroupBidModifier()
          .runExample(
              googleAdsClient, params.customerId, params.adGroupId, params.bidModifier);
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
   * @param adGroupId the ID of the ad group.
   * @param bidModifier the bid modifier value to set
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, long adGroupId, double bidModifier) {

    // Creates an ad group bid modifier for mobile devices with the specified ad group ID and
    // bid modifier value.
    AdGroupBidModifier adGroupBidModifier =
        AdGroupBidModifier.newBuilder()
            .setAdGroup(
                StringValue.of(
                    AdGroupName.format(Long.toString(customerId), Long.toString(adGroupId))))
            .setBidModifier(DoubleValue.of(bidModifier))
            .setDevice(DeviceInfo.newBuilder().setType(Device.MOBILE))
            .build();

    // Creates an ad group bid modifier operation for creating an ad group bid modifier.
    AdGroupBidModifierOperation adGroupBidModifierOperation =
        AdGroupBidModifierOperation.newBuilder().setCreate(adGroupBidModifier).build();

    // Issues a mutate request to add the ad group bid modifier.
    try (AdGroupBidModifierServiceClient adGroupBidModifierServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupBidModifierServiceClient()) {
      MutateAdGroupBidModifiersResponse response =
          adGroupBidModifierServiceClient.mutateAdGroupBidModifiers(
              Long.toString(customerId), ImmutableList.of(adGroupBidModifierOperation));

      System.out.printf("Added %d ad group bid modifiers:%n", response.getResultsCount());
      for (MutateAdGroupBidModifierResult mutateAdGroupBidModifierResult :
          response.getResultsList()) {
        System.out.printf("\t%s%n", mutateAdGroupBidModifierResult.getResourceName());
      }
    }
  }
}

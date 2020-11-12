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
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v6.enums.AdGroupStatusEnum.AdGroupStatus;
import com.google.ads.googleads.v6.errors.GoogleAdsError;
import com.google.ads.googleads.v6.errors.GoogleAdsException;
import com.google.ads.googleads.v6.resources.AdGroup;
import com.google.ads.googleads.v6.services.AdGroupOperation;
import com.google.ads.googleads.v6.services.AdGroupServiceClient;
import com.google.ads.googleads.v6.services.MutateAdGroupResult;
import com.google.ads.googleads.v6.services.MutateAdGroupsResponse;
import com.google.ads.googleads.v6.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Updates the CPC bid and status for a given ad group. To get ad groups, run GetAdGroups.java. */
public class UpdateAdGroup {

  private static class UpdateAdGroupParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;

    @Parameter(names = ArgumentNames.CPC_BID_MICRO_AMOUNT, required = true)
    private Long cpcBidMicroAmount;
  }

  public static void main(String[] args) {
    UpdateAdGroupParams params = new UpdateAdGroupParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
      params.cpcBidMicroAmount = Long.parseLong("INSERT_CPC_BID_MICRO_AMOUNT_HERE");
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
      new UpdateAdGroup()
          .runExample(
              googleAdsClient, params.customerId, params.adGroupId, params.cpcBidMicroAmount);
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
   * @param adGroupId the ID of the ad group to update.
   * @param bidMicroAmount the bid amount in micros to use for the ad group bid.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, long adGroupId, long bidMicroAmount) {
    try (AdGroupServiceClient adGroupServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupServiceClient()) {
      // Creates an ad group object with the proper resource name and any other changes.
      AdGroup adGroup =
          AdGroup.newBuilder()
              .setResourceName(ResourceNames.adGroup(customerId, adGroupId))
              .setCpcBidMicros(bidMicroAmount)
              .setStatus(AdGroupStatus.PAUSED)
              .build();
      // Constructs an operation that will update the ad group, using the FieldMasks utility to
      // derive the update mask. This mask tells the Google Ads API which attributes of the
      // ad group you want to change.
      AdGroupOperation operation =
          AdGroupOperation.newBuilder()
              .setUpdate(adGroup)
              .setUpdateMask(FieldMasks.allSetFieldsOf(adGroup))
              .build();
      // Sends the operation in a mutate request.
      MutateAdGroupsResponse response =
          adGroupServiceClient.mutateAdGroups(
              Long.toString(customerId), ImmutableList.of(operation));
      // Prints the resource name of each updated object.
      for (MutateAdGroupResult mutateAdGroupResult : response.getResultsList()) {
        System.out.printf(
            "Updated ad group with resourceName: '%s'.%n", mutateAdGroupResult.getResourceName());
      }
    }
  }
}

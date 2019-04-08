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

package com.google.ads.googleads.examples.errorhandling;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v1.errors.GoogleAdsError;
import com.google.ads.googleads.v1.errors.GoogleAdsException;
import com.google.ads.googleads.v1.resources.AdGroup;
import com.google.ads.googleads.v1.services.AdGroupOperation;
import com.google.ads.googleads.v1.services.AdGroupServiceClient;
import com.google.ads.googleads.v1.services.MutateAdGroupResult;
import com.google.ads.googleads.v1.services.MutateAdGroupsResponse;
import com.google.ads.googleads.v1.utils.ErrorUtils;
import com.google.ads.googleads.v1.utils.ResourceNames;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * Shows how to handle partial failures. There are several ways of detecting partial failures. This
 * highlights the top main detection options: empty results and error instances.
 *
 * <p>Access to the detailed error (<code>GoogleAdsFailure</code>) for each error is via a Any
 * proto. Deserializing these to retrieve the error details is may not be immediately obvious at
 * first, this example shows how to convert Any into <code>GoogleAdsFailure</code>.
 *
 * <p>Additionally, this example shows how to produce an error message for a specific failed
 * operation by looking up the failure details in the <code>GoogleAdsFailure</code> object.
 */
public class HandlePartialFailure {

  private static class HandlePartialFailureParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;
  }

  public static void main(String[] args) throws InvalidProtocolBufferException {
    HandlePartialFailureParams params = new HandlePartialFailureParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID");
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID");
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
      new HandlePartialFailure().runExample(googleAdsClient, params.customerId, params.campaignId);
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

  /** Runs the example. */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long campaignId)
      throws InvalidProtocolBufferException {
    // This AdGroup should be created successfully - assuming the campaign in the params exists.
    AdGroup group1 =
        AdGroup.newBuilder()
            .setCampaign(StringValue.of(ResourceNames.campaign(customerId, campaignId)))
            .setName(StringValue.of("Valid AdGroup: " + System.currentTimeMillis()))
            .build();
    // This AdGroup will always fail - campaign ID 0 in resource names is never valid.
    AdGroup group2 =
        AdGroup.newBuilder()
            .setCampaign(StringValue.of(ResourceNames.campaign(customerId, 0L)))
            .setName(StringValue.of("Broken AdGroup: " + System.currentTimeMillis()))
            .build();
    // This AdGroup will always fail - duplicate ad group names are not allowed.
    AdGroup group3 =
        AdGroup.newBuilder()
            .setCampaign(StringValue.of(ResourceNames.campaign(customerId, campaignId)))
            .setName(group1.getName())
            .build();

    AdGroupOperation op1 = AdGroupOperation.newBuilder().setCreate(group1).build();
    AdGroupOperation op2 = AdGroupOperation.newBuilder().setCreate(group2).build();
    AdGroupOperation op3 = AdGroupOperation.newBuilder().setCreate(group3).build();

    try (AdGroupServiceClient service =
        googleAdsClient.getLatestVersion().createAdGroupServiceClient()) {
      // Issues the mutate request, setting partialFailure=true.
      MutateAdGroupsResponse response =
          service.mutateAdGroups(
              String.valueOf(customerId),
              Arrays.asList(op1, op2, op3),
              // Sets partial failure to true.
              true,
              // Sets validate only to false.
              false);

      // Checks for existence of any partial failures in the response.
      if (response.hasPartialFailureError()) {
        System.out.println("Partial failures occurred. Details will be shown below.");
      } else {
        System.out.println("All operations completed successfully. No partial failures to show.");
        return;
      }

      // Finds the failed operations by looping through the results.
      int operationIndex = 0;
      for (MutateAdGroupResult result : response.getResultsList()) {
        if (ErrorUtils.isPartialFailureResult(result)) {
          // May throw on this line. Most likely this means the wrong version of the ErrorUtils
          // class has been used.
          for (GoogleAdsError error :
              ErrorUtils.getGoogleAdsErrors(operationIndex, response.getPartialFailureError())) {
            System.out.printf("Operation %d failed with error: %s%n", operationIndex, error);
          }
        } else {
          System.out.printf("Operation %d succeeded.%n", operationIndex);
        }
        ++operationIndex;
      }
    }
  }
}

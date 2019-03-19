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
import com.google.ads.googleads.v1.errors.GoogleAdsException;
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v1.utils.ResourceNames;
import com.google.ads.googleads.v1.enums.AdGroupCriterionStatusEnum.AdGroupCriterionStatus;
import com.google.ads.googleads.v1.errors.GoogleAdsError;
import com.google.ads.googleads.v1.resources.AdGroupCriterion;
import com.google.ads.googleads.v1.services.AdGroupCriterionOperation;
import com.google.ads.googleads.v1.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v1.services.MutateAdGroupCriteriaResponse;
import com.google.ads.googleads.v1.services.MutateAdGroupCriterionResult;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * This example updates a keyword ({@code AdGroupCriterion}) in an ad group. To get keywords, run
 * GetKeywords.java.
 */
public class UpdateKeyword {

  private static class UpdateAdGroupParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;

    @Parameter(names = ArgumentNames.CRITERION_ID, required = true)
    private Long criterionId;
  }

  public static void main(String[] args) {
    UpdateAdGroupParams params = new UpdateAdGroupParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
      params.criterionId = Long.parseLong("INSERT_CRITERION_ID_HERE");
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
      new UpdateKeyword()
          .runExample(googleAdsClient, params.customerId, params.adGroupId, params.criterionId);
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
   * @param adGroupId the ID of the ad group that the criterionId belongs to.
   * @param criterionId the ID of criterion to update.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, long adGroupId, long criterionId) {
    try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupCriterionServiceClient()) {
      // Create an ad group criterion object with the proper resource name and any other changes.
      AdGroupCriterion adGroupCriterion =
          AdGroupCriterion.newBuilder()
              .setResourceName(ResourceNames.adGroupCriterion(customerId, adGroupId, criterionId))
              .setStatus(AdGroupCriterionStatus.ENABLED)
              .addFinalUrls(StringValue.of("https://www.example.com"))
              .build();
      // Construct an operation that will update the ad group criterion, using the FieldMasks
      // utility to derive the update mask. This mask tells the Google Ads API which attributes of
      // the ad group criterion you want to change.
      AdGroupCriterionOperation operation =
          AdGroupCriterionOperation.newBuilder()
              .setUpdate(adGroupCriterion)
              .setUpdateMask(FieldMasks.allSetFieldsOf(adGroupCriterion))
              .build();
      // Send the operation in a mutate request.
      MutateAdGroupCriteriaResponse response =
          adGroupCriterionServiceClient.mutateAdGroupCriteria(
              Long.toString(customerId), ImmutableList.of(operation));
      // Print the resource name of each updated object.
      for (MutateAdGroupCriterionResult mutateAdGroupCriterionResult : response.getResultsList()) {
        System.out.printf(
            "Updated ad group criterion with the resource name: '%s'.%n",
            mutateAdGroupCriterionResult.getResourceName());
      }
    }
  }
}

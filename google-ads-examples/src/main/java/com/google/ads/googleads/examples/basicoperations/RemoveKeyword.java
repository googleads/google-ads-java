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
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.ads.googleads.v3.services.AdGroupCriterionOperation;
import com.google.ads.googleads.v3.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v3.services.MutateAdGroupCriteriaResponse;
import com.google.ads.googleads.v3.services.MutateAdGroupCriterionResult;
import com.google.ads.googleads.v3.utils.ResourceNames;
import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Deletes a keyword as an ad group criterion using the 'REMOVE' operation. To get keyword, run
 * GetKeywords.java.
 */
public class RemoveKeyword {

  private static class RemoveKeywordParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;

    @Parameter(names = ArgumentNames.CRITERION_ID, required = true)
    private Long criterionId;
  }

  public static void main(String[] args) {
    RemoveKeywordParams params = new RemoveKeywordParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
      params.criterionId = Long.parseLong("INSERT_AD_GROUP_CRITERION_ID_HERE");
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
      new RemoveKeyword()
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
   * @param adGroupId the ID of the ad group for the keyword criterion.
   * @param criterionId the ID of the keyword criterion to remove.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, long adGroupId, long criterionId) {
    try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupCriterionServiceClient()) {
      String adGroupCriterionResourceName =
          ResourceNames.adGroupCriterion(customerId, adGroupId, criterionId);

      // Constructs an operation that will remove the keyword with the specified resource name.
      AdGroupCriterionOperation operation =
          AdGroupCriterionOperation.newBuilder().setRemove(adGroupCriterionResourceName).build();
      // Sends the operation in a mutate request.
      MutateAdGroupCriteriaResponse response =
          adGroupCriterionServiceClient.mutateAdGroupCriteria(
              Long.toString(customerId), Lists.newArrayList(operation));
      // Prints the resource name of each removed object.
      for (MutateAdGroupCriterionResult mutateAdGroupCriterionResult : response.getResultsList()) {
        System.out.printf(
            "Removed ad group criterion with resource name: '%s'.%n",
            mutateAdGroupCriterionResult.getResourceName());
      }
    }
  }
}

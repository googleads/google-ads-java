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

package com.google.ads.googleads.examples.campaignmanagement;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v3.resources.AdParameter;
import com.google.ads.googleads.v3.services.AdParameterOperation;
import com.google.ads.googleads.v3.services.AdParameterServiceClient;
import com.google.ads.googleads.v3.services.MutateAdParameterResult;
import com.google.ads.googleads.v3.services.MutateAdParametersResponse;
import com.google.ads.googleads.v3.utils.ResourceNames;
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Sets ad parameters for an ad group criterion.
 * To get ad group criteria, run GetKeywords.java
 * */
public class SetAdParameters {

  private static class SetAdParameterParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;

    @Parameter(names = ArgumentNames.CRITERION_ID, required = true)
    private Long criterionId;
  }

  public static void main(String[] args) throws IOException {
    SetAdParameters.SetAdParameterParams params = new SetAdParameters.SetAdParameterParams();
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
      System.exit(1);
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      System.exit(1);
    }

    try {
      new SetAdParameters().runExample(googleAdsClient, params.customerId, params.adGroupId, params.criterionId);
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
   * @param criterionId criterion ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long adGroupId, long criterionId) {
    String adGroupCriterionResourceName = ResourceNames.adGroupCriterion(customerId, adGroupId, criterionId);

    // Creates ad parameters.
    // There can be a maximum of two AdParameters per ad group criterion.
    // (One with parameter_index = 1 and one with parameter_index = 2.)
    AdParameter adParameter1 =
      AdParameter.newBuilder()
        .setAdGroupCriterion(StringValue.of(adGroupCriterionResourceName))
        // The unique index of this ad parameter. Must be either 1 or 2.
        .setParameterIndex(Int64Value.of(1))
        // String containing a numeric value to insert into the ad text.
        // The following restrictions apply: (a) can use comma or period as a separator,
        // with an optional period or comma (respectively) for fractional values,
        // (b) can be prepended or appended with a currency code, (c) can use plus or minus,
        // (d) can use '/' between two numbers.
        .setInsertionText(StringValue.of("100"))
        .build();

    AdParameter adParameter2 =
      AdParameter.newBuilder()
        .setAdGroupCriterion(StringValue.of(adGroupCriterionResourceName))
        .setParameterIndex(Int64Value.of(2))
        .setInsertionText(StringValue.of("$40"))
        .build();

    List<AdParameterOperation> operations = new ArrayList<>();
    operations.add(AdParameterOperation.newBuilder().setCreate(adParameter1).build());
    operations.add(AdParameterOperation.newBuilder().setCreate(adParameter2).build());

    try (AdParameterServiceClient adParameterServiceClient =
           googleAdsClient.getLatestVersion().createAdParameterServiceClient()) {
      MutateAdParametersResponse response =
        adParameterServiceClient.mutateAdParameters(Long.toString(customerId), operations);
      System.out.printf("Set %d ad params:%n", response.getResultsCount());
      for (MutateAdParameterResult result : response.getResultsList()) {
        System.out.println(result.getResourceName());
      }
    }
  }
}
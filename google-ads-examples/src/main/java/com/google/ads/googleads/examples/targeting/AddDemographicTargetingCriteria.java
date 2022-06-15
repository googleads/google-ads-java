// Copyright 2020 Google LLC
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

package com.google.ads.googleads.examples.targeting;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v11.common.AgeRangeInfo;
import com.google.ads.googleads.v11.common.GenderInfo;
import com.google.ads.googleads.v11.enums.AgeRangeTypeEnum.AgeRangeType;
import com.google.ads.googleads.v11.enums.GenderTypeEnum.GenderType;
import com.google.ads.googleads.v11.errors.GoogleAdsError;
import com.google.ads.googleads.v11.errors.GoogleAdsException;
import com.google.ads.googleads.v11.resources.AdGroupCriterion;
import com.google.ads.googleads.v11.services.AdGroupCriterionOperation;
import com.google.ads.googleads.v11.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v11.services.MutateAdGroupCriteriaResponse;
import com.google.ads.googleads.v11.services.MutateAdGroupCriterionResult;
import com.google.ads.googleads.v11.utils.ResourceNames;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** Adds demographic criteria to an ad group. */
public class AddDemographicTargetingCriteria {
  private static class AddDemographicTargetingCriteriaParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
  }

  public static void main(String[] args) {
    AddDemographicTargetingCriteriaParams params = new AddDemographicTargetingCriteriaParams();
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
      new AddDemographicTargetingCriteria()
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
   * @param customerId the client customer ID in which to create criterion.
   * @param adGroupId the ad group ID in which to create criterion.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long adGroupId) {
    String adGroupResourceName = ResourceNames.adGroup(customerId, adGroupId);

    List<AdGroupCriterionOperation> operations = new ArrayList<>();

    // Creates a gender demographic criterion.
    AdGroupCriterion genderAdGroupCriterionOperation =
        AdGroupCriterion.newBuilder()
            .setAdGroup(adGroupResourceName)
            .setGender(GenderInfo.newBuilder().setType(GenderType.MALE).build())
            .build();

    // Creates an age range negative demographic criterion.
    AdGroupCriterion ageRangeNegativeAdGroupCriterionOperation =
        AdGroupCriterion.newBuilder()
            .setAdGroup(adGroupResourceName)
            .setNegative(true)
            .setAgeRange(AgeRangeInfo.newBuilder().setType(AgeRangeType.AGE_RANGE_18_24).build())
            .build();

    // Creates and adds the operations.
    operations.add(
        AdGroupCriterionOperation.newBuilder().setCreate(genderAdGroupCriterionOperation).build());
    operations.add(
        AdGroupCriterionOperation.newBuilder()
            .setCreate(ageRangeNegativeAdGroupCriterionOperation)
            .build());

    // Creates the service client.
    try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupCriterionServiceClient()) {
      // Issues the mutate request.
      MutateAdGroupCriteriaResponse response =
          adGroupCriterionServiceClient.mutateAdGroupCriteria(
              Long.toString(customerId), operations);
      // Prints the results.
      System.out.printf("Added %d ad group criteria:%n", response.getResultsCount());
      for (MutateAdGroupCriterionResult result : response.getResultsList()) {
        System.out.println(result.getResourceName());
      }
    }
  }
}

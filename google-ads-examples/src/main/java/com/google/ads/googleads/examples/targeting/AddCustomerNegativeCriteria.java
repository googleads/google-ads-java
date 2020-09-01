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

package com.google.ads.googleads.examples.targeting;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v5.common.ContentLabelInfo;
import com.google.ads.googleads.v5.common.PlacementInfo;
import com.google.ads.googleads.v5.enums.ContentLabelTypeEnum.ContentLabelType;
import com.google.ads.googleads.v5.errors.GoogleAdsError;
import com.google.ads.googleads.v5.errors.GoogleAdsException;
import com.google.ads.googleads.v5.resources.CustomerNegativeCriterion;
import com.google.ads.googleads.v5.services.CustomerNegativeCriterionOperation;
import com.google.ads.googleads.v5.services.CustomerNegativeCriterionServiceClient;
import com.google.ads.googleads.v5.services.MutateCustomerNegativeCriteriaResponse;
import com.google.ads.googleads.v5.services.MutateCustomerNegativeCriteriaResult;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Adds various types of negative criteria as exclusions at the customer level. These criteria will
 * be applied to all campaigns for the customer.
 */
public class AddCustomerNegativeCriteria {

  private static class AddCustomerNegativeCriteriaParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private long customerId;
  }

  public static void main(String[] args) {
    AddCustomerNegativeCriteriaParams params = new AddCustomerNegativeCriteriaParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
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
      new AddCustomerNegativeCriteria().runExample(googleAdsClient, params.customerId);
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
   * Creates customer negative criteria.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  public static void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    try (CustomerNegativeCriterionServiceClient customerNegativeCriterionServiceClient =
        googleAdsClient.getLatestVersion().createCustomerNegativeCriterionServiceClient()) {

      // Creates a negative customer criterion excluding the content label type of 'TRAGEDY'.
      CustomerNegativeCriterion tragedyCriterion =
          CustomerNegativeCriterion.newBuilder()
              .setContentLabel(
                  ContentLabelInfo.newBuilder().setType(ContentLabelType.TRAGEDY).build())
              .build();

      // Creates a negative customer criterion excluding the placement with url
      // 'http://www.example.com'.
      CustomerNegativeCriterion placementCriterion =
          CustomerNegativeCriterion.newBuilder()
              .setPlacement(PlacementInfo.newBuilder().setUrl("http://www.example.com").build())
              .build();

      // Creates the operations.
      CustomerNegativeCriterionOperation tragedyCriterionOperation =
          CustomerNegativeCriterionOperation.newBuilder().setCreate(tragedyCriterion).build();
      CustomerNegativeCriterionOperation placementCriterionOperation =
          CustomerNegativeCriterionOperation.newBuilder().setCreate(placementCriterion).build();
      List<CustomerNegativeCriterionOperation> operations =
          Arrays.asList(tragedyCriterionOperation, placementCriterionOperation);

      // Adds the negative customer criteria.
      MutateCustomerNegativeCriteriaResponse response =
          customerNegativeCriterionServiceClient.mutateCustomerNegativeCriteria(
              Long.toString(customerId), operations);

      // Displays the results.
      System.out.printf("Created %d new negative customer criteria.%n", response.getResultsCount());
      for (MutateCustomerNegativeCriteriaResult result : response.getResultsList()) {
        System.out.printf(
            "Created new negative customer criteria with resource name '%s'.%n",
            result.getResourceName());
      }
    }
  }
}

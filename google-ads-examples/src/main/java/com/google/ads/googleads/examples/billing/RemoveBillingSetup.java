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
package com.google.ads.googleads.examples.billing;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v1.errors.GoogleAdsException;
import com.google.ads.googleads.v1.utils.ResourceNames;
import com.google.ads.googleads.v1.errors.GoogleAdsError;
import com.google.ads.googleads.v1.services.BillingSetupOperation;
import com.google.ads.googleads.v1.services.BillingSetupServiceClient;
import com.google.ads.googleads.v1.services.MutateBillingSetupResponse;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Removes a BillingSetup, specified by ID. To get available BillingSetups run
 * GetBillingSetups.java.
 */
public class RemoveBillingSetup {

  private static class RemoveBillingSetupParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.BILLING_SETUP_ID, required = true)
    private Long billingSetupId;
  }

  public static void main(String[] args) {
    RemoveBillingSetupParams params = new RemoveBillingSetupParams();

    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.billingSetupId = Long.parseLong("INSERT_BILLING_SETUP_ID_HERE");
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
      new RemoveBillingSetup()
          .runExample(googleAdsClient, params.customerId, params.billingSetupId);
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
   * @param customerId the customer ID containing the BillingSetup to remove.
   * @param billingSetupId the BillingSetup ID to remove.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long billingSetupId) {
    // Formats the customerId and billingSetupId into a resource name.
    String billingSetupResourceName = ResourceNames.billingSetup(customerId, billingSetupId);

    // Constructs an operation that will remove the billing setup.
    BillingSetupOperation operation = BillingSetupOperation.newBuilder()
        .setRemove(billingSetupResourceName)
        .build();

    try (BillingSetupServiceClient billingSetupServiceClient = googleAdsClient.getLatestVersion()
        .createBillingSetupServiceClient()) {
      // Sends the operation in a mutate request.
      MutateBillingSetupResponse response = billingSetupServiceClient
          .mutateBillingSetup(String.valueOf(customerId), operation);

      System.out.printf("Removed billing setup with resource name '%s'.%n",
          response.getResult().getResourceName());
    }
  }
}

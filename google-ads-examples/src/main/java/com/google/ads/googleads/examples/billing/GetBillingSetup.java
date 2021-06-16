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
import com.google.ads.googleads.v8.errors.GoogleAdsError;
import com.google.ads.googleads.v8.errors.GoogleAdsException;
import com.google.ads.googleads.v8.resources.BillingSetup;
import com.google.ads.googleads.v8.services.GoogleAdsRow;
import com.google.ads.googleads.v8.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v8.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v8.services.SearchGoogleAdsRequest;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Gets all BillingSetup objects available for the specified customerId. */
public class GetBillingSetup {

  private static final int PAGE_SIZE = 1_000;

  private static class GetBillingSetupParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    GetBillingSetupParams params = new GetBillingSetupParams();
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
      new GetBillingSetup().runExample(googleAdsClient, params.customerId);
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
   * @param customerId the customer ID for which to retrieve BillingSetups.
   */
  // [START get_billing_setup]
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    // Defines a GAQL query to retrieve all billing setup information.
    String searchQuery =
        "SELECT billing_setup.id, "
            + "  billing_setup.status, "
            + "  billing_setup.payments_account, "
            + "  billing_setup.payments_account_info.payments_account_id, "
            + "  billing_setup.payments_account_info.payments_account_name, "
            + "  billing_setup.payments_account_info.payments_profile_id, "
            + "  billing_setup.payments_account_info.payments_profile_name, "
            + "  billing_setup.payments_account_info.secondary_payments_profile_id "
            + "FROM billing_setup";

    // Creates a request that will retrieve all billing setups using pages of the specified
    // page size.
    SearchGoogleAdsRequest request =
        SearchGoogleAdsRequest.newBuilder()
            .setCustomerId(String.valueOf(customerId))
            .setPageSize(PAGE_SIZE)
            .setQuery(searchQuery)
            .build();

    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Issues the search request.
      SearchPagedResponse response = googleAdsServiceClient.search(request);

      // Iterates over all rows in all pages and prints the requested field values for the billing
      // setup in each row.
      for (GoogleAdsRow googleAdsRow : response.iterateAll()) {
        BillingSetup billingSetup = googleAdsRow.getBillingSetup();
        System.out.printf(
            "Billing setup with ID '%d', "
                + "status '%s', "
                + "payments_account '%s', "
                + "payments_account_id '%s', "
                + "payments_account_name '%s', "
                + "payments_profile_id '%s', "
                + "payments_profile_name '%s', "
                + "secondary_payments_profile_id '%s'.%n",
            billingSetup.getId(),
            billingSetup.getStatus(),
            billingSetup.getPaymentsAccount(),
            billingSetup.getPaymentsAccountInfo().getPaymentsAccountId(),
            billingSetup.getPaymentsAccountInfo().getPaymentsAccountName(),
            billingSetup.getPaymentsAccountInfo().getPaymentsProfileId(),
            billingSetup.getPaymentsAccountInfo().getPaymentsProfileName(),
            billingSetup.getPaymentsAccountInfo().getSecondaryPaymentsProfileId());
      }
    }
  }
  // [END get_billing_setup]
}

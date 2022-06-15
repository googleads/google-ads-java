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

package com.google.ads.googleads.examples.accountmanagement;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v11.errors.GoogleAdsError;
import com.google.ads.googleads.v11.errors.GoogleAdsException;
import com.google.ads.googleads.v11.resources.Customer;
import com.google.ads.googleads.v11.services.GoogleAdsRow;
import com.google.ads.googleads.v11.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v11.services.GoogleAdsServiceClient.SearchPagedResponse;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Lists basic information about an advertising account. For instance, the name, currency, time zone
 * etc.
 */
public class GetAccountInformation {

  private static class GetAccountInformationParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    GetAccountInformationParams params = new GetAccountInformationParams();
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
      new GetAccountInformation().runExample(googleAdsClient, params.customerId);
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
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Constructs a query to retrieve the customer.
      String query =
          "SELECT customer.id, "
              + "customer.descriptive_name, "
              + "customer.currency_code, "
              + "customer.time_zone, "
              + "customer.tracking_url_template, "
              + "customer.auto_tagging_enabled "
              + "FROM customer "
              // Limits to 1 to clarify that selecting from the customer resource
              // will always return only one row, which will be for the customer
              // ID specified in the request.
              + "LIMIT 1";
      // Executes the query and gets the Customer object from the single row of the response.
      SearchPagedResponse response =
          googleAdsServiceClient.search(Long.toString(customerId), query);
      GoogleAdsRow googleAdsRow = response.iterateAll().iterator().next();
      Customer customer = googleAdsRow.getCustomer();
      // Prints account information.
      System.out.printf(
          "Customer with ID %d, descriptive name '%s', currency code '%s', timezone '%s', "
              + "tracking URL template '%s' and auto tagging enabled '%s' was retrieved.%n",
          customer.getId(),
          customer.getDescriptiveName(),
          customer.getCurrencyCode(),
          customer.getTimeZone(),
          customer.getTrackingUrlTemplate(),
          customer.getAutoTaggingEnabled());
    }
  }
}

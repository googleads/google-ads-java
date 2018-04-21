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
import com.google.ads.googleads.lib.GoogleAdsException;
import com.google.ads.googleads.v0.errors.GoogleAdsError;
import com.google.ads.googleads.v0.resources.Customer;
import com.google.ads.googleads.v0.resources.CustomerName;
import com.google.ads.googleads.v0.services.CustomerServiceClient;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * This example lists basic information about an advertising account. For instance, the name,
 * currency, time zone etc.
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
    try (CustomerServiceClient customerServiceClient = googleAdsClient.getCustomerServiceClient()) {
      String customerResourceName = CustomerName.format(Long.toString(customerId));
      Customer customer = customerServiceClient.getCustomer(customerResourceName);
      // Print account information.
      System.out.printf(
          "Customer with ID %d, descriptive name '%s', currency code '%s', timezone '%s', "
              + "tracking URL template '%s' and auto tagging enabled '%s' was retrieved.%n",
          customer.getId().getValue(),
          customer.getDescriptiveName().getValue(),
          customer.getCurrencyCode().getValue(),
          customer.getTimeZone().getValue(),
          customer.getTrackingUrlTemplate().getValue(),
          customer.getAutoTaggingEnabled().getValue());
    }
  }
}

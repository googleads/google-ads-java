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

package com.google.ads.googleads.examples.accountmanagement;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.ads.googleads.v3.resources.Customer;
import com.google.ads.googleads.v3.services.CreateCustomerClientResponse;
import com.google.ads.googleads.v3.services.CustomerServiceClient;
import com.google.protobuf.BoolValue;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Creates a new customer under a given manager account.
 *
 * <p>Note: this example must be run using the credentials of a Google Ads manager account. By
 * default, the new account will only be accessible via the manager account.
 */
public class CreateCustomer {

  private static class CreateCustomerParams extends CodeSampleParams {

    @Parameter(
        names = ArgumentNames.CUSTOMER_ID,
        description = "Manager account to own the new customer.")
    public Long managerAccountId;
  }

  public static void main(String[] args) {
    CreateCustomerParams params = new CreateCustomerParams();
    if (!params.parseArguments(args)) {

      // Either pass the owning manager account on the command line or insert the ID here.
      params.managerAccountId = Long.valueOf("INSERT_MANAGER_ID_HERE");
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
      new CreateCustomer().runExample(googleAdsClient, params.managerAccountId);
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

  private void runExample(GoogleAdsClient googleAdsClient, Long managerId) {
    // Formats the current date/time to use as a timestamp in the new customer description.
    String dateTime = ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME);

    // Initializes a Customer object to be created.
    Customer customer =
        Customer.newBuilder()
            .setDescriptiveName(
                StringValue.of("Account created with CustomerService on '" + dateTime + "'"))
            .setCurrencyCode(StringValue.of("USD"))
            .setTimeZone(StringValue.of("America/New_York"))
            // Optional: Sets additional attributes of the customer.
            .setTrackingUrlTemplate(StringValue.of("{lpurl}?device={device}"))
            .setFinalUrlSuffix(
                StringValue.of("keyword={keyword}&matchtype={matchtype}&adgroupid={adgroupid}"))
            .setHasPartnersBadge(BoolValue.of(false))
            .build();

    // Sends the request to create the customer.
    try (CustomerServiceClient client =
        googleAdsClient.getLatestVersion().createCustomerServiceClient()) {
      CreateCustomerClientResponse response =
          client.createCustomerClient(managerId.toString(), customer);
      System.out.printf(
          "Created a customer with resource name '%s' under the manager account with"
              + " customer ID '%d'.%n",
          response.getResourceName(), managerId);
    }
  }
}

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

import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v7.errors.GoogleAdsError;
import com.google.ads.googleads.v7.errors.GoogleAdsException;
import com.google.ads.googleads.v7.services.CustomerServiceClient;
import com.google.ads.googleads.v7.services.ListAccessibleCustomersRequest;
import com.google.ads.googleads.v7.services.ListAccessibleCustomersResponse;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Retrieves the accounts available for a particular OAuth token. This is often useful when managing
 * new accounts. After completing OAuth for a user, set the credentials on GoogleAdsClient to the
 * user's refresh token, then call ListAccessibleCustomers to retrieve the customer IDs accessible
 * by the user.
 */
public class ListAccessibleCustomers {

  public static void main(String[] args) {
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
      new ListAccessibleCustomers().runExample(googleAdsClient);
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
   * @param client the GoogleAdsClient instance to use.
   */
  // [START list_accessible_customers]
  private void runExample(GoogleAdsClient client) {
    // Optional: Change credentials to use a different refresh token, to retrieve customers
    //           available for a specific user.
    //
    // UserCredentials credentials =
    //     UserCredentials.newBuilder()
    //         .setClientId("INSERT_OAUTH_CLIENT_ID")
    //         .setClientSecret("INSERT_OAUTH_CLIENT_SECRET")
    //         .setRefreshToken("INSERT_REFRESH_TOKEN")
    //         .build();
    //
    // client = client.toBuilder().setCredentials(credentials).build();

    try (CustomerServiceClient customerService =
        client.getLatestVersion().createCustomerServiceClient()) {
      ListAccessibleCustomersResponse response =
          customerService.listAccessibleCustomers(
              ListAccessibleCustomersRequest.newBuilder().build());

      System.out.printf("Total results: %d%n", response.getResourceNamesCount());

      for (String customerResourceName : response.getResourceNamesList()) {
        System.out.printf("Customer resource name: %s%n", customerResourceName);
      }
    }
  }
  // [END list_accessible_customers]
}

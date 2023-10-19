package com.google.ads.googleads.lib;

// Copyright 2021 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.google.ads.googleads.v15.resources.CustomerName;
import com.google.ads.googleads.v15.services.CustomerServiceClient;
import com.google.ads.googleads.v15.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v15.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v15.services.ListAccessibleCustomersRequest;
import com.google.ads.googleads.v15.services.ListAccessibleCustomersResponse;
import com.google.api.gax.grpc.GrpcCallContext;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.threeten.bp.Duration;

/**
 * Basic smoke tests for a built jar of the client library.
 *
 * <p>Only depends on a basic configuration file with devtoken, OAuth etc.
 *
 * <p>Retrieves all accessible customers and issues a search request for each customer.
 */
@RunWith(JUnit4.class)
public class SmokeTest {

  @Rule public Timeout timeout = new Timeout(20_000, TimeUnit.MILLISECONDS);

  @Test
  public void ensureCanReadAllAvailableCustomers() throws IOException {
    GoogleAdsClient client =
        GoogleAdsClient.newBuilder()
            .fromPropertiesFile()
            // Sets the login-customer-id to null. If this is set in the properties file, then
            // attempts to issue requests against accessible accounts in a different manager account
            // hierarchy will fail. With login-customer-id not set, the Google Ads API will set it
            // to the customer ID in each search request, which will result in a successful request
            // because this test only queries customers who are directly accessible with the
            // provided credentials.
            .setLoginCustomerId(null)
            .build();
    List<String> accessibleCustomerIds = getAvailableCustomerIds(client);
    if (accessibleCustomerIds.isEmpty()) {
      fail(
          "No accessible customers returned by CustomerService.ListAccessibleCustomers(). Please"
              + " provide a refresh token which has access to customers in order to run functional"
              + " tests");
    }
    fetchAllCustomers(client, accessibleCustomerIds);
  }

  private static List<String> getAvailableCustomerIds(GoogleAdsClient client) {
    try (CustomerServiceClient customerServiceClient =
        client.getLatestVersion().createCustomerServiceClient()) {
      ListAccessibleCustomersResponse response =
          customerServiceClient
              .listAccessibleCustomersCallable()
              .call(
                  ListAccessibleCustomersRequest.getDefaultInstance(),
                  GrpcCallContext.createDefault().withTimeout(Duration.ofSeconds(5L)));
      return response.getResourceNamesList().stream()
          .map(x -> CustomerName.parse(x).getCustomerId())
          .collect(Collectors.toList());
    }
  }

  /** Fetches the {@code Customer} object for each accessible customer. */
  private static void fetchAllCustomers(
      GoogleAdsClient client, List<String> accessibleCustomerIds) {
    int numCustomers = 0;
    try (GoogleAdsServiceClient googleAdsServiceClient =
        client.getLatestVersion().createGoogleAdsServiceClient()) {
      for (String customerId : accessibleCustomerIds) {
        SearchPagedResponse response =
            googleAdsServiceClient.search(
                customerId,
                "SELECT customer.id, customer.manager, customer.currency_code,"
                    + " customer.descriptive_name FROM customer");
        numCustomers += StreamSupport.stream(response.iterateAll().spliterator(), false).count();
      }
    }
    System.out.println("Retrieved " + numCustomers + " customers");
    assertTrue("Expected to read at least one customer for smoke test.", numCustomers > 0);
  }
}

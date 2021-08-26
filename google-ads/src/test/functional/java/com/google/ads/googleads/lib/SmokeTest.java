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

import com.google.ads.googleads.v8.resources.CustomerName;
import com.google.ads.googleads.v8.services.CustomerServiceClient;
import com.google.ads.googleads.v8.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v8.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v8.services.ListAccessibleCustomersRequest;
import com.google.ads.googleads.v8.services.ListAccessibleCustomersResponse;
import com.google.api.gax.grpc.GrpcCallContext;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.threeten.bp.Duration;

/**
 * Basic smoke tests for a built jar of the client library.
 *
 * <p>Only depends on a basic configuration file with devtoken, OAuth etc.
 *
 * <p>Retrieves all accessible customers and iterates through all their campaigns.
 */
@RunWith(JUnit4.class)
public class SmokeTest {

  @Rule public Timeout timeout = new Timeout(20_000, TimeUnit.MILLISECONDS);

  /**
   * Provides a main method to run these tests. Useful for testing artifacts such as shadow jar
   * which require modifying the runtime classpath.
   */
  public static void main(String[] args) {
    System.out.println(
        "Running SmokeTest. This expects you have ads.properties configured with credentials for"
            + " accessing ads API.");
    JUnitCore.main(SmokeTest.class.getCanonicalName());
  }

  @Test
  public void ensureCanReadAllAvailableCustomersCampaigns() throws IOException {
    GoogleAdsClient client = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
    List<String> accessibleCustomerIds = getAvailableCustomerIds(client);
    if (accessibleCustomerIds.isEmpty()) {
      fail(
          "No accessible customers returned by CustomerService.ListAccessibleCustomers(). Please"
              + " provide a refresh token which has access to customers in order to run functional"
              + " tests");
    }
    fetchAllCampaigns(client, accessibleCustomerIds);
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

  private static void fetchAllCampaigns(
      GoogleAdsClient client, List<String> accessibleCustomerIds) {
    int numCampaigns = 0;
    try (GoogleAdsServiceClient googleAdsServiceClient =
        client.getLatestVersion().createGoogleAdsServiceClient()) {
      for (String customerId : accessibleCustomerIds) {
        SearchPagedResponse response =
            googleAdsServiceClient.search(
                customerId,
                "SELECT campaign.id, campaign.status, campaign.start_date "
                    + "FROM campaign "
                    + "WHERE campaign.status != 'REMOVED'");
        numCampaigns += StreamSupport.stream(response.iterateAll().spliterator(), false).count();
      }
    }
    System.out.println("Retrieved " + numCampaigns + " campaigns");
    assertTrue("Expected to read at least one campaign for smoke test.", numCampaigns > 0);
  }
}

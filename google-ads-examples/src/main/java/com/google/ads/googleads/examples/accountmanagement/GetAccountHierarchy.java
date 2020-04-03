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

package com.google.ads.googleads.examples.accountmanagement;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v3.services.CustomerServiceClient;
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.ads.googleads.v3.resources.CustomerClient;
import com.google.ads.googleads.v3.services.GoogleAdsRow;
import com.google.ads.googleads.v3.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v3.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v3.services.ListAccessibleCustomersRequest;
import com.google.ads.googleads.v3.services.ListAccessibleCustomersResponse;
import com.google.ads.googleads.v3.services.SearchGoogleAdsRequest;
import com.google.common.base.Strings;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Gets the account hierarchy of the specified manager account. If you don't specify manager
 * customer ID, the example will instead print the hierarchies of all accessible customer accounts
 * for your authenticated Google account. Note that if the list of accessible customers for your
 * authenticated Google account includes accounts within the same hierarchy, this example will
 * retrieve and print the overlapping portions of the hierarchy for each accessible customer.
 */
public class GetAccountHierarchy {

  private static final int PAGE_SIZE = 1_000;

  private static class GetAccountHierarchyParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.MANAGER_ID)
    private Long managerId;
  }

  public static void main(String[] args) {
    GetAccountHierarchyParams params = new GetAccountHierarchyParams();
    if (!params.parseArguments(args)) {

      // Optional: You may pass the managerId on the command line or specify a managerId here. If
      // neither are set, a null value will be passed to the run example method, and the example
      // will print the hierarchies of all accessible customer IDs.
      // params.managerId = Long.parseLong("INSERT_MANAGER_ID_HERE");
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
      new GetAccountHierarchy().runExample(googleAdsClient, params.managerId);
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
   * Runs the examples.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param managerId managerCustomerId the customer ID.
   */
  private void runExample(GoogleAdsClient googleAdsClient, Long managerId) {
    List<Long> seedCustomerIds = new ArrayList<>();
    if (!(managerId == null)) {
      seedCustomerIds.add(managerId);
    } else {
      // Issues a request for listing all accessible customers by this authenticated Google account.
      try (CustomerServiceClient customerServiceClient =
          googleAdsClient.getLatestVersion().createCustomerServiceClient()) {
        ListAccessibleCustomersResponse accessibleCustomers =
            customerServiceClient.listAccessibleCustomers(
                ListAccessibleCustomersRequest.newBuilder().build());
        System.out.println(
            "No manager customer ID is specified. The example will print the "
                + "hierarchies of all accessible customer IDs:");

        for (String customerResourceName : accessibleCustomers.getResourceNamesList()) {
          long customer =
              customerServiceClient.getCustomer(customerResourceName).getId().getValue();
          System.out.println(customer);
          seedCustomerIds.add(customer);
        }
      }
    }

    List<Long> unprocessedCustomerIds = new ArrayList<>();
    for (long seedCustomerId : seedCustomerIds) {
      // Instantiates several variables used later.
      Map<Long, List<CustomerClient>> customerIdsToChildAccounts = new HashMap<>();
      CustomerClient rootCustomerClient = null;
      int depth = 0;
      // Adds the seed customer ID to the list of IDs to be processed.
      unprocessedCustomerIds.add(seedCustomerId);

      // Creates the Google Ads Service client.
      try (GoogleAdsServiceClient googleAdsServiceClient =
          googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
        // Creates a query that retrieves all child accounts of the manager specified in search
        // calls below.
        String query =
            "SELECT customer_client.client_customer, customer_client.level, "
                + "customer_client.manager, customer_client.descriptive_name, "
                + "customer_client.currency_code, customer_client.time_zone, "
                + "customer_client.id "
                + "FROM customer_client "
                + "WHERE customer_client.level <= 1";

        // Performs a breadth-first search algorithm to build a mapping of managers to their
        // child accounts. The map keys are manager IDs, and the values are lists of those
        // managers' direct child accounts, as represented by CustomerClient objects.
        while (!unprocessedCustomerIds.isEmpty()) {
          long customerId = unprocessedCustomerIds.get(0);
          unprocessedCustomerIds.remove(0);
          // Issues a search request by specifying page size.
          SearchPagedResponse response =
              googleAdsServiceClient.search(
                  SearchGoogleAdsRequest.newBuilder()
                      .setQuery(query)
                      .setCustomerId(Long.toString(customerId))
                      .setPageSize(PAGE_SIZE)
                      .build());

          // Iterates over all rows in all pages to get all customer clients under the specified
          // customer's hierarchy.
          for (GoogleAdsRow googleAdsRow : response.iterateAll()) {
            CustomerClient customerClient = googleAdsRow.getCustomerClient();
            // The customer client making the request will be returned in the
            // search result with a level of 0.
            if (customerClient.getLevel().getValue() == 0) {
              // Store the root customer client, which is the first encountered customer client
              // that has level of 0.
              if (rootCustomerClient == null) {
                rootCustomerClient = customerClient;
              }
              // The steps below map parent and children accounts. Continue here so that managers
              // accounts exclude themselves from the list of their children accounts.
              continue;
            }

            // For all level-1 (direct child) accounts that are manager accounts, the above
            // query will be run against them to create a map of managers to their
            // child accounts for printing the hierarchy afterwards.
            List<CustomerClient> customerClientChildren = new ArrayList<>();
            // Updates the customerClientChildren with the list of children accounts if there
            // exists an entry in the map for the given manager.
            if (customerIdsToChildAccounts.containsKey(customerId)) {
              customerClientChildren = customerIdsToChildAccounts.get(customerId);
            }
            // Adds the current child account to the list of the given manager's child accounts,
            // which will be empty if the manager has not yet been added to the map.
            customerClientChildren.add(customerClient);
            // Inserts or updates the map for the given manager with the new list of child accounts.
            customerIdsToChildAccounts.put(customerId, customerClientChildren);
            // Checks is the child account is a manager itself so that it can later be processed
            // and added to the map if it hasn't been already.
            if (customerClient.getManager().getValue()) {
              // A customer can be managed by multiple managers, so to prevent visiting the same
              // customer multiple times, we need to check if it's already in the map.
              boolean alreadyVisited =
                  customerIdsToChildAccounts.containsKey(customerClient.getId().getValue());
              if (!alreadyVisited && customerClient.getLevel().getValue() == 1) {
                unprocessedCustomerIds.add(customerClient.getId().getValue());
              }
            }
          }
        }

        if (!(rootCustomerClient == null)) {
          System.out.printf(
              "The hierarchy of customer ID %d is printed below.%n",
              rootCustomerClient.getId().getValue());
          printAccountHierarchy(rootCustomerClient, customerIdsToChildAccounts, depth);
        } else {
          System.out.println(
              "Customer ID is likely a test account, so its customer client "
                  + "information cannot be retrieved");
        }
      }
    }
  }

  /**
   * Prints the specified account's hierarchy using recursion.
   *
   * @param customerClient the customer client whose info will be printed and its child accounts
   *     will be processed if it's a manager.
   * @param customerIdsToChildAccounts a map containing the account hierarchy information. The keys
   *     are manager account IDs, and the values are lists ofthe children for given manager
   *     accounts.
   * @param depth the current depth we are printing from in the account hierarchy.
   */
  private void printAccountHierarchy(
      CustomerClient customerClient,
      Map<Long, List<CustomerClient>> customerIdsToChildAccounts,
      int depth) {
    String leadingSpace = " ";
    if (depth == 0) {
      System.out.println("Customer ID (Descriptive Name, Currency Code, Time Zone");
      leadingSpace = "";
    } else {
      System.out.println("|");
    }
    System.out.print(Strings.repeat("-", depth * 2));
    long customerId = customerClient.getId().getValue();
    System.out.printf(
        leadingSpace + "%d ('%s', '%s', '%s')%n",
        customerId,
        customerClient.getDescriptiveName().getValue(),
        customerClient.getCurrencyCode().getValue(),
        customerClient.getTimeZone().getValue());

    // Recursively calls this function for all child accounts of customerClient if the current
    // customer is a manager account.
    if (customerIdsToChildAccounts.containsKey(customerId)) {
      for (CustomerClient childCustomer : customerIdsToChildAccounts.get(customerId)) {
        printAccountHierarchy(childCustomer, customerIdsToChildAccounts, depth + 1);
      }
    }
  }
}

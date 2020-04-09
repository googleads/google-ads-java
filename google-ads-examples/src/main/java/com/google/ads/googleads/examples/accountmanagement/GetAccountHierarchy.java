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
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.ads.googleads.v3.resources.CustomerClient;
import com.google.ads.googleads.v3.resources.CustomerName;
import com.google.ads.googleads.v3.services.CustomerServiceClient;
import com.google.ads.googleads.v3.services.GoogleAdsRow;
import com.google.ads.googleads.v3.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v3.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v3.services.ListAccessibleCustomersRequest;
import com.google.ads.googleads.v3.services.ListAccessibleCustomersResponse;
import com.google.ads.googleads.v3.services.SearchGoogleAdsRequest;
import com.google.common.base.Strings;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/** Gets the account hierarchy of the specified manager account. */
public class GetAccountHierarchy {

  private static class GetAccountHierarchyParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.MANAGER_ID)
    private Long managerId;

    @Parameter(names = ArgumentNames.LOGIN_CUSTOMER_ID)
    private Long loginCustomerId;
  }

  public static void main(String[] args) {
    GetAccountHierarchyParams params = new GetAccountHierarchyParams();
    if (!params.parseArguments(args)) {

      // Optional: You may pass the managerId on the command line or specify a managerId here. If
      // neither are set, a null value will be passed to the run example method, and the example
      // will print the hierarchies of all accessible customer IDs.
      // params.managerId = Long.parseLong("INSERT_MANAGER_ID_HERE");

      // Optional: You may pass the loginCustomerId on the command line or specify a loginCustomerId
      // here if and only if the managerId is set. If the loginCustomerId is set neither on the
      // command line nor below, a null value will be passed to the run example method, and the
      // example will use each respective accessible customer ID as the loginCustomerId.
      // params.managerId = Long.parseLong("INSERT_MANAGER_ID_HERE");
    }

    if (params.managerId != null && params.loginCustomerId == null) {
      System.err.println("loginCustomerId must be provided if managerId is provided.");
      return;
    } else if (params.managerId == null && params.loginCustomerId != null) {
      System.err.println("loginCustomerId may not be provided if managerId is not provided.");
      return;
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
      new GetAccountHierarchy()
          .runExample(googleAdsClient, params.managerId, params.loginCustomerId);
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
   * Creates a new GoogleAdsClient instance with the specified loginCustomerId.
   *
   * @param loginCustomerId the loginCustomerId used to create the GoogleAdsClient.
   * @return a GoogleAdsClient instance.
   */
  private GoogleAdsClient createGoogleAdsClient(long loginCustomerId) {
    GoogleAdsClient googleAdsClient;
    try {
      googleAdsClient =
          GoogleAdsClient.newBuilder()
              .fromPropertiesFile()
              .setLoginCustomerId(loginCustomerId)
              .build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
          "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      return null;
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      return null;
    }
    return googleAdsClient;
  }

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param managerId the root customer ID from which to begin the search.
   * @param loginCustomerId the loginCustomerId used to create the GoogleAdsClient.
   */
  private void runExample(GoogleAdsClient googleAdsClient, Long managerId, Long loginCustomerId) {
    List<Long> seedCustomerIds = new ArrayList<>();
    if (managerId != null) {
      seedCustomerIds.add(managerId);
    } else {
      seedCustomerIds = getAccessibleCustomers(googleAdsClient);
    }

    Map<CustomerClient, Multimap<Long, CustomerClient>> customerClientsToHierarchies =
        new HashMap<>();
    List<Long> accountsWithNoInfo = new ArrayList<>();
    // Constructs a map of account hierarchies.
    for (long seedCustomerId : seedCustomerIds) {
      Map<CustomerClient, Multimap<Long, CustomerClient>> customerClientToHierarchy =
          createCustomerClientToHierarchy(loginCustomerId, seedCustomerId);

      if (customerClientToHierarchy != null) {
        customerClientsToHierarchies.putAll(customerClientToHierarchy);
      } else {
        accountsWithNoInfo.add(seedCustomerId);
      }
    }

    // Prints the IDs of any accounts that did not produce hierarchy information.
    if (!accountsWithNoInfo.isEmpty()) {
      System.out.println(
          "Unable to retrieve information for the following accounts which are likely either test "
              + "accounts with setup issues. Please check the logs for additional details.");
      for (long accountId : accountsWithNoInfo) {
        System.out.println(accountId);
      }
      System.out.println();
    }

    int depth = 0;
    // Prints the hierarchy information for all accounts for which there is hierarchy information
    // available.
    for (CustomerClient rootCustomerClient : customerClientsToHierarchies.keySet()) {
      System.out.printf(
          "The hierarchy of customer ID %d is printed below.%n",
          rootCustomerClient.getId().getValue());
      printAccountHierarchy(
          rootCustomerClient, customerClientsToHierarchies.get(rootCustomerClient), depth);
      System.out.println();
    }
  }

  /**
   * Creates a map between a CustomerClient and each of its managers' mappings.
   *
   * @param loginCustomerId the loginCustomerId used to create the GoogleAdsClient.
   * @param seedCustomerId the ID of the customer at the root of the tree.
   * @return a map between a CustomerClient and each of its managers' mappings.
   */
  private Map<CustomerClient, Multimap<Long, CustomerClient>> createCustomerClientToHierarchy(
      Long loginCustomerId, long seedCustomerId) {
    Set<Long> managerAccountsToSearch = new HashSet<>();
    CustomerClient rootCustomerClient = null;

    GoogleAdsClient googleAdsClient;
    // Creates a GoogleAdsClient with the specified loginCustomerId. See
    // https://developers.google.com/google-ads/api/docs/concepts/call-structure#cid for more
    // information.
    if (loginCustomerId != null) {
      googleAdsClient = createGoogleAdsClient(loginCustomerId);
    } else {
      googleAdsClient = createGoogleAdsClient(seedCustomerId);
    }

    if (googleAdsClient == null) {
      return null;
    }

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

      // Adds the seed customer ID to the list of IDs to be processed.
      managerAccountsToSearch.add(seedCustomerId);
      // Performs a breadth-first search algorithm to build a mapping of managers to their
      // child accounts.
      Multimap<Long, CustomerClient> customerIdsToChildAccounts = ArrayListMultimap.create();
      while (!managerAccountsToSearch.isEmpty()) {
        long customerId = managerAccountsToSearch.iterator().next();
        managerAccountsToSearch.remove(customerId);
        SearchPagedResponse response = null;
        try {
          // Issues a search request.
          response =
              googleAdsServiceClient.search(
                  SearchGoogleAdsRequest.newBuilder()
                      .setQuery(query)
                      .setCustomerId(Long.toString(customerId))
                      .build());

          // Iterates over all rows in all pages to get all customer clients under the specified
          // customer's hierarchy.
          for (GoogleAdsRow googleAdsRow : response.iterateAll()) {
            CustomerClient customerClient = googleAdsRow.getCustomerClient();

            if (customerClient.getId().getValue() == seedCustomerId) {
              rootCustomerClient = customerClient;
            }

            // The steps below map parent and children accounts. Continue here so that managers
            // accounts exclude themselves from the list of their children accounts.
            if (customerClient.getId().getValue() == customerId) {
              continue;
            }

            // For all level-1 (direct child) accounts that are manager accounts, the above
            // query will be run against them to create a map of managers to their
            // child accounts for printing the hierarchy afterwards.
            customerIdsToChildAccounts.put(customerId, customerClient);
            // Checks is the child account is a manager itself so that it can later be processed
            // and added to the map if it hasn't been already.
            if (customerClient.getManager().getValue()) {
              // A customer can be managed by multiple managers, so to prevent visiting the same
              // customer multiple times, we need to check if it's already in the map.
              boolean alreadyVisited =
                  customerIdsToChildAccounts.containsKey(customerClient.getId().getValue());
              if (!alreadyVisited && customerClient.getLevel().getValue() == 1) {
                managerAccountsToSearch.add(customerClient.getId().getValue());
              }
            }
          }
        } catch (GoogleAdsException gae) {
          System.out.printf(
              "Unable to retrieve hierarchy for customer ID %d: %s%n",
              customerId, gae.getGoogleAdsFailure().getErrors(0).getMessage());
        }
      }

      if (rootCustomerClient == null) {
        return null;
      }

      CustomerClient finalRootCustomerClient = rootCustomerClient;
      return new HashMap<CustomerClient, Multimap<Long, CustomerClient>>() {
        {
          put(finalRootCustomerClient, customerIdsToChildAccounts);
        }
      };
    }
  }

  /**
   * Retrieves a list of accessible customers with the provided set up credentials.
   *
   * @param googleAdsClient the Google Ads API client.
   * @return a list of customer IDs.
   */
  private List<Long> getAccessibleCustomers(GoogleAdsClient googleAdsClient) {
    List<Long> seedCustomerIds = new ArrayList<>();
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
        long customer = Long.parseLong(CustomerName.parse(customerResourceName).getCustomer());
        System.out.println(customer);
        seedCustomerIds.add(customer);
      }
    }
    return seedCustomerIds;
  }

  /**
   * Prints the specified account's hierarchy using recursion.
   *
   * @param customerClient the customer client whose info will be printed and its child accounts
   *     will be processed if it's a manager.
   * @param customerIdsToChildAccounts a map containing the account hierarchy information.
   * @param depth the current depth we are printing from in the account hierarchy.
   */
  private void printAccountHierarchy(
      CustomerClient customerClient,
      Multimap<Long, CustomerClient> customerIdsToChildAccounts,
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

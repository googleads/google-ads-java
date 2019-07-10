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
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v1.enums.ManagerLinkStatusEnum.ManagerLinkStatus;
import com.google.ads.googleads.v1.errors.GoogleAdsError;
import com.google.ads.googleads.v1.errors.GoogleAdsException;
import com.google.ads.googleads.v1.services.CustomerClientLinkOperation;
import com.google.ads.googleads.v1.services.CustomerClientLinkServiceClient;
import com.google.ads.googleads.v1.services.CustomerManagerLinkOperation;
import com.google.ads.googleads.v1.services.CustomerManagerLinkServiceClient;
import com.google.ads.googleads.v1.services.GoogleAdsRow;
import com.google.ads.googleads.v1.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v1.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v1.services.MutateCustomerClientLinkResponse;
import com.google.ads.googleads.v1.services.MutateCustomerManagerLinkResponse;
import com.google.ads.googleads.v1.utils.ResourceNames;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * Demonstrates how to link an existing Google Ads manager customer to an existing Google Ads client
 * customer.
 */
public class LinkManagerToClient {

  private static class LinkManagerToClientParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private long customerId;

    @Parameter(names = ArgumentNames.MANAGER_ID, required = true)
    private long managerId;
  }

  public static void main(String[] args) throws IOException {
    LinkManagerToClientParams params = new LinkManagerToClientParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.managerId = Long.parseLong("INSERT_MANAGER_ID_HERE");
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
      new LinkManagerToClient().runExample(googleAdsClient, params.customerId, params.managerId);
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

  /** Runs the example. */
  private void runExample(GoogleAdsClient googleAdsClient, long clientCustomerId, long managerId) {
    // This example assumes that the same credentials will work for both customers, but that may not
    // be the case. If you need to use different credentials for each customer, then you may either
    // update the client configuration or instantiate two clients, one for each set of credentials.
    // Always make sure you use a GoogleAdsClient with the proper credentials to fetch any services
    // you need to use.

    // Extend an invitation to the client while authenticating as the manager.
    googleAdsClient = googleAdsClient.toBuilder().setLoginCustomerId(managerId).build();

    CustomerClientLinkOperation.Builder clientLinkOp = CustomerClientLinkOperation.newBuilder();
    clientLinkOp
        .getCreateBuilder()
        .setStatus(ManagerLinkStatus.PENDING)
        .setClientCustomer(StringValue.of(ResourceNames.customer(clientCustomerId)));

    String pendingLinkResourceName;

    try (CustomerClientLinkServiceClient customerClientLinkServiceClient =
        googleAdsClient.getLatestVersion().createCustomerClientLinkServiceClient()) {
      MutateCustomerClientLinkResponse response =
          customerClientLinkServiceClient.mutateCustomerClientLink(
              String.valueOf(managerId), clientLinkOp.build());

      pendingLinkResourceName = response.getResult().getResourceName();

      System.out.printf(
          "Extended an invitation from customer %s to customer %s with client link resource name"
              + " %s%n",
          managerId, clientCustomerId, pendingLinkResourceName);
    }

    // Find the manager_link_id of the link we just created, so we can construct the resource name
    // for the link from the client side.
    String query =
        "SELECT customer_client_link.manager_link_id FROM customer_client_link WHERE"
            + " customer_client_link.resource_name = '"
            + pendingLinkResourceName
            + "'";
    long managerLinkId;

    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      SearchPagedResponse response =
          googleAdsServiceClient.search(String.valueOf(managerId), query);
      GoogleAdsRow result = response.iterateAll().iterator().next();
      managerLinkId = result.getCustomerClientLink().getManagerLinkId().getValue();
    }

    // Accept the link using the client account.
    CustomerManagerLinkOperation.Builder managerLinkOp = CustomerManagerLinkOperation.newBuilder();
    managerLinkOp
        .getUpdateBuilder()
        .setResourceName(
            ResourceNames.customerManagerLink(clientCustomerId, managerId, managerLinkId))
        .setStatus(ManagerLinkStatus.ACTIVE);

    managerLinkOp.setUpdateMask(FieldMasks.allSetFieldsOf(managerLinkOp.getUpdate()));

    googleAdsClient = googleAdsClient.toBuilder().setLoginCustomerId(clientCustomerId).build();

    try (CustomerManagerLinkServiceClient managerLinkServiceClient =
        googleAdsClient.getLatestVersion().createCustomerManagerLinkServiceClient()) {
      MutateCustomerManagerLinkResponse response =
          managerLinkServiceClient.mutateCustomerManagerLink(
              String.valueOf(clientCustomerId), Arrays.asList(managerLinkOp.build()));
      System.out.printf(
          "Client accepted invitation with resource name %s%n",
          response.getResults(0).getResourceName());
    }
  }
}

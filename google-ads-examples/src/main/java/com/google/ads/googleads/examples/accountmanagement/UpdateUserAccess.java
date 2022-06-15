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
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v11.enums.AccessRoleEnum.AccessRole;
import com.google.ads.googleads.v11.errors.GoogleAdsError;
import com.google.ads.googleads.v11.errors.GoogleAdsException;
import com.google.ads.googleads.v11.resources.CustomerUserAccess;
import com.google.ads.googleads.v11.services.CustomerUserAccessOperation;
import com.google.ads.googleads.v11.services.CustomerUserAccessServiceClient;
import com.google.ads.googleads.v11.services.GoogleAdsRow;
import com.google.ads.googleads.v11.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v11.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v11.services.MutateCustomerUserAccessResponse;
import com.google.ads.googleads.v11.utils.ResourceNames;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;

/**
 * Updates the access role of a user, given the email address. Note: Should be run as a user who is
 * an Administrator on the Google Ads account with the specified customer ID. See
 * https://support.google.com/google-ads/answer/9978556 to learn more about account access levels.
 */
public class UpdateUserAccess {

  private static class UpdateUserAccessParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.EMAIL_ADDRESS, required = true)
    private String emailAddress;

    @Parameter(names = ArgumentNames.ACCESS_ROLE, required = true)
    private AccessRole accessRole;
  }

  public static void main(String[] args) {
    UpdateUserAccessParams params = new UpdateUserAccessParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.emailAddress = "INSERT_EMAIL_ADDRESS_HERE";
      params.accessRole = AccessRole.valueOf("INSERT_ACCESS_ROLE_HERE");
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
      new UpdateUserAccess()
          .runExample(googleAdsClient, params.customerId, params.emailAddress, params.accessRole);
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
   * @param googleAdsClient the API client to use.
   * @param customerId the customer ID to update.
   * @param emailAddress the email address for which to update access role in customer ID.
   * @param accessRole the new access role to set.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String emailAddress,
      AccessRole accessRole) {
    // Obtains the user ID for an email address on a Google Ads account.
    Optional<CustomerUserAccess> accessInfo =
        getCustomerUserAccess(googleAdsClient, customerId, emailAddress);
    // Updates the access to the specified role, if the user is found.
    if (accessInfo.isPresent()) {
      modifyUserAccess(googleAdsClient, customerId, accessInfo.get().getUserId(), accessRole);
    } else {
      System.out.printf(
          "Email address '%s' not found in customer '%s'.%n", emailAddress, customerId);
    }
  }

  /**
   * Gets the user ID associated with an email address on an ad-account.
   *
   * @param googleAdsClient the API client to use.
   * @param customerId the customer ID in which to lookup user ID.
   * @param emailAddress the email address for which to lookup user ID.
   */
  private Optional<CustomerUserAccess> getCustomerUserAccess(
      GoogleAdsClient googleAdsClient, long customerId, String emailAddress) {
    // Defines a search query to retrieve user access for an email address.
    String query =
        String.format(
            "SELECT "
                + "  customer_user_access.user_id,"
                + "  customer_user_access.email_address,"
                + "  customer_user_access.access_role,"
                + "  customer_user_access.access_creation_date_time "
                + "FROM customer_user_access "
                + "WHERE"
                + "  customer_user_access.email_address LIKE '%s'",
            emailAddress);
    // Connects a new API client to retrieve the access.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Sends the API request.
      SearchPagedResponse response =
          googleAdsServiceClient.search(String.valueOf(customerId), query);
      // Processes the result.
      Iterator<GoogleAdsRow> iterator = response.iterateAll().iterator();
      if (iterator.hasNext()) {
        CustomerUserAccess accessDetails = iterator.next().getCustomerUserAccess();
        System.out.printf(
            "Customer user access with User ID = %d, Email Address = "
                + "%s, Access Role = %s and Creation Time = %s was found in "
                + "Customer ID: %d.%n",
            accessDetails.getUserId(),
            accessDetails.getEmailAddress(),
            accessDetails.getAccessRole(),
            accessDetails.getAccessCreationDateTime(),
            customerId);
        return Optional.of(accessDetails);
      }
      return Optional.empty();
    }
  }

  /**
   * Modifies the user access role to a specified value.
   *
   * @param googleAdsClient the API client to use.
   * @param customerId the customer ID on which to modify access.
   * @param userId the user ID for which to modify access.
   * @param accessRole the new access role for the user.
   */
  private void modifyUserAccess(
      GoogleAdsClient googleAdsClient, long customerId, long userId, AccessRole accessRole) {
    // Creates an access entity to update.
    CustomerUserAccess updatedAccess =
        CustomerUserAccess.newBuilder()
            .setResourceName(ResourceNames.customerUserAccess(customerId, userId))
            .setAccessRole(accessRole)
            .build();

    // Constructs an update operation.
    CustomerUserAccessOperation operation =
        CustomerUserAccessOperation.newBuilder()
            .setUpdate(updatedAccess)
            .setUpdateMask(FieldMasks.allSetFieldsOf(updatedAccess))
            .build();

    // Connects to the service and issues API request.
    try (CustomerUserAccessServiceClient userAccessServiceClient =
        googleAdsClient.getLatestVersion().createCustomerUserAccessServiceClient()) {
      MutateCustomerUserAccessResponse response =
          userAccessServiceClient.mutateCustomerUserAccess(String.valueOf(customerId), operation);

      // Prints the result.
      System.out.printf(
          "Successfully modified customer user access with resource name '%s' to access level"
              + " '%s'.%n",
          response.getResult().getResourceName(), accessRole);
    }
  }
}

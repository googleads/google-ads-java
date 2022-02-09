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

package com.google.ads.googleads.examples.accountmanagement;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v10.enums.AccessRoleEnum.AccessRole;
import com.google.ads.googleads.v10.errors.GoogleAdsError;
import com.google.ads.googleads.v10.errors.GoogleAdsException;
import com.google.ads.googleads.v10.resources.CustomerUserAccessInvitation;
import com.google.ads.googleads.v10.services.CustomerUserAccessInvitationOperation;
import com.google.ads.googleads.v10.services.CustomerUserAccessInvitationServiceClient;
import com.google.ads.googleads.v10.services.MutateCustomerUserAccessInvitationResponse;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Sends an invitation email to a user to manage a customer account with a desired access role. */
public class InviteUserWithAccessRole {

  private static class InviteUserWithAccessRoleParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private long customerId;

    @Parameter(names = ArgumentNames.EMAIL_ADDRESS, required = true)
    private String emailAddress;

    @Parameter(names = ArgumentNames.ACCESS_ROLE, required = true)
    private AccessRole accessRole;
  }

  public static void main(String[] args) {
    InviteUserWithAccessRoleParams params = new InviteUserWithAccessRoleParams();
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
      new InviteUserWithAccessRole()
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

  /** Runs the exmaple. */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      Long customerId,
      String emailAddress,
      AccessRole accessRole) {
    // [START invite_user_with_access_role]
    // Constructs an access invitation.
    CustomerUserAccessInvitation invitation =
        CustomerUserAccessInvitation.newBuilder()
            .setEmailAddress(emailAddress)
            .setAccessRole(accessRole)
            .build();

    // Constructs an operation to send the invitation.
    CustomerUserAccessInvitationOperation operation =
        CustomerUserAccessInvitationOperation.newBuilder().setCreate(invitation).build();

    // Creates a CustomerUserAccessInvitationServiceClient.
    try (CustomerUserAccessInvitationServiceClient client =
        googleAdsClient.getLatestVersion().createCustomerUserAccessInvitationServiceClient()) {
      // Issues the request.
      MutateCustomerUserAccessInvitationResponse response =
          client.mutateCustomerUserAccessInvitation(String.valueOf(customerId), operation);

      // Prints some information about the result.
      System.out.printf(
          "Customer user access invitation was sent for customerId = "
              + "%d to email address = '%s' and access role = '%s'. The invitation resource "
              + "name is '%s'.%n",
          customerId, emailAddress, accessRole, response.getResult().getResourceName());
    }
    // [END invite_user_with_access_role]
  }
}

// Copyright 2021 Google LLC
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
import com.google.ads.googleads.v11.errors.GoogleAdsError;
import com.google.ads.googleads.v11.errors.GoogleAdsException;
import com.google.ads.googleads.v11.services.GoogleAdsRow;
import com.google.ads.googleads.v11.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v11.services.GoogleAdsServiceClient.SearchPagedResponse;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Retrieves pending invitations for a customer account. To create a pending invitation, see
 * InviteUserWithAccessRole.java.
 */
public class GetPendingInvitations {

  private static class GetPendingInvitationsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    GetPendingInvitationsParams params = new GetPendingInvitationsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
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
      new GetPendingInvitations().runExample(googleAdsClient, params.customerId);
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

  /** Runs the example. */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    try (GoogleAdsServiceClient client =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // [START get_pending_invitations]
      String query =
          "SELECT"
              + "  customer_user_access_invitation.invitation_id, "
              + "  customer_user_access_invitation.email_address, "
              + "  customer_user_access_invitation.access_role, "
              + "  customer_user_access_invitation.creation_date_time "
              + "FROM "
              + "  customer_user_access_invitation "
              + "WHERE "
              + "  customer_user_access_invitation.invitation_status = PENDING";
      SearchPagedResponse response = client.search(String.valueOf(customerId), query);
      for (GoogleAdsRow row : response.iterateAll()) {
        System.out.printf(
            "A pending invitation with invitation ID = %d, "
                + "email address = '%s', access role = '%s' and created on %s"
                + " was found.%n",
            row.getCustomerUserAccessInvitation().getInvitationId(),
            row.getCustomerUserAccessInvitation().getEmailAddress(),
            row.getCustomerUserAccessInvitation().getAccessRole(),
            row.getCustomerUserAccessInvitation().getCreationDateTime());
      }
      // [END get_pending_invitations]
    }
  }
}

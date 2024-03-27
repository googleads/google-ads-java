// Copyright 2024 Google LLC
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
import com.google.ads.googleads.v16.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram;
import com.google.ads.googleads.v16.errors.GoogleAdsError;
import com.google.ads.googleads.v16.errors.GoogleAdsException;
import com.google.ads.googleads.v16.services.GetIdentityVerificationResponse;
import com.google.ads.googleads.v16.services.IdentityVerification;
import com.google.ads.googleads.v16.services.IdentityVerificationProgress;
import com.google.ads.googleads.v16.services.IdentityVerificationServiceClient;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * This code example illustrates how to retrieve the status of the advertiser identity verification
 * program and, if required and not already started, how to start the verification process.
 */
public class VerifyAdvertiserIdentity {

  private static class VerifyAdvertiserIdentityParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    VerifyAdvertiserIdentityParams params = new VerifyAdvertiserIdentityParams();
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
      new VerifyAdvertiserIdentity().runExample(googleAdsClient, params.customerId);
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
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    try (IdentityVerificationServiceClient identityVerificationServiceClient =
        googleAdsClient.getLatestVersion().createIdentityVerificationServiceClient()) {
      // Retrieves the current Advertiser Identity Verification status.
      IdentityVerification identityVerification =
          getIdentityVerification(customerId, identityVerificationServiceClient);

      if (identityVerification != null) {
        if (identityVerification.hasVerificationProgress()
            && identityVerification.getVerificationProgress().getActionUrl().isEmpty()) {
          // Starts an identity verification session.
          startIdentityVerification(customerId, identityVerificationServiceClient);

          // Calls getIdentityVerification again to retrieve the verification progress after
          // starting an identity verification session.
          getIdentityVerification(customerId, identityVerificationServiceClient);
        } else {
          // If there is an identity verification session in progress, there is no need to start
          // another one by calling startIdentityVerification.
          System.out.println("There is an advertiser identify verification session in progress.");
          System.out.printf(
              "The URL for the verification process is '%s' and it will expire at '%s'%n",
              identityVerification.getVerificationProgress().getActionUrl(),
              identityVerification.getVerificationProgress().getInvitationLinkExpirationTime());
        }
      } else {
        // If getIdentityVerification returned an empty response, the account is not enrolled in
        // mandatory identity verification.
        System.out.printf(
            "Account %d is not required to perform advertiser identity verification.%n",
            customerId);
        System.out.println(
            "See https://support.google.com/adspolicy/answer/9703665 for details on how and when an"
                + " account is required to undergo the advertiser identity verification program.");
      }
    }
  }

  /** Retrieves the status of the advertiser identity verification process. */
  // [START verify_advertiser_identity_1]
  private IdentityVerification getIdentityVerification(
      long customerId, IdentityVerificationServiceClient identityVerificationServiceClient) {
    GetIdentityVerificationResponse response =
        identityVerificationServiceClient.getIdentityVerification(Long.toString(customerId));
    if (response.getIdentityVerificationCount() == 0) {
      return null;
    }
    IdentityVerification identityVerification = response.getIdentityVerification(0);
    String deadline =
        identityVerification
            .getIdentityVerificationRequirement()
            .getVerificationCompletionDeadlineTime();
    IdentityVerificationProgress progress = identityVerification.getVerificationProgress();
    System.out.printf(
        "Account %d has a verification completion deadline of '%s' and status '%s' for advertiser"
            + " identity verification.%n",
        customerId, deadline, progress.getProgramStatus());
    return identityVerification;
  }

  // [END verify_advertiser_identity_1]

  /** Starts the identity verification process. */
  // [START verify_advertiser_identity_2]
  private void startIdentityVerification(
      long customerId, IdentityVerificationServiceClient identityVerificationServiceClient) {
    // Sends a request to start the identity verification process.
    identityVerificationServiceClient.startIdentityVerification(
        Long.toString(customerId), IdentityVerificationProgram.ADVERTISER_IDENTITY_VERIFICATION);
  }
  // [END verify_advertiser_identity_2]
}

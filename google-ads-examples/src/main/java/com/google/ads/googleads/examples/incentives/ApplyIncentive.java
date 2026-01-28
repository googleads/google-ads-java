// Copyright 2026 Google LLC
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

package com.google.ads.googleads.examples.incentives;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v23.errors.GoogleAdsError;
import com.google.ads.googleads.v23.errors.GoogleAdsException;
import com.google.ads.googleads.v23.services.ApplyIncentiveRequest;
import com.google.ads.googleads.v23.services.ApplyIncentiveResponse;
import com.google.ads.googleads.v23.services.IncentiveServiceClient;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * This example applies an incentive to a user's account.
 *
 * <p>This example is a no-op if the user already has an accepted incentive. If the user attempts to
 * apply a new incentive, the response will simply return the existing incentive that has already
 * been applied to the account.
 */
public class ApplyIncentive {

  private static class ApplyIncentiveParams extends CodeSampleParams {

    @Parameter(
        names = ArgumentNames.CUSTOMER_ID,
        required = true,
        description = "The Google Ads customer ID.")
    private Long customerId;

    @Parameter(
        names = ArgumentNames.INCENTIVE_ID,
        required = true,
        description = "The ID of the incentive to apply.")
    private String incentiveId;

    @Parameter(
        names = ArgumentNames.COUNTRY_CODE,
        description = "The country for the incentive to apply.")
    private String countryCode = "US";
  }

  public static void main(String[] args) throws IOException {
    ApplyIncentiveParams params = new ApplyIncentiveParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for more information.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.incentiveId = "INSERT_INCENTIVE_ID_HERE";
    }

    GoogleAdsClient googleAdsClient = null;
    try {
      googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf("Failed to load GoogleAdsClient configuration from file. Exception: %s%n",
          fnfe);
      System.exit(1);
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      System.exit(1);
    }

    try {
      new ApplyIncentive().runExample(googleAdsClient, params.customerId, params.incentiveId,
          params.countryCode);
    } catch (GoogleAdsException gae) {
      // GoogleAdsException is the base class for most exceptions thrown by an API request.
      // Instances of this exception have a message and a GoogleAdsFailure that contains a
      // collection of GoogleAdsError instances that detail the underlying causes of the
      // exception.
      System.err.printf("Request ID %s failed due to GoogleAdsException. Underlying errors:%n",
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
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param incentiveId the ID of the incentive to apply.
   * @param countryCode the country of the incentive.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, String incentiveId,
      String countryCode) {
    try (IncentiveServiceClient incentiveServiceClient = googleAdsClient.getLatestVersion()
        .createIncentiveServiceClient()) {
      ApplyIncentiveRequest request = ApplyIncentiveRequest.newBuilder()
          .setCustomerId(String.valueOf(customerId))
          .setSelectedIncentiveId(Long.parseLong(incentiveId)).setCountryCode(countryCode).build();
      // Issues the request.
      ApplyIncentiveResponse response = incentiveServiceClient.applyIncentive(request);

      // Processes the response.
      System.out.println("====================================================================");
      System.out.printf("Applied incentive with coupon code '%s'.%n", response.getCouponCode());
      System.out.printf("Incentive was created at '%s'.%n", response.getCreationTime());
      System.out.println("====================================================================");
    }
  }
}

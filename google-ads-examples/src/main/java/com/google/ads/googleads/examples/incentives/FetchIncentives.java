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
import com.google.ads.googleads.v23.services.CyoIncentives;
import com.google.ads.googleads.v23.services.FetchIncentiveRequest;
import com.google.ads.googleads.v23.services.FetchIncentiveRequest.IncentiveType;
import com.google.ads.googleads.v23.services.FetchIncentiveResponse;
import com.google.ads.googleads.v23.services.Incentive;
import com.google.ads.googleads.v23.services.IncentiveServiceClient;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * This example fetches the available incentives for a user.
 */
public class FetchIncentives {

  private static class FetchIncentivesParams extends CodeSampleParams {

    @Parameter(
        names = ArgumentNames.EMAIL_ADDRESS,
        required = true,
        description = "The email of the user to fetch incentives for.")
    private String email;

    @Parameter(
        names = ArgumentNames.LANGUAGE_CODE,
        description = "The language for the returned incentive.")
    private String languageCode = "en";

    @Parameter(
        names = ArgumentNames.COUNTRY_CODE,
        description = "The country for the returned incentive.")
    private String countryCode = "US";
  }

  public static void main(String[] args) throws IOException {
    FetchIncentivesParams params = new FetchIncentivesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for more information.
      params.email = "INSERT_EMAIL_HERE";
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
      new FetchIncentives()
          .runExample(googleAdsClient, params.email, params.languageCode, params.countryCode);
    } catch (GoogleAdsException gae) {
      // GoogleAdsException is the base class for most exceptions thrown by an API request.
      // Instances of this exception have a message and a GoogleAdsFailure that contains a
      // collection of GoogleAdsError instances that detail the underlying causes of the
      // exception.
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
   * @param googleAdsClient the Google Ads API client.
   * @param email the email of the user to fetch incentives for.
   * @param languageCode the language of the incentives.
   * @param countryCode the country of the incentives.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, String email, String languageCode, String countryCode) {
    try (IncentiveServiceClient incentiveServiceClient =
        googleAdsClient.getLatestVersion().createIncentiveServiceClient()) {
      FetchIncentiveRequest request = FetchIncentiveRequest.newBuilder().setCountryCode(countryCode)
          .setLanguageCode(languageCode).setEmail(email).setType(IncentiveType.ACQUISITION).build();

      // Issues the request.
      FetchIncentiveResponse response =
          incentiveServiceClient.fetchIncentive(request);

      // Processes the response.
      if (!response.hasIncentiveOffer()) {
        System.out.print("No incentive offer was found");
        return;
      }

      // If the offer type is CHOOSE_YOUR_OWN_INCENTIVE, there will be 3 incentives in the
      // response. At the time this example was written, all incentive offers are CYO incentive offers.
      if (response.getIncentiveOffer().hasCyoIncentives()) {
        CyoIncentives cyoIncentives = response.getIncentiveOffer().getCyoIncentives();
        printIncentiveDetails(cyoIncentives.getLowOffer());
        printIncentiveDetails(cyoIncentives.getMediumOffer());
        printIncentiveDetails(cyoIncentives.getHighOffer());
      }
    }
  }

  private void printIncentiveDetails(Incentive incentive) {
    System.out.println("====================================================================");
    System.out.printf("Incentive ID: '%s'%n", incentive.getIncentiveId());
    System.out.printf("Incentive requirement: '%s'%n", incentive.getRequirement());
    System.out.printf(
        "Incentive terms and conditions: '%s'%n", incentive.getIncentiveTermsAndConditionsUrl());
    System.out.println("====================================================================");
  }
}



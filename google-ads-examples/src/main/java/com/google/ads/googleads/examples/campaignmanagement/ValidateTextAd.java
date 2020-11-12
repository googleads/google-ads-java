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

package com.google.ads.googleads.examples.campaignmanagement;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v6.common.ExpandedTextAdInfo;
import com.google.ads.googleads.v6.common.PolicyTopicEntry;
import com.google.ads.googleads.v6.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v6.errors.GoogleAdsError;
import com.google.ads.googleads.v6.errors.GoogleAdsException;
import com.google.ads.googleads.v6.errors.PolicyFindingErrorEnum.PolicyFindingError;
import com.google.ads.googleads.v6.resources.Ad;
import com.google.ads.googleads.v6.resources.AdGroupAd;
import com.google.ads.googleads.v6.services.AdGroupAdOperation;
import com.google.ads.googleads.v6.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v6.services.MutateAdGroupAdsRequest;
import com.google.ads.googleads.v6.services.MutateAdGroupAdsResponse;
import com.google.ads.googleads.v6.utils.ResourceNames;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Shows how to use the validateOnly header to validate an expanded text ad. No ads will be created,
 * but exceptions will still be thrown.
 */
public class ValidateTextAd {

  private static class ValidateTextAdParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
  }

  public static void main(String[] args) {
    ValidateTextAdParams params = new ValidateTextAdParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
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
      new ValidateTextAd().runExample(googleAdsClient, params.customerId, params.adGroupId);
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
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupId the ad group ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long adGroupId) {
    String adGroupResourceName = ResourceNames.adGroup(customerId, adGroupId);

    // Creates the expanded text ad info.
    ExpandedTextAdInfo expandedTextAdInfo =
        ExpandedTextAdInfo.newBuilder()
            .setDescription("Luxury Cruise to Mars")
            .setHeadlinePart1("Visit the Red Planet in style")
            // Adds a headline that will trigger a policy violation to demonstrate error handling.
            .setHeadlinePart2("Low-gravity fun for everyone!!")
            .build();

    // Wraps the info in an Ad object.
    Ad ad =
        Ad.newBuilder()
            .setExpandedTextAd(expandedTextAdInfo)
            .addFinalUrls("http://www.example.com")
            .build();

    // Builds the final ad group ad representation.
    AdGroupAd adGroupAd =
        AdGroupAd.newBuilder()
            .setAdGroup(adGroupResourceName)
            .setStatus(AdGroupAdStatus.PAUSED)
            .setAd(ad)
            .build();

    AdGroupAdOperation operation = AdGroupAdOperation.newBuilder().setCreate(adGroupAd).build();

    try (AdGroupAdServiceClient adGroupAdServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupAdServiceClient()) {
      // Issues the mutate request setting validateOnly=true.
      MutateAdGroupAdsResponse response =
          adGroupAdServiceClient.mutateAdGroupAds(
              MutateAdGroupAdsRequest.newBuilder()
                  .setCustomerId(String.valueOf(customerId))
                  .setCustomerId(Long.toString(customerId))
                  .addOperations(operation)
                  .setValidateOnly(true)
                  .build());
      // Since validation is ON, result will be null.
      System.out.println("Expanded text ad validated successfully.");
    } catch (GoogleAdsException e) {
      // This block will be hit if there is a validation error from the server.
      System.out.println("There were validation error(s) while adding expanded text ad.");

      if (e.getGoogleAdsFailure() != null) {
        // Note: Depending on the ad type, you may get back policy violation errors as
        // either PolicyFindingError or PolicyViolationError. ExpandedTextAds return
        // errors as PolicyFindingError, so only this case is illustrated here. See
        // https://developers.google.com/google-ads/api/docs/policy-exemption/overview
        // for additional details.
        List<GoogleAdsError> policyFindingErrors =
            e.getGoogleAdsFailure().getErrorsList().stream()
                .filter(
                    err ->
                        err.getErrorCode().getPolicyFindingError()
                            == PolicyFindingError.POLICY_FINDING)
                .collect(Collectors.toList());
        int count = 1;
        for (GoogleAdsError policyFindingError : policyFindingErrors) {
          if (policyFindingError.getDetails().hasPolicyFindingDetails()) {
            List<PolicyTopicEntry> policyTopicEntries =
                policyFindingError
                    .getDetails()
                    .getPolicyFindingDetails()
                    .getPolicyTopicEntriesList();
            for (PolicyTopicEntry policyTopicEntry : policyTopicEntries) {
              System.out.printf(
                  "%d Policy topic entry with topic '%s' and type '%s' was found.%n",
                  count, policyTopicEntry.getTopic(), policyTopicEntry.getType());
            }
            count++;
          }
        }
      }
    } catch (Exception e) {
      System.out.printf("Failure: Message '%s'.%n", e.getMessage());
      System.exit(1);
    }
  }
}

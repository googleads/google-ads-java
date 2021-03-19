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

package com.google.ads.googleads.examples.errorhandling;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v6.common.KeywordInfo;
import com.google.ads.googleads.v6.common.PolicyViolationKey;
import com.google.ads.googleads.v6.enums.AdGroupCriterionStatusEnum.AdGroupCriterionStatus;
import com.google.ads.googleads.v6.enums.KeywordMatchTypeEnum.KeywordMatchType;
import com.google.ads.googleads.v6.errors.GoogleAdsError;
import com.google.ads.googleads.v6.errors.GoogleAdsException;
import com.google.ads.googleads.v6.errors.PolicyViolationDetails;
import com.google.ads.googleads.v6.resources.AdGroupCriterion;
import com.google.ads.googleads.v6.services.AdGroupCriterionOperation;
import com.google.ads.googleads.v6.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v6.services.MutateAdGroupCriteriaResponse;
import com.google.ads.googleads.v6.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates how to request an exemption for policy violations of a keyword.
 *
 * <p>The example uses an exemptible policy-violating keyword by default. If you use a keyword that
 * contains non-exemptible policy violations, it will not be sent with exemptions requested and you
 * will still fail to create a keyword.
 *
 * <p>If you specify a keyword that doesn't violate any policies, this example will just add the
 * keyword as usual, similar to what the AddKeywords example does.
 *
 * <p>When you send a request to add a keyword after requesting a policy exemption for that keyword,
 * the request will pass as if you were adding a non-violating keyword.
 */
public class HandleKeywordPolicyViolations {

  private static class HandleKeywordPolicyViolationsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;

    @Parameter(names = ArgumentNames.KEYWORD_TEXT)
    private String keywordText = "medication";
  }

  public static void main(String[] args) throws IOException {
    HandleKeywordPolicyViolationsParams params = new HandleKeywordPolicyViolationsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");

      // Optional: Specify a keywordText here, or the default specified above will be used.
      // params.keywordText = "INSERT_KEYWORD_TEXT_HERE";
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
      new HandleKeywordPolicyViolations()
          .runExample(googleAdsClient, params.customerId, params.adGroupId, params.keywordText);
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
   * @param adGroupId the ID of the ad group to add a keyword to.
   * @param keywordText the keyword text to add.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, Long adGroupId, String keywordText) {
    try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupCriterionServiceClient()) {
      // Configures the keyword text and match type settings.
      KeywordInfo keywordInfo =
          KeywordInfo.newBuilder()
              .setText(keywordText)
              .setMatchType(KeywordMatchType.EXACT)
              .build();

      // Constructs an ad group criterion using the keyword text info above.
      AdGroupCriterion adGroupCriterion =
          AdGroupCriterion.newBuilder()
              .setAdGroup(ResourceNames.adGroup(customerId, adGroupId))
              .setStatus(AdGroupCriterionStatus.ENABLED)
              .setKeyword(keywordInfo)
              .build();

      // Constructs an operation to create the ad group criterion.
      AdGroupCriterionOperation operation =
          AdGroupCriterionOperation.newBuilder().setCreate(adGroupCriterion).build();

      // Tries sending a mutate request to add the keyword.
      List<PolicyViolationKey> exemptibleKeys = new ArrayList<>();
      int errorCount = 0;
      try {
        MutateAdGroupCriteriaResponse response =
            adGroupCriterionServiceClient.mutateAdGroupCriteria(
                String.valueOf(customerId), ImmutableList.of(operation));
        // If the request succeeded, then either the keyword does not require a policy exemption or
        // a policy exemption was previously submitted for the keyword. In either case, returns and
        // skips the remaining portion of this example that resubmits with an exemption request.
        System.out.printf(
            "Successfully added a keyword with resource name '%s'. No exemptions needed.%n",
            response.getResults(0).getResourceName());
        return;
      } catch (GoogleAdsException e) {
        exemptibleKeys = extractExemptiblePolicyViolationKeys(e);
        errorCount = e.getGoogleAdsFailure().getErrorsCount();
      }

      // [START handle_keyword_policy_violations_1]
      // Tries sending exemption requests for creating the keyword. However, if your keyword
      // contains many policy violations, but not all of them are exemptible, the request will not
      // be sent.
      if (exemptibleKeys.size() == errorCount) {
        System.out.println(
            "Attempting to add the keyword again by requesting exemption for its policy"
                + " violations.");
        // Creates a modified version of the operation with the exempt policy violation keys.
        operation = operation.toBuilder().addAllExemptPolicyViolationKeys(exemptibleKeys).build();

        // Tries sending the mutate request again.
        MutateAdGroupCriteriaResponse response =
            adGroupCriterionServiceClient.mutateAdGroupCriteria(
                String.valueOf(customerId), ImmutableList.of(operation));
        System.out.printf(
            "Successfully added a keyword with resource name '%s' by requesting "
                + "policy violation exemptions.%n",
            response.getResults(0).getResourceName());
      } else {
        // [END handle_keyword_policy_violations_1]
        System.out.println("No exemption request was sent because either:");
        System.out.println("1) your keyword contained some non-exemptible policy violations, or");
        System.out.println("2) other non-policy related errors were thrown");
      }
    }
  }

  /**
   * Collects all policy violation keys that can be exempted for sending an exemption request later.
   *
   * @param googleAdsException the exception to extract the keys from.
   * @return the list of extracted exemptible keys.
   */
  // [START handle_keyword_policy_violations]
  private List<PolicyViolationKey> extractExemptiblePolicyViolationKeys(
      GoogleAdsException googleAdsException) {
    List<PolicyViolationKey> exemptibleKeys = new ArrayList<>();
    System.out.println("Google Ads failure details:");
    for (GoogleAdsError googleAdsError : googleAdsException.getGoogleAdsFailure().getErrorsList()) {
      System.out.printf("\t%s: %s%n", googleAdsError.getErrorCode(), googleAdsError.getMessage());
      if (googleAdsError.hasDetails() && googleAdsError.getDetails().hasPolicyViolationDetails()) {
        PolicyViolationDetails policyViolationDetails =
            googleAdsError.getDetails().getPolicyViolationDetails();
        System.out.println("\tPolicy violation details:");
        System.out.printf(
            "\t\tExternal policy name: '%s'%n", policyViolationDetails.getExternalPolicyName());
        System.out.printf(
            "\t\tExternal policy description: '%s'%n",
            policyViolationDetails.getExternalPolicyDescription());
        System.out.printf("\t\tIs exemptible? '%s'%n", policyViolationDetails.getIsExemptible());
        if (policyViolationDetails.getIsExemptible() && policyViolationDetails.hasKey()) {
          PolicyViolationKey policyViolationKey = policyViolationDetails.getKey();
          exemptibleKeys.add(policyViolationKey);
          System.out.println("\t\tPolicy violation key:");
          System.out.printf("\t\t\tName: '%s'%n", policyViolationKey.getPolicyName());
          System.out.printf("\t\t\tViolating text: '%s'%n", policyViolationKey.getViolatingText());
        }
      }
    }
    return exemptibleKeys;
  }
  // [END handle_keyword_policy_violations]
}

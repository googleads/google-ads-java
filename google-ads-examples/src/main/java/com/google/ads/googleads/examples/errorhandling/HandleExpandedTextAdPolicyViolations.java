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

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getShortPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v9.common.PolicyTopicEntry;
import com.google.ads.googleads.v9.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v9.errors.ErrorCode.ErrorCodeCase;
import com.google.ads.googleads.v9.errors.GoogleAdsError;
import com.google.ads.googleads.v9.errors.GoogleAdsException;
import com.google.ads.googleads.v9.errors.PolicyFindingDetails;
import com.google.ads.googleads.v9.resources.AdGroupAd;
import com.google.ads.googleads.v9.services.AdGroupAdOperation;
import com.google.ads.googleads.v9.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v9.services.MutateAdGroupAdsResponse;
import com.google.ads.googleads.v9.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates how to request an exemption for policy violations of an expanded text ad. If the
 * request somehow fails with exceptions that are not policy finding errors, the example will stop
 * instead of trying sending an exemption request.
 */
public class HandleExpandedTextAdPolicyViolations {

  private static class HandleExpandedTextAdPolicyViolationsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
  }

  public static void main(String[] args) {
    HandleExpandedTextAdPolicyViolationsParams params =
        new HandleExpandedTextAdPolicyViolationsParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID");
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
      new HandleExpandedTextAdPolicyViolations()
          .runExample(googleAdsClient, params.customerId, params.adGroupId);
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
   * @param googleAdsClient the client to use.
   * @param customerId the customer ID.
   * @param adGroupId the ad group ID.
   */
  public void runExample(GoogleAdsClient googleAdsClient, long customerId, long adGroupId) {
    // Creates an ad group ad for the specified ad group.
    AdGroupAd.Builder adGroupAdBuilder =
        AdGroupAd.newBuilder()
            .setAdGroup(ResourceNames.adGroup(customerId, adGroupId))
            .setStatus(AdGroupAdStatus.PAUSED);

    adGroupAdBuilder
        .getAdBuilder()
        // Sets the final URLS.
        .addFinalUrls("http://www.example.com")
        // Adds an expanded text ad.
        .getExpandedTextAdBuilder()
        .setHeadlinePart1("Cruise to Mars #" + getShortPrintableDateTime())
        .setHeadlinePart2("Best Space Cruise Line")
        // Adds a description with too much punctuation. This will fail policy.
        .setDescription("Buy your tickets now!!!!!!!");

    // Constructs an operation to send to the API.
    AdGroupAdOperation operation =
        AdGroupAdOperation.newBuilder().setCreate(adGroupAdBuilder.build()).build();

    // Connects to the API. Note that we could use try-with-resources, however doing so would
    // require that we either (1) need to reconnect to the API for requesting the exemption, or (2)
    // introduce a doubly nested try-catch structure here.
    AdGroupAdServiceClient client =
        googleAdsClient.getLatestVersion().createAdGroupAdServiceClient();

    try {
      // Sends the request which we expect to fail with policy violations.
      client.mutateAdGroupAds(String.valueOf(customerId), ImmutableList.of(operation));
    } catch (GoogleAdsException ex) {
      // Retrieves the ignorable policy topics.
      List<String> ignorablePolicyTopics = fetchIgnorablePolicyTopics(ex);
      // Requests an exemption to add the creative with the known violations.
      requestExemption(ignorablePolicyTopics, client, operation, customerId);
    } finally {
      // Disconnects the API connection. Very important!
      client.close();
    }
  }

  /**
   * Collects all ignorable policy topics that will be sent for exemption request later.
   *
   * @param gae the Google Ads exception.
   * @return the ignorable policy topics.
   */
  // [START handle_expanded_text_ad_policy_violations]
  private List<String> fetchIgnorablePolicyTopics(GoogleAdsException gae) {
    System.out.println("Google Ads failure details:");

    // Creates a list to store the result.
    List<String> ignorableTopics = new ArrayList<>();

    // Searches all errors for ignorable policy topics.
    for (GoogleAdsError error : gae.getGoogleAdsFailure().getErrorsList()) {
      // Supports sending exemption request for the policy finding error only.
      if (error.getErrorCode().getErrorCodeCase() != ErrorCodeCase.POLICY_FINDING_ERROR) {
        throw gae;
      }

      // Shows some information about the error encountered.
      System.out.printf("\t%s: %s%n", error.getErrorCode().getErrorCodeCase(), error.getMessage());

      // Checks policy finding details for ignorable policy topics.
      if (error.getDetails() != null) {
        PolicyFindingDetails policyFindingDetails = error.getDetails().getPolicyFindingDetails();
        if (policyFindingDetails != null) {
          System.out.println("\tPolicy finding details:");
          // Shows all the policy topics for the current error.
          for (PolicyTopicEntry policyTopicEntry :
              policyFindingDetails.getPolicyTopicEntriesList()) {
            // Adds this topic to the result.
            ignorableTopics.add(policyTopicEntry.getTopic());
            System.out.printf("\t\tPolicy topic name: '%s'%n", policyTopicEntry.getTopic());
            System.out.printf("\t\tPolicy topic entry type: '%s'%n", policyTopicEntry.getType());
            // For the sake of brevity, we exclude printing "policy topic evidences" and
            // "policy topic constraints" here. You can fetch those data by calling:
            // - policyTopicEntry.getEvidences()
            // - policyTopicEntry.getConstraints()
          }
        }
      }
    }
    return ignorableTopics;
  }
  // [END handle_expanded_text_ad_policy_violations]

  /**
   * Sends exemption requests for creating an expanded text ad.
   *
   * @param ignorablePolicyTopics topics to request exemption for.
   * @param client client to use for API access.
   * @param operation operation which generated original violations.
   * @param customerID the customer ID to operate on.
   */
  // [START handle_expanded_text_ad_policy_violations_1]
  private void requestExemption(
      List<String> ignorablePolicyTopics,
      AdGroupAdServiceClient client,
      AdGroupAdOperation operation,
      long customerID) {
    System.out.println(
        "Trying to add an expanded text ad again by requesting exemption for its policy"
            + " violations.");
    // Converts the operation back to a builder.
    AdGroupAdOperation.Builder operationBuilder = operation.toBuilder();

    // Adds the exemption request.
    operationBuilder
        .getPolicyValidationParameterBuilder()
        .addAllIgnorablePolicyTopics(ignorablePolicyTopics);

    // Sends the request back to the API.
    MutateAdGroupAdsResponse response =
        client.mutateAdGroupAds(
            String.valueOf(customerID), ImmutableList.of(operationBuilder.build()));

    // Shows the newly added ad resource name.
    System.out.printf(
        "Successfully added an expanded text ad with resource name '%s' by requesting a policy"
            + " violation exemption.%n",
        response.getResults(0).getResourceName());
  }
  // [END handle_expanded_text_ad_policy_violations_1]
}

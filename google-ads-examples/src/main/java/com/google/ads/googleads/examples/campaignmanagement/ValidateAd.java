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
import com.google.ads.googleads.v19.common.AdTextAsset;
import com.google.ads.googleads.v19.common.PolicyTopicEntry;
import com.google.ads.googleads.v19.common.ResponsiveSearchAdInfo;
import com.google.ads.googleads.v19.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v19.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType;
import com.google.ads.googleads.v19.errors.GoogleAdsError;
import com.google.ads.googleads.v19.errors.GoogleAdsException;
import com.google.ads.googleads.v19.errors.PolicyFindingErrorEnum.PolicyFindingError;
import com.google.ads.googleads.v19.resources.Ad;
import com.google.ads.googleads.v19.resources.AdGroupAd;
import com.google.ads.googleads.v19.services.AdGroupAdOperation;
import com.google.ads.googleads.v19.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v19.services.MutateAdGroupAdsRequest;
import com.google.ads.googleads.v19.services.MutateAdGroupAdsResponse;
import com.google.ads.googleads.v19.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Shows how to use the validateOnly request parameter to validate a responsive search ad. No ads
 * will be created, but exceptions will still be thrown.
 */
public class ValidateAd {

  private static class ValidateAdParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
  }

  public static void main(String[] args) {
    ValidateAdParams params = new ValidateAdParams();
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
      new ValidateAd().runExample(googleAdsClient, params.customerId, params.adGroupId);
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

    // Creates the responsive search ad info.
    ResponsiveSearchAdInfo responsiveSearchAdInfo =
        ResponsiveSearchAdInfo.newBuilder()
            .addAllHeadlines(
                ImmutableList.of(
                    AdTextAsset.newBuilder()
                        .setText("Visit the Red Planet in style.")
                        .setPinnedField(ServedAssetFieldType.HEADLINE_1)
                        .build(),
                    AdTextAsset.newBuilder().setText("Low-gravity fun for everyone!").build(),
                    AdTextAsset.newBuilder().setText("Book your Cruise to Mars now!").build()))
            .addAllDescriptions(
                ImmutableList.of(
                    AdTextAsset.newBuilder().setText("Luxury Cruise to Mars").build(),
                    AdTextAsset.newBuilder().setText("Book your ticket now").build()))
            .build();

    // Wraps the info in an Ad object.
    Ad ad =
        Ad.newBuilder()
            .setResponsiveSearchAd(responsiveSearchAdInfo)
            .addFinalUrls("https://www.example.com")
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
      // This line will not be executed since the ad will fail validation.
      System.out.println("Responsive search ad validated successfully.");
    } catch (GoogleAdsException e) {
      // This block will be hit if there is a validation error from the server.
      System.out.println("There were validation error(s) while adding responsive search ad.");

      // Note: Policy violation errors are returned as PolicyFindingErrors. See
      // https://developers.google.com/google-ads/api/docs/policy-exemption/overview
      // for additional details.
      List<GoogleAdsError> policyFindingErrors =
          e.getGoogleAdsFailure().getErrorsList().stream()
              .filter(
                  err ->
                      err.getErrorCode().getPolicyFindingError()
                          == PolicyFindingError.POLICY_FINDING)
              .collect(Collectors.toList());

      if (!policyFindingErrors.isEmpty()) {
        for (GoogleAdsError policyFindingError : policyFindingErrors) {
          int count = 1;
          if (policyFindingError.getDetails().hasPolicyFindingDetails()) {
            List<PolicyTopicEntry> policyTopicEntries =
                policyFindingError
                    .getDetails()
                    .getPolicyFindingDetails()
                    .getPolicyTopicEntriesList();
            for (PolicyTopicEntry policyTopicEntry : policyTopicEntries) {
              System.out.printf(
                  "%d Policy topic entries with topic '%s' and type '%s' found.%n",
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

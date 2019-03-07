// Copyright 2018 Google LLC
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
import com.google.ads.googleads.v1.errors.GoogleAdsException;
import com.google.ads.googleads.v1.common.PolicyTopicEntry;
import com.google.ads.googleads.v1.common.PolicyTopicEvidence;
import com.google.ads.googleads.v1.common.PolicyTopicEvidence.TextList;
import com.google.ads.googleads.v1.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus;
import com.google.ads.googleads.v1.errors.GoogleAdsError;
import com.google.ads.googleads.v1.resources.Ad;
import com.google.ads.googleads.v1.resources.AdGroupAd;
import com.google.ads.googleads.v1.resources.AdGroupAdPolicySummary;
import com.google.ads.googleads.v1.services.GoogleAdsRow;
import com.google.ads.googleads.v1.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v1.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v1.services.SearchGoogleAdsRequest;
import java.io.FileNotFoundException;
import java.io.IOException;

/** This example retrieves all the disapproved ads in a given campaign. */
public class GetAllDisapprovedAds {

  private static final int PAGE_SIZE = 1_000;

  private static class GetAllDisapprovedAdsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;
  }

  public static void main(String[] args) {
    GetAllDisapprovedAdsParams params = new GetAllDisapprovedAdsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
    }

    GoogleAdsClient googleAdsClient;
    try {
      googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
          "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      return;
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      return;
    }

    try {
      new GetAllDisapprovedAds().runExample(googleAdsClient, params.customerId, params.campaignId);
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
    }
  }

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignId the campaign ID for which ads will be retrieved.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, Long campaignId) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      String searchQuery =
          String.format(
              "SELECT ad_group_ad.ad.id, "
                  + "ad_group_ad.ad.type, "
                  + "ad_group_ad.policy_summary "
                  + "FROM ad_group_ad "
                  + "WHERE campaign.id = %d",
              campaignId);
      // Creates a request that will retrieve all ads using pages of the specified page size.
      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setPageSize(PAGE_SIZE)
              .setQuery(searchQuery)
              .build();
      // Issues the search request.
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);

      int disapprovedAdsCount = 0;

      // Iterates over all rows in all pages and counts disapproved ads.
      for (GoogleAdsRow googleAdsRow : searchPagedResponse.iterateAll()) {
        AdGroupAd adGroupAd = googleAdsRow.getAdGroupAd();
        AdGroupAdPolicySummary policySummary = adGroupAd.getPolicySummary();
        Ad ad = googleAdsRow.getAdGroupAd().getAd();

        if (policySummary.getApprovalStatus() != PolicyApprovalStatus.DISAPPROVED) {
          continue;
        }

        disapprovedAdsCount++;

        System.out.printf(
            "Ad with ID %d and type '%s' was disapproved with the following policy "
                + "topic entries:%n",
            ad.getId().getValue(), ad.getType());
        for (PolicyTopicEntry policyTopicEntry : policySummary.getPolicyTopicEntriesList()) {
          System.out.printf(
              "  topic: '%s', type: '%s'%n",
              policyTopicEntry.getTopic().getValue(), policyTopicEntry.getType());
          for (PolicyTopicEvidence evidence : policyTopicEntry.getEvidencesList()) {
            TextList textList = evidence.getTextList();
            for (int i = 0; i < textList.getTextsCount(); i++) {
              System.out.printf(
                  "    evidence text[%d]: '%s'%n", i, textList.getTexts(i).getValue());
            }
          }
        }
      }

      System.out.printf("Number of disapproved ads found: %d%n", disapprovedAdsCount);
    }
  }
}

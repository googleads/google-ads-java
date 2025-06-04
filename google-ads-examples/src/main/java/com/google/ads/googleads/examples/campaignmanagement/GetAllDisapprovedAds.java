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
import com.google.ads.googleads.v20.common.PolicyTopicEntry;
import com.google.ads.googleads.v20.common.PolicyTopicEvidence;
import com.google.ads.googleads.v20.common.PolicyTopicEvidence.TextList;
import com.google.ads.googleads.v20.errors.GoogleAdsError;
import com.google.ads.googleads.v20.errors.GoogleAdsException;
import com.google.ads.googleads.v20.resources.Ad;
import com.google.ads.googleads.v20.resources.AdGroupAd;
import com.google.ads.googleads.v20.resources.AdGroupAdPolicySummary;
import com.google.ads.googleads.v20.services.GoogleAdsRow;
import com.google.ads.googleads.v20.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v20.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v20.services.SearchGoogleAdsRequest;
import com.google.ads.googleads.v20.services.SearchSettings;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Retrieves all the disapproved ads in a given campaign. */
public class GetAllDisapprovedAds {

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
      System.exit(1);
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
              "SELECT ad_group_ad.ad.id,"
                  + "ad_group_ad.ad.type,"
                  + "ad_group_ad.policy_summary.approval_status,"
                  + "ad_group_ad.policy_summary.policy_topic_entries "
                  + "FROM ad_group_ad "
                  + "WHERE campaign.id = %d "
                  + "AND ad_group_ad.policy_summary.approval_status = 'DISAPPROVED'",
              campaignId);
      // Creates a request that will retrieve all disapproved ads.
      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setQuery(searchQuery)
              .setSearchSettings(
                  SearchSettings.newBuilder().setReturnTotalResultsCount(true))
              .build();
      // Issues the search request.
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);

      // Iterates over all rows in all pages and counts disapproved ads.
      for (GoogleAdsRow googleAdsRow : searchPagedResponse.iterateAll()) {
        AdGroupAd adGroupAd = googleAdsRow.getAdGroupAd();
        AdGroupAdPolicySummary policySummary = adGroupAd.getPolicySummary();
        Ad ad = googleAdsRow.getAdGroupAd().getAd();

        System.out.printf(
            "Ad with ID %d and type '%s' was disapproved with the following policy "
                + "topic entries:%n",
            ad.getId(), ad.getType());
        for (PolicyTopicEntry policyTopicEntry : policySummary.getPolicyTopicEntriesList()) {
          System.out.printf(
              "  topic: '%s', type: '%s'%n",
              policyTopicEntry.getTopic(), policyTopicEntry.getType());
          for (PolicyTopicEvidence evidence : policyTopicEntry.getEvidencesList()) {
            TextList textList = evidence.getTextList();
            for (int i = 0; i < textList.getTextsCount(); i++) {
              System.out.printf("    evidence text[%d]: '%s'%n", i, textList.getTexts(i));
            }
          }
        }
      }

      System.out.printf(
          "Number of disapproved ads found: %d%n",
          searchPagedResponse.getPage().getResponse().getTotalResultsCount());
    }
  }
}

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

package com.google.ads.googleads.examples.targeting;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v9.errors.GoogleAdsError;
import com.google.ads.googleads.v9.errors.GoogleAdsException;
import com.google.ads.googleads.v9.resources.CampaignCriterion;
import com.google.ads.googleads.v9.resources.CampaignCriterion.CriterionCase;
import com.google.ads.googleads.v9.services.GoogleAdsRow;
import com.google.ads.googleads.v9.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v9.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v9.services.SearchGoogleAdsRequest;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Gets all campaign criteria. To add campaign criteria, run AddCampaignCriteria.java. */
public class GetCampaignTargetingCriteria {

  private static final int PAGE_SIZE = 1_000;

  private static class GetCampaignsWithStatsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;
  }

  public static void main(String[] args) {
    GetCampaignsWithStatsParams params = new GetCampaignsWithStatsParams();
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
      new GetCampaignTargetingCriteria()
          .runExample(googleAdsClient, params.customerId, params.campaignId);
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
   * @param campaignId the campaign ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long campaignId) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Creates a request that will retrieve all campaign criteria using pages of the specified
      // page size.
      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setPageSize(PAGE_SIZE)
              .setQuery(
                  String.format(
                      "SELECT campaign.id, campaign_criterion.campaign, "
                          + " campaign_criterion.criterion_id,"
                          + " campaign_criterion.negative, campaign_criterion.keyword.text,"
                          + " campaign_criterion.keyword.match_type FROM campaign_criterion"
                          + " WHERE campaign.id = %s",
                      Long.toString(campaignId)))
              .build();
      // Issues the search request.
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);
      // Iterates over all rows in all pages and prints the requested field values for the campaign
      // criteria in each row.
      for (GoogleAdsRow googleAdsRow : searchPagedResponse.iterateAll()) {
        CampaignCriterion campaignCriterion = googleAdsRow.getCampaignCriterion();
        System.out.printf(
            "Campaign criterion with ID %d was found as a %s",
            campaignCriterion.getCriterionId(), campaignCriterion.getNegative() ? "negative " : "");
        if (CriterionCase.KEYWORD.equals(campaignCriterion.getCriterionCase())) {
          System.out.printf(
              "keyword with text '%s' and match type '%s'.%n",
              campaignCriterion.getKeyword().getText(),
              campaignCriterion.getKeyword().getMatchType());
        } else {
          System.out.printf("non-keyword.%n");
        }
      }
    }
  }
}

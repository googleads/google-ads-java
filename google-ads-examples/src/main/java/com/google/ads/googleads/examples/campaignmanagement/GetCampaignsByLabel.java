// Copyright 2019 Google LLC
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
import com.google.ads.googleads.v13.errors.GoogleAdsError;
import com.google.ads.googleads.v13.errors.GoogleAdsException;
import com.google.ads.googleads.v13.services.GoogleAdsRow;
import com.google.ads.googleads.v13.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v13.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v13.services.SearchGoogleAdsRequest;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Gets all campaigns with a specific label. */
public class GetCampaignsByLabel {

  private static final int PAGE_SIZE = 1_000;

  private static class GetCampaignsByLabelParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.LABEL_ID, required = true)
    private Long labelId;
  }

  public static void main(String[] args) throws IOException {
    GetCampaignsByLabelParams params = new GetCampaignsByLabelParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.labelId = Long.parseLong("INSERT_LABEL_ID_HERE");
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
      new GetCampaignsByLabel().runExample(googleAdsClient, params.customerId, params.labelId);
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
   * @param labelId the label ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START get_campaigns_by_label]
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long labelId) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Creates a request that will retrieve all campaign labels with the specified
      // labelId using pages of the specified page size.
      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setPageSize(PAGE_SIZE)
              .setQuery(
                  "SELECT campaign.id, campaign.name, label.id, label.name "
                      + "FROM campaign_label WHERE label.id = "
                      + labelId
                      + " ORDER BY campaign.id")
              .build();
      // Issues the search request.
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);
      // Checks if the total results count is greater than 0.
      if (searchPagedResponse.getPage().getResponse().getTotalResultsCount() > 0) {
        // Iterates over all rows in all pages and prints the requested field values for the
        // campaigns and labels in each row. The results include the campaign and label
        // objects because these were included in the search criteria.
        for (GoogleAdsRow googleAdsRow : searchPagedResponse.iterateAll()) {
          System.out.printf(
              "Campaign found with name '%s', ID %d, and label: %s.%n",
              googleAdsRow.getCampaign().getName(),
              googleAdsRow.getCampaign().getId(),
              googleAdsRow.getLabel().getName());
        }
      } else {
        System.out.println("No campaigns were found.");
      }
    }
  }
  // [END get_campaigns_by_label]
}

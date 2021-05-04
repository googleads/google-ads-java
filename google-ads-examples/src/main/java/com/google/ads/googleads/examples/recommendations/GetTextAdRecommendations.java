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

package com.google.ads.googleads.examples.recommendations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v7.common.ExpandedTextAdInfo;
import com.google.ads.googleads.v7.errors.GoogleAdsError;
import com.google.ads.googleads.v7.errors.GoogleAdsException;
import com.google.ads.googleads.v7.resources.Ad;
import com.google.ads.googleads.v7.resources.Recommendation;
import com.google.ads.googleads.v7.services.GoogleAdsRow;
import com.google.ads.googleads.v7.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v7.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v7.services.SearchGoogleAdsRequest;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Gets all TEXT_AD recommendations. */
public class GetTextAdRecommendations {
  private static final int PAGE_SIZE = 1_000;

  private static class GetTextAdRecommendationsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) throws IOException {
    GetTextAdRecommendations.GetTextAdRecommendationsParams params =
        new GetTextAdRecommendations.GetTextAdRecommendationsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
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
      new GetTextAdRecommendations().runExample(googleAdsClient, params.customerId);
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
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START get_text_ad_recommendations]
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      String query =
          "SELECT recommendation.type, "
              + "recommendation.campaign, "
              + "recommendation.text_ad_recommendation "
              + "FROM recommendation "
              + "WHERE recommendation.type = TEXT_AD";

      // Creates a request that will retrieve all recommendations using pages of the
      // specified page size.
      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setPageSize(PAGE_SIZE)
              .setQuery(query)
              .build();
      // Issues the search request.
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);

      // Iterates over all rows in all pages and prints the requested field values for the
      // recommendation in each row.
      for (GoogleAdsRow googleAdsRow : searchPagedResponse.iterateAll()) {
        Recommendation recommendation = googleAdsRow.getRecommendation();
        Ad recommendedAd = recommendation.getTextAdRecommendation().getAd();

        System.out.printf(
            "Recommendation ('%s') was found for campaign '%s':%n",
            recommendation.getResourceName(), recommendation.getCampaign());
        if (recommendedAd.hasExpandedTextAd()) {
          ExpandedTextAdInfo eta = recommendedAd.getExpandedTextAd();
          System.out.printf(
              "\tHeadline 1 = '%s'%n" + "\tHeadline 2 = '%s'%n" + "\tDescription = '%s'%n",
              eta.getHeadlinePart1(), eta.getHeadlinePart2(), eta.getDescription());
        }
        if (recommendedAd.getDisplayUrl() != null) {
          System.out.printf("\tDisplay URL = '%s'%n", recommendedAd.getDisplayUrl());
        }
        for (String url : recommendedAd.getFinalUrlsList()) {
          System.out.printf("\tFinal URL = '%s'%n", url);
        }
        for (String url : recommendedAd.getFinalMobileUrlsList()) {
          System.out.printf("\tFinal Mobile URL = '%s'%n", url);
        }
      }
    }
  }
  // [END get_text_ad_recommendations]
}

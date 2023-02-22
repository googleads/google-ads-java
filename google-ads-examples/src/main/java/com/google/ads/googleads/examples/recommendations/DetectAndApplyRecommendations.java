// Copyright 2022 Google LLC
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
import com.google.ads.googleads.v13.errors.GoogleAdsError;
import com.google.ads.googleads.v13.errors.GoogleAdsException;
import com.google.ads.googleads.v13.services.ApplyRecommendationOperation;
import com.google.ads.googleads.v13.services.ApplyRecommendationResponse;
import com.google.ads.googleads.v13.services.ApplyRecommendationResult;
import com.google.ads.googleads.v13.services.GoogleAdsRow;
import com.google.ads.googleads.v13.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v13.services.RecommendationServiceClient;
import com.google.ads.googleads.v13.services.SearchGoogleAdsStreamRequest;
import com.google.ads.googleads.v13.services.SearchGoogleAdsStreamResponse;
import com.google.api.gax.rpc.ServerStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * The auto-apply feature, which automatically applies recommendations as they become eligible, is
 * currently supported by the Google Ads UI but not by the Google Ads API. See
 * https://support.google.com/google-ads/answer/10279006 for more information on using auto-apply in
 * the Google Ads UI.
 *
 * <p>This example demonstrates how an alternative can be implemented with the features that are
 * currently supported by the Google Ads API. It periodically retrieves and applies `KEYWORD`
 * recommendations with default parameters.
 */
public class DetectAndApplyRecommendations {
  // The maximum number of recommendations to periodically retrieve and apply.  In a real
  // application, such a limit would typically not be used.
  private static final int MAX_RESULT_SIZE = 2;
  // The number of times to retrieve and apply recommendations. In a real application, such a
  // limit would typically not be used.
  private static final int NUMBER_OF_RUNS = 3;
  // The time to wait between two runs. In a real application, this would typically be set to
  // minutes or hours instead of seconds.
  private static final int PERIOD_IN_SECONDS = 5;

  private static class DetectAndApplyRecommendationsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) throws IOException, InterruptedException {
    DetectAndApplyRecommendationsParams params = new DetectAndApplyRecommendationsParams();
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
      new DetectAndApplyRecommendations().runExample(googleAdsClient, params.customerId);
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
  private void runExample(GoogleAdsClient googleAdsClient, long customerId)
      throws InterruptedException {
    try (GoogleAdsServiceClient googleAdsServiceClient =
            googleAdsClient.getLatestVersion().createGoogleAdsServiceClient();
        RecommendationServiceClient recommendationServiceClient =
            googleAdsClient.getLatestVersion().createRecommendationServiceClient()) {
      // Creates a query that retrieves keyword recommendations.
      String query =
          "SELECT recommendation.resource_name "
              + "FROM recommendation "
              + "WHERE recommendation.type = KEYWORD "
              + "LIMIT "
              + MAX_RESULT_SIZE;
      for (int i = 0; i < NUMBER_OF_RUNS; i++) {
        // Constructs the SearchGoogleAdsStreamRequest.
        SearchGoogleAdsStreamRequest request =
            SearchGoogleAdsStreamRequest.newBuilder()
                .setCustomerId(Long.toString(customerId))
                .setQuery(query)
                .build();

        // Issues the search stream request.
        ServerStream<SearchGoogleAdsStreamResponse> stream =
            googleAdsServiceClient.searchStreamCallable().call(request);

        // Creates apply operations for all the recommendations found.
        List<ApplyRecommendationOperation> applyRecommendationOperations = new ArrayList<>();
        for (SearchGoogleAdsStreamResponse response : stream) {
          for (GoogleAdsRow googleAdsRow : response.getResultsList()) {
            applyRecommendationOperations.add(
                ApplyRecommendationOperation.newBuilder()
                    .setResourceName(googleAdsRow.getRecommendation().getResourceName())
                    .build());
          }
        }

        if (applyRecommendationOperations.isEmpty()) {
          System.out.println("No recommendations found.");
        } else {
          // Sends the apply recommendation request and prints information.
          ApplyRecommendationResponse applyRecommendationsResponse =
              recommendationServiceClient.applyRecommendation(
                  Long.toString(customerId), applyRecommendationOperations);
          for (ApplyRecommendationResult applyRecommendationResult :
              applyRecommendationsResponse.getResultsList()) {
            System.out.printf(
                "Applied recommendation with resource name: '%s'.%n",
                applyRecommendationResult.getResourceName());
          }
        }

        if (i < NUMBER_OF_RUNS - 1) {
          System.out.printf(
              "Waiting %d seconds before checking for additional recommendations.%n",
              PERIOD_IN_SECONDS);
          Thread.sleep(TimeUnit.SECONDS.toMillis(PERIOD_IN_SECONDS));
        }
      }
    }
  }
}

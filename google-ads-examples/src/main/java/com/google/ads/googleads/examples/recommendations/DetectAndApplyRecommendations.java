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
import com.google.ads.googleads.v16.common.KeywordInfo;
import com.google.ads.googleads.v16.errors.GoogleAdsError;
import com.google.ads.googleads.v16.errors.GoogleAdsException;
import com.google.ads.googleads.v16.resources.Recommendation;
import com.google.ads.googleads.v16.services.ApplyRecommendationOperation;
import com.google.ads.googleads.v16.services.ApplyRecommendationOperation.Builder;
import com.google.ads.googleads.v16.services.ApplyRecommendationResponse;
import com.google.ads.googleads.v16.services.ApplyRecommendationResult;
import com.google.ads.googleads.v16.services.GoogleAdsRow;
import com.google.ads.googleads.v16.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v16.services.RecommendationServiceClient;
import com.google.ads.googleads.v16.services.SearchGoogleAdsStreamRequest;
import com.google.ads.googleads.v16.services.SearchGoogleAdsStreamResponse;
import com.google.api.gax.rpc.ServerStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This example shows how to retrieve recommendations and apply them in a batch.
 *
 * <p>Recommendations should be applied shortly after they're retrieved. Depending on the
 * recommendation type, a recommendation can become obsolete quickly, and obsolete recommendations
 * throw an error when applied. For more details, see:
 * https://developers.google.com/google-ads/api/docs/recommendations#take_action
 *
 * <p>As of Google Ads API v15 users can subscribe to certain recommendation types to apply them
 * automatically. For more details, see:
 * https://developers.google.com/google-ads/api/docs/recommendations#auto-apply
 *
 * <p>As of Google Ads API v16 users can proactively generate certain recommendation types during
 * the campaign construction process. For more details see:
 * https://developers.google.com/google-ads/api/docs/recommendations#recommendations-in-campaign-construction
 */
public class DetectAndApplyRecommendations {

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
    // [START detect_keyword_recommendations]
    try (GoogleAdsServiceClient googleAdsServiceClient =
            googleAdsClient.getLatestVersion().createGoogleAdsServiceClient();
        RecommendationServiceClient recommendationServiceClient =
            googleAdsClient.getLatestVersion().createRecommendationServiceClient()) {
      // Creates a query that retrieves keyword recommendations.
      String query =
          "SELECT recommendation.resource_name, "
              + "  recommendation.campaign, "
              + "  recommendation.keyword_recommendation "
              + "FROM recommendation "
              + "WHERE recommendation.type = KEYWORD";
      // Constructs the SearchGoogleAdsStreamRequest.
      SearchGoogleAdsStreamRequest request =
          SearchGoogleAdsStreamRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setQuery(query)
              .build();

      // Issues the search stream request to detect keyword recommendations that exist for the
      // customer account.
      ServerStream<SearchGoogleAdsStreamResponse> stream =
          googleAdsServiceClient.searchStreamCallable().call(request);

      // Creates apply operations for all the recommendations found.
      List<ApplyRecommendationOperation> applyRecommendationOperations = new ArrayList<>();
      for (SearchGoogleAdsStreamResponse response : stream) {
        for (GoogleAdsRow googleAdsRow : response.getResultsList()) {
          Recommendation recommendation = googleAdsRow.getRecommendation();
          System.out.printf(
              "Keyword recommendation '%s' was found for campaign '%s'%n",
              recommendation.getResourceName(), recommendation.getCampaign());
          KeywordInfo keyword = recommendation.getKeywordRecommendation().getKeyword();
          System.out.printf("\tKeyword = '%s'%n", keyword.getText());
          System.out.printf("\tMatch type = '%s'%n", keyword.getMatchType());

          // Creates an ApplyRecommendationOperation that will apply this recommendation, and adds
          // it to the list of operations.
          applyRecommendationOperations.add(buildRecommendationOperation(recommendation));
        }
      }
      // [END detect_keyword_recommendations]

      // If there are operations present, sends a request to apply the recommendations.
      if (applyRecommendationOperations.isEmpty()) {
        System.out.println("No recommendations found.");
      } else {
        // [START apply_recommendation]
        // Issues a mutate request to apply the recommendations.
        ApplyRecommendationResponse applyRecommendationsResponse =
            recommendationServiceClient.applyRecommendation(
                Long.toString(customerId), applyRecommendationOperations);
        for (ApplyRecommendationResult applyRecommendationResult :
            applyRecommendationsResponse.getResultsList()) {
          System.out.printf(
              "Applied recommendation with resource name: '%s'.%n",
              applyRecommendationResult.getResourceName());
        }
        // [END apply_recommendation]
      }
    }
  }

  // [START build_apply_recommendation_operation]
  /** Creates and returns an ApplyRecommendationOperation to apply the given recommendation. */
  private ApplyRecommendationOperation buildRecommendationOperation(Recommendation recommendation) {
    // If you have a recommendation ID instead of a resource name, you can create a resource name
    // like this:
    // String resourceName = ResourceNames.recommendation(customerId, recommendationId);

    // Creates a builder to construct the operation.
    Builder operationBuilder = ApplyRecommendationOperation.newBuilder();

    // Each recommendation type has optional parameters to override the recommended values. Below is
    // an example showing how to override a recommended ad when a TextAdRecommendation is applied.
    // operationBuilder.getTextAdBuilder().getAdBuilder().setResourceName("INSERT_AD_RESOURCE_NAME");

    // Sets the operation's resource name to the resource name of the recommendation to apply.
    operationBuilder.setResourceName(recommendation.getResourceName());
    return operationBuilder.build();
  }
  // [END build_apply_recommendation_operation]
}

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
import com.google.ads.googleads.v10.errors.GoogleAdsError;
import com.google.ads.googleads.v10.errors.GoogleAdsException;
import com.google.ads.googleads.v10.services.ApplyRecommendationOperation;
import com.google.ads.googleads.v10.services.ApplyRecommendationResponse;
import com.google.ads.googleads.v10.services.ApplyRecommendationResult;
import com.google.ads.googleads.v10.services.RecommendationServiceClient;
import com.google.ads.googleads.v10.utils.ResourceNames;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Applies a given recommendation. To retrieve recommendations for text ads, run
 * GetTextAdRecommendations.java.
 */
public class ApplyRecommendation {
  private static class ApplyRecommendationParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.RECOMMENDATION_ID, required = true)
    private String recommendationId;
  }

  public static void main(String[] args) throws IOException {
    ApplyRecommendation.ApplyRecommendationParams params =
        new ApplyRecommendation.ApplyRecommendationParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");

      // Recommendation ID is the last alphanumeric portion of the value from
      // Recommendation.getResourceName(), which has the format of
      // `customers/<customer_id>/recommendations/<recommendation_id>`.
      // Its example can be retrieved from GetTextAdRecommendations.java
      params.recommendationId = "INSERT_RECOMMENDATION_ID_HERE";
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
      new ApplyRecommendation()
          .runExample(googleAdsClient, params.customerId, params.recommendationId);
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
   * @param recommendationId the recommendation ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START apply_recommendation]
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, String recommendationId) {
    String recommendationResourceName = ResourceNames.recommendation(customerId, recommendationId);

    ApplyRecommendationOperation.Builder operationBuilder =
        ApplyRecommendationOperation.newBuilder().setResourceName(recommendationResourceName);
    // Each recommendation types has optional parameters to override the recommended values.
    // This is an example to override a recommended ad when a TextAdRecommendation is applied.
    // Please read
    // https://developers.google.com/google-ads/api/reference/rpc/latest/ApplyRecommendationOperation
    // for details.
    // Note that additional import statements are needed for this example to work. And also, please
    // replace INSERT_AD_ID_HERE with a valid ad ID below.
    //
    // Ad overrideAd = Ad.newBuilder().setId(Long.parseLong("INSERT_AD_ID_HERE")).build();
    // operationBuilder.setTextAd(TextAdParameters.newBuilder().
    //     setAd(overrideAd).build()).build();
    List<ApplyRecommendationOperation> operations = new ArrayList<>();
    operations.add(operationBuilder.build());

    try (RecommendationServiceClient recommendationServiceClient =
        googleAdsClient.getLatestVersion().createRecommendationServiceClient()) {
      ApplyRecommendationResponse response =
          recommendationServiceClient.applyRecommendation(Long.toString(customerId), operations);
      System.out.printf("Applied %d recommendation:%n", response.getResultsCount());
      for (ApplyRecommendationResult result : response.getResultsList()) {
        System.out.println(result.getResourceName());
      }
    }
  }
  // [END apply_recommendation]
}

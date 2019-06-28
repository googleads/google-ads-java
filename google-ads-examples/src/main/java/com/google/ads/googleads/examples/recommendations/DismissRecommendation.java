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

package com.google.ads.googleads.examples.recommendations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v1.utils.ResourceNames;
import com.google.ads.googleads.v1.errors.GoogleAdsError;
import com.google.ads.googleads.v1.errors.GoogleAdsException;
import com.google.ads.googleads.v1.services.DismissRecommendationRequest.DismissRecommendationOperation;
import com.google.ads.googleads.v1.services.DismissRecommendationResponse;
import com.google.ads.googleads.v1.services.DismissRecommendationResponse.DismissRecommendationResult;
import com.google.ads.googleads.v1.services.RecommendationServiceClient;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * Dismisses a given recommendation. To retrieve recommendations for text ads,
 * run GetTextAdRecommendations.java.
 */
public class DismissRecommendation {

  private static class DismissRecommendationParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.RECOMMENDATION_ID, required = true)
    private String recommendationId;
  }

  public static void main(String[] args) {
    DismissRecommendationParams params = new DismissRecommendationParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");

      // Recommendation ID is the last alphanumeric portion of the value from
      // Recommendation.getResourceName(), which has the format of
      // `customers/<customer_id>/recommendations/<recommendation_id>`.
      // Its example can be retrieved from GetTextAdRecommendations.java.
      params.recommendationId = "INSERT_RECOMMENDATION_ID_HERE";
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
      new DismissRecommendation()
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
    }
  }

  /**
   * Runs the example.
   */
  private void runExample(GoogleAdsClient googleAdsClient, Long customerId,
      String recommendationId) {
    // Converts the customer and recommendation ID to a resource name.
    String resourceName = ResourceNames.recommendation(customerId, recommendationId);

    // Constructs a dismiss operation for the recommendation.
    DismissRecommendationOperation operation = DismissRecommendationOperation.newBuilder()
        .setResourceName(resourceName)
        .build();

    // Issues a mutate request to dismiss the recommendation.
    try (RecommendationServiceClient client = googleAdsClient.getLatestVersion().createRecommendationServiceClient()) {
      DismissRecommendationResponse response = client
          .dismissRecommendation(customerId.toString(), Arrays.asList(operation));

      DismissRecommendationResult result = response.getResultsList().get(0);

      System.out
          .printf("Dismissed recommendation with resource name: '%s'%n", result.getResourceName());
    }
  }
}

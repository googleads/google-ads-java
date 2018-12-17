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

package com.google.ads.googleads.examples.planning;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.GoogleAdsException;
import com.google.ads.googleads.lib.utils.ResourceNames;
import com.google.ads.googleads.v0.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork;
import com.google.ads.googleads.v0.errors.GoogleAdsError;
import com.google.ads.googleads.v0.services.GenerateKeywordIdeaResponse;
import com.google.ads.googleads.v0.services.GenerateKeywordIdeaResult;
import com.google.ads.googleads.v0.services.GenerateKeywordIdeasRequest;
import com.google.ads.googleads.v0.services.KeywordPlanIdeaServiceClient;
import com.google.ads.googleads.v0.services.KeywordSeed;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/** This example generates keyword ideas from a list of seed keywords. */
public class GenerateKeywordIdeas {

  private static class GenerateKeywordIdeasParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(
        names = ArgumentNames.LOCATION_ID,
        required = true,
        description =
            "Location criteria IDs. For example, specify 21167 for New York. For more information"
                + " on determining this value, see: "
                + " https://developers.google.com/adwords/api/docs/appendix/geotargeting.")
    private List<Long> locationIds;

    @Parameter(
        names = ArgumentNames.LANGUAGE_ID,
        required = true,
        description =
            "A language criterion ID. For example, specify 1000 for English. For more information"
                + " on determining this value, see: "
                + " https://developers.google.com/adwords/api/docs/appendix/codes-formats#languages")
    private Long languageId;

    @Parameter(names = ArgumentNames.KEYWORD_TEXT, required = true)
    private List<String> keywords;
  }

  public static void main(String[] args) throws IOException {
    GenerateKeywordIdeasParams params = new GenerateKeywordIdeasParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.locationIds =
          Arrays.asList(
              Long.parseLong("INSERT_LOCATION_ID_1_HERE"),
              Long.parseLong("INSERT_LOCATION_ID_2_HERE"));
      params.languageId = Long.parseLong("INSERT_LANGUAGE_ID_HERE");
      params.keywords = Arrays.asList("INSERT_KEYWORD_1_HERE", "INSERT_KEYWORD_2_HERE");
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
      new GenerateKeywordIdeas()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.languageId,
              params.locationIds,
              params.keywords);
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
   * @param languageId the language ID.
   * @param locationIds the location IDs.
   * @param keywords the list of keywords to use as a seed for ideas.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   * @throws Exception if the example failed due to other errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long languageId,
      List<Long> locationIds,
      List<String> keywords) {
    try (KeywordPlanIdeaServiceClient keywordPlanServiceClient =
        googleAdsClient.getKeywordPlanIdeaServiceClient()) {
      GenerateKeywordIdeasRequest.Builder requestBuilder =
          GenerateKeywordIdeasRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              // Set the language resource using the provided language ID.
              .setLanguage(StringValue.of(ResourceNames.languageConstant(languageId)))
              .setKeywordPlanNetwork(KeywordPlanNetwork.GOOGLE_SEARCH);

      // Add the resource name of each location ID to the request.
      for (Long locationId : locationIds) {
        requestBuilder.addGeoTargetConstants(
            StringValue.of(ResourceNames.geoTargetConstant(locationId)));
      }

      // Add each keyword seed to the request's keyword seed list.
      KeywordSeed.Builder keywordSeedBuilder = requestBuilder.getKeywordSeedBuilder();
      for (String keyword : keywords) {
        keywordSeedBuilder.addKeywords(StringValue.of(keyword));
      }

      // Send the keyword ideas request.
      GenerateKeywordIdeaResponse response =
          keywordPlanServiceClient.generateKeywordIdeas(requestBuilder.build());
      // Print each result in the response.
      for (GenerateKeywordIdeaResult result : response.getResultsList()) {
        System.out.printf(
            "Keyword idea text '%s' has %d average monthly searches and '%s' competition.%n",
            result.getText().getValue(),
            result.getKeywordIdeaMetrics().getAvgMonthlySearches().getValue(),
            result.getKeywordIdeaMetrics().getCompetition());
      }
    }
  }
}

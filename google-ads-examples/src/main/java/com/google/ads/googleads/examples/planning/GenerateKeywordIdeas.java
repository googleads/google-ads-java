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
import com.google.ads.googleads.v5.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork;
import com.google.ads.googleads.v5.errors.GoogleAdsError;
import com.google.ads.googleads.v5.errors.GoogleAdsException;
import com.google.ads.googleads.v5.services.GenerateKeywordIdeaResult;
import com.google.ads.googleads.v5.services.GenerateKeywordIdeasRequest;
import com.google.ads.googleads.v5.services.KeywordPlanIdeaServiceClient;
import com.google.ads.googleads.v5.services.KeywordPlanIdeaServiceClient.GenerateKeywordIdeasPagedResponse;
import com.google.ads.googleads.v5.utils.ResourceNames;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

/** Generates keyword ideas from a list of seed keywords. */
public class GenerateKeywordIdeas {

  private static class GenerateKeywordIdeasParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(
        names = ArgumentNames.LOCATION_IDS,
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

    @Parameter(names = ArgumentNames.KEYWORD_TEXTS)
    private List<String> keywords = new ArrayList<>();

    @Parameter(
        names = ArgumentNames.PAGE_URL,
        description = "URL of a page related to your business")
    private String pageUrl;
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
      // Optional: Use a URL related to your business to generate ideas.
      params.pageUrl = null;
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
      new GenerateKeywordIdeas()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.languageId,
              params.locationIds,
              params.keywords,
              params.pageUrl);
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
   * @param languageId the language ID.
   * @param locationIds the location IDs.
   * @param keywords the list of keywords to use as a seed for ideas.
   * @param pageUrl optional URL related to your business to use as a seed for ideas.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   * @throws IllegalArgumentException if {@code keywords} is empty and {@code pageUrl} is null.
   * @throws Exception if the example failed due to other errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long languageId,
      List<Long> locationIds,
      List<String> keywords,
      @Nullable String pageUrl) {
    try (KeywordPlanIdeaServiceClient keywordPlanServiceClient =
        googleAdsClient.getLatestVersion().createKeywordPlanIdeaServiceClient()) {
      GenerateKeywordIdeasRequest.Builder requestBuilder =
          GenerateKeywordIdeasRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              // Sets the language resource using the provided language ID.
              .setLanguage(StringValue.of(ResourceNames.languageConstant(languageId)))
              // Sets the network. To restrict to only Google Search, change the parameter below to
              // KeywordPlanNetwork.GOOGLE_SEARCH.
              .setKeywordPlanNetwork(KeywordPlanNetwork.GOOGLE_SEARCH_AND_PARTNERS);

      // Adds the resource name of each location ID to the request.
      for (Long locationId : locationIds) {
        requestBuilder.addGeoTargetConstants(
            StringValue.of(ResourceNames.geoTargetConstant(locationId)));
      }

      // Makes sure that keywords and/or page URL were specified. The request must have exactly one
      // of urlSeed, keywordSeed, or keywordAndUrlSeed set.
      if (keywords.isEmpty() && pageUrl == null) {
        throw new IllegalArgumentException(
            "At least one of keywords or page URL is required, but neither was specified.");
      }

      if (keywords.isEmpty()) {
        // Only page URL was specified, so use a UrlSeed.
        requestBuilder.getUrlSeedBuilder().setUrl(StringValue.of(pageUrl));
      } else if (pageUrl == null) {
        // Only keywords were specified, so use a KeywordSeed.
        requestBuilder
            .getKeywordSeedBuilder()
            .addAllKeywords(keywords.stream().map(StringValue::of).collect(Collectors.toList()));
      } else {
        // Both page URL and keywords were specified, so use a KeywordAndUrlSeed.
        requestBuilder
            .getKeywordAndUrlSeedBuilder()
            .setUrl(StringValue.of(pageUrl))
            .addAllKeywords(keywords.stream().map(StringValue::of).collect(Collectors.toList()));
      }

      // Sends the keyword ideas request.
      GenerateKeywordIdeasPagedResponse response =
          keywordPlanServiceClient.generateKeywordIdeas(requestBuilder.build());
      // Prints each result in the response.
      for (GenerateKeywordIdeaResult result : response.iterateAll()) {
        System.out.printf(
            "Keyword idea text '%s' has %d average monthly searches and '%s' competition.%n",
            result.getText().getValue(),
            result.getKeywordIdeaMetrics().getAvgMonthlySearches().getValue(),
            result.getKeywordIdeaMetrics().getCompetition());
      }
    }
  }
}

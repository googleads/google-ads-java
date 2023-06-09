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

package com.google.ads.googleads.examples.basicoperations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v14.common.KeywordInfo;
import com.google.ads.googleads.v14.errors.GoogleAdsError;
import com.google.ads.googleads.v14.errors.GoogleAdsException;
import com.google.ads.googleads.v14.resources.AdGroup;
import com.google.ads.googleads.v14.resources.AdGroupCriterion;
import com.google.ads.googleads.v14.services.GoogleAdsRow;
import com.google.ads.googleads.v14.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v14.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v14.services.SearchGoogleAdsRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.annotation.Nullable;

/**
 * Retrieves keywords for a customer or for a specific ad group, and also demonstrates how to use
 * the {@code omit_unselected_resource_names} option in the Google Ads Query Language (GAQL) to
 * reduce payload size.
 */
public class GetKeywords {

  private static final int PAGE_SIZE = 1_000;

  private static class GetKeywordsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID)
    private Long adGroupId;

    @Parameter(names = ArgumentNames.OMIT_UNSELECTED_RESOURCE_NAMES, arity = 1)
    private Boolean omitUnselectedResourceNames = false;
  }

  public static void main(String[] args) throws IOException {
    GetKeywordsParams params = new GetKeywordsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");

      // Optional: Specify an ad group ID to restrict search to only a given ad group.
      params.adGroupId = null;

      // Optional: Add omit_unselected_resource_names=true to the PARAMETERS clause in the GAQL
      // query of the search request.
      params.omitUnselectedResourceNames = false;
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
      new GetKeywords()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.adGroupId,
              params.omitUnselectedResourceNames);
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
   * @param adGroupId the ad group ID for which keywords will be retrieved. If {@code null}, returns
   *     from all ad groups.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   * @throws Exception if the example failed due to other errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      @Nullable Long adGroupId,
      boolean omitUnselectedResourceNames) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      String searchQuery =
          "SELECT ad_group.id, "
              + "ad_group_criterion.type, "
              + "ad_group_criterion.criterion_id, "
              + "ad_group_criterion.keyword.text, "
              + "ad_group_criterion.keyword.match_type "
              + "FROM ad_group_criterion "
              + "WHERE ad_group_criterion.type = KEYWORD ";
      if (adGroupId != null) {
        searchQuery += String.format("AND ad_group.id = %d", adGroupId);
      }
      // Adds omit_unselected_resource_names=true to the PARAMETERS clause of the GAQL query, which
      // excludes the resource names of all resources that aren't explicitly requested in the SELECT
      // clause. Enabling this option reduces payload size, but if you plan to use a returned
      // object in subsequent mutate operations, make sure you explicitly request its
      // "resource_name" field in your SELECT clause.
      //
      // Read more about PARAMETERS:
      // https://developers.google.com/google-ads/api/docs/query/structure#parameters
      if (omitUnselectedResourceNames) {
        searchQuery += " PARAMETERS omit_unselected_resource_names=true";
      }

      // Creates a request that will retrieve all keywords using pages of the specified page size.
      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setPageSize(PAGE_SIZE)
              .setQuery(searchQuery)
              .build();
      // Issues the search request.
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);
      // Iterates over all rows in all pages and prints the requested field values for the keyword
      // in each row.
      for (GoogleAdsRow googleAdsRow : searchPagedResponse.iterateAll()) {
        AdGroup adGroup = googleAdsRow.getAdGroup();
        AdGroupCriterion adGroupCriterion = googleAdsRow.getAdGroupCriterion();
        KeywordInfo keywordInfo = adGroupCriterion.getKeyword();
        String adGroupResourceNameStr =
            (!omitUnselectedResourceNames)
                ? String.format(" and resource name '%s'", adGroup.getResourceName())
                : "";
        System.out.printf(
            "Keyword with text '%s', match type '%s', criteria type '%s', and ID %d "
                + "was found in ad group with ID %d%s.%n",
            keywordInfo.getText(),
            keywordInfo.getMatchType(),
            adGroupCriterion.getType(),
            adGroupCriterion.getCriterionId(),
            adGroup.getId(),
            adGroupResourceNameStr);
      }
    }
  }
}

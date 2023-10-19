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

package com.google.ads.googleads.examples.misc;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v15.errors.GoogleAdsError;
import com.google.ads.googleads.v15.errors.GoogleAdsException;
import com.google.ads.googleads.v15.services.GoogleAdsRow;
import com.google.ads.googleads.v15.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v15.services.GoogleAdsServiceClient.SearchPage;
import com.google.ads.googleads.v15.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v15.services.SearchGoogleAdsRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * GoogleAdsService.search results are paginated, but they can only be retrieved in sequence
 * starting by the first page. More details at
 * https://developers.google.com/google-ads/api/docs/reporting/paging.
 *
 * <p>This example searches campaigns illustrating how GoogleAdsService.search result page tokens
 * can be cached and reused to retrieve previous pages. This is useful when you need to request
 * pages that were already requested in the past without starting over from the first page. For
 * example, it can be used to implement an interactive application that displays a page of results
 * at a time without caching all the results first.
 *
 * <p>To add campaigns, run {@link com.google.ads.googleads.examples.basicoperations.AddCampaigns}.
 */
public class NavigateSearchResultPagesCachingTokens {

  // The maximum number of results to retrieve.
  private static final int RESULTS_LIMIT = 10;
  // The size of the paginated search result pages.
  private static final int PAGE_SIZE = 3;

  private static class NavigateSearchResultPagesCachingTokensParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String args[]) {
    NavigateSearchResultPagesCachingTokensParams params =
        new NavigateSearchResultPagesCachingTokensParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("ENTER_CUSTOMER_ID_HERE");
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
      new NavigateSearchResultPagesCachingTokens().runExample(googleAdsClient, params.customerId);
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
   * Runs this example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private static void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    // The cache of page tokens. It is stored in-memory and in ascendant order of page number.
    // The first page's token is always an empty string.
    SortedMap<Integer, String> pageTokens = new TreeMap<>();
    pageTokens.put(1, "");

    // Creates a query that retrieves the campaigns.
    String query =
        String.format(
            "SELECT campaign.id, campaign.name FROM campaign ORDER BY campaign.name LIMIT %d",
            RESULTS_LIMIT);

    // Creates a paginated search request.
    SearchGoogleAdsRequest request =
        SearchGoogleAdsRequest.newBuilder()
            .setCustomerId(Long.toString(customerId))
            .setPageSize(PAGE_SIZE)
            .setQuery(query)
            .setReturnTotalResultsCount(true)
            .build();

    int totalNumberOfPages;
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      System.out.println("--- 0. Fetching page 1 to get metadata:");
      // Issues a paginated search request.
      SearchPagedResponse response = googleAdsServiceClient.search(request);
      cacheNextPageToken(pageTokens, response.getPage(), 2);

      // Determines the total number of results and prints it.
      // The total results count does not take into consideration the LIMIT clause of the query,
      // so we need to find the minimal value between the limit and the total results count.
      long totalNumberOfResults =
          Math.min(RESULTS_LIMIT, response.getPage().getResponse().getTotalResultsCount());
      System.out.printf("Total number of campaigns found: %d.%n", totalNumberOfResults);

      // Determines the total number of pages and prints it.
      totalNumberOfPages = (int) Math.ceil(totalNumberOfResults / (double) PAGE_SIZE);
      System.out.printf("Total number of pages: %d.%n", totalNumberOfPages);
      if (totalNumberOfPages == 0) {
        System.out.println("Could not find any campaigns.");
        return;
      }
    }

    // Demonstrates how the logic works when iterating pages forward. We select a page that is
    // in the middle of the result set so that only a subset of the page tokens will be cached.
    int middlePageNumber = (int) Math.ceil(totalNumberOfPages / 2.0);
    System.out.printf("--- 1. Printing results of the middle page (page %d):%n", middlePageNumber);
    fetchAndPrintPageResults(googleAdsClient, customerId, query, middlePageNumber, pageTokens);

    // Demonstrates how the logic works when iterating pages backward with some page tokens that
    // are not already cached.
    System.out.println("--- 2. Printing results of the last page to the first:");
    for (int pageNumber = totalNumberOfPages; pageNumber > 0; pageNumber--) {
      System.out.printf("-- Page %d results:%n", pageNumber);
      fetchAndPrintPageResults(googleAdsClient, customerId, query, pageNumber, pageTokens);
    }
  }

  // [START navigate_search_result_pages_caching_tokens]
  /**
   * Fetches and prints the results of a page of a search using a cache of page tokens.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param query the search query.
   * @param pageNumber the number of the page to fetch and print results for.
   * @param pageTokens the cache of page tokens to use and update.
   */
  private static void fetchAndPrintPageResults(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String query,
      int pageNumber,
      SortedMap<Integer, String> pageTokens) {
    int currentPageNumber;
    // There is no need to fetch the pages we already know the page tokens for.
    if (pageTokens.containsKey(pageNumber)) {
      System.out.println(
          "The token of the requested page was cached, we will use it to get the results.");
      currentPageNumber = pageNumber;
    } else {
      System.out.printf(
          "The token of the requested page was never cached, we will use the closest page we know"
              + " the token for (page %d) and sequentially get pages from there.%n",
          pageTokens.size());
      currentPageNumber = pageTokens.lastKey();
    }

    // Fetches next pages in sequence and caches their tokens until the requested page results
    // are returned.
    while (currentPageNumber <= pageNumber) {
      // Fetches the next page.
      System.out.printf("Fetching page %d...%n", currentPageNumber);
      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setPageSize(PAGE_SIZE)
              .setQuery(query)
              .setReturnTotalResultsCount(true)
              // Uses the page token cached for the current page number.
              .setPageToken(pageTokens.get(currentPageNumber))
              .build();
      try (GoogleAdsServiceClient googleAdsServiceClient =
          googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
        SearchPagedResponse response = googleAdsServiceClient.search(request);
        cacheNextPageToken(pageTokens, response.getPage(), currentPageNumber + 1);

        // Prints only the results for the requested page.
        if (currentPageNumber == pageNumber) {
          // Prints the results of the requested page.
          System.out.printf("Printing results found for page %d:%n", pageNumber);
          for (GoogleAdsRow googleAdsRow : response.getPage().getResponse().getResultsList()) {
            System.out.printf(
                "- Campaign with ID %d and name '%s'.%n",
                googleAdsRow.getCampaign().getId(), googleAdsRow.getCampaign().getName());
          }
        }

        currentPageNumber++;
      }
    }
  }
  // [END navigate_search_result_pages_caching_tokens]

  /**
   * Updates the cache of page tokens based on a page that was retrieved.
   *
   * @param pageTokens the cache of page tokens to update.
   * @param page the page that was retrieved.
   * @param pageNumber the number of the page the cached token will retrieve.
   */
  private static void cacheNextPageToken(
      SortedMap<Integer, String> pageTokens, SearchPage page, int pageNumber) {
    if (page.hasNextPage() && !pageTokens.containsKey(pageNumber)) {
      // Updates the cache with the next page token if it is not set yet.
      pageTokens.put(pageNumber, page.getNextPageToken());
      System.out.printf("Cached token for page %d.%n", pageNumber);
    }
  }
}

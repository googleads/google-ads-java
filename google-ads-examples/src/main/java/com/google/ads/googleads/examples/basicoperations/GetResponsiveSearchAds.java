// Copyright 2020 Google LLC
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
import com.google.ads.googleads.v8.common.AdTextAsset;
import com.google.ads.googleads.v8.common.ResponsiveSearchAdInfo;
import com.google.ads.googleads.v8.errors.GoogleAdsError;
import com.google.ads.googleads.v8.errors.GoogleAdsException;
import com.google.ads.googleads.v8.resources.Ad;
import com.google.ads.googleads.v8.resources.AdGroupAd;
import com.google.ads.googleads.v8.services.GoogleAdsRow;
import com.google.ads.googleads.v8.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v8.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v8.services.SearchGoogleAdsRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

/**
 * This example gets non-removed responsive search ads in a specified ad group. To add responsive
 * search ads, run AddResponsiveSearchAd.java. To get ad groups, run GetAdGroups.java.
 */
public class GetResponsiveSearchAds {

  private static final int PAGE_SIZE = 1_000;

  private static class GetAdGroupsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID)
    private Long adGroupId;
  }

  public static void main(String[] args) {
    GetAdGroupsParams params = new GetAdGroupsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");

      // Optional: Specify an ad group ID to restrict search to only a given ad group.
      params.adGroupId = null;
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
      new GetResponsiveSearchAds().runExample(googleAdsClient, params.customerId, params.adGroupId);
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
   * @param adGroupId the ad group ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, @Nullable Long adGroupId) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Constructs the search query.
      String searchQuery =
          "SELECT ad_group.id, ad_group_ad.ad.id, "
              + "ad_group_ad.ad.responsive_search_ad.headlines, "
              + "ad_group_ad.ad.responsive_search_ad.descriptions, "
              + "ad_group_ad.status "
              + "FROM ad_group_ad "
              + "WHERE ad_group_ad.ad.type = RESPONSIVE_SEARCH_AD "
              + "AND ad_group_ad.status != 'REMOVED'";
      if (adGroupId != null) {
        searchQuery += String.format(" AND ad_group.id = %d", adGroupId);
      }

      // Creates a request that will retrieve all ad group ads using pages of the specified page
      // size.
      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setPageSize(PAGE_SIZE)
              .setQuery(searchQuery)
              .build();
      // Issues the search request.
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);

      // Checks if the response contains any results and returns if the results set is empty.
      if (searchPagedResponse.getPage().getResponse().getResultsCount() == 0) {
        System.out.println("No responsive search ads were found.");
        return;
      }

      // Iterates over all rows in all pages and prints the requested field values for the ad
      // group ads in each row.
      for (GoogleAdsRow googleAdsRow : searchPagedResponse.iterateAll()) {
        AdGroupAd adGroupAd = googleAdsRow.getAdGroupAd();
        Ad ad = adGroupAd.getAd();
        System.out.printf(
            "Responsive search ad with resource name '%s', status '%s' was found.%n",
            ad.getResourceName(), adGroupAd.getStatus().getDescriptorForType().getName());
        // Prints the ad text asset detail.
        ResponsiveSearchAdInfo responsiveSearchAdInfo = ad.getResponsiveSearchAd();
        System.out.printf(
            "Headlines:%n'%s'%nDescriptions:%n'%s'%n",
            adTextAssetsToStrings(responsiveSearchAdInfo.getHeadlinesList()),
            adTextAssetsToStrings(responsiveSearchAdInfo.getDescriptionsList()));
      }
    }
  }

  /**
   * Converts a list of AdTextAssets to a user-friendly string.
   *
   * @param adTextAssets the list of AdTextAsset objects.
   * @return the string representation of the provided list of AdTextAsset objects.
   */
  private String adTextAssetsToStrings(List<AdTextAsset> adTextAssets) {
    return adTextAssets.stream()
        .map(
            adTextAsset ->
                adTextAsset.getText()
                    + " pinned to "
                    + adTextAsset.getPinnedField().getValueDescriptor().getName())
        .collect(Collectors.joining(", "));
  }
}

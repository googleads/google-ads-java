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
package com.google.ads.googleads.examples.misc;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v9.errors.GoogleAdsError;
import com.google.ads.googleads.v9.errors.GoogleAdsException;
import com.google.ads.googleads.v9.services.GoogleAdsRow;
import com.google.ads.googleads.v9.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v9.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v9.services.SearchGoogleAdsRequest;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Gets all image assets. */
public class GetAllImageAssets {

  private static final int PAGE_SIZE = 1_000;

  private static class GetAllImageAssetsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String args[]) {
    GetAllImageAssetsParams params = new GetAllImageAssetsParams();
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
      new GetAllImageAssets().runExample(googleAdsClient, params.customerId);
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
    // Creates the search query.
    String searchQuery =
        "SELECT asset.name, "
            + "asset.image_asset.file_size, "
            + "asset.image_asset.full_size.width_pixels, "
            + "asset.image_asset.full_size.height_pixels, "
            + "asset.image_asset.full_size.url "
            + "FROM asset "
            + "WHERE asset.type = 'IMAGE'";

    // Creates the request.
    SearchGoogleAdsRequest request =
        SearchGoogleAdsRequest.newBuilder()
            .setCustomerId(Long.toString(customerId))
            .setPageSize(PAGE_SIZE)
            .setReturnTotalResultsCount(true)
            .setQuery(searchQuery)
            .build();

    // Creates the Google Ads Service Client.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Issues the search request.
      SearchPagedResponse response = googleAdsServiceClient.search(request);

      // Displays a response if no images are found.
      if (response.getPage().getResponse().getTotalResultsCount() == 0) {
        System.out.printf("No image assets found.%n");
      }

      // Iterates over each row of the response.
      for (GoogleAdsRow row : response.iterateAll()) {
        // Displays the results.
        System.out.printf(
            "Image with name '%s', file size %d bytes, width %dpx, height %dpx, and url '%s' "
                + "found.%n",
            row.getAsset().getName(),
            row.getAsset().getImageAsset().getFileSize(),
            row.getAsset().getImageAsset().getFullSize().getWidthPixels(),
            row.getAsset().getImageAsset().getFullSize().getHeightPixels(),
            row.getAsset().getImageAsset().getFullSize().getUrl());
      }
    }
  }
}

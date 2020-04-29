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

package com.google.ads.googleads.examples.advancedoperations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.resources.AdGroup;
import com.google.ads.googleads.v3.resources.AdGroupBidModifier;
import com.google.ads.googleads.v3.resources.Campaign;
import com.google.ads.googleads.v3.services.GoogleAdsRow;
import com.google.ads.googleads.v3.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v3.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v3.services.SearchGoogleAdsRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.annotation.Nullable;

/** Gets ad group bid modifiers. */
public class GetAdGroupBidModifiers {

  private static final int PAGE_SIZE = 1_000;

  private static class GetAdGroupBidModifiersParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID)
    private Long adGroupId;
  }

  public static void main(String[] args) throws IOException {
    GetAdGroupBidModifiersParams params = new GetAdGroupBidModifiersParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");

      // Optional: Specify an ad group ID to restrict search to only a given ad group.
      params.adGroupId = null;
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
      new GetAdGroupBidModifiers().runExample(googleAdsClient, params.customerId, params.adGroupId);
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
   * @param adGroupId the ad group ID for which ad group bid modiifers will be retrieved. If {@code
   *     null}, returns all ad group bid modifiers.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, @Nullable Long adGroupId) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      String searchQuery =
          "SELECT ad_group.id, ad_group_bid_modifier.criterion_id, "
              + "ad_group_bid_modifier.bid_modifier, ad_group_bid_modifier.device.type, "
              + "campaign.id FROM ad_group_bid_modifier";
      if (adGroupId != null) {
        searchQuery += String.format(" WHERE ad_group.id = %d", adGroupId);
      }

      // Creates a request that will retrieve ad group bid modifiers using pages of the specified
      // page size.
      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setPageSize(PAGE_SIZE)
              .setQuery(searchQuery)
              .build();
      // Issues the search request.
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);
      // Iterates over all rows in all pages and prints the requested field values for the ad group
      // bid modifiers in each row.
      for (GoogleAdsRow googleAdsRow : searchPagedResponse.iterateAll()) {
        AdGroupBidModifier adGroupBidModifier = googleAdsRow.getAdGroupBidModifier();
        AdGroup adGroup = googleAdsRow.getAdGroup();
        Campaign campaign = googleAdsRow.getCampaign();
        System.out.printf(
            "Ad group bid modifier with criterion ID %d, bid modifier value %.2f, device type %s "
                + "was found in an ad group with ID %d of campaign ID %d.%n",
            adGroupBidModifier.getCriterionId().getValue(),
            adGroupBidModifier.getBidModifier().getValue(),
            adGroupBidModifier.getDevice().getType(),
            adGroup.getId().getValue(),
            campaign.getId().getValue());
      }
    }
  }
}

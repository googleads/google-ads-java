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

package com.google.ads.googleads.examples.reporting;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.services.GoogleAdsRow;
import com.google.ads.googleads.v3.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v3.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v3.services.SearchGoogleAdsRequest;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Gets Hotel-ads performance statistics for the 50 Hotel ad groups with the most
 * impressions over the last 7 days.
 */
public class GetHotelAdsPerformance {

  private static final int PAGE_SIZE = 1_000;

  private static class GetHotelAdsPerformanceParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    GetHotelAdsPerformanceParams params = new GetHotelAdsPerformanceParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
    }

    GoogleAdsClient googleAdsClient;
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
      new GetHotelAdsPerformance().runExample(googleAdsClient, params.customerId);
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

  private void runExample(GoogleAdsClient googleAdsClient, Long customerId) {
    // Creates a query that retrieves hotel-ads statistics for each campaign and ad group.
    // Returned statistics will be segmented by the check-in day of week and length of stay.
    String query = "SELECT "
        + "  campaign.id, "
        + "  campaign.advertising_channel_type, "
        + "  ad_group.id, "
        + "  ad_group.status, "
        + "  metrics.impressions, "
        + "  metrics.hotel_average_lead_value_micros, "
        + "  segments.hotel_check_in_day_of_week, "
        + "  segments.hotel_length_of_stay "
        + "FROM hotel_performance_view "
        + "WHERE segments.date DURING LAST_7_DAYS "
        + "  AND campaign.advertising_channel_type = 'HOTEL' "
        + "  AND ad_group.status = 'ENABLED' "
        + "ORDER BY metrics.impressions DESC "
        + "LIMIT 50";

    // Constructs and issues a search request by specifying page size.
    SearchGoogleAdsRequest request = SearchGoogleAdsRequest.newBuilder()
        .setCustomerId(String.valueOf(customerId))
        .setPageSize(PAGE_SIZE)
        .setQuery(query)
        .build();

    // Iterates over all rows in all pages and prints the requested field values for each row.
    try (GoogleAdsServiceClient googleAdsService = googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      SearchPagedResponse response = googleAdsService.search(request);

      for (GoogleAdsRow row : response.iterateAll()) {
        System.out.printf("Ad group ID %d in campaign ID %d "
                + "with hotel check-in on %s and %d day(s) of stay "
                + "had %d impression(s) and %.2f average lead value (in micros) "
                + "during the last 7 days.%n",
            row.getAdGroup().getId().getValue(),
            row.getCampaign().getId().getValue(),
            row.getSegments().getHotelCheckInDayOfWeek(),
            row.getSegments().getHotelLengthOfStay().getValue(),
            row.getMetrics().getImpressions().getValue(),
            row.getMetrics().getHotelAverageLeadValueMicros().getValue());
      }
    }
  }
}

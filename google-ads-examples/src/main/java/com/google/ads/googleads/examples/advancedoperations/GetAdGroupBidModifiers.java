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
import com.google.ads.googleads.v22.errors.GoogleAdsError;
import com.google.ads.googleads.v22.errors.GoogleAdsException;
import com.google.ads.googleads.v22.resources.AdGroupBidModifier;
import com.google.ads.googleads.v22.services.GoogleAdsRow;
import com.google.ads.googleads.v22.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v22.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v22.services.SearchGoogleAdsRequest;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.annotation.Nullable;

/** Gets ad group bid modifiers. */
public class GetAdGroupBidModifiers {

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
          "SELECT"
              + "  ad_group.id, "
              + "  ad_group_bid_modifier.criterion_id,"
              + "  campaign.id,"
              + "  ad_group_bid_modifier.bid_modifier,"
              + "  ad_group_bid_modifier.device.type,"
              + "  ad_group_bid_modifier.hotel_date_selection_type.type,"
              + "  ad_group_bid_modifier.hotel_advance_booking_window.min_days,"
              + "  ad_group_bid_modifier.hotel_advance_booking_window.max_days,"
              + "  ad_group_bid_modifier.hotel_length_of_stay.min_nights,"
              + "  ad_group_bid_modifier.hotel_length_of_stay.max_nights,"
              + "  ad_group_bid_modifier.hotel_check_in_day.day_of_week "
              + "FROM"
              + "  ad_group_bid_modifier";
      if (adGroupId != null) {
        searchQuery += String.format(" WHERE ad_group.id = %d", adGroupId);
      }
      searchQuery += " LIMIT 10000";

      // Creates a request that will retrieve ad group bid modifiers.
      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setQuery(searchQuery)
              .build();
      // Issues the search request.
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);
      // Iterates over all rows in all pages and prints the requested field values for the ad group
      // bid modifiers in each row.
      for (GoogleAdsRow googleAdsRow : searchPagedResponse.iterateAll()) {
        AdGroupBidModifier adGroupBidModifier = googleAdsRow.getAdGroupBidModifier();
        System.out.printf(
            "Ad group bid modifier with criterion ID %d in ad group ID %d of campaign ID %d ",
            adGroupBidModifier.getCriterionId(),
            googleAdsRow.getAdGroup().getId(),
            googleAdsRow.getCampaign().getId());
        // When working with an 'optional' protocol buffer field such as AdGroup.bidModifier, use
        // hasXX() to check if the field is set, and only retrieve the value using getXX() if
        // hasXX() returns true. See the protocol buffer documentation on field presence for more
        // information:
        // https://protobuf.dev/programming-guides/field_presence/#presence-in-proto3-apis
        if (adGroupBidModifier.hasBidModifier()) {
          // Prints the bid modifier value since it is set.
          System.out.printf(
              "has a bid modifier value of %.2f.%n", adGroupBidModifier.getBidModifier());
        } else {
          // Does not print the bid modifier value since it is not set. Printing the result of
          // adGroupBidModifier.getBidModifier() in this case would be misleading, since it will
          // be 0.
          System.out.println("does NOT have a bid modifier value.");
        }
        // Gets a detailed message specific to the type of criterion.
        String criterionDetails =
            "  - Criterion type: " + adGroupBidModifier.getCriterionCase() + " ";
        switch (adGroupBidModifier.getCriterionCase()) {
          case DEVICE:
            criterionDetails += "Type: " + adGroupBidModifier.getDevice().getType();
            break;
          case HOTEL_ADVANCE_BOOKING_WINDOW:
            criterionDetails +=
                "Min Days: "
                    + adGroupBidModifier.getHotelAdvanceBookingWindow().getMinDays()
                    + ", Max Days: "
                    + adGroupBidModifier.getHotelAdvanceBookingWindow().getMaxDays();
            break;
          case HOTEL_CHECK_IN_DAY:
            criterionDetails +=
                "Day of the week: " + adGroupBidModifier.getHotelCheckInDay().getDayOfWeek();
            break;
          case HOTEL_DATE_SELECTION_TYPE:
            criterionDetails +=
                "Date selection type: " + adGroupBidModifier.getHotelDateSelectionType().getType();
            break;
          case HOTEL_LENGTH_OF_STAY:
            criterionDetails +=
                "Min Nights: "
                    + adGroupBidModifier.getHotelLengthOfStay().getMinNights()
                    + ", Max Nights: "
                    + adGroupBidModifier.getHotelLengthOfStay().getMaxNights();
            break;
        }
        System.out.println(criterionDetails);
      }
    }
  }
}

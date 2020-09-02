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

package com.google.ads.googleads.examples.targeting;

import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v5.errors.GoogleAdsError;
import com.google.ads.googleads.v5.errors.GoogleAdsException;
import com.google.ads.googleads.v5.services.GeoTargetConstantServiceClient;
import com.google.ads.googleads.v5.services.GeoTargetConstantSuggestion;
import com.google.ads.googleads.v5.services.SuggestGeoTargetConstantsRequest;
import com.google.ads.googleads.v5.services.SuggestGeoTargetConstantsResponse;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Gets GeoTargetConstants by given location names. */
public class GetGeoTargetConstantsByNames {

  public static void main(String[] args) {
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
      new GetGeoTargetConstantsByNames().runExample(googleAdsClient);
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
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient) {
    try (GeoTargetConstantServiceClient geoTargetClient =
        googleAdsClient.getLatestVersion().createGeoTargetConstantServiceClient()) {

      SuggestGeoTargetConstantsRequest.Builder requestBuilder =
          SuggestGeoTargetConstantsRequest.newBuilder();

      // Locale is using ISO 639-1 format. If an invalid locale is given, 'en' is used by default.
      requestBuilder.setLocale("en");

      // A list of country codes can be referenced here:
      // https://developers.google.com/adwords/api/docs/appendix/geotargeting
      requestBuilder.setCountryCode("FR");

      requestBuilder
          .getLocationNamesBuilder()
          .addAllNames(ImmutableList.of("Paris", "Quebec", "Spain", "Deutschland"));

      SuggestGeoTargetConstantsResponse response =
          geoTargetClient.suggestGeoTargetConstants(requestBuilder.build());

      for (GeoTargetConstantSuggestion suggestion :
          response.getGeoTargetConstantSuggestionsList()) {
        System.out.printf(
            "%s (%s,%s,%s,%s) is found in locale (%s) with reach (%d) for search term (%s).%n",
            suggestion.getGeoTargetConstant().getResourceName(),
            suggestion.getGeoTargetConstant().getName(),
            suggestion.getGeoTargetConstant().getCountryCode(),
            suggestion.getGeoTargetConstant().getTargetType(),
            suggestion.getGeoTargetConstant().getStatus().name(),
            suggestion.getLocale(),
            suggestion.getReach(),
            suggestion.getSearchTerm());
      }
    }
  }
}

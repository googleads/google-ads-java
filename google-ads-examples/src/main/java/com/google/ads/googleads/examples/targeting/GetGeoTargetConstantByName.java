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
import com.google.ads.googleads.v2.errors.GoogleAdsException;
import com.google.ads.googleads.v2.errors.GoogleAdsError;
import com.google.ads.googleads.v2.services.GeoTargetConstantServiceClient;
import com.google.ads.googleads.v2.services.GeoTargetConstantSuggestion;
import com.google.ads.googleads.v2.services.SuggestGeoTargetConstantsRequest;
import com.google.ads.googleads.v2.services.SuggestGeoTargetConstantsResponse;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** Gets GeoTargetConstants by given location names. */
public class GetGeoTargetConstantByName {

  public static void main(String[] args) {
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
      new GetGeoTargetConstantByName().runExample(googleAdsClient);
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

  public void runExample(GoogleAdsClient googleAdsClient) {
    try (GeoTargetConstantServiceClient geoTargetClient =
        googleAdsClient.getLatestVersion().createGeoTargetConstantServiceClient()) {

      SuggestGeoTargetConstantsRequest.Builder requestBuilder =
          SuggestGeoTargetConstantsRequest.newBuilder();

      // Locale is using ISO 639-1 format. If an invalid locale is given, 'en' is used by default.
      requestBuilder.setLocale(StringValue.of("en"));

      // A list of country codes can be referenced here:
      // https://developers.google.com/adwords/api/docs/appendix/geotargeting
      requestBuilder.setCountryCode(StringValue.of("FR"));

      requestBuilder
          .getLocationNamesBuilder()
          .addAllNames(
              Stream.of("Paris", "Quebec", "Spain", "Deutschland")
                  .map(StringValue::of)
                  .collect(Collectors.toList()));

      SuggestGeoTargetConstantsResponse response =
          geoTargetClient.suggestGeoTargetConstants(requestBuilder.build());

      for (GeoTargetConstantSuggestion suggestion :
          response.getGeoTargetConstantSuggestionsList()) {
        System.out.printf(
            "%s (%s,%s,%s,%s) is found in locale (%s) with reach (%d) for search term (%s).%n",
            suggestion.getGeoTargetConstant().getResourceName(),
            suggestion.getGeoTargetConstant().getName().getValue(),
            suggestion.getGeoTargetConstant().getCountryCode().getValue(),
            suggestion.getGeoTargetConstant().getTargetType().getValue(),
            suggestion.getGeoTargetConstant().getStatus().name(),
            suggestion.getLocale().getValue(),
            suggestion.getReach().getValue(),
            suggestion.getSearchTerm().getValue());
      }
    }
  }
}

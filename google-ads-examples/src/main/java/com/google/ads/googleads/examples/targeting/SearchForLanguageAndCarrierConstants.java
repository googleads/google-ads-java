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

package com.google.ads.googleads.examples.targeting;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v5.errors.GoogleAdsError;
import com.google.ads.googleads.v5.errors.GoogleAdsException;
import com.google.ads.googleads.v5.resources.CarrierConstant;
import com.google.ads.googleads.v5.resources.LanguageConstant;
import com.google.ads.googleads.v5.services.GoogleAdsRow;
import com.google.ads.googleads.v5.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v5.services.SearchGoogleAdsStreamRequest;
import com.google.ads.googleads.v5.services.SearchGoogleAdsStreamResponse;
import com.google.api.gax.rpc.ServerStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Illustrates how to:
 *
 * <ul>
 *   <li>Search for language constants where the name includes a given string.
 *   <li>Search for all the available mobile carrier constants with a given country code.
 * </ul>
 */
public class SearchForLanguageAndCarrierConstants {

  private static class SearchForLanguageAndCarrierConstantsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.LANGUAGE_NAME)
    private String languageName = "eng";

    @Parameter(
        names = ArgumentNames.COUNTRY_CODE,
        description =
            "Country code for carrier constant filtering. A list of country codes can be"
                + " referenced here:"
                + " https://developers.google.com/adwords/api/docs/appendix/geotargeting.")
    private String countryCode = "US";
  }

  public static void main(String[] args) {
    SearchForLanguageAndCarrierConstantsParams params =
        new SearchForLanguageAndCarrierConstantsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");

      // Optional: specify the language name or country code.
      // params.languageName = "INSERT_LANGUAGE_NAME_HERE";
      // params.countryCode = "INSERT_COUNTRY_CODE_HERE";
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
      new SearchForLanguageAndCarrierConstants()
          .runExample(googleAdsClient, params.customerId, params.languageName, params.countryCode);
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

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param languageName the string to use for searching for language constants.
   * @param countryCode the country code for searching for carrier constants.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, String languageName, String countryCode) {
    searchForLanguageConstants(googleAdsClient, customerId, languageName);
    searchForCarrierConstants(googleAdsClient, customerId, countryCode);
  }

  /**
   * Searches for language constants where the name includes the specified language name.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param languageName the string to use for searching for language constants.
   */
  private void searchForLanguageConstants(
      GoogleAdsClient googleAdsClient, long customerId, String languageName) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {

      // Creates a query that retrieves each language constant with the language name parameter in
      // the name.
      String searchQuery =
          "SELECT language_constant.id, "
              + "language_constant.code, "
              + "language_constant.name, "
              + "language_constant.targetable "
              + "FROM language_constant "
              + "WHERE language_constant.name LIKE '%"
              + languageName
              + "%'";

      // Constructs the SearchGoogleAdsStreamRequest.
      SearchGoogleAdsStreamRequest request =
          SearchGoogleAdsStreamRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setQuery(searchQuery)
              .build();

      // Creates and issues a search Google Ads stream request that will retrieve all of the
      // requested field values for the matching language constants.
      ServerStream<SearchGoogleAdsStreamResponse> stream =
          googleAdsServiceClient.searchStreamCallable().call(request);

      for (SearchGoogleAdsStreamResponse response : stream) {
        for (GoogleAdsRow googleAdsRow : response.getResultsList()) {
          LanguageConstant languageConstant = googleAdsRow.getLanguageConstant();
          System.out.printf(
              "Language with ID %d, code '%s', name '%s', and targetable '%s' was found.%n",
              languageConstant.getId(),
              languageConstant.getCode(),
              languageConstant.getName(),
              languageConstant.getTargetable());
        }
      }
    }
  }

  /**
   * Searches for all the available mobile carrier constants with a given country code.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param countryCode the country code to use for filtering.
   */
  private void searchForCarrierConstants(
      GoogleAdsClient googleAdsClient, long customerId, String countryCode) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {

      // Creates a query that retrieves each language constant with the language name parameter in
      // the name.
      String searchQuery =
          String.format(
              "SELECT carrier_constant.id, "
                  + "carrier_constant.name, "
                  + "carrier_constant.country_code "
                  + "FROM carrier_constant "
                  + "WHERE carrier_constant.country_code = '%s'",
              countryCode);

      // Constructs the SearchGoogleAdsStreamRequest.
      SearchGoogleAdsStreamRequest request =
          SearchGoogleAdsStreamRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setQuery(searchQuery)
              .build();

      // Creates and issues a search Google Ads stream request that will retrieve all of the
      // requested field values for the matching carrier constants.
      ServerStream<SearchGoogleAdsStreamResponse> stream =
          googleAdsServiceClient.searchStreamCallable().call(request);

      for (SearchGoogleAdsStreamResponse response : stream) {
        for (GoogleAdsRow googleAdsRow : response.getResultsList()) {
          CarrierConstant carrierConstant = googleAdsRow.getCarrierConstant();
          System.out.printf(
              "Carrier with ID %d, name '%s', and country code '%s' was found.%n",
              carrierConstant.getId(),
              carrierConstant.getName(),
              carrierConstant.getCountryCode());
        }
      }
    }
  }
}

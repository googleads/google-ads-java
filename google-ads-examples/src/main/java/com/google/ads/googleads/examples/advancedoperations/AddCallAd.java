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

package com.google.ads.googleads.examples.advancedoperations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v13.common.CallAdInfo;
import com.google.ads.googleads.v13.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v13.enums.CallConversionReportingStateEnum.CallConversionReportingState;
import com.google.ads.googleads.v13.errors.GoogleAdsError;
import com.google.ads.googleads.v13.errors.GoogleAdsException;
import com.google.ads.googleads.v13.resources.Ad;
import com.google.ads.googleads.v13.resources.AdGroupAd;
import com.google.ads.googleads.v13.services.AdGroupAdOperation;
import com.google.ads.googleads.v13.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v13.services.MutateAdGroupAdsResponse;
import com.google.ads.googleads.v13.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * This example adds a call ad to a given ad group. More information about call ads can be found at
 * https://support.google.com/google-ads/answer/6341403. To get ad groups, run {@link
 * com.google.ads.googleads.examples.basicoperations.GetAdGroups}.
 */
public class AddCallAd {
  private static class AddCallAdParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;

    // Specifies the phone country code here or the default specified below will be used.
    // See supported codes at:
    // https://developers.google.com/google-ads/api/reference/data/codes-formats#expandable-17
    @Parameter(names = ArgumentNames.PHONE_COUNTRY, required = true)
    private String phoneCountry = "US";

    @Parameter(names = ArgumentNames.PHONE_NUMBER, required = true)
    private String phoneNumber;

    // Optional: Specifies the conversion action ID to attribute call conversions to. If not set,
    // the default conversion action is used.
    @Parameter(names = ArgumentNames.CONVERSION_ACTION_ID)
    private Integer conversionActionId;
  }

  public static void main(String[] args) throws IOException {
    AddCallAdParams params = new AddCallAdParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
      params.phoneCountry = "US";
      params.phoneNumber = "INSERT_PHONE_NUMBER_HERE";
      // Optional: Specifies the conversion action ID to attribute call conversions to. If not set,
      // the default conversion action is used.
      params.conversionActionId = null;
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
      new AddCallAd()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.adGroupId,
              params.phoneCountry,
              params.phoneNumber,
              params.conversionActionId);
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
   * @param adGroupId the ad group ID to add a call ad to.
   * @param phoneCountry the phone country (2-letter code).
   * @param phoneNumber the raw phone number, e.g. '(123) 456-7890'.
   * @param conversionActionId the conversion action ID to attribute conversions to.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long adGroupId,
      String phoneCountry,
      String phoneNumber,
      Integer conversionActionId) {
    // Creates a CallAdInfo Builder.
    CallAdInfo.Builder callAdInfoBuilder =
        CallAdInfo.newBuilder()
            // Sets basic information.
            .setBusinessName("Google")
            .setHeadline1("Travel")
            .setHeadline2("Discover")
            .setDescription1("Travel the World")
            .setDescription2("Travel the Universe")
            // Sets the country code and phone number of the business to call.
            .setCountryCode(phoneCountry)
            .setPhoneNumber(phoneNumber)
            // Sets the verification URL to a webpage that includes the phone number.
            .setPhoneNumberVerificationUrl("https://www.example.com/contact")
            // The fields below are optional.
            // Configures call tracking and reporting.
            .setCallTracked(true)
            .setDisableCallConversion(false)
            // Sets path parts to append for display.
            .setPath1("services")
            .setPath2("travels");

    // Sets the conversion action ID to the one provided if any.
    if (conversionActionId != null) {
      callAdInfoBuilder
          .setConversionAction(ResourceNames.conversionAction(customerId, conversionActionId))
          .setConversionReportingState(
              CallConversionReportingState.USE_RESOURCE_LEVEL_CALL_CONVERSION_ACTION);
    }

    // Creates a call ad.
    Ad ad =
        Ad.newBuilder()
            .addFinalUrls("https://www.example.com")
            .setCallAd(callAdInfoBuilder.build())
            .build();

    // Creates an ad group ad for the new ad.
    AdGroupAd adGroupAd =
        AdGroupAd.newBuilder()
            .setAdGroup(ResourceNames.adGroup(customerId, adGroupId))
            .setStatus(AdGroupAdStatus.PAUSED)
            .setAd(ad)
            .build();

    // Creates an ad group ad operation.
    AdGroupAdOperation adGroupAdOperation =
        AdGroupAdOperation.newBuilder().setCreate(adGroupAd).build();

    // Creates an ad group ad service client.
    try (AdGroupAdServiceClient adGroupAdServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupAdServiceClient()) {
      // Issues a mutate request to add the ad group ad.
      MutateAdGroupAdsResponse response =
          adGroupAdServiceClient.mutateAdGroupAds(
              Long.toString(customerId), ImmutableList.of(adGroupAdOperation));
      // Prints information about the newly created ad group ad.
      System.out.printf(
          "Created ad group ad with resource name: '%s'.%n",
          response.getResults(0).getResourceName());
    }
  }
}

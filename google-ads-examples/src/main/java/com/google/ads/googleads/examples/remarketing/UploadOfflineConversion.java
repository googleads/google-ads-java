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

package com.google.ads.googleads.examples.remarketing;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v10.errors.GoogleAdsError;
import com.google.ads.googleads.v10.errors.GoogleAdsException;
import com.google.ads.googleads.v10.errors.GoogleAdsFailure;
import com.google.ads.googleads.v10.services.ClickConversion;
import com.google.ads.googleads.v10.services.ClickConversionResult;
import com.google.ads.googleads.v10.services.ConversionUploadServiceClient;
import com.google.ads.googleads.v10.services.CustomVariable;
import com.google.ads.googleads.v10.services.UploadClickConversionsRequest;
import com.google.ads.googleads.v10.services.UploadClickConversionsResponse;
import com.google.ads.googleads.v10.utils.ErrorUtils;
import com.google.ads.googleads.v10.utils.ResourceNames;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/** Imports offline conversion values for specific clicks to an account. */
public class UploadOfflineConversion {
  private static class UploadOfflineConversionParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private long customerId;

    @Parameter(names = ArgumentNames.CONVERSION_ACTION_ID, required = true)
    private long conversionActionId;

    @Parameter(
        names = ArgumentNames.GCLID,
        required = false,
        description =
            "The Google Click identifier. If setting this value, do not set "
                + ArgumentNames.GBRAID
                + " or "
                + ArgumentNames.WBRAID
                + ".")
    private String gclid;

    @Parameter(
        names = ArgumentNames.GBRAID,
        required = false,
        description =
            "The GBRAID identifier for an iOS app conversion. If setting this value, do not set "
                + ArgumentNames.GCLID
                + " or "
                + ArgumentNames.WBRAID
                + ".")
    private String gbraid;

    @Parameter(
        names = ArgumentNames.WBRAID,
        required = false,
        description =
            "The WBRAID identifer for an iOS web conversion. If setting this value, do not set "
                + ArgumentNames.GCLID
                + " or "
                + ArgumentNames.GBRAID
                + ".")
    private String wbraid;

    @Parameter(
        names = ArgumentNames.CONVERSION_DATE_TIME,
        required = true,
        description =
            "The date time at which the conversion occurred. "
                + "Must be after the click time, and must include the time zone offset. "
                + "The format is  'yyyy-mm-dd hh:mm:ss+|-hh:mm', e.g. '2019-01-01 12:32:45-08:00'.")
    private String conversionDateTime;

    @Parameter(names = ArgumentNames.CONVERSION_VALUE, required = true)
    private Double conversionValue;

    // Optional: Specify the conversion custom variable ID and value you want to
    // associate with the click conversion upload.
    @Parameter(names = ArgumentNames.CONVERSION_CUSTOM_VARIABLE_ID)
    private Long conversionCustomVariableId;

    @Parameter(names = ArgumentNames.CONVERSION_CUSTOM_VARIABLE_VALUE)
    private String conversionCustomVariableValue;

    // Optional: Specify the unique order ID for the click conversion.
    @Parameter(names = ArgumentNames.ORDER_ID)
    private String orderId;
  }

  public static void main(String[] args) {
    UploadOfflineConversionParams params = new UploadOfflineConversionParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.conversionActionId = Long.parseLong("INSERT_CONVERSION_ACTION_ID_HERE");
      // Set exactly one of gclid, gbraid, or wbraid.
      params.gclid = "INSERT_GCLID_HERE";
      params.gbraid = null;
      params.wbraid = null;
      params.conversionDateTime = "INSERT_CONVERSION_DATE_TIME_HERE";
      params.conversionValue = Double.parseDouble("INSERT_CONVERSION_VALUE_HERE");
      // Optionally specify the conversion custom variable ID and value you want to
      // associate with the click conversion upload.
      params.conversionCustomVariableId = null;
      params.conversionCustomVariableValue = null;
      // Optionally specify the order ID for the click conversion.
      params.orderId = null;
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
      new UploadOfflineConversion()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.conversionActionId,
              params.gclid,
              params.gbraid,
              params.wbraid,
              params.conversionDateTime,
              params.conversionValue,
              params.conversionCustomVariableId,
              params.conversionCustomVariableValue,
              params.orderId);
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
   * @param conversionActionId conversion action ID associated with this conversion.
   * @param gclid the GCLID for the conversion.
   * @param conversionDateTime date and time of the conversion.
   * @param conversionValue the value of the conversion.
   * @param conversionCustomVariableId the ID of the conversion custom variable to associate with
   *     the upload.
   * @param conversionCustomVariableValue the value of the conversion custom variable to associate
   *     with the upload.
   * @param orderId the unique ID (transaction ID) of the conversion.
   */
  // [START upload_offline_conversion]
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long conversionActionId,
      String gclid,
      String gbraid,
      String wbraid,
      String conversionDateTime,
      Double conversionValue,
      Long conversionCustomVariableId,
      String conversionCustomVariableValue,
      String orderId) {
    // Gets the conversion action resource name.
    String conversionActionResourceName =
        ResourceNames.conversionAction(customerId, conversionActionId);

    // Creates the click conversion.
    ClickConversion.Builder clickConversionBuilder =
        ClickConversion.newBuilder()
            .setConversionAction(conversionActionResourceName)
            .setConversionDateTime(conversionDateTime)
            .setConversionValue(conversionValue)
            .setCurrencyCode("USD");

    // Verifies that exactly one of gclid, gbraid, and wbraid is specified, as required.
    // See https://developers.google.com/google-ads/api/docs/conversions/upload-clicks for details.
    long numberOfIdsSpecified =
        Arrays.asList(gclid, gbraid, wbraid).stream().filter(idField -> idField != null).count();
    if (numberOfIdsSpecified > 1) {
      throw new IllegalArgumentException(
          "Exactly 1 of gclid, gbraid, or wbraid is required, but "
              + numberOfIdsSpecified
              + " ID values were provided");
    }

    // Sets the single specified ID field.
    if (gclid != null) {
      clickConversionBuilder.setGclid(gclid);
    } else if (gbraid != null) {
      clickConversionBuilder.setGbraid(gbraid);
    } else {
      clickConversionBuilder.setWbraid(wbraid);
    }

    if (conversionCustomVariableId != null && conversionCustomVariableValue != null) {
      // Sets the custom variable and value, if provided.
      clickConversionBuilder.addCustomVariables(
          CustomVariable.newBuilder()
              .setConversionCustomVariable(
                  ResourceNames.conversionCustomVariable(customerId, conversionCustomVariableId))
              .setValue(conversionCustomVariableValue));
    }

    if (orderId != null) {
      // Sets the order ID (unique transaction ID), if provided. An order ID is required in order to
      // upload enhancements as shown in the UploadConversionEnhancement example.
      clickConversionBuilder.setOrderId(orderId);
    }

    ClickConversion clickConversion = clickConversionBuilder.build();

    // Creates the conversion upload service client.
    try (ConversionUploadServiceClient conversionUploadServiceClient =
        googleAdsClient.getLatestVersion().createConversionUploadServiceClient()) {
      // Uploads the click conversion. Partial failure should always be set to true.
      UploadClickConversionsResponse response =
          conversionUploadServiceClient.uploadClickConversions(
              UploadClickConversionsRequest.newBuilder()
                  .setCustomerId(Long.toString(customerId))
                  .addConversions(clickConversion)
                  // Enables partial failure (must be true).
                  .setPartialFailure(true)
                  .build());

      // Prints any partial errors returned.
      if (response.hasPartialFailureError()) {
        GoogleAdsFailure googleAdsFailure =
            ErrorUtils.getInstance().getGoogleAdsFailure(response.getPartialFailureError());
        googleAdsFailure
            .getErrorsList()
            .forEach(e -> System.out.println("Partial failure occurred: " + e.getMessage()));
      }

      // Prints the result.
      ClickConversionResult result = response.getResults(0);
      // Only prints valid results.
      if (result.hasGclid()) {
        System.out.printf(
            "Uploaded conversion that occurred at '%s' from Google Click ID '%s' to '%s'.%n",
            result.getConversionDateTime(), result.getGclid(), result.getConversionAction());
      }
    }
  }
  // [END upload_offline_conversion]
}

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
import com.google.ads.googleads.v20.common.Consent;
import com.google.ads.googleads.v20.enums.ConsentStatusEnum.ConsentStatus;
import com.google.ads.googleads.v20.errors.GoogleAdsError;
import com.google.ads.googleads.v20.errors.GoogleAdsException;
import com.google.ads.googleads.v20.errors.GoogleAdsFailure;
import com.google.ads.googleads.v20.services.CallConversion;
import com.google.ads.googleads.v20.services.CallConversionResult;
import com.google.ads.googleads.v20.services.ConversionUploadServiceClient;
import com.google.ads.googleads.v20.services.CustomVariable;
import com.google.ads.googleads.v20.services.UploadCallConversionsRequest;
import com.google.ads.googleads.v20.services.UploadCallConversionsResponse;
import com.google.ads.googleads.v20.utils.ErrorUtils;
import com.google.ads.googleads.v20.utils.ResourceNames;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Imports offline call conversion values for calls related to the ads in your account. To set up a
 * conversion action, run the {@link
 * com.google.ads.googleads.examples.remarketing.AddConversionAction} example.
 */
public class UploadCallConversion {

  private static class UploadCallConversionParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CUSTOMER_ID)
    private long customerId;

    @Parameter(names = ArgumentNames.CONVERSION_ACTION_ID)
    private String conversionActionId;

    @Parameter(
        names = ArgumentNames.CALLER_ID,
        description =
            "The caller ID from which this call was placed. Caller ID is expected to be in E.164"
                + " format with preceding '+' sign, e.g. \"+18005550100\"")
    private String callerId;

    @Parameter(
        names = ArgumentNames.CALL_START_DATE_TIME,
        description =
            "Format is \"yyyy-mm-dd hh:mm:ss+|-hh:mm\", e.g. \"2019-01-01 12:32:45-08:00\"")
    private String callStartDateTime;

    @Parameter(
        names = ArgumentNames.CONVERSION_DATE_TIME,
        description =
            "Format is \"yyyy-mm-dd hh:mm:ss+|-hh:mm\", e.g. \"2019-01-01 12:32:45-08:00\"")
    private String conversionDateTime;

    @Parameter(names = ArgumentNames.CONVERSION_VALUE)
    private double conversionValue;

    // Optional: Specify the conversion custom variable ID and value you want to
    // associate with the call conversion upload.
    @Parameter(names = ArgumentNames.CONVERSION_CUSTOM_VARIABLE_ID)
    private Long conversionCustomVariableId;

    @Parameter(names = ArgumentNames.CONVERSION_CUSTOM_VARIABLE_VALUE)
    private String conversionCustomVariableValue;

    @Parameter(names = ArgumentNames.AD_USER_DATA_CONSENT, required = false)
    private ConsentStatus adUserDataConsent;
  }

  public static void main(String[] args) {
    UploadCallConversionParams params = new UploadCallConversionParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID");
      params.conversionActionId = "INSERT_CONVERSION_ACTION_ID";
      params.callerId = "INSERT_CALLER_ID";
      params.callStartDateTime = "INSERT_CALL_START_DATE_TIME";
      params.conversionDateTime = "INSERT_CONVERSION_DATE_TIME";
      params.conversionValue = Double.parseDouble("INSERT_CONVERSION_VALUE");
      // Optionally specify the conversion custom variable ID and value you want to
      // associate with the call conversion upload.
      params.conversionCustomVariableId = null;
      params.conversionCustomVariableValue = null;
      // Optionally specify the ad user data consent.
      params.adUserDataConsent = null;
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
      new UploadCallConversion()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.conversionActionId,
              params.callerId,
              params.callStartDateTime,
              params.conversionValue,
              params.conversionCustomVariableId,
              params.conversionCustomVariableValue,
              params.adUserDataConsent);
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
   * @param googleAdsClient the client.
   * @param customerId the customer ID.
   * @param conversionActionId the conversion action ID.
   * @param callerId the caller ID.
   * @param callStartDateTime the call start date time
   * @param conversionValue the value of the conversion in USD.
   * @param conversionCustomVariableId the ID of the conversion custom variable to associate with
   *     the upload.
   * @param conversionCustomVariableValue the value of the conversion custom variable to associate
   *     with the upload.
   * @param adUserDataConsent the ad user data consent.
   */
  // [START upload_call_conversion]
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String conversionActionId,
      String callerId,
      String callStartDateTime,
      double conversionValue,
      Long conversionCustomVariableId,
      String conversionCustomVariableValue,
      ConsentStatus adUserDataConsent) {
    // Create a call conversion by specifying currency as USD.
    CallConversion.Builder conversionBuilder =
        CallConversion.newBuilder()
            .setConversionAction(conversionActionId)
            .setCallerId(callerId)
            .setCallStartDateTime(callStartDateTime)
            .setConversionValue(conversionValue)
            .setCurrencyCode("USD");

    if (conversionCustomVariableId != null && conversionCustomVariableValue != null) {
      conversionBuilder.addCustomVariables(
          CustomVariable.newBuilder()
              .setConversionCustomVariable(
                  ResourceNames.conversionCustomVariable(customerId, conversionCustomVariableId))
              .setValue(conversionCustomVariableValue));
    }

    // Sets the consent information, if provided.
    if (adUserDataConsent != null) {
      // Specifies whether user consent was obtained for the data you are uploading. See
      // https://www.google.com/about/company/user-consent-policy for details.
      conversionBuilder.setConsent(Consent.newBuilder().setAdUserData(adUserDataConsent));
    }

    CallConversion conversion = conversionBuilder.build();

    // Uploads the call conversion to the API.
    try (ConversionUploadServiceClient conversionUploadServiceClient =
        googleAdsClient.getLatestVersion().createConversionUploadServiceClient()) {
      // Partial failure MUST be enabled for this request.

      // NOTE: This request contains a single conversion as a demonstration.  However, if you have
      // multiple conversions to upload, it's best to upload multiple conversions per request
      // instead of sending a separate request per conversion. See the following for per-request
      // limits:
      // https://developers.google.com/google-ads/api/docs/best-practices/quotas#conversion_upload_service
      UploadCallConversionsResponse response =
          conversionUploadServiceClient.uploadCallConversions(
              UploadCallConversionsRequest.newBuilder()
                  .setCustomerId(String.valueOf(customerId))
                  .setCustomerId(Long.toString(customerId))
                  .addConversions(conversion)
                  .setPartialFailure(true)
                  .build());

      // Prints any partial failure errors returned.
      if (response.hasPartialFailureError()) {
        GoogleAdsFailure googleAdsFailure =
            ErrorUtils.getInstance().getGoogleAdsFailure(response.getPartialFailureError());
        googleAdsFailure
            .getErrorsList()
            .forEach(e -> System.out.println("Partial failure occurred: " + e.getMessage()));
        throw new RuntimeException(
            "Partial failure occurred " + response.getPartialFailureError().getMessage());
      }

      // Prints the result if valid.
      CallConversionResult result = response.getResults(0);
      System.out.printf(
          "Uploaded call conversion that occurred at '%' for caller ID '%' to the conversion"
              + " action with resource name '%'.%n",
          result.getCallStartDateTime(), result.getCallerId(), result.getConversionAction());
    }
  }
  // [END upload_call_conversion]
}

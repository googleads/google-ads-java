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
import com.google.ads.googleads.v4.errors.GoogleAdsError;
import com.google.ads.googleads.v4.errors.GoogleAdsException;
import com.google.ads.googleads.v4.services.CallConversion;
import com.google.ads.googleads.v4.services.CallConversionResult;
import com.google.ads.googleads.v4.services.ConversionUploadServiceClient;
import com.google.ads.googleads.v4.services.UploadCallConversionsResponse;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.DoubleValue;
import com.google.protobuf.StringValue;
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

    @Parameter(names = ArgumentNames.CALLER_ID)
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
  }

  public static void main(String[] args) {
    UploadCallConversionParams params = new UploadCallConversionParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID");
      params.conversionActionId = "INSERT_CONVERSAION_ACTION_ID";
      params.callerId = "INSERT_CALLER_ID";
      params.callStartDateTime = "INSERT_CALL_START_DATE_TIME";
      params.conversionDateTime = "INSERT_CONVERSION_DATE_TIME";
      params.conversionValue = Double.parseDouble("INSERT_CONVERSION_VALUE");
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
      new UploadCallConversion()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.conversionActionId,
              params.callerId,
              params.callStartDateTime,
              params.conversionValue);
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
   * @param googleAdsClient the client.
   * @param customerId the customer ID.
   * @param conversionActionId the conversion action ID.
   * @param callerId the caller ID.
   * @param callStartDateTime the call start date time
   * @param conversionValue the value of the conversion in USD.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String conversionActionId,
      String callerId,
      String callStartDateTime,
      double conversionValue) {
    // Create a call conversion by specifying currency as USD.
    CallConversion conversion =
        CallConversion.newBuilder()
            .setConversionAction(StringValue.of(conversionActionId))
            .setCallerId(StringValue.of(callerId))
            .setCallStartDateTime(StringValue.of(callStartDateTime))
            .setConversionValue(DoubleValue.of(conversionValue))
            .setCurrencyCode(StringValue.of("USD"))
            .build();

    // Uploads the call conversion to the API.
    try (ConversionUploadServiceClient conversionUploadServiceClient =
        googleAdsClient.getLatestVersion().createConversionUploadServiceClient()) {
      // Partial failure MUST be enabled for this request.
      UploadCallConversionsResponse response =
          conversionUploadServiceClient.uploadCallConversions(
              String.valueOf(customerId), ImmutableList.of(conversion), true, false);

      // Prints any partial failure errors returned.
      if (response.hasPartialFailureError()) {
        throw new RuntimeException(
            "Partial failure occurred " + response.getPartialFailureError().getMessage());
      }

      // Prints the result if valid.
      CallConversionResult result = response.getResults(0);
      System.out.printf(
          "Uploaded call conversion that occurred at '%' for caller ID '%' to the conversion"
              + " action with resource name '%'.%n",
          result.getCallStartDateTime().getValue(),
          result.getCallerId().getValue(),
          result.getConversionAction().getValue());
    }
  }
}

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
import com.google.ads.googleads.v20.enums.ConversionAdjustmentTypeEnum.ConversionAdjustmentType;
import com.google.ads.googleads.v20.errors.GoogleAdsError;
import com.google.ads.googleads.v20.errors.GoogleAdsException;
import com.google.ads.googleads.v20.errors.GoogleAdsFailure;
import com.google.ads.googleads.v20.services.ConversionAdjustment;
import com.google.ads.googleads.v20.services.ConversionAdjustmentResult;
import com.google.ads.googleads.v20.services.ConversionAdjustmentUploadServiceClient;
import com.google.ads.googleads.v20.services.RestatementValue;
import com.google.ads.googleads.v20.services.UploadConversionAdjustmentsRequest;
import com.google.ads.googleads.v20.services.UploadConversionAdjustmentsResponse;
import com.google.ads.googleads.v20.utils.ErrorUtils;
import com.google.ads.googleads.v20.utils.ResourceNames;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.google.protobuf.util.JsonFormat.Printer;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.annotation.Nullable;

/**
 * Imports conversion adjustments for conversions that already exist. To set up a conversion action,
 * run the AddConversionAction.java example.
 */
public class UploadConversionAdjustment {
  private static class UploadConversionAdjustmentParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private long customerId;

    @Parameter(names = ArgumentNames.CONVERSION_ACTION_ID, required = true)
    private long conversionActionId;

    @Parameter(
        names = ArgumentNames.ORDER_ID,
        required = true,
        description =
            "The transaction ID of the conversion to adjust. Required if the conversion being"
                + " adjusted meets the criteria described at"
                + " https://developers.google.com/google-ads/api/docs/conversions/upload-adjustments#requirements.")
    private String orderId;

    @Parameter(
        names = ArgumentNames.ADJUSTMENT_TYPE,
        required = true,
        description =
            "RETRACTION negates a conversion, and RESTATEMENT changes the value of a conversion.")
    private String adjustmentType;

    @Parameter(
        names = ArgumentNames.ADJUSTMENT_DATE_TIME,
        required = true,
        description =
            "The date time at which the adjustment occurred. "
                + "Must be after the click time, and must include the time zone offset. "
                + "The format is  'yyyy-mm-dd hh:mm:ss+|-hh:mm', e.g. '2019-01-01 12:32:45-08:00'.")
    private String adjustmentDateTime;

    @Parameter(
        names = ArgumentNames.RESTATEMENT_VALUE,
        description =
            "The updated value of the conversion. Only applicable for ADJUSTMENT_TYPE of"
                + " RESTATEMENT.")
    private Float restatementValue;
  }

  public static void main(String[] args) throws InvalidProtocolBufferException {
    UploadConversionAdjustmentParams params = new UploadConversionAdjustmentParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.conversionActionId = Long.parseLong("INSERT_CONVERSION_ACTION_ID_HERE");
      params.orderId = "INSERT_ORDER_ID_HERE";
      params.adjustmentType = "INSERT_ADJUSTMENT_TYPE_HERE";
      params.adjustmentDateTime = "INSERT_ADJUSTMENT_DATE_TIME_HERE";

      // Optional: Specify a restatement value for adjustments of type RESTATEMENT.
      params.restatementValue = null;
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
      new UploadConversionAdjustment()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.conversionActionId,
              params.orderId,
              params.adjustmentType,
              params.adjustmentDateTime,
              params.restatementValue);
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
   * @param orderId the orderId for the conversion. Strongly recommended instead of using {@code
   *     gclid} and {@code conversionDateTime}.
   * @param adjustmentType the type of adjustment, e.g. RETRACTION, RESTATEMENT.
   * @param adjustmentDateTime date and time of the adjustment.
   * @param restatementValue the adjusted value for adjustment type RESTATEMENT.
   */
  // [START upload_conversion_adjustment]
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long conversionActionId,
      String orderId,
      String adjustmentType,
      String adjustmentDateTime,
      @Nullable Float restatementValue)
      throws InvalidProtocolBufferException {
    // Gets the conversion adjustment enum value from the adjustmentType String.
    ConversionAdjustmentType conversionAdjustmentType =
        ConversionAdjustmentType.valueOf(adjustmentType);

    // Applies the conversion adjustment to the existing conversion.
    ConversionAdjustment conversionAdjustment =
        ConversionAdjustment.newBuilder()
            .setConversionAction(ResourceNames.conversionAction(customerId, conversionActionId))
            .setAdjustmentType(conversionAdjustmentType)
            // Sets the orderId to identify the conversion to adjust.
            .setOrderId(orderId)
            // As an alternative to setting orderId, you can provide a GclidDateTimePair, but
            // setting orderId instead is strongly recommended.
            // .setGclidDateTimePair(
            //     GclidDateTimePair.newBuilder()
            //         .setGclid(gclid)
            //         .setConversionDateTime(conversionDateTime)
            //         .build())
            .setAdjustmentDateTime(adjustmentDateTime)
            .build();

    // Sets adjusted value for adjustment type RESTATEMENT.
    if (restatementValue != null
        && conversionAdjustmentType == ConversionAdjustmentType.RESTATEMENT) {
      conversionAdjustment =
          conversionAdjustment.toBuilder()
              .setRestatementValue(
                  RestatementValue.newBuilder().setAdjustedValue(restatementValue).build())
              .build();
    }

    // Creates the conversion upload service client.
    try (ConversionAdjustmentUploadServiceClient conversionUploadServiceClient =
        googleAdsClient.getLatestVersion().createConversionAdjustmentUploadServiceClient()) {
      // Uploads the click conversion. Partial failure should always be set to true.
      UploadConversionAdjustmentsRequest request =
          UploadConversionAdjustmentsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              // Enables partial failure (must be true).
              .setPartialFailure(true)
              .addConversionAdjustments(conversionAdjustment)
              .build();
      UploadConversionAdjustmentsResponse response =
          conversionUploadServiceClient.uploadConversionAdjustments(request);

      // Extracts the partial failure error if present on the response.
      ErrorUtils errorUtils = ErrorUtils.getInstance();
      GoogleAdsFailure googleAdsFailure =
          response.hasPartialFailureError()
              ? errorUtils.getGoogleAdsFailure(response.getPartialFailureError())
              : null;

      // Constructs a protocol buffer printer that will print error details in a concise format.
      final Printer errorPrinter = JsonFormat.printer().omittingInsignificantWhitespace();
      // Prints the results for each adjustment, including any partial errors returned.
      for (int opIndex = 0; opIndex < request.getConversionAdjustmentsCount(); opIndex++) {
        ConversionAdjustmentResult result = response.getResults(opIndex);
        if (errorUtils.isPartialFailureResult(result)) {
          // The operation failed. Prints the error details.
          for (GoogleAdsError googleAdsError :
              errorUtils.getGoogleAdsErrors(opIndex, googleAdsFailure)) {
            System.out.printf(
                "%4d: Partial failure occurred: %s%n", opIndex, errorPrinter.print(googleAdsError));
          }
        } else {
          System.out.printf(
              "%4d: Uploaded conversion adjustment for conversion action '%s' and order ID '%s'.%n",
              opIndex, result.getConversionAction(), result.getOrderId());
        }
      }
    }
  }
  // [END upload_conversion_adjustment]
}

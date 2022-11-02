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
import com.google.ads.googleads.v12.enums.ConversionAdjustmentTypeEnum.ConversionAdjustmentType;
import com.google.ads.googleads.v12.errors.GoogleAdsError;
import com.google.ads.googleads.v12.errors.GoogleAdsException;
import com.google.ads.googleads.v12.errors.GoogleAdsFailure;
import com.google.ads.googleads.v12.services.ConversionAdjustment;
import com.google.ads.googleads.v12.services.ConversionAdjustmentResult;
import com.google.ads.googleads.v12.services.ConversionAdjustmentUploadServiceClient;
import com.google.ads.googleads.v12.services.GclidDateTimePair;
import com.google.ads.googleads.v12.services.RestatementValue;
import com.google.ads.googleads.v12.services.UploadConversionAdjustmentsRequest;
import com.google.ads.googleads.v12.services.UploadConversionAdjustmentsResponse;
import com.google.ads.googleads.v12.utils.ErrorUtils;
import com.google.ads.googleads.v12.utils.ResourceNames;
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

    @Parameter(names = ArgumentNames.GCLID, required = true)
    private String gclid;

    @Parameter(
        names = ArgumentNames.ADJUSTMENT_TYPE,
        required = true,
        description =
            "RETRACTION negates a conversion, and RESTATEMENT changes the value of a conversion.")
    private String adjustmentType;

    @Parameter(
        names = ArgumentNames.CONVERSION_DATE_TIME,
        required = true,
        description =
            "The date time at which the conversion occurred. "
                + "Must be after the click time, and must include the time zone offset. "
                + "The format is  'yyyy-mm-dd hh:mm:ss+|-hh:mm', e.g. '2019-01-01 12:32:45-08:00'.")
    private String conversionDateTime;

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

  public static void main(String[] args) {
    UploadConversionAdjustmentParams params = new UploadConversionAdjustmentParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.conversionActionId = Long.parseLong("INSERT_CONVERSION_ACTION_ID_HERE");
      params.gclid = "INSERT_GCL_ID_HERE";
      params.adjustmentType = "INSERT_ADJUSTMENT_TYPE_HERE";
      params.conversionDateTime = "INSERT_CONVERSION_DATE_TIME_HERE";
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
              params.gclid,
              params.adjustmentType,
              params.conversionDateTime,
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
   * @param gclid the GCLID for the conversion.
   * @param adjustmentType the type of adjustment, e.g. RETRACTION, RESTATEMENT.
   * @param conversionDateTime date and time of the conversion.
   * @param adjustmentDateTime date and time of the adjustment.
   * @param restatementValue the adjusted value for adjustment type RESTATEMENT.
   */
  // [START upload_conversion_adjustment]
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long conversionActionId,
      String gclid,
      String adjustmentType,
      String conversionDateTime,
      String adjustmentDateTime,
      @Nullable Float restatementValue) {
    // Gets the conversion adjustment enum value from the adjustmentType String.
    ConversionAdjustmentType conversionAdjustmentType =
        ConversionAdjustmentType.valueOf(adjustmentType);

    // Associates conversion adjustments with the existing conversion action.
    // The GCLID should have been uploaded before with a conversion.
    ConversionAdjustment conversionAdjustment =
        ConversionAdjustment.newBuilder()
            .setConversionAction(ResourceNames.conversionAction(customerId, conversionActionId))
            .setAdjustmentType(conversionAdjustmentType)
            .setGclidDateTimePair(
                GclidDateTimePair.newBuilder()
                    .setGclid(gclid)
                    .setConversionDateTime(conversionDateTime)
                    .build())
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
      UploadConversionAdjustmentsResponse response =
          conversionUploadServiceClient.uploadConversionAdjustments(
              UploadConversionAdjustmentsRequest.newBuilder()
                  .setCustomerId(Long.toString(customerId))
                  .addConversionAdjustments(conversionAdjustment)
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
      } else {
        // Prints the result.
        ConversionAdjustmentResult result = response.getResults(0);
        System.out.printf(
            "Uploaded conversion adjustment of '%s' for Google Click ID '%s'.%n",
            result.getConversionAction(), result.getGclidDateTimePair().getGclid());
      }
    }
  }
  // [END upload_conversion_adjustment]
}

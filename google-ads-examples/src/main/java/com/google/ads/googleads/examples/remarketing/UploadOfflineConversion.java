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
import com.google.ads.googleads.v1.utils.ResourceNames;
import com.google.ads.googleads.v4.errors.GoogleAdsError;
import com.google.ads.googleads.v4.errors.GoogleAdsException;
import com.google.ads.googleads.v4.services.ClickConversion;
import com.google.ads.googleads.v4.services.ClickConversionResult;
import com.google.ads.googleads.v4.services.ConversionUploadServiceClient;
import com.google.ads.googleads.v4.services.UploadClickConversionsResponse;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.DoubleValue;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Imports offline conversion values for specific clicks to an account. */
public class UploadOfflineConversion {
  private static class UploadOfflineConversionParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private long customerId;

    @Parameter(names = ArgumentNames.CONVERSION_ACTION_ID, required = true)
    private long conversionActionId;

    @Parameter(names = ArgumentNames.GCLID, required = true)
    private String gclid;

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
  }

  public static void main(String[] args) {
    UploadOfflineConversionParams params = new UploadOfflineConversionParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.conversionActionId = Long.parseLong("INSERT_CONVERSION_ACTION_ID_HERE");
      params.gclid = "INSERT_GCL_ID_HERE";
      params.conversionDateTime = "INSERT_CONVERSION_DATE_TIME_HERE";
      params.conversionValue = Double.parseDouble("INSERT_CONVERSION_VALUE_HERE");
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
      new UploadOfflineConversion()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.conversionActionId,
              params.gclid,
              params.conversionDateTime,
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
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param conversionActionId conversion action ID associated with this conversion.
   * @param gclid the GCLID for the conversion.
   * @param conversionDateTime date and time of the conversion.
   * @param conversionValue the value of the conversion.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long conversionActionId,
      String gclid,
      String conversionDateTime,
      Double conversionValue) {
    // Gets the conversion action resource name.
    String conversionActionResourceName =
        ResourceNames.conversionAction(customerId, conversionActionId);

    // Creates the click conversion.
    ClickConversion clickConversion =
        ClickConversion.newBuilder()
            .setConversionAction(StringValue.of(conversionActionResourceName))
            .setConversionDateTime(StringValue.of(conversionDateTime))
            .setConversionValue(DoubleValue.of(conversionValue))
            .setCurrencyCode(StringValue.of("USD"))
            .setGclid(StringValue.of(gclid))
            .build();

    // Creates the conversion upload service client.
    try (ConversionUploadServiceClient conversionUploadServiceClient =
        googleAdsClient.getLatestVersion().createConversionUploadServiceClient()) {
      // Uploads the click conversion. Partial failure should always be set to true.
      UploadClickConversionsResponse response =
          conversionUploadServiceClient.uploadClickConversions(
              Long.toString(customerId),
              ImmutableList.of(clickConversion),
              // Enables partial failure (must be true).
              true,
              // Disables validate only.
              false);

      // Prints any partial errors returned.
      if (response.hasPartialFailureError()) {
        System.out.printf(
            "Partial error encountered: '%s'.%n", response.getPartialFailureError().getMessage());
      }

      // Prints the result.
      ClickConversionResult result = response.getResults(0);
      // Only prints valid results.
      if (result.hasGclid()) {
        System.out.printf(
            "Uploaded conversion that occurred at '%s' from Google Click ID '%s' to '%s'.%n",
            result.getConversionDateTime().getValue(),
            result.getGclid().getValue(),
            result.getConversionAction().getValue());
      }
    }
  }
}

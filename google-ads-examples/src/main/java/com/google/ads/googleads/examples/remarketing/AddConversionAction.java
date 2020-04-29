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

package com.google.ads.googleads.examples.remarketing;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.ads.googleads.v3.enums.ConversionActionCategoryEnum.ConversionActionCategory;
import com.google.ads.googleads.v3.enums.ConversionActionStatusEnum.ConversionActionStatus;
import com.google.ads.googleads.v3.enums.ConversionActionTypeEnum.ConversionActionType;
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.resources.ConversionAction;
import com.google.ads.googleads.v3.resources.ConversionAction.ValueSettings;
import com.google.ads.googleads.v3.services.ConversionActionOperation;
import com.google.ads.googleads.v3.services.ConversionActionServiceClient;
import com.google.ads.googleads.v3.services.MutateConversionActionResult;
import com.google.ads.googleads.v3.services.MutateConversionActionsResponse;
import com.google.protobuf.BoolValue;
import com.google.protobuf.DoubleValue;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;

/** Adds a conversion action. */
public class AddConversionAction {

  private static class AddConversionActionParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    AddConversionActionParams params = new AddConversionActionParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
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
      new AddConversionAction().runExample(googleAdsClient, params.customerId);
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
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {

    // Creates a ConversionAction.
    ConversionAction conversionAction =
        ConversionAction.newBuilder()
            .setName(
                StringValue.of("Earth to Mars Cruises Conversion #" + System.currentTimeMillis()))
            .setCategory(ConversionActionCategory.DEFAULT)
            .setType(ConversionActionType.WEBPAGE)
            .setStatus(ConversionActionStatus.ENABLED)
            .setViewThroughLookbackWindowDays(Int64Value.of(15L))
            .setValueSettings(
                ValueSettings.newBuilder()
                    .setDefaultValue(DoubleValue.of(23.41))
                    .setAlwaysUseDefaultValue(BoolValue.of(true))
                    .build())
            .build();

    // Creates the operation.
    ConversionActionOperation operation =
        ConversionActionOperation.newBuilder().setCreate(conversionAction).build();

    try (ConversionActionServiceClient conversionActionServiceClient =
        googleAdsClient.getLatestVersion().createConversionActionServiceClient()) {
      MutateConversionActionsResponse response =
          conversionActionServiceClient.mutateConversionActions(
              Long.toString(customerId), Collections.singletonList(operation));
      System.out.printf("Added %d conversion actions:%n", response.getResultsCount());
      for (MutateConversionActionResult result : response.getResultsList()) {
        System.out.printf(
            "New conversion action added with resource name: '%s'%n", result.getResourceName());
      }
    }
  }
}

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

package com.google.ads.googleads.examples.assets;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v19.common.AdScheduleInfo;
import com.google.ads.googleads.v19.common.CallAsset;
import com.google.ads.googleads.v19.enums.AssetFieldTypeEnum.AssetFieldType;
import com.google.ads.googleads.v19.enums.CallConversionReportingStateEnum.CallConversionReportingState;
import com.google.ads.googleads.v19.enums.DayOfWeekEnum.DayOfWeek;
import com.google.ads.googleads.v19.enums.MinuteOfHourEnum.MinuteOfHour;
import com.google.ads.googleads.v19.errors.GoogleAdsError;
import com.google.ads.googleads.v19.errors.GoogleAdsException;
import com.google.ads.googleads.v19.resources.Asset;
import com.google.ads.googleads.v19.resources.CustomerAsset;
import com.google.ads.googleads.v19.services.AssetOperation;
import com.google.ads.googleads.v19.services.AssetServiceClient;
import com.google.ads.googleads.v19.services.CustomerAssetOperation;
import com.google.ads.googleads.v19.services.CustomerAssetServiceClient;
import com.google.ads.googleads.v19.services.MutateAssetsResponse;
import com.google.ads.googleads.v19.services.MutateCustomerAssetsResponse;
import com.google.ads.googleads.v19.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/** This example adds a call asset to a specific account. */
public class AddCall {
  private static class AddCallParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

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
    AddCallParams params = new AddCallParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
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
      new AddCall()
          .runExample(
              googleAdsClient,
              params.customerId,
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
   * @param phoneCountry the phone country (2-letter code).
   * @param phoneNumber the raw phone number, e.g. '(800) 555-0100'.
   * @param conversionActionId the conversion action ID to attribute conversions to.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String phoneCountry,
      String phoneNumber,
      Integer conversionActionId) {
    // Creates the call asset.
    String assetResourceName =
        addCallAsset(googleAdsClient, customerId, phoneCountry, phoneNumber, conversionActionId);

    // Links the assets at the account level, so they will serve in all eligible campaigns.
    linkAssetToAccount(googleAdsClient, customerId, assetResourceName);
  }

  /**
   * Creates a new call asset.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param phoneCountry the phone country (2-letter code).
   * @param phoneNumber the raw phone number, e.g. '(800) 555-0100'.
   * @param conversionActionId the conversion action ID to attribute conversions to.
   * @return resource name of the newly created asset.
   */
  private String addCallAsset(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String phoneCountry,
      String phoneNumber,
      Integer conversionActionId) {
    CallAsset.Builder callAssetBuilder =
        CallAsset.newBuilder()
            // Sets the country code and phone number of the business to call.
            .setCountryCode(phoneCountry)
            .setPhoneNumber(phoneNumber)
            // Optional: Specifies all day and time intervals for which the asset may serve.
            .addAdScheduleTargets(
                AdScheduleInfo.newBuilder()
                    // Sets the day of this schedule as Monday.
                    .setDayOfWeek(DayOfWeek.MONDAY)
                    // Sets the start hour to 9am.
                    .setStartHour(9)
                    // Sets the end hour to 5pm.
                    .setEndHour(17)
                    // Sets the start and end minute of zero, for example: 9:00 and 5:00.
                    .setStartMinute(MinuteOfHour.ZERO)
                    .setEndMinute(MinuteOfHour.ZERO)
                    .build());

    // Sets the conversion action ID to the one provided if any.
    if (conversionActionId != null) {
      callAssetBuilder
          .setCallConversionAction(ResourceNames.conversionAction(customerId, conversionActionId))
          .setCallConversionReportingState(
              CallConversionReportingState.USE_RESOURCE_LEVEL_CALL_CONVERSION_ACTION);
    }

    // Creates an asset operation wrapping the call asset in an asset.
    AssetOperation assetOperation =
        AssetOperation.newBuilder()
            .setCreate(Asset.newBuilder().setCallAsset(callAssetBuilder.build()).build())
            .build();

    // Creates an asset service client.
    try (AssetServiceClient assetServiceClient =
        googleAdsClient.getLatestVersion().createAssetServiceClient()) {
      // Issues a mutate request to add the asset and prints its information.
      MutateAssetsResponse response =
          assetServiceClient.mutateAssets(
              Long.toString(customerId), ImmutableList.of(assetOperation));
      String createdAssetResourceName = response.getResults(0).getResourceName();
      System.out.printf(
          "Created a call asset with resource name: '%s'.%n", createdAssetResourceName);
      return createdAssetResourceName;
    }
  }

  /**
   * Links the call asset at the account level to serve in all eligible campaigns.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param assetResourceName the resource name of the call asset.
   */
  private void linkAssetToAccount(
      GoogleAdsClient googleAdsClient, long customerId, String assetResourceName) {
    // Creates a customer asset operation wrapping the call asset in a customer asset.
    CustomerAssetOperation customerAssetOperation =
        CustomerAssetOperation.newBuilder()
            .setCreate(
                CustomerAsset.newBuilder()
                    .setAsset(assetResourceName)
                    .setFieldType(AssetFieldType.CALL)
                    .build())
            .build();

    // Creates a CustomerAssetServiceClient.
    try (CustomerAssetServiceClient customerAssetServiceClient =
        googleAdsClient.getLatestVersion().createCustomerAssetServiceClient()) {
      // Issues a mutate request to add the customer asset and prints its information.
      MutateCustomerAssetsResponse response =
          customerAssetServiceClient.mutateCustomerAssets(
              Long.toString(customerId), ImmutableList.of(customerAssetOperation));
      System.out.printf(
          "Created a customer asset with resource name: '%s'.%n",
          response.getResults(0).getResourceName());
    }
  }
}

// Copyright 2019 Google LLC
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
import com.google.ads.googleads.v21.common.HotelCalloutAsset;
import com.google.ads.googleads.v21.enums.AssetFieldTypeEnum.AssetFieldType;
import com.google.ads.googleads.v21.errors.GoogleAdsError;
import com.google.ads.googleads.v21.errors.GoogleAdsException;
import com.google.ads.googleads.v21.resources.Asset;
import com.google.ads.googleads.v21.resources.CustomerAsset;
import com.google.ads.googleads.v21.services.AssetOperation;
import com.google.ads.googleads.v21.services.AssetServiceClient;
import com.google.ads.googleads.v21.services.CustomerAssetOperation;
import com.google.ads.googleads.v21.services.CustomerAssetServiceClient;
import com.google.ads.googleads.v21.services.MutateAssetResult;
import com.google.ads.googleads.v21.services.MutateAssetsResponse;
import com.google.ads.googleads.v21.services.MutateCustomerAssetResult;
import com.google.ads.googleads.v21.services.MutateCustomerAssetsResponse;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/** Adds a hotel callout asset and adds the asset to the given account. */
public class AddHotelCallout {

  private static class AddHotelCalloutParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    // See supported languages at:
    // https://developers.google.com/hotels/hotel-ads/api-reference/language-codes
    @Parameter(names = ArgumentNames.LANGUAGE_CODE, required = true)
    private String languageCode;
  }

  public static void main(String[] args) {
    AddHotelCalloutParams params = new AddHotelCalloutParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.languageCode = "INSERT_LANGUAGE_CODE_HERE";
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
      new AddHotelCallout().runExample(googleAdsClient, params.customerId, params.languageCode);
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

  /** Runs the example. */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, String languageCode) {
    // Creates assets for the hotel callouts.
    List<String> assetResourceNames =
        addHotelCalloutAssets(googleAdsClient, customerId, languageCode);
    // Links the assets at the account level, so they will serve in all eligible campaigns.
    linkAssetsToAccount(googleAdsClient, customerId, assetResourceNames);
  }

  /** Creates new hotel callout assets. */
  private List<String> addHotelCalloutAssets(
      GoogleAdsClient googleAdsClient, long customerId, String languageCode) {
    List<HotelCalloutAsset> hotelCalloutAssets = new ArrayList<>();
    // Creates the callouts with text and specified language.
    hotelCalloutAssets.add(
        HotelCalloutAsset.newBuilder().setText("Activities").setLanguageCode(languageCode).build());
    hotelCalloutAssets.add(
        HotelCalloutAsset.newBuilder().setText("Facilities").setLanguageCode(languageCode).build());

    // Wraps the HotelCalloutAsset in an Asset and creates an AssetOperation to add the Asset.
    List<AssetOperation> operations =
        hotelCalloutAssets.stream()
            .map(callout -> Asset.newBuilder().setHotelCalloutAsset(callout).build())
            .map(asset -> AssetOperation.newBuilder().setCreate(asset).build())
            .collect(Collectors.toList());

    // Issues the create request to create the assets.
    try (AssetServiceClient assetClient =
        googleAdsClient.getLatestVersion().createAssetServiceClient()) {
      MutateAssetsResponse response =
          assetClient.mutateAssets(String.valueOf(customerId), operations);
      List<String> resourceNames =
          response.getResultsList().stream()
              .map(MutateAssetResult::getResourceName)
              .collect(Collectors.toList());
      // Prints some information about the result.
      for (String resName : resourceNames) {
        System.out.printf("Created hotel call out asset with resource name %s.%n", resName);
      }
      return resourceNames;
    }
  }

  /** Links Asset at the Customer level to serve in all eligible campaigns. */
  private void linkAssetsToAccount(
      GoogleAdsClient googleAdsClient, long customerId, List<String> assetResourceNames) {
    // Creates a CustomerAsset link for each Asset resource name provided, then converts this into a
    // CustomerAssetOperation to create the Asset.
    List<CustomerAssetOperation> customerAssetsOperations =
        assetResourceNames.stream()
            .map(
                asset ->
                    CustomerAsset.newBuilder()
                        .setAsset(asset)
                        .setFieldType(AssetFieldType.HOTEL_CALLOUT)
                        .build())
            .map(
                customerAsset ->
                    CustomerAssetOperation.newBuilder().setCreate(customerAsset).build())
            .collect(Collectors.toList());

    // Issues the create request to add the callout.
    try (CustomerAssetServiceClient customerAssetClient =
        googleAdsClient.getLatestVersion().createCustomerAssetServiceClient()) {
      MutateCustomerAssetsResponse response =
          customerAssetClient.mutateCustomerAssets(
              String.valueOf(customerId), customerAssetsOperations);
      List<String> resourceNames =
          response.getResultsList().stream()
              .map(MutateCustomerAssetResult::getResourceName)
              .collect(Collectors.toList());
      for (String resName : resourceNames) {
        System.out.printf("Added an account asset with resource name: '%s'.%n", resName);
      }
    }
  }
}

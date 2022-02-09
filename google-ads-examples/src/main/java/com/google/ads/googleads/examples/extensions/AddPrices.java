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

package com.google.ads.googleads.examples.extensions;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v10.common.Money;
import com.google.ads.googleads.v10.common.PriceAsset;
import com.google.ads.googleads.v10.common.PriceOffering;
import com.google.ads.googleads.v10.enums.AssetFieldTypeEnum.AssetFieldType;
import com.google.ads.googleads.v10.enums.PriceExtensionPriceQualifierEnum.PriceExtensionPriceQualifier;
import com.google.ads.googleads.v10.enums.PriceExtensionPriceUnitEnum.PriceExtensionPriceUnit;
import com.google.ads.googleads.v10.enums.PriceExtensionTypeEnum.PriceExtensionType;
import com.google.ads.googleads.v10.errors.GoogleAdsError;
import com.google.ads.googleads.v10.errors.GoogleAdsException;
import com.google.ads.googleads.v10.resources.Asset;
import com.google.ads.googleads.v10.resources.CustomerAsset;
import com.google.ads.googleads.v10.services.AssetOperation;
import com.google.ads.googleads.v10.services.AssetServiceClient;
import com.google.ads.googleads.v10.services.CustomerAssetOperation;
import com.google.ads.googleads.v10.services.CustomerAssetServiceClient;
import com.google.ads.googleads.v10.services.MutateAssetsResponse;
import com.google.ads.googleads.v10.services.MutateCustomerAssetsResponse;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Adds a price extension and associates it with an account. */
public class AddPrices {

  public static class AddPricesParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CUSTOMER_ID)
    private long customerId;
  }

  public static void main(String[] args) {
    AddPricesParams params = new AddPricesParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
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
      new AddPrices().runExample(googleAdsClient, params.customerId);
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
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates a PriceAsset to use as an extension.
    String priceAssetResourceName = createPriceAsset(googleAdsClient, customerId);
    // Links the extension at the Customer level, allowing the extension to serve in all eligible
    // campaigns. For more detail about linking extensions at customer, campaign and ad group level
    // see https://support.google.com/google-ads/answer/7106946?hl=en&ref_topic=3119125
    linkPriceAssetToCustomer(googleAdsClient, priceAssetResourceName, customerId);
  }

  /** Creates a PriceAsset. */
  private String createPriceAsset(GoogleAdsClient googleAdsClient, long customerId) {
    PriceAsset priceAsset =
        PriceAsset.newBuilder()
            .setType(PriceExtensionType.SERVICES)
            // Optional: sets a qualifier text to show with the price extension.
            .setPriceQualifier(PriceExtensionPriceQualifier.FROM)
            .setLanguageCode("en")
            // To create a price extension, at least three price offerings are needed.
            .addPriceOfferings(
                createPriceOffering(
                    "Scrubs",
                    "Body Scrub, Salt Scrub",
                    60000000, // 60 USD
                    "USD",
                    PriceExtensionPriceUnit.PER_HOUR,
                    "http://www.example.com/scrubs",
                    "http://m.example.com/scrubs"))
            .addPriceOfferings(
                createPriceOffering(
                    "Hair Cuts",
                    "Once a month",
                    75000000, // 75 USD
                    "USD",
                    PriceExtensionPriceUnit.PER_MONTH,
                    "http://www.example.com/haircuts",
                    "http://m.example.com/haircuts"))
            .addPriceOfferings(
                createPriceOffering(
                    "Skin Care Package",
                    "Four times a month",
                    250000000, // 250 USD
                    "USD",
                    PriceExtensionPriceUnit.PER_MONTH,
                    "http://www.example.com/skincarepackage",
                    null))
            .build();
    // Wraps the PriceAsset in an Asset.
    Asset asset =
        Asset.newBuilder()
            .setPriceAsset(priceAsset)
            .setTrackingUrlTemplate("http://tracker.example.com/?u={lpurl}")
            .build();
    // Creates an AssetOperation to add the new Asset.
    AssetOperation operation = AssetOperation.newBuilder().setCreate(asset).build();
    // Creates the service client.
    try (AssetServiceClient client =
        googleAdsClient.getLatestVersion().createAssetServiceClient()) {
      // Sends the mutate request.
      MutateAssetsResponse response =
          client.mutateAssets(String.valueOf(customerId), ImmutableList.of(operation));
      // Prints some information about the result.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Created price asset with resource name '%s'.%n", resourceName);
      return resourceName;
    }
  }

  /** Links an Asset to Customer, allowing it to serve in all campaigns under the customer. */
  private void linkPriceAssetToCustomer(
      GoogleAdsClient googleAdsClient, String priceAssetResourceName, long customerId) {
    // Creates the CustomerAsset link.
    CustomerAsset customerAsset =
        CustomerAsset.newBuilder()
            .setAsset(priceAssetResourceName)
            .setFieldType(AssetFieldType.PRICE)
            .build();
    // Creates an CustomerAssetOperation to add the link.
    CustomerAssetOperation operation =
        CustomerAssetOperation.newBuilder().setCreate(customerAsset).build();
    // Creates the service client.
    try (CustomerAssetServiceClient client =
        googleAdsClient.getLatestVersion().createCustomerAssetServiceClient()) {
      // Sends the mutate request.
      MutateCustomerAssetsResponse response =
          client.mutateCustomerAssets(String.valueOf(customerId), ImmutableList.of(operation));
      // Prints some information about the result.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Created customer asset with resource name '%s'.%n", resourceName);
    }
  }

  /** Creates a PriceOffering with the specified fields. */
  private PriceOffering createPriceOffering(
      String header,
      String description,
      int priceInMicros,
      String currencyCode,
      PriceExtensionPriceUnit unit,
      String finalUrl,
      String finalMobileUrl) {
    PriceOffering.Builder builder =
        PriceOffering.newBuilder()
            .setHeader(header)
            .setDescription(description)
            .setFinalUrl(finalUrl)
            .setPrice(
                Money.newBuilder().setAmountMicros(priceInMicros).setCurrencyCode(currencyCode))
            .setUnit(unit);
    if (finalMobileUrl != null) {
      builder.setFinalMobileUrl(finalMobileUrl);
    }
    return builder.build();
  }
}

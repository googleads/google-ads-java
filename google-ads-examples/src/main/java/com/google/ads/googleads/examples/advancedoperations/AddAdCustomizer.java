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

package com.google.ads.googleads.examples.advancedoperations;

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getShortPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v11.common.AdTextAsset;
import com.google.ads.googleads.v11.common.CustomizerValue;
import com.google.ads.googleads.v11.common.ResponsiveSearchAdInfo;
import com.google.ads.googleads.v11.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType;
import com.google.ads.googleads.v11.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType;
import com.google.ads.googleads.v11.errors.GoogleAdsError;
import com.google.ads.googleads.v11.errors.GoogleAdsException;
import com.google.ads.googleads.v11.resources.Ad;
import com.google.ads.googleads.v11.resources.AdGroupAd;
import com.google.ads.googleads.v11.resources.AdGroupCustomizer;
import com.google.ads.googleads.v11.resources.CustomizerAttribute;
import com.google.ads.googleads.v11.services.AdGroupAdOperation;
import com.google.ads.googleads.v11.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v11.services.AdGroupCustomizerOperation;
import com.google.ads.googleads.v11.services.AdGroupCustomizerServiceClient;
import com.google.ads.googleads.v11.services.CustomizerAttributeOperation;
import com.google.ads.googleads.v11.services.CustomizerAttributeServiceClient;
import com.google.ads.googleads.v11.services.MutateAdGroupAdResult;
import com.google.ads.googleads.v11.services.MutateAdGroupAdsResponse;
import com.google.ads.googleads.v11.services.MutateAdGroupCustomizerResult;
import com.google.ads.googleads.v11.services.MutateAdGroupCustomizersResponse;
import com.google.ads.googleads.v11.services.MutateCustomizerAttributesResponse;
import com.google.ads.googleads.v11.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This code example adds two ad customizer attributes and associates them with the ad group. Then
 * it adds an ad that uses the ad customizer attributes to populate dynamic data.
 */
public class AddAdCustomizer {

  // We're doing only searches by resource_name in this example, we can set page size = 1.
  private static class AddAdCustomizerParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
  }

  public static void main(String[] args) throws IOException {
    AddAdCustomizerParams params = new AddAdCustomizerParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
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
      new AddAdCustomizer().runExample(googleAdsClient, params.customerId, params.adGroupId);
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
   * @param customerId the ID of the customer.
   * @param adGroupId the ID of the adGroup to associate the customizers with.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long adGroupId) {
    String stringCustomizerName = "Planet_" + getShortPrintableDateTime();
    String priceCustomizerName = "Price_" + getShortPrintableDateTime();

    // Creates ad customizer attributes.
    String textCustomizerAttributeResourceName =
        createTextCustomizerAttribute(googleAdsClient, customerId, stringCustomizerName);
    String priceCustomizerAttributeResourceName =
        createPriceCustomizerAttribute(googleAdsClient, customerId, priceCustomizerName);

    // Links the customizer attributes.
    linkCustomizerAttributes(
        googleAdsClient,
        customerId,
        adGroupId,
        textCustomizerAttributeResourceName,
        priceCustomizerAttributeResourceName);

    // Creates an ad with the customizations provided by the ad customizer attributes.
    createAdWithCustomizations(
        googleAdsClient, customerId, adGroupId, stringCustomizerName, priceCustomizerName);
  }

  /**
   * Creates a text customizer attribute and returns its resource name.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param customizerName the name of the customizer to create.
   * @return the attributes of the feed.
   */
  // [START add_ad_customizer]
  private String createTextCustomizerAttribute(
      GoogleAdsClient googleAdsClient, long customerId, String customizerName) {
    // Creates a text customizer attribute. The customizer attribute name is arbitrary and will be
    // used as a placeholder in the ad text fields.
    CustomizerAttribute textAttribute =
        CustomizerAttribute.newBuilder()
            .setName(customizerName)
            .setType(CustomizerAttributeType.TEXT)
            .build();

    CustomizerAttributeOperation operation =
        CustomizerAttributeOperation.newBuilder().setCreate(textAttribute).build();

    try (CustomizerAttributeServiceClient customizerAttributeServiceClient =
        googleAdsClient.getLatestVersion().createCustomizerAttributeServiceClient()) {
      MutateCustomizerAttributesResponse response =
          customizerAttributeServiceClient.mutateCustomizerAttributes(
              Long.toString(customerId), ImmutableList.of(operation));

      String customizerAttributeResourceName = response.getResults(0).getResourceName();
      System.out.printf(
          "Added text customizer attribute with resource name '%s'.%n",
          customizerAttributeResourceName);
      return customizerAttributeResourceName;
    }
  }
  // [END add_ad_customizer]

  /**
   * Creates a price customizer attribute and returns its resource name.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param customizerName the name of the customizer to create.
   * @return the attributes of the feed.
   */
  // [START add_ad_customizer_1]
  private String createPriceCustomizerAttribute(
      GoogleAdsClient googleAdsClient, long customerId, String customizerName) {
    // Creates a price customizer attribute. The customizer attribute name is arbitrary and will be
    // used as a placeholder in the ad text fields.
    CustomizerAttribute priceAttribute =
        CustomizerAttribute.newBuilder()
            .setName(customizerName)
            .setType(CustomizerAttributeType.PRICE)
            .build();

    CustomizerAttributeOperation operation =
        CustomizerAttributeOperation.newBuilder().setCreate(priceAttribute).build();

    try (CustomizerAttributeServiceClient customizerAttributeServiceClient =
        googleAdsClient.getLatestVersion().createCustomizerAttributeServiceClient()) {
      MutateCustomizerAttributesResponse response =
          customizerAttributeServiceClient.mutateCustomizerAttributes(
              Long.toString(customerId), ImmutableList.of(operation));

      String customizerAttributeResourceName = response.getResults(0).getResourceName();
      System.out.printf(
          "Added price customizer attribute with resource name '%s'.%n",
          customizerAttributeResourceName);
      return customizerAttributeResourceName;
    }
  }
  // [END add_ad_customizer_1]


  /**
   * Restricts the ad customizer attributes to work only with a specific ad group; this prevents the
   * customizer attributes from being used elsewhere and makes sure they are used only for
   * customizing a specific ad group.
   *
   * @param googleAdsClient the Google Ads client.
   * @param customerId the client customer ID.
   * @param adGroupId the ad group ID to bind the customizer attributes to.
   * @param textCustomizerAttributeResourceName the resource name of the text customizer attribute.
   * @param priceCustomizerAttributeResourceName the resource name of the price customizer
   *     attribute.
   */
  // [START add_ad_customizer_2]
  private void linkCustomizerAttributes(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long adGroupId,
      String textCustomizerAttributeResourceName,
      String priceCustomizerAttributeResourceName) {
    List<AdGroupCustomizerOperation> operations = new ArrayList<>();

    // Binds the text attribute customizer to a specific ad group to make sure it will only be used
    // to customize ads inside that ad group.
    AdGroupCustomizer marsCustomizer =
        AdGroupCustomizer.newBuilder()
            .setCustomizerAttribute(textCustomizerAttributeResourceName)
            .setValue(
                CustomizerValue.newBuilder()
                    .setType(CustomizerAttributeType.TEXT)
                    .setStringValue("Mars")
                    .build())
            .setAdGroup(ResourceNames.adGroup(customerId, adGroupId))
            .build();

    operations.add(AdGroupCustomizerOperation.newBuilder().setCreate(marsCustomizer).build());

    // Binds the price attribute customizer to a specific ad group to make sure it will only be used
    // to customize ads inside that ad group.
    AdGroupCustomizer priceCustomizer =
        AdGroupCustomizer.newBuilder()
            .setCustomizerAttribute(priceCustomizerAttributeResourceName)
            .setValue(
                CustomizerValue.newBuilder()
                    .setType(CustomizerAttributeType.PRICE)
                    .setStringValue("100.0€")
                    .build())
            .setAdGroup(ResourceNames.adGroup(customerId, adGroupId))
            .build();

    operations.add(AdGroupCustomizerOperation.newBuilder().setCreate(priceCustomizer).build());

    try (AdGroupCustomizerServiceClient adGroupCustomizerServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupCustomizerServiceClient()) {
      MutateAdGroupCustomizersResponse response =
          adGroupCustomizerServiceClient.mutateAdGroupCustomizers(
              Long.toString(customerId), operations);
      for (MutateAdGroupCustomizerResult result : response.getResultsList()) {
        System.out.printf(
            "Added an ad group customizer with resource name '%s'.%n", result.getResourceName());
      }
    }
  }
  // [END add_ad_customizer_2]

  /**
   * Creates a responsive search ad that uses the ad customizer attributes to populate the
   * placeholders.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param stringCustomizerName name of the string customizer.
   * @param priceCustomizerName Name of the price customizer.
   */
  // [START add_ad_customizer_3]
  private void createAdWithCustomizations(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long adGroupId,
      String stringCustomizerName,
      String priceCustomizerName) {

    // Creates a responsive search ad using the attribute customizer names as placeholders and
    // default values to be used in case there are no attribute customizer values.
    ResponsiveSearchAdInfo responsiveSearchAdInfo =
        ResponsiveSearchAdInfo.newBuilder()
            .addAllHeadlines(
                ImmutableList.of(
                    AdTextAsset.newBuilder()
                        .setText(
                            String.format(
                                "Luxury cruise to {CUSTOMIZER.%s:Venus}", stringCustomizerName))
                        .setPinnedField(ServedAssetFieldType.HEADLINE_1)
                        .build(),
                    AdTextAsset.newBuilder()
                        .setText(
                            String.format("Only {CUSTOMIZER.%s:10.0€}", priceCustomizerName))
                        .build(),
                    AdTextAsset.newBuilder()
                        .setText(
                            String.format(
                                "Cruise to {CUSTOMIZER.%s:Venus} for {CUSTOMIZER.%s:10.0€}",
                                stringCustomizerName, priceCustomizerName))
                        .build()))
            .addAllDescriptions(
                ImmutableList.of(
                    AdTextAsset.newBuilder()
                        .setText(
                            String.format(
                                "Tickets are only {CUSTOMIZER.%s:10.0€}!", priceCustomizerName))
                        .build(),
                    AdTextAsset.newBuilder()
                        .setText(
                            String.format(
                                "Buy your tickets to {CUSTOMIZER.%s:Venus} now!",
                                stringCustomizerName))
                        .build()))
            .build();

    Ad ad =
        Ad.newBuilder()
            .setResponsiveSearchAd(responsiveSearchAdInfo)
            .addFinalUrls("https://www.example.com")
            .build();

    List<AdGroupAdOperation> adGroupAdOperations = new ArrayList<>();

    AdGroupAd adGroupAd =
        AdGroupAd.newBuilder()
            .setAd(ad)
            .setAdGroup(ResourceNames.adGroup(customerId, adGroupId))
            .build();

    AdGroupAdOperation adGroupAdOperation =
        AdGroupAdOperation.newBuilder().setCreate(adGroupAd).build();

    adGroupAdOperations.add(adGroupAdOperation);

    try (AdGroupAdServiceClient adGroupAdServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupAdServiceClient()) {

      MutateAdGroupAdsResponse response =
          adGroupAdServiceClient.mutateAdGroupAds(Long.toString(customerId), adGroupAdOperations);

      System.out.printf("Added %d ads:%n", response.getResultsCount());
      for (MutateAdGroupAdResult result : response.getResultsList()) {
        System.out.printf("Added an ad with resource name '%s'.%n", result.getResourceName());
      }
    }
  }
  // [END add_ad_customizer_3]
}

// Copyright 2021 Google LLC
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

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v21.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v21.services.AdGroupAdOperation;
import com.google.ads.googleads.v21.services.AdGroupAdServiceClient;
import com.google.ads.googleads.v21.services.MutateAdGroupAdsResponse;
import com.google.ads.googleads.v21.utils.ResourceNames;
import com.google.ads.googleads.v21.common.AdTextAsset;
import com.google.ads.googleads.v21.common.CustomizerValue;
import com.google.ads.googleads.v21.common.ResponsiveSearchAdInfo;
import com.google.ads.googleads.v21.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType;
import com.google.ads.googleads.v21.errors.GoogleAdsError;
import com.google.ads.googleads.v21.errors.GoogleAdsException;
import com.google.ads.googleads.v21.resources.Ad;
import com.google.ads.googleads.v21.resources.AdGroupAd;
import com.google.ads.googleads.v21.resources.CustomerCustomizer;
import com.google.ads.googleads.v21.resources.CustomizerAttribute;
import com.google.ads.googleads.v21.services.CustomerCustomizerOperation;
import com.google.ads.googleads.v21.services.CustomerCustomizerServiceClient;
import com.google.ads.googleads.v21.services.CustomizerAttributeOperation;
import com.google.ads.googleads.v21.services.CustomizerAttributeServiceClient;
import com.google.ads.googleads.v21.services.MutateCustomerCustomizersResponse;
import com.google.ads.googleads.v21.services.MutateCustomizerAttributesResponse;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Adds a customizer attribute, links the customizer attribute to a customer, and then adds a
 * responsive search ad with a description using the ad customizer to the specified ad group.
 */
public class AddResponsiveSearchAdWithAdCustomizer {

  private static class AddResponsiveSearchAdWithAdCustomizerParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;

    // The name of the customizer attribute to be used in the ad customizer, which must be unique.
    // To run this example multiple times, change this value or specify its corresponding argument.
    // Note that there is a limit for the number of enabled customizer attributes in one account,
    // so you shouldn't run this example more than necessary.
    // Visit
    // https://developers.google.com/google-ads/api/docs/ads/customize-responsive-search-ads?hl=en#rules_and_limitations
    // for details.
    //
    // Specify the customizer attribute name here or the default specified below will be used.
    @Parameter(names = ArgumentNames.CUSTOMIZER_ATTRIBUTE_NAME)
    private String customizerAttributeName = "Price";
  }

  public static void main(String[] args) {
    AddResponsiveSearchAdWithAdCustomizerParams params =
        new AddResponsiveSearchAdWithAdCustomizerParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
      // Optional: To use a different customizer attribute name from the default ("Price"),
      // uncomment the line below and insert the desired customizer attribute name.
      // params.customizerAttributeName = "INSERT_CUSTOMIZER_ATTRIBUTE_NAME_HERE";
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
      new AddResponsiveSearchAdWithAdCustomizer()
          .runExample(
              googleAdsClient, params.customerId, params.adGroupId, params.customizerAttributeName);
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
   * @param adGroupId the ad group ID.
   * @param customizerAttributeName the customizer attribute name.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long adGroupId,
      String customizerAttributeName) {
    String customizerAttributeResourceName =
        createCustomizerAttribute(googleAdsClient, customerId, customizerAttributeName);
    linkCustomizerAttributeToCustomer(googleAdsClient, customerId, customizerAttributeResourceName);
    createResponsiveSearchAdWithCustomization(
        googleAdsClient, customerId, adGroupId, customizerAttributeName);
  }

  // [START add_responsive_search_ad_with_ad_customizer_1]
  /** Creates a customizer attribute with the specified customizer attribute name. */
  private static String createCustomizerAttribute(
      GoogleAdsClient googleAdsClient, long customerId, String customizerAttributeName) {
    // Creates a customizer attribute with the specified name.
    CustomizerAttribute customizerAttribute =
        CustomizerAttribute.newBuilder()
            .setName(customizerAttributeName)
            // Specifies the type to be 'PRICE' so that we can dynamically customize the part of the
            // ad's description that is a price of a product/service we advertise.
            .setType(CustomizerAttributeType.PRICE)
            .build();
    // Creates a customizer attribute operation for creating a customizer attribute.
    CustomizerAttributeOperation operation =
        CustomizerAttributeOperation.newBuilder().setCreate(customizerAttribute).build();

    try (CustomizerAttributeServiceClient customizerAttributeServiceClient =
        googleAdsClient.getLatestVersion().createCustomizerAttributeServiceClient()) {
      // Issues a mutate request to add the customizer attribute and prints its information.
      MutateCustomizerAttributesResponse response =
          customizerAttributeServiceClient.mutateCustomizerAttributes(
              Long.toString(customerId), ImmutableList.of(operation));
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Added a customizer with resource name '%s'.%n", resourceName);
      return resourceName;
    }
  }
  // [END add_responsive_search_ad_with_ad_customizer_1]

  // [START add_responsive_search_ad_with_ad_customizer_2]
  /**
   * Links the customizer attribute to the customer by providing a value to be used in a responsive
   * search ad that will be created in a later step.
   */
  private static void linkCustomizerAttributeToCustomer(
      GoogleAdsClient googleAdsClient, long customerId, String customizerAttributeResourceName) {
    // Creates a customer customizer with the value to be used in the responsive search ad.
    CustomerCustomizer customerCustomizer =
        CustomerCustomizer.newBuilder()
            .setCustomizerAttribute(customizerAttributeResourceName)
            // Specify '100USD' as a text value. The ad customizer will dynamically replace the
            // placeholder with this value when the ad serves.
            .setValue(
                CustomizerValue.newBuilder()
                    .setType(CustomizerAttributeType.PRICE)
                    .setStringValue("100USD")
                    .build())
            .build();

    // Creates a customer customizer operation.
    CustomerCustomizerOperation operation =
        CustomerCustomizerOperation.newBuilder().setCreate(customerCustomizer).build();

    try (CustomerCustomizerServiceClient customerCustomizerServiceClient =
        googleAdsClient.getLatestVersion().createCustomerCustomizerServiceClient()) {
      // Issues a mutate request to add the customer customizer and prints its information.
      MutateCustomerCustomizersResponse response =
          customerCustomizerServiceClient.mutateCustomerCustomizers(
              Long.toString(customerId), ImmutableList.of(operation));
      System.out.printf(
          "Added a customer customizer with resource name '%s'.%n",
          response.getResults(0).getResourceName());
    }
  }
  // [END add_responsive_search_ad_with_ad_customizer_2]

  // [START add_responsive_search_ad_with_ad_customizer_3]
  /** Creates a responsive search ad that uses the specified customizer attribute. */
  private static void createResponsiveSearchAdWithCustomization(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long adGroupId,
      String customizerAttributeName) {
    List<String> headlines =
        ImmutableList.of("Cruise to Mars", "Best Space Cruise Line", "Experience the Stars");
    List<AdTextAsset> headlineAssets =
        headlines.stream()
            .map(headline -> AdTextAsset.newBuilder().setText(headline).build())
            .collect(Collectors.toList());
    List<String> descriptions =
        ImmutableList.of(
            "Buy your tickets now",
            // Creates this particular description using the ad customizer.
            // Visit
            // https://developers.google.com/google-ads/api/docs/ads/customize-responsive-search-ads#ad_customizers_in_responsive_search_ads
            // for details about the placeholder format.
            // The ad customizer replaces the placeholder with the value we previously
            // created and linked to the customer using CustomerCustomizer.
            String.format("Just {CUSTOMIZER.%s:10USD}", customizerAttributeName));
    List<AdTextAsset> descriptionAssets =
        descriptions.stream()
            .map(description -> AdTextAsset.newBuilder().setText(description).build())
            .collect(Collectors.toList());

    // Creates an ad and sets responsive search ad info.
    Ad ad =
        Ad.newBuilder()
            .setResponsiveSearchAd(
                ResponsiveSearchAdInfo.newBuilder()
                    .addAllHeadlines(headlineAssets)
                    .addAllDescriptions(descriptionAssets)
                    .setPath1("all-inclusive")
                    .setPath2("deals")
                    .build())
            .addAllFinalUrls(ImmutableList.of("http://www.example.com"))
            .build();

    // Creates an ad group ad to hold the above ad.
    AdGroupAd adGroupAd =
        AdGroupAd.newBuilder()
            .setAdGroup(ResourceNames.adGroup(customerId, adGroupId))
            .setStatus(AdGroupAdStatus.PAUSED)
            .setAd(ad)
            .build();

    // Creates an ad group ad operation.
    AdGroupAdOperation operation = AdGroupAdOperation.newBuilder().setCreate(adGroupAd).build();

    try (AdGroupAdServiceClient adGroupAdServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupAdServiceClient()) {
      // Issues a mutate request to add the ad group ad and prints its information.
      MutateAdGroupAdsResponse response =
          adGroupAdServiceClient.mutateAdGroupAds(
              Long.toString(customerId), ImmutableList.of(operation));
      System.out.printf(
          "Created a responsive search ad with resource name '%s'.%n",
          response.getResults(0).getResourceName());
    }
  }
  // [END add_responsive_search_ad_with_ad_customizer_3]
}

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

package com.google.ads.googleads.examples.planning;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v6.common.DeviceInfo;
import com.google.ads.googleads.v6.common.GenderInfo;
import com.google.ads.googleads.v6.enums.DeviceEnum.Device;
import com.google.ads.googleads.v6.enums.GenderTypeEnum.GenderType;
import com.google.ads.googleads.v6.enums.ReachPlanAdLengthEnum.ReachPlanAdLength;
import com.google.ads.googleads.v6.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange;
import com.google.ads.googleads.v6.errors.GoogleAdsError;
import com.google.ads.googleads.v6.errors.GoogleAdsException;
import com.google.ads.googleads.v6.services.CampaignDuration;
import com.google.ads.googleads.v6.services.GenerateProductMixIdeasRequest;
import com.google.ads.googleads.v6.services.GenerateProductMixIdeasResponse;
import com.google.ads.googleads.v6.services.GenerateReachForecastRequest;
import com.google.ads.googleads.v6.services.GenerateReachForecastResponse;
import com.google.ads.googleads.v6.services.ListPlannableLocationsRequest;
import com.google.ads.googleads.v6.services.ListPlannableLocationsResponse;
import com.google.ads.googleads.v6.services.ListPlannableProductsRequest;
import com.google.ads.googleads.v6.services.ListPlannableProductsResponse;
import com.google.ads.googleads.v6.services.PlannableLocation;
import com.google.ads.googleads.v6.services.PlannedProduct;
import com.google.ads.googleads.v6.services.PlannedProductReachForecast;
import com.google.ads.googleads.v6.services.Preferences;
import com.google.ads.googleads.v6.services.ProductAllocation;
import com.google.ads.googleads.v6.services.ProductMetadata;
import com.google.ads.googleads.v6.services.ReachForecast;
import com.google.ads.googleads.v6.services.ReachPlanServiceClient;
import com.google.ads.googleads.v6.services.Targeting;
import com.google.common.base.Joiner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates how to interact with the ReachPlanService to find plannable locations and product
 * codes, build a media plan, and generate a video ads reach forecast.
 */
public class ForecastReach {

  private static class ForecastReachParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    ForecastReachParams params = new ForecastReachParams();

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
      new ForecastReach().runExample(googleAdsClient, params.customerId);
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
   * @param customerId the customer ID for the reach forecast.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    String locationId = "2840"; // US
    String currencyCode = "USD";
    long budgetMicros = 5_000_000L; // $5 USD

    try (ReachPlanServiceClient reachPlanServiceClient =
        googleAdsClient.getLatestVersion().createReachPlanServiceClient()) {
      showPlannableLocations(reachPlanServiceClient);
      showPlannableProducts(reachPlanServiceClient, locationId);
      forecastManualMix(reachPlanServiceClient, customerId, locationId, currencyCode, budgetMicros);
      forecastSuggestedMix(
          reachPlanServiceClient, customerId, locationId, currencyCode, budgetMicros);
    }
  }

  /**
   * Maps friendly names of plannable locations to location IDs usable with ReachPlanServiceClient.
   *
   * @param reachPlanServiceClient instance of Reach Plan Service client.
   */
  private void showPlannableLocations(ReachPlanServiceClient reachPlanServiceClient) {
    ListPlannableLocationsRequest request = ListPlannableLocationsRequest.newBuilder().build();
    ListPlannableLocationsResponse response =
        reachPlanServiceClient.listPlannableLocations(request);

    System.out.println("Plannable Locations:");
    for (PlannableLocation location : response.getPlannableLocationsList()) {
      System.out.printf(
          "Name: %s, ID: %s, ParentCountryId: %s%n",
          location.getName(), location.getId(), location.getParentCountryId());
    }
  }

  /**
   * Lists plannable products for a given location.
   *
   * @param reachPlanServiceClient instance of Reach Plan Service client.
   * @param locationId location ID to plan for. To find a valid location ID, either see
   *     https://developers.google.com/google-ads/api/reference/data/geotargets or call
   *     ReachPlanServiceClient.listPlannableLocations().
   */
  // [START forecast_reach_2]
  private void showPlannableProducts(
      ReachPlanServiceClient reachPlanServiceClient, String locationId) {
    ListPlannableProductsRequest request =
        ListPlannableProductsRequest.newBuilder().setPlannableLocationId(locationId).build();

    ListPlannableProductsResponse response = reachPlanServiceClient.listPlannableProducts(request);

    System.out.printf("Plannable Products for location %s:%n", locationId);
    for (ProductMetadata product : response.getProductMetadataList()) {
      System.out.printf("%s:%n", product.getPlannableProductCode());
      System.out.println("Age Ranges:");
      for (ReachPlanAgeRange ageRange : product.getPlannableTargeting().getAgeRangesList()) {
        System.out.printf("\t- %s%n", ageRange);
      }
      System.out.println("Genders:");
      for (GenderInfo gender : product.getPlannableTargeting().getGendersList()) {
        System.out.printf("\t- %s%n", gender.getType());
      }
      System.out.println("Devices:");
      for (DeviceInfo device : product.getPlannableTargeting().getDevicesList()) {
        System.out.printf("\t- %s%n", device.getType());
      }
    }
  }
  // [END forecast_reach_2]

  /**
   * Creates a base request to generate a reach forecast.
   *
   * @param customerId the customer ID for the reach forecast.
   * @param productMix the product mix for the reach forecast.
   * @param locationId location ID to plan for. To find a valid location ID, either see
   *     https://developers.google.com/google-ads/api/reference/data/geotargets or call
   *     ReachPlanServiceClient.ListPlannableLocations.
   * @param currencyCode three-character ISO 4217 currency code.
   * @return populated GenerateReachForecastRequest object.
   */
  private GenerateReachForecastRequest buildReachRequest(
      Long customerId, List<PlannedProduct> productMix, String locationId, String currencyCode) {
    CampaignDuration duration = CampaignDuration.newBuilder().setDurationInDays(28).build();

    List<GenderInfo> genders =
        Arrays.asList(
            GenderInfo.newBuilder().setType(GenderType.FEMALE).build(),
            GenderInfo.newBuilder().setType(GenderType.MALE).build());

    List<DeviceInfo> devices =
        Arrays.asList(
            DeviceInfo.newBuilder().setType(Device.DESKTOP).build(),
            DeviceInfo.newBuilder().setType(Device.MOBILE).build(),
            DeviceInfo.newBuilder().setType(Device.TABLET).build());

    Targeting targeting =
        Targeting.newBuilder()
            .setPlannableLocationId(locationId)
            .setAgeRange(ReachPlanAgeRange.AGE_RANGE_18_65_UP)
            .addAllGenders(genders)
            .addAllDevices(devices)
            .build();

    // See the docs for defaults and valid ranges:
    // https://developers.google.com/google-ads/api/reference/rpc/latest/GenerateReachForecastRequest
    return GenerateReachForecastRequest.newBuilder()
        .setCustomerId(Long.toString(customerId))
        .setCurrencyCode(currencyCode)
        .setCampaignDuration(duration)
        .setTargeting(targeting)
        .setMinEffectiveFrequency(1)
        .addAllPlannedProducts(productMix)
        .build();
  }

  /**
   * Pulls and prints the reach curve for the given request.
   *
   * @param reachPlanServiceClient instance of Reach Plan Service client.
   * @param request an already-populated reach curve request.
   */
  // [START forecast_reach]
  private void getReachCurve(
      ReachPlanServiceClient reachPlanServiceClient, GenerateReachForecastRequest request) {
    GenerateReachForecastResponse response = reachPlanServiceClient.generateReachForecast(request);
    System.out.println("Reach curve output:");
    System.out.println(
        "Currency, Cost Micros, On-Target Reach, On-Target Imprs, Total Reach, Total Imprs,"
            + " Products");
    for (ReachForecast point : response.getReachCurve().getReachForecastsList()) {
      System.out.printf(
          "%s, \"",
          Joiner.on(", ")
              .join(
                  request.getCurrencyCode(),
                  String.valueOf(point.getCostMicros()),
                  String.valueOf(point.getForecast().getOnTargetReach()),
                  String.valueOf(point.getForecast().getOnTargetImpressions()),
                  String.valueOf(point.getForecast().getTotalReach()),
                  String.valueOf(point.getForecast().getTotalImpressions())));
      for (PlannedProductReachForecast product : point.getPlannedProductReachForecastsList()) {
        System.out.printf("[Product: %s, ", product.getPlannableProductCode());
        System.out.printf("Budget Micros: %s]", product.getCostMicros());
      }
      System.out.printf("\"%n");
    }
  }
  // [END forecast_reach]

  /**
   * Pulls a forecast for a budget split 15% and 85% between two products.
   *
   * @param reachPlanServiceClient instance of Reach Plan Service client.
   * @param customerId the customer ID for the reach forecast.
   * @param locationId location ID to plan for. To find a valid location ID, either see
   *     https://developers.google.com/google-ads/api/reference/data/geotargets or call
   *     ReachPlanServiceClient.listPlannableLocations().
   * @param currencyCode three-character ISO 4217 currency code.
   * @param budgetMicros budget in currency to plan for.
   */
  // [START forecast_reach_3]
  private void forecastManualMix(
      ReachPlanServiceClient reachPlanServiceClient,
      long customerId,
      String locationId,
      String currencyCode,
      long budgetMicros) {
    List<PlannedProduct> productMix = new ArrayList<>();

    // Set up a ratio to split the budget between two products.
    double trueviewAllocation = 0.15;
    double bumperAllocation = 1 - trueviewAllocation;

    // See listPlannableProducts on ReachPlanService to retrieve a list
    // of valid PlannableProductCode's for a given location:
    // https://developers.google.com/google-ads/api/reference/rpc/latest/ReachPlanService
    productMix.add(
        PlannedProduct.newBuilder()
            .setPlannableProductCode("TRUEVIEW_IN_STREAM")
            .setBudgetMicros((long) (budgetMicros * bumperAllocation))
            .build());
    productMix.add(
        PlannedProduct.newBuilder()
            .setPlannableProductCode("BUMPER")
            .setBudgetMicros((long) (budgetMicros * bumperAllocation))
            .build());

    GenerateReachForecastRequest request =
        buildReachRequest(customerId, productMix, locationId, currencyCode);

    getReachCurve(reachPlanServiceClient, request);
  }
  // [END forecast_reach_3]

  /**
   * Pulls a forecast for a product mix suggested based on preferences for whether the ad would have
   * a guaranteed price, play with sound, would be skippable, would include top content, and have a
   * desired ad length.
   *
   * @param reachPlanServiceClient instance of Reach Plan Service client.
   * @param customerId the customer ID for the reach forecast.
   * @param locationId location ID to plan for. To find a valid location ID, either see
   *     https://developers.google.com/adwords/api/docs/appendix/geotargeting or call
   *     ReachPlanServiceClient.ListPlannableLocations.
   * @param currencyCode three-character ISO 4217 currency code.
   * @param budgetMicros budget in currency to plan for.
   */
  // [START forecast_reach_1]
  private void forecastSuggestedMix(
      ReachPlanServiceClient reachPlanServiceClient,
      long customerId,
      String locationId,
      String currencyCode,
      long budgetMicros) {
    // Note: If preferences are too restrictive, then the response will be empty.
    Preferences preferences =
        Preferences.newBuilder()
            .setHasGuaranteedPrice(true)
            .setStartsWithSound(true)
            .setIsSkippable(false)
            .setTopContentOnly(true)
            .setAdLength(ReachPlanAdLength.FIFTEEN_OR_TWENTY_SECONDS)
            .build();

    GenerateProductMixIdeasRequest mixRequest =
        GenerateProductMixIdeasRequest.newBuilder()
            .setBudgetMicros(budgetMicros)
            .setCurrencyCode(currencyCode)
            .setCustomerId(Long.toString(customerId))
            .setPlannableLocationId(locationId)
            .setPreferences(preferences)
            .build();

    GenerateProductMixIdeasResponse mixResponse =
        reachPlanServiceClient.generateProductMixIdeas(mixRequest);

    List<PlannedProduct> productMix = new ArrayList<>();
    for (ProductAllocation product : mixResponse.getProductAllocationList()) {
      productMix.add(
          PlannedProduct.newBuilder()
              .setPlannableProductCode(product.getPlannableProductCode())
              .setBudgetMicros(product.getBudgetMicros())
              .build());
    }

    GenerateReachForecastRequest curveRequest =
        buildReachRequest(customerId, productMix, locationId, currencyCode);

    getReachCurve(reachPlanServiceClient, curveRequest);
  }
  // [END forecast_reach_1]
}

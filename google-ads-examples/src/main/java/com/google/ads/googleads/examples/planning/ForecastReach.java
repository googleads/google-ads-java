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
import com.google.ads.googleads.v4.common.DeviceInfo;
import com.google.ads.googleads.v4.common.GenderInfo;
import com.google.ads.googleads.v4.enums.DeviceEnum.Device;
import com.google.ads.googleads.v4.enums.GenderTypeEnum.GenderType;
import com.google.ads.googleads.v4.enums.ReachPlanAdLengthEnum.ReachPlanAdLength;
import com.google.ads.googleads.v4.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange;
import com.google.ads.googleads.v4.errors.GoogleAdsError;
import com.google.ads.googleads.v4.errors.GoogleAdsException;
import com.google.ads.googleads.v4.services.CampaignDuration;
import com.google.ads.googleads.v4.services.GenerateProductMixIdeasRequest;
import com.google.ads.googleads.v4.services.GenerateProductMixIdeasResponse;
import com.google.ads.googleads.v4.services.GenerateReachForecastRequest;
import com.google.ads.googleads.v4.services.GenerateReachForecastResponse;
import com.google.ads.googleads.v4.services.ListPlannableLocationsRequest;
import com.google.ads.googleads.v4.services.ListPlannableLocationsResponse;
import com.google.ads.googleads.v4.services.ListPlannableProductsRequest;
import com.google.ads.googleads.v4.services.ListPlannableProductsResponse;
import com.google.ads.googleads.v4.services.PlannableLocation;
import com.google.ads.googleads.v4.services.PlannedProduct;
import com.google.ads.googleads.v4.services.Preferences;
import com.google.ads.googleads.v4.services.ProductAllocation;
import com.google.ads.googleads.v4.services.ProductMetadata;
import com.google.ads.googleads.v4.services.ReachForecast;
import com.google.ads.googleads.v4.services.ReachPlanServiceClient;
import com.google.ads.googleads.v4.services.Targeting;
import com.google.protobuf.BoolValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
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
    long budgetMicros = 500_000_000_000L;

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
   * Maps friendly names of plannable locations to location IDs usable with.
   *
   * @param reachPlanServiceClient instance of Reach Plan Service client.
   */
  private void showPlannableLocations(ReachPlanServiceClient reachPlanServiceClient) {
    ListPlannableLocationsRequest request = ListPlannableLocationsRequest.newBuilder().build();
    ListPlannableLocationsResponse response =
        reachPlanServiceClient.listPlannableLocations(request);

    System.out.println("Plannable Locations:");
    System.out.println("Name,\tId,\t,ParentCountryId");
    for (PlannableLocation location : response.getPlannableLocationsList()) {
      System.out.printf(
          "%s,\t%s,%s%n",
          location.getName().getValue(),
          location.getId().getValue(),
          location.getParentCountryId().getValue());
    }
  }

  /**
   * Lists plannable products for a given location.
   *
   * @param reachPlanServiceClient instance of Reach Plan Service client.
   * @param locationId location ID to plan for. To find a valid location ID, either see
   *     https://developers.google.com/adwords/api/docs/appendix/geotargeting or call
   *     ReachPlanServiceClient.listPlannableLocations().
   */
  private void showPlannableProducts(
      ReachPlanServiceClient reachPlanServiceClient, String locationId) {
    ListPlannableProductsRequest request =
        ListPlannableProductsRequest.newBuilder()
            .setPlannableLocationId(StringValue.of(locationId))
            .build();

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

  /**
   * Creates a base request to generate a reach forecast.
   *
   * @param customerId the customer ID for the reach forecast.
   * @param productMix the product mix for the reach forecast.
   * @param locationId location ID to plan for. To find a valid location ID, either see
   *     https://developers.google.com/adwords/api/docs/appendix/geotargeting or call
   *     ReachPlanServiceClient.ListPlannableLocations.
   * @param currencyCode three-character ISO 4217 currency code.
   * @return populated GenerateReachForecastRequest object.
   */
  private GenerateReachForecastRequest buildReachRequest(
      Long customerId, List<PlannedProduct> productMix, String locationId, String currencyCode) {
    CampaignDuration duration =
        CampaignDuration.newBuilder().setDurationInDays(Int32Value.of(28)).build();

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
            .setPlannableLocationId(StringValue.of(locationId))
            .setAgeRange(ReachPlanAgeRange.AGE_RANGE_18_65_UP)
            .addAllGenders(genders)
            .addAllDevices(devices)
            .build();

    // See the docs for defaults and valid ranges:
    // https://developers.google.com/google-ads/api/reference/rpc/Google.Ads.GoogleAds.V4.services#Google.Ads.GoogleAds.V4.services.GenerateReachForecastRequest
    return GenerateReachForecastRequest.newBuilder()
        .setCustomerId(Long.toString(customerId))
        .setCurrencyCode(StringValue.of(currencyCode))
        .setCampaignDuration(duration)
        .setTargeting(targeting)
        .setMinEffectiveFrequency(Int32Value.of(1))
        .addAllPlannedProducts(productMix)
        .build();
  }

  /**
   * Pulls and prints the reach curve for the given request.
   *
   * @param reachPlanServiceClient instance of Reach Plan Service client.
   * @param request an already-populated reach curve request.
   */
  private void pullReachCurve(
      ReachPlanServiceClient reachPlanServiceClient, GenerateReachForecastRequest request) {
    GenerateReachForecastResponse response = reachPlanServiceClient.generateReachForecast(request);
    System.out.println("Reach curve output:");
    System.out.println(
        "Currency,\tCost Micros,\tOn-Target Reach,\tOn-Target Imprs,\tTotal Reach,\tTotal Imprs,"
            + "\tProducts");
    for (ReachForecast point : response.getReachCurve().getReachForecastsList()) {
      System.out.printf("%s,\t", request.getCurrencyCode());
      System.out.printf("%s,\t", point.getCostMicros());
      System.out.printf("%s,\t", point.getForecast().getOnTargetReach());
      System.out.printf("%s,\t", point.getForecast().getOnTargetImpressions());
      System.out.printf("%s,\t", point.getForecast().getTotalReach());
      System.out.printf("%s,\t", point.getForecast().getTotalImpressions());
      System.out.print("\"[");
      for (ProductAllocation product : point.getForecastedProductAllocationsList()) {
        System.out.printf("Product: %s,", product.getPlannableProductCode());
        System.out.printf("Budget Micros: %s", product.getBudgetMicros());
      }
      System.out.print("\"]%n");
    }
  }

  /**
   * Pulls a forecast for a budget split 15% and 85% between two products.
   *
   * @param reachPlanServiceClient instance of Reach Plan Service client.
   * @param customerId the customer ID for the reach forecast.
   * @param locationId location ID to plan for. To find a valid location ID, either see
   *     https://developers.google.com/adwords/api/docs/appendix/geotargeting or call
   *     ReachPlanServiceClient.listPlannableLocations().
   * @param currencyCode three-character ISO 4217 currency code.
   * @param budgetMicros budget in currency to plan for.
   */
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
    // https://developers.google.com/google-ads/api/reference/rpc/Google.Ads.GoogleAds.V4.services#reachplanservice
    productMix.add(
        PlannedProduct.newBuilder()
            .setPlannableProductCode(StringValue.of("TRUEVIEW_IN_STREAM"))
            .setBudgetMicros(Int64Value.of((long) ((double) budgetMicros * bumperAllocation)))
            .build());
    productMix.add(
        PlannedProduct.newBuilder()
            .setPlannableProductCode(StringValue.of("BUMPER"))
            .setBudgetMicros(Int64Value.of((long) ((double) budgetMicros * bumperAllocation)))
            .build());

    GenerateReachForecastRequest request =
        buildReachRequest(customerId, productMix, locationId, currencyCode);

    pullReachCurve(reachPlanServiceClient, request);
  }

  /**
   * Pulls a forecast for a product mix suggested based on preferences for whether the ad would have
   * a guaranteed price, play with sound, would be skippable, would include top content, and a
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
  private void forecastSuggestedMix(
      ReachPlanServiceClient reachPlanServiceClient,
      long customerId,
      String locationId,
      String currencyCode,
      long budgetMicros) {
    // Note: If preferences are too restrictive, then the response will be empty.
    Preferences preferences =
        Preferences.newBuilder()
            .setHasGuaranteedPrice(BoolValue.of(true))
            .setStartsWithSound(BoolValue.of(true))
            .setIsSkippable(BoolValue.of(false))
            .setTopContentOnly(BoolValue.of(true))
            .setAdLength(ReachPlanAdLength.FIFTEEN_OR_TWENTY_SECONDS)
            .build();

    GenerateProductMixIdeasRequest mixRequest =
        GenerateProductMixIdeasRequest.newBuilder()
            .setBudgetMicros(Int64Value.of(budgetMicros))
            .setCurrencyCode(StringValue.of(currencyCode))
            .setCustomerId(Long.toString(customerId))
            .setPlannableLocationId(StringValue.of(locationId))
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

    pullReachCurve(reachPlanServiceClient, curveRequest);
  }
}

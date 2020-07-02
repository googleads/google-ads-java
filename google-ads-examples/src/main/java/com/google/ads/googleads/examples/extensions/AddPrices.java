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
import com.google.ads.googleads.v5.common.AdScheduleInfo;
import com.google.ads.googleads.v5.common.Money;
import com.google.ads.googleads.v5.common.PriceFeedItem;
import com.google.ads.googleads.v5.common.PriceOffer;
import com.google.ads.googleads.v5.enums.DayOfWeekEnum.DayOfWeek;
import com.google.ads.googleads.v5.enums.ExtensionTypeEnum.ExtensionType;
import com.google.ads.googleads.v5.enums.MinuteOfHourEnum.MinuteOfHour;
import com.google.ads.googleads.v5.enums.PriceExtensionPriceQualifierEnum.PriceExtensionPriceQualifier;
import com.google.ads.googleads.v5.enums.PriceExtensionPriceUnitEnum.PriceExtensionPriceUnit;
import com.google.ads.googleads.v5.enums.PriceExtensionTypeEnum.PriceExtensionType;
import com.google.ads.googleads.v5.errors.GoogleAdsError;
import com.google.ads.googleads.v5.errors.GoogleAdsException;
import com.google.ads.googleads.v5.resources.CustomerExtensionSetting;
import com.google.ads.googleads.v5.resources.ExtensionFeedItem;
import com.google.ads.googleads.v5.services.CustomerExtensionSettingOperation;
import com.google.ads.googleads.v5.services.CustomerExtensionSettingServiceClient;
import com.google.ads.googleads.v5.services.ExtensionFeedItemOperation;
import com.google.ads.googleads.v5.services.ExtensionFeedItemServiceClient;
import com.google.ads.googleads.v5.services.MutateCustomerExtensionSettingsResponse;
import com.google.ads.googleads.v5.services.MutateExtensionFeedItemsResponse;
import com.google.ads.googleads.v5.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Adds a price extension and associates it with an account. Campaign targeting is also set using
 * the specified campaign ID. To get campaigns, run GetCampaigns.
 */
public class AddPrices {

  public static class AddPricesParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CUSTOMER_ID)
    private long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID)
    private long campaignId;
  }

  public static void main(String[] args) {
    AddPricesParams params = new AddPricesParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
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
      new AddPrices().runExample(googleAdsClient, params.customerId, params.campaignId);
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
   * @param googleAdsClient the client to use for API calls.
   * @param customerId the customer ID for which to add extensions.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long campaignId) {
    // Creates an extension feed item as price.
    String extensionFeedItemResourceName =
        createExtensionFeedItem(googleAdsClient, customerId, campaignId);

    // Creates a customer extension setting using the previously created extension
    // feed item. This associates the price extension to your account.
    CustomerExtensionSetting customerExtensionSetting =
        CustomerExtensionSetting.newBuilder()
            .setExtensionType(ExtensionType.PRICE)
            .addExtensionFeedItems(StringValue.of(extensionFeedItemResourceName))
            .build();

    // Creates an operation to add the extension setting.
    CustomerExtensionSettingOperation operation =
        CustomerExtensionSettingOperation.newBuilder().setCreate(customerExtensionSetting).build();

    // Issues a mutate request to add the customer extension setting and prints its information.
    try (CustomerExtensionSettingServiceClient client =
        googleAdsClient.getLatestVersion().createCustomerExtensionSettingServiceClient()) {
      MutateCustomerExtensionSettingsResponse response =
          client.mutateCustomerExtensionSettings(
              String.valueOf(customerId), ImmutableList.of(operation));
      System.out.printf(
          "Created customer extension setting with resource name: %s",
          response.getResults(0).getResourceName());
    }
  }

  /**
   * Creates an extension feed item for price extension.
   *
   * @param googleAdsClient the client to use for API calls.
   * @param customerId the customer ID for which to add extensions.
   * @return the resource name of the newly created extension feed item.
   */
  private String createExtensionFeedItem(
      GoogleAdsClient googleAdsClient, long customerId, long campaignId) {
    // Creates the price extension feed item.
    PriceFeedItem priceFeedItem =
        PriceFeedItem.newBuilder()
            .setType(PriceExtensionType.SERVICES)
            // Optional: sets a qualifier text to show with the price extension.
            .setPriceQualifier(PriceExtensionPriceQualifier.FROM)
            .setTrackingUrlTemplate(StringValue.of("http://tracker.example.com/?u={lpurl}"))
            .setLanguageCode(StringValue.of("en"))
            // To create a price extension, at least three price offerings are needed.
            .addPriceOfferings(
                createPriceOffer(
                    "Scrubs",
                    "Body Scrub, Salt Scrub",
                    60000000, // 60 USD
                    "USD",
                    PriceExtensionPriceUnit.PER_HOUR,
                    "http://www.example.com/scrubs",
                    "http://m.example.com/scrubs"))
            .addPriceOfferings(
                createPriceOffer(
                    "Hair Cuts",
                    "Once a month",
                    75000000, // 75 USD
                    "USD",
                    PriceExtensionPriceUnit.PER_MONTH,
                    "http://www.example.com/haircuts",
                    "http://m.example.com/haircuts"))
            .addPriceOfferings(
                createPriceOffer(
                    "Skin Care Package",
                    "Four times a month",
                    250000000, // 250 USD
                    "USD",
                    PriceExtensionPriceUnit.PER_MONTH,
                    "http://www.example.com/skincarepackage",
                    null))
            .build();

    // Creates an extension feed item from the price feed item.
    ExtensionFeedItem extensionFeedItem =
        ExtensionFeedItem.newBuilder()
            .setExtensionType(ExtensionType.PRICE)
            .setPriceFeedItem(priceFeedItem)
            .setTargetedCampaign(StringValue.of(ResourceNames.campaign(customerId, campaignId)))
            .addAdSchedules(
                createAdSchedule(DayOfWeek.SUNDAY, 10, MinuteOfHour.ZERO, 18, MinuteOfHour.ZERO))
            .addAdSchedules(
                createAdSchedule(DayOfWeek.SATURDAY, 10, MinuteOfHour.ZERO, 22, MinuteOfHour.ZERO))
            .build();

    // Creates an operation to add the feed item.
    ExtensionFeedItemOperation operation =
        ExtensionFeedItemOperation.newBuilder().setCreate(extensionFeedItem).build();

    // Issues a mutate request to add the extension feed item and prints its information.
    try (ExtensionFeedItemServiceClient client =
        googleAdsClient.getLatestVersion().createExtensionFeedItemServiceClient()) {
      MutateExtensionFeedItemsResponse response =
          client.mutateExtensionFeedItems(String.valueOf(customerId), ImmutableList.of(operation));
      String resourceName = response.getResultsList().get(0).getResourceName();
      System.out.printf("Created extension feed item with resource name: %s", resourceName);
      return resourceName;
    }
  }

  /**
   * Creates a new ad schedule info with the specified parameters.
   *
   * @param dayOfWeek the day of week for which the schedule is enabled.
   * @param startHour the hour at which the schedule takes effect.
   * @param startMinute the minute past the hour at which the schedule takes effect.
   * @param endHour the hour at which the schedule stops running.
   * @param endMinute the minute past the hour at which the schedule stops running.
   * @return a newly created ad schedule object.
   */
  private AdScheduleInfo createAdSchedule(
      DayOfWeek dayOfWeek,
      int startHour,
      MinuteOfHour startMinute,
      int endHour,
      MinuteOfHour endMinute) {
    return AdScheduleInfo.newBuilder()
        .setDayOfWeek(dayOfWeek)
        .setStartHour(startHour)
        .setStartMinute(startMinute)
        .setEndHour(endHour)
        .setEndMinute(endMinute)
        .build();
  }

  /**
   * Creates a new price offer with the specified parameters.
   *
   * @param header the headline for the price extension.
   * @param description a detailed description line that may show on the price extension.
   * @param priceInMicros the price to display, measured in micros (e.g. 1_000_000 micros = 1 USD).
   * @param currencyCode the currency code representing the unit of currency.
   * @param unit optionally set a unit describing the quantity obtained for the price.
   * @param finalUrl the final URL to which a click on the price extension drives traffic.
   * @param finalMobileUrl the final URL to which mobile clicks on the price extension drives
   *     traffic.
   * @return a newly created price offer object.
   */
  private PriceOffer createPriceOffer(
      String header,
      String description,
      int priceInMicros,
      String currencyCode,
      PriceExtensionPriceUnit unit,
      String finalUrl,
      String finalMobileUrl) {
    PriceOffer.Builder priceBuilder =
        PriceOffer.newBuilder()
            .setHeader(StringValue.of(header))
            .setDescription(StringValue.of(description))
            .addFinalUrls(StringValue.of(finalUrl))
            .setPrice(
                Money.newBuilder()
                    .setAmountMicros(Int64Value.of(priceInMicros))
                    .setCurrencyCode(StringValue.of(currencyCode)))
            .setUnit(unit);

    // Optional: Sets the final mobile URLs.
    if (finalMobileUrl != null) {
      priceBuilder.addFinalMobileUrls(StringValue.of(finalMobileUrl));
    }
    return priceBuilder.build();
  }
}

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

package com.google.ads.googleads.examples.extensions;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v2.common.HotelCalloutFeedItem;
import com.google.ads.googleads.v2.enums.ExtensionTypeEnum.ExtensionType;
import com.google.ads.googleads.v2.errors.GoogleAdsError;
import com.google.ads.googleads.v2.errors.GoogleAdsException;
import com.google.ads.googleads.v2.resources.AdGroupExtensionSetting;
import com.google.ads.googleads.v2.resources.CampaignExtensionSetting;
import com.google.ads.googleads.v2.resources.CustomerExtensionSetting;
import com.google.ads.googleads.v2.resources.ExtensionFeedItem;
import com.google.ads.googleads.v2.services.AdGroupExtensionSettingOperation;
import com.google.ads.googleads.v2.services.AdGroupExtensionSettingServiceClient;
import com.google.ads.googleads.v2.services.CampaignExtensionSettingOperation;
import com.google.ads.googleads.v2.services.CampaignExtensionSettingServiceClient;
import com.google.ads.googleads.v2.services.CustomerExtensionSettingOperation;
import com.google.ads.googleads.v2.services.CustomerExtensionSettingServiceClient;
import com.google.ads.googleads.v2.services.ExtensionFeedItemOperation;
import com.google.ads.googleads.v2.services.ExtensionFeedItemServiceClient;
import com.google.ads.googleads.v2.services.MutateAdGroupExtensionSettingsResponse;
import com.google.ads.googleads.v2.services.MutateCampaignExtensionSettingsResponse;
import com.google.ads.googleads.v2.services.MutateCustomerExtensionSettingsResponse;
import com.google.ads.googleads.v2.services.MutateExtensionFeedItemsResponse;
import com.google.ads.googleads.v2.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Adds a hotel callout extension to a specific account, campaign within the account, and adgroup
 * within the campaign.
 */
public class AddHotelCalloutExtension {

  private static class AddHotelCalloutParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;

    @Parameter(names = ArgumentNames.CALLOUT_TEXT, required = true)
    private String calloutText;

    // To see supported languages visit
    // https://developers.google.com/hotels/hotel-ads/api-reference/language-codes.
    @Parameter(names = ArgumentNames.LANGUAGE_CODE, required = true)
    private String languageCode;
  }

  public static void main(String[] args) {
    AddHotelCalloutParams params = new AddHotelCalloutParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
      params.calloutText = "INSERT_CALLOUT_TEXT_HERE";
      params.languageCode = "INSERT_LANGUAGE_CODE_HERE";
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
      new AddHotelCalloutExtension()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.campaignId,
              params.adGroupId,
              params.calloutText,
              params.languageCode);
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

  /** Runs the example. */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long campaignId,
      long adGroupId,
      String calloutText,
      String languageCode) {
    // Creates the extension feed item.
    String extensionFeedItemResourceName =
        addExtensionFeedItem(googleAdsClient, customerId, calloutText, languageCode);

    // Adds the extension feed item to the campaign.
    addExtensionToCampaign(googleAdsClient, customerId, campaignId, extensionFeedItemResourceName);

    // Adds the extension feed item to the adgroup.
    addExtensionToAdGroup(googleAdsClient, customerId, adGroupId, extensionFeedItemResourceName);

    // Adds the extension feed item to the account.
    addExtensionToAccount(googleAdsClient, customerId, extensionFeedItemResourceName);
  }

  /** Creates a new extension feed item for the callout. */
  private String addExtensionFeedItem(
      GoogleAdsClient googleAdsClient, long customerId, String calloutText, String languageCode) {
    // Creates the callout with text and language of choice.
    HotelCalloutFeedItem hotelCallout =
        HotelCalloutFeedItem.newBuilder()
            .setText(StringValue.of(calloutText))
            .setLanguageCode(StringValue.of(languageCode))
            .build();

    // Attaches the callout to a feed item.
    ExtensionFeedItem feedItem =
        ExtensionFeedItem.newBuilder().setHotelCalloutFeedItem(hotelCallout).build();

    // Creates the feed item operation.
    ExtensionFeedItemOperation feedItemOperation =
        ExtensionFeedItemOperation.newBuilder().setCreate(feedItem).build();

    // Issues the create request to create the feed item.
    try (ExtensionFeedItemServiceClient extensionFeedItemServiceClient =
        googleAdsClient.getLatestVersion().createExtensionFeedItemServiceClient()) {
      MutateExtensionFeedItemsResponse response =
          extensionFeedItemServiceClient.mutateExtensionFeedItems(
              Long.toString(customerId), ImmutableList.of(feedItemOperation));
      String extensionFeedItemResourceName = response.getResults(0).getResourceName();
      System.out.printf(
          "Added a extension feed item with resource name: '%s'.%n", extensionFeedItemResourceName);
      return extensionFeedItemResourceName;
    }
  }

  /** Adds the extension feed item to the Campaign. */
  private String addExtensionToCampaign(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long campaignId,
      String extensionFeedItemResourceName) {
    String campaignResourceName = ResourceNames.campaign(customerId, campaignId);

    // Creates the campaign extension setting, sets it to HOTEL_CALLOUT, and attaches the feed item.
    CampaignExtensionSetting campaignExtensionSetting =
        CampaignExtensionSetting.newBuilder()
            .setExtensionType(ExtensionType.HOTEL_CALLOUT)
            .setCampaign(StringValue.of(campaignResourceName))
            .addExtensionFeedItems(StringValue.of(extensionFeedItemResourceName))
            .build();

    // Creates the campaign extension setting operation.
    CampaignExtensionSettingOperation op =
        CampaignExtensionSettingOperation.newBuilder().setCreate(campaignExtensionSetting).build();

    // Issues the create request to add the callout.
    try (CampaignExtensionSettingServiceClient campaignExtensionServiceClient =
        googleAdsClient.getLatestVersion().createCampaignExtensionSettingServiceClient()) {
      MutateCampaignExtensionSettingsResponse response =
          campaignExtensionServiceClient.mutateCampaignExtensionSettings(
              Long.toString(customerId), ImmutableList.of(op));

      String campaignExtensionResourceName = response.getResults(0).getResourceName();
      System.out.printf(
          "Added a campaign extension with resource name: '%s'.%n", campaignExtensionResourceName);
      return campaignExtensionResourceName;
    }
  }

  /** Adds the extension feed item to the adgroup. */
  private String addExtensionToAdGroup(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long adGroupId,
      String extensionFeedItemResourceName) {
    String adGroupResourceName = ResourceNames.adGroup(customerId, adGroupId);

    // Creates the adgroup extension setting, sets it to HOTEL_CALLOUT, and attaches the feed item.
    AdGroupExtensionSetting adGroupExtensionSetting =
        AdGroupExtensionSetting.newBuilder()
            .setExtensionType(ExtensionType.HOTEL_CALLOUT)
            .setAdGroup(StringValue.of(adGroupResourceName))
            .addExtensionFeedItems(StringValue.of(extensionFeedItemResourceName))
            .build();

    // Creates the adgroup extension setting operation.
    AdGroupExtensionSettingOperation op =
        AdGroupExtensionSettingOperation.newBuilder().setCreate(adGroupExtensionSetting).build();

    // Issues the create request to add the callout.
    try (AdGroupExtensionSettingServiceClient adGroupExtensionServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupExtensionSettingServiceClient()) {
      MutateAdGroupExtensionSettingsResponse response =
          adGroupExtensionServiceClient.mutateAdGroupExtensionSettings(
              Long.toString(customerId), ImmutableList.of(op));

      String adGroupExtensionResourceName = response.getResults(0).getResourceName();
      System.out.printf(
          "Added a adgroup extension with resource name: '%s'.%n", adGroupExtensionResourceName);
      return adGroupExtensionResourceName;
    }
  }

  /** Adds extension feed item to the account. */
  private String addExtensionToAccount(
      GoogleAdsClient googleAdsClient, long customerId, String extensionFeedItemResourceName) {
    // Creates the customer extension setting, sets it to HOTEL_CALLOUT, and attaches the feed item.
    CustomerExtensionSetting customerExtensionSetting =
        CustomerExtensionSetting.newBuilder()
            .setExtensionType(ExtensionType.HOTEL_CALLOUT)
            .addExtensionFeedItems(StringValue.of(extensionFeedItemResourceName))
            .build();

    // Creates the customer extension setting operation.
    CustomerExtensionSettingOperation op =
        CustomerExtensionSettingOperation.newBuilder().setCreate(customerExtensionSetting).build();

    // Issues the create request to add the callout.
    try (CustomerExtensionSettingServiceClient customerExtensionServiceClient =
        googleAdsClient.getLatestVersion().createCustomerExtensionSettingServiceClient()) {
      MutateCustomerExtensionSettingsResponse response =
          customerExtensionServiceClient.mutateCustomerExtensionSettings(
              Long.toString(customerId), ImmutableList.of(op));

      String customerExtensionResourceName = response.getResults(0).getResourceName();
      System.out.printf(
          "Added a account extension with resource name: '%s'.%n", customerExtensionResourceName);
      return customerExtensionResourceName;
    }
  }
}

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
import com.google.ads.googleads.v12.common.AdScheduleInfo;
import com.google.ads.googleads.v12.common.KeywordInfo;
import com.google.ads.googleads.v12.common.SitelinkFeedItem;
import com.google.ads.googleads.v12.enums.DayOfWeekEnum.DayOfWeek;
import com.google.ads.googleads.v12.enums.ExtensionTypeEnum.ExtensionType;
import com.google.ads.googleads.v12.enums.FeedItemTargetDeviceEnum.FeedItemTargetDevice;
import com.google.ads.googleads.v12.enums.KeywordMatchTypeEnum.KeywordMatchType;
import com.google.ads.googleads.v12.enums.MinuteOfHourEnum.MinuteOfHour;
import com.google.ads.googleads.v12.errors.GoogleAdsError;
import com.google.ads.googleads.v12.errors.GoogleAdsException;
import com.google.ads.googleads.v12.resources.CampaignExtensionSetting;
import com.google.ads.googleads.v12.resources.ExtensionFeedItem;
import com.google.ads.googleads.v12.services.CampaignExtensionSettingOperation;
import com.google.ads.googleads.v12.services.CampaignExtensionSettingServiceClient;
import com.google.ads.googleads.v12.services.ExtensionFeedItemOperation;
import com.google.ads.googleads.v12.services.ExtensionFeedItemServiceClient;
import com.google.ads.googleads.v12.services.MutateCampaignExtensionSettingResult;
import com.google.ads.googleads.v12.services.MutateCampaignExtensionSettingsResponse;
import com.google.ads.googleads.v12.services.MutateExtensionFeedItemResult;
import com.google.ads.googleads.v12.services.MutateExtensionFeedItemsResponse;
import com.google.ads.googleads.v12.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/** Adds sitelinks to a campaign. To create a campaign, run AddCampaigns.java. */
// DEPRECATION WARNING!
// THIS USAGE IS DEPRECATED AND WILL BE REMOVED IN AN UPCOMING API VERSION
// All extensions should migrate to Assets. See AddSitelinksUsingAssets.java
@Deprecated
public class AddSitelinks {

  private static class AddSitelinksParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;
  }

  public static void main(String[] args) throws IOException {
    AddSitelinksParams params = new AddSitelinksParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
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
      new AddSitelinks().runExample(googleAdsClient, params.customerId, params.campaignId);
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
   * @param campaignId the campaign ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START add_sitelinks_1]
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long campaignId) {
    String campaignResourceName = ResourceNames.campaign(customerId, campaignId);

    List<String> extensionFeedItems =
        createExtensionFeedItems(googleAdsClient, customerId, campaignResourceName);

    // Creates a CampaignExtensionSetting.
    CampaignExtensionSetting campaignExtensionSetting =
        CampaignExtensionSetting.newBuilder()
            .setCampaign(campaignResourceName)
            .setExtensionType(ExtensionType.SITELINK)
            .addAllExtensionFeedItems(extensionFeedItems)
            .build();

    // Creates the operation.
    CampaignExtensionSettingOperation operation =
        CampaignExtensionSettingOperation.newBuilder().setCreate(campaignExtensionSetting).build();

    // Creates the CampaignExtensionSettingServiceClient.
    try (CampaignExtensionSettingServiceClient campaignExtensionSettingServiceClient =
        googleAdsClient.getLatestVersion().createCampaignExtensionSettingServiceClient()) {
      // Adds the CampaignExtensionSettingServiceClient.
      MutateCampaignExtensionSettingsResponse response =
          campaignExtensionSettingServiceClient.mutateCampaignExtensionSettings(
              Long.toString(customerId), ImmutableList.of(operation));
      for (MutateCampaignExtensionSettingResult result : response.getResultsList()) {
        System.out.printf(
            "Created CampaignExtensionSetting with resource name '%s'.%n",
            result.getResourceName());
      }
    }
  }
  // [END add_sitelinks_1]

  /**
   * Creates a list of ExtensionFeedItems.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignResourceName the resource name of the campaign to target.
   */
  // [START add_sitelinks]
  private static List<String> createExtensionFeedItems(
      GoogleAdsClient googleAdsClient, long customerId, String campaignResourceName) {
    SitelinkFeedItem sitelinkFeedItem1 =
        createSitelinkFeedItem("Store Hours", "http://www.example.com/storehours");

    // Creates an ExtensionFeedItem from the SitelinkFeedItem.
    ExtensionFeedItem extensionFeedItem1 =
        ExtensionFeedItem.newBuilder()
            .setExtensionType(ExtensionType.SITELINK)
            .setSitelinkFeedItem(sitelinkFeedItem1)
            .setTargetedCampaign(campaignResourceName)
            .build();

    List<ExtensionFeedItemOperation> operations = new ArrayList<>();
    // Creates an ExtensionFeedItemOperation and adds it to the operations List.
    operations.add(ExtensionFeedItemOperation.newBuilder().setCreate(extensionFeedItem1).build());

    SitelinkFeedItem sitelinkFeedItem2 =
        createSitelinkFeedItem("Thanksgiving Specials", "http://www.example.com/thanksgiving");

    DateTime startTime = new DateTime(DateTime.now().getYear(), 11, 20, 0, 0, 0);
    if (startTime.isBeforeNow()) {
      // Move the startTime to next year if the current date is past November 20th.
      startTime = startTime.plusYears(1);
    }
    // Converts to a string in the required format.
    String startTimeString = startTime.toString("yyyy-MM-dd hh:mm:ss");

    // Use the same year as startTime when creating endTime.
    DateTime endTime = new DateTime(startTime.getYear(), 11, 27, 23, 59, 59);
    String endTimeString = endTime.toString("yyyy-MM-dd hh:mm:ss");

    // Targets this sitelink for United States only.
    // A list of country codes can be referenced here:
    // https://developers.google.com/google-ads/api/reference/data/geotargets
    String unitedStates = ResourceNames.geoTargetConstant(2840);

    ExtensionFeedItem extensionFeedItem2 =
        ExtensionFeedItem.newBuilder()
            .setExtensionType(ExtensionType.SITELINK)
            .setSitelinkFeedItem(sitelinkFeedItem2)
            .setTargetedCampaign(campaignResourceName)
            .setStartDateTime(startTimeString)
            .setEndDateTime(endTimeString)
            .setTargetedGeoTargetConstant(unitedStates)
            .build();

    operations.add(ExtensionFeedItemOperation.newBuilder().setCreate(extensionFeedItem2).build());

    SitelinkFeedItem sitelinkFeedItem3 =
        createSitelinkFeedItem("Wifi available", "http://www.example.com/mobile/wifi");

    ExtensionFeedItem extensionFeedItem3 =
        ExtensionFeedItem.newBuilder()
            .setExtensionType(ExtensionType.SITELINK)
            .setSitelinkFeedItem(sitelinkFeedItem3)
            .setTargetedCampaign(campaignResourceName)
            .setDevice(FeedItemTargetDevice.MOBILE)
            .setTargetedKeyword(
                KeywordInfo.newBuilder()
                    .setText("free wifi")
                    .setMatchType(KeywordMatchType.BROAD)
                    .build())
            .build();

    operations.add(ExtensionFeedItemOperation.newBuilder().setCreate(extensionFeedItem3).build());

    SitelinkFeedItem sitelinkFeedItem4 =
        createSitelinkFeedItem("Happy hours", "http://www.example.com/happyhours");

    ExtensionFeedItem extensionFeedItem4 =
        ExtensionFeedItem.newBuilder()
            .setExtensionType(ExtensionType.SITELINK)
            .setSitelinkFeedItem(sitelinkFeedItem4)
            .setTargetedCampaign(campaignResourceName)
            .addAdSchedules(
                createAdScheduleInfo(
                    DayOfWeek.MONDAY, 18, MinuteOfHour.ZERO, 21, MinuteOfHour.ZERO))
            .addAdSchedules(
                createAdScheduleInfo(
                    DayOfWeek.TUESDAY, 18, MinuteOfHour.ZERO, 21, MinuteOfHour.ZERO))
            .addAdSchedules(
                createAdScheduleInfo(
                    DayOfWeek.WEDNESDAY, 18, MinuteOfHour.ZERO, 21, MinuteOfHour.ZERO))
            .addAdSchedules(
                createAdScheduleInfo(
                    DayOfWeek.THURSDAY, 18, MinuteOfHour.ZERO, 21, MinuteOfHour.ZERO))
            .addAdSchedules(
                createAdScheduleInfo(
                    DayOfWeek.FRIDAY, 18, MinuteOfHour.ZERO, 21, MinuteOfHour.ZERO))
            .build();

    operations.add(ExtensionFeedItemOperation.newBuilder().setCreate(extensionFeedItem4).build());

    // Creates the ExtensionFeedItemServiceClient.
    try (ExtensionFeedItemServiceClient extensionFeedItemServiceClient =
        googleAdsClient.getLatestVersion().createExtensionFeedItemServiceClient()) {
      // Adds the ExtensionFeedItem.
      MutateExtensionFeedItemsResponse response =
          extensionFeedItemServiceClient.mutateExtensionFeedItems(
              Long.toString(customerId), operations);
      System.out.printf("Added %d ExtensionFeedItems:%n", response.getResultsCount());
      List<String> resourceNames = new ArrayList<>();
      for (MutateExtensionFeedItemResult result : response.getResultsList()) {
        System.out.printf(
            "Created ExtensionFeedItems with resource name '%s'.%n", result.getResourceName());
        resourceNames.add(result.getResourceName());
      }
      return resourceNames;
    }
  }
  // [END add_sitelinks]

  /**
   * Creates a new SitelinkFeedItem with the specified attributes.
   *
   * @param sitelinkText the text of the sitelink feed item.
   * @param sitelinkUrl the URL of the sitelink feed item.
   */
  private static SitelinkFeedItem createSitelinkFeedItem(String sitelinkText, String sitelinkUrl) {
    return SitelinkFeedItem.newBuilder()
        .setLinkText(sitelinkText)
        .addFinalUrls(sitelinkUrl)
        .build();
  }

  /**
   * Creates a new AdScheduleInfo with the specified attributes.
   *
   * @param day day of the week of the AdScheduleInfo.
   * @param startHour the starting hour of the AdScheduleInfo.
   * @param startMinute the starting minute of the AdScheduleInfo.
   * @param endHour the ending hour of the AdScheduleInfo.
   * @param endMinute ending minute of the AdScheduleInfo.
   */
  private static AdScheduleInfo createAdScheduleInfo(
      DayOfWeek day, int startHour, MinuteOfHour startMinute, int endHour, MinuteOfHour endMinute) {
    return AdScheduleInfo.newBuilder()
        .setDayOfWeek(day)
        .setStartHour(startHour)
        .setStartMinute(startMinute)
        .setEndHour(endHour)
        .setEndMinute(endMinute)
        .build();
  }
}

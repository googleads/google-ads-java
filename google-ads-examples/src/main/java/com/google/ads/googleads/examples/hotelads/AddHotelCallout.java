// Copyright 2018 Google LLC
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

package com.google.ads.googleads.examples.hotelads;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v2.common.HotelCalloutFeedItem;
import com.google.ads.googleads.v2.enums.ExtensionTypeEnum.ExtensionType;
import com.google.ads.googleads.v2.errors.GoogleAdsError;
import com.google.ads.googleads.v2.errors.GoogleAdsException;
import com.google.ads.googleads.v2.resources.CampaignExtensionSetting;
import com.google.ads.googleads.v2.resources.ExtensionFeedItem;
import com.google.ads.googleads.v2.services.CampaignExtensionSettingOperation;
import com.google.ads.googleads.v2.services.CampaignExtensionSettingServiceClient;
import com.google.ads.googleads.v2.services.ExtensionFeedItemOperation;
import com.google.ads.googleads.v2.services.ExtensionFeedItemServiceClient;
import com.google.ads.googleads.v2.services.MutateCampaignExtensionSettingsResponse;
import com.google.ads.googleads.v2.services.MutateExtensionFeedItemsResponse;
import com.google.ads.googleads.v2.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.StringValue;

/**
 * Adds a hotel callout to a specific campaign
 */

 public class AddHotelCallout {

    private static class AddHotelCalloutParams extends CodeSampleParams {

        public static final String CALLOUT_TEXT = "--calloutText";
        public static final String LANGUAGE_CODE = "--languageCode";

        @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
        private Long customerId;

        @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
        private Long campaignId;

        @Parameter(names = CALLOUT_TEXT, required = true)
        private String calloutText;

        // IETF BCP 47 compliant language code
        @Parameter(names = LANGUAGE_CODE, required = true)
        private String languageCode;

    }

    public static void main(String[] args){
        AddHotelCalloutParams params = new AddHotelCalloutParams();
        if (!params.parseArguments(args)){

            // Either pass the required parameters for this example on the command line, or insert them
            // into the code here. See the parameter class definition above for descriptions.
            params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
            params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
            params.calloutText = "INSERT_CAMPAIGN_TEXT_HERE";
            params.languageCode = "INSERT_LANGUAGE_CODE_HERE";
        }

        GoogleAdsClient googleAdsClient;
        try {
            googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
        } catch (FileNotFoundException fnfe) {
            System.err.printf(
                "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", 
                fnfe
            );
            return;
        } catch (IOException ioe) {
            System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
            return;
        }

        try {
            new AddHotelCallout()
                .runExample(
                    googleAdsClient,
                    params.customerId,
                    params.campaignId,
                    params.calloutText,
                    params.languageCode
                );
        } catch (GoogleAdsException gae) {
            // GoogleAdsException is the base class for most exceptions thrown by an API request.
            // Instances of this exception have a message and a GoogleAdsFailure that contains a
            // collection of GoogleAdsErrors that indicate the underlying causes of the
            // GoogleAdsException.
            System.err.printf(
                "Request ID %s failed due to GoogleAdsException. Underlying errors:%n",
                gae.getRequestId()
            );
            int i = 0;
            for (GoogleAdsError googleAdsError : gae.getGoogleAdsFailure().getErrorsList()){
                System.err.printf("  Error %d: %s%n", i++, googleAdsError);
            }
        }
    }

       /**
        * Runs the example.
        *
        * @param googleAdsClient the Google Ads API client.
        * @param customerId the client customer ID.
        * @param campaignId the campaign ID.
        * @param calloutText the text for the callout.
        * @param languageCode the language code for the callout (IETF BCP 47 compliant).
        * @throws GoogleAdsException if an API request failed with one or more service errors.
        */
        private void runExample(
            GoogleAdsClient googleAdsClient, 
            long customerId, 
            long campaignId,
            String calloutText,
            String languageCode) {

            // Creates the extension feed item.
            String extensionFeedItemResourceName = addExtensionFeedItem(googleAdsClient, customerId, calloutText, languageCode);

            // Adds the extension feed item to the campaign.
            addExtensionToCampaign(googleAdsClient, customerId, campaignId, extensionFeedItemResourceName);
        }

        /**
         * Creates a new extension feed item for the callout.
         *
         * @param googleAdsClient the Google Ads API client.
         * @param customerId the client customer ID.
         * @param campaignID the campaign ID.
         * @param calloutText the text for the callout.
         * @param languageCode the language code for the callout (IETF BCP 47 compliant).
         * @return resource name of the newly created extension feed item.
         * @throws GoogleAdsException if an API request failed with one or more service errors.
         */
        private String addExtensionFeedItem(
            GoogleAdsClient googleAdsClient, 
            long customerId, 
            String calloutText, 
            String languageCode) {
                // Create the callout with text and language of choice
                HotelCalloutFeedItem hotelCallout = HotelCalloutFeedItem.newBuilder()
                    .setText(StringValue.of(calloutText))
                    .setLanguageCode(StringValue.of(languageCode))
                    .build();
                
                // Attach callout to a FeedItem
                ExtensionFeedItem feedItem = ExtensionFeedItem.newBuilder()
                    .setHotelCalloutFeedItem(hotelCallout)
                    .build();
                
                // Create the feed item operation
                ExtensionFeedItemOperation feedItemOperation = ExtensionFeedItemOperation.newBuilder()
                    .setCreate(feedItem)
                    .build();
                
                // Issues the create request to create the feed item
                try (ExtensionFeedItemServiceClient extensionFeedItemServiceClient = 
                        googleAdsClient.getLatestVersion().createExtensionFeedItemServiceClient()) {
                            MutateExtensionFeedItemsResponse response = extensionFeedItemServiceClient
                                .mutateExtensionFeedItems(Long.toString(customerId), ImmutableList.of(feedItemOperation));
                            String extensionFeedItemResourceName = response.getResults(0).getResourceName();
                            System.out.printf(
                                "Added an extension feed item with resource name: '%s'%n", 
                                extensionFeedItemResourceName
                            );
                            return extensionFeedItemResourceName;
                }
        }

        /**
         * Adds extension feed item to the Campaign.
         *
         * @param googleAdsClient the Google Ads API client.
         * @param customerId the client customer ID.
         * @param campaignID the campaign ID.
         * @param extensionFeedItemResourceName the resource name for the extension feed item
         * @return resource name of the newly created extension feed item.
         * @throws GoogleAdsException if an API request failed with one or more service errors.
         */
        private String addExtensionToCampaign(
            GoogleAdsClient googleAdsClient, 
            long customerId, 
            long campaignId, 
            String extensionFeedItemResourceName){
            
            String campaignResourceName = ResourceNames.campaign(customerId, campaignId);

            // Create campaign extension setting, set to HOTEL_CALLOUT, and attach feed item
            CampaignExtensionSetting campaignExtensionSetting = CampaignExtensionSetting.newBuilder()
                .setExtensionType(ExtensionType.HOTEL_CALLOUT)
                .setCampaign(StringValue.of(campaignResourceName))
                .addExtensionFeedItems(StringValue.of(extensionFeedItemResourceName))
                .build();
            
            // Creates campaign extension setting operation
            CampaignExtensionSettingOperation op = CampaignExtensionSettingOperation.newBuilder()
                .setCreate(campaignExtensionSetting)
                .build();
            
            // Issues the create request to add the callout
            try (CampaignExtensionSettingServiceClient campaignExtensionServiceClient = googleAdsClient.getLatestVersion()
                    .createCampaignExtensionSettingServiceClient()){
                    MutateCampaignExtensionSettingsResponse response = campaignExtensionServiceClient
                        .mutateCampaignExtensionSettings(Long.toString(customerId), ImmutableList.of(op));

                    String campaignExtensionResourceName = response.getResults(0).getResourceName();
                    System.out.printf(
                        "Added an campaign extension with resource name: '%s'%n", 
                        campaignExtensionResourceName
                    );
                    return campaignExtensionResourceName;
                }
        }
 }
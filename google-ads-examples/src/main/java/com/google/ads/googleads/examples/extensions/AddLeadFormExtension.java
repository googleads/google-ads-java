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

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v12.common.LeadFormAsset;
import com.google.ads.googleads.v12.common.LeadFormDeliveryMethod;
import com.google.ads.googleads.v12.common.LeadFormField;
import com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers;
import com.google.ads.googleads.v12.common.WebhookDelivery;
import com.google.ads.googleads.v12.enums.AssetFieldTypeEnum.AssetFieldType;
import com.google.ads.googleads.v12.enums.LeadFormCallToActionTypeEnum.LeadFormCallToActionType;
import com.google.ads.googleads.v12.enums.LeadFormFieldUserInputTypeEnum.LeadFormFieldUserInputType;
import com.google.ads.googleads.v12.enums.LeadFormPostSubmitCallToActionTypeEnum.LeadFormPostSubmitCallToActionType;
import com.google.ads.googleads.v12.errors.GoogleAdsError;
import com.google.ads.googleads.v12.errors.GoogleAdsException;
import com.google.ads.googleads.v12.resources.Asset;
import com.google.ads.googleads.v12.resources.CampaignAsset;
import com.google.ads.googleads.v12.services.AssetOperation;
import com.google.ads.googleads.v12.services.AssetServiceClient;
import com.google.ads.googleads.v12.services.CampaignAssetOperation;
import com.google.ads.googleads.v12.services.CampaignAssetServiceClient;
import com.google.ads.googleads.v12.services.MutateAssetsResponse;
import com.google.ads.googleads.v12.services.MutateCampaignAssetsResponse;
import com.google.ads.googleads.v12.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Creates a lead form and a lead form extension for a campaign. Run AddCampaigns.java to create a
 * campaign.
 */
public class AddLeadFormExtension {

  private static class AddLeadFormExtensionParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private long campaignId;
  }

  public static void main(String[] args) {
    AddLeadFormExtensionParams params = new AddLeadFormExtensionParams();
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
      new AddLeadFormExtension().runExample(googleAdsClient, params.customerId, params.campaignId);
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
   * @param customerId the customer ID for which to add the lead form extension.
   * @param campaignId the campaign ID for which to add the lead form extension.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long campaignId) {
    // Creates a lead form asset.
    String leadFormAssetResourceName = createLeadFormAsset(googleAdsClient, customerId);

    // Creates a lead form extension for the campaign.
    createLeadFormExtension(googleAdsClient, customerId, campaignId, leadFormAssetResourceName);
  }

  /**
   * Creates the lead form asset.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the customer ID for which to add the lead form asset.
   * @return the resource name of the newly created lead form asset.
   */
  // [START add_lead_form_extension]
  private static String createLeadFormAsset(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates the lead form asset.
    Asset leadFormAsset =
        Asset.newBuilder()
            .setName("Interplanetary Cruise #" + getPrintableDateTime() + " Lead Form")
            .setLeadFormAsset(
                LeadFormAsset.newBuilder()
                    // Specify the details of the extension that the users will see.
                    .setCallToActionType(LeadFormCallToActionType.BOOK_NOW)
                    .setCallToActionDescription("Latest trip to Jupiter!")
                    // Define the form details.
                    .setBusinessName("Interplanetary Cruise")
                    .setHeadline("Trip to Jupiter")
                    .setDescription("Our latest trip to Jupiter is now open for booking.")
                    .setPrivacyPolicyUrl("http://example.com/privacy")
                    // Define the fields to be displayed to the user.
                    .addFields(
                        LeadFormField.newBuilder()
                            .setInputType(LeadFormFieldUserInputType.FULL_NAME)
                            .build())
                    .addFields(
                        LeadFormField.newBuilder()
                            .setInputType(LeadFormFieldUserInputType.EMAIL)
                            .build())
                    .addFields(
                        LeadFormField.newBuilder()
                            .setInputType(LeadFormFieldUserInputType.PHONE_NUMBER)
                            .build())
                    .addFields(
                        LeadFormField.newBuilder()
                            .setInputType(LeadFormFieldUserInputType.PREFERRED_CONTACT_TIME)
                            .setSingleChoiceAnswers(
                                LeadFormSingleChoiceAnswers.newBuilder()
                                    .addAnswers("Before 9 AM")
                                    .addAnswers("Any time")
                                    .addAnswers("After 5 PM")
                                    .build())
                            .build())
                    .addFields(
                        LeadFormField.newBuilder()
                            .setInputType(LeadFormFieldUserInputType.TRAVEL_BUDGET)
                            .build())

                    // Optional: You can also specify a background image asset.
                    // To upload an asset, see Misc/UploadImageAsset.java.
                    // .setBackgroundImageAsset("INSERT_IMAGE_ASSET_HERE")

                    // Optional: Define the response page after the user signs up on the form.
                    .setPostSubmitHeadline("Thanks for signing up!")
                    .setPostSubmitDescription(
                        "We will reach out to you shortly. Visit our website "
                            + "to see past trip details.")
                    .setPostSubmitCallToActionType(LeadFormPostSubmitCallToActionType.VISIT_SITE)
                    // Optional: Display a custom disclosure that displays along with Google
                    // disclaimer on the form.
                    .setCustomDisclosure("Trip may get cancelled due to meteor shower.")
                    // Optional: Define a delivery method for form response. See
                    // https://developers.google.com/google-ads/webhook/docs/overview for more
                    // details on how to define a webhook.
                    .addDeliveryMethods(
                        LeadFormDeliveryMethod.newBuilder()
                            .setWebhook(
                                WebhookDelivery.newBuilder()
                                    .setAdvertiserWebhookUrl("http://example.com/webhook")
                                    .setGoogleSecret("interplanetary google secret")
                                    .setPayloadSchemaVersion(3L)
                                    .build())
                            .build())
                    .build())
            .addFinalUrls("http://example.com/jupiter")
            .build();

    // Creates an operation to add the asset.
    AssetOperation operation = AssetOperation.newBuilder().setCreate(leadFormAsset).build();

    // Issues a mutate request to add the asset and prints its information.
    try (AssetServiceClient client =
        googleAdsClient.getLatestVersion().createAssetServiceClient()) {
      MutateAssetsResponse response =
          client.mutateAssets(String.valueOf(customerId), ImmutableList.of(operation));
      String resourceName = response.getResultsList().get(0).getResourceName();
      System.out.printf("Created asset with resource name '%s'.%n", resourceName);
      return resourceName;
    }
  }
  // [END add_lead_form_extension]

  /**
   * Creates the lead form extension.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the customer ID for which to add the lead form extension.
   * @param campaignId the campaign ID for which to add the lead form extension.
   * @param leadFormAssetResourceName the resource name of the lead form asset to be added.
   */
  // [START add_lead_form_extension_1]
  private static void createLeadFormExtension(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long campaignId,
      String leadFormAssetResourceName) {
    // Creates the campaign asset for the lead form.
    CampaignAsset campaignAsset =
        CampaignAsset.newBuilder()
            .setAsset(leadFormAssetResourceName)
            .setFieldType(AssetFieldType.LEAD_FORM)
            .setCampaign(ResourceNames.campaign(customerId, campaignId))
            .build();

    // Creates an operation to add the campaign asset.
    CampaignAssetOperation operation =
        CampaignAssetOperation.newBuilder().setCreate(campaignAsset).build();

    // Issues a mutate request to add the campaign asset and prints its information.
    try (CampaignAssetServiceClient client =
        googleAdsClient.getLatestVersion().createCampaignAssetServiceClient()) {
      MutateCampaignAssetsResponse response =
          client.mutateCampaignAssets(String.valueOf(customerId), ImmutableList.of(operation));
      System.out.printf(
          "Created campaign asset with resource name '%s' for campaign ID %d.%n",
          response.getResultsList().get(0).getResourceName(), campaignId);
    }
  }
  // [END add_lead_form_extension_1]
}

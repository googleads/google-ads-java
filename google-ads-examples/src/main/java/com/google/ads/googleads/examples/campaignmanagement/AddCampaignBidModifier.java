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

package com.google.ads.googleads.examples.campaignmanagement;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v4.common.InteractionTypeInfo;
import com.google.ads.googleads.v4.enums.InteractionTypeEnum;
import com.google.ads.googleads.v4.errors.GoogleAdsError;
import com.google.ads.googleads.v4.errors.GoogleAdsException;
import com.google.ads.googleads.v4.resources.CampaignBidModifier;
import com.google.ads.googleads.v4.services.CampaignBidModifierOperation;
import com.google.ads.googleads.v4.services.CampaignBidModifierServiceClient;
import com.google.ads.googleads.v4.services.MutateCampaignBidModifierResult;
import com.google.ads.googleads.v4.services.MutateCampaignBidModifiersResponse;
import com.google.ads.googleads.v4.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.DoubleValue;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Adds a campaign-level bid modifier for call interactions. */
public class AddCampaignBidModifier {

  private static class AddCampaignBidModifierParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;

    @Parameter(names = ArgumentNames.BID_MODIFIER, required = true)
    private Double bidModifier;
  }

  public static void main(String[] args) {
    AddCampaignBidModifierParams params = new AddCampaignBidModifierParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
      params.bidModifier = Double.parseDouble("INSERT_BID_MODIFIER_HERE");
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
      new AddCampaignBidModifier()
          .runExample(googleAdsClient, params.customerId, params.campaignId, params.bidModifier);
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
   * @param customerId the client customer ID.
   * @param campaignId the ID of the campaign where the bid modifier will be added.
   * @param bidModifier the value of the bid modifier to add.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, long campaignId, double bidModifier) {

    String campaignResourceName = ResourceNames.campaign(customerId, campaignId);

    // Constructs a campaign bid modifier.
    CampaignBidModifier campaignBidModifier =
        CampaignBidModifier.newBuilder()
            .setCampaign(StringValue.of(campaignResourceName))
            // Makes the bid modifier apply to call interactions.
            .setInteractionType(
                InteractionTypeInfo.newBuilder().setType(InteractionTypeEnum.InteractionType.CALLS))
            // Uses the specified bid modifier value.
            .setBidModifier(DoubleValue.of(bidModifier))
            .build();

    // Constructs an operation to create the campaign bid modifier.
    CampaignBidModifierOperation op =
        CampaignBidModifierOperation.newBuilder().setCreate(campaignBidModifier).build();

    // Sends the operation in a mutate request.
    try (CampaignBidModifierServiceClient agcServiceClient =
        googleAdsClient.getLatestVersion().createCampaignBidModifierServiceClient()) {
      MutateCampaignBidModifiersResponse response =
          agcServiceClient.mutateCampaignBidModifiers(
              Long.toString(customerId), ImmutableList.of(op));
      System.out.printf("Added %d campaign bid modifiers:%n", response.getResultsCount());
      for (MutateCampaignBidModifierResult result : response.getResultsList()) {
        System.out.printf("\t%s%n", result.getResourceName());
      }
    }
  }
}

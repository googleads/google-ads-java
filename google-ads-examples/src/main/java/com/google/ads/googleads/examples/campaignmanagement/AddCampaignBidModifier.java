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
import com.google.ads.googleads.v10.common.InteractionTypeInfo;
import com.google.ads.googleads.v10.enums.InteractionTypeEnum;
import com.google.ads.googleads.v10.enums.ResponseContentTypeEnum.ResponseContentType;
import com.google.ads.googleads.v10.errors.GoogleAdsError;
import com.google.ads.googleads.v10.errors.GoogleAdsException;
import com.google.ads.googleads.v10.resources.CampaignBidModifier;
import com.google.ads.googleads.v10.services.CampaignBidModifierOperation;
import com.google.ads.googleads.v10.services.CampaignBidModifierServiceClient;
import com.google.ads.googleads.v10.services.MutateCampaignBidModifiersRequest;
import com.google.ads.googleads.v10.services.MutateCampaignBidModifiersResponse;
import com.google.ads.googleads.v10.utils.ResourceNames;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Adds a campaign-level bid modifier for call interactions. */
public class AddCampaignBidModifier {

  private static class AddCampaignBidModifierParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;

    @Parameter(names = ArgumentNames.BID_MODIFIER_VALUE, required = true)
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
      System.exit(1);
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
            .setCampaign(campaignResourceName)
            // Makes the bid modifier apply to call interactions.
            .setInteractionType(
                InteractionTypeInfo.newBuilder().setType(InteractionTypeEnum.InteractionType.CALLS))
            // Uses the specified bid modifier value.
            .setBidModifier(bidModifier)
            .build();

    // Constructs an operation to create the campaign bid modifier.
    CampaignBidModifierOperation op =
        CampaignBidModifierOperation.newBuilder().setCreate(campaignBidModifier).build();

    // [START mutable_resource]
    // Constructs a request to add the bid modifier.
    MutateCampaignBidModifiersRequest request =
        MutateCampaignBidModifiersRequest.newBuilder()
            .addOperations(op)
            .setCustomerId(String.valueOf(customerId))
            // Specifies that we want to the request to return the mutated object and not just its
            // resource name.
            .setResponseContentType(ResponseContentType.MUTABLE_RESOURCE)
            .build();

    // Sends the operation in a mutate request.
    try (CampaignBidModifierServiceClient agcServiceClient =
        googleAdsClient.getLatestVersion().createCampaignBidModifierServiceClient()) {
      MutateCampaignBidModifiersResponse response =
          agcServiceClient.mutateCampaignBidModifiers(request);
      /**
       * The resource returned in the response can be accessed directly in the results list. Its
       * fields can be read directly, and it can also be mutated further and used in subsequent
       * requests, without needing to make additional Get or Search requests.
       */
      CampaignBidModifier mutableResource = response.getResults(0).getCampaignBidModifier();
      System.out.printf(
          "Created campaign bid modifier with resource_name "
              + "'%s', criterion ID "
              + "%d, and bid modifier value "
              + "%s, under the campaign with "
              + "resource_name '%s'.%n",
          mutableResource.getResourceName(),
          mutableResource.getCriterionId(),
          mutableResource.getBidModifier(),
          mutableResource.getCampaign());
    }
    // [END mutable_resource]
  }
}

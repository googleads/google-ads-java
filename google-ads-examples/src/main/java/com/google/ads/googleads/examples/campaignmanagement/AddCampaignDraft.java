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

package com.google.ads.googleads.examples.campaignmanagement;

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v10.errors.GoogleAdsError;
import com.google.ads.googleads.v10.errors.GoogleAdsException;
import com.google.ads.googleads.v10.resources.CampaignDraft;
import com.google.ads.googleads.v10.services.CampaignDraftOperation;
import com.google.ads.googleads.v10.services.CampaignDraftServiceClient;
import com.google.ads.googleads.v10.services.MutateCampaignDraftResult;
import com.google.ads.googleads.v10.services.MutateCampaignDraftsResponse;
import com.google.ads.googleads.v10.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Adds a campaign draft for a campaign. Make sure you specify a campaign that has a non-shared
 * budget.
 */
public class AddCampaignDraft {

  private static class AddCampaignDraftParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.BASE_CAMPAIGN_ID, required = true)
    private Long baseCampaignId;
  }

  public static void main(String[] args) {
    AddCampaignDraftParams params = new AddCampaignDraftParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.baseCampaignId = Long.valueOf("INSERT_BASE_CAMPAIGN_ID_HERE");
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
      new AddCampaignDraft().runExample(googleAdsClient, params.customerId, params.baseCampaignId);
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
   * @param customerId the customer ID.
   * @param baseCampaignId the original campaign ID from which to create a draft. Must have a shared
   *     budget.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long baseCampaignId) {
    // Creates a CampaignDraft object with the provided base campaign ID.
    CampaignDraft draft =
        CampaignDraft.newBuilder()
            .setBaseCampaign(ResourceNames.campaign(customerId, baseCampaignId))
            .setName("Campaign Draft #" + getPrintableDateTime())
            .build();

    // Creates an operation to create the draft campaign.
    CampaignDraftOperation operation = CampaignDraftOperation.newBuilder().setCreate(draft).build();

    // Creates a service client to connect to the API.
    try (CampaignDraftServiceClient campaignDraftServiceClient =
        googleAdsClient.getLatestVersion().createCampaignDraftServiceClient()) {
      // Issues the mutate request.
      MutateCampaignDraftsResponse response =
          campaignDraftServiceClient.mutateCampaignDrafts(
              String.valueOf(customerId), ImmutableList.of(operation));

      // Displays the result.
      for (MutateCampaignDraftResult result : response.getResultsList()) {
        System.out.printf(
            "Created campaign draft with resource name '%s'.%n", result.getResourceName());
      }
    }
  }
}

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

package com.google.ads.googleads.examples.basicoperations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v5.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v5.errors.GoogleAdsError;
import com.google.ads.googleads.v5.errors.GoogleAdsException;
import com.google.ads.googleads.v5.resources.Campaign;
import com.google.ads.googleads.v5.services.CampaignOperation;
import com.google.ads.googleads.v5.services.CampaignServiceClient;
import com.google.ads.googleads.v5.services.MutateCampaignResult;
import com.google.ads.googleads.v5.services.MutateCampaignsResponse;
import com.google.ads.googleads.v5.utils.ResourceNames;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;

/** Updates a campaign by setting the status to PAUSED. To get campaigns, run GetCampaigns.java. */
public class UpdateCampaign {

  private static class UpdateCampaignParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;
  }

  public static void main(String[] args) {
    UpdateCampaignParams params = new UpdateCampaignParams();
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
      new UpdateCampaign().runExample(googleAdsClient, params.customerId, params.campaignId);
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
   * @param campaignId the ID of the campaign to update.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, Long customerId, Long campaignId) {
    try (CampaignServiceClient campaignServiceClient =
        googleAdsClient.getLatestVersion().createCampaignServiceClient()) {
      // Creates a Campaign object with the proper resource name and any other changes.
      Campaign campaign =
          Campaign.newBuilder()
              .setResourceName(ResourceNames.campaign(customerId, campaignId))
              .setStatus(CampaignStatus.PAUSED)
              .build();
      // Constructs an operation that will update the campaign, using the FieldMasks utility to
      // derive the update mask. This mask tells the Google Ads API which attributes of the
      // campaign you want to change.
      CampaignOperation operation =
          CampaignOperation.newBuilder()
              .setUpdate(campaign)
              .setUpdateMask(FieldMasks.allSetFieldsOf(campaign))
              .build();
      // Sends the operation in a mutate request.
      MutateCampaignsResponse response =
          campaignServiceClient.mutateCampaigns(
              customerId.toString(), Collections.singletonList(operation));
      // Prints the resource name of each updated object.
      for (MutateCampaignResult mutateCampaignResult : response.getResultsList()) {
        System.out.printf(
            "Updated campaign with resourceName: %s.%n", mutateCampaignResult.getResourceName());
      }
    }
  }
}

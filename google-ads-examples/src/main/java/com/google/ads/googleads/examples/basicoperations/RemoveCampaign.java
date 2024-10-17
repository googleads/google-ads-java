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
import com.google.ads.googleads.v18.errors.GoogleAdsError;
import com.google.ads.googleads.v18.errors.GoogleAdsException;
import com.google.ads.googleads.v18.services.CampaignOperation;
import com.google.ads.googleads.v18.services.CampaignServiceClient;
import com.google.ads.googleads.v18.services.MutateCampaignResult;
import com.google.ads.googleads.v18.services.MutateCampaignsResponse;
import com.google.ads.googleads.v18.utils.ResourceNames;
import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Deletes a campaign using the 'REMOVE' operation. To get campaigns, run GetCampaigns.java. */
public class RemoveCampaign {

  private static class RemoveCampaignParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;
  }

  public static void main(String[] args) {
    RemoveCampaignParams params = new RemoveCampaignParams();
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
      new RemoveCampaign().runExample(googleAdsClient, params.customerId, params.campaignId);
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
   * @param campaignId the ID of the campaign to remove.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long campaignId) {
    try (CampaignServiceClient campaignServiceClient =
        googleAdsClient.getLatestVersion().createCampaignServiceClient()) {
      String campaignResourceName = ResourceNames.campaign(customerId, campaignId);
      // Constructs an operation that will remove the campaign with the specified resource name.
      CampaignOperation operation =
          CampaignOperation.newBuilder().setRemove(campaignResourceName).build();
      // Sends the operation in a mutate request.
      MutateCampaignsResponse response =
          campaignServiceClient.mutateCampaigns(
              Long.toString(customerId), Lists.newArrayList(operation));
      // Prints the resource name of each removed object.
      for (MutateCampaignResult mutateCampaignResult : response.getResultsList()) {
        System.out.printf(
            "Removed campaign with resource name: '%s'.%n", mutateCampaignResult.getResourceName());
      }
    }
  }
}

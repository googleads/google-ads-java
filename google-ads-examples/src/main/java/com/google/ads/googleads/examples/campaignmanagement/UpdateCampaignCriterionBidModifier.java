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

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v19.common.DeviceInfo;
import com.google.ads.googleads.v19.enums.DeviceEnum.Device;
import com.google.ads.googleads.v19.errors.GoogleAdsError;
import com.google.ads.googleads.v19.errors.GoogleAdsException;
import com.google.ads.googleads.v19.resources.CampaignCriterion;
import com.google.ads.googleads.v19.services.CampaignCriterionOperation;
import com.google.ads.googleads.v19.services.CampaignCriterionServiceClient;
import com.google.ads.googleads.v19.services.MutateCampaignCriteriaResponse;
import com.google.ads.googleads.v19.services.MutateCampaignCriterionResult;
import com.google.ads.googleads.v19.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Updates a campaign criterion with a new bid modifier. */
public class UpdateCampaignCriterionBidModifier {

  private static class UpdateCampaignCriterionBidModifierParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;

    @Parameter(names = ArgumentNames.CRITERION_ID, required = true)
    private Long criterionId;

    /** Specify the bid modifier value here or the default specified below will be used. */
    @Parameter(names = ArgumentNames.BID_MODIFIER_VALUE)
    private Float bidModifier = 1.5f;
  }

  public static void main(String[] args) throws IOException {
    UpdateCampaignCriterionBidModifierParams params =
        new UpdateCampaignCriterionBidModifierParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
      params.criterionId = Long.parseLong("INSERT_CRITERION_ID_HERE");
      // Optional: To use a different bid modifier value from the default (1.5f), uncomment
      // the line below and insert the desired bid modifier value.
      // params.bidModifier = Float.parseFloat("INSERT_BID_MODIFIER_VALUE_HERE");
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
      new UpdateCampaignCriterionBidModifier()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.campaignId,
              params.criterionId,
              params.bidModifier);
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
   * @param criterionId the ID of the criterion to be updated.
   * @param bidModifier the bid modifier for the campaign criterion.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long campaignId,
      long criterionId,
      float bidModifier) {
    // Creates the criterion resource name.
    String criterionResourceName =
        ResourceNames.campaignCriterion(customerId, campaignId, criterionId);

    // Creates the CampaignCriterion.
    CampaignCriterion campaignCriterion =
        CampaignCriterion.newBuilder()
            .setResourceName(criterionResourceName)
            .setBidModifier(bidModifier)
            .setDevice(DeviceInfo.newBuilder().setType(Device.MOBILE).build())
            .build();

    // Creates the operation.
    CampaignCriterionOperation operation =
        CampaignCriterionOperation.newBuilder()
            .setUpdate(campaignCriterion)
            .setUpdateMask(FieldMasks.allSetFieldsOf(campaignCriterion))
            .build();

    // Creates the CampaignCriterionServiceClient.
    try (CampaignCriterionServiceClient campaignCriterionServiceClient =
        googleAdsClient.getLatestVersion().createCampaignCriterionServiceClient()) {
      // Adds the CampaignCriterion.
      MutateCampaignCriteriaResponse response =
          campaignCriterionServiceClient.mutateCampaignCriteria(
              Long.toString(customerId), ImmutableList.of(operation));
      for (MutateCampaignCriterionResult result : response.getResultsList()) {
        System.out.printf(
            "Campaign criterion with resource name '%s' was modified.%n", result.getResourceName());
      }
    }
  }
}

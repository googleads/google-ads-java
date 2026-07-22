// Copyright 2026 Google LLC
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

package com.google.ads.googleads.examples.experiments;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v25.enums.AssetAutomationStatusEnum.AssetAutomationStatus;
import com.google.ads.googleads.v25.enums.AssetAutomationTypeEnum.AssetAutomationType;
import com.google.ads.googleads.v25.enums.ExperimentTypeEnum.ExperimentType;
import com.google.ads.googleads.v25.errors.GoogleAdsError;
import com.google.ads.googleads.v25.errors.GoogleAdsException;
import com.google.ads.googleads.v25.resources.Campaign;
import com.google.ads.googleads.v25.resources.Campaign.AiMaxSetting;
import com.google.ads.googleads.v25.resources.Campaign.AssetAutomationSetting;
import com.google.ads.googleads.v25.resources.Experiment;
import com.google.ads.googleads.v25.resources.ExperimentArm;
import com.google.ads.googleads.v25.services.CampaignOperation;
import com.google.ads.googleads.v25.services.ExperimentArmOperation;
import com.google.ads.googleads.v25.services.ExperimentOperation;
import com.google.ads.googleads.v25.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v25.services.MutateGoogleAdsRequest;
import com.google.ads.googleads.v25.services.MutateGoogleAdsResponse;
import com.google.ads.googleads.v25.services.MutateOperation;
import com.google.ads.googleads.v25.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * Creates an ADOPT_AI_MAX intra-campaign experiment for a Search campaign.
 *
 * <p>Intra-campaign experiments split traffic *within* the campaign, based on whether the feature
 * (in this case, AI Max) is enabled or not.
 */
public class CreateSearchAdoptAiMaxExperiment {

  private static class CreateSearchAdoptAiMaxExperimentParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;
  }

  public static void main(String[] args) {
    CreateSearchAdoptAiMaxExperimentParams params = new CreateSearchAdoptAiMaxExperimentParams();
    if (!params.parseArguments(args)) {
      throw new IllegalArgumentException("Invalid or missing command line arguments");
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
      new CreateSearchAdoptAiMaxExperiment()
          .runExample(googleAdsClient, params.customerId, params.campaignId);
    } catch (GoogleAdsException gae) {
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
   * @param googleAdsClient the googleAdsClient.
   * @param customerId the customer ID.
   * @param campaignId the ID of the campaign to run the experiment on.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long campaignId) {
    // [START create_search_adopt_ai_max_experiment_1]
    // Create the experiment resource name using a temporary ID.
    String experimentResourceName = ResourceNames.experiment(customerId, -1L);

    // Create the experiment.
    Experiment experiment =
        Experiment.newBuilder()
            .setResourceName(experimentResourceName)
            .setName("ADOPT_AI_MAX Experiment #" + UUID.randomUUID())
            .setType(ExperimentType.ADOPT_AI_MAX)
            .build();
    MutateOperation experimentOperation =
        MutateOperation.newBuilder()
            .setExperimentOperation(ExperimentOperation.newBuilder().setCreate(experiment).build())
            .build();

    // Create the control arm. Both arms in an intra-campaign experiment reference the same base
    // campaign.
    ExperimentArm controlArm =
        ExperimentArm.newBuilder()
            .setExperiment(experimentResourceName)
            .setName("Control Arm")
            .setControl(true)
            .setTrafficSplit(50)
            .addCampaigns(ResourceNames.campaign(customerId, campaignId))
            .build();
    MutateOperation controlArmOperation =
        MutateOperation.newBuilder()
            .setExperimentArmOperation(
                ExperimentArmOperation.newBuilder().setCreate(controlArm).build())
            .build();

    // Create the treatment arm.
    ExperimentArm treatmentArm =
        ExperimentArm.newBuilder()
            .setExperiment(experimentResourceName)
            .setName("Treatment Arm")
            .setControl(false)
            .setTrafficSplit(50)
            .addCampaigns(ResourceNames.campaign(customerId, campaignId))
            .build();
    MutateOperation treatmentArmOperation =
        MutateOperation.newBuilder()
            .setExperimentArmOperation(
                ExperimentArmOperation.newBuilder().setCreate(treatmentArm).build())
            .build();

    // Create a campaign operation with an update mask to enable AI Max and configure asset
    // automation settings.
    // Note: For intra-campaign experiments, these settings are applied to the base campaign but are
    // only active for the treatment traffic split.
    Campaign campaign =
        Campaign.newBuilder()
            .setResourceName(ResourceNames.campaign(customerId, campaignId))
            .setAiMaxSetting(AiMaxSetting.newBuilder().setEnableAiMax(true).build())
            .addAssetAutomationSettings(
                AssetAutomationSetting.newBuilder()
                    .setAssetAutomationType(AssetAutomationType.TEXT_ASSET_AUTOMATION)
                    .setAssetAutomationStatus(AssetAutomationStatus.OPTED_IN)
                    .build())
            .addAssetAutomationSettings(
                AssetAutomationSetting.newBuilder()
                    .setAssetAutomationType(
                        AssetAutomationType.FINAL_URL_EXPANSION_TEXT_ASSET_AUTOMATION)
                    .setAssetAutomationStatus(AssetAutomationStatus.OPTED_IN)
                    .build())
            .build();

    CampaignOperation campaignOp =
        CampaignOperation.newBuilder()
            .setUpdate(campaign)
            .setUpdateMask(FieldMasks.allSetFieldsOf(campaign))
            .build();
    MutateOperation campaignMutateOperation =
        MutateOperation.newBuilder().setCampaignOperation(campaignOp).build();

    // Send all mutate operations in a single Mutate request.
    List<MutateOperation> mutateOperations =
        ImmutableList.of(
            experimentOperation,
            controlArmOperation,
            treatmentArmOperation,
            campaignMutateOperation);

    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {

      MutateGoogleAdsRequest request =
          MutateGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .addAllMutateOperations(mutateOperations)
              .build();

      MutateGoogleAdsResponse response = googleAdsServiceClient.mutate(request);
      // [END create_search_adopt_ai_max_experiment_1]

      // Print the results.
      // The results will be returned in the same order as the mutate operations.
      System.out.printf(
          "Created experiment: %s%n",
          response.getMutateOperationResponses(0).getExperimentResult().getResourceName());
      System.out.printf(
          "Created control arm: %s%n",
          response.getMutateOperationResponses(1).getExperimentArmResult().getResourceName());
      System.out.printf(
          "Created treatment arm: %s%n",
          response.getMutateOperationResponses(2).getExperimentArmResult().getResourceName());
      System.out.printf(
          "Updated campaign to enable AI Max: %s%n",
          response.getMutateOperationResponses(3).getCampaignResult().getResourceName());
    }
  }
}

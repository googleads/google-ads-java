// Copyright 2022 Google LLC
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

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v24.enums.ExperimentStatusEnum.ExperimentStatus;
import com.google.ads.googleads.v24.enums.ExperimentTypeEnum.ExperimentType;
import com.google.ads.googleads.v24.enums.ResponseContentTypeEnum.ResponseContentType;
import com.google.ads.googleads.v24.errors.GoogleAdsError;
import com.google.ads.googleads.v24.errors.GoogleAdsException;
import com.google.ads.googleads.v24.resources.Campaign;
import com.google.ads.googleads.v24.resources.Experiment;
import com.google.ads.googleads.v24.resources.ExperimentArm;
import com.google.ads.googleads.v24.services.CampaignOperation;
import com.google.ads.googleads.v24.services.CampaignServiceClient;
import com.google.ads.googleads.v24.services.ExperimentArmOperation;
import com.google.ads.googleads.v24.services.ExperimentArmServiceClient;
import com.google.ads.googleads.v24.services.ExperimentOperation;
import com.google.ads.googleads.v24.services.ExperimentServiceClient;
import com.google.ads.googleads.v24.services.MutateExperimentArmResult;
import com.google.ads.googleads.v24.services.MutateExperimentArmsRequest;
import com.google.ads.googleads.v24.services.MutateExperimentArmsResponse;
import com.google.ads.googleads.v24.services.MutateExperimentsResponse;
import com.google.ads.googleads.v24.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This example creates a standard, system-managed campaign experiment.
 *
 * <p>It demonstrates how to create an experiment, configure its control and treatment arms (where
 * the treatment arm automatically generates a draft campaign), modify the system-generated draft
 * campaign, and schedule the experiment.
 *
 * <p>Note: This standard draft-based workflow does not apply to all experiment types (e.g.,
 * hotswap or asset optimization experiments) that do not use system-generated treatment campaign
 * copies.
 */
public class CreateSearchCustomExperiment {

  private static class CreateSearchCustomExperimentParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.BASE_CAMPAIGN_ID, required = true)
    private Long baseCampaignId;
  }

  public static void main(String[] args) {
    CreateSearchCustomExperimentParams params = new CreateSearchCustomExperimentParams();
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
      new CreateSearchCustomExperiment().runExample(googleAdsClient, params.customerId, params.baseCampaignId);
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
   * @param googleAdsClient the googleAdsClient.
   * @param customerId the customer ID.
   * @param baseCampaignId the ID of the campaign on which to base the experiment.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long baseCampaignId) {
    String experiment = createExperimentResource(googleAdsClient, customerId);
    String draftCampaign =
        createExperimentArms(googleAdsClient, customerId, baseCampaignId, experiment);

    modifyDraftCampaign(googleAdsClient, customerId, draftCampaign);

    // When you're done setting up the experiment and arms and modifying the draft campaign, this
    // will begin the experiment.
    try (ExperimentServiceClient experimentServiceClient =
        googleAdsClient.getLatestVersion().createExperimentServiceClient()) {
      experimentServiceClient.scheduleExperimentAsync(experiment);
    }
  }

  /**
   * Creates a campaign experiment.
   */
  // [START create_experiment_1]
  private String createExperimentResource(GoogleAdsClient googleAdsClient, long customerId) {
    ExperimentOperation operation =
        ExperimentOperation.newBuilder()
            .setCreate(
                Experiment.newBuilder()
                    // Name must be unique.
                    .setName("Example Experiment #" + getPrintableDateTime())
                    // We specify SEARCH_CUSTOM to create a standard search campaign experiment.
                    // This type uses a standard draft-based workflow where the system automatically
                    // creates a draft/in-design campaign for the treatment arm.
                    .setType(ExperimentType.SEARCH_CUSTOM)
                    .setSuffix("[experiment]")
                    .setStatus(ExperimentStatus.SETUP)
                    .build())
            .build();

    try (ExperimentServiceClient experimentServiceClient =
        googleAdsClient.getLatestVersion().createExperimentServiceClient()) {
      MutateExperimentsResponse response =
          experimentServiceClient.mutateExperiments(
              Long.toString(customerId), ImmutableList.of(operation));
      String experiment = response.getResults(0).getResourceName();
      System.out.printf("Created experiment with resource name '%s'%n", experiment);
      return experiment;
    }
  }
  // [END create_experiment_1]

  /**
   * Creates control and experiment arms for the experiment.
   */
  // [START create_experiment_2]
  private String createExperimentArms(
      GoogleAdsClient googleAdsClient, long customerId, long campaignId, String experiment) {
    List<ExperimentArmOperation> operations = new ArrayList<>();
    operations.add(
        ExperimentArmOperation.newBuilder()
            .setCreate(
                // The "control" arm references an already-existing campaign.
                ExperimentArm.newBuilder()
                    .setControl(true)
                    .addCampaigns(ResourceNames.campaign(customerId, campaignId))
                    .setExperiment(experiment)
                    .setName("control arm")
                    .setTrafficSplit(40)
                    .build())
            .build());
    operations.add(
        ExperimentArmOperation.newBuilder()
            .setCreate(
                // In standard campaign experiments, creating the treatment arm automatically
                // generates a draft campaign that you can modify before starting the experiment.
                ExperimentArm.newBuilder()
                    .setControl(false)
                    .setExperiment(experiment)
                    .setName("experiment arm")
                    .setTrafficSplit(60)
                    .build())
            .build());

    try (ExperimentArmServiceClient experimentArmServiceClient =
        googleAdsClient.getLatestVersion().createExperimentArmServiceClient()) {
      // Constructs the mutate request.
      MutateExperimentArmsRequest mutateRequest = MutateExperimentArmsRequest.newBuilder()
          .setCustomerId(Long.toString(customerId))
          .addAllOperations(operations)
          // We want to fetch the draft campaign IDs from the treatment arm, so the easiest way to do
          // that is to have the response return the newly created entities.
          .setResponseContentType(ResponseContentType.MUTABLE_RESOURCE)
          .build();

      // Sends the mutate request.
      MutateExperimentArmsResponse response =
          experimentArmServiceClient.mutateExperimentArms(mutateRequest);

      // Results always return in the order that you specify them in the request. Since we created
      // the treatment arm last, it will be the last result.  If you don't remember which arm is the
      // treatment arm, you can always filter the query in the next section with
      // `experiment_arm.control = false`.
      MutateExperimentArmResult controlArmResult = response.getResults(0);
      MutateExperimentArmResult treatmentArmResult = response.getResults(
          response.getResultsCount() - 1);

      System.out.printf("Created control arm with resource name '%s'%n",
          controlArmResult.getResourceName());
      System.out.printf("Created treatment arm with resource name '%s'%n",
          treatmentArmResult.getResourceName());

      return treatmentArmResult.getExperimentArm().getInDesignCampaigns(0);
    }
  }
  // [END create_experiment_2]

  /**
   * Modifies the draft campaign.
   */
  // [START create_experiment_4]
  private void modifyDraftCampaign(
      GoogleAdsClient googleAdsClient, long customerId, String draftCampaign) {
    Campaign.Builder campaignBuilder = Campaign.newBuilder().setResourceName(draftCampaign);

    // You can change anything you like about the campaign. These are the changes you're testing by
    // doing this experiment. Here we just change the name for illustrative purposes, but generally
    // you may want to change more meaningful parts of the campaign.
    //
    // You can also change underlying resources, such as ad groups and keywords, just as you
    // would for any other campaign. When searching with the GoogleAdsService, be sure to
    // include a PARAMETERS clause with `include_drafts = true` when searching for these
    // draft entities.
    Campaign campaign =
        campaignBuilder.setName("Modified Campaign Name " + getPrintableDateTime()).build();

    CampaignOperation operation =
        CampaignOperation.newBuilder()
            .setUpdate(campaign)
            .setUpdateMask(FieldMasks.allSetFieldsOf(campaign))
            .build();

    try (CampaignServiceClient campaignServiceClient =
        googleAdsClient.getLatestVersion().createCampaignServiceClient()) {
      campaignServiceClient.mutateCampaigns(Long.toString(customerId), ImmutableList.of(operation));

      System.out.printf("Updated the name for campaign '%s'%n", draftCampaign);
    }
  }
  // [END create_experiment_4]
}

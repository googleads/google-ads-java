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
import com.google.ads.googleads.v24.common.ImageAsset;
import com.google.ads.googleads.v24.common.TextAsset;
import com.google.ads.googleads.v24.enums.AssetFieldTypeEnum.AssetFieldType;
import com.google.ads.googleads.v24.enums.AssetLinkStatusEnum.AssetLinkStatus;
import com.google.ads.googleads.v24.enums.AssetTypeEnum.AssetType;
import com.google.ads.googleads.v24.enums.ExperimentTypeEnum.ExperimentType;
import com.google.ads.googleads.v24.enums.OptimizeAssetsExperimentSubtypeEnum.OptimizeAssetsExperimentSubtype;
import com.google.ads.googleads.v24.errors.GoogleAdsError;
import com.google.ads.googleads.v24.errors.GoogleAdsException;
import com.google.ads.googleads.v24.resources.Asset;
import com.google.ads.googleads.v24.resources.AssetGroupAsset;
import com.google.ads.googleads.v24.resources.Experiment;
import com.google.ads.googleads.v24.common.OptimizeAssetsExperimentInfo;
import com.google.ads.googleads.v24.resources.ExperimentArm;
import com.google.ads.googleads.v24.resources.ExperimentArm.AssetGroupAssetInfo;
import com.google.ads.googleads.v24.resources.ExperimentArm.AssetGroupInfo;
import com.google.ads.googleads.v24.services.AssetGroupAssetOperation;
import com.google.ads.googleads.v24.services.AssetOperation;
import com.google.ads.googleads.v24.services.ExperimentArmOperation;
import com.google.ads.googleads.v24.services.ExperimentOperation;
import com.google.ads.googleads.v24.services.GoogleAdsRow;
import com.google.ads.googleads.v24.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v24.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v24.services.MutateGoogleAdsRequest;
import com.google.ads.googleads.v24.services.MutateGoogleAdsResponse;
import com.google.ads.googleads.v24.services.MutateOperation;
import com.google.ads.googleads.v24.services.SearchGoogleAdsRequest;
import com.google.ads.googleads.v24.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import com.google.common.io.ByteStreams;
import com.google.protobuf.ByteString;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.UUID;

/**
 * Creates an OPTIMIZE_ASSETS experiment.
 *
 * <p>Asset optimization experiments are used to test different asset combinations within
 * Performance Max campaigns.
 */
public class CreateAssetOptimizationExperiment {

  private static final String IMAGE_URL = "https://gaagl.page.link/Eit5";

  private static class CreateAssetOptimizationExperimentParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.ASSET_GROUP_ID, required = true)
    private Long assetGroupId;
  }

  public static void main(String[] args) throws IOException {
    CreateAssetOptimizationExperimentParams params = new CreateAssetOptimizationExperimentParams();
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
      new CreateAssetOptimizationExperiment()
          .runExample(googleAdsClient, params.customerId, params.assetGroupId);
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
   * @param assetGroupId the base asset group ID to run the experiment on.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long assetGroupId)
      throws IOException {

    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {

      String campaignResourceName = null;

      // Query the asset group to find the associated campaign resource name.
      String query =
          String.format(
              "SELECT asset_group.campaign FROM asset_group WHERE asset_group.id = %d",
              assetGroupId);

      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setQuery(query)
              .build();

      SearchPagedResponse searchResponse = googleAdsServiceClient.search(request);

      for (GoogleAdsRow row : searchResponse.iterateAll()) {
        campaignResourceName = row.getAssetGroup().getCampaign();
        break;
      }

      if (campaignResourceName == null || campaignResourceName.isEmpty()) {
        System.err.printf("Asset group with ID %d not found.%n", assetGroupId);
        System.exit(1);
      }

      // Temp IDs
      String asset1TempId = ResourceNames.asset(customerId, -1L);
      String experimentTempId = ResourceNames.experiment(customerId, -2L);
      String asset2TempId = ResourceNames.asset(customerId, -3L);

      String assetGroupResourceName = ResourceNames.assetGroup(customerId, assetGroupId);

      // [START create_asset_optimization_experiment_1]
      // 1. Create Assets with temporary resource names.
      // We create a text asset and an image asset to showcase different types.
      Asset textAsset =
          Asset.newBuilder()
              .setResourceName(asset1TempId)
              .setTextAsset(TextAsset.newBuilder().setText("Fly to Mars!").build())
              .build();

      MutateOperation textAssetOperation =
          MutateOperation.newBuilder()
              .setAssetOperation(AssetOperation.newBuilder().setCreate(textAsset).build())
              .build();

      byte[] imageData = ByteStreams.toByteArray(new URL(IMAGE_URL).openStream());
      Asset imageAsset =
          Asset.newBuilder()
              .setResourceName(asset2TempId)
              .setName("Mars Landscape View")
              .setType(AssetType.IMAGE)
              .setImageAsset(
                  ImageAsset.newBuilder().setData(ByteString.copyFrom(imageData)).build())
              .build();

      MutateOperation imageAssetOperation =
          MutateOperation.newBuilder()
              .setAssetOperation(AssetOperation.newBuilder().setCreate(imageAsset).build())
              .build();

      // 2. Create an Experiment with a temporary resource name.
      Experiment experiment =
          Experiment.newBuilder()
              .setResourceName(experimentTempId)
              .setName("Interstellar Asset Experiment #" + UUID.randomUUID())
              .setType(ExperimentType.OPTIMIZE_ASSETS)
              // Set the optimize assets experiment subtype to COMPARE_ASSETS.
              .setOptimizeAssetsExperiment(
                  OptimizeAssetsExperimentInfo.newBuilder()
                      .setOptimizeAssetsExperimentSubtype(
                          OptimizeAssetsExperimentSubtype.COMPARE_ASSETS)
                      .build())
              .build();

      MutateOperation experimentOperation =
          MutateOperation.newBuilder()
              .setExperimentOperation(ExperimentOperation.newBuilder().setCreate(experiment).build())
              .build();

      // 3. Create two ExperimentArm resources.
      // Control arm
      ExperimentArm controlArm =
          ExperimentArm.newBuilder()
              .setExperiment(experimentTempId)
              .setName("Base Assets (Control)")
              .setControl(true)
              .setTrafficSplit(50)
              .addCampaigns(campaignResourceName)
              .addAssetGroups(
                  AssetGroupInfo.newBuilder().setAssetGroup(assetGroupResourceName).build())
              .build();

      MutateOperation controlArmOperation =
          MutateOperation.newBuilder()
              .setExperimentArmOperation(
                  ExperimentArmOperation.newBuilder().setCreate(controlArm).build())
              .build();

      // Treatment arm
      ExperimentArm treatmentArm =
          ExperimentArm.newBuilder()
              .setExperiment(experimentTempId)
              .setName("New Assets (Treatment)")
              .setControl(false)
              .setTrafficSplit(50)
              .addCampaigns(campaignResourceName)
              .addAssetGroups(
                  AssetGroupInfo.newBuilder()
                      .setAssetGroup(assetGroupResourceName)
                      .addAssetGroupAssets(
                          AssetGroupAssetInfo.newBuilder()
                              .setAsset(asset1TempId)
                              .setFieldType(AssetFieldType.HEADLINE)
                              .build())
                      .addAssetGroupAssets(
                          AssetGroupAssetInfo.newBuilder()
                              .setAsset(asset2TempId)
                              .setFieldType(AssetFieldType.MARKETING_IMAGE)
                              .build())
                      .build())
              .build();

      MutateOperation treatmentArmOperation =
          MutateOperation.newBuilder()
              .setExperimentArmOperation(
                  ExperimentArmOperation.newBuilder().setCreate(treatmentArm).build())
              .build();

      // 4. Create AssetGroupAssets linking the assets to the asset group.
      AssetGroupAsset assetGroupAsset1 =
          AssetGroupAsset.newBuilder()
              .setAssetGroup(assetGroupResourceName)
              .setAsset(asset1TempId)
              .setFieldType(AssetFieldType.HEADLINE)
              .setStatus(AssetLinkStatus.PAUSED)
              .build();

      MutateOperation assetGroupAssetOperation1 =
          MutateOperation.newBuilder()
              .setAssetGroupAssetOperation(
                  AssetGroupAssetOperation.newBuilder().setCreate(assetGroupAsset1).build())
              .build();

      AssetGroupAsset assetGroupAsset2 =
          AssetGroupAsset.newBuilder()
              .setAssetGroup(assetGroupResourceName)
              .setAsset(asset2TempId)
              .setFieldType(AssetFieldType.MARKETING_IMAGE)
              .setStatus(AssetLinkStatus.PAUSED)
              .build();

      MutateOperation assetGroupAssetOperation2 =
          MutateOperation.newBuilder()
              .setAssetGroupAssetOperation(
                  AssetGroupAssetOperation.newBuilder().setCreate(assetGroupAsset2).build())
              .build();

      // Send all operations in a single Mutate request.
      // The operations must be in this specific order.
      MutateGoogleAdsRequest mutateRequest =
          MutateGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .addMutateOperations(textAssetOperation)
              .addMutateOperations(imageAssetOperation)
              .addMutateOperations(experimentOperation)
              .addMutateOperations(assetGroupAssetOperation1)
              .addMutateOperations(assetGroupAssetOperation2)
              .addMutateOperations(controlArmOperation)
              .addMutateOperations(treatmentArmOperation)
              .build();

      MutateGoogleAdsResponse response = googleAdsServiceClient.mutate(mutateRequest);
      // [END create_asset_optimization_experiment_1]

      // Print the results.
      System.out.printf(
          "Created headline asset: %s%n",
          response.getMutateOperationResponses(0).getAssetResult().getResourceName());
      System.out.printf(
          "Created image asset: %s%n",
          response.getMutateOperationResponses(1).getAssetResult().getResourceName());
      System.out.printf(
          "Created experiment: %s%n",
          response.getMutateOperationResponses(2).getExperimentResult().getResourceName());
      System.out.printf(
          "Created asset group asset for headline: %s%n",
          response.getMutateOperationResponses(3).getAssetGroupAssetResult().getResourceName());
      System.out.printf(
          "Created asset group asset for image: %s%n",
          response.getMutateOperationResponses(4).getAssetGroupAssetResult().getResourceName());
      System.out.printf(
          "Created control arm: %s%n",
          response.getMutateOperationResponses(5).getExperimentArmResult().getResourceName());
      System.out.printf(
          "Created treatment arm: %s%n",
          response.getMutateOperationResponses(6).getExperimentArmResult().getResourceName());
    }
  }
}

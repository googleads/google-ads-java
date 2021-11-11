// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
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
import com.google.ads.googleads.v9.enums.CampaignExperimentTrafficSplitTypeEnum.CampaignExperimentTrafficSplitType;
import com.google.ads.googleads.v9.errors.GoogleAdsError;
import com.google.ads.googleads.v9.errors.GoogleAdsException;
import com.google.ads.googleads.v9.resources.CampaignExperiment;
import com.google.ads.googleads.v9.services.CampaignExperimentServiceClient;
import com.google.ads.googleads.v9.services.CreateCampaignExperimentMetadata;
import com.google.ads.googleads.v9.services.GoogleAdsRow;
import com.google.ads.googleads.v9.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v9.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v9.utils.ResourceNames;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.protobuf.Empty;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/** Adds a campaign experiment for a draft campaign. */
public class CreateCampaignExperiment {
  public static class CreateCampaignExperimentParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    public long customerId;

    @Parameter(names = ArgumentNames.BASE_CAMPAIGN_ID, required = true)
    public long baseCampaignId;

    @Parameter(names = ArgumentNames.DRAFT_ID, required = true)
    public long draftId;
  }

  public static void main(String[] args) {
    CreateCampaignExperimentParams params = new CreateCampaignExperimentParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.baseCampaignId = Long.valueOf("INSERT_CAMPAIGN_ID_HERE");
      params.draftId = Long.parseLong("INSERT_DRAFT_ID_HERE");
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
      new CreateCampaignExperiment()
          .runExample(googleAdsClient, params.customerId, params.baseCampaignId, params.draftId);
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
   * @param googleAdsClient the API client to use.
   * @param customerId the customer ID to operate on.
   * @param baseCampaignId the original campaign ID.
   * @param draftId the ID of a draft campaign.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, long baseCampaignId, long draftId) {
    // Creates the campaign experiment. Here we obtain a metadata object, rather than the full
    // entity. This is because the experiment is created asynchronously via the long running
    // operations API. We can use the information in the metadata to retrieve the entity, if
    // required.
    CreateCampaignExperimentMetadata metadata =
        createExperiment(googleAdsClient, customerId, baseCampaignId, draftId);

    // Logs the created resource name.
    System.out.printf(
        "Created campaign experiment with resource name: %s%n", metadata.getCampaignExperiment());

    // Prints additional details about the status of the experiment.
    printExperimentDetails(googleAdsClient, customerId, metadata);
  }

  /**
   * Creates an experiment by issuing an asynchronous operation and immediately blocking to get the
   * result.
   *
   * @param googleAdsClient the API client to use.
   * @param customerId the customer ID to operate on.
   * @param baseCampaignId the original campaign ID.
   * @param draftId the draft campaign ID.
   * @return a newly created experiment.
   */
  private CreateCampaignExperimentMetadata createExperiment(
      GoogleAdsClient googleAdsClient, long customerId, long baseCampaignId, long draftId) {
    // Defines the experiment to be created.
    CampaignExperiment experiment =
        CampaignExperiment.newBuilder()
            .setCampaignDraft(ResourceNames.campaignDraft(customerId, baseCampaignId, draftId))
            .setName("Campaign experiment #" + getPrintableDateTime())
            .setTrafficSplitPercent(50)
            .setTrafficSplitType(CampaignExperimentTrafficSplitType.RANDOM_QUERY)
            .build();

    // Creates an API service client.
    try (CampaignExperimentServiceClient campaignExperimentServiceClient =
        googleAdsClient.getLatestVersion().createCampaignExperimentServiceClient()) {
      // Issues the create request.
      OperationFuture<Empty, CreateCampaignExperimentMetadata> campaignExperimentAsync =
          campaignExperimentServiceClient.createCampaignExperimentAsync(
              String.valueOf(customerId), experiment);

      // Block on the long running (i.e. async) operation result.
      try {
        return campaignExperimentAsync.getMetadata().get();
      } catch (InterruptedException | ExecutionException e) {
        throw new RuntimeException("Create operation failed", e);
      }
    }
  }

  /**
   * Retrieves a CampaignExperiment and prints associated information.
   *
   * @param googleAdsClient the API client to use.
   * @param customerId the customer ID to use.
   * @param metadata the experiment to retrieve information from.
   */
  private void printExperimentDetails(
      GoogleAdsClient googleAdsClient, long customerId, CreateCampaignExperimentMetadata metadata) {
    // Defines a basic query to retrieve the experiment.
    String query =
        "SELECT campaign_experiment.experiment_campaign"
            + " FROM campaign_experiment"
            + " WHERE campaign_experiment.resource_name = '"
            + metadata.getCampaignExperiment()
            + "'";

    // Creates an API client.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Issues a search request.
      SearchPagedResponse response =
          googleAdsServiceClient.search(String.valueOf(customerId), query);

      // Iterates through the results and prints the information returned.
      for (GoogleAdsRow row : response.iterateAll()) {
        System.out.printf(
            "Experiment campaign with resource name = '%s' created successfully.%n",
            row.getCampaignExperiment().getResourceName());
      }
    }
  }
}

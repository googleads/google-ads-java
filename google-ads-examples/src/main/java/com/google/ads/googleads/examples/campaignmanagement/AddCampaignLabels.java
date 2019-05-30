// Copyright 2019 Google LLC
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
import com.google.ads.googleads.v2.resources.CampaignLabel;
import com.google.ads.googleads.v2.services.CampaignLabelServiceClient;
import com.google.ads.googleads.v2.services.CampaignLabelOperation;
import com.google.ads.googleads.v2.services.MutateCampaignLabelsResponse;
import com.google.ads.googleads.v2.services.MutateCampaignLabelResult;
import com.google.ads.googleads.v2.utils.ResourceNames;
import com.google.ads.googleads.v2.errors.GoogleAdsError;
import com.google.ads.googleads.v2.errors.GoogleAdsException;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Adds a campaign label to a list of campaigns. */
public class AddCampaignLabels {

  private static class AddCampaignLabelsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private List<Long> campaignIds = new ArrayList<>();

    @Parameter(names = ArgumentNames.LABEL_ID, required = true)
    private Long labelId;
  }

  public static void main(String[] args) throws IOException {
    AddCampaignLabelsParams params = new AddCampaignLabelsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.campaignIds =
          Arrays.asList(
              Long.valueOf("INSERT_CAMPAIGN_ID_HERE"), Long.valueOf("INSERT_CAMPAIGN_ID_HERE"));
      params.labelId = Long.parseLong("INSERT_LABEL_ID_HERE");
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
      new AddCampaignLabels().runExample(googleAdsClient, params);
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
   * @param params the ads entities to use when running the example.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  public void runExample(GoogleAdsClient googleAdsClient, AddCampaignLabelsParams params) {
    // Gets the resource name of the label to be added across all given campaigns.
    String labelResourceName = ResourceNames.label(params.customerId, params.labelId);

    List<CampaignLabelOperation> operations = new ArrayList(params.campaignIds.size());
    // Creates a campaign label operation for each campaign.
    for (Long campaignId : params.campaignIds) {
      // Gets the resource name of the given campaign.
      String campaignResourceName = ResourceNames.campaign(params.customerId, campaignId);
      // Creates the campaign label.
      CampaignLabel campaignLabel =
          CampaignLabel.newBuilder()
              .setCampaign(StringValue.of(campaignResourceName))
              .setLabel(StringValue.of(labelResourceName))
              .build();

      operations.add(CampaignLabelOperation.newBuilder().setCreate(campaignLabel).build());
    }

    try (CampaignLabelServiceClient campaignLabelServiceClient =
        googleAdsClient.getLatestVersion().createCampaignLabelServiceClient()) {
      MutateCampaignLabelsResponse response =
          campaignLabelServiceClient.mutateCampaignLabels(
              Long.toString(params.customerId), operations);
      System.out.printf("Added %d campaign labels:%n", response.getResultsCount());
      for (MutateCampaignLabelResult result : response.getResultsList()) {
        System.out.println(result.getResourceName());
      }
    }
  }
}

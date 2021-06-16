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
import com.google.ads.googleads.v8.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v8.errors.GoogleAdsError;
import com.google.ads.googleads.v8.errors.GoogleAdsException;
import com.google.ads.googleads.v8.resources.CampaignBudget;
import com.google.ads.googleads.v8.services.CampaignBudgetOperation;
import com.google.ads.googleads.v8.services.CampaignBudgetServiceClient;
import com.google.ads.googleads.v8.services.CampaignExperimentServiceClient;
import com.google.ads.googleads.v8.services.GraduateCampaignExperimentResponse;
import com.google.ads.googleads.v8.services.MutateCampaignBudgetsResponse;
import com.google.ads.googleads.v8.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Illustrates how to graduate a campaign experiment. */
public class GraduateCampaignExperiment {

  private static class GraduateCampaignExperimentParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_EXPERIMENT_ID, required = true)
    private Long experimentId;
  }

  public static void main(String[] args) {
    GraduateCampaignExperimentParams params = new GraduateCampaignExperimentParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.experimentId = Long.parseLong("INSERT_EXPERIMENT_ID_HERE");
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
      new GraduateCampaignExperiment()
          .runExample(googleAdsClient, params.customerId, params.experimentId);
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
   * @param googleAdsClient the client to use.
   * @param customerId the customer ID.
   * @param experimentId the experiment ID.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long experimentId) {
    // Graduating a campaign experiment requires a new budget. Since the budget for the base
    // campaign has explicitly_shared set to false, the budget cannot be shared with the campaign
    // after it is made independent by graduation.
    CampaignBudget budget =
        CampaignBudget.newBuilder()
            .setName("Budget #" + getPrintableDateTime())
            .setAmountMicros(50_000_000)
            .setDeliveryMethod(BudgetDeliveryMethod.STANDARD)
            .build();
    // Creates an operation to add the new budget.
    CampaignBudgetOperation operation =
        CampaignBudgetOperation.newBuilder().setCreate(budget).build();

    // Creates the budget.
    String budgetResourceName;
    try (CampaignBudgetServiceClient budgetServiceClient =
        googleAdsClient.getLatestVersion().createCampaignBudgetServiceClient()) {
      MutateCampaignBudgetsResponse response =
          budgetServiceClient.mutateCampaignBudgets(
              String.valueOf(customerId), ImmutableList.of(operation));
      budgetResourceName = response.getResults(0).getResourceName();
      System.out.printf(
          "Created new budget %s to add to experiment during graduation.%n", budgetResourceName);
    }

    // Graduates the experiment, given its new budget.
    try (CampaignExperimentServiceClient experimentServiceClient =
        googleAdsClient.getLatestVersion().createCampaignExperimentServiceClient()) {
      GraduateCampaignExperimentResponse response =
          experimentServiceClient.graduateCampaignExperiment(
              ResourceNames.campaignExperiment(customerId, experimentId), budgetResourceName);
      System.out.printf("Campaign %s is now graduated.%n", response.getGraduatedCampaign());
    }
  }
}

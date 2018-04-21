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

package com.google.ads.googleads.examples.targeting;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.GoogleAdsException;
import com.google.ads.googleads.v0.common.KeywordInfo;
import com.google.ads.googleads.v0.enums.KeywordMatchTypeEnum.KeywordMatchType;
import com.google.ads.googleads.v0.errors.GoogleAdsError;
import com.google.ads.googleads.v0.resources.CampaignCriterion;
import com.google.ads.googleads.v0.resources.CampaignName;
import com.google.ads.googleads.v0.services.CampaignCriterionOperation;
import com.google.ads.googleads.v0.services.CampaignCriterionServiceClient;
import com.google.ads.googleads.v0.services.MutateCampaignCriteriaResponse;
import com.google.ads.googleads.v0.services.MutateCampaignCriterionResult;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.BoolValue;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * This example adds campaign targeting criteria. To get campaign targeting criteria, run
 * GetCampaignTargetingCriteria.java.
 */
public class AddCampaignTargetingCriteria {

  private static class AddCampaignTargetingCriteriaParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;
  }

  public static void main(String[] args) throws IOException {
    AddCampaignTargetingCriteriaParams params = new AddCampaignTargetingCriteriaParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
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
      new AddCampaignTargetingCriteria()
          .runExample(googleAdsClient, params.customerId, params.campaignId);
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
   * @param customerId the client customer ID.
   * @param campaignId the campaign ID.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long campaignId) {
    String campaignResourceName =
        CampaignName.format(Long.toString(customerId), Long.toString(campaignId));

    // Create a negative keyword as a campaign targeting criterion.
    CampaignCriterion campaignCriterion1 =
        CampaignCriterion.newBuilder()
            .setCampaign(StringValue.of(campaignResourceName))
            .setNegative(BoolValue.of(true))
            .setKeyword(
                KeywordInfo.newBuilder()
                    .setMatchType(KeywordMatchType.BROAD)
                    .setText(StringValue.of("jupiter cruise"))
                    .build())
            .build();

    // Create another negative keyword as a campaign targeting criterion.
    CampaignCriterion campaignCriterion2 =
        CampaignCriterion.newBuilder()
            .setCampaign(StringValue.of(campaignResourceName))
            .setNegative(BoolValue.of(true))
            .setKeyword(
                KeywordInfo.newBuilder()
                    .setMatchType(KeywordMatchType.PHRASE)
                    .setText(StringValue.of("mars cruise"))
                    .build())
            .build();

    List<CampaignCriterionOperation> operations =
        ImmutableList.of(
            CampaignCriterionOperation.newBuilder().setCreate(campaignCriterion1).build(),
            CampaignCriterionOperation.newBuilder().setCreate(campaignCriterion2).build());

    try (CampaignCriterionServiceClient campaignCriterionServiceClient =
        googleAdsClient.getCampaignCriterionServiceClient()) {
      MutateCampaignCriteriaResponse response =
          campaignCriterionServiceClient.mutateCampaignCriteria(
              Long.toString(customerId), operations);
      System.out.printf("Added %d campaign criteria:%n", response.getResultsCount());
      for (MutateCampaignCriterionResult result : response.getResultsList()) {
        System.out.println(result.getResourceName());
      }
    }
  }
}

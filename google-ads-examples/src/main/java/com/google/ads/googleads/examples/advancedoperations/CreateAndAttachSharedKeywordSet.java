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

package com.google.ads.googleads.examples.advancedoperations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v3.common.KeywordInfo;
import com.google.ads.googleads.v3.enums.KeywordMatchTypeEnum.KeywordMatchType;
import com.google.ads.googleads.v3.enums.SharedSetTypeEnum.SharedSetType;
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.ads.googleads.v3.resources.CampaignName;
import com.google.ads.googleads.v3.resources.CampaignSharedSet;
import com.google.ads.googleads.v3.resources.SharedCriterion;
import com.google.ads.googleads.v3.resources.SharedSet;
import com.google.ads.googleads.v3.services.CampaignSharedSetOperation;
import com.google.ads.googleads.v3.services.CampaignSharedSetServiceClient;
import com.google.ads.googleads.v3.services.MutateCampaignSharedSetsResponse;
import com.google.ads.googleads.v3.services.MutateSharedCriteriaResponse;
import com.google.ads.googleads.v3.services.MutateSharedCriterionResult;
import com.google.ads.googleads.v3.services.MutateSharedSetsResponse;
import com.google.ads.googleads.v3.services.SharedCriterionOperation;
import com.google.ads.googleads.v3.services.SharedCriterionServiceClient;
import com.google.ads.googleads.v3.services.SharedSetOperation;
import com.google.ads.googleads.v3.services.SharedSetServiceClient;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Creates a shared list of negative broad match keywords. It then attaches them to a campaign. */
public class CreateAndAttachSharedKeywordSet {

  private static class CreateAndAttachSharedKeywordSetParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;
  }

  public static void main(String[] args) throws IOException {
    CreateAndAttachSharedKeywordSetParams params = new CreateAndAttachSharedKeywordSetParams();
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
      new CreateAndAttachSharedKeywordSet()
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

    // Creates a keywords list to create a shared set of.
    List<String> keywords = Arrays.asList("mars cruise", "mars hotels");

    // Creates shared negative keyword set.
    SharedSet sharedSet =
        SharedSet.newBuilder()
            .setName(StringValue.of("API Negative keyword list - " + System.currentTimeMillis()))
            .setType(SharedSetType.NEGATIVE_KEYWORDS)
            .build();

    SharedSetOperation operation = SharedSetOperation.newBuilder().setCreate(sharedSet).build();

    String sharedSetResourceName;
    try (SharedSetServiceClient sharedSetServiceClient =
        googleAdsClient.getLatestVersion().createSharedSetServiceClient()) {
      MutateSharedSetsResponse response =
          sharedSetServiceClient.mutateSharedSets(
              Long.toString(customerId), ImmutableList.of(operation));
      sharedSetResourceName = response.getResults(0).getResourceName();
      System.out.printf("Created shared set %s%n", sharedSetResourceName);
    }

    List<SharedCriterionOperation> sharedCriterionOperations = new ArrayList<>();
    for (String keyword : keywords) {
      SharedCriterion sharedCriterion =
          SharedCriterion.newBuilder()
              .setKeyword(
                  KeywordInfo.newBuilder()
                      .setText(StringValue.of(keyword))
                      .setMatchType(KeywordMatchType.BROAD)
                      .build())
              .setSharedSet(StringValue.of(sharedSetResourceName))
              .build();

      SharedCriterionOperation sharedCriterionOperation =
          SharedCriterionOperation.newBuilder().setCreate(sharedCriterion).build();
      sharedCriterionOperations.add(sharedCriterionOperation);
    }

    try (SharedCriterionServiceClient sharedCriterionServiceClient =
        googleAdsClient.getLatestVersion().createSharedCriterionServiceClient()) {
      MutateSharedCriteriaResponse response =
          sharedCriterionServiceClient.mutateSharedCriteria(
              Long.toString(customerId), sharedCriterionOperations);
      System.out.printf("Added %d shared criteria:%n", response.getResultsCount());
      for (MutateSharedCriterionResult result : response.getResultsList()) {
        System.out.printf("\t%s%n", result.getResourceName());
      }
    }

    String campaignResourceName =
        CampaignName.format(Long.toString(customerId), Long.toString(campaignId));
    CampaignSharedSet campaignSharedSet =
        CampaignSharedSet.newBuilder()
            .setCampaign(StringValue.of(campaignResourceName))
            .setSharedSet(StringValue.of(sharedSetResourceName))
            .build();

    CampaignSharedSetOperation campaignSharedSetOperation =
        CampaignSharedSetOperation.newBuilder().setCreate(campaignSharedSet).build();

    try (CampaignSharedSetServiceClient campaignSharedSetServiceClient =
        googleAdsClient.getLatestVersion().createCampaignSharedSetServiceClient()) {
      MutateCampaignSharedSetsResponse response =
          campaignSharedSetServiceClient.mutateCampaignSharedSets(
              Long.toString(customerId), ImmutableList.of(campaignSharedSetOperation));
      String campaignSharedSetResourceName = response.getResults(0).getResourceName();
      System.out.printf("Created campaign shared set %s%n", campaignSharedSetResourceName);
    }
  }
}

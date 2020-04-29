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
import com.google.ads.googleads.v3.common.ExpandedTextAdInfo;
import com.google.ads.googleads.v3.common.KeywordInfo;
import com.google.ads.googleads.v3.common.ManualCpc;
import com.google.ads.googleads.v3.enums.AdGroupAdStatusEnum.AdGroupAdStatus;
import com.google.ads.googleads.v3.enums.AdGroupCriterionStatusEnum.AdGroupCriterionStatus;
import com.google.ads.googleads.v3.enums.AdGroupTypeEnum.AdGroupType;
import com.google.ads.googleads.v3.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType;
import com.google.ads.googleads.v3.enums.BudgetDeliveryMethodEnum.BudgetDeliveryMethod;
import com.google.ads.googleads.v3.enums.CampaignStatusEnum.CampaignStatus;
import com.google.ads.googleads.v3.enums.KeywordMatchTypeEnum.KeywordMatchType;
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.ads.googleads.v3.resources.Ad;
import com.google.ads.googleads.v3.resources.AdGroup;
import com.google.ads.googleads.v3.resources.AdGroupAd;
import com.google.ads.googleads.v3.resources.AdGroupCriterion;
import com.google.ads.googleads.v3.resources.Campaign;
import com.google.ads.googleads.v3.resources.CampaignBudget;
import com.google.ads.googleads.v3.resources.CampaignCriterion;
import com.google.ads.googleads.v3.services.AdGroupAdOperation;
import com.google.ads.googleads.v3.services.AdGroupCriterionOperation;
import com.google.ads.googleads.v3.services.AdGroupOperation;
import com.google.ads.googleads.v3.services.AddMutateJobOperationsRequest;
import com.google.ads.googleads.v3.services.AddMutateJobOperationsResponse;
import com.google.ads.googleads.v3.services.CampaignBudgetOperation;
import com.google.ads.googleads.v3.services.CampaignCriterionOperation;
import com.google.ads.googleads.v3.services.CampaignOperation;
import com.google.ads.googleads.v3.services.ListMutateJobResultsRequest;
import com.google.ads.googleads.v3.services.MutateJobResult;
import com.google.ads.googleads.v3.services.MutateJobServiceClient;
import com.google.ads.googleads.v3.services.MutateJobServiceClient.ListMutateJobResultsPagedResponse;
import com.google.ads.googleads.v3.services.MutateOperation;
import com.google.ads.googleads.v3.services.MutateOperationResponse.ResponseCase;
import com.google.ads.googleads.v3.utils.ResourceNames;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.protobuf.BoolValue;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * This example adds complete campaigns including campaign budgets, campaigns, ad groups and
 * keywords using MutateJobService.
 */
public class AddCompleteCampaignsUsingMutateJob {
  private static final int NUMBER_OF_CAMPAIGNS_TO_ADD = 2;

  private static final int NUMBER_OF_AD_GROUPS_TO_ADD = 2;

  private static final int NUMBER_OF_KEYWORDS_TO_ADD = 4;

  private static final int MAX_TOTAL_POLL_INTERVAL_SECONDS = 60;

  private static final int PAGE_SIZE = 1000;

  /** The negative temporary ID used in mutate job operations. */
  private static long temporaryId = -1;

  private static class AddCompleteCampaignsUsingMutateJobParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) throws IOException {
    AddCompleteCampaignsUsingMutateJobParams params =
        new AddCompleteCampaignsUsingMutateJobParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
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
      new AddCompleteCampaignsUsingMutateJob().runExample(googleAdsClient, params.customerId);
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
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    try (MutateJobServiceClient mutateJobServiceClient =
        googleAdsClient.getLatestVersion().createMutateJobServiceClient()) {
      String mutateJobResourceName = createMutateJob(mutateJobServiceClient, customerId);
      addAllMutateJobOperations(mutateJobServiceClient, customerId, mutateJobResourceName);
      OperationFuture operationResponse =
          runMutateJob(mutateJobServiceClient, mutateJobResourceName);
      pollMutateJob(operationResponse);
      fetchAndPrintResults(mutateJobServiceClient, mutateJobResourceName);
    }
  }

  /**
   * Creates a new mutate job for the specified customer ID.
   *
   * @param mutateJobServiceClient the mutate job service client.
   * @param customerId the client customer ID.
   * @return the resource name of the created mutate job.
   */
  private String createMutateJob(MutateJobServiceClient mutateJobServiceClient, long customerId) {
    String mutateJobResourceName =
        mutateJobServiceClient.createMutateJob(Long.toString(customerId)).getResourceName();
    System.out.printf("Created a mutate job with resource name: '%s'.%n", mutateJobResourceName);

    return mutateJobResourceName;
  }

  /**
   * Adds all mutate job operations to the mutate job. As this is the first time for this mutate
   * job, the sequence token is not set. The response will contain the next sequence token that you
   * can use to upload more operations in the future.
   *
   * @param mutateJobServiceClient the mutate job service client.
   * @param customerId the client customer ID.
   * @param mutateJobResourceName the resource name of mutate job to which the mutate job operations
   *     will be added.
   */
  private void addAllMutateJobOperations(
      MutateJobServiceClient mutateJobServiceClient,
      long customerId,
      String mutateJobResourceName) {
    AddMutateJobOperationsResponse response =
        mutateJobServiceClient.addMutateJobOperations(
            AddMutateJobOperationsRequest.newBuilder()
                .setResourceName(mutateJobResourceName)
                .addAllMutateOperations(buildAllOperations(customerId))
                .build());
    System.out.printf(
        "%d mutate operations have been added so far.%n", response.getTotalOperations());

    // You can use this next sequence token for calling addMutateJobOperations() next time.
    System.out.printf(
        "Next sequence token for adding next operations is '%s'.%n",
        response.getNextSequenceToken());
  }

  /**
   * Requests the API to run the mutate job for executing all uploaded mutate job operations.
   *
   * @param mutateJobServiceClient the mutate job service client.
   * @param mutateJobResourceName the resource name of mutate job to be run.
   * @return the operation response from running mutate job.
   */
  private OperationFuture runMutateJob(
      MutateJobServiceClient mutateJobServiceClient, String mutateJobResourceName) {
    OperationFuture operationResponse =
        mutateJobServiceClient.runMutateJobAsync(mutateJobResourceName);
    System.out.printf(
        "Mutate job with resource name '%s' has been executed.%n", mutateJobResourceName);

    return operationResponse;
  }

  /**
   * Polls the server until the mutate job execution finishes by setting the total time to wait
   * before time-out.
   *
   * @param operationResponse the operation response used to poll the server.
   */
  private void pollMutateJob(OperationFuture operationResponse) {
    try {
      operationResponse.get(MAX_TOTAL_POLL_INTERVAL_SECONDS, TimeUnit.SECONDS);
    } catch (InterruptedException | ExecutionException | TimeoutException e) {
      System.err.printf("Failed polling the mutate job. Exception: %s%n", e);
      System.exit(1);
    }
  }

  /**
   * Prints all the results from running the mutate job.
   *
   * @param mutateJobServiceClient the mutate job service client.
   * @param mutateJobResourceName the resource name of mutate job to get its results.
   */
  private void fetchAndPrintResults(
      MutateJobServiceClient mutateJobServiceClient, String mutateJobResourceName) {
    System.out.printf(
        "Mutate job with resource name '%s' has finished. Now, printing its results...%n",
        mutateJobResourceName);
    // Gets all the results from running mutate job and prints their information.
    ListMutateJobResultsPagedResponse mutateJobResults =
        mutateJobServiceClient.listMutateJobResults(
            ListMutateJobResultsRequest.newBuilder()
                .setResourceName(mutateJobResourceName)
                .setPageSize(PAGE_SIZE)
                .build());
    for (MutateJobResult mutateJobResult : mutateJobResults.iterateAll()) {
      System.out.printf(
          "Mutate job #%d has a status '%s' and response of type '%s'.%n",
          mutateJobResult.getOperationIndex(),
          mutateJobResult.getStatus().getMessage().isEmpty()
              ? "N/A"
              : mutateJobResult.getStatus().getMessage(),
          mutateJobResult
                  .getMutateOperationResponse()
                  .getResponseCase()
                  .equals(ResponseCase.RESPONSE_NOT_SET)
              ? "N/A"
              : mutateJobResult.getMutateOperationResponse().getResponseCase());
    }
  }

  /**
   * Builds all operations for creating a complete campaign and return an array of their
   * corresponding mutate operations.
   *
   * @param customerId the client customer ID.
   * @return the mutate operations to be added to a mutate job.
   */
  private List<MutateOperation> buildAllOperations(long customerId) {
    List<MutateOperation> mutateOperations = new ArrayList<>();

    // Creates a new campaign budget operation and adds it to the array of mutate operations.
    CampaignBudgetOperation campaignBudgetOperation = buildCampaignBudgetOperation(customerId);
    mutateOperations.add(
        MutateOperation.newBuilder().setCampaignBudgetOperation(campaignBudgetOperation).build());

    // Creates new campaign operations and adds them to the array of mutate operations.
    List<CampaignOperation> campaignOperations =
        buildCampaignOperations(customerId, campaignBudgetOperation.getCreate().getResourceName());
    for (CampaignOperation campaignOperation : campaignOperations) {
      mutateOperations.add(
          MutateOperation.newBuilder().setCampaignOperation(campaignOperation).build());
    }

    // Creates new campaign criterion operations and adds them to the array of mutate operations.
    List<CampaignCriterionOperation> campaignCriterionOperations =
        buildCampaignCriterionOperations(campaignOperations);
    for (CampaignCriterionOperation campaignCriterionOperation : campaignCriterionOperations) {
      mutateOperations.add(
          MutateOperation.newBuilder()
              .setCampaignCriterionOperation(campaignCriterionOperation)
              .build());
    }

    // Creates new ad group operations and adds them to the array of mutate operations.
    List<AdGroupOperation> adGroupOperations =
        buildAdGroupOperations(customerId, campaignOperations);
    for (AdGroupOperation adGroupOperation : adGroupOperations) {
      mutateOperations.add(
          MutateOperation.newBuilder().setAdGroupOperation(adGroupOperation).build());
    }

    // Creates new ad group criterion operations and adds them to the array of mutate operations.
    List<AdGroupCriterionOperation> adGroupCriterionOperations =
        buildAdGroupCriterionOperations(adGroupOperations);
    for (AdGroupCriterionOperation adGroupCriterionOperation : adGroupCriterionOperations) {
      mutateOperations.add(
          MutateOperation.newBuilder()
              .setAdGroupCriterionOperation(adGroupCriterionOperation)
              .build());
    }

    // Creates new ad group ad operations and adds them to the array of mutate operations.
    List<AdGroupAdOperation> adGroupAdOperations = buildAdGroupAdOperations(adGroupOperations);
    for (AdGroupAdOperation adGroupAdOperation : adGroupAdOperations) {
      mutateOperations.add(
          MutateOperation.newBuilder().setAdGroupAdOperation(adGroupAdOperation).build());
    }

    return mutateOperations;
  }

  /**
   * Builds a new campaign budget operation for the specified customer ID.
   *
   * @param customerId the client customer ID.
   * @return the campaign budget operation.
   */
  private CampaignBudgetOperation buildCampaignBudgetOperation(long customerId) {
    // Creates a campaign budget.
    CampaignBudget budget =
        CampaignBudget.newBuilder()
            // Creates a resource name using the temporary ID.
            .setResourceName(ResourceNames.campaignBudget(customerId, getNextTemporaryId()))
            .setName(StringValue.of("Interplanetary Cruise Budget #" + System.currentTimeMillis()))
            .setDeliveryMethod(BudgetDeliveryMethod.STANDARD)
            .setAmountMicros(Int64Value.of(5_000_000))
            .build();

    // Creates a campaign budget operation.
    return CampaignBudgetOperation.newBuilder().setCreate(budget).build();
  }

  /**
   * Builds new campaign operations for the specified customer ID.
   *
   * @param customerId the client customer ID.
   * @param campaignBudgetResourceName the resource name of campaign budget to be used to create
   *     campaigns.
   * @return the campaign operations.
   */
  private List<CampaignOperation> buildCampaignOperations(
      long customerId, String campaignBudgetResourceName) {
    List<CampaignOperation> operations = new ArrayList<>();

    for (int i = 0; i < NUMBER_OF_CAMPAIGNS_TO_ADD; i++) {
      // Creates a campaign.
      long campaignId = getNextTemporaryId();
      Campaign campaign =
          Campaign.newBuilder()
              // Creates a resource name using the temporary ID.
              .setResourceName(ResourceNames.campaign(customerId, campaignId))
              .setName(
                  StringValue.of(
                      "Mutate job campaign #" + System.currentTimeMillis() + "." + campaignId))
              .setAdvertisingChannelType(AdvertisingChannelType.SEARCH)
              // Recommendation: Set the campaign to PAUSED when creating it to prevent
              // the ads from immediately serving. Set to ENABLED once you've added
              // targeting and the ads are ready to serve.
              .setStatus(CampaignStatus.PAUSED)
              // Sets the bidding strategy and budget.
              .setManualCpc(ManualCpc.newBuilder().build())
              .setCampaignBudget(StringValue.of(campaignBudgetResourceName))
              .build();

      // Creates a campaign operation and adds it to the operations list.
      CampaignOperation op = CampaignOperation.newBuilder().setCreate(campaign).build();
      operations.add(op);
    }

    return operations;
  }

  /**
   * Builds new campaign criterion operations for creating negative campaign criteria (as keywords).
   *
   * @param campaignOperations the campaign operations to be used to create campaign criteria.
   * @return the campaign criterion operations.
   */
  private List<CampaignCriterionOperation> buildCampaignCriterionOperations(
      List<CampaignOperation> campaignOperations) {
    List<CampaignCriterionOperation> operations = new ArrayList<>();

    for (CampaignOperation campaignOperation : campaignOperations) {
      // Creates a campaign criterion.
      CampaignCriterion campaignCriterion =
          CampaignCriterion.newBuilder()
              .setKeyword(
                  KeywordInfo.newBuilder()
                      .setText(StringValue.of("venus"))
                      .setMatchType(KeywordMatchType.BROAD)
                      .build())
              // Sets the campaign criterion as a negative criterion.
              .setNegative(BoolValue.of(Boolean.TRUE))
              .setCampaign(StringValue.of(campaignOperation.getCreate().getResourceName()))
              .build();

      // Creates a campaign criterion operation and adds it to the operations list.
      CampaignCriterionOperation op =
          CampaignCriterionOperation.newBuilder().setCreate(campaignCriterion).build();
      operations.add(op);
    }

    return operations;
  }

  /**
   * Builds new ad group operations for the specified customer ID.
   *
   * @param customerId the client customer ID.
   * @param campaignOperations the campaign operations to be used to create ad groups.
   * @return the ad group operations.
   */
  private List<AdGroupOperation> buildAdGroupOperations(
      long customerId, List<CampaignOperation> campaignOperations) {
    List<AdGroupOperation> operations = new ArrayList<>();

    for (CampaignOperation campaignOperation : campaignOperations) {
      for (int i = 0; i < NUMBER_OF_AD_GROUPS_TO_ADD; i++) {
        // Creates an ad group.
        long adGroupId = getNextTemporaryId();
        AdGroup adGroup =
            AdGroup.newBuilder()
                // Creates a resource name using the temporary ID.
                .setResourceName(ResourceNames.adGroup(customerId, adGroupId))
                .setName(
                    StringValue.of(
                        "Mutate job ad group #" + System.currentTimeMillis() + "." + adGroupId))
                .setCampaign(StringValue.of(campaignOperation.getCreate().getResourceName()))
                .setType(AdGroupType.SEARCH_STANDARD)
                .setCpcBidMicros(Int64Value.of(10_000_000))
                .build();

        // Creates an ad group operation and adds it to the operations list.
        AdGroupOperation op = AdGroupOperation.newBuilder().setCreate(adGroup).build();
        operations.add(op);
      }
    }

    return operations;
  }

  /**
   * Builds new ad group criterion operations for creating keywords. 50% of keywords are created
   * with some invalid characters to demonstrate how MutateJobService returns information about such
   * errors.
   *
   * @param adGroupOperations the ad group operations to be used to create ad group criteria.
   * @return the ad group criterion operations.
   */
  private List<AdGroupCriterionOperation> buildAdGroupCriterionOperations(
      List<AdGroupOperation> adGroupOperations) {
    List<AdGroupCriterionOperation> operations = new ArrayList<>();

    for (AdGroupOperation adGroupOperation : adGroupOperations) {
      for (int i = 0; i < NUMBER_OF_KEYWORDS_TO_ADD; i++) {
        // Creates a keyword text by making 50% of keywords invalid to demonstrate error handling.
        String keywordText = "mars" + i;
        if (i % 2 == 0) {
          keywordText += "!!!";
        }
        // Creates an ad group criterion using the created keyword text.
        AdGroupCriterion adGroupCriterion =
            AdGroupCriterion.newBuilder()
                .setKeyword(
                    KeywordInfo.newBuilder()
                        .setText(StringValue.of(keywordText))
                        .setMatchType(KeywordMatchType.BROAD)
                        .build())
                .setAdGroup(StringValue.of(adGroupOperation.getCreate().getResourceName()))
                .setStatus(AdGroupCriterionStatus.ENABLED)
                .build();

        // Creates an ad group criterion operation and adds it to the operations list.
        AdGroupCriterionOperation op =
            AdGroupCriterionOperation.newBuilder().setCreate(adGroupCriterion).build();
        operations.add(op);
      }
    }

    return operations;
  }

  /**
   * Builds new ad group ad operations.
   *
   * @param adGroupOperations the ad group operations to be used to create ad group ads.
   * @return the ad group ad operations.
   */
  private List<AdGroupAdOperation> buildAdGroupAdOperations(
      List<AdGroupOperation> adGroupOperations) {
    List<AdGroupAdOperation> operations = new ArrayList<>();

    for (AdGroupOperation adGroupOperation : adGroupOperations) {
      // Creates an ad group ad.
      AdGroupAd adGroupAd =
          AdGroupAd.newBuilder()
              // Creates the expanded text ad info.
              .setAd(
                  Ad.newBuilder()
                      // Sets the expanded text ad info on an ad.
                      .setExpandedTextAd(
                          ExpandedTextAdInfo.newBuilder()
                              .setHeadlinePart1(
                                  StringValue.of("Cruise to Mars #" + System.currentTimeMillis()))
                              .setHeadlinePart2(StringValue.of("Best Space Cruise Line"))
                              .setDescription(StringValue.of("Buy your tickets now!"))
                              .build())
                      .addFinalUrls(StringValue.of("http://www.example.com"))
                      .build())
              .setAdGroup(StringValue.of(adGroupOperation.getCreate().getResourceName()))
              .setStatus(AdGroupAdStatus.PAUSED)
              .build();

      // Creates an ad group ad operation and adds it to the operations list.
      AdGroupAdOperation op = AdGroupAdOperation.newBuilder().setCreate(adGroupAd).build();
      operations.add(op);
    }

    return operations;
  }

  /**
   * Returns the next temporary ID and decreases it by one.
   *
   * @return the next temporary ID.
   */
  private long getNextTemporaryId() {
    return temporaryId--;
  }
}

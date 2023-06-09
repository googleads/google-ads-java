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
import com.google.ads.googleads.v14.enums.CriterionTypeEnum.CriterionType;
import com.google.ads.googleads.v14.errors.GoogleAdsError;
import com.google.ads.googleads.v14.errors.GoogleAdsException;
import com.google.ads.googleads.v14.resources.SharedCriterion;
import com.google.ads.googleads.v14.resources.SharedSet;
import com.google.ads.googleads.v14.services.GoogleAdsRow;
import com.google.ads.googleads.v14.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v14.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v14.services.MutateSharedCriteriaResponse;
import com.google.ads.googleads.v14.services.MutateSharedCriterionResult;
import com.google.ads.googleads.v14.services.SearchGoogleAdsRequest;
import com.google.ads.googleads.v14.services.SharedCriterionOperation;
import com.google.ads.googleads.v14.services.SharedCriterionServiceClient;
import com.google.common.base.Joiner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates how to find shared sets, how to find shared set criteria, and how to remove shared
 * set criteria.
 */
public class FindAndRemoveCriteriaFromSharedSet {

  private static final int PAGE_SIZE = 1_000;

  private static class FindAndRemoveCriteriaFromSharedSetParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;
  }

  public static void main(String[] args) throws IOException {
    FindAndRemoveCriteriaFromSharedSetParams params =
        new FindAndRemoveCriteriaFromSharedSetParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
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
      new FindAndRemoveCriteriaFromSharedSet()
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
      System.exit(1);
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

    List<Long> sharedSetIds = new ArrayList<>();
    List<String> criterionResourceNames = new ArrayList<>();

    // Retrieves all shared sets associated with the campaign.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      String searchQuery =
          String.format(
              "SELECT shared_set.id, shared_set.name FROM campaign_shared_set WHERE "
                  + "campaign.id = %d",
              campaignId);

      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setPageSize(PAGE_SIZE)
              .setQuery(searchQuery)
              .build();
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);
      for (GoogleAdsRow googleAdsRow : searchPagedResponse.iterateAll()) {
        SharedSet sharedSet = googleAdsRow.getSharedSet();
        System.out.printf(
            "Campaign shared set with ID %d and name '%s' was found.%n",
            sharedSet.getId(), sharedSet.getName());
        sharedSetIds.add(sharedSet.getId());
      }
    }

    // Retrieves shared criteria for all found shared sets.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      String searchQuery =
          String.format(
              "SELECT shared_criterion.type, shared_criterion.keyword.text, "
                  + "  shared_criterion.keyword.match_type, shared_set.id "
                  + "  FROM shared_criterion "
                  + "  WHERE shared_set.id IN (%s)",
              Joiner.on(",").join(sharedSetIds));

      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setPageSize(PAGE_SIZE)
              .setQuery(searchQuery)
              .build();
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);
      for (GoogleAdsRow googleAdsRow : searchPagedResponse.iterateAll()) {
        SharedCriterion sharedCriterion = googleAdsRow.getSharedCriterion();
        if (sharedCriterion.getType() == CriterionType.KEYWORD) {
          System.out.printf(
              "Shared criterion with resource name '%s' for negative keyword with text '%s' and "
                  + "match type '%s' was found.%n",
              sharedCriterion.getResourceName(),
              sharedCriterion.getKeyword().getText(),
              sharedCriterion.getKeyword().getMatchType());
        } else {
          System.out.printf(
              "Shared criterion with resource name '%s' was found.",
              sharedCriterion.getResourceName());
        }
        criterionResourceNames.add(sharedCriterion.getResourceName());
      }
    }

    // Removes the criteria.
    try (SharedCriterionServiceClient sharedCriterionServiceClient =
        googleAdsClient.getLatestVersion().createSharedCriterionServiceClient()) {
      List<SharedCriterionOperation> operations = new ArrayList<>();
      for (String criterionResourceName : criterionResourceNames) {
        SharedCriterionOperation operation =
            SharedCriterionOperation.newBuilder().setRemove(criterionResourceName).build();
        operations.add(operation);
      }
      // Sends the operation in a mutate request.
      MutateSharedCriteriaResponse response =
          sharedCriterionServiceClient.mutateSharedCriteria(Long.toString(customerId), operations);
      // Prints the resource name of each removed object.
      for (MutateSharedCriterionResult mutateSharedCriterionResult : response.getResultsList()) {
        System.out.printf(
            "Removed shared criterion with resource name: '%s'.%n",
            mutateSharedCriterionResult.getResourceName());
      }
    }
  }
}

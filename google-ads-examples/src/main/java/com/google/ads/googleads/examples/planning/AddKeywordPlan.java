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

package com.google.ads.googleads.examples.planning;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v1.enums.KeywordMatchTypeEnum.KeywordMatchType;
import com.google.ads.googleads.v1.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval;
import com.google.ads.googleads.v1.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork;
import com.google.ads.googleads.v1.errors.GoogleAdsError;
import com.google.ads.googleads.v1.errors.GoogleAdsException;
import com.google.ads.googleads.v1.resources.KeywordPlan;
import com.google.ads.googleads.v1.resources.KeywordPlanAdGroup;
import com.google.ads.googleads.v1.resources.KeywordPlanCampaign;
import com.google.ads.googleads.v1.resources.KeywordPlanForecastPeriod;
import com.google.ads.googleads.v1.resources.KeywordPlanGeoTarget;
import com.google.ads.googleads.v1.resources.KeywordPlanKeyword;
import com.google.ads.googleads.v1.resources.KeywordPlanNegativeKeyword;
import com.google.ads.googleads.v1.services.KeywordPlanAdGroupOperation;
import com.google.ads.googleads.v1.services.KeywordPlanAdGroupServiceClient;
import com.google.ads.googleads.v1.services.KeywordPlanCampaignOperation;
import com.google.ads.googleads.v1.services.KeywordPlanCampaignServiceClient;
import com.google.ads.googleads.v1.services.KeywordPlanKeywordOperation;
import com.google.ads.googleads.v1.services.KeywordPlanKeywordServiceClient;
import com.google.ads.googleads.v1.services.KeywordPlanNegativeKeywordOperation;
import com.google.ads.googleads.v1.services.KeywordPlanNegativeKeywordServiceClient;
import com.google.ads.googleads.v1.services.KeywordPlanOperation;
import com.google.ads.googleads.v1.services.KeywordPlanServiceClient;
import com.google.ads.googleads.v1.services.MutateKeywordPlanAdGroupsResponse;
import com.google.ads.googleads.v1.services.MutateKeywordPlanCampaignsResponse;
import com.google.ads.googleads.v1.services.MutateKeywordPlanKeywordResult;
import com.google.ads.googleads.v1.services.MutateKeywordPlanKeywordsResponse;
import com.google.ads.googleads.v1.services.MutateKeywordPlanNegativeKeywordsResponse;
import com.google.ads.googleads.v1.services.MutateKeywordPlansResponse;
import com.google.ads.googleads.v1.utils.ResourceNames;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * This code example creates a keyword plan, which can be reused for retrieving forecast metrics and
 * historic metrics.
 */
public class AddKeywordPlan {

  private static class AddKeywordPlanParams extends CodeSampleParams {

    @Parameter(
        names = ArgumentNames.CUSTOMER_ID,
        description = "The customer in which to create a new keyword plan.")
    public Long customerId;
  }

  public static void main(String[] args) {
    AddKeywordPlanParams params = new AddKeywordPlanParams();
    if (!params.parseArguments(args)) {

      // Optional, specify the customer ID under which to create a new keyword plan.
      params.customerId = Long.valueOf("INSERT_CUSTOMER_ID");
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
      new AddKeywordPlan().runExample(googleAdsClient, params.customerId);
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

  /** Runs the code example. */
  private void runExample(GoogleAdsClient googleAdsClient, Long customerId) {
    String keywordPlanResource = createKeywordPlan(googleAdsClient, customerId);
    String planCampaignResource =
        createKeywordPlanCampaign(googleAdsClient, customerId, keywordPlanResource);
    String planAdGroupResource =
        createKeywordPlanAdGroup(googleAdsClient, customerId, planCampaignResource);
    createKeywordPlanKeywords(googleAdsClient, customerId, planAdGroupResource);
    createKeywordPlanNegativeKeywords(googleAdsClient, customerId, planCampaignResource);
  }

  /** Creates a keyword plan. */
  private static String createKeywordPlan(GoogleAdsClient googleAdsClient, Long customerId) {
    KeywordPlan plan =
        KeywordPlan.newBuilder()
            .setName(
                StringValue.of("Keyword plan for traffic estimate #" + System.currentTimeMillis()))
            .setForecastPeriod(
                KeywordPlanForecastPeriod.newBuilder()
                    .setDateInterval(KeywordPlanForecastInterval.NEXT_QUARTER)
                    .build())
            .build();

    KeywordPlanOperation op = KeywordPlanOperation.newBuilder().setCreate(plan).build();

    try (KeywordPlanServiceClient client =
        googleAdsClient.getLatestVersion().createKeywordPlanServiceClient()) {
      // Add the keyword plan.
      MutateKeywordPlansResponse response =
          client.mutateKeywordPlans(String.valueOf(customerId), Arrays.asList(op));

      // Display the results.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Created keyword plan: %s%n", resourceName);
      return resourceName;
    }
  }

  /** Creates a campaign for the keyword plan. */
  private static String createKeywordPlanCampaign(
      GoogleAdsClient googleAdsClient, Long customerId, String keywordPlanResource) {
    // Create a keyword plan campaign.
    KeywordPlanCampaign.Builder campaign =
        KeywordPlanCampaign.newBuilder()
            .setName(StringValue.of("Keyword plan campaign #" + System.currentTimeMillis()))
            .setCpcBidMicros(Int64Value.of(1_000_000L))
            .setKeywordPlanNetwork(KeywordPlanNetwork.GOOGLE_SEARCH)
            .setKeywordPlan(StringValue.of(keywordPlanResource));

    // See https://developers.google.com/adwords/api/docs/appendix/geotargeting
    // for the list of geo target IDs.
    campaign.addGeoTargets(
        KeywordPlanGeoTarget.newBuilder()
            // Geo-target constant 2840 is for USA.
            .setGeoTargetConstant(StringValue.of(ResourceNames.geoTargetConstant(2840)))
            .build());

    // See https://developers.google.com/adwords/api/docs/appendix/codes-formats#languages
    // for the list of language criteria IDs.
    //
    // Language criteria 1000 is for English.
    campaign.addLanguageConstants(StringValue.of(ResourceNames.languageConstant(1000)));

    KeywordPlanCampaignOperation op =
        KeywordPlanCampaignOperation.newBuilder().setCreate(campaign).build();

    try (KeywordPlanCampaignServiceClient client =
        googleAdsClient.getLatestVersion().createKeywordPlanCampaignServiceClient()) {
      // Add the campaign.
      MutateKeywordPlanCampaignsResponse response =
          client.mutateKeywordPlanCampaigns(String.valueOf(customerId), Arrays.asList(op));

      // Display the result.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Created campaign for keyword plan: %s%n", resourceName);
      return resourceName;
    }
  }

  /** Creates the ad group for the keyword plan. */
  private static String createKeywordPlanAdGroup(
      GoogleAdsClient googleAdsClient, Long customerId, String planCampaignResource) {
    // Create the keyword plan ad group.
    KeywordPlanAdGroup.Builder adGroup =
        KeywordPlanAdGroup.newBuilder()
            .setKeywordPlanCampaign(StringValue.of(planCampaignResource))
            .setName(StringValue.of("Keyword plan ad group #" + System.currentTimeMillis()))
            .setCpcBidMicros(Int64Value.of(2_500_000L));

    KeywordPlanAdGroupOperation op =
        KeywordPlanAdGroupOperation.newBuilder().setCreate(adGroup).build();
    try (KeywordPlanAdGroupServiceClient client =
        googleAdsClient.getLatestVersion().createKeywordPlanAdGroupServiceClient()) {
      // Add the ad group.
      MutateKeywordPlanAdGroupsResponse response =
          client.mutateKeywordPlanAdGroups(String.valueOf(customerId), Arrays.asList(op));

      // Display the result.
      String resourceName = response.getResults(0).getResourceName();
      System.out.println("Created ad group for keyword plan: " + resourceName);
      return resourceName;
    }
  }


  /** Creates keywords for the keyword plan. */
  private static void createKeywordPlanKeywords(
      GoogleAdsClient googleAdsClient, Long customerId, String planAdGroupResource) {
    // Create the keywords for keyword plan.
    KeywordPlanKeyword keyword1 =
        KeywordPlanKeyword.newBuilder()
            .setKeywordPlanAdGroup(StringValue.of(planAdGroupResource))
            .setCpcBidMicros(Int64Value.of(2_000_000L))
            .setMatchType(KeywordMatchType.BROAD)
            .setText(StringValue.of("mars cruise"))
            .build();
    KeywordPlanKeyword keyword2 =
        KeywordPlanKeyword.newBuilder()
            .setKeywordPlanAdGroup(StringValue.of(planAdGroupResource))
            .setCpcBidMicros(Int64Value.of(1_500_000L))
            .setMatchType(KeywordMatchType.PHRASE)
            .setText(StringValue.of("cheap cruise"))
            .build();
    KeywordPlanKeyword keyword3 =
        KeywordPlanKeyword.newBuilder()
            .setKeywordPlanAdGroup(StringValue.of(planAdGroupResource))
            .setCpcBidMicros(Int64Value.of(1_990_000L))
            .setMatchType(KeywordMatchType.EXACT)
            .setText(StringValue.of("jupiter cruise"))
            .build();

    // Create an operation for each plan keyword.
    List<KeywordPlanKeywordOperation> operations =
        Stream.of(keyword1, keyword2, keyword3)
            .map(kw -> KeywordPlanKeywordOperation.newBuilder().setCreate(kw).build())
            .collect(Collectors.toList());

    try (KeywordPlanKeywordServiceClient client =
        googleAdsClient.getLatestVersion().createKeywordPlanKeywordServiceClient()) {
      // Add the keywords.
      MutateKeywordPlanKeywordsResponse response =
          client.mutateKeywordPlanKeywords(String.valueOf(customerId), operations);
      // Display the results.
      for (MutateKeywordPlanKeywordResult result : response.getResultsList()) {
        System.out.printf("Created keyword for keyword plan: %s%n", result.getResourceName());
      }
    }
  }

  /** Creates negative keywords for the keyword plan. */
  private void createKeywordPlanNegativeKeywords(
      GoogleAdsClient googleAdsClient, Long customerId, String planCampaignResource) {
    KeywordPlanNegativeKeyword negativeKeyword =
        KeywordPlanNegativeKeyword.newBuilder()
            .setKeywordPlanCampaign(StringValue.of(planCampaignResource))
            .setMatchType(KeywordMatchType.BROAD)
            .setText(StringValue.of("moon walk"))
            .build();
    KeywordPlanNegativeKeywordOperation op =
        KeywordPlanNegativeKeywordOperation.newBuilder().setCreate(negativeKeyword).build();

    try (KeywordPlanNegativeKeywordServiceClient client =
        googleAdsClient.getLatestVersion().createKeywordPlanNegativeKeywordServiceClient()) {
      // Add the negative keyword.
      MutateKeywordPlanNegativeKeywordsResponse response =
          client.mutateKeywordPlanNegativeKeywords(String.valueOf(customerId), Arrays.asList(op));

      // Display the result.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Created negative keyword for keyword plan: %s%n", resourceName);
    }
  }
}

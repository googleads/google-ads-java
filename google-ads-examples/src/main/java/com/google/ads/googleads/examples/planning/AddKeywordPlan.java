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
import com.google.ads.googleads.v4.enums.KeywordMatchTypeEnum.KeywordMatchType;
import com.google.ads.googleads.v4.enums.KeywordPlanForecastIntervalEnum.KeywordPlanForecastInterval;
import com.google.ads.googleads.v4.enums.KeywordPlanNetworkEnum.KeywordPlanNetwork;
import com.google.ads.googleads.v4.errors.GoogleAdsError;
import com.google.ads.googleads.v4.errors.GoogleAdsException;
import com.google.ads.googleads.v4.resources.KeywordPlan;
import com.google.ads.googleads.v4.resources.KeywordPlanAdGroup;
import com.google.ads.googleads.v4.resources.KeywordPlanCampaign;
import com.google.ads.googleads.v4.resources.KeywordPlanForecastPeriod;
import com.google.ads.googleads.v4.resources.KeywordPlanGeoTarget;
import com.google.ads.googleads.v4.resources.KeywordPlanAdGroupKeyword;
import com.google.ads.googleads.v4.resources.KeywordPlanCampaignKeyword;
import com.google.ads.googleads.v4.services.KeywordPlanAdGroupOperation;
import com.google.ads.googleads.v4.services.KeywordPlanAdGroupServiceClient;
import com.google.ads.googleads.v4.services.KeywordPlanCampaignOperation;
import com.google.ads.googleads.v4.services.KeywordPlanCampaignServiceClient;
import com.google.ads.googleads.v4.services.KeywordPlanAdGroupKeywordOperation;
import com.google.ads.googleads.v4.services.KeywordPlanAdGroupKeywordServiceClient;
import com.google.ads.googleads.v4.services.KeywordPlanCampaignKeywordOperation;
import com.google.ads.googleads.v4.services.KeywordPlanCampaignKeywordServiceClient;
import com.google.ads.googleads.v4.services.KeywordPlanOperation;
import com.google.ads.googleads.v4.services.KeywordPlanServiceClient;
import com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupsResponse;
import com.google.ads.googleads.v4.services.MutateKeywordPlanCampaignsResponse;
import com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordResult;
import com.google.ads.googleads.v4.services.MutateKeywordPlanAdGroupKeywordsResponse;
import com.google.ads.googleads.v4.services.MutateKeywordPlanCampaignKeywordsResponse;
import com.google.ads.googleads.v4.services.MutateKeywordPlansResponse;
import com.google.ads.googleads.v4.utils.ResourceNames;
import com.google.protobuf.BoolValue;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Creates a keyword plan, which can be reused for retrieving forecast metrics and historic metrics.
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

  /**
   * Runs the code example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   */
  private void runExample(GoogleAdsClient googleAdsClient, Long customerId) {
    String keywordPlanResource = createKeywordPlan(googleAdsClient, customerId);
    String planCampaignResource =
        createKeywordPlanCampaign(googleAdsClient, customerId, keywordPlanResource);
    String planAdGroupResource =
        createKeywordPlanAdGroup(googleAdsClient, customerId, planCampaignResource);
    createKeywordPlanAdGroupKeywords(googleAdsClient, customerId, planAdGroupResource);
    createKeywordPlanCampaignKeywords(googleAdsClient, customerId, planCampaignResource);
  }

  /**
   * Creates a keyword plan.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   */
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
      // Adds the keyword plan.
      MutateKeywordPlansResponse response =
          client.mutateKeywordPlans(String.valueOf(customerId), Arrays.asList(op));

      // Displays the results.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Created keyword plan: %s%n", resourceName);
      return resourceName;
    }
  }

  /**
   * Creates a campaign for the keyword plan.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param keywordPlanResource the keyword plan resource name.
   */
  private static String createKeywordPlanCampaign(
      GoogleAdsClient googleAdsClient, Long customerId, String keywordPlanResource) {
    // Creates a keyword plan campaign.
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
      // Adds the campaign.
      MutateKeywordPlanCampaignsResponse response =
          client.mutateKeywordPlanCampaigns(String.valueOf(customerId), Arrays.asList(op));

      // Displays the result.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Created campaign for keyword plan: %s%n", resourceName);
      return resourceName;
    }
  }

  /**
   * Creates the ad group for the keyword plan.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param planCampaignResource plan campaign resource name.
   */
  private static String createKeywordPlanAdGroup(
      GoogleAdsClient googleAdsClient, Long customerId, String planCampaignResource) {
    // Creates the keyword plan ad group.
    KeywordPlanAdGroup.Builder adGroup =
        KeywordPlanAdGroup.newBuilder()
            .setKeywordPlanCampaign(StringValue.of(planCampaignResource))
            .setName(StringValue.of("Keyword plan ad group #" + System.currentTimeMillis()))
            .setCpcBidMicros(Int64Value.of(2_500_000L));

    KeywordPlanAdGroupOperation op =
        KeywordPlanAdGroupOperation.newBuilder().setCreate(adGroup).build();
    try (KeywordPlanAdGroupServiceClient client =
        googleAdsClient.getLatestVersion().createKeywordPlanAdGroupServiceClient()) {
      // Adds the ad group.
      MutateKeywordPlanAdGroupsResponse response =
          client.mutateKeywordPlanAdGroups(String.valueOf(customerId), Arrays.asList(op));

      // Displays the result.
      String resourceName = response.getResults(0).getResourceName();
      System.out.println("Created ad group for keyword plan: " + resourceName);
      return resourceName;
    }
  }

  /**
   * Creates keywords for the keyword plan.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param planAdGroupResource plan ad group resource name.
   */
  private static void createKeywordPlanAdGroupKeywords(
      GoogleAdsClient googleAdsClient, Long customerId, String planAdGroupResource) {
    // Creates the keywords for keyword plan.
    KeywordPlanAdGroupKeyword keyword1 =
        KeywordPlanAdGroupKeyword.newBuilder()
            .setKeywordPlanAdGroup(StringValue.of(planAdGroupResource))
            .setCpcBidMicros(Int64Value.of(2_000_000L))
            .setMatchType(KeywordMatchType.BROAD)
            .setText(StringValue.of("mars cruise"))
            .build();
    KeywordPlanAdGroupKeyword keyword2 =
        KeywordPlanAdGroupKeyword.newBuilder()
            .setKeywordPlanAdGroup(StringValue.of(planAdGroupResource))
            .setCpcBidMicros(Int64Value.of(1_500_000L))
            .setMatchType(KeywordMatchType.PHRASE)
            .setText(StringValue.of("cheap cruise"))
            .build();
    KeywordPlanAdGroupKeyword keyword3 =
        KeywordPlanAdGroupKeyword.newBuilder()
            .setKeywordPlanAdGroup(StringValue.of(planAdGroupResource))
            .setCpcBidMicros(Int64Value.of(1_990_000L))
            .setMatchType(KeywordMatchType.EXACT)
            .setText(StringValue.of("jupiter cruise"))
            .build();

    // Creates an operation for each plan keyword.
    List<KeywordPlanAdGroupKeywordOperation> operations =
        Stream.of(keyword1, keyword2, keyword3)
            .map(kw -> KeywordPlanAdGroupKeywordOperation.newBuilder().setCreate(kw).build())
            .collect(Collectors.toList());

    try (KeywordPlanAdGroupKeywordServiceClient client =
        googleAdsClient.getLatestVersion().createKeywordPlanAdGroupKeywordServiceClient()) {
      // Adds the keywords.
      MutateKeywordPlanAdGroupKeywordsResponse response =
          client.mutateKeywordPlanAdGroupKeywords(String.valueOf(customerId), operations);
      // Displays the results.
      for (MutateKeywordPlanAdGroupKeywordResult result : response.getResultsList()) {
        System.out.printf("Created keyword for keyword plan: %s%n", result.getResourceName());
      }
    }
  }

  /**
   * Creates negative keywords for the keyword plan.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param planCampaignResource plan campaign resource name.
   */
  private void createKeywordPlanCampaignKeywords(
      GoogleAdsClient googleAdsClient, Long customerId, String planCampaignResource) {
    KeywordPlanCampaignKeyword negativeKeyword =
        KeywordPlanCampaignKeyword.newBuilder()
            .setKeywordPlanCampaign(StringValue.of(planCampaignResource))
            .setMatchType(KeywordMatchType.BROAD)
            .setNegative(BoolValue.of(true))
            .setText(StringValue.of("moon walk"))
            .build();
    KeywordPlanCampaignKeywordOperation op =
        KeywordPlanCampaignKeywordOperation.newBuilder().setCreate(negativeKeyword).build();

    try (KeywordPlanCampaignKeywordServiceClient client =
        googleAdsClient.getLatestVersion().createKeywordPlanCampaignKeywordServiceClient()) {
      // Adds the negative keyword.
      MutateKeywordPlanCampaignKeywordsResponse response =
          client.mutateKeywordPlanCampaignKeywords(String.valueOf(customerId), Arrays.asList(op));

      // Displays the result.
      String resourceName = response.getResults(0).getResourceName();
      System.out.printf("Created negative keyword for keyword plan: %s%n", resourceName);
    }
  }
}

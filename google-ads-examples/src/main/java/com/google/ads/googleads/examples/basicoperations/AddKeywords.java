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

package com.google.ads.googleads.examples.basicoperations;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.ads.googleads.v3.utils.ResourceNames;
import com.google.ads.googleads.v3.common.KeywordInfo;
import com.google.ads.googleads.v3.enums.AdGroupCriterionStatusEnum.AdGroupCriterionStatus;
import com.google.ads.googleads.v3.enums.KeywordMatchTypeEnum.KeywordMatchType;
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.resources.AdGroupCriterion;
import com.google.ads.googleads.v3.services.AdGroupCriterionOperation;
import com.google.ads.googleads.v3.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v3.services.MutateAdGroupCriteriaResponse;
import com.google.ads.googleads.v3.services.MutateAdGroupCriterionResult;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;

/** Adds a keyword to an ad group. */
public class AddKeywords {

  /** The default keyword text to add if none is specified as a parameter. */
  private static final String DEFAULT_KEYWORD_TEXT = "mars cruise";

  private static class AddKeywordsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;

    @Parameter(names = ArgumentNames.KEYWORD_TEXT)
    private String keywordText;
  }

  public static void main(String[] args) {
    AddKeywordsParams params = new AddKeywordsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");

      // Optional: Specify a keywordText here, or the default specified below will be used.
      // params.keywordText = "INSERT_KEYWORD_TEXT_HERE";
    }

    if (params.keywordText == null) {
      params.keywordText = DEFAULT_KEYWORD_TEXT;
    }

    GoogleAdsClient googleAdsClient;
    try {
      googleAdsClient = GoogleAdsClient.newBuilder().fromPropertiesFile().build();
    } catch (FileNotFoundException fnfe) {
      System.err.printf(
          "Failed to load GoogleAdsClient configuration from file. Exception: %s%n", fnfe);
      System.exit(1);
    } catch (IOException ioe) {
      System.err.printf("Failed to create GoogleAdsClient. Exception: %s%n", ioe);
      return;
    }

    try {
      new AddKeywords()
          .runExample(googleAdsClient, params.customerId, params.adGroupId, params.keywordText);
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
   * @param adGroupId the ad group ID.
   * @param keywordText the keyword text to add.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, long adGroupId, String keywordText) {

    // Configures the keywordText text and match type settings.
    KeywordInfo keywordInfo =
        KeywordInfo.newBuilder()
            .setText(StringValue.of(keywordText))
            .setMatchType(KeywordMatchType.EXACT)
            .build();

    String adGroupResourceName = ResourceNames.adGroup(customerId, adGroupId);

    // Constructs an ad group criterion using the keywordText configuration above.
    AdGroupCriterion criterion =
        AdGroupCriterion.newBuilder()
            .setAdGroup(StringValue.of(adGroupResourceName))
            .setStatus(AdGroupCriterionStatus.ENABLED)
            .setKeyword(keywordInfo)
            .build();

    AdGroupCriterionOperation op =
        AdGroupCriterionOperation.newBuilder().setCreate(criterion).build();

    try (AdGroupCriterionServiceClient agcServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupCriterionServiceClient()) {
      MutateAdGroupCriteriaResponse response =
          agcServiceClient.mutateAdGroupCriteria(Long.toString(customerId), ImmutableList.of(op));
      System.out.printf("Added %d ad group criteria:%n", response.getResultsCount());
      for (MutateAdGroupCriterionResult result : response.getResultsList()) {
        System.out.println(result.getResourceName());
      }
    }
  }
}

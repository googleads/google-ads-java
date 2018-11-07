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
import com.google.ads.googleads.lib.GoogleAdsException;
import com.google.ads.googleads.lib.utils.ResourceNames;
import com.google.ads.googleads.v0.enums.AdGroupStatusEnum.AdGroupStatus;
import com.google.ads.googleads.v0.enums.AdGroupTypeEnum.AdGroupType;
import com.google.ads.googleads.v0.errors.GoogleAdsError;
import com.google.ads.googleads.v0.resources.AdGroup;
import com.google.ads.googleads.v0.resources.CampaignName;
import com.google.ads.googleads.v0.services.AdGroupOperation;
import com.google.ads.googleads.v0.services.AdGroupServiceClient;
import com.google.ads.googleads.v0.services.MutateAdGroupResult;
import com.google.ads.googleads.v0.services.MutateAdGroupsResponse;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/** This example adds ad groups to a campaign. */
public class AddAdGroups {

  private static class AddAdGroupParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;
  }

  public static void main(String[] args) throws IOException {
    AddAdGroupParams params = new AddAdGroupParams();
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
      new AddAdGroups().runExample(googleAdsClient, params.customerId, params.campaignId);
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
    String campaignResourceName = ResourceNames.campaign(customerId, campaignId);

    // Create ad group, setting an optional CPC value.
    AdGroup adGroup1 =
        AdGroup.newBuilder()
            .setName(StringValue.of("Earth to Mars Cruises #" + System.currentTimeMillis()))
            .setStatus(AdGroupStatus.ENABLED)
            .setCampaign(StringValue.of(campaignResourceName))
            .setType(AdGroupType.SEARCH_STANDARD)
            .setCpcBidMicros(Int64Value.of(10_000_000L))
            .build();

    // Add as many additional ad groups as you need.
    AdGroup adGroup2 =
        AdGroup.newBuilder()
            .setName(StringValue.of("Earth to Venus Cruises #" + System.currentTimeMillis()))
            .setStatus(AdGroupStatus.ENABLED)
            .setCampaign(StringValue.of(campaignResourceName))
            .setType(AdGroupType.SEARCH_STANDARD)
            .setCpcBidMicros(Int64Value.of(10_000_000L))
            .build();

    List<AdGroupOperation> operations = new ArrayList<>();
    operations.add(AdGroupOperation.newBuilder().setCreate(adGroup1).build());
    operations.add(AdGroupOperation.newBuilder().setCreate(adGroup2).build());

    try (AdGroupServiceClient adGroupServiceClient = googleAdsClient.getAdGroupServiceClient()) {
      MutateAdGroupsResponse response =
          adGroupServiceClient.mutateAdGroups(Long.toString(customerId), operations);
      System.out.printf("Added %d ad groups:%n", response.getResultsCount());
      for (MutateAdGroupResult result : response.getResultsList()) {
        System.out.println(result.getResourceName());
      }
    }
  }
}

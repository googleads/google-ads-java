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

package com.google.ads.googleads.examples.remarketing;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v2.common.TargetRestriction;
import com.google.ads.googleads.v2.common.TargetingSetting;
import com.google.ads.googleads.v2.enums.TargetingDimensionEnum.TargetingDimension;
import com.google.ads.googleads.v2.errors.GoogleAdsError;
import com.google.ads.googleads.v2.errors.GoogleAdsException;
import com.google.ads.googleads.v2.resources.AdGroup;
import com.google.ads.googleads.v2.services.AdGroupOperation;
import com.google.ads.googleads.v2.services.AdGroupServiceClient;
import com.google.ads.googleads.v2.services.GoogleAdsRow;
import com.google.ads.googleads.v2.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v2.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v2.services.MutateAdGroupsResponse;
import com.google.ads.googleads.v2.services.SearchGoogleAdsRequest;
import com.google.ads.googleads.v2.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.BoolValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/** Sets the targeting setting of an ad group to bid only for targeted audiences. */
public class UpdateTargetingSetting {

  private static final int PAGE_SIZE = 1_000;

  private static class UpdateTargetingSettingParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;
  }

  public static void main(String[] args) {
    UpdateTargetingSettingParams params = new UpdateTargetingSettingParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
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
      new UpdateTargetingSetting().runExample(googleAdsClient, params.customerId, params.adGroupId);
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
   * @param adGroupId the ID of the ad group to update.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(GoogleAdsClient googleAdsClient, long customerId, long adGroupId) {
    // Creates an empty TargetingSetting object.
    TargetingSetting.Builder targetingSettingBuilder = TargetingSetting.newBuilder();

    // Creates the Google Ads service client.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Creates a search request that retrieves the targeting settings from a given ad group.
      String searchQuery =
          "SELECT ad_group.id, ad_group.name, ad_group.targeting_setting.target_restrictions FROM"
              + " ad_group WHERE ad_group.id = "
              + adGroupId;

      // Creates a request that will retrieve all ad groups using pages of the specified page size.
      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setPageSize(PAGE_SIZE)
              .setQuery(searchQuery)
              .build();
      // Issues the search request.
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);
      // Iterates over all rows in all pages and prints the requested field values for the ad group
      // in each row.
      for (GoogleAdsRow googleAdsRow : searchPagedResponse.iterateAll()) {
        AdGroup adGroup = googleAdsRow.getAdGroup();
        // Prints the results.
        System.out.printf(
            "Ad group with ID %d and name '%s' was found with the following targeting"
                + " restrictions.%n",
            adGroup.getId().getValue(), adGroup.getName().getValue());
        List<TargetRestriction> targetRestrictions =
            adGroup.getTargetingSetting().getTargetRestrictionsList();
        // Loops through and prints each of the target restrictions.
        // Reconstructs the TargetingSetting object with the updated audience target restriction
        // because Google will overwrite the entire targeting_setting field of the ad group when
        // the field mask includes targeting_setting in an update operation.
        for (TargetRestriction targetRestriction : targetRestrictions) {
          TargetingDimension targetingDimension = targetRestriction.getTargetingDimension();
          boolean bidOnly = targetRestriction.getBidOnly().getValue();
          System.out.printf(
              "  Targeting restriction with targeting dimension '%s' and bid only set to '%b'.%n",
              targetingDimension, bidOnly);
          // Adds the target restriction to the TargetingSetting object as is if the targeting
          // dimension has a value other than AUDIENCE because those should not change.
          if (!targetingDimension.equals(TargetingDimension.AUDIENCE)) {
            targetingSettingBuilder.addTargetRestrictions(targetRestriction);
            // Adds the target restriction to the TargetingSetting object with bid_only set to true
            // if the targeting dimension equals AUDIENCE in order to update that target
            // restriction to "Observation".
            // For more details about the targeting setting, visit
            // https://support.google.com/google-ads/answer/7365594.
          } else {
            targetingSettingBuilder.addTargetRestrictions(
                TargetRestriction.newBuilder()
                    .setTargetingDimensionValue(TargetingDimension.AUDIENCE_VALUE)
                    .setBidOnly(BoolValue.of(true)));
          }
        }
      }
    }

    // Creates the ad group service client.
    try (AdGroupServiceClient adGroupServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupServiceClient()) {
      // Creates an ad group object with the proper resource name and updated targeting setting.
      AdGroup adGroup =
          AdGroup.newBuilder()
              .setResourceName(ResourceNames.adGroup(customerId, adGroupId))
              .setTargetingSetting(targetingSettingBuilder.build())
              .build();
      // Constructs an operation that will update the ad group, using the FieldMasks utility to
      // derive the update mask. This mask tells the Google Ads API which attributes of the
      // ad group you want to change.
      AdGroupOperation operation =
          AdGroupOperation.newBuilder()
              .setUpdate(adGroup)
              .setUpdateMask(FieldMasks.allSetFieldsOf(adGroup))
              .build();
      // Sends the operation in a mutate request.
      MutateAdGroupsResponse response =
          adGroupServiceClient.mutateAdGroups(
              Long.toString(customerId), ImmutableList.of(operation));
      // Prints the resource name of the updated object.
      System.out.printf(
          "Updated ad group with resourceName: '%s'.%n", response.getResults(0).getResourceName());
    }
  }
}

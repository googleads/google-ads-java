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

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getPrintableDatetime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.lib.utils.FieldMasks;
import com.google.ads.googleads.v6.common.ExpressionRuleUserListInfo;
import com.google.ads.googleads.v6.common.RuleBasedUserListInfo;
import com.google.ads.googleads.v6.common.UserListInfo;
import com.google.ads.googleads.v6.common.UserListRuleInfo;
import com.google.ads.googleads.v6.common.UserListRuleItemGroupInfo;
import com.google.ads.googleads.v6.common.UserListRuleItemInfo;
import com.google.ads.googleads.v6.common.UserListStringRuleItemInfo;
import com.google.ads.googleads.v6.enums.UserListMembershipStatusEnum.UserListMembershipStatus;
import com.google.ads.googleads.v6.enums.UserListPrepopulationStatusEnum.UserListPrepopulationStatus;
import com.google.ads.googleads.v6.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator;
import com.google.ads.googleads.v6.errors.GoogleAdsError;
import com.google.ads.googleads.v6.errors.GoogleAdsException;
import com.google.ads.googleads.v6.resources.AdGroupCriterion;
import com.google.ads.googleads.v6.resources.CampaignCriterion;
import com.google.ads.googleads.v6.resources.UserList;
import com.google.ads.googleads.v6.services.AdGroupCriterionOperation;
import com.google.ads.googleads.v6.services.AdGroupCriterionServiceClient;
import com.google.ads.googleads.v6.services.CampaignCriterionOperation;
import com.google.ads.googleads.v6.services.CampaignCriterionServiceClient;
import com.google.ads.googleads.v6.services.GoogleAdsRow;
import com.google.ads.googleads.v6.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v6.services.GoogleAdsServiceClient.SearchPagedResponse;
import com.google.ads.googleads.v6.services.MutateAdGroupCriteriaResponse;
import com.google.ads.googleads.v6.services.MutateAdGroupCriterionResult;
import com.google.ads.googleads.v6.services.MutateCampaignCriteriaResponse;
import com.google.ads.googleads.v6.services.MutateUserListsResponse;
import com.google.ads.googleads.v6.services.SearchGoogleAdsRequest;
import com.google.ads.googleads.v6.services.UserListOperation;
import com.google.ads.googleads.v6.services.UserListServiceClient;
import com.google.ads.googleads.v6.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Demonstrates various operations involved in remarketing, including (a) creating a user list based
 * on visitors to a website, (b) targeting a user list with an ad group criterion, (c) updating the
 * bid modifier value on an ad group criterion, (d) finding and removing all ad group criteria under
 * a given campaign, (e) targeting a user list with a campaign criterion, and (f) updating the bid
 * modifier on a campaign criterion. It is unlikely that users will need to perform all of these
 * operations consecutively, and all of the operations contained herein are meant of for
 * illustrative purposes.
 */
public class SetupRemarketing {

  private static final int PAGE_SIZE = 1000;

  private static class SetupRemarketingParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.AD_GROUP_ID, required = true)
    private Long adGroupId;

    @Parameter(names = ArgumentNames.CAMPAIGN_ID, required = true)
    private Long campaignId;

    /** Specify the bid modifier value here or the default specified below will be used. */
    @Parameter(names = ArgumentNames.BID_MODIFIER_VALUE)
    private Double bidModifierValue = 1.5;
  }

  public static void main(String[] args) {
    SetupRemarketingParams params = new SetupRemarketingParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.adGroupId = Long.parseLong("INSERT_AD_GROUP_ID_HERE");
      params.campaignId = Long.parseLong("INSERT_CAMPAIGN_ID_HERE");
      // Optional: To use a different bid modifier value from the default (1.5), uncomment
      // the line below and insert the desired bid modifier value.
      // params.bidModifierValue = Double.parseDouble("INSERT_BID_MODIFIER_VALUE_HERE");
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
      new SetupRemarketing()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.adGroupId,
              params.campaignId,
              params.bidModifierValue);
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
   * @param adGroupId the adGroup on which to do the remarketing.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long adGroupId,
      long campaignId,
      double bidModifierValue) {
    String userList = createUserList(googleAdsClient, customerId);
    String adGroupCriterionResourceName =
        targetAdsInAdGroupToUserList(googleAdsClient, customerId, adGroupId, userList);
    modifyAdGroupBids(googleAdsClient, customerId, adGroupCriterionResourceName, bidModifierValue);
    removeExistingListCriteriaFromAdGroup(googleAdsClient, customerId, campaignId);
    String campaignCriterionResourceName =
        targetAdsInCampaignToUserList(googleAdsClient, customerId, campaignId, userList);
    modifyCampaignBids(
        googleAdsClient, customerId, campaignCriterionResourceName, bidModifierValue);
  }

  /**
   * Creates a user list targeting users that have visited a given url.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @return the user list resource name.
   */
  // [START SetupRemarketing]
  private String createUserList(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates a rule targeting any user that visited a url containing 'example.com'.
    UserListRuleItemInfo rule =
        UserListRuleItemInfo.newBuilder()
            // Uses a built-in parameter to create a domain URL rule.
            .setName("url__")
            .setStringRuleItem(
                UserListStringRuleItemInfo.newBuilder()
                    .setOperator(UserListStringRuleItemOperator.CONTAINS)
                    .setValue("example.com")
                    .build())
            .build();

    // Specifies that the user list targets visitors of a page based on the provided rule.
    ExpressionRuleUserListInfo expressionRuleUserListInfo =
        ExpressionRuleUserListInfo.newBuilder()
            .setRule(
                UserListRuleInfo.newBuilder()
                    .addRuleItemGroups(
                        UserListRuleItemGroupInfo.newBuilder().addRuleItems(rule).build())
                    .build())
            .build();

    // Defines a representation of a user list that is generated by a rule.
    RuleBasedUserListInfo ruleBasedUserListInfo =
        RuleBasedUserListInfo.newBuilder()
            // Optional: To include past users in the user list, set the prepopulation_status to
            // REQUESTED.
            .setPrepopulationStatus(UserListPrepopulationStatus.REQUESTED)
            .setExpressionRuleUserList(expressionRuleUserListInfo)
            .build();

    // Creates the user list.
    UserList userList =
        UserList.newBuilder()
            .setName("All visitors to example.com" + getPrintableDatetime())
            .setDescription("Any visitor to any page of example.com")
            .setMembershipStatus(UserListMembershipStatus.OPEN)
            .setMembershipLifeSpan(365)
            .setRuleBasedUserList(ruleBasedUserListInfo)
            .build();

    // Creates the operation.
    UserListOperation operation = UserListOperation.newBuilder().setCreate(userList).build();

    // Creates the user list service client.
    try (UserListServiceClient userListServiceClient =
        googleAdsClient.getLatestVersion().createUserListServiceClient()) {
      // Adds the user list.
      MutateUserListsResponse response =
          userListServiceClient.mutateUserLists(
              Long.toString(customerId), ImmutableList.of(operation));
      String userListResourceName = response.getResults(0).getResourceName();
      // Prints the result.
      System.out.printf("Created user list with resource name '%s'.%n", userListResourceName);
      return userListResourceName;
    }
  }
  // [END SetupRemarketing]

  /**
   * Creates an ad group criterion that targets a user list with an ad group.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupId the ad group on which the user list will be targeted.
   * @param userList the resource name of the user list to be targeted.
   * @return the ad group criterion resource name.
   */
  // [START SetupRemarketing_1]
  private String targetAdsInAdGroupToUserList(
      GoogleAdsClient googleAdsClient, long customerId, long adGroupId, String userList) {
    // Creates the ad group criterion targeting members of the user list.
    AdGroupCriterion adGroupCriterion =
        AdGroupCriterion.newBuilder()
            .setAdGroup(ResourceNames.adGroup(customerId, adGroupId))
            .setUserList(UserListInfo.newBuilder().setUserList(userList).build())
            .build();

    // Creates the operation.
    AdGroupCriterionOperation operation =
        AdGroupCriterionOperation.newBuilder().setCreate(adGroupCriterion).build();

    // Creates the ad group criterion service.
    try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupCriterionServiceClient()) {
      // Adds the ad group criterion.
      MutateAdGroupCriteriaResponse response =
          adGroupCriterionServiceClient.mutateAdGroupCriteria(
              Long.toString(customerId), ImmutableList.of(operation));
      // Gets and prints the results.
      String adGroupCriterionResourceName = response.getResults(0).getResourceName();
      System.out.printf(
          "Successfully created ad group criterion with resource name '%s' "
              + "targeting user list with resource name '%s' with ad group with ID %d.%n",
          adGroupCriterionResourceName, userList, adGroupId);
      return adGroupCriterionResourceName;
    }
  }
  // [END SetupRemarketing_1]

  /**
   * Updates the bid modifier value on an ad group criterion.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param adGroupCriterionResourceName the ad group criterion to update.
   * @param bidModifierValue the bid modifier value.
   */
  private void modifyAdGroupBids(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String adGroupCriterionResourceName,
      double bidModifierValue) {
    // Creates the ad group criterion with a bid modifier value. You may alternatively set the bid
    // for the ad group criterion directly.
    AdGroupCriterion adGroupCriterion =
        AdGroupCriterion.newBuilder()
            .setResourceName(adGroupCriterionResourceName)
            .setBidModifier(bidModifierValue)
            .build();

    // Creates the update operation.
    AdGroupCriterionOperation operation =
        AdGroupCriterionOperation.newBuilder()
            .setUpdate(adGroupCriterion)
            .setUpdateMask(FieldMasks.allSetFieldsOf(adGroupCriterion))
            .build();

    // Creates the ad group criterion service.
    try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupCriterionServiceClient()) {
      // Updates the ad group criterion.
      MutateAdGroupCriteriaResponse response =
          adGroupCriterionServiceClient.mutateAdGroupCriteria(
              Long.toString(customerId), ImmutableList.of(operation));
      // Prints the results.
      System.out.printf(
          "Successfully updated the bid for ad group criterion with resource name '%s'.%n",
          response.getResults(0).getResourceName());
    }
  }

  /**
   * Removes all ad group criteria targeting a user list under a given campaign. This is a necessary
   * step before targeting a user list at the campaign level.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignId the campaign under which to remove the ad group criteria.
   */
  // [START SetupRemarketing_3]
  private void removeExistingListCriteriaFromAdGroup(
      GoogleAdsClient googleAdsClient, long customerId, long campaignId) {
    // Retrieves all of the ad group criteria under a campaign.
    List<String> adGroupCriteria =
        getUserListAdGroupCriterion(googleAdsClient, customerId, campaignId);

    List<AdGroupCriterionOperation> operations = new ArrayList<>();

    // Creates a list of remove operations.
    for (String adGroupCriterion : adGroupCriteria) {
      operations.add(AdGroupCriterionOperation.newBuilder().setRemove(adGroupCriterion).build());
    }

    // Creates the ad group criterion service.
    try (AdGroupCriterionServiceClient adGroupCriterionServiceClient =
        googleAdsClient.getLatestVersion().createAdGroupCriterionServiceClient()) {
      // Removes the ad group criterion.
      MutateAdGroupCriteriaResponse response =
          adGroupCriterionServiceClient.mutateAdGroupCriteria(
              Long.toString(customerId), operations);
      // Gets and prints the results.
      System.out.printf("Removed %d ad group criteria.%n", response.getResultsCount());
      for (MutateAdGroupCriterionResult result : response.getResultsList()) {
        System.out.printf(
            "Successfully removed ad group criterion with resource name '%s'.%n",
            result.getResourceName());
      }
    }
  }
  // [END SetupRemarketing_3]

  /**
   * Finds all of user list ad group criteria under a campaign.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignId the campaign under which to search the ad group criteria.
   * @return a list of the ad group criteria resource names.
   */
  // [START SetupRemarketing_2]
  private List<String> getUserListAdGroupCriterion(
      GoogleAdsClient googleAdsClient, long customerId, long campaignId) {
    List<String> userListCriteria = new ArrayList<>();
    // Creates the Google Ads service client.
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Creates a request that will retrieve all of the ad group criteria under a campaign.
      SearchGoogleAdsRequest request =
          SearchGoogleAdsRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setPageSize(PAGE_SIZE)
              .setQuery(
                  "SELECT ad_group_criterion.criterion_id"
                      + " FROM ad_group_criterion"
                      + " WHERE campaign.id = "
                      + campaignId
                      + " AND ad_group_criterion.type = 'USER_LIST'")
              .build();
      // Issues the search request.
      SearchPagedResponse searchPagedResponse = googleAdsServiceClient.search(request);
      // Iterates over all rows in all pages. Prints the results and adds the ad group criteria
      // resource names to the list.
      for (GoogleAdsRow googleAdsRow : searchPagedResponse.iterateAll()) {
        String adGroupCriterionResourceName = googleAdsRow.getAdGroupCriterion().getResourceName();
        System.out.printf(
            "Ad group criterion with resource name '%s' was found.%n",
            adGroupCriterionResourceName);
        userListCriteria.add(adGroupCriterionResourceName);
      }
    }
    return userListCriteria;
  }
  // [END SetupRemarketing_2]

  /**
   * Creates a campaign criterion that targets a user list with a campaign.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignId the campaign on which the user list will be targeted.
   * @param userList the resource name of the user list to be targeted.
   * @return the campaign criterion resource name.
   */
  // [START SetupRemarketing_4]
  private String targetAdsInCampaignToUserList(
      GoogleAdsClient googleAdsClient, long customerId, long campaignId, String userList) {
    // Creates the campaign criterion.
    CampaignCriterion campaignCriterion =
        CampaignCriterion.newBuilder()
            .setCampaign(ResourceNames.campaign(customerId, campaignId))
            .setUserList(UserListInfo.newBuilder().setUserList(userList).build())
            .build();

    // Creates the operation.
    CampaignCriterionOperation operation =
        CampaignCriterionOperation.newBuilder().setCreate(campaignCriterion).build();

    // Creates the campaign criterion service client.
    try (CampaignCriterionServiceClient campaignCriterionServiceClient =
        googleAdsClient.getLatestVersion().createCampaignCriterionServiceClient()) {
      // Adds the campaign criterion.
      MutateCampaignCriteriaResponse response =
          campaignCriterionServiceClient.mutateCampaignCriteria(
              Long.toString(customerId), ImmutableList.of(operation));
      // Gets and prints the campaign criterion resource name.
      String campaignCriterionResourceName = response.getResults(0).getResourceName();
      System.out.printf(
          "Successfully created campaign criterion with resource name '%s' "
              + "targeting user list with resource name '%s' with campaign with ID %d.%n",
          campaignCriterionResourceName, userList, campaignId);
      return campaignCriterionResourceName;
    }
  }
  // [END SetupRemarketing_4]

  /**
   * Updates the bid modifier value on a campaign criterion.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param campaignCriterionResourceName the campaign criterion to update.
   * @param bidModifierValue the bid modifier value.
   */
  private void modifyCampaignBids(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String campaignCriterionResourceName,
      double bidModifierValue) {
    // Creates the campaign criterion to update.
    CampaignCriterion campaignCriterion =
        CampaignCriterion.newBuilder()
            .setResourceName(campaignCriterionResourceName)
            .setBidModifier((float) bidModifierValue)
            .build();

    // Creates the update operation.
    CampaignCriterionOperation operation =
        CampaignCriterionOperation.newBuilder()
            .setUpdate(campaignCriterion)
            .setUpdateMask(FieldMasks.allSetFieldsOf(campaignCriterion))
            .build();

    // Creates the campaign criterion service client.
    try (CampaignCriterionServiceClient campaignCriterionServiceClient =
        googleAdsClient.getLatestVersion().createCampaignCriterionServiceClient()) {
      // Updates the campaign criterion.
      MutateCampaignCriteriaResponse response =
          campaignCriterionServiceClient.mutateCampaignCriteria(
              Long.toString(customerId), ImmutableList.of(operation));
      System.out.printf(
          "Successfully updated the bid for campaign criterion with resource name '%s'.%n",
          response.getResults(0).getResourceName());
    }
  }
}

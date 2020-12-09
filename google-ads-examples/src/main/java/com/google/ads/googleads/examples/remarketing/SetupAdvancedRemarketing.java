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
import com.google.ads.googleads.examples.utils.CodeSampleHelper;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v6.common.ExpressionRuleUserListInfo;
import com.google.ads.googleads.v6.common.RuleBasedUserListInfo;
import com.google.ads.googleads.v6.common.UserListDateRuleItemInfo;
import com.google.ads.googleads.v6.common.UserListNumberRuleItemInfo;
import com.google.ads.googleads.v6.common.UserListRuleInfo;
import com.google.ads.googleads.v6.common.UserListRuleItemGroupInfo;
import com.google.ads.googleads.v6.common.UserListRuleItemInfo;
import com.google.ads.googleads.v6.common.UserListStringRuleItemInfo;
import com.google.ads.googleads.v6.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator;
import com.google.ads.googleads.v6.enums.UserListMembershipStatusEnum.UserListMembershipStatus;
import com.google.ads.googleads.v6.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator;
import com.google.ads.googleads.v6.enums.UserListPrepopulationStatusEnum.UserListPrepopulationStatus;
import com.google.ads.googleads.v6.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator;
import com.google.ads.googleads.v6.errors.GoogleAdsError;
import com.google.ads.googleads.v6.errors.GoogleAdsException;
import com.google.ads.googleads.v6.resources.UserList;
import com.google.ads.googleads.v6.services.MutateUserListsResponse;
import com.google.ads.googleads.v6.services.UserListOperation;
import com.google.ads.googleads.v6.services.UserListServiceClient;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Creates a rule-based user list defined by an expression rule for users who have either checked
 * out in November or December OR visited the checkout page with more than one item in their cart.
 */
public class SetupAdvancedRemarketing {

  private static class SetupAdvancedRemarketingParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    SetupAdvancedRemarketingParams params = new SetupAdvancedRemarketingParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
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
      new SetupAdvancedRemarketing().runExample(googleAdsClient, params.customerId);
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
    // Creates a rule targeting any user that visited the checkout page.
    // [START SetupAdvancedRemarketing]
    UserListRuleItemInfo checkoutRule =
        UserListRuleItemInfo.newBuilder()
            // The rule variable name must match a corresponding key name fired from a pixel.
            // To learn more about setting up remarketing tags, visit
            // https://support.google.com/google-ads/answer/2476688.
            // To learn more about remarketing events and parameters, visit
            // https://support.google.com/google-ads/answer/7305793.
            .setName("ecomm_pagetype")
            .setStringRuleItem(
                UserListStringRuleItemInfo.newBuilder()
                    .setOperator(UserListStringRuleItemOperator.EQUALS)
                    .setValue("checkout")
                    .build())
            .build();
    // [END SetupAdvancedRemarketing]

    // Creates a rule targeting any user that had more than one item in their cart.
    // [START SetupAdvancedRemarketing_1]
    UserListRuleItemInfo cartSizeRule =
        UserListRuleItemInfo.newBuilder()
            // The rule variable name must match a corresponding key name fired from a pixel.
            .setName("cart_size")
            .setNumberRuleItem(
                UserListNumberRuleItemInfo.newBuilder()
                    .setOperator(UserListNumberRuleItemOperator.GREATER_THAN)
                    .setValue(1.0)
                    .build())
            .build();
    // [END SetupAdvancedRemarketing_1]

    // Creates a rule group that includes the checkout and cart size rules. Combining the two rule
    // items into a UserListRuleItemGroupInfo object causes Google Ads to AND their rules together.
    // To instead OR the rules together, each rule should be placed in its own rule item group.
    // [START SetupAdvancedRemarketing_2]
    UserListRuleItemGroupInfo checkoutAndCartSizeRuleGroup =
        UserListRuleItemGroupInfo.newBuilder()
            .addAllRuleItems(ImmutableList.of(checkoutRule, cartSizeRule))
            .build();
    // [END SetupAdvancedRemarketing_2]

    // Creates the RuleItem for checkout start date.
    // The tags and keys used below must have been in place in the past for the date range specified
    // in the rules.
    // [START SetupAdvancedRemarketing_3]
    UserListRuleItemInfo startDateRule =
        UserListRuleItemInfo.newBuilder()
            // The rule variable name must match a corresponding key name fired from a pixel.
            .setName("checkoutdate")
            .setDateRuleItem(
                UserListDateRuleItemInfo.newBuilder()
                    // Available UserListDateRuleItemOperators can be found at
                    // https://developers.google.com/google-ads/api/reference/rpc/latest/UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator
                    .setOperator(UserListDateRuleItemOperator.AFTER)
                    .setValue("20191031")
                    .build())
            .build();
    // [END SetupAdvancedRemarketing_3]

    // Creates the RuleItem for checkout end date.
    // [START SetupAdvancedRemarketing_4]
    UserListRuleItemInfo endDateRule =
        UserListRuleItemInfo.newBuilder()
            // The rule variable name must match a corresponding key name fired from a pixel.
            .setName("checkoutdate")
            .setDateRuleItem(
                UserListDateRuleItemInfo.newBuilder()
                    .setOperator(UserListDateRuleItemOperator.BEFORE)
                    .setValue("20200101")
                    .build())
            .build();
    // [END SetupAdvancedRemarketing_4]

    // Creates a rule group targeting users who checked out between November and December by using
    // the start and end date rules. Combining the two rule items into a UserListRuleItemGroupInfo
    // object causes Google Ads to AND their rules together. To instead OR the rules together, each
    // rule should be placed in its own rule item group.
    // [START SetupAdvancedRemarketing_5]
    UserListRuleItemGroupInfo checkoutDateRuleGroup =
        UserListRuleItemGroupInfo.newBuilder()
            .addAllRuleItems(ImmutableList.of(startDateRule, endDateRule))
            .build();
    // [END SetupAdvancedRemarketing_5]

    // Creates an ExpressionRuleUserListInfo object, or a boolean rule that defines this user list.
    // The default rule_type for a UserListRuleInfo object is OR of ANDs (disjunctive normal form).
    // That is, rule items will be ANDed together within rule item groups and the groups themselves
    // will be ORed together.
    // [START SetupAdvancedRemarketing_6]
    ExpressionRuleUserListInfo expressionRuleUserListInfo =
        ExpressionRuleUserListInfo.newBuilder()
            .setRule(
                UserListRuleInfo.newBuilder()
                    .addAllRuleItemGroups(
                        ImmutableList.of(checkoutAndCartSizeRuleGroup, checkoutDateRuleGroup)))
            .build();
    // [END SetupAdvancedRemarketing_6]

    // Defines a representation of a user list that is generated by a rule.
    RuleBasedUserListInfo ruleBasedUserListInfo =
        RuleBasedUserListInfo.newBuilder()
            // Optional: To include past users in the user list, set the prepopulation_status to
            // REQUESTED.
            .setPrepopulationStatus(UserListPrepopulationStatus.REQUESTED)
            .setExpressionRuleUserList(expressionRuleUserListInfo)
            .build();

    // Creates a user list.
    UserList userList =
        UserList.newBuilder()
            .setName("My expression rule user list #" + CodeSampleHelper.getPrintableDatetime())
            .setDescription(
                "Users who checked out in November or December OR visited the checkout page"
                    + " with more than one item in their cart")
            .setMembershipStatus(UserListMembershipStatus.OPEN)
            .setMembershipLifeSpan(90)
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
    }
  }
}

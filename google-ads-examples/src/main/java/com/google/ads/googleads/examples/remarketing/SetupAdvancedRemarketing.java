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
import com.google.ads.googleads.v3.common.ExpressionRuleUserListInfo;
import com.google.ads.googleads.v3.common.RuleBasedUserListInfo;
import com.google.ads.googleads.v3.common.UserListDateRuleItemInfo;
import com.google.ads.googleads.v3.common.UserListNumberRuleItemInfo;
import com.google.ads.googleads.v3.common.UserListRuleInfo;
import com.google.ads.googleads.v3.common.UserListRuleItemGroupInfo;
import com.google.ads.googleads.v3.common.UserListRuleItemInfo;
import com.google.ads.googleads.v3.common.UserListStringRuleItemInfo;
import com.google.ads.googleads.v3.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator;
import com.google.ads.googleads.v3.enums.UserListMembershipStatusEnum.UserListMembershipStatus;
import com.google.ads.googleads.v3.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator;
import com.google.ads.googleads.v3.enums.UserListPrepopulationStatusEnum.UserListPrepopulationStatus;
import com.google.ads.googleads.v3.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator;
import com.google.ads.googleads.v3.errors.GoogleAdsError;
import com.google.ads.googleads.v3.errors.GoogleAdsException;
import com.google.ads.googleads.v3.resources.UserList;
import com.google.ads.googleads.v3.services.MutateUserListsResponse;
import com.google.ads.googleads.v3.services.UserListOperation;
import com.google.ads.googleads.v3.services.UserListServiceClient;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.DoubleValue;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
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
    UserListRuleItemInfo checkoutRule =
        UserListRuleItemInfo.newBuilder()
            // The rule variable name must match a corresponding key name fired from a pixel.
            // To learn more about setting up remarketing tags, visit
            // https://support.google.com/google-ads/answer/2476688.
            // To learn more about remarketing events and parameters, visit
            // https://support.google.com/google-ads/answer/7305793.
            .setName(StringValue.of("ecomm_pagetype"))
            .setStringRuleItem(
                UserListStringRuleItemInfo.newBuilder()
                    .setOperator(UserListStringRuleItemOperator.EQUALS)
                    .setValue(StringValue.of("checkout"))
                    .build())
            .build();

    // Creates a rule targeting any user that had more than one item in their cart.
    UserListRuleItemInfo cartSizeRule =
        UserListRuleItemInfo.newBuilder()
            // The rule variable name must match a corresponding key name fired from a pixel.
            .setName(StringValue.of("cart_size"))
            .setNumberRuleItem(
                UserListNumberRuleItemInfo.newBuilder()
                    .setOperator(UserListNumberRuleItemOperator.GREATER_THAN)
                    .setValue(DoubleValue.of(1.0))
                    .build())
            .build();

    // Creates a rule group that includes the checkout and cart size rules. Combining the two rule
    // items into a UserListRuleItemGroupInfo object causes Google Ads to AND their rules together.
    // To instead OR the rules together, each rule should be placed in its own rule item group.
    UserListRuleItemGroupInfo checkoutAndCartSizeRuleGroup =
        UserListRuleItemGroupInfo.newBuilder()
            .addAllRuleItems(ImmutableList.of(checkoutRule, cartSizeRule))
            .build();

    // Creates the RuleItem for checkout start date.
    // The tags and keys used below must have been in place in the past for the date range specified
    // in the rules.
    UserListRuleItemInfo startDateRule =
        UserListRuleItemInfo.newBuilder()
            // The rule variable name must match a corresponding key name fired from a pixel.
            .setName(StringValue.of("checkoutdate"))
            .setDateRuleItem(
                UserListDateRuleItemInfo.newBuilder()
                    // Available UserListDateRuleItemOperators can be found at
                    // https://developers.google.com/google-ads/api/reference/rpc/google.ads.googleads.v3.enums#google.ads.googleads.v3.enums.UserListDateRuleItemOperatorEnum.UserListDateRuleItemOperator
                    .setOperator(UserListDateRuleItemOperator.AFTER)
                    .setValue(StringValue.of("20191031"))
                    .build())
            .build();

    // Creates the RuleItem for checkout end date.
    UserListRuleItemInfo endDateRule =
        UserListRuleItemInfo.newBuilder()
            // The rule variable name must match a corresponding key name fired from a pixel.
            .setName(StringValue.of("checkoutdate"))
            .setDateRuleItem(
                UserListDateRuleItemInfo.newBuilder()
                    .setOperator(UserListDateRuleItemOperator.BEFORE)
                    .setValue(StringValue.of("20200101"))
                    .build())
            .build();

    // Creates a rule group targeting users who checked out between November and December by using
    // the start and end date rules. Combining the two rule items into a UserListRuleItemGroupInfo
    // object causes Google Ads to AND their rules together. To instead OR the rules together, each
    // rule should be placed in its own rule item group.
    UserListRuleItemGroupInfo checkoutDateRuleGroup =
        UserListRuleItemGroupInfo.newBuilder()
            .addAllRuleItems(ImmutableList.of(startDateRule, endDateRule))
            .build();

    // Creates an ExpressionRuleUserListInfo object, or a boolean rule that defines this user list.
    // The default rule_type for a UserListRuleInfo object is OR of ANDs (disjunctive normal form).
    // That is, rule items will be ANDed together within rule item groups and the groups themselves
    // will be ORed together.
    ExpressionRuleUserListInfo expressionRuleUserListInfo =
        ExpressionRuleUserListInfo.newBuilder()
            .setRule(
                UserListRuleInfo.newBuilder()
                    .addAllRuleItemGroups(
                        ImmutableList.of(checkoutAndCartSizeRuleGroup, checkoutDateRuleGroup)))
            .build();

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
            .setName(StringValue.of("My expression rule user list #" + System.currentTimeMillis()))
            .setDescription(
                StringValue.of(
                    "Users who checked out in November or December OR visited the checkout page"
                        + " with more than one item in their cart"))
            .setMembershipStatus(UserListMembershipStatus.OPEN)
            .setMembershipLifeSpan(Int64Value.of(90))
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

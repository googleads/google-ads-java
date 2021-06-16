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

import static com.google.ads.googleads.examples.utils.CodeSampleHelper.getPrintableDateTime;

import com.beust.jcommander.Parameter;
import com.google.ads.googleads.examples.utils.ArgumentNames;
import com.google.ads.googleads.examples.utils.CodeSampleParams;
import com.google.ads.googleads.lib.GoogleAdsClient;
import com.google.ads.googleads.v8.common.ExpressionRuleUserListInfo;
import com.google.ads.googleads.v8.common.RuleBasedUserListInfo;
import com.google.ads.googleads.v8.common.UserListRuleInfo;
import com.google.ads.googleads.v8.common.UserListRuleItemGroupInfo;
import com.google.ads.googleads.v8.common.UserListRuleItemInfo;
import com.google.ads.googleads.v8.common.UserListStringRuleItemInfo;
import com.google.ads.googleads.v8.enums.UserListMembershipStatusEnum.UserListMembershipStatus;
import com.google.ads.googleads.v8.enums.UserListPrepopulationStatusEnum.UserListPrepopulationStatus;
import com.google.ads.googleads.v8.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator;
import com.google.ads.googleads.v8.errors.GoogleAdsError;
import com.google.ads.googleads.v8.errors.GoogleAdsException;
import com.google.ads.googleads.v8.resources.UserList;
import com.google.ads.googleads.v8.services.MutateUserListsResponse;
import com.google.ads.googleads.v8.services.UserListOperation;
import com.google.ads.googleads.v8.services.UserListServiceClient;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Creates a rule-based user list defined by an expression rule for users who have visited two
 * different sections of a website.
 */
public class AddExpressionRuleUserList {

  private static class AddExpressionRuleUserListParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    AddExpressionRuleUserListParams params = new AddExpressionRuleUserListParams();
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
      new AddExpressionRuleUserList().runExample(googleAdsClient, params.customerId);
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
  // [START add_expression_rule_user_list]
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    String urlString = "url__";

    // Creates a rule targeting any user that visited a url that contains 'example.com/section1'.
    UserListRuleItemInfo rule1 =
        UserListRuleItemInfo.newBuilder()
            // Uses a built-in parameter to create a domain URL rule.
            .setName(urlString)
            .setStringRuleItem(
                UserListStringRuleItemInfo.newBuilder()
                    .setOperator(UserListStringRuleItemOperator.CONTAINS)
                    .setValue("example.com/section1")
                    .build())
            .build();

    // Creates a rule targeting any user that visited a url that contains 'example.com/section2'.
    UserListRuleItemInfo rule2 =
        UserListRuleItemInfo.newBuilder()
            // Uses a built-in parameter to create a domain URL rule.
            .setName(urlString)
            .setStringRuleItem(
                UserListStringRuleItemInfo.newBuilder()
                    .setOperator(UserListStringRuleItemOperator.CONTAINS)
                    .setValue("example.com/section2")
                    .build())
            .build();

    // Creates an ExpressionRuleUserListInfo object, or a boolean rule that defines this user list.
    // The default rule_type for a UserListRuleInfo object is OR of ANDs (disjunctive normal form).
    // That is, rule items will be ANDed together within rule item groups and the groups themselves
    // will be ORed together.
    ExpressionRuleUserListInfo expressionRuleUserListInfo =
        ExpressionRuleUserListInfo.newBuilder()
            .setRule(
                UserListRuleInfo.newBuilder()
                    .addRuleItemGroups(
                        // Combine the two rule items into a UserListRuleItemGroupInfo object so
                        // Google Ads will AND their rules together. To instead OR the rules
                        // together, each rule should be placed in its own rule item group.
                        UserListRuleItemGroupInfo.newBuilder()
                            .addAllRuleItems(ImmutableList.of(rule1, rule2))
                            .build())
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

    // Creates a user list.
    UserList userList =
        UserList.newBuilder()
            .setName(
                "All visitors to example.com/section1 AND example.com/section2 #"
                    + getPrintableDateTime())
            .setDescription("Visitors of both example.com/section1 AND example.com/section2")
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
    }
  }
  // [END add_expression_rule_user_list]
}

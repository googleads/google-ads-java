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
import com.google.ads.googleads.v4.common.CombinedRuleUserListInfo;
import com.google.ads.googleads.v4.common.RuleBasedUserListInfo;
import com.google.ads.googleads.v4.common.UserListRuleInfo;
import com.google.ads.googleads.v4.common.UserListRuleItemGroupInfo;
import com.google.ads.googleads.v4.common.UserListRuleItemInfo;
import com.google.ads.googleads.v4.common.UserListStringRuleItemInfo;
import com.google.ads.googleads.v4.enums.UserListCombinedRuleOperatorEnum.UserListCombinedRuleOperator;
import com.google.ads.googleads.v4.enums.UserListMembershipStatusEnum.UserListMembershipStatus;
import com.google.ads.googleads.v4.enums.UserListPrepopulationStatusEnum.UserListPrepopulationStatus;
import com.google.ads.googleads.v4.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator;
import com.google.ads.googleads.v4.errors.GoogleAdsError;
import com.google.ads.googleads.v4.errors.GoogleAdsException;
import com.google.ads.googleads.v4.resources.UserList;
import com.google.ads.googleads.v4.services.MutateUserListsResponse;
import com.google.ads.googleads.v4.services.UserListOperation;
import com.google.ads.googleads.v4.services.UserListServiceClient;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Creates a rule-based user list defined by a combination of rules for users who have visited two
 * different pages of a website.
 */
public class AddCombinedRuleUserList {

  private static class AddCombinedRuleUserListParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    AddCombinedRuleUserListParams params = new AddCombinedRuleUserListParams();
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
      new AddCombinedRuleUserList().runExample(googleAdsClient, params.customerId);
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
    String urlString = "url__";

    // Creates a rule targeting any user that visited a url that equals
    // http://example.com/example1'.
    UserListRuleItemInfo userVisitedSite1Rule =
        UserListRuleItemInfo.newBuilder()
            // Uses a built-in parameter to create a domain URL rule.
            .setName(StringValue.of(urlString))
            .setStringRuleItem(
                UserListStringRuleItemInfo.newBuilder()
                    .setOperator(UserListStringRuleItemOperator.EQUALS)
                    .setValue(StringValue.of("http://example.com/example1"))
                    .build())
            .build();

    // Creates a UserListRuleInfo object containing the first rule.
    UserListRuleInfo userVisitedSite1RuleInfo =
        UserListRuleInfo.newBuilder()
            .addRuleItemGroups(
                UserListRuleItemGroupInfo.newBuilder().addRuleItems(userVisitedSite1Rule).build())
            .build();

    // Creates a rule targeting any user that visited a url that equals
    // http://example.com/example2'.
    UserListRuleItemInfo userVisitedSite2Rule =
        UserListRuleItemInfo.newBuilder()
            // Uses a built-in parameter to create a domain URL rule.
            .setName(StringValue.of(urlString))
            .setStringRuleItem(
                UserListStringRuleItemInfo.newBuilder()
                    .setOperator(UserListStringRuleItemOperator.EQUALS)
                    .setValue(StringValue.of("http://example.com/example2"))
                    .build())
            .build();

    // Creates a UserListRuleInfo object containing the second rule.
    UserListRuleInfo userVisitedSite2RuleInfo =
        UserListRuleInfo.newBuilder()
            .addRuleItemGroups(
                UserListRuleItemGroupInfo.newBuilder().addRuleItems(userVisitedSite2Rule).build())
            .build();

    // Creates the user list where "Visitors of a page who did visit another page". To create a user
    // list where "Visitors of a page who did not visit another page", change the
    // UserListCombinedRuleOperator from AND to AND_NOT.
    CombinedRuleUserListInfo combinedRuleUserListInfo =
        CombinedRuleUserListInfo.newBuilder()
            .setLeftOperand(userVisitedSite1RuleInfo)
            .setRightOperand(userVisitedSite2RuleInfo)
            .setRuleOperator(UserListCombinedRuleOperator.AND)
            .build();

    // Defines a representation of a user list that is generated by a rule.
    RuleBasedUserListInfo ruleBasedUserListInfo =
        RuleBasedUserListInfo.newBuilder()
            // Optional: To include past users in the user list, set the prepopulation_status to
            // REQUESTED.
            .setPrepopulationStatus(UserListPrepopulationStatus.REQUESTED)
            .setCombinedRuleUserList(combinedRuleUserListInfo)
            .build();

    // Creates a user list.
    UserList userList =
        UserList.newBuilder()
            .setName(
                StringValue.of(
                    "All visitors to http://example.com/example1 AND http://example.com/example2 #"
                        + System.currentTimeMillis()))
            .setDescription(
                StringValue.of(
                    "Visitors of both http://example.com/example1 AND http://example.com/example2"))
            .setMembershipStatus(UserListMembershipStatus.OPEN)
            .setMembershipLifeSpan(Int64Value.of(365))
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

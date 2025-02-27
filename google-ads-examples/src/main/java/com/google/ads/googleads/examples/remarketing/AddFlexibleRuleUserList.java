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
import com.google.ads.googleads.v19.common.FlexibleRuleOperandInfo;
import com.google.ads.googleads.v19.common.FlexibleRuleUserListInfo;
import com.google.ads.googleads.v19.common.RuleBasedUserListInfo;
import com.google.ads.googleads.v19.common.UserListRuleInfo;
import com.google.ads.googleads.v19.common.UserListRuleItemGroupInfo;
import com.google.ads.googleads.v19.common.UserListRuleItemInfo;
import com.google.ads.googleads.v19.common.UserListStringRuleItemInfo;
import com.google.ads.googleads.v19.enums.UserListFlexibleRuleOperatorEnum.UserListFlexibleRuleOperator;
import com.google.ads.googleads.v19.enums.UserListMembershipStatusEnum.UserListMembershipStatus;
import com.google.ads.googleads.v19.enums.UserListPrepopulationStatusEnum.UserListPrepopulationStatus;
import com.google.ads.googleads.v19.enums.UserListStringRuleItemOperatorEnum.UserListStringRuleItemOperator;
import com.google.ads.googleads.v19.errors.GoogleAdsError;
import com.google.ads.googleads.v19.errors.GoogleAdsException;
import com.google.ads.googleads.v19.resources.UserList;
import com.google.ads.googleads.v19.services.MutateUserListsResponse;
import com.google.ads.googleads.v19.services.UserListOperation;
import com.google.ads.googleads.v19.services.UserListServiceClient;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Creates a rule-based user list defined by a combination of rules for users who have visited two
 * different pages of a website.
 */
public class AddFlexibleRuleUserList {

  private static final String URL_STRING = "url__";

  private static class AddFlexibleRuleUserListParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) {
    AddFlexibleRuleUserListParams params = new AddFlexibleRuleUserListParams();
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
      new AddFlexibleRuleUserList().runExample(googleAdsClient, params.customerId);
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
  // [START add_combined_rule_user_list]
  private void runExample(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates a UserListRuleInfo object containing the first rule.
    UserListRuleInfo userVisitedSite1Rule =
        createUserListRuleInfoFromUrl("http://example.com/example1");

    // Creates a UserListRuleInfo object containing the second rule.
    UserListRuleInfo userVisitedSite2Rule =
        createUserListRuleInfoFromUrl("http://example.com/example2");

    // Creates a UserListRuleInfo object containing the third rule.
    UserListRuleInfo userVisitedSite3Rule =
        createUserListRuleInfoFromUrl("http://example.com/example3");

    // Create the user list "Visitors of page 1 AND page 2, but not page 3". To create the user list
    // "Visitors of page 1 *OR* page 2, but not page 3", change the UserListFlexibleRuleOperator
    // from AND to OR.
    FlexibleRuleUserListInfo flexibleRuleUserListInfo =
        FlexibleRuleUserListInfo.newBuilder()
            .setInclusiveRuleOperator(UserListFlexibleRuleOperator.AND)
            // Inclusive operands are joined together with the specified inclusiveRuleOperator. This
            // represents the set of users that should be included in the user list.
            .addInclusiveOperands(
                FlexibleRuleOperandInfo.newBuilder()
                    .setRule(userVisitedSite1Rule)
                    // Optional: adds a lookback window for this rule, in days.
                    .setLookbackWindowDays(7L))
            .addInclusiveOperands(
                FlexibleRuleOperandInfo.newBuilder()
                    .setRule(userVisitedSite2Rule)
                    // Optional: adds a lookback window for this rule, in days.
                    .setLookbackWindowDays(7L))
            .addExclusiveOperands(
                // Exclusive operands are joined together with OR. This represents the set of users
                // to be excluded from the user list.
                FlexibleRuleOperandInfo.newBuilder().setRule(userVisitedSite3Rule))
            .build();

    // Defines a representation of a user list that is generated by a rule.
    RuleBasedUserListInfo ruleBasedUserListInfo =
        RuleBasedUserListInfo.newBuilder()
            // Optional: To include past users in the user list, set the prepopulation_status to
            // REQUESTED.
            .setPrepopulationStatus(UserListPrepopulationStatus.REQUESTED)
            .setFlexibleRuleUserList(flexibleRuleUserListInfo)
            .build();

    // Creates a user list.
    UserList userList =
        UserList.newBuilder()
            .setName("Flexible rule user list for example.com #" + getPrintableDateTime())
            .setDescription(
                "Visitors of both http://example.com/example1 AND http://example.com/example2 but"
                    + " NOT http://example.com/example3")
            .setMembershipStatus(UserListMembershipStatus.OPEN)
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

  /**
   * Creates a UserListRuleInfo object containing a rule targeting any user that visited the
   * provided URL.
   */
  private UserListRuleInfo createUserListRuleInfoFromUrl(String urlString) {
    // Creates a rule targeting any user that visited a URL that equals the given urlString.
    UserListRuleItemInfo userVisitedSiteRule =
        UserListRuleItemInfo.newBuilder()
            // Uses a built-in parameter to create a domain URL rule.
            .setName(URL_STRING)
            .setStringRuleItem(
                UserListStringRuleItemInfo.newBuilder()
                    .setOperator(UserListStringRuleItemOperator.EQUALS)
                    .setValue(urlString))
            .build();

    // Returns a UserListRuleInfo object containing the rule.
    return UserListRuleInfo.newBuilder()
        .addRuleItemGroups(UserListRuleItemGroupInfo.newBuilder().addRuleItems(userVisitedSiteRule))
        .build();
  }
  // [END add_combined_rule_user_list]
}

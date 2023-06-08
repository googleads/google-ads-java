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
import com.google.ads.googleads.v14.common.LogicalUserListInfo;
import com.google.ads.googleads.v14.common.LogicalUserListOperandInfo;
import com.google.ads.googleads.v14.common.UserListLogicalRuleInfo;
import com.google.ads.googleads.v14.enums.UserListLogicalRuleOperatorEnum.UserListLogicalRuleOperator;
import com.google.ads.googleads.v14.errors.GoogleAdsError;
import com.google.ads.googleads.v14.errors.GoogleAdsException;
import com.google.ads.googleads.v14.resources.UserList;
import com.google.ads.googleads.v14.services.MutateUserListsResponse;
import com.google.ads.googleads.v14.services.UserListOperation;
import com.google.ads.googleads.v14.services.UserListServiceClient;
import com.google.ads.googleads.v14.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Creates a combination user list containing users that are present on any one of the provided user
 * lists.
 */
public class AddLogicalUserList {

  private static class AddLogicalUserListParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.USER_LIST_IDS, required = true)
    private List<Long> userListIds;
  }

  public static void main(String[] args) {
    AddLogicalUserListParams params = new AddLogicalUserListParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.userListIds =
          Arrays.asList(
              Long.parseLong("INSERT_USER_LIST_ID_HERE"),
              Long.parseLong("INSERT_USER_LIST_ID_HERE"));
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
      new AddLogicalUserList().runExample(googleAdsClient, params.customerId, params.userListIds);
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
        System.exit(1);
      }
    }
  }

  /**
   * Runs the example.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param userListIds the IDs of the lists to be used for the new combination user list.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START add_logical_user_list]
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, List<Long> userListIds) {
    // Adds each of the provided list IDs to a list of rule operands specifying which lists the
    // operator should target.
    List<LogicalUserListOperandInfo> logicalUserListOperandInfoList = new ArrayList<>();
    for (long userListId : userListIds) {
      String userListResourceName = ResourceNames.userList(customerId, userListId);
      logicalUserListOperandInfoList.add(
          LogicalUserListOperandInfo.newBuilder().setUserList(userListResourceName).build());
    }

    // Creates the UserListLogicalRuleInfo specifying that a user should be added to the new list if
    // they are present in any of the provided lists.
    UserListLogicalRuleInfo userListLogicalRuleInfo =
        UserListLogicalRuleInfo.newBuilder()
            // Using ANY means that a user should be added to the combined list if they are present
            // on any of the lists targeted in the LogicalUserListOperandInfo. Use ALL to add users
            // present on all of the provided lists or NONE to add users that aren't present on any
            // of the targeted lists.
            .setOperator(UserListLogicalRuleOperator.ANY)
            .addAllRuleOperands(logicalUserListOperandInfoList)
            .build();

    // Creates the new combination user list.
    UserList userList =
        UserList.newBuilder()
            .setName("My combination list of other user lists #" + getPrintableDateTime())
            .setLogicalUserList(
                LogicalUserListInfo.newBuilder().addRules(userListLogicalRuleInfo).build())
            .build();

    // Creates the operation.
    UserListOperation operation = UserListOperation.newBuilder().setCreate(userList).build();

    // Creates the service client.
    try (UserListServiceClient userListServiceClient =
        googleAdsClient.getLatestVersion().createUserListServiceClient()) {
      // Adds the user list.
      MutateUserListsResponse response =
          userListServiceClient.mutateUserLists(
              Long.toString(customerId), ImmutableList.of(operation));
      // Prints the response.
      System.out.printf(
          "Created combination user list with resource name, '%s'.%n",
          response.getResults(0).getResourceName());
    }
  }
  // [END add_logical_user_list]
}

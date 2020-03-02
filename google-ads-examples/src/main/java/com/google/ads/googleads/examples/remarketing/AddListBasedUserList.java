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
import com.google.ads.googleads.v1.utils.ResourceNames;
import com.google.ads.googleads.v2.common.LogicalUserListInfo;
import com.google.ads.googleads.v2.common.LogicalUserListOperandInfo;
import com.google.ads.googleads.v2.common.UserListLogicalRuleInfo;
import com.google.ads.googleads.v2.enums.UserListLogicalRuleOperatorEnum.UserListLogicalRuleOperator;
import com.google.ads.googleads.v2.errors.GoogleAdsError;
import com.google.ads.googleads.v2.errors.GoogleAdsException;
import com.google.ads.googleads.v2.resources.UserList;
import com.google.ads.googleads.v2.services.MutateUserListsResponse;
import com.google.ads.googleads.v2.services.UserListOperation;
import com.google.ads.googleads.v2.services.UserListServiceClient;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Creates a combination user list containing users that are present on any one of the provided user
 * lists.
 */
public class AddListBasedUserList {

  private static class AddListBasedUserListParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.USER_LIST_ID, required = true)
    private List<Long> userListIds;
  }

  public static void main(String[] args) {
    AddListBasedUserListParams params = new AddListBasedUserListParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.userListIds =
          Arrays.asList(
              Long.parseLong("INSERT_USER_LIST_ID_HERE"),
              Long.parseLong("INSERT_USER_LIST_ID_HERE"));
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
      new AddListBasedUserList().runExample(googleAdsClient, params.customerId, params.userListIds);
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
   * @param userListIds the IDs of the lists to be used for the new combination user list.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, List<Long> userListIds) {
    // Creates the rule operand info targeting the provided list IDs.
    List<LogicalUserListOperandInfo> logicalUserListOperandInfoList = new ArrayList<>();
    for (long userListId : userListIds) {
      String userListResourceName = ResourceNames.userList(customerId, userListId);
      logicalUserListOperandInfoList.add(
          LogicalUserListOperandInfo.newBuilder()
              .setUserList(StringValue.of(userListResourceName))
              .build());
    }

    // Creates the UserListLogicalRuleInfo specifying that a user should be added to the new list if
    // they are present in any of the provided lists.
    UserListLogicalRuleInfo userListLogicalRuleInfo =
        UserListLogicalRuleInfo.newBuilder()
            .setOperator(UserListLogicalRuleOperator.ANY)
            .addAllRuleOperands(logicalUserListOperandInfoList)
            .build();

    // Creates the new combination user list.
    UserList userList =
        UserList.newBuilder()
            .setName(
                StringValue.of(
                    "My combination list of other user lists #"
                        + System.currentTimeMillis()))
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
}

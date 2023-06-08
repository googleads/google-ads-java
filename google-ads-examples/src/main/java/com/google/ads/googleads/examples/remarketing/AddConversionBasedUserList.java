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
import com.google.ads.googleads.v14.common.BasicUserListInfo;
import com.google.ads.googleads.v14.common.UserListActionInfo;
import com.google.ads.googleads.v14.enums.UserListMembershipStatusEnum.UserListMembershipStatus;
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

/** Creates a basic user list consisting of people who triggered one or more conversion actions. */
public class AddConversionBasedUserList {
  private static class AddConversionBasedUserListParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(names = ArgumentNames.CONVERSION_ACTION_IDS, required = true)
    private List<Long> conversionActionIds;
  }

  public static void main(String[] args) {
    AddConversionBasedUserListParams params = new AddConversionBasedUserListParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.conversionActionIds =
          Arrays.asList(
              Long.parseLong("INSERT_CONVERSION_ACTION_ID_HERE"),
              Long.parseLong("INSERT_CONVERSION_ACTION_ID_HERE"));
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
      new AddConversionBasedUserList()
          .runExample(googleAdsClient, params.customerId, params.conversionActionIds);
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
   * @param conversionActionIds the IDs of the conversion actions for the basic user list.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  // [START add_conversion_based_user_list]
  private void runExample(
      GoogleAdsClient googleAdsClient, long customerId, List<Long> conversionActionIds) {
    List<UserListActionInfo> userListActionInfoList = new ArrayList<>();
    for (long conversionActionId : conversionActionIds) {
      // Creates the UserListActionInfo object for a given conversion action. This specifies the
      // conversion action that, when triggered, will cause a user to be added to a UserList.
      UserListActionInfo userListActionInfo =
          UserListActionInfo.newBuilder()
              .setConversionAction(ResourceNames.conversionAction(customerId, conversionActionId))
              .build();
      userListActionInfoList.add(userListActionInfo);
    }

    // Creates a basic user list info object with all of the conversion actions.
    BasicUserListInfo basicUserListInfo =
        BasicUserListInfo.newBuilder().addAllActions(userListActionInfoList).build();

    // Creates the basic user list.
    UserList basicUserList =
        UserList.newBuilder()
            .setName("Example BasicUserList #" + getPrintableDateTime())
            .setDescription("A list of people who have triggered one or more conversion actions")
            .setMembershipLifeSpan(365)
            .setBasicUserList(basicUserListInfo)
            .setMembershipStatus(UserListMembershipStatus.OPEN)
            .build();

    // Creates the operation.
    UserListOperation operation = UserListOperation.newBuilder().setCreate(basicUserList).build();

    // Creates the service client.
    try (UserListServiceClient userListServiceClient =
        googleAdsClient.getLatestVersion().createUserListServiceClient()) {
      // Adds the basic user list.
      MutateUserListsResponse response =
          userListServiceClient.mutateUserLists(
              Long.toString(customerId), ImmutableList.of(operation));
      // Prints the results.
      System.out.printf(
          "Created basic user list with resource name '%s'.%n",
          response.getResults(0).getResourceName());
    }
  }
  // [END add_conversion_based_user_list]
}

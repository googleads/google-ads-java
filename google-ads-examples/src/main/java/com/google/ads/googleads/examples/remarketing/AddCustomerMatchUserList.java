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
import com.google.ads.googleads.v10.common.CrmBasedUserListInfo;
import com.google.ads.googleads.v10.common.CustomerMatchUserListMetadata;
import com.google.ads.googleads.v10.common.OfflineUserAddressInfo;
import com.google.ads.googleads.v10.common.UserData;
import com.google.ads.googleads.v10.common.UserIdentifier;
import com.google.ads.googleads.v10.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType;
import com.google.ads.googleads.v10.enums.OfflineUserDataJobStatusEnum.OfflineUserDataJobStatus;
import com.google.ads.googleads.v10.enums.OfflineUserDataJobTypeEnum.OfflineUserDataJobType;
import com.google.ads.googleads.v10.errors.GoogleAdsError;
import com.google.ads.googleads.v10.errors.GoogleAdsException;
import com.google.ads.googleads.v10.errors.GoogleAdsFailure;
import com.google.ads.googleads.v10.resources.OfflineUserDataJob;
import com.google.ads.googleads.v10.resources.UserList;
import com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsRequest;
import com.google.ads.googleads.v10.services.AddOfflineUserDataJobOperationsResponse;
import com.google.ads.googleads.v10.services.CreateOfflineUserDataJobResponse;
import com.google.ads.googleads.v10.services.GoogleAdsRow;
import com.google.ads.googleads.v10.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v10.services.MutateUserListsResponse;
import com.google.ads.googleads.v10.services.OfflineUserDataJobOperation;
import com.google.ads.googleads.v10.services.OfflineUserDataJobServiceClient;
import com.google.ads.googleads.v10.services.SearchGoogleAdsStreamRequest;
import com.google.ads.googleads.v10.services.SearchGoogleAdsStreamResponse;
import com.google.ads.googleads.v10.services.UserListOperation;
import com.google.ads.googleads.v10.services.UserListServiceClient;
import com.google.ads.googleads.v10.utils.ErrorUtils;
import com.google.api.gax.rpc.ServerStream;
import com.google.common.collect.ImmutableList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Creates a user list (a.k.a. audience) and uploads members to populate the list.
 *
 * <p><em>Notes:</em>
 *
 * <ul>
 *   <li>This feature is only available to allowlisted accounts. See
 *       https://support.google.com/adspolicy/answer/6299717 for more details.
 *   <li>It may take up to several hours for the list to be populated with members.
 *   <li>Email addresses must be associated with a Google account.
 *   <li>For privacy purposes, the user list size will show as zero until the list has at least
 *       1,000 members. After that, the size will be rounded to the two most significant digits.
 * </ul>
 */
public class AddCustomerMatchUserList {

  private static class AddCustomerMatchUserListParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;
  }

  public static void main(String[] args) throws UnsupportedEncodingException {
    AddCustomerMatchUserListParams params = new AddCustomerMatchUserListParams();
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
      new AddCustomerMatchUserList().runExample(googleAdsClient, params.customerId);
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
  private void runExample(GoogleAdsClient googleAdsClient, long customerId)
      throws UnsupportedEncodingException {
    // Creates a Customer Match user list.
    String userListResourceName = createCustomerMatchUserList(googleAdsClient, customerId);

    // Adds members to the user list.
    addUsersToCustomerMatchUserList(googleAdsClient, customerId, userListResourceName);
  }

  /**
   * Creates a Customer Match user list.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @return the resource name of the newly created user list.
   */
  private String createCustomerMatchUserList(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates the new user list.
    UserList userList =
        UserList.newBuilder()
            .setName("Customer Match list #" + getPrintableDateTime())
            .setDescription("A list of customers that originated from email addresses")
            // Customer Match user lists can use a membership life span of 10,000 to indicate
            // unlimited; otherwise normal values apply.
            // Sets the membership life span to 30 days.
            .setMembershipLifeSpan(30)
            // Sets the upload key type to indicate the type of identifier that will be used to
            // add users to the list. This field is immutable and required for an ADD operation.
            .setCrmBasedUserList(
                CrmBasedUserListInfo.newBuilder()
                    .setUploadKeyType(CustomerMatchUploadKeyType.CONTACT_INFO))
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
          "Created Customer Match user list with resource name: %s.%n",
          response.getResults(0).getResourceName());
      return response.getResults(0).getResourceName();
    }
  }

  /**
   * Creates and executes an asynchronous job to add users to the Customer Match user list.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param userListResourceName the resource name of the Customer Match user list to add members.
   *     to.
   */
  // [START add_customer_match_user_list]
  private void addUsersToCustomerMatchUserList(
      GoogleAdsClient googleAdsClient, long customerId, String userListResourceName)
      throws UnsupportedEncodingException {
    try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient =
        googleAdsClient.getLatestVersion().createOfflineUserDataJobServiceClient()) {
      // Creates a new offline user data job.
      OfflineUserDataJob offlineUserDataJob =
          OfflineUserDataJob.newBuilder()
              .setType(OfflineUserDataJobType.CUSTOMER_MATCH_USER_LIST)
              .setCustomerMatchUserListMetadata(
                  CustomerMatchUserListMetadata.newBuilder().setUserList(userListResourceName))
              .build();

      // Issues a request to create the offline user data job.
      CreateOfflineUserDataJobResponse createOfflineUserDataJobResponse =
          offlineUserDataJobServiceClient.createOfflineUserDataJob(
              Long.toString(customerId), offlineUserDataJob);
      String offlineUserDataJobResourceName = createOfflineUserDataJobResponse.getResourceName();
      System.out.printf(
          "Created an offline user data job with resource name: %s.%n",
          offlineUserDataJobResourceName);

      // Issues a request to add the operations to the offline user data job.
      List<OfflineUserDataJobOperation> userDataJobOperations = buildOfflineUserDataJobOperations();
      AddOfflineUserDataJobOperationsResponse response =
          offlineUserDataJobServiceClient.addOfflineUserDataJobOperations(
              AddOfflineUserDataJobOperationsRequest.newBuilder()
                  .setResourceName(offlineUserDataJobResourceName)
                  .setEnablePartialFailure(true)
                  .addAllOperations(userDataJobOperations)
                  .build());

      // Prints the status message if any partial failure error is returned.
      // NOTE: The details of each partial failure error are not printed here, you can refer to
      // the example HandlePartialFailure.java to learn more.
      if (response.hasPartialFailureError()) {
        GoogleAdsFailure googleAdsFailure =
            ErrorUtils.getInstance().getGoogleAdsFailure(response.getPartialFailureError());
        System.out.printf(
            "Encountered %d partial failure errors while adding %d operations to the offline user "
                + "data job: '%s'. Only the successfully added operations will be executed when "
                + "the job runs.%n",
            googleAdsFailure.getErrorsCount(),
            userDataJobOperations.size(),
            response.getPartialFailureError().getMessage());
      } else {
        System.out.printf(
            "Successfully added %d operations to the offline user data job.%n",
            userDataJobOperations.size());
      }

      // Issues an asynchronous request to run the offline user data job for executing
      // all added operations.
      offlineUserDataJobServiceClient.runOfflineUserDataJobAsync(offlineUserDataJobResourceName);

      // BEWARE! The above call returns an OperationFuture. The execution of that future depends on
      // the thread pool which is owned by offlineUserDataJobServiceClient. If you use this future,
      // you *must* keep the service client in scope too.
      // See https://developers.google.com/google-ads/api/docs/client-libs/java/lro for more detail.

      // Offline user data jobs may take up to 24 hours to complete, so instead of waiting for the
      // job to complete, retrieves and displays the job status once. If the job is completed
      // successfully, prints information about the user list. Otherwise, prints the query to use
      // to check the job again later.
      checkJobStatus(
          googleAdsClient, customerId, offlineUserDataJobResourceName, userListResourceName);
    }
  }
  // [END add_customer_match_user_list]

  /**
   * Creates a list of offline user data job operations that will add users to the list.
   *
   * @return a list of operations.
   */
  private List<OfflineUserDataJobOperation> buildOfflineUserDataJobOperations()
      throws UnsupportedEncodingException {
    MessageDigest sha256Digest;
    try {
      sha256Digest = MessageDigest.getInstance("SHA-256");
    } catch (NoSuchAlgorithmException e) {
      throw new RuntimeException("Missing SHA-256 algorithm implementation", e);
    }

    // [START add_customer_match_user_list_2]
    // Creates the first user data based on an email address.
    UserData userDataWithEmailAddress =
        UserData.newBuilder()
            .addUserIdentifiers(
                UserIdentifier.newBuilder()
                    .setHashedEmail(normalizeAndHash(sha256Digest, "customer@example.com")))
            .build();

    // Creates the second user data based on a physical address.
    UserData userDataWithPhysicalAddress =
        UserData.newBuilder()
            .addUserIdentifiers(
                UserIdentifier.newBuilder()
                    .setAddressInfo(
                        OfflineUserAddressInfo.newBuilder()
                            .setHashedFirstName(normalizeAndHash(sha256Digest, "John"))
                            .setHashedLastName(normalizeAndHash(sha256Digest, "Doe"))
                            .setCountryCode("US")
                            .setPostalCode("10011")))
            .build();
    // [END add_customer_match_user_list_2]

    // Creates the operations to add the two users.
    List<OfflineUserDataJobOperation> operations = new ArrayList<>();
    for (UserData userData : Arrays.asList(userDataWithEmailAddress, userDataWithPhysicalAddress)) {
      operations.add(OfflineUserDataJobOperation.newBuilder().setCreate(userData).build());
    }

    return operations;
  }

  /**
   * Returns the result of normalizing and then hashing the string using the provided digest.
   * Private customer data must be hashed during upload, as described at
   * https://support.google.com/google-ads/answer/7474263.
   *
   * @param digest the digest to use to hash the normalized string.
   * @param s the string to normalize and hash.
   */
  private String normalizeAndHash(MessageDigest digest, String s)
      throws UnsupportedEncodingException {
    // Normalizes by removing leading and trailing whitespace and converting all characters to
    // lower case.
    String normalized = s.trim().toLowerCase();
    // Hashes the normalized string using the hashing algorithm.
    byte[] hash = digest.digest(normalized.getBytes("UTF-8"));
    StringBuilder result = new StringBuilder();
    for (byte b : hash) {
      result.append(String.format("%02x", b));
    }

    return result.toString();
  }

  /**
   * Retrieves, checks, and prints the status of the offline user data job.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param offlineUserDataJobResourceName the resource name of the OfflineUserDataJob to get the
   *     status for.
   * @param userListResourceName the resource name of the Customer Match user list.
   */
  private void checkJobStatus(
      GoogleAdsClient googleAdsClient,
      long customerId,
      String offlineUserDataJobResourceName,
      String userListResourceName) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      String query =
          String.format(
              "SELECT offline_user_data_job.resource_name, "
                  + "offline_user_data_job.id, "
                  + "offline_user_data_job.status, "
                  + "offline_user_data_job.type, "
                  + "offline_user_data_job.failure_reason "
                  + "FROM offline_user_data_job "
                  + "WHERE offline_user_data_job.resource_name = '%s'",
              offlineUserDataJobResourceName);
      // Issues the query and gets the GoogleAdsRow containing the job from the response.
      GoogleAdsRow googleAdsRow =
          googleAdsServiceClient
              .search(Long.toString(customerId), query)
              .iterateAll()
              .iterator()
              .next();
      OfflineUserDataJob offlineUserDataJob = googleAdsRow.getOfflineUserDataJob();
      System.out.printf(
          "Offline user data job ID %d with type '%s' has status: %s%n",
          offlineUserDataJob.getId(), offlineUserDataJob.getType(), offlineUserDataJob.getStatus());
      OfflineUserDataJobStatus jobStatus = offlineUserDataJob.getStatus();
      if (OfflineUserDataJobStatus.SUCCESS == jobStatus) {
        // Prints information about the user list.
        printCustomerMatchUserListInfo(googleAdsClient, customerId, userListResourceName);
      } else if (OfflineUserDataJobStatus.FAILED == jobStatus) {
        System.out.printf("  Failure reason: %s%n", offlineUserDataJob.getFailureReason());
      } else if (OfflineUserDataJobStatus.PENDING == jobStatus
          || OfflineUserDataJobStatus.RUNNING == jobStatus) {
        System.out.println();
        System.out.printf(
            "To check the status of the job periodically, use the following GAQL query with"
                + " GoogleAdsService.search:%n%s%n",
            query);
      }
    }
  }

  /**
   * Prints information about the Customer Match user list.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID .
   * @param userListResourceName the resource name of the Customer Match user list.
   */
  private void printCustomerMatchUserListInfo(
      GoogleAdsClient googleAdsClient, long customerId, String userListResourceName) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      // Creates a query that retrieves the user list.
      String query =
          String.format(
              "SELECT user_list.size_for_display, user_list.size_for_search "
                  + "FROM user_list "
                  + "WHERE user_list.resource_name = '%s'",
              userListResourceName);

      // Constructs the SearchGoogleAdsStreamRequest.
      SearchGoogleAdsStreamRequest request =
          SearchGoogleAdsStreamRequest.newBuilder()
              .setCustomerId(Long.toString(customerId))
              .setQuery(query)
              .build();

      // Issues the search stream request.
      ServerStream<SearchGoogleAdsStreamResponse> stream =
          googleAdsServiceClient.searchStreamCallable().call(request);

      // Gets the first and only row from the response.
      GoogleAdsRow googleAdsRow = stream.iterator().next().getResultsList().get(0);
      UserList userList = googleAdsRow.getUserList();
      System.out.printf(
          "User list '%s' has an estimated %d users for Display and %d users for Search.%n",
          userList.getResourceName(), userList.getSizeForDisplay(), userList.getSizeForSearch());
      System.out.println(
          "Reminder: It may take several hours for the user list to be populated with the users.");
    }
  }
}

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
import com.google.ads.googleads.v22.common.Consent;
import com.google.ads.googleads.v22.common.CrmBasedUserListInfo;
import com.google.ads.googleads.v22.common.CustomerMatchUserListMetadata;
import com.google.ads.googleads.v22.common.OfflineUserAddressInfo;
import com.google.ads.googleads.v22.common.UserData;
import com.google.ads.googleads.v22.common.UserIdentifier;
import com.google.ads.googleads.v22.enums.ConsentStatusEnum.ConsentStatus;
import com.google.ads.googleads.v22.enums.CustomerMatchUploadKeyTypeEnum.CustomerMatchUploadKeyType;
import com.google.ads.googleads.v22.enums.OfflineUserDataJobStatusEnum.OfflineUserDataJobStatus;
import com.google.ads.googleads.v22.enums.OfflineUserDataJobTypeEnum.OfflineUserDataJobType;
import com.google.ads.googleads.v22.errors.GoogleAdsError;
import com.google.ads.googleads.v22.errors.GoogleAdsException;
import com.google.ads.googleads.v22.errors.GoogleAdsFailure;
import com.google.ads.googleads.v22.resources.OfflineUserDataJob;
import com.google.ads.googleads.v22.resources.UserList;
import com.google.ads.googleads.v22.services.AddOfflineUserDataJobOperationsRequest;
import com.google.ads.googleads.v22.services.AddOfflineUserDataJobOperationsResponse;
import com.google.ads.googleads.v22.services.CreateOfflineUserDataJobResponse;
import com.google.ads.googleads.v22.services.GoogleAdsRow;
import com.google.ads.googleads.v22.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v22.services.MutateUserListsResponse;
import com.google.ads.googleads.v22.services.OfflineUserDataJobOperation;
import com.google.ads.googleads.v22.services.OfflineUserDataJobServiceClient;
import com.google.ads.googleads.v22.services.SearchGoogleAdsStreamRequest;
import com.google.ads.googleads.v22.services.SearchGoogleAdsStreamResponse;
import com.google.ads.googleads.v22.services.UserListOperation;
import com.google.ads.googleads.v22.services.UserListServiceClient;
import com.google.ads.googleads.v22.utils.ErrorUtils;
import com.google.ads.googleads.v22.utils.ResourceNames;
import com.google.api.gax.rpc.ServerStream;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Creates operations to add members to a user list (a.k.a. audience) using an OfflineUserDataJob,
 * and if requested, runs the job.
 *
 * <p>If a job ID is specified, this example adds operations to that job. Otherwise, it creates a
 * new job for the operations.
 *
 * <p>IMPORTANT: Your application should create a single job containing <em>all</em> of the
 * operations for a user list. This will be far more efficient than creating and running multiple
 * jobs that each contain a small set of operations.
 *
 * <p><em>Notes:</em>
 *
 * <ul>
 *   <li>This feature is only available to accounts that meet the requirements described at
 *       https://support.google.com/adspolicy/answer/6299717.
 *   <li>It may take up to several hours for the list to be populated with members.
 *   <li>Email addresses must be associated with a Google account.
 *   <li>For privacy purposes, the user list size will show as zero until the list has at least
 *       100 members. After that, the size will be rounded to the two most significant digits.
 * </ul>
 */
public class AddCustomerMatchUserList {

  private static class AddCustomerMatchUserListParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(
        names = ArgumentNames.RUN_JOB,
        required = true,
        arity = 1,
        description =
            "If true, runs the OfflineUserDataJob after adding operations. The default value is"
                + " false.")
    private boolean runJob = true;

    @Parameter(
        names = ArgumentNames.USER_LIST_ID,
        required = false,
        description =
            "The ID of an existing user list. If not specified, this example will create a new user"
                + " list.")
    private Long userListId;

    @Parameter(
        names = ArgumentNames.OFFLINE_USER_DATA_JOB_ID,
        required = false,
        description =
            "The ID of an existing OfflineUserDataJob in the PENDING state. If not specified, this"
                + " example will create a new job.")
    private Long offlineUserDataJobId;

    @Parameter(names = ArgumentNames.AD_PERSONALIZATION_CONSENT, required = false)
    private ConsentStatus adPersonalizationConsent;

    @Parameter(names = ArgumentNames.AD_USER_DATA_CONSENT, required = false)
    private ConsentStatus adUserDataConsent;
  }

  public static void main(String[] args) throws UnsupportedEncodingException {
    AddCustomerMatchUserListParams params = new AddCustomerMatchUserListParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.runJob = Boolean.parseBoolean("INSERT_RUN_JOB_HERE");

      // Optional parameters:
      // params.userListId = Long.parseLong("INSERT_USER_LIST_ID_HERE");
      // params.offlineUserDataJobId = Long.parseLong("INSERT_OFFLINE_USER_DATA_JOB_ID_HERE");
      // params.adPersonalizationConsent =
      //     ConsentStatus.valueOf("INSERT_AD_USER_PERSONALIZATION_CONSENT_HERE");
      // params.adUserDataConsent = ConsentStatus.valueOf("INSERT_AD_USER_DATA_CONSENT_HERE");
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
      new AddCustomerMatchUserList()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.runJob,
              params.userListId,
              params.offlineUserDataJobId,
              params.adPersonalizationConsent,
              params.adUserDataConsent);
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
   * @param runJob if true, runs the OfflineUserDataJob after adding operations. Otherwise, only
   *     adds operations to the job.
   * @param userListId optional ID of an existing user list. If {@code null}, creates a new user
   *     list.
   * @param offlineUserDataJobId optional ID of an existing OfflineUserDataJob in the PENDING state.
   *     If {@code null}, creates a new job.
   * @param adPersonalizationConsent consent status for ad personalization for all members in the
   *     job.
   * @param adUserDataConsent consent status for ad user data for all members in the job.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      boolean runJob,
      Long userListId,
      Long offlineUserDataJobId,
      ConsentStatus adPersonalizationConsent,
      ConsentStatus adUserDataConsent)
      throws UnsupportedEncodingException {
    String userListResourceName = null;
    if (offlineUserDataJobId == null) {
      if (userListId == null) {
        // Creates a Customer Match user list.
        userListResourceName = createCustomerMatchUserList(googleAdsClient, customerId);
      } else if (userListId != null) {
        // Uses the specified Customer Match user list.
        userListResourceName = ResourceNames.userList(customerId, userListId);
      }
    }

    // Adds members to the user list.
    addUsersToCustomerMatchUserList(
        googleAdsClient,
        customerId,
        runJob,
        userListResourceName,
        offlineUserDataJobId,
        adPersonalizationConsent,
        adUserDataConsent);
  }

  /**
   * Creates a Customer Match user list.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @return the resource name of the newly created user list.
   */
  // [START add_customer_match_user_list_3]
  private String createCustomerMatchUserList(GoogleAdsClient googleAdsClient, long customerId) {
    // Creates the new user list.
    UserList userList =
        UserList.newBuilder()
            .setName("Customer Match list #" + getPrintableDateTime())
            .setDescription("A list of customers that originated from email addresses")
            // Membership life span must be between 0 and 540 days inclusive. See:
            // https://developers.google.com/google-ads/api/reference/rpc/latest/UserList#membership_life_span
            // Sets the membership life span to 30 days.
            .setMembershipLifeSpan(30)
            // Sets the upload key type to indicate the type of identifier that will be used to
            // add users to the list. This field is immutable and required for a CREATE operation.
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

  // [END add_customer_match_user_list_3]

  /**
   * Creates and executes an asynchronous job to add users to the Customer Match user list.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID.
   * @param runJob if true, runs the OfflineUserDataJob after adding operations. Otherwise, only
   *     adds operations to the job.
   * @param userListResourceName the resource name of the Customer Match user list to add members
   *     to.
   * @param offlineUserDataJobId optional ID of an existing OfflineUserDataJob in the PENDING state.
   *     If {@code null}, creates a new job.
   * @param adPersonalizationConsent consent status for ad personalization for all members in the
   *     job. Only used if {@code offlineUserDataJobId} is {@code null}.
   * @param adUserDataConsent consent status for ad user data for all members in the job. Only used
   *     if {@code offlineUserDataJobId} is {@code null}.
   */
  // [START add_customer_match_user_list]
  private void addUsersToCustomerMatchUserList(
      GoogleAdsClient googleAdsClient,
      long customerId,
      boolean runJob,
      String userListResourceName,
      Long offlineUserDataJobId,
      ConsentStatus adPersonalizationConsent,
      ConsentStatus adUserDataConsent)
      throws UnsupportedEncodingException {
    try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient =
        googleAdsClient.getLatestVersion().createOfflineUserDataJobServiceClient()) {
      String offlineUserDataJobResourceName;
      if (offlineUserDataJobId == null) {
        // Creates a new offline user data job.
        OfflineUserDataJob.Builder offlineUserDataJobBuilder =
            OfflineUserDataJob.newBuilder()
                .setType(OfflineUserDataJobType.CUSTOMER_MATCH_USER_LIST)
                .setCustomerMatchUserListMetadata(
                    CustomerMatchUserListMetadata.newBuilder().setUserList(userListResourceName));
        // Adds consent information to the job if specified.
        if (adPersonalizationConsent != null || adUserDataConsent != null) {
          Consent.Builder consentBuilder = Consent.newBuilder();
          if (adPersonalizationConsent != null) {
            consentBuilder.setAdPersonalization(adPersonalizationConsent);
          }
          if (adUserDataConsent != null) {
            consentBuilder.setAdUserData(adUserDataConsent);
          }
          // Specifies whether user consent was obtained for the data you are uploading. See
          // https://www.google.com/about/company/user-consent-policy for details.
          offlineUserDataJobBuilder
              .getCustomerMatchUserListMetadataBuilder()
              .setConsent(consentBuilder);
        }

        // Issues a request to create the offline user data job.
        CreateOfflineUserDataJobResponse createOfflineUserDataJobResponse =
            offlineUserDataJobServiceClient.createOfflineUserDataJob(
                Long.toString(customerId), offlineUserDataJobBuilder.build());
        offlineUserDataJobResourceName = createOfflineUserDataJobResponse.getResourceName();
        System.out.printf(
            "Created an offline user data job with resource name: %s.%n",
            offlineUserDataJobResourceName);
      } else {
        // Reuses the specified offline user data job.
        offlineUserDataJobResourceName =
            ResourceNames.offlineUserDataJob(customerId, offlineUserDataJobId);
      }

      // Issues a request to add the operations to the offline user data job. This example
      // only adds a few operations, so it only sends one AddOfflineUserDataJobOperations request.
      // If your application is adding a large number of operations, split the operations into
      // batches and send multiple AddOfflineUserDataJobOperations requests for the SAME job. See
      // https://developers.google.com/google-ads/api/docs/remarketing/audience-types/customer-match#customer_match_considerations
      // and https://developers.google.com/google-ads/api/docs/best-practices/quotas#user_data
      // for more information on the per-request limits.
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

      if (!runJob) {
        System.out.printf(
            "Not running offline user data job '%s', as requested.%n",
            offlineUserDataJobResourceName);
        return;
      }

      // Issues an asynchronous request to run the offline user data job for executing
      // all added operations.
      offlineUserDataJobServiceClient.runOfflineUserDataJobAsync(offlineUserDataJobResourceName);

      // BEWARE! The above call returns an OperationFuture. The execution of that future depends on
      // the thread pool which is owned by offlineUserDataJobServiceClient. If you use this future,
      // you *must* keep the service client in scope too.
      // See https://developers.google.com/google-ads/api/docs/client-libs/java/lro for more detail.

      // Offline user data jobs may take 6 hours or more to complete, so instead of waiting for the
      // job to complete, retrieves and displays the job status once. If the job is completed
      // successfully, prints information about the user list. Otherwise, prints the query to use
      // to check the job again later.
      checkJobStatus(googleAdsClient, customerId, offlineUserDataJobResourceName);
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
    // Creates a raw input list of unhashed user information, where each element of the list
    // represents a single user and is a map containing a separate entry for the keys "email",
    // "phone", "firstName", "lastName", "countryCode", and "postalCode". In your application, this
    // data might come from a file or a database.
    List<Map<String, String>> rawRecords = new ArrayList<>();
    // The first user data has an email address and a phone number.
    Map<String, String> rawRecord1 =
        ImmutableMap.<String, String>builder()
            .put("email", "dana@example.com")
            // Phone number to be converted to E.164 format, with a leading '+' as required. This
            // includes whitespace that will be removed later.
            .put("phone", "+1 800 5550101")
            .build();
    // The second user data has an email address, a mailing address, and a phone number.
    Map<String, String> rawRecord2 =
        ImmutableMap.<String, String>builder()
            // Email address that includes a period (.) before the domain.
            .put("email", "alex.2@example.com")
            // Address that includes all four required elements: first name, last name, country
            // code, and postal code.
            .put("firstName", "Alex")
            .put("lastName", "Quinn")
            .put("countryCode", "US")
            .put("postalCode", "94045")
            // Phone number to be converted to E.164 format, with a leading '+' as required.
            .put("phone", "+1 800 5550102")
            .build();
    // The third user data only has an email address.
    Map<String, String> rawRecord3 =
        ImmutableMap.<String, String>builder().put("email", "charlie@example.com").build();
    // Adds the raw records to the raw input list.
    rawRecords.add(rawRecord1);
    rawRecords.add(rawRecord2);
    rawRecords.add(rawRecord3);

    // Iterates over the raw input list and creates a UserData object for each record.
    List<UserData> userDataList = new ArrayList<>();
    for (Map<String, String> rawRecord : rawRecords) {
      // Creates a builder for the UserData object that represents a member of the user list.
      UserData.Builder userDataBuilder = UserData.newBuilder();
      // Checks if the record has email, phone, or address information, and adds a SEPARATE
      // UserIdentifier object for each one found. For example, a record with an email address and a
      // phone number will result in a UserData with two UserIdentifiers.

      // IMPORTANT: Since the identifier attribute of UserIdentifier
      // (https://developers.google.com/google-ads/api/reference/rpc/latest/UserIdentifier) is a
      // oneof
      // (https://protobuf.dev/programming-guides/proto3/#oneof-features), you must set only ONE of
      // hashedEmail, hashedPhoneNumber, mobileId, thirdPartyUserId, or addressInfo. Setting more
      // than one of these attributes on the same UserIdentifier will clear all the other members
      // of the oneof. For example, the following code is INCORRECT and will result in a
      // UserIdentifier with ONLY a hashedPhoneNumber.
      //
      // UserIdentifier incorrectlyPopulatedUserIdentifier =
      //     UserIdentifier.newBuilder()
      //         .setHashedEmail("...")
      //         .setHashedPhoneNumber("...")
      //         .build();
      //
      // The separate 'if' statements below demonstrate the correct approach for creating a UserData
      // for a member with multiple UserIdentifiers.

      // Checks if the record has an email address, and if so, adds a UserIdentifier for it.
      if (rawRecord.containsKey("email")) {
        UserIdentifier hashedEmailIdentifier =
            UserIdentifier.newBuilder()
                .setHashedEmail(normalizeAndHash(sha256Digest, rawRecord.get("email"), true))
                .build();
        // Adds the hashed email identifier to the UserData object's list.
        userDataBuilder.addUserIdentifiers(hashedEmailIdentifier);
      }

      // Checks if the record has a phone number, and if so, adds a UserIdentifier for it.
      if (rawRecord.containsKey("phone")) {
        UserIdentifier hashedPhoneNumberIdentifier =
            UserIdentifier.newBuilder()
                .setHashedPhoneNumber(normalizeAndHash(sha256Digest, rawRecord.get("phone"), true))
                .build();
        // Adds the hashed phone number identifier to the UserData object's list.
        userDataBuilder.addUserIdentifiers(hashedPhoneNumberIdentifier);
      }

      // Checks if the record has all the required mailing address elements, and if so, adds a
      // UserIdentifier for the mailing address.
      if (rawRecord.containsKey("firstName")) {
        // Checks if the record contains all the other required elements of a mailing address.
        Set<String> missingAddressKeys = new HashSet<>();
        for (String addressKey : new String[] {"lastName", "countryCode", "postalCode"}) {
          if (!rawRecord.containsKey(addressKey)) {
            missingAddressKeys.add(addressKey);
          }
        }

        if (!missingAddressKeys.isEmpty()) {
          System.out.printf(
              "Skipping addition of mailing address information because the following required keys"
                  + " are missing: %s%n",
              missingAddressKeys);
        } else {
          // Creates an OfflineUserAddressInfo object that contains all the required elements of a
          // mailing address.
          OfflineUserAddressInfo addressInfo =
              OfflineUserAddressInfo.newBuilder()
                  .setHashedFirstName(
                      normalizeAndHash(sha256Digest, rawRecord.get("firstName"), false))
                  .setHashedLastName(
                      normalizeAndHash(sha256Digest, rawRecord.get("lastName"), false))
                  .setCountryCode(rawRecord.get("countryCode"))
                  .setPostalCode(rawRecord.get("postalCode"))
                  .build();
          UserIdentifier addressIdentifier =
              UserIdentifier.newBuilder().setAddressInfo(addressInfo).build();
          // Adds the address identifier to the UserData object's list.
          userDataBuilder.addUserIdentifiers(addressIdentifier);
        }
      }

      if (!userDataBuilder.getUserIdentifiersList().isEmpty()) {
        // Builds the UserData and adds it to the list.
        userDataList.add(userDataBuilder.build());
      }
    }

    // Creates the operations to add users.
    List<OfflineUserDataJobOperation> operations = new ArrayList<>();
    for (UserData userData : userDataList) {
      operations.add(OfflineUserDataJobOperation.newBuilder().setCreate(userData).build());
    }
    // [END add_customer_match_user_list_2]

    return operations;
  }

  /**
   * Returns the result of normalizing and then hashing the string using the provided digest.
   * Private customer data must be hashed during upload, as described at
   * https://support.google.com/google-ads/answer/7474263.
   *
   * @param digest the digest to use to hash the normalized string.
   * @param s the string to normalize and hash.
   * @param trimIntermediateSpaces if true, removes leading, trailing, and intermediate spaces from
   *     the string before hashing. If false, only removes leading and trailing spaces from the
   *     string before hashing.
   */
  private String normalizeAndHash(MessageDigest digest, String s, boolean trimIntermediateSpaces)
      throws UnsupportedEncodingException {
    // Normalizes by first converting all characters to lowercase, then trimming spaces.
    String normalized = s.toLowerCase();
    if (trimIntermediateSpaces) {
      // Removes leading, trailing, and intermediate spaces.
      normalized = normalized.replaceAll("\\s+", "");
    } else {
      // Removes only leading and trailing spaces.
      normalized = normalized.trim();
    }
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
   */
  // [START add_customer_match_user_list_4]
  private void checkJobStatus(
      GoogleAdsClient googleAdsClient, long customerId, String offlineUserDataJobResourceName) {
    try (GoogleAdsServiceClient googleAdsServiceClient =
        googleAdsClient.getLatestVersion().createGoogleAdsServiceClient()) {
      String query =
          String.format(
              "SELECT offline_user_data_job.resource_name, "
                  + "offline_user_data_job.id, "
                  + "offline_user_data_job.status, "
                  + "offline_user_data_job.type, "
                  + "offline_user_data_job.failure_reason, "
                  + "offline_user_data_job.customer_match_user_list_metadata.user_list "
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
        printCustomerMatchUserListInfo(
            googleAdsClient,
            customerId,
            offlineUserDataJob.getCustomerMatchUserListMetadata().getUserList());
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

  // [END add_customer_match_user_list_4]

  /**
   * Prints information about the Customer Match user list.
   *
   * @param googleAdsClient the Google Ads API client.
   * @param customerId the client customer ID .
   * @param userListResourceName the resource name of the Customer Match user list.
   */
  private void printCustomerMatchUserListInfo(
      GoogleAdsClient googleAdsClient, long customerId, String userListResourceName) {
    // [START add_customer_match_user_list_5]
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
      // [END add_customer_match_user_list_5]

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

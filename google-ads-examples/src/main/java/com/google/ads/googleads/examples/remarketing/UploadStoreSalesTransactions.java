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
import com.google.ads.googleads.v4.common.OfflineUserAddressInfo;
import com.google.ads.googleads.v4.common.StoreSalesMetadata;
import com.google.ads.googleads.v4.common.StoreSalesThirdPartyMetadata;
import com.google.ads.googleads.v4.common.TransactionAttribute;
import com.google.ads.googleads.v4.common.UserData;
import com.google.ads.googleads.v4.common.UserIdentifier;
import com.google.ads.googleads.v4.enums.OfflineUserDataJobStatusEnum.OfflineUserDataJobStatus;
import com.google.ads.googleads.v4.enums.OfflineUserDataJobTypeEnum.OfflineUserDataJobType;
import com.google.ads.googleads.v4.errors.GoogleAdsError;
import com.google.ads.googleads.v4.errors.GoogleAdsException;
import com.google.ads.googleads.v4.resources.OfflineUserDataJob;
import com.google.ads.googleads.v4.services.AddOfflineUserDataJobOperationsRequest;
import com.google.ads.googleads.v4.services.AddOfflineUserDataJobOperationsResponse;
import com.google.ads.googleads.v4.services.CreateOfflineUserDataJobResponse;
import com.google.ads.googleads.v4.services.GoogleAdsRow;
import com.google.ads.googleads.v4.services.GoogleAdsServiceClient;
import com.google.ads.googleads.v4.services.OfflineUserDataJobOperation;
import com.google.ads.googleads.v4.services.OfflineUserDataJobServiceClient;
import com.google.ads.googleads.v4.utils.ResourceNames;
import com.google.common.collect.ImmutableList;
import com.google.protobuf.BoolValue;
import com.google.protobuf.DoubleValue;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/**
 * Uploads offline data for store sales transactions.
 *
 * <p>This feature is only available to allowlisted accounts. See
 * https://support.google.com/google-ads/answer/7620302 for more details.
 */
public class UploadStoreSalesTransactions {

  private static class UploadStoreSalesTransactionsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private Long customerId;

    @Parameter(
        names = ArgumentNames.OFFLINE_USER_DATA_JOB_TYPE,
        required = false,
        description =
            "The type of user data in the job (first or third party). If you have an official"
                + " store sales partnership with Google, use STORE_SALES_UPLOAD_THIRD_PARTY."
                + " Otherwise, use STORE_SALES_UPLOAD_FIRST_PARTY or omit this parameter.")
    private OfflineUserDataJobType offlineUserDataJobType =
        OfflineUserDataJobType.STORE_SALES_UPLOAD_FIRST_PARTY;

    @Parameter(
        names = ArgumentNames.EXTERNAL_ID,
        description =
            "Optional (but recommended) external ID to identify the offline user data job")
    private Long externalId;

    @Parameter(
        names = ArgumentNames.CONVERSION_ACTION_ID,
        required = true,
        description = "The ID of a store sales conversion action")
    private Long conversionActionId;
    
    @Parameter(
        names = ArgumentNames.CUSTOM_KEY,
        required = false,
        description = "Only required after creating a custom key and custom values in the account."
                + " Custom key and values are used to segment store sales conversions."
                + " This measurement can be used to provide more advanced insights.")
    private String customKey;

    @Parameter(
        names = ArgumentNames.ADVERTISER_UPLOAD_DATE_TIME,
        description = "Only required if uploading third party data")
    private String advertiserUploadDateTime;

    @Parameter(
        names = ArgumentNames.BRIDGE_MAP_VERSION_ID,
        description = "Only required if uploading third party data")
    private String bridgeMapVersionId;

    @Parameter(
        names = ArgumentNames.PARTNER_ID,
        description = "Only required if uploading third party data")
    private Long partnerId;
  }

  public static void main(String[] args)
      throws InterruptedException, ExecutionException, TimeoutException,
          UnsupportedEncodingException {
    UploadStoreSalesTransactionsParams params = new UploadStoreSalesTransactionsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.offlineUserDataJobType =
          OfflineUserDataJobType.valueOf("INSERT_OFFLINE_USER_DATA_JOB_TYPE_HERE");
      params.conversionActionId = Long.parseLong("INSERT_CONVERSION_ACTION_ID_HERE");
      // OPTIONAL (but recommended): Specify an external ID for the job.
      // params.externalId = Long.parseLong("INSERT_EXTERNAL_ID_HERE");
      // OPTIONAL: If uploading data with custom key and values, also specify the following value:
      // params.customKey = "INSERT_CUSTOM_KEY_HERE";
      // OPTIONAL: If uploading third party data, also specify the following values:
      // params.advertiserUploadDateTime = "INSERT_ADVERTISER_UPLOAD_DATE_TIME_HERE";
      // params.bridgeMapVersionId = "INSERT_BRIDGE_MAP_VERSION_ID_HERE";
      // params.partnerId = Long.parseLong("INSERT_PARTNER_ID_HERE");
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
      new UploadStoreSalesTransactions()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.offlineUserDataJobType,
              params.externalId,
              params.conversionActionId,
              params.customKey,
              params.advertiserUploadDateTime,
              params.bridgeMapVersionId,
              params.partnerId);
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
   * @param offlineUserDataJobType the type of offline user data in the job (first party or third
   *     party). If you have an official store sales partnership with Google, use {@code
   *     STORE_SALES_UPLOAD_THIRD_PARTY}. Otherwise, use {@code STORE_SALES_UPLOAD_FIRST_PARTY}.
   * @param externalId optional (but recommended) external ID for the offline user data job.
   * @param conversionActionId the ID of a store sales conversion action.
   * @param customKey to segment transactions. Only required when uploading data with custom key and values.
   * @param advertiserUploadDateTime date and time the advertiser uploaded data to the partner. Only
   *     required for third party uploads.
   * @param bridgeMapVersionId version of partner IDs to be used for uploads. Only required for
   *     third party uploads.
   * @param partnerId ID of the third party partner. Only required for third party uploads.
   * @throws GoogleAdsException if an API request failed with one or more service errors.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      OfflineUserDataJobType offlineUserDataJobType,
      Long externalId,
      long conversionActionId,
      String customKey,
      String advertiserUploadDateTime,
      String bridgeMapVersionId,
      Long partnerId)
      throws InterruptedException, ExecutionException, TimeoutException,
          UnsupportedEncodingException {
    String offlineUserDataJobResourceName;
    try (OfflineUserDataJobServiceClient offlineUserDataJobServiceClient =
        googleAdsClient.getLatestVersion().createOfflineUserDataJobServiceClient()) {
      // Creates an offline user data job for uploading transactions.
      offlineUserDataJobResourceName =
          createOfflineUserDataJob(
              offlineUserDataJobServiceClient,
              customerId,
              offlineUserDataJobType,
              externalId,
              customKey,
              advertiserUploadDateTime,
              bridgeMapVersionId,
              partnerId);

      // Adds transactions to the job.
      addTransactionsToOfflineUserDataJob(
          offlineUserDataJobServiceClient,
          customerId,
          offlineUserDataJobResourceName,
          conversionActionId);

      // Issues an asynchronous request to run the offline user data job.
      offlineUserDataJobServiceClient.runOfflineUserDataJobAsync(offlineUserDataJobResourceName);

      System.out.printf(
          "Sent request to asynchronously run offline user data job: %s%n",
          offlineUserDataJobResourceName);
    }

    // Offline user data jobs may take up to 24 hours to complete, so instead of waiting for the job
    // to complete, retrieves and displays the job status once and then prints the query to use to
    // check the job again later.
    checkJobStatus(googleAdsClient, customerId, offlineUserDataJobResourceName);
  }

  /**
   * Creates an offline user data job for uploading store sales transactions.
   *
   * @return the resource name of the created job.
   */
  private String createOfflineUserDataJob(
      OfflineUserDataJobServiceClient offlineUserDataJobServiceClient,
      long customerId,
      OfflineUserDataJobType offlineUserDataJobType,
      Long externalId,
      String customKey,
      String advertiserUploadDateTime,
      String bridgeMapVersionId,
      Long partnerId) {
    // TIP: If you are migrating from the AdWords API, please note that Google Ads API uses the
    // term "fraction" instead of "rate". For example, loyaltyRate in the AdWords API is called
    // loyaltyFraction in the Google Ads API.
    StoreSalesMetadata.Builder storeSalesMetadataBuilder =
        // Please refer to https://support.google.com/google-ads/answer/7506124 for additional
        // details.
        StoreSalesMetadata.newBuilder()
            // Sets the fraction of your overall sales that you (or the advertiser, in the third
            // party case) can associate with a customer (email, phone number, address, etc.) in
            // your database or loyalty program.
            // For example, set this to 0.7 if you have 100 transactions over 30 days, and out of
            // those 100 transactions, you can identify 70 by an email address or phone number.
            .setLoyaltyFraction(DoubleValue.of(0.7))
            // Sets the fraction of sales you're uploading out of the overall sales that you (or the
            // advertiser, in the third party case) can associate with a customer. In most cases,
            // you will set this to 1.0.
            // Continuing the example above for loyalty fraction, a value of 1.0 here indicates that
            // you are uploading all 70 of the transactions that can be identified by an email
            // address or phone number.
            .setTransactionUploadFraction(DoubleValue.of(1.0));
    
    if (customKey != null && !customKey.isEmpty()) {
        storeSalesMetadataBuilder.setCustomKey(StringValue.of(customKey));
    }

    if (OfflineUserDataJobType.STORE_SALES_UPLOAD_THIRD_PARTY == offlineUserDataJobType) {
      // Creates additional metadata required for uploading third party data.
      StoreSalesThirdPartyMetadata storeSalesThirdPartyMetadata =
          StoreSalesThirdPartyMetadata.newBuilder()
              // The date/time must be in the format "yyyy-MM-dd hh:mm:ss".
              .setAdvertiserUploadDateTime(StringValue.of(advertiserUploadDateTime))

              // Sets the fraction of transactions you received from the advertiser that have valid
              // formatting and values. This captures any transactions the advertiser provided to
              // you but which you are unable to upload to Google due to formatting errors or
              // missing data.
              // In most cases, you will set this to 1.0.
              .setValidTransactionFraction(DoubleValue.of(1.0))
              // Sets the fraction of valid transactions (as defined above) you received from the
              // advertiser that you (the third party) have matched to an external user ID on your
              // side.
              // In most cases, you will set this to 1.0.
              .setPartnerMatchFraction(DoubleValue.of(1.0))

              // Sets the fraction of transactions you (the third party) are uploading out of the
              // transactions you received from the advertiser that meet both of the following
              // criteria:
              // 1. Are valid in terms of formatting and values. See valid transaction fraction
              // above.
              // 2. You matched to an external user ID on your side. See partner match fraction
              // above.
              // In most cases, you will set this to 1.0.
              .setPartnerUploadFraction(DoubleValue.of(1.0))

              // Please speak with your Google representative to get the values to use for the
              // bridge map version and partner IDs.

              // Sets the version of partner IDs to be used for uploads.
              .setBridgeMapVersionId(StringValue.of(bridgeMapVersionId))
              // Sets the third party partner ID uploading the transactions.
              .setPartnerId(Int64Value.of(partnerId))
              .build();
      storeSalesMetadataBuilder.setThirdPartyMetadata(storeSalesThirdPartyMetadata);
    }

    // Creates a new offline user data job.
    OfflineUserDataJob.Builder offlineUserDataJobBuilder =
        OfflineUserDataJob.newBuilder()
            .setType(offlineUserDataJobType)
            .setStoreSalesMetadata(storeSalesMetadataBuilder);
    if (externalId != null) {
      offlineUserDataJobBuilder.setExternalId(Int64Value.of(externalId));
    }

    // Issues a request to create the offline user data job.
    CreateOfflineUserDataJobResponse createOfflineUserDataJobResponse =
        offlineUserDataJobServiceClient.createOfflineUserDataJob(
            Long.toString(customerId), offlineUserDataJobBuilder.build());
    String offlineUserDataJobResourceName = createOfflineUserDataJobResponse.getResourceName();
    System.out.printf(
        "Created an offline user data job with resource name: %s.%n",
        offlineUserDataJobResourceName);
    return offlineUserDataJobResourceName;
  }

  /** Adds operations to the job for a set of sample transactions. */
  private void addTransactionsToOfflineUserDataJob(
      OfflineUserDataJobServiceClient offlineUserDataJobServiceClient,
      long customerId,
      String offlineUserDataJobResourceName,
      long conversionActionId)
      throws InterruptedException, ExecutionException, TimeoutException,
          UnsupportedEncodingException {
    // Constructs the operation for each transaction.
    List<OfflineUserDataJobOperation> userDataJobOperations =
        buildOfflineUserDataJobOperations(customerId, conversionActionId);

    // Issues a request to add the operations to the offline user data job.
    AddOfflineUserDataJobOperationsResponse response =
        offlineUserDataJobServiceClient.addOfflineUserDataJobOperations(
            AddOfflineUserDataJobOperationsRequest.newBuilder()
                .setResourceName(offlineUserDataJobResourceName)
                .setEnablePartialFailure(BoolValue.of(true))
                .addAllOperations(userDataJobOperations)
                .build());

    // Prints the status message if any partial failure error is returned.
    // NOTE: The details of each partial failure error are not printed here, you can refer to
    // the example HandlePartialFailure.java to learn more.
    if (response.hasPartialFailureError()) {
      System.out.printf(
          "Encountered %d partial failure errors while adding %d operations to the offline user "
              + "data job: '%s'. Only the successfully added operations will be executed when "
              + "the job runs.%n",
          response.getPartialFailureError().getDetailsCount(),
          userDataJobOperations.size(),
          response.getPartialFailureError().getMessage());
    } else {
      System.out.printf(
          "Successfully added %d operations to the offline user data job.%n",
          userDataJobOperations.size());
    }
  }

  /**
   * Creates a list of offline user data job operations for sample transactions.
   *
   * @return a list of operations.
   */
  private List<OfflineUserDataJobOperation> buildOfflineUserDataJobOperations(
      long customerId, long conversionActionId) throws UnsupportedEncodingException {
    MessageDigest sha256Digest;
    try {
      // Gets a digest for generating hashed values using SHA-256. You must normalize and hash the
      // the value for any field where the name begins with "hashed". See the normalizeAndHash()
      // method.
      sha256Digest = MessageDigest.getInstance("SHA-256");
    } catch (NoSuchAlgorithmException e) {
      throw new RuntimeException("Missing SHA-256 algorithm implementation", e);
    }

    // Create the first transaction for upload based on an email address and state.
    UserData userDataWithEmailAddress =
        UserData.newBuilder()
            .addAllUserIdentifiers(
                ImmutableList.of(
                    UserIdentifier.newBuilder()
                        .setHashedEmail(
                            StringValue.of(
                                // Email addresses must be normalized and hashed.
                                normalizeAndHash(sha256Digest, "customer@example.com")))
                        .build(),
                    UserIdentifier.newBuilder()
                        .setAddressInfo(
                            OfflineUserAddressInfo.newBuilder().setState(StringValue.of("NY")))
                        .build()))
            .setTransactionAttribute(
                TransactionAttribute.newBuilder()
                    .setConversionAction(
                        StringValue.of(
                            ResourceNames.conversionAction(customerId, conversionActionId)))
                    .setCurrencyCode(StringValue.of("USD"))
                    // Converts the transaction amount from $200 USD to micros.
                    .setTransactionAmountMicros(DoubleValue.of(200L * 1_000_000L))
                    // Specifies the date and time of the transaction. This date and time will be
                    // interpreted by the API using the Google Ads customer's time zone.
                    // The date/time must be in the format "yyyy-MM-dd hh:mm:ss".
                    .setTransactionDateTime(StringValue.of("2020-05-01 23:52:12"))
                    // OPTIONAL: If uploading data with custom key and values, also specify the following value:
                    // .setCustomValue(StringValue.of("INSERT_CUSTOM_VALUE_HERE"))
                )
            .build();

    // Creates the second transaction for upload based on a physical address.
    UserData userDataWithPhysicalAddress =
        UserData.newBuilder()
            .addUserIdentifiers(
                UserIdentifier.newBuilder()
                    .setAddressInfo(
                        OfflineUserAddressInfo.newBuilder()
                            .setHashedFirstName(
                                StringValue.of(normalizeAndHash(sha256Digest, "John")))
                            .setHashedLastName(
                                StringValue.of(normalizeAndHash(sha256Digest, "Doe")))
                            .setCountryCode(StringValue.of("US"))
                            .setPostalCode(StringValue.of("10011"))))
            .setTransactionAttribute(
                TransactionAttribute.newBuilder()
                    .setConversionAction(
                        StringValue.of(
                            ResourceNames.conversionAction(customerId, conversionActionId)))
                    .setCurrencyCode(StringValue.of("EUR"))
                    // Converts the transaction amount from 450 EUR to micros.
                    .setTransactionAmountMicros(DoubleValue.of(450L * 1_000_000L))
                    // Specifies the date and time of the transaction. This date and time will be
                    // interpreted by the API using the Google Ads customer's time zone.
                    // The date/time must be in the format "yyyy-MM-dd hh:mm:ss".
                    .setTransactionDateTime(StringValue.of("2020-05-14 19:07:02"))
                    // OPTIONAL: If uploading data with custom key and values, also specify the following value:
                    // .setCustomValue(StringValue.of("INSERT_CUSTOM_VALUE_HERE"))
                )
            .build();

    // Creates the operations to add the two transactions.
    List<OfflineUserDataJobOperation> operations = new ArrayList<>();
    for (UserData userData : Arrays.asList(userDataWithEmailAddress, userDataWithPhysicalAddress)) {
      operations.add(OfflineUserDataJobOperation.newBuilder().setCreate(userData).build());
    }

    return operations;
  }

  /**
   * Returns the result of normalizing and then hashing the string using the provided digest.
   * Private customer data must be hashed during upload, as described at
   * https://support.google.com/google-ads/answer/7506124.
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

  /** Retrieves, checks, and prints the status of the offline user data job. */
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
          offlineUserDataJob.getId().getValue(),
          offlineUserDataJob.getType(),
          offlineUserDataJob.getStatus());
      OfflineUserDataJobStatus jobStatus = offlineUserDataJob.getStatus();
      if (OfflineUserDataJobStatus.FAILED == jobStatus) {
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
}

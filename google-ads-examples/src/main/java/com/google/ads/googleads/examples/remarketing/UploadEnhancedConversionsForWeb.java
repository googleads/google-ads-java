// Copyright 2021 Google LLC
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
import com.google.ads.googleads.v15.common.OfflineUserAddressInfo;
import com.google.ads.googleads.v15.common.UserIdentifier;
import com.google.ads.googleads.v15.enums.ConversionAdjustmentTypeEnum.ConversionAdjustmentType;
import com.google.ads.googleads.v15.enums.UserIdentifierSourceEnum.UserIdentifierSource;
import com.google.ads.googleads.v15.errors.GoogleAdsError;
import com.google.ads.googleads.v15.errors.GoogleAdsException;
import com.google.ads.googleads.v15.services.ConversionAdjustment;
import com.google.ads.googleads.v15.services.ConversionAdjustmentResult;
import com.google.ads.googleads.v15.services.ConversionAdjustmentUploadServiceClient;
import com.google.ads.googleads.v15.services.GclidDateTimePair;
import com.google.ads.googleads.v15.services.UploadConversionAdjustmentsRequest;
import com.google.ads.googleads.v15.services.UploadConversionAdjustmentsResponse;
import com.google.ads.googleads.v15.utils.ResourceNames;
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
 * Enhances a web conversion by uploading a {@link ConversionAdjustment} containing hashed user
 * identifiers and an order ID.
 */
public class UploadEnhancedConversionsForWeb {
  private static class UploadEnhancedConversionsForWebParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private long customerId;

    @Parameter(names = ArgumentNames.CONVERSION_ACTION_ID, required = true)
    private long conversionActionId;

    @Parameter(names = ArgumentNames.ORDER_ID, required = true)
    private String orderId;

    @Parameter(
        names = ArgumentNames.CONVERSION_DATE_TIME,
        required = false,
        description =
            "The date time at which the conversion with the specified order ID occurred. "
                + "Must be after the click time, and must include the time zone offset. "
                + "The format is  'yyyy-mm-dd hh:mm:ss+|-hh:mm', e.g. '2019-01-01 12:32:45-08:00'. "
                + "Setting this field is optional, but recommended.")
    private String conversionDateTime;

    @Parameter(names = ArgumentNames.USER_AGENT, required = false)
    private String userAgent;
  }

  public static void main(String[] args)
      throws UnsupportedEncodingException, NoSuchAlgorithmException {
    UploadEnhancedConversionsForWebParams params = new UploadEnhancedConversionsForWebParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.conversionActionId = Long.parseLong("INSERT_CONVERSION_ACTION_ID_HERE");
      params.orderId = "INSERT_ORDER_ID_HERE";

      // Optional: Specify the conversion date/time and user agent.
      params.conversionDateTime = null;
      params.userAgent = null;
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
      new UploadEnhancedConversionsForWeb()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.conversionActionId,
              params.orderId,
              params.conversionDateTime,
              params.userAgent);
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
   * @param conversionActionId conversion action ID associated with this conversion.
   * @param orderId unique order ID (transaction ID) of the conversion.
   * @param conversionDateTime date and time of the conversion.
   * @param userAgent the HTTP user agent of the conversion.
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long conversionActionId,
      String orderId,
      String conversionDateTime,
      String userAgent)
      throws NoSuchAlgorithmException, UnsupportedEncodingException {
    // [START add_user_identifiers]
    // Creates a builder for constructing the enhancement adjustment.
    ConversionAdjustment.Builder enhancementBuilder =
        ConversionAdjustment.newBuilder().setAdjustmentType(ConversionAdjustmentType.ENHANCEMENT);

    // Extracts user email, phone, and address info from the raw data, normalizes and hashes it,
    // then wraps it in UserIdentifier objects.
    // Creates a separate UserIdentifier object for each. The data in this example is hardcoded, but
    // in your application you might read the raw data from an input file.

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

    Map<String, String> rawRecord =
        ImmutableMap.<String, String>builder()
            // Email address that includes a period (.) before the Gmail domain.
            .put("email", "alex.2@example.com")
            // Address that includes all four required elements: first name, last name, country
            // code, and postal code.
            .put("firstName", "Alex")
            .put("lastName", "Quinn")
            .put("countryCode", "US")
            .put("postalCode", "94045")
            // Phone number to be converted to E.164 format, with a leading '+' as required.
            .put("phone", "+1 800 5550102")
            // This example lets you input conversion details as arguments, but in reality you might
            // store this data alongside other user data, so we include it in this sample user
            // record.
            .put("orderId", orderId)
            .put("conversionActionId", Long.toString(conversionActionId))
            .put("conversionDateTime", conversionDateTime)
            .put("currencyCode", "USD")
            .put("userAgent", userAgent)
            .build();

    // Creates a SHA256 message digest for hashing user identifiers in a privacy-safe way, as
    // described at https://support.google.com/google-ads/answer/9888656.
    MessageDigest sha256Digest = MessageDigest.getInstance("SHA-256");

    // Creates a list for the user identifiers.
    List<UserIdentifier> userIdentifiers = new ArrayList<>();

    // Creates a user identifier using the hashed email address, using the normalize and hash method
    // specifically for email addresses.
    UserIdentifier emailIdentifier =
        UserIdentifier.newBuilder()
            // Optional: specify the user identifier source.
            .setUserIdentifierSource(UserIdentifierSource.FIRST_PARTY)
            // Uses the normalize and hash method specifically for email addresses.
            .setHashedEmail(normalizeAndHashEmailAddress(sha256Digest, rawRecord.get("email")))
            .build();
    userIdentifiers.add(emailIdentifier);

    // Checks if the record has a phone number, and if so, adds a UserIdentifier for it.
    if (rawRecord.containsKey("phone")) {
      UserIdentifier hashedPhoneNumberIdentifier =
          UserIdentifier.newBuilder()
              .setHashedPhoneNumber(normalizeAndHash(sha256Digest, rawRecord.get("phone"), true))
              .build();
      // Adds the hashed phone number identifier to the UserData object's list.
      userIdentifiers.add(hashedPhoneNumberIdentifier);
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
                .setHashedLastName(normalizeAndHash(sha256Digest, rawRecord.get("lastName"), false))
                .setCountryCode(rawRecord.get("countryCode"))
                .setPostalCode(rawRecord.get("postalCode"))
                .build();
        UserIdentifier addressIdentifier =
            UserIdentifier.newBuilder().setAddressInfo(addressInfo).build();
        // Adds the address identifier to the UserData object's list.
        userIdentifiers.add(addressIdentifier);
      }
    }

    // Adds the user identifiers to the enhancement adjustment.
    enhancementBuilder.addAllUserIdentifiers(userIdentifiers);
    // [END add_user_identifiers]

    // [START add_conversion_details]
    // Sets the conversion action.
    enhancementBuilder.setConversionAction(
        ResourceNames.conversionAction(
            customerId, Long.parseLong(rawRecord.get("conversionActionId"))));

    // Sets the order ID. Enhancements MUST use order ID instead of GCLID date/time pair.
    enhancementBuilder.setOrderId(rawRecord.get("orderId"));

    // Sets the conversion date and time if provided. Providing this value is optional but
    // recommended.
    if (rawRecord.get("conversionDateTime") != null) {
      enhancementBuilder.setGclidDateTimePair(
          GclidDateTimePair.newBuilder()
              .setConversionDateTime(rawRecord.get("conversionDateTime")));
    }

    // Sets the user agent if provided. This should match the user agent of the request that sent
    // the original conversion so the conversion and its enhancement are either both attributed as
    // same-device or both attributed as cross-device.
    if (rawRecord.get("userAgent") != null) {
      enhancementBuilder.setUserAgent(rawRecord.get("userAgent"));
    }
    // [END add_conversion_details]

    // [START upload_enhancement]
    // Creates the conversion adjustment upload service client.
    try (ConversionAdjustmentUploadServiceClient conversionUploadServiceClient =
        googleAdsClient.getLatestVersion().createConversionAdjustmentUploadServiceClient()) {
      // Uploads the enhancement adjustment. Partial failure should always be set to true.

      // NOTE: This request contains a single adjustment as a demonstration. However, if you have
      // multiple adjustments to upload, it's best to upload multiple adjustments per request
      // instead of sending a separate request per adjustment. See the following for per-request
      // limits:
      // https://developers.google.com/google-ads/api/docs/best-practices/quotas#conversion_adjustment_upload_service
      UploadConversionAdjustmentsResponse response =
          conversionUploadServiceClient.uploadConversionAdjustments(
              UploadConversionAdjustmentsRequest.newBuilder()
                  .setCustomerId(Long.toString(customerId))
                  .addConversionAdjustments(enhancementBuilder)
                  // Enables partial failure (must be true).
                  .setPartialFailure(true)
                  .build());
      // [END upload_enhancement]

      // Prints any partial errors returned.
      // To review the overall health of your recent uploads, see:
      // https://developers.google.com/google-ads/api/docs/conversions/upload-summaries
      if (response.hasPartialFailureError()) {
        System.out.printf(
            "Partial error encountered: '%s'.%n", response.getPartialFailureError().getMessage());
      } else {
        // Prints the result.
        ConversionAdjustmentResult result = response.getResults(0);
        System.out.printf(
            "Uploaded conversion adjustment of '%s' for order ID '%s'.%n",
            result.getConversionAction(), result.getOrderId());
      }
    }
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
  // [START normalize_and_hash]
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
   * Returns the result of normalizing and hashing an email address. For this use case, Google Ads
   * requires removal of any '.' characters preceding {@code gmail.com} or {@code googlemail.com}.
   *
   * @param digest the digest to use to hash the normalized string.
   * @param emailAddress the email address to normalize and hash.
   */
  private String normalizeAndHashEmailAddress(MessageDigest digest, String emailAddress)
      throws UnsupportedEncodingException {
    String normalizedEmail = emailAddress.toLowerCase();
    String[] emailParts = normalizedEmail.split("@");
    if (emailParts.length > 1 && emailParts[1].matches("^(gmail|googlemail)\\.com\\s*")) {
      // Removes any '.' characters from the portion of the email address before the domain if the
      // domain is gmail.com or googlemail.com.
      emailParts[0] = emailParts[0].replaceAll("\\.", "");
      normalizedEmail = String.format("%s@%s", emailParts[0], emailParts[1]);
    }
    return normalizeAndHash(digest, normalizedEmail, true);
  }
  // [END normalize_and_hash]
}

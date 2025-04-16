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
import com.google.ads.googleads.v19.common.Consent;
import com.google.ads.googleads.v19.common.UserIdentifier;
import com.google.ads.googleads.v19.enums.ConsentStatusEnum.ConsentStatus;
import com.google.ads.googleads.v19.enums.UserIdentifierSourceEnum.UserIdentifierSource;
import com.google.ads.googleads.v19.errors.GoogleAdsError;
import com.google.ads.googleads.v19.errors.GoogleAdsException;
import com.google.ads.googleads.v19.services.ClickConversion;
import com.google.ads.googleads.v19.services.ClickConversionResult;
import com.google.ads.googleads.v19.services.ConversionUploadServiceClient;
import com.google.ads.googleads.v19.services.SessionAttributeKeyValuePair;
import com.google.ads.googleads.v19.services.SessionAttributesKeyValuePairs;
import com.google.ads.googleads.v19.services.UploadClickConversionsRequest;
import com.google.ads.googleads.v19.services.UploadClickConversionsResponse;
import com.google.ads.googleads.v19.utils.ResourceNames;
import com.google.common.collect.ImmutableMap;
import com.google.protobuf.ByteString;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Uploads an enhanced conversion for leads by uploading a ClickConversion with hashed, first-party
 * user-provided data from your website lead forms. This includes user identifiers, and optionally a
 * click ID and order ID. With this information, Google can tie the conversion to the ad that drove
 * the lead.
 */
public class UploadEnhancedConversionsForLeads {

  private static class UploadEnhancedConversionsForLeadsParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private long customerId;

    @Parameter(names = ArgumentNames.CONVERSION_ACTION_ID, required = true)
    private long conversionActionId;

    @Parameter(
        names = ArgumentNames.CONVERSION_DATE_TIME,
        required = true,
        description =
            "The date time at which the conversion occurred. "
                + "Must be after the click time, and must include the time zone offset. "
                + "The format is 'yyyy-mm-dd hh:mm:ss+|-hh:mm', e.g. '2019-01-01 12:32:45-08:00'.")
    private String conversionDateTime;

    @Parameter(names = ArgumentNames.CONVERSION_VALUE, required = true)
    private Double conversionValue;

    @Parameter(names = ArgumentNames.ORDER_ID, required = false)
    private String orderId;

    @Parameter(names = ArgumentNames.GCLID, required = false)
    private String gclid;

    @Parameter(names = ArgumentNames.AD_USER_DATA_CONSENT, required = false)
    private ConsentStatus adUserDataConsent;

    @Parameter(
        names = ArgumentNames.SESSION_ATTRIBUTES_ENCODED,
        required = false,
        description =
            "A session attributes token. Only one of sessionAttributesEncoded or sessionAttributesMap"
                + " should be passed.")
    private String sessionAttributesEncoded;

    @Parameter(
        names = ArgumentNames.SESSION_ATTRIBUTES_MAP,
        required = false,
        description =
            "A "
                + "space-delimited list of session attribute key value pairs. Each pair should be "
                + "separated by an equal sign, for example: 'gad_campaignid=12345 gad_source=1'. Only "
                + "one of sessionAttributesEncoded or sessionAttributesMap should be passed.")
    private String sessionAttributesMap;
  }

  public static void main(String[] args)
      throws UnsupportedEncodingException, NoSuchAlgorithmException {
    UploadEnhancedConversionsForLeadsParams params = new UploadEnhancedConversionsForLeadsParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.conversionActionId = Long.parseLong("INSERT_CONVERSION_ACTION_ID_HERE");
      params.conversionDateTime = "INSERT_CONVERSION_DATE_TIME_HERE";
      params.conversionValue = Double.parseDouble("INSERT_CONVERSION_VALUE_HERE");
      // Optional: Specify the unique order ID for the click conversion.
      params.orderId = null;
      // Optional: specify the Google click ID (gclid) for the click.
      params.gclid = null;
      // Optional: specify the ad user data consent for the click.
      params.adUserDataConsent = null;
      params.sessionAttributesEncoded = null;
      params.sessionAttributesMap = null;
    }

    if ((params.sessionAttributesEncoded != null) && (params.sessionAttributesMap != null)) {
      throw new IllegalArgumentException(
          "Only one of sessionAttributesEncoded or " + "sessionAttributesMap can be set.");
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
      new UploadEnhancedConversionsForLeads()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.conversionActionId,
              params.conversionDateTime,
              params.conversionValue,
              params.orderId,
              params.gclid,
              params.adUserDataConsent,
              params.sessionAttributesEncoded,
              params.sessionAttributesMap);
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
   * @param conversionDateTime date and time of the conversion.
   * @param conversionValue the value of the conversion.
   * @param orderId the unique ID (transaction ID) of the conversion.
   * @param gclid the Google click ID of the conversion.
   * @param adUserDataConsent the ad user data consent for the click
   */
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long conversionActionId,
      String conversionDateTime,
      Double conversionValue,
      String orderId,
      String gclid,
      ConsentStatus adUserDataConsent,
      String sessionAttributesEncoded,
      String sessionAttributesMap)
      throws UnsupportedEncodingException, NoSuchAlgorithmException {
    // [START add_user_identifiers]
    // Creates an empty builder for constructing the click conversion.
    ClickConversion.Builder clickConversionBuilder = ClickConversion.newBuilder();

    // Extracts user email and phone from the raw data, normalizes and hashes it, then wraps it in
    // UserIdentifier objects.
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

    ImmutableMap.Builder<String, String> rawRecordBuilder =
        ImmutableMap.<String, String>builder()
            .put("email", "alex.2@example.com")
            // Phone number to be converted to E.164 format, with a leading '+' as required.
            .put("phone", "+1 800 5550102")
            // This example lets you put conversion details as arguments, but in reality you might
            // store this data alongside other user data, so we include it in this sample user
            // record.
            .put("conversionActionId", Long.toString(conversionActionId))
            .put("conversionDateTime", conversionDateTime)
            .put("conversionValue", Double.toString(conversionValue))
            .put("currencyCode", "USD");

    // Adds entries for the optional fields.
    if (orderId != null) {
      rawRecordBuilder.put("orderId", orderId);
    }
    if (gclid != null) {
      rawRecordBuilder.put("gclid", gclid);
    }
    if (adUserDataConsent != null) {
      rawRecordBuilder.put("adUserDataConsent", adUserDataConsent.name());
    }
    if (sessionAttributesEncoded != null) {
      rawRecordBuilder.put("sessionAttributesEncoded", sessionAttributesEncoded);
    }
    if (sessionAttributesMap != null) {
      rawRecordBuilder.put("sessionAttributesMap", sessionAttributesMap);
    }

    // Builds the map representing the record.
    Map<String, String> rawRecord = rawRecordBuilder.build();

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

    // Creates a user identifier using normalized and hashed phone info.
    UserIdentifier hashedPhoneNumberIdentifier =
        UserIdentifier.newBuilder()
            .setHashedPhoneNumber(normalizeAndHash(sha256Digest, rawRecord.get("phone")))
            .build();
    // Adds the hashed phone number identifier to the UserData object's list.
    userIdentifiers.add(hashedPhoneNumberIdentifier);

    // Adds the user identifiers to the conversion.
    clickConversionBuilder.addAllUserIdentifiers(userIdentifiers);
    // [END add_user_identifiers]

    // [START add_conversion_details]
    // Adds details of the conversion.
    clickConversionBuilder.setConversionAction(
        ResourceNames.conversionAction(
            customerId, Long.parseLong(rawRecord.get("conversionActionId"))));
    clickConversionBuilder.setConversionDateTime(rawRecord.get("conversionDateTime"));
    clickConversionBuilder.setConversionValue(Double.parseDouble(rawRecord.get("conversionValue")));
    clickConversionBuilder.setCurrencyCode(rawRecord.get("currencyCode"));

    // Sets the order ID if provided.
    if (rawRecord.containsKey("orderId")) {
      clickConversionBuilder.setOrderId(rawRecord.get("orderId"));
    }

    // Sets the Google click ID (gclid) if provided.
    if (rawRecord.containsKey("gclid")) {
      clickConversionBuilder.setGclid(rawRecord.get("gclid"));
    }

    // Sets the consent information, if provided.
    if (rawRecord.containsKey("adUserDataConsent")) {
      // Specifies whether user consent was obtained for the data you are uploading. See
      // https://www.google.com/about/company/user-consent-policy for details.
      clickConversionBuilder.setConsent(
          Consent.newBuilder()
              .setAdUserData(ConsentStatus.valueOf(rawRecord.get("adUserDataConsent"))));
    }

    // Sets one of the sessionAttributesEncoded or sessionAttributesKeyValuePairs if either is
    // provided.
    if (rawRecord.containsKey("sessionAttributesEncoded")) {
      clickConversionBuilder.setSessionAttributesEncoded(
          ByteString.copyFromUtf8(rawRecord.get("sessionAttributesEncoded")));
    } else if (rawRecord.containsKey("sessionAttributesMap")) {
      List<String> pairings =
          Arrays.stream(rawRecord.get("sessionAttributesMap").split(" "))
              .map(String::trim)
              .collect(Collectors.toList());
      SessionAttributesKeyValuePairs.Builder sessionAttributePairs =
          SessionAttributesKeyValuePairs.newBuilder();
      for (String pair : pairings) {
        String[] parts = pair.split("=", 2);
        if (parts.length != 2) {
          throw new IllegalArgumentException(
              "Failed to read the sessionAttributesMap. SessionAttributesMap must use a "
                  + "space-delimited list of session attribute key value pairs. Each pair should be"
                  + " separated by an equal sign, for example: 'gad_campaignid=12345 gad_source=1'");
        }
        sessionAttributePairs.addKeyValuePairs(
            SessionAttributeKeyValuePair.newBuilder()
                .setSessionAttributeKey(parts[0])
                .setSessionAttributeValue(parts[1])
                .build());
      }
      clickConversionBuilder.setSessionAttributesKeyValuePairs(sessionAttributePairs.build());
    }

    // Calls build to build the conversion.
    ClickConversion clickConversion = clickConversionBuilder.build();
    // [END add_conversion_details]

    // [START upload_conversion]
    // Creates the conversion upload service client.
    try (ConversionUploadServiceClient conversionUploadServiceClient =
        googleAdsClient.getLatestVersion().createConversionUploadServiceClient()) {
      // Uploads the click conversion. Partial failure should always be set to true.

      // NOTE: This request contains a single conversion as a demonstration.  However, if you have
      // multiple conversions to upload, it's best to upload multiple conversions per request
      // instead of sending a separate request per conversion. See the following for per-request
      // limits:
      // https://developers.google.com/google-ads/api/docs/best-practices/quotas#conversion_upload_service
      UploadClickConversionsResponse response =
          conversionUploadServiceClient.uploadClickConversions(
              UploadClickConversionsRequest.newBuilder()
                  .setCustomerId(Long.toString(customerId))
                  .addConversions(clickConversion)
                  // Enables partial failure (must be true).
                  .setPartialFailure(true)
                  .build());
      // [END upload_conversion]

      // Prints any partial errors returned.
      // To review the overall health of your recent uploads, see:
      // https://developers.google.com/google-ads/api/docs/conversions/upload-summaries
      if (response.hasPartialFailureError()) {
        System.out.printf(
            "Partial error encountered: '%s'.%n", response.getPartialFailureError().getMessage());
      }

      // Prints the result.
      ClickConversionResult result = response.getResults(0);
      // Only prints valid results.
      if (result.hasConversionDateTime()) {
        System.out.printf(
            "Uploaded conversion that occurred at '%s' to '%s'.%n",
            result.getConversionDateTime(), result.getConversionAction());
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
   */
  // [START normalize_and_hash]
  private String normalizeAndHash(MessageDigest digest, String s)
      throws UnsupportedEncodingException {
    // Normalizes by first converting all characters to lowercase, then trimming spaces.
    String normalized = s.toLowerCase();
    // Removes leading, trailing, and intermediate spaces.
    normalized = normalized.replaceAll("\\s+", "");
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
    return normalizeAndHash(digest, normalizedEmail);
  }
  // [END normalize_and_hash]
}

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
import com.google.ads.googleads.v9.common.OfflineUserAddressInfo;
import com.google.ads.googleads.v9.common.UserIdentifier;
import com.google.ads.googleads.v9.enums.ConversionAdjustmentTypeEnum.ConversionAdjustmentType;
import com.google.ads.googleads.v9.enums.UserIdentifierSourceEnum.UserIdentifierSource;
import com.google.ads.googleads.v9.errors.GoogleAdsError;
import com.google.ads.googleads.v9.errors.GoogleAdsException;
import com.google.ads.googleads.v9.services.ConversionAdjustment;
import com.google.ads.googleads.v9.services.ConversionAdjustmentResult;
import com.google.ads.googleads.v9.services.ConversionAdjustmentUploadServiceClient;
import com.google.ads.googleads.v9.services.GclidDateTimePair;
import com.google.ads.googleads.v9.services.RestatementValue;
import com.google.ads.googleads.v9.services.UploadConversionAdjustmentsRequest;
import com.google.ads.googleads.v9.services.UploadConversionAdjustmentsResponse;
import com.google.ads.googleads.v9.utils.ResourceNames;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Adjusts an existing conversion by supplying user identifiers so Google can enhance the conversion
 * value.
 */
public class UploadConversionEnhancement {
  private static class UploadConversionEnhancementParams extends CodeSampleParams {

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

    @Parameter(names = ArgumentNames.RESTATEMENT_VALUE, required = false)
    private Double restatementValue;

    @Parameter(
        names = ArgumentNames.CURRENCY_CODE,
        required = false,
        description = "The currency of the restatement value.")
    private String currencyCode;
  }

  public static void main(String[] args)
      throws UnsupportedEncodingException, NoSuchAlgorithmException {
    UploadConversionEnhancementParams params = new UploadConversionEnhancementParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.conversionActionId = Long.parseLong("INSERT_CONVERSION_ACTION_ID_HERE");
      params.orderId = "INSERT_ORDER_ID_HERE";

      // Optional: Specify the conversion date/time, user agent, restatement value, and restatement
      // currency code.
      params.conversionDateTime = null;
      params.userAgent = null;
      params.restatementValue = null;
      params.currencyCode = null;
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
      new UploadConversionEnhancement()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.conversionActionId,
              params.orderId,
              params.conversionDateTime,
              params.userAgent,
              params.restatementValue,
              params.currencyCode);
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
   * @param conversionDateTime
   * @param userAgent the HTTP user agent of the conversion.
   * @param restatementValue the enhancement value.
   * @param restatementCurrencyCode the currency of the enhancement value.
   */
  // [START upload_conversion_enhancement]
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long conversionActionId,
      String orderId,
      String conversionDateTime,
      String userAgent,
      Double restatementValue,
      String restatementCurrencyCode)
      throws NoSuchAlgorithmException, UnsupportedEncodingException {
    // [START create_adjustment]
    // Creates a builder for constructing the enhancement adjustment.
    ConversionAdjustment.Builder enhancementBuilder =
        ConversionAdjustment.newBuilder()
            .setConversionAction(ResourceNames.conversionAction(customerId, conversionActionId))
            .setAdjustmentType(ConversionAdjustmentType.ENHANCEMENT)
            // Enhancements MUST use order ID instead of GCLID date/time pair.
            .setOrderId(orderId);

    // Sets the conversion date and time if provided. Providing this value is optional but
    // recommended.
    if (conversionDateTime != null) {
      enhancementBuilder.setGclidDateTimePair(
          GclidDateTimePair.newBuilder().setConversionDateTime(conversionDateTime));
    }

    // Creates a SHA256 message digest for hashing user identifiers in a privacy-safe way, as
    // described at https://support.google.com/google-ads/answer/9888656.
    MessageDigest sha256Digest = MessageDigest.getInstance("SHA-256");

    // Adds user identifiers, hashing where required.

    // Creates a user identifier using sample values for the user address.
    UserIdentifier addressIdentifier =
        UserIdentifier.newBuilder()
            .setAddressInfo(
                OfflineUserAddressInfo.newBuilder()
                    .setHashedFirstName(normalizeAndHash(sha256Digest, "Joanna"))
                    .setHashedLastName(normalizeAndHash(sha256Digest, "Smith"))
                    .setHashedStreetAddress(
                        normalizeAndHash(sha256Digest, "1600 Amphitheatre Pkwy"))
                    .setCity("Mountain View")
                    .setState("CA")
                    .setPostalCode("94043")
                    .setCountryCode("US"))
            // Optional: Specifies the user identifier source.
            .setUserIdentifierSource(UserIdentifierSource.FIRST_PARTY)
            .build();

    // Creates a user identifier using the hashed email address.
    UserIdentifier emailIdentifier =
        UserIdentifier.newBuilder()
            .setUserIdentifierSource(UserIdentifierSource.FIRST_PARTY)
            // Uses the normalize and hash method specifically for email addresses.
            .setHashedEmail(normalizeAndHashEmailAddress(sha256Digest, "joannasmith@example.com"))
            .build();

    // Adds the user identifiers to the enhancement adjustment.
    enhancementBuilder.addUserIdentifiers(addressIdentifier).addUserIdentifiers(emailIdentifier);

    // Sets optional fields where a value was provided.

    if (userAgent != null) {
      // Sets the user agent. This should match the user agent of the request that sent the original
      // conversion so the conversion and its enhancement are either both attributed as same-device
      // or both attributed as cross-device.
      enhancementBuilder.setUserAgent(userAgent);
    }

    if (restatementValue != null) {
      // Creates a builder to construct the restated conversion value.
      RestatementValue.Builder valueBuilder = enhancementBuilder.getRestatementValueBuilder();
      // Sets the new value of the conversion.
      valueBuilder.setAdjustedValue(restatementValue);
      // Sets the currency of the new value, if provided. Otherwise, the default currency from
      // the conversion action is used, and if that is not set then the account currency is used.
      if (restatementCurrencyCode != null) {
        valueBuilder.setCurrencyCode(restatementCurrencyCode);
      }
    }
    // [END create_adjustment]

    // Creates the conversion upload service client.
    try (ConversionAdjustmentUploadServiceClient conversionUploadServiceClient =
        googleAdsClient.getLatestVersion().createConversionAdjustmentUploadServiceClient()) {
      // Uploads the enhancement adjustment. Partial failure should always be set to true.
      UploadConversionAdjustmentsResponse response =
          conversionUploadServiceClient.uploadConversionAdjustments(
              UploadConversionAdjustmentsRequest.newBuilder()
                  .setCustomerId(Long.toString(customerId))
                  .addConversionAdjustments(enhancementBuilder)
                  // Enables partial failure (must be true).
                  .setPartialFailure(true)
                  .build());

      // Prints any partial errors returned.
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
  // [END upload_conversion_enhancement]

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

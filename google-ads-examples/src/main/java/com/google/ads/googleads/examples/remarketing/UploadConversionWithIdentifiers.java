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
import com.google.ads.googleads.v8.common.UserIdentifier;
import com.google.ads.googleads.v8.enums.UserIdentifierSourceEnum.UserIdentifierSource;
import com.google.ads.googleads.v8.errors.GoogleAdsError;
import com.google.ads.googleads.v8.errors.GoogleAdsException;
import com.google.ads.googleads.v8.services.ClickConversion;
import com.google.ads.googleads.v8.services.ClickConversionResult;
import com.google.ads.googleads.v8.services.ConversionUploadServiceClient;
import com.google.ads.googleads.v8.services.UploadClickConversionsRequest;
import com.google.ads.googleads.v8.services.UploadClickConversionsResponse;
import com.google.ads.googleads.v8.utils.ResourceNames;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/** Uploads a conversion using hashed email address instead of GCLID. */
public class UploadConversionWithIdentifiers {
  private static class UploadConversionWithIdentifiersParams extends CodeSampleParams {

    @Parameter(names = ArgumentNames.CUSTOMER_ID, required = true)
    private long customerId;

    @Parameter(names = ArgumentNames.CONVERSION_ACTION_ID, required = true)
    private long conversionActionId;

    @Parameter(names = ArgumentNames.EMAIL_ADDRESS, required = true)
    private String emailAddress;

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
  }

  public static void main(String[] args)
      throws UnsupportedEncodingException, NoSuchAlgorithmException {
    UploadConversionWithIdentifiersParams params = new UploadConversionWithIdentifiersParams();
    if (!params.parseArguments(args)) {

      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.customerId = Long.parseLong("INSERT_CUSTOMER_ID_HERE");
      params.conversionActionId = Long.parseLong("INSERT_CONVERSION_ACTION_ID_HERE");
      params.emailAddress = "INSERT_EMAIL_ADDRESS_HERE";
      params.conversionDateTime = "INSERT_CONVERSION_DATE_TIME_HERE";
      params.conversionValue = Double.parseDouble("INSERT_CONVERSION_VALUE_HERE");
      // Optional: Specify the unique order ID for the click conversion.
      params.orderId = null;
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
      new UploadConversionWithIdentifiers()
          .runExample(
              googleAdsClient,
              params.customerId,
              params.conversionActionId,
              params.emailAddress,
              params.conversionDateTime,
              params.conversionValue,
              params.orderId);
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
   * @param emailAddress email address for the conversion.
   * @param conversionDateTime date and time of the conversion.
   * @param conversionValue the value of the conversion.
   * @param orderId the unique ID (transaction ID) of the conversion.
   */
  // [START upload_conversion_with_identifiers]
  private void runExample(
      GoogleAdsClient googleAdsClient,
      long customerId,
      long conversionActionId,
      String emailAddress,
      String conversionDateTime,
      Double conversionValue,
      String orderId)
      throws UnsupportedEncodingException, NoSuchAlgorithmException {
    // [START create_conversion]
    // Gets the conversion action resource name.
    String conversionActionResourceName =
        ResourceNames.conversionAction(customerId, conversionActionId);

    // Creates a builder for constructing the click conversion.
    ClickConversion.Builder clickConversionBuilder =
        ClickConversion.newBuilder()
            .setConversionAction(conversionActionResourceName)
            .setConversionDateTime(conversionDateTime)
            .setConversionValue(conversionValue)
            .setCurrencyCode("USD");

    // Sets the order ID if provided.
    if (orderId != null) {
      clickConversionBuilder.setOrderId(orderId);
    }

    // Creates a SHA256 message digest for hashing user identifiers in a privacy-safe way, as
    // described at https://support.google.com/google-ads/answer/9888656.
    MessageDigest sha256Digest = MessageDigest.getInstance("SHA-256");

    // Creates a user identifier using the hashed email address, using the normalize and hash method
    // specifically for email addresses.
    // If using a phone number, use the normalizeAndHash(String) method instead.
    String hashedEmail = normalizeAndHashEmailAddress(sha256Digest, emailAddress);
    UserIdentifier userIdentifier =
        UserIdentifier.newBuilder()
            .setHashedEmail(hashedEmail)
            // Optional: Specifies the user identifier source.
            .setUserIdentifierSource(UserIdentifierSource.FIRST_PARTY)
            .build();

    // Adds the user identifier to the conversion.
    clickConversionBuilder.addUserIdentifiers(userIdentifier);

    // Calls build to build the conversion.
    ClickConversion clickConversion = clickConversionBuilder.build();
    // [END create_conversion]

    // Creates the conversion upload service client.
    try (ConversionUploadServiceClient conversionUploadServiceClient =
        googleAdsClient.getLatestVersion().createConversionUploadServiceClient()) {
      // Uploads the click conversion. Partial failure should always be set to true.
      UploadClickConversionsResponse response =
          conversionUploadServiceClient.uploadClickConversions(
              UploadClickConversionsRequest.newBuilder()
                  .setCustomerId(Long.toString(customerId))
                  .addConversions(clickConversion)
                  // Enables partial failure (must be true).
                  .setPartialFailure(true)
                  .build());

      // Prints any partial errors returned.
      if (response.hasPartialFailureError()) {
        System.out.printf(
            "Partial error encountered: '%s'.%n", response.getPartialFailureError().getMessage());
      }

      // Prints the result.
      ClickConversionResult result = response.getResults(0);
      // Only prints valid results.
      if (result.hasGclid()) {
        System.out.printf(
            "Uploaded conversion that occurred at '%s' from Google Click ID '%s' to '%s'.%n",
            result.getConversionDateTime(), result.getGclid(), result.getConversionAction());
      }
    }
  }
  // [END upload_conversion_with_identifiers]

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

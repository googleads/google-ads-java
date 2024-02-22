// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/extensions.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.common;

public interface TextMessageFeedItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.TextMessageFeedItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The business name to prepend to the message text.
   * This field is required.
   * </pre>
   *
   * <code>optional string business_name = 6;</code>
   * @return Whether the businessName field is set.
   */
  boolean hasBusinessName();
  /**
   * <pre>
   * The business name to prepend to the message text.
   * This field is required.
   * </pre>
   *
   * <code>optional string business_name = 6;</code>
   * @return The businessName.
   */
  java.lang.String getBusinessName();
  /**
   * <pre>
   * The business name to prepend to the message text.
   * This field is required.
   * </pre>
   *
   * <code>optional string business_name = 6;</code>
   * @return The bytes for businessName.
   */
  com.google.protobuf.ByteString
      getBusinessNameBytes();

  /**
   * <pre>
   * Uppercase two-letter country code of the advertiser's phone number.
   * This field is required.
   * </pre>
   *
   * <code>optional string country_code = 7;</code>
   * @return Whether the countryCode field is set.
   */
  boolean hasCountryCode();
  /**
   * <pre>
   * Uppercase two-letter country code of the advertiser's phone number.
   * This field is required.
   * </pre>
   *
   * <code>optional string country_code = 7;</code>
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   * <pre>
   * Uppercase two-letter country code of the advertiser's phone number.
   * This field is required.
   * </pre>
   *
   * <code>optional string country_code = 7;</code>
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <pre>
   * The advertiser's phone number the message will be sent to. Required.
   * </pre>
   *
   * <code>optional string phone_number = 8;</code>
   * @return Whether the phoneNumber field is set.
   */
  boolean hasPhoneNumber();
  /**
   * <pre>
   * The advertiser's phone number the message will be sent to. Required.
   * </pre>
   *
   * <code>optional string phone_number = 8;</code>
   * @return The phoneNumber.
   */
  java.lang.String getPhoneNumber();
  /**
   * <pre>
   * The advertiser's phone number the message will be sent to. Required.
   * </pre>
   *
   * <code>optional string phone_number = 8;</code>
   * @return The bytes for phoneNumber.
   */
  com.google.protobuf.ByteString
      getPhoneNumberBytes();

  /**
   * <pre>
   * The text to show in the ad.
   * This field is required.
   * </pre>
   *
   * <code>optional string text = 9;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * The text to show in the ad.
   * This field is required.
   * </pre>
   *
   * <code>optional string text = 9;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * The text to show in the ad.
   * This field is required.
   * </pre>
   *
   * <code>optional string text = 9;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * The message extension_text populated in the messaging app.
   * </pre>
   *
   * <code>optional string extension_text = 10;</code>
   * @return Whether the extensionText field is set.
   */
  boolean hasExtensionText();
  /**
   * <pre>
   * The message extension_text populated in the messaging app.
   * </pre>
   *
   * <code>optional string extension_text = 10;</code>
   * @return The extensionText.
   */
  java.lang.String getExtensionText();
  /**
   * <pre>
   * The message extension_text populated in the messaging app.
   * </pre>
   *
   * <code>optional string extension_text = 10;</code>
   * @return The bytes for extensionText.
   */
  com.google.protobuf.ByteString
      getExtensionTextBytes();
}

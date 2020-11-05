// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/common/extensions.proto

package com.google.ads.googleads.v5.common;

public interface TextMessageFeedItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.common.TextMessageFeedItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The business name to prepend to the message text.
   * This field is required.
   * </pre>
   *
   * <code>.google.protobuf.StringValue business_name = 1;</code>
   * @return Whether the businessName field is set.
   */
  boolean hasBusinessName();
  /**
   * <pre>
   * The business name to prepend to the message text.
   * This field is required.
   * </pre>
   *
   * <code>.google.protobuf.StringValue business_name = 1;</code>
   * @return The businessName.
   */
  com.google.protobuf.StringValue getBusinessName();
  /**
   * <pre>
   * The business name to prepend to the message text.
   * This field is required.
   * </pre>
   *
   * <code>.google.protobuf.StringValue business_name = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getBusinessNameOrBuilder();

  /**
   * <pre>
   * Uppercase two-letter country code of the advertiser's phone number.
   * This field is required.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 2;</code>
   * @return Whether the countryCode field is set.
   */
  boolean hasCountryCode();
  /**
   * <pre>
   * Uppercase two-letter country code of the advertiser's phone number.
   * This field is required.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 2;</code>
   * @return The countryCode.
   */
  com.google.protobuf.StringValue getCountryCode();
  /**
   * <pre>
   * Uppercase two-letter country code of the advertiser's phone number.
   * This field is required.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCountryCodeOrBuilder();

  /**
   * <pre>
   * The advertiser's phone number the message will be sent to. Required.
   * </pre>
   *
   * <code>.google.protobuf.StringValue phone_number = 3;</code>
   * @return Whether the phoneNumber field is set.
   */
  boolean hasPhoneNumber();
  /**
   * <pre>
   * The advertiser's phone number the message will be sent to. Required.
   * </pre>
   *
   * <code>.google.protobuf.StringValue phone_number = 3;</code>
   * @return The phoneNumber.
   */
  com.google.protobuf.StringValue getPhoneNumber();
  /**
   * <pre>
   * The advertiser's phone number the message will be sent to. Required.
   * </pre>
   *
   * <code>.google.protobuf.StringValue phone_number = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPhoneNumberOrBuilder();

  /**
   * <pre>
   * The text to show in the ad.
   * This field is required.
   * </pre>
   *
   * <code>.google.protobuf.StringValue text = 4;</code>
   * @return Whether the text field is set.
   */
  boolean hasText();
  /**
   * <pre>
   * The text to show in the ad.
   * This field is required.
   * </pre>
   *
   * <code>.google.protobuf.StringValue text = 4;</code>
   * @return The text.
   */
  com.google.protobuf.StringValue getText();
  /**
   * <pre>
   * The text to show in the ad.
   * This field is required.
   * </pre>
   *
   * <code>.google.protobuf.StringValue text = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTextOrBuilder();

  /**
   * <pre>
   * The message text populated in the messaging app.
   * </pre>
   *
   * <code>.google.protobuf.StringValue extension_text = 5;</code>
   * @return Whether the extensionText field is set.
   */
  boolean hasExtensionText();
  /**
   * <pre>
   * The message text populated in the messaging app.
   * </pre>
   *
   * <code>.google.protobuf.StringValue extension_text = 5;</code>
   * @return The extensionText.
   */
  com.google.protobuf.StringValue getExtensionText();
  /**
   * <pre>
   * The message text populated in the messaging app.
   * </pre>
   *
   * <code>.google.protobuf.StringValue extension_text = 5;</code>
   */
  com.google.protobuf.StringValueOrBuilder getExtensionTextOrBuilder();
}

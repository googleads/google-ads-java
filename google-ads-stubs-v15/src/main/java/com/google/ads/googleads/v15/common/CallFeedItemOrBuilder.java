// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/extensions.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.common;

public interface CallFeedItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.CallFeedItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The advertiser's phone number to append to the ad.
   * This string must not be empty.
   * </pre>
   *
   * <code>optional string phone_number = 7;</code>
   * @return Whether the phoneNumber field is set.
   */
  boolean hasPhoneNumber();
  /**
   * <pre>
   * The advertiser's phone number to append to the ad.
   * This string must not be empty.
   * </pre>
   *
   * <code>optional string phone_number = 7;</code>
   * @return The phoneNumber.
   */
  java.lang.String getPhoneNumber();
  /**
   * <pre>
   * The advertiser's phone number to append to the ad.
   * This string must not be empty.
   * </pre>
   *
   * <code>optional string phone_number = 7;</code>
   * @return The bytes for phoneNumber.
   */
  com.google.protobuf.ByteString
      getPhoneNumberBytes();

  /**
   * <pre>
   * Uppercase two-letter country code of the advertiser's phone number.
   * This string must not be empty.
   * </pre>
   *
   * <code>optional string country_code = 8;</code>
   * @return Whether the countryCode field is set.
   */
  boolean hasCountryCode();
  /**
   * <pre>
   * Uppercase two-letter country code of the advertiser's phone number.
   * This string must not be empty.
   * </pre>
   *
   * <code>optional string country_code = 8;</code>
   * @return The countryCode.
   */
  java.lang.String getCountryCode();
  /**
   * <pre>
   * Uppercase two-letter country code of the advertiser's phone number.
   * This string must not be empty.
   * </pre>
   *
   * <code>optional string country_code = 8;</code>
   * @return The bytes for countryCode.
   */
  com.google.protobuf.ByteString
      getCountryCodeBytes();

  /**
   * <pre>
   * Indicates whether call tracking is enabled. By default, call tracking is
   * not enabled.
   * </pre>
   *
   * <code>optional bool call_tracking_enabled = 9;</code>
   * @return Whether the callTrackingEnabled field is set.
   */
  boolean hasCallTrackingEnabled();
  /**
   * <pre>
   * Indicates whether call tracking is enabled. By default, call tracking is
   * not enabled.
   * </pre>
   *
   * <code>optional bool call_tracking_enabled = 9;</code>
   * @return The callTrackingEnabled.
   */
  boolean getCallTrackingEnabled();

  /**
   * <pre>
   * The conversion action to attribute a call conversion to. If not set a
   * default conversion action is used. This field only has effect if
   * call_tracking_enabled is set to true. Otherwise this field is ignored.
   * </pre>
   *
   * <code>optional string call_conversion_action = 10;</code>
   * @return Whether the callConversionAction field is set.
   */
  boolean hasCallConversionAction();
  /**
   * <pre>
   * The conversion action to attribute a call conversion to. If not set a
   * default conversion action is used. This field only has effect if
   * call_tracking_enabled is set to true. Otherwise this field is ignored.
   * </pre>
   *
   * <code>optional string call_conversion_action = 10;</code>
   * @return The callConversionAction.
   */
  java.lang.String getCallConversionAction();
  /**
   * <pre>
   * The conversion action to attribute a call conversion to. If not set a
   * default conversion action is used. This field only has effect if
   * call_tracking_enabled is set to true. Otherwise this field is ignored.
   * </pre>
   *
   * <code>optional string call_conversion_action = 10;</code>
   * @return The bytes for callConversionAction.
   */
  com.google.protobuf.ByteString
      getCallConversionActionBytes();

  /**
   * <pre>
   * If true, disable call conversion tracking. call_conversion_action should
   * not be set if this is true. Optional.
   * </pre>
   *
   * <code>optional bool call_conversion_tracking_disabled = 11;</code>
   * @return Whether the callConversionTrackingDisabled field is set.
   */
  boolean hasCallConversionTrackingDisabled();
  /**
   * <pre>
   * If true, disable call conversion tracking. call_conversion_action should
   * not be set if this is true. Optional.
   * </pre>
   *
   * <code>optional bool call_conversion_tracking_disabled = 11;</code>
   * @return The callConversionTrackingDisabled.
   */
  boolean getCallConversionTrackingDisabled();

  /**
   * <pre>
   * Enum value that indicates whether this call extension uses its own call
   * conversion setting (or just have call conversion disabled), or following
   * the account level setting.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.CallConversionReportingStateEnum.CallConversionReportingState call_conversion_reporting_state = 6;</code>
   * @return The enum numeric value on the wire for callConversionReportingState.
   */
  int getCallConversionReportingStateValue();
  /**
   * <pre>
   * Enum value that indicates whether this call extension uses its own call
   * conversion setting (or just have call conversion disabled), or following
   * the account level setting.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.CallConversionReportingStateEnum.CallConversionReportingState call_conversion_reporting_state = 6;</code>
   * @return The callConversionReportingState.
   */
  com.google.ads.googleads.v15.enums.CallConversionReportingStateEnum.CallConversionReportingState getCallConversionReportingState();
}

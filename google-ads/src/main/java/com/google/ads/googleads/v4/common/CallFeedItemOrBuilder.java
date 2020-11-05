// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/common/extensions.proto

package com.google.ads.googleads.v4.common;

public interface CallFeedItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v4.common.CallFeedItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The advertiser's phone number to append to the ad.
   * This string must not be empty.
   * </pre>
   *
   * <code>.google.protobuf.StringValue phone_number = 1;</code>
   * @return Whether the phoneNumber field is set.
   */
  boolean hasPhoneNumber();
  /**
   * <pre>
   * The advertiser's phone number to append to the ad.
   * This string must not be empty.
   * </pre>
   *
   * <code>.google.protobuf.StringValue phone_number = 1;</code>
   * @return The phoneNumber.
   */
  com.google.protobuf.StringValue getPhoneNumber();
  /**
   * <pre>
   * The advertiser's phone number to append to the ad.
   * This string must not be empty.
   * </pre>
   *
   * <code>.google.protobuf.StringValue phone_number = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPhoneNumberOrBuilder();

  /**
   * <pre>
   * Uppercase two-letter country code of the advertiser's phone number.
   * This string must not be empty.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 2;</code>
   * @return Whether the countryCode field is set.
   */
  boolean hasCountryCode();
  /**
   * <pre>
   * Uppercase two-letter country code of the advertiser's phone number.
   * This string must not be empty.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 2;</code>
   * @return The countryCode.
   */
  com.google.protobuf.StringValue getCountryCode();
  /**
   * <pre>
   * Uppercase two-letter country code of the advertiser's phone number.
   * This string must not be empty.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCountryCodeOrBuilder();

  /**
   * <pre>
   * Indicates whether call tracking is enabled. By default, call tracking is
   * not enabled.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue call_tracking_enabled = 3;</code>
   * @return Whether the callTrackingEnabled field is set.
   */
  boolean hasCallTrackingEnabled();
  /**
   * <pre>
   * Indicates whether call tracking is enabled. By default, call tracking is
   * not enabled.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue call_tracking_enabled = 3;</code>
   * @return The callTrackingEnabled.
   */
  com.google.protobuf.BoolValue getCallTrackingEnabled();
  /**
   * <pre>
   * Indicates whether call tracking is enabled. By default, call tracking is
   * not enabled.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue call_tracking_enabled = 3;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getCallTrackingEnabledOrBuilder();

  /**
   * <pre>
   * The conversion action to attribute a call conversion to. If not set a
   * default conversion action is used. This field only has effect if
   * call_tracking_enabled is set to true. Otherwise this field is ignored.
   * </pre>
   *
   * <code>.google.protobuf.StringValue call_conversion_action = 4;</code>
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
   * <code>.google.protobuf.StringValue call_conversion_action = 4;</code>
   * @return The callConversionAction.
   */
  com.google.protobuf.StringValue getCallConversionAction();
  /**
   * <pre>
   * The conversion action to attribute a call conversion to. If not set a
   * default conversion action is used. This field only has effect if
   * call_tracking_enabled is set to true. Otherwise this field is ignored.
   * </pre>
   *
   * <code>.google.protobuf.StringValue call_conversion_action = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCallConversionActionOrBuilder();

  /**
   * <pre>
   * If true, disable call conversion tracking. call_conversion_action should
   * not be set if this is true. Optional.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue call_conversion_tracking_disabled = 5;</code>
   * @return Whether the callConversionTrackingDisabled field is set.
   */
  boolean hasCallConversionTrackingDisabled();
  /**
   * <pre>
   * If true, disable call conversion tracking. call_conversion_action should
   * not be set if this is true. Optional.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue call_conversion_tracking_disabled = 5;</code>
   * @return The callConversionTrackingDisabled.
   */
  com.google.protobuf.BoolValue getCallConversionTrackingDisabled();
  /**
   * <pre>
   * If true, disable call conversion tracking. call_conversion_action should
   * not be set if this is true. Optional.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue call_conversion_tracking_disabled = 5;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getCallConversionTrackingDisabledOrBuilder();

  /**
   * <pre>
   * Enum value that indicates whether this call extension uses its own call
   * conversion setting (or just have call conversion disabled), or following
   * the account level setting.
   * </pre>
   *
   * <code>.google.ads.googleads.v4.enums.CallConversionReportingStateEnum.CallConversionReportingState call_conversion_reporting_state = 6;</code>
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
   * <code>.google.ads.googleads.v4.enums.CallConversionReportingStateEnum.CallConversionReportingState call_conversion_reporting_state = 6;</code>
   * @return The callConversionReportingState.
   */
  com.google.ads.googleads.v4.enums.CallConversionReportingStateEnum.CallConversionReportingState getCallConversionReportingState();
}

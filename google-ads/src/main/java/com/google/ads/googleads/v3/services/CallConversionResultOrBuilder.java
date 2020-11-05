// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/conversion_upload_service.proto

package com.google.ads.googleads.v3.services;

public interface CallConversionResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.services.CallConversionResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The caller id from which this call was placed. Caller id is expected to be
   * in E.164 format with preceding '+' sign.
   * </pre>
   *
   * <code>.google.protobuf.StringValue caller_id = 1;</code>
   * @return Whether the callerId field is set.
   */
  boolean hasCallerId();
  /**
   * <pre>
   * The caller id from which this call was placed. Caller id is expected to be
   * in E.164 format with preceding '+' sign.
   * </pre>
   *
   * <code>.google.protobuf.StringValue caller_id = 1;</code>
   * @return The callerId.
   */
  com.google.protobuf.StringValue getCallerId();
  /**
   * <pre>
   * The caller id from which this call was placed. Caller id is expected to be
   * in E.164 format with preceding '+' sign.
   * </pre>
   *
   * <code>.google.protobuf.StringValue caller_id = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCallerIdOrBuilder();

  /**
   * <pre>
   * The date time at which the call occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>.google.protobuf.StringValue call_start_date_time = 2;</code>
   * @return Whether the callStartDateTime field is set.
   */
  boolean hasCallStartDateTime();
  /**
   * <pre>
   * The date time at which the call occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>.google.protobuf.StringValue call_start_date_time = 2;</code>
   * @return The callStartDateTime.
   */
  com.google.protobuf.StringValue getCallStartDateTime();
  /**
   * <pre>
   * The date time at which the call occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>.google.protobuf.StringValue call_start_date_time = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCallStartDateTimeOrBuilder();

  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_action = 3;</code>
   * @return Whether the conversionAction field is set.
   */
  boolean hasConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_action = 3;</code>
   * @return The conversionAction.
   */
  com.google.protobuf.StringValue getConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_action = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getConversionActionOrBuilder();

  /**
   * <pre>
   * The date time at which the conversion occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_date_time = 4;</code>
   * @return Whether the conversionDateTime field is set.
   */
  boolean hasConversionDateTime();
  /**
   * <pre>
   * The date time at which the conversion occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_date_time = 4;</code>
   * @return The conversionDateTime.
   */
  com.google.protobuf.StringValue getConversionDateTime();
  /**
   * <pre>
   * The date time at which the conversion occurred. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_date_time = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getConversionDateTimeOrBuilder();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/errors/errors.proto

package com.google.ads.googleads.v2.errors;

public interface GoogleAdsErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.errors.GoogleAdsError)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An enum value that indicates which error occurred.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.errors.ErrorCode error_code = 1;</code>
   * @return Whether the errorCode field is set.
   */
  boolean hasErrorCode();
  /**
   * <pre>
   * An enum value that indicates which error occurred.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.errors.ErrorCode error_code = 1;</code>
   * @return The errorCode.
   */
  com.google.ads.googleads.v2.errors.ErrorCode getErrorCode();
  /**
   * <pre>
   * An enum value that indicates which error occurred.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.errors.ErrorCode error_code = 1;</code>
   */
  com.google.ads.googleads.v2.errors.ErrorCodeOrBuilder getErrorCodeOrBuilder();

  /**
   * <pre>
   * A human-readable description of the error.
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * A human-readable description of the error.
   * </pre>
   *
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * The value that triggered the error.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.Value trigger = 3;</code>
   * @return Whether the trigger field is set.
   */
  boolean hasTrigger();
  /**
   * <pre>
   * The value that triggered the error.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.Value trigger = 3;</code>
   * @return The trigger.
   */
  com.google.ads.googleads.v2.common.Value getTrigger();
  /**
   * <pre>
   * The value that triggered the error.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.Value trigger = 3;</code>
   */
  com.google.ads.googleads.v2.common.ValueOrBuilder getTriggerOrBuilder();

  /**
   * <pre>
   * Describes the part of the request proto that caused the error.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.errors.ErrorLocation location = 4;</code>
   * @return Whether the location field is set.
   */
  boolean hasLocation();
  /**
   * <pre>
   * Describes the part of the request proto that caused the error.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.errors.ErrorLocation location = 4;</code>
   * @return The location.
   */
  com.google.ads.googleads.v2.errors.ErrorLocation getLocation();
  /**
   * <pre>
   * Describes the part of the request proto that caused the error.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.errors.ErrorLocation location = 4;</code>
   */
  com.google.ads.googleads.v2.errors.ErrorLocationOrBuilder getLocationOrBuilder();

  /**
   * <pre>
   * Additional error details, which are returned by certain error codes. Most
   * error codes do not include details.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.errors.ErrorDetails details = 5;</code>
   * @return Whether the details field is set.
   */
  boolean hasDetails();
  /**
   * <pre>
   * Additional error details, which are returned by certain error codes. Most
   * error codes do not include details.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.errors.ErrorDetails details = 5;</code>
   * @return The details.
   */
  com.google.ads.googleads.v2.errors.ErrorDetails getDetails();
  /**
   * <pre>
   * Additional error details, which are returned by certain error codes. Most
   * error codes do not include details.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.errors.ErrorDetails details = 5;</code>
   */
  com.google.ads.googleads.v2.errors.ErrorDetailsOrBuilder getDetailsOrBuilder();
}

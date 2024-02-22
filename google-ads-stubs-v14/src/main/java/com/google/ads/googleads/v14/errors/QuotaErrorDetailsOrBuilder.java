// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/errors/errors.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.errors;

public interface QuotaErrorDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.errors.QuotaErrorDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The rate scope of the quota limit.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.errors.QuotaErrorDetails.QuotaRateScope rate_scope = 1;</code>
   * @return The enum numeric value on the wire for rateScope.
   */
  int getRateScopeValue();
  /**
   * <pre>
   * The rate scope of the quota limit.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.errors.QuotaErrorDetails.QuotaRateScope rate_scope = 1;</code>
   * @return The rateScope.
   */
  com.google.ads.googleads.v14.errors.QuotaErrorDetails.QuotaRateScope getRateScope();

  /**
   * <pre>
   * The high level description of the quota bucket.
   * Examples are "Get requests for standard access" or "Requests per account".
   * </pre>
   *
   * <code>string rate_name = 2;</code>
   * @return The rateName.
   */
  java.lang.String getRateName();
  /**
   * <pre>
   * The high level description of the quota bucket.
   * Examples are "Get requests for standard access" or "Requests per account".
   * </pre>
   *
   * <code>string rate_name = 2;</code>
   * @return The bytes for rateName.
   */
  com.google.protobuf.ByteString
      getRateNameBytes();

  /**
   * <pre>
   * Backoff period that customers should wait before sending next request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 3;</code>
   * @return Whether the retryDelay field is set.
   */
  boolean hasRetryDelay();
  /**
   * <pre>
   * Backoff period that customers should wait before sending next request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 3;</code>
   * @return The retryDelay.
   */
  com.google.protobuf.Duration getRetryDelay();
  /**
   * <pre>
   * Backoff period that customers should wait before sending next request.
   * </pre>
   *
   * <code>.google.protobuf.Duration retry_delay = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getRetryDelayOrBuilder();
}

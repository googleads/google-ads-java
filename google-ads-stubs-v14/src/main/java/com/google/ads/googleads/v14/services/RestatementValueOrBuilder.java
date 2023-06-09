// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/conversion_adjustment_upload_service.proto

package com.google.ads.googleads.v14.services;

public interface RestatementValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.services.RestatementValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The restated conversion value. This is the value of the conversion after
   * restatement. For example, to change the value of a conversion from 100 to
   * 70, an adjusted value of 70 should be reported.
   * NOTE: If you want to upload a second restatement with a different adjusted
   * value, it must have a new, more recent, adjustment occurrence time.
   * Otherwise, it will be treated as a duplicate of the previous restatement
   * and ignored.
   * </pre>
   *
   * <code>optional double adjusted_value = 3;</code>
   * @return Whether the adjustedValue field is set.
   */
  boolean hasAdjustedValue();
  /**
   * <pre>
   * The restated conversion value. This is the value of the conversion after
   * restatement. For example, to change the value of a conversion from 100 to
   * 70, an adjusted value of 70 should be reported.
   * NOTE: If you want to upload a second restatement with a different adjusted
   * value, it must have a new, more recent, adjustment occurrence time.
   * Otherwise, it will be treated as a duplicate of the previous restatement
   * and ignored.
   * </pre>
   *
   * <code>optional double adjusted_value = 3;</code>
   * @return The adjustedValue.
   */
  double getAdjustedValue();

  /**
   * <pre>
   * The currency of the restated value. If not provided, then the default
   * currency from the conversion action is used, and if that is not set then
   * the account currency is used. This is the ISO 4217 3-character currency
   * code for example, USD or EUR.
   * </pre>
   *
   * <code>optional string currency_code = 4;</code>
   * @return Whether the currencyCode field is set.
   */
  boolean hasCurrencyCode();
  /**
   * <pre>
   * The currency of the restated value. If not provided, then the default
   * currency from the conversion action is used, and if that is not set then
   * the account currency is used. This is the ISO 4217 3-character currency
   * code for example, USD or EUR.
   * </pre>
   *
   * <code>optional string currency_code = 4;</code>
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();
  /**
   * <pre>
   * The currency of the restated value. If not provided, then the default
   * currency from the conversion action is used, and if that is not set then
   * the account currency is used. This is the ISO 4217 3-character currency
   * code for example, USD or EUR.
   * </pre>
   *
   * <code>optional string currency_code = 4;</code>
   * @return The bytes for currencyCode.
   */
  com.google.protobuf.ByteString
      getCurrencyCodeBytes();
}

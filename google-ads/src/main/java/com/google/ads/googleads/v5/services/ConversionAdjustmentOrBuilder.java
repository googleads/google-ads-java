// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/services/conversion_adjustment_upload_service.proto

package com.google.ads.googleads.v5.services;

public interface ConversionAdjustmentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.services.ConversionAdjustment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion
   * adjustment. Note: Although this resource name consists of a customer id and
   * a conversion action id, validation will ignore the customer id and use the
   * conversion action id as the sole identifier of the conversion action.
   * </pre>
   *
   * <code>string conversion_action = 8;</code>
   * @return Whether the conversionAction field is set.
   */
  boolean hasConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion
   * adjustment. Note: Although this resource name consists of a customer id and
   * a conversion action id, validation will ignore the customer id and use the
   * conversion action id as the sole identifier of the conversion action.
   * </pre>
   *
   * <code>string conversion_action = 8;</code>
   * @return The conversionAction.
   */
  java.lang.String getConversionAction();
  /**
   * <pre>
   * Resource name of the conversion action associated with this conversion
   * adjustment. Note: Although this resource name consists of a customer id and
   * a conversion action id, validation will ignore the customer id and use the
   * conversion action id as the sole identifier of the conversion action.
   * </pre>
   *
   * <code>string conversion_action = 8;</code>
   * @return The bytes for conversionAction.
   */
  com.google.protobuf.ByteString
      getConversionActionBytes();

  /**
   * <pre>
   * The date time at which the adjustment occurred. Must be after the
   * conversion_date_time. The timezone must be specified. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>string adjustment_date_time = 9;</code>
   * @return Whether the adjustmentDateTime field is set.
   */
  boolean hasAdjustmentDateTime();
  /**
   * <pre>
   * The date time at which the adjustment occurred. Must be after the
   * conversion_date_time. The timezone must be specified. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>string adjustment_date_time = 9;</code>
   * @return The adjustmentDateTime.
   */
  java.lang.String getAdjustmentDateTime();
  /**
   * <pre>
   * The date time at which the adjustment occurred. Must be after the
   * conversion_date_time. The timezone must be specified. The format is
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", e.g. "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>string adjustment_date_time = 9;</code>
   * @return The bytes for adjustmentDateTime.
   */
  com.google.protobuf.ByteString
      getAdjustmentDateTimeBytes();

  /**
   * <pre>
   * The adjustment type.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.ConversionAdjustmentTypeEnum.ConversionAdjustmentType adjustment_type = 5;</code>
   * @return The enum numeric value on the wire for adjustmentType.
   */
  int getAdjustmentTypeValue();
  /**
   * <pre>
   * The adjustment type.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.ConversionAdjustmentTypeEnum.ConversionAdjustmentType adjustment_type = 5;</code>
   * @return The adjustmentType.
   */
  com.google.ads.googleads.v5.enums.ConversionAdjustmentTypeEnum.ConversionAdjustmentType getAdjustmentType();

  /**
   * <pre>
   * Information needed to restate the conversion's value.
   * Required for restatements. Should not be supplied for retractions. An error
   * will be returned if provided for a retraction.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.RestatementValue restatement_value = 6;</code>
   * @return Whether the restatementValue field is set.
   */
  boolean hasRestatementValue();
  /**
   * <pre>
   * Information needed to restate the conversion's value.
   * Required for restatements. Should not be supplied for retractions. An error
   * will be returned if provided for a retraction.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.RestatementValue restatement_value = 6;</code>
   * @return The restatementValue.
   */
  com.google.ads.googleads.v5.services.RestatementValue getRestatementValue();
  /**
   * <pre>
   * Information needed to restate the conversion's value.
   * Required for restatements. Should not be supplied for retractions. An error
   * will be returned if provided for a retraction.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.RestatementValue restatement_value = 6;</code>
   */
  com.google.ads.googleads.v5.services.RestatementValueOrBuilder getRestatementValueOrBuilder();

  /**
   * <pre>
   * Uniquely identifies a conversion that was reported without an order ID
   * specified.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.GclidDateTimePair gclid_date_time_pair = 1;</code>
   * @return Whether the gclidDateTimePair field is set.
   */
  boolean hasGclidDateTimePair();
  /**
   * <pre>
   * Uniquely identifies a conversion that was reported without an order ID
   * specified.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.GclidDateTimePair gclid_date_time_pair = 1;</code>
   * @return The gclidDateTimePair.
   */
  com.google.ads.googleads.v5.services.GclidDateTimePair getGclidDateTimePair();
  /**
   * <pre>
   * Uniquely identifies a conversion that was reported without an order ID
   * specified.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.services.GclidDateTimePair gclid_date_time_pair = 1;</code>
   */
  com.google.ads.googleads.v5.services.GclidDateTimePairOrBuilder getGclidDateTimePairOrBuilder();

  /**
   * <pre>
   * The order ID of the conversion to be adjusted. If the conversion was
   * reported with an order ID specified, that order ID must be used as the
   * identifier here.
   * </pre>
   *
   * <code>string order_id = 7;</code>
   * @return The orderId.
   */
  java.lang.String getOrderId();
  /**
   * <pre>
   * The order ID of the conversion to be adjusted. If the conversion was
   * reported with an order ID specified, that order ID must be used as the
   * identifier here.
   * </pre>
   *
   * <code>string order_id = 7;</code>
   * @return The bytes for orderId.
   */
  com.google.protobuf.ByteString
      getOrderIdBytes();

  public com.google.ads.googleads.v5.services.ConversionAdjustment.ConversionIdentifierCase getConversionIdentifierCase();
}

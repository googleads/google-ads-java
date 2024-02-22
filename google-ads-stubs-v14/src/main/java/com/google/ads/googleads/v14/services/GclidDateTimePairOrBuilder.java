// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/conversion_adjustment_upload_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.services;

public interface GclidDateTimePairOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.services.GclidDateTimePair)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Google click ID (gclid) associated with the original conversion for this
   * adjustment.
   * </pre>
   *
   * <code>optional string gclid = 3;</code>
   * @return Whether the gclid field is set.
   */
  boolean hasGclid();
  /**
   * <pre>
   * Google click ID (gclid) associated with the original conversion for this
   * adjustment.
   * </pre>
   *
   * <code>optional string gclid = 3;</code>
   * @return The gclid.
   */
  java.lang.String getGclid();
  /**
   * <pre>
   * Google click ID (gclid) associated with the original conversion for this
   * adjustment.
   * </pre>
   *
   * <code>optional string gclid = 3;</code>
   * @return The bytes for gclid.
   */
  com.google.protobuf.ByteString
      getGclidBytes();

  /**
   * <pre>
   * The date time at which the original conversion for this adjustment
   * occurred. The timezone must be specified. The format is "yyyy-mm-dd
   * hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string conversion_date_time = 4;</code>
   * @return Whether the conversionDateTime field is set.
   */
  boolean hasConversionDateTime();
  /**
   * <pre>
   * The date time at which the original conversion for this adjustment
   * occurred. The timezone must be specified. The format is "yyyy-mm-dd
   * hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string conversion_date_time = 4;</code>
   * @return The conversionDateTime.
   */
  java.lang.String getConversionDateTime();
  /**
   * <pre>
   * The date time at which the original conversion for this adjustment
   * occurred. The timezone must be specified. The format is "yyyy-mm-dd
   * hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string conversion_date_time = 4;</code>
   * @return The bytes for conversionDateTime.
   */
  com.google.protobuf.ByteString
      getConversionDateTimeBytes();
}

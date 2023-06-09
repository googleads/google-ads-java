// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/criteria.proto

package com.google.ads.googleads.v14.common;

public interface HotelAdvanceBookingWindowInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.common.HotelAdvanceBookingWindowInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Low end of the number of days prior to the stay.
   * </pre>
   *
   * <code>optional int64 min_days = 3;</code>
   * @return Whether the minDays field is set.
   */
  boolean hasMinDays();
  /**
   * <pre>
   * Low end of the number of days prior to the stay.
   * </pre>
   *
   * <code>optional int64 min_days = 3;</code>
   * @return The minDays.
   */
  long getMinDays();

  /**
   * <pre>
   * High end of the number of days prior to the stay.
   * </pre>
   *
   * <code>optional int64 max_days = 4;</code>
   * @return Whether the maxDays field is set.
   */
  boolean hasMaxDays();
  /**
   * <pre>
   * High end of the number of days prior to the stay.
   * </pre>
   *
   * <code>optional int64 max_days = 4;</code>
   * @return The maxDays.
   */
  long getMaxDays();
}

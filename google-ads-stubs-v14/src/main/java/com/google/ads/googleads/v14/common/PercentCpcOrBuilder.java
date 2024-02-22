// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/bidding.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.common;

public interface PercentCpcOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.common.PercentCpc)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy. This is
   * an optional field entered by the advertiser and specified in local micros.
   * Note: A zero value is interpreted in the same way as having bid_ceiling
   * undefined.
   * </pre>
   *
   * <code>optional int64 cpc_bid_ceiling_micros = 3;</code>
   * @return Whether the cpcBidCeilingMicros field is set.
   */
  boolean hasCpcBidCeilingMicros();
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy. This is
   * an optional field entered by the advertiser and specified in local micros.
   * Note: A zero value is interpreted in the same way as having bid_ceiling
   * undefined.
   * </pre>
   *
   * <code>optional int64 cpc_bid_ceiling_micros = 3;</code>
   * @return The cpcBidCeilingMicros.
   */
  long getCpcBidCeilingMicros();

  /**
   * <pre>
   * Adjusts the bid for each auction upward or downward, depending on the
   * likelihood of a conversion. Individual bids may exceed
   * cpc_bid_ceiling_micros, but the average bid amount for a campaign should
   * not.
   * </pre>
   *
   * <code>optional bool enhanced_cpc_enabled = 4;</code>
   * @return Whether the enhancedCpcEnabled field is set.
   */
  boolean hasEnhancedCpcEnabled();
  /**
   * <pre>
   * Adjusts the bid for each auction upward or downward, depending on the
   * likelihood of a conversion. Individual bids may exceed
   * cpc_bid_ceiling_micros, but the average bid amount for a campaign should
   * not.
   * </pre>
   *
   * <code>optional bool enhanced_cpc_enabled = 4;</code>
   * @return The enhancedCpcEnabled.
   */
  boolean getEnhancedCpcEnabled();
}

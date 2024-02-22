// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/bidding.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.common;

public interface TargetCpaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.common.TargetCpa)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Average CPA target.
   * This target should be greater than or equal to minimum billable unit based
   * on the currency for the account.
   * </pre>
   *
   * <code>optional int64 target_cpa_micros = 4;</code>
   * @return Whether the targetCpaMicros field is set.
   */
  boolean hasTargetCpaMicros();
  /**
   * <pre>
   * Average CPA target.
   * This target should be greater than or equal to minimum billable unit based
   * on the currency for the account.
   * </pre>
   *
   * <code>optional int64 target_cpa_micros = 4;</code>
   * @return The targetCpaMicros.
   */
  long getTargetCpaMicros();

  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * This should only be set for portfolio bid strategies.
   * </pre>
   *
   * <code>optional int64 cpc_bid_ceiling_micros = 5;</code>
   * @return Whether the cpcBidCeilingMicros field is set.
   */
  boolean hasCpcBidCeilingMicros();
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * This should only be set for portfolio bid strategies.
   * </pre>
   *
   * <code>optional int64 cpc_bid_ceiling_micros = 5;</code>
   * @return The cpcBidCeilingMicros.
   */
  long getCpcBidCeilingMicros();

  /**
   * <pre>
   * Minimum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * This should only be set for portfolio bid strategies.
   * </pre>
   *
   * <code>optional int64 cpc_bid_floor_micros = 6;</code>
   * @return Whether the cpcBidFloorMicros field is set.
   */
  boolean hasCpcBidFloorMicros();
  /**
   * <pre>
   * Minimum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * This should only be set for portfolio bid strategies.
   * </pre>
   *
   * <code>optional int64 cpc_bid_floor_micros = 6;</code>
   * @return The cpcBidFloorMicros.
   */
  long getCpcBidFloorMicros();
}

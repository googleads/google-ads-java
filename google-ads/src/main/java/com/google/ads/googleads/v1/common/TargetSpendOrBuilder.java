// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/bidding.proto

package com.google.ads.googleads.v1.common;

public interface TargetSpendOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.common.TargetSpend)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The spend target under which to maximize clicks.
   * A TargetSpend bidder will attempt to spend the smaller of this value
   * or the natural throttling spend amount.
   * If not specified, the budget is used as the spend target.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value target_spend_micros = 1;</code>
   * @return Whether the targetSpendMicros field is set.
   */
  boolean hasTargetSpendMicros();
  /**
   * <pre>
   * The spend target under which to maximize clicks.
   * A TargetSpend bidder will attempt to spend the smaller of this value
   * or the natural throttling spend amount.
   * If not specified, the budget is used as the spend target.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value target_spend_micros = 1;</code>
   * @return The targetSpendMicros.
   */
  com.google.protobuf.Int64Value getTargetSpendMicros();
  /**
   * <pre>
   * The spend target under which to maximize clicks.
   * A TargetSpend bidder will attempt to spend the smaller of this value
   * or the natural throttling spend amount.
   * If not specified, the budget is used as the spend target.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value target_spend_micros = 1;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getTargetSpendMicrosOrBuilder();

  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 2;</code>
   * @return Whether the cpcBidCeilingMicros field is set.
   */
  boolean hasCpcBidCeilingMicros();
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 2;</code>
   * @return The cpcBidCeilingMicros.
   */
  com.google.protobuf.Int64Value getCpcBidCeilingMicros();
  /**
   * <pre>
   * Maximum bid limit that can be set by the bid strategy.
   * The limit applies to all keywords managed by the strategy.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cpc_bid_ceiling_micros = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCpcBidCeilingMicrosOrBuilder();
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/simulation.proto

package com.google.ads.googleads.v12.common;

public interface CpcBidSimulationPointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.common.CpcBidSimulationPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Projected required daily budget that the advertiser must set in order to
   * receive the estimated traffic, in micros of advertiser currency.
   * </pre>
   *
   * <code>int64 required_budget_amount_micros = 17;</code>
   * @return The requiredBudgetAmountMicros.
   */
  long getRequiredBudgetAmountMicros();

  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>optional double biddable_conversions = 9;</code>
   * @return Whether the biddableConversions field is set.
   */
  boolean hasBiddableConversions();
  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>optional double biddable_conversions = 9;</code>
   * @return The biddableConversions.
   */
  double getBiddableConversions();

  /**
   * <pre>
   * Projected total value of biddable conversions.
   * </pre>
   *
   * <code>optional double biddable_conversions_value = 10;</code>
   * @return Whether the biddableConversionsValue field is set.
   */
  boolean hasBiddableConversionsValue();
  /**
   * <pre>
   * Projected total value of biddable conversions.
   * </pre>
   *
   * <code>optional double biddable_conversions_value = 10;</code>
   * @return The biddableConversionsValue.
   */
  double getBiddableConversionsValue();

  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>optional int64 clicks = 11;</code>
   * @return Whether the clicks field is set.
   */
  boolean hasClicks();
  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>optional int64 clicks = 11;</code>
   * @return The clicks.
   */
  long getClicks();

  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>optional int64 cost_micros = 12;</code>
   * @return Whether the costMicros field is set.
   */
  boolean hasCostMicros();
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>optional int64 cost_micros = 12;</code>
   * @return The costMicros.
   */
  long getCostMicros();

  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>optional int64 impressions = 13;</code>
   * @return Whether the impressions field is set.
   */
  boolean hasImpressions();
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>optional int64 impressions = 13;</code>
   * @return The impressions.
   */
  long getImpressions();

  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>optional int64 top_slot_impressions = 14;</code>
   * @return Whether the topSlotImpressions field is set.
   */
  boolean hasTopSlotImpressions();
  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>optional int64 top_slot_impressions = 14;</code>
   * @return The topSlotImpressions.
   */
  long getTopSlotImpressions();

  /**
   * <pre>
   * The simulated CPC bid upon which projected metrics are based.
   * </pre>
   *
   * <code>int64 cpc_bid_micros = 15;</code>
   * @return Whether the cpcBidMicros field is set.
   */
  boolean hasCpcBidMicros();
  /**
   * <pre>
   * The simulated CPC bid upon which projected metrics are based.
   * </pre>
   *
   * <code>int64 cpc_bid_micros = 15;</code>
   * @return The cpcBidMicros.
   */
  long getCpcBidMicros();

  /**
   * <pre>
   * The simulated scaling modifier upon which projected metrics are based.
   * All CPC bids relevant to the simulated entity are scaled by this
   * modifier.
   * </pre>
   *
   * <code>double cpc_bid_scaling_modifier = 16;</code>
   * @return Whether the cpcBidScalingModifier field is set.
   */
  boolean hasCpcBidScalingModifier();
  /**
   * <pre>
   * The simulated scaling modifier upon which projected metrics are based.
   * All CPC bids relevant to the simulated entity are scaled by this
   * modifier.
   * </pre>
   *
   * <code>double cpc_bid_scaling_modifier = 16;</code>
   * @return The cpcBidScalingModifier.
   */
  double getCpcBidScalingModifier();

  com.google.ads.googleads.v12.common.CpcBidSimulationPoint.CpcSimulationKeyValueCase getCpcSimulationKeyValueCase();
}

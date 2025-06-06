// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/simulation.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.common;

public interface BudgetSimulationPointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.common.BudgetSimulationPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The simulated budget upon which projected metrics are based.
   * </pre>
   *
   * <code>int64 budget_amount_micros = 1;</code>
   * @return The budgetAmountMicros.
   */
  long getBudgetAmountMicros();

  /**
   * <pre>
   * Projected required daily cpc bid ceiling that the advertiser must set to
   * realize this simulation, in micros of the advertiser currency.
   * Only campaigns with the Target Spend bidding strategy support this field.
   * </pre>
   *
   * <code>int64 required_cpc_bid_ceiling_micros = 2;</code>
   * @return The requiredCpcBidCeilingMicros.
   */
  long getRequiredCpcBidCeilingMicros();

  /**
   * <pre>
   * Projected number of biddable conversions.
   * </pre>
   *
   * <code>double biddable_conversions = 3;</code>
   * @return The biddableConversions.
   */
  double getBiddableConversions();

  /**
   * <pre>
   * Projected total value of biddable conversions.
   * </pre>
   *
   * <code>double biddable_conversions_value = 4;</code>
   * @return The biddableConversionsValue.
   */
  double getBiddableConversionsValue();

  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>int64 clicks = 5;</code>
   * @return The clicks.
   */
  long getClicks();

  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>int64 cost_micros = 6;</code>
   * @return The costMicros.
   */
  long getCostMicros();

  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>int64 impressions = 7;</code>
   * @return The impressions.
   */
  long getImpressions();

  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>int64 top_slot_impressions = 8;</code>
   * @return The topSlotImpressions.
   */
  long getTopSlotImpressions();

  /**
   * <pre>
   * Projected number of interactions.
   * Only discovery advertising channel type supports this field.
   * </pre>
   *
   * <code>int64 interactions = 9;</code>
   * @return The interactions.
   */
  long getInteractions();
}

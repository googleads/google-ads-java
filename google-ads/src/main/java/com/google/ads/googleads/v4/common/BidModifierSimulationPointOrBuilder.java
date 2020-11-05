// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/common/simulation.proto

package com.google.ads.googleads.v4.common;

public interface BidModifierSimulationPointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v4.common.BidModifierSimulationPoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The simulated bid modifier upon which projected metrics are based.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue bid_modifier = 1;</code>
   * @return Whether the bidModifier field is set.
   */
  boolean hasBidModifier();
  /**
   * <pre>
   * The simulated bid modifier upon which projected metrics are based.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue bid_modifier = 1;</code>
   * @return The bidModifier.
   */
  com.google.protobuf.DoubleValue getBidModifier();
  /**
   * <pre>
   * The simulated bid modifier upon which projected metrics are based.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue bid_modifier = 1;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getBidModifierOrBuilder();

  /**
   * <pre>
   * Projected number of biddable conversions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions = 2;</code>
   * @return Whether the biddableConversions field is set.
   */
  boolean hasBiddableConversions();
  /**
   * <pre>
   * Projected number of biddable conversions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions = 2;</code>
   * @return The biddableConversions.
   */
  com.google.protobuf.DoubleValue getBiddableConversions();
  /**
   * <pre>
   * Projected number of biddable conversions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions = 2;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getBiddableConversionsOrBuilder();

  /**
   * <pre>
   * Projected total value of biddable conversions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions_value = 3;</code>
   * @return Whether the biddableConversionsValue field is set.
   */
  boolean hasBiddableConversionsValue();
  /**
   * <pre>
   * Projected total value of biddable conversions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions_value = 3;</code>
   * @return The biddableConversionsValue.
   */
  com.google.protobuf.DoubleValue getBiddableConversionsValue();
  /**
   * <pre>
   * Projected total value of biddable conversions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue biddable_conversions_value = 3;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getBiddableConversionsValueOrBuilder();

  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value clicks = 4;</code>
   * @return Whether the clicks field is set.
   */
  boolean hasClicks();
  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value clicks = 4;</code>
   * @return The clicks.
   */
  com.google.protobuf.Int64Value getClicks();
  /**
   * <pre>
   * Projected number of clicks.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value clicks = 4;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getClicksOrBuilder();

  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cost_micros = 5;</code>
   * @return Whether the costMicros field is set.
   */
  boolean hasCostMicros();
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cost_micros = 5;</code>
   * @return The costMicros.
   */
  com.google.protobuf.Int64Value getCostMicros();
  /**
   * <pre>
   * Projected cost in micros.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value cost_micros = 5;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCostMicrosOrBuilder();

  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value impressions = 6;</code>
   * @return Whether the impressions field is set.
   */
  boolean hasImpressions();
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value impressions = 6;</code>
   * @return The impressions.
   */
  com.google.protobuf.Int64Value getImpressions();
  /**
   * <pre>
   * Projected number of impressions.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value impressions = 6;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getImpressionsOrBuilder();

  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value top_slot_impressions = 7;</code>
   * @return Whether the topSlotImpressions field is set.
   */
  boolean hasTopSlotImpressions();
  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value top_slot_impressions = 7;</code>
   * @return The topSlotImpressions.
   */
  com.google.protobuf.Int64Value getTopSlotImpressions();
  /**
   * <pre>
   * Projected number of top slot impressions.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value top_slot_impressions = 7;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getTopSlotImpressionsOrBuilder();

  /**
   * <pre>
   * Projected number of biddable conversions for the parent resource.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue parent_biddable_conversions = 8;</code>
   * @return Whether the parentBiddableConversions field is set.
   */
  boolean hasParentBiddableConversions();
  /**
   * <pre>
   * Projected number of biddable conversions for the parent resource.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue parent_biddable_conversions = 8;</code>
   * @return The parentBiddableConversions.
   */
  com.google.protobuf.DoubleValue getParentBiddableConversions();
  /**
   * <pre>
   * Projected number of biddable conversions for the parent resource.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue parent_biddable_conversions = 8;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getParentBiddableConversionsOrBuilder();

  /**
   * <pre>
   * Projected total value of biddable conversions for the parent resource.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue parent_biddable_conversions_value = 9;</code>
   * @return Whether the parentBiddableConversionsValue field is set.
   */
  boolean hasParentBiddableConversionsValue();
  /**
   * <pre>
   * Projected total value of biddable conversions for the parent resource.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue parent_biddable_conversions_value = 9;</code>
   * @return The parentBiddableConversionsValue.
   */
  com.google.protobuf.DoubleValue getParentBiddableConversionsValue();
  /**
   * <pre>
   * Projected total value of biddable conversions for the parent resource.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue parent_biddable_conversions_value = 9;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getParentBiddableConversionsValueOrBuilder();

  /**
   * <pre>
   * Projected number of clicks for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_clicks = 10;</code>
   * @return Whether the parentClicks field is set.
   */
  boolean hasParentClicks();
  /**
   * <pre>
   * Projected number of clicks for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_clicks = 10;</code>
   * @return The parentClicks.
   */
  com.google.protobuf.Int64Value getParentClicks();
  /**
   * <pre>
   * Projected number of clicks for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_clicks = 10;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getParentClicksOrBuilder();

  /**
   * <pre>
   * Projected cost in micros for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_cost_micros = 11;</code>
   * @return Whether the parentCostMicros field is set.
   */
  boolean hasParentCostMicros();
  /**
   * <pre>
   * Projected cost in micros for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_cost_micros = 11;</code>
   * @return The parentCostMicros.
   */
  com.google.protobuf.Int64Value getParentCostMicros();
  /**
   * <pre>
   * Projected cost in micros for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_cost_micros = 11;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getParentCostMicrosOrBuilder();

  /**
   * <pre>
   * Projected number of impressions for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_impressions = 12;</code>
   * @return Whether the parentImpressions field is set.
   */
  boolean hasParentImpressions();
  /**
   * <pre>
   * Projected number of impressions for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_impressions = 12;</code>
   * @return The parentImpressions.
   */
  com.google.protobuf.Int64Value getParentImpressions();
  /**
   * <pre>
   * Projected number of impressions for the parent resource.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_impressions = 12;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getParentImpressionsOrBuilder();

  /**
   * <pre>
   * Projected number of top slot impressions for the parent resource.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_top_slot_impressions = 13;</code>
   * @return Whether the parentTopSlotImpressions field is set.
   */
  boolean hasParentTopSlotImpressions();
  /**
   * <pre>
   * Projected number of top slot impressions for the parent resource.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_top_slot_impressions = 13;</code>
   * @return The parentTopSlotImpressions.
   */
  com.google.protobuf.Int64Value getParentTopSlotImpressions();
  /**
   * <pre>
   * Projected number of top slot impressions for the parent resource.
   * Only search advertising channel type supports this field.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_top_slot_impressions = 13;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getParentTopSlotImpressionsOrBuilder();

  /**
   * <pre>
   * Projected minimum daily budget that must be available to the parent
   * resource to realize this simulation.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_required_budget_micros = 14;</code>
   * @return Whether the parentRequiredBudgetMicros field is set.
   */
  boolean hasParentRequiredBudgetMicros();
  /**
   * <pre>
   * Projected minimum daily budget that must be available to the parent
   * resource to realize this simulation.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_required_budget_micros = 14;</code>
   * @return The parentRequiredBudgetMicros.
   */
  com.google.protobuf.Int64Value getParentRequiredBudgetMicros();
  /**
   * <pre>
   * Projected minimum daily budget that must be available to the parent
   * resource to realize this simulation.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_required_budget_micros = 14;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getParentRequiredBudgetMicrosOrBuilder();
}

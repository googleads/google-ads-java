// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/bidding_strategy_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.services;

public interface MutateBiddingStrategyResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.MutateBiddingStrategyResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The mutated bidding strategy with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.BiddingStrategy bidding_strategy = 2;</code>
   * @return Whether the biddingStrategy field is set.
   */
  boolean hasBiddingStrategy();
  /**
   * <pre>
   * The mutated bidding strategy with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.BiddingStrategy bidding_strategy = 2;</code>
   * @return The biddingStrategy.
   */
  com.google.ads.googleads.v18.resources.BiddingStrategy getBiddingStrategy();
  /**
   * <pre>
   * The mutated bidding strategy with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v18.resources.BiddingStrategy bidding_strategy = 2;</code>
   */
  com.google.ads.googleads.v18.resources.BiddingStrategyOrBuilder getBiddingStrategyOrBuilder();
}

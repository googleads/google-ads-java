// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/common/criteria.proto

package com.google.ads.googleads.v5.common;

public interface ProductConditionInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.common.ProductConditionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Value of the condition.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.ProductConditionEnum.ProductCondition condition = 1;</code>
   * @return The enum numeric value on the wire for condition.
   */
  int getConditionValue();
  /**
   * <pre>
   * Value of the condition.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.ProductConditionEnum.ProductCondition condition = 1;</code>
   * @return The condition.
   */
  com.google.ads.googleads.v5.enums.ProductConditionEnum.ProductCondition getCondition();
}

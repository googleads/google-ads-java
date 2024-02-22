// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/user_lists.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.common;

public interface UserListNumberRuleItemInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.common.UserListNumberRuleItemInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Number comparison operator.
   * This field is required and must be populated when creating a new number
   * rule item.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator operator = 1;</code>
   * @return The enum numeric value on the wire for operator.
   */
  int getOperatorValue();
  /**
   * <pre>
   * Number comparison operator.
   * This field is required and must be populated when creating a new number
   * rule item.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator operator = 1;</code>
   * @return The operator.
   */
  com.google.ads.googleads.v16.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator getOperator();

  /**
   * <pre>
   * Number value to be compared with the variable.
   * This field is required and must be populated when creating a new number
   * rule item.
   * </pre>
   *
   * <code>optional double value = 3;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * Number value to be compared with the variable.
   * This field is required and must be populated when creating a new number
   * rule item.
   * </pre>
   *
   * <code>optional double value = 3;</code>
   * @return The value.
   */
  double getValue();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/targeting_setting.proto

package com.google.ads.googleads.v14.common;

public interface TargetingSettingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.common.TargetingSetting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The per-targeting-dimension setting to restrict the reach of your campaign
   * or ad group.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.TargetRestriction target_restrictions = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v14.common.TargetRestriction> 
      getTargetRestrictionsList();
  /**
   * <pre>
   * The per-targeting-dimension setting to restrict the reach of your campaign
   * or ad group.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.TargetRestriction target_restrictions = 1;</code>
   */
  com.google.ads.googleads.v14.common.TargetRestriction getTargetRestrictions(int index);
  /**
   * <pre>
   * The per-targeting-dimension setting to restrict the reach of your campaign
   * or ad group.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.TargetRestriction target_restrictions = 1;</code>
   */
  int getTargetRestrictionsCount();
  /**
   * <pre>
   * The per-targeting-dimension setting to restrict the reach of your campaign
   * or ad group.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.TargetRestriction target_restrictions = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v14.common.TargetRestrictionOrBuilder> 
      getTargetRestrictionsOrBuilderList();
  /**
   * <pre>
   * The per-targeting-dimension setting to restrict the reach of your campaign
   * or ad group.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.TargetRestriction target_restrictions = 1;</code>
   */
  com.google.ads.googleads.v14.common.TargetRestrictionOrBuilder getTargetRestrictionsOrBuilder(
      int index);

  /**
   * <pre>
   * The list of operations changing the target restrictions.
   *
   * Adding a target restriction with a targeting dimension that already exists
   * causes the existing target restriction to be replaced with the new value.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.TargetRestrictionOperation target_restriction_operations = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v14.common.TargetRestrictionOperation> 
      getTargetRestrictionOperationsList();
  /**
   * <pre>
   * The list of operations changing the target restrictions.
   *
   * Adding a target restriction with a targeting dimension that already exists
   * causes the existing target restriction to be replaced with the new value.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.TargetRestrictionOperation target_restriction_operations = 2;</code>
   */
  com.google.ads.googleads.v14.common.TargetRestrictionOperation getTargetRestrictionOperations(int index);
  /**
   * <pre>
   * The list of operations changing the target restrictions.
   *
   * Adding a target restriction with a targeting dimension that already exists
   * causes the existing target restriction to be replaced with the new value.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.TargetRestrictionOperation target_restriction_operations = 2;</code>
   */
  int getTargetRestrictionOperationsCount();
  /**
   * <pre>
   * The list of operations changing the target restrictions.
   *
   * Adding a target restriction with a targeting dimension that already exists
   * causes the existing target restriction to be replaced with the new value.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.TargetRestrictionOperation target_restriction_operations = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v14.common.TargetRestrictionOperationOrBuilder> 
      getTargetRestrictionOperationsOrBuilderList();
  /**
   * <pre>
   * The list of operations changing the target restrictions.
   *
   * Adding a target restriction with a targeting dimension that already exists
   * causes the existing target restriction to be replaced with the new value.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.TargetRestrictionOperation target_restriction_operations = 2;</code>
   */
  com.google.ads.googleads.v14.common.TargetRestrictionOperationOrBuilder getTargetRestrictionOperationsOrBuilder(
      int index);
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/criteria.proto

package com.google.ads.googleads.v2.common;

public interface ListingGroupInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.common.ListingGroupInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of the listing group.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.ListingGroupTypeEnum.ListingGroupType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Type of the listing group.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.ListingGroupTypeEnum.ListingGroupType type = 1;</code>
   * @return The type.
   */
  com.google.ads.googleads.v2.enums.ListingGroupTypeEnum.ListingGroupType getType();

  /**
   * <pre>
   * Dimension value with which this listing group is refining its parent.
   * Undefined for the root group.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.ListingDimensionInfo case_value = 2;</code>
   * @return Whether the caseValue field is set.
   */
  boolean hasCaseValue();
  /**
   * <pre>
   * Dimension value with which this listing group is refining its parent.
   * Undefined for the root group.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.ListingDimensionInfo case_value = 2;</code>
   * @return The caseValue.
   */
  com.google.ads.googleads.v2.common.ListingDimensionInfo getCaseValue();
  /**
   * <pre>
   * Dimension value with which this listing group is refining its parent.
   * Undefined for the root group.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.common.ListingDimensionInfo case_value = 2;</code>
   */
  com.google.ads.googleads.v2.common.ListingDimensionInfoOrBuilder getCaseValueOrBuilder();

  /**
   * <pre>
   * Resource name of ad group criterion which is the parent listing group
   * subdivision. Null for the root group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue parent_ad_group_criterion = 3;</code>
   * @return Whether the parentAdGroupCriterion field is set.
   */
  boolean hasParentAdGroupCriterion();
  /**
   * <pre>
   * Resource name of ad group criterion which is the parent listing group
   * subdivision. Null for the root group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue parent_ad_group_criterion = 3;</code>
   * @return The parentAdGroupCriterion.
   */
  com.google.protobuf.StringValue getParentAdGroupCriterion();
  /**
   * <pre>
   * Resource name of ad group criterion which is the parent listing group
   * subdivision. Null for the root group.
   * </pre>
   *
   * <code>.google.protobuf.StringValue parent_ad_group_criterion = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getParentAdGroupCriterionOrBuilder();
}

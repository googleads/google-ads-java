// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/custom_interest.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.resources;

public interface CustomInterestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.resources.CustomInterest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the custom interest.
   * Custom interest resource names have the form:
   *
   * `customers/{customer_id}/customInterests/{custom_interest_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the custom interest.
   * Custom interest resource names have the form:
   *
   * `customers/{customer_id}/customInterests/{custom_interest_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. Id of the custom interest.
   * </pre>
   *
   * <code>optional int64 id = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. Id of the custom interest.
   * </pre>
   *
   * <code>optional int64 id = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Status of this custom interest. Indicates whether the custom interest is
   * enabled or removed.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.CustomInterestStatusEnum.CustomInterestStatus status = 3;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Status of this custom interest. Indicates whether the custom interest is
   * enabled or removed.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.CustomInterestStatusEnum.CustomInterestStatus status = 3;</code>
   * @return The status.
   */
  com.google.ads.googleads.v16.enums.CustomInterestStatusEnum.CustomInterestStatus getStatus();

  /**
   * <pre>
   * Name of the custom interest. It should be unique across the same custom
   * affinity audience.
   * This field is required for create operations.
   * </pre>
   *
   * <code>optional string name = 9;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Name of the custom interest. It should be unique across the same custom
   * affinity audience.
   * This field is required for create operations.
   * </pre>
   *
   * <code>optional string name = 9;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the custom interest. It should be unique across the same custom
   * affinity audience.
   * This field is required for create operations.
   * </pre>
   *
   * <code>optional string name = 9;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Type of the custom interest, CUSTOM_AFFINITY or CUSTOM_INTENT.
   * By default the type is set to CUSTOM_AFFINITY.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.CustomInterestTypeEnum.CustomInterestType type = 5;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Type of the custom interest, CUSTOM_AFFINITY or CUSTOM_INTENT.
   * By default the type is set to CUSTOM_AFFINITY.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.CustomInterestTypeEnum.CustomInterestType type = 5;</code>
   * @return The type.
   */
  com.google.ads.googleads.v16.enums.CustomInterestTypeEnum.CustomInterestType getType();

  /**
   * <pre>
   * Description of this custom interest audience.
   * </pre>
   *
   * <code>optional string description = 10;</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <pre>
   * Description of this custom interest audience.
   * </pre>
   *
   * <code>optional string description = 10;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of this custom interest audience.
   * </pre>
   *
   * <code>optional string description = 10;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * List of custom interest members that this custom interest is composed of.
   * Members can be added during CustomInterest creation. If members are
   * presented in UPDATE operation, existing members will be overridden.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.resources.CustomInterestMember members = 7;</code>
   */
  java.util.List<com.google.ads.googleads.v16.resources.CustomInterestMember> 
      getMembersList();
  /**
   * <pre>
   * List of custom interest members that this custom interest is composed of.
   * Members can be added during CustomInterest creation. If members are
   * presented in UPDATE operation, existing members will be overridden.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.resources.CustomInterestMember members = 7;</code>
   */
  com.google.ads.googleads.v16.resources.CustomInterestMember getMembers(int index);
  /**
   * <pre>
   * List of custom interest members that this custom interest is composed of.
   * Members can be added during CustomInterest creation. If members are
   * presented in UPDATE operation, existing members will be overridden.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.resources.CustomInterestMember members = 7;</code>
   */
  int getMembersCount();
  /**
   * <pre>
   * List of custom interest members that this custom interest is composed of.
   * Members can be added during CustomInterest creation. If members are
   * presented in UPDATE operation, existing members will be overridden.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.resources.CustomInterestMember members = 7;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v16.resources.CustomInterestMemberOrBuilder> 
      getMembersOrBuilderList();
  /**
   * <pre>
   * List of custom interest members that this custom interest is composed of.
   * Members can be added during CustomInterest creation. If members are
   * presented in UPDATE operation, existing members will be overridden.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.resources.CustomInterestMember members = 7;</code>
   */
  com.google.ads.googleads.v16.resources.CustomInterestMemberOrBuilder getMembersOrBuilder(
      int index);
}

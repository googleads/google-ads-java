// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/custom_audience.proto

package com.google.ads.googleads.v12.resources;

public interface CustomAudienceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.resources.CustomAudience)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the custom audience.
   * Custom audience resource names have the form:
   *
   * `customers/{customer_id}/customAudiences/{custom_audience_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the custom audience.
   * Custom audience resource names have the form:
   *
   * `customers/{customer_id}/customAudiences/{custom_audience_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. ID of the custom audience.
   * </pre>
   *
   * <code>int64 id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. Status of this custom audience. Indicates whether the custom
   * audience is enabled or removed.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.CustomAudienceStatusEnum.CustomAudienceStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. Status of this custom audience. Indicates whether the custom
   * audience is enabled or removed.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.CustomAudienceStatusEnum.CustomAudienceStatus status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v12.enums.CustomAudienceStatusEnum.CustomAudienceStatus getStatus();

  /**
   * <pre>
   * Name of the custom audience. It should be unique for all custom audiences
   * created by a customer.
   * This field is required for creating operations.
   * </pre>
   *
   * <code>string name = 4;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Name of the custom audience. It should be unique for all custom audiences
   * created by a customer.
   * This field is required for creating operations.
   * </pre>
   *
   * <code>string name = 4;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Type of the custom audience.
   * ("INTEREST" OR "PURCHASE_INTENT" is not allowed for newly created custom
   * audience but kept for existing audiences)
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.CustomAudienceTypeEnum.CustomAudienceType type = 5;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Type of the custom audience.
   * ("INTEREST" OR "PURCHASE_INTENT" is not allowed for newly created custom
   * audience but kept for existing audiences)
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.CustomAudienceTypeEnum.CustomAudienceType type = 5;</code>
   * @return The type.
   */
  com.google.ads.googleads.v12.enums.CustomAudienceTypeEnum.CustomAudienceType getType();

  /**
   * <pre>
   * Description of this custom audience.
   * </pre>
   *
   * <code>string description = 6;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of this custom audience.
   * </pre>
   *
   * <code>string description = 6;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * List of custom audience members that this custom audience is composed of.
   * Members can be added during CustomAudience creation. If members are
   * presented in UPDATE operation, existing members will be overridden.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.resources.CustomAudienceMember members = 7;</code>
   */
  java.util.List<com.google.ads.googleads.v12.resources.CustomAudienceMember> 
      getMembersList();
  /**
   * <pre>
   * List of custom audience members that this custom audience is composed of.
   * Members can be added during CustomAudience creation. If members are
   * presented in UPDATE operation, existing members will be overridden.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.resources.CustomAudienceMember members = 7;</code>
   */
  com.google.ads.googleads.v12.resources.CustomAudienceMember getMembers(int index);
  /**
   * <pre>
   * List of custom audience members that this custom audience is composed of.
   * Members can be added during CustomAudience creation. If members are
   * presented in UPDATE operation, existing members will be overridden.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.resources.CustomAudienceMember members = 7;</code>
   */
  int getMembersCount();
  /**
   * <pre>
   * List of custom audience members that this custom audience is composed of.
   * Members can be added during CustomAudience creation. If members are
   * presented in UPDATE operation, existing members will be overridden.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.resources.CustomAudienceMember members = 7;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v12.resources.CustomAudienceMemberOrBuilder> 
      getMembersOrBuilderList();
  /**
   * <pre>
   * List of custom audience members that this custom audience is composed of.
   * Members can be added during CustomAudience creation. If members are
   * presented in UPDATE operation, existing members will be overridden.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.resources.CustomAudienceMember members = 7;</code>
   */
  com.google.ads.googleads.v12.resources.CustomAudienceMemberOrBuilder getMembersOrBuilder(
      int index);
}

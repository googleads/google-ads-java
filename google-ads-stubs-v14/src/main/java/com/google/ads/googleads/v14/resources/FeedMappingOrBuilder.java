// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/feed_mapping.proto

package com.google.ads.googleads.v14.resources;

public interface FeedMappingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.resources.FeedMapping)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the feed mapping.
   * Feed mapping resource names have the form:
   *
   * `customers/{customer_id}/feedMappings/{feed_id}~{feed_mapping_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the feed mapping.
   * Feed mapping resource names have the form:
   *
   * `customers/{customer_id}/feedMappings/{feed_id}~{feed_mapping_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The feed of this feed mapping.
   * </pre>
   *
   * <code>optional string feed = 7 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the feed field is set.
   */
  boolean hasFeed();
  /**
   * <pre>
   * Immutable. The feed of this feed mapping.
   * </pre>
   *
   * <code>optional string feed = 7 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The feed.
   */
  java.lang.String getFeed();
  /**
   * <pre>
   * Immutable. The feed of this feed mapping.
   * </pre>
   *
   * <code>optional string feed = 7 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for feed.
   */
  com.google.protobuf.ByteString
      getFeedBytes();

  /**
   * <pre>
   * Immutable. Feed attributes to field mappings. These mappings are a
   * one-to-many relationship meaning that 1 feed attribute can be used to
   * populate multiple placeholder fields, but 1 placeholder field can only draw
   * data from 1 feed attribute. Ad Customizer is an exception, 1 placeholder
   * field can be mapped to multiple feed attributes. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.AttributeFieldMapping attribute_field_mappings = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  java.util.List<com.google.ads.googleads.v14.resources.AttributeFieldMapping> 
      getAttributeFieldMappingsList();
  /**
   * <pre>
   * Immutable. Feed attributes to field mappings. These mappings are a
   * one-to-many relationship meaning that 1 feed attribute can be used to
   * populate multiple placeholder fields, but 1 placeholder field can only draw
   * data from 1 feed attribute. Ad Customizer is an exception, 1 placeholder
   * field can be mapped to multiple feed attributes. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.AttributeFieldMapping attribute_field_mappings = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v14.resources.AttributeFieldMapping getAttributeFieldMappings(int index);
  /**
   * <pre>
   * Immutable. Feed attributes to field mappings. These mappings are a
   * one-to-many relationship meaning that 1 feed attribute can be used to
   * populate multiple placeholder fields, but 1 placeholder field can only draw
   * data from 1 feed attribute. Ad Customizer is an exception, 1 placeholder
   * field can be mapped to multiple feed attributes. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.AttributeFieldMapping attribute_field_mappings = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  int getAttributeFieldMappingsCount();
  /**
   * <pre>
   * Immutable. Feed attributes to field mappings. These mappings are a
   * one-to-many relationship meaning that 1 feed attribute can be used to
   * populate multiple placeholder fields, but 1 placeholder field can only draw
   * data from 1 feed attribute. Ad Customizer is an exception, 1 placeholder
   * field can be mapped to multiple feed attributes. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.AttributeFieldMapping attribute_field_mappings = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v14.resources.AttributeFieldMappingOrBuilder> 
      getAttributeFieldMappingsOrBuilderList();
  /**
   * <pre>
   * Immutable. Feed attributes to field mappings. These mappings are a
   * one-to-many relationship meaning that 1 feed attribute can be used to
   * populate multiple placeholder fields, but 1 placeholder field can only draw
   * data from 1 feed attribute. Ad Customizer is an exception, 1 placeholder
   * field can be mapped to multiple feed attributes. Required.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.resources.AttributeFieldMapping attribute_field_mappings = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v14.resources.AttributeFieldMappingOrBuilder getAttributeFieldMappingsOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. Status of the feed mapping.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.FeedMappingStatusEnum.FeedMappingStatus status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. Status of the feed mapping.
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.FeedMappingStatusEnum.FeedMappingStatus status = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v14.enums.FeedMappingStatusEnum.FeedMappingStatus getStatus();

  /**
   * <pre>
   * Immutable. The placeholder type of this mapping (for example, if the
   * mapping maps feed attributes to placeholder fields).
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.PlaceholderTypeEnum.PlaceholderType placeholder_type = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the placeholderType field is set.
   */
  boolean hasPlaceholderType();
  /**
   * <pre>
   * Immutable. The placeholder type of this mapping (for example, if the
   * mapping maps feed attributes to placeholder fields).
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.PlaceholderTypeEnum.PlaceholderType placeholder_type = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for placeholderType.
   */
  int getPlaceholderTypeValue();
  /**
   * <pre>
   * Immutable. The placeholder type of this mapping (for example, if the
   * mapping maps feed attributes to placeholder fields).
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.PlaceholderTypeEnum.PlaceholderType placeholder_type = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The placeholderType.
   */
  com.google.ads.googleads.v14.enums.PlaceholderTypeEnum.PlaceholderType getPlaceholderType();

  /**
   * <pre>
   * Immutable. The criterion type of this mapping (for example, if the
   * mapping maps feed attributes to criterion fields).
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.FeedMappingCriterionTypeEnum.FeedMappingCriterionType criterion_type = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the criterionType field is set.
   */
  boolean hasCriterionType();
  /**
   * <pre>
   * Immutable. The criterion type of this mapping (for example, if the
   * mapping maps feed attributes to criterion fields).
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.FeedMappingCriterionTypeEnum.FeedMappingCriterionType criterion_type = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for criterionType.
   */
  int getCriterionTypeValue();
  /**
   * <pre>
   * Immutable. The criterion type of this mapping (for example, if the
   * mapping maps feed attributes to criterion fields).
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.FeedMappingCriterionTypeEnum.FeedMappingCriterionType criterion_type = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The criterionType.
   */
  com.google.ads.googleads.v14.enums.FeedMappingCriterionTypeEnum.FeedMappingCriterionType getCriterionType();

  com.google.ads.googleads.v14.resources.FeedMapping.TargetCase getTargetCase();
}

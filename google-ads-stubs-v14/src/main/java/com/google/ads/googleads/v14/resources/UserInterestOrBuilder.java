// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/user_interest.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.resources;

public interface UserInterestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.resources.UserInterest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the user interest.
   * User interest resource names have the form:
   *
   * `customers/{customer_id}/userInterests/{user_interest_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the user interest.
   * User interest resource names have the form:
   *
   * `customers/{customer_id}/userInterests/{user_interest_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. Taxonomy type of the user interest.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.UserInterestTaxonomyTypeEnum.UserInterestTaxonomyType taxonomy_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for taxonomyType.
   */
  int getTaxonomyTypeValue();
  /**
   * <pre>
   * Output only. Taxonomy type of the user interest.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.UserInterestTaxonomyTypeEnum.UserInterestTaxonomyType taxonomy_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The taxonomyType.
   */
  com.google.ads.googleads.v14.enums.UserInterestTaxonomyTypeEnum.UserInterestTaxonomyType getTaxonomyType();

  /**
   * <pre>
   * Output only. The ID of the user interest.
   * </pre>
   *
   * <code>optional int64 user_interest_id = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the userInterestId field is set.
   */
  boolean hasUserInterestId();
  /**
   * <pre>
   * Output only. The ID of the user interest.
   * </pre>
   *
   * <code>optional int64 user_interest_id = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The userInterestId.
   */
  long getUserInterestId();

  /**
   * <pre>
   * Output only. The name of the user interest.
   * </pre>
   *
   * <code>optional string name = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Output only. The name of the user interest.
   * </pre>
   *
   * <code>optional string name = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The name of the user interest.
   * </pre>
   *
   * <code>optional string name = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The parent of the user interest.
   * </pre>
   *
   * <code>optional string user_interest_parent = 10 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the userInterestParent field is set.
   */
  boolean hasUserInterestParent();
  /**
   * <pre>
   * Output only. The parent of the user interest.
   * </pre>
   *
   * <code>optional string user_interest_parent = 10 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The userInterestParent.
   */
  java.lang.String getUserInterestParent();
  /**
   * <pre>
   * Output only. The parent of the user interest.
   * </pre>
   *
   * <code>optional string user_interest_parent = 10 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for userInterestParent.
   */
  com.google.protobuf.ByteString
      getUserInterestParentBytes();

  /**
   * <pre>
   * Output only. True if the user interest is launched to all channels and
   * locales.
   * </pre>
   *
   * <code>optional bool launched_to_all = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the launchedToAll field is set.
   */
  boolean hasLaunchedToAll();
  /**
   * <pre>
   * Output only. True if the user interest is launched to all channels and
   * locales.
   * </pre>
   *
   * <code>optional bool launched_to_all = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The launchedToAll.
   */
  boolean getLaunchedToAll();

  /**
   * <pre>
   * Output only. Availability information of the user interest.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.CriterionCategoryAvailability availabilities = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v14.common.CriterionCategoryAvailability> 
      getAvailabilitiesList();
  /**
   * <pre>
   * Output only. Availability information of the user interest.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.CriterionCategoryAvailability availabilities = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v14.common.CriterionCategoryAvailability getAvailabilities(int index);
  /**
   * <pre>
   * Output only. Availability information of the user interest.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.CriterionCategoryAvailability availabilities = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getAvailabilitiesCount();
  /**
   * <pre>
   * Output only. Availability information of the user interest.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.CriterionCategoryAvailability availabilities = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v14.common.CriterionCategoryAvailabilityOrBuilder> 
      getAvailabilitiesOrBuilderList();
  /**
   * <pre>
   * Output only. Availability information of the user interest.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.CriterionCategoryAvailability availabilities = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v14.common.CriterionCategoryAvailabilityOrBuilder getAvailabilitiesOrBuilder(
      int index);
}

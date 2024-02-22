// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/ad_group_criterion_label.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.resources;

public interface AdGroupCriterionLabelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.resources.AdGroupCriterionLabel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the ad group criterion label.
   * Ad group criterion label resource names have the form:
   * `customers/{customer_id}/adGroupCriterionLabels/{ad_group_id}~{criterion_id}~{label_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the ad group criterion label.
   * Ad group criterion label resource names have the form:
   * `customers/{customer_id}/adGroupCriterionLabels/{ad_group_id}~{criterion_id}~{label_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The ad group criterion to which the label is attached.
   * </pre>
   *
   * <code>optional string ad_group_criterion = 4 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the adGroupCriterion field is set.
   */
  boolean hasAdGroupCriterion();
  /**
   * <pre>
   * Immutable. The ad group criterion to which the label is attached.
   * </pre>
   *
   * <code>optional string ad_group_criterion = 4 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroupCriterion.
   */
  java.lang.String getAdGroupCriterion();
  /**
   * <pre>
   * Immutable. The ad group criterion to which the label is attached.
   * </pre>
   *
   * <code>optional string ad_group_criterion = 4 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for adGroupCriterion.
   */
  com.google.protobuf.ByteString
      getAdGroupCriterionBytes();

  /**
   * <pre>
   * Immutable. The label assigned to the ad group criterion.
   * </pre>
   *
   * <code>optional string label = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the label field is set.
   */
  boolean hasLabel();
  /**
   * <pre>
   * Immutable. The label assigned to the ad group criterion.
   * </pre>
   *
   * <code>optional string label = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   * <pre>
   * Immutable. The label assigned to the ad group criterion.
   * </pre>
   *
   * <code>optional string label = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/ad_group_criterion_label_service.proto

package com.google.ads.googleads.v13.services;

public interface AdGroupCriterionLabelOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v13.services.AdGroupCriterionLabelOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group
   * label.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.resources.AdGroupCriterionLabel create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group
   * label.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.resources.AdGroupCriterionLabel create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v13.resources.AdGroupCriterionLabel getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new ad group
   * label.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.resources.AdGroupCriterionLabel create = 1;</code>
   */
  com.google.ads.googleads.v13.resources.AdGroupCriterionLabelOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the ad group criterion label
   * being removed, in this format:
   *
   * `customers/{customer_id}/adGroupCriterionLabels/{ad_group_id}~{criterion_id}~{label_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the ad group criterion label
   * being removed, in this format:
   *
   * `customers/{customer_id}/adGroupCriterionLabels/{ad_group_id}~{criterion_id}~{label_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the ad group criterion label
   * being removed, in this format:
   *
   * `customers/{customer_id}/adGroupCriterionLabels/{ad_group_id}~{criterion_id}~{label_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  com.google.ads.googleads.v13.services.AdGroupCriterionLabelOperation.OperationCase getOperationCase();
}

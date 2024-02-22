// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/asset.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.resources;

public interface AssetFieldTypePolicySummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.resources.AssetFieldTypePolicySummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. FieldType of this asset.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the assetFieldType field is set.
   */
  boolean hasAssetFieldType();
  /**
   * <pre>
   * Output only. FieldType of this asset.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for assetFieldType.
   */
  int getAssetFieldTypeValue();
  /**
   * <pre>
   * Output only. FieldType of this asset.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The assetFieldType.
   */
  com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType getAssetFieldType();

  /**
   * <pre>
   * Output only. Source of this asset.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource asset_source = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the assetSource field is set.
   */
  boolean hasAssetSource();
  /**
   * <pre>
   * Output only. Source of this asset.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource asset_source = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for assetSource.
   */
  int getAssetSourceValue();
  /**
   * <pre>
   * Output only. Source of this asset.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource asset_source = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The assetSource.
   */
  com.google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource getAssetSource();

  /**
   * <pre>
   * Output only. Policy summary.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.resources.AssetPolicySummary policy_summary_info = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the policySummaryInfo field is set.
   */
  boolean hasPolicySummaryInfo();
  /**
   * <pre>
   * Output only. Policy summary.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.resources.AssetPolicySummary policy_summary_info = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The policySummaryInfo.
   */
  com.google.ads.googleads.v16.resources.AssetPolicySummary getPolicySummaryInfo();
  /**
   * <pre>
   * Output only. Policy summary.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.resources.AssetPolicySummary policy_summary_info = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v16.resources.AssetPolicySummaryOrBuilder getPolicySummaryInfoOrBuilder();
}

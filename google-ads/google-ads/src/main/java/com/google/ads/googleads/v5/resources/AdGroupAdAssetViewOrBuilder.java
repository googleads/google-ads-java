// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/ad_group_ad_asset_view.proto

package com.google.ads.googleads.v5.resources;

public interface AdGroupAdAssetViewOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.resources.AdGroupAdAssetView)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the ad group ad asset view.
   * Ad group ad asset view resource names have the form (Before V4):
   * `customers/{customer_id}/adGroupAdAssets/{AdGroupAdAsset.ad_group_id}~{AdGroupAdAsset.ad.ad_id}~{AdGroupAdAsset.asset_id}~{AdGroupAdAsset.field_type}`
   * Ad group ad asset view resource names have the form (Beginning from V4):
   * `customers/{customer_id}/adGroupAdAssetViews/{AdGroupAdAsset.ad_group_id}~{AdGroupAdAsset.ad_id}~{AdGroupAdAsset.asset_id}~{AdGroupAdAsset.field_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the ad group ad asset view.
   * Ad group ad asset view resource names have the form (Before V4):
   * `customers/{customer_id}/adGroupAdAssets/{AdGroupAdAsset.ad_group_id}~{AdGroupAdAsset.ad.ad_id}~{AdGroupAdAsset.asset_id}~{AdGroupAdAsset.field_type}`
   * Ad group ad asset view resource names have the form (Beginning from V4):
   * `customers/{customer_id}/adGroupAdAssetViews/{AdGroupAdAsset.ad_group_id}~{AdGroupAdAsset.ad_id}~{AdGroupAdAsset.asset_id}~{AdGroupAdAsset.field_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ad group ad to which the asset is linked.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group_ad = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the adGroupAd field is set.
   */
  boolean hasAdGroupAd();
  /**
   * <pre>
   * Output only. The ad group ad to which the asset is linked.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group_ad = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The adGroupAd.
   */
  com.google.protobuf.StringValue getAdGroupAd();
  /**
   * <pre>
   * Output only. The ad group ad to which the asset is linked.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group_ad = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getAdGroupAdOrBuilder();

  /**
   * <pre>
   * Output only. The asset which is linked to the ad group ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue asset = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the asset field is set.
   */
  boolean hasAsset();
  /**
   * <pre>
   * Output only. The asset which is linked to the ad group ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue asset = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The asset.
   */
  com.google.protobuf.StringValue getAsset();
  /**
   * <pre>
   * Output only. The asset which is linked to the ad group ad.
   * </pre>
   *
   * <code>.google.protobuf.StringValue asset = 6 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.StringValueOrBuilder getAssetOrBuilder();

  /**
   * <pre>
   * Output only. Role that the asset takes in the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.AssetFieldTypeEnum.AssetFieldType field_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for fieldType.
   */
  int getFieldTypeValue();
  /**
   * <pre>
   * Output only. Role that the asset takes in the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.AssetFieldTypeEnum.AssetFieldType field_type = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The fieldType.
   */
  com.google.ads.googleads.v5.enums.AssetFieldTypeEnum.AssetFieldType getFieldType();

  /**
   * <pre>
   * Output only. The status between the asset and the latest version of the ad. If true, the
   * asset is linked to the latest version of the ad. If false, it means the
   * link once existed but has been removed and is no longer present in the
   * latest version of the ad.
   * </pre>
   *
   * <code>bool enabled = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the enabled field is set.
   */
  boolean hasEnabled();
  /**
   * <pre>
   * Output only. The status between the asset and the latest version of the ad. If true, the
   * asset is linked to the latest version of the ad. If false, it means the
   * link once existed but has been removed and is no longer present in the
   * latest version of the ad.
   * </pre>
   *
   * <code>bool enabled = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <pre>
   * Output only. Policy information for the ad group ad asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.resources.AdGroupAdAssetPolicySummary policy_summary = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the policySummary field is set.
   */
  boolean hasPolicySummary();
  /**
   * <pre>
   * Output only. Policy information for the ad group ad asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.resources.AdGroupAdAssetPolicySummary policy_summary = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The policySummary.
   */
  com.google.ads.googleads.v5.resources.AdGroupAdAssetPolicySummary getPolicySummary();
  /**
   * <pre>
   * Output only. Policy information for the ad group ad asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.resources.AdGroupAdAssetPolicySummary policy_summary = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v5.resources.AdGroupAdAssetPolicySummaryOrBuilder getPolicySummaryOrBuilder();

  /**
   * <pre>
   * Output only. Performance of an asset linkage.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.AssetPerformanceLabelEnum.AssetPerformanceLabel performance_label = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for performanceLabel.
   */
  int getPerformanceLabelValue();
  /**
   * <pre>
   * Output only. Performance of an asset linkage.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.AssetPerformanceLabelEnum.AssetPerformanceLabel performance_label = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The performanceLabel.
   */
  com.google.ads.googleads.v5.enums.AssetPerformanceLabelEnum.AssetPerformanceLabel getPerformanceLabel();
}

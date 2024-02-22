// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/asset_group_signal.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.resources;

public interface AssetGroupSignalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.resources.AssetGroupSignal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the asset group signal.
   * Asset group signal resource name have the form:
   *
   * `customers/{customer_id}/assetGroupSignals/{asset_group_id}~{signal_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the asset group signal.
   * Asset group signal resource name have the form:
   *
   * `customers/{customer_id}/assetGroupSignals/{asset_group_id}~{signal_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The asset group which this asset group signal belongs to.
   * </pre>
   *
   * <code>string asset_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The assetGroup.
   */
  java.lang.String getAssetGroup();
  /**
   * <pre>
   * Immutable. The asset group which this asset group signal belongs to.
   * </pre>
   *
   * <code>string asset_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for assetGroup.
   */
  com.google.protobuf.ByteString
      getAssetGroupBytes();

  /**
   * <pre>
   * Immutable. The signal(audience criterion) to be used by the performance max
   * campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.AudienceInfo audience = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the audience field is set.
   */
  boolean hasAudience();
  /**
   * <pre>
   * Immutable. The signal(audience criterion) to be used by the performance max
   * campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.AudienceInfo audience = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The audience.
   */
  com.google.ads.googleads.v14.common.AudienceInfo getAudience();
  /**
   * <pre>
   * Immutable. The signal(audience criterion) to be used by the performance max
   * campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.AudienceInfo audience = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.ads.googleads.v14.common.AudienceInfoOrBuilder getAudienceOrBuilder();
}

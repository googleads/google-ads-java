// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/common/asset_types.proto

package com.google.ads.googleads.v4.common;

public interface MediaBundleAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v4.common.MediaBundleAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Media bundle (ZIP file) asset data. The format of the uploaded ZIP file
   * depends on the ad field where it will be used. For more information on the
   * format, see the documentation of the ad field where you plan on using the
   * MediaBundleAsset. This field is mutate only.
   * </pre>
   *
   * <code>.google.protobuf.BytesValue data = 1;</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <pre>
   * Media bundle (ZIP file) asset data. The format of the uploaded ZIP file
   * depends on the ad field where it will be used. For more information on the
   * format, see the documentation of the ad field where you plan on using the
   * MediaBundleAsset. This field is mutate only.
   * </pre>
   *
   * <code>.google.protobuf.BytesValue data = 1;</code>
   * @return The data.
   */
  com.google.protobuf.BytesValue getData();
  /**
   * <pre>
   * Media bundle (ZIP file) asset data. The format of the uploaded ZIP file
   * depends on the ad field where it will be used. For more information on the
   * format, see the documentation of the ad field where you plan on using the
   * MediaBundleAsset. This field is mutate only.
   * </pre>
   *
   * <code>.google.protobuf.BytesValue data = 1;</code>
   */
  com.google.protobuf.BytesValueOrBuilder getDataOrBuilder();
}

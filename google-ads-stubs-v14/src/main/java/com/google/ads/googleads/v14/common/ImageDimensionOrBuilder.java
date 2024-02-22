// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/asset_types.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.common;

public interface ImageDimensionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.common.ImageDimension)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Height of the image.
   * </pre>
   *
   * <code>optional int64 height_pixels = 4;</code>
   * @return Whether the heightPixels field is set.
   */
  boolean hasHeightPixels();
  /**
   * <pre>
   * Height of the image.
   * </pre>
   *
   * <code>optional int64 height_pixels = 4;</code>
   * @return The heightPixels.
   */
  long getHeightPixels();

  /**
   * <pre>
   * Width of the image.
   * </pre>
   *
   * <code>optional int64 width_pixels = 5;</code>
   * @return Whether the widthPixels field is set.
   */
  boolean hasWidthPixels();
  /**
   * <pre>
   * Width of the image.
   * </pre>
   *
   * <code>optional int64 width_pixels = 5;</code>
   * @return The widthPixels.
   */
  long getWidthPixels();

  /**
   * <pre>
   * A URL that returns the image with this height and width.
   * </pre>
   *
   * <code>optional string url = 6;</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <pre>
   * A URL that returns the image with this height and width.
   * </pre>
   *
   * <code>optional string url = 6;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * A URL that returns the image with this height and width.
   * </pre>
   *
   * <code>optional string url = 6;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();
}

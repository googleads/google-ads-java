// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/common/ad_type_infos.proto

package com.google.ads.googleads.v7.common;

public interface ImageAdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.common.ImageAdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Width in pixels of the full size image.
   * </pre>
   *
   * <code>int64 pixel_width = 15;</code>
   * @return Whether the pixelWidth field is set.
   */
  boolean hasPixelWidth();
  /**
   * <pre>
   * Width in pixels of the full size image.
   * </pre>
   *
   * <code>int64 pixel_width = 15;</code>
   * @return The pixelWidth.
   */
  long getPixelWidth();

  /**
   * <pre>
   * Height in pixels of the full size image.
   * </pre>
   *
   * <code>int64 pixel_height = 16;</code>
   * @return Whether the pixelHeight field is set.
   */
  boolean hasPixelHeight();
  /**
   * <pre>
   * Height in pixels of the full size image.
   * </pre>
   *
   * <code>int64 pixel_height = 16;</code>
   * @return The pixelHeight.
   */
  long getPixelHeight();

  /**
   * <pre>
   * URL of the full size image.
   * </pre>
   *
   * <code>string image_url = 17;</code>
   * @return Whether the imageUrl field is set.
   */
  boolean hasImageUrl();
  /**
   * <pre>
   * URL of the full size image.
   * </pre>
   *
   * <code>string image_url = 17;</code>
   * @return The imageUrl.
   */
  java.lang.String getImageUrl();
  /**
   * <pre>
   * URL of the full size image.
   * </pre>
   *
   * <code>string image_url = 17;</code>
   * @return The bytes for imageUrl.
   */
  com.google.protobuf.ByteString
      getImageUrlBytes();

  /**
   * <pre>
   * Width in pixels of the preview size image.
   * </pre>
   *
   * <code>int64 preview_pixel_width = 18;</code>
   * @return Whether the previewPixelWidth field is set.
   */
  boolean hasPreviewPixelWidth();
  /**
   * <pre>
   * Width in pixels of the preview size image.
   * </pre>
   *
   * <code>int64 preview_pixel_width = 18;</code>
   * @return The previewPixelWidth.
   */
  long getPreviewPixelWidth();

  /**
   * <pre>
   * Height in pixels of the preview size image.
   * </pre>
   *
   * <code>int64 preview_pixel_height = 19;</code>
   * @return Whether the previewPixelHeight field is set.
   */
  boolean hasPreviewPixelHeight();
  /**
   * <pre>
   * Height in pixels of the preview size image.
   * </pre>
   *
   * <code>int64 preview_pixel_height = 19;</code>
   * @return The previewPixelHeight.
   */
  long getPreviewPixelHeight();

  /**
   * <pre>
   * URL of the preview size image.
   * </pre>
   *
   * <code>string preview_image_url = 20;</code>
   * @return Whether the previewImageUrl field is set.
   */
  boolean hasPreviewImageUrl();
  /**
   * <pre>
   * URL of the preview size image.
   * </pre>
   *
   * <code>string preview_image_url = 20;</code>
   * @return The previewImageUrl.
   */
  java.lang.String getPreviewImageUrl();
  /**
   * <pre>
   * URL of the preview size image.
   * </pre>
   *
   * <code>string preview_image_url = 20;</code>
   * @return The bytes for previewImageUrl.
   */
  com.google.protobuf.ByteString
      getPreviewImageUrlBytes();

  /**
   * <pre>
   * The mime type of the image.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.MimeTypeEnum.MimeType mime_type = 10;</code>
   * @return The enum numeric value on the wire for mimeType.
   */
  int getMimeTypeValue();
  /**
   * <pre>
   * The mime type of the image.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.enums.MimeTypeEnum.MimeType mime_type = 10;</code>
   * @return The mimeType.
   */
  com.google.ads.googleads.v7.enums.MimeTypeEnum.MimeType getMimeType();

  /**
   * <pre>
   * The name of the image. If the image was created from a MediaFile, this is
   * the MediaFile's name. If the image was created from bytes, this is empty.
   * </pre>
   *
   * <code>string name = 21;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the image. If the image was created from a MediaFile, this is
   * the MediaFile's name. If the image was created from bytes, this is empty.
   * </pre>
   *
   * <code>string name = 21;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the image. If the image was created from a MediaFile, this is
   * the MediaFile's name. If the image was created from bytes, this is empty.
   * </pre>
   *
   * <code>string name = 21;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The MediaFile resource to use for the image.
   * </pre>
   *
   * <code>string media_file = 12;</code>
   * @return Whether the mediaFile field is set.
   */
  boolean hasMediaFile();
  /**
   * <pre>
   * The MediaFile resource to use for the image.
   * </pre>
   *
   * <code>string media_file = 12;</code>
   * @return The mediaFile.
   */
  java.lang.String getMediaFile();
  /**
   * <pre>
   * The MediaFile resource to use for the image.
   * </pre>
   *
   * <code>string media_file = 12;</code>
   * @return The bytes for mediaFile.
   */
  com.google.protobuf.ByteString
      getMediaFileBytes();

  /**
   * <pre>
   * Raw image data as bytes.
   * </pre>
   *
   * <code>bytes data = 13;</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <pre>
   * Raw image data as bytes.
   * </pre>
   *
   * <code>bytes data = 13;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   * <pre>
   * An ad ID to copy the image from.
   * </pre>
   *
   * <code>int64 ad_id_to_copy_image_from = 14;</code>
   * @return Whether the adIdToCopyImageFrom field is set.
   */
  boolean hasAdIdToCopyImageFrom();
  /**
   * <pre>
   * An ad ID to copy the image from.
   * </pre>
   *
   * <code>int64 ad_id_to_copy_image_from = 14;</code>
   * @return The adIdToCopyImageFrom.
   */
  long getAdIdToCopyImageFrom();

  public com.google.ads.googleads.v7.common.ImageAdInfo.ImageCase getImageCase();
}
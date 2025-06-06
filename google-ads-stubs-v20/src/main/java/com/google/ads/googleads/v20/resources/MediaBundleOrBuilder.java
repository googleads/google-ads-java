// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/resources/media_file.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.resources;

public interface MediaBundleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.resources.MediaBundle)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. Raw zipped data.
   * </pre>
   *
   * <code>optional bytes data = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <pre>
   * Immutable. Raw zipped data.
   * </pre>
   *
   * <code>optional bytes data = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   * <pre>
   * Output only. The url to access the uploaded zipped data.
   * For example, https://tpc.googlesyndication.com/simgad/123
   * This field is read-only.
   * </pre>
   *
   * <code>optional string url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the url field is set.
   */
  boolean hasUrl();
  /**
   * <pre>
   * Output only. The url to access the uploaded zipped data.
   * For example, https://tpc.googlesyndication.com/simgad/123
   * This field is read-only.
   * </pre>
   *
   * <code>optional string url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * Output only. The url to access the uploaded zipped data.
   * For example, https://tpc.googlesyndication.com/simgad/123
   * This field is read-only.
   * </pre>
   *
   * <code>optional string url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();
}

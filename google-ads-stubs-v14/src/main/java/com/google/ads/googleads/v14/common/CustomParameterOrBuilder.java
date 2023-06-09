// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/custom_parameter.proto

package com.google.ads.googleads.v14.common;

public interface CustomParameterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.common.CustomParameter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The key matching the parameter tag name.
   * </pre>
   *
   * <code>optional string key = 3;</code>
   * @return Whether the key field is set.
   */
  boolean hasKey();
  /**
   * <pre>
   * The key matching the parameter tag name.
   * </pre>
   *
   * <code>optional string key = 3;</code>
   * @return The key.
   */
  java.lang.String getKey();
  /**
   * <pre>
   * The key matching the parameter tag name.
   * </pre>
   *
   * <code>optional string key = 3;</code>
   * @return The bytes for key.
   */
  com.google.protobuf.ByteString
      getKeyBytes();

  /**
   * <pre>
   * The value to be substituted.
   * </pre>
   *
   * <code>optional string value = 4;</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <pre>
   * The value to be substituted.
   * </pre>
   *
   * <code>optional string value = 4;</code>
   * @return The value.
   */
  java.lang.String getValue();
  /**
   * <pre>
   * The value to be substituted.
   * </pre>
   *
   * <code>optional string value = 4;</code>
   * @return The bytes for value.
   */
  com.google.protobuf.ByteString
      getValueBytes();
}

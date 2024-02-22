// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/criteria.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.common;

public interface SearchThemeInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.common.SearchThemeInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Each Search Theme has a value of a simple string, like keywords.
   * There are limits on overall length, allowed characters, and number
   * of words.
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * Each Search Theme has a value of a simple string, like keywords.
   * There are limits on overall length, allowed characters, and number
   * of words.
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/language_constant.proto

package com.google.ads.googleads.v1.resources;

public interface LanguageConstantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.LanguageConstant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the language constant.
   * Language constant resource names have the form:
   * `languageConstants/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the language constant.
   * Language constant resource names have the form:
   * `languageConstants/{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The ID of the language constant.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  boolean hasId();
  /**
   * <pre>
   * The ID of the language constant.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * The ID of the language constant.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 2;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The language code, e.g. "en_US", "en_AU", "es", "fr", etc.
   * </pre>
   *
   * <code>.google.protobuf.StringValue code = 3;</code>
   */
  boolean hasCode();
  /**
   * <pre>
   * The language code, e.g. "en_US", "en_AU", "es", "fr", etc.
   * </pre>
   *
   * <code>.google.protobuf.StringValue code = 3;</code>
   */
  com.google.protobuf.StringValue getCode();
  /**
   * <pre>
   * The language code, e.g. "en_US", "en_AU", "es", "fr", etc.
   * </pre>
   *
   * <code>.google.protobuf.StringValue code = 3;</code>
   */
  com.google.protobuf.StringValueOrBuilder getCodeOrBuilder();

  /**
   * <pre>
   * The full name of the language in English, e.g., "English (US)", "Spanish",
   * etc.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  boolean hasName();
  /**
   * <pre>
   * The full name of the language in English, e.g., "English (US)", "Spanish",
   * etc.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * The full name of the language in English, e.g., "English (US)", "Spanish",
   * etc.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Whether the language is targetable.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue targetable = 5;</code>
   */
  boolean hasTargetable();
  /**
   * <pre>
   * Whether the language is targetable.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue targetable = 5;</code>
   */
  com.google.protobuf.BoolValue getTargetable();
  /**
   * <pre>
   * Whether the language is targetable.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue targetable = 5;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getTargetableOrBuilder();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/custom_interest.proto

package com.google.ads.googleads.v1.resources;

public interface CustomInterestMemberOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.resources.CustomInterestMember)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The type of custom interest member, KEYWORD or URL.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType member_type = 1;</code>
   * @return The enum numeric value on the wire for memberType.
   */
  int getMemberTypeValue();
  /**
   * <pre>
   * The type of custom interest member, KEYWORD or URL.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType member_type = 1;</code>
   * @return The memberType.
   */
  com.google.ads.googleads.v1.enums.CustomInterestMemberTypeEnum.CustomInterestMemberType getMemberType();

  /**
   * <pre>
   * Keyword text when member_type is KEYWORD or URL string when
   * member_type is URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue parameter = 2;</code>
   * @return Whether the parameter field is set.
   */
  boolean hasParameter();
  /**
   * <pre>
   * Keyword text when member_type is KEYWORD or URL string when
   * member_type is URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue parameter = 2;</code>
   * @return The parameter.
   */
  com.google.protobuf.StringValue getParameter();
  /**
   * <pre>
   * Keyword text when member_type is KEYWORD or URL string when
   * member_type is URL.
   * </pre>
   *
   * <code>.google.protobuf.StringValue parameter = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getParameterOrBuilder();
}
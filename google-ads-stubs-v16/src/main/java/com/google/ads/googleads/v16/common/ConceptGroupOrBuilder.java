// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/keyword_plan_common.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.common;

public interface ConceptGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.common.ConceptGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The concept group name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The concept group name.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The concept group type.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.KeywordPlanConceptGroupTypeEnum.KeywordPlanConceptGroupType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * The concept group type.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.KeywordPlanConceptGroupTypeEnum.KeywordPlanConceptGroupType type = 2;</code>
   * @return The type.
   */
  com.google.ads.googleads.v16.enums.KeywordPlanConceptGroupTypeEnum.KeywordPlanConceptGroupType getType();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/common/keyword_plan_common.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.common;

public interface KeywordAnnotationsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.common.KeywordAnnotations)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of concepts for the keyword.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.common.KeywordConcept concepts = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v20.common.KeywordConcept> 
      getConceptsList();
  /**
   * <pre>
   * The list of concepts for the keyword.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.common.KeywordConcept concepts = 1;</code>
   */
  com.google.ads.googleads.v20.common.KeywordConcept getConcepts(int index);
  /**
   * <pre>
   * The list of concepts for the keyword.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.common.KeywordConcept concepts = 1;</code>
   */
  int getConceptsCount();
  /**
   * <pre>
   * The list of concepts for the keyword.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.common.KeywordConcept concepts = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v20.common.KeywordConceptOrBuilder> 
      getConceptsOrBuilderList();
  /**
   * <pre>
   * The list of concepts for the keyword.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.common.KeywordConcept concepts = 1;</code>
   */
  com.google.ads.googleads.v20.common.KeywordConceptOrBuilder getConceptsOrBuilder(
      int index);
}

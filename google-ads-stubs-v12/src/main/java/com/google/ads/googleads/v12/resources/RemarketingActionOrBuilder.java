// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/remarketing_action.proto

package com.google.ads.googleads.v12.resources;

public interface RemarketingActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v12.resources.RemarketingAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the remarketing action.
   * Remarketing action resource names have the form:
   *
   * `customers/{customer_id}/remarketingActions/{remarketing_action_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the remarketing action.
   * Remarketing action resource names have the form:
   *
   * `customers/{customer_id}/remarketingActions/{remarketing_action_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. Id of the remarketing action.
   * </pre>
   *
   * <code>optional int64 id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. Id of the remarketing action.
   * </pre>
   *
   * <code>optional int64 id = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * The name of the remarketing action.
   *
   * This field is required and should not be empty when creating new
   * remarketing actions.
   * </pre>
   *
   * <code>optional string name = 6;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the remarketing action.
   *
   * This field is required and should not be empty when creating new
   * remarketing actions.
   * </pre>
   *
   * <code>optional string name = 6;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the remarketing action.
   *
   * This field is required and should not be empty when creating new
   * remarketing actions.
   * </pre>
   *
   * <code>optional string name = 6;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The snippets used for tracking remarketing actions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.common.TagSnippet tag_snippets = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v12.common.TagSnippet> 
      getTagSnippetsList();
  /**
   * <pre>
   * Output only. The snippets used for tracking remarketing actions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.common.TagSnippet tag_snippets = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v12.common.TagSnippet getTagSnippets(int index);
  /**
   * <pre>
   * Output only. The snippets used for tracking remarketing actions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.common.TagSnippet tag_snippets = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getTagSnippetsCount();
  /**
   * <pre>
   * Output only. The snippets used for tracking remarketing actions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.common.TagSnippet tag_snippets = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v12.common.TagSnippetOrBuilder> 
      getTagSnippetsOrBuilderList();
  /**
   * <pre>
   * Output only. The snippets used for tracking remarketing actions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v12.common.TagSnippet tag_snippets = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v12.common.TagSnippetOrBuilder getTagSnippetsOrBuilder(
      int index);
}

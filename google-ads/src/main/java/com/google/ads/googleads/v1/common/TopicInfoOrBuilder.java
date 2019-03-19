// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/criteria.proto

package com.google.ads.googleads.v1.common;

public interface TopicInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.common.TopicInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The Topic Constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue topic_constant = 1;</code>
   */
  boolean hasTopicConstant();
  /**
   * <pre>
   * The Topic Constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue topic_constant = 1;</code>
   */
  com.google.protobuf.StringValue getTopicConstant();
  /**
   * <pre>
   * The Topic Constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue topic_constant = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getTopicConstantOrBuilder();

  /**
   * <pre>
   * The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
   * category.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue path = 2;</code>
   */
  java.util.List<com.google.protobuf.StringValue> 
      getPathList();
  /**
   * <pre>
   * The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
   * category.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue path = 2;</code>
   */
  com.google.protobuf.StringValue getPath(int index);
  /**
   * <pre>
   * The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
   * category.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue path = 2;</code>
   */
  int getPathCount();
  /**
   * <pre>
   * The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
   * category.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue path = 2;</code>
   */
  java.util.List<? extends com.google.protobuf.StringValueOrBuilder> 
      getPathOrBuilderList();
  /**
   * <pre>
   * The category to target or exclude. Each subsequent element in the array
   * describes a more specific sub-category. For example,
   * "Pets &amp; Animals", "Pets", "Dogs" represents the "Pets &amp; Animals/Pets/Dogs"
   * category.
   * </pre>
   *
   * <code>repeated .google.protobuf.StringValue path = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getPathOrBuilder(
      int index);
}

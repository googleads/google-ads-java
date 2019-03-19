// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/user_lists.proto

package com.google.ads.googleads.v1.common;

public interface UserListActionInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.common.UserListActionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A conversion action that's not generated from remarketing.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_action = 1;</code>
   */
  boolean hasConversionAction();
  /**
   * <pre>
   * A conversion action that's not generated from remarketing.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_action = 1;</code>
   */
  com.google.protobuf.StringValue getConversionAction();
  /**
   * <pre>
   * A conversion action that's not generated from remarketing.
   * </pre>
   *
   * <code>.google.protobuf.StringValue conversion_action = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getConversionActionOrBuilder();

  /**
   * <pre>
   * A remarketing action.
   * </pre>
   *
   * <code>.google.protobuf.StringValue remarketing_action = 2;</code>
   */
  boolean hasRemarketingAction();
  /**
   * <pre>
   * A remarketing action.
   * </pre>
   *
   * <code>.google.protobuf.StringValue remarketing_action = 2;</code>
   */
  com.google.protobuf.StringValue getRemarketingAction();
  /**
   * <pre>
   * A remarketing action.
   * </pre>
   *
   * <code>.google.protobuf.StringValue remarketing_action = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getRemarketingActionOrBuilder();

  public com.google.ads.googleads.v1.common.UserListActionInfo.UserListActionCase getUserListActionCase();
}

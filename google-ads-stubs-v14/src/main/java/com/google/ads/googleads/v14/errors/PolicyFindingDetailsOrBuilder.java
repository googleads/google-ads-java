// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/errors/errors.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.errors;

public interface PolicyFindingDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.errors.PolicyFindingDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of policy topics for the resource. Contains the PROHIBITED or
   * FULLY_LIMITED policy topic entries that prevented the resource from being
   * saved (among any other entries the resource may also have).
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v14.common.PolicyTopicEntry> 
      getPolicyTopicEntriesList();
  /**
   * <pre>
   * The list of policy topics for the resource. Contains the PROHIBITED or
   * FULLY_LIMITED policy topic entries that prevented the resource from being
   * saved (among any other entries the resource may also have).
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  com.google.ads.googleads.v14.common.PolicyTopicEntry getPolicyTopicEntries(int index);
  /**
   * <pre>
   * The list of policy topics for the resource. Contains the PROHIBITED or
   * FULLY_LIMITED policy topic entries that prevented the resource from being
   * saved (among any other entries the resource may also have).
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  int getPolicyTopicEntriesCount();
  /**
   * <pre>
   * The list of policy topics for the resource. Contains the PROHIBITED or
   * FULLY_LIMITED policy topic entries that prevented the resource from being
   * saved (among any other entries the resource may also have).
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v14.common.PolicyTopicEntryOrBuilder> 
      getPolicyTopicEntriesOrBuilderList();
  /**
   * <pre>
   * The list of policy topics for the resource. Contains the PROHIBITED or
   * FULLY_LIMITED policy topic entries that prevented the resource from being
   * saved (among any other entries the resource may also have).
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  com.google.ads.googleads.v14.common.PolicyTopicEntryOrBuilder getPolicyTopicEntriesOrBuilder(
      int index);
}

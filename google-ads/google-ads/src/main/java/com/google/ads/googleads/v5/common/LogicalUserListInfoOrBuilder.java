// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/common/user_lists.proto

package com.google.ads.googleads.v5.common;

public interface LogicalUserListInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.common.LogicalUserListInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Logical list rules that define this user list. The rules are defined as a
   * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
   * ANDed when they are evaluated.
   * Required for creating a logical user list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v5.common.UserListLogicalRuleInfo rules = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v5.common.UserListLogicalRuleInfo> 
      getRulesList();
  /**
   * <pre>
   * Logical list rules that define this user list. The rules are defined as a
   * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
   * ANDed when they are evaluated.
   * Required for creating a logical user list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v5.common.UserListLogicalRuleInfo rules = 1;</code>
   */
  com.google.ads.googleads.v5.common.UserListLogicalRuleInfo getRules(int index);
  /**
   * <pre>
   * Logical list rules that define this user list. The rules are defined as a
   * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
   * ANDed when they are evaluated.
   * Required for creating a logical user list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v5.common.UserListLogicalRuleInfo rules = 1;</code>
   */
  int getRulesCount();
  /**
   * <pre>
   * Logical list rules that define this user list. The rules are defined as a
   * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
   * ANDed when they are evaluated.
   * Required for creating a logical user list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v5.common.UserListLogicalRuleInfo rules = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v5.common.UserListLogicalRuleInfoOrBuilder> 
      getRulesOrBuilderList();
  /**
   * <pre>
   * Logical list rules that define this user list. The rules are defined as a
   * logical operator (ALL/ANY/NONE) and a list of user lists. All the rules are
   * ANDed when they are evaluated.
   * Required for creating a logical user list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v5.common.UserListLogicalRuleInfo rules = 1;</code>
   */
  com.google.ads.googleads.v5.common.UserListLogicalRuleInfoOrBuilder getRulesOrBuilder(
      int index);
}

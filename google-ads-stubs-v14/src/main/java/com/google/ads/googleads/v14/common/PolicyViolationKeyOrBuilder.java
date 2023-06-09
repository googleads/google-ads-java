// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/policy.proto

package com.google.ads.googleads.v14.common;

public interface PolicyViolationKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.common.PolicyViolationKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Unique ID of the violated policy.
   * </pre>
   *
   * <code>optional string policy_name = 3;</code>
   * @return Whether the policyName field is set.
   */
  boolean hasPolicyName();
  /**
   * <pre>
   * Unique ID of the violated policy.
   * </pre>
   *
   * <code>optional string policy_name = 3;</code>
   * @return The policyName.
   */
  java.lang.String getPolicyName();
  /**
   * <pre>
   * Unique ID of the violated policy.
   * </pre>
   *
   * <code>optional string policy_name = 3;</code>
   * @return The bytes for policyName.
   */
  com.google.protobuf.ByteString
      getPolicyNameBytes();

  /**
   * <pre>
   * The text that violates the policy if specified.
   * Otherwise, refers to the policy in general
   * (for example, when requesting to be exempt from the whole policy).
   * If not specified for criterion exemptions, the whole policy is implied.
   * Must be specified for ad exemptions.
   * </pre>
   *
   * <code>optional string violating_text = 4;</code>
   * @return Whether the violatingText field is set.
   */
  boolean hasViolatingText();
  /**
   * <pre>
   * The text that violates the policy if specified.
   * Otherwise, refers to the policy in general
   * (for example, when requesting to be exempt from the whole policy).
   * If not specified for criterion exemptions, the whole policy is implied.
   * Must be specified for ad exemptions.
   * </pre>
   *
   * <code>optional string violating_text = 4;</code>
   * @return The violatingText.
   */
  java.lang.String getViolatingText();
  /**
   * <pre>
   * The text that violates the policy if specified.
   * Otherwise, refers to the policy in general
   * (for example, when requesting to be exempt from the whole policy).
   * If not specified for criterion exemptions, the whole policy is implied.
   * Must be specified for ad exemptions.
   * </pre>
   *
   * <code>optional string violating_text = 4;</code>
   * @return The bytes for violatingText.
   */
  com.google.protobuf.ByteString
      getViolatingTextBytes();
}

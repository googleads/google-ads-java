// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/errors/errors.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.errors;

public interface PolicyViolationDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.errors.PolicyViolationDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Human readable description of policy violation.
   * </pre>
   *
   * <code>string external_policy_description = 2;</code>
   * @return The externalPolicyDescription.
   */
  java.lang.String getExternalPolicyDescription();
  /**
   * <pre>
   * Human readable description of policy violation.
   * </pre>
   *
   * <code>string external_policy_description = 2;</code>
   * @return The bytes for externalPolicyDescription.
   */
  com.google.protobuf.ByteString
      getExternalPolicyDescriptionBytes();

  /**
   * <pre>
   * Unique identifier for this violation.
   * If policy is exemptible, this key may be used to request exemption.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.PolicyViolationKey key = 4;</code>
   * @return Whether the key field is set.
   */
  boolean hasKey();
  /**
   * <pre>
   * Unique identifier for this violation.
   * If policy is exemptible, this key may be used to request exemption.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.PolicyViolationKey key = 4;</code>
   * @return The key.
   */
  com.google.ads.googleads.v15.common.PolicyViolationKey getKey();
  /**
   * <pre>
   * Unique identifier for this violation.
   * If policy is exemptible, this key may be used to request exemption.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.PolicyViolationKey key = 4;</code>
   */
  com.google.ads.googleads.v15.common.PolicyViolationKeyOrBuilder getKeyOrBuilder();

  /**
   * <pre>
   * Human readable name of the policy.
   * </pre>
   *
   * <code>string external_policy_name = 5;</code>
   * @return The externalPolicyName.
   */
  java.lang.String getExternalPolicyName();
  /**
   * <pre>
   * Human readable name of the policy.
   * </pre>
   *
   * <code>string external_policy_name = 5;</code>
   * @return The bytes for externalPolicyName.
   */
  com.google.protobuf.ByteString
      getExternalPolicyNameBytes();

  /**
   * <pre>
   * Whether user can file an exemption request for this violation.
   * </pre>
   *
   * <code>bool is_exemptible = 6;</code>
   * @return The isExemptible.
   */
  boolean getIsExemptible();
}

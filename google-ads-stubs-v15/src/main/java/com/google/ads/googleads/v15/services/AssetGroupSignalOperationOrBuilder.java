// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/asset_group_signal_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.services;

public interface AssetGroupSignalOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.AssetGroupSignalOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. The list of policy violation keys that should not cause a
   * PolicyViolationError to be reported. Not all policy violations are
   * exemptable, refer to the is_exemptible field in the returned
   * PolicyViolationError.
   *
   * Resources violating these polices will be saved, but will not be eligible
   * to serve. They may begin serving at a later time due to a change in
   * policies, re-review of the resource, or a change in advertiser
   * certificates.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.PolicyViolationKey exempt_policy_violation_keys = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.PolicyViolationKey> 
      getExemptPolicyViolationKeysList();
  /**
   * <pre>
   * Optional. The list of policy violation keys that should not cause a
   * PolicyViolationError to be reported. Not all policy violations are
   * exemptable, refer to the is_exemptible field in the returned
   * PolicyViolationError.
   *
   * Resources violating these polices will be saved, but will not be eligible
   * to serve. They may begin serving at a later time due to a change in
   * policies, re-review of the resource, or a change in advertiser
   * certificates.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.PolicyViolationKey exempt_policy_violation_keys = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.ads.googleads.v15.common.PolicyViolationKey getExemptPolicyViolationKeys(int index);
  /**
   * <pre>
   * Optional. The list of policy violation keys that should not cause a
   * PolicyViolationError to be reported. Not all policy violations are
   * exemptable, refer to the is_exemptible field in the returned
   * PolicyViolationError.
   *
   * Resources violating these polices will be saved, but will not be eligible
   * to serve. They may begin serving at a later time due to a change in
   * policies, re-review of the resource, or a change in advertiser
   * certificates.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.PolicyViolationKey exempt_policy_violation_keys = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getExemptPolicyViolationKeysCount();
  /**
   * <pre>
   * Optional. The list of policy violation keys that should not cause a
   * PolicyViolationError to be reported. Not all policy violations are
   * exemptable, refer to the is_exemptible field in the returned
   * PolicyViolationError.
   *
   * Resources violating these polices will be saved, but will not be eligible
   * to serve. They may begin serving at a later time due to a change in
   * policies, re-review of the resource, or a change in advertiser
   * certificates.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.PolicyViolationKey exempt_policy_violation_keys = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.PolicyViolationKeyOrBuilder> 
      getExemptPolicyViolationKeysOrBuilderList();
  /**
   * <pre>
   * Optional. The list of policy violation keys that should not cause a
   * PolicyViolationError to be reported. Not all policy violations are
   * exemptable, refer to the is_exemptible field in the returned
   * PolicyViolationError.
   *
   * Resources violating these polices will be saved, but will not be eligible
   * to serve. They may begin serving at a later time due to a change in
   * policies, re-review of the resource, or a change in advertiser
   * certificates.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.PolicyViolationKey exempt_policy_violation_keys = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.ads.googleads.v15.common.PolicyViolationKeyOrBuilder getExemptPolicyViolationKeysOrBuilder(
      int index);

  /**
   * <pre>
   * Create operation: No resource name is expected for the new asset group
   * signal.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.AssetGroupSignal create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new asset group
   * signal.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.AssetGroupSignal create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v15.resources.AssetGroupSignal getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new asset group
   * signal.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.AssetGroupSignal create = 1;</code>
   */
  com.google.ads.googleads.v15.resources.AssetGroupSignalOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed asset group signal is
   * expected, in this format:
   * `customers/{customer_id}/assetGroupSignals/{asset_group_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed asset group signal is
   * expected, in this format:
   * `customers/{customer_id}/assetGroupSignals/{asset_group_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed asset group signal is
   * expected, in this format:
   * `customers/{customer_id}/assetGroupSignals/{asset_group_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  com.google.ads.googleads.v15.services.AssetGroupSignalOperation.OperationCase getOperationCase();
}

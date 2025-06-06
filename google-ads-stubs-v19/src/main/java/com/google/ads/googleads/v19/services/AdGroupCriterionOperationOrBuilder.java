// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/ad_group_criterion_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.services;

public interface AdGroupCriterionOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.services.AdGroupCriterionOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * The list of policy violation keys that should not cause a
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
   * <code>repeated .google.ads.googleads.v19.common.PolicyViolationKey exempt_policy_violation_keys = 5;</code>
   */
  java.util.List<com.google.ads.googleads.v19.common.PolicyViolationKey> 
      getExemptPolicyViolationKeysList();
  /**
   * <pre>
   * The list of policy violation keys that should not cause a
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
   * <code>repeated .google.ads.googleads.v19.common.PolicyViolationKey exempt_policy_violation_keys = 5;</code>
   */
  com.google.ads.googleads.v19.common.PolicyViolationKey getExemptPolicyViolationKeys(int index);
  /**
   * <pre>
   * The list of policy violation keys that should not cause a
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
   * <code>repeated .google.ads.googleads.v19.common.PolicyViolationKey exempt_policy_violation_keys = 5;</code>
   */
  int getExemptPolicyViolationKeysCount();
  /**
   * <pre>
   * The list of policy violation keys that should not cause a
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
   * <code>repeated .google.ads.googleads.v19.common.PolicyViolationKey exempt_policy_violation_keys = 5;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v19.common.PolicyViolationKeyOrBuilder> 
      getExemptPolicyViolationKeysOrBuilderList();
  /**
   * <pre>
   * The list of policy violation keys that should not cause a
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
   * <code>repeated .google.ads.googleads.v19.common.PolicyViolationKey exempt_policy_violation_keys = 5;</code>
   */
  com.google.ads.googleads.v19.common.PolicyViolationKeyOrBuilder getExemptPolicyViolationKeysOrBuilder(
      int index);

  /**
   * <pre>
   * Create operation: No resource name is expected for the new criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AdGroupCriterion create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AdGroupCriterion create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v19.resources.AdGroupCriterion getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AdGroupCriterion create = 1;</code>
   */
  com.google.ads.googleads.v19.resources.AdGroupCriterionOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The criterion is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AdGroupCriterion update = 2;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The criterion is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AdGroupCriterion update = 2;</code>
   * @return The update.
   */
  com.google.ads.googleads.v19.resources.AdGroupCriterion getUpdate();
  /**
   * <pre>
   * Update operation: The criterion is expected to have a valid resource
   * name.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.resources.AdGroupCriterion update = 2;</code>
   */
  com.google.ads.googleads.v19.resources.AdGroupCriterionOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed criterion is expected,
   * in this format:
   *
   * `customers/{customer_id}/adGroupCriteria/{ad_group_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed criterion is expected,
   * in this format:
   *
   * `customers/{customer_id}/adGroupCriteria/{ad_group_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed criterion is expected,
   * in this format:
   *
   * `customers/{customer_id}/adGroupCriteria/{ad_group_id}~{criterion_id}`
   * </pre>
   *
   * <code>string remove = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  com.google.ads.googleads.v19.services.AdGroupCriterionOperation.OperationCase getOperationCase();
}

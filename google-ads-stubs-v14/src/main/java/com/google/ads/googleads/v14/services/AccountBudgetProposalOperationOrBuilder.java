// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/account_budget_proposal_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.services;

public interface AccountBudgetProposalOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.services.AccountBudgetProposalOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which budget fields are modified.  While budgets
   * may be modified, proposals that propose such modifications are final.
   * Therefore, update operations are not supported for proposals.
   *
   * Proposals that modify budgets have the 'update' proposal type.  Specifying
   * a mask for any other proposal type is considered an error.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which budget fields are modified.  While budgets
   * may be modified, proposals that propose such modifications are final.
   * Therefore, update operations are not supported for proposals.
   *
   * Proposals that modify budgets have the 'update' proposal type.  Specifying
   * a mask for any other proposal type is considered an error.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which budget fields are modified.  While budgets
   * may be modified, proposals that propose such modifications are final.
   * Therefore, update operations are not supported for proposals.
   *
   * Proposals that modify budgets have the 'update' proposal type.  Specifying
   * a mask for any other proposal type is considered an error.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Create operation: A new proposal to create a new budget, edit an
   * existing budget, end an actively running budget, or remove an approved
   * budget scheduled to start in the future.
   * No resource name is expected for the new proposal.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.AccountBudgetProposal create = 2;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: A new proposal to create a new budget, edit an
   * existing budget, end an actively running budget, or remove an approved
   * budget scheduled to start in the future.
   * No resource name is expected for the new proposal.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.AccountBudgetProposal create = 2;</code>
   * @return The create.
   */
  com.google.ads.googleads.v14.resources.AccountBudgetProposal getCreate();
  /**
   * <pre>
   * Create operation: A new proposal to create a new budget, edit an
   * existing budget, end an actively running budget, or remove an approved
   * budget scheduled to start in the future.
   * No resource name is expected for the new proposal.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.AccountBudgetProposal create = 2;</code>
   */
  com.google.ads.googleads.v14.resources.AccountBudgetProposalOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove operation: A resource name for the removed proposal is expected,
   * in this format:
   *
   * `customers/{customer_id}/accountBudgetProposals/{account_budget_proposal_id}`
   * A request may be cancelled iff it is pending.
   * </pre>
   *
   * <code>string remove = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed proposal is expected,
   * in this format:
   *
   * `customers/{customer_id}/accountBudgetProposals/{account_budget_proposal_id}`
   * A request may be cancelled iff it is pending.
   * </pre>
   *
   * <code>string remove = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove operation: A resource name for the removed proposal is expected,
   * in this format:
   *
   * `customers/{customer_id}/accountBudgetProposals/{account_budget_proposal_id}`
   * A request may be cancelled iff it is pending.
   * </pre>
   *
   * <code>string remove = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  com.google.ads.googleads.v14.services.AccountBudgetProposalOperation.OperationCase getOperationCase();
}

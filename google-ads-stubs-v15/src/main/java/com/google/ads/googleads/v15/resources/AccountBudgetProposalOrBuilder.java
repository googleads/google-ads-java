// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/account_budget_proposal.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.resources;

public interface AccountBudgetProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.resources.AccountBudgetProposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the proposal.
   * AccountBudgetProposal resource names have the form:
   *
   * `customers/{customer_id}/accountBudgetProposals/{account_budget_proposal_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the proposal.
   * AccountBudgetProposal resource names have the form:
   *
   * `customers/{customer_id}/accountBudgetProposals/{account_budget_proposal_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the proposal.
   * </pre>
   *
   * <code>optional int64 id = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the proposal.
   * </pre>
   *
   * <code>optional int64 id = 25 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Immutable. The resource name of the billing setup associated with this
   * proposal.
   * </pre>
   *
   * <code>optional string billing_setup = 26 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the billingSetup field is set.
   */
  boolean hasBillingSetup();
  /**
   * <pre>
   * Immutable. The resource name of the billing setup associated with this
   * proposal.
   * </pre>
   *
   * <code>optional string billing_setup = 26 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The billingSetup.
   */
  java.lang.String getBillingSetup();
  /**
   * <pre>
   * Immutable. The resource name of the billing setup associated with this
   * proposal.
   * </pre>
   *
   * <code>optional string billing_setup = 26 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for billingSetup.
   */
  com.google.protobuf.ByteString
      getBillingSetupBytes();

  /**
   * <pre>
   * Immutable. The resource name of the account-level budget associated with
   * this proposal.
   * </pre>
   *
   * <code>optional string account_budget = 27 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the accountBudget field is set.
   */
  boolean hasAccountBudget();
  /**
   * <pre>
   * Immutable. The resource name of the account-level budget associated with
   * this proposal.
   * </pre>
   *
   * <code>optional string account_budget = 27 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The accountBudget.
   */
  java.lang.String getAccountBudget();
  /**
   * <pre>
   * Immutable. The resource name of the account-level budget associated with
   * this proposal.
   * </pre>
   *
   * <code>optional string account_budget = 27 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for accountBudget.
   */
  com.google.protobuf.ByteString
      getAccountBudgetBytes();

  /**
   * <pre>
   * Immutable. The type of this proposal, for example, END to end the budget
   * associated with this proposal.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AccountBudgetProposalTypeEnum.AccountBudgetProposalType proposal_type = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for proposalType.
   */
  int getProposalTypeValue();
  /**
   * <pre>
   * Immutable. The type of this proposal, for example, END to end the budget
   * associated with this proposal.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AccountBudgetProposalTypeEnum.AccountBudgetProposalType proposal_type = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The proposalType.
   */
  com.google.ads.googleads.v15.enums.AccountBudgetProposalTypeEnum.AccountBudgetProposalType getProposalType();

  /**
   * <pre>
   * Output only. The status of this proposal.
   * When a new proposal is created, the status defaults to PENDING.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AccountBudgetProposalStatusEnum.AccountBudgetProposalStatus status = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of this proposal.
   * When a new proposal is created, the status defaults to PENDING.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.AccountBudgetProposalStatusEnum.AccountBudgetProposalStatus status = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v15.enums.AccountBudgetProposalStatusEnum.AccountBudgetProposalStatus getStatus();

  /**
   * <pre>
   * Immutable. The name to assign to the account-level budget.
   * </pre>
   *
   * <code>optional string proposed_name = 28 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the proposedName field is set.
   */
  boolean hasProposedName();
  /**
   * <pre>
   * Immutable. The name to assign to the account-level budget.
   * </pre>
   *
   * <code>optional string proposed_name = 28 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The proposedName.
   */
  java.lang.String getProposedName();
  /**
   * <pre>
   * Immutable. The name to assign to the account-level budget.
   * </pre>
   *
   * <code>optional string proposed_name = 28 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for proposedName.
   */
  com.google.protobuf.ByteString
      getProposedNameBytes();

  /**
   * <pre>
   * Output only. The approved start date time in yyyy-mm-dd hh:mm:ss format.
   * </pre>
   *
   * <code>optional string approved_start_date_time = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the approvedStartDateTime field is set.
   */
  boolean hasApprovedStartDateTime();
  /**
   * <pre>
   * Output only. The approved start date time in yyyy-mm-dd hh:mm:ss format.
   * </pre>
   *
   * <code>optional string approved_start_date_time = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The approvedStartDateTime.
   */
  java.lang.String getApprovedStartDateTime();
  /**
   * <pre>
   * Output only. The approved start date time in yyyy-mm-dd hh:mm:ss format.
   * </pre>
   *
   * <code>optional string approved_start_date_time = 30 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for approvedStartDateTime.
   */
  com.google.protobuf.ByteString
      getApprovedStartDateTimeBytes();

  /**
   * <pre>
   * Immutable. A purchase order number is a value that enables the user to help
   * them reference this budget in their monthly invoices.
   * </pre>
   *
   * <code>optional string proposed_purchase_order_number = 35 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the proposedPurchaseOrderNumber field is set.
   */
  boolean hasProposedPurchaseOrderNumber();
  /**
   * <pre>
   * Immutable. A purchase order number is a value that enables the user to help
   * them reference this budget in their monthly invoices.
   * </pre>
   *
   * <code>optional string proposed_purchase_order_number = 35 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The proposedPurchaseOrderNumber.
   */
  java.lang.String getProposedPurchaseOrderNumber();
  /**
   * <pre>
   * Immutable. A purchase order number is a value that enables the user to help
   * them reference this budget in their monthly invoices.
   * </pre>
   *
   * <code>optional string proposed_purchase_order_number = 35 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for proposedPurchaseOrderNumber.
   */
  com.google.protobuf.ByteString
      getProposedPurchaseOrderNumberBytes();

  /**
   * <pre>
   * Immutable. Notes associated with this budget.
   * </pre>
   *
   * <code>optional string proposed_notes = 36 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the proposedNotes field is set.
   */
  boolean hasProposedNotes();
  /**
   * <pre>
   * Immutable. Notes associated with this budget.
   * </pre>
   *
   * <code>optional string proposed_notes = 36 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The proposedNotes.
   */
  java.lang.String getProposedNotes();
  /**
   * <pre>
   * Immutable. Notes associated with this budget.
   * </pre>
   *
   * <code>optional string proposed_notes = 36 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for proposedNotes.
   */
  com.google.protobuf.ByteString
      getProposedNotesBytes();

  /**
   * <pre>
   * Output only. The date time when this account-level budget proposal was
   * created, which is not the same as its approval date time, if applicable.
   * </pre>
   *
   * <code>optional string creation_date_time = 37 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the creationDateTime field is set.
   */
  boolean hasCreationDateTime();
  /**
   * <pre>
   * Output only. The date time when this account-level budget proposal was
   * created, which is not the same as its approval date time, if applicable.
   * </pre>
   *
   * <code>optional string creation_date_time = 37 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The creationDateTime.
   */
  java.lang.String getCreationDateTime();
  /**
   * <pre>
   * Output only. The date time when this account-level budget proposal was
   * created, which is not the same as its approval date time, if applicable.
   * </pre>
   *
   * <code>optional string creation_date_time = 37 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for creationDateTime.
   */
  com.google.protobuf.ByteString
      getCreationDateTimeBytes();

  /**
   * <pre>
   * Output only. The date time when this account-level budget was approved, if
   * applicable.
   * </pre>
   *
   * <code>optional string approval_date_time = 38 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the approvalDateTime field is set.
   */
  boolean hasApprovalDateTime();
  /**
   * <pre>
   * Output only. The date time when this account-level budget was approved, if
   * applicable.
   * </pre>
   *
   * <code>optional string approval_date_time = 38 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The approvalDateTime.
   */
  java.lang.String getApprovalDateTime();
  /**
   * <pre>
   * Output only. The date time when this account-level budget was approved, if
   * applicable.
   * </pre>
   *
   * <code>optional string approval_date_time = 38 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for approvalDateTime.
   */
  com.google.protobuf.ByteString
      getApprovalDateTimeBytes();

  /**
   * <pre>
   * Immutable. The proposed start date time in yyyy-mm-dd hh:mm:ss format.
   * </pre>
   *
   * <code>string proposed_start_date_time = 29 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the proposedStartDateTime field is set.
   */
  boolean hasProposedStartDateTime();
  /**
   * <pre>
   * Immutable. The proposed start date time in yyyy-mm-dd hh:mm:ss format.
   * </pre>
   *
   * <code>string proposed_start_date_time = 29 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The proposedStartDateTime.
   */
  java.lang.String getProposedStartDateTime();
  /**
   * <pre>
   * Immutable. The proposed start date time in yyyy-mm-dd hh:mm:ss format.
   * </pre>
   *
   * <code>string proposed_start_date_time = 29 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for proposedStartDateTime.
   */
  com.google.protobuf.ByteString
      getProposedStartDateTimeBytes();

  /**
   * <pre>
   * Immutable. The proposed start date time as a well-defined type, for
   * example, NOW.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.TimeTypeEnum.TimeType proposed_start_time_type = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the proposedStartTimeType field is set.
   */
  boolean hasProposedStartTimeType();
  /**
   * <pre>
   * Immutable. The proposed start date time as a well-defined type, for
   * example, NOW.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.TimeTypeEnum.TimeType proposed_start_time_type = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for proposedStartTimeType.
   */
  int getProposedStartTimeTypeValue();
  /**
   * <pre>
   * Immutable. The proposed start date time as a well-defined type, for
   * example, NOW.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.TimeTypeEnum.TimeType proposed_start_time_type = 7 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The proposedStartTimeType.
   */
  com.google.ads.googleads.v15.enums.TimeTypeEnum.TimeType getProposedStartTimeType();

  /**
   * <pre>
   * Immutable. The proposed end date time in yyyy-mm-dd hh:mm:ss format.
   * </pre>
   *
   * <code>string proposed_end_date_time = 31 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the proposedEndDateTime field is set.
   */
  boolean hasProposedEndDateTime();
  /**
   * <pre>
   * Immutable. The proposed end date time in yyyy-mm-dd hh:mm:ss format.
   * </pre>
   *
   * <code>string proposed_end_date_time = 31 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The proposedEndDateTime.
   */
  java.lang.String getProposedEndDateTime();
  /**
   * <pre>
   * Immutable. The proposed end date time in yyyy-mm-dd hh:mm:ss format.
   * </pre>
   *
   * <code>string proposed_end_date_time = 31 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for proposedEndDateTime.
   */
  com.google.protobuf.ByteString
      getProposedEndDateTimeBytes();

  /**
   * <pre>
   * Immutable. The proposed end date time as a well-defined type, for
   * example, FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.TimeTypeEnum.TimeType proposed_end_time_type = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the proposedEndTimeType field is set.
   */
  boolean hasProposedEndTimeType();
  /**
   * <pre>
   * Immutable. The proposed end date time as a well-defined type, for
   * example, FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.TimeTypeEnum.TimeType proposed_end_time_type = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for proposedEndTimeType.
   */
  int getProposedEndTimeTypeValue();
  /**
   * <pre>
   * Immutable. The proposed end date time as a well-defined type, for
   * example, FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.TimeTypeEnum.TimeType proposed_end_time_type = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The proposedEndTimeType.
   */
  com.google.ads.googleads.v15.enums.TimeTypeEnum.TimeType getProposedEndTimeType();

  /**
   * <pre>
   * Output only. The approved end date time in yyyy-mm-dd hh:mm:ss format.
   * </pre>
   *
   * <code>string approved_end_date_time = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the approvedEndDateTime field is set.
   */
  boolean hasApprovedEndDateTime();
  /**
   * <pre>
   * Output only. The approved end date time in yyyy-mm-dd hh:mm:ss format.
   * </pre>
   *
   * <code>string approved_end_date_time = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The approvedEndDateTime.
   */
  java.lang.String getApprovedEndDateTime();
  /**
   * <pre>
   * Output only. The approved end date time in yyyy-mm-dd hh:mm:ss format.
   * </pre>
   *
   * <code>string approved_end_date_time = 32 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for approvedEndDateTime.
   */
  com.google.protobuf.ByteString
      getApprovedEndDateTimeBytes();

  /**
   * <pre>
   * Output only. The approved end date time as a well-defined type, for
   * example, FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.TimeTypeEnum.TimeType approved_end_time_type = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the approvedEndTimeType field is set.
   */
  boolean hasApprovedEndTimeType();
  /**
   * <pre>
   * Output only. The approved end date time as a well-defined type, for
   * example, FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.TimeTypeEnum.TimeType approved_end_time_type = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for approvedEndTimeType.
   */
  int getApprovedEndTimeTypeValue();
  /**
   * <pre>
   * Output only. The approved end date time as a well-defined type, for
   * example, FOREVER.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.TimeTypeEnum.TimeType approved_end_time_type = 22 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The approvedEndTimeType.
   */
  com.google.ads.googleads.v15.enums.TimeTypeEnum.TimeType getApprovedEndTimeType();

  /**
   * <pre>
   * Immutable. The proposed spending limit in micros.  One million is
   * equivalent to one unit.
   * </pre>
   *
   * <code>int64 proposed_spending_limit_micros = 33 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the proposedSpendingLimitMicros field is set.
   */
  boolean hasProposedSpendingLimitMicros();
  /**
   * <pre>
   * Immutable. The proposed spending limit in micros.  One million is
   * equivalent to one unit.
   * </pre>
   *
   * <code>int64 proposed_spending_limit_micros = 33 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The proposedSpendingLimitMicros.
   */
  long getProposedSpendingLimitMicros();

  /**
   * <pre>
   * Immutable. The proposed spending limit as a well-defined type, for
   * example, INFINITE.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.SpendingLimitTypeEnum.SpendingLimitType proposed_spending_limit_type = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the proposedSpendingLimitType field is set.
   */
  boolean hasProposedSpendingLimitType();
  /**
   * <pre>
   * Immutable. The proposed spending limit as a well-defined type, for
   * example, INFINITE.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.SpendingLimitTypeEnum.SpendingLimitType proposed_spending_limit_type = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for proposedSpendingLimitType.
   */
  int getProposedSpendingLimitTypeValue();
  /**
   * <pre>
   * Immutable. The proposed spending limit as a well-defined type, for
   * example, INFINITE.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.SpendingLimitTypeEnum.SpendingLimitType proposed_spending_limit_type = 11 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The proposedSpendingLimitType.
   */
  com.google.ads.googleads.v15.enums.SpendingLimitTypeEnum.SpendingLimitType getProposedSpendingLimitType();

  /**
   * <pre>
   * Output only. The approved spending limit in micros.  One million is
   * equivalent to one unit.
   * </pre>
   *
   * <code>int64 approved_spending_limit_micros = 34 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the approvedSpendingLimitMicros field is set.
   */
  boolean hasApprovedSpendingLimitMicros();
  /**
   * <pre>
   * Output only. The approved spending limit in micros.  One million is
   * equivalent to one unit.
   * </pre>
   *
   * <code>int64 approved_spending_limit_micros = 34 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The approvedSpendingLimitMicros.
   */
  long getApprovedSpendingLimitMicros();

  /**
   * <pre>
   * Output only. The approved spending limit as a well-defined type, for
   * example, INFINITE.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.SpendingLimitTypeEnum.SpendingLimitType approved_spending_limit_type = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the approvedSpendingLimitType field is set.
   */
  boolean hasApprovedSpendingLimitType();
  /**
   * <pre>
   * Output only. The approved spending limit as a well-defined type, for
   * example, INFINITE.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.SpendingLimitTypeEnum.SpendingLimitType approved_spending_limit_type = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for approvedSpendingLimitType.
   */
  int getApprovedSpendingLimitTypeValue();
  /**
   * <pre>
   * Output only. The approved spending limit as a well-defined type, for
   * example, INFINITE.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.SpendingLimitTypeEnum.SpendingLimitType approved_spending_limit_type = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The approvedSpendingLimitType.
   */
  com.google.ads.googleads.v15.enums.SpendingLimitTypeEnum.SpendingLimitType getApprovedSpendingLimitType();

  com.google.ads.googleads.v15.resources.AccountBudgetProposal.ProposedStartTimeCase getProposedStartTimeCase();

  com.google.ads.googleads.v15.resources.AccountBudgetProposal.ProposedEndTimeCase getProposedEndTimeCase();

  com.google.ads.googleads.v15.resources.AccountBudgetProposal.ApprovedEndTimeCase getApprovedEndTimeCase();

  com.google.ads.googleads.v15.resources.AccountBudgetProposal.ProposedSpendingLimitCase getProposedSpendingLimitCase();

  com.google.ads.googleads.v15.resources.AccountBudgetProposal.ApprovedSpendingLimitCase getApprovedSpendingLimitCase();
}

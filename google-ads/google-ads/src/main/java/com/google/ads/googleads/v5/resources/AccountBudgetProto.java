// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/account_budget.proto

package com.google.ads.googleads.v5.resources;

public final class AccountBudgetProto {
  private AccountBudgetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_resources_AccountBudget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_AccountBudget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_resources_AccountBudget_PendingAccountBudgetProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_AccountBudget_PendingAccountBudgetProposal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v5/resources/acco" +
      "unt_budget.proto\022!google.ads.googleads.v" +
      "5.resources\032@google/ads/googleads/v5/enu" +
      "ms/account_budget_proposal_type.proto\0329g" +
      "oogle/ads/googleads/v5/enums/account_bud" +
      "get_status.proto\0327google/ads/googleads/v" +
      "5/enums/spending_limit_type.proto\032-googl" +
      "e/ads/googleads/v5/enums/time_type.proto" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\032\034google/api/annotat" +
      "ions.proto\"\200\024\n\rAccountBudget\022E\n\rresource" +
      "_name\030\001 \001(\tB.\340A\003\372A(\n&googleads.googleapi" +
      "s.com/AccountBudget\022\024\n\002id\030\027 \001(\003B\003\340A\003H\005\210\001" +
      "\001\022I\n\rbilling_setup\030\030 \001(\tB-\340A\003\372A\'\n%google" +
      "ads.googleapis.com/BillingSetupH\006\210\001\001\022_\n\006" +
      "status\030\004 \001(\0162J.google.ads.googleads.v5.e" +
      "nums.AccountBudgetStatusEnum.AccountBudg" +
      "etStatusB\003\340A\003\022\026\n\004name\030\031 \001(\tB\003\340A\003H\007\210\001\001\022*\n" +
      "\030proposed_start_date_time\030\032 \001(\tB\003\340A\003H\010\210\001" +
      "\001\022*\n\030approved_start_date_time\030\033 \001(\tB\003\340A\003" +
      "H\t\210\001\001\022%\n\030total_adjustments_micros\030! \001(\003B" +
      "\003\340A\003\022!\n\024amount_served_micros\030\" \001(\003B\003\340A\003\022" +
      "\'\n\025purchase_order_number\030# \001(\tB\003\340A\003H\n\210\001\001" +
      "\022\027\n\005notes\030$ \001(\tB\003\340A\003H\013\210\001\001\022l\n\020pending_pro" +
      "posal\030\026 \001(\0132M.google.ads.googleads.v5.re" +
      "sources.AccountBudget.PendingAccountBudg" +
      "etProposalB\003\340A\003\022%\n\026proposed_end_date_tim" +
      "e\030\034 \001(\tB\003\340A\003H\000\022[\n\026proposed_end_time_type" +
      "\030\t \001(\01624.google.ads.googleads.v5.enums.T" +
      "imeTypeEnum.TimeTypeB\003\340A\003H\000\022%\n\026approved_" +
      "end_date_time\030\035 \001(\tB\003\340A\003H\001\022[\n\026approved_e" +
      "nd_time_type\030\013 \001(\01624.google.ads.googlead" +
      "s.v5.enums.TimeTypeEnum.TimeTypeB\003\340A\003H\001\022" +
      "-\n\036proposed_spending_limit_micros\030\036 \001(\003B" +
      "\003\340A\003H\002\022s\n\034proposed_spending_limit_type\030\r" +
      " \001(\0162F.google.ads.googleads.v5.enums.Spe" +
      "ndingLimitTypeEnum.SpendingLimitTypeB\003\340A" +
      "\003H\002\022-\n\036approved_spending_limit_micros\030\037 " +
      "\001(\003B\003\340A\003H\003\022s\n\034approved_spending_limit_ty" +
      "pe\030\017 \001(\0162F.google.ads.googleads.v5.enums" +
      ".SpendingLimitTypeEnum.SpendingLimitType" +
      "B\003\340A\003H\003\022-\n\036adjusted_spending_limit_micro" +
      "s\030  \001(\003B\003\340A\003H\004\022s\n\034adjusted_spending_limi" +
      "t_type\030\021 \001(\0162F.google.ads.googleads.v5.e" +
      "nums.SpendingLimitTypeEnum.SpendingLimit" +
      "TypeB\003\340A\003H\004\032\251\006\n\034PendingAccountBudgetProp" +
      "osal\022\\\n\027account_budget_proposal\030\014 \001(\tB6\340" +
      "A\003\372A0\n.googleads.googleapis.com/AccountB" +
      "udgetProposalH\002\210\001\001\022r\n\rproposal_type\030\002 \001(" +
      "\0162V.google.ads.googleads.v5.enums.Accoun" +
      "tBudgetProposalTypeEnum.AccountBudgetPro" +
      "posalTypeB\003\340A\003\022\026\n\004name\030\r \001(\tB\003\340A\003H\003\210\001\001\022!" +
      "\n\017start_date_time\030\016 \001(\tB\003\340A\003H\004\210\001\001\022\'\n\025pur" +
      "chase_order_number\030\021 \001(\tB\003\340A\003H\005\210\001\001\022\027\n\005no" +
      "tes\030\022 \001(\tB\003\340A\003H\006\210\001\001\022$\n\022creation_date_tim" +
      "e\030\023 \001(\tB\003\340A\003H\007\210\001\001\022\034\n\rend_date_time\030\017 \001(\t" +
      "B\003\340A\003H\000\022R\n\rend_time_type\030\006 \001(\01624.google." +
      "ads.googleads.v5.enums.TimeTypeEnum.Time" +
      "TypeB\003\340A\003H\000\022$\n\025spending_limit_micros\030\020 \001" +
      "(\003B\003\340A\003H\001\022j\n\023spending_limit_type\030\010 \001(\0162F" +
      ".google.ads.googleads.v5.enums.SpendingL" +
      "imitTypeEnum.SpendingLimitTypeB\003\340A\003H\001B\n\n" +
      "\010end_timeB\020\n\016spending_limitB\032\n\030_account_" +
      "budget_proposalB\007\n\005_nameB\022\n\020_start_date_" +
      "timeB\030\n\026_purchase_order_numberB\010\n\006_notes" +
      "B\025\n\023_creation_date_time:a\352A^\n&googleads." +
      "googleapis.com/AccountBudget\0224customers/" +
      "{customer}/accountBudgets/{account_budge" +
      "t}B\023\n\021proposed_end_timeB\023\n\021approved_end_" +
      "timeB\031\n\027proposed_spending_limitB\031\n\027appro" +
      "ved_spending_limitB\031\n\027adjusted_spending_" +
      "limitB\005\n\003_idB\020\n\016_billing_setupB\007\n\005_nameB" +
      "\033\n\031_proposed_start_date_timeB\033\n\031_approve" +
      "d_start_date_timeB\030\n\026_purchase_order_num" +
      "berB\010\n\006_notesB\377\001\n%com.google.ads.googlea" +
      "ds.v5.resourcesB\022AccountBudgetProtoP\001ZJg" +
      "oogle.golang.org/genproto/googleapis/ads" +
      "/googleads/v5/resources;resources\242\002\003GAA\252" +
      "\002!Google.Ads.GoogleAds.V5.Resources\312\002!Go" +
      "ogle\\Ads\\GoogleAds\\V5\\Resources\352\002%Google" +
      "::Ads::GoogleAds::V5::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.enums.AccountBudgetProposalTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.AccountBudgetStatusProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.SpendingLimitTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.TimeTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_resources_AccountBudget_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_resources_AccountBudget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_AccountBudget_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "BillingSetup", "Status", "Name", "ProposedStartDateTime", "ApprovedStartDateTime", "TotalAdjustmentsMicros", "AmountServedMicros", "PurchaseOrderNumber", "Notes", "PendingProposal", "ProposedEndDateTime", "ProposedEndTimeType", "ApprovedEndDateTime", "ApprovedEndTimeType", "ProposedSpendingLimitMicros", "ProposedSpendingLimitType", "ApprovedSpendingLimitMicros", "ApprovedSpendingLimitType", "AdjustedSpendingLimitMicros", "AdjustedSpendingLimitType", "ProposedEndTime", "ApprovedEndTime", "ProposedSpendingLimit", "ApprovedSpendingLimit", "AdjustedSpendingLimit", "Id", "BillingSetup", "Name", "ProposedStartDateTime", "ApprovedStartDateTime", "PurchaseOrderNumber", "Notes", });
    internal_static_google_ads_googleads_v5_resources_AccountBudget_PendingAccountBudgetProposal_descriptor =
      internal_static_google_ads_googleads_v5_resources_AccountBudget_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v5_resources_AccountBudget_PendingAccountBudgetProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_AccountBudget_PendingAccountBudgetProposal_descriptor,
        new java.lang.String[] { "AccountBudgetProposal", "ProposalType", "Name", "StartDateTime", "PurchaseOrderNumber", "Notes", "CreationDateTime", "EndDateTime", "EndTimeType", "SpendingLimitMicros", "SpendingLimitType", "EndTime", "SpendingLimit", "AccountBudgetProposal", "Name", "StartDateTime", "PurchaseOrderNumber", "Notes", "CreationDateTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v5.enums.AccountBudgetProposalTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.AccountBudgetStatusProto.getDescriptor();
    com.google.ads.googleads.v5.enums.SpendingLimitTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.TimeTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

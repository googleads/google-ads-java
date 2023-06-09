// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/account_budget.proto

package com.google.ads.googleads.v14.resources;

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
    internal_static_google_ads_googleads_v14_resources_AccountBudget_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_AccountBudget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_AccountBudget_PendingAccountBudgetProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_AccountBudget_PendingAccountBudgetProposal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v14/resources/acc" +
      "ount_budget.proto\022\"google.ads.googleads." +
      "v14.resources\032Agoogle/ads/googleads/v14/" +
      "enums/account_budget_proposal_type.proto" +
      "\032:google/ads/googleads/v14/enums/account" +
      "_budget_status.proto\0328google/ads/googlea" +
      "ds/v14/enums/spending_limit_type.proto\032." +
      "google/ads/googleads/v14/enums/time_type" +
      ".proto\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\"\261\024\n\rAccountBu" +
      "dget\022F\n\rresource_name\030\001 \001(\tB/\342A\001\003\372A(\n&go" +
      "ogleads.googleapis.com/AccountBudget\022\025\n\002" +
      "id\030\027 \001(\003B\004\342A\001\003H\005\210\001\001\022J\n\rbilling_setup\030\030 \001" +
      "(\tB.\342A\001\003\372A\'\n%googleads.googleapis.com/Bi" +
      "llingSetupH\006\210\001\001\022a\n\006status\030\004 \001(\0162K.google" +
      ".ads.googleads.v14.enums.AccountBudgetSt" +
      "atusEnum.AccountBudgetStatusB\004\342A\001\003\022\027\n\004na" +
      "me\030\031 \001(\tB\004\342A\001\003H\007\210\001\001\022+\n\030proposed_start_da" +
      "te_time\030\032 \001(\tB\004\342A\001\003H\010\210\001\001\022+\n\030approved_sta" +
      "rt_date_time\030\033 \001(\tB\004\342A\001\003H\t\210\001\001\022&\n\030total_a" +
      "djustments_micros\030! \001(\003B\004\342A\001\003\022\"\n\024amount_" +
      "served_micros\030\" \001(\003B\004\342A\001\003\022(\n\025purchase_or" +
      "der_number\030# \001(\tB\004\342A\001\003H\n\210\001\001\022\030\n\005notes\030$ \001" +
      "(\tB\004\342A\001\003H\013\210\001\001\022n\n\020pending_proposal\030\026 \001(\0132" +
      "N.google.ads.googleads.v14.resources.Acc" +
      "ountBudget.PendingAccountBudgetProposalB" +
      "\004\342A\001\003\022&\n\026proposed_end_date_time\030\034 \001(\tB\004\342" +
      "A\001\003H\000\022]\n\026proposed_end_time_type\030\t \001(\01625." +
      "google.ads.googleads.v14.enums.TimeTypeE" +
      "num.TimeTypeB\004\342A\001\003H\000\022&\n\026approved_end_dat" +
      "e_time\030\035 \001(\tB\004\342A\001\003H\001\022]\n\026approved_end_tim" +
      "e_type\030\013 \001(\01625.google.ads.googleads.v14." +
      "enums.TimeTypeEnum.TimeTypeB\004\342A\001\003H\001\022.\n\036p" +
      "roposed_spending_limit_micros\030\036 \001(\003B\004\342A\001" +
      "\003H\002\022u\n\034proposed_spending_limit_type\030\r \001(" +
      "\0162G.google.ads.googleads.v14.enums.Spend" +
      "ingLimitTypeEnum.SpendingLimitTypeB\004\342A\001\003" +
      "H\002\022.\n\036approved_spending_limit_micros\030\037 \001" +
      "(\003B\004\342A\001\003H\003\022u\n\034approved_spending_limit_ty" +
      "pe\030\017 \001(\0162G.google.ads.googleads.v14.enum" +
      "s.SpendingLimitTypeEnum.SpendingLimitTyp" +
      "eB\004\342A\001\003H\003\022.\n\036adjusted_spending_limit_mic" +
      "ros\030  \001(\003B\004\342A\001\003H\004\022u\n\034adjusted_spending_l" +
      "imit_type\030\021 \001(\0162G.google.ads.googleads.v" +
      "14.enums.SpendingLimitTypeEnum.SpendingL" +
      "imitTypeB\004\342A\001\003H\004\032\267\006\n\034PendingAccountBudge" +
      "tProposal\022]\n\027account_budget_proposal\030\014 \001" +
      "(\tB7\342A\001\003\372A0\n.googleads.googleapis.com/Ac" +
      "countBudgetProposalH\002\210\001\001\022t\n\rproposal_typ" +
      "e\030\002 \001(\0162W.google.ads.googleads.v14.enums" +
      ".AccountBudgetProposalTypeEnum.AccountBu" +
      "dgetProposalTypeB\004\342A\001\003\022\027\n\004name\030\r \001(\tB\004\342A" +
      "\001\003H\003\210\001\001\022\"\n\017start_date_time\030\016 \001(\tB\004\342A\001\003H\004" +
      "\210\001\001\022(\n\025purchase_order_number\030\021 \001(\tB\004\342A\001\003" +
      "H\005\210\001\001\022\030\n\005notes\030\022 \001(\tB\004\342A\001\003H\006\210\001\001\022%\n\022creat" +
      "ion_date_time\030\023 \001(\tB\004\342A\001\003H\007\210\001\001\022\035\n\rend_da" +
      "te_time\030\017 \001(\tB\004\342A\001\003H\000\022T\n\rend_time_type\030\006" +
      " \001(\01625.google.ads.googleads.v14.enums.Ti" +
      "meTypeEnum.TimeTypeB\004\342A\001\003H\000\022%\n\025spending_" +
      "limit_micros\030\020 \001(\003B\004\342A\001\003H\001\022l\n\023spending_l" +
      "imit_type\030\010 \001(\0162G.google.ads.googleads.v" +
      "14.enums.SpendingLimitTypeEnum.SpendingL" +
      "imitTypeB\004\342A\001\003H\001B\n\n\010end_timeB\020\n\016spending" +
      "_limitB\032\n\030_account_budget_proposalB\007\n\005_n" +
      "ameB\022\n\020_start_date_timeB\030\n\026_purchase_ord" +
      "er_numberB\010\n\006_notesB\025\n\023_creation_date_ti" +
      "me:g\352Ad\n&googleads.googleapis.com/Accoun" +
      "tBudget\022:customers/{customer_id}/account" +
      "Budgets/{account_budget_id}B\023\n\021proposed_" +
      "end_timeB\023\n\021approved_end_timeB\031\n\027propose" +
      "d_spending_limitB\031\n\027approved_spending_li" +
      "mitB\031\n\027adjusted_spending_limitB\005\n\003_idB\020\n" +
      "\016_billing_setupB\007\n\005_nameB\033\n\031_proposed_st" +
      "art_date_timeB\033\n\031_approved_start_date_ti" +
      "meB\030\n\026_purchase_order_numberB\010\n\006_notesB\204" +
      "\002\n&com.google.ads.googleads.v14.resource" +
      "sB\022AccountBudgetProtoP\001ZKgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v14" +
      "/resources;resources\242\002\003GAA\252\002\"Google.Ads." +
      "GoogleAds.V14.Resources\312\002\"Google\\Ads\\Goo" +
      "gleAds\\V14\\Resources\352\002&Google::Ads::Goog" +
      "leAds::V14::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.enums.AccountBudgetProposalTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.AccountBudgetStatusProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.SpendingLimitTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.TimeTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_resources_AccountBudget_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_AccountBudget_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_AccountBudget_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "BillingSetup", "Status", "Name", "ProposedStartDateTime", "ApprovedStartDateTime", "TotalAdjustmentsMicros", "AmountServedMicros", "PurchaseOrderNumber", "Notes", "PendingProposal", "ProposedEndDateTime", "ProposedEndTimeType", "ApprovedEndDateTime", "ApprovedEndTimeType", "ProposedSpendingLimitMicros", "ProposedSpendingLimitType", "ApprovedSpendingLimitMicros", "ApprovedSpendingLimitType", "AdjustedSpendingLimitMicros", "AdjustedSpendingLimitType", "ProposedEndTime", "ApprovedEndTime", "ProposedSpendingLimit", "ApprovedSpendingLimit", "AdjustedSpendingLimit", "Id", "BillingSetup", "Name", "ProposedStartDateTime", "ApprovedStartDateTime", "PurchaseOrderNumber", "Notes", });
    internal_static_google_ads_googleads_v14_resources_AccountBudget_PendingAccountBudgetProposal_descriptor =
      internal_static_google_ads_googleads_v14_resources_AccountBudget_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_AccountBudget_PendingAccountBudgetProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_AccountBudget_PendingAccountBudgetProposal_descriptor,
        new java.lang.String[] { "AccountBudgetProposal", "ProposalType", "Name", "StartDateTime", "PurchaseOrderNumber", "Notes", "CreationDateTime", "EndDateTime", "EndTimeType", "SpendingLimitMicros", "SpendingLimitType", "EndTime", "SpendingLimit", "AccountBudgetProposal", "Name", "StartDateTime", "PurchaseOrderNumber", "Notes", "CreationDateTime", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v14.enums.AccountBudgetProposalTypeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.AccountBudgetStatusProto.getDescriptor();
    com.google.ads.googleads.v14.enums.SpendingLimitTypeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.TimeTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

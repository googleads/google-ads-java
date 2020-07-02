// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/account_budget_proposal.proto

package com.google.ads.googleads.v5.resources;

public final class AccountBudgetProposalProto {
  private AccountBudgetProposalProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_resources_AccountBudgetProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_AccountBudgetProposal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v5/resources/acco" +
      "unt_budget_proposal.proto\022!google.ads.go" +
      "ogleads.v5.resources\032Bgoogle/ads/googlea" +
      "ds/v5/enums/account_budget_proposal_stat" +
      "us.proto\032@google/ads/googleads/v5/enums/" +
      "account_budget_proposal_type.proto\0327goog" +
      "le/ads/googleads/v5/enums/spending_limit" +
      "_type.proto\032-google/ads/googleads/v5/enu" +
      "ms/time_type.proto\032\037google/api/field_beh" +
      "avior.proto\032\031google/api/resource.proto\032\036" +
      "google/protobuf/wrappers.proto\032\034google/a" +
      "pi/annotations.proto\"\245\020\n\025AccountBudgetPr" +
      "oposal\022M\n\rresource_name\030\001 \001(\tB6\340A\005\372A0\n.g" +
      "oogleads.googleapis.com/AccountBudgetPro" +
      "posal\022,\n\002id\030\016 \001(\0132\033.google.protobuf.Int6" +
      "4ValueB\003\340A\003\022b\n\rbilling_setup\030\002 \001(\0132\034.goo" +
      "gle.protobuf.StringValueB-\340A\005\372A\'\n%google" +
      "ads.googleapis.com/BillingSetup\022d\n\016accou" +
      "nt_budget\030\003 \001(\0132\034.google.protobuf.String" +
      "ValueB.\340A\005\372A(\n&googleads.googleapis.com/" +
      "AccountBudget\022r\n\rproposal_type\030\004 \001(\0162V.g" +
      "oogle.ads.googleads.v5.enums.AccountBudg" +
      "etProposalTypeEnum.AccountBudgetProposal" +
      "TypeB\003\340A\005\022o\n\006status\030\017 \001(\0162Z.google.ads.g" +
      "oogleads.v5.enums.AccountBudgetProposalS" +
      "tatusEnum.AccountBudgetProposalStatusB\003\340" +
      "A\003\0228\n\rproposed_name\030\005 \001(\0132\034.google.proto" +
      "buf.StringValueB\003\340A\005\022C\n\030approved_start_d" +
      "ate_time\030\024 \001(\0132\034.google.protobuf.StringV" +
      "alueB\003\340A\003\022I\n\036proposed_purchase_order_num" +
      "ber\030\014 \001(\0132\034.google.protobuf.StringValueB" +
      "\003\340A\005\0229\n\016proposed_notes\030\r \001(\0132\034.google.pr" +
      "otobuf.StringValueB\003\340A\005\022=\n\022creation_date" +
      "_time\030\020 \001(\0132\034.google.protobuf.StringValu" +
      "eB\003\340A\003\022=\n\022approval_date_time\030\021 \001(\0132\034.goo" +
      "gle.protobuf.StringValueB\003\340A\003\022E\n\030propose" +
      "d_start_date_time\030\022 \001(\0132\034.google.protobu" +
      "f.StringValueB\003\340A\005H\000\022]\n\030proposed_start_t" +
      "ime_type\030\007 \001(\01624.google.ads.googleads.v5" +
      ".enums.TimeTypeEnum.TimeTypeB\003\340A\005H\000\022C\n\026p" +
      "roposed_end_date_time\030\023 \001(\0132\034.google.pro" +
      "tobuf.StringValueB\003\340A\005H\001\022[\n\026proposed_end" +
      "_time_type\030\t \001(\01624.google.ads.googleads." +
      "v5.enums.TimeTypeEnum.TimeTypeB\003\340A\005H\001\022C\n" +
      "\026approved_end_date_time\030\025 \001(\0132\034.google.p" +
      "rotobuf.StringValueB\003\340A\003H\002\022[\n\026approved_e" +
      "nd_time_type\030\026 \001(\01624.google.ads.googlead" +
      "s.v5.enums.TimeTypeEnum.TimeTypeB\003\340A\003H\002\022" +
      "J\n\036proposed_spending_limit_micros\030\n \001(\0132" +
      "\033.google.protobuf.Int64ValueB\003\340A\005H\003\022s\n\034p" +
      "roposed_spending_limit_type\030\013 \001(\0162F.goog" +
      "le.ads.googleads.v5.enums.SpendingLimitT" +
      "ypeEnum.SpendingLimitTypeB\003\340A\005H\003\022J\n\036appr" +
      "oved_spending_limit_micros\030\027 \001(\0132\033.googl" +
      "e.protobuf.Int64ValueB\003\340A\003H\004\022s\n\034approved" +
      "_spending_limit_type\030\030 \001(\0162F.google.ads." +
      "googleads.v5.enums.SpendingLimitTypeEnum" +
      ".SpendingLimitTypeB\003\340A\003H\004:z\352Aw\n.googlead" +
      "s.googleapis.com/AccountBudgetProposal\022E" +
      "customers/{customer}/accountBudgetPropos" +
      "als/{account_budget_proposal}B\025\n\023propose" +
      "d_start_timeB\023\n\021proposed_end_timeB\023\n\021app" +
      "roved_end_timeB\031\n\027proposed_spending_limi" +
      "tB\031\n\027approved_spending_limitB\207\002\n%com.goo" +
      "gle.ads.googleads.v5.resourcesB\032AccountB" +
      "udgetProposalProtoP\001ZJgoogle.golang.org/" +
      "genproto/googleapis/ads/googleads/v5/res" +
      "ources;resources\242\002\003GAA\252\002!Google.Ads.Goog" +
      "leAds.V5.Resources\312\002!Google\\Ads\\GoogleAd" +
      "s\\V5\\Resources\352\002%Google::Ads::GoogleAds:" +
      ":V5::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.enums.AccountBudgetProposalStatusProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.AccountBudgetProposalTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.SpendingLimitTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.TimeTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_resources_AccountBudgetProposal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_resources_AccountBudgetProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_AccountBudgetProposal_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "BillingSetup", "AccountBudget", "ProposalType", "Status", "ProposedName", "ApprovedStartDateTime", "ProposedPurchaseOrderNumber", "ProposedNotes", "CreationDateTime", "ApprovalDateTime", "ProposedStartDateTime", "ProposedStartTimeType", "ProposedEndDateTime", "ProposedEndTimeType", "ApprovedEndDateTime", "ApprovedEndTimeType", "ProposedSpendingLimitMicros", "ProposedSpendingLimitType", "ApprovedSpendingLimitMicros", "ApprovedSpendingLimitType", "ProposedStartTime", "ProposedEndTime", "ApprovedEndTime", "ProposedSpendingLimit", "ApprovedSpendingLimit", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v5.enums.AccountBudgetProposalStatusProto.getDescriptor();
    com.google.ads.googleads.v5.enums.AccountBudgetProposalTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.SpendingLimitTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.TimeTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/account_budget_proposal_service.proto

package com.google.ads.googleads.v1.services;

public final class AccountBudgetProposalServiceProto {
  private AccountBudgetProposalServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetAccountBudgetProposalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetAccountBudgetProposalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateAccountBudgetProposalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateAccountBudgetProposalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_AccountBudgetProposalOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_AccountBudgetProposalOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateAccountBudgetProposalResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateAccountBudgetProposalResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateAccountBudgetProposalResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateAccountBudgetProposalResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nFgoogle/ads/googleads/v1/services/accou" +
      "nt_budget_proposal_service.proto\022 google" +
      ".ads.googleads.v1.services\032?google/ads/g" +
      "oogleads/v1/resources/account_budget_pro" +
      "posal.proto\032\034google/api/annotations.prot" +
      "o\032 google/protobuf/field_mask.proto\"8\n\037G" +
      "etAccountBudgetProposalRequest\022\025\n\rresour" +
      "ce_name\030\001 \001(\t\"\245\001\n\"MutateAccountBudgetPro" +
      "posalRequest\022\023\n\013customer_id\030\001 \001(\t\022S\n\tope" +
      "ration\030\002 \001(\0132@.google.ads.googleads.v1.s" +
      "ervices.AccountBudgetProposalOperation\022\025" +
      "\n\rvalidate_only\030\003 \001(\010\"\274\001\n\036AccountBudgetP" +
      "roposalOperation\022/\n\013update_mask\030\003 \001(\0132\032." +
      "google.protobuf.FieldMask\022J\n\006create\030\002 \001(" +
      "\01328.google.ads.googleads.v1.resources.Ac" +
      "countBudgetProposalH\000\022\020\n\006remove\030\001 \001(\tH\000B" +
      "\013\n\toperation\"z\n#MutateAccountBudgetPropo" +
      "salResponse\022S\n\006result\030\002 \001(\0132C.google.ads" +
      ".googleads.v1.services.MutateAccountBudg" +
      "etProposalResult\":\n!MutateAccountBudgetP" +
      "roposalResult\022\025\n\rresource_name\030\001 \001(\t2\357\003\n" +
      "\034AccountBudgetProposalService\022\331\001\n\030GetAcc" +
      "ountBudgetProposal\022A.google.ads.googlead" +
      "s.v1.services.GetAccountBudgetProposalRe" +
      "quest\0328.google.ads.googleads.v1.resource" +
      "s.AccountBudgetProposal\"@\202\323\344\223\002:\0228/v1/{re" +
      "source_name=customers/*/accountBudgetPro" +
      "posals/*}\022\362\001\n\033MutateAccountBudgetProposa" +
      "l\022D.google.ads.googleads.v1.services.Mut" +
      "ateAccountBudgetProposalRequest\032E.google" +
      ".ads.googleads.v1.services.MutateAccount" +
      "BudgetProposalResponse\"F\202\323\344\223\002@\";/v1/cust" +
      "omers/{customer_id=*}/accountBudgetPropo" +
      "sals:mutate:\001*B\210\002\n$com.google.ads.google" +
      "ads.v1.servicesB!AccountBudgetProposalSe" +
      "rviceProtoP\001ZHgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v1/services;se" +
      "rvices\242\002\003GAA\252\002 Google.Ads.GoogleAds.V1.S" +
      "ervices\312\002 Google\\Ads\\GoogleAds\\V1\\Servic" +
      "es\352\002$Google::Ads::GoogleAds::V1::Service" +
      "sb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.resources.AccountBudgetProposalProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetAccountBudgetProposalRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetAccountBudgetProposalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetAccountBudgetProposalRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_MutateAccountBudgetProposalRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_MutateAccountBudgetProposalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateAccountBudgetProposalRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", "ValidateOnly", });
    internal_static_google_ads_googleads_v1_services_AccountBudgetProposalOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_AccountBudgetProposalOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_AccountBudgetProposalOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v1_services_MutateAccountBudgetProposalResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_MutateAccountBudgetProposalResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateAccountBudgetProposalResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v1_services_MutateAccountBudgetProposalResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_MutateAccountBudgetProposalResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateAccountBudgetProposalResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.AccountBudgetProposalProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

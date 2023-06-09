// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/campaign_draft_service.proto

package com.google.ads.googleads.v14.services;

public final class CampaignDraftServiceProto {
  private CampaignDraftServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateCampaignDraftsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateCampaignDraftsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_PromoteCampaignDraftRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_PromoteCampaignDraftRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_CampaignDraftOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_CampaignDraftOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateCampaignDraftsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateCampaignDraftsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_MutateCampaignDraftResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_MutateCampaignDraftResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_ListCampaignDraftAsyncErrorsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_ListCampaignDraftAsyncErrorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_services_ListCampaignDraftAsyncErrorsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_services_ListCampaignDraftAsyncErrorsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v14/services/camp" +
      "aign_draft_service.proto\022!google.ads.goo" +
      "gleads.v14.services\032:google/ads/googlead" +
      "s/v14/enums/response_content_type.proto\032" +
      "7google/ads/googleads/v14/resources/camp" +
      "aign_draft.proto\032\034google/api/annotations" +
      ".proto\032\027google/api/client.proto\032\037google/" +
      "api/field_behavior.proto\032\031google/api/res" +
      "ource.proto\032#google/longrunning/operatio" +
      "ns.proto\032\033google/protobuf/empty.proto\032 g" +
      "oogle/protobuf/field_mask.proto\032\027google/" +
      "rpc/status.proto\"\251\002\n\033MutateCampaignDraft" +
      "sRequest\022\031\n\013customer_id\030\001 \001(\tB\004\342A\001\002\022S\n\no" +
      "perations\030\002 \003(\01329.google.ads.googleads.v" +
      "14.services.CampaignDraftOperationB\004\342A\001\002" +
      "\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidate_on" +
      "ly\030\004 \001(\010\022j\n\025response_content_type\030\005 \001(\0162" +
      "K.google.ads.googleads.v14.enums.Respons" +
      "eContentTypeEnum.ResponseContentType\"}\n\033" +
      "PromoteCampaignDraftRequest\022G\n\016campaign_" +
      "draft\030\001 \001(\tB/\342A\001\002\372A(\n&googleads.googleap" +
      "is.com/CampaignDraft\022\025\n\rvalidate_only\030\002 " +
      "\001(\010\"\237\002\n\026CampaignDraftOperation\022/\n\013update" +
      "_mask\030\004 \001(\0132\032.google.protobuf.FieldMask\022" +
      "C\n\006create\030\001 \001(\01321.google.ads.googleads.v" +
      "14.resources.CampaignDraftH\000\022C\n\006update\030\002" +
      " \001(\01321.google.ads.googleads.v14.resource" +
      "s.CampaignDraftH\000\022=\n\006remove\030\003 \001(\tB+\372A(\n&" +
      "googleads.googleapis.com/CampaignDraftH\000" +
      "B\013\n\toperation\"\240\001\n\034MutateCampaignDraftsRe" +
      "sponse\0221\n\025partial_failure_error\030\003 \001(\0132\022." +
      "google.rpc.Status\022M\n\007results\030\002 \003(\0132<.goo" +
      "gle.ads.googleads.v14.services.MutateCam" +
      "paignDraftResult\"\252\001\n\031MutateCampaignDraft" +
      "Result\022B\n\rresource_name\030\001 \001(\tB+\372A(\n&goog" +
      "leads.googleapis.com/CampaignDraft\022I\n\016ca" +
      "mpaign_draft\030\002 \001(\01321.google.ads.googlead" +
      "s.v14.resources.CampaignDraft\"\224\001\n#ListCa" +
      "mpaignDraftAsyncErrorsRequest\022F\n\rresourc" +
      "e_name\030\001 \001(\tB/\342A\001\002\372A(\n&googleads.googlea" +
      "pis.com/CampaignDraft\022\022\n\npage_token\030\002 \001(" +
      "\t\022\021\n\tpage_size\030\003 \001(\005\"c\n$ListCampaignDraf" +
      "tAsyncErrorsResponse\022\"\n\006errors\030\001 \003(\0132\022.g" +
      "oogle.rpc.Status\022\027\n\017next_page_token\030\002 \001(" +
      "\t2\340\006\n\024CampaignDraftService\022\361\001\n\024MutateCam" +
      "paignDrafts\022>.google.ads.googleads.v14.s" +
      "ervices.MutateCampaignDraftsRequest\032?.go" +
      "ogle.ads.googleads.v14.services.MutateCa" +
      "mpaignDraftsResponse\"X\332A\026customer_id,ope" +
      "rations\202\323\344\223\0029\"4/v14/customers/{customer_" +
      "id=*}/campaignDrafts:mutate:\001*\022\377\001\n\024Promo" +
      "teCampaignDraft\022>.google.ads.googleads.v" +
      "14.services.PromoteCampaignDraftRequest\032" +
      "\035.google.longrunning.Operation\"\207\001\312A.\n\025go" +
      "ogle.protobuf.Empty\022\025google.protobuf.Emp" +
      "ty\332A\016campaign_draft\202\323\344\223\002?\":/v14/{campaig" +
      "n_draft=customers/*/campaignDrafts/*}:pr" +
      "omote:\001*\022\212\002\n\034ListCampaignDraftAsyncError" +
      "s\022F.google.ads.googleads.v14.services.Li" +
      "stCampaignDraftAsyncErrorsRequest\032G.goog" +
      "le.ads.googleads.v14.services.ListCampai" +
      "gnDraftAsyncErrorsResponse\"Y\332A\rresource_" +
      "name\202\323\344\223\002C\022A/v14/{resource_name=customer" +
      "s/*/campaignDrafts/*}:listAsyncErrors\032E\312" +
      "A\030googleads.googleapis.com\322A\'https://www" +
      ".googleapis.com/auth/adwordsB\205\002\n%com.goo" +
      "gle.ads.googleads.v14.servicesB\031Campaign" +
      "DraftServiceProtoP\001ZIgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v14/ser" +
      "vices;services\242\002\003GAA\252\002!Google.Ads.Google" +
      "Ads.V14.Services\312\002!Google\\Ads\\GoogleAds\\" +
      "V14\\Services\352\002%Google::Ads::GoogleAds::V" +
      "14::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.resources.CampaignDraftProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_services_MutateCampaignDraftsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_services_MutateCampaignDraftsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateCampaignDraftsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v14_services_PromoteCampaignDraftRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v14_services_PromoteCampaignDraftRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_PromoteCampaignDraftRequest_descriptor,
        new java.lang.String[] { "CampaignDraft", "ValidateOnly", });
    internal_static_google_ads_googleads_v14_services_CampaignDraftOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v14_services_CampaignDraftOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_CampaignDraftOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v14_services_MutateCampaignDraftsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v14_services_MutateCampaignDraftsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateCampaignDraftsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v14_services_MutateCampaignDraftResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v14_services_MutateCampaignDraftResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_MutateCampaignDraftResult_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignDraft", });
    internal_static_google_ads_googleads_v14_services_ListCampaignDraftAsyncErrorsRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v14_services_ListCampaignDraftAsyncErrorsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_ListCampaignDraftAsyncErrorsRequest_descriptor,
        new java.lang.String[] { "ResourceName", "PageToken", "PageSize", });
    internal_static_google_ads_googleads_v14_services_ListCampaignDraftAsyncErrorsResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v14_services_ListCampaignDraftAsyncErrorsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_services_ListCampaignDraftAsyncErrorsResponse_descriptor,
        new java.lang.String[] { "Errors", "NextPageToken", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v14.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v14.resources.CampaignDraftProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

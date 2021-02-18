// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/batch_job_service.proto

package com.google.ads.googleads.v6.services;

public final class BatchJobServiceProto {
  private BatchJobServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateBatchJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateBatchJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_BatchJobOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_BatchJobOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateBatchJobResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateBatchJobResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateBatchJobResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateBatchJobResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_GetBatchJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_GetBatchJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_RunBatchJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_RunBatchJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_AddBatchJobOperationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_AddBatchJobOperationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_AddBatchJobOperationsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_AddBatchJobOperationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_ListBatchJobResultsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_ListBatchJobResultsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_ListBatchJobResultsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_ListBatchJobResultsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_BatchJobResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_BatchJobResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v6/services/batch" +
      "_job_service.proto\022 google.ads.googleads" +
      ".v6.services\0321google/ads/googleads/v6/re" +
      "sources/batch_job.proto\0329google/ads/goog" +
      "leads/v6/services/google_ads_service.pro" +
      "to\032\034google/api/annotations.proto\032\027google" +
      "/api/client.proto\032\037google/api/field_beha" +
      "vior.proto\032\031google/api/resource.proto\032#g" +
      "oogle/longrunning/operations.proto\032\027goog" +
      "le/rpc/status.proto\"~\n\025MutateBatchJobReq" +
      "uest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022K\n\toperat" +
      "ion\030\002 \001(\01323.google.ads.googleads.v6.serv" +
      "ices.BatchJobOperationB\003\340A\002\"_\n\021BatchJobO" +
      "peration\022=\n\006create\030\001 \001(\0132+.google.ads.go" +
      "ogleads.v6.resources.BatchJobH\000B\013\n\topera" +
      "tion\"`\n\026MutateBatchJobResponse\022F\n\006result" +
      "\030\001 \001(\01326.google.ads.googleads.v6.service" +
      "s.MutateBatchJobResult\"-\n\024MutateBatchJob" +
      "Result\022\025\n\rresource_name\030\001 \001(\t\"V\n\022GetBatc" +
      "hJobRequest\022@\n\rresource_name\030\001 \001(\tB)\340A\002\372" +
      "A#\n!googleads.googleapis.com/BatchJob\"V\n" +
      "\022RunBatchJobRequest\022@\n\rresource_name\030\001 \001" +
      "(\tB)\340A\002\372A#\n!googleads.googleapis.com/Bat" +
      "chJob\"\313\001\n\034AddBatchJobOperationsRequest\022@" +
      "\n\rresource_name\030\001 \001(\tB)\340A\002\372A#\n!googleads" +
      ".googleapis.com/BatchJob\022\026\n\016sequence_tok" +
      "en\030\002 \001(\t\022Q\n\021mutate_operations\030\003 \003(\01321.go" +
      "ogle.ads.googleads.v6.services.MutateOpe" +
      "rationB\003\340A\002\"V\n\035AddBatchJobOperationsResp" +
      "onse\022\030\n\020total_operations\030\001 \001(\003\022\033\n\023next_s" +
      "equence_token\030\002 \001(\t\"\205\001\n\032ListBatchJobResu" +
      "ltsRequest\022@\n\rresource_name\030\001 \001(\tB)\340A\002\372A" +
      "#\n!googleads.googleapis.com/BatchJob\022\022\n\n" +
      "page_token\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\"y\n\033L" +
      "istBatchJobResultsResponse\022A\n\007results\030\001 " +
      "\003(\01320.google.ads.googleads.v6.services.B" +
      "atchJobResult\022\027\n\017next_page_token\030\002 \001(\t\"\253" +
      "\001\n\016BatchJobResult\022\027\n\017operation_index\030\001 \001" +
      "(\003\022\\\n\031mutate_operation_response\030\002 \001(\01329." +
      "google.ads.googleads.v6.services.MutateO" +
      "perationResponse\022\"\n\006status\030\003 \001(\0132\022.googl" +
      "e.rpc.Status2\215\n\n\017BatchJobService\022\326\001\n\016Mut" +
      "ateBatchJob\0227.google.ads.googleads.v6.se" +
      "rvices.MutateBatchJobRequest\0328.google.ad" +
      "s.googleads.v6.services.MutateBatchJobRe" +
      "sponse\"Q\202\323\344\223\0023\"./v6/customers/{customer_" +
      "id=*}/batchJobs:mutate:\001*\332A\025customer_id," +
      "operation\022\265\001\n\013GetBatchJob\0224.google.ads.g" +
      "oogleads.v6.services.GetBatchJobRequest\032" +
      "+.google.ads.googleads.v6.resources.Batc" +
      "hJob\"C\202\323\344\223\002-\022+/v6/{resource_name=custome" +
      "rs/*/batchJobs/*}\332A\rresource_name\022\343\001\n\023Li" +
      "stBatchJobResults\022<.google.ads.googleads" +
      ".v6.services.ListBatchJobResultsRequest\032" +
      "=.google.ads.googleads.v6.services.ListB" +
      "atchJobResultsResponse\"O\202\323\344\223\0029\0227/v6/{res" +
      "ource_name=customers/*/batchJobs/*}:list" +
      "Results\332A\rresource_name\022\206\002\n\013RunBatchJob\022" +
      "4.google.ads.googleads.v6.services.RunBa" +
      "tchJobRequest\032\035.google.longrunning.Opera" +
      "tion\"\241\001\202\323\344\223\0024\"//v6/{resource_name=custom" +
      "ers/*/batchJobs/*}:run:\001*\332A\rresource_nam" +
      "e\312AT\n\025google.protobuf.Empty\022;google.ads." +
      "googleads.v6.resources.BatchJob.BatchJob" +
      "Metadata\022\262\002\n\025AddBatchJobOperations\022>.goo" +
      "gle.ads.googleads.v6.services.AddBatchJo" +
      "bOperationsRequest\032?.google.ads.googlead" +
      "s.v6.services.AddBatchJobOperationsRespo" +
      "nse\"\227\001\202\323\344\223\002>\"9/v6/{resource_name=custome" +
      "rs/*/batchJobs/*}:addOperations:\001*\332A.res" +
      "ource_name,sequence_token,mutate_operati" +
      "ons\332A\037resource_name,mutate_operations\032E\312" +
      "A\030googleads.googleapis.com\322A\'https://www" +
      ".googleapis.com/auth/adwordsB\373\001\n$com.goo" +
      "gle.ads.googleads.v6.servicesB\024BatchJobS" +
      "erviceProtoP\001ZHgoogle.golang.org/genprot" +
      "o/googleapis/ads/googleads/v6/services;s" +
      "ervices\242\002\003GAA\252\002 Google.Ads.GoogleAds.V6." +
      "Services\312\002 Google\\Ads\\GoogleAds\\V6\\Servi" +
      "ces\352\002$Google::Ads::GoogleAds::V6::Servic" +
      "esb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.resources.BatchJobProto.getDescriptor(),
          com.google.ads.googleads.v6.services.GoogleAdsServiceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_services_MutateBatchJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_services_MutateBatchJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateBatchJobRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", });
    internal_static_google_ads_googleads_v6_services_BatchJobOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_services_BatchJobOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_BatchJobOperation_descriptor,
        new java.lang.String[] { "Create", "Operation", });
    internal_static_google_ads_googleads_v6_services_MutateBatchJobResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v6_services_MutateBatchJobResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateBatchJobResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v6_services_MutateBatchJobResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v6_services_MutateBatchJobResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateBatchJobResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v6_services_GetBatchJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v6_services_GetBatchJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_GetBatchJobRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v6_services_RunBatchJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v6_services_RunBatchJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_RunBatchJobRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v6_services_AddBatchJobOperationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v6_services_AddBatchJobOperationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_AddBatchJobOperationsRequest_descriptor,
        new java.lang.String[] { "ResourceName", "SequenceToken", "MutateOperations", });
    internal_static_google_ads_googleads_v6_services_AddBatchJobOperationsResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v6_services_AddBatchJobOperationsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_AddBatchJobOperationsResponse_descriptor,
        new java.lang.String[] { "TotalOperations", "NextSequenceToken", });
    internal_static_google_ads_googleads_v6_services_ListBatchJobResultsRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v6_services_ListBatchJobResultsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_ListBatchJobResultsRequest_descriptor,
        new java.lang.String[] { "ResourceName", "PageToken", "PageSize", });
    internal_static_google_ads_googleads_v6_services_ListBatchJobResultsResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v6_services_ListBatchJobResultsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_ListBatchJobResultsResponse_descriptor,
        new java.lang.String[] { "Results", "NextPageToken", });
    internal_static_google_ads_googleads_v6_services_BatchJobResult_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_google_ads_googleads_v6_services_BatchJobResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_BatchJobResult_descriptor,
        new java.lang.String[] { "OperationIndex", "MutateOperationResponse", "Status", });
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
    com.google.ads.googleads.v6.resources.BatchJobProto.getDescriptor();
    com.google.ads.googleads.v6.services.GoogleAdsServiceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

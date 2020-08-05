// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/mutate_job_service.proto

package com.google.ads.googleads.v1.services;

public final class MutateJobServiceProto {
  private MutateJobServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_CreateMutateJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_CreateMutateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_CreateMutateJobResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_CreateMutateJobResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetMutateJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetMutateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_RunMutateJobRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_RunMutateJobRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_AddMutateJobOperationsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_AddMutateJobOperationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_AddMutateJobOperationsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_AddMutateJobOperationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_ListMutateJobResultsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_ListMutateJobResultsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_ListMutateJobResultsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_ListMutateJobResultsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateJobResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateJobResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v1/services/mutat" +
      "e_job_service.proto\022 google.ads.googlead" +
      "s.v1.services\0322google/ads/googleads/v1/r" +
      "esources/mutate_job.proto\0329google/ads/go" +
      "ogleads/v1/services/google_ads_service.p" +
      "roto\032\034google/api/annotations.proto\032\027goog" +
      "le/api/client.proto\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\032" +
      "#google/longrunning/operations.proto\032\027go" +
      "ogle/rpc/status.proto\"2\n\026CreateMutateJob" +
      "Request\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\"0\n\027Cre" +
      "ateMutateJobResponse\022\025\n\rresource_name\030\001 " +
      "\001(\t\"X\n\023GetMutateJobRequest\022A\n\rresource_n" +
      "ame\030\001 \001(\tB*\340A\002\372A$\n\"googleads.googleapis." +
      "com/MutateJob\"X\n\023RunMutateJobRequest\022A\n\r" +
      "resource_name\030\001 \001(\tB*\340A\002\372A$\n\"googleads.g" +
      "oogleapis.com/MutateJob\"\315\001\n\035AddMutateJob" +
      "OperationsRequest\022A\n\rresource_name\030\001 \001(\t" +
      "B*\340A\002\372A$\n\"googleads.googleapis.com/Mutat" +
      "eJob\022\026\n\016sequence_token\030\002 \001(\t\022Q\n\021mutate_o" +
      "perations\030\003 \003(\01321.google.ads.googleads.v" +
      "1.services.MutateOperationB\003\340A\002\"W\n\036AddMu" +
      "tateJobOperationsResponse\022\030\n\020total_opera" +
      "tions\030\001 \001(\003\022\033\n\023next_sequence_token\030\002 \001(\t" +
      "\"\207\001\n\033ListMutateJobResultsRequest\022A\n\rreso" +
      "urce_name\030\001 \001(\tB*\340A\002\372A$\n\"googleads.googl" +
      "eapis.com/MutateJob\022\022\n\npage_token\030\002 \001(\t\022" +
      "\021\n\tpage_size\030\003 \001(\005\"{\n\034ListMutateJobResul" +
      "tsResponse\022B\n\007results\030\001 \003(\01321.google.ads" +
      ".googleads.v1.services.MutateJobResult\022\027" +
      "\n\017next_page_token\030\002 \001(\t\"\254\001\n\017MutateJobRes" +
      "ult\022\027\n\017operation_index\030\001 \001(\003\022\\\n\031mutate_o" +
      "peration_response\030\002 \001(\01329.google.ads.goo" +
      "gleads.v1.services.MutateOperationRespon" +
      "se\022\"\n\006status\030\003 \001(\0132\022.google.rpc.Status2\357" +
      "\t\n\020MutateJobService\022\320\001\n\017CreateMutateJob\022" +
      "8.google.ads.googleads.v1.services.Creat" +
      "eMutateJobRequest\0329.google.ads.googleads" +
      ".v1.services.CreateMutateJobResponse\"H\202\323" +
      "\344\223\0024\"//v1/customers/{customer_id=*}/muta" +
      "teJobs:create:\001*\332A\013customer_id\022\271\001\n\014GetMu" +
      "tateJob\0225.google.ads.googleads.v1.servic" +
      "es.GetMutateJobRequest\032,.google.ads.goog" +
      "leads.v1.resources.MutateJob\"D\202\323\344\223\002.\022,/v" +
      "1/{resource_name=customers/*/mutateJobs/" +
      "*}\332A\rresource_name\022\347\001\n\024ListMutateJobResu" +
      "lts\022=.google.ads.googleads.v1.services.L" +
      "istMutateJobResultsRequest\032>.google.ads." +
      "googleads.v1.services.ListMutateJobResul" +
      "tsResponse\"P\202\323\344\223\002:\0228/v1/{resource_name=c" +
      "ustomers/*/mutateJobs/*}:listResults\332A\rr" +
      "esource_name\022\213\002\n\014RunMutateJob\0225.google.a" +
      "ds.googleads.v1.services.RunMutateJobReq" +
      "uest\032\035.google.longrunning.Operation\"\244\001\202\323" +
      "\344\223\0025\"0/v1/{resource_name=customers/*/mut" +
      "ateJobs/*}:run:\001*\332A\rresource_name\312AV\n\025go" +
      "ogle.protobuf.Empty\022=google.ads.googlead" +
      "s.v1.resources.MutateJob.MutateJobMetada" +
      "ta\022\266\002\n\026AddMutateJobOperations\022?.google.a" +
      "ds.googleads.v1.services.AddMutateJobOpe" +
      "rationsRequest\032@.google.ads.googleads.v1" +
      ".services.AddMutateJobOperationsResponse" +
      "\"\230\001\202\323\344\223\002?\":/v1/{resource_name=customers/" +
      "*/mutateJobs/*}:addOperations:\001*\332A.resou" +
      "rce_name,sequence_token,mutate_operation" +
      "s\332A\037resource_name,mutate_operations\032\033\312A\030" +
      "googleads.googleapis.comB\374\001\n$com.google." +
      "ads.googleads.v1.servicesB\025MutateJobServ" +
      "iceProtoP\001ZHgoogle.golang.org/genproto/g" +
      "oogleapis/ads/googleads/v1/services;serv" +
      "ices\242\002\003GAA\252\002 Google.Ads.GoogleAds.V1.Ser" +
      "vices\312\002 Google\\Ads\\GoogleAds\\V1\\Services" +
      "\352\002$Google::Ads::GoogleAds::V1::Servicesb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.resources.MutateJobProto.getDescriptor(),
          com.google.ads.googleads.v1.services.GoogleAdsServiceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v1_services_CreateMutateJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_CreateMutateJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_CreateMutateJobRequest_descriptor,
        new java.lang.String[] { "CustomerId", });
    internal_static_google_ads_googleads_v1_services_CreateMutateJobResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_CreateMutateJobResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_CreateMutateJobResponse_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_GetMutateJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_GetMutateJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetMutateJobRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_RunMutateJobRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_RunMutateJobRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_RunMutateJobRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_AddMutateJobOperationsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_AddMutateJobOperationsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_AddMutateJobOperationsRequest_descriptor,
        new java.lang.String[] { "ResourceName", "SequenceToken", "MutateOperations", });
    internal_static_google_ads_googleads_v1_services_AddMutateJobOperationsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v1_services_AddMutateJobOperationsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_AddMutateJobOperationsResponse_descriptor,
        new java.lang.String[] { "TotalOperations", "NextSequenceToken", });
    internal_static_google_ads_googleads_v1_services_ListMutateJobResultsRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v1_services_ListMutateJobResultsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_ListMutateJobResultsRequest_descriptor,
        new java.lang.String[] { "ResourceName", "PageToken", "PageSize", });
    internal_static_google_ads_googleads_v1_services_ListMutateJobResultsResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v1_services_ListMutateJobResultsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_ListMutateJobResultsResponse_descriptor,
        new java.lang.String[] { "Results", "NextPageToken", });
    internal_static_google_ads_googleads_v1_services_MutateJobResult_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v1_services_MutateJobResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateJobResult_descriptor,
        new java.lang.String[] { "OperationIndex", "MutateOperationResponse", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.MutateJobProto.getDescriptor();
    com.google.ads.googleads.v1.services.GoogleAdsServiceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
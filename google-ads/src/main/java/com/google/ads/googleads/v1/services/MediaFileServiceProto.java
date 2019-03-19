// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/media_file_service.proto

package com.google.ads.googleads.v1.services;

public final class MediaFileServiceProto {
  private MediaFileServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetMediaFileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetMediaFileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateMediaFilesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateMediaFilesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MediaFileOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MediaFileOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateMediaFilesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateMediaFilesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateMediaFileResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateMediaFileResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v1/services/media" +
      "_file_service.proto\022 google.ads.googlead" +
      "s.v1.services\0322google/ads/googleads/v1/r" +
      "esources/media_file.proto\032\034google/api/an" +
      "notations.proto\032\036google/protobuf/wrapper" +
      "s.proto\032\027google/rpc/status.proto\",\n\023GetM" +
      "ediaFileRequest\022\025\n\rresource_name\030\001 \001(\t\"\250" +
      "\001\n\027MutateMediaFilesRequest\022\023\n\013customer_i" +
      "d\030\001 \001(\t\022H\n\noperations\030\002 \003(\01324.google.ads" +
      ".googleads.v1.services.MediaFileOperatio" +
      "n\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidate_o" +
      "nly\030\004 \001(\010\"a\n\022MediaFileOperation\022>\n\006creat" +
      "e\030\001 \001(\0132,.google.ads.googleads.v1.resour" +
      "ces.MediaFileH\000B\013\n\toperation\"\227\001\n\030MutateM" +
      "ediaFilesResponse\0221\n\025partial_failure_err" +
      "or\030\003 \001(\0132\022.google.rpc.Status\022H\n\007results\030" +
      "\002 \003(\01327.google.ads.googleads.v1.services" +
      ".MutateMediaFileResult\".\n\025MutateMediaFil" +
      "eResult\022\025\n\rresource_name\030\001 \001(\t2\206\003\n\020Media" +
      "FileService\022\251\001\n\014GetMediaFile\0225.google.ad" +
      "s.googleads.v1.services.GetMediaFileRequ" +
      "est\032,.google.ads.googleads.v1.resources." +
      "MediaFile\"4\202\323\344\223\002.\022,/v1/{resource_name=cu" +
      "stomers/*/mediaFiles/*}\022\305\001\n\020MutateMediaF" +
      "iles\0229.google.ads.googleads.v1.services." +
      "MutateMediaFilesRequest\032:.google.ads.goo" +
      "gleads.v1.services.MutateMediaFilesRespo" +
      "nse\":\202\323\344\223\0024\"//v1/customers/{customer_id=" +
      "*}/mediaFiles:mutate:\001*B\374\001\n$com.google.a" +
      "ds.googleads.v1.servicesB\025MediaFileServi" +
      "ceProtoP\001ZHgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v1/services;servi" +
      "ces\242\002\003GAA\252\002 Google.Ads.GoogleAds.V1.Serv" +
      "ices\312\002 Google\\Ads\\GoogleAds\\V1\\Services\352" +
      "\002$Google::Ads::GoogleAds::V1::Servicesb\006" +
      "proto3"
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
          com.google.ads.googleads.v1.resources.MediaFileProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetMediaFileRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetMediaFileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetMediaFileRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_MutateMediaFilesRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_MutateMediaFilesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateMediaFilesRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v1_services_MediaFileOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_MediaFileOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MediaFileOperation_descriptor,
        new java.lang.String[] { "Create", "Operation", });
    internal_static_google_ads_googleads_v1_services_MutateMediaFilesResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_MutateMediaFilesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateMediaFilesResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v1_services_MutateMediaFileResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_MutateMediaFileResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateMediaFileResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.MediaFileProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

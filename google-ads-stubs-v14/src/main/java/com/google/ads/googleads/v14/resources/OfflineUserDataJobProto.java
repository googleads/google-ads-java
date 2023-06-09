// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/offline_user_data_job.proto

package com.google.ads.googleads.v14.resources;

public final class OfflineUserDataJobProto {
  private OfflineUserDataJobProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_OfflineUserDataJob_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_OfflineUserDataJob_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_OfflineUserDataJobMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_OfflineUserDataJobMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v14/resources/off" +
      "line_user_data_job.proto\022\"google.ads.goo" +
      "gleads.v14.resources\0327google/ads/googlea" +
      "ds/v14/common/offline_user_data.proto\032Ig" +
      "oogle/ads/googleads/v14/enums/offline_us" +
      "er_data_job_failure_reason.proto\032Kgoogle" +
      "/ads/googleads/v14/enums/offline_user_da" +
      "ta_job_match_rate_range.proto\032Agoogle/ad" +
      "s/googleads/v14/enums/offline_user_data_" +
      "job_status.proto\032?google/ads/googleads/v" +
      "14/enums/offline_user_data_job_type.prot" +
      "o\032\037google/api/field_behavior.proto\032\031goog" +
      "le/api/resource.proto\"\300\007\n\022OfflineUserDat" +
      "aJob\022K\n\rresource_name\030\001 \001(\tB4\342A\001\005\372A-\n+go" +
      "ogleads.googleapis.com/OfflineUserDataJo" +
      "b\022\025\n\002id\030\t \001(\003B\004\342A\001\003H\001\210\001\001\022\036\n\013external_id\030" +
      "\n \001(\003B\004\342A\001\005H\002\210\001\001\022e\n\004type\030\004 \001(\0162Q.google." +
      "ads.googleads.v14.enums.OfflineUserDataJ" +
      "obTypeEnum.OfflineUserDataJobTypeB\004\342A\001\005\022" +
      "k\n\006status\030\005 \001(\0162U.google.ads.googleads.v" +
      "14.enums.OfflineUserDataJobStatusEnum.Of" +
      "flineUserDataJobStatusB\004\342A\001\003\022\201\001\n\016failure" +
      "_reason\030\006 \001(\0162c.google.ads.googleads.v14" +
      ".enums.OfflineUserDataJobFailureReasonEn" +
      "um.OfflineUserDataJobFailureReasonB\004\342A\001\003" +
      "\022`\n\022operation_metadata\030\013 \001(\0132>.google.ad" +
      "s.googleads.v14.resources.OfflineUserDat" +
      "aJobMetadataB\004\342A\001\003\022q\n!customer_match_use" +
      "r_list_metadata\030\007 \001(\0132>.google.ads.googl" +
      "eads.v14.common.CustomerMatchUserListMet" +
      "adataB\004\342A\001\005H\000\022Y\n\024store_sales_metadata\030\010 " +
      "\001(\01323.google.ads.googleads.v14.common.St" +
      "oreSalesMetadataB\004\342A\001\005H\000:{\352Ax\n+googleads" +
      ".googleapis.com/OfflineUserDataJob\022Icust" +
      "omers/{customer_id}/offlineUserDataJobs/" +
      "{offline_user_data_update_id}B\n\n\010metadat" +
      "aB\005\n\003_idB\016\n\014_external_id\"\244\001\n\032OfflineUser" +
      "DataJobMetadata\022\205\001\n\020match_rate_range\030\001 \001" +
      "(\0162e.google.ads.googleads.v14.enums.Offl" +
      "ineUserDataJobMatchRateRangeEnum.Offline" +
      "UserDataJobMatchRateRangeB\004\342A\001\003B\211\002\n&com." +
      "google.ads.googleads.v14.resourcesB\027Offl" +
      "ineUserDataJobProtoP\001ZKgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v14/r" +
      "esources;resources\242\002\003GAA\252\002\"Google.Ads.Go" +
      "ogleAds.V14.Resources\312\002\"Google\\Ads\\Googl" +
      "eAds\\V14\\Resources\352\002&Google::Ads::Google" +
      "Ads::V14::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.common.OfflineUserDataProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.OfflineUserDataJobFailureReasonProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.OfflineUserDataJobMatchRateRangeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.OfflineUserDataJobStatusProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.OfflineUserDataJobTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_resources_OfflineUserDataJob_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_OfflineUserDataJob_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_OfflineUserDataJob_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "ExternalId", "Type", "Status", "FailureReason", "OperationMetadata", "CustomerMatchUserListMetadata", "StoreSalesMetadata", "Metadata", "Id", "ExternalId", });
    internal_static_google_ads_googleads_v14_resources_OfflineUserDataJobMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v14_resources_OfflineUserDataJobMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_OfflineUserDataJobMetadata_descriptor,
        new java.lang.String[] { "MatchRateRange", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v14.common.OfflineUserDataProto.getDescriptor();
    com.google.ads.googleads.v14.enums.OfflineUserDataJobFailureReasonProto.getDescriptor();
    com.google.ads.googleads.v14.enums.OfflineUserDataJobMatchRateRangeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.OfflineUserDataJobStatusProto.getDescriptor();
    com.google.ads.googleads.v14.enums.OfflineUserDataJobTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

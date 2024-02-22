// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/experiment_arm_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.services;

public final class ExperimentArmServiceProto {
  private ExperimentArmServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateExperimentArmsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateExperimentArmsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_ExperimentArmOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_ExperimentArmOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateExperimentArmsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateExperimentArmsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateExperimentArmResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateExperimentArmResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v15/services/expe" +
      "riment_arm_service.proto\022!google.ads.goo" +
      "gleads.v15.services\032:google/ads/googlead" +
      "s/v15/enums/response_content_type.proto\032" +
      "7google/ads/googleads/v15/resources/expe" +
      "riment_arm.proto\032\034google/api/annotations" +
      ".proto\032\027google/api/client.proto\032\037google/" +
      "api/field_behavior.proto\032\031google/api/res" +
      "ource.proto\032 google/protobuf/field_mask." +
      "proto\032\027google/rpc/status.proto\"\247\002\n\033Mutat" +
      "eExperimentArmsRequest\022\030\n\013customer_id\030\001 " +
      "\001(\tB\003\340A\002\022R\n\noperations\030\002 \003(\01329.google.ad" +
      "s.googleads.v15.services.ExperimentArmOp" +
      "erationB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n" +
      "\rvalidate_only\030\004 \001(\010\022j\n\025response_content" +
      "_type\030\005 \001(\0162K.google.ads.googleads.v15.e" +
      "nums.ResponseContentTypeEnum.ResponseCon" +
      "tentType\"\237\002\n\026ExperimentArmOperation\022/\n\013u" +
      "pdate_mask\030\004 \001(\0132\032.google.protobuf.Field" +
      "Mask\022C\n\006create\030\001 \001(\01321.google.ads.google" +
      "ads.v15.resources.ExperimentArmH\000\022C\n\006upd" +
      "ate\030\002 \001(\01321.google.ads.googleads.v15.res" +
      "ources.ExperimentArmH\000\022=\n\006remove\030\003 \001(\tB+" +
      "\372A(\n&googleads.googleapis.com/Experiment" +
      "ArmH\000B\013\n\toperation\"\240\001\n\034MutateExperimentA" +
      "rmsResponse\0221\n\025partial_failure_error\030\001 \001" +
      "(\0132\022.google.rpc.Status\022M\n\007results\030\002 \003(\0132" +
      "<.google.ads.googleads.v15.services.Muta" +
      "teExperimentArmResult\"\252\001\n\031MutateExperime" +
      "ntArmResult\022B\n\rresource_name\030\001 \001(\tB+\372A(\n" +
      "&googleads.googleapis.com/ExperimentArm\022" +
      "I\n\016experiment_arm\030\002 \001(\01321.google.ads.goo" +
      "gleads.v15.resources.ExperimentArm2\321\002\n\024E" +
      "xperimentArmService\022\361\001\n\024MutateExperiment" +
      "Arms\022>.google.ads.googleads.v15.services" +
      ".MutateExperimentArmsRequest\032?.google.ad" +
      "s.googleads.v15.services.MutateExperimen" +
      "tArmsResponse\"X\332A\026customer_id,operations" +
      "\202\323\344\223\0029\"4/v15/customers/{customer_id=*}/e" +
      "xperimentArms:mutate:\001*\032E\312A\030googleads.go" +
      "ogleapis.com\322A\'https://www.googleapis.co" +
      "m/auth/adwordsB\205\002\n%com.google.ads.google" +
      "ads.v15.servicesB\031ExperimentArmServicePr" +
      "otoP\001ZIgoogle.golang.org/genproto/google" +
      "apis/ads/googleads/v15/services;services" +
      "\242\002\003GAA\252\002!Google.Ads.GoogleAds.V15.Servic" +
      "es\312\002!Google\\Ads\\GoogleAds\\V15\\Services\352\002" +
      "%Google::Ads::GoogleAds::V15::Servicesb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v15.resources.ExperimentArmProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_services_MutateExperimentArmsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_services_MutateExperimentArmsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateExperimentArmsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v15_services_ExperimentArmOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v15_services_ExperimentArmOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_ExperimentArmOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v15_services_MutateExperimentArmsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v15_services_MutateExperimentArmsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateExperimentArmsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v15_services_MutateExperimentArmResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v15_services_MutateExperimentArmResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateExperimentArmResult_descriptor,
        new java.lang.String[] { "ResourceName", "ExperimentArm", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v15.resources.ExperimentArmProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

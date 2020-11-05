// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/ad_group_criterion_service.proto

package com.google.ads.googleads.v4.services;

public final class AdGroupCriterionServiceProto {
  private AdGroupCriterionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_GetAdGroupCriterionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_GetAdGroupCriterionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateAdGroupCriteriaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateAdGroupCriteriaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_AdGroupCriterionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_AdGroupCriterionOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateAdGroupCriteriaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateAdGroupCriteriaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateAdGroupCriterionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateAdGroupCriterionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v4/services/ad_gr" +
      "oup_criterion_service.proto\022 google.ads." +
      "googleads.v4.services\032+google/ads/google" +
      "ads/v4/common/policy.proto\032:google/ads/g" +
      "oogleads/v4/resources/ad_group_criterion" +
      ".proto\032\034google/api/annotations.proto\032\027go" +
      "ogle/api/client.proto\032\037google/api/field_" +
      "behavior.proto\032\031google/api/resource.prot" +
      "o\032 google/protobuf/field_mask.proto\032\027goo" +
      "gle/rpc/status.proto\"f\n\032GetAdGroupCriter" +
      "ionRequest\022H\n\rresource_name\030\001 \001(\tB1\340A\002\372A" +
      "+\n)googleads.googleapis.com/AdGroupCrite" +
      "rion\"\276\001\n\034MutateAdGroupCriteriaRequest\022\030\n" +
      "\013customer_id\030\001 \001(\tB\003\340A\002\022T\n\noperations\030\002 " +
      "\003(\0132;.google.ads.googleads.v4.services.A" +
      "dGroupCriterionOperationB\003\340A\002\022\027\n\017partial" +
      "_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\323\002" +
      "\n\031AdGroupCriterionOperation\022/\n\013update_ma" +
      "sk\030\004 \001(\0132\032.google.protobuf.FieldMask\022X\n\034" +
      "exempt_policy_violation_keys\030\005 \003(\01322.goo" +
      "gle.ads.googleads.v4.common.PolicyViolat" +
      "ionKey\022E\n\006create\030\001 \001(\01323.google.ads.goog" +
      "leads.v4.resources.AdGroupCriterionH\000\022E\n" +
      "\006update\030\002 \001(\01323.google.ads.googleads.v4." +
      "resources.AdGroupCriterionH\000\022\020\n\006remove\030\003" +
      " \001(\tH\000B\013\n\toperation\"\243\001\n\035MutateAdGroupCri" +
      "teriaResponse\0221\n\025partial_failure_error\030\003" +
      " \001(\0132\022.google.rpc.Status\022O\n\007results\030\002 \003(" +
      "\0132>.google.ads.googleads.v4.services.Mut" +
      "ateAdGroupCriterionResult\"5\n\034MutateAdGro" +
      "upCriterionResult\022\025\n\rresource_name\030\001 \001(\t" +
      "2\201\004\n\027AdGroupCriterionService\022\323\001\n\023GetAdGr" +
      "oupCriterion\022<.google.ads.googleads.v4.s" +
      "ervices.GetAdGroupCriterionRequest\0323.goo" +
      "gle.ads.googleads.v4.resources.AdGroupCr" +
      "iterion\"I\202\323\344\223\0023\0221/v4/{resource_name=cust" +
      "omers/*/adGroupCriteria/*}\332A\rresource_na" +
      "me\022\362\001\n\025MutateAdGroupCriteria\022>.google.ad" +
      "s.googleads.v4.services.MutateAdGroupCri" +
      "teriaRequest\032?.google.ads.googleads.v4.s" +
      "ervices.MutateAdGroupCriteriaResponse\"X\202" +
      "\323\344\223\0029\"4/v4/customers/{customer_id=*}/adG" +
      "roupCriteria:mutate:\001*\332A\026customer_id,ope" +
      "rations\032\033\312A\030googleads.googleapis.comB\203\002\n" +
      "$com.google.ads.googleads.v4.servicesB\034A" +
      "dGroupCriterionServiceProtoP\001ZHgoogle.go" +
      "lang.org/genproto/googleapis/ads/googlea" +
      "ds/v4/services;services\242\002\003GAA\252\002 Google.A" +
      "ds.GoogleAds.V4.Services\312\002 Google\\Ads\\Go" +
      "ogleAds\\V4\\Services\352\002$Google::Ads::Googl" +
      "eAds::V4::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v4.resources.AdGroupCriterionProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_services_GetAdGroupCriterionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_services_GetAdGroupCriterionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_GetAdGroupCriterionRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v4_services_MutateAdGroupCriteriaRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v4_services_MutateAdGroupCriteriaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateAdGroupCriteriaRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v4_services_AdGroupCriterionOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v4_services_AdGroupCriterionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_AdGroupCriterionOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "ExemptPolicyViolationKeys", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v4_services_MutateAdGroupCriteriaResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v4_services_MutateAdGroupCriteriaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateAdGroupCriteriaResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v4_services_MutateAdGroupCriterionResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v4_services_MutateAdGroupCriterionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateAdGroupCriterionResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v4.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v4.resources.AdGroupCriterionProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

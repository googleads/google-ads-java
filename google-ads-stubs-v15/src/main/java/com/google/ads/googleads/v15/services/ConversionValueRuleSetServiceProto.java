// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/conversion_value_rule_set_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.services;

public final class ConversionValueRuleSetServiceProto {
  private ConversionValueRuleSetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateConversionValueRuleSetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateConversionValueRuleSetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_ConversionValueRuleSetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_ConversionValueRuleSetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateConversionValueRuleSetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateConversionValueRuleSetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateConversionValueRuleSetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateConversionValueRuleSetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIgoogle/ads/googleads/v15/services/conv" +
      "ersion_value_rule_set_service.proto\022!goo" +
      "gle.ads.googleads.v15.services\032:google/a" +
      "ds/googleads/v15/enums/response_content_" +
      "type.proto\032Bgoogle/ads/googleads/v15/res" +
      "ources/conversion_value_rule_set.proto\032\034" +
      "google/api/annotations.proto\032\027google/api" +
      "/client.proto\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\032 googl" +
      "e/protobuf/field_mask.proto\032\027google/rpc/" +
      "status.proto\"\271\002\n$MutateConversionValueRu" +
      "leSetsRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022" +
      "[\n\noperations\030\002 \003(\0132B.google.ads.googlea" +
      "ds.v15.services.ConversionValueRuleSetOp" +
      "erationB\003\340A\002\022\027\n\017partial_failure\030\005 \001(\010\022\025\n" +
      "\rvalidate_only\030\003 \001(\010\022j\n\025response_content" +
      "_type\030\004 \001(\0162K.google.ads.googleads.v15.e" +
      "nums.ResponseContentTypeEnum.ResponseCon" +
      "tentType\"\303\002\n\037ConversionValueRuleSetOpera" +
      "tion\022/\n\013update_mask\030\004 \001(\0132\032.google.proto" +
      "buf.FieldMask\022L\n\006create\030\001 \001(\0132:.google.a" +
      "ds.googleads.v15.resources.ConversionVal" +
      "ueRuleSetH\000\022L\n\006update\030\002 \001(\0132:.google.ads" +
      ".googleads.v15.resources.ConversionValue" +
      "RuleSetH\000\022F\n\006remove\030\003 \001(\tB4\372A1\n/googlead" +
      "s.googleapis.com/ConversionValueRuleSetH" +
      "\000B\013\n\toperation\"\262\001\n%MutateConversionValue" +
      "RuleSetsResponse\022V\n\007results\030\001 \003(\0132E.goog" +
      "le.ads.googleads.v15.services.MutateConv" +
      "ersionValueRuleSetResult\0221\n\025partial_fail" +
      "ure_error\030\002 \001(\0132\022.google.rpc.Status\"\320\001\n\"" +
      "MutateConversionValueRuleSetResult\022K\n\rre" +
      "source_name\030\001 \001(\tB4\372A1\n/googleads.google" +
      "apis.com/ConversionValueRuleSet\022]\n\031conve" +
      "rsion_value_rule_set\030\002 \001(\0132:.google.ads." +
      "googleads.v15.resources.ConversionValueR" +
      "uleSet2\376\002\n\035ConversionValueRuleSetService" +
      "\022\225\002\n\035MutateConversionValueRuleSets\022G.goo" +
      "gle.ads.googleads.v15.services.MutateCon" +
      "versionValueRuleSetsRequest\032H.google.ads" +
      ".googleads.v15.services.MutateConversion" +
      "ValueRuleSetsResponse\"a\332A\026customer_id,op" +
      "erations\202\323\344\223\002B\"=/v15/customers/{customer" +
      "_id=*}/conversionValueRuleSets:mutate:\001*" +
      "\032E\312A\030googleads.googleapis.com\322A\'https://" +
      "www.googleapis.com/auth/adwordsB\216\002\n%com." +
      "google.ads.googleads.v15.servicesB\"Conve" +
      "rsionValueRuleSetServiceProtoP\001ZIgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v15/services;services\242\002\003GAA\252\002!Googl" +
      "e.Ads.GoogleAds.V15.Services\312\002!Google\\Ad" +
      "s\\GoogleAds\\V15\\Services\352\002%Google::Ads::" +
      "GoogleAds::V15::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v15.resources.ConversionValueRuleSetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_services_MutateConversionValueRuleSetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_services_MutateConversionValueRuleSetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateConversionValueRuleSetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v15_services_ConversionValueRuleSetOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v15_services_ConversionValueRuleSetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_ConversionValueRuleSetOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v15_services_MutateConversionValueRuleSetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v15_services_MutateConversionValueRuleSetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateConversionValueRuleSetsResponse_descriptor,
        new java.lang.String[] { "Results", "PartialFailureError", });
    internal_static_google_ads_googleads_v15_services_MutateConversionValueRuleSetResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v15_services_MutateConversionValueRuleSetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateConversionValueRuleSetResult_descriptor,
        new java.lang.String[] { "ResourceName", "ConversionValueRuleSet", });
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
    com.google.ads.googleads.v15.resources.ConversionValueRuleSetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

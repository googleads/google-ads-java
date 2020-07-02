// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/services/ad_group_bid_modifier_service.proto

package com.google.ads.googleads.v5.services;

public final class AdGroupBidModifierServiceProto {
  private AdGroupBidModifierServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_GetAdGroupBidModifierRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_GetAdGroupBidModifierRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_MutateAdGroupBidModifiersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_MutateAdGroupBidModifiersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_AdGroupBidModifierOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_AdGroupBidModifierOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_MutateAdGroupBidModifiersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_MutateAdGroupBidModifiersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_MutateAdGroupBidModifierResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_MutateAdGroupBidModifierResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v5/services/ad_gr" +
      "oup_bid_modifier_service.proto\022 google.a" +
      "ds.googleads.v5.services\032=google/ads/goo" +
      "gleads/v5/resources/ad_group_bid_modifie" +
      "r.proto\032\034google/api/annotations.proto\032\027g" +
      "oogle/api/client.proto\032\037google/api/field" +
      "_behavior.proto\032\031google/api/resource.pro" +
      "to\032 google/protobuf/field_mask.proto\032\027go" +
      "ogle/rpc/status.proto\"j\n\034GetAdGroupBidMo" +
      "difierRequest\022J\n\rresource_name\030\001 \001(\tB3\340A" +
      "\002\372A-\n+googleads.googleapis.com/AdGroupBi" +
      "dModifier\"\304\001\n MutateAdGroupBidModifiersR" +
      "equest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022V\n\noper" +
      "ations\030\002 \003(\0132=.google.ads.googleads.v5.s" +
      "ervices.AdGroupBidModifierOperationB\003\340A\002" +
      "\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\rvalidate_on" +
      "ly\030\004 \001(\010\"\377\001\n\033AdGroupBidModifierOperation" +
      "\022/\n\013update_mask\030\004 \001(\0132\032.google.protobuf." +
      "FieldMask\022G\n\006create\030\001 \001(\01325.google.ads.g" +
      "oogleads.v5.resources.AdGroupBidModifier" +
      "H\000\022G\n\006update\030\002 \001(\01325.google.ads.googlead" +
      "s.v5.resources.AdGroupBidModifierH\000\022\020\n\006r" +
      "emove\030\003 \001(\tH\000B\013\n\toperation\"\251\001\n!MutateAdG" +
      "roupBidModifiersResponse\0221\n\025partial_fail" +
      "ure_error\030\003 \001(\0132\022.google.rpc.Status\022Q\n\007r" +
      "esults\030\002 \003(\0132@.google.ads.googleads.v5.s" +
      "ervices.MutateAdGroupBidModifierResult\"7" +
      "\n\036MutateAdGroupBidModifierResult\022\025\n\rreso" +
      "urce_name\030\001 \001(\t2\235\004\n\031AdGroupBidModifierSe" +
      "rvice\022\335\001\n\025GetAdGroupBidModifier\022>.google" +
      ".ads.googleads.v5.services.GetAdGroupBid" +
      "ModifierRequest\0325.google.ads.googleads.v" +
      "5.resources.AdGroupBidModifier\"M\202\323\344\223\0027\0225" +
      "/v5/{resource_name=customers/*/adGroupBi" +
      "dModifiers/*}\332A\rresource_name\022\202\002\n\031Mutate" +
      "AdGroupBidModifiers\022B.google.ads.googlea" +
      "ds.v5.services.MutateAdGroupBidModifiers" +
      "Request\032C.google.ads.googleads.v5.servic" +
      "es.MutateAdGroupBidModifiersResponse\"\\\202\323" +
      "\344\223\002=\"8/v5/customers/{customer_id=*}/adGr" +
      "oupBidModifiers:mutate:\001*\332A\026customer_id," +
      "operations\032\033\312A\030googleads.googleapis.comB" +
      "\205\002\n$com.google.ads.googleads.v5.services" +
      "B\036AdGroupBidModifierServiceProtoP\001ZHgoog" +
      "le.golang.org/genproto/googleapis/ads/go" +
      "ogleads/v5/services;services\242\002\003GAA\252\002 Goo" +
      "gle.Ads.GoogleAds.V5.Services\312\002 Google\\A" +
      "ds\\GoogleAds\\V5\\Services\352\002$Google::Ads::" +
      "GoogleAds::V5::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.resources.AdGroupBidModifierProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_services_GetAdGroupBidModifierRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_services_GetAdGroupBidModifierRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_GetAdGroupBidModifierRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v5_services_MutateAdGroupBidModifiersRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v5_services_MutateAdGroupBidModifiersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_MutateAdGroupBidModifiersRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v5_services_AdGroupBidModifierOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v5_services_AdGroupBidModifierOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_AdGroupBidModifierOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v5_services_MutateAdGroupBidModifiersResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v5_services_MutateAdGroupBidModifiersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_MutateAdGroupBidModifiersResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v5_services_MutateAdGroupBidModifierResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v5_services_MutateAdGroupBidModifierResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_MutateAdGroupBidModifierResult_descriptor,
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
    com.google.ads.googleads.v5.resources.AdGroupBidModifierProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

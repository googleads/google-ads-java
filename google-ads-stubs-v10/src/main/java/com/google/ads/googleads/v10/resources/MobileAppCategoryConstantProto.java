// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/mobile_app_category_constant.proto

package com.google.ads.googleads.v10.resources;

public final class MobileAppCategoryConstantProto {
  private MobileAppCategoryConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_MobileAppCategoryConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_MobileAppCategoryConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/ads/googleads/v10/resources/mob" +
      "ile_app_category_constant.proto\022\"google." +
      "ads.googleads.v10.resources\032\037google/api/" +
      "field_behavior.proto\032\031google/api/resourc" +
      "e.proto\"\232\002\n\031MobileAppCategoryConstant\022Q\n" +
      "\rresource_name\030\001 \001(\tB:\340A\003\372A4\n2googleads." +
      "googleapis.com/MobileAppCategoryConstant" +
      "\022\024\n\002id\030\004 \001(\005B\003\340A\003H\000\210\001\001\022\026\n\004name\030\005 \001(\tB\003\340A" +
      "\003H\001\210\001\001:l\352Ai\n2googleads.googleapis.com/Mo" +
      "bileAppCategoryConstant\0223mobileAppCatego" +
      "ryConstants/{mobile_app_category_id}B\005\n\003" +
      "_idB\007\n\005_nameB\220\002\n&com.google.ads.googlead" +
      "s.v10.resourcesB\036MobileAppCategoryConsta" +
      "ntProtoP\001ZKgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v10/resources;res" +
      "ources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V10." +
      "Resources\312\002\"Google\\Ads\\GoogleAds\\V10\\Res" +
      "ources\352\002&Google::Ads::GoogleAds::V10::Re" +
      "sourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_MobileAppCategoryConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_MobileAppCategoryConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_MobileAppCategoryConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Id", "Name", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

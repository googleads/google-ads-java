// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/custom_conversion_goal.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.resources;

public final class CustomConversionGoalProto {
  private CustomConversionGoalProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_CustomConversionGoal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_CustomConversionGoal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v16/resources/cus" +
      "tom_conversion_goal.proto\022\"google.ads.go" +
      "ogleads.v16.resources\032Bgoogle/ads/google" +
      "ads/v16/enums/custom_conversion_goal_sta" +
      "tus.proto\032\037google/api/field_behavior.pro" +
      "to\032\031google/api/resource.proto\"\247\003\n\024Custom" +
      "ConversionGoal\022L\n\rresource_name\030\001 \001(\tB5\340" +
      "A\005\372A/\n-googleads.googleapis.com/CustomCo" +
      "nversionGoal\022\017\n\002id\030\002 \001(\003B\003\340A\005\022\014\n\004name\030\003 " +
      "\001(\t\022J\n\022conversion_actions\030\004 \003(\tB.\372A+\n)go" +
      "ogleads.googleapis.com/ConversionAction\022" +
      "i\n\006status\030\005 \001(\0162Y.google.ads.googleads.v" +
      "16.enums.CustomConversionGoalStatusEnum." +
      "CustomConversionGoalStatus:k\352Ah\n-googlea" +
      "ds.googleapis.com/CustomConversionGoal\0227" +
      "customers/{customer_id}/customConversion" +
      "Goals/{goal_id}B\213\002\n&com.google.ads.googl" +
      "eads.v16.resourcesB\031CustomConversionGoal" +
      "ProtoP\001ZKgoogle.golang.org/genproto/goog" +
      "leapis/ads/googleads/v16/resources;resou" +
      "rces\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V16.Re" +
      "sources\312\002\"Google\\Ads\\GoogleAds\\V16\\Resou" +
      "rces\352\002&Google::Ads::GoogleAds::V16::Reso" +
      "urcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.enums.CustomConversionGoalStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_resources_CustomConversionGoal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_resources_CustomConversionGoal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_CustomConversionGoal_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "ConversionActions", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v16.enums.CustomConversionGoalStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/ad_parameter.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.resources;

public final class AdParameterProto {
  private AdParameterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_AdParameter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_AdParameter_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v18/resources/ad_" +
      "parameter.proto\022\"google.ads.googleads.v1" +
      "8.resources\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\"\244\003\n\013AdPa" +
      "rameter\022C\n\rresource_name\030\001 \001(\tB,\340A\005\372A&\n$" +
      "googleads.googleapis.com/AdParameter\022R\n\022" +
      "ad_group_criterion\030\005 \001(\tB1\340A\005\372A+\n)google" +
      "ads.googleapis.com/AdGroupCriterionH\000\210\001\001" +
      "\022!\n\017parameter_index\030\006 \001(\003B\003\340A\005H\001\210\001\001\022\033\n\016i" +
      "nsertion_text\030\007 \001(\tH\002\210\001\001:~\352A{\n$googleads" +
      ".googleapis.com/AdParameter\022Scustomers/{" +
      "customer_id}/adParameters/{ad_group_id}~" +
      "{criterion_id}~{parameter_index}B\025\n\023_ad_" +
      "group_criterionB\022\n\020_parameter_indexB\021\n\017_" +
      "insertion_textB\202\002\n&com.google.ads.google" +
      "ads.v18.resourcesB\020AdParameterProtoP\001ZKg" +
      "oogle.golang.org/genproto/googleapis/ads" +
      "/googleads/v18/resources;resources\242\002\003GAA" +
      "\252\002\"Google.Ads.GoogleAds.V18.Resources\312\002\"" +
      "Google\\Ads\\GoogleAds\\V18\\Resources\352\002&Goo" +
      "gle::Ads::GoogleAds::V18::Resourcesb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_resources_AdParameter_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_resources_AdParameter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_AdParameter_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupCriterion", "ParameterIndex", "InsertionText", });
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

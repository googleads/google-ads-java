// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/keyword_view.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.resources;

public final class KeywordViewProto {
  private KeywordViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_KeywordView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_KeywordView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v19/resources/key" +
      "word_view.proto\022\"google.ads.googleads.v1" +
      "9.resources\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\"\300\001\n\013Keyw" +
      "ordView\022C\n\rresource_name\030\001 \001(\tB,\340A\003\372A&\n$" +
      "googleads.googleapis.com/KeywordView:l\352A" +
      "i\n$googleads.googleapis.com/KeywordView\022" +
      "Acustomers/{customer_id}/keywordViews/{a" +
      "d_group_id}~{criterion_id}B\202\002\n&com.googl" +
      "e.ads.googleads.v19.resourcesB\020KeywordVi" +
      "ewProtoP\001ZKgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v19/resources;res" +
      "ources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V19." +
      "Resources\312\002\"Google\\Ads\\GoogleAds\\V19\\Res" +
      "ources\352\002&Google::Ads::GoogleAds::V19::Re" +
      "sourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_resources_KeywordView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_resources_KeywordView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_KeywordView_descriptor,
        new java.lang.String[] { "ResourceName", });
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

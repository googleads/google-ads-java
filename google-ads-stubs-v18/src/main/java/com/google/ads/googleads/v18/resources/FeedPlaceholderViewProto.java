// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/feed_placeholder_view.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.resources;

public final class FeedPlaceholderViewProto {
  private FeedPlaceholderViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_FeedPlaceholderView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_FeedPlaceholderView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v18/resources/fee" +
      "d_placeholder_view.proto\022\"google.ads.goo" +
      "gleads.v18.resources\0325google/ads/googlea" +
      "ds/v18/enums/placeholder_type.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\031google/api" +
      "/resource.proto\"\272\002\n\023FeedPlaceholderView\022" +
      "K\n\rresource_name\030\001 \001(\tB4\340A\003\372A.\n,googlead" +
      "s.googleapis.com/FeedPlaceholderView\022b\n\020" +
      "placeholder_type\030\002 \001(\0162C.google.ads.goog" +
      "leads.v18.enums.PlaceholderTypeEnum.Plac" +
      "eholderTypeB\003\340A\003:r\352Ao\n,googleads.googlea" +
      "pis.com/FeedPlaceholderView\022?customers/{" +
      "customer_id}/feedPlaceholderViews/{place" +
      "holder_type}B\212\002\n&com.google.ads.googlead" +
      "s.v18.resourcesB\030FeedPlaceholderViewProt" +
      "oP\001ZKgoogle.golang.org/genproto/googleap" +
      "is/ads/googleads/v18/resources;resources" +
      "\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V18.Resour" +
      "ces\312\002\"Google\\Ads\\GoogleAds\\V18\\Resources" +
      "\352\002&Google::Ads::GoogleAds::V18::Resource" +
      "sb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.enums.PlaceholderTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_resources_FeedPlaceholderView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_resources_FeedPlaceholderView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_FeedPlaceholderView_descriptor,
        new java.lang.String[] { "ResourceName", "PlaceholderType", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v18.enums.PlaceholderTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

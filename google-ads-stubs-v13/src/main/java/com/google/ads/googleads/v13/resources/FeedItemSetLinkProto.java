// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/feed_item_set_link.proto

package com.google.ads.googleads.v13.resources;

public final class FeedItemSetLinkProto {
  private FeedItemSetLinkProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_resources_FeedItemSetLink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_resources_FeedItemSetLink_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v13/resources/fee" +
      "d_item_set_link.proto\022\"google.ads.google" +
      "ads.v13.resources\032\037google/api/field_beha" +
      "vior.proto\032\031google/api/resource.proto\"\347\002" +
      "\n\017FeedItemSetLink\022H\n\rresource_name\030\001 \001(\t" +
      "B1\342A\001\005\372A*\n(googleads.googleapis.com/Feed" +
      "ItemSetLink\022=\n\tfeed_item\030\002 \001(\tB*\342A\001\005\372A#\n" +
      "!googleads.googleapis.com/FeedItem\022D\n\rfe" +
      "ed_item_set\030\003 \001(\tB-\342A\001\005\372A&\n$googleads.go" +
      "ogleapis.com/FeedItemSet:\204\001\352A\200\001\n(googlea" +
      "ds.googleapis.com/FeedItemSetLink\022Tcusto" +
      "mers/{customer_id}/feedItemSetLinks/{fee" +
      "d_id}~{feed_item_set_id}~{feed_item_id}B" +
      "\206\002\n&com.google.ads.googleads.v13.resourc" +
      "esB\024FeedItemSetLinkProtoP\001ZKgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v13/resources;resources\242\002\003GAA\252\002\"Google.A" +
      "ds.GoogleAds.V13.Resources\312\002\"Google\\Ads\\" +
      "GoogleAds\\V13\\Resources\352\002&Google::Ads::G" +
      "oogleAds::V13::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_resources_FeedItemSetLink_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_resources_FeedItemSetLink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_resources_FeedItemSetLink_descriptor,
        new java.lang.String[] { "ResourceName", "FeedItem", "FeedItemSet", });
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

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/topic_view.proto

package com.google.ads.googleads.v13.resources;

public final class TopicViewProto {
  private TopicViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_resources_TopicView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_resources_TopicView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/ads/googleads/v13/resources/top" +
      "ic_view.proto\022\"google.ads.googleads.v13." +
      "resources\032\037google/api/field_behavior.pro" +
      "to\032\031google/api/resource.proto\"\271\001\n\tTopicV" +
      "iew\022B\n\rresource_name\030\001 \001(\tB+\342A\001\003\372A$\n\"goo" +
      "gleads.googleapis.com/TopicView:h\352Ae\n\"go" +
      "ogleads.googleapis.com/TopicView\022?custom" +
      "ers/{customer_id}/topicViews/{ad_group_i" +
      "d}~{criterion_id}B\200\002\n&com.google.ads.goo" +
      "gleads.v13.resourcesB\016TopicViewProtoP\001ZK" +
      "google.golang.org/genproto/googleapis/ad" +
      "s/googleads/v13/resources;resources\242\002\003GA" +
      "A\252\002\"Google.Ads.GoogleAds.V13.Resources\312\002" +
      "\"Google\\Ads\\GoogleAds\\V13\\Resources\352\002&Go" +
      "ogle::Ads::GoogleAds::V13::Resourcesb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_resources_TopicView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_resources_TopicView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_resources_TopicView_descriptor,
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

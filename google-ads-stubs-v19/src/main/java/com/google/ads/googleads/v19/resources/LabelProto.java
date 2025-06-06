// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/label.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.resources;

public final class LabelProto {
  private LabelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_Label_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_Label_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/ads/googleads/v19/resources/lab" +
      "el.proto\022\"google.ads.googleads.v19.resou" +
      "rces\0320google/ads/googleads/v19/common/te" +
      "xt_label.proto\0321google/ads/googleads/v19" +
      "/enums/label_status.proto\032\037google/api/fi" +
      "eld_behavior.proto\032\031google/api/resource." +
      "proto\"\341\002\n\005Label\022=\n\rresource_name\030\001 \001(\tB&" +
      "\340A\005\372A \n\036googleads.googleapis.com/Label\022\024" +
      "\n\002id\030\006 \001(\003B\003\340A\003H\000\210\001\001\022\021\n\004name\030\007 \001(\tH\001\210\001\001\022" +
      "P\n\006status\030\004 \001(\0162;.google.ads.googleads.v" +
      "19.enums.LabelStatusEnum.LabelStatusB\003\340A" +
      "\003\022>\n\ntext_label\030\005 \001(\0132*.google.ads.googl" +
      "eads.v19.common.TextLabel:N\352AK\n\036googlead" +
      "s.googleapis.com/Label\022)customers/{custo" +
      "mer_id}/labels/{label_id}B\005\n\003_idB\007\n\005_nam" +
      "eB\374\001\n&com.google.ads.googleads.v19.resou" +
      "rcesB\nLabelProtoP\001ZKgoogle.golang.org/ge" +
      "nproto/googleapis/ads/googleads/v19/reso" +
      "urces;resources\242\002\003GAA\252\002\"Google.Ads.Googl" +
      "eAds.V19.Resources\312\002\"Google\\Ads\\GoogleAd" +
      "s\\V19\\Resources\352\002&Google::Ads::GoogleAds" +
      "::V19::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v19.common.TextLabelProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.LabelStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_resources_Label_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_resources_Label_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_Label_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "TextLabel", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v19.common.TextLabelProto.getDescriptor();
    com.google.ads.googleads.v19.enums.LabelStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/ad_group_ad_label.proto

package com.google.ads.googleads.v1.resources;

public final class AdGroupAdLabelProto {
  private AdGroupAdLabelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_AdGroupAdLabel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_AdGroupAdLabel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v1/resources/ad_g" +
      "roup_ad_label.proto\022!google.ads.googlead" +
      "s.v1.resources\032\036google/protobuf/wrappers" +
      ".proto\032\034google/api/annotations.proto\"\207\001\n" +
      "\016AdGroupAdLabel\022\025\n\rresource_name\030\001 \001(\t\0221" +
      "\n\013ad_group_ad\030\002 \001(\0132\034.google.protobuf.St" +
      "ringValue\022+\n\005label\030\003 \001(\0132\034.google.protob" +
      "uf.StringValueB\200\002\n%com.google.ads.google" +
      "ads.v1.resourcesB\023AdGroupAdLabelProtoP\001Z" +
      "Jgoogle.golang.org/genproto/googleapis/a" +
      "ds/googleads/v1/resources;resources\242\002\003GA" +
      "A\252\002!Google.Ads.GoogleAds.V1.Resources\312\002!" +
      "Google\\Ads\\GoogleAds\\V1\\Resources\352\002%Goog" +
      "le::Ads::GoogleAds::V1::Resourcesb\006proto" +
      "3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_resources_AdGroupAdLabel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_AdGroupAdLabel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_AdGroupAdLabel_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupAd", "Label", });
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

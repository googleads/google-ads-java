// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/resources/ad_group_ad_label.proto

package com.google.ads.googleads.v6.resources;

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
    internal_static_google_ads_googleads_v6_resources_AdGroupAdLabel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_resources_AdGroupAdLabel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v6/resources/ad_g" +
      "roup_ad_label.proto\022!google.ads.googlead" +
      "s.v6.resources\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\032\034goog" +
      "le/api/annotations.proto\"\354\002\n\016AdGroupAdLa" +
      "bel\022F\n\rresource_name\030\001 \001(\tB/\340A\005\372A)\n\'goog" +
      "leads.googleapis.com/AdGroupAdLabel\022D\n\013a" +
      "d_group_ad\030\004 \001(\tB*\340A\005\372A$\n\"googleads.goog" +
      "leapis.com/AdGroupAdH\000\210\001\001\022:\n\005label\030\005 \001(\t" +
      "B&\340A\005\372A \n\036googleads.googleapis.com/Label" +
      "H\001\210\001\001:v\352As\n\'googleads.googleapis.com/AdG" +
      "roupAdLabel\022Hcustomers/{customer_id}/adG" +
      "roupAdLabels/{ad_group_id}~{ad_id}~{labe" +
      "l_id}B\016\n\014_ad_group_adB\010\n\006_labelB\200\002\n%com." +
      "google.ads.googleads.v6.resourcesB\023AdGro" +
      "upAdLabelProtoP\001ZJgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v6/resourc" +
      "es;resources\242\002\003GAA\252\002!Google.Ads.GoogleAd" +
      "s.V6.Resources\312\002!Google\\Ads\\GoogleAds\\V6" +
      "\\Resources\352\002%Google::Ads::GoogleAds::V6:" +
      ":Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_resources_AdGroupAdLabel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_resources_AdGroupAdLabel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_resources_AdGroupAdLabel_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupAd", "Label", "AdGroupAd", "Label", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
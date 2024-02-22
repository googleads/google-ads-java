// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/android_privacy_shared_key_google_ad_group.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.resources;

public final class AndroidPrivacySharedKeyGoogleAdGroupProto {
  private AndroidPrivacySharedKeyGoogleAdGroupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_AndroidPrivacySharedKeyGoogleAdGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_AndroidPrivacySharedKeyGoogleAdGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nSgoogle/ads/googleads/v16/resources/and" +
      "roid_privacy_shared_key_google_ad_group." +
      "proto\022\"google.ads.googleads.v16.resource" +
      "s\032Egoogle/ads/googleads/v16/enums/androi" +
      "d_privacy_interaction_type.proto\032Agoogle" +
      "/ads/googleads/v16/enums/android_privacy" +
      "_network_type.proto\032\037google/api/field_be" +
      "havior.proto\032\031google/api/resource.proto\"" +
      "\246\006\n$AndroidPrivacySharedKeyGoogleAdGroup" +
      "\022\\\n\rresource_name\030\001 \001(\tBE\340A\003\372A?\n=googlea" +
      "ds.googleapis.com/AndroidPrivacySharedKe" +
      "yGoogleAdGroup\022\030\n\013campaign_id\030\002 \001(\003B\003\340A\003" +
      "\022\216\001\n android_privacy_interaction_type\030\003 " +
      "\001(\0162_.google.ads.googleads.v16.enums.And" +
      "roidPrivacyInteractionTypeEnum.AndroidPr" +
      "ivacyInteractionTypeB\003\340A\003\022-\n android_pri" +
      "vacy_interaction_date\030\004 \001(\tB\003\340A\003\022\202\001\n\034and" +
      "roid_privacy_network_type\030\005 \001(\0162W.google" +
      ".ads.googleads.v16.enums.AndroidPrivacyN" +
      "etworkTypeEnum.AndroidPrivacyNetworkType" +
      "B\003\340A\003\022\030\n\013ad_group_id\030\006 \001(\003B\003\340A\003\022 \n\023share" +
      "d_ad_group_key\030\007 \001(\tB\003\340A\003:\204\002\352A\200\002\n=google" +
      "ads.googleapis.com/AndroidPrivacySharedK" +
      "eyGoogleAdGroup\022\276\001customers/{customer_id" +
      "}/androidPrivacySharedKeyGoogleAdGroups/" +
      "{campaign_id}~{ad_group_id}~{android_pri" +
      "vacy_interaction_type}~{android_privacy_" +
      "network_type}~{android_privacy_interacti" +
      "on_date}B\233\002\n&com.google.ads.googleads.v1" +
      "6.resourcesB)AndroidPrivacySharedKeyGoog" +
      "leAdGroupProtoP\001ZKgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v16/resour" +
      "ces;resources\242\002\003GAA\252\002\"Google.Ads.GoogleA" +
      "ds.V16.Resources\312\002\"Google\\Ads\\GoogleAds\\" +
      "V16\\Resources\352\002&Google::Ads::GoogleAds::" +
      "V16::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.enums.AndroidPrivacyInteractionTypeProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.AndroidPrivacyNetworkTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_resources_AndroidPrivacySharedKeyGoogleAdGroup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_resources_AndroidPrivacySharedKeyGoogleAdGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_AndroidPrivacySharedKeyGoogleAdGroup_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignId", "AndroidPrivacyInteractionType", "AndroidPrivacyInteractionDate", "AndroidPrivacyNetworkType", "AdGroupId", "SharedAdGroupKey", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v16.enums.AndroidPrivacyInteractionTypeProto.getDescriptor();
    com.google.ads.googleads.v16.enums.AndroidPrivacyNetworkTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

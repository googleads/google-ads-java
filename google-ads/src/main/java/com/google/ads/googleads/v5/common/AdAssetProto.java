// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/common/ad_asset.proto

package com.google.ads.googleads.v5.common;

public final class AdAssetProto {
  private AdAssetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_AdTextAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_AdTextAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_AdImageAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_AdImageAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_AdVideoAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_AdVideoAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_AdMediaBundleAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_AdMediaBundleAsset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/ads/googleads/v5/common/ad_asse" +
      "t.proto\022\036google.ads.googleads.v5.common\032" +
      ";google/ads/googleads/v5/enums/served_as" +
      "set_field_type.proto\032\036google/protobuf/wr" +
      "appers.proto\032\034google/api/annotations.pro" +
      "to\"\235\001\n\013AdTextAsset\022*\n\004text\030\001 \001(\0132\034.googl" +
      "e.protobuf.StringValue\022b\n\014pinned_field\030\002" +
      " \001(\0162L.google.ads.googleads.v5.enums.Ser" +
      "vedAssetFieldTypeEnum.ServedAssetFieldTy" +
      "pe\";\n\014AdImageAsset\022+\n\005asset\030\001 \001(\0132\034.goog" +
      "le.protobuf.StringValue\";\n\014AdVideoAsset\022" +
      "+\n\005asset\030\001 \001(\0132\034.google.protobuf.StringV" +
      "alue\"A\n\022AdMediaBundleAsset\022+\n\005asset\030\001 \001(" +
      "\0132\034.google.protobuf.StringValueB\347\001\n\"com." +
      "google.ads.googleads.v5.commonB\014AdAssetP" +
      "rotoP\001ZDgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v5/common;common\242\002\003G" +
      "AA\252\002\036Google.Ads.GoogleAds.V5.Common\312\002\036Go" +
      "ogle\\Ads\\GoogleAds\\V5\\Common\352\002\"Google::A" +
      "ds::GoogleAds::V5::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.enums.ServedAssetFieldTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_common_AdTextAsset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_common_AdTextAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_AdTextAsset_descriptor,
        new java.lang.String[] { "Text", "PinnedField", });
    internal_static_google_ads_googleads_v5_common_AdImageAsset_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v5_common_AdImageAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_AdImageAsset_descriptor,
        new java.lang.String[] { "Asset", });
    internal_static_google_ads_googleads_v5_common_AdVideoAsset_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v5_common_AdVideoAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_AdVideoAsset_descriptor,
        new java.lang.String[] { "Asset", });
    internal_static_google_ads_googleads_v5_common_AdMediaBundleAsset_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v5_common_AdMediaBundleAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_AdMediaBundleAsset_descriptor,
        new java.lang.String[] { "Asset", });
    com.google.ads.googleads.v5.enums.ServedAssetFieldTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/final_app_url.proto

package com.google.ads.googleads.v10.common;

public final class FinalAppUrlProto {
  private FinalAppUrlProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_FinalAppUrl_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_FinalAppUrl_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/ads/googleads/v10/common/final_" +
      "app_url.proto\022\037google.ads.googleads.v10." +
      "common\032Bgoogle/ads/googleads/v10/enums/a" +
      "pp_url_operating_system_type.proto\"\221\001\n\013F" +
      "inalAppUrl\022h\n\007os_type\030\001 \001(\0162W.google.ads" +
      ".googleads.v10.enums.AppUrlOperatingSyst" +
      "emTypeEnum.AppUrlOperatingSystemType\022\020\n\003" +
      "url\030\003 \001(\tH\000\210\001\001B\006\n\004_urlB\360\001\n#com.google.ad" +
      "s.googleads.v10.commonB\020FinalAppUrlProto" +
      "P\001ZEgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v10/common;common\242\002\003GAA\252" +
      "\002\037Google.Ads.GoogleAds.V10.Common\312\002\037Goog" +
      "le\\Ads\\GoogleAds\\V10\\Common\352\002#Google::Ad" +
      "s::GoogleAds::V10::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.AppUrlOperatingSystemTypeProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_common_FinalAppUrl_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_common_FinalAppUrl_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_FinalAppUrl_descriptor,
        new java.lang.String[] { "OsType", "Url", "Url", });
    com.google.ads.googleads.v10.enums.AppUrlOperatingSystemTypeProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

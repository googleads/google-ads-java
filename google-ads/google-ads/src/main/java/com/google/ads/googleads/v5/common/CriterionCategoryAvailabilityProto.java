// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/common/criterion_category_availability.proto

package com.google.ads.googleads.v5.common;

public final class CriterionCategoryAvailabilityProto {
  private CriterionCategoryAvailabilityProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_CriterionCategoryAvailability_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_CriterionCategoryAvailability_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_CriterionCategoryChannelAvailability_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_CriterionCategoryChannelAvailability_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_common_CriterionCategoryLocaleAvailability_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_common_CriterionCategoryLocaleAvailability_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v5/common/criteri" +
      "on_category_availability.proto\022\036google.a" +
      "ds.googleads.v5.common\032@google/ads/googl" +
      "eads/v5/enums/advertising_channel_sub_ty" +
      "pe.proto\032<google/ads/googleads/v5/enums/" +
      "advertising_channel_type.proto\032Pgoogle/a" +
      "ds/googleads/v5/enums/criterion_category" +
      "_channel_availability_mode.proto\032Ogoogle" +
      "/ads/googleads/v5/enums/criterion_catego" +
      "ry_locale_availability_mode.proto\032\036googl" +
      "e/protobuf/wrappers.proto\032\034google/api/an" +
      "notations.proto\"\313\001\n\035CriterionCategoryAva" +
      "ilability\022U\n\007channel\030\001 \001(\0132D.google.ads." +
      "googleads.v5.common.CriterionCategoryCha" +
      "nnelAvailability\022S\n\006locale\030\002 \003(\0132C.googl" +
      "e.ads.googleads.v5.common.CriterionCateg" +
      "oryLocaleAvailability\"\360\003\n$CriterionCateg" +
      "oryChannelAvailability\022\217\001\n\021availability_" +
      "mode\030\001 \001(\0162t.google.ads.googleads.v5.enu" +
      "ms.CriterionCategoryChannelAvailabilityM" +
      "odeEnum.CriterionCategoryChannelAvailabi" +
      "lityMode\022r\n\030advertising_channel_type\030\002 \001" +
      "(\0162P.google.ads.googleads.v5.enums.Adver" +
      "tisingChannelTypeEnum.AdvertisingChannel" +
      "Type\022|\n\034advertising_channel_sub_type\030\003 \003" +
      "(\0162V.google.ads.googleads.v5.enums.Adver" +
      "tisingChannelSubTypeEnum.AdvertisingChan" +
      "nelSubType\022D\n include_default_channel_su" +
      "b_type\030\004 \001(\0132\032.google.protobuf.BoolValue" +
      "\"\236\002\n#CriterionCategoryLocaleAvailability" +
      "\022\215\001\n\021availability_mode\030\001 \001(\0162r.google.ad" +
      "s.googleads.v5.enums.CriterionCategoryLo" +
      "caleAvailabilityModeEnum.CriterionCatego" +
      "ryLocaleAvailabilityMode\0222\n\014country_code" +
      "\030\002 \001(\0132\034.google.protobuf.StringValue\0223\n\r" +
      "language_code\030\003 \001(\0132\034.google.protobuf.St" +
      "ringValueB\375\001\n\"com.google.ads.googleads.v" +
      "5.commonB\"CriterionCategoryAvailabilityP" +
      "rotoP\001ZDgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v5/common;common\242\002\003G" +
      "AA\252\002\036Google.Ads.GoogleAds.V5.Common\312\002\036Go" +
      "ogle\\Ads\\GoogleAds\\V5\\Common\352\002\"Google::A" +
      "ds::GoogleAds::V5::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.enums.AdvertisingChannelSubTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.AdvertisingChannelTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.CriterionCategoryChannelAvailabilityModeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.CriterionCategoryLocaleAvailabilityModeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_common_CriterionCategoryAvailability_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_common_CriterionCategoryAvailability_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_CriterionCategoryAvailability_descriptor,
        new java.lang.String[] { "Channel", "Locale", });
    internal_static_google_ads_googleads_v5_common_CriterionCategoryChannelAvailability_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v5_common_CriterionCategoryChannelAvailability_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_CriterionCategoryChannelAvailability_descriptor,
        new java.lang.String[] { "AvailabilityMode", "AdvertisingChannelType", "AdvertisingChannelSubType", "IncludeDefaultChannelSubType", });
    internal_static_google_ads_googleads_v5_common_CriterionCategoryLocaleAvailability_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v5_common_CriterionCategoryLocaleAvailability_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_common_CriterionCategoryLocaleAvailability_descriptor,
        new java.lang.String[] { "AvailabilityMode", "CountryCode", "LanguageCode", });
    com.google.ads.googleads.v5.enums.AdvertisingChannelSubTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.AdvertisingChannelTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.CriterionCategoryChannelAvailabilityModeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.CriterionCategoryLocaleAvailabilityModeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

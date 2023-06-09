// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/asset_set_types.proto

package com.google.ads.googleads.v14.common;

public final class AssetSetTypesProto {
  private AssetSetTypesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_LocationSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_LocationSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_BusinessProfileLocationSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_BusinessProfileLocationSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_ChainSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_ChainSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_ChainFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_ChainFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_MapsLocationSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_MapsLocationSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_MapsLocationInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_MapsLocationInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_BusinessProfileLocationGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_BusinessProfileLocationGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_DynamicBusinessProfileLocationGroupFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_DynamicBusinessProfileLocationGroupFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_BusinessProfileBusinessNameFilter_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_BusinessProfileBusinessNameFilter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_common_ChainLocationGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_common_ChainLocationGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v14/common/asset_" +
      "set_types.proto\022\037google.ads.googleads.v1" +
      "4.common\032<google/ads/googleads/v14/enums" +
      "/chain_relationship_type.proto\032<google/a" +
      "ds/googleads/v14/enums/location_ownershi" +
      "p_type.proto\032@google/ads/googleads/v14/e" +
      "nums/location_string_filter_type.proto\032\037" +
      "google/api/field_behavior.proto\"\216\003\n\013Loca" +
      "tionSet\022w\n\027location_ownership_type\030\003 \001(\016" +
      "2O.google.ads.googleads.v14.enums.Locati" +
      "onOwnershipTypeEnum.LocationOwnershipTyp" +
      "eB\005\342A\002\002\005\022d\n\035business_profile_location_se" +
      "t\030\001 \001(\0132;.google.ads.googleads.v14.commo" +
      "n.BusinessProfileLocationSetH\000\022G\n\022chain_" +
      "location_set\030\002 \001(\0132).google.ads.googlead" +
      "s.v14.common.ChainSetH\000\022M\n\021maps_location" +
      "_set\030\005 \001(\01320.google.ads.googleads.v14.co" +
      "mmon.MapsLocationSetH\000B\010\n\006source\"\327\001\n\032Bus" +
      "inessProfileLocationSet\022\'\n\030http_authoriz" +
      "ation_token\030\001 \001(\tB\005\342A\002\005\002\022\034\n\remail_addres" +
      "s\030\002 \001(\tB\005\342A\002\002\005\022\034\n\024business_name_filter\030\003" +
      " \001(\t\022\025\n\rlabel_filters\030\004 \003(\t\022\032\n\022listing_i" +
      "d_filters\030\005 \003(\003\022!\n\023business_account_id\030\006" +
      " \001(\tB\004\342A\001\005\"\301\001\n\010ChainSet\022q\n\021relationship_" +
      "type\030\001 \001(\0162O.google.ads.googleads.v14.en" +
      "ums.ChainRelationshipTypeEnum.ChainRelat" +
      "ionshipTypeB\005\342A\002\002\005\022B\n\006chains\030\002 \003(\0132,.goo" +
      "gle.ads.googleads.v14.common.ChainFilter" +
      "B\004\342A\001\002\"B\n\013ChainFilter\022\026\n\010chain_id\030\001 \001(\003B" +
      "\004\342A\001\002\022\033\n\023location_attributes\030\002 \003(\t\"b\n\017Ma" +
      "psLocationSet\022O\n\016maps_locations\030\001 \003(\01321." +
      "google.ads.googleads.v14.common.MapsLoca" +
      "tionInfoB\004\342A\001\002\"$\n\020MapsLocationInfo\022\020\n\010pl" +
      "ace_id\030\001 \001(\t\"\243\001\n\034BusinessProfileLocation" +
      "Group\022\202\001\n.dynamic_business_profile_locat" +
      "ion_group_filter\030\001 \001(\0132J.google.ads.goog" +
      "leads.v14.common.DynamicBusinessProfileL" +
      "ocationGroupFilter\"\336\001\n)DynamicBusinessPr" +
      "ofileLocationGroupFilter\022\025\n\rlabel_filter" +
      "s\030\001 \003(\t\022e\n\024business_name_filter\030\002 \001(\0132B." +
      "google.ads.googleads.v14.common.Business" +
      "ProfileBusinessNameFilterH\000\210\001\001\022\032\n\022listin" +
      "g_id_filters\030\003 \003(\003B\027\n\025_business_name_fil" +
      "ter\"\246\001\n!BusinessProfileBusinessNameFilte" +
      "r\022\025\n\rbusiness_name\030\001 \001(\t\022j\n\013filter_type\030" +
      "\002 \001(\0162U.google.ads.googleads.v14.enums.L" +
      "ocationStringFilterTypeEnum.LocationStri" +
      "ngFilterType\"p\n\022ChainLocationGroup\022Z\n$dy" +
      "namic_chain_location_group_filters\030\001 \003(\013" +
      "2,.google.ads.googleads.v14.common.Chain" +
      "FilterB\362\001\n#com.google.ads.googleads.v14." +
      "commonB\022AssetSetTypesProtoP\001ZEgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v14/common;common\242\002\003GAA\252\002\037Google.Ads.G" +
      "oogleAds.V14.Common\312\002\037Google\\Ads\\GoogleA" +
      "ds\\V14\\Common\352\002#Google::Ads::GoogleAds::" +
      "V14::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.enums.ChainRelationshipTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.LocationOwnershipTypeProto.getDescriptor(),
          com.google.ads.googleads.v14.enums.LocationStringFilterTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_common_LocationSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_common_LocationSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_LocationSet_descriptor,
        new java.lang.String[] { "LocationOwnershipType", "BusinessProfileLocationSet", "ChainLocationSet", "MapsLocationSet", "Source", });
    internal_static_google_ads_googleads_v14_common_BusinessProfileLocationSet_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v14_common_BusinessProfileLocationSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_BusinessProfileLocationSet_descriptor,
        new java.lang.String[] { "HttpAuthorizationToken", "EmailAddress", "BusinessNameFilter", "LabelFilters", "ListingIdFilters", "BusinessAccountId", });
    internal_static_google_ads_googleads_v14_common_ChainSet_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v14_common_ChainSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_ChainSet_descriptor,
        new java.lang.String[] { "RelationshipType", "Chains", });
    internal_static_google_ads_googleads_v14_common_ChainFilter_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v14_common_ChainFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_ChainFilter_descriptor,
        new java.lang.String[] { "ChainId", "LocationAttributes", });
    internal_static_google_ads_googleads_v14_common_MapsLocationSet_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v14_common_MapsLocationSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_MapsLocationSet_descriptor,
        new java.lang.String[] { "MapsLocations", });
    internal_static_google_ads_googleads_v14_common_MapsLocationInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v14_common_MapsLocationInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_MapsLocationInfo_descriptor,
        new java.lang.String[] { "PlaceId", });
    internal_static_google_ads_googleads_v14_common_BusinessProfileLocationGroup_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v14_common_BusinessProfileLocationGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_BusinessProfileLocationGroup_descriptor,
        new java.lang.String[] { "DynamicBusinessProfileLocationGroupFilter", });
    internal_static_google_ads_googleads_v14_common_DynamicBusinessProfileLocationGroupFilter_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_ads_googleads_v14_common_DynamicBusinessProfileLocationGroupFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_DynamicBusinessProfileLocationGroupFilter_descriptor,
        new java.lang.String[] { "LabelFilters", "BusinessNameFilter", "ListingIdFilters", "BusinessNameFilter", });
    internal_static_google_ads_googleads_v14_common_BusinessProfileBusinessNameFilter_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_ads_googleads_v14_common_BusinessProfileBusinessNameFilter_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_BusinessProfileBusinessNameFilter_descriptor,
        new java.lang.String[] { "BusinessName", "FilterType", });
    internal_static_google_ads_googleads_v14_common_ChainLocationGroup_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_google_ads_googleads_v14_common_ChainLocationGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_common_ChainLocationGroup_descriptor,
        new java.lang.String[] { "DynamicChainLocationGroupFilters", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v14.enums.ChainRelationshipTypeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.LocationOwnershipTypeProto.getDescriptor();
    com.google.ads.googleads.v14.enums.LocationStringFilterTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

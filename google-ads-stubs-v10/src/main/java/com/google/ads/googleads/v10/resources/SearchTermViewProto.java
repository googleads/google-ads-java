// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/search_term_view.proto

package com.google.ads.googleads.v10.resources;

public final class SearchTermViewProto {
  private SearchTermViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_SearchTermView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_SearchTermView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v10/resources/sea" +
      "rch_term_view.proto\022\"google.ads.googlead" +
      "s.v10.resources\032Agoogle/ads/googleads/v1" +
      "0/enums/search_term_targeting_status.pro" +
      "to\032\037google/api/field_behavior.proto\032\031goo" +
      "gle/api/resource.proto\"\276\003\n\016SearchTermVie" +
      "w\022F\n\rresource_name\030\001 \001(\tB/\340A\003\372A)\n\'google" +
      "ads.googleapis.com/SearchTermView\022\035\n\013sea" +
      "rch_term\030\005 \001(\tB\003\340A\003H\000\210\001\001\022?\n\010ad_group\030\006 \001" +
      "(\tB(\340A\003\372A\"\n googleads.googleapis.com/AdG" +
      "roupH\001\210\001\001\022l\n\006status\030\004 \001(\0162W.google.ads.g" +
      "oogleads.v10.enums.SearchTermTargetingSt" +
      "atusEnum.SearchTermTargetingStatusB\003\340A\003:" +
      "y\352Av\n\'googleads.googleapis.com/SearchTer" +
      "mView\022Kcustomers/{customer_id}/searchTer" +
      "mViews/{campaign_id}~{ad_group_id}~{quer" +
      "y}B\016\n\014_search_termB\013\n\t_ad_groupB\205\002\n&com." +
      "google.ads.googleads.v10.resourcesB\023Sear" +
      "chTermViewProtoP\001ZKgoogle.golang.org/gen" +
      "proto/googleapis/ads/googleads/v10/resou" +
      "rces;resources\242\002\003GAA\252\002\"Google.Ads.Google" +
      "Ads.V10.Resources\312\002\"Google\\Ads\\GoogleAds" +
      "\\V10\\Resources\352\002&Google::Ads::GoogleAds:" +
      ":V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.SearchTermTargetingStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_SearchTermView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_SearchTermView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_SearchTermView_descriptor,
        new java.lang.String[] { "ResourceName", "SearchTerm", "AdGroup", "Status", "SearchTerm", "AdGroup", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.SearchTermTargetingStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/search_term_view.proto

package com.google.ads.googleads.v14.resources;

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
    internal_static_google_ads_googleads_v14_resources_SearchTermView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_SearchTermView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v14/resources/sea" +
      "rch_term_view.proto\022\"google.ads.googlead" +
      "s.v14.resources\032Agoogle/ads/googleads/v1" +
      "4/enums/search_term_targeting_status.pro" +
      "to\032\037google/api/field_behavior.proto\032\031goo" +
      "gle/api/resource.proto\"\302\003\n\016SearchTermVie" +
      "w\022G\n\rresource_name\030\001 \001(\tB0\342A\001\003\372A)\n\'googl" +
      "eads.googleapis.com/SearchTermView\022\036\n\013se" +
      "arch_term\030\005 \001(\tB\004\342A\001\003H\000\210\001\001\022@\n\010ad_group\030\006" +
      " \001(\tB)\342A\001\003\372A\"\n googleads.googleapis.com/" +
      "AdGroupH\001\210\001\001\022m\n\006status\030\004 \001(\0162W.google.ad" +
      "s.googleads.v14.enums.SearchTermTargetin" +
      "gStatusEnum.SearchTermTargetingStatusB\004\342" +
      "A\001\003:y\352Av\n\'googleads.googleapis.com/Searc" +
      "hTermView\022Kcustomers/{customer_id}/searc" +
      "hTermViews/{campaign_id}~{ad_group_id}~{" +
      "query}B\016\n\014_search_termB\013\n\t_ad_groupB\205\002\n&" +
      "com.google.ads.googleads.v14.resourcesB\023" +
      "SearchTermViewProtoP\001ZKgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v14/r" +
      "esources;resources\242\002\003GAA\252\002\"Google.Ads.Go" +
      "ogleAds.V14.Resources\312\002\"Google\\Ads\\Googl" +
      "eAds\\V14\\Resources\352\002&Google::Ads::Google" +
      "Ads::V14::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.enums.SearchTermTargetingStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_resources_SearchTermView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_SearchTermView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_SearchTermView_descriptor,
        new java.lang.String[] { "ResourceName", "SearchTerm", "AdGroup", "Status", "SearchTerm", "AdGroup", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v14.enums.SearchTermTargetingStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/product_link.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.resources;

public final class ProductLinkProto {
  private ProductLinkProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_ProductLink_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_ProductLink_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_DataPartnerIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_DataPartnerIdentifier_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_GoogleAdsIdentifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_GoogleAdsIdentifier_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5google/ads/googleads/v14/resources/pro" +
      "duct_link.proto\022\"google.ads.googleads.v1" +
      "4.resources\0328google/ads/googleads/v14/en" +
      "ums/linked_product_type.proto\032\037google/ap" +
      "i/field_behavior.proto\032\031google/api/resou" +
      "rce.proto\"\206\004\n\013ProductLink\022C\n\rresource_na" +
      "me\030\001 \001(\tB,\340A\005\372A&\n$googleads.googleapis.c" +
      "om/ProductLink\022!\n\017product_link_id\030\002 \001(\003B" +
      "\003\340A\003H\001\210\001\001\022Z\n\004type\030\003 \001(\0162G.google.ads.goo" +
      "gleads.v14.enums.LinkedProductTypeEnum.L" +
      "inkedProductTypeB\003\340A\003\022V\n\014data_partner\030\004 " +
      "\001(\01329.google.ads.googleads.v14.resources" +
      ".DataPartnerIdentifierB\003\340A\005H\000\022R\n\ngoogle_" +
      "ads\030\005 \001(\01327.google.ads.googleads.v14.res" +
      "ources.GoogleAdsIdentifierB\003\340A\005H\000:a\352A^\n$" +
      "googleads.googleapis.com/ProductLink\0226cu" +
      "stomers/{customer_id}/productLinks/{prod" +
      "uct_link_id}B\020\n\016linked_productB\022\n\020_produ" +
      "ct_link_id\"N\n\025DataPartnerIdentifier\022!\n\017d" +
      "ata_partner_id\030\001 \001(\003B\003\340A\005H\000\210\001\001B\022\n\020_data_" +
      "partner_id\"d\n\023GoogleAdsIdentifier\022@\n\010cus" +
      "tomer\030\001 \001(\tB)\340A\005\372A#\n!googleads.googleapi" +
      "s.com/CustomerH\000\210\001\001B\013\n\t_customerB\202\002\n&com" +
      ".google.ads.googleads.v14.resourcesB\020Pro" +
      "ductLinkProtoP\001ZKgoogle.golang.org/genpr" +
      "oto/googleapis/ads/googleads/v14/resourc" +
      "es;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAd" +
      "s.V14.Resources\312\002\"Google\\Ads\\GoogleAds\\V" +
      "14\\Resources\352\002&Google::Ads::GoogleAds::V" +
      "14::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v14.enums.LinkedProductTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_resources_ProductLink_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_ProductLink_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_ProductLink_descriptor,
        new java.lang.String[] { "ResourceName", "ProductLinkId", "Type", "DataPartner", "GoogleAds", "LinkedProduct", });
    internal_static_google_ads_googleads_v14_resources_DataPartnerIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v14_resources_DataPartnerIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_DataPartnerIdentifier_descriptor,
        new java.lang.String[] { "DataPartnerId", });
    internal_static_google_ads_googleads_v14_resources_GoogleAdsIdentifier_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v14_resources_GoogleAdsIdentifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_GoogleAdsIdentifier_descriptor,
        new java.lang.String[] { "Customer", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v14.enums.LinkedProductTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

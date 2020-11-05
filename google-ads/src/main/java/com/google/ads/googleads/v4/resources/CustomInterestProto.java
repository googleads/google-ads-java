// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/resources/custom_interest.proto

package com.google.ads.googleads.v4.resources;

public final class CustomInterestProto {
  private CustomInterestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_CustomInterest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_CustomInterest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_CustomInterestMember_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_CustomInterestMember_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v4/resources/cust" +
      "om_interest.proto\022!google.ads.googleads." +
      "v4.resources\032?google/ads/googleads/v4/en" +
      "ums/custom_interest_member_type.proto\032:g" +
      "oogle/ads/googleads/v4/enums/custom_inte" +
      "rest_status.proto\0328google/ads/googleads/" +
      "v4/enums/custom_interest_type.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\031google/api" +
      "/resource.proto\032\036google/protobuf/wrapper" +
      "s.proto\032\034google/api/annotations.proto\"\313\004" +
      "\n\016CustomInterest\022F\n\rresource_name\030\001 \001(\tB" +
      "/\340A\005\372A)\n\'googleads.googleapis.com/Custom" +
      "Interest\022,\n\002id\030\002 \001(\0132\033.google.protobuf.I" +
      "nt64ValueB\003\340A\003\022\\\n\006status\030\003 \001(\0162L.google." +
      "ads.googleads.v4.enums.CustomInterestSta" +
      "tusEnum.CustomInterestStatus\022*\n\004name\030\004 \001" +
      "(\0132\034.google.protobuf.StringValue\022V\n\004type" +
      "\030\005 \001(\0162H.google.ads.googleads.v4.enums.C" +
      "ustomInterestTypeEnum.CustomInterestType" +
      "\0221\n\013description\030\006 \001(\0132\034.google.protobuf." +
      "StringValue\022H\n\007members\030\007 \003(\01327.google.ad" +
      "s.googleads.v4.resources.CustomInterestM" +
      "ember:d\352Aa\n\'googleads.googleapis.com/Cus" +
      "tomInterest\0226customers/{customer}/custom" +
      "Interests/{custom_interest}\"\262\001\n\024CustomIn" +
      "terestMember\022i\n\013member_type\030\001 \001(\0162T.goog" +
      "le.ads.googleads.v4.enums.CustomInterest" +
      "MemberTypeEnum.CustomInterestMemberType\022" +
      "/\n\tparameter\030\002 \001(\0132\034.google.protobuf.Str" +
      "ingValueB\200\002\n%com.google.ads.googleads.v4" +
      ".resourcesB\023CustomInterestProtoP\001ZJgoogl" +
      "e.golang.org/genproto/googleapis/ads/goo" +
      "gleads/v4/resources;resources\242\002\003GAA\252\002!Go" +
      "ogle.Ads.GoogleAds.V4.Resources\312\002!Google" +
      "\\Ads\\GoogleAds\\V4\\Resources\352\002%Google::Ad" +
      "s::GoogleAds::V4::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.enums.CustomInterestMemberTypeProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.CustomInterestStatusProto.getDescriptor(),
          com.google.ads.googleads.v4.enums.CustomInterestTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_resources_CustomInterest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_resources_CustomInterest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_CustomInterest_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Status", "Name", "Type", "Description", "Members", });
    internal_static_google_ads_googleads_v4_resources_CustomInterestMember_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v4_resources_CustomInterestMember_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_CustomInterestMember_descriptor,
        new java.lang.String[] { "MemberType", "Parameter", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v4.enums.CustomInterestMemberTypeProto.getDescriptor();
    com.google.ads.googleads.v4.enums.CustomInterestStatusProto.getDescriptor();
    com.google.ads.googleads.v4.enums.CustomInterestTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

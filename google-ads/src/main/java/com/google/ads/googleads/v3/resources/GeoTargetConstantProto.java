// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/geo_target_constant.proto

package com.google.ads.googleads.v3.resources;

public final class GeoTargetConstantProto {
  private GeoTargetConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v3_resources_GeoTargetConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v3_resources_GeoTargetConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v3/resources/geo_" +
      "target_constant.proto\022!google.ads.google" +
      "ads.v3.resources\032>google/ads/googleads/v" +
      "3/enums/geo_target_constant_status.proto" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\032\036google/protobuf/wr" +
      "appers.proto\032\034google/api/annotations.pro" +
      "to\"\255\004\n\021GeoTargetConstant\022I\n\rresource_nam" +
      "e\030\001 \001(\tB2\340A\003\372A,\n*googleads.googleapis.co" +
      "m/GeoTargetConstant\022,\n\002id\030\003 \001(\0132\033.google" +
      ".protobuf.Int64ValueB\003\340A\003\022/\n\004name\030\004 \001(\0132" +
      "\034.google.protobuf.StringValueB\003\340A\003\0227\n\014co" +
      "untry_code\030\005 \001(\0132\034.google.protobuf.Strin" +
      "gValueB\003\340A\003\0226\n\013target_type\030\006 \001(\0132\034.googl" +
      "e.protobuf.StringValueB\003\340A\003\022g\n\006status\030\007 " +
      "\001(\0162R.google.ads.googleads.v3.enums.GeoT" +
      "argetConstantStatusEnum.GeoTargetConstan" +
      "tStatusB\003\340A\003\0229\n\016canonical_name\030\010 \001(\0132\034.g" +
      "oogle.protobuf.StringValueB\003\340A\003:Y\352AV\n*go" +
      "ogleads.googleapis.com/GeoTargetConstant" +
      "\022(geoTargetConstants/{geo_target_constan" +
      "t}B\203\002\n%com.google.ads.googleads.v3.resou" +
      "rcesB\026GeoTargetConstantProtoP\001ZJgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v3/resources;resources\242\002\003GAA\252\002!Googl" +
      "e.Ads.GoogleAds.V3.Resources\312\002!Google\\Ad" +
      "s\\GoogleAds\\V3\\Resources\352\002%Google::Ads::" +
      "GoogleAds::V3::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v3.enums.GeoTargetConstantStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v3_resources_GeoTargetConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v3_resources_GeoTargetConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v3_resources_GeoTargetConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "CountryCode", "TargetType", "Status", "CanonicalName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v3.enums.GeoTargetConstantStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

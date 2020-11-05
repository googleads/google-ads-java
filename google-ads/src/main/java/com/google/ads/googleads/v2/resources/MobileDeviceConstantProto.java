// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/mobile_device_constant.proto

package com.google.ads.googleads.v2.resources;

public final class MobileDeviceConstantProto {
  private MobileDeviceConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_MobileDeviceConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_MobileDeviceConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v2/resources/mobi" +
      "le_device_constant.proto\022!google.ads.goo" +
      "gleads.v2.resources\0326google/ads/googlead" +
      "s/v2/enums/mobile_device_type.proto\032\037goo" +
      "gle/api/field_behavior.proto\032\031google/api" +
      "/resource.proto\032\036google/protobuf/wrapper" +
      "s.proto\032\034google/api/annotations.proto\"\200\004" +
      "\n\024MobileDeviceConstant\022L\n\rresource_name\030" +
      "\001 \001(\tB5\340A\003\372A/\n-googleads.googleapis.com/" +
      "MobileDeviceConstant\022,\n\002id\030\002 \001(\0132\033.googl" +
      "e.protobuf.Int64ValueB\003\340A\003\022/\n\004name\030\003 \001(\013" +
      "2\034.google.protobuf.StringValueB\003\340A\003\022<\n\021m" +
      "anufacturer_name\030\004 \001(\0132\034.google.protobuf" +
      ".StringValueB\003\340A\003\022@\n\025operating_system_na" +
      "me\030\005 \001(\0132\034.google.protobuf.StringValueB\003" +
      "\340A\003\022W\n\004type\030\006 \001(\0162D.google.ads.googleads" +
      ".v2.enums.MobileDeviceTypeEnum.MobileDev" +
      "iceTypeB\003\340A\003:b\352A_\n-googleads.googleapis." +
      "com/MobileDeviceConstant\022.mobileDeviceCo" +
      "nstants/{mobile_device_constant}B\206\002\n%com" +
      ".google.ads.googleads.v2.resourcesB\031Mobi" +
      "leDeviceConstantProtoP\001ZJgoogle.golang.o" +
      "rg/genproto/googleapis/ads/googleads/v2/" +
      "resources;resources\242\002\003GAA\252\002!Google.Ads.G" +
      "oogleAds.V2.Resources\312\002!Google\\Ads\\Googl" +
      "eAds\\V2\\Resources\352\002%Google::Ads::GoogleA" +
      "ds::V2::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v2.enums.MobileDeviceTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v2_resources_MobileDeviceConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_MobileDeviceConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_MobileDeviceConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "ManufacturerName", "OperatingSystemName", "Type", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v2.enums.MobileDeviceTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

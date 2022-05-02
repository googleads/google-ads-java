// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/operating_system_version_constant.proto

package com.google.ads.googleads.v10.resources;

public final class OperatingSystemVersionConstantProto {
  private OperatingSystemVersionConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_OperatingSystemVersionConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_OperatingSystemVersionConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nJgoogle/ads/googleads/v10/resources/ope" +
      "rating_system_version_constant.proto\022\"go" +
      "ogle.ads.googleads.v10.resources\032Kgoogle" +
      "/ads/googleads/v10/enums/operating_syste" +
      "m_version_operator_type.proto\032\037google/ap" +
      "i/field_behavior.proto\032\031google/api/resou" +
      "rce.proto\"\236\004\n\036OperatingSystemVersionCons" +
      "tant\022V\n\rresource_name\030\001 \001(\tB?\340A\003\372A9\n7goo" +
      "gleads.googleapis.com/OperatingSystemVer" +
      "sionConstant\022\024\n\002id\030\007 \001(\003B\003\340A\003H\000\210\001\001\022\026\n\004na" +
      "me\030\010 \001(\tB\003\340A\003H\001\210\001\001\022\"\n\020os_major_version\030\t" +
      " \001(\005B\003\340A\003H\002\210\001\001\022\"\n\020os_minor_version\030\n \001(\005" +
      "B\003\340A\003H\003\210\001\001\022\205\001\n\roperator_type\030\006 \001(\0162i.goo" +
      "gle.ads.googleads.v10.enums.OperatingSys" +
      "temVersionOperatorTypeEnum.OperatingSyst" +
      "emVersionOperatorTypeB\003\340A\003:l\352Ai\n7googlea" +
      "ds.googleapis.com/OperatingSystemVersion" +
      "Constant\022.operatingSystemVersionConstant" +
      "s/{criterion_id}B\005\n\003_idB\007\n\005_nameB\023\n\021_os_" +
      "major_versionB\023\n\021_os_minor_versionB\225\002\n&c" +
      "om.google.ads.googleads.v10.resourcesB#O" +
      "peratingSystemVersionConstantProtoP\001ZKgo" +
      "ogle.golang.org/genproto/googleapis/ads/" +
      "googleads/v10/resources;resources\242\002\003GAA\252" +
      "\002\"Google.Ads.GoogleAds.V10.Resources\312\002\"G" +
      "oogle\\Ads\\GoogleAds\\V10\\Resources\352\002&Goog" +
      "le::Ads::GoogleAds::V10::Resourcesb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.OperatingSystemVersionOperatorTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_OperatingSystemVersionConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_OperatingSystemVersionConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_OperatingSystemVersionConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "OsMajorVersion", "OsMinorVersion", "OperatorType", "Id", "Name", "OsMajorVersion", "OsMinorVersion", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.OperatingSystemVersionOperatorTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

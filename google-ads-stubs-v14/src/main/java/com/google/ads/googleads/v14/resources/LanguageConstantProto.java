// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/language_constant.proto

package com.google.ads.googleads.v14.resources;

public final class LanguageConstantProto {
  private LanguageConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_resources_LanguageConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_resources_LanguageConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v14/resources/lan" +
      "guage_constant.proto\022\"google.ads.googlea" +
      "ds.v14.resources\032\037google/api/field_behav" +
      "ior.proto\032\031google/api/resource.proto\"\277\002\n" +
      "\020LanguageConstant\022I\n\rresource_name\030\001 \001(\t" +
      "B2\342A\001\003\372A+\n)googleads.googleapis.com/Lang" +
      "uageConstant\022\025\n\002id\030\006 \001(\003B\004\342A\001\003H\000\210\001\001\022\027\n\004c" +
      "ode\030\007 \001(\tB\004\342A\001\003H\001\210\001\001\022\027\n\004name\030\010 \001(\tB\004\342A\001\003" +
      "H\002\210\001\001\022\035\n\ntargetable\030\t \001(\010B\004\342A\001\003H\003\210\001\001:P\352A" +
      "M\n)googleads.googleapis.com/LanguageCons" +
      "tant\022 languageConstants/{criterion_id}B\005" +
      "\n\003_idB\007\n\005_codeB\007\n\005_nameB\r\n\013_targetableB\207" +
      "\002\n&com.google.ads.googleads.v14.resource" +
      "sB\025LanguageConstantProtoP\001ZKgoogle.golan" +
      "g.org/genproto/googleapis/ads/googleads/" +
      "v14/resources;resources\242\002\003GAA\252\002\"Google.A" +
      "ds.GoogleAds.V14.Resources\312\002\"Google\\Ads\\" +
      "GoogleAds\\V14\\Resources\352\002&Google::Ads::G" +
      "oogleAds::V14::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v14_resources_LanguageConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_resources_LanguageConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_resources_LanguageConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Code", "Name", "Targetable", "Id", "Code", "Name", "Targetable", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/ad_group_customizer.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.resources;

public final class AdGroupCustomizerProto {
  private AdGroupCustomizerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v18_resources_AdGroupCustomizer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v18_resources_AdGroupCustomizer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v18/resources/ad_" +
      "group_customizer.proto\022\"google.ads.googl" +
      "eads.v18.resources\0326google/ads/googleads" +
      "/v18/common/customizer_value.proto\032<goog" +
      "le/ads/googleads/v18/enums/customizer_va" +
      "lue_status.proto\032\037google/api/field_behav" +
      "ior.proto\032\031google/api/resource.proto\"\244\004\n" +
      "\021AdGroupCustomizer\022I\n\rresource_name\030\001 \001(" +
      "\tB2\340A\005\372A,\n*googleads.googleapis.com/AdGr" +
      "oupCustomizer\022:\n\010ad_group\030\002 \001(\tB(\340A\005\372A\"\n" +
      " googleads.googleapis.com/AdGroup\022U\n\024cus" +
      "tomizer_attribute\030\003 \001(\tB7\340A\002\340A\005\372A.\n,goog" +
      "leads.googleapis.com/CustomizerAttribute" +
      "\022d\n\006status\030\004 \001(\0162O.google.ads.googleads." +
      "v18.enums.CustomizerValueStatusEnum.Cust" +
      "omizerValueStatusB\003\340A\003\022D\n\005value\030\005 \001(\01320." +
      "google.ads.googleads.v18.common.Customiz" +
      "erValueB\003\340A\002:\204\001\352A\200\001\n*googleads.googleapi" +
      "s.com/AdGroupCustomizer\022Rcustomers/{cust" +
      "omer_id}/adGroupCustomizers/{ad_group_id" +
      "}~{customizer_attribute_id}B\210\002\n&com.goog" +
      "le.ads.googleads.v18.resourcesB\026AdGroupC" +
      "ustomizerProtoP\001ZKgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v18/resour" +
      "ces;resources\242\002\003GAA\252\002\"Google.Ads.GoogleA" +
      "ds.V18.Resources\312\002\"Google\\Ads\\GoogleAds\\" +
      "V18\\Resources\352\002&Google::Ads::GoogleAds::" +
      "V18::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v18.common.CustomizerValueProto.getDescriptor(),
          com.google.ads.googleads.v18.enums.CustomizerValueStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v18_resources_AdGroupCustomizer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v18_resources_AdGroupCustomizer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v18_resources_AdGroupCustomizer_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroup", "CustomizerAttribute", "Status", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v18.common.CustomizerValueProto.getDescriptor();
    com.google.ads.googleads.v18.enums.CustomizerValueStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

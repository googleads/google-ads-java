// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/customer_customizer.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.resources;

public final class CustomerCustomizerProto {
  private CustomerCustomizerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_CustomerCustomizer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_CustomerCustomizer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v15/resources/cus" +
      "tomer_customizer.proto\022\"google.ads.googl" +
      "eads.v15.resources\0326google/ads/googleads" +
      "/v15/common/customizer_value.proto\032<goog" +
      "le/ads/googleads/v15/enums/customizer_va" +
      "lue_status.proto\032\037google/api/field_behav" +
      "ior.proto\032\031google/api/resource.proto\"\334\003\n" +
      "\022CustomerCustomizer\022J\n\rresource_name\030\001 \001" +
      "(\tB3\340A\005\372A-\n+googleads.googleapis.com/Cus" +
      "tomerCustomizer\022U\n\024customizer_attribute\030" +
      "\002 \001(\tB7\340A\002\340A\005\372A.\n,googleads.googleapis.c" +
      "om/CustomizerAttribute\022d\n\006status\030\003 \001(\0162O" +
      ".google.ads.googleads.v15.enums.Customiz" +
      "erValueStatusEnum.CustomizerValueStatusB" +
      "\003\340A\003\022D\n\005value\030\004 \001(\01320.google.ads.googlea" +
      "ds.v15.common.CustomizerValueB\003\340A\002:w\352At\n" +
      "+googleads.googleapis.com/CustomerCustom" +
      "izer\022Ecustomers/{customer_id}/customerCu" +
      "stomizers/{customizer_attribute_id}B\211\002\n&" +
      "com.google.ads.googleads.v15.resourcesB\027" +
      "CustomerCustomizerProtoP\001ZKgoogle.golang" +
      ".org/genproto/googleapis/ads/googleads/v" +
      "15/resources;resources\242\002\003GAA\252\002\"Google.Ad" +
      "s.GoogleAds.V15.Resources\312\002\"Google\\Ads\\G" +
      "oogleAds\\V15\\Resources\352\002&Google::Ads::Go" +
      "ogleAds::V15::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.common.CustomizerValueProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.CustomizerValueStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_CustomerCustomizer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_CustomerCustomizer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_CustomerCustomizer_descriptor,
        new java.lang.String[] { "ResourceName", "CustomizerAttribute", "Status", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.common.CustomizerValueProto.getDescriptor();
    com.google.ads.googleads.v15.enums.CustomizerValueStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

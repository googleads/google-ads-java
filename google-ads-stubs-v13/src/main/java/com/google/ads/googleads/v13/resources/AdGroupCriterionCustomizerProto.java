// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/ad_group_criterion_customizer.proto

package com.google.ads.googleads.v13.resources;

public final class AdGroupCriterionCustomizerProto {
  private AdGroupCriterionCustomizerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_resources_AdGroupCriterionCustomizer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_resources_AdGroupCriterionCustomizer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nFgoogle/ads/googleads/v13/resources/ad_" +
      "group_criterion_customizer.proto\022\"google" +
      ".ads.googleads.v13.resources\0326google/ads" +
      "/googleads/v13/common/customizer_value.p" +
      "roto\032<google/ads/googleads/v13/enums/cus" +
      "tomizer_value_status.proto\032\037google/api/f" +
      "ield_behavior.proto\032\031google/api/resource" +
      ".proto\"\211\005\n\032AdGroupCriterionCustomizer\022S\n" +
      "\rresource_name\030\001 \001(\tB<\342A\001\005\372A5\n3googleads" +
      ".googleapis.com/AdGroupCriterionCustomiz" +
      "er\022S\n\022ad_group_criterion\030\002 \001(\tB2\342A\001\005\372A+\n" +
      ")googleads.googleapis.com/AdGroupCriteri" +
      "onH\000\210\001\001\022T\n\024customizer_attribute\030\003 \001(\tB6\342" +
      "A\002\002\005\372A.\n,googleads.googleapis.com/Custom" +
      "izerAttribute\022e\n\006status\030\004 \001(\0162O.google.a" +
      "ds.googleads.v13.enums.CustomizerValueSt" +
      "atusEnum.CustomizerValueStatusB\004\342A\001\003\022E\n\005" +
      "value\030\005 \001(\01320.google.ads.googleads.v13.c" +
      "ommon.CustomizerValueB\004\342A\001\002:\245\001\352A\241\001\n3goog" +
      "leads.googleapis.com/AdGroupCriterionCus" +
      "tomizer\022jcustomers/{customer_id}/adGroup" +
      "CriterionCustomizers/{ad_group_id}~{crit" +
      "erion_id}~{customizer_attribute_id}B\025\n\023_" +
      "ad_group_criterionB\221\002\n&com.google.ads.go" +
      "ogleads.v13.resourcesB\037AdGroupCriterionC" +
      "ustomizerProtoP\001ZKgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v13/resour" +
      "ces;resources\242\002\003GAA\252\002\"Google.Ads.GoogleA" +
      "ds.V13.Resources\312\002\"Google\\Ads\\GoogleAds\\" +
      "V13\\Resources\352\002&Google::Ads::GoogleAds::" +
      "V13::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.common.CustomizerValueProto.getDescriptor(),
          com.google.ads.googleads.v13.enums.CustomizerValueStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_resources_AdGroupCriterionCustomizer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_resources_AdGroupCriterionCustomizer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_resources_AdGroupCriterionCustomizer_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupCriterion", "CustomizerAttribute", "Status", "Value", "AdGroupCriterion", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v13.common.CustomizerValueProto.getDescriptor();
    com.google.ads.googleads.v13.enums.CustomizerValueStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

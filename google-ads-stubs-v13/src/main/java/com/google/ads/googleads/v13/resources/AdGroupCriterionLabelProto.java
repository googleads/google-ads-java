// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/ad_group_criterion_label.proto

package com.google.ads.googleads.v13.resources;

public final class AdGroupCriterionLabelProto {
  private AdGroupCriterionLabelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_resources_AdGroupCriterionLabel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_resources_AdGroupCriterionLabel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v13/resources/ad_" +
      "group_criterion_label.proto\022\"google.ads." +
      "googleads.v13.resources\032\037google/api/fiel" +
      "d_behavior.proto\032\031google/api/resource.pr" +
      "oto\"\251\003\n\025AdGroupCriterionLabel\022N\n\rresourc" +
      "e_name\030\001 \001(\tB7\342A\001\005\372A0\n.googleads.googlea" +
      "pis.com/AdGroupCriterionLabel\022S\n\022ad_grou" +
      "p_criterion\030\004 \001(\tB2\342A\001\005\372A+\n)googleads.go" +
      "ogleapis.com/AdGroupCriterionH\000\210\001\001\022;\n\005la" +
      "bel\030\005 \001(\tB\'\342A\001\005\372A \n\036googleads.googleapis" +
      ".com/LabelH\001\210\001\001:\214\001\352A\210\001\n.googleads.google" +
      "apis.com/AdGroupCriterionLabel\022Vcustomer" +
      "s/{customer_id}/adGroupCriterionLabels/{" +
      "ad_group_id}~{criterion_id}~{label_id}B\025" +
      "\n\023_ad_group_criterionB\010\n\006_labelB\214\002\n&com." +
      "google.ads.googleads.v13.resourcesB\032AdGr" +
      "oupCriterionLabelProtoP\001ZKgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v1" +
      "3/resources;resources\242\002\003GAA\252\002\"Google.Ads" +
      ".GoogleAds.V13.Resources\312\002\"Google\\Ads\\Go" +
      "ogleAds\\V13\\Resources\352\002&Google::Ads::Goo" +
      "gleAds::V13::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_resources_AdGroupCriterionLabel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_resources_AdGroupCriterionLabel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_resources_AdGroupCriterionLabel_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupCriterion", "Label", "AdGroupCriterion", "Label", });
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

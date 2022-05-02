// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/ad_group_criterion_label.proto

package com.google.ads.googleads.v10.resources;

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
    internal_static_google_ads_googleads_v10_resources_AdGroupCriterionLabel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_AdGroupCriterionLabel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nAgoogle/ads/googleads/v10/resources/ad_" +
      "group_criterion_label.proto\022\"google.ads." +
      "googleads.v10.resources\032\037google/api/fiel" +
      "d_behavior.proto\032\031google/api/resource.pr" +
      "oto\"\246\003\n\025AdGroupCriterionLabel\022M\n\rresourc" +
      "e_name\030\001 \001(\tB6\340A\005\372A0\n.googleads.googleap" +
      "is.com/AdGroupCriterionLabel\022R\n\022ad_group" +
      "_criterion\030\004 \001(\tB1\340A\005\372A+\n)googleads.goog" +
      "leapis.com/AdGroupCriterionH\000\210\001\001\022:\n\005labe" +
      "l\030\005 \001(\tB&\340A\005\372A \n\036googleads.googleapis.co" +
      "m/LabelH\001\210\001\001:\214\001\352A\210\001\n.googleads.googleapi" +
      "s.com/AdGroupCriterionLabel\022Vcustomers/{" +
      "customer_id}/adGroupCriterionLabels/{ad_" +
      "group_id}~{criterion_id}~{label_id}B\025\n\023_" +
      "ad_group_criterionB\010\n\006_labelB\214\002\n&com.goo" +
      "gle.ads.googleads.v10.resourcesB\032AdGroup" +
      "CriterionLabelProtoP\001ZKgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v10/r" +
      "esources;resources\242\002\003GAA\252\002\"Google.Ads.Go" +
      "ogleAds.V10.Resources\312\002\"Google\\Ads\\Googl" +
      "eAds\\V10\\Resources\352\002&Google::Ads::Google" +
      "Ads::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_AdGroupCriterionLabel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_AdGroupCriterionLabel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_AdGroupCriterionLabel_descriptor,
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

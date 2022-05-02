// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/experiment_arm.proto

package com.google.ads.googleads.v10.resources;

public final class ExperimentArmProto {
  private ExperimentArmProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ExperimentArm_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ExperimentArm_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v10/resources/exp" +
      "eriment_arm.proto\022\"google.ads.googleads." +
      "v10.resources\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\"\277\003\n\rEx" +
      "perimentArm\022E\n\rresource_name\030\001 \001(\tB.\340A\005\372" +
      "A(\n&googleads.googleapis.com/ExperimentA" +
      "rm\022:\n\005trial\030\002 \001(\tB+\340A\005\372A%\n#googleads.goo" +
      "gleapis.com/Experiment\022\021\n\004name\030\003 \001(\tB\003\340A" +
      "\002\022\017\n\007control\030\004 \001(\010\022\025\n\rtraffic_split\030\005 \001(" +
      "\003\0229\n\tcampaigns\030\006 \003(\tB&\372A#\n!googleads.goo" +
      "gleapis.com/Campaign\022F\n\023in_design_campai" +
      "gns\030\007 \003(\tB)\340A\003\372A#\n!googleads.googleapis." +
      "com/Campaign:m\352Aj\n&googleads.googleapis." +
      "com/ExperimentArm\022@customers/{customer_i" +
      "d}/experimentArms/{trial_id}~{trial_arm_" +
      "id}B\204\002\n&com.google.ads.googleads.v10.res" +
      "ourcesB\022ExperimentArmProtoP\001ZKgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v10/resources;resources\242\002\003GAA\252\002\"Google" +
      ".Ads.GoogleAds.V10.Resources\312\002\"Google\\Ad" +
      "s\\GoogleAds\\V10\\Resources\352\002&Google::Ads:" +
      ":GoogleAds::V10::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_ExperimentArm_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_ExperimentArm_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ExperimentArm_descriptor,
        new java.lang.String[] { "ResourceName", "Trial", "Name", "Control", "TrafficSplit", "Campaigns", "InDesignCampaigns", });
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

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/ad_group_criterion_simulation_service.proto

package com.google.ads.googleads.v1.services;

public final class AdGroupCriterionSimulationServiceProto {
  private AdGroupCriterionSimulationServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetAdGroupCriterionSimulationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetAdGroupCriterionSimulationRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nLgoogle/ads/googleads/v1/services/ad_gr" +
      "oup_criterion_simulation_service.proto\022 " +
      "google.ads.googleads.v1.services\032Egoogle" +
      "/ads/googleads/v1/resources/ad_group_cri" +
      "terion_simulation.proto\032\034google/api/anno" +
      "tations.proto\032\027google/api/client.proto\032\037" +
      "google/api/field_behavior.proto\032\031google/" +
      "api/resource.proto\"z\n$GetAdGroupCriterio" +
      "nSimulationRequest\022R\n\rresource_name\030\001 \001(" +
      "\tB;\340A\002\372A5\n3googleads.googleapis.com/AdGr" +
      "oupCriterionSimulation2\300\002\n!AdGroupCriter" +
      "ionSimulationService\022\375\001\n\035GetAdGroupCrite" +
      "rionSimulation\022F.google.ads.googleads.v1" +
      ".services.GetAdGroupCriterionSimulationR" +
      "equest\032=.google.ads.googleads.v1.resourc" +
      "es.AdGroupCriterionSimulation\"U\202\323\344\223\002?\022=/" +
      "v1/{resource_name=customers/*/adGroupCri" +
      "terionSimulations/*}\332A\rresource_name\032\033\312A" +
      "\030googleads.googleapis.comB\215\002\n$com.google" +
      ".ads.googleads.v1.servicesB&AdGroupCrite" +
      "rionSimulationServiceProtoP\001ZHgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v1/services;services\242\002\003GAA\252\002 Google.Ad" +
      "s.GoogleAds.V1.Services\312\002 Google\\Ads\\Goo" +
      "gleAds\\V1\\Services\352\002$Google::Ads::Google" +
      "Ads::V1::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.resources.AdGroupCriterionSimulationProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v1_services_GetAdGroupCriterionSimulationRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetAdGroupCriterionSimulationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetAdGroupCriterionSimulationRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.AdGroupCriterionSimulationProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/campaign_criterion_simulation.proto

package com.google.ads.googleads.v12.resources;

public final class CampaignCriterionSimulationProto {
  private CampaignCriterionSimulationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_CampaignCriterionSimulation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_CampaignCriterionSimulation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nFgoogle/ads/googleads/v12/resources/cam" +
      "paign_criterion_simulation.proto\022\"google" +
      ".ads.googleads.v12.resources\0320google/ads" +
      "/googleads/v12/common/simulation.proto\032C" +
      "google/ads/googleads/v12/enums/simulatio" +
      "n_modification_method.proto\0324google/ads/" +
      "googleads/v12/enums/simulation_type.prot" +
      "o\032\037google/api/field_behavior.proto\032\031goog" +
      "le/api/resource.proto\"\305\006\n\033CampaignCriter" +
      "ionSimulation\022T\n\rresource_name\030\001 \001(\tB=\342A" +
      "\001\003\372A6\n4googleads.googleapis.com/Campaign" +
      "CriterionSimulation\022\036\n\013campaign_id\030\t \001(\003" +
      "B\004\342A\001\003H\001\210\001\001\022\037\n\014criterion_id\030\n \001(\003B\004\342A\001\003H" +
      "\002\210\001\001\022U\n\004type\030\004 \001(\0162A.google.ads.googlead" +
      "s.v12.enums.SimulationTypeEnum.Simulatio" +
      "nTypeB\004\342A\001\003\022\200\001\n\023modification_method\030\005 \001(" +
      "\0162].google.ads.googleads.v12.enums.Simul" +
      "ationModificationMethodEnum.SimulationMo" +
      "dificationMethodB\004\342A\001\003\022\035\n\nstart_date\030\013 \001" +
      "(\tB\004\342A\001\003H\003\210\001\001\022\033\n\010end_date\030\014 \001(\tB\004\342A\001\003H\004\210" +
      "\001\001\022h\n\027bid_modifier_point_list\030\010 \001(\0132?.go" +
      "ogle.ads.googleads.v12.common.BidModifie" +
      "rSimulationPointListB\004\342A\001\003H\000:\303\001\352A\277\001\n4goo" +
      "gleads.googleapis.com/CampaignCriterionS" +
      "imulation\022\206\001customers/{customer_id}/camp" +
      "aignCriterionSimulations/{campaign_id}~{" +
      "criterion_id}~{type}~{modification_metho" +
      "d}~{start_date}~{end_date}B\014\n\npoint_list" +
      "B\016\n\014_campaign_idB\017\n\r_criterion_idB\r\n\013_st" +
      "art_dateB\013\n\t_end_dateB\222\002\n&com.google.ads" +
      ".googleads.v12.resourcesB CampaignCriter" +
      "ionSimulationProtoP\001ZKgoogle.golang.org/" +
      "genproto/googleapis/ads/googleads/v12/re" +
      "sources;resources\242\002\003GAA\252\002\"Google.Ads.Goo" +
      "gleAds.V12.Resources\312\002\"Google\\Ads\\Google" +
      "Ads\\V12\\Resources\352\002&Google::Ads::GoogleA" +
      "ds::V12::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.common.SimulationProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.SimulationModificationMethodProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.SimulationTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_CampaignCriterionSimulation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_CampaignCriterionSimulation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_CampaignCriterionSimulation_descriptor,
        new java.lang.String[] { "ResourceName", "CampaignId", "CriterionId", "Type", "ModificationMethod", "StartDate", "EndDate", "BidModifierPointList", "PointList", "CampaignId", "CriterionId", "StartDate", "EndDate", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v12.common.SimulationProto.getDescriptor();
    com.google.ads.googleads.v12.enums.SimulationModificationMethodProto.getDescriptor();
    com.google.ads.googleads.v12.enums.SimulationTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

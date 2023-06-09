// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/bidding_strategy_simulation.proto

package com.google.ads.googleads.v13.resources;

public final class BiddingStrategySimulationProto {
  private BiddingStrategySimulationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_resources_BiddingStrategySimulation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_resources_BiddingStrategySimulation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nDgoogle/ads/googleads/v13/resources/bid" +
      "ding_strategy_simulation.proto\022\"google.a" +
      "ds.googleads.v13.resources\0320google/ads/g" +
      "oogleads/v13/common/simulation.proto\032Cgo" +
      "ogle/ads/googleads/v13/enums/simulation_" +
      "modification_method.proto\0324google/ads/go" +
      "ogleads/v13/enums/simulation_type.proto\032" +
      "\037google/api/field_behavior.proto\032\031google" +
      "/api/resource.proto\"\264\006\n\031BiddingStrategyS" +
      "imulation\022R\n\rresource_name\030\001 \001(\tB;\342A\001\003\372A" +
      "4\n2googleads.googleapis.com/BiddingStrat" +
      "egySimulation\022!\n\023bidding_strategy_id\030\002 \001" +
      "(\003B\004\342A\001\003\022U\n\004type\030\003 \001(\0162A.google.ads.goog" +
      "leads.v13.enums.SimulationTypeEnum.Simul" +
      "ationTypeB\004\342A\001\003\022\200\001\n\023modification_method\030" +
      "\004 \001(\0162].google.ads.googleads.v13.enums.S" +
      "imulationModificationMethodEnum.Simulati" +
      "onModificationMethodB\004\342A\001\003\022\030\n\nstart_date" +
      "\030\005 \001(\tB\004\342A\001\003\022\026\n\010end_date\030\006 \001(\tB\004\342A\001\003\022d\n\025" +
      "target_cpa_point_list\030\007 \001(\0132=.google.ads" +
      ".googleads.v13.common.TargetCpaSimulatio" +
      "nPointListB\004\342A\001\003H\000\022f\n\026target_roas_point_" +
      "list\030\010 \001(\0132>.google.ads.googleads.v13.co" +
      "mmon.TargetRoasSimulationPointListB\004\342A\001\003" +
      "H\000:\267\001\352A\263\001\n2googleads.googleapis.com/Bidd" +
      "ingStrategySimulation\022}customers/{custom" +
      "er_id}/biddingStrategySimulations/{biddi" +
      "ng_strategy_id}~{type}~{modification_met" +
      "hod}~{start_date}~{end_date}B\014\n\npoint_li" +
      "stB\220\002\n&com.google.ads.googleads.v13.reso" +
      "urcesB\036BiddingStrategySimulationProtoP\001Z" +
      "Kgoogle.golang.org/genproto/googleapis/a" +
      "ds/googleads/v13/resources;resources\242\002\003G" +
      "AA\252\002\"Google.Ads.GoogleAds.V13.Resources\312" +
      "\002\"Google\\Ads\\GoogleAds\\V13\\Resources\352\002&G" +
      "oogle::Ads::GoogleAds::V13::Resourcesb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.common.SimulationProto.getDescriptor(),
          com.google.ads.googleads.v13.enums.SimulationModificationMethodProto.getDescriptor(),
          com.google.ads.googleads.v13.enums.SimulationTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_resources_BiddingStrategySimulation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_resources_BiddingStrategySimulation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_resources_BiddingStrategySimulation_descriptor,
        new java.lang.String[] { "ResourceName", "BiddingStrategyId", "Type", "ModificationMethod", "StartDate", "EndDate", "TargetCpaPointList", "TargetRoasPointList", "PointList", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v13.common.SimulationProto.getDescriptor();
    com.google.ads.googleads.v13.enums.SimulationModificationMethodProto.getDescriptor();
    com.google.ads.googleads.v13.enums.SimulationTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

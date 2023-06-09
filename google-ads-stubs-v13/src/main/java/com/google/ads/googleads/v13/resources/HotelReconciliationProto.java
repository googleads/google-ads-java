// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/hotel_reconciliation.proto

package com.google.ads.googleads.v13.resources;

public final class HotelReconciliationProto {
  private HotelReconciliationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_resources_HotelReconciliation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_resources_HotelReconciliation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v13/resources/hot" +
      "el_reconciliation.proto\022\"google.ads.goog" +
      "leads.v13.resources\032@google/ads/googlead" +
      "s/v13/enums/hotel_reconciliation_status." +
      "proto\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\"\350\004\n\023HotelRecon" +
      "ciliation\022L\n\rresource_name\030\001 \001(\tB5\342A\001\005\372A" +
      ".\n,googleads.googleapis.com/HotelReconci" +
      "liation\022\034\n\rcommission_id\030\002 \001(\tB\005\342A\002\002\003\022\026\n" +
      "\010order_id\030\003 \001(\tB\004\342A\001\003\022<\n\010campaign\030\013 \001(\tB" +
      "*\342A\001\003\372A#\n!googleads.googleapis.com/Campa" +
      "ign\022\035\n\017hotel_center_id\030\004 \001(\003B\004\342A\001\003\022\026\n\010ho" +
      "tel_id\030\005 \001(\tB\004\342A\001\003\022\033\n\rcheck_in_date\030\006 \001(" +
      "\tB\004\342A\001\003\022\034\n\016check_out_date\030\007 \001(\tB\004\342A\001\003\022&\n" +
      "\027reconciled_value_micros\030\010 \001(\003B\005\342A\002\002\003\022\024\n" +
      "\006billed\030\t \001(\010B\004\342A\001\003\022n\n\006status\030\n \001(\0162W.go" +
      "ogle.ads.googleads.v13.enums.HotelReconc" +
      "iliationStatusEnum.HotelReconciliationSt" +
      "atusB\005\342A\002\002\003:o\352Al\n,googleads.googleapis.c" +
      "om/HotelReconciliation\022<customers/{custo" +
      "mer_id}/hotelReconciliations/{commission" +
      "_id}B\212\002\n&com.google.ads.googleads.v13.re" +
      "sourcesB\030HotelReconciliationProtoP\001ZKgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v13/resources;resources\242\002\003GAA\252\002" +
      "\"Google.Ads.GoogleAds.V13.Resources\312\002\"Go" +
      "ogle\\Ads\\GoogleAds\\V13\\Resources\352\002&Googl" +
      "e::Ads::GoogleAds::V13::Resourcesb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.enums.HotelReconciliationStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_resources_HotelReconciliation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_resources_HotelReconciliation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_resources_HotelReconciliation_descriptor,
        new java.lang.String[] { "ResourceName", "CommissionId", "OrderId", "Campaign", "HotelCenterId", "HotelId", "CheckInDate", "CheckOutDate", "ReconciledValueMicros", "Billed", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v13.enums.HotelReconciliationStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

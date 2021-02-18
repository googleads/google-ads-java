// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/resources/call_view.proto

package com.google.ads.googleads.v6.resources;

public final class CallViewProto {
  private CallViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_resources_CallView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_resources_CallView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v6/resources/call" +
      "_view.proto\022!google.ads.googleads.v6.res" +
      "ources\032Bgoogle/ads/googleads/v6/enums/ca" +
      "ll_tracking_display_location.proto\032-goog" +
      "le/ads/googleads/v6/enums/call_type.prot" +
      "o\032<google/ads/googleads/v6/enums/google_" +
      "voice_call_status.proto\032\037google/api/fiel" +
      "d_behavior.proto\032\031google/api/resource.pr" +
      "oto\032\034google/api/annotations.proto\"\215\005\n\010Ca" +
      "llView\022@\n\rresource_name\030\001 \001(\tB)\340A\003\372A#\n!g" +
      "oogleads.googleapis.com/CallView\022\037\n\022call" +
      "er_region_code\030\002 \001(\tB\003\340A\003\022\035\n\020caller_area" +
      "_code\030\003 \001(\tB\003\340A\003\022\"\n\025call_duration_second" +
      "s\030\004 \001(\003B\003\340A\003\022!\n\024start_call_date_time\030\005 \001" +
      "(\tB\003\340A\003\022\037\n\022end_call_date_time\030\006 \001(\tB\003\340A\003" +
      "\022\207\001\n\036call_tracking_display_location\030\007 \001(" +
      "\0162Z.google.ads.googleads.v6.enums.CallTr" +
      "ackingDisplayLocationEnum.CallTrackingDi" +
      "splayLocationB\003\340A\003\022G\n\004type\030\010 \001(\01624.googl" +
      "e.ads.googleads.v6.enums.CallTypeEnum.Ca" +
      "llTypeB\003\340A\003\022h\n\013call_status\030\t \001(\0162N.googl" +
      "e.ads.googleads.v6.enums.GoogleVoiceCall" +
      "StatusEnum.GoogleVoiceCallStatusB\003\340A\003:Z\352" +
      "AW\n!googleads.googleapis.com/CallView\0222c" +
      "ustomers/{customer_id}/callViews/{call_d" +
      "etail_id}B\372\001\n%com.google.ads.googleads.v" +
      "6.resourcesB\rCallViewProtoP\001ZJgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v6/resources;resources\242\002\003GAA\252\002!Google." +
      "Ads.GoogleAds.V6.Resources\312\002!Google\\Ads\\" +
      "GoogleAds\\V6\\Resources\352\002%Google::Ads::Go" +
      "ogleAds::V6::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.enums.CallTrackingDisplayLocationProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.CallTypeProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.GoogleVoiceCallStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_resources_CallView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_resources_CallView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_resources_CallView_descriptor,
        new java.lang.String[] { "ResourceName", "CallerRegionCode", "CallerAreaCode", "CallDurationSeconds", "StartCallDateTime", "EndCallDateTime", "CallTrackingDisplayLocation", "Type", "CallStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v6.enums.CallTrackingDisplayLocationProto.getDescriptor();
    com.google.ads.googleads.v6.enums.CallTypeProto.getDescriptor();
    com.google.ads.googleads.v6.enums.GoogleVoiceCallStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

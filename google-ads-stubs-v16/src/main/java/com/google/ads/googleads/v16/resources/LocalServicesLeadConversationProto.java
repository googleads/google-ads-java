// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/local_services_lead_conversation.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.resources;

public final class LocalServicesLeadConversationProto {
  private LocalServicesLeadConversationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_LocalServicesLeadConversation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_LocalServicesLeadConversation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_PhoneCallDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_PhoneCallDetails_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_MessageDetails_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_MessageDetails_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIgoogle/ads/googleads/v16/resources/loc" +
      "al_services_lead_conversation.proto\022\"goo" +
      "gle.ads.googleads.v16.resources\032Egoogle/" +
      "ads/googleads/v16/enums/local_services_c" +
      "onversation_type.proto\032Dgoogle/ads/googl" +
      "eads/v16/enums/local_services_participan" +
      "t_type.proto\032\037google/api/field_behavior." +
      "proto\032\031google/api/resource.proto\"\316\006\n\035Loc" +
      "alServicesLeadConversation\022U\n\rresource_n" +
      "ame\030\001 \001(\tB>\340A\003\372A8\n6googleads.googleapis." +
      "com/LocalServicesLeadConversation\022\017\n\002id\030" +
      "\002 \001(\003B\003\340A\003\022y\n\024conversation_channel\030\003 \001(\016" +
      "2V.google.ads.googleads.v16.enums.LocalS" +
      "ervicesLeadConversationTypeEnum.Conversa" +
      "tionTypeB\003\340A\003\022o\n\020participant_type\030\004 \001(\0162" +
      "P.google.ads.googleads.v16.enums.LocalSe" +
      "rvicesParticipantTypeEnum.ParticipantTyp" +
      "eB\003\340A\003\022@\n\004lead\030\005 \001(\tB2\340A\003\372A,\n*googleads." +
      "googleapis.com/LocalServicesLead\022\034\n\017even" +
      "t_date_time\030\006 \001(\tB\003\340A\003\022Z\n\022phone_call_det" +
      "ails\030\007 \001(\01324.google.ads.googleads.v16.re" +
      "sources.PhoneCallDetailsB\003\340A\003H\000\210\001\001\022U\n\017me" +
      "ssage_details\030\010 \001(\01322.google.ads.googlea" +
      "ds.v16.resources.MessageDetailsB\003\340A\003H\001\210\001" +
      "\001:\232\001\352A\226\001\n6googleads.googleapis.com/Local" +
      "ServicesLeadConversation\022\\customers/{cus" +
      "tomer_id}/localServicesLeadConversations" +
      "/{local_services_lead_conversation_id}B\025" +
      "\n\023_phone_call_detailsB\022\n\020_message_detail" +
      "s\"V\n\020PhoneCallDetails\022!\n\024call_duration_m" +
      "illis\030\001 \001(\003B\003\340A\003\022\037\n\022call_recording_url\030\002" +
      " \001(\tB\003\340A\003\"#\n\016MessageDetails\022\021\n\004text\030\001 \001(" +
      "\tB\003\340A\003B\224\002\n&com.google.ads.googleads.v16." +
      "resourcesB\"LocalServicesLeadConversation" +
      "ProtoP\001ZKgoogle.golang.org/genproto/goog" +
      "leapis/ads/googleads/v16/resources;resou" +
      "rces\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V16.Re" +
      "sources\312\002\"Google\\Ads\\GoogleAds\\V16\\Resou" +
      "rces\352\002&Google::Ads::GoogleAds::V16::Reso" +
      "urcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.enums.LocalServicesConversationTypeProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.LocalServicesParticipantTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_resources_LocalServicesLeadConversation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_resources_LocalServicesLeadConversation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_LocalServicesLeadConversation_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "ConversationChannel", "ParticipantType", "Lead", "EventDateTime", "PhoneCallDetails", "MessageDetails", });
    internal_static_google_ads_googleads_v16_resources_PhoneCallDetails_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v16_resources_PhoneCallDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_PhoneCallDetails_descriptor,
        new java.lang.String[] { "CallDurationMillis", "CallRecordingUrl", });
    internal_static_google_ads_googleads_v16_resources_MessageDetails_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v16_resources_MessageDetails_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_MessageDetails_descriptor,
        new java.lang.String[] { "Text", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v16.enums.LocalServicesConversationTypeProto.getDescriptor();
    com.google.ads.googleads.v16.enums.LocalServicesParticipantTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/services/campaign_label_service.proto

package com.google.ads.googleads.v4.services;

public final class CampaignLabelServiceProto {
  private CampaignLabelServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_GetCampaignLabelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_GetCampaignLabelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateCampaignLabelsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateCampaignLabelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_CampaignLabelOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_CampaignLabelOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateCampaignLabelsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateCampaignLabelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_services_MutateCampaignLabelResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_services_MutateCampaignLabelResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v4/services/campa" +
      "ign_label_service.proto\022 google.ads.goog" +
      "leads.v4.services\0326google/ads/googleads/" +
      "v4/resources/campaign_label.proto\032\034googl" +
      "e/api/annotations.proto\032\027google/api/clie" +
      "nt.proto\032\037google/api/field_behavior.prot" +
      "o\032\031google/api/resource.proto\032\027google/rpc" +
      "/status.proto\"`\n\027GetCampaignLabelRequest" +
      "\022E\n\rresource_name\030\001 \001(\tB.\340A\002\372A(\n&googlea" +
      "ds.googleapis.com/CampaignLabel\"\272\001\n\033Muta" +
      "teCampaignLabelsRequest\022\030\n\013customer_id\030\001" +
      " \001(\tB\003\340A\002\022Q\n\noperations\030\002 \003(\01328.google.a" +
      "ds.googleads.v4.services.CampaignLabelOp" +
      "erationB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n" +
      "\rvalidate_only\030\004 \001(\010\"{\n\026CampaignLabelOpe" +
      "ration\022B\n\006create\030\001 \001(\01320.google.ads.goog" +
      "leads.v4.resources.CampaignLabelH\000\022\020\n\006re" +
      "move\030\002 \001(\tH\000B\013\n\toperation\"\237\001\n\034MutateCamp" +
      "aignLabelsResponse\0221\n\025partial_failure_er" +
      "ror\030\003 \001(\0132\022.google.rpc.Status\022L\n\007results" +
      "\030\002 \003(\0132;.google.ads.googleads.v4.service" +
      "s.MutateCampaignLabelResult\"2\n\031MutateCam" +
      "paignLabelResult\022\025\n\rresource_name\030\001 \001(\t2" +
      "\360\003\n\024CampaignLabelService\022\311\001\n\020GetCampaign" +
      "Label\0229.google.ads.googleads.v4.services" +
      ".GetCampaignLabelRequest\0320.google.ads.go" +
      "ogleads.v4.resources.CampaignLabel\"H\202\323\344\223" +
      "\0022\0220/v4/{resource_name=customers/*/campa" +
      "ignLabels/*}\332A\rresource_name\022\356\001\n\024MutateC" +
      "ampaignLabels\022=.google.ads.googleads.v4." +
      "services.MutateCampaignLabelsRequest\032>.g" +
      "oogle.ads.googleads.v4.services.MutateCa" +
      "mpaignLabelsResponse\"W\202\323\344\223\0028\"3/v4/custom" +
      "ers/{customer_id=*}/campaignLabels:mutat" +
      "e:\001*\332A\026customer_id,operations\032\033\312A\030google" +
      "ads.googleapis.comB\200\002\n$com.google.ads.go" +
      "ogleads.v4.servicesB\031CampaignLabelServic" +
      "eProtoP\001ZHgoogle.golang.org/genproto/goo" +
      "gleapis/ads/googleads/v4/services;servic" +
      "es\242\002\003GAA\252\002 Google.Ads.GoogleAds.V4.Servi" +
      "ces\312\002 Google\\Ads\\GoogleAds\\V4\\Services\352\002" +
      "$Google::Ads::GoogleAds::V4::Servicesb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.resources.CampaignLabelProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_services_GetCampaignLabelRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_services_GetCampaignLabelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_GetCampaignLabelRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v4_services_MutateCampaignLabelsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v4_services_MutateCampaignLabelsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateCampaignLabelsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v4_services_CampaignLabelOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v4_services_CampaignLabelOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_CampaignLabelOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v4_services_MutateCampaignLabelsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v4_services_MutateCampaignLabelsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateCampaignLabelsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v4_services_MutateCampaignLabelResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v4_services_MutateCampaignLabelResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_services_MutateCampaignLabelResult_descriptor,
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
    com.google.ads.googleads.v4.resources.CampaignLabelProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

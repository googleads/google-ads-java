// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/services/ad_group_criterion_label_service.proto

package com.google.ads.googleads.v1.services;

public final class AdGroupCriterionLabelServiceProto {
  private AdGroupCriterionLabelServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_GetAdGroupCriterionLabelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_GetAdGroupCriterionLabelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateAdGroupCriterionLabelsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateAdGroupCriterionLabelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_AdGroupCriterionLabelOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_AdGroupCriterionLabelOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateAdGroupCriterionLabelsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateAdGroupCriterionLabelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_services_MutateAdGroupCriterionLabelResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_services_MutateAdGroupCriterionLabelResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/ads/googleads/v1/services/ad_gr" +
      "oup_criterion_label_service.proto\022 googl" +
      "e.ads.googleads.v1.services\032@google/ads/" +
      "googleads/v1/resources/ad_group_criterio" +
      "n_label.proto\032\034google/api/annotations.pr" +
      "oto\032\036google/protobuf/wrappers.proto\032\027goo" +
      "gle/rpc/status.proto\"8\n\037GetAdGroupCriter" +
      "ionLabelRequest\022\025\n\rresource_name\030\001 \001(\t\"\300" +
      "\001\n#MutateAdGroupCriterionLabelsRequest\022\023" +
      "\n\013customer_id\030\001 \001(\t\022T\n\noperations\030\002 \003(\0132" +
      "@.google.ads.googleads.v1.services.AdGro" +
      "upCriterionLabelOperation\022\027\n\017partial_fai" +
      "lure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\"\213\001\n\036Ad" +
      "GroupCriterionLabelOperation\022J\n\006create\030\001" +
      " \001(\01328.google.ads.googleads.v1.resources" +
      ".AdGroupCriterionLabelH\000\022\020\n\006remove\030\002 \001(\t" +
      "H\000B\013\n\toperation\"\257\001\n$MutateAdGroupCriteri" +
      "onLabelsResponse\0221\n\025partial_failure_erro" +
      "r\030\003 \001(\0132\022.google.rpc.Status\022T\n\007results\030\002" +
      " \003(\0132C.google.ads.googleads.v1.services." +
      "MutateAdGroupCriterionLabelResult\":\n!Mut" +
      "ateAdGroupCriterionLabelResult\022\025\n\rresour" +
      "ce_name\030\001 \001(\t2\362\003\n\034AdGroupCriterionLabelS" +
      "ervice\022\331\001\n\030GetAdGroupCriterionLabel\022A.go" +
      "ogle.ads.googleads.v1.services.GetAdGrou" +
      "pCriterionLabelRequest\0328.google.ads.goog" +
      "leads.v1.resources.AdGroupCriterionLabel" +
      "\"@\202\323\344\223\002:\0228/v1/{resource_name=customers/*" +
      "/adGroupCriterionLabels/*}\022\365\001\n\034MutateAdG" +
      "roupCriterionLabels\022E.google.ads.googlea" +
      "ds.v1.services.MutateAdGroupCriterionLab" +
      "elsRequest\032F.google.ads.googleads.v1.ser" +
      "vices.MutateAdGroupCriterionLabelsRespon" +
      "se\"F\202\323\344\223\002@\";/v1/customers/{customer_id=*" +
      "}/adGroupCriterionLabels:mutate:\001*B\210\002\n$c" +
      "om.google.ads.googleads.v1.servicesB!AdG" +
      "roupCriterionLabelServiceProtoP\001ZHgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v1/services;services\242\002\003GAA\252\002 Googl" +
      "e.Ads.GoogleAds.V1.Services\312\002 Google\\Ads" +
      "\\GoogleAds\\V1\\Services\352\002$Google::Ads::Go" +
      "ogleAds::V1::Servicesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v1.resources.AdGroupCriterionLabelProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_services_GetAdGroupCriterionLabelRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_services_GetAdGroupCriterionLabelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_GetAdGroupCriterionLabelRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v1_services_MutateAdGroupCriterionLabelsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v1_services_MutateAdGroupCriterionLabelsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateAdGroupCriterionLabelsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v1_services_AdGroupCriterionLabelOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v1_services_AdGroupCriterionLabelOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_AdGroupCriterionLabelOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v1_services_MutateAdGroupCriterionLabelsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v1_services_MutateAdGroupCriterionLabelsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateAdGroupCriterionLabelsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v1_services_MutateAdGroupCriterionLabelResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v1_services_MutateAdGroupCriterionLabelResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_services_MutateAdGroupCriterionLabelResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v1.resources.AdGroupCriterionLabelProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

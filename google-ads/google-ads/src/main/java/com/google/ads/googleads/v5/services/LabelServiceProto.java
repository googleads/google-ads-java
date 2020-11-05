// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/services/label_service.proto

package com.google.ads.googleads.v5.services;

public final class LabelServiceProto {
  private LabelServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_GetLabelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_GetLabelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_MutateLabelsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_MutateLabelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_LabelOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_LabelOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_MutateLabelsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_MutateLabelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_MutateLabelResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_MutateLabelResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/ads/googleads/v5/services/label" +
      "_service.proto\022 google.ads.googleads.v5." +
      "services\0329google/ads/googleads/v5/enums/" +
      "response_content_type.proto\032-google/ads/" +
      "googleads/v5/resources/label.proto\032\034goog" +
      "le/api/annotations.proto\032\027google/api/cli" +
      "ent.proto\032\037google/api/field_behavior.pro" +
      "to\032\031google/api/resource.proto\032 google/pr" +
      "otobuf/field_mask.proto\032\027google/rpc/stat" +
      "us.proto\"P\n\017GetLabelRequest\022=\n\rresource_" +
      "name\030\001 \001(\tB&\340A\002\372A \n\036googleads.googleapis" +
      ".com/Label\"\225\002\n\023MutateLabelsRequest\022\030\n\013cu" +
      "stomer_id\030\001 \001(\tB\003\340A\002\022I\n\noperations\030\002 \003(\013" +
      "20.google.ads.googleads.v5.services.Labe" +
      "lOperationB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010" +
      "\022\025\n\rvalidate_only\030\004 \001(\010\022i\n\025response_cont" +
      "ent_type\030\005 \001(\0162J.google.ads.googleads.v5" +
      ".enums.ResponseContentTypeEnum.ResponseC" +
      "ontentType\"\330\001\n\016LabelOperation\022/\n\013update_" +
      "mask\030\004 \001(\0132\032.google.protobuf.FieldMask\022:" +
      "\n\006create\030\001 \001(\0132(.google.ads.googleads.v5" +
      ".resources.LabelH\000\022:\n\006update\030\002 \001(\0132(.goo" +
      "gle.ads.googleads.v5.resources.LabelH\000\022\020" +
      "\n\006remove\030\003 \001(\tH\000B\013\n\toperation\"\217\001\n\024Mutate" +
      "LabelsResponse\0221\n\025partial_failure_error\030" +
      "\003 \001(\0132\022.google.rpc.Status\022D\n\007results\030\002 \003" +
      "(\01323.google.ads.googleads.v5.services.Mu" +
      "tateLabelResult\"c\n\021MutateLabelResult\022\025\n\r" +
      "resource_name\030\001 \001(\t\0227\n\005label\030\002 \001(\0132(.goo" +
      "gle.ads.googleads.v5.resources.Label2\250\003\n" +
      "\014LabelService\022\251\001\n\010GetLabel\0221.google.ads." +
      "googleads.v5.services.GetLabelRequest\032(." +
      "google.ads.googleads.v5.resources.Label\"" +
      "@\202\323\344\223\002*\022(/v5/{resource_name=customers/*/" +
      "labels/*}\332A\rresource_name\022\316\001\n\014MutateLabe" +
      "ls\0225.google.ads.googleads.v5.services.Mu" +
      "tateLabelsRequest\0326.google.ads.googleads" +
      ".v5.services.MutateLabelsResponse\"O\202\323\344\223\002" +
      "0\"+/v5/customers/{customer_id=*}/labels:" +
      "mutate:\001*\332A\026customer_id,operations\032\033\312A\030g" +
      "oogleads.googleapis.comB\370\001\n$com.google.a" +
      "ds.googleads.v5.servicesB\021LabelServicePr" +
      "otoP\001ZHgoogle.golang.org/genproto/google" +
      "apis/ads/googleads/v5/services;services\242" +
      "\002\003GAA\252\002 Google.Ads.GoogleAds.V5.Services" +
      "\312\002 Google\\Ads\\GoogleAds\\V5\\Services\352\002$Go" +
      "ogle::Ads::GoogleAds::V5::Servicesb\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.resources.LabelProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_services_GetLabelRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_services_GetLabelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_GetLabelRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v5_services_MutateLabelsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v5_services_MutateLabelsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_MutateLabelsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v5_services_LabelOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v5_services_LabelOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_LabelOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v5_services_MutateLabelsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v5_services_MutateLabelsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_MutateLabelsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v5_services_MutateLabelResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v5_services_MutateLabelResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_MutateLabelResult_descriptor,
        new java.lang.String[] { "ResourceName", "Label", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v5.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v5.resources.LabelProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

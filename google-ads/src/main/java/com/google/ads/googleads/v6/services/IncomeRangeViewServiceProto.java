// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/income_range_view_service.proto

package com.google.ads.googleads.v6.services;

public final class IncomeRangeViewServiceProto {
  private IncomeRangeViewServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_GetIncomeRangeViewRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_GetIncomeRangeViewRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v6/services/incom" +
      "e_range_view_service.proto\022 google.ads.g" +
      "oogleads.v6.services\0329google/ads/googlea" +
      "ds/v6/resources/income_range_view.proto\032" +
      "\034google/api/annotations.proto\032\027google/ap" +
      "i/client.proto\032\037google/api/field_behavio" +
      "r.proto\032\031google/api/resource.proto\"d\n\031Ge" +
      "tIncomeRangeViewRequest\022G\n\rresource_name" +
      "\030\001 \001(\tB0\340A\002\372A*\n(googleads.googleapis.com" +
      "/IncomeRangeView2\263\002\n\026IncomeRangeViewServ" +
      "ice\022\321\001\n\022GetIncomeRangeView\022;.google.ads." +
      "googleads.v6.services.GetIncomeRangeView" +
      "Request\0322.google.ads.googleads.v6.resour" +
      "ces.IncomeRangeView\"J\202\323\344\223\0024\0222/v6/{resour" +
      "ce_name=customers/*/incomeRangeViews/*}\332" +
      "A\rresource_name\032E\312A\030googleads.googleapis" +
      ".com\322A\'https://www.googleapis.com/auth/a" +
      "dwordsB\202\002\n$com.google.ads.googleads.v6.s" +
      "ervicesB\033IncomeRangeViewServiceProtoP\001ZH" +
      "google.golang.org/genproto/googleapis/ad" +
      "s/googleads/v6/services;services\242\002\003GAA\252\002" +
      " Google.Ads.GoogleAds.V6.Services\312\002 Goog" +
      "le\\Ads\\GoogleAds\\V6\\Services\352\002$Google::A" +
      "ds::GoogleAds::V6::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.resources.IncomeRangeViewProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_services_GetIncomeRangeViewRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_services_GetIncomeRangeViewRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_GetIncomeRangeViewRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v6.resources.IncomeRangeViewProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

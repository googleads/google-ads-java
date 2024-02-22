// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/custom_conversion_goal_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.services;

public final class CustomConversionGoalServiceProto {
  private CustomConversionGoalServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateCustomConversionGoalsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateCustomConversionGoalsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_CustomConversionGoalOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_CustomConversionGoalOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateCustomConversionGoalsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateCustomConversionGoalsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_MutateCustomConversionGoalResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_MutateCustomConversionGoalResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nFgoogle/ads/googleads/v15/services/cust" +
      "om_conversion_goal_service.proto\022!google" +
      ".ads.googleads.v15.services\032:google/ads/" +
      "googleads/v15/enums/response_content_typ" +
      "e.proto\032?google/ads/googleads/v15/resour" +
      "ces/custom_conversion_goal.proto\032\034google" +
      "/api/annotations.proto\032\027google/api/clien" +
      "t.proto\032\037google/api/field_behavior.proto" +
      "\032\031google/api/resource.proto\032 google/prot" +
      "obuf/field_mask.proto\"\234\002\n\"MutateCustomCo" +
      "nversionGoalsRequest\022\030\n\013customer_id\030\001 \001(" +
      "\tB\003\340A\002\022Y\n\noperations\030\002 \003(\0132@.google.ads." +
      "googleads.v15.services.CustomConversionG" +
      "oalOperationB\003\340A\002\022\025\n\rvalidate_only\030\003 \001(\010" +
      "\022j\n\025response_content_type\030\004 \001(\0162K.google" +
      ".ads.googleads.v15.enums.ResponseContent" +
      "TypeEnum.ResponseContentType\"\273\002\n\035CustomC" +
      "onversionGoalOperation\022/\n\013update_mask\030\004 " +
      "\001(\0132\032.google.protobuf.FieldMask\022J\n\006creat" +
      "e\030\001 \001(\01328.google.ads.googleads.v15.resou" +
      "rces.CustomConversionGoalH\000\022J\n\006update\030\002 " +
      "\001(\01328.google.ads.googleads.v15.resources" +
      ".CustomConversionGoalH\000\022D\n\006remove\030\003 \001(\tB" +
      "2\372A/\n-googleads.googleapis.com/CustomCon" +
      "versionGoalH\000B\013\n\toperation\"{\n#MutateCust" +
      "omConversionGoalsResponse\022T\n\007results\030\001 \003" +
      "(\0132C.google.ads.googleads.v15.services.M" +
      "utateCustomConversionGoalResult\"\307\001\n Muta" +
      "teCustomConversionGoalResult\022I\n\rresource" +
      "_name\030\001 \001(\tB2\372A/\n-googleads.googleapis.c" +
      "om/CustomConversionGoal\022X\n\026custom_conver" +
      "sion_goal\030\002 \001(\01328.google.ads.googleads.v" +
      "15.resources.CustomConversionGoal2\364\002\n\033Cu" +
      "stomConversionGoalService\022\215\002\n\033MutateCust" +
      "omConversionGoals\022E.google.ads.googleads" +
      ".v15.services.MutateCustomConversionGoal" +
      "sRequest\032F.google.ads.googleads.v15.serv" +
      "ices.MutateCustomConversionGoalsResponse" +
      "\"_\332A\026customer_id,operations\202\323\344\223\002@\";/v15/" +
      "customers/{customer_id=*}/customConversi" +
      "onGoals:mutate:\001*\032E\312A\030googleads.googleap" +
      "is.com\322A\'https://www.googleapis.com/auth" +
      "/adwordsB\214\002\n%com.google.ads.googleads.v1" +
      "5.servicesB CustomConversionGoalServiceP" +
      "rotoP\001ZIgoogle.golang.org/genproto/googl" +
      "eapis/ads/googleads/v15/services;service" +
      "s\242\002\003GAA\252\002!Google.Ads.GoogleAds.V15.Servi" +
      "ces\312\002!Google\\Ads\\GoogleAds\\V15\\Services\352" +
      "\002%Google::Ads::GoogleAds::V15::Servicesb" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v15.resources.CustomConversionGoalProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_services_MutateCustomConversionGoalsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_services_MutateCustomConversionGoalsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateCustomConversionGoalsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v15_services_CustomConversionGoalOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v15_services_CustomConversionGoalOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_CustomConversionGoalOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v15_services_MutateCustomConversionGoalsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v15_services_MutateCustomConversionGoalsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateCustomConversionGoalsResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v15_services_MutateCustomConversionGoalResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v15_services_MutateCustomConversionGoalResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_MutateCustomConversionGoalResult_descriptor,
        new java.lang.String[] { "ResourceName", "CustomConversionGoal", });
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
    com.google.ads.googleads.v15.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v15.resources.CustomConversionGoalProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

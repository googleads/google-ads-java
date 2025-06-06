// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/errors/experiment_arm_error.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.errors;

public final class ExperimentArmErrorProto {
  private ExperimentArmErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v20_errors_ExperimentArmErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v20_errors_ExperimentArmErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v20/errors/experi" +
      "ment_arm_error.proto\022\037google.ads.googlea" +
      "ds.v20.errors\"\261\005\n\026ExperimentArmErrorEnum" +
      "\"\226\005\n\022ExperimentArmError\022\017\n\013UNSPECIFIED\020\000" +
      "\022\013\n\007UNKNOWN\020\001\022\'\n#EXPERIMENT_ARM_COUNT_LI" +
      "MIT_EXCEEDED\020\002\022\033\n\027INVALID_CAMPAIGN_STATU" +
      "S\020\003\022!\n\035DUPLICATE_EXPERIMENT_ARM_NAME\020\004\022%" +
      "\n!CANNOT_SET_TREATMENT_ARM_CAMPAIGN\020\005\022\036\n" +
      "\032CANNOT_MODIFY_CAMPAIGN_IDS\020\006\022-\n)CANNOT_" +
      "MODIFY_CAMPAIGN_WITHOUT_SUFFIX_SET\020\007\022+\n\'" +
      "CANNOT_MUTATE_TRAFFIC_SPLIT_AFTER_START\020" +
      "\010\022*\n&CANNOT_ADD_CAMPAIGN_WITH_SHARED_BUD" +
      "GET\020\t\022*\n&CANNOT_ADD_CAMPAIGN_WITH_CUSTOM" +
      "_BUDGET\020\n\0224\n0CANNOT_ADD_CAMPAIGNS_WITH_D" +
      "YNAMIC_ASSETS_ENABLED\020\013\0225\n1UNSUPPORTED_C" +
      "AMPAIGN_ADVERTISING_CHANNEL_SUB_TYPE\020\014\022," +
      "\n(CANNOT_ADD_BASE_CAMPAIGN_WITH_DATE_RAN" +
      "GE\020\r\0221\n-BIDDING_STRATEGY_NOT_SUPPORTED_I" +
      "N_EXPERIMENTS\020\016\0220\n,TRAFFIC_SPLIT_NOT_SUP" +
      "PORTED_FOR_CHANNEL_TYPE\020\017B\367\001\n#com.google" +
      ".ads.googleads.v20.errorsB\027ExperimentArm" +
      "ErrorProtoP\001ZEgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v20/errors;err" +
      "ors\242\002\003GAA\252\002\037Google.Ads.GoogleAds.V20.Err" +
      "ors\312\002\037Google\\Ads\\GoogleAds\\V20\\Errors\352\002#" +
      "Google::Ads::GoogleAds::V20::Errorsb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v20_errors_ExperimentArmErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v20_errors_ExperimentArmErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v20_errors_ExperimentArmErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

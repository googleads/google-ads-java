// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/errors/campaign_error.proto

package com.google.ads.googleads.v0.errors;

public final class CampaignErrorProto {
  private CampaignErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_errors_CampaignErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_errors_CampaignErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/ads/googleads/v0/errors/campaig" +
      "n_error.proto\022\036google.ads.googleads.v0.e" +
      "rrors\"\322\013\n\021CampaignErrorEnum\"\274\013\n\rCampaign" +
      "Error\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022!\n\035C" +
      "ANNOT_TARGET_CONTENT_NETWORK\020\003\022 \n\034CANNOT" +
      "_TARGET_SEARCH_NETWORK\020\004\0226\n2CANNOT_TARGE" +
      "T_SEARCH_NETWORK_WITHOUT_GOOGLE_SEARCH\020\005" +
      "\0220\n,CANNOT_TARGET_GOOGLE_SEARCH_FOR_CPM_" +
      "CAMPAIGN\020\006\022-\n)CAMPAIGN_MUST_TARGET_AT_LE" +
      "AST_ONE_NETWORK\020\007\022(\n$CANNOT_TARGET_PARTN" +
      "ER_SEARCH_NETWORK\020\010\022K\nGCANNOT_TARGET_CON" +
      "TENT_NETWORK_ONLY_WITH_CRITERIA_LEVEL_BI" +
      "DDING_STRATEGY\020\t\0226\n2CAMPAIGN_DURATION_MU" +
      "ST_CONTAIN_ALL_RUNNABLE_TRIALS\020\n\022$\n CANN" +
      "OT_MODIFY_FOR_TRIAL_CAMPAIGN\020\013\022\033\n\027DUPLIC" +
      "ATE_CAMPAIGN_NAME\020\014\022\037\n\033INCOMPATIBLE_CAMP" +
      "AIGN_FIELD\020\r\022\031\n\025INVALID_CAMPAIGN_NAME\020\016\022" +
      "*\n&INVALID_AD_SERVING_OPTIMIZATION_STATU" +
      "S\020\017\022\030\n\024INVALID_TRACKING_URL\020\020\022>\n:CANNOT_" +
      "SET_BOTH_TRACKING_URL_TEMPLATE_AND_TRACK" +
      "ING_SETTING\020\021\022 \n\034MAX_IMPRESSIONS_NOT_IN_" +
      "RANGE\020\022\022\033\n\027TIME_UNIT_NOT_SUPPORTED\020\023\0221\n-" +
      "INVALID_OPERATION_IF_SERVING_STATUS_HAS_" +
      "ENDED\020\024\022\033\n\027BUDGET_CANNOT_BE_SHARED\020\025\022%\n!" +
      "CAMPAIGN_CANNOT_USE_SHARED_BUDGET\020\026\0220\n,C" +
      "ANNOT_CHANGE_BUDGET_ON_CAMPAIGN_WITH_TRI" +
      "ALS\020\027\022!\n\035CAMPAIGN_LABEL_DOES_NOT_EXIST\020\030" +
      "\022!\n\035CAMPAIGN_LABEL_ALREADY_EXISTS\020\031\022\034\n\030M" +
      "ISSING_SHOPPING_SETTING\020\032\022\"\n\036INVALID_SHO" +
      "PPING_SALES_COUNTRY\020\033\022*\n&MISSING_UNIVERS" +
      "AL_APP_CAMPAIGN_SETTING\020\036\022;\n7ADVERTISING" +
      "_CHANNEL_TYPE_NOT_AVAILABLE_FOR_ACCOUNT_" +
      "TYPE\020\037\022(\n$INVALID_ADVERTISING_CHANNEL_SU" +
      "B_TYPE\020 \022,\n(AT_LEAST_ONE_CONVERSION_MUST" +
      "_BE_SELECTED\020!\022\037\n\033CANNOT_SET_AD_ROTATION" +
      "_MODE\020\"\022/\n+CANNOT_MODIFY_START_DATE_IF_A" +
      "LREADY_STARTED\020#\022\033\n\027CANNOT_SET_DATE_TO_P" +
      "AST\020$\022\037\n\033MISSING_HOTEL_CUSTOMER_LINK\020%\022\037" +
      "\n\033INVALID_HOTEL_CUSTOMER_LINK\020&\022\031\n\025MISSI" +
      "NG_HOTEL_SETTING\020\'B\310\001\n\"com.google.ads.go" +
      "ogleads.v0.errorsB\022CampaignErrorProtoP\001Z" +
      "Dgoogle.golang.org/genproto/googleapis/a" +
      "ds/googleads/v0/errors;errors\242\002\003GAA\252\002\036Go" +
      "ogle.Ads.GoogleAds.V0.Errors\312\002\036Google\\Ad" +
      "s\\GoogleAds\\V0\\Errorsb\006proto3"
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
        }, assigner);
    internal_static_google_ads_googleads_v0_errors_CampaignErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_errors_CampaignErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_errors_CampaignErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/campaign_budget_error.proto

package com.google.ads.googleads.v10.errors;

public final class CampaignBudgetErrorProto {
  private CampaignBudgetErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_errors_CampaignBudgetErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_errors_CampaignBudgetErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v10/errors/campai" +
      "gn_budget_error.proto\022\037google.ads.google" +
      "ads.v10.errors\"\263\006\n\027CampaignBudgetErrorEn" +
      "um\"\227\006\n\023CampaignBudgetError\022\017\n\013UNSPECIFIE" +
      "D\020\000\022\013\n\007UNKNOWN\020\001\022$\n CAMPAIGN_BUDGET_CANN" +
      "OT_BE_SHARED\020\021\022\033\n\027CAMPAIGN_BUDGET_REMOVE" +
      "D\020\002\022\032\n\026CAMPAIGN_BUDGET_IN_USE\020\003\022(\n$CAMPA" +
      "IGN_BUDGET_PERIOD_NOT_AVAILABLE\020\004\022<\n8CAN" +
      "NOT_MODIFY_FIELD_OF_IMPLICITLY_SHARED_CA" +
      "MPAIGN_BUDGET\020\006\0226\n2CANNOT_UPDATE_CAMPAIG" +
      "N_BUDGET_TO_IMPLICITLY_SHARED\020\007\022C\n?CANNO" +
      "T_UPDATE_CAMPAIGN_BUDGET_TO_EXPLICITLY_S" +
      "HARED_WITHOUT_NAME\020\010\0226\n2CANNOT_UPDATE_CA" +
      "MPAIGN_BUDGET_TO_EXPLICITLY_SHARED\020\t\022H\nD" +
      "CANNOT_USE_IMPLICITLY_SHARED_CAMPAIGN_BU" +
      "DGET_WITH_MULTIPLE_CAMPAIGNS\020\n\022\022\n\016DUPLIC" +
      "ATE_NAME\020\013\022\"\n\036MONEY_AMOUNT_IN_WRONG_CURR" +
      "ENCY\020\014\022/\n+MONEY_AMOUNT_LESS_THAN_CURRENC" +
      "Y_MINIMUM_CPC\020\r\022\032\n\026MONEY_AMOUNT_TOO_LARG" +
      "E\020\016\022\031\n\025NEGATIVE_MONEY_AMOUNT\020\017\022)\n%NON_MU" +
      "LTIPLE_OF_MINIMUM_CURRENCY_UNIT\020\020\022=\n9TOT" +
      "AL_BUDGET_AMOUNT_MUST_BE_UNSET_FOR_BUDGE" +
      "T_PERIOD_DAILY\020\022\022\022\n\016INVALID_PERIOD\020\023B\370\001\n" +
      "#com.google.ads.googleads.v10.errorsB\030Ca" +
      "mpaignBudgetErrorProtoP\001ZEgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v1" +
      "0/errors;errors\242\002\003GAA\252\002\037Google.Ads.Googl" +
      "eAds.V10.Errors\312\002\037Google\\Ads\\GoogleAds\\V" +
      "10\\Errors\352\002#Google::Ads::GoogleAds::V10:" +
      ":Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v10_errors_CampaignBudgetErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_errors_CampaignBudgetErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_errors_CampaignBudgetErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

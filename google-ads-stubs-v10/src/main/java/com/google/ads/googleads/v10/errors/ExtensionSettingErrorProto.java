// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/extension_setting_error.proto

package com.google.ads.googleads.v10.errors;

public final class ExtensionSettingErrorProto {
  private ExtensionSettingErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_errors_ExtensionSettingErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_errors_ExtensionSettingErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v10/errors/extens" +
      "ion_setting_error.proto\022\037google.ads.goog" +
      "leads.v10.errors\"\256\024\n\031ExtensionSettingErr" +
      "orEnum\"\220\024\n\025ExtensionSettingError\022\017\n\013UNSP" +
      "ECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\027\n\023EXTENSIONS_REQ" +
      "UIRED\020\002\022%\n!FEED_TYPE_EXTENSION_TYPE_MISM" +
      "ATCH\020\003\022\025\n\021INVALID_FEED_TYPE\020\004\0224\n0INVALID" +
      "_FEED_TYPE_FOR_CUSTOMER_EXTENSION_SETTIN" +
      "G\020\005\022%\n!CANNOT_CHANGE_FEED_ITEM_ON_CREATE" +
      "\020\006\022)\n%CANNOT_UPDATE_NEWLY_CREATED_EXTENS" +
      "ION\020\007\0223\n/NO_EXISTING_AD_GROUP_EXTENSION_" +
      "SETTING_FOR_TYPE\020\010\0223\n/NO_EXISTING_CAMPAI" +
      "GN_EXTENSION_SETTING_FOR_TYPE\020\t\0223\n/NO_EX" +
      "ISTING_CUSTOMER_EXTENSION_SETTING_FOR_TY" +
      "PE\020\n\022-\n)AD_GROUP_EXTENSION_SETTING_ALREA" +
      "DY_EXISTS\020\013\022-\n)CAMPAIGN_EXTENSION_SETTIN" +
      "G_ALREADY_EXISTS\020\014\022-\n)CUSTOMER_EXTENSION" +
      "_SETTING_ALREADY_EXISTS\020\r\0225\n1AD_GROUP_FE" +
      "ED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYPE\020\016" +
      "\0225\n1CAMPAIGN_FEED_ALREADY_EXISTS_FOR_PLA" +
      "CEHOLDER_TYPE\020\017\0225\n1CUSTOMER_FEED_ALREADY" +
      "_EXISTS_FOR_PLACEHOLDER_TYPE\020\020\022\026\n\022VALUE_" +
      "OUT_OF_RANGE\020\021\022$\n CANNOT_SET_FIELD_WITH_" +
      "FINAL_URLS\020\022\022\026\n\022FINAL_URLS_NOT_SET\020\023\022\030\n\024" +
      "INVALID_PHONE_NUMBER\020\024\022*\n&PHONE_NUMBER_N" +
      "OT_SUPPORTED_FOR_COUNTRY\020\025\022-\n)CARRIER_SP" +
      "ECIFIC_SHORT_NUMBER_NOT_ALLOWED\020\026\022#\n\037PRE" +
      "MIUM_RATE_NUMBER_NOT_ALLOWED\020\027\022\032\n\026DISALL" +
      "OWED_NUMBER_TYPE\020\030\022(\n$INVALID_DOMESTIC_P" +
      "HONE_NUMBER_FORMAT\020\031\022#\n\037VANITY_PHONE_NUM" +
      "BER_NOT_ALLOWED\020\032\022\030\n\024INVALID_COUNTRY_COD" +
      "E\020\033\022#\n\037INVALID_CALL_CONVERSION_TYPE_ID\020\034" +
      "\022.\n*CUSTOMER_NOT_IN_ALLOWLIST_FOR_CALLTR" +
      "ACKING\020E\022*\n&CALLTRACKING_NOT_SUPPORTED_F" +
      "OR_COUNTRY\020\036\022\022\n\016INVALID_APP_ID\020\037\022&\n\"QUOT" +
      "ES_IN_REVIEW_EXTENSION_SNIPPET\020 \022\'\n#HYPH" +
      "ENS_IN_REVIEW_EXTENSION_SNIPPET\020!\022(\n$REV" +
      "IEW_EXTENSION_SOURCE_NOT_ELIGIBLE\020\"\022(\n$S" +
      "OURCE_NAME_IN_REVIEW_EXTENSION_TEXT\020#\022\021\n" +
      "\rMISSING_FIELD\020$\022\037\n\033INCONSISTENT_CURRENC" +
      "Y_CODES\020%\022*\n&PRICE_EXTENSION_HAS_DUPLICA" +
      "TED_HEADERS\020&\0224\n0PRICE_ITEM_HAS_DUPLICAT" +
      "ED_HEADER_AND_DESCRIPTION\020\'\022%\n!PRICE_EXT" +
      "ENSION_HAS_TOO_FEW_ITEMS\020(\022&\n\"PRICE_EXTE" +
      "NSION_HAS_TOO_MANY_ITEMS\020)\022\025\n\021UNSUPPORTE" +
      "D_VALUE\020*\022\035\n\031INVALID_DEVICE_PREFERENCE\020+" +
      "\022\030\n\024INVALID_SCHEDULE_END\020-\022*\n&DATE_TIME_" +
      "MUST_BE_IN_ACCOUNT_TIME_ZONE\020/\022%\n!OVERLA" +
      "PPING_SCHEDULES_NOT_ALLOWED\0200\022 \n\034SCHEDUL" +
      "E_END_NOT_AFTER_START\0201\022\036\n\032TOO_MANY_SCHE" +
      "DULES_PER_DAY\0202\022&\n\"DUPLICATE_EXTENSION_F" +
      "EED_ITEM_EDIT\0203\022\033\n\027INVALID_SNIPPETS_HEAD" +
      "ER\0204\022<\n8PHONE_NUMBER_NOT_SUPPORTED_WITH_" +
      "CALLTRACKING_FOR_COUNTRY\0205\022\037\n\033CAMPAIGN_T" +
      "ARGETING_MISMATCH\0206\022\"\n\036CANNOT_OPERATE_ON" +
      "_REMOVED_FEED\0207\022\033\n\027EXTENSION_TYPE_REQUIR" +
      "ED\0208\022-\n)INCOMPATIBLE_UNDERLYING_MATCHING" +
      "_FUNCTION\0209\022\035\n\031START_DATE_AFTER_END_DATE" +
      "\020:\022\030\n\024INVALID_PRICE_FORMAT\020;\022\032\n\026PROMOTIO" +
      "N_INVALID_TIME\020<\022<\n8PROMOTION_CANNOT_SET" +
      "_PERCENT_DISCOUNT_AND_MONEY_DISCOUNT\020=\022>" +
      "\n:PROMOTION_CANNOT_SET_PROMOTION_CODE_AN" +
      "D_ORDERS_OVER_AMOUNT\020>\022%\n!TOO_MANY_DECIM" +
      "AL_PLACES_SPECIFIED\020?\022\031\n\025INVALID_LANGUAG" +
      "E_CODE\020@\022\030\n\024UNSUPPORTED_LANGUAGE\020A\0220\n,CU" +
      "STOMER_CONSENT_FOR_CALL_RECORDING_REQUIR" +
      "ED\020B\022&\n\"EXTENSION_SETTING_UPDATE_IS_A_NO" +
      "OP\020C\022\023\n\017DISALLOWED_TEXT\020DB\372\001\n#com.google" +
      ".ads.googleads.v10.errorsB\032ExtensionSett" +
      "ingErrorProtoP\001ZEgoogle.golang.org/genpr" +
      "oto/googleapis/ads/googleads/v10/errors;" +
      "errors\242\002\003GAA\252\002\037Google.Ads.GoogleAds.V10." +
      "Errors\312\002\037Google\\Ads\\GoogleAds\\V10\\Errors" +
      "\352\002#Google::Ads::GoogleAds::V10::Errorsb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v10_errors_ExtensionSettingErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_errors_ExtensionSettingErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_errors_ExtensionSettingErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

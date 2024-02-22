// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/errors/extension_feed_item_error.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.errors;

public final class ExtensionFeedItemErrorProto {
  private ExtensionFeedItemErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_errors_ExtensionFeedItemErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_errors_ExtensionFeedItemErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/ads/googleads/v15/errors/extens" +
      "ion_feed_item_error.proto\022\037google.ads.go" +
      "ogleads.v15.errors\"\366\r\n\032ExtensionFeedItem" +
      "ErrorEnum\"\327\r\n\026ExtensionFeedItemError\022\017\n\013" +
      "UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\026\n\022VALUE_OUT_" +
      "OF_RANGE\020\002\022\025\n\021URL_LIST_TOO_LONG\020\003\0222\n.CAN" +
      "NOT_HAVE_RESTRICTION_ON_EMPTY_GEO_TARGET" +
      "ING\020\004\022\036\n\032CANNOT_SET_WITH_FINAL_URLS\020\005\022!\n" +
      "\035CANNOT_SET_WITHOUT_FINAL_URLS\020\006\022\030\n\024INVA" +
      "LID_PHONE_NUMBER\020\007\022*\n&PHONE_NUMBER_NOT_S" +
      "UPPORTED_FOR_COUNTRY\020\010\022-\n)CARRIER_SPECIF" +
      "IC_SHORT_NUMBER_NOT_ALLOWED\020\t\022#\n\037PREMIUM" +
      "_RATE_NUMBER_NOT_ALLOWED\020\n\022\032\n\026DISALLOWED" +
      "_NUMBER_TYPE\020\013\022(\n$INVALID_DOMESTIC_PHONE" +
      "_NUMBER_FORMAT\020\014\022#\n\037VANITY_PHONE_NUMBER_" +
      "NOT_ALLOWED\020\r\022\"\n\036INVALID_CALL_CONVERSION" +
      "_ACTION\020\016\022.\n*CUSTOMER_NOT_ON_ALLOWLIST_F" +
      "OR_CALLTRACKING\020/\022*\n&CALLTRACKING_NOT_SU" +
      "PPORTED_FOR_COUNTRY\020\020\0220\n,CUSTOMER_CONSEN" +
      "T_FOR_CALL_RECORDING_REQUIRED\020\021\022\022\n\016INVAL" +
      "ID_APP_ID\020\022\022&\n\"QUOTES_IN_REVIEW_EXTENSIO" +
      "N_SNIPPET\020\023\022\'\n#HYPHENS_IN_REVIEW_EXTENSI" +
      "ON_SNIPPET\020\024\022&\n\"REVIEW_EXTENSION_SOURCE_" +
      "INELIGIBLE\020\025\022(\n$SOURCE_NAME_IN_REVIEW_EX" +
      "TENSION_TEXT\020\026\022\037\n\033INCONSISTENT_CURRENCY_" +
      "CODES\020\027\022*\n&PRICE_EXTENSION_HAS_DUPLICATE" +
      "D_HEADERS\020\030\0224\n0PRICE_ITEM_HAS_DUPLICATED" +
      "_HEADER_AND_DESCRIPTION\020\031\022%\n!PRICE_EXTEN" +
      "SION_HAS_TOO_FEW_ITEMS\020\032\022&\n\"PRICE_EXTENS" +
      "ION_HAS_TOO_MANY_ITEMS\020\033\022\025\n\021UNSUPPORTED_" +
      "VALUE\020\034\022*\n&UNSUPPORTED_VALUE_IN_SELECTED" +
      "_LANGUAGE\020\035\022\035\n\031INVALID_DEVICE_PREFERENCE" +
      "\020\036\022\030\n\024INVALID_SCHEDULE_END\020\037\022*\n&DATE_TIM" +
      "E_MUST_BE_IN_ACCOUNT_TIME_ZONE\020 \022\033\n\027INVA" +
      "LID_SNIPPETS_HEADER\020!\022\'\n#CANNOT_OPERATE_" +
      "ON_REMOVED_FEED_ITEM\020\"\022<\n8PHONE_NUMBER_N" +
      "OT_SUPPORTED_WITH_CALLTRACKING_FOR_COUNT" +
      "RY\020#\022(\n$CONFLICTING_CALL_CONVERSION_SETT" +
      "INGS\020$\022\033\n\027EXTENSION_TYPE_MISMATCH\020%\022\036\n\032E" +
      "XTENSION_SUBTYPE_REQUIRED\020&\022\036\n\032EXTENSION" +
      "_TYPE_UNSUPPORTED\020\'\0221\n-CANNOT_OPERATE_ON" +
      "_FEED_WITH_MULTIPLE_MAPPINGS\020(\022.\n*CANNOT" +
      "_OPERATE_ON_FEED_WITH_KEY_ATTRIBUTES\020)\022\030" +
      "\n\024INVALID_PRICE_FORMAT\020*\022\032\n\026PROMOTION_IN" +
      "VALID_TIME\020+\022%\n!TOO_MANY_DECIMAL_PLACES_" +
      "SPECIFIED\020,\022$\n CONCRETE_EXTENSION_TYPE_R" +
      "EQUIRED\020-\022 \n\034SCHEDULE_END_NOT_AFTER_STAR" +
      "T\020.B\373\001\n#com.google.ads.googleads.v15.err" +
      "orsB\033ExtensionFeedItemErrorProtoP\001ZEgoog" +
      "le.golang.org/genproto/googleapis/ads/go" +
      "ogleads/v15/errors;errors\242\002\003GAA\252\002\037Google" +
      ".Ads.GoogleAds.V15.Errors\312\002\037Google\\Ads\\G" +
      "oogleAds\\V15\\Errors\352\002#Google::Ads::Googl" +
      "eAds::V15::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v15_errors_ExtensionFeedItemErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_errors_ExtensionFeedItemErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_errors_ExtensionFeedItemErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

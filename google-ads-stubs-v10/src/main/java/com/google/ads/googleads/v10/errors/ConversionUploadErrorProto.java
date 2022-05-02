// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/conversion_upload_error.proto

package com.google.ads.googleads.v10.errors;

public final class ConversionUploadErrorProto {
  private ConversionUploadErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_errors_ConversionUploadErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_errors_ConversionUploadErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v10/errors/conver" +
      "sion_upload_error.proto\022\037google.ads.goog" +
      "leads.v10.errors\"\201\r\n\031ConversionUploadErr" +
      "orEnum\"\343\014\n\025ConversionUploadError\022\017\n\013UNSP" +
      "ECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022#\n\037TOO_MANY_CONVE" +
      "RSIONS_IN_REQUEST\020\002\022\025\n\021UNPARSEABLE_GCLID" +
      "\020\003\022\035\n\031CONVERSION_PRECEDES_EVENT\020*\022\021\n\rEXP" +
      "IRED_EVENT\020+\022\024\n\020TOO_RECENT_EVENT\020,\022\023\n\017EV" +
      "ENT_NOT_FOUND\020-\022\031\n\025UNAUTHORIZED_CUSTOMER" +
      "\020\010\022\035\n\031INVALID_CONVERSION_ACTION\020\t\022 \n\034TOO" +
      "_RECENT_CONVERSION_ACTION\020\n\0226\n2CONVERSIO" +
      "N_TRACKING_NOT_ENABLED_AT_IMPRESSION_TIM" +
      "E\020\013\022Q\nMEXTERNAL_ATTRIBUTION_DATA_SET_FOR" +
      "_NON_EXTERNALLY_ATTRIBUTED_CONVERSION_AC" +
      "TION\020\014\022Q\nMEXTERNAL_ATTRIBUTION_DATA_NOT_" +
      "SET_FOR_EXTERNALLY_ATTRIBUTED_CONVERSION" +
      "_ACTION\020\r\022F\nBORDER_ID_NOT_PERMITTED_FOR_" +
      "EXTERNALLY_ATTRIBUTED_CONVERSION_ACTION\020" +
      "\016\022\033\n\027ORDER_ID_ALREADY_IN_USE\020\017\022\026\n\022DUPLIC" +
      "ATE_ORDER_ID\020\020\022\023\n\017TOO_RECENT_CALL\020\021\022\020\n\014E" +
      "XPIRED_CALL\020\022\022\022\n\016CALL_NOT_FOUND\020\023\022\034\n\030CON" +
      "VERSION_PRECEDES_CALL\020\024\0220\n,CONVERSION_TR" +
      "ACKING_NOT_ENABLED_AT_CALL_TIME\020\025\022$\n UNP" +
      "ARSEABLE_CALLERS_PHONE_NUMBER\020\026\022#\n\037CLICK" +
      "_CONVERSION_ALREADY_EXISTS\020\027\022\"\n\036CALL_CON" +
      "VERSION_ALREADY_EXISTS\020\030\022)\n%DUPLICATE_CL" +
      "ICK_CONVERSION_IN_REQUEST\020\031\022(\n$DUPLICATE" +
      "_CALL_CONVERSION_IN_REQUEST\020\032\022\037\n\033CUSTOM_" +
      "VARIABLE_NOT_ENABLED\020\034\022&\n\"CUSTOM_VARIABL" +
      "E_VALUE_CONTAINS_PII\020\035\022\036\n\032INVALID_CUSTOM" +
      "ER_FOR_CLICK\020\036\022\035\n\031INVALID_CUSTOMER_FOR_C" +
      "ALL\020\037\022,\n(CONVERSION_NOT_COMPLIANT_WITH_A" +
      "TT_POLICY\020 \022\023\n\017CLICK_NOT_FOUND\020!\022\033\n\027INVA" +
      "LID_USER_IDENTIFIER\020\"\022N\nJEXTERNALLY_ATTR" +
      "IBUTED_CONVERSION_ACTION_NOT_PERMITTED_W" +
      "ITH_USER_IDENTIFIER\020#\022\037\n\033UNSUPPORTED_USE" +
      "R_IDENTIFIER\020$\022\032\n\026GBRAID_WBRAID_BOTH_SET" +
      "\020&\022\026\n\022UNPARSEABLE_WBRAID\020\'\022\026\n\022UNPARSEABL" +
      "E_GBRAID\020(\022B\n>EXTERNALLY_ATTRIBUTED_CONV" +
      "ERSION_TYPE_NOT_PERMITTED_WITH_BRAID\020)\022<" +
      "\n8ONE_PER_CLICK_CONVERSION_ACTION_NOT_PE" +
      "RMITTED_WITH_BRAID\020.\0227\n3CUSTOMER_DATA_PO" +
      "LICY_PROHIBITS_ENHANCED_CONVERSIONS\020/\022-\n" +
      ")CUSTOMER_NOT_ACCEPTED_CUSTOMER_DATA_TER" +
      "MS\0200B\372\001\n#com.google.ads.googleads.v10.er" +
      "rorsB\032ConversionUploadErrorProtoP\001ZEgoog" +
      "le.golang.org/genproto/googleapis/ads/go" +
      "ogleads/v10/errors;errors\242\002\003GAA\252\002\037Google" +
      ".Ads.GoogleAds.V10.Errors\312\002\037Google\\Ads\\G" +
      "oogleAds\\V10\\Errors\352\002#Google::Ads::Googl" +
      "eAds::V10::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v10_errors_ConversionUploadErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_errors_ConversionUploadErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_errors_ConversionUploadErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

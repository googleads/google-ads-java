// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/errors/date_range_error.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.errors;

public final class DateRangeErrorProto {
  private DateRangeErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_errors_DateRangeErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_errors_DateRangeErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v14/errors/date_r" +
      "ange_error.proto\022\037google.ads.googleads.v" +
      "14.errors\"\346\001\n\022DateRangeErrorEnum\"\317\001\n\016Dat" +
      "eRangeError\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020" +
      "\001\022\020\n\014INVALID_DATE\020\002\022\035\n\031START_DATE_AFTER_" +
      "END_DATE\020\003\022\033\n\027CANNOT_SET_DATE_TO_PAST\020\004\022" +
      " \n\034AFTER_MAXIMUM_ALLOWABLE_DATE\020\005\022/\n+CAN" +
      "NOT_MODIFY_START_DATE_IF_ALREADY_STARTED" +
      "\020\006B\363\001\n#com.google.ads.googleads.v14.erro" +
      "rsB\023DateRangeErrorProtoP\001ZEgoogle.golang" +
      ".org/genproto/googleapis/ads/googleads/v" +
      "14/errors;errors\242\002\003GAA\252\002\037Google.Ads.Goog" +
      "leAds.V14.Errors\312\002\037Google\\Ads\\GoogleAds\\" +
      "V14\\Errors\352\002#Google::Ads::GoogleAds::V14" +
      "::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v14_errors_DateRangeErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_errors_DateRangeErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_errors_DateRangeErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

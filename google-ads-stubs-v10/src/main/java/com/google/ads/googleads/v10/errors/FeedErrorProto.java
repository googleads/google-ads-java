// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/feed_error.proto

package com.google.ads.googleads.v10.errors;

public final class FeedErrorProto {
  private FeedErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_errors_FeedErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_errors_FeedErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v10/errors/feed_e" +
      "rror.proto\022\037google.ads.googleads.v10.err" +
      "ors\"\353\006\n\rFeedErrorEnum\"\331\006\n\tFeedError\022\017\n\013U" +
      "NSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\036\n\032ATTRIBUTE_N" +
      "AMES_NOT_UNIQUE\020\002\022/\n+ATTRIBUTES_DO_NOT_M" +
      "ATCH_EXISTING_ATTRIBUTES\020\003\022.\n*CANNOT_SPE" +
      "CIFY_USER_ORIGIN_FOR_SYSTEM_FEED\020\004\0224\n0CA" +
      "NNOT_SPECIFY_GOOGLE_ORIGIN_FOR_NON_SYSTE" +
      "M_FEED\020\005\0222\n.CANNOT_SPECIFY_FEED_ATTRIBUT" +
      "ES_FOR_SYSTEM_FEED\020\006\0224\n0CANNOT_UPDATE_FE" +
      "ED_ATTRIBUTES_WITH_ORIGIN_GOOGLE\020\007\022\020\n\014FE" +
      "ED_REMOVED\020\010\022\030\n\024INVALID_ORIGIN_VALUE\020\t\022\033" +
      "\n\027FEED_ORIGIN_IS_NOT_USER\020\n\022 \n\034INVALID_A" +
      "UTH_TOKEN_FOR_EMAIL\020\013\022\021\n\rINVALID_EMAIL\020\014" +
      "\022\027\n\023DUPLICATE_FEED_NAME\020\r\022\025\n\021INVALID_FEE" +
      "D_NAME\020\016\022\026\n\022MISSING_OAUTH_INFO\020\017\022.\n*NEW_" +
      "ATTRIBUTE_CANNOT_BE_PART_OF_UNIQUE_KEY\020\020" +
      "\022\027\n\023TOO_MANY_ATTRIBUTES\020\021\022\034\n\030INVALID_BUS" +
      "INESS_ACCOUNT\020\022\0223\n/BUSINESS_ACCOUNT_CANN" +
      "OT_ACCESS_LOCATION_ACCOUNT\020\023\022\036\n\032INVALID_" +
      "AFFILIATE_CHAIN_ID\020\024\022\031\n\025DUPLICATE_SYSTEM" +
      "_FEED\020\025\022\024\n\020GMB_ACCESS_ERROR\020\026\0225\n1CANNOT_" +
      "HAVE_LOCATION_AND_AFFILIATE_LOCATION_FEE" +
      "DS\020\027\022#\n\037LEGACY_EXTENSION_TYPE_READ_ONLY\020" +
      "\030B\356\001\n#com.google.ads.googleads.v10.error" +
      "sB\016FeedErrorProtoP\001ZEgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v10/err" +
      "ors;errors\242\002\003GAA\252\002\037Google.Ads.GoogleAds." +
      "V10.Errors\312\002\037Google\\Ads\\GoogleAds\\V10\\Er" +
      "rors\352\002#Google::Ads::GoogleAds::V10::Erro" +
      "rsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v10_errors_FeedErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_errors_FeedErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_errors_FeedErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

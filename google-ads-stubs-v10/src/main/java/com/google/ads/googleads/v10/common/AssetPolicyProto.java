// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/asset_policy.proto

package com.google.ads.googleads.v10.common;

public final class AssetPolicyProto {
  private AssetPolicyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_AdAssetPolicySummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_AdAssetPolicySummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2google/ads/googleads/v10/common/asset_" +
      "policy.proto\022\037google.ads.googleads.v10.c" +
      "ommon\032,google/ads/googleads/v10/common/p" +
      "olicy.proto\032;google/ads/googleads/v10/en" +
      "ums/policy_approval_status.proto\0329google" +
      "/ads/googleads/v10/enums/policy_review_s" +
      "tatus.proto\"\261\002\n\024AdAssetPolicySummary\022O\n\024" +
      "policy_topic_entries\030\001 \003(\01321.google.ads." +
      "googleads.v10.common.PolicyTopicEntry\022`\n" +
      "\rreview_status\030\002 \001(\0162I.google.ads.google" +
      "ads.v10.enums.PolicyReviewStatusEnum.Pol" +
      "icyReviewStatus\022f\n\017approval_status\030\003 \001(\016" +
      "2M.google.ads.googleads.v10.enums.Policy" +
      "ApprovalStatusEnum.PolicyApprovalStatusB" +
      "\360\001\n#com.google.ads.googleads.v10.commonB" +
      "\020AssetPolicyProtoP\001ZEgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v10/com" +
      "mon;common\242\002\003GAA\252\002\037Google.Ads.GoogleAds." +
      "V10.Common\312\002\037Google\\Ads\\GoogleAds\\V10\\Co" +
      "mmon\352\002#Google::Ads::GoogleAds::V10::Comm" +
      "onb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.PolicyApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.PolicyReviewStatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_common_AdAssetPolicySummary_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_common_AdAssetPolicySummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_AdAssetPolicySummary_descriptor,
        new java.lang.String[] { "PolicyTopicEntries", "ReviewStatus", "ApprovalStatus", });
    com.google.ads.googleads.v10.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v10.enums.PolicyApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.PolicyReviewStatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

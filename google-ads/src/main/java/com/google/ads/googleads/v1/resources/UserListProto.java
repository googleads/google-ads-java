// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/resources/user_list.proto

package com.google.ads.googleads.v1.resources;

public final class UserListProto {
  private UserListProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v1_resources_UserList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v1_resources_UserList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v1/resources/user" +
      "_list.proto\022!google.ads.googleads.v1.res" +
      "ources\032/google/ads/googleads/v1/common/u" +
      "ser_lists.proto\0321google/ads/googleads/v1" +
      "/enums/access_reason.proto\032;google/ads/g" +
      "oogleads/v1/enums/user_list_access_statu" +
      "s.proto\032<google/ads/googleads/v1/enums/u" +
      "ser_list_closing_reason.proto\032?google/ad" +
      "s/googleads/v1/enums/user_list_membershi" +
      "p_status.proto\0328google/ads/googleads/v1/" +
      "enums/user_list_size_range.proto\0322google" +
      "/ads/googleads/v1/enums/user_list_type.p" +
      "roto\032\036google/protobuf/wrappers.proto\032\034go" +
      "ogle/api/annotations.proto\"\217\r\n\010UserList\022" +
      "\025\n\rresource_name\030\001 \001(\t\022\'\n\002id\030\002 \001(\0132\033.goo" +
      "gle.protobuf.Int64Value\022-\n\tread_only\030\003 \001" +
      "(\0132\032.google.protobuf.BoolValue\022*\n\004name\030\004" +
      " \001(\0132\034.google.protobuf.StringValue\0221\n\013de" +
      "scription\030\005 \001(\0132\034.google.protobuf.String" +
      "Value\022o\n\021membership_status\030\006 \001(\0162T.googl" +
      "e.ads.googleads.v1.enums.UserListMembers" +
      "hipStatusEnum.UserListMembershipStatus\0226" +
      "\n\020integration_code\030\007 \001(\0132\034.google.protob" +
      "uf.StringValue\0229\n\024membership_life_span\030\010" +
      " \001(\0132\033.google.protobuf.Int64Value\0225\n\020siz" +
      "e_for_display\030\t \001(\0132\033.google.protobuf.In" +
      "t64Value\022f\n\026size_range_for_display\030\n \001(\016" +
      "2F.google.ads.googleads.v1.enums.UserLis" +
      "tSizeRangeEnum.UserListSizeRange\0224\n\017size" +
      "_for_search\030\013 \001(\0132\033.google.protobuf.Int6" +
      "4Value\022e\n\025size_range_for_search\030\014 \001(\0162F." +
      "google.ads.googleads.v1.enums.UserListSi" +
      "zeRangeEnum.UserListSizeRange\022J\n\004type\030\r " +
      "\001(\0162<.google.ads.googleads.v1.enums.User" +
      "ListTypeEnum.UserListType\022f\n\016closing_rea" +
      "son\030\016 \001(\0162N.google.ads.googleads.v1.enum" +
      "s.UserListClosingReasonEnum.UserListClos" +
      "ingReason\022S\n\raccess_reason\030\017 \001(\0162<.googl" +
      "e.ads.googleads.v1.enums.AccessReasonEnu" +
      "m.AccessReason\022n\n\030account_user_list_stat" +
      "us\030\020 \001(\0162L.google.ads.googleads.v1.enums" +
      ".UserListAccessStatusEnum.UserListAccess" +
      "Status\0227\n\023eligible_for_search\030\021 \001(\0132\032.go" +
      "ogle.protobuf.BoolValue\0228\n\024eligible_for_" +
      "display\030\022 \001(\0132\032.google.protobuf.BoolValu" +
      "e\022S\n\023crm_based_user_list\030\023 \001(\01324.google." +
      "ads.googleads.v1.common.CrmBasedUserList" +
      "InfoH\000\022P\n\021similar_user_list\030\024 \001(\01323.goog" +
      "le.ads.googleads.v1.common.SimilarUserLi" +
      "stInfoH\000\022U\n\024rule_based_user_list\030\025 \001(\01325" +
      ".google.ads.googleads.v1.common.RuleBase" +
      "dUserListInfoH\000\022P\n\021logical_user_list\030\026 \001" +
      "(\01323.google.ads.googleads.v1.common.Logi" +
      "calUserListInfoH\000\022L\n\017basic_user_list\030\027 \001" +
      "(\01321.google.ads.googleads.v1.common.Basi" +
      "cUserListInfoH\000B\013\n\tuser_listB\372\001\n%com.goo" +
      "gle.ads.googleads.v1.resourcesB\rUserList" +
      "ProtoP\001ZJgoogle.golang.org/genproto/goog" +
      "leapis/ads/googleads/v1/resources;resour" +
      "ces\242\002\003GAA\252\002!Google.Ads.GoogleAds.V1.Reso" +
      "urces\312\002!Google\\Ads\\GoogleAds\\V1\\Resource" +
      "s\352\002%Google::Ads::GoogleAds::V1::Resource" +
      "sb\006proto3"
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
          com.google.ads.googleads.v1.common.UserListsProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.AccessReasonProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.UserListAccessStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.UserListClosingReasonProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.UserListMembershipStatusProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.UserListSizeRangeProto.getDescriptor(),
          com.google.ads.googleads.v1.enums.UserListTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v1_resources_UserList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v1_resources_UserList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v1_resources_UserList_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "ReadOnly", "Name", "Description", "MembershipStatus", "IntegrationCode", "MembershipLifeSpan", "SizeForDisplay", "SizeRangeForDisplay", "SizeForSearch", "SizeRangeForSearch", "Type", "ClosingReason", "AccessReason", "AccountUserListStatus", "EligibleForSearch", "EligibleForDisplay", "CrmBasedUserList", "SimilarUserList", "RuleBasedUserList", "LogicalUserList", "BasicUserList", "UserList", });
    com.google.ads.googleads.v1.common.UserListsProto.getDescriptor();
    com.google.ads.googleads.v1.enums.AccessReasonProto.getDescriptor();
    com.google.ads.googleads.v1.enums.UserListAccessStatusProto.getDescriptor();
    com.google.ads.googleads.v1.enums.UserListClosingReasonProto.getDescriptor();
    com.google.ads.googleads.v1.enums.UserListMembershipStatusProto.getDescriptor();
    com.google.ads.googleads.v1.enums.UserListSizeRangeProto.getDescriptor();
    com.google.ads.googleads.v1.enums.UserListTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

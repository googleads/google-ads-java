// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/customer_user_access.proto

package com.google.ads.googleads.v13.resources;

public final class CustomerUserAccessProto {
  private CustomerUserAccessProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v13_resources_CustomerUserAccess_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v13_resources_CustomerUserAccess_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v13/resources/cus" +
      "tomer_user_access.proto\022\"google.ads.goog" +
      "leads.v13.resources\0320google/ads/googlead" +
      "s/v13/enums/access_role.proto\032\037google/ap" +
      "i/field_behavior.proto\032\031google/api/resou" +
      "rce.proto\"\200\004\n\022CustomerUserAccess\022K\n\rreso" +
      "urce_name\030\001 \001(\tB4\342A\001\005\372A-\n+googleads.goog" +
      "leapis.com/CustomerUserAccess\022\025\n\007user_id" +
      "\030\002 \001(\003B\004\342A\001\003\022 \n\remail_address\030\003 \001(\tB\004\342A\001" +
      "\003H\000\210\001\001\022N\n\013access_role\030\004 \001(\01629.google.ads" +
      ".googleads.v13.enums.AccessRoleEnum.Acce" +
      "ssRole\022,\n\031access_creation_date_time\030\006 \001(" +
      "\tB\004\342A\001\003H\001\210\001\001\022-\n\032inviter_user_email_addre" +
      "ss\030\007 \001(\tB\004\342A\001\003H\002\210\001\001:h\352Ae\n+googleads.goog" +
      "leapis.com/CustomerUserAccess\0226customers" +
      "/{customer_id}/customerUserAccesses/{use" +
      "r_id}B\020\n\016_email_addressB\034\n\032_access_creat" +
      "ion_date_timeB\035\n\033_inviter_user_email_add" +
      "ressB\211\002\n&com.google.ads.googleads.v13.re" +
      "sourcesB\027CustomerUserAccessProtoP\001ZKgoog" +
      "le.golang.org/genproto/googleapis/ads/go" +
      "ogleads/v13/resources;resources\242\002\003GAA\252\002\"" +
      "Google.Ads.GoogleAds.V13.Resources\312\002\"Goo" +
      "gle\\Ads\\GoogleAds\\V13\\Resources\352\002&Google" +
      "::Ads::GoogleAds::V13::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v13.enums.AccessRoleProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v13_resources_CustomerUserAccess_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v13_resources_CustomerUserAccess_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v13_resources_CustomerUserAccess_descriptor,
        new java.lang.String[] { "ResourceName", "UserId", "EmailAddress", "AccessRole", "AccessCreationDateTime", "InviterUserEmailAddress", "EmailAddress", "AccessCreationDateTime", "InviterUserEmailAddress", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v13.enums.AccessRoleProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

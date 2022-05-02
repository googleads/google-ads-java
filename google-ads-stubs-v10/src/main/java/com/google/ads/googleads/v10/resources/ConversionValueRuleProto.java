// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/conversion_value_rule.proto

package com.google.ads.googleads.v10.resources;

public final class ConversionValueRuleProto {
  private ConversionValueRuleProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ConversionValueRule_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ConversionValueRule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ConversionValueRule_ValueRuleAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ConversionValueRule_ValueRuleAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ConversionValueRule_ValueRuleGeoLocationCondition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ConversionValueRule_ValueRuleGeoLocationCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ConversionValueRule_ValueRuleDeviceCondition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ConversionValueRule_ValueRuleDeviceCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ConversionValueRule_ValueRuleAudienceCondition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ConversionValueRule_ValueRuleAudienceCondition_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v10/resources/con" +
      "version_value_rule.proto\022\"google.ads.goo" +
      "gleads.v10.resources\032Agoogle/ads/googlea" +
      "ds/v10/enums/conversion_value_rule_statu" +
      "s.proto\032;google/ads/googleads/v10/enums/" +
      "value_rule_device_type.proto\032Ggoogle/ads" +
      "/googleads/v10/enums/value_rule_geo_loca" +
      "tion_match_type.proto\0329google/ads/google" +
      "ads/v10/enums/value_rule_operation.proto" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\"\252\r\n\023ConversionValue" +
      "Rule\022K\n\rresource_name\030\001 \001(\tB4\340A\005\372A.\n,goo" +
      "gleads.googleapis.com/ConversionValueRul" +
      "e\022\017\n\002id\030\002 \001(\003B\003\340A\003\022W\n\006action\030\003 \001(\0132G.goo" +
      "gle.ads.googleads.v10.resources.Conversi" +
      "onValueRule.ValueRuleAction\022u\n\026geo_locat" +
      "ion_condition\030\004 \001(\0132U.google.ads.googlea" +
      "ds.v10.resources.ConversionValueRule.Val" +
      "ueRuleGeoLocationCondition\022j\n\020device_con" +
      "dition\030\005 \001(\0132P.google.ads.googleads.v10." +
      "resources.ConversionValueRule.ValueRuleD" +
      "eviceCondition\022n\n\022audience_condition\030\006 \001" +
      "(\0132R.google.ads.googleads.v10.resources." +
      "ConversionValueRule.ValueRuleAudienceCon" +
      "dition\022A\n\016owner_customer\030\007 \001(\tB)\340A\003\372A#\n!" +
      "googleads.googleapis.com/Customer\022g\n\006sta" +
      "tus\030\010 \001(\0162W.google.ads.googleads.v10.enu" +
      "ms.ConversionValueRuleStatusEnum.Convers" +
      "ionValueRuleStatus\032~\n\017ValueRuleAction\022\\\n" +
      "\toperation\030\001 \001(\0162I.google.ads.googleads." +
      "v10.enums.ValueRuleOperationEnum.ValueRu" +
      "leOperation\022\r\n\005value\030\002 \001(\001\032\302\003\n\035ValueRule" +
      "GeoLocationCondition\022V\n\035excluded_geo_tar" +
      "get_constants\030\001 \003(\tB/\372A,\n*googleads.goog" +
      "leapis.com/GeoTargetConstant\022\200\001\n\027exclude" +
      "d_geo_match_type\030\002 \001(\0162_.google.ads.goog" +
      "leads.v10.enums.ValueRuleGeoLocationMatc" +
      "hTypeEnum.ValueRuleGeoLocationMatchType\022" +
      "M\n\024geo_target_constants\030\003 \003(\tB/\372A,\n*goog" +
      "leads.googleapis.com/GeoTargetConstant\022w" +
      "\n\016geo_match_type\030\004 \001(\0162_.google.ads.goog" +
      "leads.v10.enums.ValueRuleGeoLocationMatc" +
      "hTypeEnum.ValueRuleGeoLocationMatchType\032" +
      "}\n\030ValueRuleDeviceCondition\022a\n\014device_ty" +
      "pes\030\001 \003(\0162K.google.ads.googleads.v10.enu" +
      "ms.ValueRuleDeviceTypeEnum.ValueRuleDevi" +
      "ceType\032\234\001\n\032ValueRuleAudienceCondition\022:\n" +
      "\nuser_lists\030\001 \003(\tB&\372A#\n!googleads.google" +
      "apis.com/UserList\022B\n\016user_interests\030\002 \003(" +
      "\tB*\372A\'\n%googleads.googleapis.com/UserInt" +
      "erest:z\352Aw\n,googleads.googleapis.com/Con" +
      "versionValueRule\022Gcustomers/{customer_id" +
      "}/conversionValueRules/{conversion_value" +
      "_rule_id}B\212\002\n&com.google.ads.googleads.v" +
      "10.resourcesB\030ConversionValueRuleProtoP\001" +
      "ZKgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v10/resources;resources\242\002\003" +
      "GAA\252\002\"Google.Ads.GoogleAds.V10.Resources" +
      "\312\002\"Google\\Ads\\GoogleAds\\V10\\Resources\352\002&" +
      "Google::Ads::GoogleAds::V10::Resourcesb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.ConversionValueRuleStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ValueRuleDeviceTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ValueRuleGeoLocationMatchTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ValueRuleOperationProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_ConversionValueRule_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_ConversionValueRule_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ConversionValueRule_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Action", "GeoLocationCondition", "DeviceCondition", "AudienceCondition", "OwnerCustomer", "Status", });
    internal_static_google_ads_googleads_v10_resources_ConversionValueRule_ValueRuleAction_descriptor =
      internal_static_google_ads_googleads_v10_resources_ConversionValueRule_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_ConversionValueRule_ValueRuleAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ConversionValueRule_ValueRuleAction_descriptor,
        new java.lang.String[] { "Operation", "Value", });
    internal_static_google_ads_googleads_v10_resources_ConversionValueRule_ValueRuleGeoLocationCondition_descriptor =
      internal_static_google_ads_googleads_v10_resources_ConversionValueRule_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v10_resources_ConversionValueRule_ValueRuleGeoLocationCondition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ConversionValueRule_ValueRuleGeoLocationCondition_descriptor,
        new java.lang.String[] { "ExcludedGeoTargetConstants", "ExcludedGeoMatchType", "GeoTargetConstants", "GeoMatchType", });
    internal_static_google_ads_googleads_v10_resources_ConversionValueRule_ValueRuleDeviceCondition_descriptor =
      internal_static_google_ads_googleads_v10_resources_ConversionValueRule_descriptor.getNestedTypes().get(2);
    internal_static_google_ads_googleads_v10_resources_ConversionValueRule_ValueRuleDeviceCondition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ConversionValueRule_ValueRuleDeviceCondition_descriptor,
        new java.lang.String[] { "DeviceTypes", });
    internal_static_google_ads_googleads_v10_resources_ConversionValueRule_ValueRuleAudienceCondition_descriptor =
      internal_static_google_ads_googleads_v10_resources_ConversionValueRule_descriptor.getNestedTypes().get(3);
    internal_static_google_ads_googleads_v10_resources_ConversionValueRule_ValueRuleAudienceCondition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ConversionValueRule_ValueRuleAudienceCondition_descriptor,
        new java.lang.String[] { "UserLists", "UserInterests", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.enums.ConversionValueRuleStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ValueRuleDeviceTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ValueRuleGeoLocationMatchTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ValueRuleOperationProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

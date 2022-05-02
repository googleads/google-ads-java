// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/conversion_action.proto

package com.google.ads.googleads.v10.resources;

public final class ConversionActionProto {
  private ConversionActionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ConversionAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ConversionAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ConversionAction_AttributionModelSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ConversionAction_AttributionModelSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ConversionAction_ValueSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ConversionAction_ValueSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ConversionAction_ThirdPartyAppAnalyticsSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ConversionAction_ThirdPartyAppAnalyticsSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_resources_ConversionAction_FirebaseSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_resources_ConversionAction_FirebaseSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v10/resources/con" +
      "version_action.proto\022\"google.ads.googlea" +
      "ds.v10.resources\0321google/ads/googleads/v" +
      "10/common/tag_snippet.proto\0326google/ads/" +
      "googleads/v10/enums/attribution_model.pr" +
      "oto\032?google/ads/googleads/v10/enums/conv" +
      "ersion_action_category.proto\032Dgoogle/ads" +
      "/googleads/v10/enums/conversion_action_c" +
      "ounting_type.proto\032=google/ads/googleads" +
      "/v10/enums/conversion_action_status.prot" +
      "o\032;google/ads/googleads/v10/enums/conver" +
      "sion_action_type.proto\0326google/ads/googl" +
      "eads/v10/enums/conversion_origin.proto\032=" +
      "google/ads/googleads/v10/enums/data_driv" +
      "en_model_status.proto\0326google/ads/google" +
      "ads/v10/enums/mobile_app_vendor.proto\032\037g" +
      "oogle/api/field_behavior.proto\032\031google/a" +
      "pi/resource.proto\"\370\023\n\020ConversionAction\022H" +
      "\n\rresource_name\030\001 \001(\tB1\340A\005\372A+\n)googleads" +
      ".googleapis.com/ConversionAction\022\024\n\002id\030\025" +
      " \001(\003B\003\340A\003H\000\210\001\001\022\021\n\004name\030\026 \001(\tH\001\210\001\001\022a\n\006sta" +
      "tus\030\004 \001(\0162Q.google.ads.googleads.v10.enu" +
      "ms.ConversionActionStatusEnum.Conversion" +
      "ActionStatus\022`\n\004type\030\005 \001(\0162M.google.ads." +
      "googleads.v10.enums.ConversionActionType" +
      "Enum.ConversionActionTypeB\003\340A\005\022Z\n\006origin" +
      "\030\036 \001(\0162E.google.ads.googleads.v10.enums." +
      "ConversionOriginEnum.ConversionOriginB\003\340" +
      "A\003\022\035\n\020primary_for_goal\030\037 \001(\010H\002\210\001\001\022g\n\010cat" +
      "egory\030\006 \001(\0162U.google.ads.googleads.v10.e" +
      "nums.ConversionActionCategoryEnum.Conver" +
      "sionActionCategory\022F\n\016owner_customer\030\027 \001" +
      "(\tB)\340A\003\372A#\n!googleads.googleapis.com/Cus" +
      "tomerH\003\210\001\001\022*\n\035include_in_conversions_met" +
      "ric\030\030 \001(\010H\004\210\001\001\022/\n\"click_through_lookback" +
      "_window_days\030\031 \001(\003H\005\210\001\001\022.\n!view_through_" +
      "lookback_window_days\030\032 \001(\003H\006\210\001\001\022Z\n\016value" +
      "_settings\030\013 \001(\0132B.google.ads.googleads.v" +
      "10.resources.ConversionAction.ValueSetti" +
      "ngs\022t\n\rcounting_type\030\014 \001(\0162].google.ads." +
      "googleads.v10.enums.ConversionActionCoun" +
      "tingTypeEnum.ConversionActionCountingTyp" +
      "e\022q\n\032attribution_model_settings\030\r \001(\0132M." +
      "google.ads.googleads.v10.resources.Conve" +
      "rsionAction.AttributionModelSettings\022F\n\014" +
      "tag_snippets\030\016 \003(\0132+.google.ads.googlead" +
      "s.v10.common.TagSnippetB\003\340A\003\022(\n\033phone_ca" +
      "ll_duration_seconds\030\033 \001(\003H\007\210\001\001\022\023\n\006app_id" +
      "\030\034 \001(\tH\010\210\001\001\022c\n\021mobile_app_vendor\030\021 \001(\0162C" +
      ".google.ads.googleads.v10.enums.MobileAp" +
      "pVendorEnum.MobileAppVendorB\003\340A\003\022e\n\021fire" +
      "base_settings\030\022 \001(\0132E.google.ads.googlea" +
      "ds.v10.resources.ConversionAction.Fireba" +
      "seSettingsB\003\340A\003\022\204\001\n\"third_party_app_anal" +
      "ytics_settings\030\023 \001(\0132S.google.ads.google" +
      "ads.v10.resources.ConversionAction.Third" +
      "PartyAppAnalyticsSettingsB\003\340A\003\032\364\001\n\030Attri" +
      "butionModelSettings\022`\n\021attribution_model" +
      "\030\001 \001(\0162E.google.ads.googleads.v10.enums." +
      "AttributionModelEnum.AttributionModel\022v\n" +
      "\030data_driven_model_status\030\002 \001(\0162O.google" +
      ".ads.googleads.v10.enums.DataDrivenModel" +
      "StatusEnum.DataDrivenModelStatusB\003\340A\003\032\277\001" +
      "\n\rValueSettings\022\032\n\rdefault_value\030\004 \001(\001H\000" +
      "\210\001\001\022\"\n\025default_currency_code\030\005 \001(\tH\001\210\001\001\022" +
      "%\n\030always_use_default_value\030\006 \001(\010H\002\210\001\001B\020" +
      "\n\016_default_valueB\030\n\026_default_currency_co" +
      "deB\033\n\031_always_use_default_value\032i\n\036Third" +
      "PartyAppAnalyticsSettings\022\034\n\nevent_name\030" +
      "\002 \001(\tB\003\340A\003H\000\210\001\001\022\032\n\rprovider_name\030\003 \001(\tB\003" +
      "\340A\003B\r\n\013_event_name\032l\n\020FirebaseSettings\022\034" +
      "\n\nevent_name\030\003 \001(\tB\003\340A\003H\000\210\001\001\022\034\n\nproject_" +
      "id\030\004 \001(\tB\003\340A\003H\001\210\001\001B\r\n\013_event_nameB\r\n\013_pr" +
      "oject_id:p\352Am\n)googleads.googleapis.com/" +
      "ConversionAction\022@customers/{customer_id" +
      "}/conversionActions/{conversion_action_i" +
      "d}B\005\n\003_idB\007\n\005_nameB\023\n\021_primary_for_goalB" +
      "\021\n\017_owner_customerB \n\036_include_in_conver" +
      "sions_metricB%\n#_click_through_lookback_" +
      "window_daysB$\n\"_view_through_lookback_wi" +
      "ndow_daysB\036\n\034_phone_call_duration_second" +
      "sB\t\n\007_app_idB\207\002\n&com.google.ads.googlead" +
      "s.v10.resourcesB\025ConversionActionProtoP\001" +
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
          com.google.ads.googleads.v10.common.TagSnippetProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.AttributionModelProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ConversionActionCategoryProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ConversionActionCountingTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ConversionActionStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ConversionActionTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.ConversionOriginProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.DataDrivenModelStatusProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.MobileAppVendorProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_resources_ConversionAction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_ConversionAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ConversionAction_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "Type", "Origin", "PrimaryForGoal", "Category", "OwnerCustomer", "IncludeInConversionsMetric", "ClickThroughLookbackWindowDays", "ViewThroughLookbackWindowDays", "ValueSettings", "CountingType", "AttributionModelSettings", "TagSnippets", "PhoneCallDurationSeconds", "AppId", "MobileAppVendor", "FirebaseSettings", "ThirdPartyAppAnalyticsSettings", "Id", "Name", "PrimaryForGoal", "OwnerCustomer", "IncludeInConversionsMetric", "ClickThroughLookbackWindowDays", "ViewThroughLookbackWindowDays", "PhoneCallDurationSeconds", "AppId", });
    internal_static_google_ads_googleads_v10_resources_ConversionAction_AttributionModelSettings_descriptor =
      internal_static_google_ads_googleads_v10_resources_ConversionAction_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v10_resources_ConversionAction_AttributionModelSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ConversionAction_AttributionModelSettings_descriptor,
        new java.lang.String[] { "AttributionModel", "DataDrivenModelStatus", });
    internal_static_google_ads_googleads_v10_resources_ConversionAction_ValueSettings_descriptor =
      internal_static_google_ads_googleads_v10_resources_ConversionAction_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v10_resources_ConversionAction_ValueSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ConversionAction_ValueSettings_descriptor,
        new java.lang.String[] { "DefaultValue", "DefaultCurrencyCode", "AlwaysUseDefaultValue", "DefaultValue", "DefaultCurrencyCode", "AlwaysUseDefaultValue", });
    internal_static_google_ads_googleads_v10_resources_ConversionAction_ThirdPartyAppAnalyticsSettings_descriptor =
      internal_static_google_ads_googleads_v10_resources_ConversionAction_descriptor.getNestedTypes().get(2);
    internal_static_google_ads_googleads_v10_resources_ConversionAction_ThirdPartyAppAnalyticsSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ConversionAction_ThirdPartyAppAnalyticsSettings_descriptor,
        new java.lang.String[] { "EventName", "ProviderName", "EventName", });
    internal_static_google_ads_googleads_v10_resources_ConversionAction_FirebaseSettings_descriptor =
      internal_static_google_ads_googleads_v10_resources_ConversionAction_descriptor.getNestedTypes().get(3);
    internal_static_google_ads_googleads_v10_resources_ConversionAction_FirebaseSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_resources_ConversionAction_FirebaseSettings_descriptor,
        new java.lang.String[] { "EventName", "ProjectId", "EventName", "ProjectId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v10.common.TagSnippetProto.getDescriptor();
    com.google.ads.googleads.v10.enums.AttributionModelProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ConversionActionCategoryProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ConversionActionCountingTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ConversionActionStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ConversionActionTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.ConversionOriginProto.getDescriptor();
    com.google.ads.googleads.v10.enums.DataDrivenModelStatusProto.getDescriptor();
    com.google.ads.googleads.v10.enums.MobileAppVendorProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/conversion_action.proto

package com.google.ads.googleads.v12.resources;

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
    internal_static_google_ads_googleads_v12_resources_ConversionAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_ConversionAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_ConversionAction_AttributionModelSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_ConversionAction_AttributionModelSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_ConversionAction_ValueSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_ConversionAction_ValueSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_ConversionAction_ThirdPartyAppAnalyticsSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_ConversionAction_ThirdPartyAppAnalyticsSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v12_resources_ConversionAction_FirebaseSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v12_resources_ConversionAction_FirebaseSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v12/resources/con" +
      "version_action.proto\022\"google.ads.googlea" +
      "ds.v12.resources\0321google/ads/googleads/v" +
      "12/common/tag_snippet.proto\0326google/ads/" +
      "googleads/v12/enums/attribution_model.pr" +
      "oto\032?google/ads/googleads/v12/enums/conv" +
      "ersion_action_category.proto\032Dgoogle/ads" +
      "/googleads/v12/enums/conversion_action_c" +
      "ounting_type.proto\032=google/ads/googleads" +
      "/v12/enums/conversion_action_status.prot" +
      "o\032;google/ads/googleads/v12/enums/conver" +
      "sion_action_type.proto\0326google/ads/googl" +
      "eads/v12/enums/conversion_origin.proto\032=" +
      "google/ads/googleads/v12/enums/data_driv" +
      "en_model_status.proto\0326google/ads/google" +
      "ads/v12/enums/mobile_app_vendor.proto\032\037g" +
      "oogle/api/field_behavior.proto\032\031google/a" +
      "pi/resource.proto\"\277\024\n\020ConversionAction\022I" +
      "\n\rresource_name\030\001 \001(\tB2\342A\001\005\372A+\n)googlead" +
      "s.googleapis.com/ConversionAction\022\025\n\002id\030" +
      "\025 \001(\003B\004\342A\001\003H\000\210\001\001\022\021\n\004name\030\026 \001(\tH\001\210\001\001\022a\n\006s" +
      "tatus\030\004 \001(\0162Q.google.ads.googleads.v12.e" +
      "nums.ConversionActionStatusEnum.Conversi" +
      "onActionStatus\022a\n\004type\030\005 \001(\0162M.google.ad" +
      "s.googleads.v12.enums.ConversionActionTy" +
      "peEnum.ConversionActionTypeB\004\342A\001\005\022[\n\006ori" +
      "gin\030\036 \001(\0162E.google.ads.googleads.v12.enu" +
      "ms.ConversionOriginEnum.ConversionOrigin" +
      "B\004\342A\001\003\022\035\n\020primary_for_goal\030\037 \001(\010H\002\210\001\001\022g\n" +
      "\010category\030\006 \001(\0162U.google.ads.googleads.v" +
      "12.enums.ConversionActionCategoryEnum.Co" +
      "nversionActionCategory\022G\n\016owner_customer" +
      "\030\027 \001(\tB*\342A\001\003\372A#\n!googleads.googleapis.co" +
      "m/CustomerH\003\210\001\001\022*\n\035include_in_conversion" +
      "s_metric\030\030 \001(\010H\004\210\001\001\022/\n\"click_through_loo" +
      "kback_window_days\030\031 \001(\003H\005\210\001\001\022.\n!view_thr" +
      "ough_lookback_window_days\030\032 \001(\003H\006\210\001\001\022Z\n\016" +
      "value_settings\030\013 \001(\0132B.google.ads.google" +
      "ads.v12.resources.ConversionAction.Value" +
      "Settings\022t\n\rcounting_type\030\014 \001(\0162].google" +
      ".ads.googleads.v12.enums.ConversionActio" +
      "nCountingTypeEnum.ConversionActionCounti" +
      "ngType\022q\n\032attribution_model_settings\030\r \001" +
      "(\0132M.google.ads.googleads.v12.resources." +
      "ConversionAction.AttributionModelSetting" +
      "s\022G\n\014tag_snippets\030\016 \003(\0132+.google.ads.goo" +
      "gleads.v12.common.TagSnippetB\004\342A\001\003\022(\n\033ph" +
      "one_call_duration_seconds\030\033 \001(\003H\007\210\001\001\022\023\n\006" +
      "app_id\030\034 \001(\tH\010\210\001\001\022d\n\021mobile_app_vendor\030\021" +
      " \001(\0162C.google.ads.googleads.v12.enums.Mo" +
      "bileAppVendorEnum.MobileAppVendorB\004\342A\001\003\022" +
      "f\n\021firebase_settings\030\022 \001(\0132E.google.ads." +
      "googleads.v12.resources.ConversionAction" +
      ".FirebaseSettingsB\004\342A\001\003\022\205\001\n\"third_party_" +
      "app_analytics_settings\030\023 \001(\0132S.google.ad" +
      "s.googleads.v12.resources.ConversionActi" +
      "on.ThirdPartyAppAnalyticsSettingsB\004\342A\001\003\032" +
      "\365\001\n\030AttributionModelSettings\022`\n\021attribut" +
      "ion_model\030\001 \001(\0162E.google.ads.googleads.v" +
      "12.enums.AttributionModelEnum.Attributio" +
      "nModel\022w\n\030data_driven_model_status\030\002 \001(\016" +
      "2O.google.ads.googleads.v12.enums.DataDr" +
      "ivenModelStatusEnum.DataDrivenModelStatu" +
      "sB\004\342A\001\003\032\277\001\n\rValueSettings\022\032\n\rdefault_val" +
      "ue\030\004 \001(\001H\000\210\001\001\022\"\n\025default_currency_code\030\005" +
      " \001(\tH\001\210\001\001\022%\n\030always_use_default_value\030\006 " +
      "\001(\010H\002\210\001\001B\020\n\016_default_valueB\030\n\026_default_c" +
      "urrency_codeB\033\n\031_always_use_default_valu" +
      "e\032k\n\036ThirdPartyAppAnalyticsSettings\022\035\n\ne" +
      "vent_name\030\002 \001(\tB\004\342A\001\003H\000\210\001\001\022\033\n\rprovider_n" +
      "ame\030\003 \001(\tB\004\342A\001\003B\r\n\013_event_name\032\246\001\n\020Fireb" +
      "aseSettings\022\035\n\nevent_name\030\003 \001(\tB\004\342A\001\003H\000\210" +
      "\001\001\022\035\n\nproject_id\030\004 \001(\tB\004\342A\001\003H\001\210\001\001\022\031\n\013pro" +
      "perty_id\030\005 \001(\003B\004\342A\001\003\022\033\n\rproperty_name\030\006 " +
      "\001(\tB\004\342A\001\003B\r\n\013_event_nameB\r\n\013_project_id:" +
      "p\352Am\n)googleads.googleapis.com/Conversio" +
      "nAction\022@customers/{customer_id}/convers" +
      "ionActions/{conversion_action_id}B\005\n\003_id" +
      "B\007\n\005_nameB\023\n\021_primary_for_goalB\021\n\017_owner" +
      "_customerB \n\036_include_in_conversions_met" +
      "ricB%\n#_click_through_lookback_window_da" +
      "ysB$\n\"_view_through_lookback_window_days" +
      "B\036\n\034_phone_call_duration_secondsB\t\n\007_app" +
      "_idB\207\002\n&com.google.ads.googleads.v12.res" +
      "ourcesB\025ConversionActionProtoP\001ZKgoogle." +
      "golang.org/genproto/googleapis/ads/googl" +
      "eads/v12/resources;resources\242\002\003GAA\252\002\"Goo" +
      "gle.Ads.GoogleAds.V12.Resources\312\002\"Google" +
      "\\Ads\\GoogleAds\\V12\\Resources\352\002&Google::A" +
      "ds::GoogleAds::V12::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v12.common.TagSnippetProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.AttributionModelProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.ConversionActionCategoryProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.ConversionActionCountingTypeProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.ConversionActionStatusProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.ConversionActionTypeProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.ConversionOriginProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.DataDrivenModelStatusProto.getDescriptor(),
          com.google.ads.googleads.v12.enums.MobileAppVendorProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v12_resources_ConversionAction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_ConversionAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_ConversionAction_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "Type", "Origin", "PrimaryForGoal", "Category", "OwnerCustomer", "IncludeInConversionsMetric", "ClickThroughLookbackWindowDays", "ViewThroughLookbackWindowDays", "ValueSettings", "CountingType", "AttributionModelSettings", "TagSnippets", "PhoneCallDurationSeconds", "AppId", "MobileAppVendor", "FirebaseSettings", "ThirdPartyAppAnalyticsSettings", "Id", "Name", "PrimaryForGoal", "OwnerCustomer", "IncludeInConversionsMetric", "ClickThroughLookbackWindowDays", "ViewThroughLookbackWindowDays", "PhoneCallDurationSeconds", "AppId", });
    internal_static_google_ads_googleads_v12_resources_ConversionAction_AttributionModelSettings_descriptor =
      internal_static_google_ads_googleads_v12_resources_ConversionAction_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v12_resources_ConversionAction_AttributionModelSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_ConversionAction_AttributionModelSettings_descriptor,
        new java.lang.String[] { "AttributionModel", "DataDrivenModelStatus", });
    internal_static_google_ads_googleads_v12_resources_ConversionAction_ValueSettings_descriptor =
      internal_static_google_ads_googleads_v12_resources_ConversionAction_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v12_resources_ConversionAction_ValueSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_ConversionAction_ValueSettings_descriptor,
        new java.lang.String[] { "DefaultValue", "DefaultCurrencyCode", "AlwaysUseDefaultValue", "DefaultValue", "DefaultCurrencyCode", "AlwaysUseDefaultValue", });
    internal_static_google_ads_googleads_v12_resources_ConversionAction_ThirdPartyAppAnalyticsSettings_descriptor =
      internal_static_google_ads_googleads_v12_resources_ConversionAction_descriptor.getNestedTypes().get(2);
    internal_static_google_ads_googleads_v12_resources_ConversionAction_ThirdPartyAppAnalyticsSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_ConversionAction_ThirdPartyAppAnalyticsSettings_descriptor,
        new java.lang.String[] { "EventName", "ProviderName", "EventName", });
    internal_static_google_ads_googleads_v12_resources_ConversionAction_FirebaseSettings_descriptor =
      internal_static_google_ads_googleads_v12_resources_ConversionAction_descriptor.getNestedTypes().get(3);
    internal_static_google_ads_googleads_v12_resources_ConversionAction_FirebaseSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v12_resources_ConversionAction_FirebaseSettings_descriptor,
        new java.lang.String[] { "EventName", "ProjectId", "PropertyId", "PropertyName", "EventName", "ProjectId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v12.common.TagSnippetProto.getDescriptor();
    com.google.ads.googleads.v12.enums.AttributionModelProto.getDescriptor();
    com.google.ads.googleads.v12.enums.ConversionActionCategoryProto.getDescriptor();
    com.google.ads.googleads.v12.enums.ConversionActionCountingTypeProto.getDescriptor();
    com.google.ads.googleads.v12.enums.ConversionActionStatusProto.getDescriptor();
    com.google.ads.googleads.v12.enums.ConversionActionTypeProto.getDescriptor();
    com.google.ads.googleads.v12.enums.ConversionOriginProto.getDescriptor();
    com.google.ads.googleads.v12.enums.DataDrivenModelStatusProto.getDescriptor();
    com.google.ads.googleads.v12.enums.MobileAppVendorProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

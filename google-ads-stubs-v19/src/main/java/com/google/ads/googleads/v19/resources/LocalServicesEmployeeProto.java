// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/local_services_employee.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.resources;

public final class LocalServicesEmployeeProto {
  private LocalServicesEmployeeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_LocalServicesEmployee_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_LocalServicesEmployee_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_UniversityDegree_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_UniversityDegree_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_Residency_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_Residency_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_resources_Fellowship_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_resources_Fellowship_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v19/resources/loc" +
      "al_services_employee.proto\022\"google.ads.g" +
      "oogleads.v19.resources\032Cgoogle/ads/googl" +
      "eads/v19/enums/local_services_employee_s" +
      "tatus.proto\032Agoogle/ads/googleads/v19/en" +
      "ums/local_services_employee_type.proto\032\037" +
      "google/api/field_behavior.proto\032\031google/" +
      "api/resource.proto\"\230\t\n\025LocalServicesEmpl" +
      "oyee\022M\n\rresource_name\030\001 \001(\tB6\340A\005\372A0\n.goo" +
      "gleads.googleapis.com/LocalServicesEmplo" +
      "yee\022\024\n\002id\030\002 \001(\003B\003\340A\003H\000\210\001\001\022\037\n\022creation_da" +
      "te_time\030\003 \001(\tB\003\340A\003\022p\n\006status\030\004 \001(\0162[.goo" +
      "gle.ads.googleads.v19.enums.LocalService" +
      "sEmployeeStatusEnum.LocalServicesEmploye" +
      "eStatusB\003\340A\003\022j\n\004type\030\005 \001(\0162W.google.ads." +
      "googleads.v19.enums.LocalServicesEmploye" +
      "eTypeEnum.LocalServicesEmployeeTypeB\003\340A\003" +
      "\022U\n\022university_degrees\030\006 \003(\01324.google.ad" +
      "s.googleads.v19.resources.UniversityDegr" +
      "eeB\003\340A\003\022G\n\013residencies\030\007 \003(\0132-.google.ad" +
      "s.googleads.v19.resources.ResidencyB\003\340A\003" +
      "\022H\n\013fellowships\030\010 \003(\0132..google.ads.googl" +
      "eads.v19.resources.FellowshipB\003\340A\003\022\033\n\tjo" +
      "b_title\030\t \001(\tB\003\340A\003H\001\210\001\001\022)\n\027year_started_" +
      "practicing\030\n \001(\005B\003\340A\003H\002\210\001\001\022\035\n\020languages_" +
      "spoken\030\013 \003(\tB\003\340A\003\022\031\n\014category_ids\030\014 \003(\tB" +
      "\003\340A\003\022-\n\033national_provider_id_number\030\r \001(" +
      "\tB\003\340A\003H\003\210\001\001\022\037\n\remail_address\030\016 \001(\tB\003\340A\003H" +
      "\004\210\001\001\022\034\n\nfirst_name\030\017 \001(\tB\003\340A\003H\005\210\001\001\022\035\n\013mi" +
      "ddle_name\030\020 \001(\tB\003\340A\003H\006\210\001\001\022\033\n\tlast_name\030\021" +
      " \001(\tB\003\340A\003H\007\210\001\001:u\352Ar\n.googleads.googleapi" +
      "s.com/LocalServicesEmployee\022@customers/{" +
      "customer_id}/localServicesEmployees/{gls" +
      "_employee_id}B\005\n\003_idB\014\n\n_job_titleB\032\n\030_y" +
      "ear_started_practicingB\036\n\034_national_prov" +
      "ider_id_numberB\020\n\016_email_addressB\r\n\013_fir" +
      "st_nameB\016\n\014_middle_nameB\014\n\n_last_name\"\247\001" +
      "\n\020UniversityDegree\022\"\n\020institution_name\030\001" +
      " \001(\tB\003\340A\003H\000\210\001\001\022\030\n\006degree\030\002 \001(\tB\003\340A\003H\001\210\001\001" +
      "\022!\n\017graduation_year\030\003 \001(\005B\003\340A\003H\002\210\001\001B\023\n\021_" +
      "institution_nameB\t\n\007_degreeB\022\n\020_graduati" +
      "on_year\"{\n\tResidency\022\"\n\020institution_name" +
      "\030\001 \001(\tB\003\340A\003H\000\210\001\001\022!\n\017completion_year\030\002 \001(" +
      "\005B\003\340A\003H\001\210\001\001B\023\n\021_institution_nameB\022\n\020_com" +
      "pletion_year\"|\n\nFellowship\022\"\n\020institutio" +
      "n_name\030\001 \001(\tB\003\340A\003H\000\210\001\001\022!\n\017completion_yea" +
      "r\030\002 \001(\005B\003\340A\003H\001\210\001\001B\023\n\021_institution_nameB\022" +
      "\n\020_completion_yearB\214\002\n&com.google.ads.go" +
      "ogleads.v19.resourcesB\032LocalServicesEmpl" +
      "oyeeProtoP\001ZKgoogle.golang.org/genproto/" +
      "googleapis/ads/googleads/v19/resources;r" +
      "esources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V1" +
      "9.Resources\312\002\"Google\\Ads\\GoogleAds\\V19\\R" +
      "esources\352\002&Google::Ads::GoogleAds::V19::" +
      "Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v19.enums.LocalServicesEmployeeStatusProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.LocalServicesEmployeeTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_resources_LocalServicesEmployee_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_resources_LocalServicesEmployee_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_LocalServicesEmployee_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "CreationDateTime", "Status", "Type", "UniversityDegrees", "Residencies", "Fellowships", "JobTitle", "YearStartedPracticing", "LanguagesSpoken", "CategoryIds", "NationalProviderIdNumber", "EmailAddress", "FirstName", "MiddleName", "LastName", });
    internal_static_google_ads_googleads_v19_resources_UniversityDegree_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v19_resources_UniversityDegree_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_UniversityDegree_descriptor,
        new java.lang.String[] { "InstitutionName", "Degree", "GraduationYear", });
    internal_static_google_ads_googleads_v19_resources_Residency_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v19_resources_Residency_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_Residency_descriptor,
        new java.lang.String[] { "InstitutionName", "CompletionYear", });
    internal_static_google_ads_googleads_v19_resources_Fellowship_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v19_resources_Fellowship_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_resources_Fellowship_descriptor,
        new java.lang.String[] { "InstitutionName", "CompletionYear", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v19.enums.LocalServicesEmployeeStatusProto.getDescriptor();
    com.google.ads.googleads.v19.enums.LocalServicesEmployeeTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

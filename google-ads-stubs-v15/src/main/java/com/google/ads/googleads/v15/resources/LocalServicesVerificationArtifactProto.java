// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/local_services_verification_artifact.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.resources;

public final class LocalServicesVerificationArtifactProto {
  private LocalServicesVerificationArtifactProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_LocalServicesVerificationArtifact_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_LocalServicesVerificationArtifact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_BackgroundCheckVerificationArtifact_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_BackgroundCheckVerificationArtifact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_InsuranceVerificationArtifact_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_InsuranceVerificationArtifact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_LicenseVerificationArtifact_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_LicenseVerificationArtifact_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nMgoogle/ads/googleads/v15/resources/loc" +
      "al_services_verification_artifact.proto\022" +
      "\"google.ads.googleads.v15.resources\0324goo" +
      "gle/ads/googleads/v15/common/local_servi" +
      "ces.proto\032Ngoogle/ads/googleads/v15/enum" +
      "s/local_services_insurance_rejection_rea" +
      "son.proto\032Lgoogle/ads/googleads/v15/enum" +
      "s/local_services_license_rejection_reaso" +
      "n.proto\032Pgoogle/ads/googleads/v15/enums/" +
      "local_services_verification_artifact_sta" +
      "tus.proto\032Ngoogle/ads/googleads/v15/enum" +
      "s/local_services_verification_artifact_t" +
      "ype.proto\032\037google/api/field_behavior.pro" +
      "to\032\031google/api/resource.proto\"\346\007\n!LocalS" +
      "ervicesVerificationArtifact\022Y\n\rresource_" +
      "name\030\001 \001(\tBB\340A\005\372A<\n:googleads.googleapis" +
      ".com/LocalServicesVerificationArtifact\022\024" +
      "\n\002id\030\002 \001(\003B\003\340A\003H\001\210\001\001\022\037\n\022creation_date_ti" +
      "me\030\003 \001(\tB\003\340A\003\022\210\001\n\006status\030\004 \001(\0162s.google." +
      "ads.googleads.v15.enums.LocalServicesVer" +
      "ificationArtifactStatusEnum.LocalService" +
      "sVerificationArtifactStatusB\003\340A\003\022\213\001\n\rart" +
      "ifact_type\030\005 \001(\0162o.google.ads.googleads." +
      "v15.enums.LocalServicesVerificationArtif" +
      "actTypeEnum.LocalServicesVerificationArt" +
      "ifactTypeB\003\340A\003\022~\n&background_check_verif" +
      "ication_artifact\030\006 \001(\0132G.google.ads.goog" +
      "leads.v15.resources.BackgroundCheckVerif" +
      "icationArtifactB\003\340A\003H\000\022q\n\037insurance_veri" +
      "fication_artifact\030\007 \001(\0132A.google.ads.goo" +
      "gleads.v15.resources.InsuranceVerificati" +
      "onArtifactB\003\340A\003H\000\022m\n\035license_verificatio" +
      "n_artifact\030\010 \001(\0132?.google.ads.googleads." +
      "v15.resources.LicenseVerificationArtifac" +
      "tB\003\340A\003H\000:\233\001\352A\227\001\n:googleads.googleapis.co" +
      "m/LocalServicesVerificationArtifact\022Ycus" +
      "tomers/{customer_id}/localServicesVerifi" +
      "cationArtifacts/{gls_verification_artifa" +
      "ct_id}B\017\n\rartifact_dataB\005\n\003_id\"\237\001\n#Backg" +
      "roundCheckVerificationArtifact\022\032\n\010case_u" +
      "rl\030\001 \001(\tB\003\340A\003H\000\210\001\001\022.\n\034final_adjudication" +
      "_date_time\030\002 \001(\tB\003\340A\003H\001\210\001\001B\013\n\t_case_urlB" +
      "\037\n\035_final_adjudication_date_time\"\214\003\n\035Ins" +
      "uranceVerificationArtifact\022\037\n\ramount_mic" +
      "ros\030\001 \001(\003B\003\340A\003H\000\210\001\001\022\223\001\n\020rejection_reason" +
      "\030\002 \001(\0162o.google.ads.googleads.v15.enums." +
      "LocalServicesInsuranceRejectionReasonEnu" +
      "m.LocalServicesInsuranceRejectionReasonB" +
      "\003\340A\003H\001\210\001\001\022m\n\033insurance_document_readonly" +
      "\030\003 \001(\0132>.google.ads.googleads.v15.common" +
      ".LocalServicesDocumentReadOnlyB\003\340A\003H\002\210\001\001" +
      "B\020\n\016_amount_microsB\023\n\021_rejection_reasonB" +
      "\036\n\034_insurance_document_readonly\"\261\004\n\033Lice" +
      "nseVerificationArtifact\022\036\n\014license_type\030" +
      "\001 \001(\tB\003\340A\003H\000\210\001\001\022 \n\016license_number\030\002 \001(\tB" +
      "\003\340A\003H\001\210\001\001\022%\n\023licensee_first_name\030\003 \001(\tB\003" +
      "\340A\003H\002\210\001\001\022$\n\022licensee_last_name\030\004 \001(\tB\003\340A" +
      "\003H\003\210\001\001\022\217\001\n\020rejection_reason\030\005 \001(\0162k.goog" +
      "le.ads.googleads.v15.enums.LocalServices" +
      "LicenseRejectionReasonEnum.LocalServices" +
      "LicenseRejectionReasonB\003\340A\003H\004\210\001\001\022k\n\031lice" +
      "nse_document_readonly\030\006 \001(\0132>.google.ads" +
      ".googleads.v15.common.LocalServicesDocum" +
      "entReadOnlyB\003\340A\003H\005\210\001\001B\017\n\r_license_typeB\021" +
      "\n\017_license_numberB\026\n\024_licensee_first_nam" +
      "eB\025\n\023_licensee_last_nameB\023\n\021_rejection_r" +
      "easonB\034\n\032_license_document_readonlyB\230\002\n&" +
      "com.google.ads.googleads.v15.resourcesB&" +
      "LocalServicesVerificationArtifactProtoP\001" +
      "ZKgoogle.golang.org/genproto/googleapis/" +
      "ads/googleads/v15/resources;resources\242\002\003" +
      "GAA\252\002\"Google.Ads.GoogleAds.V15.Resources" +
      "\312\002\"Google\\Ads\\GoogleAds\\V15\\Resources\352\002&" +
      "Google::Ads::GoogleAds::V15::Resourcesb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.common.LocalServicesProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.LocalServicesInsuranceRejectionReasonProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.LocalServicesLicenseRejectionReasonProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.LocalServicesVerificationArtifactStatusProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.LocalServicesVerificationArtifactTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_LocalServicesVerificationArtifact_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_LocalServicesVerificationArtifact_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_LocalServicesVerificationArtifact_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "CreationDateTime", "Status", "ArtifactType", "BackgroundCheckVerificationArtifact", "InsuranceVerificationArtifact", "LicenseVerificationArtifact", "ArtifactData", });
    internal_static_google_ads_googleads_v15_resources_BackgroundCheckVerificationArtifact_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v15_resources_BackgroundCheckVerificationArtifact_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_BackgroundCheckVerificationArtifact_descriptor,
        new java.lang.String[] { "CaseUrl", "FinalAdjudicationDateTime", });
    internal_static_google_ads_googleads_v15_resources_InsuranceVerificationArtifact_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v15_resources_InsuranceVerificationArtifact_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_InsuranceVerificationArtifact_descriptor,
        new java.lang.String[] { "AmountMicros", "RejectionReason", "InsuranceDocumentReadonly", });
    internal_static_google_ads_googleads_v15_resources_LicenseVerificationArtifact_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v15_resources_LicenseVerificationArtifact_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_LicenseVerificationArtifact_descriptor,
        new java.lang.String[] { "LicenseType", "LicenseNumber", "LicenseeFirstName", "LicenseeLastName", "RejectionReason", "LicenseDocumentReadonly", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.common.LocalServicesProto.getDescriptor();
    com.google.ads.googleads.v15.enums.LocalServicesInsuranceRejectionReasonProto.getDescriptor();
    com.google.ads.googleads.v15.enums.LocalServicesLicenseRejectionReasonProto.getDescriptor();
    com.google.ads.googleads.v15.enums.LocalServicesVerificationArtifactStatusProto.getDescriptor();
    com.google.ads.googleads.v15.enums.LocalServicesVerificationArtifactTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

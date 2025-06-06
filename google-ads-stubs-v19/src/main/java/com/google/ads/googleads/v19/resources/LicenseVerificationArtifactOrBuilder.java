// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/resources/local_services_verification_artifact.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.resources;

public interface LicenseVerificationArtifactOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.resources.LicenseVerificationArtifact)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. License type / name.
   * </pre>
   *
   * <code>optional string license_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the licenseType field is set.
   */
  boolean hasLicenseType();
  /**
   * <pre>
   * Output only. License type / name.
   * </pre>
   *
   * <code>optional string license_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The licenseType.
   */
  java.lang.String getLicenseType();
  /**
   * <pre>
   * Output only. License type / name.
   * </pre>
   *
   * <code>optional string license_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for licenseType.
   */
  com.google.protobuf.ByteString
      getLicenseTypeBytes();

  /**
   * <pre>
   * Output only. License number.
   * </pre>
   *
   * <code>optional string license_number = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the licenseNumber field is set.
   */
  boolean hasLicenseNumber();
  /**
   * <pre>
   * Output only. License number.
   * </pre>
   *
   * <code>optional string license_number = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The licenseNumber.
   */
  java.lang.String getLicenseNumber();
  /**
   * <pre>
   * Output only. License number.
   * </pre>
   *
   * <code>optional string license_number = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for licenseNumber.
   */
  com.google.protobuf.ByteString
      getLicenseNumberBytes();

  /**
   * <pre>
   * Output only. First name of the licensee.
   * </pre>
   *
   * <code>optional string licensee_first_name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the licenseeFirstName field is set.
   */
  boolean hasLicenseeFirstName();
  /**
   * <pre>
   * Output only. First name of the licensee.
   * </pre>
   *
   * <code>optional string licensee_first_name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The licenseeFirstName.
   */
  java.lang.String getLicenseeFirstName();
  /**
   * <pre>
   * Output only. First name of the licensee.
   * </pre>
   *
   * <code>optional string licensee_first_name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for licenseeFirstName.
   */
  com.google.protobuf.ByteString
      getLicenseeFirstNameBytes();

  /**
   * <pre>
   * Output only. Last name of the licensee.
   * </pre>
   *
   * <code>optional string licensee_last_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the licenseeLastName field is set.
   */
  boolean hasLicenseeLastName();
  /**
   * <pre>
   * Output only. Last name of the licensee.
   * </pre>
   *
   * <code>optional string licensee_last_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The licenseeLastName.
   */
  java.lang.String getLicenseeLastName();
  /**
   * <pre>
   * Output only. Last name of the licensee.
   * </pre>
   *
   * <code>optional string licensee_last_name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for licenseeLastName.
   */
  com.google.protobuf.ByteString
      getLicenseeLastNameBytes();

  /**
   * <pre>
   * Output only. License rejection reason.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.enums.LocalServicesLicenseRejectionReasonEnum.LocalServicesLicenseRejectionReason rejection_reason = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the rejectionReason field is set.
   */
  boolean hasRejectionReason();
  /**
   * <pre>
   * Output only. License rejection reason.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.enums.LocalServicesLicenseRejectionReasonEnum.LocalServicesLicenseRejectionReason rejection_reason = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for rejectionReason.
   */
  int getRejectionReasonValue();
  /**
   * <pre>
   * Output only. License rejection reason.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.enums.LocalServicesLicenseRejectionReasonEnum.LocalServicesLicenseRejectionReason rejection_reason = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The rejectionReason.
   */
  com.google.ads.googleads.v19.enums.LocalServicesLicenseRejectionReasonEnum.LocalServicesLicenseRejectionReason getRejectionReason();

  /**
   * <pre>
   * Output only. The readonly field containing the information for an uploaded
   * license document.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.common.LocalServicesDocumentReadOnly license_document_readonly = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the licenseDocumentReadonly field is set.
   */
  boolean hasLicenseDocumentReadonly();
  /**
   * <pre>
   * Output only. The readonly field containing the information for an uploaded
   * license document.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.common.LocalServicesDocumentReadOnly license_document_readonly = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The licenseDocumentReadonly.
   */
  com.google.ads.googleads.v19.common.LocalServicesDocumentReadOnly getLicenseDocumentReadonly();
  /**
   * <pre>
   * Output only. The readonly field containing the information for an uploaded
   * license document.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v19.common.LocalServicesDocumentReadOnly license_document_readonly = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v19.common.LocalServicesDocumentReadOnlyOrBuilder getLicenseDocumentReadonlyOrBuilder();

  /**
   * <pre>
   * Output only. The timestamp when this license expires.
   * The format is "YYYY-MM-DD HH:MM:SS" in the Google Ads account's timezone.
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>optional string expiration_date_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the expirationDateTime field is set.
   */
  boolean hasExpirationDateTime();
  /**
   * <pre>
   * Output only. The timestamp when this license expires.
   * The format is "YYYY-MM-DD HH:MM:SS" in the Google Ads account's timezone.
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>optional string expiration_date_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The expirationDateTime.
   */
  java.lang.String getExpirationDateTime();
  /**
   * <pre>
   * Output only. The timestamp when this license expires.
   * The format is "YYYY-MM-DD HH:MM:SS" in the Google Ads account's timezone.
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>optional string expiration_date_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for expirationDateTime.
   */
  com.google.protobuf.ByteString
      getExpirationDateTimeBytes();
}

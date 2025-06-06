// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/common/policy.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.common;

public interface PolicyTopicConstraintOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.common.PolicyTopicConstraint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Countries where the resource cannot serve.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.PolicyTopicConstraint.CountryConstraintList country_constraint_list = 1;</code>
   * @return Whether the countryConstraintList field is set.
   */
  boolean hasCountryConstraintList();
  /**
   * <pre>
   * Countries where the resource cannot serve.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.PolicyTopicConstraint.CountryConstraintList country_constraint_list = 1;</code>
   * @return The countryConstraintList.
   */
  com.google.ads.googleads.v20.common.PolicyTopicConstraint.CountryConstraintList getCountryConstraintList();
  /**
   * <pre>
   * Countries where the resource cannot serve.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.PolicyTopicConstraint.CountryConstraintList country_constraint_list = 1;</code>
   */
  com.google.ads.googleads.v20.common.PolicyTopicConstraint.CountryConstraintListOrBuilder getCountryConstraintListOrBuilder();

  /**
   * <pre>
   * Reseller constraint.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.PolicyTopicConstraint.ResellerConstraint reseller_constraint = 2;</code>
   * @return Whether the resellerConstraint field is set.
   */
  boolean hasResellerConstraint();
  /**
   * <pre>
   * Reseller constraint.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.PolicyTopicConstraint.ResellerConstraint reseller_constraint = 2;</code>
   * @return The resellerConstraint.
   */
  com.google.ads.googleads.v20.common.PolicyTopicConstraint.ResellerConstraint getResellerConstraint();
  /**
   * <pre>
   * Reseller constraint.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.PolicyTopicConstraint.ResellerConstraint reseller_constraint = 2;</code>
   */
  com.google.ads.googleads.v20.common.PolicyTopicConstraint.ResellerConstraintOrBuilder getResellerConstraintOrBuilder();

  /**
   * <pre>
   * Countries where a certificate is required for serving.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.PolicyTopicConstraint.CountryConstraintList certificate_missing_in_country_list = 3;</code>
   * @return Whether the certificateMissingInCountryList field is set.
   */
  boolean hasCertificateMissingInCountryList();
  /**
   * <pre>
   * Countries where a certificate is required for serving.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.PolicyTopicConstraint.CountryConstraintList certificate_missing_in_country_list = 3;</code>
   * @return The certificateMissingInCountryList.
   */
  com.google.ads.googleads.v20.common.PolicyTopicConstraint.CountryConstraintList getCertificateMissingInCountryList();
  /**
   * <pre>
   * Countries where a certificate is required for serving.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.PolicyTopicConstraint.CountryConstraintList certificate_missing_in_country_list = 3;</code>
   */
  com.google.ads.googleads.v20.common.PolicyTopicConstraint.CountryConstraintListOrBuilder getCertificateMissingInCountryListOrBuilder();

  /**
   * <pre>
   * Countries where the resource's domain is not covered by the
   * certificates associated with it.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.PolicyTopicConstraint.CountryConstraintList certificate_domain_mismatch_in_country_list = 4;</code>
   * @return Whether the certificateDomainMismatchInCountryList field is set.
   */
  boolean hasCertificateDomainMismatchInCountryList();
  /**
   * <pre>
   * Countries where the resource's domain is not covered by the
   * certificates associated with it.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.PolicyTopicConstraint.CountryConstraintList certificate_domain_mismatch_in_country_list = 4;</code>
   * @return The certificateDomainMismatchInCountryList.
   */
  com.google.ads.googleads.v20.common.PolicyTopicConstraint.CountryConstraintList getCertificateDomainMismatchInCountryList();
  /**
   * <pre>
   * Countries where the resource's domain is not covered by the
   * certificates associated with it.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.common.PolicyTopicConstraint.CountryConstraintList certificate_domain_mismatch_in_country_list = 4;</code>
   */
  com.google.ads.googleads.v20.common.PolicyTopicConstraint.CountryConstraintListOrBuilder getCertificateDomainMismatchInCountryListOrBuilder();

  com.google.ads.googleads.v20.common.PolicyTopicConstraint.ValueCase getValueCase();
}

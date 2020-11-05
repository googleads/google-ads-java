// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/resources/geo_target_constant.proto

package com.google.ads.googleads.v3.resources;

public interface GeoTargetConstantOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.resources.GeoTargetConstant)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the geo target constant.
   * Geo target constant resource names have the form:
   * `geoTargetConstants/{geo_target_constant_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the geo target constant.
   * Geo target constant resource names have the form:
   * `geoTargetConstants/{geo_target_constant_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the geo target constant.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the geo target constant.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  com.google.protobuf.Int64Value getId();
  /**
   * <pre>
   * Output only. The ID of the geo target constant.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * Output only. Geo target constant English name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * Output only. Geo target constant English name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * Output only. Geo target constant English name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * Output only. The ISO-3166-1 alpha-2 country code that is associated with the target.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the countryCode field is set.
   */
  boolean hasCountryCode();
  /**
   * <pre>
   * Output only. The ISO-3166-1 alpha-2 country code that is associated with the target.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The countryCode.
   */
  com.google.protobuf.StringValue getCountryCode();
  /**
   * <pre>
   * Output only. The ISO-3166-1 alpha-2 country code that is associated with the target.
   * </pre>
   *
   * <code>.google.protobuf.StringValue country_code = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getCountryCodeOrBuilder();

  /**
   * <pre>
   * Output only. Geo target constant target type.
   * </pre>
   *
   * <code>.google.protobuf.StringValue target_type = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the targetType field is set.
   */
  boolean hasTargetType();
  /**
   * <pre>
   * Output only. Geo target constant target type.
   * </pre>
   *
   * <code>.google.protobuf.StringValue target_type = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The targetType.
   */
  com.google.protobuf.StringValue getTargetType();
  /**
   * <pre>
   * Output only. Geo target constant target type.
   * </pre>
   *
   * <code>.google.protobuf.StringValue target_type = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getTargetTypeOrBuilder();

  /**
   * <pre>
   * Output only. Geo target constant status.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.GeoTargetConstantStatusEnum.GeoTargetConstantStatus status = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. Geo target constant status.
   * </pre>
   *
   * <code>.google.ads.googleads.v3.enums.GeoTargetConstantStatusEnum.GeoTargetConstantStatus status = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v3.enums.GeoTargetConstantStatusEnum.GeoTargetConstantStatus getStatus();

  /**
   * <pre>
   * Output only. The fully qualified English name, consisting of the target's name and that
   * of its parent and country.
   * </pre>
   *
   * <code>.google.protobuf.StringValue canonical_name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the canonicalName field is set.
   */
  boolean hasCanonicalName();
  /**
   * <pre>
   * Output only. The fully qualified English name, consisting of the target's name and that
   * of its parent and country.
   * </pre>
   *
   * <code>.google.protobuf.StringValue canonical_name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The canonicalName.
   */
  com.google.protobuf.StringValue getCanonicalName();
  /**
   * <pre>
   * Output only. The fully qualified English name, consisting of the target's name and that
   * of its parent and country.
   * </pre>
   *
   * <code>.google.protobuf.StringValue canonical_name = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StringValueOrBuilder getCanonicalNameOrBuilder();
}

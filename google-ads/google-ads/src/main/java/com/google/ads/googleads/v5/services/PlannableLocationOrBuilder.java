// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/services/reach_plan_service.proto

package com.google.ads.googleads.v5.services;

public interface PlannableLocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.services.PlannableLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The location identifier.
   * </pre>
   *
   * <code>.google.protobuf.StringValue id = 1;</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * The location identifier.
   * </pre>
   *
   * <code>.google.protobuf.StringValue id = 1;</code>
   * @return The id.
   */
  com.google.protobuf.StringValue getId();
  /**
   * <pre>
   * The location identifier.
   * </pre>
   *
   * <code>.google.protobuf.StringValue id = 1;</code>
   */
  com.google.protobuf.StringValueOrBuilder getIdOrBuilder();

  /**
   * <pre>
   * The unique location name in english.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 2;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The unique location name in english.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 2;</code>
   * @return The name.
   */
  com.google.protobuf.StringValue getName();
  /**
   * <pre>
   * The unique location name in english.
   * </pre>
   *
   * <code>.google.protobuf.StringValue name = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getNameOrBuilder();

  /**
   * <pre>
   * The parent country code, not present if location is a country.
   * If present will always be a criterion id: additional information, such as
   * country name are returned both via ListPlannableLocations or directly by
   * accessing GeoTargetConstantService with the criterion id.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_country_id = 3;</code>
   * @return Whether the parentCountryId field is set.
   */
  boolean hasParentCountryId();
  /**
   * <pre>
   * The parent country code, not present if location is a country.
   * If present will always be a criterion id: additional information, such as
   * country name are returned both via ListPlannableLocations or directly by
   * accessing GeoTargetConstantService with the criterion id.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_country_id = 3;</code>
   * @return The parentCountryId.
   */
  com.google.protobuf.Int64Value getParentCountryId();
  /**
   * <pre>
   * The parent country code, not present if location is a country.
   * If present will always be a criterion id: additional information, such as
   * country name are returned both via ListPlannableLocations or directly by
   * accessing GeoTargetConstantService with the criterion id.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value parent_country_id = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getParentCountryIdOrBuilder();
}

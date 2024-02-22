// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/asset_set_types.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.common;

public interface LocationSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.common.LocationSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Immutable. Location Ownership Type (owned location or affiliate
   * location).
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.LocationOwnershipTypeEnum.LocationOwnershipType location_ownership_type = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for locationOwnershipType.
   */
  int getLocationOwnershipTypeValue();
  /**
   * <pre>
   * Required. Immutable. Location Ownership Type (owned location or affiliate
   * location).
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.LocationOwnershipTypeEnum.LocationOwnershipType location_ownership_type = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The locationOwnershipType.
   */
  com.google.ads.googleads.v14.enums.LocationOwnershipTypeEnum.LocationOwnershipType getLocationOwnershipType();

  /**
   * <pre>
   * Data used to configure a location set populated from Google Business
   * Profile locations.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.BusinessProfileLocationSet business_profile_location_set = 1;</code>
   * @return Whether the businessProfileLocationSet field is set.
   */
  boolean hasBusinessProfileLocationSet();
  /**
   * <pre>
   * Data used to configure a location set populated from Google Business
   * Profile locations.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.BusinessProfileLocationSet business_profile_location_set = 1;</code>
   * @return The businessProfileLocationSet.
   */
  com.google.ads.googleads.v14.common.BusinessProfileLocationSet getBusinessProfileLocationSet();
  /**
   * <pre>
   * Data used to configure a location set populated from Google Business
   * Profile locations.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.BusinessProfileLocationSet business_profile_location_set = 1;</code>
   */
  com.google.ads.googleads.v14.common.BusinessProfileLocationSetOrBuilder getBusinessProfileLocationSetOrBuilder();

  /**
   * <pre>
   * Data used to configure a location on chain set populated with the
   * specified chains.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ChainSet chain_location_set = 2;</code>
   * @return Whether the chainLocationSet field is set.
   */
  boolean hasChainLocationSet();
  /**
   * <pre>
   * Data used to configure a location on chain set populated with the
   * specified chains.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ChainSet chain_location_set = 2;</code>
   * @return The chainLocationSet.
   */
  com.google.ads.googleads.v14.common.ChainSet getChainLocationSet();
  /**
   * <pre>
   * Data used to configure a location on chain set populated with the
   * specified chains.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.ChainSet chain_location_set = 2;</code>
   */
  com.google.ads.googleads.v14.common.ChainSetOrBuilder getChainLocationSetOrBuilder();

  /**
   * <pre>
   * Only set if locations are synced based on selected maps locations
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.MapsLocationSet maps_location_set = 5;</code>
   * @return Whether the mapsLocationSet field is set.
   */
  boolean hasMapsLocationSet();
  /**
   * <pre>
   * Only set if locations are synced based on selected maps locations
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.MapsLocationSet maps_location_set = 5;</code>
   * @return The mapsLocationSet.
   */
  com.google.ads.googleads.v14.common.MapsLocationSet getMapsLocationSet();
  /**
   * <pre>
   * Only set if locations are synced based on selected maps locations
   * </pre>
   *
   * <code>.google.ads.googleads.v14.common.MapsLocationSet maps_location_set = 5;</code>
   */
  com.google.ads.googleads.v14.common.MapsLocationSetOrBuilder getMapsLocationSetOrBuilder();

  com.google.ads.googleads.v14.common.LocationSet.SourceCase getSourceCase();
}

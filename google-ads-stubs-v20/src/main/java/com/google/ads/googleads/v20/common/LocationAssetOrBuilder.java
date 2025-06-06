// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/common/asset_types.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.common;

public interface LocationAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.common.LocationAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Place IDs uniquely identify a place in the Google Places database and on
   * Google Maps.
   * This field is unique for a given customer ID and asset type. See
   * https://developers.google.com/places/web-service/place-id to learn more
   * about Place ID.
   * </pre>
   *
   * <code>string place_id = 1;</code>
   * @return The placeId.
   */
  java.lang.String getPlaceId();
  /**
   * <pre>
   * Place IDs uniquely identify a place in the Google Places database and on
   * Google Maps.
   * This field is unique for a given customer ID and asset type. See
   * https://developers.google.com/places/web-service/place-id to learn more
   * about Place ID.
   * </pre>
   *
   * <code>string place_id = 1;</code>
   * @return The bytes for placeId.
   */
  com.google.protobuf.ByteString
      getPlaceIdBytes();

  /**
   * <pre>
   * The list of business locations for the customer.
   * This will only be returned if the Location Asset is syncing from the
   * Business Profile account. It is possible to have multiple Business Profile
   * listings under the same account that point to the same Place ID.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.common.BusinessProfileLocation business_profile_locations = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v20.common.BusinessProfileLocation> 
      getBusinessProfileLocationsList();
  /**
   * <pre>
   * The list of business locations for the customer.
   * This will only be returned if the Location Asset is syncing from the
   * Business Profile account. It is possible to have multiple Business Profile
   * listings under the same account that point to the same Place ID.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.common.BusinessProfileLocation business_profile_locations = 2;</code>
   */
  com.google.ads.googleads.v20.common.BusinessProfileLocation getBusinessProfileLocations(int index);
  /**
   * <pre>
   * The list of business locations for the customer.
   * This will only be returned if the Location Asset is syncing from the
   * Business Profile account. It is possible to have multiple Business Profile
   * listings under the same account that point to the same Place ID.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.common.BusinessProfileLocation business_profile_locations = 2;</code>
   */
  int getBusinessProfileLocationsCount();
  /**
   * <pre>
   * The list of business locations for the customer.
   * This will only be returned if the Location Asset is syncing from the
   * Business Profile account. It is possible to have multiple Business Profile
   * listings under the same account that point to the same Place ID.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.common.BusinessProfileLocation business_profile_locations = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v20.common.BusinessProfileLocationOrBuilder> 
      getBusinessProfileLocationsOrBuilderList();
  /**
   * <pre>
   * The list of business locations for the customer.
   * This will only be returned if the Location Asset is syncing from the
   * Business Profile account. It is possible to have multiple Business Profile
   * listings under the same account that point to the same Place ID.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.common.BusinessProfileLocation business_profile_locations = 2;</code>
   */
  com.google.ads.googleads.v20.common.BusinessProfileLocationOrBuilder getBusinessProfileLocationsOrBuilder(
      int index);

  /**
   * <pre>
   * The type of location ownership.
   * If the type is BUSINESS_OWNER, it will be served as a location extension.
   * If the type is AFFILIATE, it will be served as an affiliate location.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.enums.LocationOwnershipTypeEnum.LocationOwnershipType location_ownership_type = 3;</code>
   * @return The enum numeric value on the wire for locationOwnershipType.
   */
  int getLocationOwnershipTypeValue();
  /**
   * <pre>
   * The type of location ownership.
   * If the type is BUSINESS_OWNER, it will be served as a location extension.
   * If the type is AFFILIATE, it will be served as an affiliate location.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.enums.LocationOwnershipTypeEnum.LocationOwnershipType location_ownership_type = 3;</code>
   * @return The locationOwnershipType.
   */
  com.google.ads.googleads.v20.enums.LocationOwnershipTypeEnum.LocationOwnershipType getLocationOwnershipType();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/reach_plan_service.proto

package com.google.ads.googleads.v14.services;

public interface TargetingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v14.services.Targeting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The ID of the selected location. Plannable location IDs can be
   * obtained from
   * [ReachPlanService.ListPlannableLocations][google.ads.googleads.v14.services.ReachPlanService.ListPlannableLocations].
   *
   * Requests must set either this field or `plannable_location_ids`.
   *
   * This field is deprecated as of V12 and will be removed in a future release.
   * Use `plannable_location_ids` instead.
   * </pre>
   *
   * <code>optional string plannable_location_id = 6;</code>
   * @return Whether the plannableLocationId field is set.
   */
  boolean hasPlannableLocationId();
  /**
   * <pre>
   * The ID of the selected location. Plannable location IDs can be
   * obtained from
   * [ReachPlanService.ListPlannableLocations][google.ads.googleads.v14.services.ReachPlanService.ListPlannableLocations].
   *
   * Requests must set either this field or `plannable_location_ids`.
   *
   * This field is deprecated as of V12 and will be removed in a future release.
   * Use `plannable_location_ids` instead.
   * </pre>
   *
   * <code>optional string plannable_location_id = 6;</code>
   * @return The plannableLocationId.
   */
  java.lang.String getPlannableLocationId();
  /**
   * <pre>
   * The ID of the selected location. Plannable location IDs can be
   * obtained from
   * [ReachPlanService.ListPlannableLocations][google.ads.googleads.v14.services.ReachPlanService.ListPlannableLocations].
   *
   * Requests must set either this field or `plannable_location_ids`.
   *
   * This field is deprecated as of V12 and will be removed in a future release.
   * Use `plannable_location_ids` instead.
   * </pre>
   *
   * <code>optional string plannable_location_id = 6;</code>
   * @return The bytes for plannableLocationId.
   */
  com.google.protobuf.ByteString
      getPlannableLocationIdBytes();

  /**
   * <pre>
   * The list of plannable location IDs to target with this forecast.
   *
   * If more than one ID is provided, all IDs must have the same
   * `parent_country_id`. Planning for more than `parent_county` is not
   * supported. Plannable location IDs and their `parent_country_id` can be
   * obtained from
   * [ReachPlanService.ListPlannableLocations][google.ads.googleads.v14.services.ReachPlanService.ListPlannableLocations].
   *
   * Requests must set either this field or `plannable_location_id`.
   * </pre>
   *
   * <code>repeated string plannable_location_ids = 8;</code>
   * @return A list containing the plannableLocationIds.
   */
  java.util.List<java.lang.String>
      getPlannableLocationIdsList();
  /**
   * <pre>
   * The list of plannable location IDs to target with this forecast.
   *
   * If more than one ID is provided, all IDs must have the same
   * `parent_country_id`. Planning for more than `parent_county` is not
   * supported. Plannable location IDs and their `parent_country_id` can be
   * obtained from
   * [ReachPlanService.ListPlannableLocations][google.ads.googleads.v14.services.ReachPlanService.ListPlannableLocations].
   *
   * Requests must set either this field or `plannable_location_id`.
   * </pre>
   *
   * <code>repeated string plannable_location_ids = 8;</code>
   * @return The count of plannableLocationIds.
   */
  int getPlannableLocationIdsCount();
  /**
   * <pre>
   * The list of plannable location IDs to target with this forecast.
   *
   * If more than one ID is provided, all IDs must have the same
   * `parent_country_id`. Planning for more than `parent_county` is not
   * supported. Plannable location IDs and their `parent_country_id` can be
   * obtained from
   * [ReachPlanService.ListPlannableLocations][google.ads.googleads.v14.services.ReachPlanService.ListPlannableLocations].
   *
   * Requests must set either this field or `plannable_location_id`.
   * </pre>
   *
   * <code>repeated string plannable_location_ids = 8;</code>
   * @param index The index of the element to return.
   * @return The plannableLocationIds at the given index.
   */
  java.lang.String getPlannableLocationIds(int index);
  /**
   * <pre>
   * The list of plannable location IDs to target with this forecast.
   *
   * If more than one ID is provided, all IDs must have the same
   * `parent_country_id`. Planning for more than `parent_county` is not
   * supported. Plannable location IDs and their `parent_country_id` can be
   * obtained from
   * [ReachPlanService.ListPlannableLocations][google.ads.googleads.v14.services.ReachPlanService.ListPlannableLocations].
   *
   * Requests must set either this field or `plannable_location_id`.
   * </pre>
   *
   * <code>repeated string plannable_location_ids = 8;</code>
   * @param index The index of the value to return.
   * @return The bytes of the plannableLocationIds at the given index.
   */
  com.google.protobuf.ByteString
      getPlannableLocationIdsBytes(int index);

  /**
   * <pre>
   * Targeted age range.
   * An unset value is equivalent to targeting all ages.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange age_range = 2;</code>
   * @return The enum numeric value on the wire for ageRange.
   */
  int getAgeRangeValue();
  /**
   * <pre>
   * Targeted age range.
   * An unset value is equivalent to targeting all ages.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange age_range = 2;</code>
   * @return The ageRange.
   */
  com.google.ads.googleads.v14.enums.ReachPlanAgeRangeEnum.ReachPlanAgeRange getAgeRange();

  /**
   * <pre>
   * Targeted genders.
   * An unset value is equivalent to targeting MALE and FEMALE.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.GenderInfo genders = 3;</code>
   */
  java.util.List<com.google.ads.googleads.v14.common.GenderInfo> 
      getGendersList();
  /**
   * <pre>
   * Targeted genders.
   * An unset value is equivalent to targeting MALE and FEMALE.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.GenderInfo genders = 3;</code>
   */
  com.google.ads.googleads.v14.common.GenderInfo getGenders(int index);
  /**
   * <pre>
   * Targeted genders.
   * An unset value is equivalent to targeting MALE and FEMALE.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.GenderInfo genders = 3;</code>
   */
  int getGendersCount();
  /**
   * <pre>
   * Targeted genders.
   * An unset value is equivalent to targeting MALE and FEMALE.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.GenderInfo genders = 3;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v14.common.GenderInfoOrBuilder> 
      getGendersOrBuilderList();
  /**
   * <pre>
   * Targeted genders.
   * An unset value is equivalent to targeting MALE and FEMALE.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.GenderInfo genders = 3;</code>
   */
  com.google.ads.googleads.v14.common.GenderInfoOrBuilder getGendersOrBuilder(
      int index);

  /**
   * <pre>
   * Targeted devices.
   * If not specified, targets all applicable devices. Applicable devices vary
   * by product and region and can be obtained from
   * [ReachPlanService.ListPlannableProducts][google.ads.googleads.v14.services.ReachPlanService.ListPlannableProducts].
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.DeviceInfo devices = 4;</code>
   */
  java.util.List<com.google.ads.googleads.v14.common.DeviceInfo> 
      getDevicesList();
  /**
   * <pre>
   * Targeted devices.
   * If not specified, targets all applicable devices. Applicable devices vary
   * by product and region and can be obtained from
   * [ReachPlanService.ListPlannableProducts][google.ads.googleads.v14.services.ReachPlanService.ListPlannableProducts].
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.DeviceInfo devices = 4;</code>
   */
  com.google.ads.googleads.v14.common.DeviceInfo getDevices(int index);
  /**
   * <pre>
   * Targeted devices.
   * If not specified, targets all applicable devices. Applicable devices vary
   * by product and region and can be obtained from
   * [ReachPlanService.ListPlannableProducts][google.ads.googleads.v14.services.ReachPlanService.ListPlannableProducts].
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.DeviceInfo devices = 4;</code>
   */
  int getDevicesCount();
  /**
   * <pre>
   * Targeted devices.
   * If not specified, targets all applicable devices. Applicable devices vary
   * by product and region and can be obtained from
   * [ReachPlanService.ListPlannableProducts][google.ads.googleads.v14.services.ReachPlanService.ListPlannableProducts].
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.DeviceInfo devices = 4;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v14.common.DeviceInfoOrBuilder> 
      getDevicesOrBuilderList();
  /**
   * <pre>
   * Targeted devices.
   * If not specified, targets all applicable devices. Applicable devices vary
   * by product and region and can be obtained from
   * [ReachPlanService.ListPlannableProducts][google.ads.googleads.v14.services.ReachPlanService.ListPlannableProducts].
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.DeviceInfo devices = 4;</code>
   */
  com.google.ads.googleads.v14.common.DeviceInfoOrBuilder getDevicesOrBuilder(
      int index);

  /**
   * <pre>
   * Targetable network for the ad product.
   * If not specified, targets all applicable networks. Applicable networks vary
   * by product and region and can be obtained from
   * [ReachPlanService.ListPlannableProducts][google.ads.googleads.v14.services.ReachPlanService.ListPlannableProducts].
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.ReachPlanNetworkEnum.ReachPlanNetwork network = 5;</code>
   * @return The enum numeric value on the wire for network.
   */
  int getNetworkValue();
  /**
   * <pre>
   * Targetable network for the ad product.
   * If not specified, targets all applicable networks. Applicable networks vary
   * by product and region and can be obtained from
   * [ReachPlanService.ListPlannableProducts][google.ads.googleads.v14.services.ReachPlanService.ListPlannableProducts].
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.ReachPlanNetworkEnum.ReachPlanNetwork network = 5;</code>
   * @return The network.
   */
  com.google.ads.googleads.v14.enums.ReachPlanNetworkEnum.ReachPlanNetwork getNetwork();

  /**
   * <pre>
   * Targeted audiences.
   * If not specified, does not target any specific audience.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.AudienceTargeting audience_targeting = 7;</code>
   * @return Whether the audienceTargeting field is set.
   */
  boolean hasAudienceTargeting();
  /**
   * <pre>
   * Targeted audiences.
   * If not specified, does not target any specific audience.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.AudienceTargeting audience_targeting = 7;</code>
   * @return The audienceTargeting.
   */
  com.google.ads.googleads.v14.services.AudienceTargeting getAudienceTargeting();
  /**
   * <pre>
   * Targeted audiences.
   * If not specified, does not target any specific audience.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.AudienceTargeting audience_targeting = 7;</code>
   */
  com.google.ads.googleads.v14.services.AudienceTargetingOrBuilder getAudienceTargetingOrBuilder();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/recommendation_subscription.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.resources;

public interface RecommendationSubscriptionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.resources.RecommendationSubscription)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the recommendation subscription.
   *
   * `customers/{customer_id}/recommendationSubscriptions/{recommendation_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the recommendation subscription.
   *
   * `customers/{customer_id}/recommendationSubscriptions/{recommendation_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Required. Immutable. The type of recommendation subscribed to.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.RecommendationTypeEnum.RecommendationType type = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Required. Immutable. The type of recommendation subscribed to.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.RecommendationTypeEnum.RecommendationType type = 2 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The type.
   */
  com.google.ads.googleads.v15.enums.RecommendationTypeEnum.RecommendationType getType();

  /**
   * <pre>
   * Output only. Time in seconds when the subscription was first created. The
   * datetime is in the customer's time zone and in "yyyy-MM-dd HH:mm:ss"
   * format.
   * </pre>
   *
   * <code>optional string create_date_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the createDateTime field is set.
   */
  boolean hasCreateDateTime();
  /**
   * <pre>
   * Output only. Time in seconds when the subscription was first created. The
   * datetime is in the customer's time zone and in "yyyy-MM-dd HH:mm:ss"
   * format.
   * </pre>
   *
   * <code>optional string create_date_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The createDateTime.
   */
  java.lang.String getCreateDateTime();
  /**
   * <pre>
   * Output only. Time in seconds when the subscription was first created. The
   * datetime is in the customer's time zone and in "yyyy-MM-dd HH:mm:ss"
   * format.
   * </pre>
   *
   * <code>optional string create_date_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for createDateTime.
   */
  com.google.protobuf.ByteString
      getCreateDateTimeBytes();

  /**
   * <pre>
   * Output only. Contains the time in microseconds, when the Recommendation
   * Subscription was last updated. The datetime is in the customer's time zone
   * and in "yyyy-MM-dd HH:mm:ss.ssssss" format.
   * </pre>
   *
   * <code>optional string modify_date_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the modifyDateTime field is set.
   */
  boolean hasModifyDateTime();
  /**
   * <pre>
   * Output only. Contains the time in microseconds, when the Recommendation
   * Subscription was last updated. The datetime is in the customer's time zone
   * and in "yyyy-MM-dd HH:mm:ss.ssssss" format.
   * </pre>
   *
   * <code>optional string modify_date_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The modifyDateTime.
   */
  java.lang.String getModifyDateTime();
  /**
   * <pre>
   * Output only. Contains the time in microseconds, when the Recommendation
   * Subscription was last updated. The datetime is in the customer's time zone
   * and in "yyyy-MM-dd HH:mm:ss.ssssss" format.
   * </pre>
   *
   * <code>optional string modify_date_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for modifyDateTime.
   */
  com.google.protobuf.ByteString
      getModifyDateTimeBytes();

  /**
   * <pre>
   * Required. Status of the subscription, either enabled or paused.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v15.enums.RecommendationSubscriptionStatusEnum.RecommendationSubscriptionStatus status = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * Required. Status of the subscription, either enabled or paused.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v15.enums.RecommendationSubscriptionStatusEnum.RecommendationSubscriptionStatus status = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Required. Status of the subscription, either enabled or paused.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v15.enums.RecommendationSubscriptionStatusEnum.RecommendationSubscriptionStatus status = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The status.
   */
  com.google.ads.googleads.v15.enums.RecommendationSubscriptionStatusEnum.RecommendationSubscriptionStatus getStatus();
}

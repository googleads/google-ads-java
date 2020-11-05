// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/common/frequency_cap.proto

package com.google.ads.googleads.v5.common;

public interface FrequencyCapKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.common.FrequencyCapKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The level on which the cap is to be applied (e.g. ad group ad, ad group).
   * The cap is applied to all the entities of this level.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.FrequencyCapLevelEnum.FrequencyCapLevel level = 1;</code>
   * @return The enum numeric value on the wire for level.
   */
  int getLevelValue();
  /**
   * <pre>
   * The level on which the cap is to be applied (e.g. ad group ad, ad group).
   * The cap is applied to all the entities of this level.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.FrequencyCapLevelEnum.FrequencyCapLevel level = 1;</code>
   * @return The level.
   */
  com.google.ads.googleads.v5.enums.FrequencyCapLevelEnum.FrequencyCapLevel getLevel();

  /**
   * <pre>
   * The type of event that the cap applies to (e.g. impression).
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType event_type = 3;</code>
   * @return The enum numeric value on the wire for eventType.
   */
  int getEventTypeValue();
  /**
   * <pre>
   * The type of event that the cap applies to (e.g. impression).
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType event_type = 3;</code>
   * @return The eventType.
   */
  com.google.ads.googleads.v5.enums.FrequencyCapEventTypeEnum.FrequencyCapEventType getEventType();

  /**
   * <pre>
   * Unit of time the cap is defined at (e.g. day, week).
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2;</code>
   * @return The enum numeric value on the wire for timeUnit.
   */
  int getTimeUnitValue();
  /**
   * <pre>
   * Unit of time the cap is defined at (e.g. day, week).
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit time_unit = 2;</code>
   * @return The timeUnit.
   */
  com.google.ads.googleads.v5.enums.FrequencyCapTimeUnitEnum.FrequencyCapTimeUnit getTimeUnit();

  /**
   * <pre>
   * Number of time units the cap lasts.
   * </pre>
   *
   * <code>int32 time_length = 5;</code>
   * @return Whether the timeLength field is set.
   */
  boolean hasTimeLength();
  /**
   * <pre>
   * Number of time units the cap lasts.
   * </pre>
   *
   * <code>int32 time_length = 5;</code>
   * @return The timeLength.
   */
  int getTimeLength();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/frequency_cap.proto

package com.google.ads.googleads.v1.common;

public interface FrequencyCapEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v1.common.FrequencyCapEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The key of a particular frequency cap. There can be no more
   * than one frequency cap with the same key.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.FrequencyCapKey key = 1;</code>
   */
  boolean hasKey();
  /**
   * <pre>
   * The key of a particular frequency cap. There can be no more
   * than one frequency cap with the same key.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.FrequencyCapKey key = 1;</code>
   */
  com.google.ads.googleads.v1.common.FrequencyCapKey getKey();
  /**
   * <pre>
   * The key of a particular frequency cap. There can be no more
   * than one frequency cap with the same key.
   * </pre>
   *
   * <code>.google.ads.googleads.v1.common.FrequencyCapKey key = 1;</code>
   */
  com.google.ads.googleads.v1.common.FrequencyCapKeyOrBuilder getKeyOrBuilder();

  /**
   * <pre>
   * Maximum number of events allowed during the time range by this cap.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value cap = 2;</code>
   */
  boolean hasCap();
  /**
   * <pre>
   * Maximum number of events allowed during the time range by this cap.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value cap = 2;</code>
   */
  com.google.protobuf.Int32Value getCap();
  /**
   * <pre>
   * Maximum number of events allowed during the time range by this cap.
   * </pre>
   *
   * <code>.google.protobuf.Int32Value cap = 2;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getCapOrBuilder();
}

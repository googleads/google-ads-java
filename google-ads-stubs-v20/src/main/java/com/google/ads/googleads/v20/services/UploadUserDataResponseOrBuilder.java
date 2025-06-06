// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/services/user_data_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.services;

public interface UploadUserDataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.services.UploadUserDataResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The date time at which the request was received by API, formatted as
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string upload_date_time = 3;</code>
   * @return Whether the uploadDateTime field is set.
   */
  boolean hasUploadDateTime();
  /**
   * <pre>
   * The date time at which the request was received by API, formatted as
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string upload_date_time = 3;</code>
   * @return The uploadDateTime.
   */
  java.lang.String getUploadDateTime();
  /**
   * <pre>
   * The date time at which the request was received by API, formatted as
   * "yyyy-mm-dd hh:mm:ss+|-hh:mm", for example, "2019-01-01 12:32:45-08:00".
   * </pre>
   *
   * <code>optional string upload_date_time = 3;</code>
   * @return The bytes for uploadDateTime.
   */
  com.google.protobuf.ByteString
      getUploadDateTimeBytes();

  /**
   * <pre>
   * Number of upload data operations received by API.
   * </pre>
   *
   * <code>optional int32 received_operations_count = 4;</code>
   * @return Whether the receivedOperationsCount field is set.
   */
  boolean hasReceivedOperationsCount();
  /**
   * <pre>
   * Number of upload data operations received by API.
   * </pre>
   *
   * <code>optional int32 received_operations_count = 4;</code>
   * @return The receivedOperationsCount.
   */
  int getReceivedOperationsCount();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/services/conversion_upload_service.proto

package com.google.ads.googleads.v3.services;

public interface UploadCallConversionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v3.services.UploadCallConversionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer performing the upload.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer performing the upload.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The conversions that are being uploaded.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.CallConversion conversions = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v3.services.CallConversion> 
      getConversionsList();
  /**
   * <pre>
   * Required. The conversions that are being uploaded.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.CallConversion conversions = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v3.services.CallConversion getConversions(int index);
  /**
   * <pre>
   * Required. The conversions that are being uploaded.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.CallConversion conversions = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getConversionsCount();
  /**
   * <pre>
   * Required. The conversions that are being uploaded.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.CallConversion conversions = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v3.services.CallConversionOrBuilder> 
      getConversionsOrBuilderList();
  /**
   * <pre>
   * Required. The conversions that are being uploaded.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v3.services.CallConversion conversions = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v3.services.CallConversionOrBuilder getConversionsOrBuilder(
      int index);

  /**
   * <pre>
   * Required. If true, successful operations will be carried out and invalid
   * operations will return errors. If false, all operations will be carried
   * out in one transaction if and only if they are all valid.
   * This should always be set to true.
   * See
   * https://developers.google.com/google-ads/api/docs/best-practices/partial-failures
   * for more information about partial failure.
   * </pre>
   *
   * <code>bool partial_failure = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The partialFailure.
   */
  boolean getPartialFailure();

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}

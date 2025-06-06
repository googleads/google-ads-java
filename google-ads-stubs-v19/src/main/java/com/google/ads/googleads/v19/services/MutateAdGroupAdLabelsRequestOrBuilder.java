// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/ad_group_ad_label_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.services;

public interface MutateAdGroupAdLabelsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v19.services.MutateAdGroupAdLabelsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. ID of the customer whose ad group ad labels are being modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. ID of the customer whose ad group ad labels are being modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The list of operations to perform on ad group ad labels.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.AdGroupAdLabelOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v19.services.AdGroupAdLabelOperation> 
      getOperationsList();
  /**
   * <pre>
   * Required. The list of operations to perform on ad group ad labels.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.AdGroupAdLabelOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v19.services.AdGroupAdLabelOperation getOperations(int index);
  /**
   * <pre>
   * Required. The list of operations to perform on ad group ad labels.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.AdGroupAdLabelOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * Required. The list of operations to perform on ad group ad labels.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.AdGroupAdLabelOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v19.services.AdGroupAdLabelOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * Required. The list of operations to perform on ad group ad labels.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.AdGroupAdLabelOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v19.services.AdGroupAdLabelOperationOrBuilder getOperationsOrBuilder(
      int index);

  /**
   * <pre>
   * If true, successful operations will be carried out and invalid
   * operations will return errors. If false, all operations will be carried
   * out in one transaction if and only if they are all valid.
   * Default is false.
   * </pre>
   *
   * <code>bool partial_failure = 3;</code>
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

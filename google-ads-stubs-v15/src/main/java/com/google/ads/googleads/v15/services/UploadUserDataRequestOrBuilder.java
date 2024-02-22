// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/user_data_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.services;

public interface UploadUserDataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.UploadUserDataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer for which to update the user data.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer for which to update the user data.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The list of operations to be done.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.UserDataOperation operations = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v15.services.UserDataOperation> 
      getOperationsList();
  /**
   * <pre>
   * Required. The list of operations to be done.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.UserDataOperation operations = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v15.services.UserDataOperation getOperations(int index);
  /**
   * <pre>
   * Required. The list of operations to be done.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.UserDataOperation operations = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * Required. The list of operations to be done.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.UserDataOperation operations = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.services.UserDataOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * Required. The list of operations to be done.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.UserDataOperation operations = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v15.services.UserDataOperationOrBuilder getOperationsOrBuilder(
      int index);

  /**
   * <pre>
   * Metadata for data updates to a Customer Match user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.CustomerMatchUserListMetadata customer_match_user_list_metadata = 2;</code>
   * @return Whether the customerMatchUserListMetadata field is set.
   */
  boolean hasCustomerMatchUserListMetadata();
  /**
   * <pre>
   * Metadata for data updates to a Customer Match user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.CustomerMatchUserListMetadata customer_match_user_list_metadata = 2;</code>
   * @return The customerMatchUserListMetadata.
   */
  com.google.ads.googleads.v15.common.CustomerMatchUserListMetadata getCustomerMatchUserListMetadata();
  /**
   * <pre>
   * Metadata for data updates to a Customer Match user list.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.CustomerMatchUserListMetadata customer_match_user_list_metadata = 2;</code>
   */
  com.google.ads.googleads.v15.common.CustomerMatchUserListMetadataOrBuilder getCustomerMatchUserListMetadataOrBuilder();

  com.google.ads.googleads.v15.services.UploadUserDataRequest.MetadataCase getMetadataCase();
}

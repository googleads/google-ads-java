// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/product_link.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.resources;

public interface AdvertisingPartnerIdentifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.resources.AdvertisingPartnerIdentifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the advertising partner Google Ads
   * account. This field is required and should not be empty when creating a new
   * Advertising Partner link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional string customer = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the customer field is set.
   */
  boolean hasCustomer();
  /**
   * <pre>
   * Output only. The resource name of the advertising partner Google Ads
   * account. This field is required and should not be empty when creating a new
   * Advertising Partner link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional string customer = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The customer.
   */
  java.lang.String getCustomer();
  /**
   * <pre>
   * Output only. The resource name of the advertising partner Google Ads
   * account. This field is required and should not be empty when creating a new
   * Advertising Partner link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional string customer = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for customer.
   */
  com.google.protobuf.ByteString
      getCustomerBytes();
}

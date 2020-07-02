// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/customer_client_link.proto

package com.google.ads.googleads.v5.resources;

public interface CustomerClientLinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v5.resources.CustomerClientLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. Name of the resource.
   * CustomerClientLink resource names have the form:
   * `customers/{customer_id}/customerClientLinks/{client_customer_id}~{manager_link_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. Name of the resource.
   * CustomerClientLink resource names have the form:
   * `customers/{customer_id}/customerClientLinks/{client_customer_id}~{manager_link_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Immutable. The client customer linked to this customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue client_customer = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the clientCustomer field is set.
   */
  boolean hasClientCustomer();
  /**
   * <pre>
   * Immutable. The client customer linked to this customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue client_customer = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The clientCustomer.
   */
  com.google.protobuf.StringValue getClientCustomer();
  /**
   * <pre>
   * Immutable. The client customer linked to this customer.
   * </pre>
   *
   * <code>.google.protobuf.StringValue client_customer = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  com.google.protobuf.StringValueOrBuilder getClientCustomerOrBuilder();

  /**
   * <pre>
   * Output only. This is uniquely identifies a customer client link. Read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value manager_link_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the managerLinkId field is set.
   */
  boolean hasManagerLinkId();
  /**
   * <pre>
   * Output only. This is uniquely identifies a customer client link. Read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value manager_link_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The managerLinkId.
   */
  com.google.protobuf.Int64Value getManagerLinkId();
  /**
   * <pre>
   * Output only. This is uniquely identifies a customer client link. Read only.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value manager_link_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getManagerLinkIdOrBuilder();

  /**
   * <pre>
   * This is the status of the link between client and manager.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * This is the status of the link between client and manager.
   * </pre>
   *
   * <code>.google.ads.googleads.v5.enums.ManagerLinkStatusEnum.ManagerLinkStatus status = 5;</code>
   * @return The status.
   */
  com.google.ads.googleads.v5.enums.ManagerLinkStatusEnum.ManagerLinkStatus getStatus();

  /**
   * <pre>
   * The visibility of the link. Users can choose whether or not to see hidden
   * links in the AdWords UI.
   * Default value is false
   * </pre>
   *
   * <code>.google.protobuf.BoolValue hidden = 6;</code>
   * @return Whether the hidden field is set.
   */
  boolean hasHidden();
  /**
   * <pre>
   * The visibility of the link. Users can choose whether or not to see hidden
   * links in the AdWords UI.
   * Default value is false
   * </pre>
   *
   * <code>.google.protobuf.BoolValue hidden = 6;</code>
   * @return The hidden.
   */
  com.google.protobuf.BoolValue getHidden();
  /**
   * <pre>
   * The visibility of the link. Users can choose whether or not to see hidden
   * links in the AdWords UI.
   * Default value is false
   * </pre>
   *
   * <code>.google.protobuf.BoolValue hidden = 6;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getHiddenOrBuilder();
}

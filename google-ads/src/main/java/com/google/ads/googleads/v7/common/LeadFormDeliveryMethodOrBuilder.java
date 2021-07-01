// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v7/common/asset_types.proto

package com.google.ads.googleads.v7.common;

public interface LeadFormDeliveryMethodOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v7.common.LeadFormDeliveryMethod)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Webhook method of delivery.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.WebhookDelivery webhook = 1;</code>
   * @return Whether the webhook field is set.
   */
  boolean hasWebhook();
  /**
   * <pre>
   * Webhook method of delivery.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.WebhookDelivery webhook = 1;</code>
   * @return The webhook.
   */
  com.google.ads.googleads.v7.common.WebhookDelivery getWebhook();
  /**
   * <pre>
   * Webhook method of delivery.
   * </pre>
   *
   * <code>.google.ads.googleads.v7.common.WebhookDelivery webhook = 1;</code>
   */
  com.google.ads.googleads.v7.common.WebhookDeliveryOrBuilder getWebhookOrBuilder();

  public com.google.ads.googleads.v7.common.LeadFormDeliveryMethod.DeliveryDetailsCase getDeliveryDetailsCase();
}
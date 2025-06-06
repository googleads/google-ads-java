// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/common/offline_user_data.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.common;

public interface ShoppingLoyaltyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.common.ShoppingLoyalty)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The membership tier. It is a free-form string as each merchant may have
   * their own loyalty system. For example, it could be a number from 1 to 10,
   * or a string such as "Golden" or "Silver", or even empty string "".
   * </pre>
   *
   * <code>optional string loyalty_tier = 1;</code>
   * @return Whether the loyaltyTier field is set.
   */
  boolean hasLoyaltyTier();
  /**
   * <pre>
   * The membership tier. It is a free-form string as each merchant may have
   * their own loyalty system. For example, it could be a number from 1 to 10,
   * or a string such as "Golden" or "Silver", or even empty string "".
   * </pre>
   *
   * <code>optional string loyalty_tier = 1;</code>
   * @return The loyaltyTier.
   */
  java.lang.String getLoyaltyTier();
  /**
   * <pre>
   * The membership tier. It is a free-form string as each merchant may have
   * their own loyalty system. For example, it could be a number from 1 to 10,
   * or a string such as "Golden" or "Silver", or even empty string "".
   * </pre>
   *
   * <code>optional string loyalty_tier = 1;</code>
   * @return The bytes for loyaltyTier.
   */
  com.google.protobuf.ByteString
      getLoyaltyTierBytes();
}

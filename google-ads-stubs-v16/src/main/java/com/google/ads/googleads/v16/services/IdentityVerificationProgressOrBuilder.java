// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/identity_verification_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.services;

public interface IdentityVerificationProgressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.services.IdentityVerificationProgress)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Current Status (PENDING_USER_ACTION, SUCCESS, FAILURE etc)
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.IdentityVerificationProgramStatusEnum.IdentityVerificationProgramStatus program_status = 1;</code>
   * @return The enum numeric value on the wire for programStatus.
   */
  int getProgramStatusValue();
  /**
   * <pre>
   * Current Status (PENDING_USER_ACTION, SUCCESS, FAILURE etc)
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.IdentityVerificationProgramStatusEnum.IdentityVerificationProgramStatus program_status = 1;</code>
   * @return The programStatus.
   */
  com.google.ads.googleads.v16.enums.IdentityVerificationProgramStatusEnum.IdentityVerificationProgramStatus getProgramStatus();

  /**
   * <pre>
   * The timestamp when the action url will expire in "yyyy-MM-dd HH:mm:ss"
   * format.
   * </pre>
   *
   * <code>string invitation_link_expiration_time = 2;</code>
   * @return The invitationLinkExpirationTime.
   */
  java.lang.String getInvitationLinkExpirationTime();
  /**
   * <pre>
   * The timestamp when the action url will expire in "yyyy-MM-dd HH:mm:ss"
   * format.
   * </pre>
   *
   * <code>string invitation_link_expiration_time = 2;</code>
   * @return The bytes for invitationLinkExpirationTime.
   */
  com.google.protobuf.ByteString
      getInvitationLinkExpirationTimeBytes();

  /**
   * <pre>
   * Action URL for user to complete verification for the given verification
   * program type.
   * </pre>
   *
   * <code>string action_url = 3;</code>
   * @return The actionUrl.
   */
  java.lang.String getActionUrl();
  /**
   * <pre>
   * Action URL for user to complete verification for the given verification
   * program type.
   * </pre>
   *
   * <code>string action_url = 3;</code>
   * @return The bytes for actionUrl.
   */
  com.google.protobuf.ByteString
      getActionUrlBytes();
}

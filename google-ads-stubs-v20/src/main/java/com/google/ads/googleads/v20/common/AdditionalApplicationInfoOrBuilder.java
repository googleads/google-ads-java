// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/common/additional_application_info.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.common;

public interface AdditionalApplicationInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v20.common.AdditionalApplicationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The unique identifier of the agency proprietary application. This
   * identifier is generated by Google. Reach out to your Google representative
   * to request an application_id for each new application being integrated.
   * </pre>
   *
   * <code>string application_id = 1;</code>
   * @return The applicationId.
   */
  java.lang.String getApplicationId();
  /**
   * <pre>
   * The unique identifier of the agency proprietary application. This
   * identifier is generated by Google. Reach out to your Google representative
   * to request an application_id for each new application being integrated.
   * </pre>
   *
   * <code>string application_id = 1;</code>
   * @return The bytes for applicationId.
   */
  com.google.protobuf.ByteString
      getApplicationIdBytes();

  /**
   * <pre>
   * The instance type of the application sending the request.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.enums.ApplicationInstanceEnum.ApplicationInstance application_instance = 2;</code>
   * @return The enum numeric value on the wire for applicationInstance.
   */
  int getApplicationInstanceValue();
  /**
   * <pre>
   * The instance type of the application sending the request.
   * </pre>
   *
   * <code>.google.ads.googleads.v20.enums.ApplicationInstanceEnum.ApplicationInstance application_instance = 2;</code>
   * @return The applicationInstance.
   */
  com.google.ads.googleads.v20.enums.ApplicationInstanceEnum.ApplicationInstance getApplicationInstance();
}

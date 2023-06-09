// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/customer_manager_link_service.proto

package com.google.ads.googleads.v13.services;

/**
 * <pre>
 * Request message for
 * [CustomerManagerLinkService.MoveManagerLink][google.ads.googleads.v13.services.CustomerManagerLinkService.MoveManagerLink].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v13.services.MoveManagerLinkRequest}
 */
public final class MoveManagerLinkRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v13.services.MoveManagerLinkRequest)
    MoveManagerLinkRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MoveManagerLinkRequest.newBuilder() to construct.
  private MoveManagerLinkRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MoveManagerLinkRequest() {
    customerId_ = "";
    previousCustomerManagerLink_ = "";
    newManager_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MoveManagerLinkRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v13.services.CustomerManagerLinkServiceProto.internal_static_google_ads_googleads_v13_services_MoveManagerLinkRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v13.services.CustomerManagerLinkServiceProto.internal_static_google_ads_googleads_v13_services_MoveManagerLinkRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v13.services.MoveManagerLinkRequest.class, com.google.ads.googleads.v13.services.MoveManagerLinkRequest.Builder.class);
  }

  public static final int CUSTOMER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object customerId_ = "";
  /**
   * <pre>
   * Required. The ID of the client customer that is being moved.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  @java.lang.Override
  public java.lang.String getCustomerId() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID of the client customer that is being moved.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerIdBytes() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PREVIOUS_CUSTOMER_MANAGER_LINK_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object previousCustomerManagerLink_ = "";
  /**
   * <pre>
   * Required. The resource name of the previous CustomerManagerLink.
   * The resource name has the form:
   * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
   * </pre>
   *
   * <code>string previous_customer_manager_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The previousCustomerManagerLink.
   */
  @java.lang.Override
  public java.lang.String getPreviousCustomerManagerLink() {
    java.lang.Object ref = previousCustomerManagerLink_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      previousCustomerManagerLink_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the previous CustomerManagerLink.
   * The resource name has the form:
   * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
   * </pre>
   *
   * <code>string previous_customer_manager_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for previousCustomerManagerLink.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPreviousCustomerManagerLinkBytes() {
    java.lang.Object ref = previousCustomerManagerLink_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      previousCustomerManagerLink_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEW_MANAGER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object newManager_ = "";
  /**
   * <pre>
   * Required. The resource name of the new manager customer that the client
   * wants to move to. Customer resource names have the format:
   * "customers/{customer_id}"
   * </pre>
   *
   * <code>string new_manager = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The newManager.
   */
  @java.lang.Override
  public java.lang.String getNewManager() {
    java.lang.Object ref = newManager_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newManager_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the new manager customer that the client
   * wants to move to. Customer resource names have the format:
   * "customers/{customer_id}"
   * </pre>
   *
   * <code>string new_manager = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for newManager.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNewManagerBytes() {
    java.lang.Object ref = newManager_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newManager_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 4;
  private boolean validateOnly_ = false;
  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customerId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(previousCustomerManagerLink_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, previousCustomerManagerLink_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newManager_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, newManager_);
    }
    if (validateOnly_ != false) {
      output.writeBool(4, validateOnly_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customerId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(previousCustomerManagerLink_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, previousCustomerManagerLink_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newManager_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, newManager_);
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, validateOnly_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v13.services.MoveManagerLinkRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v13.services.MoveManagerLinkRequest other = (com.google.ads.googleads.v13.services.MoveManagerLinkRequest) obj;

    if (!getCustomerId()
        .equals(other.getCustomerId())) return false;
    if (!getPreviousCustomerManagerLink()
        .equals(other.getPreviousCustomerManagerLink())) return false;
    if (!getNewManager()
        .equals(other.getNewManager())) return false;
    if (getValidateOnly()
        != other.getValidateOnly()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CUSTOMER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerId().hashCode();
    hash = (37 * hash) + PREVIOUS_CUSTOMER_MANAGER_LINK_FIELD_NUMBER;
    hash = (53 * hash) + getPreviousCustomerManagerLink().hashCode();
    hash = (37 * hash) + NEW_MANAGER_FIELD_NUMBER;
    hash = (53 * hash) + getNewManager().hashCode();
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v13.services.MoveManagerLinkRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.services.MoveManagerLinkRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.MoveManagerLinkRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.services.MoveManagerLinkRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.MoveManagerLinkRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.services.MoveManagerLinkRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.MoveManagerLinkRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.services.MoveManagerLinkRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v13.services.MoveManagerLinkRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v13.services.MoveManagerLinkRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.MoveManagerLinkRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.services.MoveManagerLinkRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v13.services.MoveManagerLinkRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Request message for
   * [CustomerManagerLinkService.MoveManagerLink][google.ads.googleads.v13.services.CustomerManagerLinkService.MoveManagerLink].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v13.services.MoveManagerLinkRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v13.services.MoveManagerLinkRequest)
      com.google.ads.googleads.v13.services.MoveManagerLinkRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v13.services.CustomerManagerLinkServiceProto.internal_static_google_ads_googleads_v13_services_MoveManagerLinkRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v13.services.CustomerManagerLinkServiceProto.internal_static_google_ads_googleads_v13_services_MoveManagerLinkRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v13.services.MoveManagerLinkRequest.class, com.google.ads.googleads.v13.services.MoveManagerLinkRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v13.services.MoveManagerLinkRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      customerId_ = "";
      previousCustomerManagerLink_ = "";
      newManager_ = "";
      validateOnly_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v13.services.CustomerManagerLinkServiceProto.internal_static_google_ads_googleads_v13_services_MoveManagerLinkRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.services.MoveManagerLinkRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v13.services.MoveManagerLinkRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.services.MoveManagerLinkRequest build() {
      com.google.ads.googleads.v13.services.MoveManagerLinkRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.services.MoveManagerLinkRequest buildPartial() {
      com.google.ads.googleads.v13.services.MoveManagerLinkRequest result = new com.google.ads.googleads.v13.services.MoveManagerLinkRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v13.services.MoveManagerLinkRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.customerId_ = customerId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.previousCustomerManagerLink_ = previousCustomerManagerLink_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.newManager_ = newManager_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.validateOnly_ = validateOnly_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v13.services.MoveManagerLinkRequest) {
        return mergeFrom((com.google.ads.googleads.v13.services.MoveManagerLinkRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v13.services.MoveManagerLinkRequest other) {
      if (other == com.google.ads.googleads.v13.services.MoveManagerLinkRequest.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPreviousCustomerManagerLink().isEmpty()) {
        previousCustomerManagerLink_ = other.previousCustomerManagerLink_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getNewManager().isEmpty()) {
        newManager_ = other.newManager_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              customerId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              previousCustomerManagerLink_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              newManager_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              validateOnly_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object customerId_ = "";
    /**
     * <pre>
     * Required. The ID of the client customer that is being moved.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The customerId.
     */
    public java.lang.String getCustomerId() {
      java.lang.Object ref = customerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the client customer that is being moved.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for customerId.
     */
    public com.google.protobuf.ByteString
        getCustomerIdBytes() {
      java.lang.Object ref = customerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the client customer that is being moved.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      customerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the client customer that is being moved.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomerId() {
      customerId_ = getDefaultInstance().getCustomerId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the client customer that is being moved.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      customerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object previousCustomerManagerLink_ = "";
    /**
     * <pre>
     * Required. The resource name of the previous CustomerManagerLink.
     * The resource name has the form:
     * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
     * </pre>
     *
     * <code>string previous_customer_manager_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The previousCustomerManagerLink.
     */
    public java.lang.String getPreviousCustomerManagerLink() {
      java.lang.Object ref = previousCustomerManagerLink_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        previousCustomerManagerLink_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the previous CustomerManagerLink.
     * The resource name has the form:
     * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
     * </pre>
     *
     * <code>string previous_customer_manager_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for previousCustomerManagerLink.
     */
    public com.google.protobuf.ByteString
        getPreviousCustomerManagerLinkBytes() {
      java.lang.Object ref = previousCustomerManagerLink_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        previousCustomerManagerLink_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the previous CustomerManagerLink.
     * The resource name has the form:
     * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
     * </pre>
     *
     * <code>string previous_customer_manager_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The previousCustomerManagerLink to set.
     * @return This builder for chaining.
     */
    public Builder setPreviousCustomerManagerLink(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      previousCustomerManagerLink_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the previous CustomerManagerLink.
     * The resource name has the form:
     * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
     * </pre>
     *
     * <code>string previous_customer_manager_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearPreviousCustomerManagerLink() {
      previousCustomerManagerLink_ = getDefaultInstance().getPreviousCustomerManagerLink();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the previous CustomerManagerLink.
     * The resource name has the form:
     * `customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}`
     * </pre>
     *
     * <code>string previous_customer_manager_link = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for previousCustomerManagerLink to set.
     * @return This builder for chaining.
     */
    public Builder setPreviousCustomerManagerLinkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      previousCustomerManagerLink_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object newManager_ = "";
    /**
     * <pre>
     * Required. The resource name of the new manager customer that the client
     * wants to move to. Customer resource names have the format:
     * "customers/{customer_id}"
     * </pre>
     *
     * <code>string new_manager = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The newManager.
     */
    public java.lang.String getNewManager() {
      java.lang.Object ref = newManager_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newManager_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the new manager customer that the client
     * wants to move to. Customer resource names have the format:
     * "customers/{customer_id}"
     * </pre>
     *
     * <code>string new_manager = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for newManager.
     */
    public com.google.protobuf.ByteString
        getNewManagerBytes() {
      java.lang.Object ref = newManager_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newManager_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the new manager customer that the client
     * wants to move to. Customer resource names have the format:
     * "customers/{customer_id}"
     * </pre>
     *
     * <code>string new_manager = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The newManager to set.
     * @return This builder for chaining.
     */
    public Builder setNewManager(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      newManager_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the new manager customer that the client
     * wants to move to. Customer resource names have the format:
     * "customers/{customer_id}"
     * </pre>
     *
     * <code>string new_manager = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearNewManager() {
      newManager_ = getDefaultInstance().getNewManager();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the new manager customer that the client
     * wants to move to. Customer resource names have the format:
     * "customers/{customer_id}"
     * </pre>
     *
     * <code>string new_manager = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for newManager to set.
     * @return This builder for chaining.
     */
    public Builder setNewManagerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      newManager_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private boolean validateOnly_ ;
    /**
     * <pre>
     * If true, the request is validated but not executed. Only errors are
     * returned, not results.
     * </pre>
     *
     * <code>bool validate_only = 4;</code>
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     * <pre>
     * If true, the request is validated but not executed. Only errors are
     * returned, not results.
     * </pre>
     *
     * <code>bool validate_only = 4;</code>
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, the request is validated but not executed. Only errors are
     * returned, not results.
     * </pre>
     *
     * <code>bool validate_only = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {
      bitField0_ = (bitField0_ & ~0x00000008);
      validateOnly_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v13.services.MoveManagerLinkRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v13.services.MoveManagerLinkRequest)
  private static final com.google.ads.googleads.v13.services.MoveManagerLinkRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v13.services.MoveManagerLinkRequest();
  }

  public static com.google.ads.googleads.v13.services.MoveManagerLinkRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MoveManagerLinkRequest>
      PARSER = new com.google.protobuf.AbstractParser<MoveManagerLinkRequest>() {
    @java.lang.Override
    public MoveManagerLinkRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<MoveManagerLinkRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MoveManagerLinkRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v13.services.MoveManagerLinkRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


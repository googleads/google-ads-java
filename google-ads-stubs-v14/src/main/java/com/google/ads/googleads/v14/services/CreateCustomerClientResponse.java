// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/customer_service.proto

package com.google.ads.googleads.v14.services;

/**
 * <pre>
 * Response message for CreateCustomerClient mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.services.CreateCustomerClientResponse}
 */
public final class CreateCustomerClientResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.services.CreateCustomerClientResponse)
    CreateCustomerClientResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateCustomerClientResponse.newBuilder() to construct.
  private CreateCustomerClientResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateCustomerClientResponse() {
    resourceName_ = "";
    invitationLink_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateCustomerClientResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.services.CustomerServiceProto.internal_static_google_ads_googleads_v14_services_CreateCustomerClientResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.services.CustomerServiceProto.internal_static_google_ads_googleads_v14_services_CreateCustomerClientResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.services.CreateCustomerClientResponse.class, com.google.ads.googleads.v14.services.CreateCustomerClientResponse.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceName_ = "";
  /**
   * <pre>
   * The resource name of the newly created customer. Customer resource names
   * have the form: `customers/{customer_id}`.
   * </pre>
   *
   * <code>string resource_name = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of the newly created customer. Customer resource names
   * have the form: `customers/{customer_id}`.
   * </pre>
   *
   * <code>string resource_name = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INVITATION_LINK_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object invitationLink_ = "";
  /**
   * <pre>
   * Link for inviting user to access the created customer. Accessible to
   * allowlisted customers only.
   * </pre>
   *
   * <code>string invitation_link = 3;</code>
   * @return The invitationLink.
   */
  @java.lang.Override
  public java.lang.String getInvitationLink() {
    java.lang.Object ref = invitationLink_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      invitationLink_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Link for inviting user to access the created customer. Accessible to
   * allowlisted customers only.
   * </pre>
   *
   * <code>string invitation_link = 3;</code>
   * @return The bytes for invitationLink.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInvitationLinkBytes() {
    java.lang.Object ref = invitationLink_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      invitationLink_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, resourceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(invitationLink_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, invitationLink_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, resourceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(invitationLink_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, invitationLink_);
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
    if (!(obj instanceof com.google.ads.googleads.v14.services.CreateCustomerClientResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.services.CreateCustomerClientResponse other = (com.google.ads.googleads.v14.services.CreateCustomerClientResponse) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (!getInvitationLink()
        .equals(other.getInvitationLink())) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    hash = (37 * hash) + INVITATION_LINK_FIELD_NUMBER;
    hash = (53 * hash) + getInvitationLink().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v14.services.CreateCustomerClientResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.services.CreateCustomerClientResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.CreateCustomerClientResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.services.CreateCustomerClientResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.CreateCustomerClientResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.services.CreateCustomerClientResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.CreateCustomerClientResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.services.CreateCustomerClientResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.services.CreateCustomerClientResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.services.CreateCustomerClientResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.CreateCustomerClientResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.services.CreateCustomerClientResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.services.CreateCustomerClientResponse prototype) {
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
   * Response message for CreateCustomerClient mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.services.CreateCustomerClientResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.services.CreateCustomerClientResponse)
      com.google.ads.googleads.v14.services.CreateCustomerClientResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.services.CustomerServiceProto.internal_static_google_ads_googleads_v14_services_CreateCustomerClientResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.services.CustomerServiceProto.internal_static_google_ads_googleads_v14_services_CreateCustomerClientResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.services.CreateCustomerClientResponse.class, com.google.ads.googleads.v14.services.CreateCustomerClientResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.services.CreateCustomerClientResponse.newBuilder()
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
      resourceName_ = "";
      invitationLink_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v14.services.CustomerServiceProto.internal_static_google_ads_googleads_v14_services_CreateCustomerClientResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.services.CreateCustomerClientResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.services.CreateCustomerClientResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.services.CreateCustomerClientResponse build() {
      com.google.ads.googleads.v14.services.CreateCustomerClientResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.services.CreateCustomerClientResponse buildPartial() {
      com.google.ads.googleads.v14.services.CreateCustomerClientResponse result = new com.google.ads.googleads.v14.services.CreateCustomerClientResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v14.services.CreateCustomerClientResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceName_ = resourceName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.invitationLink_ = invitationLink_;
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
      if (other instanceof com.google.ads.googleads.v14.services.CreateCustomerClientResponse) {
        return mergeFrom((com.google.ads.googleads.v14.services.CreateCustomerClientResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.services.CreateCustomerClientResponse other) {
      if (other == com.google.ads.googleads.v14.services.CreateCustomerClientResponse.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getInvitationLink().isEmpty()) {
        invitationLink_ = other.invitationLink_;
        bitField0_ |= 0x00000002;
        onChanged();
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
            case 18: {
              resourceName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 18
            case 26: {
              invitationLink_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 26
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

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * The resource name of the newly created customer. Customer resource names
     * have the form: `customers/{customer_id}`.
     * </pre>
     *
     * <code>string resource_name = 2 [(.google.api.resource_reference) = { ... }</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the newly created customer. Customer resource names
     * have the form: `customers/{customer_id}`.
     * </pre>
     *
     * <code>string resource_name = 2 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of the newly created customer. Customer resource names
     * have the form: `customers/{customer_id}`.
     * </pre>
     *
     * <code>string resource_name = 2 [(.google.api.resource_reference) = { ... }</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      resourceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the newly created customer. Customer resource names
     * have the form: `customers/{customer_id}`.
     * </pre>
     *
     * <code>string resource_name = 2 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      resourceName_ = getDefaultInstance().getResourceName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of the newly created customer. Customer resource names
     * have the form: `customers/{customer_id}`.
     * </pre>
     *
     * <code>string resource_name = 2 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      resourceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object invitationLink_ = "";
    /**
     * <pre>
     * Link for inviting user to access the created customer. Accessible to
     * allowlisted customers only.
     * </pre>
     *
     * <code>string invitation_link = 3;</code>
     * @return The invitationLink.
     */
    public java.lang.String getInvitationLink() {
      java.lang.Object ref = invitationLink_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        invitationLink_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Link for inviting user to access the created customer. Accessible to
     * allowlisted customers only.
     * </pre>
     *
     * <code>string invitation_link = 3;</code>
     * @return The bytes for invitationLink.
     */
    public com.google.protobuf.ByteString
        getInvitationLinkBytes() {
      java.lang.Object ref = invitationLink_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        invitationLink_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Link for inviting user to access the created customer. Accessible to
     * allowlisted customers only.
     * </pre>
     *
     * <code>string invitation_link = 3;</code>
     * @param value The invitationLink to set.
     * @return This builder for chaining.
     */
    public Builder setInvitationLink(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      invitationLink_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Link for inviting user to access the created customer. Accessible to
     * allowlisted customers only.
     * </pre>
     *
     * <code>string invitation_link = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearInvitationLink() {
      invitationLink_ = getDefaultInstance().getInvitationLink();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Link for inviting user to access the created customer. Accessible to
     * allowlisted customers only.
     * </pre>
     *
     * <code>string invitation_link = 3;</code>
     * @param value The bytes for invitationLink to set.
     * @return This builder for chaining.
     */
    public Builder setInvitationLinkBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      invitationLink_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.services.CreateCustomerClientResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.services.CreateCustomerClientResponse)
  private static final com.google.ads.googleads.v14.services.CreateCustomerClientResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.services.CreateCustomerClientResponse();
  }

  public static com.google.ads.googleads.v14.services.CreateCustomerClientResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCustomerClientResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateCustomerClientResponse>() {
    @java.lang.Override
    public CreateCustomerClientResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateCustomerClientResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCustomerClientResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.services.CreateCustomerClientResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


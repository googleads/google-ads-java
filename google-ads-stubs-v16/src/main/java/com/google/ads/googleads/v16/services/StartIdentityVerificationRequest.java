// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/identity_verification_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.services;

/**
 * <pre>
 * Request message for
 *  [IdentityVerificationService.StartIdentityVerification].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.services.StartIdentityVerificationRequest}
 */
public final class StartIdentityVerificationRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.services.StartIdentityVerificationRequest)
    StartIdentityVerificationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StartIdentityVerificationRequest.newBuilder() to construct.
  private StartIdentityVerificationRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StartIdentityVerificationRequest() {
    customerId_ = "";
    verificationProgram_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StartIdentityVerificationRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.services.IdentityVerificationServiceProto.internal_static_google_ads_googleads_v16_services_StartIdentityVerificationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.services.IdentityVerificationServiceProto.internal_static_google_ads_googleads_v16_services_StartIdentityVerificationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.services.StartIdentityVerificationRequest.class, com.google.ads.googleads.v16.services.StartIdentityVerificationRequest.Builder.class);
  }

  public static final int CUSTOMER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object customerId_ = "";
  /**
   * <pre>
   * Required. The Id of the customer for whom we are creating this
   * verification.
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
   * Required. The Id of the customer for whom we are creating this
   * verification.
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

  public static final int VERIFICATION_PROGRAM_FIELD_NUMBER = 2;
  private int verificationProgram_ = 0;
  /**
   * <pre>
   * Required. The verification program type for which we want to start the
   * verification.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram verification_program = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for verificationProgram.
   */
  @java.lang.Override public int getVerificationProgramValue() {
    return verificationProgram_;
  }
  /**
   * <pre>
   * Required. The verification program type for which we want to start the
   * verification.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram verification_program = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The verificationProgram.
   */
  @java.lang.Override public com.google.ads.googleads.v16.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram getVerificationProgram() {
    com.google.ads.googleads.v16.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram result = com.google.ads.googleads.v16.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram.forNumber(verificationProgram_);
    return result == null ? com.google.ads.googleads.v16.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram.UNRECOGNIZED : result;
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
    if (verificationProgram_ != com.google.ads.googleads.v16.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, verificationProgram_);
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
    if (verificationProgram_ != com.google.ads.googleads.v16.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, verificationProgram_);
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
    if (!(obj instanceof com.google.ads.googleads.v16.services.StartIdentityVerificationRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.services.StartIdentityVerificationRequest other = (com.google.ads.googleads.v16.services.StartIdentityVerificationRequest) obj;

    if (!getCustomerId()
        .equals(other.getCustomerId())) return false;
    if (verificationProgram_ != other.verificationProgram_) return false;
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
    hash = (37 * hash) + VERIFICATION_PROGRAM_FIELD_NUMBER;
    hash = (53 * hash) + verificationProgram_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.services.StartIdentityVerificationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.services.StartIdentityVerificationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.StartIdentityVerificationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.services.StartIdentityVerificationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.StartIdentityVerificationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.services.StartIdentityVerificationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.StartIdentityVerificationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.services.StartIdentityVerificationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.services.StartIdentityVerificationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.services.StartIdentityVerificationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.StartIdentityVerificationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.services.StartIdentityVerificationRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.services.StartIdentityVerificationRequest prototype) {
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
   *  [IdentityVerificationService.StartIdentityVerification].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.services.StartIdentityVerificationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.services.StartIdentityVerificationRequest)
      com.google.ads.googleads.v16.services.StartIdentityVerificationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.services.IdentityVerificationServiceProto.internal_static_google_ads_googleads_v16_services_StartIdentityVerificationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.services.IdentityVerificationServiceProto.internal_static_google_ads_googleads_v16_services_StartIdentityVerificationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.services.StartIdentityVerificationRequest.class, com.google.ads.googleads.v16.services.StartIdentityVerificationRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.services.StartIdentityVerificationRequest.newBuilder()
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
      verificationProgram_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.services.IdentityVerificationServiceProto.internal_static_google_ads_googleads_v16_services_StartIdentityVerificationRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.services.StartIdentityVerificationRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.services.StartIdentityVerificationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.services.StartIdentityVerificationRequest build() {
      com.google.ads.googleads.v16.services.StartIdentityVerificationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.services.StartIdentityVerificationRequest buildPartial() {
      com.google.ads.googleads.v16.services.StartIdentityVerificationRequest result = new com.google.ads.googleads.v16.services.StartIdentityVerificationRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v16.services.StartIdentityVerificationRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.customerId_ = customerId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.verificationProgram_ = verificationProgram_;
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
      if (other instanceof com.google.ads.googleads.v16.services.StartIdentityVerificationRequest) {
        return mergeFrom((com.google.ads.googleads.v16.services.StartIdentityVerificationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.services.StartIdentityVerificationRequest other) {
      if (other == com.google.ads.googleads.v16.services.StartIdentityVerificationRequest.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.verificationProgram_ != 0) {
        setVerificationProgramValue(other.getVerificationProgramValue());
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
            case 16: {
              verificationProgram_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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
     * Required. The Id of the customer for whom we are creating this
     * verification.
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
     * Required. The Id of the customer for whom we are creating this
     * verification.
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
     * Required. The Id of the customer for whom we are creating this
     * verification.
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
     * Required. The Id of the customer for whom we are creating this
     * verification.
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
     * Required. The Id of the customer for whom we are creating this
     * verification.
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

    private int verificationProgram_ = 0;
    /**
     * <pre>
     * Required. The verification program type for which we want to start the
     * verification.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram verification_program = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The enum numeric value on the wire for verificationProgram.
     */
    @java.lang.Override public int getVerificationProgramValue() {
      return verificationProgram_;
    }
    /**
     * <pre>
     * Required. The verification program type for which we want to start the
     * verification.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram verification_program = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The enum numeric value on the wire for verificationProgram to set.
     * @return This builder for chaining.
     */
    public Builder setVerificationProgramValue(int value) {
      verificationProgram_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The verification program type for which we want to start the
     * verification.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram verification_program = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The verificationProgram.
     */
    @java.lang.Override
    public com.google.ads.googleads.v16.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram getVerificationProgram() {
      com.google.ads.googleads.v16.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram result = com.google.ads.googleads.v16.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram.forNumber(verificationProgram_);
      return result == null ? com.google.ads.googleads.v16.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Required. The verification program type for which we want to start the
     * verification.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram verification_program = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The verificationProgram to set.
     * @return This builder for chaining.
     */
    public Builder setVerificationProgram(com.google.ads.googleads.v16.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      verificationProgram_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The verification program type for which we want to start the
     * verification.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.IdentityVerificationProgramEnum.IdentityVerificationProgram verification_program = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearVerificationProgram() {
      bitField0_ = (bitField0_ & ~0x00000002);
      verificationProgram_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.services.StartIdentityVerificationRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.services.StartIdentityVerificationRequest)
  private static final com.google.ads.googleads.v16.services.StartIdentityVerificationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.services.StartIdentityVerificationRequest();
  }

  public static com.google.ads.googleads.v16.services.StartIdentityVerificationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StartIdentityVerificationRequest>
      PARSER = new com.google.protobuf.AbstractParser<StartIdentityVerificationRequest>() {
    @java.lang.Override
    public StartIdentityVerificationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<StartIdentityVerificationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StartIdentityVerificationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.services.StartIdentityVerificationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


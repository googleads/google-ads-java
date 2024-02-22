// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/batch_job_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.services;

/**
 * <pre>
 * Request message for
 * [BatchJobService.MutateBatchJob][google.ads.googleads.v14.services.BatchJobService.MutateBatchJob].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.services.MutateBatchJobRequest}
 */
public final class MutateBatchJobRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.services.MutateBatchJobRequest)
    MutateBatchJobRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateBatchJobRequest.newBuilder() to construct.
  private MutateBatchJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateBatchJobRequest() {
    customerId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateBatchJobRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.services.BatchJobServiceProto.internal_static_google_ads_googleads_v14_services_MutateBatchJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.services.BatchJobServiceProto.internal_static_google_ads_googleads_v14_services_MutateBatchJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.services.MutateBatchJobRequest.class, com.google.ads.googleads.v14.services.MutateBatchJobRequest.Builder.class);
  }

  private int bitField0_;
  public static final int CUSTOMER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object customerId_ = "";
  /**
   * <pre>
   * Required. The ID of the customer for which to create a batch job.
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
   * Required. The ID of the customer for which to create a batch job.
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

  public static final int OPERATION_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v14.services.BatchJobOperation operation_;
  /**
   * <pre>
   * Required. The operation to perform on an individual batch job.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.BatchJobOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the operation field is set.
   */
  @java.lang.Override
  public boolean hasOperation() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Required. The operation to perform on an individual batch job.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.BatchJobOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The operation.
   */
  @java.lang.Override
  public com.google.ads.googleads.v14.services.BatchJobOperation getOperation() {
    return operation_ == null ? com.google.ads.googleads.v14.services.BatchJobOperation.getDefaultInstance() : operation_;
  }
  /**
   * <pre>
   * Required. The operation to perform on an individual batch job.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.services.BatchJobOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v14.services.BatchJobOperationOrBuilder getOperationOrBuilder() {
    return operation_ == null ? com.google.ads.googleads.v14.services.BatchJobOperation.getDefaultInstance() : operation_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getOperation());
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getOperation());
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
    if (!(obj instanceof com.google.ads.googleads.v14.services.MutateBatchJobRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.services.MutateBatchJobRequest other = (com.google.ads.googleads.v14.services.MutateBatchJobRequest) obj;

    if (!getCustomerId()
        .equals(other.getCustomerId())) return false;
    if (hasOperation() != other.hasOperation()) return false;
    if (hasOperation()) {
      if (!getOperation()
          .equals(other.getOperation())) return false;
    }
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
    if (hasOperation()) {
      hash = (37 * hash) + OPERATION_FIELD_NUMBER;
      hash = (53 * hash) + getOperation().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v14.services.MutateBatchJobRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.services.MutateBatchJobRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.MutateBatchJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.services.MutateBatchJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.MutateBatchJobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.services.MutateBatchJobRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.MutateBatchJobRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.services.MutateBatchJobRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.services.MutateBatchJobRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.services.MutateBatchJobRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.MutateBatchJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.services.MutateBatchJobRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.services.MutateBatchJobRequest prototype) {
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
   * [BatchJobService.MutateBatchJob][google.ads.googleads.v14.services.BatchJobService.MutateBatchJob].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.services.MutateBatchJobRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.services.MutateBatchJobRequest)
      com.google.ads.googleads.v14.services.MutateBatchJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.services.BatchJobServiceProto.internal_static_google_ads_googleads_v14_services_MutateBatchJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.services.BatchJobServiceProto.internal_static_google_ads_googleads_v14_services_MutateBatchJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.services.MutateBatchJobRequest.class, com.google.ads.googleads.v14.services.MutateBatchJobRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.services.MutateBatchJobRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getOperationFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      customerId_ = "";
      operation_ = null;
      if (operationBuilder_ != null) {
        operationBuilder_.dispose();
        operationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v14.services.BatchJobServiceProto.internal_static_google_ads_googleads_v14_services_MutateBatchJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.services.MutateBatchJobRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.services.MutateBatchJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.services.MutateBatchJobRequest build() {
      com.google.ads.googleads.v14.services.MutateBatchJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.services.MutateBatchJobRequest buildPartial() {
      com.google.ads.googleads.v14.services.MutateBatchJobRequest result = new com.google.ads.googleads.v14.services.MutateBatchJobRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v14.services.MutateBatchJobRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.customerId_ = customerId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.operation_ = operationBuilder_ == null
            ? operation_
            : operationBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.ads.googleads.v14.services.MutateBatchJobRequest) {
        return mergeFrom((com.google.ads.googleads.v14.services.MutateBatchJobRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.services.MutateBatchJobRequest other) {
      if (other == com.google.ads.googleads.v14.services.MutateBatchJobRequest.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasOperation()) {
        mergeOperation(other.getOperation());
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
              input.readMessage(
                  getOperationFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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
     * Required. The ID of the customer for which to create a batch job.
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
     * Required. The ID of the customer for which to create a batch job.
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
     * Required. The ID of the customer for which to create a batch job.
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
     * Required. The ID of the customer for which to create a batch job.
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
     * Required. The ID of the customer for which to create a batch job.
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

    private com.google.ads.googleads.v14.services.BatchJobOperation operation_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v14.services.BatchJobOperation, com.google.ads.googleads.v14.services.BatchJobOperation.Builder, com.google.ads.googleads.v14.services.BatchJobOperationOrBuilder> operationBuilder_;
    /**
     * <pre>
     * Required. The operation to perform on an individual batch job.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.BatchJobOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return Whether the operation field is set.
     */
    public boolean hasOperation() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Required. The operation to perform on an individual batch job.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.BatchJobOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The operation.
     */
    public com.google.ads.googleads.v14.services.BatchJobOperation getOperation() {
      if (operationBuilder_ == null) {
        return operation_ == null ? com.google.ads.googleads.v14.services.BatchJobOperation.getDefaultInstance() : operation_;
      } else {
        return operationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Required. The operation to perform on an individual batch job.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.BatchJobOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setOperation(com.google.ads.googleads.v14.services.BatchJobOperation value) {
      if (operationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        operation_ = value;
      } else {
        operationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The operation to perform on an individual batch job.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.BatchJobOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setOperation(
        com.google.ads.googleads.v14.services.BatchJobOperation.Builder builderForValue) {
      if (operationBuilder_ == null) {
        operation_ = builderForValue.build();
      } else {
        operationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The operation to perform on an individual batch job.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.BatchJobOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeOperation(com.google.ads.googleads.v14.services.BatchJobOperation value) {
      if (operationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          operation_ != null &&
          operation_ != com.google.ads.googleads.v14.services.BatchJobOperation.getDefaultInstance()) {
          getOperationBuilder().mergeFrom(value);
        } else {
          operation_ = value;
        }
      } else {
        operationBuilder_.mergeFrom(value);
      }
      if (operation_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Required. The operation to perform on an individual batch job.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.BatchJobOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearOperation() {
      bitField0_ = (bitField0_ & ~0x00000002);
      operation_ = null;
      if (operationBuilder_ != null) {
        operationBuilder_.dispose();
        operationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The operation to perform on an individual batch job.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.BatchJobOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v14.services.BatchJobOperation.Builder getOperationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getOperationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Required. The operation to perform on an individual batch job.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.BatchJobOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v14.services.BatchJobOperationOrBuilder getOperationOrBuilder() {
      if (operationBuilder_ != null) {
        return operationBuilder_.getMessageOrBuilder();
      } else {
        return operation_ == null ?
            com.google.ads.googleads.v14.services.BatchJobOperation.getDefaultInstance() : operation_;
      }
    }
    /**
     * <pre>
     * Required. The operation to perform on an individual batch job.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.services.BatchJobOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v14.services.BatchJobOperation, com.google.ads.googleads.v14.services.BatchJobOperation.Builder, com.google.ads.googleads.v14.services.BatchJobOperationOrBuilder> 
        getOperationFieldBuilder() {
      if (operationBuilder_ == null) {
        operationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v14.services.BatchJobOperation, com.google.ads.googleads.v14.services.BatchJobOperation.Builder, com.google.ads.googleads.v14.services.BatchJobOperationOrBuilder>(
                getOperation(),
                getParentForChildren(),
                isClean());
        operation_ = null;
      }
      return operationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.services.MutateBatchJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.services.MutateBatchJobRequest)
  private static final com.google.ads.googleads.v14.services.MutateBatchJobRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.services.MutateBatchJobRequest();
  }

  public static com.google.ads.googleads.v14.services.MutateBatchJobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateBatchJobRequest>
      PARSER = new com.google.protobuf.AbstractParser<MutateBatchJobRequest>() {
    @java.lang.Override
    public MutateBatchJobRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<MutateBatchJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateBatchJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.services.MutateBatchJobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


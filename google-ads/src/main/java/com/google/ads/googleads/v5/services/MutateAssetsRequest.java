// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/services/asset_service.proto

package com.google.ads.googleads.v5.services;

/**
 * <pre>
 * Request message for [AssetService.MutateAssets][google.ads.googleads.v5.services.AssetService.MutateAssets]
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v5.services.MutateAssetsRequest}
 */
public final class MutateAssetsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v5.services.MutateAssetsRequest)
    MutateAssetsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateAssetsRequest.newBuilder() to construct.
  private MutateAssetsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateAssetsRequest() {
    customerId_ = "";
    operations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateAssetsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateAssetsRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            customerId_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              operations_ = new java.util.ArrayList<com.google.ads.googleads.v5.services.AssetOperation>();
              mutable_bitField0_ |= 0x00000001;
            }
            operations_.add(
                input.readMessage(com.google.ads.googleads.v5.services.AssetOperation.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        operations_ = java.util.Collections.unmodifiableList(operations_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v5.services.AssetServiceProto.internal_static_google_ads_googleads_v5_services_MutateAssetsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v5.services.AssetServiceProto.internal_static_google_ads_googleads_v5_services_MutateAssetsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v5.services.MutateAssetsRequest.class, com.google.ads.googleads.v5.services.MutateAssetsRequest.Builder.class);
  }

  public static final int CUSTOMER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object customerId_;
  /**
   * <pre>
   * Required. The ID of the customer whose assets are being modified.
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
   * Required. The ID of the customer whose assets are being modified.
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

  public static final int OPERATIONS_FIELD_NUMBER = 2;
  private java.util.List<com.google.ads.googleads.v5.services.AssetOperation> operations_;
  /**
   * <pre>
   * Required. The list of operations to perform on individual assets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v5.services.AssetOperation> getOperationsList() {
    return operations_;
  }
  /**
   * <pre>
   * Required. The list of operations to perform on individual assets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v5.services.AssetOperationOrBuilder> 
      getOperationsOrBuilderList() {
    return operations_;
  }
  /**
   * <pre>
   * Required. The list of operations to perform on individual assets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public int getOperationsCount() {
    return operations_.size();
  }
  /**
   * <pre>
   * Required. The list of operations to perform on individual assets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v5.services.AssetOperation getOperations(int index) {
    return operations_.get(index);
  }
  /**
   * <pre>
   * Required. The list of operations to perform on individual assets.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v5.services.AssetOperationOrBuilder getOperationsOrBuilder(
      int index) {
    return operations_.get(index);
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
    if (!getCustomerIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customerId_);
    }
    for (int i = 0; i < operations_.size(); i++) {
      output.writeMessage(2, operations_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getCustomerIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customerId_);
    }
    for (int i = 0; i < operations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, operations_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v5.services.MutateAssetsRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v5.services.MutateAssetsRequest other = (com.google.ads.googleads.v5.services.MutateAssetsRequest) obj;

    if (!getCustomerId()
        .equals(other.getCustomerId())) return false;
    if (!getOperationsList()
        .equals(other.getOperationsList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
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
    if (getOperationsCount() > 0) {
      hash = (37 * hash) + OPERATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getOperationsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v5.services.MutateAssetsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v5.services.MutateAssetsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v5.services.MutateAssetsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v5.services.MutateAssetsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v5.services.MutateAssetsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v5.services.MutateAssetsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v5.services.MutateAssetsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v5.services.MutateAssetsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v5.services.MutateAssetsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v5.services.MutateAssetsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v5.services.MutateAssetsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v5.services.MutateAssetsRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v5.services.MutateAssetsRequest prototype) {
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
   * Request message for [AssetService.MutateAssets][google.ads.googleads.v5.services.AssetService.MutateAssets]
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v5.services.MutateAssetsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v5.services.MutateAssetsRequest)
      com.google.ads.googleads.v5.services.MutateAssetsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v5.services.AssetServiceProto.internal_static_google_ads_googleads_v5_services_MutateAssetsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v5.services.AssetServiceProto.internal_static_google_ads_googleads_v5_services_MutateAssetsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v5.services.MutateAssetsRequest.class, com.google.ads.googleads.v5.services.MutateAssetsRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v5.services.MutateAssetsRequest.newBuilder()
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
        getOperationsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      customerId_ = "";

      if (operationsBuilder_ == null) {
        operations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        operationsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v5.services.AssetServiceProto.internal_static_google_ads_googleads_v5_services_MutateAssetsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v5.services.MutateAssetsRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v5.services.MutateAssetsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v5.services.MutateAssetsRequest build() {
      com.google.ads.googleads.v5.services.MutateAssetsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v5.services.MutateAssetsRequest buildPartial() {
      com.google.ads.googleads.v5.services.MutateAssetsRequest result = new com.google.ads.googleads.v5.services.MutateAssetsRequest(this);
      int from_bitField0_ = bitField0_;
      result.customerId_ = customerId_;
      if (operationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          operations_ = java.util.Collections.unmodifiableList(operations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.operations_ = operations_;
      } else {
        result.operations_ = operationsBuilder_.build();
      }
      onBuilt();
      return result;
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
      if (other instanceof com.google.ads.googleads.v5.services.MutateAssetsRequest) {
        return mergeFrom((com.google.ads.googleads.v5.services.MutateAssetsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v5.services.MutateAssetsRequest other) {
      if (other == com.google.ads.googleads.v5.services.MutateAssetsRequest.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        onChanged();
      }
      if (operationsBuilder_ == null) {
        if (!other.operations_.isEmpty()) {
          if (operations_.isEmpty()) {
            operations_ = other.operations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOperationsIsMutable();
            operations_.addAll(other.operations_);
          }
          onChanged();
        }
      } else {
        if (!other.operations_.isEmpty()) {
          if (operationsBuilder_.isEmpty()) {
            operationsBuilder_.dispose();
            operationsBuilder_ = null;
            operations_ = other.operations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            operationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOperationsFieldBuilder() : null;
          } else {
            operationsBuilder_.addAllMessages(other.operations_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.ads.googleads.v5.services.MutateAssetsRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v5.services.MutateAssetsRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object customerId_ = "";
    /**
     * <pre>
     * Required. The ID of the customer whose assets are being modified.
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
     * Required. The ID of the customer whose assets are being modified.
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
     * Required. The ID of the customer whose assets are being modified.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      customerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the customer whose assets are being modified.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomerId() {
      
      customerId_ = getDefaultInstance().getCustomerId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the customer whose assets are being modified.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      customerId_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.ads.googleads.v5.services.AssetOperation> operations_ =
      java.util.Collections.emptyList();
    private void ensureOperationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        operations_ = new java.util.ArrayList<com.google.ads.googleads.v5.services.AssetOperation>(operations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v5.services.AssetOperation, com.google.ads.googleads.v5.services.AssetOperation.Builder, com.google.ads.googleads.v5.services.AssetOperationOrBuilder> operationsBuilder_;

    /**
     * <pre>
     * Required. The list of operations to perform on individual assets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.ads.googleads.v5.services.AssetOperation> getOperationsList() {
      if (operationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(operations_);
      } else {
        return operationsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Required. The list of operations to perform on individual assets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public int getOperationsCount() {
      if (operationsBuilder_ == null) {
        return operations_.size();
      } else {
        return operationsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Required. The list of operations to perform on individual assets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v5.services.AssetOperation getOperations(int index) {
      if (operationsBuilder_ == null) {
        return operations_.get(index);
      } else {
        return operationsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Required. The list of operations to perform on individual assets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setOperations(
        int index, com.google.ads.googleads.v5.services.AssetOperation value) {
      if (operationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.set(index, value);
        onChanged();
      } else {
        operationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of operations to perform on individual assets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setOperations(
        int index, com.google.ads.googleads.v5.services.AssetOperation.Builder builderForValue) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.set(index, builderForValue.build());
        onChanged();
      } else {
        operationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of operations to perform on individual assets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addOperations(com.google.ads.googleads.v5.services.AssetOperation value) {
      if (operationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.add(value);
        onChanged();
      } else {
        operationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of operations to perform on individual assets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addOperations(
        int index, com.google.ads.googleads.v5.services.AssetOperation value) {
      if (operationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOperationsIsMutable();
        operations_.add(index, value);
        onChanged();
      } else {
        operationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of operations to perform on individual assets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addOperations(
        com.google.ads.googleads.v5.services.AssetOperation.Builder builderForValue) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.add(builderForValue.build());
        onChanged();
      } else {
        operationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of operations to perform on individual assets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addOperations(
        int index, com.google.ads.googleads.v5.services.AssetOperation.Builder builderForValue) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.add(index, builderForValue.build());
        onChanged();
      } else {
        operationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of operations to perform on individual assets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAllOperations(
        java.lang.Iterable<? extends com.google.ads.googleads.v5.services.AssetOperation> values) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, operations_);
        onChanged();
      } else {
        operationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of operations to perform on individual assets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearOperations() {
      if (operationsBuilder_ == null) {
        operations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        operationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of operations to perform on individual assets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder removeOperations(int index) {
      if (operationsBuilder_ == null) {
        ensureOperationsIsMutable();
        operations_.remove(index);
        onChanged();
      } else {
        operationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of operations to perform on individual assets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v5.services.AssetOperation.Builder getOperationsBuilder(
        int index) {
      return getOperationsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Required. The list of operations to perform on individual assets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v5.services.AssetOperationOrBuilder getOperationsOrBuilder(
        int index) {
      if (operationsBuilder_ == null) {
        return operations_.get(index);  } else {
        return operationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Required. The list of operations to perform on individual assets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v5.services.AssetOperationOrBuilder> 
         getOperationsOrBuilderList() {
      if (operationsBuilder_ != null) {
        return operationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(operations_);
      }
    }
    /**
     * <pre>
     * Required. The list of operations to perform on individual assets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v5.services.AssetOperation.Builder addOperationsBuilder() {
      return getOperationsFieldBuilder().addBuilder(
          com.google.ads.googleads.v5.services.AssetOperation.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. The list of operations to perform on individual assets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v5.services.AssetOperation.Builder addOperationsBuilder(
        int index) {
      return getOperationsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v5.services.AssetOperation.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. The list of operations to perform on individual assets.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v5.services.AssetOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.ads.googleads.v5.services.AssetOperation.Builder> 
         getOperationsBuilderList() {
      return getOperationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v5.services.AssetOperation, com.google.ads.googleads.v5.services.AssetOperation.Builder, com.google.ads.googleads.v5.services.AssetOperationOrBuilder> 
        getOperationsFieldBuilder() {
      if (operationsBuilder_ == null) {
        operationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v5.services.AssetOperation, com.google.ads.googleads.v5.services.AssetOperation.Builder, com.google.ads.googleads.v5.services.AssetOperationOrBuilder>(
                operations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        operations_ = null;
      }
      return operationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v5.services.MutateAssetsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v5.services.MutateAssetsRequest)
  private static final com.google.ads.googleads.v5.services.MutateAssetsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v5.services.MutateAssetsRequest();
  }

  public static com.google.ads.googleads.v5.services.MutateAssetsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateAssetsRequest>
      PARSER = new com.google.protobuf.AbstractParser<MutateAssetsRequest>() {
    @java.lang.Override
    public MutateAssetsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateAssetsRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateAssetsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateAssetsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v5.services.MutateAssetsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


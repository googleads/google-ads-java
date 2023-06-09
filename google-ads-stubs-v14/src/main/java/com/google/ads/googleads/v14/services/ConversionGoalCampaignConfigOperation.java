// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/conversion_goal_campaign_config_service.proto

package com.google.ads.googleads.v14.services;

/**
 * <pre>
 * A single operation (update) on a conversion goal campaign config.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation}
 */
public final class ConversionGoalCampaignConfigOperation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation)
    ConversionGoalCampaignConfigOperationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConversionGoalCampaignConfigOperation.newBuilder() to construct.
  private ConversionGoalCampaignConfigOperation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConversionGoalCampaignConfigOperation() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConversionGoalCampaignConfigOperation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigServiceProto.internal_static_google_ads_googleads_v14_services_ConversionGoalCampaignConfigOperation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigServiceProto.internal_static_google_ads_googleads_v14_services_ConversionGoalCampaignConfigOperation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation.class, com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation.Builder.class);
  }

  private int operationCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object operation_;
  public enum OperationCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    UPDATE(1),
    OPERATION_NOT_SET(0);
    private final int value;
    private OperationCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OperationCase valueOf(int value) {
      return forNumber(value);
    }

    public static OperationCase forNumber(int value) {
      switch (value) {
        case 1: return UPDATE;
        case 0: return OPERATION_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public OperationCase
  getOperationCase() {
    return OperationCase.forNumber(
        operationCase_);
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int UPDATE_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Update operation: The conversion goal campaign config is expected to have
   * a valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig update = 1;</code>
   * @return Whether the update field is set.
   */
  @java.lang.Override
  public boolean hasUpdate() {
    return operationCase_ == 1;
  }
  /**
   * <pre>
   * Update operation: The conversion goal campaign config is expected to have
   * a valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig update = 1;</code>
   * @return The update.
   */
  @java.lang.Override
  public com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig getUpdate() {
    if (operationCase_ == 1) {
       return (com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig) operation_;
    }
    return com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig.getDefaultInstance();
  }
  /**
   * <pre>
   * Update operation: The conversion goal campaign config is expected to have
   * a valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig update = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfigOrBuilder getUpdateOrBuilder() {
    if (operationCase_ == 1) {
       return (com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig) operation_;
    }
    return com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig.getDefaultInstance();
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
    if (operationCase_ == 1) {
      output.writeMessage(1, (com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig) operation_);
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operationCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig) operation_);
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation other = (com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (!getOperationCase().equals(other.getOperationCase())) return false;
    switch (operationCase_) {
      case 1:
        if (!getUpdate()
            .equals(other.getUpdate())) return false;
        break;
      case 0:
      default:
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
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    switch (operationCase_) {
      case 1:
        hash = (37 * hash) + UPDATE_FIELD_NUMBER;
        hash = (53 * hash) + getUpdate().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation prototype) {
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
   * A single operation (update) on a conversion goal campaign config.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation)
      com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigServiceProto.internal_static_google_ads_googleads_v14_services_ConversionGoalCampaignConfigOperation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigServiceProto.internal_static_google_ads_googleads_v14_services_ConversionGoalCampaignConfigOperation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation.class, com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation.newBuilder()
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
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      if (updateBuilder_ != null) {
        updateBuilder_.clear();
      }
      operationCase_ = 0;
      operation_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigServiceProto.internal_static_google_ads_googleads_v14_services_ConversionGoalCampaignConfigOperation_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation build() {
      com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation buildPartial() {
      com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation result = new com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
      }
    }

    private void buildPartialOneofs(com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation result) {
      result.operationCase_ = operationCase_;
      result.operation_ = this.operation_;
      if (operationCase_ == 1 &&
          updateBuilder_ != null) {
        result.operation_ = updateBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation) {
        return mergeFrom((com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation other) {
      if (other == com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation.getDefaultInstance()) return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      switch (other.getOperationCase()) {
        case UPDATE: {
          mergeUpdate(other.getUpdate());
          break;
        }
        case OPERATION_NOT_SET: {
          break;
        }
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
              input.readMessage(
                  getUpdateFieldBuilder().getBuilder(),
                  extensionRegistry);
              operationCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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
    private int operationCase_ = 0;
    private java.lang.Object operation_;
    public OperationCase
        getOperationCase() {
      return OperationCase.forNumber(
          operationCase_);
    }

    public Builder clearOperation() {
      operationCase_ = 0;
      operation_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000001);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig, com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig.Builder, com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfigOrBuilder> updateBuilder_;
    /**
     * <pre>
     * Update operation: The conversion goal campaign config is expected to have
     * a valid resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig update = 1;</code>
     * @return Whether the update field is set.
     */
    @java.lang.Override
    public boolean hasUpdate() {
      return operationCase_ == 1;
    }
    /**
     * <pre>
     * Update operation: The conversion goal campaign config is expected to have
     * a valid resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig update = 1;</code>
     * @return The update.
     */
    @java.lang.Override
    public com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig getUpdate() {
      if (updateBuilder_ == null) {
        if (operationCase_ == 1) {
          return (com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig) operation_;
        }
        return com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig.getDefaultInstance();
      } else {
        if (operationCase_ == 1) {
          return updateBuilder_.getMessage();
        }
        return com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Update operation: The conversion goal campaign config is expected to have
     * a valid resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig update = 1;</code>
     */
    public Builder setUpdate(com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig value) {
      if (updateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        operation_ = value;
        onChanged();
      } else {
        updateBuilder_.setMessage(value);
      }
      operationCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Update operation: The conversion goal campaign config is expected to have
     * a valid resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig update = 1;</code>
     */
    public Builder setUpdate(
        com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig.Builder builderForValue) {
      if (updateBuilder_ == null) {
        operation_ = builderForValue.build();
        onChanged();
      } else {
        updateBuilder_.setMessage(builderForValue.build());
      }
      operationCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Update operation: The conversion goal campaign config is expected to have
     * a valid resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig update = 1;</code>
     */
    public Builder mergeUpdate(com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig value) {
      if (updateBuilder_ == null) {
        if (operationCase_ == 1 &&
            operation_ != com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig.getDefaultInstance()) {
          operation_ = com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig.newBuilder((com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig) operation_)
              .mergeFrom(value).buildPartial();
        } else {
          operation_ = value;
        }
        onChanged();
      } else {
        if (operationCase_ == 1) {
          updateBuilder_.mergeFrom(value);
        } else {
          updateBuilder_.setMessage(value);
        }
      }
      operationCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * Update operation: The conversion goal campaign config is expected to have
     * a valid resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig update = 1;</code>
     */
    public Builder clearUpdate() {
      if (updateBuilder_ == null) {
        if (operationCase_ == 1) {
          operationCase_ = 0;
          operation_ = null;
          onChanged();
        }
      } else {
        if (operationCase_ == 1) {
          operationCase_ = 0;
          operation_ = null;
        }
        updateBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Update operation: The conversion goal campaign config is expected to have
     * a valid resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig update = 1;</code>
     */
    public com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig.Builder getUpdateBuilder() {
      return getUpdateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Update operation: The conversion goal campaign config is expected to have
     * a valid resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig update = 1;</code>
     */
    @java.lang.Override
    public com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfigOrBuilder getUpdateOrBuilder() {
      if ((operationCase_ == 1) && (updateBuilder_ != null)) {
        return updateBuilder_.getMessageOrBuilder();
      } else {
        if (operationCase_ == 1) {
          return (com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig) operation_;
        }
        return com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Update operation: The conversion goal campaign config is expected to have
     * a valid resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig update = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig, com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig.Builder, com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfigOrBuilder> 
        getUpdateFieldBuilder() {
      if (updateBuilder_ == null) {
        if (!(operationCase_ == 1)) {
          operation_ = com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig.getDefaultInstance();
        }
        updateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig, com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig.Builder, com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfigOrBuilder>(
                (com.google.ads.googleads.v14.resources.ConversionGoalCampaignConfig) operation_,
                getParentForChildren(),
                isClean());
        operation_ = null;
      }
      operationCase_ = 1;
      onChanged();
      return updateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation)
  private static final com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation();
  }

  public static com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConversionGoalCampaignConfigOperation>
      PARSER = new com.google.protobuf.AbstractParser<ConversionGoalCampaignConfigOperation>() {
    @java.lang.Override
    public ConversionGoalCampaignConfigOperation parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConversionGoalCampaignConfigOperation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConversionGoalCampaignConfigOperation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.services.ConversionGoalCampaignConfigOperation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


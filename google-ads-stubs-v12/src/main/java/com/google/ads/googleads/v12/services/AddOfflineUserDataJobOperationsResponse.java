// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/offline_user_data_job_service.proto

package com.google.ads.googleads.v12.services;

/**
 * <pre>
 * Response message for
 * [OfflineUserDataJobService.AddOfflineUserDataJobOperations][google.ads.googleads.v12.services.OfflineUserDataJobService.AddOfflineUserDataJobOperations].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse}
 */
public final class AddOfflineUserDataJobOperationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse)
    AddOfflineUserDataJobOperationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddOfflineUserDataJobOperationsResponse.newBuilder() to construct.
  private AddOfflineUserDataJobOperationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddOfflineUserDataJobOperationsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddOfflineUserDataJobOperationsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.services.OfflineUserDataJobServiceProto.internal_static_google_ads_googleads_v12_services_AddOfflineUserDataJobOperationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.services.OfflineUserDataJobServiceProto.internal_static_google_ads_googleads_v12_services_AddOfflineUserDataJobOperationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse.class, com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse.Builder.class);
  }

  public static final int PARTIAL_FAILURE_ERROR_FIELD_NUMBER = 1;
  private com.google.rpc.Status partialFailureError_;
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors), we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 1;</code>
   * @return Whether the partialFailureError field is set.
   */
  @java.lang.Override
  public boolean hasPartialFailureError() {
    return partialFailureError_ != null;
  }
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors), we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 1;</code>
   * @return The partialFailureError.
   */
  @java.lang.Override
  public com.google.rpc.Status getPartialFailureError() {
    return partialFailureError_ == null ? com.google.rpc.Status.getDefaultInstance() : partialFailureError_;
  }
  /**
   * <pre>
   * Errors that pertain to operation failures in the partial failure mode.
   * Returned only when partial_failure = true and all errors occur inside the
   * operations. If any errors occur outside the operations (for example, auth
   * errors), we return an RPC level error.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 1;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getPartialFailureErrorOrBuilder() {
    return partialFailureError_ == null ? com.google.rpc.Status.getDefaultInstance() : partialFailureError_;
  }

  public static final int WARNING_FIELD_NUMBER = 2;
  private com.google.rpc.Status warning_;
  /**
   * <pre>
   * Non blocking errors that pertain to operation failures in the warnings
   * mode. Returned only when enable_warnings = true.
   * </pre>
   *
   * <code>.google.rpc.Status warning = 2;</code>
   * @return Whether the warning field is set.
   */
  @java.lang.Override
  public boolean hasWarning() {
    return warning_ != null;
  }
  /**
   * <pre>
   * Non blocking errors that pertain to operation failures in the warnings
   * mode. Returned only when enable_warnings = true.
   * </pre>
   *
   * <code>.google.rpc.Status warning = 2;</code>
   * @return The warning.
   */
  @java.lang.Override
  public com.google.rpc.Status getWarning() {
    return warning_ == null ? com.google.rpc.Status.getDefaultInstance() : warning_;
  }
  /**
   * <pre>
   * Non blocking errors that pertain to operation failures in the warnings
   * mode. Returned only when enable_warnings = true.
   * </pre>
   *
   * <code>.google.rpc.Status warning = 2;</code>
   */
  @java.lang.Override
  public com.google.rpc.StatusOrBuilder getWarningOrBuilder() {
    return warning_ == null ? com.google.rpc.Status.getDefaultInstance() : warning_;
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
    if (partialFailureError_ != null) {
      output.writeMessage(1, getPartialFailureError());
    }
    if (warning_ != null) {
      output.writeMessage(2, getWarning());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (partialFailureError_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getPartialFailureError());
    }
    if (warning_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getWarning());
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
    if (!(obj instanceof com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse other = (com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse) obj;

    if (hasPartialFailureError() != other.hasPartialFailureError()) return false;
    if (hasPartialFailureError()) {
      if (!getPartialFailureError()
          .equals(other.getPartialFailureError())) return false;
    }
    if (hasWarning() != other.hasWarning()) return false;
    if (hasWarning()) {
      if (!getWarning()
          .equals(other.getWarning())) return false;
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
    if (hasPartialFailureError()) {
      hash = (37 * hash) + PARTIAL_FAILURE_ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getPartialFailureError().hashCode();
    }
    if (hasWarning()) {
      hash = (37 * hash) + WARNING_FIELD_NUMBER;
      hash = (53 * hash) + getWarning().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse prototype) {
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
   * Response message for
   * [OfflineUserDataJobService.AddOfflineUserDataJobOperations][google.ads.googleads.v12.services.OfflineUserDataJobService.AddOfflineUserDataJobOperations].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse)
      com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.services.OfflineUserDataJobServiceProto.internal_static_google_ads_googleads_v12_services_AddOfflineUserDataJobOperationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.services.OfflineUserDataJobServiceProto.internal_static_google_ads_googleads_v12_services_AddOfflineUserDataJobOperationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse.class, com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse.newBuilder()
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
      partialFailureError_ = null;
      if (partialFailureErrorBuilder_ != null) {
        partialFailureErrorBuilder_.dispose();
        partialFailureErrorBuilder_ = null;
      }
      warning_ = null;
      if (warningBuilder_ != null) {
        warningBuilder_.dispose();
        warningBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.services.OfflineUserDataJobServiceProto.internal_static_google_ads_googleads_v12_services_AddOfflineUserDataJobOperationsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse build() {
      com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse buildPartial() {
      com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse result = new com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.partialFailureError_ = partialFailureErrorBuilder_ == null
            ? partialFailureError_
            : partialFailureErrorBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.warning_ = warningBuilder_ == null
            ? warning_
            : warningBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse) {
        return mergeFrom((com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse other) {
      if (other == com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse.getDefaultInstance()) return this;
      if (other.hasPartialFailureError()) {
        mergePartialFailureError(other.getPartialFailureError());
      }
      if (other.hasWarning()) {
        mergeWarning(other.getWarning());
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
                  getPartialFailureErrorFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getWarningFieldBuilder().getBuilder(),
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

    private com.google.rpc.Status partialFailureError_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> partialFailureErrorBuilder_;
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (for example, auth
     * errors), we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 1;</code>
     * @return Whether the partialFailureError field is set.
     */
    public boolean hasPartialFailureError() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (for example, auth
     * errors), we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 1;</code>
     * @return The partialFailureError.
     */
    public com.google.rpc.Status getPartialFailureError() {
      if (partialFailureErrorBuilder_ == null) {
        return partialFailureError_ == null ? com.google.rpc.Status.getDefaultInstance() : partialFailureError_;
      } else {
        return partialFailureErrorBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (for example, auth
     * errors), we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 1;</code>
     */
    public Builder setPartialFailureError(com.google.rpc.Status value) {
      if (partialFailureErrorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        partialFailureError_ = value;
      } else {
        partialFailureErrorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (for example, auth
     * errors), we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 1;</code>
     */
    public Builder setPartialFailureError(
        com.google.rpc.Status.Builder builderForValue) {
      if (partialFailureErrorBuilder_ == null) {
        partialFailureError_ = builderForValue.build();
      } else {
        partialFailureErrorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (for example, auth
     * errors), we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 1;</code>
     */
    public Builder mergePartialFailureError(com.google.rpc.Status value) {
      if (partialFailureErrorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          partialFailureError_ != null &&
          partialFailureError_ != com.google.rpc.Status.getDefaultInstance()) {
          getPartialFailureErrorBuilder().mergeFrom(value);
        } else {
          partialFailureError_ = value;
        }
      } else {
        partialFailureErrorBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (for example, auth
     * errors), we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 1;</code>
     */
    public Builder clearPartialFailureError() {
      bitField0_ = (bitField0_ & ~0x00000001);
      partialFailureError_ = null;
      if (partialFailureErrorBuilder_ != null) {
        partialFailureErrorBuilder_.dispose();
        partialFailureErrorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (for example, auth
     * errors), we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 1;</code>
     */
    public com.google.rpc.Status.Builder getPartialFailureErrorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPartialFailureErrorFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (for example, auth
     * errors), we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 1;</code>
     */
    public com.google.rpc.StatusOrBuilder getPartialFailureErrorOrBuilder() {
      if (partialFailureErrorBuilder_ != null) {
        return partialFailureErrorBuilder_.getMessageOrBuilder();
      } else {
        return partialFailureError_ == null ?
            com.google.rpc.Status.getDefaultInstance() : partialFailureError_;
      }
    }
    /**
     * <pre>
     * Errors that pertain to operation failures in the partial failure mode.
     * Returned only when partial_failure = true and all errors occur inside the
     * operations. If any errors occur outside the operations (for example, auth
     * errors), we return an RPC level error.
     * </pre>
     *
     * <code>.google.rpc.Status partial_failure_error = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> 
        getPartialFailureErrorFieldBuilder() {
      if (partialFailureErrorBuilder_ == null) {
        partialFailureErrorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>(
                getPartialFailureError(),
                getParentForChildren(),
                isClean());
        partialFailureError_ = null;
      }
      return partialFailureErrorBuilder_;
    }

    private com.google.rpc.Status warning_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> warningBuilder_;
    /**
     * <pre>
     * Non blocking errors that pertain to operation failures in the warnings
     * mode. Returned only when enable_warnings = true.
     * </pre>
     *
     * <code>.google.rpc.Status warning = 2;</code>
     * @return Whether the warning field is set.
     */
    public boolean hasWarning() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Non blocking errors that pertain to operation failures in the warnings
     * mode. Returned only when enable_warnings = true.
     * </pre>
     *
     * <code>.google.rpc.Status warning = 2;</code>
     * @return The warning.
     */
    public com.google.rpc.Status getWarning() {
      if (warningBuilder_ == null) {
        return warning_ == null ? com.google.rpc.Status.getDefaultInstance() : warning_;
      } else {
        return warningBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Non blocking errors that pertain to operation failures in the warnings
     * mode. Returned only when enable_warnings = true.
     * </pre>
     *
     * <code>.google.rpc.Status warning = 2;</code>
     */
    public Builder setWarning(com.google.rpc.Status value) {
      if (warningBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        warning_ = value;
      } else {
        warningBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Non blocking errors that pertain to operation failures in the warnings
     * mode. Returned only when enable_warnings = true.
     * </pre>
     *
     * <code>.google.rpc.Status warning = 2;</code>
     */
    public Builder setWarning(
        com.google.rpc.Status.Builder builderForValue) {
      if (warningBuilder_ == null) {
        warning_ = builderForValue.build();
      } else {
        warningBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Non blocking errors that pertain to operation failures in the warnings
     * mode. Returned only when enable_warnings = true.
     * </pre>
     *
     * <code>.google.rpc.Status warning = 2;</code>
     */
    public Builder mergeWarning(com.google.rpc.Status value) {
      if (warningBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          warning_ != null &&
          warning_ != com.google.rpc.Status.getDefaultInstance()) {
          getWarningBuilder().mergeFrom(value);
        } else {
          warning_ = value;
        }
      } else {
        warningBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Non blocking errors that pertain to operation failures in the warnings
     * mode. Returned only when enable_warnings = true.
     * </pre>
     *
     * <code>.google.rpc.Status warning = 2;</code>
     */
    public Builder clearWarning() {
      bitField0_ = (bitField0_ & ~0x00000002);
      warning_ = null;
      if (warningBuilder_ != null) {
        warningBuilder_.dispose();
        warningBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Non blocking errors that pertain to operation failures in the warnings
     * mode. Returned only when enable_warnings = true.
     * </pre>
     *
     * <code>.google.rpc.Status warning = 2;</code>
     */
    public com.google.rpc.Status.Builder getWarningBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getWarningFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Non blocking errors that pertain to operation failures in the warnings
     * mode. Returned only when enable_warnings = true.
     * </pre>
     *
     * <code>.google.rpc.Status warning = 2;</code>
     */
    public com.google.rpc.StatusOrBuilder getWarningOrBuilder() {
      if (warningBuilder_ != null) {
        return warningBuilder_.getMessageOrBuilder();
      } else {
        return warning_ == null ?
            com.google.rpc.Status.getDefaultInstance() : warning_;
      }
    }
    /**
     * <pre>
     * Non blocking errors that pertain to operation failures in the warnings
     * mode. Returned only when enable_warnings = true.
     * </pre>
     *
     * <code>.google.rpc.Status warning = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder> 
        getWarningFieldBuilder() {
      if (warningBuilder_ == null) {
        warningBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.Status, com.google.rpc.Status.Builder, com.google.rpc.StatusOrBuilder>(
                getWarning(),
                getParentForChildren(),
                isClean());
        warning_ = null;
      }
      return warningBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse)
  private static final com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse();
  }

  public static com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddOfflineUserDataJobOperationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<AddOfflineUserDataJobOperationsResponse>() {
    @java.lang.Override
    public AddOfflineUserDataJobOperationsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddOfflineUserDataJobOperationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddOfflineUserDataJobOperationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.services.AddOfflineUserDataJobOperationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


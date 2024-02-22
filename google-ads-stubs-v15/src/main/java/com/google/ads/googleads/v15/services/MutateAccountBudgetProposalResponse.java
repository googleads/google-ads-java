// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/account_budget_proposal_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.services;

/**
 * <pre>
 * Response message for account-level budget mutate operations.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse}
 */
public final class MutateAccountBudgetProposalResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse)
    MutateAccountBudgetProposalResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateAccountBudgetProposalResponse.newBuilder() to construct.
  private MutateAccountBudgetProposalResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateAccountBudgetProposalResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateAccountBudgetProposalResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.services.AccountBudgetProposalServiceProto.internal_static_google_ads_googleads_v15_services_MutateAccountBudgetProposalResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.services.AccountBudgetProposalServiceProto.internal_static_google_ads_googleads_v15_services_MutateAccountBudgetProposalResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse.class, com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse.Builder.class);
  }

  private int bitField0_;
  public static final int RESULT_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult result_;
  /**
   * <pre>
   * The result of the mutate.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult result = 2;</code>
   * @return Whether the result field is set.
   */
  @java.lang.Override
  public boolean hasResult() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The result of the mutate.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult result = 2;</code>
   * @return The result.
   */
  @java.lang.Override
  public com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult getResult() {
    return result_ == null ? com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult.getDefaultInstance() : result_;
  }
  /**
   * <pre>
   * The result of the mutate.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult result = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResultOrBuilder getResultOrBuilder() {
    return result_ == null ? com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult.getDefaultInstance() : result_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getResult());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getResult());
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
    if (!(obj instanceof com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse other = (com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse) obj;

    if (hasResult() != other.hasResult()) return false;
    if (hasResult()) {
      if (!getResult()
          .equals(other.getResult())) return false;
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
    if (hasResult()) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResult().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse prototype) {
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
   * Response message for account-level budget mutate operations.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse)
      com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.services.AccountBudgetProposalServiceProto.internal_static_google_ads_googleads_v15_services_MutateAccountBudgetProposalResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.services.AccountBudgetProposalServiceProto.internal_static_google_ads_googleads_v15_services_MutateAccountBudgetProposalResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse.class, com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse.newBuilder()
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
        getResultFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.services.AccountBudgetProposalServiceProto.internal_static_google_ads_googleads_v15_services_MutateAccountBudgetProposalResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse build() {
      com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse buildPartial() {
      com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse result = new com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.result_ = resultBuilder_ == null
            ? result_
            : resultBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse) {
        return mergeFrom((com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse other) {
      if (other == com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse.getDefaultInstance()) return this;
      if (other.hasResult()) {
        mergeResult(other.getResult());
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
              input.readMessage(
                  getResultFieldBuilder().getBuilder(),
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
    private int bitField0_;

    private com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult result_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult, com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult.Builder, com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResultOrBuilder> resultBuilder_;
    /**
     * <pre>
     * The result of the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult result = 2;</code>
     * @return Whether the result field is set.
     */
    public boolean hasResult() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The result of the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult result = 2;</code>
     * @return The result.
     */
    public com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult getResult() {
      if (resultBuilder_ == null) {
        return result_ == null ? com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult.getDefaultInstance() : result_;
      } else {
        return resultBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The result of the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult result = 2;</code>
     */
    public Builder setResult(com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        result_ = value;
      } else {
        resultBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The result of the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult result = 2;</code>
     */
    public Builder setResult(
        com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult.Builder builderForValue) {
      if (resultBuilder_ == null) {
        result_ = builderForValue.build();
      } else {
        resultBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The result of the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult result = 2;</code>
     */
    public Builder mergeResult(com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult value) {
      if (resultBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          result_ != null &&
          result_ != com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult.getDefaultInstance()) {
          getResultBuilder().mergeFrom(value);
        } else {
          result_ = value;
        }
      } else {
        resultBuilder_.mergeFrom(value);
      }
      if (result_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The result of the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult result = 2;</code>
     */
    public Builder clearResult() {
      bitField0_ = (bitField0_ & ~0x00000001);
      result_ = null;
      if (resultBuilder_ != null) {
        resultBuilder_.dispose();
        resultBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The result of the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult result = 2;</code>
     */
    public com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult.Builder getResultBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getResultFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The result of the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult result = 2;</code>
     */
    public com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResultOrBuilder getResultOrBuilder() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilder();
      } else {
        return result_ == null ?
            com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult.getDefaultInstance() : result_;
      }
    }
    /**
     * <pre>
     * The result of the mutate.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult result = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult, com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult.Builder, com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResultOrBuilder> 
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult, com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResult.Builder, com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResultOrBuilder>(
                getResult(),
                getParentForChildren(),
                isClean());
        result_ = null;
      }
      return resultBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse)
  private static final com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse();
  }

  public static com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateAccountBudgetProposalResponse>
      PARSER = new com.google.protobuf.AbstractParser<MutateAccountBudgetProposalResponse>() {
    @java.lang.Override
    public MutateAccountBudgetProposalResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MutateAccountBudgetProposalResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateAccountBudgetProposalResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.services.MutateAccountBudgetProposalResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


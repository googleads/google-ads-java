// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/bidding.proto

package com.google.ads.googleads.v2.common;

/**
 * <pre>
 * Manual click-based bidding where user pays per click.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.common.ManualCpc}
 */
public final class ManualCpc extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.common.ManualCpc)
    ManualCpcOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ManualCpc.newBuilder() to construct.
  private ManualCpc(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ManualCpc() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ManualCpc();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ManualCpc(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            com.google.protobuf.BoolValue.Builder subBuilder = null;
            if (enhancedCpcEnabled_ != null) {
              subBuilder = enhancedCpcEnabled_.toBuilder();
            }
            enhancedCpcEnabled_ = input.readMessage(com.google.protobuf.BoolValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(enhancedCpcEnabled_);
              enhancedCpcEnabled_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v2.common.BiddingProto.internal_static_google_ads_googleads_v2_common_ManualCpc_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.common.BiddingProto.internal_static_google_ads_googleads_v2_common_ManualCpc_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.common.ManualCpc.class, com.google.ads.googleads.v2.common.ManualCpc.Builder.class);
  }

  public static final int ENHANCED_CPC_ENABLED_FIELD_NUMBER = 1;
  private com.google.protobuf.BoolValue enhancedCpcEnabled_;
  /**
   * <pre>
   * Whether bids are to be enhanced based on conversion optimizer data.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enhanced_cpc_enabled = 1;</code>
   * @return Whether the enhancedCpcEnabled field is set.
   */
  @java.lang.Override
  public boolean hasEnhancedCpcEnabled() {
    return enhancedCpcEnabled_ != null;
  }
  /**
   * <pre>
   * Whether bids are to be enhanced based on conversion optimizer data.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enhanced_cpc_enabled = 1;</code>
   * @return The enhancedCpcEnabled.
   */
  @java.lang.Override
  public com.google.protobuf.BoolValue getEnhancedCpcEnabled() {
    return enhancedCpcEnabled_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : enhancedCpcEnabled_;
  }
  /**
   * <pre>
   * Whether bids are to be enhanced based on conversion optimizer data.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue enhanced_cpc_enabled = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.BoolValueOrBuilder getEnhancedCpcEnabledOrBuilder() {
    return getEnhancedCpcEnabled();
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
    if (enhancedCpcEnabled_ != null) {
      output.writeMessage(1, getEnhancedCpcEnabled());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enhancedCpcEnabled_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEnhancedCpcEnabled());
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
    if (!(obj instanceof com.google.ads.googleads.v2.common.ManualCpc)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.common.ManualCpc other = (com.google.ads.googleads.v2.common.ManualCpc) obj;

    if (hasEnhancedCpcEnabled() != other.hasEnhancedCpcEnabled()) return false;
    if (hasEnhancedCpcEnabled()) {
      if (!getEnhancedCpcEnabled()
          .equals(other.getEnhancedCpcEnabled())) return false;
    }
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
    if (hasEnhancedCpcEnabled()) {
      hash = (37 * hash) + ENHANCED_CPC_ENABLED_FIELD_NUMBER;
      hash = (53 * hash) + getEnhancedCpcEnabled().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.common.ManualCpc parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.ManualCpc parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.ManualCpc parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.ManualCpc parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.ManualCpc parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.ManualCpc parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.ManualCpc parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.ManualCpc parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.ManualCpc parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.ManualCpc parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.ManualCpc parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.ManualCpc parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.common.ManualCpc prototype) {
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
   * Manual click-based bidding where user pays per click.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.common.ManualCpc}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.common.ManualCpc)
      com.google.ads.googleads.v2.common.ManualCpcOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.common.BiddingProto.internal_static_google_ads_googleads_v2_common_ManualCpc_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.common.BiddingProto.internal_static_google_ads_googleads_v2_common_ManualCpc_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.common.ManualCpc.class, com.google.ads.googleads.v2.common.ManualCpc.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.common.ManualCpc.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (enhancedCpcEnabledBuilder_ == null) {
        enhancedCpcEnabled_ = null;
      } else {
        enhancedCpcEnabled_ = null;
        enhancedCpcEnabledBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.common.BiddingProto.internal_static_google_ads_googleads_v2_common_ManualCpc_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.ManualCpc getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.common.ManualCpc.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.ManualCpc build() {
      com.google.ads.googleads.v2.common.ManualCpc result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.ManualCpc buildPartial() {
      com.google.ads.googleads.v2.common.ManualCpc result = new com.google.ads.googleads.v2.common.ManualCpc(this);
      if (enhancedCpcEnabledBuilder_ == null) {
        result.enhancedCpcEnabled_ = enhancedCpcEnabled_;
      } else {
        result.enhancedCpcEnabled_ = enhancedCpcEnabledBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v2.common.ManualCpc) {
        return mergeFrom((com.google.ads.googleads.v2.common.ManualCpc)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.common.ManualCpc other) {
      if (other == com.google.ads.googleads.v2.common.ManualCpc.getDefaultInstance()) return this;
      if (other.hasEnhancedCpcEnabled()) {
        mergeEnhancedCpcEnabled(other.getEnhancedCpcEnabled());
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
      com.google.ads.googleads.v2.common.ManualCpc parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.common.ManualCpc) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.BoolValue enhancedCpcEnabled_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> enhancedCpcEnabledBuilder_;
    /**
     * <pre>
     * Whether bids are to be enhanced based on conversion optimizer data.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enhanced_cpc_enabled = 1;</code>
     * @return Whether the enhancedCpcEnabled field is set.
     */
    public boolean hasEnhancedCpcEnabled() {
      return enhancedCpcEnabledBuilder_ != null || enhancedCpcEnabled_ != null;
    }
    /**
     * <pre>
     * Whether bids are to be enhanced based on conversion optimizer data.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enhanced_cpc_enabled = 1;</code>
     * @return The enhancedCpcEnabled.
     */
    public com.google.protobuf.BoolValue getEnhancedCpcEnabled() {
      if (enhancedCpcEnabledBuilder_ == null) {
        return enhancedCpcEnabled_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : enhancedCpcEnabled_;
      } else {
        return enhancedCpcEnabledBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Whether bids are to be enhanced based on conversion optimizer data.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enhanced_cpc_enabled = 1;</code>
     */
    public Builder setEnhancedCpcEnabled(com.google.protobuf.BoolValue value) {
      if (enhancedCpcEnabledBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        enhancedCpcEnabled_ = value;
        onChanged();
      } else {
        enhancedCpcEnabledBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Whether bids are to be enhanced based on conversion optimizer data.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enhanced_cpc_enabled = 1;</code>
     */
    public Builder setEnhancedCpcEnabled(
        com.google.protobuf.BoolValue.Builder builderForValue) {
      if (enhancedCpcEnabledBuilder_ == null) {
        enhancedCpcEnabled_ = builderForValue.build();
        onChanged();
      } else {
        enhancedCpcEnabledBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Whether bids are to be enhanced based on conversion optimizer data.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enhanced_cpc_enabled = 1;</code>
     */
    public Builder mergeEnhancedCpcEnabled(com.google.protobuf.BoolValue value) {
      if (enhancedCpcEnabledBuilder_ == null) {
        if (enhancedCpcEnabled_ != null) {
          enhancedCpcEnabled_ =
            com.google.protobuf.BoolValue.newBuilder(enhancedCpcEnabled_).mergeFrom(value).buildPartial();
        } else {
          enhancedCpcEnabled_ = value;
        }
        onChanged();
      } else {
        enhancedCpcEnabledBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Whether bids are to be enhanced based on conversion optimizer data.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enhanced_cpc_enabled = 1;</code>
     */
    public Builder clearEnhancedCpcEnabled() {
      if (enhancedCpcEnabledBuilder_ == null) {
        enhancedCpcEnabled_ = null;
        onChanged();
      } else {
        enhancedCpcEnabled_ = null;
        enhancedCpcEnabledBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Whether bids are to be enhanced based on conversion optimizer data.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enhanced_cpc_enabled = 1;</code>
     */
    public com.google.protobuf.BoolValue.Builder getEnhancedCpcEnabledBuilder() {
      
      onChanged();
      return getEnhancedCpcEnabledFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Whether bids are to be enhanced based on conversion optimizer data.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enhanced_cpc_enabled = 1;</code>
     */
    public com.google.protobuf.BoolValueOrBuilder getEnhancedCpcEnabledOrBuilder() {
      if (enhancedCpcEnabledBuilder_ != null) {
        return enhancedCpcEnabledBuilder_.getMessageOrBuilder();
      } else {
        return enhancedCpcEnabled_ == null ?
            com.google.protobuf.BoolValue.getDefaultInstance() : enhancedCpcEnabled_;
      }
    }
    /**
     * <pre>
     * Whether bids are to be enhanced based on conversion optimizer data.
     * </pre>
     *
     * <code>.google.protobuf.BoolValue enhanced_cpc_enabled = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder> 
        getEnhancedCpcEnabledFieldBuilder() {
      if (enhancedCpcEnabledBuilder_ == null) {
        enhancedCpcEnabledBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BoolValue, com.google.protobuf.BoolValue.Builder, com.google.protobuf.BoolValueOrBuilder>(
                getEnhancedCpcEnabled(),
                getParentForChildren(),
                isClean());
        enhancedCpcEnabled_ = null;
      }
      return enhancedCpcEnabledBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.common.ManualCpc)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.common.ManualCpc)
  private static final com.google.ads.googleads.v2.common.ManualCpc DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.common.ManualCpc();
  }

  public static com.google.ads.googleads.v2.common.ManualCpc getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ManualCpc>
      PARSER = new com.google.protobuf.AbstractParser<ManualCpc>() {
    @java.lang.Override
    public ManualCpc parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ManualCpc(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ManualCpc> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ManualCpc> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.common.ManualCpc getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


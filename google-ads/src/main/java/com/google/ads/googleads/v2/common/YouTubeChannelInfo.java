// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/criteria.proto

package com.google.ads.googleads.v2.common;

/**
 * <pre>
 * A YouTube Channel criterion.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.common.YouTubeChannelInfo}
 */
public final class YouTubeChannelInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.common.YouTubeChannelInfo)
    YouTubeChannelInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use YouTubeChannelInfo.newBuilder() to construct.
  private YouTubeChannelInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private YouTubeChannelInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new YouTubeChannelInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private YouTubeChannelInfo(
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
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (channelId_ != null) {
              subBuilder = channelId_.toBuilder();
            }
            channelId_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(channelId_);
              channelId_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_YouTubeChannelInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_YouTubeChannelInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.common.YouTubeChannelInfo.class, com.google.ads.googleads.v2.common.YouTubeChannelInfo.Builder.class);
  }

  public static final int CHANNEL_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue channelId_;
  /**
   * <pre>
   * The YouTube uploader channel id or the channel code of a YouTube channel.
   * </pre>
   *
   * <code>.google.protobuf.StringValue channel_id = 1;</code>
   * @return Whether the channelId field is set.
   */
  @java.lang.Override
  public boolean hasChannelId() {
    return channelId_ != null;
  }
  /**
   * <pre>
   * The YouTube uploader channel id or the channel code of a YouTube channel.
   * </pre>
   *
   * <code>.google.protobuf.StringValue channel_id = 1;</code>
   * @return The channelId.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getChannelId() {
    return channelId_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : channelId_;
  }
  /**
   * <pre>
   * The YouTube uploader channel id or the channel code of a YouTube channel.
   * </pre>
   *
   * <code>.google.protobuf.StringValue channel_id = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getChannelIdOrBuilder() {
    return getChannelId();
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
    if (channelId_ != null) {
      output.writeMessage(1, getChannelId());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (channelId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getChannelId());
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
    if (!(obj instanceof com.google.ads.googleads.v2.common.YouTubeChannelInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.common.YouTubeChannelInfo other = (com.google.ads.googleads.v2.common.YouTubeChannelInfo) obj;

    if (hasChannelId() != other.hasChannelId()) return false;
    if (hasChannelId()) {
      if (!getChannelId()
          .equals(other.getChannelId())) return false;
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
    if (hasChannelId()) {
      hash = (37 * hash) + CHANNEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChannelId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.common.YouTubeChannelInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.YouTubeChannelInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.YouTubeChannelInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.YouTubeChannelInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.YouTubeChannelInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.YouTubeChannelInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.YouTubeChannelInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.YouTubeChannelInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.YouTubeChannelInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.YouTubeChannelInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.YouTubeChannelInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.YouTubeChannelInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.common.YouTubeChannelInfo prototype) {
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
   * A YouTube Channel criterion.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.common.YouTubeChannelInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.common.YouTubeChannelInfo)
      com.google.ads.googleads.v2.common.YouTubeChannelInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_YouTubeChannelInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_YouTubeChannelInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.common.YouTubeChannelInfo.class, com.google.ads.googleads.v2.common.YouTubeChannelInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.common.YouTubeChannelInfo.newBuilder()
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
      if (channelIdBuilder_ == null) {
        channelId_ = null;
      } else {
        channelId_ = null;
        channelIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_YouTubeChannelInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.YouTubeChannelInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.common.YouTubeChannelInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.YouTubeChannelInfo build() {
      com.google.ads.googleads.v2.common.YouTubeChannelInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.YouTubeChannelInfo buildPartial() {
      com.google.ads.googleads.v2.common.YouTubeChannelInfo result = new com.google.ads.googleads.v2.common.YouTubeChannelInfo(this);
      if (channelIdBuilder_ == null) {
        result.channelId_ = channelId_;
      } else {
        result.channelId_ = channelIdBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v2.common.YouTubeChannelInfo) {
        return mergeFrom((com.google.ads.googleads.v2.common.YouTubeChannelInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.common.YouTubeChannelInfo other) {
      if (other == com.google.ads.googleads.v2.common.YouTubeChannelInfo.getDefaultInstance()) return this;
      if (other.hasChannelId()) {
        mergeChannelId(other.getChannelId());
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
      com.google.ads.googleads.v2.common.YouTubeChannelInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.common.YouTubeChannelInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue channelId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> channelIdBuilder_;
    /**
     * <pre>
     * The YouTube uploader channel id or the channel code of a YouTube channel.
     * </pre>
     *
     * <code>.google.protobuf.StringValue channel_id = 1;</code>
     * @return Whether the channelId field is set.
     */
    public boolean hasChannelId() {
      return channelIdBuilder_ != null || channelId_ != null;
    }
    /**
     * <pre>
     * The YouTube uploader channel id or the channel code of a YouTube channel.
     * </pre>
     *
     * <code>.google.protobuf.StringValue channel_id = 1;</code>
     * @return The channelId.
     */
    public com.google.protobuf.StringValue getChannelId() {
      if (channelIdBuilder_ == null) {
        return channelId_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : channelId_;
      } else {
        return channelIdBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The YouTube uploader channel id or the channel code of a YouTube channel.
     * </pre>
     *
     * <code>.google.protobuf.StringValue channel_id = 1;</code>
     */
    public Builder setChannelId(com.google.protobuf.StringValue value) {
      if (channelIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        channelId_ = value;
        onChanged();
      } else {
        channelIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The YouTube uploader channel id or the channel code of a YouTube channel.
     * </pre>
     *
     * <code>.google.protobuf.StringValue channel_id = 1;</code>
     */
    public Builder setChannelId(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (channelIdBuilder_ == null) {
        channelId_ = builderForValue.build();
        onChanged();
      } else {
        channelIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The YouTube uploader channel id or the channel code of a YouTube channel.
     * </pre>
     *
     * <code>.google.protobuf.StringValue channel_id = 1;</code>
     */
    public Builder mergeChannelId(com.google.protobuf.StringValue value) {
      if (channelIdBuilder_ == null) {
        if (channelId_ != null) {
          channelId_ =
            com.google.protobuf.StringValue.newBuilder(channelId_).mergeFrom(value).buildPartial();
        } else {
          channelId_ = value;
        }
        onChanged();
      } else {
        channelIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The YouTube uploader channel id or the channel code of a YouTube channel.
     * </pre>
     *
     * <code>.google.protobuf.StringValue channel_id = 1;</code>
     */
    public Builder clearChannelId() {
      if (channelIdBuilder_ == null) {
        channelId_ = null;
        onChanged();
      } else {
        channelId_ = null;
        channelIdBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The YouTube uploader channel id or the channel code of a YouTube channel.
     * </pre>
     *
     * <code>.google.protobuf.StringValue channel_id = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getChannelIdBuilder() {
      
      onChanged();
      return getChannelIdFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The YouTube uploader channel id or the channel code of a YouTube channel.
     * </pre>
     *
     * <code>.google.protobuf.StringValue channel_id = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getChannelIdOrBuilder() {
      if (channelIdBuilder_ != null) {
        return channelIdBuilder_.getMessageOrBuilder();
      } else {
        return channelId_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : channelId_;
      }
    }
    /**
     * <pre>
     * The YouTube uploader channel id or the channel code of a YouTube channel.
     * </pre>
     *
     * <code>.google.protobuf.StringValue channel_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getChannelIdFieldBuilder() {
      if (channelIdBuilder_ == null) {
        channelIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getChannelId(),
                getParentForChildren(),
                isClean());
        channelId_ = null;
      }
      return channelIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.common.YouTubeChannelInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.common.YouTubeChannelInfo)
  private static final com.google.ads.googleads.v2.common.YouTubeChannelInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.common.YouTubeChannelInfo();
  }

  public static com.google.ads.googleads.v2.common.YouTubeChannelInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<YouTubeChannelInfo>
      PARSER = new com.google.protobuf.AbstractParser<YouTubeChannelInfo>() {
    @java.lang.Override
    public YouTubeChannelInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new YouTubeChannelInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<YouTubeChannelInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<YouTubeChannelInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.common.YouTubeChannelInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


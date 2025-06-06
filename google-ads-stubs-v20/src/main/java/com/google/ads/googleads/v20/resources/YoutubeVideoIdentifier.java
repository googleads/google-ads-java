// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/resources/data_link.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.resources;

/**
 * <pre>
 * The identifier for YouTube video
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v20.resources.YoutubeVideoIdentifier}
 */
public final class YoutubeVideoIdentifier extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v20.resources.YoutubeVideoIdentifier)
    YoutubeVideoIdentifierOrBuilder {
private static final long serialVersionUID = 0L;
  // Use YoutubeVideoIdentifier.newBuilder() to construct.
  private YoutubeVideoIdentifier(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private YoutubeVideoIdentifier() {
    channelId_ = "";
    videoId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new YoutubeVideoIdentifier();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v20.resources.DataLinkProto.internal_static_google_ads_googleads_v20_resources_YoutubeVideoIdentifier_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v20.resources.DataLinkProto.internal_static_google_ads_googleads_v20_resources_YoutubeVideoIdentifier_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier.class, com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier.Builder.class);
  }

  private int bitField0_;
  public static final int CHANNEL_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object channelId_ = "";
  /**
   * <pre>
   * Immutable. The ID of the hosting channel of the video. This is a string
   * value with “UC” prefix. For example, "UCK8sQmJBp8GCxrOtXWBpyEA".
   * </pre>
   *
   * <code>optional string channel_id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the channelId field is set.
   */
  @java.lang.Override
  public boolean hasChannelId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Immutable. The ID of the hosting channel of the video. This is a string
   * value with “UC” prefix. For example, "UCK8sQmJBp8GCxrOtXWBpyEA".
   * </pre>
   *
   * <code>optional string channel_id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The channelId.
   */
  @java.lang.Override
  public java.lang.String getChannelId() {
    java.lang.Object ref = channelId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      channelId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Immutable. The ID of the hosting channel of the video. This is a string
   * value with “UC” prefix. For example, "UCK8sQmJBp8GCxrOtXWBpyEA".
   * </pre>
   *
   * <code>optional string channel_id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for channelId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChannelIdBytes() {
    java.lang.Object ref = channelId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      channelId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VIDEO_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object videoId_ = "";
  /**
   * <pre>
   * Immutable. The ID of the video associated with the video link. This is the
   * 11 character string value used in the YouTube video URL. For example, video
   * ID is jV1vkHv4zq8 from the YouTube video URL
   * "https://www.youtube.com/watch?v=jV1vkHv4zq8&amp;t=2s".
   * </pre>
   *
   * <code>optional string video_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the videoId field is set.
   */
  @java.lang.Override
  public boolean hasVideoId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Immutable. The ID of the video associated with the video link. This is the
   * 11 character string value used in the YouTube video URL. For example, video
   * ID is jV1vkHv4zq8 from the YouTube video URL
   * "https://www.youtube.com/watch?v=jV1vkHv4zq8&amp;t=2s".
   * </pre>
   *
   * <code>optional string video_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The videoId.
   */
  @java.lang.Override
  public java.lang.String getVideoId() {
    java.lang.Object ref = videoId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      videoId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Immutable. The ID of the video associated with the video link. This is the
   * 11 character string value used in the YouTube video URL. For example, video
   * ID is jV1vkHv4zq8 from the YouTube video URL
   * "https://www.youtube.com/watch?v=jV1vkHv4zq8&amp;t=2s".
   * </pre>
   *
   * <code>optional string video_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for videoId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVideoIdBytes() {
    java.lang.Object ref = videoId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      videoId_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, channelId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, videoId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, channelId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, videoId_);
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
    if (!(obj instanceof com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier other = (com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier) obj;

    if (hasChannelId() != other.hasChannelId()) return false;
    if (hasChannelId()) {
      if (!getChannelId()
          .equals(other.getChannelId())) return false;
    }
    if (hasVideoId() != other.hasVideoId()) return false;
    if (hasVideoId()) {
      if (!getVideoId()
          .equals(other.getVideoId())) return false;
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
    if (hasChannelId()) {
      hash = (37 * hash) + CHANNEL_ID_FIELD_NUMBER;
      hash = (53 * hash) + getChannelId().hashCode();
    }
    if (hasVideoId()) {
      hash = (37 * hash) + VIDEO_ID_FIELD_NUMBER;
      hash = (53 * hash) + getVideoId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier prototype) {
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
   * The identifier for YouTube video
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v20.resources.YoutubeVideoIdentifier}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v20.resources.YoutubeVideoIdentifier)
      com.google.ads.googleads.v20.resources.YoutubeVideoIdentifierOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v20.resources.DataLinkProto.internal_static_google_ads_googleads_v20_resources_YoutubeVideoIdentifier_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v20.resources.DataLinkProto.internal_static_google_ads_googleads_v20_resources_YoutubeVideoIdentifier_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier.class, com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier.Builder.class);
    }

    // Construct using com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier.newBuilder()
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
      channelId_ = "";
      videoId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v20.resources.DataLinkProto.internal_static_google_ads_googleads_v20_resources_YoutubeVideoIdentifier_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier getDefaultInstanceForType() {
      return com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier build() {
      com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier buildPartial() {
      com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier result = new com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.channelId_ = channelId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.videoId_ = videoId_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier) {
        return mergeFrom((com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier other) {
      if (other == com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier.getDefaultInstance()) return this;
      if (other.hasChannelId()) {
        channelId_ = other.channelId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasVideoId()) {
        videoId_ = other.videoId_;
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
            case 10: {
              channelId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              videoId_ = input.readStringRequireUtf8();
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

    private java.lang.Object channelId_ = "";
    /**
     * <pre>
     * Immutable. The ID of the hosting channel of the video. This is a string
     * value with “UC” prefix. For example, "UCK8sQmJBp8GCxrOtXWBpyEA".
     * </pre>
     *
     * <code>optional string channel_id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return Whether the channelId field is set.
     */
    public boolean hasChannelId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Immutable. The ID of the hosting channel of the video. This is a string
     * value with “UC” prefix. For example, "UCK8sQmJBp8GCxrOtXWBpyEA".
     * </pre>
     *
     * <code>optional string channel_id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The channelId.
     */
    public java.lang.String getChannelId() {
      java.lang.Object ref = channelId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        channelId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The ID of the hosting channel of the video. This is a string
     * value with “UC” prefix. For example, "UCK8sQmJBp8GCxrOtXWBpyEA".
     * </pre>
     *
     * <code>optional string channel_id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The bytes for channelId.
     */
    public com.google.protobuf.ByteString
        getChannelIdBytes() {
      java.lang.Object ref = channelId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        channelId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The ID of the hosting channel of the video. This is a string
     * value with “UC” prefix. For example, "UCK8sQmJBp8GCxrOtXWBpyEA".
     * </pre>
     *
     * <code>optional string channel_id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The channelId to set.
     * @return This builder for chaining.
     */
    public Builder setChannelId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      channelId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The ID of the hosting channel of the video. This is a string
     * value with “UC” prefix. For example, "UCK8sQmJBp8GCxrOtXWBpyEA".
     * </pre>
     *
     * <code>optional string channel_id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return This builder for chaining.
     */
    public Builder clearChannelId() {
      channelId_ = getDefaultInstance().getChannelId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The ID of the hosting channel of the video. This is a string
     * value with “UC” prefix. For example, "UCK8sQmJBp8GCxrOtXWBpyEA".
     * </pre>
     *
     * <code>optional string channel_id = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The bytes for channelId to set.
     * @return This builder for chaining.
     */
    public Builder setChannelIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      channelId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object videoId_ = "";
    /**
     * <pre>
     * Immutable. The ID of the video associated with the video link. This is the
     * 11 character string value used in the YouTube video URL. For example, video
     * ID is jV1vkHv4zq8 from the YouTube video URL
     * "https://www.youtube.com/watch?v=jV1vkHv4zq8&amp;t=2s".
     * </pre>
     *
     * <code>optional string video_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return Whether the videoId field is set.
     */
    public boolean hasVideoId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Immutable. The ID of the video associated with the video link. This is the
     * 11 character string value used in the YouTube video URL. For example, video
     * ID is jV1vkHv4zq8 from the YouTube video URL
     * "https://www.youtube.com/watch?v=jV1vkHv4zq8&amp;t=2s".
     * </pre>
     *
     * <code>optional string video_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The videoId.
     */
    public java.lang.String getVideoId() {
      java.lang.Object ref = videoId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        videoId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The ID of the video associated with the video link. This is the
     * 11 character string value used in the YouTube video URL. For example, video
     * ID is jV1vkHv4zq8 from the YouTube video URL
     * "https://www.youtube.com/watch?v=jV1vkHv4zq8&amp;t=2s".
     * </pre>
     *
     * <code>optional string video_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The bytes for videoId.
     */
    public com.google.protobuf.ByteString
        getVideoIdBytes() {
      java.lang.Object ref = videoId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        videoId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The ID of the video associated with the video link. This is the
     * 11 character string value used in the YouTube video URL. For example, video
     * ID is jV1vkHv4zq8 from the YouTube video URL
     * "https://www.youtube.com/watch?v=jV1vkHv4zq8&amp;t=2s".
     * </pre>
     *
     * <code>optional string video_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The videoId to set.
     * @return This builder for chaining.
     */
    public Builder setVideoId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      videoId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The ID of the video associated with the video link. This is the
     * 11 character string value used in the YouTube video URL. For example, video
     * ID is jV1vkHv4zq8 from the YouTube video URL
     * "https://www.youtube.com/watch?v=jV1vkHv4zq8&amp;t=2s".
     * </pre>
     *
     * <code>optional string video_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return This builder for chaining.
     */
    public Builder clearVideoId() {
      videoId_ = getDefaultInstance().getVideoId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The ID of the video associated with the video link. This is the
     * 11 character string value used in the YouTube video URL. For example, video
     * ID is jV1vkHv4zq8 from the YouTube video URL
     * "https://www.youtube.com/watch?v=jV1vkHv4zq8&amp;t=2s".
     * </pre>
     *
     * <code>optional string video_id = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The bytes for videoId to set.
     * @return This builder for chaining.
     */
    public Builder setVideoIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      videoId_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v20.resources.YoutubeVideoIdentifier)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v20.resources.YoutubeVideoIdentifier)
  private static final com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier();
  }

  public static com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<YoutubeVideoIdentifier>
      PARSER = new com.google.protobuf.AbstractParser<YoutubeVideoIdentifier>() {
    @java.lang.Override
    public YoutubeVideoIdentifier parsePartialFrom(
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

  public static com.google.protobuf.Parser<YoutubeVideoIdentifier> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<YoutubeVideoIdentifier> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v20.resources.YoutubeVideoIdentifier getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


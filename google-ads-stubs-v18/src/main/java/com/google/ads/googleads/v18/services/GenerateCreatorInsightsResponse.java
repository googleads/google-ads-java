// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/content_creator_insights_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.services;

/**
 * <pre>
 * Response message for
 * [ContentCreatorInsightsService.GenerateCreatorInsights][google.ads.googleads.v18.services.ContentCreatorInsightsService.GenerateCreatorInsights].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.services.GenerateCreatorInsightsResponse}
 */
public final class GenerateCreatorInsightsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.services.GenerateCreatorInsightsResponse)
    GenerateCreatorInsightsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenerateCreatorInsightsResponse.newBuilder() to construct.
  private GenerateCreatorInsightsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenerateCreatorInsightsResponse() {
    creatorInsights_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenerateCreatorInsightsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.services.ContentCreatorInsightsServiceProto.internal_static_google_ads_googleads_v18_services_GenerateCreatorInsightsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.services.ContentCreatorInsightsServiceProto.internal_static_google_ads_googleads_v18_services_GenerateCreatorInsightsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse.class, com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse.Builder.class);
  }

  public static final int CREATOR_INSIGHTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v18.services.YouTubeCreatorInsights> creatorInsights_;
  /**
   * <pre>
   * A collection of YouTube Creators, each containing a collection of YouTube
   * Channels maintained by the YouTube Creator.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v18.services.YouTubeCreatorInsights> getCreatorInsightsList() {
    return creatorInsights_;
  }
  /**
   * <pre>
   * A collection of YouTube Creators, each containing a collection of YouTube
   * Channels maintained by the YouTube Creator.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v18.services.YouTubeCreatorInsightsOrBuilder> 
      getCreatorInsightsOrBuilderList() {
    return creatorInsights_;
  }
  /**
   * <pre>
   * A collection of YouTube Creators, each containing a collection of YouTube
   * Channels maintained by the YouTube Creator.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
   */
  @java.lang.Override
  public int getCreatorInsightsCount() {
    return creatorInsights_.size();
  }
  /**
   * <pre>
   * A collection of YouTube Creators, each containing a collection of YouTube
   * Channels maintained by the YouTube Creator.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v18.services.YouTubeCreatorInsights getCreatorInsights(int index) {
    return creatorInsights_.get(index);
  }
  /**
   * <pre>
   * A collection of YouTube Creators, each containing a collection of YouTube
   * Channels maintained by the YouTube Creator.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v18.services.YouTubeCreatorInsightsOrBuilder getCreatorInsightsOrBuilder(
      int index) {
    return creatorInsights_.get(index);
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
    for (int i = 0; i < creatorInsights_.size(); i++) {
      output.writeMessage(1, creatorInsights_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < creatorInsights_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, creatorInsights_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse other = (com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse) obj;

    if (!getCreatorInsightsList()
        .equals(other.getCreatorInsightsList())) return false;
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
    if (getCreatorInsightsCount() > 0) {
      hash = (37 * hash) + CREATOR_INSIGHTS_FIELD_NUMBER;
      hash = (53 * hash) + getCreatorInsightsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse prototype) {
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
   * [ContentCreatorInsightsService.GenerateCreatorInsights][google.ads.googleads.v18.services.ContentCreatorInsightsService.GenerateCreatorInsights].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.services.GenerateCreatorInsightsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.services.GenerateCreatorInsightsResponse)
      com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.services.ContentCreatorInsightsServiceProto.internal_static_google_ads_googleads_v18_services_GenerateCreatorInsightsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.services.ContentCreatorInsightsServiceProto.internal_static_google_ads_googleads_v18_services_GenerateCreatorInsightsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse.class, com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse.newBuilder()
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
      if (creatorInsightsBuilder_ == null) {
        creatorInsights_ = java.util.Collections.emptyList();
      } else {
        creatorInsights_ = null;
        creatorInsightsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v18.services.ContentCreatorInsightsServiceProto.internal_static_google_ads_googleads_v18_services_GenerateCreatorInsightsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse build() {
      com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse buildPartial() {
      com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse result = new com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse result) {
      if (creatorInsightsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          creatorInsights_ = java.util.Collections.unmodifiableList(creatorInsights_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.creatorInsights_ = creatorInsights_;
      } else {
        result.creatorInsights_ = creatorInsightsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse) {
        return mergeFrom((com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse other) {
      if (other == com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse.getDefaultInstance()) return this;
      if (creatorInsightsBuilder_ == null) {
        if (!other.creatorInsights_.isEmpty()) {
          if (creatorInsights_.isEmpty()) {
            creatorInsights_ = other.creatorInsights_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCreatorInsightsIsMutable();
            creatorInsights_.addAll(other.creatorInsights_);
          }
          onChanged();
        }
      } else {
        if (!other.creatorInsights_.isEmpty()) {
          if (creatorInsightsBuilder_.isEmpty()) {
            creatorInsightsBuilder_.dispose();
            creatorInsightsBuilder_ = null;
            creatorInsights_ = other.creatorInsights_;
            bitField0_ = (bitField0_ & ~0x00000001);
            creatorInsightsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCreatorInsightsFieldBuilder() : null;
          } else {
            creatorInsightsBuilder_.addAllMessages(other.creatorInsights_);
          }
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
              com.google.ads.googleads.v18.services.YouTubeCreatorInsights m =
                  input.readMessage(
                      com.google.ads.googleads.v18.services.YouTubeCreatorInsights.parser(),
                      extensionRegistry);
              if (creatorInsightsBuilder_ == null) {
                ensureCreatorInsightsIsMutable();
                creatorInsights_.add(m);
              } else {
                creatorInsightsBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.google.ads.googleads.v18.services.YouTubeCreatorInsights> creatorInsights_ =
      java.util.Collections.emptyList();
    private void ensureCreatorInsightsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        creatorInsights_ = new java.util.ArrayList<com.google.ads.googleads.v18.services.YouTubeCreatorInsights>(creatorInsights_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v18.services.YouTubeCreatorInsights, com.google.ads.googleads.v18.services.YouTubeCreatorInsights.Builder, com.google.ads.googleads.v18.services.YouTubeCreatorInsightsOrBuilder> creatorInsightsBuilder_;

    /**
     * <pre>
     * A collection of YouTube Creators, each containing a collection of YouTube
     * Channels maintained by the YouTube Creator.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v18.services.YouTubeCreatorInsights> getCreatorInsightsList() {
      if (creatorInsightsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(creatorInsights_);
      } else {
        return creatorInsightsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A collection of YouTube Creators, each containing a collection of YouTube
     * Channels maintained by the YouTube Creator.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
     */
    public int getCreatorInsightsCount() {
      if (creatorInsightsBuilder_ == null) {
        return creatorInsights_.size();
      } else {
        return creatorInsightsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A collection of YouTube Creators, each containing a collection of YouTube
     * Channels maintained by the YouTube Creator.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
     */
    public com.google.ads.googleads.v18.services.YouTubeCreatorInsights getCreatorInsights(int index) {
      if (creatorInsightsBuilder_ == null) {
        return creatorInsights_.get(index);
      } else {
        return creatorInsightsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A collection of YouTube Creators, each containing a collection of YouTube
     * Channels maintained by the YouTube Creator.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
     */
    public Builder setCreatorInsights(
        int index, com.google.ads.googleads.v18.services.YouTubeCreatorInsights value) {
      if (creatorInsightsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCreatorInsightsIsMutable();
        creatorInsights_.set(index, value);
        onChanged();
      } else {
        creatorInsightsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A collection of YouTube Creators, each containing a collection of YouTube
     * Channels maintained by the YouTube Creator.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
     */
    public Builder setCreatorInsights(
        int index, com.google.ads.googleads.v18.services.YouTubeCreatorInsights.Builder builderForValue) {
      if (creatorInsightsBuilder_ == null) {
        ensureCreatorInsightsIsMutable();
        creatorInsights_.set(index, builderForValue.build());
        onChanged();
      } else {
        creatorInsightsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A collection of YouTube Creators, each containing a collection of YouTube
     * Channels maintained by the YouTube Creator.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
     */
    public Builder addCreatorInsights(com.google.ads.googleads.v18.services.YouTubeCreatorInsights value) {
      if (creatorInsightsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCreatorInsightsIsMutable();
        creatorInsights_.add(value);
        onChanged();
      } else {
        creatorInsightsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A collection of YouTube Creators, each containing a collection of YouTube
     * Channels maintained by the YouTube Creator.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
     */
    public Builder addCreatorInsights(
        int index, com.google.ads.googleads.v18.services.YouTubeCreatorInsights value) {
      if (creatorInsightsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCreatorInsightsIsMutable();
        creatorInsights_.add(index, value);
        onChanged();
      } else {
        creatorInsightsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A collection of YouTube Creators, each containing a collection of YouTube
     * Channels maintained by the YouTube Creator.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
     */
    public Builder addCreatorInsights(
        com.google.ads.googleads.v18.services.YouTubeCreatorInsights.Builder builderForValue) {
      if (creatorInsightsBuilder_ == null) {
        ensureCreatorInsightsIsMutable();
        creatorInsights_.add(builderForValue.build());
        onChanged();
      } else {
        creatorInsightsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A collection of YouTube Creators, each containing a collection of YouTube
     * Channels maintained by the YouTube Creator.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
     */
    public Builder addCreatorInsights(
        int index, com.google.ads.googleads.v18.services.YouTubeCreatorInsights.Builder builderForValue) {
      if (creatorInsightsBuilder_ == null) {
        ensureCreatorInsightsIsMutable();
        creatorInsights_.add(index, builderForValue.build());
        onChanged();
      } else {
        creatorInsightsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A collection of YouTube Creators, each containing a collection of YouTube
     * Channels maintained by the YouTube Creator.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
     */
    public Builder addAllCreatorInsights(
        java.lang.Iterable<? extends com.google.ads.googleads.v18.services.YouTubeCreatorInsights> values) {
      if (creatorInsightsBuilder_ == null) {
        ensureCreatorInsightsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, creatorInsights_);
        onChanged();
      } else {
        creatorInsightsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A collection of YouTube Creators, each containing a collection of YouTube
     * Channels maintained by the YouTube Creator.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
     */
    public Builder clearCreatorInsights() {
      if (creatorInsightsBuilder_ == null) {
        creatorInsights_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        creatorInsightsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A collection of YouTube Creators, each containing a collection of YouTube
     * Channels maintained by the YouTube Creator.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
     */
    public Builder removeCreatorInsights(int index) {
      if (creatorInsightsBuilder_ == null) {
        ensureCreatorInsightsIsMutable();
        creatorInsights_.remove(index);
        onChanged();
      } else {
        creatorInsightsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A collection of YouTube Creators, each containing a collection of YouTube
     * Channels maintained by the YouTube Creator.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
     */
    public com.google.ads.googleads.v18.services.YouTubeCreatorInsights.Builder getCreatorInsightsBuilder(
        int index) {
      return getCreatorInsightsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A collection of YouTube Creators, each containing a collection of YouTube
     * Channels maintained by the YouTube Creator.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
     */
    public com.google.ads.googleads.v18.services.YouTubeCreatorInsightsOrBuilder getCreatorInsightsOrBuilder(
        int index) {
      if (creatorInsightsBuilder_ == null) {
        return creatorInsights_.get(index);  } else {
        return creatorInsightsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A collection of YouTube Creators, each containing a collection of YouTube
     * Channels maintained by the YouTube Creator.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v18.services.YouTubeCreatorInsightsOrBuilder> 
         getCreatorInsightsOrBuilderList() {
      if (creatorInsightsBuilder_ != null) {
        return creatorInsightsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(creatorInsights_);
      }
    }
    /**
     * <pre>
     * A collection of YouTube Creators, each containing a collection of YouTube
     * Channels maintained by the YouTube Creator.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
     */
    public com.google.ads.googleads.v18.services.YouTubeCreatorInsights.Builder addCreatorInsightsBuilder() {
      return getCreatorInsightsFieldBuilder().addBuilder(
          com.google.ads.googleads.v18.services.YouTubeCreatorInsights.getDefaultInstance());
    }
    /**
     * <pre>
     * A collection of YouTube Creators, each containing a collection of YouTube
     * Channels maintained by the YouTube Creator.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
     */
    public com.google.ads.googleads.v18.services.YouTubeCreatorInsights.Builder addCreatorInsightsBuilder(
        int index) {
      return getCreatorInsightsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v18.services.YouTubeCreatorInsights.getDefaultInstance());
    }
    /**
     * <pre>
     * A collection of YouTube Creators, each containing a collection of YouTube
     * Channels maintained by the YouTube Creator.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.services.YouTubeCreatorInsights creator_insights = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v18.services.YouTubeCreatorInsights.Builder> 
         getCreatorInsightsBuilderList() {
      return getCreatorInsightsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v18.services.YouTubeCreatorInsights, com.google.ads.googleads.v18.services.YouTubeCreatorInsights.Builder, com.google.ads.googleads.v18.services.YouTubeCreatorInsightsOrBuilder> 
        getCreatorInsightsFieldBuilder() {
      if (creatorInsightsBuilder_ == null) {
        creatorInsightsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v18.services.YouTubeCreatorInsights, com.google.ads.googleads.v18.services.YouTubeCreatorInsights.Builder, com.google.ads.googleads.v18.services.YouTubeCreatorInsightsOrBuilder>(
                creatorInsights_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        creatorInsights_ = null;
      }
      return creatorInsightsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.services.GenerateCreatorInsightsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.services.GenerateCreatorInsightsResponse)
  private static final com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse();
  }

  public static com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateCreatorInsightsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GenerateCreatorInsightsResponse>() {
    @java.lang.Override
    public GenerateCreatorInsightsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateCreatorInsightsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateCreatorInsightsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.services.GenerateCreatorInsightsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


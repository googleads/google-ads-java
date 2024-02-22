// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/audience_insights_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.services;

/**
 * <pre>
 * An entity or category representing a topic that defines an audience.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.services.AudienceInsightsTopic}
 */
public final class AudienceInsightsTopic extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.services.AudienceInsightsTopic)
    AudienceInsightsTopicOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AudienceInsightsTopic.newBuilder() to construct.
  private AudienceInsightsTopic(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AudienceInsightsTopic() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AudienceInsightsTopic();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v16_services_AudienceInsightsTopic_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v16_services_AudienceInsightsTopic_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.services.AudienceInsightsTopic.class, com.google.ads.googleads.v16.services.AudienceInsightsTopic.Builder.class);
  }

  private int topicCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object topic_;
  public enum TopicCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ENTITY(1),
    CATEGORY(2),
    TOPIC_NOT_SET(0);
    private final int value;
    private TopicCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static TopicCase valueOf(int value) {
      return forNumber(value);
    }

    public static TopicCase forNumber(int value) {
      switch (value) {
        case 1: return ENTITY;
        case 2: return CATEGORY;
        case 0: return TOPIC_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public TopicCase
  getTopicCase() {
    return TopicCase.forNumber(
        topicCase_);
  }

  public static final int ENTITY_FIELD_NUMBER = 1;
  /**
   * <pre>
   * A Knowledge Graph entity
   * </pre>
   *
   * <code>.google.ads.googleads.v16.services.AudienceInsightsEntity entity = 1;</code>
   * @return Whether the entity field is set.
   */
  @java.lang.Override
  public boolean hasEntity() {
    return topicCase_ == 1;
  }
  /**
   * <pre>
   * A Knowledge Graph entity
   * </pre>
   *
   * <code>.google.ads.googleads.v16.services.AudienceInsightsEntity entity = 1;</code>
   * @return The entity.
   */
  @java.lang.Override
  public com.google.ads.googleads.v16.services.AudienceInsightsEntity getEntity() {
    if (topicCase_ == 1) {
       return (com.google.ads.googleads.v16.services.AudienceInsightsEntity) topic_;
    }
    return com.google.ads.googleads.v16.services.AudienceInsightsEntity.getDefaultInstance();
  }
  /**
   * <pre>
   * A Knowledge Graph entity
   * </pre>
   *
   * <code>.google.ads.googleads.v16.services.AudienceInsightsEntity entity = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v16.services.AudienceInsightsEntityOrBuilder getEntityOrBuilder() {
    if (topicCase_ == 1) {
       return (com.google.ads.googleads.v16.services.AudienceInsightsEntity) topic_;
    }
    return com.google.ads.googleads.v16.services.AudienceInsightsEntity.getDefaultInstance();
  }

  public static final int CATEGORY_FIELD_NUMBER = 2;
  /**
   * <pre>
   * A Product &amp; Service category
   * </pre>
   *
   * <code>.google.ads.googleads.v16.services.AudienceInsightsCategory category = 2;</code>
   * @return Whether the category field is set.
   */
  @java.lang.Override
  public boolean hasCategory() {
    return topicCase_ == 2;
  }
  /**
   * <pre>
   * A Product &amp; Service category
   * </pre>
   *
   * <code>.google.ads.googleads.v16.services.AudienceInsightsCategory category = 2;</code>
   * @return The category.
   */
  @java.lang.Override
  public com.google.ads.googleads.v16.services.AudienceInsightsCategory getCategory() {
    if (topicCase_ == 2) {
       return (com.google.ads.googleads.v16.services.AudienceInsightsCategory) topic_;
    }
    return com.google.ads.googleads.v16.services.AudienceInsightsCategory.getDefaultInstance();
  }
  /**
   * <pre>
   * A Product &amp; Service category
   * </pre>
   *
   * <code>.google.ads.googleads.v16.services.AudienceInsightsCategory category = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v16.services.AudienceInsightsCategoryOrBuilder getCategoryOrBuilder() {
    if (topicCase_ == 2) {
       return (com.google.ads.googleads.v16.services.AudienceInsightsCategory) topic_;
    }
    return com.google.ads.googleads.v16.services.AudienceInsightsCategory.getDefaultInstance();
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
    if (topicCase_ == 1) {
      output.writeMessage(1, (com.google.ads.googleads.v16.services.AudienceInsightsEntity) topic_);
    }
    if (topicCase_ == 2) {
      output.writeMessage(2, (com.google.ads.googleads.v16.services.AudienceInsightsCategory) topic_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (topicCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (com.google.ads.googleads.v16.services.AudienceInsightsEntity) topic_);
    }
    if (topicCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.ads.googleads.v16.services.AudienceInsightsCategory) topic_);
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
    if (!(obj instanceof com.google.ads.googleads.v16.services.AudienceInsightsTopic)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.services.AudienceInsightsTopic other = (com.google.ads.googleads.v16.services.AudienceInsightsTopic) obj;

    if (!getTopicCase().equals(other.getTopicCase())) return false;
    switch (topicCase_) {
      case 1:
        if (!getEntity()
            .equals(other.getEntity())) return false;
        break;
      case 2:
        if (!getCategory()
            .equals(other.getCategory())) return false;
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
    switch (topicCase_) {
      case 1:
        hash = (37 * hash) + ENTITY_FIELD_NUMBER;
        hash = (53 * hash) + getEntity().hashCode();
        break;
      case 2:
        hash = (37 * hash) + CATEGORY_FIELD_NUMBER;
        hash = (53 * hash) + getCategory().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.services.AudienceInsightsTopic parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.services.AudienceInsightsTopic parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.AudienceInsightsTopic parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.services.AudienceInsightsTopic parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.AudienceInsightsTopic parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.services.AudienceInsightsTopic parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.AudienceInsightsTopic parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.services.AudienceInsightsTopic parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.services.AudienceInsightsTopic parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.services.AudienceInsightsTopic parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.AudienceInsightsTopic parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.services.AudienceInsightsTopic parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.services.AudienceInsightsTopic prototype) {
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
   * An entity or category representing a topic that defines an audience.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.services.AudienceInsightsTopic}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.services.AudienceInsightsTopic)
      com.google.ads.googleads.v16.services.AudienceInsightsTopicOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v16_services_AudienceInsightsTopic_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v16_services_AudienceInsightsTopic_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.services.AudienceInsightsTopic.class, com.google.ads.googleads.v16.services.AudienceInsightsTopic.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.services.AudienceInsightsTopic.newBuilder()
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
      if (entityBuilder_ != null) {
        entityBuilder_.clear();
      }
      if (categoryBuilder_ != null) {
        categoryBuilder_.clear();
      }
      topicCase_ = 0;
      topic_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v16_services_AudienceInsightsTopic_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.services.AudienceInsightsTopic getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.services.AudienceInsightsTopic.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.services.AudienceInsightsTopic build() {
      com.google.ads.googleads.v16.services.AudienceInsightsTopic result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.services.AudienceInsightsTopic buildPartial() {
      com.google.ads.googleads.v16.services.AudienceInsightsTopic result = new com.google.ads.googleads.v16.services.AudienceInsightsTopic(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v16.services.AudienceInsightsTopic result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.ads.googleads.v16.services.AudienceInsightsTopic result) {
      result.topicCase_ = topicCase_;
      result.topic_ = this.topic_;
      if (topicCase_ == 1 &&
          entityBuilder_ != null) {
        result.topic_ = entityBuilder_.build();
      }
      if (topicCase_ == 2 &&
          categoryBuilder_ != null) {
        result.topic_ = categoryBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v16.services.AudienceInsightsTopic) {
        return mergeFrom((com.google.ads.googleads.v16.services.AudienceInsightsTopic)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.services.AudienceInsightsTopic other) {
      if (other == com.google.ads.googleads.v16.services.AudienceInsightsTopic.getDefaultInstance()) return this;
      switch (other.getTopicCase()) {
        case ENTITY: {
          mergeEntity(other.getEntity());
          break;
        }
        case CATEGORY: {
          mergeCategory(other.getCategory());
          break;
        }
        case TOPIC_NOT_SET: {
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
                  getEntityFieldBuilder().getBuilder(),
                  extensionRegistry);
              topicCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getCategoryFieldBuilder().getBuilder(),
                  extensionRegistry);
              topicCase_ = 2;
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
    private int topicCase_ = 0;
    private java.lang.Object topic_;
    public TopicCase
        getTopicCase() {
      return TopicCase.forNumber(
          topicCase_);
    }

    public Builder clearTopic() {
      topicCase_ = 0;
      topic_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v16.services.AudienceInsightsEntity, com.google.ads.googleads.v16.services.AudienceInsightsEntity.Builder, com.google.ads.googleads.v16.services.AudienceInsightsEntityOrBuilder> entityBuilder_;
    /**
     * <pre>
     * A Knowledge Graph entity
     * </pre>
     *
     * <code>.google.ads.googleads.v16.services.AudienceInsightsEntity entity = 1;</code>
     * @return Whether the entity field is set.
     */
    @java.lang.Override
    public boolean hasEntity() {
      return topicCase_ == 1;
    }
    /**
     * <pre>
     * A Knowledge Graph entity
     * </pre>
     *
     * <code>.google.ads.googleads.v16.services.AudienceInsightsEntity entity = 1;</code>
     * @return The entity.
     */
    @java.lang.Override
    public com.google.ads.googleads.v16.services.AudienceInsightsEntity getEntity() {
      if (entityBuilder_ == null) {
        if (topicCase_ == 1) {
          return (com.google.ads.googleads.v16.services.AudienceInsightsEntity) topic_;
        }
        return com.google.ads.googleads.v16.services.AudienceInsightsEntity.getDefaultInstance();
      } else {
        if (topicCase_ == 1) {
          return entityBuilder_.getMessage();
        }
        return com.google.ads.googleads.v16.services.AudienceInsightsEntity.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * A Knowledge Graph entity
     * </pre>
     *
     * <code>.google.ads.googleads.v16.services.AudienceInsightsEntity entity = 1;</code>
     */
    public Builder setEntity(com.google.ads.googleads.v16.services.AudienceInsightsEntity value) {
      if (entityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        topic_ = value;
        onChanged();
      } else {
        entityBuilder_.setMessage(value);
      }
      topicCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * A Knowledge Graph entity
     * </pre>
     *
     * <code>.google.ads.googleads.v16.services.AudienceInsightsEntity entity = 1;</code>
     */
    public Builder setEntity(
        com.google.ads.googleads.v16.services.AudienceInsightsEntity.Builder builderForValue) {
      if (entityBuilder_ == null) {
        topic_ = builderForValue.build();
        onChanged();
      } else {
        entityBuilder_.setMessage(builderForValue.build());
      }
      topicCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * A Knowledge Graph entity
     * </pre>
     *
     * <code>.google.ads.googleads.v16.services.AudienceInsightsEntity entity = 1;</code>
     */
    public Builder mergeEntity(com.google.ads.googleads.v16.services.AudienceInsightsEntity value) {
      if (entityBuilder_ == null) {
        if (topicCase_ == 1 &&
            topic_ != com.google.ads.googleads.v16.services.AudienceInsightsEntity.getDefaultInstance()) {
          topic_ = com.google.ads.googleads.v16.services.AudienceInsightsEntity.newBuilder((com.google.ads.googleads.v16.services.AudienceInsightsEntity) topic_)
              .mergeFrom(value).buildPartial();
        } else {
          topic_ = value;
        }
        onChanged();
      } else {
        if (topicCase_ == 1) {
          entityBuilder_.mergeFrom(value);
        } else {
          entityBuilder_.setMessage(value);
        }
      }
      topicCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * A Knowledge Graph entity
     * </pre>
     *
     * <code>.google.ads.googleads.v16.services.AudienceInsightsEntity entity = 1;</code>
     */
    public Builder clearEntity() {
      if (entityBuilder_ == null) {
        if (topicCase_ == 1) {
          topicCase_ = 0;
          topic_ = null;
          onChanged();
        }
      } else {
        if (topicCase_ == 1) {
          topicCase_ = 0;
          topic_ = null;
        }
        entityBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A Knowledge Graph entity
     * </pre>
     *
     * <code>.google.ads.googleads.v16.services.AudienceInsightsEntity entity = 1;</code>
     */
    public com.google.ads.googleads.v16.services.AudienceInsightsEntity.Builder getEntityBuilder() {
      return getEntityFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * A Knowledge Graph entity
     * </pre>
     *
     * <code>.google.ads.googleads.v16.services.AudienceInsightsEntity entity = 1;</code>
     */
    @java.lang.Override
    public com.google.ads.googleads.v16.services.AudienceInsightsEntityOrBuilder getEntityOrBuilder() {
      if ((topicCase_ == 1) && (entityBuilder_ != null)) {
        return entityBuilder_.getMessageOrBuilder();
      } else {
        if (topicCase_ == 1) {
          return (com.google.ads.googleads.v16.services.AudienceInsightsEntity) topic_;
        }
        return com.google.ads.googleads.v16.services.AudienceInsightsEntity.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * A Knowledge Graph entity
     * </pre>
     *
     * <code>.google.ads.googleads.v16.services.AudienceInsightsEntity entity = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v16.services.AudienceInsightsEntity, com.google.ads.googleads.v16.services.AudienceInsightsEntity.Builder, com.google.ads.googleads.v16.services.AudienceInsightsEntityOrBuilder> 
        getEntityFieldBuilder() {
      if (entityBuilder_ == null) {
        if (!(topicCase_ == 1)) {
          topic_ = com.google.ads.googleads.v16.services.AudienceInsightsEntity.getDefaultInstance();
        }
        entityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v16.services.AudienceInsightsEntity, com.google.ads.googleads.v16.services.AudienceInsightsEntity.Builder, com.google.ads.googleads.v16.services.AudienceInsightsEntityOrBuilder>(
                (com.google.ads.googleads.v16.services.AudienceInsightsEntity) topic_,
                getParentForChildren(),
                isClean());
        topic_ = null;
      }
      topicCase_ = 1;
      onChanged();
      return entityBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v16.services.AudienceInsightsCategory, com.google.ads.googleads.v16.services.AudienceInsightsCategory.Builder, com.google.ads.googleads.v16.services.AudienceInsightsCategoryOrBuilder> categoryBuilder_;
    /**
     * <pre>
     * A Product &amp; Service category
     * </pre>
     *
     * <code>.google.ads.googleads.v16.services.AudienceInsightsCategory category = 2;</code>
     * @return Whether the category field is set.
     */
    @java.lang.Override
    public boolean hasCategory() {
      return topicCase_ == 2;
    }
    /**
     * <pre>
     * A Product &amp; Service category
     * </pre>
     *
     * <code>.google.ads.googleads.v16.services.AudienceInsightsCategory category = 2;</code>
     * @return The category.
     */
    @java.lang.Override
    public com.google.ads.googleads.v16.services.AudienceInsightsCategory getCategory() {
      if (categoryBuilder_ == null) {
        if (topicCase_ == 2) {
          return (com.google.ads.googleads.v16.services.AudienceInsightsCategory) topic_;
        }
        return com.google.ads.googleads.v16.services.AudienceInsightsCategory.getDefaultInstance();
      } else {
        if (topicCase_ == 2) {
          return categoryBuilder_.getMessage();
        }
        return com.google.ads.googleads.v16.services.AudienceInsightsCategory.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * A Product &amp; Service category
     * </pre>
     *
     * <code>.google.ads.googleads.v16.services.AudienceInsightsCategory category = 2;</code>
     */
    public Builder setCategory(com.google.ads.googleads.v16.services.AudienceInsightsCategory value) {
      if (categoryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        topic_ = value;
        onChanged();
      } else {
        categoryBuilder_.setMessage(value);
      }
      topicCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * A Product &amp; Service category
     * </pre>
     *
     * <code>.google.ads.googleads.v16.services.AudienceInsightsCategory category = 2;</code>
     */
    public Builder setCategory(
        com.google.ads.googleads.v16.services.AudienceInsightsCategory.Builder builderForValue) {
      if (categoryBuilder_ == null) {
        topic_ = builderForValue.build();
        onChanged();
      } else {
        categoryBuilder_.setMessage(builderForValue.build());
      }
      topicCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * A Product &amp; Service category
     * </pre>
     *
     * <code>.google.ads.googleads.v16.services.AudienceInsightsCategory category = 2;</code>
     */
    public Builder mergeCategory(com.google.ads.googleads.v16.services.AudienceInsightsCategory value) {
      if (categoryBuilder_ == null) {
        if (topicCase_ == 2 &&
            topic_ != com.google.ads.googleads.v16.services.AudienceInsightsCategory.getDefaultInstance()) {
          topic_ = com.google.ads.googleads.v16.services.AudienceInsightsCategory.newBuilder((com.google.ads.googleads.v16.services.AudienceInsightsCategory) topic_)
              .mergeFrom(value).buildPartial();
        } else {
          topic_ = value;
        }
        onChanged();
      } else {
        if (topicCase_ == 2) {
          categoryBuilder_.mergeFrom(value);
        } else {
          categoryBuilder_.setMessage(value);
        }
      }
      topicCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * A Product &amp; Service category
     * </pre>
     *
     * <code>.google.ads.googleads.v16.services.AudienceInsightsCategory category = 2;</code>
     */
    public Builder clearCategory() {
      if (categoryBuilder_ == null) {
        if (topicCase_ == 2) {
          topicCase_ = 0;
          topic_ = null;
          onChanged();
        }
      } else {
        if (topicCase_ == 2) {
          topicCase_ = 0;
          topic_ = null;
        }
        categoryBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A Product &amp; Service category
     * </pre>
     *
     * <code>.google.ads.googleads.v16.services.AudienceInsightsCategory category = 2;</code>
     */
    public com.google.ads.googleads.v16.services.AudienceInsightsCategory.Builder getCategoryBuilder() {
      return getCategoryFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * A Product &amp; Service category
     * </pre>
     *
     * <code>.google.ads.googleads.v16.services.AudienceInsightsCategory category = 2;</code>
     */
    @java.lang.Override
    public com.google.ads.googleads.v16.services.AudienceInsightsCategoryOrBuilder getCategoryOrBuilder() {
      if ((topicCase_ == 2) && (categoryBuilder_ != null)) {
        return categoryBuilder_.getMessageOrBuilder();
      } else {
        if (topicCase_ == 2) {
          return (com.google.ads.googleads.v16.services.AudienceInsightsCategory) topic_;
        }
        return com.google.ads.googleads.v16.services.AudienceInsightsCategory.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * A Product &amp; Service category
     * </pre>
     *
     * <code>.google.ads.googleads.v16.services.AudienceInsightsCategory category = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v16.services.AudienceInsightsCategory, com.google.ads.googleads.v16.services.AudienceInsightsCategory.Builder, com.google.ads.googleads.v16.services.AudienceInsightsCategoryOrBuilder> 
        getCategoryFieldBuilder() {
      if (categoryBuilder_ == null) {
        if (!(topicCase_ == 2)) {
          topic_ = com.google.ads.googleads.v16.services.AudienceInsightsCategory.getDefaultInstance();
        }
        categoryBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v16.services.AudienceInsightsCategory, com.google.ads.googleads.v16.services.AudienceInsightsCategory.Builder, com.google.ads.googleads.v16.services.AudienceInsightsCategoryOrBuilder>(
                (com.google.ads.googleads.v16.services.AudienceInsightsCategory) topic_,
                getParentForChildren(),
                isClean());
        topic_ = null;
      }
      topicCase_ = 2;
      onChanged();
      return categoryBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.services.AudienceInsightsTopic)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.services.AudienceInsightsTopic)
  private static final com.google.ads.googleads.v16.services.AudienceInsightsTopic DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.services.AudienceInsightsTopic();
  }

  public static com.google.ads.googleads.v16.services.AudienceInsightsTopic getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AudienceInsightsTopic>
      PARSER = new com.google.protobuf.AbstractParser<AudienceInsightsTopic>() {
    @java.lang.Override
    public AudienceInsightsTopic parsePartialFrom(
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

  public static com.google.protobuf.Parser<AudienceInsightsTopic> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AudienceInsightsTopic> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.services.AudienceInsightsTopic getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


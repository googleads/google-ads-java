// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/audience_insights_attribute.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.common;

/**
 * <pre>
 * A Product and Service category.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.common.AudienceInsightsCategory}
 */
public final class AudienceInsightsCategory extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.common.AudienceInsightsCategory)
    AudienceInsightsCategoryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AudienceInsightsCategory.newBuilder() to construct.
  private AudienceInsightsCategory(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AudienceInsightsCategory() {
    categoryId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AudienceInsightsCategory();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.common.AudienceInsightsAttributeProto.internal_static_google_ads_googleads_v19_common_AudienceInsightsCategory_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.common.AudienceInsightsAttributeProto.internal_static_google_ads_googleads_v19_common_AudienceInsightsCategory_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.common.AudienceInsightsCategory.class, com.google.ads.googleads.v19.common.AudienceInsightsCategory.Builder.class);
  }

  public static final int CATEGORY_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object categoryId_ = "";
  /**
   * <pre>
   * Required. The criterion ID of the category.
   * </pre>
   *
   * <code>string category_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The categoryId.
   */
  @java.lang.Override
  public java.lang.String getCategoryId() {
    java.lang.Object ref = categoryId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      categoryId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The criterion ID of the category.
   * </pre>
   *
   * <code>string category_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for categoryId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCategoryIdBytes() {
    java.lang.Object ref = categoryId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      categoryId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(categoryId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, categoryId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(categoryId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, categoryId_);
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
    if (!(obj instanceof com.google.ads.googleads.v19.common.AudienceInsightsCategory)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.common.AudienceInsightsCategory other = (com.google.ads.googleads.v19.common.AudienceInsightsCategory) obj;

    if (!getCategoryId()
        .equals(other.getCategoryId())) return false;
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
    hash = (37 * hash) + CATEGORY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCategoryId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.common.AudienceInsightsCategory parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.AudienceInsightsCategory parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.AudienceInsightsCategory parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.AudienceInsightsCategory parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.AudienceInsightsCategory parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.AudienceInsightsCategory parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.AudienceInsightsCategory parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.common.AudienceInsightsCategory parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.common.AudienceInsightsCategory parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.common.AudienceInsightsCategory parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.AudienceInsightsCategory parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.common.AudienceInsightsCategory parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.common.AudienceInsightsCategory prototype) {
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
   * A Product and Service category.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.common.AudienceInsightsCategory}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.common.AudienceInsightsCategory)
      com.google.ads.googleads.v19.common.AudienceInsightsCategoryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.common.AudienceInsightsAttributeProto.internal_static_google_ads_googleads_v19_common_AudienceInsightsCategory_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.common.AudienceInsightsAttributeProto.internal_static_google_ads_googleads_v19_common_AudienceInsightsCategory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.common.AudienceInsightsCategory.class, com.google.ads.googleads.v19.common.AudienceInsightsCategory.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.common.AudienceInsightsCategory.newBuilder()
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
      categoryId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.common.AudienceInsightsAttributeProto.internal_static_google_ads_googleads_v19_common_AudienceInsightsCategory_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.AudienceInsightsCategory getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.common.AudienceInsightsCategory.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.AudienceInsightsCategory build() {
      com.google.ads.googleads.v19.common.AudienceInsightsCategory result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.AudienceInsightsCategory buildPartial() {
      com.google.ads.googleads.v19.common.AudienceInsightsCategory result = new com.google.ads.googleads.v19.common.AudienceInsightsCategory(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v19.common.AudienceInsightsCategory result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.categoryId_ = categoryId_;
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
      if (other instanceof com.google.ads.googleads.v19.common.AudienceInsightsCategory) {
        return mergeFrom((com.google.ads.googleads.v19.common.AudienceInsightsCategory)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.common.AudienceInsightsCategory other) {
      if (other == com.google.ads.googleads.v19.common.AudienceInsightsCategory.getDefaultInstance()) return this;
      if (!other.getCategoryId().isEmpty()) {
        categoryId_ = other.categoryId_;
        bitField0_ |= 0x00000001;
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
              categoryId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
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

    private java.lang.Object categoryId_ = "";
    /**
     * <pre>
     * Required. The criterion ID of the category.
     * </pre>
     *
     * <code>string category_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The categoryId.
     */
    public java.lang.String getCategoryId() {
      java.lang.Object ref = categoryId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        categoryId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The criterion ID of the category.
     * </pre>
     *
     * <code>string category_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for categoryId.
     */
    public com.google.protobuf.ByteString
        getCategoryIdBytes() {
      java.lang.Object ref = categoryId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        categoryId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The criterion ID of the category.
     * </pre>
     *
     * <code>string category_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The categoryId to set.
     * @return This builder for chaining.
     */
    public Builder setCategoryId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      categoryId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The criterion ID of the category.
     * </pre>
     *
     * <code>string category_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearCategoryId() {
      categoryId_ = getDefaultInstance().getCategoryId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The criterion ID of the category.
     * </pre>
     *
     * <code>string category_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for categoryId to set.
     * @return This builder for chaining.
     */
    public Builder setCategoryIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      categoryId_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.common.AudienceInsightsCategory)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.common.AudienceInsightsCategory)
  private static final com.google.ads.googleads.v19.common.AudienceInsightsCategory DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.common.AudienceInsightsCategory();
  }

  public static com.google.ads.googleads.v19.common.AudienceInsightsCategory getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AudienceInsightsCategory>
      PARSER = new com.google.protobuf.AbstractParser<AudienceInsightsCategory>() {
    @java.lang.Override
    public AudienceInsightsCategory parsePartialFrom(
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

  public static com.google.protobuf.Parser<AudienceInsightsCategory> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AudienceInsightsCategory> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.common.AudienceInsightsCategory getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/criteria.proto

package com.google.ads.googleads.v2.common;

/**
 * <pre>
 * A custom affinity criterion.
 * A criterion of this type is only targetable.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v2.common.CustomAffinityInfo}
 */
public final class CustomAffinityInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v2.common.CustomAffinityInfo)
    CustomAffinityInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomAffinityInfo.newBuilder() to construct.
  private CustomAffinityInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomAffinityInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomAffinityInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CustomAffinityInfo(
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
            if (customAffinity_ != null) {
              subBuilder = customAffinity_.toBuilder();
            }
            customAffinity_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(customAffinity_);
              customAffinity_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_CustomAffinityInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_CustomAffinityInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v2.common.CustomAffinityInfo.class, com.google.ads.googleads.v2.common.CustomAffinityInfo.Builder.class);
  }

  public static final int CUSTOM_AFFINITY_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue customAffinity_;
  /**
   * <pre>
   * The CustomInterest resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue custom_affinity = 1;</code>
   * @return Whether the customAffinity field is set.
   */
  @java.lang.Override
  public boolean hasCustomAffinity() {
    return customAffinity_ != null;
  }
  /**
   * <pre>
   * The CustomInterest resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue custom_affinity = 1;</code>
   * @return The customAffinity.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getCustomAffinity() {
    return customAffinity_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : customAffinity_;
  }
  /**
   * <pre>
   * The CustomInterest resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue custom_affinity = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getCustomAffinityOrBuilder() {
    return getCustomAffinity();
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
    if (customAffinity_ != null) {
      output.writeMessage(1, getCustomAffinity());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (customAffinity_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCustomAffinity());
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
    if (!(obj instanceof com.google.ads.googleads.v2.common.CustomAffinityInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v2.common.CustomAffinityInfo other = (com.google.ads.googleads.v2.common.CustomAffinityInfo) obj;

    if (hasCustomAffinity() != other.hasCustomAffinity()) return false;
    if (hasCustomAffinity()) {
      if (!getCustomAffinity()
          .equals(other.getCustomAffinity())) return false;
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
    if (hasCustomAffinity()) {
      hash = (37 * hash) + CUSTOM_AFFINITY_FIELD_NUMBER;
      hash = (53 * hash) + getCustomAffinity().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v2.common.CustomAffinityInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.CustomAffinityInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.CustomAffinityInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.CustomAffinityInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.CustomAffinityInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v2.common.CustomAffinityInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.CustomAffinityInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.CustomAffinityInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.CustomAffinityInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.CustomAffinityInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v2.common.CustomAffinityInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v2.common.CustomAffinityInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v2.common.CustomAffinityInfo prototype) {
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
   * A custom affinity criterion.
   * A criterion of this type is only targetable.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v2.common.CustomAffinityInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v2.common.CustomAffinityInfo)
      com.google.ads.googleads.v2.common.CustomAffinityInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_CustomAffinityInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_CustomAffinityInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v2.common.CustomAffinityInfo.class, com.google.ads.googleads.v2.common.CustomAffinityInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v2.common.CustomAffinityInfo.newBuilder()
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
      if (customAffinityBuilder_ == null) {
        customAffinity_ = null;
      } else {
        customAffinity_ = null;
        customAffinityBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v2.common.CriteriaProto.internal_static_google_ads_googleads_v2_common_CustomAffinityInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.CustomAffinityInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v2.common.CustomAffinityInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.CustomAffinityInfo build() {
      com.google.ads.googleads.v2.common.CustomAffinityInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v2.common.CustomAffinityInfo buildPartial() {
      com.google.ads.googleads.v2.common.CustomAffinityInfo result = new com.google.ads.googleads.v2.common.CustomAffinityInfo(this);
      if (customAffinityBuilder_ == null) {
        result.customAffinity_ = customAffinity_;
      } else {
        result.customAffinity_ = customAffinityBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v2.common.CustomAffinityInfo) {
        return mergeFrom((com.google.ads.googleads.v2.common.CustomAffinityInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v2.common.CustomAffinityInfo other) {
      if (other == com.google.ads.googleads.v2.common.CustomAffinityInfo.getDefaultInstance()) return this;
      if (other.hasCustomAffinity()) {
        mergeCustomAffinity(other.getCustomAffinity());
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
      com.google.ads.googleads.v2.common.CustomAffinityInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v2.common.CustomAffinityInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue customAffinity_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> customAffinityBuilder_;
    /**
     * <pre>
     * The CustomInterest resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue custom_affinity = 1;</code>
     * @return Whether the customAffinity field is set.
     */
    public boolean hasCustomAffinity() {
      return customAffinityBuilder_ != null || customAffinity_ != null;
    }
    /**
     * <pre>
     * The CustomInterest resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue custom_affinity = 1;</code>
     * @return The customAffinity.
     */
    public com.google.protobuf.StringValue getCustomAffinity() {
      if (customAffinityBuilder_ == null) {
        return customAffinity_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : customAffinity_;
      } else {
        return customAffinityBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The CustomInterest resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue custom_affinity = 1;</code>
     */
    public Builder setCustomAffinity(com.google.protobuf.StringValue value) {
      if (customAffinityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        customAffinity_ = value;
        onChanged();
      } else {
        customAffinityBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The CustomInterest resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue custom_affinity = 1;</code>
     */
    public Builder setCustomAffinity(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (customAffinityBuilder_ == null) {
        customAffinity_ = builderForValue.build();
        onChanged();
      } else {
        customAffinityBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The CustomInterest resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue custom_affinity = 1;</code>
     */
    public Builder mergeCustomAffinity(com.google.protobuf.StringValue value) {
      if (customAffinityBuilder_ == null) {
        if (customAffinity_ != null) {
          customAffinity_ =
            com.google.protobuf.StringValue.newBuilder(customAffinity_).mergeFrom(value).buildPartial();
        } else {
          customAffinity_ = value;
        }
        onChanged();
      } else {
        customAffinityBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The CustomInterest resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue custom_affinity = 1;</code>
     */
    public Builder clearCustomAffinity() {
      if (customAffinityBuilder_ == null) {
        customAffinity_ = null;
        onChanged();
      } else {
        customAffinity_ = null;
        customAffinityBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The CustomInterest resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue custom_affinity = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getCustomAffinityBuilder() {
      
      onChanged();
      return getCustomAffinityFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The CustomInterest resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue custom_affinity = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getCustomAffinityOrBuilder() {
      if (customAffinityBuilder_ != null) {
        return customAffinityBuilder_.getMessageOrBuilder();
      } else {
        return customAffinity_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : customAffinity_;
      }
    }
    /**
     * <pre>
     * The CustomInterest resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue custom_affinity = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getCustomAffinityFieldBuilder() {
      if (customAffinityBuilder_ == null) {
        customAffinityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getCustomAffinity(),
                getParentForChildren(),
                isClean());
        customAffinity_ = null;
      }
      return customAffinityBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v2.common.CustomAffinityInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v2.common.CustomAffinityInfo)
  private static final com.google.ads.googleads.v2.common.CustomAffinityInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v2.common.CustomAffinityInfo();
  }

  public static com.google.ads.googleads.v2.common.CustomAffinityInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomAffinityInfo>
      PARSER = new com.google.protobuf.AbstractParser<CustomAffinityInfo>() {
    @java.lang.Override
    public CustomAffinityInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CustomAffinityInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CustomAffinityInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomAffinityInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v2.common.CustomAffinityInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


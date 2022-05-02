// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/segments.proto

package com.google.ads.googleads.v10.common;

/**
 * <pre>
 * A Keyword criterion segment.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.common.Keyword}
 */
public final class Keyword extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.common.Keyword)
    KeywordOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Keyword.newBuilder() to construct.
  private Keyword(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Keyword() {
    adGroupCriterion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Keyword();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Keyword(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 18: {
            com.google.ads.googleads.v10.common.KeywordInfo.Builder subBuilder = null;
            if (info_ != null) {
              subBuilder = info_.toBuilder();
            }
            info_ = input.readMessage(com.google.ads.googleads.v10.common.KeywordInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(info_);
              info_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000001;
            adGroupCriterion_ = s;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.google.ads.googleads.v10.common.SegmentsProto.internal_static_google_ads_googleads_v10_common_Keyword_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.common.SegmentsProto.internal_static_google_ads_googleads_v10_common_Keyword_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.common.Keyword.class, com.google.ads.googleads.v10.common.Keyword.Builder.class);
  }

  private int bitField0_;
  public static final int AD_GROUP_CRITERION_FIELD_NUMBER = 3;
  private volatile java.lang.Object adGroupCriterion_;
  /**
   * <pre>
   * The AdGroupCriterion resource name.
   * </pre>
   *
   * <code>optional string ad_group_criterion = 3;</code>
   * @return Whether the adGroupCriterion field is set.
   */
  @java.lang.Override
  public boolean hasAdGroupCriterion() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The AdGroupCriterion resource name.
   * </pre>
   *
   * <code>optional string ad_group_criterion = 3;</code>
   * @return The adGroupCriterion.
   */
  @java.lang.Override
  public java.lang.String getAdGroupCriterion() {
    java.lang.Object ref = adGroupCriterion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      adGroupCriterion_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The AdGroupCriterion resource name.
   * </pre>
   *
   * <code>optional string ad_group_criterion = 3;</code>
   * @return The bytes for adGroupCriterion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAdGroupCriterionBytes() {
    java.lang.Object ref = adGroupCriterion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      adGroupCriterion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INFO_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v10.common.KeywordInfo info_;
  /**
   * <pre>
   * Keyword info.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.KeywordInfo info = 2;</code>
   * @return Whether the info field is set.
   */
  @java.lang.Override
  public boolean hasInfo() {
    return info_ != null;
  }
  /**
   * <pre>
   * Keyword info.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.KeywordInfo info = 2;</code>
   * @return The info.
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.common.KeywordInfo getInfo() {
    return info_ == null ? com.google.ads.googleads.v10.common.KeywordInfo.getDefaultInstance() : info_;
  }
  /**
   * <pre>
   * Keyword info.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.KeywordInfo info = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.common.KeywordInfoOrBuilder getInfoOrBuilder() {
    return getInfo();
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
    if (info_ != null) {
      output.writeMessage(2, getInfo());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, adGroupCriterion_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (info_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getInfo());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, adGroupCriterion_);
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
    if (!(obj instanceof com.google.ads.googleads.v10.common.Keyword)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.common.Keyword other = (com.google.ads.googleads.v10.common.Keyword) obj;

    if (hasAdGroupCriterion() != other.hasAdGroupCriterion()) return false;
    if (hasAdGroupCriterion()) {
      if (!getAdGroupCriterion()
          .equals(other.getAdGroupCriterion())) return false;
    }
    if (hasInfo() != other.hasInfo()) return false;
    if (hasInfo()) {
      if (!getInfo()
          .equals(other.getInfo())) return false;
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
    if (hasAdGroupCriterion()) {
      hash = (37 * hash) + AD_GROUP_CRITERION_FIELD_NUMBER;
      hash = (53 * hash) + getAdGroupCriterion().hashCode();
    }
    if (hasInfo()) {
      hash = (37 * hash) + INFO_FIELD_NUMBER;
      hash = (53 * hash) + getInfo().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.common.Keyword parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.Keyword parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.Keyword parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.Keyword parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.Keyword parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.Keyword parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.Keyword parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.Keyword parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.Keyword parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.Keyword parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.Keyword parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.Keyword parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.common.Keyword prototype) {
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
   * A Keyword criterion segment.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.common.Keyword}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.common.Keyword)
      com.google.ads.googleads.v10.common.KeywordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.common.SegmentsProto.internal_static_google_ads_googleads_v10_common_Keyword_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.common.SegmentsProto.internal_static_google_ads_googleads_v10_common_Keyword_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.common.Keyword.class, com.google.ads.googleads.v10.common.Keyword.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.common.Keyword.newBuilder()
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
      adGroupCriterion_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      if (infoBuilder_ == null) {
        info_ = null;
      } else {
        info_ = null;
        infoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.common.SegmentsProto.internal_static_google_ads_googleads_v10_common_Keyword_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.Keyword getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.common.Keyword.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.Keyword build() {
      com.google.ads.googleads.v10.common.Keyword result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.Keyword buildPartial() {
      com.google.ads.googleads.v10.common.Keyword result = new com.google.ads.googleads.v10.common.Keyword(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.adGroupCriterion_ = adGroupCriterion_;
      if (infoBuilder_ == null) {
        result.info_ = info_;
      } else {
        result.info_ = infoBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.ads.googleads.v10.common.Keyword) {
        return mergeFrom((com.google.ads.googleads.v10.common.Keyword)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.common.Keyword other) {
      if (other == com.google.ads.googleads.v10.common.Keyword.getDefaultInstance()) return this;
      if (other.hasAdGroupCriterion()) {
        bitField0_ |= 0x00000001;
        adGroupCriterion_ = other.adGroupCriterion_;
        onChanged();
      }
      if (other.hasInfo()) {
        mergeInfo(other.getInfo());
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
      com.google.ads.googleads.v10.common.Keyword parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.common.Keyword) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object adGroupCriterion_ = "";
    /**
     * <pre>
     * The AdGroupCriterion resource name.
     * </pre>
     *
     * <code>optional string ad_group_criterion = 3;</code>
     * @return Whether the adGroupCriterion field is set.
     */
    public boolean hasAdGroupCriterion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The AdGroupCriterion resource name.
     * </pre>
     *
     * <code>optional string ad_group_criterion = 3;</code>
     * @return The adGroupCriterion.
     */
    public java.lang.String getAdGroupCriterion() {
      java.lang.Object ref = adGroupCriterion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        adGroupCriterion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The AdGroupCriterion resource name.
     * </pre>
     *
     * <code>optional string ad_group_criterion = 3;</code>
     * @return The bytes for adGroupCriterion.
     */
    public com.google.protobuf.ByteString
        getAdGroupCriterionBytes() {
      java.lang.Object ref = adGroupCriterion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        adGroupCriterion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The AdGroupCriterion resource name.
     * </pre>
     *
     * <code>optional string ad_group_criterion = 3;</code>
     * @param value The adGroupCriterion to set.
     * @return This builder for chaining.
     */
    public Builder setAdGroupCriterion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      adGroupCriterion_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The AdGroupCriterion resource name.
     * </pre>
     *
     * <code>optional string ad_group_criterion = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAdGroupCriterion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      adGroupCriterion_ = getDefaultInstance().getAdGroupCriterion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The AdGroupCriterion resource name.
     * </pre>
     *
     * <code>optional string ad_group_criterion = 3;</code>
     * @param value The bytes for adGroupCriterion to set.
     * @return This builder for chaining.
     */
    public Builder setAdGroupCriterionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      adGroupCriterion_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v10.common.KeywordInfo info_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.common.KeywordInfo, com.google.ads.googleads.v10.common.KeywordInfo.Builder, com.google.ads.googleads.v10.common.KeywordInfoOrBuilder> infoBuilder_;
    /**
     * <pre>
     * Keyword info.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.KeywordInfo info = 2;</code>
     * @return Whether the info field is set.
     */
    public boolean hasInfo() {
      return infoBuilder_ != null || info_ != null;
    }
    /**
     * <pre>
     * Keyword info.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.KeywordInfo info = 2;</code>
     * @return The info.
     */
    public com.google.ads.googleads.v10.common.KeywordInfo getInfo() {
      if (infoBuilder_ == null) {
        return info_ == null ? com.google.ads.googleads.v10.common.KeywordInfo.getDefaultInstance() : info_;
      } else {
        return infoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Keyword info.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.KeywordInfo info = 2;</code>
     */
    public Builder setInfo(com.google.ads.googleads.v10.common.KeywordInfo value) {
      if (infoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        info_ = value;
        onChanged();
      } else {
        infoBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Keyword info.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.KeywordInfo info = 2;</code>
     */
    public Builder setInfo(
        com.google.ads.googleads.v10.common.KeywordInfo.Builder builderForValue) {
      if (infoBuilder_ == null) {
        info_ = builderForValue.build();
        onChanged();
      } else {
        infoBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Keyword info.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.KeywordInfo info = 2;</code>
     */
    public Builder mergeInfo(com.google.ads.googleads.v10.common.KeywordInfo value) {
      if (infoBuilder_ == null) {
        if (info_ != null) {
          info_ =
            com.google.ads.googleads.v10.common.KeywordInfo.newBuilder(info_).mergeFrom(value).buildPartial();
        } else {
          info_ = value;
        }
        onChanged();
      } else {
        infoBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Keyword info.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.KeywordInfo info = 2;</code>
     */
    public Builder clearInfo() {
      if (infoBuilder_ == null) {
        info_ = null;
        onChanged();
      } else {
        info_ = null;
        infoBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Keyword info.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.KeywordInfo info = 2;</code>
     */
    public com.google.ads.googleads.v10.common.KeywordInfo.Builder getInfoBuilder() {
      
      onChanged();
      return getInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Keyword info.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.KeywordInfo info = 2;</code>
     */
    public com.google.ads.googleads.v10.common.KeywordInfoOrBuilder getInfoOrBuilder() {
      if (infoBuilder_ != null) {
        return infoBuilder_.getMessageOrBuilder();
      } else {
        return info_ == null ?
            com.google.ads.googleads.v10.common.KeywordInfo.getDefaultInstance() : info_;
      }
    }
    /**
     * <pre>
     * Keyword info.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.KeywordInfo info = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.common.KeywordInfo, com.google.ads.googleads.v10.common.KeywordInfo.Builder, com.google.ads.googleads.v10.common.KeywordInfoOrBuilder> 
        getInfoFieldBuilder() {
      if (infoBuilder_ == null) {
        infoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v10.common.KeywordInfo, com.google.ads.googleads.v10.common.KeywordInfo.Builder, com.google.ads.googleads.v10.common.KeywordInfoOrBuilder>(
                getInfo(),
                getParentForChildren(),
                isClean());
        info_ = null;
      }
      return infoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.common.Keyword)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.common.Keyword)
  private static final com.google.ads.googleads.v10.common.Keyword DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.common.Keyword();
  }

  public static com.google.ads.googleads.v10.common.Keyword getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Keyword>
      PARSER = new com.google.protobuf.AbstractParser<Keyword>() {
    @java.lang.Override
    public Keyword parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Keyword(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Keyword> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Keyword> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.common.Keyword getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


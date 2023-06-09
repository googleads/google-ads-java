// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/ad_type_infos.proto

package com.google.ads.googleads.v12.common;

/**
 * <pre>
 * Representation of In-feed video ad format.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.common.InFeedVideoAdInfo}
 */
public final class InFeedVideoAdInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.common.InFeedVideoAdInfo)
    InFeedVideoAdInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InFeedVideoAdInfo.newBuilder() to construct.
  private InFeedVideoAdInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InFeedVideoAdInfo() {
    headline_ = "";
    description1_ = "";
    description2_ = "";
    thumbnail_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InFeedVideoAdInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.common.AdTypeInfosProto.internal_static_google_ads_googleads_v12_common_InFeedVideoAdInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.common.AdTypeInfosProto.internal_static_google_ads_googleads_v12_common_InFeedVideoAdInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.common.InFeedVideoAdInfo.class, com.google.ads.googleads.v12.common.InFeedVideoAdInfo.Builder.class);
  }

  public static final int HEADLINE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object headline_ = "";
  /**
   * <pre>
   * The headline of the ad.
   * </pre>
   *
   * <code>string headline = 1;</code>
   * @return The headline.
   */
  @java.lang.Override
  public java.lang.String getHeadline() {
    java.lang.Object ref = headline_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      headline_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The headline of the ad.
   * </pre>
   *
   * <code>string headline = 1;</code>
   * @return The bytes for headline.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHeadlineBytes() {
    java.lang.Object ref = headline_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      headline_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION1_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description1_ = "";
  /**
   * <pre>
   * First text line for the ad.
   * </pre>
   *
   * <code>string description1 = 2;</code>
   * @return The description1.
   */
  @java.lang.Override
  public java.lang.String getDescription1() {
    java.lang.Object ref = description1_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description1_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * First text line for the ad.
   * </pre>
   *
   * <code>string description1 = 2;</code>
   * @return The bytes for description1.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescription1Bytes() {
    java.lang.Object ref = description1_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description1_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION2_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description2_ = "";
  /**
   * <pre>
   * Second text line for the ad.
   * </pre>
   *
   * <code>string description2 = 3;</code>
   * @return The description2.
   */
  @java.lang.Override
  public java.lang.String getDescription2() {
    java.lang.Object ref = description2_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description2_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Second text line for the ad.
   * </pre>
   *
   * <code>string description2 = 3;</code>
   * @return The bytes for description2.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescription2Bytes() {
    java.lang.Object ref = description2_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description2_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int THUMBNAIL_FIELD_NUMBER = 4;
  private int thumbnail_ = 0;
  /**
   * <pre>
   * Video thumbnail image to use.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.VideoThumbnailEnum.VideoThumbnail thumbnail = 4;</code>
   * @return The enum numeric value on the wire for thumbnail.
   */
  @java.lang.Override public int getThumbnailValue() {
    return thumbnail_;
  }
  /**
   * <pre>
   * Video thumbnail image to use.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.VideoThumbnailEnum.VideoThumbnail thumbnail = 4;</code>
   * @return The thumbnail.
   */
  @java.lang.Override public com.google.ads.googleads.v12.enums.VideoThumbnailEnum.VideoThumbnail getThumbnail() {
    com.google.ads.googleads.v12.enums.VideoThumbnailEnum.VideoThumbnail result = com.google.ads.googleads.v12.enums.VideoThumbnailEnum.VideoThumbnail.forNumber(thumbnail_);
    return result == null ? com.google.ads.googleads.v12.enums.VideoThumbnailEnum.VideoThumbnail.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(headline_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, headline_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description1_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description1_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description2_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description2_);
    }
    if (thumbnail_ != com.google.ads.googleads.v12.enums.VideoThumbnailEnum.VideoThumbnail.UNSPECIFIED.getNumber()) {
      output.writeEnum(4, thumbnail_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(headline_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, headline_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description1_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description1_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description2_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description2_);
    }
    if (thumbnail_ != com.google.ads.googleads.v12.enums.VideoThumbnailEnum.VideoThumbnail.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, thumbnail_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.common.InFeedVideoAdInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.common.InFeedVideoAdInfo other = (com.google.ads.googleads.v12.common.InFeedVideoAdInfo) obj;

    if (!getHeadline()
        .equals(other.getHeadline())) return false;
    if (!getDescription1()
        .equals(other.getDescription1())) return false;
    if (!getDescription2()
        .equals(other.getDescription2())) return false;
    if (thumbnail_ != other.thumbnail_) return false;
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
    hash = (37 * hash) + HEADLINE_FIELD_NUMBER;
    hash = (53 * hash) + getHeadline().hashCode();
    hash = (37 * hash) + DESCRIPTION1_FIELD_NUMBER;
    hash = (53 * hash) + getDescription1().hashCode();
    hash = (37 * hash) + DESCRIPTION2_FIELD_NUMBER;
    hash = (53 * hash) + getDescription2().hashCode();
    hash = (37 * hash) + THUMBNAIL_FIELD_NUMBER;
    hash = (53 * hash) + thumbnail_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.common.InFeedVideoAdInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.InFeedVideoAdInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.InFeedVideoAdInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.InFeedVideoAdInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.InFeedVideoAdInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.InFeedVideoAdInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.InFeedVideoAdInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.InFeedVideoAdInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v12.common.InFeedVideoAdInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v12.common.InFeedVideoAdInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.InFeedVideoAdInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.InFeedVideoAdInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.common.InFeedVideoAdInfo prototype) {
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
   * Representation of In-feed video ad format.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.common.InFeedVideoAdInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.common.InFeedVideoAdInfo)
      com.google.ads.googleads.v12.common.InFeedVideoAdInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.common.AdTypeInfosProto.internal_static_google_ads_googleads_v12_common_InFeedVideoAdInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.common.AdTypeInfosProto.internal_static_google_ads_googleads_v12_common_InFeedVideoAdInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.common.InFeedVideoAdInfo.class, com.google.ads.googleads.v12.common.InFeedVideoAdInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.common.InFeedVideoAdInfo.newBuilder()
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
      headline_ = "";
      description1_ = "";
      description2_ = "";
      thumbnail_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.common.AdTypeInfosProto.internal_static_google_ads_googleads_v12_common_InFeedVideoAdInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.InFeedVideoAdInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.common.InFeedVideoAdInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.InFeedVideoAdInfo build() {
      com.google.ads.googleads.v12.common.InFeedVideoAdInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.InFeedVideoAdInfo buildPartial() {
      com.google.ads.googleads.v12.common.InFeedVideoAdInfo result = new com.google.ads.googleads.v12.common.InFeedVideoAdInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.common.InFeedVideoAdInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.headline_ = headline_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.description1_ = description1_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.description2_ = description2_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.thumbnail_ = thumbnail_;
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
      if (other instanceof com.google.ads.googleads.v12.common.InFeedVideoAdInfo) {
        return mergeFrom((com.google.ads.googleads.v12.common.InFeedVideoAdInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.common.InFeedVideoAdInfo other) {
      if (other == com.google.ads.googleads.v12.common.InFeedVideoAdInfo.getDefaultInstance()) return this;
      if (!other.getHeadline().isEmpty()) {
        headline_ = other.headline_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDescription1().isEmpty()) {
        description1_ = other.description1_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDescription2().isEmpty()) {
        description2_ = other.description2_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.thumbnail_ != 0) {
        setThumbnailValue(other.getThumbnailValue());
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
              headline_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              description1_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              description2_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              thumbnail_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object headline_ = "";
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>string headline = 1;</code>
     * @return The headline.
     */
    public java.lang.String getHeadline() {
      java.lang.Object ref = headline_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        headline_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>string headline = 1;</code>
     * @return The bytes for headline.
     */
    public com.google.protobuf.ByteString
        getHeadlineBytes() {
      java.lang.Object ref = headline_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        headline_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>string headline = 1;</code>
     * @param value The headline to set.
     * @return This builder for chaining.
     */
    public Builder setHeadline(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      headline_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>string headline = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeadline() {
      headline_ = getDefaultInstance().getHeadline();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The headline of the ad.
     * </pre>
     *
     * <code>string headline = 1;</code>
     * @param value The bytes for headline to set.
     * @return This builder for chaining.
     */
    public Builder setHeadlineBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      headline_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object description1_ = "";
    /**
     * <pre>
     * First text line for the ad.
     * </pre>
     *
     * <code>string description1 = 2;</code>
     * @return The description1.
     */
    public java.lang.String getDescription1() {
      java.lang.Object ref = description1_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description1_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * First text line for the ad.
     * </pre>
     *
     * <code>string description1 = 2;</code>
     * @return The bytes for description1.
     */
    public com.google.protobuf.ByteString
        getDescription1Bytes() {
      java.lang.Object ref = description1_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description1_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * First text line for the ad.
     * </pre>
     *
     * <code>string description1 = 2;</code>
     * @param value The description1 to set.
     * @return This builder for chaining.
     */
    public Builder setDescription1(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description1_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * First text line for the ad.
     * </pre>
     *
     * <code>string description1 = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription1() {
      description1_ = getDefaultInstance().getDescription1();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * First text line for the ad.
     * </pre>
     *
     * <code>string description1 = 2;</code>
     * @param value The bytes for description1 to set.
     * @return This builder for chaining.
     */
    public Builder setDescription1Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description1_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object description2_ = "";
    /**
     * <pre>
     * Second text line for the ad.
     * </pre>
     *
     * <code>string description2 = 3;</code>
     * @return The description2.
     */
    public java.lang.String getDescription2() {
      java.lang.Object ref = description2_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description2_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Second text line for the ad.
     * </pre>
     *
     * <code>string description2 = 3;</code>
     * @return The bytes for description2.
     */
    public com.google.protobuf.ByteString
        getDescription2Bytes() {
      java.lang.Object ref = description2_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description2_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Second text line for the ad.
     * </pre>
     *
     * <code>string description2 = 3;</code>
     * @param value The description2 to set.
     * @return This builder for chaining.
     */
    public Builder setDescription2(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description2_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Second text line for the ad.
     * </pre>
     *
     * <code>string description2 = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription2() {
      description2_ = getDefaultInstance().getDescription2();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Second text line for the ad.
     * </pre>
     *
     * <code>string description2 = 3;</code>
     * @param value The bytes for description2 to set.
     * @return This builder for chaining.
     */
    public Builder setDescription2Bytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description2_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int thumbnail_ = 0;
    /**
     * <pre>
     * Video thumbnail image to use.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.VideoThumbnailEnum.VideoThumbnail thumbnail = 4;</code>
     * @return The enum numeric value on the wire for thumbnail.
     */
    @java.lang.Override public int getThumbnailValue() {
      return thumbnail_;
    }
    /**
     * <pre>
     * Video thumbnail image to use.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.VideoThumbnailEnum.VideoThumbnail thumbnail = 4;</code>
     * @param value The enum numeric value on the wire for thumbnail to set.
     * @return This builder for chaining.
     */
    public Builder setThumbnailValue(int value) {
      thumbnail_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Video thumbnail image to use.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.VideoThumbnailEnum.VideoThumbnail thumbnail = 4;</code>
     * @return The thumbnail.
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.enums.VideoThumbnailEnum.VideoThumbnail getThumbnail() {
      com.google.ads.googleads.v12.enums.VideoThumbnailEnum.VideoThumbnail result = com.google.ads.googleads.v12.enums.VideoThumbnailEnum.VideoThumbnail.forNumber(thumbnail_);
      return result == null ? com.google.ads.googleads.v12.enums.VideoThumbnailEnum.VideoThumbnail.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Video thumbnail image to use.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.VideoThumbnailEnum.VideoThumbnail thumbnail = 4;</code>
     * @param value The thumbnail to set.
     * @return This builder for chaining.
     */
    public Builder setThumbnail(com.google.ads.googleads.v12.enums.VideoThumbnailEnum.VideoThumbnail value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      thumbnail_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Video thumbnail image to use.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.VideoThumbnailEnum.VideoThumbnail thumbnail = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearThumbnail() {
      bitField0_ = (bitField0_ & ~0x00000008);
      thumbnail_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.common.InFeedVideoAdInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.common.InFeedVideoAdInfo)
  private static final com.google.ads.googleads.v12.common.InFeedVideoAdInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.common.InFeedVideoAdInfo();
  }

  public static com.google.ads.googleads.v12.common.InFeedVideoAdInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InFeedVideoAdInfo>
      PARSER = new com.google.protobuf.AbstractParser<InFeedVideoAdInfo>() {
    @java.lang.Override
    public InFeedVideoAdInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<InFeedVideoAdInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InFeedVideoAdInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.common.InFeedVideoAdInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


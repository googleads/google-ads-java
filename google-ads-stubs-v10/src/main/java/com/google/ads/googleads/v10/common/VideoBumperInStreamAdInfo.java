// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/ad_type_infos.proto

package com.google.ads.googleads.v10.common;

/**
 * <pre>
 * Representation of video bumper in-stream ad format (very short in-stream
 * non-skippable video ad).
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.common.VideoBumperInStreamAdInfo}
 */
public final class VideoBumperInStreamAdInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.common.VideoBumperInStreamAdInfo)
    VideoBumperInStreamAdInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VideoBumperInStreamAdInfo.newBuilder() to construct.
  private VideoBumperInStreamAdInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VideoBumperInStreamAdInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VideoBumperInStreamAdInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VideoBumperInStreamAdInfo(
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
          case 26: {
            com.google.ads.googleads.v10.common.AdImageAsset.Builder subBuilder = null;
            if (companionBanner_ != null) {
              subBuilder = companionBanner_.toBuilder();
            }
            companionBanner_ = input.readMessage(com.google.ads.googleads.v10.common.AdImageAsset.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(companionBanner_);
              companionBanner_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v10.common.AdTypeInfosProto.internal_static_google_ads_googleads_v10_common_VideoBumperInStreamAdInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.common.AdTypeInfosProto.internal_static_google_ads_googleads_v10_common_VideoBumperInStreamAdInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo.class, com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo.Builder.class);
  }

  public static final int COMPANION_BANNER_FIELD_NUMBER = 3;
  private com.google.ads.googleads.v10.common.AdImageAsset companionBanner_;
  /**
   * <pre>
   * The image assets of the companion banner used with the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.AdImageAsset companion_banner = 3;</code>
   * @return Whether the companionBanner field is set.
   */
  @java.lang.Override
  public boolean hasCompanionBanner() {
    return companionBanner_ != null;
  }
  /**
   * <pre>
   * The image assets of the companion banner used with the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.AdImageAsset companion_banner = 3;</code>
   * @return The companionBanner.
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.common.AdImageAsset getCompanionBanner() {
    return companionBanner_ == null ? com.google.ads.googleads.v10.common.AdImageAsset.getDefaultInstance() : companionBanner_;
  }
  /**
   * <pre>
   * The image assets of the companion banner used with the ad.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.AdImageAsset companion_banner = 3;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.common.AdImageAssetOrBuilder getCompanionBannerOrBuilder() {
    return getCompanionBanner();
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
    if (companionBanner_ != null) {
      output.writeMessage(3, getCompanionBanner());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (companionBanner_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCompanionBanner());
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
    if (!(obj instanceof com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo other = (com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo) obj;

    if (hasCompanionBanner() != other.hasCompanionBanner()) return false;
    if (hasCompanionBanner()) {
      if (!getCompanionBanner()
          .equals(other.getCompanionBanner())) return false;
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
    if (hasCompanionBanner()) {
      hash = (37 * hash) + COMPANION_BANNER_FIELD_NUMBER;
      hash = (53 * hash) + getCompanionBanner().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo prototype) {
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
   * Representation of video bumper in-stream ad format (very short in-stream
   * non-skippable video ad).
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.common.VideoBumperInStreamAdInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.common.VideoBumperInStreamAdInfo)
      com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.common.AdTypeInfosProto.internal_static_google_ads_googleads_v10_common_VideoBumperInStreamAdInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.common.AdTypeInfosProto.internal_static_google_ads_googleads_v10_common_VideoBumperInStreamAdInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo.class, com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo.newBuilder()
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
      if (companionBannerBuilder_ == null) {
        companionBanner_ = null;
      } else {
        companionBanner_ = null;
        companionBannerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.common.AdTypeInfosProto.internal_static_google_ads_googleads_v10_common_VideoBumperInStreamAdInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo build() {
      com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo buildPartial() {
      com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo result = new com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo(this);
      if (companionBannerBuilder_ == null) {
        result.companionBanner_ = companionBanner_;
      } else {
        result.companionBanner_ = companionBannerBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo) {
        return mergeFrom((com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo other) {
      if (other == com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo.getDefaultInstance()) return this;
      if (other.hasCompanionBanner()) {
        mergeCompanionBanner(other.getCompanionBanner());
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
      com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.ads.googleads.v10.common.AdImageAsset companionBanner_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.common.AdImageAsset, com.google.ads.googleads.v10.common.AdImageAsset.Builder, com.google.ads.googleads.v10.common.AdImageAssetOrBuilder> companionBannerBuilder_;
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.AdImageAsset companion_banner = 3;</code>
     * @return Whether the companionBanner field is set.
     */
    public boolean hasCompanionBanner() {
      return companionBannerBuilder_ != null || companionBanner_ != null;
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.AdImageAsset companion_banner = 3;</code>
     * @return The companionBanner.
     */
    public com.google.ads.googleads.v10.common.AdImageAsset getCompanionBanner() {
      if (companionBannerBuilder_ == null) {
        return companionBanner_ == null ? com.google.ads.googleads.v10.common.AdImageAsset.getDefaultInstance() : companionBanner_;
      } else {
        return companionBannerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.AdImageAsset companion_banner = 3;</code>
     */
    public Builder setCompanionBanner(com.google.ads.googleads.v10.common.AdImageAsset value) {
      if (companionBannerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        companionBanner_ = value;
        onChanged();
      } else {
        companionBannerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.AdImageAsset companion_banner = 3;</code>
     */
    public Builder setCompanionBanner(
        com.google.ads.googleads.v10.common.AdImageAsset.Builder builderForValue) {
      if (companionBannerBuilder_ == null) {
        companionBanner_ = builderForValue.build();
        onChanged();
      } else {
        companionBannerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.AdImageAsset companion_banner = 3;</code>
     */
    public Builder mergeCompanionBanner(com.google.ads.googleads.v10.common.AdImageAsset value) {
      if (companionBannerBuilder_ == null) {
        if (companionBanner_ != null) {
          companionBanner_ =
            com.google.ads.googleads.v10.common.AdImageAsset.newBuilder(companionBanner_).mergeFrom(value).buildPartial();
        } else {
          companionBanner_ = value;
        }
        onChanged();
      } else {
        companionBannerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.AdImageAsset companion_banner = 3;</code>
     */
    public Builder clearCompanionBanner() {
      if (companionBannerBuilder_ == null) {
        companionBanner_ = null;
        onChanged();
      } else {
        companionBanner_ = null;
        companionBannerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.AdImageAsset companion_banner = 3;</code>
     */
    public com.google.ads.googleads.v10.common.AdImageAsset.Builder getCompanionBannerBuilder() {
      
      onChanged();
      return getCompanionBannerFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.AdImageAsset companion_banner = 3;</code>
     */
    public com.google.ads.googleads.v10.common.AdImageAssetOrBuilder getCompanionBannerOrBuilder() {
      if (companionBannerBuilder_ != null) {
        return companionBannerBuilder_.getMessageOrBuilder();
      } else {
        return companionBanner_ == null ?
            com.google.ads.googleads.v10.common.AdImageAsset.getDefaultInstance() : companionBanner_;
      }
    }
    /**
     * <pre>
     * The image assets of the companion banner used with the ad.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.AdImageAsset companion_banner = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.common.AdImageAsset, com.google.ads.googleads.v10.common.AdImageAsset.Builder, com.google.ads.googleads.v10.common.AdImageAssetOrBuilder> 
        getCompanionBannerFieldBuilder() {
      if (companionBannerBuilder_ == null) {
        companionBannerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v10.common.AdImageAsset, com.google.ads.googleads.v10.common.AdImageAsset.Builder, com.google.ads.googleads.v10.common.AdImageAssetOrBuilder>(
                getCompanionBanner(),
                getParentForChildren(),
                isClean());
        companionBanner_ = null;
      }
      return companionBannerBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.common.VideoBumperInStreamAdInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.common.VideoBumperInStreamAdInfo)
  private static final com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo();
  }

  public static com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VideoBumperInStreamAdInfo>
      PARSER = new com.google.protobuf.AbstractParser<VideoBumperInStreamAdInfo>() {
    @java.lang.Override
    public VideoBumperInStreamAdInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VideoBumperInStreamAdInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VideoBumperInStreamAdInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VideoBumperInStreamAdInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.common.VideoBumperInStreamAdInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


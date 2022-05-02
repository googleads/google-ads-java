// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/ad_type_infos.proto

package com.google.ads.googleads.v10.common;

/**
 * <pre>
 * Specification for various creative controls for a responsive display ad.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec}
 */
public final class ResponsiveDisplayAdControlSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec)
    ResponsiveDisplayAdControlSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResponsiveDisplayAdControlSpec.newBuilder() to construct.
  private ResponsiveDisplayAdControlSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResponsiveDisplayAdControlSpec() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResponsiveDisplayAdControlSpec();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResponsiveDisplayAdControlSpec(
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
          case 8: {

            enableAssetEnhancements_ = input.readBool();
            break;
          }
          case 16: {

            enableAutogenVideo_ = input.readBool();
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
    return com.google.ads.googleads.v10.common.AdTypeInfosProto.internal_static_google_ads_googleads_v10_common_ResponsiveDisplayAdControlSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.common.AdTypeInfosProto.internal_static_google_ads_googleads_v10_common_ResponsiveDisplayAdControlSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec.class, com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec.Builder.class);
  }

  public static final int ENABLE_ASSET_ENHANCEMENTS_FIELD_NUMBER = 1;
  private boolean enableAssetEnhancements_;
  /**
   * <pre>
   * Whether the advertiser has opted into the asset enhancements feature.
   * </pre>
   *
   * <code>bool enable_asset_enhancements = 1;</code>
   * @return The enableAssetEnhancements.
   */
  @java.lang.Override
  public boolean getEnableAssetEnhancements() {
    return enableAssetEnhancements_;
  }

  public static final int ENABLE_AUTOGEN_VIDEO_FIELD_NUMBER = 2;
  private boolean enableAutogenVideo_;
  /**
   * <pre>
   * Whether the advertiser has opted into auto-gen video feature.
   * </pre>
   *
   * <code>bool enable_autogen_video = 2;</code>
   * @return The enableAutogenVideo.
   */
  @java.lang.Override
  public boolean getEnableAutogenVideo() {
    return enableAutogenVideo_;
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
    if (enableAssetEnhancements_ != false) {
      output.writeBool(1, enableAssetEnhancements_);
    }
    if (enableAutogenVideo_ != false) {
      output.writeBool(2, enableAutogenVideo_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableAssetEnhancements_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enableAssetEnhancements_);
    }
    if (enableAutogenVideo_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, enableAutogenVideo_);
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
    if (!(obj instanceof com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec other = (com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec) obj;

    if (getEnableAssetEnhancements()
        != other.getEnableAssetEnhancements()) return false;
    if (getEnableAutogenVideo()
        != other.getEnableAutogenVideo()) return false;
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
    hash = (37 * hash) + ENABLE_ASSET_ENHANCEMENTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableAssetEnhancements());
    hash = (37 * hash) + ENABLE_AUTOGEN_VIDEO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnableAutogenVideo());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec prototype) {
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
   * Specification for various creative controls for a responsive display ad.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec)
      com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.common.AdTypeInfosProto.internal_static_google_ads_googleads_v10_common_ResponsiveDisplayAdControlSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.common.AdTypeInfosProto.internal_static_google_ads_googleads_v10_common_ResponsiveDisplayAdControlSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec.class, com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec.newBuilder()
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
      enableAssetEnhancements_ = false;

      enableAutogenVideo_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.common.AdTypeInfosProto.internal_static_google_ads_googleads_v10_common_ResponsiveDisplayAdControlSpec_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec build() {
      com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec buildPartial() {
      com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec result = new com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec(this);
      result.enableAssetEnhancements_ = enableAssetEnhancements_;
      result.enableAutogenVideo_ = enableAutogenVideo_;
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
      if (other instanceof com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec) {
        return mergeFrom((com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec other) {
      if (other == com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec.getDefaultInstance()) return this;
      if (other.getEnableAssetEnhancements() != false) {
        setEnableAssetEnhancements(other.getEnableAssetEnhancements());
      }
      if (other.getEnableAutogenVideo() != false) {
        setEnableAutogenVideo(other.getEnableAutogenVideo());
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
      com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean enableAssetEnhancements_ ;
    /**
     * <pre>
     * Whether the advertiser has opted into the asset enhancements feature.
     * </pre>
     *
     * <code>bool enable_asset_enhancements = 1;</code>
     * @return The enableAssetEnhancements.
     */
    @java.lang.Override
    public boolean getEnableAssetEnhancements() {
      return enableAssetEnhancements_;
    }
    /**
     * <pre>
     * Whether the advertiser has opted into the asset enhancements feature.
     * </pre>
     *
     * <code>bool enable_asset_enhancements = 1;</code>
     * @param value The enableAssetEnhancements to set.
     * @return This builder for chaining.
     */
    public Builder setEnableAssetEnhancements(boolean value) {
      
      enableAssetEnhancements_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether the advertiser has opted into the asset enhancements feature.
     * </pre>
     *
     * <code>bool enable_asset_enhancements = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableAssetEnhancements() {
      
      enableAssetEnhancements_ = false;
      onChanged();
      return this;
    }

    private boolean enableAutogenVideo_ ;
    /**
     * <pre>
     * Whether the advertiser has opted into auto-gen video feature.
     * </pre>
     *
     * <code>bool enable_autogen_video = 2;</code>
     * @return The enableAutogenVideo.
     */
    @java.lang.Override
    public boolean getEnableAutogenVideo() {
      return enableAutogenVideo_;
    }
    /**
     * <pre>
     * Whether the advertiser has opted into auto-gen video feature.
     * </pre>
     *
     * <code>bool enable_autogen_video = 2;</code>
     * @param value The enableAutogenVideo to set.
     * @return This builder for chaining.
     */
    public Builder setEnableAutogenVideo(boolean value) {
      
      enableAutogenVideo_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether the advertiser has opted into auto-gen video feature.
     * </pre>
     *
     * <code>bool enable_autogen_video = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnableAutogenVideo() {
      
      enableAutogenVideo_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec)
  private static final com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec();
  }

  public static com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResponsiveDisplayAdControlSpec>
      PARSER = new com.google.protobuf.AbstractParser<ResponsiveDisplayAdControlSpec>() {
    @java.lang.Override
    public ResponsiveDisplayAdControlSpec parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResponsiveDisplayAdControlSpec(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResponsiveDisplayAdControlSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResponsiveDisplayAdControlSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.common.ResponsiveDisplayAdControlSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


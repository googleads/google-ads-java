// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/asset.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.resources;

/**
 * <pre>
 * Contains policy information for an asset under AssetFieldType context.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.resources.AssetFieldTypePolicySummary}
 */
public final class AssetFieldTypePolicySummary extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.resources.AssetFieldTypePolicySummary)
    AssetFieldTypePolicySummaryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetFieldTypePolicySummary.newBuilder() to construct.
  private AssetFieldTypePolicySummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetFieldTypePolicySummary() {
    assetFieldType_ = 0;
    assetSource_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetFieldTypePolicySummary();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.resources.AssetProto.internal_static_google_ads_googleads_v16_resources_AssetFieldTypePolicySummary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.resources.AssetProto.internal_static_google_ads_googleads_v16_resources_AssetFieldTypePolicySummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary.class, com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary.Builder.class);
  }

  private int bitField0_;
  public static final int ASSET_FIELD_TYPE_FIELD_NUMBER = 1;
  private int assetFieldType_ = 0;
  /**
   * <pre>
   * Output only. FieldType of this asset.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the assetFieldType field is set.
   */
  @java.lang.Override public boolean hasAssetFieldType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Output only. FieldType of this asset.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for assetFieldType.
   */
  @java.lang.Override public int getAssetFieldTypeValue() {
    return assetFieldType_;
  }
  /**
   * <pre>
   * Output only. FieldType of this asset.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The assetFieldType.
   */
  @java.lang.Override public com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType getAssetFieldType() {
    com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType result = com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType.forNumber(assetFieldType_);
    return result == null ? com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType.UNRECOGNIZED : result;
  }

  public static final int ASSET_SOURCE_FIELD_NUMBER = 2;
  private int assetSource_ = 0;
  /**
   * <pre>
   * Output only. Source of this asset.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource asset_source = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the assetSource field is set.
   */
  @java.lang.Override public boolean hasAssetSource() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Output only. Source of this asset.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource asset_source = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for assetSource.
   */
  @java.lang.Override public int getAssetSourceValue() {
    return assetSource_;
  }
  /**
   * <pre>
   * Output only. Source of this asset.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource asset_source = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The assetSource.
   */
  @java.lang.Override public com.google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource getAssetSource() {
    com.google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource result = com.google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource.forNumber(assetSource_);
    return result == null ? com.google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource.UNRECOGNIZED : result;
  }

  public static final int POLICY_SUMMARY_INFO_FIELD_NUMBER = 3;
  private com.google.ads.googleads.v16.resources.AssetPolicySummary policySummaryInfo_;
  /**
   * <pre>
   * Output only. Policy summary.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.resources.AssetPolicySummary policy_summary_info = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the policySummaryInfo field is set.
   */
  @java.lang.Override
  public boolean hasPolicySummaryInfo() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Output only. Policy summary.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.resources.AssetPolicySummary policy_summary_info = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The policySummaryInfo.
   */
  @java.lang.Override
  public com.google.ads.googleads.v16.resources.AssetPolicySummary getPolicySummaryInfo() {
    return policySummaryInfo_ == null ? com.google.ads.googleads.v16.resources.AssetPolicySummary.getDefaultInstance() : policySummaryInfo_;
  }
  /**
   * <pre>
   * Output only. Policy summary.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.resources.AssetPolicySummary policy_summary_info = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v16.resources.AssetPolicySummaryOrBuilder getPolicySummaryInfoOrBuilder() {
    return policySummaryInfo_ == null ? com.google.ads.googleads.v16.resources.AssetPolicySummary.getDefaultInstance() : policySummaryInfo_;
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
      output.writeEnum(1, assetFieldType_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, assetSource_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(3, getPolicySummaryInfo());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, assetFieldType_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, assetSource_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPolicySummaryInfo());
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
    if (!(obj instanceof com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary other = (com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary) obj;

    if (hasAssetFieldType() != other.hasAssetFieldType()) return false;
    if (hasAssetFieldType()) {
      if (assetFieldType_ != other.assetFieldType_) return false;
    }
    if (hasAssetSource() != other.hasAssetSource()) return false;
    if (hasAssetSource()) {
      if (assetSource_ != other.assetSource_) return false;
    }
    if (hasPolicySummaryInfo() != other.hasPolicySummaryInfo()) return false;
    if (hasPolicySummaryInfo()) {
      if (!getPolicySummaryInfo()
          .equals(other.getPolicySummaryInfo())) return false;
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
    if (hasAssetFieldType()) {
      hash = (37 * hash) + ASSET_FIELD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + assetFieldType_;
    }
    if (hasAssetSource()) {
      hash = (37 * hash) + ASSET_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + assetSource_;
    }
    if (hasPolicySummaryInfo()) {
      hash = (37 * hash) + POLICY_SUMMARY_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getPolicySummaryInfo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary prototype) {
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
   * Contains policy information for an asset under AssetFieldType context.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.resources.AssetFieldTypePolicySummary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.resources.AssetFieldTypePolicySummary)
      com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.resources.AssetProto.internal_static_google_ads_googleads_v16_resources_AssetFieldTypePolicySummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.resources.AssetProto.internal_static_google_ads_googleads_v16_resources_AssetFieldTypePolicySummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary.class, com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary.newBuilder()
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
        getPolicySummaryInfoFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      assetFieldType_ = 0;
      assetSource_ = 0;
      policySummaryInfo_ = null;
      if (policySummaryInfoBuilder_ != null) {
        policySummaryInfoBuilder_.dispose();
        policySummaryInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.resources.AssetProto.internal_static_google_ads_googleads_v16_resources_AssetFieldTypePolicySummary_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary build() {
      com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary buildPartial() {
      com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary result = new com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.assetFieldType_ = assetFieldType_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.assetSource_ = assetSource_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.policySummaryInfo_ = policySummaryInfoBuilder_ == null
            ? policySummaryInfo_
            : policySummaryInfoBuilder_.build();
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary) {
        return mergeFrom((com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary other) {
      if (other == com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary.getDefaultInstance()) return this;
      if (other.hasAssetFieldType()) {
        setAssetFieldType(other.getAssetFieldType());
      }
      if (other.hasAssetSource()) {
        setAssetSource(other.getAssetSource());
      }
      if (other.hasPolicySummaryInfo()) {
        mergePolicySummaryInfo(other.getPolicySummaryInfo());
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
            case 8: {
              assetFieldType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              assetSource_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getPolicySummaryInfoFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private int assetFieldType_ = 0;
    /**
     * <pre>
     * Output only. FieldType of this asset.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the assetFieldType field is set.
     */
    @java.lang.Override public boolean hasAssetFieldType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Output only. FieldType of this asset.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The enum numeric value on the wire for assetFieldType.
     */
    @java.lang.Override public int getAssetFieldTypeValue() {
      return assetFieldType_;
    }
    /**
     * <pre>
     * Output only. FieldType of this asset.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The enum numeric value on the wire for assetFieldType to set.
     * @return This builder for chaining.
     */
    public Builder setAssetFieldTypeValue(int value) {
      assetFieldType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. FieldType of this asset.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The assetFieldType.
     */
    @java.lang.Override
    public com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType getAssetFieldType() {
      com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType result = com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType.forNumber(assetFieldType_);
      return result == null ? com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Output only. FieldType of this asset.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The assetFieldType to set.
     * @return This builder for chaining.
     */
    public Builder setAssetFieldType(com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      assetFieldType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. FieldType of this asset.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType asset_field_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearAssetFieldType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      assetFieldType_ = 0;
      onChanged();
      return this;
    }

    private int assetSource_ = 0;
    /**
     * <pre>
     * Output only. Source of this asset.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource asset_source = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the assetSource field is set.
     */
    @java.lang.Override public boolean hasAssetSource() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Output only. Source of this asset.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource asset_source = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The enum numeric value on the wire for assetSource.
     */
    @java.lang.Override public int getAssetSourceValue() {
      return assetSource_;
    }
    /**
     * <pre>
     * Output only. Source of this asset.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource asset_source = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The enum numeric value on the wire for assetSource to set.
     * @return This builder for chaining.
     */
    public Builder setAssetSourceValue(int value) {
      assetSource_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Source of this asset.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource asset_source = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The assetSource.
     */
    @java.lang.Override
    public com.google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource getAssetSource() {
      com.google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource result = com.google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource.forNumber(assetSource_);
      return result == null ? com.google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Output only. Source of this asset.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource asset_source = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The assetSource to set.
     * @return This builder for chaining.
     */
    public Builder setAssetSource(com.google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      assetSource_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Source of this asset.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v16.enums.AssetSourceEnum.AssetSource asset_source = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearAssetSource() {
      bitField0_ = (bitField0_ & ~0x00000002);
      assetSource_ = 0;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v16.resources.AssetPolicySummary policySummaryInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v16.resources.AssetPolicySummary, com.google.ads.googleads.v16.resources.AssetPolicySummary.Builder, com.google.ads.googleads.v16.resources.AssetPolicySummaryOrBuilder> policySummaryInfoBuilder_;
    /**
     * <pre>
     * Output only. Policy summary.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v16.resources.AssetPolicySummary policy_summary_info = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the policySummaryInfo field is set.
     */
    public boolean hasPolicySummaryInfo() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Output only. Policy summary.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v16.resources.AssetPolicySummary policy_summary_info = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The policySummaryInfo.
     */
    public com.google.ads.googleads.v16.resources.AssetPolicySummary getPolicySummaryInfo() {
      if (policySummaryInfoBuilder_ == null) {
        return policySummaryInfo_ == null ? com.google.ads.googleads.v16.resources.AssetPolicySummary.getDefaultInstance() : policySummaryInfo_;
      } else {
        return policySummaryInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. Policy summary.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v16.resources.AssetPolicySummary policy_summary_info = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setPolicySummaryInfo(com.google.ads.googleads.v16.resources.AssetPolicySummary value) {
      if (policySummaryInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        policySummaryInfo_ = value;
      } else {
        policySummaryInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Policy summary.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v16.resources.AssetPolicySummary policy_summary_info = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setPolicySummaryInfo(
        com.google.ads.googleads.v16.resources.AssetPolicySummary.Builder builderForValue) {
      if (policySummaryInfoBuilder_ == null) {
        policySummaryInfo_ = builderForValue.build();
      } else {
        policySummaryInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Policy summary.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v16.resources.AssetPolicySummary policy_summary_info = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergePolicySummaryInfo(com.google.ads.googleads.v16.resources.AssetPolicySummary value) {
      if (policySummaryInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          policySummaryInfo_ != null &&
          policySummaryInfo_ != com.google.ads.googleads.v16.resources.AssetPolicySummary.getDefaultInstance()) {
          getPolicySummaryInfoBuilder().mergeFrom(value);
        } else {
          policySummaryInfo_ = value;
        }
      } else {
        policySummaryInfoBuilder_.mergeFrom(value);
      }
      if (policySummaryInfo_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Output only. Policy summary.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v16.resources.AssetPolicySummary policy_summary_info = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearPolicySummaryInfo() {
      bitField0_ = (bitField0_ & ~0x00000004);
      policySummaryInfo_ = null;
      if (policySummaryInfoBuilder_ != null) {
        policySummaryInfoBuilder_.dispose();
        policySummaryInfoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Policy summary.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v16.resources.AssetPolicySummary policy_summary_info = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.ads.googleads.v16.resources.AssetPolicySummary.Builder getPolicySummaryInfoBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPolicySummaryInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. Policy summary.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v16.resources.AssetPolicySummary policy_summary_info = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.ads.googleads.v16.resources.AssetPolicySummaryOrBuilder getPolicySummaryInfoOrBuilder() {
      if (policySummaryInfoBuilder_ != null) {
        return policySummaryInfoBuilder_.getMessageOrBuilder();
      } else {
        return policySummaryInfo_ == null ?
            com.google.ads.googleads.v16.resources.AssetPolicySummary.getDefaultInstance() : policySummaryInfo_;
      }
    }
    /**
     * <pre>
     * Output only. Policy summary.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v16.resources.AssetPolicySummary policy_summary_info = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v16.resources.AssetPolicySummary, com.google.ads.googleads.v16.resources.AssetPolicySummary.Builder, com.google.ads.googleads.v16.resources.AssetPolicySummaryOrBuilder> 
        getPolicySummaryInfoFieldBuilder() {
      if (policySummaryInfoBuilder_ == null) {
        policySummaryInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v16.resources.AssetPolicySummary, com.google.ads.googleads.v16.resources.AssetPolicySummary.Builder, com.google.ads.googleads.v16.resources.AssetPolicySummaryOrBuilder>(
                getPolicySummaryInfo(),
                getParentForChildren(),
                isClean());
        policySummaryInfo_ = null;
      }
      return policySummaryInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.resources.AssetFieldTypePolicySummary)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.resources.AssetFieldTypePolicySummary)
  private static final com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary();
  }

  public static com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetFieldTypePolicySummary>
      PARSER = new com.google.protobuf.AbstractParser<AssetFieldTypePolicySummary>() {
    @java.lang.Override
    public AssetFieldTypePolicySummary parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssetFieldTypePolicySummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetFieldTypePolicySummary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.resources.AssetFieldTypePolicySummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


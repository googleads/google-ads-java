// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/asset_group_signal.proto

package com.google.ads.googleads.v13.resources;

/**
 * <pre>
 * AssetGroupSignal represents a signal in an asset group. The existence of a
 * signal tells the performance max campaign who's most likely to convert.
 * Performance Max uses the signal to look for new people with similar or
 * stronger intent to find conversions across Search, Display, Video, and more.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v13.resources.AssetGroupSignal}
 */
public final class AssetGroupSignal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v13.resources.AssetGroupSignal)
    AssetGroupSignalOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetGroupSignal.newBuilder() to construct.
  private AssetGroupSignal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetGroupSignal() {
    resourceName_ = "";
    assetGroup_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetGroupSignal();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v13.resources.AssetGroupSignalProto.internal_static_google_ads_googleads_v13_resources_AssetGroupSignal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v13.resources.AssetGroupSignalProto.internal_static_google_ads_googleads_v13_resources_AssetGroupSignal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v13.resources.AssetGroupSignal.class, com.google.ads.googleads.v13.resources.AssetGroupSignal.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceName_ = "";
  /**
   * <pre>
   * Immutable. The resource name of the asset group signal.
   * Asset group signal resource name have the form:
   *
   * `customers/{customer_id}/assetGroupSignals/{asset_group_id}~{signal_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Immutable. The resource name of the asset group signal.
   * Asset group signal resource name have the form:
   *
   * `customers/{customer_id}/assetGroupSignals/{asset_group_id}~{signal_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSET_GROUP_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object assetGroup_ = "";
  /**
   * <pre>
   * Immutable. The asset group which this asset group signal belongs to.
   * </pre>
   *
   * <code>string asset_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The assetGroup.
   */
  @java.lang.Override
  public java.lang.String getAssetGroup() {
    java.lang.Object ref = assetGroup_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      assetGroup_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Immutable. The asset group which this asset group signal belongs to.
   * </pre>
   *
   * <code>string asset_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for assetGroup.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAssetGroupBytes() {
    java.lang.Object ref = assetGroup_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      assetGroup_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUDIENCE_FIELD_NUMBER = 3;
  private com.google.ads.googleads.v13.common.AudienceInfo audience_;
  /**
   * <pre>
   * Immutable. The signal(audience criterion) to be used by the performance max
   * campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.AudienceInfo audience = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the audience field is set.
   */
  @java.lang.Override
  public boolean hasAudience() {
    return audience_ != null;
  }
  /**
   * <pre>
   * Immutable. The signal(audience criterion) to be used by the performance max
   * campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.AudienceInfo audience = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The audience.
   */
  @java.lang.Override
  public com.google.ads.googleads.v13.common.AudienceInfo getAudience() {
    return audience_ == null ? com.google.ads.googleads.v13.common.AudienceInfo.getDefaultInstance() : audience_;
  }
  /**
   * <pre>
   * Immutable. The signal(audience criterion) to be used by the performance max
   * campaign.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.AudienceInfo audience = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v13.common.AudienceInfoOrBuilder getAudienceOrBuilder() {
    return audience_ == null ? com.google.ads.googleads.v13.common.AudienceInfo.getDefaultInstance() : audience_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assetGroup_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, assetGroup_);
    }
    if (audience_ != null) {
      output.writeMessage(3, getAudience());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assetGroup_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, assetGroup_);
    }
    if (audience_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getAudience());
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
    if (!(obj instanceof com.google.ads.googleads.v13.resources.AssetGroupSignal)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v13.resources.AssetGroupSignal other = (com.google.ads.googleads.v13.resources.AssetGroupSignal) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (!getAssetGroup()
        .equals(other.getAssetGroup())) return false;
    if (hasAudience() != other.hasAudience()) return false;
    if (hasAudience()) {
      if (!getAudience()
          .equals(other.getAudience())) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    hash = (37 * hash) + ASSET_GROUP_FIELD_NUMBER;
    hash = (53 * hash) + getAssetGroup().hashCode();
    if (hasAudience()) {
      hash = (37 * hash) + AUDIENCE_FIELD_NUMBER;
      hash = (53 * hash) + getAudience().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v13.resources.AssetGroupSignal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.resources.AssetGroupSignal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.resources.AssetGroupSignal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.resources.AssetGroupSignal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.resources.AssetGroupSignal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.resources.AssetGroupSignal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.resources.AssetGroupSignal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.resources.AssetGroupSignal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v13.resources.AssetGroupSignal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v13.resources.AssetGroupSignal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.resources.AssetGroupSignal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.resources.AssetGroupSignal parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v13.resources.AssetGroupSignal prototype) {
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
   * AssetGroupSignal represents a signal in an asset group. The existence of a
   * signal tells the performance max campaign who's most likely to convert.
   * Performance Max uses the signal to look for new people with similar or
   * stronger intent to find conversions across Search, Display, Video, and more.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v13.resources.AssetGroupSignal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v13.resources.AssetGroupSignal)
      com.google.ads.googleads.v13.resources.AssetGroupSignalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v13.resources.AssetGroupSignalProto.internal_static_google_ads_googleads_v13_resources_AssetGroupSignal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v13.resources.AssetGroupSignalProto.internal_static_google_ads_googleads_v13_resources_AssetGroupSignal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v13.resources.AssetGroupSignal.class, com.google.ads.googleads.v13.resources.AssetGroupSignal.Builder.class);
    }

    // Construct using com.google.ads.googleads.v13.resources.AssetGroupSignal.newBuilder()
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
      resourceName_ = "";
      assetGroup_ = "";
      audience_ = null;
      if (audienceBuilder_ != null) {
        audienceBuilder_.dispose();
        audienceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v13.resources.AssetGroupSignalProto.internal_static_google_ads_googleads_v13_resources_AssetGroupSignal_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.resources.AssetGroupSignal getDefaultInstanceForType() {
      return com.google.ads.googleads.v13.resources.AssetGroupSignal.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.resources.AssetGroupSignal build() {
      com.google.ads.googleads.v13.resources.AssetGroupSignal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.resources.AssetGroupSignal buildPartial() {
      com.google.ads.googleads.v13.resources.AssetGroupSignal result = new com.google.ads.googleads.v13.resources.AssetGroupSignal(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v13.resources.AssetGroupSignal result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceName_ = resourceName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.assetGroup_ = assetGroup_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.audience_ = audienceBuilder_ == null
            ? audience_
            : audienceBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v13.resources.AssetGroupSignal) {
        return mergeFrom((com.google.ads.googleads.v13.resources.AssetGroupSignal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v13.resources.AssetGroupSignal other) {
      if (other == com.google.ads.googleads.v13.resources.AssetGroupSignal.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAssetGroup().isEmpty()) {
        assetGroup_ = other.assetGroup_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasAudience()) {
        mergeAudience(other.getAudience());
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
              resourceName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              assetGroup_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getAudienceFieldBuilder().getBuilder(),
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

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Immutable. The resource name of the asset group signal.
     * Asset group signal resource name have the form:
     *
     * `customers/{customer_id}/assetGroupSignals/{asset_group_id}~{signal_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The resource name of the asset group signal.
     * Asset group signal resource name have the form:
     *
     * `customers/{customer_id}/assetGroupSignals/{asset_group_id}~{signal_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The resource name of the asset group signal.
     * Asset group signal resource name have the form:
     *
     * `customers/{customer_id}/assetGroupSignals/{asset_group_id}~{signal_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      resourceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The resource name of the asset group signal.
     * Asset group signal resource name have the form:
     *
     * `customers/{customer_id}/assetGroupSignals/{asset_group_id}~{signal_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      resourceName_ = getDefaultInstance().getResourceName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The resource name of the asset group signal.
     * Asset group signal resource name have the form:
     *
     * `customers/{customer_id}/assetGroupSignals/{asset_group_id}~{signal_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      resourceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object assetGroup_ = "";
    /**
     * <pre>
     * Immutable. The asset group which this asset group signal belongs to.
     * </pre>
     *
     * <code>string asset_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The assetGroup.
     */
    public java.lang.String getAssetGroup() {
      java.lang.Object ref = assetGroup_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        assetGroup_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The asset group which this asset group signal belongs to.
     * </pre>
     *
     * <code>string asset_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for assetGroup.
     */
    public com.google.protobuf.ByteString
        getAssetGroupBytes() {
      java.lang.Object ref = assetGroup_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        assetGroup_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The asset group which this asset group signal belongs to.
     * </pre>
     *
     * <code>string asset_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The assetGroup to set.
     * @return This builder for chaining.
     */
    public Builder setAssetGroup(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      assetGroup_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The asset group which this asset group signal belongs to.
     * </pre>
     *
     * <code>string asset_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearAssetGroup() {
      assetGroup_ = getDefaultInstance().getAssetGroup();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The asset group which this asset group signal belongs to.
     * </pre>
     *
     * <code>string asset_group = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for assetGroup to set.
     * @return This builder for chaining.
     */
    public Builder setAssetGroupBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      assetGroup_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v13.common.AudienceInfo audience_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v13.common.AudienceInfo, com.google.ads.googleads.v13.common.AudienceInfo.Builder, com.google.ads.googleads.v13.common.AudienceInfoOrBuilder> audienceBuilder_;
    /**
     * <pre>
     * Immutable. The signal(audience criterion) to be used by the performance max
     * campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.AudienceInfo audience = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return Whether the audience field is set.
     */
    public boolean hasAudience() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Immutable. The signal(audience criterion) to be used by the performance max
     * campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.AudienceInfo audience = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The audience.
     */
    public com.google.ads.googleads.v13.common.AudienceInfo getAudience() {
      if (audienceBuilder_ == null) {
        return audience_ == null ? com.google.ads.googleads.v13.common.AudienceInfo.getDefaultInstance() : audience_;
      } else {
        return audienceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Immutable. The signal(audience criterion) to be used by the performance max
     * campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.AudienceInfo audience = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     */
    public Builder setAudience(com.google.ads.googleads.v13.common.AudienceInfo value) {
      if (audienceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        audience_ = value;
      } else {
        audienceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The signal(audience criterion) to be used by the performance max
     * campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.AudienceInfo audience = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     */
    public Builder setAudience(
        com.google.ads.googleads.v13.common.AudienceInfo.Builder builderForValue) {
      if (audienceBuilder_ == null) {
        audience_ = builderForValue.build();
      } else {
        audienceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The signal(audience criterion) to be used by the performance max
     * campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.AudienceInfo audience = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     */
    public Builder mergeAudience(com.google.ads.googleads.v13.common.AudienceInfo value) {
      if (audienceBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          audience_ != null &&
          audience_ != com.google.ads.googleads.v13.common.AudienceInfo.getDefaultInstance()) {
          getAudienceBuilder().mergeFrom(value);
        } else {
          audience_ = value;
        }
      } else {
        audienceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The signal(audience criterion) to be used by the performance max
     * campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.AudienceInfo audience = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     */
    public Builder clearAudience() {
      bitField0_ = (bitField0_ & ~0x00000004);
      audience_ = null;
      if (audienceBuilder_ != null) {
        audienceBuilder_.dispose();
        audienceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The signal(audience criterion) to be used by the performance max
     * campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.AudienceInfo audience = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     */
    public com.google.ads.googleads.v13.common.AudienceInfo.Builder getAudienceBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getAudienceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Immutable. The signal(audience criterion) to be used by the performance max
     * campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.AudienceInfo audience = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     */
    public com.google.ads.googleads.v13.common.AudienceInfoOrBuilder getAudienceOrBuilder() {
      if (audienceBuilder_ != null) {
        return audienceBuilder_.getMessageOrBuilder();
      } else {
        return audience_ == null ?
            com.google.ads.googleads.v13.common.AudienceInfo.getDefaultInstance() : audience_;
      }
    }
    /**
     * <pre>
     * Immutable. The signal(audience criterion) to be used by the performance max
     * campaign.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.AudienceInfo audience = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v13.common.AudienceInfo, com.google.ads.googleads.v13.common.AudienceInfo.Builder, com.google.ads.googleads.v13.common.AudienceInfoOrBuilder> 
        getAudienceFieldBuilder() {
      if (audienceBuilder_ == null) {
        audienceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v13.common.AudienceInfo, com.google.ads.googleads.v13.common.AudienceInfo.Builder, com.google.ads.googleads.v13.common.AudienceInfoOrBuilder>(
                getAudience(),
                getParentForChildren(),
                isClean());
        audience_ = null;
      }
      return audienceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v13.resources.AssetGroupSignal)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v13.resources.AssetGroupSignal)
  private static final com.google.ads.googleads.v13.resources.AssetGroupSignal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v13.resources.AssetGroupSignal();
  }

  public static com.google.ads.googleads.v13.resources.AssetGroupSignal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetGroupSignal>
      PARSER = new com.google.protobuf.AbstractParser<AssetGroupSignal>() {
    @java.lang.Override
    public AssetGroupSignal parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssetGroupSignal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetGroupSignal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v13.resources.AssetGroupSignal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


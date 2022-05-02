// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/asset_service.proto

package com.google.ads.googleads.v10.services;

/**
 * <pre>
 * The result for the asset mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.services.MutateAssetResult}
 */
public final class MutateAssetResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.services.MutateAssetResult)
    MutateAssetResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateAssetResult.newBuilder() to construct.
  private MutateAssetResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateAssetResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateAssetResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateAssetResult(
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
            java.lang.String s = input.readStringRequireUtf8();

            resourceName_ = s;
            break;
          }
          case 18: {
            com.google.ads.googleads.v10.resources.Asset.Builder subBuilder = null;
            if (asset_ != null) {
              subBuilder = asset_.toBuilder();
            }
            asset_ = input.readMessage(com.google.ads.googleads.v10.resources.Asset.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(asset_);
              asset_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v10.services.AssetServiceProto.internal_static_google_ads_googleads_v10_services_MutateAssetResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.services.AssetServiceProto.internal_static_google_ads_googleads_v10_services_MutateAssetResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.services.MutateAssetResult.class, com.google.ads.googleads.v10.services.MutateAssetResult.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * The resource name returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
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
   * The resource name returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
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

  public static final int ASSET_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v10.resources.Asset asset_;
  /**
   * <pre>
   * The mutated asset with only mutable fields after mutate. The field will
   * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.Asset asset = 2;</code>
   * @return Whether the asset field is set.
   */
  @java.lang.Override
  public boolean hasAsset() {
    return asset_ != null;
  }
  /**
   * <pre>
   * The mutated asset with only mutable fields after mutate. The field will
   * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.Asset asset = 2;</code>
   * @return The asset.
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.resources.Asset getAsset() {
    return asset_ == null ? com.google.ads.googleads.v10.resources.Asset.getDefaultInstance() : asset_;
  }
  /**
   * <pre>
   * The mutated asset with only mutable fields after mutate. The field will
   * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.Asset asset = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.resources.AssetOrBuilder getAssetOrBuilder() {
    return getAsset();
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
    if (asset_ != null) {
      output.writeMessage(2, getAsset());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (asset_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAsset());
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
    if (!(obj instanceof com.google.ads.googleads.v10.services.MutateAssetResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.services.MutateAssetResult other = (com.google.ads.googleads.v10.services.MutateAssetResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasAsset() != other.hasAsset()) return false;
    if (hasAsset()) {
      if (!getAsset()
          .equals(other.getAsset())) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    if (hasAsset()) {
      hash = (37 * hash) + ASSET_FIELD_NUMBER;
      hash = (53 * hash) + getAsset().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.services.MutateAssetResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.MutateAssetResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.services.MutateAssetResult prototype) {
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
   * The result for the asset mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.services.MutateAssetResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.services.MutateAssetResult)
      com.google.ads.googleads.v10.services.MutateAssetResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.services.AssetServiceProto.internal_static_google_ads_googleads_v10_services_MutateAssetResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.services.AssetServiceProto.internal_static_google_ads_googleads_v10_services_MutateAssetResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.services.MutateAssetResult.class, com.google.ads.googleads.v10.services.MutateAssetResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.services.MutateAssetResult.newBuilder()
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
      resourceName_ = "";

      if (assetBuilder_ == null) {
        asset_ = null;
      } else {
        asset_ = null;
        assetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.services.AssetServiceProto.internal_static_google_ads_googleads_v10_services_MutateAssetResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.MutateAssetResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.services.MutateAssetResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.MutateAssetResult build() {
      com.google.ads.googleads.v10.services.MutateAssetResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.MutateAssetResult buildPartial() {
      com.google.ads.googleads.v10.services.MutateAssetResult result = new com.google.ads.googleads.v10.services.MutateAssetResult(this);
      result.resourceName_ = resourceName_;
      if (assetBuilder_ == null) {
        result.asset_ = asset_;
      } else {
        result.asset_ = assetBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v10.services.MutateAssetResult) {
        return mergeFrom((com.google.ads.googleads.v10.services.MutateAssetResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.services.MutateAssetResult other) {
      if (other == com.google.ads.googleads.v10.services.MutateAssetResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasAsset()) {
        mergeAsset(other.getAsset());
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
      com.google.ads.googleads.v10.services.MutateAssetResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.services.MutateAssetResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * The resource name returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
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
     * The resource name returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
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
     * The resource name returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v10.resources.Asset asset_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.resources.Asset, com.google.ads.googleads.v10.resources.Asset.Builder, com.google.ads.googleads.v10.resources.AssetOrBuilder> assetBuilder_;
    /**
     * <pre>
     * The mutated asset with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Asset asset = 2;</code>
     * @return Whether the asset field is set.
     */
    public boolean hasAsset() {
      return assetBuilder_ != null || asset_ != null;
    }
    /**
     * <pre>
     * The mutated asset with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Asset asset = 2;</code>
     * @return The asset.
     */
    public com.google.ads.googleads.v10.resources.Asset getAsset() {
      if (assetBuilder_ == null) {
        return asset_ == null ? com.google.ads.googleads.v10.resources.Asset.getDefaultInstance() : asset_;
      } else {
        return assetBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated asset with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Asset asset = 2;</code>
     */
    public Builder setAsset(com.google.ads.googleads.v10.resources.Asset value) {
      if (assetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        asset_ = value;
        onChanged();
      } else {
        assetBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated asset with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Asset asset = 2;</code>
     */
    public Builder setAsset(
        com.google.ads.googleads.v10.resources.Asset.Builder builderForValue) {
      if (assetBuilder_ == null) {
        asset_ = builderForValue.build();
        onChanged();
      } else {
        assetBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The mutated asset with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Asset asset = 2;</code>
     */
    public Builder mergeAsset(com.google.ads.googleads.v10.resources.Asset value) {
      if (assetBuilder_ == null) {
        if (asset_ != null) {
          asset_ =
            com.google.ads.googleads.v10.resources.Asset.newBuilder(asset_).mergeFrom(value).buildPartial();
        } else {
          asset_ = value;
        }
        onChanged();
      } else {
        assetBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated asset with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Asset asset = 2;</code>
     */
    public Builder clearAsset() {
      if (assetBuilder_ == null) {
        asset_ = null;
        onChanged();
      } else {
        asset_ = null;
        assetBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The mutated asset with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Asset asset = 2;</code>
     */
    public com.google.ads.googleads.v10.resources.Asset.Builder getAssetBuilder() {
      
      onChanged();
      return getAssetFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated asset with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Asset asset = 2;</code>
     */
    public com.google.ads.googleads.v10.resources.AssetOrBuilder getAssetOrBuilder() {
      if (assetBuilder_ != null) {
        return assetBuilder_.getMessageOrBuilder();
      } else {
        return asset_ == null ?
            com.google.ads.googleads.v10.resources.Asset.getDefaultInstance() : asset_;
      }
    }
    /**
     * <pre>
     * The mutated asset with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Asset asset = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.resources.Asset, com.google.ads.googleads.v10.resources.Asset.Builder, com.google.ads.googleads.v10.resources.AssetOrBuilder> 
        getAssetFieldBuilder() {
      if (assetBuilder_ == null) {
        assetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v10.resources.Asset, com.google.ads.googleads.v10.resources.Asset.Builder, com.google.ads.googleads.v10.resources.AssetOrBuilder>(
                getAsset(),
                getParentForChildren(),
                isClean());
        asset_ = null;
      }
      return assetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.services.MutateAssetResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.services.MutateAssetResult)
  private static final com.google.ads.googleads.v10.services.MutateAssetResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.services.MutateAssetResult();
  }

  public static com.google.ads.googleads.v10.services.MutateAssetResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateAssetResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateAssetResult>() {
    @java.lang.Override
    public MutateAssetResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateAssetResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateAssetResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateAssetResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.services.MutateAssetResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


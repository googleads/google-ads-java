// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/campaign_shared_set_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.services;

/**
 * <pre>
 * The result for the campaign shared set mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.services.MutateCampaignSharedSetResult}
 */
public final class MutateCampaignSharedSetResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.services.MutateCampaignSharedSetResult)
    MutateCampaignSharedSetResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateCampaignSharedSetResult.newBuilder() to construct.
  private MutateCampaignSharedSetResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateCampaignSharedSetResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateCampaignSharedSetResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.services.CampaignSharedSetServiceProto.internal_static_google_ads_googleads_v16_services_MutateCampaignSharedSetResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.services.CampaignSharedSetServiceProto.internal_static_google_ads_googleads_v16_services_MutateCampaignSharedSetResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult.class, com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceName_ = "";
  /**
   * <pre>
   * Returned for successful operations.
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
   * Returned for successful operations.
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

  public static final int CAMPAIGN_SHARED_SET_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v16.resources.CampaignSharedSet campaignSharedSet_;
  /**
   * <pre>
   * The mutated campaign shared set with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.CampaignSharedSet campaign_shared_set = 2;</code>
   * @return Whether the campaignSharedSet field is set.
   */
  @java.lang.Override
  public boolean hasCampaignSharedSet() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The mutated campaign shared set with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.CampaignSharedSet campaign_shared_set = 2;</code>
   * @return The campaignSharedSet.
   */
  @java.lang.Override
  public com.google.ads.googleads.v16.resources.CampaignSharedSet getCampaignSharedSet() {
    return campaignSharedSet_ == null ? com.google.ads.googleads.v16.resources.CampaignSharedSet.getDefaultInstance() : campaignSharedSet_;
  }
  /**
   * <pre>
   * The mutated campaign shared set with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v16.resources.CampaignSharedSet campaign_shared_set = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v16.resources.CampaignSharedSetOrBuilder getCampaignSharedSetOrBuilder() {
    return campaignSharedSet_ == null ? com.google.ads.googleads.v16.resources.CampaignSharedSet.getDefaultInstance() : campaignSharedSet_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getCampaignSharedSet());
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
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCampaignSharedSet());
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
    if (!(obj instanceof com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult other = (com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasCampaignSharedSet() != other.hasCampaignSharedSet()) return false;
    if (hasCampaignSharedSet()) {
      if (!getCampaignSharedSet()
          .equals(other.getCampaignSharedSet())) return false;
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
    if (hasCampaignSharedSet()) {
      hash = (37 * hash) + CAMPAIGN_SHARED_SET_FIELD_NUMBER;
      hash = (53 * hash) + getCampaignSharedSet().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult prototype) {
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
   * The result for the campaign shared set mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.services.MutateCampaignSharedSetResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.services.MutateCampaignSharedSetResult)
      com.google.ads.googleads.v16.services.MutateCampaignSharedSetResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.services.CampaignSharedSetServiceProto.internal_static_google_ads_googleads_v16_services_MutateCampaignSharedSetResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.services.CampaignSharedSetServiceProto.internal_static_google_ads_googleads_v16_services_MutateCampaignSharedSetResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult.class, com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult.newBuilder()
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
        getCampaignSharedSetFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      resourceName_ = "";
      campaignSharedSet_ = null;
      if (campaignSharedSetBuilder_ != null) {
        campaignSharedSetBuilder_.dispose();
        campaignSharedSetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.services.CampaignSharedSetServiceProto.internal_static_google_ads_googleads_v16_services_MutateCampaignSharedSetResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult build() {
      com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult buildPartial() {
      com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult result = new com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceName_ = resourceName_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.campaignSharedSet_ = campaignSharedSetBuilder_ == null
            ? campaignSharedSet_
            : campaignSharedSetBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult) {
        return mergeFrom((com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult other) {
      if (other == com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCampaignSharedSet()) {
        mergeCampaignSharedSet(other.getCampaignSharedSet());
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
              input.readMessage(
                  getCampaignSharedSetFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
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
    private int bitField0_;

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Returned for successful operations.
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
     * Returned for successful operations.
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
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
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
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
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
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
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

    private com.google.ads.googleads.v16.resources.CampaignSharedSet campaignSharedSet_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v16.resources.CampaignSharedSet, com.google.ads.googleads.v16.resources.CampaignSharedSet.Builder, com.google.ads.googleads.v16.resources.CampaignSharedSetOrBuilder> campaignSharedSetBuilder_;
    /**
     * <pre>
     * The mutated campaign shared set with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v16.resources.CampaignSharedSet campaign_shared_set = 2;</code>
     * @return Whether the campaignSharedSet field is set.
     */
    public boolean hasCampaignSharedSet() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The mutated campaign shared set with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v16.resources.CampaignSharedSet campaign_shared_set = 2;</code>
     * @return The campaignSharedSet.
     */
    public com.google.ads.googleads.v16.resources.CampaignSharedSet getCampaignSharedSet() {
      if (campaignSharedSetBuilder_ == null) {
        return campaignSharedSet_ == null ? com.google.ads.googleads.v16.resources.CampaignSharedSet.getDefaultInstance() : campaignSharedSet_;
      } else {
        return campaignSharedSetBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated campaign shared set with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v16.resources.CampaignSharedSet campaign_shared_set = 2;</code>
     */
    public Builder setCampaignSharedSet(com.google.ads.googleads.v16.resources.CampaignSharedSet value) {
      if (campaignSharedSetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        campaignSharedSet_ = value;
      } else {
        campaignSharedSetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated campaign shared set with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v16.resources.CampaignSharedSet campaign_shared_set = 2;</code>
     */
    public Builder setCampaignSharedSet(
        com.google.ads.googleads.v16.resources.CampaignSharedSet.Builder builderForValue) {
      if (campaignSharedSetBuilder_ == null) {
        campaignSharedSet_ = builderForValue.build();
      } else {
        campaignSharedSetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated campaign shared set with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v16.resources.CampaignSharedSet campaign_shared_set = 2;</code>
     */
    public Builder mergeCampaignSharedSet(com.google.ads.googleads.v16.resources.CampaignSharedSet value) {
      if (campaignSharedSetBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          campaignSharedSet_ != null &&
          campaignSharedSet_ != com.google.ads.googleads.v16.resources.CampaignSharedSet.getDefaultInstance()) {
          getCampaignSharedSetBuilder().mergeFrom(value);
        } else {
          campaignSharedSet_ = value;
        }
      } else {
        campaignSharedSetBuilder_.mergeFrom(value);
      }
      if (campaignSharedSet_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The mutated campaign shared set with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v16.resources.CampaignSharedSet campaign_shared_set = 2;</code>
     */
    public Builder clearCampaignSharedSet() {
      bitField0_ = (bitField0_ & ~0x00000002);
      campaignSharedSet_ = null;
      if (campaignSharedSetBuilder_ != null) {
        campaignSharedSetBuilder_.dispose();
        campaignSharedSetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated campaign shared set with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v16.resources.CampaignSharedSet campaign_shared_set = 2;</code>
     */
    public com.google.ads.googleads.v16.resources.CampaignSharedSet.Builder getCampaignSharedSetBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getCampaignSharedSetFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated campaign shared set with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v16.resources.CampaignSharedSet campaign_shared_set = 2;</code>
     */
    public com.google.ads.googleads.v16.resources.CampaignSharedSetOrBuilder getCampaignSharedSetOrBuilder() {
      if (campaignSharedSetBuilder_ != null) {
        return campaignSharedSetBuilder_.getMessageOrBuilder();
      } else {
        return campaignSharedSet_ == null ?
            com.google.ads.googleads.v16.resources.CampaignSharedSet.getDefaultInstance() : campaignSharedSet_;
      }
    }
    /**
     * <pre>
     * The mutated campaign shared set with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v16.resources.CampaignSharedSet campaign_shared_set = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v16.resources.CampaignSharedSet, com.google.ads.googleads.v16.resources.CampaignSharedSet.Builder, com.google.ads.googleads.v16.resources.CampaignSharedSetOrBuilder> 
        getCampaignSharedSetFieldBuilder() {
      if (campaignSharedSetBuilder_ == null) {
        campaignSharedSetBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v16.resources.CampaignSharedSet, com.google.ads.googleads.v16.resources.CampaignSharedSet.Builder, com.google.ads.googleads.v16.resources.CampaignSharedSetOrBuilder>(
                getCampaignSharedSet(),
                getParentForChildren(),
                isClean());
        campaignSharedSet_ = null;
      }
      return campaignSharedSetBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.services.MutateCampaignSharedSetResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.services.MutateCampaignSharedSetResult)
  private static final com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult();
  }

  public static com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateCampaignSharedSetResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateCampaignSharedSetResult>() {
    @java.lang.Override
    public MutateCampaignSharedSetResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<MutateCampaignSharedSetResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateCampaignSharedSetResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.services.MutateCampaignSharedSetResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


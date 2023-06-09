// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/third_party_app_analytics_link.proto

package com.google.ads.googleads.v14.resources;

/**
 * <pre>
 * A data sharing connection, allowing the import of third party app analytics
 * into a Google Ads Customer.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink}
 */
public final class ThirdPartyAppAnalyticsLink extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink)
    ThirdPartyAppAnalyticsLinkOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ThirdPartyAppAnalyticsLink.newBuilder() to construct.
  private ThirdPartyAppAnalyticsLink(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ThirdPartyAppAnalyticsLink() {
    resourceName_ = "";
    shareableLinkId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ThirdPartyAppAnalyticsLink();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLinkProto.internal_static_google_ads_googleads_v14_resources_ThirdPartyAppAnalyticsLink_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLinkProto.internal_static_google_ads_googleads_v14_resources_ThirdPartyAppAnalyticsLink_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink.class, com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceName_ = "";
  /**
   * <pre>
   * Immutable. The resource name of the third party app analytics link.
   * Third party app analytics link resource names have the form:
   *
   * `customers/{customer_id}/thirdPartyAppAnalyticsLinks/{account_link_id}`
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
   * Immutable. The resource name of the third party app analytics link.
   * Third party app analytics link resource names have the form:
   *
   * `customers/{customer_id}/thirdPartyAppAnalyticsLinks/{account_link_id}`
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

  public static final int SHAREABLE_LINK_ID_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object shareableLinkId_ = "";
  /**
   * <pre>
   * Output only. The shareable link ID that should be provided to the third
   * party when setting up app analytics. This is able to be regenerated using
   * regenerate method in the ThirdPartyAppAnalyticsLinkService.
   * </pre>
   *
   * <code>optional string shareable_link_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the shareableLinkId field is set.
   */
  @java.lang.Override
  public boolean hasShareableLinkId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Output only. The shareable link ID that should be provided to the third
   * party when setting up app analytics. This is able to be regenerated using
   * regenerate method in the ThirdPartyAppAnalyticsLinkService.
   * </pre>
   *
   * <code>optional string shareable_link_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The shareableLinkId.
   */
  @java.lang.Override
  public java.lang.String getShareableLinkId() {
    java.lang.Object ref = shareableLinkId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      shareableLinkId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The shareable link ID that should be provided to the third
   * party when setting up app analytics. This is able to be regenerated using
   * regenerate method in the ThirdPartyAppAnalyticsLinkService.
   * </pre>
   *
   * <code>optional string shareable_link_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for shareableLinkId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getShareableLinkIdBytes() {
    java.lang.Object ref = shareableLinkId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      shareableLinkId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, shareableLinkId_);
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
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, shareableLinkId_);
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
    if (!(obj instanceof com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink other = (com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasShareableLinkId() != other.hasShareableLinkId()) return false;
    if (hasShareableLinkId()) {
      if (!getShareableLinkId()
          .equals(other.getShareableLinkId())) return false;
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
    if (hasShareableLinkId()) {
      hash = (37 * hash) + SHAREABLE_LINK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getShareableLinkId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink prototype) {
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
   * A data sharing connection, allowing the import of third party app analytics
   * into a Google Ads Customer.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink)
      com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLinkOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLinkProto.internal_static_google_ads_googleads_v14_resources_ThirdPartyAppAnalyticsLink_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLinkProto.internal_static_google_ads_googleads_v14_resources_ThirdPartyAppAnalyticsLink_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink.class, com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink.newBuilder()
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
      shareableLinkId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLinkProto.internal_static_google_ads_googleads_v14_resources_ThirdPartyAppAnalyticsLink_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink build() {
      com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink buildPartial() {
      com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink result = new com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceName_ = resourceName_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.shareableLinkId_ = shareableLinkId_;
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
      if (other instanceof com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink) {
        return mergeFrom((com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink other) {
      if (other == com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasShareableLinkId()) {
        shareableLinkId_ = other.shareableLinkId_;
        bitField0_ |= 0x00000002;
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
              resourceName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 26: {
              shareableLinkId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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
     * Immutable. The resource name of the third party app analytics link.
     * Third party app analytics link resource names have the form:
     *
     * `customers/{customer_id}/thirdPartyAppAnalyticsLinks/{account_link_id}`
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
     * Immutable. The resource name of the third party app analytics link.
     * Third party app analytics link resource names have the form:
     *
     * `customers/{customer_id}/thirdPartyAppAnalyticsLinks/{account_link_id}`
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
     * Immutable. The resource name of the third party app analytics link.
     * Third party app analytics link resource names have the form:
     *
     * `customers/{customer_id}/thirdPartyAppAnalyticsLinks/{account_link_id}`
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
     * Immutable. The resource name of the third party app analytics link.
     * Third party app analytics link resource names have the form:
     *
     * `customers/{customer_id}/thirdPartyAppAnalyticsLinks/{account_link_id}`
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
     * Immutable. The resource name of the third party app analytics link.
     * Third party app analytics link resource names have the form:
     *
     * `customers/{customer_id}/thirdPartyAppAnalyticsLinks/{account_link_id}`
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

    private java.lang.Object shareableLinkId_ = "";
    /**
     * <pre>
     * Output only. The shareable link ID that should be provided to the third
     * party when setting up app analytics. This is able to be regenerated using
     * regenerate method in the ThirdPartyAppAnalyticsLinkService.
     * </pre>
     *
     * <code>optional string shareable_link_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the shareableLinkId field is set.
     */
    public boolean hasShareableLinkId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Output only. The shareable link ID that should be provided to the third
     * party when setting up app analytics. This is able to be regenerated using
     * regenerate method in the ThirdPartyAppAnalyticsLinkService.
     * </pre>
     *
     * <code>optional string shareable_link_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The shareableLinkId.
     */
    public java.lang.String getShareableLinkId() {
      java.lang.Object ref = shareableLinkId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        shareableLinkId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The shareable link ID that should be provided to the third
     * party when setting up app analytics. This is able to be regenerated using
     * regenerate method in the ThirdPartyAppAnalyticsLinkService.
     * </pre>
     *
     * <code>optional string shareable_link_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for shareableLinkId.
     */
    public com.google.protobuf.ByteString
        getShareableLinkIdBytes() {
      java.lang.Object ref = shareableLinkId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        shareableLinkId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The shareable link ID that should be provided to the third
     * party when setting up app analytics. This is able to be regenerated using
     * regenerate method in the ThirdPartyAppAnalyticsLinkService.
     * </pre>
     *
     * <code>optional string shareable_link_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The shareableLinkId to set.
     * @return This builder for chaining.
     */
    public Builder setShareableLinkId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      shareableLinkId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The shareable link ID that should be provided to the third
     * party when setting up app analytics. This is able to be regenerated using
     * regenerate method in the ThirdPartyAppAnalyticsLinkService.
     * </pre>
     *
     * <code>optional string shareable_link_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearShareableLinkId() {
      shareableLinkId_ = getDefaultInstance().getShareableLinkId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The shareable link ID that should be provided to the third
     * party when setting up app analytics. This is able to be regenerated using
     * regenerate method in the ThirdPartyAppAnalyticsLinkService.
     * </pre>
     *
     * <code>optional string shareable_link_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for shareableLinkId to set.
     * @return This builder for chaining.
     */
    public Builder setShareableLinkIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      shareableLinkId_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink)
  private static final com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink();
  }

  public static com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThirdPartyAppAnalyticsLink>
      PARSER = new com.google.protobuf.AbstractParser<ThirdPartyAppAnalyticsLink>() {
    @java.lang.Override
    public ThirdPartyAppAnalyticsLink parsePartialFrom(
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

  public static com.google.protobuf.Parser<ThirdPartyAppAnalyticsLink> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThirdPartyAppAnalyticsLink> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.resources.ThirdPartyAppAnalyticsLink getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


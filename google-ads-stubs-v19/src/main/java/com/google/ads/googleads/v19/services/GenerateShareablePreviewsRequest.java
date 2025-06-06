// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/shareable_preview_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.services;

/**
 * <pre>
 * Request message for
 * [ShareablePreviewService.GenerateShareablePreviews][google.ads.googleads.v19.services.ShareablePreviewService.GenerateShareablePreviews].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.services.GenerateShareablePreviewsRequest}
 */
public final class GenerateShareablePreviewsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.services.GenerateShareablePreviewsRequest)
    GenerateShareablePreviewsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenerateShareablePreviewsRequest.newBuilder() to construct.
  private GenerateShareablePreviewsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenerateShareablePreviewsRequest() {
    customerId_ = "";
    shareablePreviews_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenerateShareablePreviewsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.services.ShareablePreviewServiceProto.internal_static_google_ads_googleads_v19_services_GenerateShareablePreviewsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.services.ShareablePreviewServiceProto.internal_static_google_ads_googleads_v19_services_GenerateShareablePreviewsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest.class, com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest.Builder.class);
  }

  public static final int CUSTOMER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object customerId_ = "";
  /**
   * <pre>
   * Required. The customer creating the shareable previews request.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  @java.lang.Override
  public java.lang.String getCustomerId() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The customer creating the shareable previews request.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerIdBytes() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHAREABLE_PREVIEWS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v19.services.ShareablePreview> shareablePreviews_;
  /**
   * <pre>
   * Required. The list of shareable previews to generate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v19.services.ShareablePreview> getShareablePreviewsList() {
    return shareablePreviews_;
  }
  /**
   * <pre>
   * Required. The list of shareable previews to generate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v19.services.ShareablePreviewOrBuilder> 
      getShareablePreviewsOrBuilderList() {
    return shareablePreviews_;
  }
  /**
   * <pre>
   * Required. The list of shareable previews to generate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public int getShareablePreviewsCount() {
    return shareablePreviews_.size();
  }
  /**
   * <pre>
   * Required. The list of shareable previews to generate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v19.services.ShareablePreview getShareablePreviews(int index) {
    return shareablePreviews_.get(index);
  }
  /**
   * <pre>
   * Required. The list of shareable previews to generate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v19.services.ShareablePreviewOrBuilder getShareablePreviewsOrBuilder(
      int index) {
    return shareablePreviews_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customerId_);
    }
    for (int i = 0; i < shareablePreviews_.size(); i++) {
      output.writeMessage(2, shareablePreviews_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customerId_);
    }
    for (int i = 0; i < shareablePreviews_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, shareablePreviews_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest other = (com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest) obj;

    if (!getCustomerId()
        .equals(other.getCustomerId())) return false;
    if (!getShareablePreviewsList()
        .equals(other.getShareablePreviewsList())) return false;
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
    hash = (37 * hash) + CUSTOMER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerId().hashCode();
    if (getShareablePreviewsCount() > 0) {
      hash = (37 * hash) + SHAREABLE_PREVIEWS_FIELD_NUMBER;
      hash = (53 * hash) + getShareablePreviewsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest prototype) {
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
   * Request message for
   * [ShareablePreviewService.GenerateShareablePreviews][google.ads.googleads.v19.services.ShareablePreviewService.GenerateShareablePreviews].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.services.GenerateShareablePreviewsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.services.GenerateShareablePreviewsRequest)
      com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.services.ShareablePreviewServiceProto.internal_static_google_ads_googleads_v19_services_GenerateShareablePreviewsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.services.ShareablePreviewServiceProto.internal_static_google_ads_googleads_v19_services_GenerateShareablePreviewsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest.class, com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest.newBuilder()
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
      customerId_ = "";
      if (shareablePreviewsBuilder_ == null) {
        shareablePreviews_ = java.util.Collections.emptyList();
      } else {
        shareablePreviews_ = null;
        shareablePreviewsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.services.ShareablePreviewServiceProto.internal_static_google_ads_googleads_v19_services_GenerateShareablePreviewsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest build() {
      com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest buildPartial() {
      com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest result = new com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest result) {
      if (shareablePreviewsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          shareablePreviews_ = java.util.Collections.unmodifiableList(shareablePreviews_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.shareablePreviews_ = shareablePreviews_;
      } else {
        result.shareablePreviews_ = shareablePreviewsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.customerId_ = customerId_;
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
      if (other instanceof com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest) {
        return mergeFrom((com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest other) {
      if (other == com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (shareablePreviewsBuilder_ == null) {
        if (!other.shareablePreviews_.isEmpty()) {
          if (shareablePreviews_.isEmpty()) {
            shareablePreviews_ = other.shareablePreviews_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureShareablePreviewsIsMutable();
            shareablePreviews_.addAll(other.shareablePreviews_);
          }
          onChanged();
        }
      } else {
        if (!other.shareablePreviews_.isEmpty()) {
          if (shareablePreviewsBuilder_.isEmpty()) {
            shareablePreviewsBuilder_.dispose();
            shareablePreviewsBuilder_ = null;
            shareablePreviews_ = other.shareablePreviews_;
            bitField0_ = (bitField0_ & ~0x00000002);
            shareablePreviewsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getShareablePreviewsFieldBuilder() : null;
          } else {
            shareablePreviewsBuilder_.addAllMessages(other.shareablePreviews_);
          }
        }
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
              customerId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.ads.googleads.v19.services.ShareablePreview m =
                  input.readMessage(
                      com.google.ads.googleads.v19.services.ShareablePreview.parser(),
                      extensionRegistry);
              if (shareablePreviewsBuilder_ == null) {
                ensureShareablePreviewsIsMutable();
                shareablePreviews_.add(m);
              } else {
                shareablePreviewsBuilder_.addMessage(m);
              }
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

    private java.lang.Object customerId_ = "";
    /**
     * <pre>
     * Required. The customer creating the shareable previews request.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The customerId.
     */
    public java.lang.String getCustomerId() {
      java.lang.Object ref = customerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The customer creating the shareable previews request.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for customerId.
     */
    public com.google.protobuf.ByteString
        getCustomerIdBytes() {
      java.lang.Object ref = customerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The customer creating the shareable previews request.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      customerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The customer creating the shareable previews request.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomerId() {
      customerId_ = getDefaultInstance().getCustomerId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The customer creating the shareable previews request.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      customerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.google.ads.googleads.v19.services.ShareablePreview> shareablePreviews_ =
      java.util.Collections.emptyList();
    private void ensureShareablePreviewsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        shareablePreviews_ = new java.util.ArrayList<com.google.ads.googleads.v19.services.ShareablePreview>(shareablePreviews_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v19.services.ShareablePreview, com.google.ads.googleads.v19.services.ShareablePreview.Builder, com.google.ads.googleads.v19.services.ShareablePreviewOrBuilder> shareablePreviewsBuilder_;

    /**
     * <pre>
     * Required. The list of shareable previews to generate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.ads.googleads.v19.services.ShareablePreview> getShareablePreviewsList() {
      if (shareablePreviewsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(shareablePreviews_);
      } else {
        return shareablePreviewsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Required. The list of shareable previews to generate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public int getShareablePreviewsCount() {
      if (shareablePreviewsBuilder_ == null) {
        return shareablePreviews_.size();
      } else {
        return shareablePreviewsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Required. The list of shareable previews to generate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v19.services.ShareablePreview getShareablePreviews(int index) {
      if (shareablePreviewsBuilder_ == null) {
        return shareablePreviews_.get(index);
      } else {
        return shareablePreviewsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Required. The list of shareable previews to generate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setShareablePreviews(
        int index, com.google.ads.googleads.v19.services.ShareablePreview value) {
      if (shareablePreviewsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureShareablePreviewsIsMutable();
        shareablePreviews_.set(index, value);
        onChanged();
      } else {
        shareablePreviewsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of shareable previews to generate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setShareablePreviews(
        int index, com.google.ads.googleads.v19.services.ShareablePreview.Builder builderForValue) {
      if (shareablePreviewsBuilder_ == null) {
        ensureShareablePreviewsIsMutable();
        shareablePreviews_.set(index, builderForValue.build());
        onChanged();
      } else {
        shareablePreviewsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of shareable previews to generate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addShareablePreviews(com.google.ads.googleads.v19.services.ShareablePreview value) {
      if (shareablePreviewsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureShareablePreviewsIsMutable();
        shareablePreviews_.add(value);
        onChanged();
      } else {
        shareablePreviewsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of shareable previews to generate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addShareablePreviews(
        int index, com.google.ads.googleads.v19.services.ShareablePreview value) {
      if (shareablePreviewsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureShareablePreviewsIsMutable();
        shareablePreviews_.add(index, value);
        onChanged();
      } else {
        shareablePreviewsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of shareable previews to generate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addShareablePreviews(
        com.google.ads.googleads.v19.services.ShareablePreview.Builder builderForValue) {
      if (shareablePreviewsBuilder_ == null) {
        ensureShareablePreviewsIsMutable();
        shareablePreviews_.add(builderForValue.build());
        onChanged();
      } else {
        shareablePreviewsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of shareable previews to generate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addShareablePreviews(
        int index, com.google.ads.googleads.v19.services.ShareablePreview.Builder builderForValue) {
      if (shareablePreviewsBuilder_ == null) {
        ensureShareablePreviewsIsMutable();
        shareablePreviews_.add(index, builderForValue.build());
        onChanged();
      } else {
        shareablePreviewsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of shareable previews to generate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAllShareablePreviews(
        java.lang.Iterable<? extends com.google.ads.googleads.v19.services.ShareablePreview> values) {
      if (shareablePreviewsBuilder_ == null) {
        ensureShareablePreviewsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, shareablePreviews_);
        onChanged();
      } else {
        shareablePreviewsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of shareable previews to generate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearShareablePreviews() {
      if (shareablePreviewsBuilder_ == null) {
        shareablePreviews_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        shareablePreviewsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of shareable previews to generate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder removeShareablePreviews(int index) {
      if (shareablePreviewsBuilder_ == null) {
        ensureShareablePreviewsIsMutable();
        shareablePreviews_.remove(index);
        onChanged();
      } else {
        shareablePreviewsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Required. The list of shareable previews to generate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v19.services.ShareablePreview.Builder getShareablePreviewsBuilder(
        int index) {
      return getShareablePreviewsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Required. The list of shareable previews to generate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v19.services.ShareablePreviewOrBuilder getShareablePreviewsOrBuilder(
        int index) {
      if (shareablePreviewsBuilder_ == null) {
        return shareablePreviews_.get(index);  } else {
        return shareablePreviewsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Required. The list of shareable previews to generate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v19.services.ShareablePreviewOrBuilder> 
         getShareablePreviewsOrBuilderList() {
      if (shareablePreviewsBuilder_ != null) {
        return shareablePreviewsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(shareablePreviews_);
      }
    }
    /**
     * <pre>
     * Required. The list of shareable previews to generate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v19.services.ShareablePreview.Builder addShareablePreviewsBuilder() {
      return getShareablePreviewsFieldBuilder().addBuilder(
          com.google.ads.googleads.v19.services.ShareablePreview.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. The list of shareable previews to generate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v19.services.ShareablePreview.Builder addShareablePreviewsBuilder(
        int index) {
      return getShareablePreviewsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v19.services.ShareablePreview.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. The list of shareable previews to generate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v19.services.ShareablePreview shareable_previews = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.ads.googleads.v19.services.ShareablePreview.Builder> 
         getShareablePreviewsBuilderList() {
      return getShareablePreviewsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v19.services.ShareablePreview, com.google.ads.googleads.v19.services.ShareablePreview.Builder, com.google.ads.googleads.v19.services.ShareablePreviewOrBuilder> 
        getShareablePreviewsFieldBuilder() {
      if (shareablePreviewsBuilder_ == null) {
        shareablePreviewsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v19.services.ShareablePreview, com.google.ads.googleads.v19.services.ShareablePreview.Builder, com.google.ads.googleads.v19.services.ShareablePreviewOrBuilder>(
                shareablePreviews_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        shareablePreviews_ = null;
      }
      return shareablePreviewsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.services.GenerateShareablePreviewsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.services.GenerateShareablePreviewsRequest)
  private static final com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest();
  }

  public static com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateShareablePreviewsRequest>
      PARSER = new com.google.protobuf.AbstractParser<GenerateShareablePreviewsRequest>() {
    @java.lang.Override
    public GenerateShareablePreviewsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateShareablePreviewsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateShareablePreviewsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.services.GenerateShareablePreviewsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


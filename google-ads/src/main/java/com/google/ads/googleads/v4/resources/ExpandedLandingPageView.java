// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/resources/expanded_landing_page_view.proto

package com.google.ads.googleads.v4.resources;

/**
 * <pre>
 * A landing page view with metrics aggregated at the expanded final URL
 * level.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v4.resources.ExpandedLandingPageView}
 */
public final class ExpandedLandingPageView extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v4.resources.ExpandedLandingPageView)
    ExpandedLandingPageViewOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExpandedLandingPageView.newBuilder() to construct.
  private ExpandedLandingPageView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExpandedLandingPageView() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExpandedLandingPageView();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExpandedLandingPageView(
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
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (expandedFinalUrl_ != null) {
              subBuilder = expandedFinalUrl_.toBuilder();
            }
            expandedFinalUrl_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(expandedFinalUrl_);
              expandedFinalUrl_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v4.resources.ExpandedLandingPageViewProto.internal_static_google_ads_googleads_v4_resources_ExpandedLandingPageView_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v4.resources.ExpandedLandingPageViewProto.internal_static_google_ads_googleads_v4_resources_ExpandedLandingPageView_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v4.resources.ExpandedLandingPageView.class, com.google.ads.googleads.v4.resources.ExpandedLandingPageView.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Output only. The resource name of the expanded landing page view.
   * Expanded landing page view resource names have the form:
   * `customers/{customer_id}/expandedLandingPageViews/{expanded_final_url_fingerprint}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
   * Output only. The resource name of the expanded landing page view.
   * Expanded landing page view resource names have the form:
   * `customers/{customer_id}/expandedLandingPageViews/{expanded_final_url_fingerprint}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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

  public static final int EXPANDED_FINAL_URL_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue expandedFinalUrl_;
  /**
   * <pre>
   * Output only. The final URL that clicks are directed to.
   * </pre>
   *
   * <code>.google.protobuf.StringValue expanded_final_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the expandedFinalUrl field is set.
   */
  @java.lang.Override
  public boolean hasExpandedFinalUrl() {
    return expandedFinalUrl_ != null;
  }
  /**
   * <pre>
   * Output only. The final URL that clicks are directed to.
   * </pre>
   *
   * <code>.google.protobuf.StringValue expanded_final_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The expandedFinalUrl.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getExpandedFinalUrl() {
    return expandedFinalUrl_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : expandedFinalUrl_;
  }
  /**
   * <pre>
   * Output only. The final URL that clicks are directed to.
   * </pre>
   *
   * <code>.google.protobuf.StringValue expanded_final_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getExpandedFinalUrlOrBuilder() {
    return getExpandedFinalUrl();
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
    if (!getResourceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (expandedFinalUrl_ != null) {
      output.writeMessage(2, getExpandedFinalUrl());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getResourceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (expandedFinalUrl_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getExpandedFinalUrl());
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
    if (!(obj instanceof com.google.ads.googleads.v4.resources.ExpandedLandingPageView)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v4.resources.ExpandedLandingPageView other = (com.google.ads.googleads.v4.resources.ExpandedLandingPageView) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasExpandedFinalUrl() != other.hasExpandedFinalUrl()) return false;
    if (hasExpandedFinalUrl()) {
      if (!getExpandedFinalUrl()
          .equals(other.getExpandedFinalUrl())) return false;
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
    if (hasExpandedFinalUrl()) {
      hash = (37 * hash) + EXPANDED_FINAL_URL_FIELD_NUMBER;
      hash = (53 * hash) + getExpandedFinalUrl().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v4.resources.ExpandedLandingPageView parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.resources.ExpandedLandingPageView parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.resources.ExpandedLandingPageView parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.resources.ExpandedLandingPageView parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.resources.ExpandedLandingPageView parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v4.resources.ExpandedLandingPageView parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.resources.ExpandedLandingPageView parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.resources.ExpandedLandingPageView parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.resources.ExpandedLandingPageView parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.resources.ExpandedLandingPageView parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v4.resources.ExpandedLandingPageView parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v4.resources.ExpandedLandingPageView parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v4.resources.ExpandedLandingPageView prototype) {
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
   * A landing page view with metrics aggregated at the expanded final URL
   * level.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v4.resources.ExpandedLandingPageView}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v4.resources.ExpandedLandingPageView)
      com.google.ads.googleads.v4.resources.ExpandedLandingPageViewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v4.resources.ExpandedLandingPageViewProto.internal_static_google_ads_googleads_v4_resources_ExpandedLandingPageView_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v4.resources.ExpandedLandingPageViewProto.internal_static_google_ads_googleads_v4_resources_ExpandedLandingPageView_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v4.resources.ExpandedLandingPageView.class, com.google.ads.googleads.v4.resources.ExpandedLandingPageView.Builder.class);
    }

    // Construct using com.google.ads.googleads.v4.resources.ExpandedLandingPageView.newBuilder()
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

      if (expandedFinalUrlBuilder_ == null) {
        expandedFinalUrl_ = null;
      } else {
        expandedFinalUrl_ = null;
        expandedFinalUrlBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v4.resources.ExpandedLandingPageViewProto.internal_static_google_ads_googleads_v4_resources_ExpandedLandingPageView_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.resources.ExpandedLandingPageView getDefaultInstanceForType() {
      return com.google.ads.googleads.v4.resources.ExpandedLandingPageView.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.resources.ExpandedLandingPageView build() {
      com.google.ads.googleads.v4.resources.ExpandedLandingPageView result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v4.resources.ExpandedLandingPageView buildPartial() {
      com.google.ads.googleads.v4.resources.ExpandedLandingPageView result = new com.google.ads.googleads.v4.resources.ExpandedLandingPageView(this);
      result.resourceName_ = resourceName_;
      if (expandedFinalUrlBuilder_ == null) {
        result.expandedFinalUrl_ = expandedFinalUrl_;
      } else {
        result.expandedFinalUrl_ = expandedFinalUrlBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v4.resources.ExpandedLandingPageView) {
        return mergeFrom((com.google.ads.googleads.v4.resources.ExpandedLandingPageView)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v4.resources.ExpandedLandingPageView other) {
      if (other == com.google.ads.googleads.v4.resources.ExpandedLandingPageView.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasExpandedFinalUrl()) {
        mergeExpandedFinalUrl(other.getExpandedFinalUrl());
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
      com.google.ads.googleads.v4.resources.ExpandedLandingPageView parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v4.resources.ExpandedLandingPageView) e.getUnfinishedMessage();
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
     * Output only. The resource name of the expanded landing page view.
     * Expanded landing page view resource names have the form:
     * `customers/{customer_id}/expandedLandingPageViews/{expanded_final_url_fingerprint}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the expanded landing page view.
     * Expanded landing page view resource names have the form:
     * `customers/{customer_id}/expandedLandingPageViews/{expanded_final_url_fingerprint}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the expanded landing page view.
     * Expanded landing page view resource names have the form:
     * `customers/{customer_id}/expandedLandingPageViews/{expanded_final_url_fingerprint}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the expanded landing page view.
     * Expanded landing page view resource names have the form:
     * `customers/{customer_id}/expandedLandingPageViews/{expanded_final_url_fingerprint}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the expanded landing page view.
     * Expanded landing page view resource names have the form:
     * `customers/{customer_id}/expandedLandingPageViews/{expanded_final_url_fingerprint}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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

    private com.google.protobuf.StringValue expandedFinalUrl_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> expandedFinalUrlBuilder_;
    /**
     * <pre>
     * Output only. The final URL that clicks are directed to.
     * </pre>
     *
     * <code>.google.protobuf.StringValue expanded_final_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the expandedFinalUrl field is set.
     */
    public boolean hasExpandedFinalUrl() {
      return expandedFinalUrlBuilder_ != null || expandedFinalUrl_ != null;
    }
    /**
     * <pre>
     * Output only. The final URL that clicks are directed to.
     * </pre>
     *
     * <code>.google.protobuf.StringValue expanded_final_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The expandedFinalUrl.
     */
    public com.google.protobuf.StringValue getExpandedFinalUrl() {
      if (expandedFinalUrlBuilder_ == null) {
        return expandedFinalUrl_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : expandedFinalUrl_;
      } else {
        return expandedFinalUrlBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. The final URL that clicks are directed to.
     * </pre>
     *
     * <code>.google.protobuf.StringValue expanded_final_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setExpandedFinalUrl(com.google.protobuf.StringValue value) {
      if (expandedFinalUrlBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        expandedFinalUrl_ = value;
        onChanged();
      } else {
        expandedFinalUrlBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The final URL that clicks are directed to.
     * </pre>
     *
     * <code>.google.protobuf.StringValue expanded_final_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setExpandedFinalUrl(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (expandedFinalUrlBuilder_ == null) {
        expandedFinalUrl_ = builderForValue.build();
        onChanged();
      } else {
        expandedFinalUrlBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The final URL that clicks are directed to.
     * </pre>
     *
     * <code>.google.protobuf.StringValue expanded_final_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeExpandedFinalUrl(com.google.protobuf.StringValue value) {
      if (expandedFinalUrlBuilder_ == null) {
        if (expandedFinalUrl_ != null) {
          expandedFinalUrl_ =
            com.google.protobuf.StringValue.newBuilder(expandedFinalUrl_).mergeFrom(value).buildPartial();
        } else {
          expandedFinalUrl_ = value;
        }
        onChanged();
      } else {
        expandedFinalUrlBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The final URL that clicks are directed to.
     * </pre>
     *
     * <code>.google.protobuf.StringValue expanded_final_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearExpandedFinalUrl() {
      if (expandedFinalUrlBuilder_ == null) {
        expandedFinalUrl_ = null;
        onChanged();
      } else {
        expandedFinalUrl_ = null;
        expandedFinalUrlBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The final URL that clicks are directed to.
     * </pre>
     *
     * <code>.google.protobuf.StringValue expanded_final_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.StringValue.Builder getExpandedFinalUrlBuilder() {
      
      onChanged();
      return getExpandedFinalUrlFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. The final URL that clicks are directed to.
     * </pre>
     *
     * <code>.google.protobuf.StringValue expanded_final_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.protobuf.StringValueOrBuilder getExpandedFinalUrlOrBuilder() {
      if (expandedFinalUrlBuilder_ != null) {
        return expandedFinalUrlBuilder_.getMessageOrBuilder();
      } else {
        return expandedFinalUrl_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : expandedFinalUrl_;
      }
    }
    /**
     * <pre>
     * Output only. The final URL that clicks are directed to.
     * </pre>
     *
     * <code>.google.protobuf.StringValue expanded_final_url = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getExpandedFinalUrlFieldBuilder() {
      if (expandedFinalUrlBuilder_ == null) {
        expandedFinalUrlBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getExpandedFinalUrl(),
                getParentForChildren(),
                isClean());
        expandedFinalUrl_ = null;
      }
      return expandedFinalUrlBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v4.resources.ExpandedLandingPageView)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v4.resources.ExpandedLandingPageView)
  private static final com.google.ads.googleads.v4.resources.ExpandedLandingPageView DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v4.resources.ExpandedLandingPageView();
  }

  public static com.google.ads.googleads.v4.resources.ExpandedLandingPageView getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExpandedLandingPageView>
      PARSER = new com.google.protobuf.AbstractParser<ExpandedLandingPageView>() {
    @java.lang.Override
    public ExpandedLandingPageView parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExpandedLandingPageView(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExpandedLandingPageView> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExpandedLandingPageView> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v4.resources.ExpandedLandingPageView getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/services/ad_group_criterion_service.proto

package com.google.ads.googleads.v14.services;

/**
 * <pre>
 * The result for the criterion mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.services.MutateAdGroupCriterionResult}
 */
public final class MutateAdGroupCriterionResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.services.MutateAdGroupCriterionResult)
    MutateAdGroupCriterionResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateAdGroupCriterionResult.newBuilder() to construct.
  private MutateAdGroupCriterionResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateAdGroupCriterionResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateAdGroupCriterionResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.services.AdGroupCriterionServiceProto.internal_static_google_ads_googleads_v14_services_MutateAdGroupCriterionResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.services.AdGroupCriterionServiceProto.internal_static_google_ads_googleads_v14_services_MutateAdGroupCriterionResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult.class, com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult.Builder.class);
  }

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

  public static final int AD_GROUP_CRITERION_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v14.resources.AdGroupCriterion adGroupCriterion_;
  /**
   * <pre>
   * The mutated ad group criterion with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.AdGroupCriterion ad_group_criterion = 2;</code>
   * @return Whether the adGroupCriterion field is set.
   */
  @java.lang.Override
  public boolean hasAdGroupCriterion() {
    return adGroupCriterion_ != null;
  }
  /**
   * <pre>
   * The mutated ad group criterion with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.AdGroupCriterion ad_group_criterion = 2;</code>
   * @return The adGroupCriterion.
   */
  @java.lang.Override
  public com.google.ads.googleads.v14.resources.AdGroupCriterion getAdGroupCriterion() {
    return adGroupCriterion_ == null ? com.google.ads.googleads.v14.resources.AdGroupCriterion.getDefaultInstance() : adGroupCriterion_;
  }
  /**
   * <pre>
   * The mutated ad group criterion with only mutable fields after mutate. The
   * field will only be returned when response_content_type is set to
   * "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v14.resources.AdGroupCriterion ad_group_criterion = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v14.resources.AdGroupCriterionOrBuilder getAdGroupCriterionOrBuilder() {
    return adGroupCriterion_ == null ? com.google.ads.googleads.v14.resources.AdGroupCriterion.getDefaultInstance() : adGroupCriterion_;
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
    if (adGroupCriterion_ != null) {
      output.writeMessage(2, getAdGroupCriterion());
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
    if (adGroupCriterion_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAdGroupCriterion());
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
    if (!(obj instanceof com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult other = (com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasAdGroupCriterion() != other.hasAdGroupCriterion()) return false;
    if (hasAdGroupCriterion()) {
      if (!getAdGroupCriterion()
          .equals(other.getAdGroupCriterion())) return false;
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
    if (hasAdGroupCriterion()) {
      hash = (37 * hash) + AD_GROUP_CRITERION_FIELD_NUMBER;
      hash = (53 * hash) + getAdGroupCriterion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult prototype) {
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
   * The result for the criterion mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.services.MutateAdGroupCriterionResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.services.MutateAdGroupCriterionResult)
      com.google.ads.googleads.v14.services.MutateAdGroupCriterionResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.services.AdGroupCriterionServiceProto.internal_static_google_ads_googleads_v14_services_MutateAdGroupCriterionResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.services.AdGroupCriterionServiceProto.internal_static_google_ads_googleads_v14_services_MutateAdGroupCriterionResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult.class, com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult.newBuilder()
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
      adGroupCriterion_ = null;
      if (adGroupCriterionBuilder_ != null) {
        adGroupCriterionBuilder_.dispose();
        adGroupCriterionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v14.services.AdGroupCriterionServiceProto.internal_static_google_ads_googleads_v14_services_MutateAdGroupCriterionResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult build() {
      com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult buildPartial() {
      com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult result = new com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceName_ = resourceName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.adGroupCriterion_ = adGroupCriterionBuilder_ == null
            ? adGroupCriterion_
            : adGroupCriterionBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult) {
        return mergeFrom((com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult other) {
      if (other == com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAdGroupCriterion()) {
        mergeAdGroupCriterion(other.getAdGroupCriterion());
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
                  getAdGroupCriterionFieldBuilder().getBuilder(),
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

    private com.google.ads.googleads.v14.resources.AdGroupCriterion adGroupCriterion_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v14.resources.AdGroupCriterion, com.google.ads.googleads.v14.resources.AdGroupCriterion.Builder, com.google.ads.googleads.v14.resources.AdGroupCriterionOrBuilder> adGroupCriterionBuilder_;
    /**
     * <pre>
     * The mutated ad group criterion with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v14.resources.AdGroupCriterion ad_group_criterion = 2;</code>
     * @return Whether the adGroupCriterion field is set.
     */
    public boolean hasAdGroupCriterion() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The mutated ad group criterion with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v14.resources.AdGroupCriterion ad_group_criterion = 2;</code>
     * @return The adGroupCriterion.
     */
    public com.google.ads.googleads.v14.resources.AdGroupCriterion getAdGroupCriterion() {
      if (adGroupCriterionBuilder_ == null) {
        return adGroupCriterion_ == null ? com.google.ads.googleads.v14.resources.AdGroupCriterion.getDefaultInstance() : adGroupCriterion_;
      } else {
        return adGroupCriterionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated ad group criterion with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v14.resources.AdGroupCriterion ad_group_criterion = 2;</code>
     */
    public Builder setAdGroupCriterion(com.google.ads.googleads.v14.resources.AdGroupCriterion value) {
      if (adGroupCriterionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        adGroupCriterion_ = value;
      } else {
        adGroupCriterionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated ad group criterion with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v14.resources.AdGroupCriterion ad_group_criterion = 2;</code>
     */
    public Builder setAdGroupCriterion(
        com.google.ads.googleads.v14.resources.AdGroupCriterion.Builder builderForValue) {
      if (adGroupCriterionBuilder_ == null) {
        adGroupCriterion_ = builderForValue.build();
      } else {
        adGroupCriterionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated ad group criterion with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v14.resources.AdGroupCriterion ad_group_criterion = 2;</code>
     */
    public Builder mergeAdGroupCriterion(com.google.ads.googleads.v14.resources.AdGroupCriterion value) {
      if (adGroupCriterionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          adGroupCriterion_ != null &&
          adGroupCriterion_ != com.google.ads.googleads.v14.resources.AdGroupCriterion.getDefaultInstance()) {
          getAdGroupCriterionBuilder().mergeFrom(value);
        } else {
          adGroupCriterion_ = value;
        }
      } else {
        adGroupCriterionBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated ad group criterion with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v14.resources.AdGroupCriterion ad_group_criterion = 2;</code>
     */
    public Builder clearAdGroupCriterion() {
      bitField0_ = (bitField0_ & ~0x00000002);
      adGroupCriterion_ = null;
      if (adGroupCriterionBuilder_ != null) {
        adGroupCriterionBuilder_.dispose();
        adGroupCriterionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated ad group criterion with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v14.resources.AdGroupCriterion ad_group_criterion = 2;</code>
     */
    public com.google.ads.googleads.v14.resources.AdGroupCriterion.Builder getAdGroupCriterionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAdGroupCriterionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated ad group criterion with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v14.resources.AdGroupCriterion ad_group_criterion = 2;</code>
     */
    public com.google.ads.googleads.v14.resources.AdGroupCriterionOrBuilder getAdGroupCriterionOrBuilder() {
      if (adGroupCriterionBuilder_ != null) {
        return adGroupCriterionBuilder_.getMessageOrBuilder();
      } else {
        return adGroupCriterion_ == null ?
            com.google.ads.googleads.v14.resources.AdGroupCriterion.getDefaultInstance() : adGroupCriterion_;
      }
    }
    /**
     * <pre>
     * The mutated ad group criterion with only mutable fields after mutate. The
     * field will only be returned when response_content_type is set to
     * "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v14.resources.AdGroupCriterion ad_group_criterion = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v14.resources.AdGroupCriterion, com.google.ads.googleads.v14.resources.AdGroupCriterion.Builder, com.google.ads.googleads.v14.resources.AdGroupCriterionOrBuilder> 
        getAdGroupCriterionFieldBuilder() {
      if (adGroupCriterionBuilder_ == null) {
        adGroupCriterionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v14.resources.AdGroupCriterion, com.google.ads.googleads.v14.resources.AdGroupCriterion.Builder, com.google.ads.googleads.v14.resources.AdGroupCriterionOrBuilder>(
                getAdGroupCriterion(),
                getParentForChildren(),
                isClean());
        adGroupCriterion_ = null;
      }
      return adGroupCriterionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.services.MutateAdGroupCriterionResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.services.MutateAdGroupCriterionResult)
  private static final com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult();
  }

  public static com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateAdGroupCriterionResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateAdGroupCriterionResult>() {
    @java.lang.Override
    public MutateAdGroupCriterionResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<MutateAdGroupCriterionResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateAdGroupCriterionResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.services.MutateAdGroupCriterionResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


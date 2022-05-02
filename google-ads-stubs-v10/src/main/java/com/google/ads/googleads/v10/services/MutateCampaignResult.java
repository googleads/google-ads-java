// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/services/campaign_service.proto

package com.google.ads.googleads.v10.services;

/**
 * <pre>
 * The result for the campaign mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.services.MutateCampaignResult}
 */
public final class MutateCampaignResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.services.MutateCampaignResult)
    MutateCampaignResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateCampaignResult.newBuilder() to construct.
  private MutateCampaignResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateCampaignResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateCampaignResult();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutateCampaignResult(
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
            com.google.ads.googleads.v10.resources.Campaign.Builder subBuilder = null;
            if (campaign_ != null) {
              subBuilder = campaign_.toBuilder();
            }
            campaign_ = input.readMessage(com.google.ads.googleads.v10.resources.Campaign.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(campaign_);
              campaign_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v10.services.CampaignServiceProto.internal_static_google_ads_googleads_v10_services_MutateCampaignResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.services.CampaignServiceProto.internal_static_google_ads_googleads_v10_services_MutateCampaignResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.services.MutateCampaignResult.class, com.google.ads.googleads.v10.services.MutateCampaignResult.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
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

  public static final int CAMPAIGN_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v10.resources.Campaign campaign_;
  /**
   * <pre>
   * The mutated campaign with only mutable fields after mutate. The field will
   * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.Campaign campaign = 2;</code>
   * @return Whether the campaign field is set.
   */
  @java.lang.Override
  public boolean hasCampaign() {
    return campaign_ != null;
  }
  /**
   * <pre>
   * The mutated campaign with only mutable fields after mutate. The field will
   * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.Campaign campaign = 2;</code>
   * @return The campaign.
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.resources.Campaign getCampaign() {
    return campaign_ == null ? com.google.ads.googleads.v10.resources.Campaign.getDefaultInstance() : campaign_;
  }
  /**
   * <pre>
   * The mutated campaign with only mutable fields after mutate. The field will
   * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.Campaign campaign = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.resources.CampaignOrBuilder getCampaignOrBuilder() {
    return getCampaign();
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
    if (campaign_ != null) {
      output.writeMessage(2, getCampaign());
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
    if (campaign_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCampaign());
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
    if (!(obj instanceof com.google.ads.googleads.v10.services.MutateCampaignResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.services.MutateCampaignResult other = (com.google.ads.googleads.v10.services.MutateCampaignResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasCampaign() != other.hasCampaign()) return false;
    if (hasCampaign()) {
      if (!getCampaign()
          .equals(other.getCampaign())) return false;
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
    if (hasCampaign()) {
      hash = (37 * hash) + CAMPAIGN_FIELD_NUMBER;
      hash = (53 * hash) + getCampaign().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.services.MutateCampaignResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.MutateCampaignResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateCampaignResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.MutateCampaignResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateCampaignResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.services.MutateCampaignResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateCampaignResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.MutateCampaignResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateCampaignResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.MutateCampaignResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.services.MutateCampaignResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.services.MutateCampaignResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.services.MutateCampaignResult prototype) {
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
   * The result for the campaign mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.services.MutateCampaignResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.services.MutateCampaignResult)
      com.google.ads.googleads.v10.services.MutateCampaignResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.services.CampaignServiceProto.internal_static_google_ads_googleads_v10_services_MutateCampaignResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.services.CampaignServiceProto.internal_static_google_ads_googleads_v10_services_MutateCampaignResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.services.MutateCampaignResult.class, com.google.ads.googleads.v10.services.MutateCampaignResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.services.MutateCampaignResult.newBuilder()
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

      if (campaignBuilder_ == null) {
        campaign_ = null;
      } else {
        campaign_ = null;
        campaignBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.services.CampaignServiceProto.internal_static_google_ads_googleads_v10_services_MutateCampaignResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.MutateCampaignResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.services.MutateCampaignResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.MutateCampaignResult build() {
      com.google.ads.googleads.v10.services.MutateCampaignResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.services.MutateCampaignResult buildPartial() {
      com.google.ads.googleads.v10.services.MutateCampaignResult result = new com.google.ads.googleads.v10.services.MutateCampaignResult(this);
      result.resourceName_ = resourceName_;
      if (campaignBuilder_ == null) {
        result.campaign_ = campaign_;
      } else {
        result.campaign_ = campaignBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v10.services.MutateCampaignResult) {
        return mergeFrom((com.google.ads.googleads.v10.services.MutateCampaignResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.services.MutateCampaignResult other) {
      if (other == com.google.ads.googleads.v10.services.MutateCampaignResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (other.hasCampaign()) {
        mergeCampaign(other.getCampaign());
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
      com.google.ads.googleads.v10.services.MutateCampaignResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.services.MutateCampaignResult) e.getUnfinishedMessage();
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
      if (value == null) {
    throw new NullPointerException();
  }
  
      resourceName_ = value;
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
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      resourceName_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v10.resources.Campaign campaign_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.resources.Campaign, com.google.ads.googleads.v10.resources.Campaign.Builder, com.google.ads.googleads.v10.resources.CampaignOrBuilder> campaignBuilder_;
    /**
     * <pre>
     * The mutated campaign with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Campaign campaign = 2;</code>
     * @return Whether the campaign field is set.
     */
    public boolean hasCampaign() {
      return campaignBuilder_ != null || campaign_ != null;
    }
    /**
     * <pre>
     * The mutated campaign with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Campaign campaign = 2;</code>
     * @return The campaign.
     */
    public com.google.ads.googleads.v10.resources.Campaign getCampaign() {
      if (campaignBuilder_ == null) {
        return campaign_ == null ? com.google.ads.googleads.v10.resources.Campaign.getDefaultInstance() : campaign_;
      } else {
        return campaignBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated campaign with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Campaign campaign = 2;</code>
     */
    public Builder setCampaign(com.google.ads.googleads.v10.resources.Campaign value) {
      if (campaignBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        campaign_ = value;
        onChanged();
      } else {
        campaignBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated campaign with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Campaign campaign = 2;</code>
     */
    public Builder setCampaign(
        com.google.ads.googleads.v10.resources.Campaign.Builder builderForValue) {
      if (campaignBuilder_ == null) {
        campaign_ = builderForValue.build();
        onChanged();
      } else {
        campaignBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The mutated campaign with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Campaign campaign = 2;</code>
     */
    public Builder mergeCampaign(com.google.ads.googleads.v10.resources.Campaign value) {
      if (campaignBuilder_ == null) {
        if (campaign_ != null) {
          campaign_ =
            com.google.ads.googleads.v10.resources.Campaign.newBuilder(campaign_).mergeFrom(value).buildPartial();
        } else {
          campaign_ = value;
        }
        onChanged();
      } else {
        campaignBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The mutated campaign with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Campaign campaign = 2;</code>
     */
    public Builder clearCampaign() {
      if (campaignBuilder_ == null) {
        campaign_ = null;
        onChanged();
      } else {
        campaign_ = null;
        campaignBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The mutated campaign with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Campaign campaign = 2;</code>
     */
    public com.google.ads.googleads.v10.resources.Campaign.Builder getCampaignBuilder() {
      
      onChanged();
      return getCampaignFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated campaign with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Campaign campaign = 2;</code>
     */
    public com.google.ads.googleads.v10.resources.CampaignOrBuilder getCampaignOrBuilder() {
      if (campaignBuilder_ != null) {
        return campaignBuilder_.getMessageOrBuilder();
      } else {
        return campaign_ == null ?
            com.google.ads.googleads.v10.resources.Campaign.getDefaultInstance() : campaign_;
      }
    }
    /**
     * <pre>
     * The mutated campaign with only mutable fields after mutate. The field will
     * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.Campaign campaign = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.resources.Campaign, com.google.ads.googleads.v10.resources.Campaign.Builder, com.google.ads.googleads.v10.resources.CampaignOrBuilder> 
        getCampaignFieldBuilder() {
      if (campaignBuilder_ == null) {
        campaignBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v10.resources.Campaign, com.google.ads.googleads.v10.resources.Campaign.Builder, com.google.ads.googleads.v10.resources.CampaignOrBuilder>(
                getCampaign(),
                getParentForChildren(),
                isClean());
        campaign_ = null;
      }
      return campaignBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.services.MutateCampaignResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.services.MutateCampaignResult)
  private static final com.google.ads.googleads.v10.services.MutateCampaignResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.services.MutateCampaignResult();
  }

  public static com.google.ads.googleads.v10.services.MutateCampaignResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateCampaignResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateCampaignResult>() {
    @java.lang.Override
    public MutateCampaignResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutateCampaignResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutateCampaignResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateCampaignResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.services.MutateCampaignResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


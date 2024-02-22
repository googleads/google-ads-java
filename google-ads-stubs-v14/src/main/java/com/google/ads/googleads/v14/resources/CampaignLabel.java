// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/campaign_label.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.resources;

/**
 * <pre>
 * Represents a relationship between a campaign and a label.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.resources.CampaignLabel}
 */
public final class CampaignLabel extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.resources.CampaignLabel)
    CampaignLabelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CampaignLabel.newBuilder() to construct.
  private CampaignLabel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CampaignLabel() {
    resourceName_ = "";
    campaign_ = "";
    label_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CampaignLabel();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.resources.CampaignLabelProto.internal_static_google_ads_googleads_v14_resources_CampaignLabel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.resources.CampaignLabelProto.internal_static_google_ads_googleads_v14_resources_CampaignLabel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.resources.CampaignLabel.class, com.google.ads.googleads.v14.resources.CampaignLabel.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceName_ = "";
  /**
   * <pre>
   * Immutable. Name of the resource.
   * Campaign label resource names have the form:
   * `customers/{customer_id}/campaignLabels/{campaign_id}~{label_id}`
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
   * Immutable. Name of the resource.
   * Campaign label resource names have the form:
   * `customers/{customer_id}/campaignLabels/{campaign_id}~{label_id}`
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

  public static final int CAMPAIGN_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object campaign_ = "";
  /**
   * <pre>
   * Immutable. The campaign to which the label is attached.
   * </pre>
   *
   * <code>optional string campaign = 4 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the campaign field is set.
   */
  @java.lang.Override
  public boolean hasCampaign() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Immutable. The campaign to which the label is attached.
   * </pre>
   *
   * <code>optional string campaign = 4 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  @java.lang.Override
  public java.lang.String getCampaign() {
    java.lang.Object ref = campaign_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      campaign_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Immutable. The campaign to which the label is attached.
   * </pre>
   *
   * <code>optional string campaign = 4 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCampaignBytes() {
    java.lang.Object ref = campaign_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      campaign_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LABEL_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object label_ = "";
  /**
   * <pre>
   * Immutable. The label assigned to the campaign.
   * </pre>
   *
   * <code>optional string label = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return Whether the label field is set.
   */
  @java.lang.Override
  public boolean hasLabel() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Immutable. The label assigned to the campaign.
   * </pre>
   *
   * <code>optional string label = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The label.
   */
  @java.lang.Override
  public java.lang.String getLabel() {
    java.lang.Object ref = label_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      label_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Immutable. The label assigned to the campaign.
   * </pre>
   *
   * <code>optional string label = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for label.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLabelBytes() {
    java.lang.Object ref = label_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      label_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, campaign_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, label_);
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
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, campaign_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, label_);
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
    if (!(obj instanceof com.google.ads.googleads.v14.resources.CampaignLabel)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.resources.CampaignLabel other = (com.google.ads.googleads.v14.resources.CampaignLabel) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasCampaign() != other.hasCampaign()) return false;
    if (hasCampaign()) {
      if (!getCampaign()
          .equals(other.getCampaign())) return false;
    }
    if (hasLabel() != other.hasLabel()) return false;
    if (hasLabel()) {
      if (!getLabel()
          .equals(other.getLabel())) return false;
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
    if (hasCampaign()) {
      hash = (37 * hash) + CAMPAIGN_FIELD_NUMBER;
      hash = (53 * hash) + getCampaign().hashCode();
    }
    if (hasLabel()) {
      hash = (37 * hash) + LABEL_FIELD_NUMBER;
      hash = (53 * hash) + getLabel().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v14.resources.CampaignLabel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.resources.CampaignLabel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.resources.CampaignLabel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.resources.CampaignLabel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.resources.CampaignLabel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.resources.CampaignLabel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.resources.CampaignLabel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.resources.CampaignLabel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.resources.CampaignLabel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.resources.CampaignLabel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.resources.CampaignLabel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.resources.CampaignLabel parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.resources.CampaignLabel prototype) {
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
   * Represents a relationship between a campaign and a label.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.resources.CampaignLabel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.resources.CampaignLabel)
      com.google.ads.googleads.v14.resources.CampaignLabelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.resources.CampaignLabelProto.internal_static_google_ads_googleads_v14_resources_CampaignLabel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.resources.CampaignLabelProto.internal_static_google_ads_googleads_v14_resources_CampaignLabel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.resources.CampaignLabel.class, com.google.ads.googleads.v14.resources.CampaignLabel.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.resources.CampaignLabel.newBuilder()
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
      campaign_ = "";
      label_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v14.resources.CampaignLabelProto.internal_static_google_ads_googleads_v14_resources_CampaignLabel_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.resources.CampaignLabel getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.resources.CampaignLabel.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.resources.CampaignLabel build() {
      com.google.ads.googleads.v14.resources.CampaignLabel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.resources.CampaignLabel buildPartial() {
      com.google.ads.googleads.v14.resources.CampaignLabel result = new com.google.ads.googleads.v14.resources.CampaignLabel(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v14.resources.CampaignLabel result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceName_ = resourceName_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.campaign_ = campaign_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.label_ = label_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.ads.googleads.v14.resources.CampaignLabel) {
        return mergeFrom((com.google.ads.googleads.v14.resources.CampaignLabel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.resources.CampaignLabel other) {
      if (other == com.google.ads.googleads.v14.resources.CampaignLabel.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasCampaign()) {
        campaign_ = other.campaign_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasLabel()) {
        label_ = other.label_;
        bitField0_ |= 0x00000004;
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
            case 34: {
              campaign_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 34
            case 42: {
              label_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 42
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
     * Immutable. Name of the resource.
     * Campaign label resource names have the form:
     * `customers/{customer_id}/campaignLabels/{campaign_id}~{label_id}`
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
     * Immutable. Name of the resource.
     * Campaign label resource names have the form:
     * `customers/{customer_id}/campaignLabels/{campaign_id}~{label_id}`
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
     * Immutable. Name of the resource.
     * Campaign label resource names have the form:
     * `customers/{customer_id}/campaignLabels/{campaign_id}~{label_id}`
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
     * Immutable. Name of the resource.
     * Campaign label resource names have the form:
     * `customers/{customer_id}/campaignLabels/{campaign_id}~{label_id}`
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
     * Immutable. Name of the resource.
     * Campaign label resource names have the form:
     * `customers/{customer_id}/campaignLabels/{campaign_id}~{label_id}`
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

    private java.lang.Object campaign_ = "";
    /**
     * <pre>
     * Immutable. The campaign to which the label is attached.
     * </pre>
     *
     * <code>optional string campaign = 4 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return Whether the campaign field is set.
     */
    public boolean hasCampaign() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Immutable. The campaign to which the label is attached.
     * </pre>
     *
     * <code>optional string campaign = 4 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The campaign.
     */
    public java.lang.String getCampaign() {
      java.lang.Object ref = campaign_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        campaign_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The campaign to which the label is attached.
     * </pre>
     *
     * <code>optional string campaign = 4 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for campaign.
     */
    public com.google.protobuf.ByteString
        getCampaignBytes() {
      java.lang.Object ref = campaign_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        campaign_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The campaign to which the label is attached.
     * </pre>
     *
     * <code>optional string campaign = 4 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The campaign to set.
     * @return This builder for chaining.
     */
    public Builder setCampaign(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      campaign_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The campaign to which the label is attached.
     * </pre>
     *
     * <code>optional string campaign = 4 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearCampaign() {
      campaign_ = getDefaultInstance().getCampaign();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The campaign to which the label is attached.
     * </pre>
     *
     * <code>optional string campaign = 4 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for campaign to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      campaign_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object label_ = "";
    /**
     * <pre>
     * Immutable. The label assigned to the campaign.
     * </pre>
     *
     * <code>optional string label = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return Whether the label field is set.
     */
    public boolean hasLabel() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Immutable. The label assigned to the campaign.
     * </pre>
     *
     * <code>optional string label = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The label.
     */
    public java.lang.String getLabel() {
      java.lang.Object ref = label_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        label_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The label assigned to the campaign.
     * </pre>
     *
     * <code>optional string label = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for label.
     */
    public com.google.protobuf.ByteString
        getLabelBytes() {
      java.lang.Object ref = label_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        label_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The label assigned to the campaign.
     * </pre>
     *
     * <code>optional string label = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The label to set.
     * @return This builder for chaining.
     */
    public Builder setLabel(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      label_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The label assigned to the campaign.
     * </pre>
     *
     * <code>optional string label = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearLabel() {
      label_ = getDefaultInstance().getLabel();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The label assigned to the campaign.
     * </pre>
     *
     * <code>optional string label = 5 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for label to set.
     * @return This builder for chaining.
     */
    public Builder setLabelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      label_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.resources.CampaignLabel)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.resources.CampaignLabel)
  private static final com.google.ads.googleads.v14.resources.CampaignLabel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.resources.CampaignLabel();
  }

  public static com.google.ads.googleads.v14.resources.CampaignLabel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CampaignLabel>
      PARSER = new com.google.protobuf.AbstractParser<CampaignLabel>() {
    @java.lang.Override
    public CampaignLabel parsePartialFrom(
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

  public static com.google.protobuf.Parser<CampaignLabel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CampaignLabel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.resources.CampaignLabel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/campaign_asset_set.proto

package com.google.ads.googleads.v10.resources;

/**
 * <pre>
 * CampaignAssetSet is the linkage between a campaign and an asset set.
 * Adding a CampaignAssetSet links an asset set with a campaign.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.resources.CampaignAssetSet}
 */
public final class CampaignAssetSet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.resources.CampaignAssetSet)
    CampaignAssetSetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CampaignAssetSet.newBuilder() to construct.
  private CampaignAssetSet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CampaignAssetSet() {
    resourceName_ = "";
    campaign_ = "";
    assetSet_ = "";
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CampaignAssetSet();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CampaignAssetSet(
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
            java.lang.String s = input.readStringRequireUtf8();

            campaign_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            assetSet_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            status_ = rawValue;
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
    return com.google.ads.googleads.v10.resources.CampaignAssetSetProto.internal_static_google_ads_googleads_v10_resources_CampaignAssetSet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.resources.CampaignAssetSetProto.internal_static_google_ads_googleads_v10_resources_CampaignAssetSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.resources.CampaignAssetSet.class, com.google.ads.googleads.v10.resources.CampaignAssetSet.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object resourceName_;
  /**
   * <pre>
   * Immutable. The resource name of the campaign asset set.
   * Asset set asset resource names have the form:
   * `customers/{customer_id}/campaignAssetSets/{campaign_id}~{asset_set_id}`
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
   * Immutable. The resource name of the campaign asset set.
   * Asset set asset resource names have the form:
   * `customers/{customer_id}/campaignAssetSets/{campaign_id}~{asset_set_id}`
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

  public static final int CAMPAIGN_FIELD_NUMBER = 2;
  private volatile java.lang.Object campaign_;
  /**
   * <pre>
   * Immutable. The campaign to which this asset set is linked.
   * </pre>
   *
   * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
   * Immutable. The campaign to which this asset set is linked.
   * </pre>
   *
   * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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

  public static final int ASSET_SET_FIELD_NUMBER = 3;
  private volatile java.lang.Object assetSet_;
  /**
   * <pre>
   * Immutable. The asset set which is linked to the campaign.
   * </pre>
   *
   * <code>string asset_set = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The assetSet.
   */
  @java.lang.Override
  public java.lang.String getAssetSet() {
    java.lang.Object ref = assetSet_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      assetSet_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Immutable. The asset set which is linked to the campaign.
   * </pre>
   *
   * <code>string asset_set = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for assetSet.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAssetSetBytes() {
    java.lang.Object ref = assetSet_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      assetSet_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATUS_FIELD_NUMBER = 4;
  private int status_;
  /**
   * <pre>
   * Output only. The status of the campaign asset set asset. Read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <pre>
   * Output only. The status of the campaign asset set asset. Read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  @java.lang.Override public com.google.ads.googleads.v10.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus getStatus() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v10.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus result = com.google.ads.googleads.v10.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus.valueOf(status_);
    return result == null ? com.google.ads.googleads.v10.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(campaign_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, campaign_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assetSet_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, assetSet_);
    }
    if (status_ != com.google.ads.googleads.v10.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus.UNSPECIFIED.getNumber()) {
      output.writeEnum(4, status_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(campaign_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, campaign_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(assetSet_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, assetSet_);
    }
    if (status_ != com.google.ads.googleads.v10.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, status_);
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
    if (!(obj instanceof com.google.ads.googleads.v10.resources.CampaignAssetSet)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.resources.CampaignAssetSet other = (com.google.ads.googleads.v10.resources.CampaignAssetSet) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (!getCampaign()
        .equals(other.getCampaign())) return false;
    if (!getAssetSet()
        .equals(other.getAssetSet())) return false;
    if (status_ != other.status_) return false;
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
    hash = (37 * hash) + CAMPAIGN_FIELD_NUMBER;
    hash = (53 * hash) + getCampaign().hashCode();
    hash = (37 * hash) + ASSET_SET_FIELD_NUMBER;
    hash = (53 * hash) + getAssetSet().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.resources.CampaignAssetSet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.CampaignAssetSet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.CampaignAssetSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.CampaignAssetSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.CampaignAssetSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.CampaignAssetSet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.CampaignAssetSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.CampaignAssetSet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.CampaignAssetSet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.CampaignAssetSet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.CampaignAssetSet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.CampaignAssetSet parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.resources.CampaignAssetSet prototype) {
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
   * CampaignAssetSet is the linkage between a campaign and an asset set.
   * Adding a CampaignAssetSet links an asset set with a campaign.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.resources.CampaignAssetSet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.resources.CampaignAssetSet)
      com.google.ads.googleads.v10.resources.CampaignAssetSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.resources.CampaignAssetSetProto.internal_static_google_ads_googleads_v10_resources_CampaignAssetSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.resources.CampaignAssetSetProto.internal_static_google_ads_googleads_v10_resources_CampaignAssetSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.resources.CampaignAssetSet.class, com.google.ads.googleads.v10.resources.CampaignAssetSet.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.resources.CampaignAssetSet.newBuilder()
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

      campaign_ = "";

      assetSet_ = "";

      status_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.resources.CampaignAssetSetProto.internal_static_google_ads_googleads_v10_resources_CampaignAssetSet_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.CampaignAssetSet getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.resources.CampaignAssetSet.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.CampaignAssetSet build() {
      com.google.ads.googleads.v10.resources.CampaignAssetSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.CampaignAssetSet buildPartial() {
      com.google.ads.googleads.v10.resources.CampaignAssetSet result = new com.google.ads.googleads.v10.resources.CampaignAssetSet(this);
      result.resourceName_ = resourceName_;
      result.campaign_ = campaign_;
      result.assetSet_ = assetSet_;
      result.status_ = status_;
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
      if (other instanceof com.google.ads.googleads.v10.resources.CampaignAssetSet) {
        return mergeFrom((com.google.ads.googleads.v10.resources.CampaignAssetSet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.resources.CampaignAssetSet other) {
      if (other == com.google.ads.googleads.v10.resources.CampaignAssetSet.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        onChanged();
      }
      if (!other.getCampaign().isEmpty()) {
        campaign_ = other.campaign_;
        onChanged();
      }
      if (!other.getAssetSet().isEmpty()) {
        assetSet_ = other.assetSet_;
        onChanged();
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
      com.google.ads.googleads.v10.resources.CampaignAssetSet parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.resources.CampaignAssetSet) e.getUnfinishedMessage();
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
     * Immutable. The resource name of the campaign asset set.
     * Asset set asset resource names have the form:
     * `customers/{customer_id}/campaignAssetSets/{campaign_id}~{asset_set_id}`
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
     * Immutable. The resource name of the campaign asset set.
     * Asset set asset resource names have the form:
     * `customers/{customer_id}/campaignAssetSets/{campaign_id}~{asset_set_id}`
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
     * Immutable. The resource name of the campaign asset set.
     * Asset set asset resource names have the form:
     * `customers/{customer_id}/campaignAssetSets/{campaign_id}~{asset_set_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
     * Immutable. The resource name of the campaign asset set.
     * Asset set asset resource names have the form:
     * `customers/{customer_id}/campaignAssetSets/{campaign_id}~{asset_set_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      
      resourceName_ = getDefaultInstance().getResourceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The resource name of the campaign asset set.
     * Asset set asset resource names have the form:
     * `customers/{customer_id}/campaignAssetSets/{campaign_id}~{asset_set_id}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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

    private java.lang.Object campaign_ = "";
    /**
     * <pre>
     * Immutable. The campaign to which this asset set is linked.
     * </pre>
     *
     * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
     * Immutable. The campaign to which this asset set is linked.
     * </pre>
     *
     * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
     * Immutable. The campaign to which this asset set is linked.
     * </pre>
     *
     * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The campaign to set.
     * @return This builder for chaining.
     */
    public Builder setCampaign(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      campaign_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The campaign to which this asset set is linked.
     * </pre>
     *
     * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearCampaign() {
      
      campaign_ = getDefaultInstance().getCampaign();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The campaign to which this asset set is linked.
     * </pre>
     *
     * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for campaign to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      campaign_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object assetSet_ = "";
    /**
     * <pre>
     * Immutable. The asset set which is linked to the campaign.
     * </pre>
     *
     * <code>string asset_set = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The assetSet.
     */
    public java.lang.String getAssetSet() {
      java.lang.Object ref = assetSet_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        assetSet_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The asset set which is linked to the campaign.
     * </pre>
     *
     * <code>string asset_set = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for assetSet.
     */
    public com.google.protobuf.ByteString
        getAssetSetBytes() {
      java.lang.Object ref = assetSet_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        assetSet_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Immutable. The asset set which is linked to the campaign.
     * </pre>
     *
     * <code>string asset_set = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The assetSet to set.
     * @return This builder for chaining.
     */
    public Builder setAssetSet(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      assetSet_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The asset set which is linked to the campaign.
     * </pre>
     *
     * <code>string asset_set = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearAssetSet() {
      
      assetSet_ = getDefaultInstance().getAssetSet();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The asset set which is linked to the campaign.
     * </pre>
     *
     * <code>string asset_set = 3 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for assetSet to set.
     * @return This builder for chaining.
     */
    public Builder setAssetSetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      assetSet_ = value;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <pre>
     * Output only. The status of the campaign asset set asset. Read-only.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <pre>
     * Output only. The status of the campaign asset set asset. Read-only.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The status of the campaign asset set asset. Read-only.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The status.
     */
    @java.lang.Override
    public com.google.ads.googleads.v10.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus getStatus() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v10.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus result = com.google.ads.googleads.v10.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus.valueOf(status_);
      return result == null ? com.google.ads.googleads.v10.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Output only. The status of the campaign asset set asset. Read-only.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(com.google.ads.googleads.v10.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The status of the campaign asset set asset. Read-only.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.AssetSetLinkStatusEnum.AssetSetLinkStatus status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.resources.CampaignAssetSet)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.resources.CampaignAssetSet)
  private static final com.google.ads.googleads.v10.resources.CampaignAssetSet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.resources.CampaignAssetSet();
  }

  public static com.google.ads.googleads.v10.resources.CampaignAssetSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CampaignAssetSet>
      PARSER = new com.google.protobuf.AbstractParser<CampaignAssetSet>() {
    @java.lang.Override
    public CampaignAssetSet parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CampaignAssetSet(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CampaignAssetSet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CampaignAssetSet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.resources.CampaignAssetSet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


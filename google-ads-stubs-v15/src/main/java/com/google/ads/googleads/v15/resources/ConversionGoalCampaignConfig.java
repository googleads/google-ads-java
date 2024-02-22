// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/conversion_goal_campaign_config.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.resources;

/**
 * <pre>
 * Conversion goal settings for a Campaign.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.resources.ConversionGoalCampaignConfig}
 */
public final class ConversionGoalCampaignConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.resources.ConversionGoalCampaignConfig)
    ConversionGoalCampaignConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConversionGoalCampaignConfig.newBuilder() to construct.
  private ConversionGoalCampaignConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConversionGoalCampaignConfig() {
    resourceName_ = "";
    campaign_ = "";
    goalConfigLevel_ = 0;
    customConversionGoal_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConversionGoalCampaignConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfigProto.internal_static_google_ads_googleads_v15_resources_ConversionGoalCampaignConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfigProto.internal_static_google_ads_googleads_v15_resources_ConversionGoalCampaignConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig.class, com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceName_ = "";
  /**
   * <pre>
   * Immutable. The resource name of the conversion goal campaign config.
   * Conversion goal campaign config resource names have the form:
   *
   * `customers/{customer_id}/conversionGoalCampaignConfigs/{campaign_id}`
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
   * Immutable. The resource name of the conversion goal campaign config.
   * Conversion goal campaign config resource names have the form:
   *
   * `customers/{customer_id}/conversionGoalCampaignConfigs/{campaign_id}`
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
  @SuppressWarnings("serial")
  private volatile java.lang.Object campaign_ = "";
  /**
   * <pre>
   * Immutable. The campaign with which this conversion goal campaign config is
   * associated.
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
   * Immutable. The campaign with which this conversion goal campaign config is
   * associated.
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

  public static final int GOAL_CONFIG_LEVEL_FIELD_NUMBER = 3;
  private int goalConfigLevel_ = 0;
  /**
   * <pre>
   * The level of goal config the campaign is using.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.GoalConfigLevelEnum.GoalConfigLevel goal_config_level = 3;</code>
   * @return The enum numeric value on the wire for goalConfigLevel.
   */
  @java.lang.Override public int getGoalConfigLevelValue() {
    return goalConfigLevel_;
  }
  /**
   * <pre>
   * The level of goal config the campaign is using.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.GoalConfigLevelEnum.GoalConfigLevel goal_config_level = 3;</code>
   * @return The goalConfigLevel.
   */
  @java.lang.Override public com.google.ads.googleads.v15.enums.GoalConfigLevelEnum.GoalConfigLevel getGoalConfigLevel() {
    com.google.ads.googleads.v15.enums.GoalConfigLevelEnum.GoalConfigLevel result = com.google.ads.googleads.v15.enums.GoalConfigLevelEnum.GoalConfigLevel.forNumber(goalConfigLevel_);
    return result == null ? com.google.ads.googleads.v15.enums.GoalConfigLevelEnum.GoalConfigLevel.UNRECOGNIZED : result;
  }

  public static final int CUSTOM_CONVERSION_GOAL_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object customConversionGoal_ = "";
  /**
   * <pre>
   * The custom conversion goal the campaign is using for optimization.
   * </pre>
   *
   * <code>string custom_conversion_goal = 4 [(.google.api.resource_reference) = { ... }</code>
   * @return The customConversionGoal.
   */
  @java.lang.Override
  public java.lang.String getCustomConversionGoal() {
    java.lang.Object ref = customConversionGoal_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customConversionGoal_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The custom conversion goal the campaign is using for optimization.
   * </pre>
   *
   * <code>string custom_conversion_goal = 4 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for customConversionGoal.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomConversionGoalBytes() {
    java.lang.Object ref = customConversionGoal_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customConversionGoal_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(campaign_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, campaign_);
    }
    if (goalConfigLevel_ != com.google.ads.googleads.v15.enums.GoalConfigLevelEnum.GoalConfigLevel.UNSPECIFIED.getNumber()) {
      output.writeEnum(3, goalConfigLevel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customConversionGoal_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, customConversionGoal_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(campaign_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, campaign_);
    }
    if (goalConfigLevel_ != com.google.ads.googleads.v15.enums.GoalConfigLevelEnum.GoalConfigLevel.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, goalConfigLevel_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customConversionGoal_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, customConversionGoal_);
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
    if (!(obj instanceof com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig other = (com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (!getCampaign()
        .equals(other.getCampaign())) return false;
    if (goalConfigLevel_ != other.goalConfigLevel_) return false;
    if (!getCustomConversionGoal()
        .equals(other.getCustomConversionGoal())) return false;
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
    hash = (37 * hash) + CAMPAIGN_FIELD_NUMBER;
    hash = (53 * hash) + getCampaign().hashCode();
    hash = (37 * hash) + GOAL_CONFIG_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + goalConfigLevel_;
    hash = (37 * hash) + CUSTOM_CONVERSION_GOAL_FIELD_NUMBER;
    hash = (53 * hash) + getCustomConversionGoal().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig prototype) {
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
   * Conversion goal settings for a Campaign.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.resources.ConversionGoalCampaignConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.resources.ConversionGoalCampaignConfig)
      com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfigProto.internal_static_google_ads_googleads_v15_resources_ConversionGoalCampaignConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfigProto.internal_static_google_ads_googleads_v15_resources_ConversionGoalCampaignConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig.class, com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig.newBuilder()
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
      goalConfigLevel_ = 0;
      customConversionGoal_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfigProto.internal_static_google_ads_googleads_v15_resources_ConversionGoalCampaignConfig_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig build() {
      com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig buildPartial() {
      com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig result = new com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceName_ = resourceName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.campaign_ = campaign_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.goalConfigLevel_ = goalConfigLevel_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.customConversionGoal_ = customConversionGoal_;
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
      if (other instanceof com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig) {
        return mergeFrom((com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig other) {
      if (other == com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getCampaign().isEmpty()) {
        campaign_ = other.campaign_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.goalConfigLevel_ != 0) {
        setGoalConfigLevelValue(other.getGoalConfigLevelValue());
      }
      if (!other.getCustomConversionGoal().isEmpty()) {
        customConversionGoal_ = other.customConversionGoal_;
        bitField0_ |= 0x00000008;
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
            case 18: {
              campaign_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              goalConfigLevel_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              customConversionGoal_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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
     * Immutable. The resource name of the conversion goal campaign config.
     * Conversion goal campaign config resource names have the form:
     *
     * `customers/{customer_id}/conversionGoalCampaignConfigs/{campaign_id}`
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
     * Immutable. The resource name of the conversion goal campaign config.
     * Conversion goal campaign config resource names have the form:
     *
     * `customers/{customer_id}/conversionGoalCampaignConfigs/{campaign_id}`
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
     * Immutable. The resource name of the conversion goal campaign config.
     * Conversion goal campaign config resource names have the form:
     *
     * `customers/{customer_id}/conversionGoalCampaignConfigs/{campaign_id}`
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
     * Immutable. The resource name of the conversion goal campaign config.
     * Conversion goal campaign config resource names have the form:
     *
     * `customers/{customer_id}/conversionGoalCampaignConfigs/{campaign_id}`
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
     * Immutable. The resource name of the conversion goal campaign config.
     * Conversion goal campaign config resource names have the form:
     *
     * `customers/{customer_id}/conversionGoalCampaignConfigs/{campaign_id}`
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
     * Immutable. The campaign with which this conversion goal campaign config is
     * associated.
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
     * Immutable. The campaign with which this conversion goal campaign config is
     * associated.
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
     * Immutable. The campaign with which this conversion goal campaign config is
     * associated.
     * </pre>
     *
     * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
     * Immutable. The campaign with which this conversion goal campaign config is
     * associated.
     * </pre>
     *
     * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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
     * Immutable. The campaign with which this conversion goal campaign config is
     * associated.
     * </pre>
     *
     * <code>string campaign = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
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

    private int goalConfigLevel_ = 0;
    /**
     * <pre>
     * The level of goal config the campaign is using.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.enums.GoalConfigLevelEnum.GoalConfigLevel goal_config_level = 3;</code>
     * @return The enum numeric value on the wire for goalConfigLevel.
     */
    @java.lang.Override public int getGoalConfigLevelValue() {
      return goalConfigLevel_;
    }
    /**
     * <pre>
     * The level of goal config the campaign is using.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.enums.GoalConfigLevelEnum.GoalConfigLevel goal_config_level = 3;</code>
     * @param value The enum numeric value on the wire for goalConfigLevel to set.
     * @return This builder for chaining.
     */
    public Builder setGoalConfigLevelValue(int value) {
      goalConfigLevel_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The level of goal config the campaign is using.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.enums.GoalConfigLevelEnum.GoalConfigLevel goal_config_level = 3;</code>
     * @return The goalConfigLevel.
     */
    @java.lang.Override
    public com.google.ads.googleads.v15.enums.GoalConfigLevelEnum.GoalConfigLevel getGoalConfigLevel() {
      com.google.ads.googleads.v15.enums.GoalConfigLevelEnum.GoalConfigLevel result = com.google.ads.googleads.v15.enums.GoalConfigLevelEnum.GoalConfigLevel.forNumber(goalConfigLevel_);
      return result == null ? com.google.ads.googleads.v15.enums.GoalConfigLevelEnum.GoalConfigLevel.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The level of goal config the campaign is using.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.enums.GoalConfigLevelEnum.GoalConfigLevel goal_config_level = 3;</code>
     * @param value The goalConfigLevel to set.
     * @return This builder for chaining.
     */
    public Builder setGoalConfigLevel(com.google.ads.googleads.v15.enums.GoalConfigLevelEnum.GoalConfigLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      goalConfigLevel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The level of goal config the campaign is using.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.enums.GoalConfigLevelEnum.GoalConfigLevel goal_config_level = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGoalConfigLevel() {
      bitField0_ = (bitField0_ & ~0x00000004);
      goalConfigLevel_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object customConversionGoal_ = "";
    /**
     * <pre>
     * The custom conversion goal the campaign is using for optimization.
     * </pre>
     *
     * <code>string custom_conversion_goal = 4 [(.google.api.resource_reference) = { ... }</code>
     * @return The customConversionGoal.
     */
    public java.lang.String getCustomConversionGoal() {
      java.lang.Object ref = customConversionGoal_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customConversionGoal_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The custom conversion goal the campaign is using for optimization.
     * </pre>
     *
     * <code>string custom_conversion_goal = 4 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for customConversionGoal.
     */
    public com.google.protobuf.ByteString
        getCustomConversionGoalBytes() {
      java.lang.Object ref = customConversionGoal_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customConversionGoal_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The custom conversion goal the campaign is using for optimization.
     * </pre>
     *
     * <code>string custom_conversion_goal = 4 [(.google.api.resource_reference) = { ... }</code>
     * @param value The customConversionGoal to set.
     * @return This builder for chaining.
     */
    public Builder setCustomConversionGoal(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      customConversionGoal_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The custom conversion goal the campaign is using for optimization.
     * </pre>
     *
     * <code>string custom_conversion_goal = 4 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomConversionGoal() {
      customConversionGoal_ = getDefaultInstance().getCustomConversionGoal();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The custom conversion goal the campaign is using for optimization.
     * </pre>
     *
     * <code>string custom_conversion_goal = 4 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for customConversionGoal to set.
     * @return This builder for chaining.
     */
    public Builder setCustomConversionGoalBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      customConversionGoal_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.resources.ConversionGoalCampaignConfig)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.resources.ConversionGoalCampaignConfig)
  private static final com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig();
  }

  public static com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConversionGoalCampaignConfig>
      PARSER = new com.google.protobuf.AbstractParser<ConversionGoalCampaignConfig>() {
    @java.lang.Override
    public ConversionGoalCampaignConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConversionGoalCampaignConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConversionGoalCampaignConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.resources.ConversionGoalCampaignConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


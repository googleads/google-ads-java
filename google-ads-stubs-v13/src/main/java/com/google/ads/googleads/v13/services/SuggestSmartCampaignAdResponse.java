// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/smart_campaign_suggest_service.proto

package com.google.ads.googleads.v13.services;

/**
 * <pre>
 * Response message for
 * [SmartCampaignSuggestService.SuggestSmartCampaignAd][google.ads.googleads.v13.services.SmartCampaignSuggestService.SuggestSmartCampaignAd].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse}
 */
public final class SuggestSmartCampaignAdResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse)
    SuggestSmartCampaignAdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SuggestSmartCampaignAdResponse.newBuilder() to construct.
  private SuggestSmartCampaignAdResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SuggestSmartCampaignAdResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SuggestSmartCampaignAdResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v13.services.SmartCampaignSuggestServiceProto.internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignAdResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v13.services.SmartCampaignSuggestServiceProto.internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignAdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse.class, com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse.Builder.class);
  }

  public static final int AD_INFO_FIELD_NUMBER = 1;
  private com.google.ads.googleads.v13.common.SmartCampaignAdInfo adInfo_;
  /**
   * <pre>
   * Optional. Ad info includes 3 creative headlines and 2 creative
   * descriptions.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.SmartCampaignAdInfo ad_info = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the adInfo field is set.
   */
  @java.lang.Override
  public boolean hasAdInfo() {
    return adInfo_ != null;
  }
  /**
   * <pre>
   * Optional. Ad info includes 3 creative headlines and 2 creative
   * descriptions.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.SmartCampaignAdInfo ad_info = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The adInfo.
   */
  @java.lang.Override
  public com.google.ads.googleads.v13.common.SmartCampaignAdInfo getAdInfo() {
    return adInfo_ == null ? com.google.ads.googleads.v13.common.SmartCampaignAdInfo.getDefaultInstance() : adInfo_;
  }
  /**
   * <pre>
   * Optional. Ad info includes 3 creative headlines and 2 creative
   * descriptions.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.common.SmartCampaignAdInfo ad_info = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v13.common.SmartCampaignAdInfoOrBuilder getAdInfoOrBuilder() {
    return adInfo_ == null ? com.google.ads.googleads.v13.common.SmartCampaignAdInfo.getDefaultInstance() : adInfo_;
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
    if (adInfo_ != null) {
      output.writeMessage(1, getAdInfo());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (adInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAdInfo());
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
    if (!(obj instanceof com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse other = (com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse) obj;

    if (hasAdInfo() != other.hasAdInfo()) return false;
    if (hasAdInfo()) {
      if (!getAdInfo()
          .equals(other.getAdInfo())) return false;
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
    if (hasAdInfo()) {
      hash = (37 * hash) + AD_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getAdInfo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse prototype) {
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
   * Response message for
   * [SmartCampaignSuggestService.SuggestSmartCampaignAd][google.ads.googleads.v13.services.SmartCampaignSuggestService.SuggestSmartCampaignAd].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse)
      com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v13.services.SmartCampaignSuggestServiceProto.internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignAdResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v13.services.SmartCampaignSuggestServiceProto.internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignAdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse.class, com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse.newBuilder()
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
      adInfo_ = null;
      if (adInfoBuilder_ != null) {
        adInfoBuilder_.dispose();
        adInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v13.services.SmartCampaignSuggestServiceProto.internal_static_google_ads_googleads_v13_services_SuggestSmartCampaignAdResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse build() {
      com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse buildPartial() {
      com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse result = new com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.adInfo_ = adInfoBuilder_ == null
            ? adInfo_
            : adInfoBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse) {
        return mergeFrom((com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse other) {
      if (other == com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse.getDefaultInstance()) return this;
      if (other.hasAdInfo()) {
        mergeAdInfo(other.getAdInfo());
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
              input.readMessage(
                  getAdInfoFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.google.ads.googleads.v13.common.SmartCampaignAdInfo adInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v13.common.SmartCampaignAdInfo, com.google.ads.googleads.v13.common.SmartCampaignAdInfo.Builder, com.google.ads.googleads.v13.common.SmartCampaignAdInfoOrBuilder> adInfoBuilder_;
    /**
     * <pre>
     * Optional. Ad info includes 3 creative headlines and 2 creative
     * descriptions.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.SmartCampaignAdInfo ad_info = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return Whether the adInfo field is set.
     */
    public boolean hasAdInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Optional. Ad info includes 3 creative headlines and 2 creative
     * descriptions.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.SmartCampaignAdInfo ad_info = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return The adInfo.
     */
    public com.google.ads.googleads.v13.common.SmartCampaignAdInfo getAdInfo() {
      if (adInfoBuilder_ == null) {
        return adInfo_ == null ? com.google.ads.googleads.v13.common.SmartCampaignAdInfo.getDefaultInstance() : adInfo_;
      } else {
        return adInfoBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Optional. Ad info includes 3 creative headlines and 2 creative
     * descriptions.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.SmartCampaignAdInfo ad_info = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setAdInfo(com.google.ads.googleads.v13.common.SmartCampaignAdInfo value) {
      if (adInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        adInfo_ = value;
      } else {
        adInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Ad info includes 3 creative headlines and 2 creative
     * descriptions.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.SmartCampaignAdInfo ad_info = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder setAdInfo(
        com.google.ads.googleads.v13.common.SmartCampaignAdInfo.Builder builderForValue) {
      if (adInfoBuilder_ == null) {
        adInfo_ = builderForValue.build();
      } else {
        adInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Ad info includes 3 creative headlines and 2 creative
     * descriptions.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.SmartCampaignAdInfo ad_info = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder mergeAdInfo(com.google.ads.googleads.v13.common.SmartCampaignAdInfo value) {
      if (adInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          adInfo_ != null &&
          adInfo_ != com.google.ads.googleads.v13.common.SmartCampaignAdInfo.getDefaultInstance()) {
          getAdInfoBuilder().mergeFrom(value);
        } else {
          adInfo_ = value;
        }
      } else {
        adInfoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Ad info includes 3 creative headlines and 2 creative
     * descriptions.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.SmartCampaignAdInfo ad_info = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public Builder clearAdInfo() {
      bitField0_ = (bitField0_ & ~0x00000001);
      adInfo_ = null;
      if (adInfoBuilder_ != null) {
        adInfoBuilder_.dispose();
        adInfoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Optional. Ad info includes 3 creative headlines and 2 creative
     * descriptions.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.SmartCampaignAdInfo ad_info = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.ads.googleads.v13.common.SmartCampaignAdInfo.Builder getAdInfoBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAdInfoFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Optional. Ad info includes 3 creative headlines and 2 creative
     * descriptions.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.SmartCampaignAdInfo ad_info = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    public com.google.ads.googleads.v13.common.SmartCampaignAdInfoOrBuilder getAdInfoOrBuilder() {
      if (adInfoBuilder_ != null) {
        return adInfoBuilder_.getMessageOrBuilder();
      } else {
        return adInfo_ == null ?
            com.google.ads.googleads.v13.common.SmartCampaignAdInfo.getDefaultInstance() : adInfo_;
      }
    }
    /**
     * <pre>
     * Optional. Ad info includes 3 creative headlines and 2 creative
     * descriptions.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.common.SmartCampaignAdInfo ad_info = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v13.common.SmartCampaignAdInfo, com.google.ads.googleads.v13.common.SmartCampaignAdInfo.Builder, com.google.ads.googleads.v13.common.SmartCampaignAdInfoOrBuilder> 
        getAdInfoFieldBuilder() {
      if (adInfoBuilder_ == null) {
        adInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v13.common.SmartCampaignAdInfo, com.google.ads.googleads.v13.common.SmartCampaignAdInfo.Builder, com.google.ads.googleads.v13.common.SmartCampaignAdInfoOrBuilder>(
                getAdInfo(),
                getParentForChildren(),
                isClean());
        adInfo_ = null;
      }
      return adInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse)
  private static final com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse();
  }

  public static com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SuggestSmartCampaignAdResponse>
      PARSER = new com.google.protobuf.AbstractParser<SuggestSmartCampaignAdResponse>() {
    @java.lang.Override
    public SuggestSmartCampaignAdResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SuggestSmartCampaignAdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SuggestSmartCampaignAdResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v13.services.SuggestSmartCampaignAdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


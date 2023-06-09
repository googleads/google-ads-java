// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/keyword_plan_service.proto

package com.google.ads.googleads.v13.services;

/**
 * <pre>
 * Request message for
 * [KeywordPlanService.GenerateForecastTimeSeries][google.ads.googleads.v13.services.KeywordPlanService.GenerateForecastTimeSeries].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest}
 */
public final class GenerateForecastTimeSeriesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest)
    GenerateForecastTimeSeriesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenerateForecastTimeSeriesRequest.newBuilder() to construct.
  private GenerateForecastTimeSeriesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenerateForecastTimeSeriesRequest() {
    keywordPlan_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenerateForecastTimeSeriesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v13.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v13_services_GenerateForecastTimeSeriesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v13.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v13_services_GenerateForecastTimeSeriesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest.class, com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest.Builder.class);
  }

  public static final int KEYWORD_PLAN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object keywordPlan_ = "";
  /**
   * <pre>
   * Required. The resource name of the keyword plan to be forecasted.
   * </pre>
   *
   * <code>string keyword_plan = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The keywordPlan.
   */
  @java.lang.Override
  public java.lang.String getKeywordPlan() {
    java.lang.Object ref = keywordPlan_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keywordPlan_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The resource name of the keyword plan to be forecasted.
   * </pre>
   *
   * <code>string keyword_plan = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for keywordPlan.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeywordPlanBytes() {
    java.lang.Object ref = keywordPlan_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      keywordPlan_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keywordPlan_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, keywordPlan_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keywordPlan_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, keywordPlan_);
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
    if (!(obj instanceof com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest other = (com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest) obj;

    if (!getKeywordPlan()
        .equals(other.getKeywordPlan())) return false;
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
    hash = (37 * hash) + KEYWORD_PLAN_FIELD_NUMBER;
    hash = (53 * hash) + getKeywordPlan().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest prototype) {
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
   * [KeywordPlanService.GenerateForecastTimeSeries][google.ads.googleads.v13.services.KeywordPlanService.GenerateForecastTimeSeries].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest)
      com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v13.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v13_services_GenerateForecastTimeSeriesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v13.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v13_services_GenerateForecastTimeSeriesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest.class, com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest.newBuilder()
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
      keywordPlan_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v13.services.KeywordPlanServiceProto.internal_static_google_ads_googleads_v13_services_GenerateForecastTimeSeriesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest build() {
      com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest buildPartial() {
      com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest result = new com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.keywordPlan_ = keywordPlan_;
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
      if (other instanceof com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest) {
        return mergeFrom((com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest other) {
      if (other == com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest.getDefaultInstance()) return this;
      if (!other.getKeywordPlan().isEmpty()) {
        keywordPlan_ = other.keywordPlan_;
        bitField0_ |= 0x00000001;
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
              keywordPlan_ = input.readStringRequireUtf8();
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

    private java.lang.Object keywordPlan_ = "";
    /**
     * <pre>
     * Required. The resource name of the keyword plan to be forecasted.
     * </pre>
     *
     * <code>string keyword_plan = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The keywordPlan.
     */
    public java.lang.String getKeywordPlan() {
      java.lang.Object ref = keywordPlan_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keywordPlan_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the keyword plan to be forecasted.
     * </pre>
     *
     * <code>string keyword_plan = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for keywordPlan.
     */
    public com.google.protobuf.ByteString
        getKeywordPlanBytes() {
      java.lang.Object ref = keywordPlan_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keywordPlan_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The resource name of the keyword plan to be forecasted.
     * </pre>
     *
     * <code>string keyword_plan = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The keywordPlan to set.
     * @return This builder for chaining.
     */
    public Builder setKeywordPlan(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      keywordPlan_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the keyword plan to be forecasted.
     * </pre>
     *
     * <code>string keyword_plan = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearKeywordPlan() {
      keywordPlan_ = getDefaultInstance().getKeywordPlan();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The resource name of the keyword plan to be forecasted.
     * </pre>
     *
     * <code>string keyword_plan = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for keywordPlan to set.
     * @return This builder for chaining.
     */
    public Builder setKeywordPlanBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      keywordPlan_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest)
  private static final com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest();
  }

  public static com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateForecastTimeSeriesRequest>
      PARSER = new com.google.protobuf.AbstractParser<GenerateForecastTimeSeriesRequest>() {
    @java.lang.Override
    public GenerateForecastTimeSeriesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateForecastTimeSeriesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateForecastTimeSeriesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v13.services.GenerateForecastTimeSeriesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


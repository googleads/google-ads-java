// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/smart_campaign_setting_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.services;

/**
 * <pre>
 * Details related to paused Smart campaigns.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.services.SmartCampaignPausedDetails}
 */
public final class SmartCampaignPausedDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.services.SmartCampaignPausedDetails)
    SmartCampaignPausedDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SmartCampaignPausedDetails.newBuilder() to construct.
  private SmartCampaignPausedDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SmartCampaignPausedDetails() {
    pausedDateTime_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SmartCampaignPausedDetails();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.services.SmartCampaignSettingServiceProto.internal_static_google_ads_googleads_v18_services_SmartCampaignPausedDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.services.SmartCampaignSettingServiceProto.internal_static_google_ads_googleads_v18_services_SmartCampaignPausedDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.services.SmartCampaignPausedDetails.class, com.google.ads.googleads.v18.services.SmartCampaignPausedDetails.Builder.class);
  }

  private int bitField0_;
  public static final int PAUSED_DATE_TIME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pausedDateTime_ = "";
  /**
   * <pre>
   * The timestamp of when the campaign was last paused.
   * The timestamp is in the customer’s timezone and in
   * “yyyy-MM-dd HH:mm:ss” format.
   * </pre>
   *
   * <code>optional string paused_date_time = 1;</code>
   * @return Whether the pausedDateTime field is set.
   */
  @java.lang.Override
  public boolean hasPausedDateTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The timestamp of when the campaign was last paused.
   * The timestamp is in the customer’s timezone and in
   * “yyyy-MM-dd HH:mm:ss” format.
   * </pre>
   *
   * <code>optional string paused_date_time = 1;</code>
   * @return The pausedDateTime.
   */
  @java.lang.Override
  public java.lang.String getPausedDateTime() {
    java.lang.Object ref = pausedDateTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pausedDateTime_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The timestamp of when the campaign was last paused.
   * The timestamp is in the customer’s timezone and in
   * “yyyy-MM-dd HH:mm:ss” format.
   * </pre>
   *
   * <code>optional string paused_date_time = 1;</code>
   * @return The bytes for pausedDateTime.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPausedDateTimeBytes() {
    java.lang.Object ref = pausedDateTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pausedDateTime_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pausedDateTime_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pausedDateTime_);
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
    if (!(obj instanceof com.google.ads.googleads.v18.services.SmartCampaignPausedDetails)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.services.SmartCampaignPausedDetails other = (com.google.ads.googleads.v18.services.SmartCampaignPausedDetails) obj;

    if (hasPausedDateTime() != other.hasPausedDateTime()) return false;
    if (hasPausedDateTime()) {
      if (!getPausedDateTime()
          .equals(other.getPausedDateTime())) return false;
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
    if (hasPausedDateTime()) {
      hash = (37 * hash) + PAUSED_DATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getPausedDateTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v18.services.SmartCampaignPausedDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.services.SmartCampaignPausedDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.SmartCampaignPausedDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.services.SmartCampaignPausedDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.SmartCampaignPausedDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.services.SmartCampaignPausedDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.SmartCampaignPausedDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.services.SmartCampaignPausedDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.services.SmartCampaignPausedDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.services.SmartCampaignPausedDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.services.SmartCampaignPausedDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.services.SmartCampaignPausedDetails parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.services.SmartCampaignPausedDetails prototype) {
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
   * Details related to paused Smart campaigns.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.services.SmartCampaignPausedDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.services.SmartCampaignPausedDetails)
      com.google.ads.googleads.v18.services.SmartCampaignPausedDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.services.SmartCampaignSettingServiceProto.internal_static_google_ads_googleads_v18_services_SmartCampaignPausedDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.services.SmartCampaignSettingServiceProto.internal_static_google_ads_googleads_v18_services_SmartCampaignPausedDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.services.SmartCampaignPausedDetails.class, com.google.ads.googleads.v18.services.SmartCampaignPausedDetails.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.services.SmartCampaignPausedDetails.newBuilder()
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
      pausedDateTime_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v18.services.SmartCampaignSettingServiceProto.internal_static_google_ads_googleads_v18_services_SmartCampaignPausedDetails_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.services.SmartCampaignPausedDetails getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.services.SmartCampaignPausedDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.services.SmartCampaignPausedDetails build() {
      com.google.ads.googleads.v18.services.SmartCampaignPausedDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.services.SmartCampaignPausedDetails buildPartial() {
      com.google.ads.googleads.v18.services.SmartCampaignPausedDetails result = new com.google.ads.googleads.v18.services.SmartCampaignPausedDetails(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v18.services.SmartCampaignPausedDetails result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.pausedDateTime_ = pausedDateTime_;
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
      if (other instanceof com.google.ads.googleads.v18.services.SmartCampaignPausedDetails) {
        return mergeFrom((com.google.ads.googleads.v18.services.SmartCampaignPausedDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.services.SmartCampaignPausedDetails other) {
      if (other == com.google.ads.googleads.v18.services.SmartCampaignPausedDetails.getDefaultInstance()) return this;
      if (other.hasPausedDateTime()) {
        pausedDateTime_ = other.pausedDateTime_;
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
              pausedDateTime_ = input.readStringRequireUtf8();
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

    private java.lang.Object pausedDateTime_ = "";
    /**
     * <pre>
     * The timestamp of when the campaign was last paused.
     * The timestamp is in the customer’s timezone and in
     * “yyyy-MM-dd HH:mm:ss” format.
     * </pre>
     *
     * <code>optional string paused_date_time = 1;</code>
     * @return Whether the pausedDateTime field is set.
     */
    public boolean hasPausedDateTime() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The timestamp of when the campaign was last paused.
     * The timestamp is in the customer’s timezone and in
     * “yyyy-MM-dd HH:mm:ss” format.
     * </pre>
     *
     * <code>optional string paused_date_time = 1;</code>
     * @return The pausedDateTime.
     */
    public java.lang.String getPausedDateTime() {
      java.lang.Object ref = pausedDateTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pausedDateTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The timestamp of when the campaign was last paused.
     * The timestamp is in the customer’s timezone and in
     * “yyyy-MM-dd HH:mm:ss” format.
     * </pre>
     *
     * <code>optional string paused_date_time = 1;</code>
     * @return The bytes for pausedDateTime.
     */
    public com.google.protobuf.ByteString
        getPausedDateTimeBytes() {
      java.lang.Object ref = pausedDateTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pausedDateTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The timestamp of when the campaign was last paused.
     * The timestamp is in the customer’s timezone and in
     * “yyyy-MM-dd HH:mm:ss” format.
     * </pre>
     *
     * <code>optional string paused_date_time = 1;</code>
     * @param value The pausedDateTime to set.
     * @return This builder for chaining.
     */
    public Builder setPausedDateTime(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pausedDateTime_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The timestamp of when the campaign was last paused.
     * The timestamp is in the customer’s timezone and in
     * “yyyy-MM-dd HH:mm:ss” format.
     * </pre>
     *
     * <code>optional string paused_date_time = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPausedDateTime() {
      pausedDateTime_ = getDefaultInstance().getPausedDateTime();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The timestamp of when the campaign was last paused.
     * The timestamp is in the customer’s timezone and in
     * “yyyy-MM-dd HH:mm:ss” format.
     * </pre>
     *
     * <code>optional string paused_date_time = 1;</code>
     * @param value The bytes for pausedDateTime to set.
     * @return This builder for chaining.
     */
    public Builder setPausedDateTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pausedDateTime_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.services.SmartCampaignPausedDetails)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.services.SmartCampaignPausedDetails)
  private static final com.google.ads.googleads.v18.services.SmartCampaignPausedDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.services.SmartCampaignPausedDetails();
  }

  public static com.google.ads.googleads.v18.services.SmartCampaignPausedDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SmartCampaignPausedDetails>
      PARSER = new com.google.protobuf.AbstractParser<SmartCampaignPausedDetails>() {
    @java.lang.Override
    public SmartCampaignPausedDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<SmartCampaignPausedDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SmartCampaignPausedDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.services.SmartCampaignPausedDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


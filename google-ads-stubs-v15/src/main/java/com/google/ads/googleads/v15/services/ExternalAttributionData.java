// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/conversion_upload_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.services;

/**
 * <pre>
 * Contains additional information about externally attributed conversions.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.services.ExternalAttributionData}
 */
public final class ExternalAttributionData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.services.ExternalAttributionData)
    ExternalAttributionDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExternalAttributionData.newBuilder() to construct.
  private ExternalAttributionData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExternalAttributionData() {
    externalAttributionModel_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExternalAttributionData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.services.ConversionUploadServiceProto.internal_static_google_ads_googleads_v15_services_ExternalAttributionData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.services.ConversionUploadServiceProto.internal_static_google_ads_googleads_v15_services_ExternalAttributionData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.services.ExternalAttributionData.class, com.google.ads.googleads.v15.services.ExternalAttributionData.Builder.class);
  }

  private int bitField0_;
  public static final int EXTERNAL_ATTRIBUTION_CREDIT_FIELD_NUMBER = 3;
  private double externalAttributionCredit_ = 0D;
  /**
   * <pre>
   * Represents the fraction of the conversion that is attributed to the
   * Google Ads click.
   * </pre>
   *
   * <code>optional double external_attribution_credit = 3;</code>
   * @return Whether the externalAttributionCredit field is set.
   */
  @java.lang.Override
  public boolean hasExternalAttributionCredit() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Represents the fraction of the conversion that is attributed to the
   * Google Ads click.
   * </pre>
   *
   * <code>optional double external_attribution_credit = 3;</code>
   * @return The externalAttributionCredit.
   */
  @java.lang.Override
  public double getExternalAttributionCredit() {
    return externalAttributionCredit_;
  }

  public static final int EXTERNAL_ATTRIBUTION_MODEL_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object externalAttributionModel_ = "";
  /**
   * <pre>
   * Specifies the attribution model name.
   * </pre>
   *
   * <code>optional string external_attribution_model = 4;</code>
   * @return Whether the externalAttributionModel field is set.
   */
  @java.lang.Override
  public boolean hasExternalAttributionModel() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Specifies the attribution model name.
   * </pre>
   *
   * <code>optional string external_attribution_model = 4;</code>
   * @return The externalAttributionModel.
   */
  @java.lang.Override
  public java.lang.String getExternalAttributionModel() {
    java.lang.Object ref = externalAttributionModel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      externalAttributionModel_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Specifies the attribution model name.
   * </pre>
   *
   * <code>optional string external_attribution_model = 4;</code>
   * @return The bytes for externalAttributionModel.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExternalAttributionModelBytes() {
    java.lang.Object ref = externalAttributionModel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      externalAttributionModel_ = b;
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
      output.writeDouble(3, externalAttributionCredit_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, externalAttributionModel_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, externalAttributionCredit_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, externalAttributionModel_);
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
    if (!(obj instanceof com.google.ads.googleads.v15.services.ExternalAttributionData)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.services.ExternalAttributionData other = (com.google.ads.googleads.v15.services.ExternalAttributionData) obj;

    if (hasExternalAttributionCredit() != other.hasExternalAttributionCredit()) return false;
    if (hasExternalAttributionCredit()) {
      if (java.lang.Double.doubleToLongBits(getExternalAttributionCredit())
          != java.lang.Double.doubleToLongBits(
              other.getExternalAttributionCredit())) return false;
    }
    if (hasExternalAttributionModel() != other.hasExternalAttributionModel()) return false;
    if (hasExternalAttributionModel()) {
      if (!getExternalAttributionModel()
          .equals(other.getExternalAttributionModel())) return false;
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
    if (hasExternalAttributionCredit()) {
      hash = (37 * hash) + EXTERNAL_ATTRIBUTION_CREDIT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getExternalAttributionCredit()));
    }
    if (hasExternalAttributionModel()) {
      hash = (37 * hash) + EXTERNAL_ATTRIBUTION_MODEL_FIELD_NUMBER;
      hash = (53 * hash) + getExternalAttributionModel().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.services.ExternalAttributionData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.ExternalAttributionData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.ExternalAttributionData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.ExternalAttributionData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.ExternalAttributionData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.ExternalAttributionData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.ExternalAttributionData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.services.ExternalAttributionData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.services.ExternalAttributionData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.services.ExternalAttributionData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.ExternalAttributionData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.services.ExternalAttributionData parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.services.ExternalAttributionData prototype) {
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
   * Contains additional information about externally attributed conversions.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.services.ExternalAttributionData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.services.ExternalAttributionData)
      com.google.ads.googleads.v15.services.ExternalAttributionDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.services.ConversionUploadServiceProto.internal_static_google_ads_googleads_v15_services_ExternalAttributionData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.services.ConversionUploadServiceProto.internal_static_google_ads_googleads_v15_services_ExternalAttributionData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.services.ExternalAttributionData.class, com.google.ads.googleads.v15.services.ExternalAttributionData.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.services.ExternalAttributionData.newBuilder()
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
      externalAttributionCredit_ = 0D;
      externalAttributionModel_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.services.ConversionUploadServiceProto.internal_static_google_ads_googleads_v15_services_ExternalAttributionData_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.ExternalAttributionData getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.services.ExternalAttributionData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.ExternalAttributionData build() {
      com.google.ads.googleads.v15.services.ExternalAttributionData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.ExternalAttributionData buildPartial() {
      com.google.ads.googleads.v15.services.ExternalAttributionData result = new com.google.ads.googleads.v15.services.ExternalAttributionData(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v15.services.ExternalAttributionData result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.externalAttributionCredit_ = externalAttributionCredit_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.externalAttributionModel_ = externalAttributionModel_;
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
      if (other instanceof com.google.ads.googleads.v15.services.ExternalAttributionData) {
        return mergeFrom((com.google.ads.googleads.v15.services.ExternalAttributionData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.services.ExternalAttributionData other) {
      if (other == com.google.ads.googleads.v15.services.ExternalAttributionData.getDefaultInstance()) return this;
      if (other.hasExternalAttributionCredit()) {
        setExternalAttributionCredit(other.getExternalAttributionCredit());
      }
      if (other.hasExternalAttributionModel()) {
        externalAttributionModel_ = other.externalAttributionModel_;
        bitField0_ |= 0x00000002;
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
            case 25: {
              externalAttributionCredit_ = input.readDouble();
              bitField0_ |= 0x00000001;
              break;
            } // case 25
            case 34: {
              externalAttributionModel_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private double externalAttributionCredit_ ;
    /**
     * <pre>
     * Represents the fraction of the conversion that is attributed to the
     * Google Ads click.
     * </pre>
     *
     * <code>optional double external_attribution_credit = 3;</code>
     * @return Whether the externalAttributionCredit field is set.
     */
    @java.lang.Override
    public boolean hasExternalAttributionCredit() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Represents the fraction of the conversion that is attributed to the
     * Google Ads click.
     * </pre>
     *
     * <code>optional double external_attribution_credit = 3;</code>
     * @return The externalAttributionCredit.
     */
    @java.lang.Override
    public double getExternalAttributionCredit() {
      return externalAttributionCredit_;
    }
    /**
     * <pre>
     * Represents the fraction of the conversion that is attributed to the
     * Google Ads click.
     * </pre>
     *
     * <code>optional double external_attribution_credit = 3;</code>
     * @param value The externalAttributionCredit to set.
     * @return This builder for chaining.
     */
    public Builder setExternalAttributionCredit(double value) {

      externalAttributionCredit_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Represents the fraction of the conversion that is attributed to the
     * Google Ads click.
     * </pre>
     *
     * <code>optional double external_attribution_credit = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearExternalAttributionCredit() {
      bitField0_ = (bitField0_ & ~0x00000001);
      externalAttributionCredit_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object externalAttributionModel_ = "";
    /**
     * <pre>
     * Specifies the attribution model name.
     * </pre>
     *
     * <code>optional string external_attribution_model = 4;</code>
     * @return Whether the externalAttributionModel field is set.
     */
    public boolean hasExternalAttributionModel() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Specifies the attribution model name.
     * </pre>
     *
     * <code>optional string external_attribution_model = 4;</code>
     * @return The externalAttributionModel.
     */
    public java.lang.String getExternalAttributionModel() {
      java.lang.Object ref = externalAttributionModel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        externalAttributionModel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Specifies the attribution model name.
     * </pre>
     *
     * <code>optional string external_attribution_model = 4;</code>
     * @return The bytes for externalAttributionModel.
     */
    public com.google.protobuf.ByteString
        getExternalAttributionModelBytes() {
      java.lang.Object ref = externalAttributionModel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        externalAttributionModel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Specifies the attribution model name.
     * </pre>
     *
     * <code>optional string external_attribution_model = 4;</code>
     * @param value The externalAttributionModel to set.
     * @return This builder for chaining.
     */
    public Builder setExternalAttributionModel(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      externalAttributionModel_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the attribution model name.
     * </pre>
     *
     * <code>optional string external_attribution_model = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearExternalAttributionModel() {
      externalAttributionModel_ = getDefaultInstance().getExternalAttributionModel();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the attribution model name.
     * </pre>
     *
     * <code>optional string external_attribution_model = 4;</code>
     * @param value The bytes for externalAttributionModel to set.
     * @return This builder for chaining.
     */
    public Builder setExternalAttributionModelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      externalAttributionModel_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.services.ExternalAttributionData)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.services.ExternalAttributionData)
  private static final com.google.ads.googleads.v15.services.ExternalAttributionData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.services.ExternalAttributionData();
  }

  public static com.google.ads.googleads.v15.services.ExternalAttributionData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExternalAttributionData>
      PARSER = new com.google.protobuf.AbstractParser<ExternalAttributionData>() {
    @java.lang.Override
    public ExternalAttributionData parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExternalAttributionData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExternalAttributionData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.services.ExternalAttributionData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


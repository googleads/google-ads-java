// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/customer.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.resources;

/**
 * <pre>
 * License status at geo + vertical level.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.resources.GranularLicenseStatus}
 */
public final class GranularLicenseStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.resources.GranularLicenseStatus)
    GranularLicenseStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GranularLicenseStatus.newBuilder() to construct.
  private GranularLicenseStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GranularLicenseStatus() {
    categoryId_ = "";
    verificationStatus_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GranularLicenseStatus();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.resources.CustomerProto.internal_static_google_ads_googleads_v15_resources_GranularLicenseStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.resources.CustomerProto.internal_static_google_ads_googleads_v15_resources_GranularLicenseStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.resources.GranularLicenseStatus.class, com.google.ads.googleads.v15.resources.GranularLicenseStatus.Builder.class);
  }

  private int bitField0_;
  public static final int GEO_CRITERION_ID_FIELD_NUMBER = 1;
  private long geoCriterionId_ = 0L;
  /**
   * <pre>
   * Output only. Geotarget criterion ID associated with the status. Can be on
   * country or state/province geo level, depending on requirements and
   * location. See https://developers.google.com/google-ads/api/data/geotargets
   * for more information.
   * </pre>
   *
   * <code>optional int64 geo_criterion_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the geoCriterionId field is set.
   */
  @java.lang.Override
  public boolean hasGeoCriterionId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Output only. Geotarget criterion ID associated with the status. Can be on
   * country or state/province geo level, depending on requirements and
   * location. See https://developers.google.com/google-ads/api/data/geotargets
   * for more information.
   * </pre>
   *
   * <code>optional int64 geo_criterion_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The geoCriterionId.
   */
  @java.lang.Override
  public long getGeoCriterionId() {
    return geoCriterionId_;
  }

  public static final int CATEGORY_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object categoryId_ = "";
  /**
   * <pre>
   * Output only. Service category associated with the status. For example,
   * xcat:service_area_business_plumber.
   * For more details see:
   * https://developers.google.com/google-ads/api/data/codes-formats#local_services_ids
   * </pre>
   *
   * <code>optional string category_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the categoryId field is set.
   */
  @java.lang.Override
  public boolean hasCategoryId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Output only. Service category associated with the status. For example,
   * xcat:service_area_business_plumber.
   * For more details see:
   * https://developers.google.com/google-ads/api/data/codes-formats#local_services_ids
   * </pre>
   *
   * <code>optional string category_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The categoryId.
   */
  @java.lang.Override
  public java.lang.String getCategoryId() {
    java.lang.Object ref = categoryId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      categoryId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. Service category associated with the status. For example,
   * xcat:service_area_business_plumber.
   * For more details see:
   * https://developers.google.com/google-ads/api/data/codes-formats#local_services_ids
   * </pre>
   *
   * <code>optional string category_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for categoryId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCategoryIdBytes() {
    java.lang.Object ref = categoryId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      categoryId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERIFICATION_STATUS_FIELD_NUMBER = 3;
  private int verificationStatus_ = 0;
  /**
   * <pre>
   * Output only. Granular license status, per geo + vertical.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus verification_status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the verificationStatus field is set.
   */
  @java.lang.Override public boolean hasVerificationStatus() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Output only. Granular license status, per geo + vertical.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus verification_status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for verificationStatus.
   */
  @java.lang.Override public int getVerificationStatusValue() {
    return verificationStatus_;
  }
  /**
   * <pre>
   * Output only. Granular license status, per geo + vertical.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus verification_status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The verificationStatus.
   */
  @java.lang.Override public com.google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus getVerificationStatus() {
    com.google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus result = com.google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus.forNumber(verificationStatus_);
    return result == null ? com.google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus.UNRECOGNIZED : result;
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
      output.writeInt64(1, geoCriterionId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, categoryId_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeEnum(3, verificationStatus_);
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
        .computeInt64Size(1, geoCriterionId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, categoryId_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, verificationStatus_);
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
    if (!(obj instanceof com.google.ads.googleads.v15.resources.GranularLicenseStatus)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.resources.GranularLicenseStatus other = (com.google.ads.googleads.v15.resources.GranularLicenseStatus) obj;

    if (hasGeoCriterionId() != other.hasGeoCriterionId()) return false;
    if (hasGeoCriterionId()) {
      if (getGeoCriterionId()
          != other.getGeoCriterionId()) return false;
    }
    if (hasCategoryId() != other.hasCategoryId()) return false;
    if (hasCategoryId()) {
      if (!getCategoryId()
          .equals(other.getCategoryId())) return false;
    }
    if (hasVerificationStatus() != other.hasVerificationStatus()) return false;
    if (hasVerificationStatus()) {
      if (verificationStatus_ != other.verificationStatus_) return false;
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
    if (hasGeoCriterionId()) {
      hash = (37 * hash) + GEO_CRITERION_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGeoCriterionId());
    }
    if (hasCategoryId()) {
      hash = (37 * hash) + CATEGORY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCategoryId().hashCode();
    }
    if (hasVerificationStatus()) {
      hash = (37 * hash) + VERIFICATION_STATUS_FIELD_NUMBER;
      hash = (53 * hash) + verificationStatus_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.resources.GranularLicenseStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.resources.GranularLicenseStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.resources.GranularLicenseStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.resources.GranularLicenseStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.resources.GranularLicenseStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.resources.GranularLicenseStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.resources.GranularLicenseStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.resources.GranularLicenseStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.resources.GranularLicenseStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.resources.GranularLicenseStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.resources.GranularLicenseStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.resources.GranularLicenseStatus parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.resources.GranularLicenseStatus prototype) {
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
   * License status at geo + vertical level.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.resources.GranularLicenseStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.resources.GranularLicenseStatus)
      com.google.ads.googleads.v15.resources.GranularLicenseStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.resources.CustomerProto.internal_static_google_ads_googleads_v15_resources_GranularLicenseStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.resources.CustomerProto.internal_static_google_ads_googleads_v15_resources_GranularLicenseStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.resources.GranularLicenseStatus.class, com.google.ads.googleads.v15.resources.GranularLicenseStatus.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.resources.GranularLicenseStatus.newBuilder()
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
      geoCriterionId_ = 0L;
      categoryId_ = "";
      verificationStatus_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.resources.CustomerProto.internal_static_google_ads_googleads_v15_resources_GranularLicenseStatus_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.resources.GranularLicenseStatus getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.resources.GranularLicenseStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.resources.GranularLicenseStatus build() {
      com.google.ads.googleads.v15.resources.GranularLicenseStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.resources.GranularLicenseStatus buildPartial() {
      com.google.ads.googleads.v15.resources.GranularLicenseStatus result = new com.google.ads.googleads.v15.resources.GranularLicenseStatus(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v15.resources.GranularLicenseStatus result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.geoCriterionId_ = geoCriterionId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.categoryId_ = categoryId_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.verificationStatus_ = verificationStatus_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.ads.googleads.v15.resources.GranularLicenseStatus) {
        return mergeFrom((com.google.ads.googleads.v15.resources.GranularLicenseStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.resources.GranularLicenseStatus other) {
      if (other == com.google.ads.googleads.v15.resources.GranularLicenseStatus.getDefaultInstance()) return this;
      if (other.hasGeoCriterionId()) {
        setGeoCriterionId(other.getGeoCriterionId());
      }
      if (other.hasCategoryId()) {
        categoryId_ = other.categoryId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasVerificationStatus()) {
        setVerificationStatus(other.getVerificationStatus());
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
            case 8: {
              geoCriterionId_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              categoryId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              verificationStatus_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private long geoCriterionId_ ;
    /**
     * <pre>
     * Output only. Geotarget criterion ID associated with the status. Can be on
     * country or state/province geo level, depending on requirements and
     * location. See https://developers.google.com/google-ads/api/data/geotargets
     * for more information.
     * </pre>
     *
     * <code>optional int64 geo_criterion_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the geoCriterionId field is set.
     */
    @java.lang.Override
    public boolean hasGeoCriterionId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Output only. Geotarget criterion ID associated with the status. Can be on
     * country or state/province geo level, depending on requirements and
     * location. See https://developers.google.com/google-ads/api/data/geotargets
     * for more information.
     * </pre>
     *
     * <code>optional int64 geo_criterion_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The geoCriterionId.
     */
    @java.lang.Override
    public long getGeoCriterionId() {
      return geoCriterionId_;
    }
    /**
     * <pre>
     * Output only. Geotarget criterion ID associated with the status. Can be on
     * country or state/province geo level, depending on requirements and
     * location. See https://developers.google.com/google-ads/api/data/geotargets
     * for more information.
     * </pre>
     *
     * <code>optional int64 geo_criterion_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The geoCriterionId to set.
     * @return This builder for chaining.
     */
    public Builder setGeoCriterionId(long value) {

      geoCriterionId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Geotarget criterion ID associated with the status. Can be on
     * country or state/province geo level, depending on requirements and
     * location. See https://developers.google.com/google-ads/api/data/geotargets
     * for more information.
     * </pre>
     *
     * <code>optional int64 geo_criterion_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearGeoCriterionId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      geoCriterionId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object categoryId_ = "";
    /**
     * <pre>
     * Output only. Service category associated with the status. For example,
     * xcat:service_area_business_plumber.
     * For more details see:
     * https://developers.google.com/google-ads/api/data/codes-formats#local_services_ids
     * </pre>
     *
     * <code>optional string category_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the categoryId field is set.
     */
    public boolean hasCategoryId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Output only. Service category associated with the status. For example,
     * xcat:service_area_business_plumber.
     * For more details see:
     * https://developers.google.com/google-ads/api/data/codes-formats#local_services_ids
     * </pre>
     *
     * <code>optional string category_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The categoryId.
     */
    public java.lang.String getCategoryId() {
      java.lang.Object ref = categoryId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        categoryId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. Service category associated with the status. For example,
     * xcat:service_area_business_plumber.
     * For more details see:
     * https://developers.google.com/google-ads/api/data/codes-formats#local_services_ids
     * </pre>
     *
     * <code>optional string category_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for categoryId.
     */
    public com.google.protobuf.ByteString
        getCategoryIdBytes() {
      java.lang.Object ref = categoryId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        categoryId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. Service category associated with the status. For example,
     * xcat:service_area_business_plumber.
     * For more details see:
     * https://developers.google.com/google-ads/api/data/codes-formats#local_services_ids
     * </pre>
     *
     * <code>optional string category_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The categoryId to set.
     * @return This builder for chaining.
     */
    public Builder setCategoryId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      categoryId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Service category associated with the status. For example,
     * xcat:service_area_business_plumber.
     * For more details see:
     * https://developers.google.com/google-ads/api/data/codes-formats#local_services_ids
     * </pre>
     *
     * <code>optional string category_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearCategoryId() {
      categoryId_ = getDefaultInstance().getCategoryId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Service category associated with the status. For example,
     * xcat:service_area_business_plumber.
     * For more details see:
     * https://developers.google.com/google-ads/api/data/codes-formats#local_services_ids
     * </pre>
     *
     * <code>optional string category_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for categoryId to set.
     * @return This builder for chaining.
     */
    public Builder setCategoryIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      categoryId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int verificationStatus_ = 0;
    /**
     * <pre>
     * Output only. Granular license status, per geo + vertical.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus verification_status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the verificationStatus field is set.
     */
    @java.lang.Override public boolean hasVerificationStatus() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * Output only. Granular license status, per geo + vertical.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus verification_status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The enum numeric value on the wire for verificationStatus.
     */
    @java.lang.Override public int getVerificationStatusValue() {
      return verificationStatus_;
    }
    /**
     * <pre>
     * Output only. Granular license status, per geo + vertical.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus verification_status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The enum numeric value on the wire for verificationStatus to set.
     * @return This builder for chaining.
     */
    public Builder setVerificationStatusValue(int value) {
      verificationStatus_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Granular license status, per geo + vertical.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus verification_status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The verificationStatus.
     */
    @java.lang.Override
    public com.google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus getVerificationStatus() {
      com.google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus result = com.google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus.forNumber(verificationStatus_);
      return result == null ? com.google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Output only. Granular license status, per geo + vertical.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus verification_status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The verificationStatus to set.
     * @return This builder for chaining.
     */
    public Builder setVerificationStatus(com.google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      verificationStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Granular license status, per geo + vertical.
     * </pre>
     *
     * <code>optional .google.ads.googleads.v15.enums.LocalServicesVerificationStatusEnum.LocalServicesVerificationStatus verification_status = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearVerificationStatus() {
      bitField0_ = (bitField0_ & ~0x00000004);
      verificationStatus_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.resources.GranularLicenseStatus)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.resources.GranularLicenseStatus)
  private static final com.google.ads.googleads.v15.resources.GranularLicenseStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.resources.GranularLicenseStatus();
  }

  public static com.google.ads.googleads.v15.resources.GranularLicenseStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GranularLicenseStatus>
      PARSER = new com.google.protobuf.AbstractParser<GranularLicenseStatus>() {
    @java.lang.Override
    public GranularLicenseStatus parsePartialFrom(
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

  public static com.google.protobuf.Parser<GranularLicenseStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GranularLicenseStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.resources.GranularLicenseStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


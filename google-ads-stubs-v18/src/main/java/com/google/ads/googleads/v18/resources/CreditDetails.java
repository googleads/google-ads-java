// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/resources/local_services_lead.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.resources;

/**
 * <pre>
 * Represents the credit details of a lead.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.resources.CreditDetails}
 */
public final class CreditDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.resources.CreditDetails)
    CreditDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreditDetails.newBuilder() to construct.
  private CreditDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreditDetails() {
    creditState_ = 0;
    creditStateLastUpdateDateTime_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreditDetails();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.resources.LocalServicesLeadProto.internal_static_google_ads_googleads_v18_resources_CreditDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.resources.LocalServicesLeadProto.internal_static_google_ads_googleads_v18_resources_CreditDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.resources.CreditDetails.class, com.google.ads.googleads.v18.resources.CreditDetails.Builder.class);
  }

  public static final int CREDIT_STATE_FIELD_NUMBER = 1;
  private int creditState_ = 0;
  /**
   * <pre>
   * Output only. Credit state of the lead.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.LocalServicesCreditStateEnum.CreditState credit_state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for creditState.
   */
  @java.lang.Override public int getCreditStateValue() {
    return creditState_;
  }
  /**
   * <pre>
   * Output only. Credit state of the lead.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.LocalServicesCreditStateEnum.CreditState credit_state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The creditState.
   */
  @java.lang.Override public com.google.ads.googleads.v18.enums.LocalServicesCreditStateEnum.CreditState getCreditState() {
    com.google.ads.googleads.v18.enums.LocalServicesCreditStateEnum.CreditState result = com.google.ads.googleads.v18.enums.LocalServicesCreditStateEnum.CreditState.forNumber(creditState_);
    return result == null ? com.google.ads.googleads.v18.enums.LocalServicesCreditStateEnum.CreditState.UNRECOGNIZED : result;
  }

  public static final int CREDIT_STATE_LAST_UPDATE_DATE_TIME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object creditStateLastUpdateDateTime_ = "";
  /**
   * <pre>
   * Output only. The date time when the credit state of the lead was last
   * updated. The format is "YYYY-MM-DD HH:MM:SS" in the Google Ads account's
   * timezone. Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>string credit_state_last_update_date_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The creditStateLastUpdateDateTime.
   */
  @java.lang.Override
  public java.lang.String getCreditStateLastUpdateDateTime() {
    java.lang.Object ref = creditStateLastUpdateDateTime_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      creditStateLastUpdateDateTime_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The date time when the credit state of the lead was last
   * updated. The format is "YYYY-MM-DD HH:MM:SS" in the Google Ads account's
   * timezone. Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>string credit_state_last_update_date_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for creditStateLastUpdateDateTime.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCreditStateLastUpdateDateTimeBytes() {
    java.lang.Object ref = creditStateLastUpdateDateTime_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      creditStateLastUpdateDateTime_ = b;
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
    if (creditState_ != com.google.ads.googleads.v18.enums.LocalServicesCreditStateEnum.CreditState.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, creditState_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(creditStateLastUpdateDateTime_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, creditStateLastUpdateDateTime_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (creditState_ != com.google.ads.googleads.v18.enums.LocalServicesCreditStateEnum.CreditState.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, creditState_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(creditStateLastUpdateDateTime_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, creditStateLastUpdateDateTime_);
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
    if (!(obj instanceof com.google.ads.googleads.v18.resources.CreditDetails)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.resources.CreditDetails other = (com.google.ads.googleads.v18.resources.CreditDetails) obj;

    if (creditState_ != other.creditState_) return false;
    if (!getCreditStateLastUpdateDateTime()
        .equals(other.getCreditStateLastUpdateDateTime())) return false;
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
    hash = (37 * hash) + CREDIT_STATE_FIELD_NUMBER;
    hash = (53 * hash) + creditState_;
    hash = (37 * hash) + CREDIT_STATE_LAST_UPDATE_DATE_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getCreditStateLastUpdateDateTime().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v18.resources.CreditDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.resources.CreditDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.resources.CreditDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.resources.CreditDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.resources.CreditDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.resources.CreditDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.resources.CreditDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.resources.CreditDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.resources.CreditDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.resources.CreditDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.resources.CreditDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.resources.CreditDetails parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.resources.CreditDetails prototype) {
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
   * Represents the credit details of a lead.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.resources.CreditDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.resources.CreditDetails)
      com.google.ads.googleads.v18.resources.CreditDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.resources.LocalServicesLeadProto.internal_static_google_ads_googleads_v18_resources_CreditDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.resources.LocalServicesLeadProto.internal_static_google_ads_googleads_v18_resources_CreditDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.resources.CreditDetails.class, com.google.ads.googleads.v18.resources.CreditDetails.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.resources.CreditDetails.newBuilder()
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
      creditState_ = 0;
      creditStateLastUpdateDateTime_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v18.resources.LocalServicesLeadProto.internal_static_google_ads_googleads_v18_resources_CreditDetails_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.resources.CreditDetails getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.resources.CreditDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.resources.CreditDetails build() {
      com.google.ads.googleads.v18.resources.CreditDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.resources.CreditDetails buildPartial() {
      com.google.ads.googleads.v18.resources.CreditDetails result = new com.google.ads.googleads.v18.resources.CreditDetails(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v18.resources.CreditDetails result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.creditState_ = creditState_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.creditStateLastUpdateDateTime_ = creditStateLastUpdateDateTime_;
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
      if (other instanceof com.google.ads.googleads.v18.resources.CreditDetails) {
        return mergeFrom((com.google.ads.googleads.v18.resources.CreditDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.resources.CreditDetails other) {
      if (other == com.google.ads.googleads.v18.resources.CreditDetails.getDefaultInstance()) return this;
      if (other.creditState_ != 0) {
        setCreditStateValue(other.getCreditStateValue());
      }
      if (!other.getCreditStateLastUpdateDateTime().isEmpty()) {
        creditStateLastUpdateDateTime_ = other.creditStateLastUpdateDateTime_;
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
            case 8: {
              creditState_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              creditStateLastUpdateDateTime_ = input.readStringRequireUtf8();
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

    private int creditState_ = 0;
    /**
     * <pre>
     * Output only. Credit state of the lead.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.LocalServicesCreditStateEnum.CreditState credit_state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The enum numeric value on the wire for creditState.
     */
    @java.lang.Override public int getCreditStateValue() {
      return creditState_;
    }
    /**
     * <pre>
     * Output only. Credit state of the lead.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.LocalServicesCreditStateEnum.CreditState credit_state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The enum numeric value on the wire for creditState to set.
     * @return This builder for chaining.
     */
    public Builder setCreditStateValue(int value) {
      creditState_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Credit state of the lead.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.LocalServicesCreditStateEnum.CreditState credit_state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The creditState.
     */
    @java.lang.Override
    public com.google.ads.googleads.v18.enums.LocalServicesCreditStateEnum.CreditState getCreditState() {
      com.google.ads.googleads.v18.enums.LocalServicesCreditStateEnum.CreditState result = com.google.ads.googleads.v18.enums.LocalServicesCreditStateEnum.CreditState.forNumber(creditState_);
      return result == null ? com.google.ads.googleads.v18.enums.LocalServicesCreditStateEnum.CreditState.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Output only. Credit state of the lead.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.LocalServicesCreditStateEnum.CreditState credit_state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The creditState to set.
     * @return This builder for chaining.
     */
    public Builder setCreditState(com.google.ads.googleads.v18.enums.LocalServicesCreditStateEnum.CreditState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      creditState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Credit state of the lead.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.LocalServicesCreditStateEnum.CreditState credit_state = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearCreditState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      creditState_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object creditStateLastUpdateDateTime_ = "";
    /**
     * <pre>
     * Output only. The date time when the credit state of the lead was last
     * updated. The format is "YYYY-MM-DD HH:MM:SS" in the Google Ads account's
     * timezone. Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
     * </pre>
     *
     * <code>string credit_state_last_update_date_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The creditStateLastUpdateDateTime.
     */
    public java.lang.String getCreditStateLastUpdateDateTime() {
      java.lang.Object ref = creditStateLastUpdateDateTime_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        creditStateLastUpdateDateTime_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The date time when the credit state of the lead was last
     * updated. The format is "YYYY-MM-DD HH:MM:SS" in the Google Ads account's
     * timezone. Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
     * </pre>
     *
     * <code>string credit_state_last_update_date_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for creditStateLastUpdateDateTime.
     */
    public com.google.protobuf.ByteString
        getCreditStateLastUpdateDateTimeBytes() {
      java.lang.Object ref = creditStateLastUpdateDateTime_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        creditStateLastUpdateDateTime_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The date time when the credit state of the lead was last
     * updated. The format is "YYYY-MM-DD HH:MM:SS" in the Google Ads account's
     * timezone. Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
     * </pre>
     *
     * <code>string credit_state_last_update_date_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The creditStateLastUpdateDateTime to set.
     * @return This builder for chaining.
     */
    public Builder setCreditStateLastUpdateDateTime(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      creditStateLastUpdateDateTime_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The date time when the credit state of the lead was last
     * updated. The format is "YYYY-MM-DD HH:MM:SS" in the Google Ads account's
     * timezone. Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
     * </pre>
     *
     * <code>string credit_state_last_update_date_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearCreditStateLastUpdateDateTime() {
      creditStateLastUpdateDateTime_ = getDefaultInstance().getCreditStateLastUpdateDateTime();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The date time when the credit state of the lead was last
     * updated. The format is "YYYY-MM-DD HH:MM:SS" in the Google Ads account's
     * timezone. Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
     * </pre>
     *
     * <code>string credit_state_last_update_date_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for creditStateLastUpdateDateTime to set.
     * @return This builder for chaining.
     */
    public Builder setCreditStateLastUpdateDateTimeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      creditStateLastUpdateDateTime_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.resources.CreditDetails)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.resources.CreditDetails)
  private static final com.google.ads.googleads.v18.resources.CreditDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.resources.CreditDetails();
  }

  public static com.google.ads.googleads.v18.resources.CreditDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreditDetails>
      PARSER = new com.google.protobuf.AbstractParser<CreditDetails>() {
    @java.lang.Override
    public CreditDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreditDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreditDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.resources.CreditDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


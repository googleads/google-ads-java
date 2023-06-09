// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/segments.proto

package com.google.ads.googleads.v14.common;

/**
 * <pre>
 * A BudgetCampaignAssociationStatus segment.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.common.BudgetCampaignAssociationStatus}
 */
public final class BudgetCampaignAssociationStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.common.BudgetCampaignAssociationStatus)
    BudgetCampaignAssociationStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BudgetCampaignAssociationStatus.newBuilder() to construct.
  private BudgetCampaignAssociationStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BudgetCampaignAssociationStatus() {
    campaign_ = "";
    status_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BudgetCampaignAssociationStatus();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.common.SegmentsProto.internal_static_google_ads_googleads_v14_common_BudgetCampaignAssociationStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.common.SegmentsProto.internal_static_google_ads_googleads_v14_common_BudgetCampaignAssociationStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus.class, com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus.Builder.class);
  }

  private int bitField0_;
  public static final int CAMPAIGN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object campaign_ = "";
  /**
   * <pre>
   * The campaign resource name.
   * </pre>
   *
   * <code>optional string campaign = 1;</code>
   * @return Whether the campaign field is set.
   */
  @java.lang.Override
  public boolean hasCampaign() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The campaign resource name.
   * </pre>
   *
   * <code>optional string campaign = 1;</code>
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
   * The campaign resource name.
   * </pre>
   *
   * <code>optional string campaign = 1;</code>
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

  public static final int STATUS_FIELD_NUMBER = 2;
  private int status_ = 0;
  /**
   * <pre>
   * Budget campaign association status.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.BudgetCampaignAssociationStatusEnum.BudgetCampaignAssociationStatus status = 2;</code>
   * @return The enum numeric value on the wire for status.
   */
  @java.lang.Override public int getStatusValue() {
    return status_;
  }
  /**
   * <pre>
   * Budget campaign association status.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.BudgetCampaignAssociationStatusEnum.BudgetCampaignAssociationStatus status = 2;</code>
   * @return The status.
   */
  @java.lang.Override public com.google.ads.googleads.v14.enums.BudgetCampaignAssociationStatusEnum.BudgetCampaignAssociationStatus getStatus() {
    com.google.ads.googleads.v14.enums.BudgetCampaignAssociationStatusEnum.BudgetCampaignAssociationStatus result = com.google.ads.googleads.v14.enums.BudgetCampaignAssociationStatusEnum.BudgetCampaignAssociationStatus.forNumber(status_);
    return result == null ? com.google.ads.googleads.v14.enums.BudgetCampaignAssociationStatusEnum.BudgetCampaignAssociationStatus.UNRECOGNIZED : result;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, campaign_);
    }
    if (status_ != com.google.ads.googleads.v14.enums.BudgetCampaignAssociationStatusEnum.BudgetCampaignAssociationStatus.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, status_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, campaign_);
    }
    if (status_ != com.google.ads.googleads.v14.enums.BudgetCampaignAssociationStatusEnum.BudgetCampaignAssociationStatus.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, status_);
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
    if (!(obj instanceof com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus other = (com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus) obj;

    if (hasCampaign() != other.hasCampaign()) return false;
    if (hasCampaign()) {
      if (!getCampaign()
          .equals(other.getCampaign())) return false;
    }
    if (status_ != other.status_) return false;
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
    if (hasCampaign()) {
      hash = (37 * hash) + CAMPAIGN_FIELD_NUMBER;
      hash = (53 * hash) + getCampaign().hashCode();
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus prototype) {
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
   * A BudgetCampaignAssociationStatus segment.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.common.BudgetCampaignAssociationStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.common.BudgetCampaignAssociationStatus)
      com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.common.SegmentsProto.internal_static_google_ads_googleads_v14_common_BudgetCampaignAssociationStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.common.SegmentsProto.internal_static_google_ads_googleads_v14_common_BudgetCampaignAssociationStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus.class, com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus.newBuilder()
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
      campaign_ = "";
      status_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v14.common.SegmentsProto.internal_static_google_ads_googleads_v14_common_BudgetCampaignAssociationStatus_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus build() {
      com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus buildPartial() {
      com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus result = new com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.campaign_ = campaign_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.status_ = status_;
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
      if (other instanceof com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus) {
        return mergeFrom((com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus other) {
      if (other == com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus.getDefaultInstance()) return this;
      if (other.hasCampaign()) {
        campaign_ = other.campaign_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
              campaign_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              status_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.lang.Object campaign_ = "";
    /**
     * <pre>
     * The campaign resource name.
     * </pre>
     *
     * <code>optional string campaign = 1;</code>
     * @return Whether the campaign field is set.
     */
    public boolean hasCampaign() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The campaign resource name.
     * </pre>
     *
     * <code>optional string campaign = 1;</code>
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
     * The campaign resource name.
     * </pre>
     *
     * <code>optional string campaign = 1;</code>
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
     * The campaign resource name.
     * </pre>
     *
     * <code>optional string campaign = 1;</code>
     * @param value The campaign to set.
     * @return This builder for chaining.
     */
    public Builder setCampaign(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      campaign_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The campaign resource name.
     * </pre>
     *
     * <code>optional string campaign = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCampaign() {
      campaign_ = getDefaultInstance().getCampaign();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The campaign resource name.
     * </pre>
     *
     * <code>optional string campaign = 1;</code>
     * @param value The bytes for campaign to set.
     * @return This builder for chaining.
     */
    public Builder setCampaignBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      campaign_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int status_ = 0;
    /**
     * <pre>
     * Budget campaign association status.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.BudgetCampaignAssociationStatusEnum.BudgetCampaignAssociationStatus status = 2;</code>
     * @return The enum numeric value on the wire for status.
     */
    @java.lang.Override public int getStatusValue() {
      return status_;
    }
    /**
     * <pre>
     * Budget campaign association status.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.BudgetCampaignAssociationStatusEnum.BudgetCampaignAssociationStatus status = 2;</code>
     * @param value The enum numeric value on the wire for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Budget campaign association status.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.BudgetCampaignAssociationStatusEnum.BudgetCampaignAssociationStatus status = 2;</code>
     * @return The status.
     */
    @java.lang.Override
    public com.google.ads.googleads.v14.enums.BudgetCampaignAssociationStatusEnum.BudgetCampaignAssociationStatus getStatus() {
      com.google.ads.googleads.v14.enums.BudgetCampaignAssociationStatusEnum.BudgetCampaignAssociationStatus result = com.google.ads.googleads.v14.enums.BudgetCampaignAssociationStatusEnum.BudgetCampaignAssociationStatus.forNumber(status_);
      return result == null ? com.google.ads.googleads.v14.enums.BudgetCampaignAssociationStatusEnum.BudgetCampaignAssociationStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Budget campaign association status.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.BudgetCampaignAssociationStatusEnum.BudgetCampaignAssociationStatus status = 2;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(com.google.ads.googleads.v14.enums.BudgetCampaignAssociationStatusEnum.BudgetCampaignAssociationStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Budget campaign association status.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.BudgetCampaignAssociationStatusEnum.BudgetCampaignAssociationStatus status = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000002);
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.common.BudgetCampaignAssociationStatus)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.common.BudgetCampaignAssociationStatus)
  private static final com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus();
  }

  public static com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BudgetCampaignAssociationStatus>
      PARSER = new com.google.protobuf.AbstractParser<BudgetCampaignAssociationStatus>() {
    @java.lang.Override
    public BudgetCampaignAssociationStatus parsePartialFrom(
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

  public static com.google.protobuf.Parser<BudgetCampaignAssociationStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BudgetCampaignAssociationStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.common.BudgetCampaignAssociationStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


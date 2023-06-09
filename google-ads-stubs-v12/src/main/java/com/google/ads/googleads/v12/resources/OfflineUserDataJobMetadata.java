// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/offline_user_data_job.proto

package com.google.ads.googleads.v12.resources;

/**
 * <pre>
 * Metadata of offline user data job.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.resources.OfflineUserDataJobMetadata}
 */
public final class OfflineUserDataJobMetadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.resources.OfflineUserDataJobMetadata)
    OfflineUserDataJobMetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OfflineUserDataJobMetadata.newBuilder() to construct.
  private OfflineUserDataJobMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OfflineUserDataJobMetadata() {
    matchRateRange_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OfflineUserDataJobMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.resources.OfflineUserDataJobProto.internal_static_google_ads_googleads_v12_resources_OfflineUserDataJobMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.resources.OfflineUserDataJobProto.internal_static_google_ads_googleads_v12_resources_OfflineUserDataJobMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata.class, com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata.Builder.class);
  }

  public static final int MATCH_RATE_RANGE_FIELD_NUMBER = 1;
  private int matchRateRange_ = 0;
  /**
   * <pre>
   * Output only. Match rate of the Customer Match user list upload. Describes
   * the estimated match rate when the status of the job is "RUNNING" and final
   * match rate when the final match rate is available after the status of the
   * job is "SUCCESS/FAILED".
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange match_rate_range = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for matchRateRange.
   */
  @java.lang.Override public int getMatchRateRangeValue() {
    return matchRateRange_;
  }
  /**
   * <pre>
   * Output only. Match rate of the Customer Match user list upload. Describes
   * the estimated match rate when the status of the job is "RUNNING" and final
   * match rate when the final match rate is available after the status of the
   * job is "SUCCESS/FAILED".
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange match_rate_range = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The matchRateRange.
   */
  @java.lang.Override public com.google.ads.googleads.v12.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange getMatchRateRange() {
    com.google.ads.googleads.v12.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange result = com.google.ads.googleads.v12.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange.forNumber(matchRateRange_);
    return result == null ? com.google.ads.googleads.v12.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange.UNRECOGNIZED : result;
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
    if (matchRateRange_ != com.google.ads.googleads.v12.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, matchRateRange_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (matchRateRange_ != com.google.ads.googleads.v12.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, matchRateRange_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata other = (com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata) obj;

    if (matchRateRange_ != other.matchRateRange_) return false;
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
    hash = (37 * hash) + MATCH_RATE_RANGE_FIELD_NUMBER;
    hash = (53 * hash) + matchRateRange_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata prototype) {
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
   * Metadata of offline user data job.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.resources.OfflineUserDataJobMetadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.resources.OfflineUserDataJobMetadata)
      com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.resources.OfflineUserDataJobProto.internal_static_google_ads_googleads_v12_resources_OfflineUserDataJobMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.resources.OfflineUserDataJobProto.internal_static_google_ads_googleads_v12_resources_OfflineUserDataJobMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata.class, com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata.newBuilder()
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
      matchRateRange_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.resources.OfflineUserDataJobProto.internal_static_google_ads_googleads_v12_resources_OfflineUserDataJobMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata build() {
      com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata buildPartial() {
      com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata result = new com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.matchRateRange_ = matchRateRange_;
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
      if (other instanceof com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata) {
        return mergeFrom((com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata other) {
      if (other == com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata.getDefaultInstance()) return this;
      if (other.matchRateRange_ != 0) {
        setMatchRateRangeValue(other.getMatchRateRangeValue());
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
              matchRateRange_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int matchRateRange_ = 0;
    /**
     * <pre>
     * Output only. Match rate of the Customer Match user list upload. Describes
     * the estimated match rate when the status of the job is "RUNNING" and final
     * match rate when the final match rate is available after the status of the
     * job is "SUCCESS/FAILED".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange match_rate_range = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The enum numeric value on the wire for matchRateRange.
     */
    @java.lang.Override public int getMatchRateRangeValue() {
      return matchRateRange_;
    }
    /**
     * <pre>
     * Output only. Match rate of the Customer Match user list upload. Describes
     * the estimated match rate when the status of the job is "RUNNING" and final
     * match rate when the final match rate is available after the status of the
     * job is "SUCCESS/FAILED".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange match_rate_range = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The enum numeric value on the wire for matchRateRange to set.
     * @return This builder for chaining.
     */
    public Builder setMatchRateRangeValue(int value) {
      matchRateRange_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Match rate of the Customer Match user list upload. Describes
     * the estimated match rate when the status of the job is "RUNNING" and final
     * match rate when the final match rate is available after the status of the
     * job is "SUCCESS/FAILED".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange match_rate_range = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The matchRateRange.
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange getMatchRateRange() {
      com.google.ads.googleads.v12.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange result = com.google.ads.googleads.v12.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange.forNumber(matchRateRange_);
      return result == null ? com.google.ads.googleads.v12.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Output only. Match rate of the Customer Match user list upload. Describes
     * the estimated match rate when the status of the job is "RUNNING" and final
     * match rate when the final match rate is available after the status of the
     * job is "SUCCESS/FAILED".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange match_rate_range = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The matchRateRange to set.
     * @return This builder for chaining.
     */
    public Builder setMatchRateRange(com.google.ads.googleads.v12.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      matchRateRange_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Match rate of the Customer Match user list upload. Describes
     * the estimated match rate when the status of the job is "RUNNING" and final
     * match rate when the final match rate is available after the status of the
     * job is "SUCCESS/FAILED".
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.OfflineUserDataJobMatchRateRangeEnum.OfflineUserDataJobMatchRateRange match_rate_range = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearMatchRateRange() {
      bitField0_ = (bitField0_ & ~0x00000001);
      matchRateRange_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.resources.OfflineUserDataJobMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.resources.OfflineUserDataJobMetadata)
  private static final com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata();
  }

  public static com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OfflineUserDataJobMetadata>
      PARSER = new com.google.protobuf.AbstractParser<OfflineUserDataJobMetadata>() {
    @java.lang.Override
    public OfflineUserDataJobMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<OfflineUserDataJobMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OfflineUserDataJobMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.resources.OfflineUserDataJobMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


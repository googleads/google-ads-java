// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/resources/account_link.proto

package com.google.ads.googleads.v12.resources;

/**
 * <pre>
 * The identifier for Hotel account.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.resources.HotelCenterLinkIdentifier}
 */
public final class HotelCenterLinkIdentifier extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.resources.HotelCenterLinkIdentifier)
    HotelCenterLinkIdentifierOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HotelCenterLinkIdentifier.newBuilder() to construct.
  private HotelCenterLinkIdentifier(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HotelCenterLinkIdentifier() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HotelCenterLinkIdentifier();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.resources.AccountLinkProto.internal_static_google_ads_googleads_v12_resources_HotelCenterLinkIdentifier_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.resources.AccountLinkProto.internal_static_google_ads_googleads_v12_resources_HotelCenterLinkIdentifier_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier.class, com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier.Builder.class);
  }

  public static final int HOTEL_CENTER_ID_FIELD_NUMBER = 1;
  private long hotelCenterId_ = 0L;
  /**
   * <pre>
   * Output only. The hotel center id of the hotel account.
   * </pre>
   *
   * <code>int64 hotel_center_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The hotelCenterId.
   */
  @java.lang.Override
  public long getHotelCenterId() {
    return hotelCenterId_;
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
    if (hotelCenterId_ != 0L) {
      output.writeInt64(1, hotelCenterId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hotelCenterId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, hotelCenterId_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier other = (com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier) obj;

    if (getHotelCenterId()
        != other.getHotelCenterId()) return false;
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
    hash = (37 * hash) + HOTEL_CENTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getHotelCenterId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier prototype) {
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
   * The identifier for Hotel account.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.resources.HotelCenterLinkIdentifier}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.resources.HotelCenterLinkIdentifier)
      com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifierOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.resources.AccountLinkProto.internal_static_google_ads_googleads_v12_resources_HotelCenterLinkIdentifier_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.resources.AccountLinkProto.internal_static_google_ads_googleads_v12_resources_HotelCenterLinkIdentifier_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier.class, com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier.newBuilder()
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
      hotelCenterId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.resources.AccountLinkProto.internal_static_google_ads_googleads_v12_resources_HotelCenterLinkIdentifier_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier build() {
      com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier buildPartial() {
      com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier result = new com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hotelCenterId_ = hotelCenterId_;
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
      if (other instanceof com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier) {
        return mergeFrom((com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier other) {
      if (other == com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier.getDefaultInstance()) return this;
      if (other.getHotelCenterId() != 0L) {
        setHotelCenterId(other.getHotelCenterId());
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
              hotelCenterId_ = input.readInt64();
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

    private long hotelCenterId_ ;
    /**
     * <pre>
     * Output only. The hotel center id of the hotel account.
     * </pre>
     *
     * <code>int64 hotel_center_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The hotelCenterId.
     */
    @java.lang.Override
    public long getHotelCenterId() {
      return hotelCenterId_;
    }
    /**
     * <pre>
     * Output only. The hotel center id of the hotel account.
     * </pre>
     *
     * <code>int64 hotel_center_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The hotelCenterId to set.
     * @return This builder for chaining.
     */
    public Builder setHotelCenterId(long value) {

      hotelCenterId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The hotel center id of the hotel account.
     * </pre>
     *
     * <code>int64 hotel_center_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearHotelCenterId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      hotelCenterId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.resources.HotelCenterLinkIdentifier)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.resources.HotelCenterLinkIdentifier)
  private static final com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier();
  }

  public static com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HotelCenterLinkIdentifier>
      PARSER = new com.google.protobuf.AbstractParser<HotelCenterLinkIdentifier>() {
    @java.lang.Override
    public HotelCenterLinkIdentifier parsePartialFrom(
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

  public static com.google.protobuf.Parser<HotelCenterLinkIdentifier> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HotelCenterLinkIdentifier> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.resources.HotelCenterLinkIdentifier getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


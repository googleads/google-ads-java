// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/common/criteria.proto

package com.google.ads.googleads.v13.common;

/**
 * <pre>
 * Criterion for day of the week the booking is for.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v13.common.HotelCheckInDayInfo}
 */
public final class HotelCheckInDayInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v13.common.HotelCheckInDayInfo)
    HotelCheckInDayInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HotelCheckInDayInfo.newBuilder() to construct.
  private HotelCheckInDayInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HotelCheckInDayInfo() {
    dayOfWeek_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HotelCheckInDayInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v13.common.CriteriaProto.internal_static_google_ads_googleads_v13_common_HotelCheckInDayInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v13.common.CriteriaProto.internal_static_google_ads_googleads_v13_common_HotelCheckInDayInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v13.common.HotelCheckInDayInfo.class, com.google.ads.googleads.v13.common.HotelCheckInDayInfo.Builder.class);
  }

  public static final int DAY_OF_WEEK_FIELD_NUMBER = 1;
  private int dayOfWeek_ = 0;
  /**
   * <pre>
   * The day of the week.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.DayOfWeekEnum.DayOfWeek day_of_week = 1;</code>
   * @return The enum numeric value on the wire for dayOfWeek.
   */
  @java.lang.Override public int getDayOfWeekValue() {
    return dayOfWeek_;
  }
  /**
   * <pre>
   * The day of the week.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.DayOfWeekEnum.DayOfWeek day_of_week = 1;</code>
   * @return The dayOfWeek.
   */
  @java.lang.Override public com.google.ads.googleads.v13.enums.DayOfWeekEnum.DayOfWeek getDayOfWeek() {
    com.google.ads.googleads.v13.enums.DayOfWeekEnum.DayOfWeek result = com.google.ads.googleads.v13.enums.DayOfWeekEnum.DayOfWeek.forNumber(dayOfWeek_);
    return result == null ? com.google.ads.googleads.v13.enums.DayOfWeekEnum.DayOfWeek.UNRECOGNIZED : result;
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
    if (dayOfWeek_ != com.google.ads.googleads.v13.enums.DayOfWeekEnum.DayOfWeek.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, dayOfWeek_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dayOfWeek_ != com.google.ads.googleads.v13.enums.DayOfWeekEnum.DayOfWeek.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, dayOfWeek_);
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
    if (!(obj instanceof com.google.ads.googleads.v13.common.HotelCheckInDayInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v13.common.HotelCheckInDayInfo other = (com.google.ads.googleads.v13.common.HotelCheckInDayInfo) obj;

    if (dayOfWeek_ != other.dayOfWeek_) return false;
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
    hash = (37 * hash) + DAY_OF_WEEK_FIELD_NUMBER;
    hash = (53 * hash) + dayOfWeek_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v13.common.HotelCheckInDayInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.common.HotelCheckInDayInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.HotelCheckInDayInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.common.HotelCheckInDayInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.HotelCheckInDayInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.common.HotelCheckInDayInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.HotelCheckInDayInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.common.HotelCheckInDayInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v13.common.HotelCheckInDayInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v13.common.HotelCheckInDayInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.HotelCheckInDayInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.common.HotelCheckInDayInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v13.common.HotelCheckInDayInfo prototype) {
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
   * Criterion for day of the week the booking is for.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v13.common.HotelCheckInDayInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v13.common.HotelCheckInDayInfo)
      com.google.ads.googleads.v13.common.HotelCheckInDayInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v13.common.CriteriaProto.internal_static_google_ads_googleads_v13_common_HotelCheckInDayInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v13.common.CriteriaProto.internal_static_google_ads_googleads_v13_common_HotelCheckInDayInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v13.common.HotelCheckInDayInfo.class, com.google.ads.googleads.v13.common.HotelCheckInDayInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v13.common.HotelCheckInDayInfo.newBuilder()
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
      dayOfWeek_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v13.common.CriteriaProto.internal_static_google_ads_googleads_v13_common_HotelCheckInDayInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.common.HotelCheckInDayInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v13.common.HotelCheckInDayInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.common.HotelCheckInDayInfo build() {
      com.google.ads.googleads.v13.common.HotelCheckInDayInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.common.HotelCheckInDayInfo buildPartial() {
      com.google.ads.googleads.v13.common.HotelCheckInDayInfo result = new com.google.ads.googleads.v13.common.HotelCheckInDayInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v13.common.HotelCheckInDayInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dayOfWeek_ = dayOfWeek_;
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
      if (other instanceof com.google.ads.googleads.v13.common.HotelCheckInDayInfo) {
        return mergeFrom((com.google.ads.googleads.v13.common.HotelCheckInDayInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v13.common.HotelCheckInDayInfo other) {
      if (other == com.google.ads.googleads.v13.common.HotelCheckInDayInfo.getDefaultInstance()) return this;
      if (other.dayOfWeek_ != 0) {
        setDayOfWeekValue(other.getDayOfWeekValue());
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
              dayOfWeek_ = input.readEnum();
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

    private int dayOfWeek_ = 0;
    /**
     * <pre>
     * The day of the week.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.enums.DayOfWeekEnum.DayOfWeek day_of_week = 1;</code>
     * @return The enum numeric value on the wire for dayOfWeek.
     */
    @java.lang.Override public int getDayOfWeekValue() {
      return dayOfWeek_;
    }
    /**
     * <pre>
     * The day of the week.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.enums.DayOfWeekEnum.DayOfWeek day_of_week = 1;</code>
     * @param value The enum numeric value on the wire for dayOfWeek to set.
     * @return This builder for chaining.
     */
    public Builder setDayOfWeekValue(int value) {
      dayOfWeek_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The day of the week.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.enums.DayOfWeekEnum.DayOfWeek day_of_week = 1;</code>
     * @return The dayOfWeek.
     */
    @java.lang.Override
    public com.google.ads.googleads.v13.enums.DayOfWeekEnum.DayOfWeek getDayOfWeek() {
      com.google.ads.googleads.v13.enums.DayOfWeekEnum.DayOfWeek result = com.google.ads.googleads.v13.enums.DayOfWeekEnum.DayOfWeek.forNumber(dayOfWeek_);
      return result == null ? com.google.ads.googleads.v13.enums.DayOfWeekEnum.DayOfWeek.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The day of the week.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.enums.DayOfWeekEnum.DayOfWeek day_of_week = 1;</code>
     * @param value The dayOfWeek to set.
     * @return This builder for chaining.
     */
    public Builder setDayOfWeek(com.google.ads.googleads.v13.enums.DayOfWeekEnum.DayOfWeek value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      dayOfWeek_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The day of the week.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.enums.DayOfWeekEnum.DayOfWeek day_of_week = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDayOfWeek() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dayOfWeek_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v13.common.HotelCheckInDayInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v13.common.HotelCheckInDayInfo)
  private static final com.google.ads.googleads.v13.common.HotelCheckInDayInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v13.common.HotelCheckInDayInfo();
  }

  public static com.google.ads.googleads.v13.common.HotelCheckInDayInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HotelCheckInDayInfo>
      PARSER = new com.google.protobuf.AbstractParser<HotelCheckInDayInfo>() {
    @java.lang.Override
    public HotelCheckInDayInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<HotelCheckInDayInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HotelCheckInDayInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v13.common.HotelCheckInDayInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


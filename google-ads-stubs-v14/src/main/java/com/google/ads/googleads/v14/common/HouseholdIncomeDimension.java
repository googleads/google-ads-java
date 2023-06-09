// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/audiences.proto

package com.google.ads.googleads.v14.common;

/**
 * <pre>
 * Dimension specifying users by their household income.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.common.HouseholdIncomeDimension}
 */
public final class HouseholdIncomeDimension extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.common.HouseholdIncomeDimension)
    HouseholdIncomeDimensionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HouseholdIncomeDimension.newBuilder() to construct.
  private HouseholdIncomeDimension(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HouseholdIncomeDimension() {
    incomeRanges_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HouseholdIncomeDimension();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.common.AudiencesProto.internal_static_google_ads_googleads_v14_common_HouseholdIncomeDimension_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.common.AudiencesProto.internal_static_google_ads_googleads_v14_common_HouseholdIncomeDimension_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.common.HouseholdIncomeDimension.class, com.google.ads.googleads.v14.common.HouseholdIncomeDimension.Builder.class);
  }

  private int bitField0_;
  public static final int INCOME_RANGES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> incomeRanges_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType> incomeRanges_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType>() {
            public com.google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType convert(java.lang.Integer from) {
              com.google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType result = com.google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType.forNumber(from);
              return result == null ? com.google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType.UNRECOGNIZED : result;
            }
          };
  /**
   * <pre>
   * Included household income demographic segments.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType income_ranges = 1;</code>
   * @return A list containing the incomeRanges.
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType> getIncomeRangesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType>(incomeRanges_, incomeRanges_converter_);
  }
  /**
   * <pre>
   * Included household income demographic segments.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType income_ranges = 1;</code>
   * @return The count of incomeRanges.
   */
  @java.lang.Override
  public int getIncomeRangesCount() {
    return incomeRanges_.size();
  }
  /**
   * <pre>
   * Included household income demographic segments.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType income_ranges = 1;</code>
   * @param index The index of the element to return.
   * @return The incomeRanges at the given index.
   */
  @java.lang.Override
  public com.google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType getIncomeRanges(int index) {
    return incomeRanges_converter_.convert(incomeRanges_.get(index));
  }
  /**
   * <pre>
   * Included household income demographic segments.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType income_ranges = 1;</code>
   * @return A list containing the enum numeric values on the wire for incomeRanges.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getIncomeRangesValueList() {
    return incomeRanges_;
  }
  /**
   * <pre>
   * Included household income demographic segments.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType income_ranges = 1;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of incomeRanges at the given index.
   */
  @java.lang.Override
  public int getIncomeRangesValue(int index) {
    return incomeRanges_.get(index);
  }
  private int incomeRangesMemoizedSerializedSize;

  public static final int INCLUDE_UNDETERMINED_FIELD_NUMBER = 2;
  private boolean includeUndetermined_ = false;
  /**
   * <pre>
   * Include users whose household income is not determined.
   * </pre>
   *
   * <code>optional bool include_undetermined = 2;</code>
   * @return Whether the includeUndetermined field is set.
   */
  @java.lang.Override
  public boolean hasIncludeUndetermined() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Include users whose household income is not determined.
   * </pre>
   *
   * <code>optional bool include_undetermined = 2;</code>
   * @return The includeUndetermined.
   */
  @java.lang.Override
  public boolean getIncludeUndetermined() {
    return includeUndetermined_;
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
    getSerializedSize();
    if (getIncomeRangesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(incomeRangesMemoizedSerializedSize);
    }
    for (int i = 0; i < incomeRanges_.size(); i++) {
      output.writeEnumNoTag(incomeRanges_.get(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBool(2, includeUndetermined_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < incomeRanges_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(incomeRanges_.get(i));
      }
      size += dataSize;
      if (!getIncomeRangesList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }incomeRangesMemoizedSerializedSize = dataSize;
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, includeUndetermined_);
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
    if (!(obj instanceof com.google.ads.googleads.v14.common.HouseholdIncomeDimension)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.common.HouseholdIncomeDimension other = (com.google.ads.googleads.v14.common.HouseholdIncomeDimension) obj;

    if (!incomeRanges_.equals(other.incomeRanges_)) return false;
    if (hasIncludeUndetermined() != other.hasIncludeUndetermined()) return false;
    if (hasIncludeUndetermined()) {
      if (getIncludeUndetermined()
          != other.getIncludeUndetermined()) return false;
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
    if (getIncomeRangesCount() > 0) {
      hash = (37 * hash) + INCOME_RANGES_FIELD_NUMBER;
      hash = (53 * hash) + incomeRanges_.hashCode();
    }
    if (hasIncludeUndetermined()) {
      hash = (37 * hash) + INCLUDE_UNDETERMINED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIncludeUndetermined());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v14.common.HouseholdIncomeDimension parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.HouseholdIncomeDimension parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.HouseholdIncomeDimension parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.HouseholdIncomeDimension parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.HouseholdIncomeDimension parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.HouseholdIncomeDimension parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.HouseholdIncomeDimension parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.common.HouseholdIncomeDimension parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.common.HouseholdIncomeDimension parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.common.HouseholdIncomeDimension parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.HouseholdIncomeDimension parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.common.HouseholdIncomeDimension parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.common.HouseholdIncomeDimension prototype) {
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
   * Dimension specifying users by their household income.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.common.HouseholdIncomeDimension}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.common.HouseholdIncomeDimension)
      com.google.ads.googleads.v14.common.HouseholdIncomeDimensionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.common.AudiencesProto.internal_static_google_ads_googleads_v14_common_HouseholdIncomeDimension_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.common.AudiencesProto.internal_static_google_ads_googleads_v14_common_HouseholdIncomeDimension_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.common.HouseholdIncomeDimension.class, com.google.ads.googleads.v14.common.HouseholdIncomeDimension.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.common.HouseholdIncomeDimension.newBuilder()
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
      incomeRanges_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      includeUndetermined_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v14.common.AudiencesProto.internal_static_google_ads_googleads_v14_common_HouseholdIncomeDimension_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.HouseholdIncomeDimension getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.common.HouseholdIncomeDimension.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.HouseholdIncomeDimension build() {
      com.google.ads.googleads.v14.common.HouseholdIncomeDimension result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.HouseholdIncomeDimension buildPartial() {
      com.google.ads.googleads.v14.common.HouseholdIncomeDimension result = new com.google.ads.googleads.v14.common.HouseholdIncomeDimension(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v14.common.HouseholdIncomeDimension result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        incomeRanges_ = java.util.Collections.unmodifiableList(incomeRanges_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.incomeRanges_ = incomeRanges_;
    }

    private void buildPartial0(com.google.ads.googleads.v14.common.HouseholdIncomeDimension result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.includeUndetermined_ = includeUndetermined_;
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
      if (other instanceof com.google.ads.googleads.v14.common.HouseholdIncomeDimension) {
        return mergeFrom((com.google.ads.googleads.v14.common.HouseholdIncomeDimension)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.common.HouseholdIncomeDimension other) {
      if (other == com.google.ads.googleads.v14.common.HouseholdIncomeDimension.getDefaultInstance()) return this;
      if (!other.incomeRanges_.isEmpty()) {
        if (incomeRanges_.isEmpty()) {
          incomeRanges_ = other.incomeRanges_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureIncomeRangesIsMutable();
          incomeRanges_.addAll(other.incomeRanges_);
        }
        onChanged();
      }
      if (other.hasIncludeUndetermined()) {
        setIncludeUndetermined(other.getIncludeUndetermined());
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
              int tmpRaw = input.readEnum();
              ensureIncomeRangesIsMutable();
              incomeRanges_.add(tmpRaw);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int oldLimit = input.pushLimit(length);
              while(input.getBytesUntilLimit() > 0) {
                int tmpRaw = input.readEnum();
                ensureIncomeRangesIsMutable();
                incomeRanges_.add(tmpRaw);
              }
              input.popLimit(oldLimit);
              break;
            } // case 10
            case 16: {
              includeUndetermined_ = input.readBool();
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

    private java.util.List<java.lang.Integer> incomeRanges_ =
      java.util.Collections.emptyList();
    private void ensureIncomeRangesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        incomeRanges_ = new java.util.ArrayList<java.lang.Integer>(incomeRanges_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * Included household income demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType income_ranges = 1;</code>
     * @return A list containing the incomeRanges.
     */
    public java.util.List<com.google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType> getIncomeRangesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType>(incomeRanges_, incomeRanges_converter_);
    }
    /**
     * <pre>
     * Included household income demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType income_ranges = 1;</code>
     * @return The count of incomeRanges.
     */
    public int getIncomeRangesCount() {
      return incomeRanges_.size();
    }
    /**
     * <pre>
     * Included household income demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType income_ranges = 1;</code>
     * @param index The index of the element to return.
     * @return The incomeRanges at the given index.
     */
    public com.google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType getIncomeRanges(int index) {
      return incomeRanges_converter_.convert(incomeRanges_.get(index));
    }
    /**
     * <pre>
     * Included household income demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType income_ranges = 1;</code>
     * @param index The index to set the value at.
     * @param value The incomeRanges to set.
     * @return This builder for chaining.
     */
    public Builder setIncomeRanges(
        int index, com.google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureIncomeRangesIsMutable();
      incomeRanges_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Included household income demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType income_ranges = 1;</code>
     * @param value The incomeRanges to add.
     * @return This builder for chaining.
     */
    public Builder addIncomeRanges(com.google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureIncomeRangesIsMutable();
      incomeRanges_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Included household income demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType income_ranges = 1;</code>
     * @param values The incomeRanges to add.
     * @return This builder for chaining.
     */
    public Builder addAllIncomeRanges(
        java.lang.Iterable<? extends com.google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType> values) {
      ensureIncomeRangesIsMutable();
      for (com.google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType value : values) {
        incomeRanges_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Included household income demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType income_ranges = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIncomeRanges() {
      incomeRanges_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Included household income demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType income_ranges = 1;</code>
     * @return A list containing the enum numeric values on the wire for incomeRanges.
     */
    public java.util.List<java.lang.Integer>
    getIncomeRangesValueList() {
      return java.util.Collections.unmodifiableList(incomeRanges_);
    }
    /**
     * <pre>
     * Included household income demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType income_ranges = 1;</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of incomeRanges at the given index.
     */
    public int getIncomeRangesValue(int index) {
      return incomeRanges_.get(index);
    }
    /**
     * <pre>
     * Included household income demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType income_ranges = 1;</code>
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for incomeRanges to set.
     * @return This builder for chaining.
     */
    public Builder setIncomeRangesValue(
        int index, int value) {
      ensureIncomeRangesIsMutable();
      incomeRanges_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Included household income demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType income_ranges = 1;</code>
     * @param value The enum numeric value on the wire for incomeRanges to add.
     * @return This builder for chaining.
     */
    public Builder addIncomeRangesValue(int value) {
      ensureIncomeRangesIsMutable();
      incomeRanges_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Included household income demographic segments.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.enums.IncomeRangeTypeEnum.IncomeRangeType income_ranges = 1;</code>
     * @param values The enum numeric values on the wire for incomeRanges to add.
     * @return This builder for chaining.
     */
    public Builder addAllIncomeRangesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureIncomeRangesIsMutable();
      for (int value : values) {
        incomeRanges_.add(value);
      }
      onChanged();
      return this;
    }

    private boolean includeUndetermined_ ;
    /**
     * <pre>
     * Include users whose household income is not determined.
     * </pre>
     *
     * <code>optional bool include_undetermined = 2;</code>
     * @return Whether the includeUndetermined field is set.
     */
    @java.lang.Override
    public boolean hasIncludeUndetermined() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Include users whose household income is not determined.
     * </pre>
     *
     * <code>optional bool include_undetermined = 2;</code>
     * @return The includeUndetermined.
     */
    @java.lang.Override
    public boolean getIncludeUndetermined() {
      return includeUndetermined_;
    }
    /**
     * <pre>
     * Include users whose household income is not determined.
     * </pre>
     *
     * <code>optional bool include_undetermined = 2;</code>
     * @param value The includeUndetermined to set.
     * @return This builder for chaining.
     */
    public Builder setIncludeUndetermined(boolean value) {

      includeUndetermined_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Include users whose household income is not determined.
     * </pre>
     *
     * <code>optional bool include_undetermined = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIncludeUndetermined() {
      bitField0_ = (bitField0_ & ~0x00000002);
      includeUndetermined_ = false;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.common.HouseholdIncomeDimension)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.common.HouseholdIncomeDimension)
  private static final com.google.ads.googleads.v14.common.HouseholdIncomeDimension DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.common.HouseholdIncomeDimension();
  }

  public static com.google.ads.googleads.v14.common.HouseholdIncomeDimension getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HouseholdIncomeDimension>
      PARSER = new com.google.protobuf.AbstractParser<HouseholdIncomeDimension>() {
    @java.lang.Override
    public HouseholdIncomeDimension parsePartialFrom(
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

  public static com.google.protobuf.Parser<HouseholdIncomeDimension> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HouseholdIncomeDimension> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.common.HouseholdIncomeDimension getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


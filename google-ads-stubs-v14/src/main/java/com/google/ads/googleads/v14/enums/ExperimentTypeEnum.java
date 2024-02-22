// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/enums/experiment_type.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.enums;

/**
 * <pre>
 * Container for enum describing the type of experiment.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.enums.ExperimentTypeEnum}
 */
public final class ExperimentTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.enums.ExperimentTypeEnum)
    ExperimentTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExperimentTypeEnum.newBuilder() to construct.
  private ExperimentTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExperimentTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExperimentTypeEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.enums.ExperimentTypeProto.internal_static_google_ads_googleads_v14_enums_ExperimentTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.enums.ExperimentTypeProto.internal_static_google_ads_googleads_v14_enums_ExperimentTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.enums.ExperimentTypeEnum.class, com.google.ads.googleads.v14.enums.ExperimentTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * The type of the experiment.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v14.enums.ExperimentTypeEnum.ExperimentType}
   */
  public enum ExperimentType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The value is unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * This is a DISPLAY_AND_VIDEO_360 experiment.
     * </pre>
     *
     * <code>DISPLAY_AND_VIDEO_360 = 2;</code>
     */
    DISPLAY_AND_VIDEO_360(2),
    /**
     * <pre>
     * This is an ad variation experiment.
     * </pre>
     *
     * <code>AD_VARIATION = 3;</code>
     */
    AD_VARIATION(3),
    /**
     * <pre>
     * A custom experiment consisting of Video campaigns.
     * </pre>
     *
     * <code>YOUTUBE_CUSTOM = 5;</code>
     */
    YOUTUBE_CUSTOM(5),
    /**
     * <pre>
     * A custom experiment consisting of display campaigns.
     * </pre>
     *
     * <code>DISPLAY_CUSTOM = 6;</code>
     */
    DISPLAY_CUSTOM(6),
    /**
     * <pre>
     * A custom experiment consisting of search campaigns.
     * </pre>
     *
     * <code>SEARCH_CUSTOM = 7;</code>
     */
    SEARCH_CUSTOM(7),
    /**
     * <pre>
     * An experiment that compares bidding strategies for display campaigns.
     * </pre>
     *
     * <code>DISPLAY_AUTOMATED_BIDDING_STRATEGY = 8;</code>
     */
    DISPLAY_AUTOMATED_BIDDING_STRATEGY(8),
    /**
     * <pre>
     * An experiment that compares bidding strategies for search campaigns."
     * </pre>
     *
     * <code>SEARCH_AUTOMATED_BIDDING_STRATEGY = 9;</code>
     */
    SEARCH_AUTOMATED_BIDDING_STRATEGY(9),
    /**
     * <pre>
     * An experiment that compares bidding strategies for shopping campaigns.
     * </pre>
     *
     * <code>SHOPPING_AUTOMATED_BIDDING_STRATEGY = 10;</code>
     */
    SHOPPING_AUTOMATED_BIDDING_STRATEGY(10),
    /**
     * <pre>
     * DEPRECATED. A smart matching experiment with search campaigns.
     * </pre>
     *
     * <code>SMART_MATCHING = 11;</code>
     */
    SMART_MATCHING(11),
    /**
     * <pre>
     * A custom experiment consisting of hotel campaigns.
     * </pre>
     *
     * <code>HOTEL_CUSTOM = 12;</code>
     */
    HOTEL_CUSTOM(12),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The value is unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * This is a DISPLAY_AND_VIDEO_360 experiment.
     * </pre>
     *
     * <code>DISPLAY_AND_VIDEO_360 = 2;</code>
     */
    public static final int DISPLAY_AND_VIDEO_360_VALUE = 2;
    /**
     * <pre>
     * This is an ad variation experiment.
     * </pre>
     *
     * <code>AD_VARIATION = 3;</code>
     */
    public static final int AD_VARIATION_VALUE = 3;
    /**
     * <pre>
     * A custom experiment consisting of Video campaigns.
     * </pre>
     *
     * <code>YOUTUBE_CUSTOM = 5;</code>
     */
    public static final int YOUTUBE_CUSTOM_VALUE = 5;
    /**
     * <pre>
     * A custom experiment consisting of display campaigns.
     * </pre>
     *
     * <code>DISPLAY_CUSTOM = 6;</code>
     */
    public static final int DISPLAY_CUSTOM_VALUE = 6;
    /**
     * <pre>
     * A custom experiment consisting of search campaigns.
     * </pre>
     *
     * <code>SEARCH_CUSTOM = 7;</code>
     */
    public static final int SEARCH_CUSTOM_VALUE = 7;
    /**
     * <pre>
     * An experiment that compares bidding strategies for display campaigns.
     * </pre>
     *
     * <code>DISPLAY_AUTOMATED_BIDDING_STRATEGY = 8;</code>
     */
    public static final int DISPLAY_AUTOMATED_BIDDING_STRATEGY_VALUE = 8;
    /**
     * <pre>
     * An experiment that compares bidding strategies for search campaigns."
     * </pre>
     *
     * <code>SEARCH_AUTOMATED_BIDDING_STRATEGY = 9;</code>
     */
    public static final int SEARCH_AUTOMATED_BIDDING_STRATEGY_VALUE = 9;
    /**
     * <pre>
     * An experiment that compares bidding strategies for shopping campaigns.
     * </pre>
     *
     * <code>SHOPPING_AUTOMATED_BIDDING_STRATEGY = 10;</code>
     */
    public static final int SHOPPING_AUTOMATED_BIDDING_STRATEGY_VALUE = 10;
    /**
     * <pre>
     * DEPRECATED. A smart matching experiment with search campaigns.
     * </pre>
     *
     * <code>SMART_MATCHING = 11;</code>
     */
    public static final int SMART_MATCHING_VALUE = 11;
    /**
     * <pre>
     * A custom experiment consisting of hotel campaigns.
     * </pre>
     *
     * <code>HOTEL_CUSTOM = 12;</code>
     */
    public static final int HOTEL_CUSTOM_VALUE = 12;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ExperimentType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ExperimentType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return DISPLAY_AND_VIDEO_360;
        case 3: return AD_VARIATION;
        case 5: return YOUTUBE_CUSTOM;
        case 6: return DISPLAY_CUSTOM;
        case 7: return SEARCH_CUSTOM;
        case 8: return DISPLAY_AUTOMATED_BIDDING_STRATEGY;
        case 9: return SEARCH_AUTOMATED_BIDDING_STRATEGY;
        case 10: return SHOPPING_AUTOMATED_BIDDING_STRATEGY;
        case 11: return SMART_MATCHING;
        case 12: return HOTEL_CUSTOM;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ExperimentType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ExperimentType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ExperimentType>() {
            public ExperimentType findValueByNumber(int number) {
              return ExperimentType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.enums.ExperimentTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ExperimentType[] VALUES = values();

    public static ExperimentType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ExperimentType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v14.enums.ExperimentTypeEnum.ExperimentType)
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v14.enums.ExperimentTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.enums.ExperimentTypeEnum other = (com.google.ads.googleads.v14.enums.ExperimentTypeEnum) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v14.enums.ExperimentTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.enums.ExperimentTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.enums.ExperimentTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.enums.ExperimentTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.enums.ExperimentTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.enums.ExperimentTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.enums.ExperimentTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.enums.ExperimentTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.enums.ExperimentTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.enums.ExperimentTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.enums.ExperimentTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.enums.ExperimentTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.enums.ExperimentTypeEnum prototype) {
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
   * Container for enum describing the type of experiment.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.enums.ExperimentTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.enums.ExperimentTypeEnum)
      com.google.ads.googleads.v14.enums.ExperimentTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.enums.ExperimentTypeProto.internal_static_google_ads_googleads_v14_enums_ExperimentTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.enums.ExperimentTypeProto.internal_static_google_ads_googleads_v14_enums_ExperimentTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.enums.ExperimentTypeEnum.class, com.google.ads.googleads.v14.enums.ExperimentTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.enums.ExperimentTypeEnum.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v14.enums.ExperimentTypeProto.internal_static_google_ads_googleads_v14_enums_ExperimentTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.enums.ExperimentTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.enums.ExperimentTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.enums.ExperimentTypeEnum build() {
      com.google.ads.googleads.v14.enums.ExperimentTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.enums.ExperimentTypeEnum buildPartial() {
      com.google.ads.googleads.v14.enums.ExperimentTypeEnum result = new com.google.ads.googleads.v14.enums.ExperimentTypeEnum(this);
      onBuilt();
      return result;
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
      if (other instanceof com.google.ads.googleads.v14.enums.ExperimentTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v14.enums.ExperimentTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.enums.ExperimentTypeEnum other) {
      if (other == com.google.ads.googleads.v14.enums.ExperimentTypeEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.enums.ExperimentTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.enums.ExperimentTypeEnum)
  private static final com.google.ads.googleads.v14.enums.ExperimentTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.enums.ExperimentTypeEnum();
  }

  public static com.google.ads.googleads.v14.enums.ExperimentTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExperimentTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<ExperimentTypeEnum>() {
    @java.lang.Override
    public ExperimentTypeEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExperimentTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExperimentTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.enums.ExperimentTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


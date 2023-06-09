// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/enums/audience_insights_dimension.proto

package com.google.ads.googleads.v12.enums;

/**
 * <pre>
 * Container for enum describing insights dimensions.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum}
 */
public final class AudienceInsightsDimensionEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum)
    AudienceInsightsDimensionEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AudienceInsightsDimensionEnum.newBuilder() to construct.
  private AudienceInsightsDimensionEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AudienceInsightsDimensionEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AudienceInsightsDimensionEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.enums.AudienceInsightsDimensionProto.internal_static_google_ads_googleads_v12_enums_AudienceInsightsDimensionEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.enums.AudienceInsightsDimensionProto.internal_static_google_ads_googleads_v12_enums_AudienceInsightsDimensionEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum.class, com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum.Builder.class);
  }

  /**
   * <pre>
   * Possible dimensions for use in generating insights.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension}
   */
  public enum AudienceInsightsDimension
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
     * A Product &amp; Service category.
     * </pre>
     *
     * <code>CATEGORY = 2;</code>
     */
    CATEGORY(2),
    /**
     * <pre>
     * A Knowledge Graph entity.
     * </pre>
     *
     * <code>KNOWLEDGE_GRAPH = 3;</code>
     */
    KNOWLEDGE_GRAPH(3),
    /**
     * <pre>
     * A country, represented by a geo target.
     * </pre>
     *
     * <code>GEO_TARGET_COUNTRY = 4;</code>
     */
    GEO_TARGET_COUNTRY(4),
    /**
     * <pre>
     * A geographic location within a country.
     * </pre>
     *
     * <code>SUB_COUNTRY_LOCATION = 5;</code>
     */
    SUB_COUNTRY_LOCATION(5),
    /**
     * <pre>
     * A YouTube channel.
     * </pre>
     *
     * <code>YOUTUBE_CHANNEL = 6;</code>
     */
    YOUTUBE_CHANNEL(6),
    /**
     * <pre>
     * A YouTube Dynamic Lineup.
     * </pre>
     *
     * <code>YOUTUBE_DYNAMIC_LINEUP = 7;</code>
     */
    YOUTUBE_DYNAMIC_LINEUP(7),
    /**
     * <pre>
     * An Affinity UserInterest.
     * </pre>
     *
     * <code>AFFINITY_USER_INTEREST = 8;</code>
     */
    AFFINITY_USER_INTEREST(8),
    /**
     * <pre>
     * An In-Market UserInterest.
     * </pre>
     *
     * <code>IN_MARKET_USER_INTEREST = 9;</code>
     */
    IN_MARKET_USER_INTEREST(9),
    /**
     * <pre>
     * A Parental Status value (parent, or not a parent).
     * </pre>
     *
     * <code>PARENTAL_STATUS = 10;</code>
     */
    PARENTAL_STATUS(10),
    /**
     * <pre>
     * A household income percentile range.
     * </pre>
     *
     * <code>INCOME_RANGE = 11;</code>
     */
    INCOME_RANGE(11),
    /**
     * <pre>
     * An age range.
     * </pre>
     *
     * <code>AGE_RANGE = 12;</code>
     */
    AGE_RANGE(12),
    /**
     * <pre>
     * A gender.
     * </pre>
     *
     * <code>GENDER = 13;</code>
     */
    GENDER(13),
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
     * A Product &amp; Service category.
     * </pre>
     *
     * <code>CATEGORY = 2;</code>
     */
    public static final int CATEGORY_VALUE = 2;
    /**
     * <pre>
     * A Knowledge Graph entity.
     * </pre>
     *
     * <code>KNOWLEDGE_GRAPH = 3;</code>
     */
    public static final int KNOWLEDGE_GRAPH_VALUE = 3;
    /**
     * <pre>
     * A country, represented by a geo target.
     * </pre>
     *
     * <code>GEO_TARGET_COUNTRY = 4;</code>
     */
    public static final int GEO_TARGET_COUNTRY_VALUE = 4;
    /**
     * <pre>
     * A geographic location within a country.
     * </pre>
     *
     * <code>SUB_COUNTRY_LOCATION = 5;</code>
     */
    public static final int SUB_COUNTRY_LOCATION_VALUE = 5;
    /**
     * <pre>
     * A YouTube channel.
     * </pre>
     *
     * <code>YOUTUBE_CHANNEL = 6;</code>
     */
    public static final int YOUTUBE_CHANNEL_VALUE = 6;
    /**
     * <pre>
     * A YouTube Dynamic Lineup.
     * </pre>
     *
     * <code>YOUTUBE_DYNAMIC_LINEUP = 7;</code>
     */
    public static final int YOUTUBE_DYNAMIC_LINEUP_VALUE = 7;
    /**
     * <pre>
     * An Affinity UserInterest.
     * </pre>
     *
     * <code>AFFINITY_USER_INTEREST = 8;</code>
     */
    public static final int AFFINITY_USER_INTEREST_VALUE = 8;
    /**
     * <pre>
     * An In-Market UserInterest.
     * </pre>
     *
     * <code>IN_MARKET_USER_INTEREST = 9;</code>
     */
    public static final int IN_MARKET_USER_INTEREST_VALUE = 9;
    /**
     * <pre>
     * A Parental Status value (parent, or not a parent).
     * </pre>
     *
     * <code>PARENTAL_STATUS = 10;</code>
     */
    public static final int PARENTAL_STATUS_VALUE = 10;
    /**
     * <pre>
     * A household income percentile range.
     * </pre>
     *
     * <code>INCOME_RANGE = 11;</code>
     */
    public static final int INCOME_RANGE_VALUE = 11;
    /**
     * <pre>
     * An age range.
     * </pre>
     *
     * <code>AGE_RANGE = 12;</code>
     */
    public static final int AGE_RANGE_VALUE = 12;
    /**
     * <pre>
     * A gender.
     * </pre>
     *
     * <code>GENDER = 13;</code>
     */
    public static final int GENDER_VALUE = 13;


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
    public static AudienceInsightsDimension valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AudienceInsightsDimension forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return CATEGORY;
        case 3: return KNOWLEDGE_GRAPH;
        case 4: return GEO_TARGET_COUNTRY;
        case 5: return SUB_COUNTRY_LOCATION;
        case 6: return YOUTUBE_CHANNEL;
        case 7: return YOUTUBE_DYNAMIC_LINEUP;
        case 8: return AFFINITY_USER_INTEREST;
        case 9: return IN_MARKET_USER_INTEREST;
        case 10: return PARENTAL_STATUS;
        case 11: return INCOME_RANGE;
        case 12: return AGE_RANGE;
        case 13: return GENDER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AudienceInsightsDimension>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AudienceInsightsDimension> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AudienceInsightsDimension>() {
            public AudienceInsightsDimension findValueByNumber(int number) {
              return AudienceInsightsDimension.forNumber(number);
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
      return com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AudienceInsightsDimension[] VALUES = values();

    public static AudienceInsightsDimension valueOf(
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

    private AudienceInsightsDimension(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum.AudienceInsightsDimension)
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
    if (!(obj instanceof com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum other = (com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum) obj;

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

  public static com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum prototype) {
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
   * Container for enum describing insights dimensions.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum)
      com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.enums.AudienceInsightsDimensionProto.internal_static_google_ads_googleads_v12_enums_AudienceInsightsDimensionEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.enums.AudienceInsightsDimensionProto.internal_static_google_ads_googleads_v12_enums_AudienceInsightsDimensionEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum.class, com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum.newBuilder()
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
      return com.google.ads.googleads.v12.enums.AudienceInsightsDimensionProto.internal_static_google_ads_googleads_v12_enums_AudienceInsightsDimensionEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum build() {
      com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum buildPartial() {
      com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum result = new com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum(this);
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
      if (other instanceof com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum) {
        return mergeFrom((com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum other) {
      if (other == com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum)
  private static final com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum();
  }

  public static com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AudienceInsightsDimensionEnum>
      PARSER = new com.google.protobuf.AbstractParser<AudienceInsightsDimensionEnum>() {
    @java.lang.Override
    public AudienceInsightsDimensionEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<AudienceInsightsDimensionEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AudienceInsightsDimensionEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.enums.AudienceInsightsDimensionEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


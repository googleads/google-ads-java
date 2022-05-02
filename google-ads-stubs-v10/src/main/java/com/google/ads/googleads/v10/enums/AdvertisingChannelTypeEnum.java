// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/enums/advertising_channel_type.proto

package com.google.ads.googleads.v10.enums;

/**
 * <pre>
 * The channel type a campaign may target to serve on.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum}
 */
public final class AdvertisingChannelTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum)
    AdvertisingChannelTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdvertisingChannelTypeEnum.newBuilder() to construct.
  private AdvertisingChannelTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdvertisingChannelTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdvertisingChannelTypeEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AdvertisingChannelTypeEnum(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v10.enums.AdvertisingChannelTypeProto.internal_static_google_ads_googleads_v10_enums_AdvertisingChannelTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.enums.AdvertisingChannelTypeProto.internal_static_google_ads_googleads_v10_enums_AdvertisingChannelTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum.class, com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing the various advertising channel types.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType}
   */
  public enum AdvertisingChannelType
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
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Search Network. Includes display bundled, and Search+ campaigns.
     * </pre>
     *
     * <code>SEARCH = 2;</code>
     */
    SEARCH(2),
    /**
     * <pre>
     * Google Display Network only.
     * </pre>
     *
     * <code>DISPLAY = 3;</code>
     */
    DISPLAY(3),
    /**
     * <pre>
     * Shopping campaigns serve on the shopping property
     * and on google.com search results.
     * </pre>
     *
     * <code>SHOPPING = 4;</code>
     */
    SHOPPING(4),
    /**
     * <pre>
     * Hotel Ads campaigns.
     * </pre>
     *
     * <code>HOTEL = 5;</code>
     */
    HOTEL(5),
    /**
     * <pre>
     * Video campaigns.
     * </pre>
     *
     * <code>VIDEO = 6;</code>
     */
    VIDEO(6),
    /**
     * <pre>
     * App Campaigns, and App Campaigns for Engagement, that run
     * across multiple channels.
     * </pre>
     *
     * <code>MULTI_CHANNEL = 7;</code>
     */
    MULTI_CHANNEL(7),
    /**
     * <pre>
     * Local ads campaigns.
     * </pre>
     *
     * <code>LOCAL = 8;</code>
     */
    LOCAL(8),
    /**
     * <pre>
     * Smart campaigns.
     * </pre>
     *
     * <code>SMART = 9;</code>
     */
    SMART(9),
    /**
     * <pre>
     * Performance Max campaigns.
     * </pre>
     *
     * <code>PERFORMANCE_MAX = 10;</code>
     */
    PERFORMANCE_MAX(10),
    /**
     * <pre>
     * Local services campaigns.
     * </pre>
     *
     * <code>LOCAL_SERVICES = 11;</code>
     */
    LOCAL_SERVICES(11),
    /**
     * <pre>
     * Discovery campaigns.
     * </pre>
     *
     * <code>DISCOVERY = 12;</code>
     */
    DISCOVERY(12),
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
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Search Network. Includes display bundled, and Search+ campaigns.
     * </pre>
     *
     * <code>SEARCH = 2;</code>
     */
    public static final int SEARCH_VALUE = 2;
    /**
     * <pre>
     * Google Display Network only.
     * </pre>
     *
     * <code>DISPLAY = 3;</code>
     */
    public static final int DISPLAY_VALUE = 3;
    /**
     * <pre>
     * Shopping campaigns serve on the shopping property
     * and on google.com search results.
     * </pre>
     *
     * <code>SHOPPING = 4;</code>
     */
    public static final int SHOPPING_VALUE = 4;
    /**
     * <pre>
     * Hotel Ads campaigns.
     * </pre>
     *
     * <code>HOTEL = 5;</code>
     */
    public static final int HOTEL_VALUE = 5;
    /**
     * <pre>
     * Video campaigns.
     * </pre>
     *
     * <code>VIDEO = 6;</code>
     */
    public static final int VIDEO_VALUE = 6;
    /**
     * <pre>
     * App Campaigns, and App Campaigns for Engagement, that run
     * across multiple channels.
     * </pre>
     *
     * <code>MULTI_CHANNEL = 7;</code>
     */
    public static final int MULTI_CHANNEL_VALUE = 7;
    /**
     * <pre>
     * Local ads campaigns.
     * </pre>
     *
     * <code>LOCAL = 8;</code>
     */
    public static final int LOCAL_VALUE = 8;
    /**
     * <pre>
     * Smart campaigns.
     * </pre>
     *
     * <code>SMART = 9;</code>
     */
    public static final int SMART_VALUE = 9;
    /**
     * <pre>
     * Performance Max campaigns.
     * </pre>
     *
     * <code>PERFORMANCE_MAX = 10;</code>
     */
    public static final int PERFORMANCE_MAX_VALUE = 10;
    /**
     * <pre>
     * Local services campaigns.
     * </pre>
     *
     * <code>LOCAL_SERVICES = 11;</code>
     */
    public static final int LOCAL_SERVICES_VALUE = 11;
    /**
     * <pre>
     * Discovery campaigns.
     * </pre>
     *
     * <code>DISCOVERY = 12;</code>
     */
    public static final int DISCOVERY_VALUE = 12;


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
    public static AdvertisingChannelType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AdvertisingChannelType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return SEARCH;
        case 3: return DISPLAY;
        case 4: return SHOPPING;
        case 5: return HOTEL;
        case 6: return VIDEO;
        case 7: return MULTI_CHANNEL;
        case 8: return LOCAL;
        case 9: return SMART;
        case 10: return PERFORMANCE_MAX;
        case 11: return LOCAL_SERVICES;
        case 12: return DISCOVERY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AdvertisingChannelType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AdvertisingChannelType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AdvertisingChannelType>() {
            public AdvertisingChannelType findValueByNumber(int number) {
              return AdvertisingChannelType.forNumber(number);
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
      return com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AdvertisingChannelType[] VALUES = values();

    public static AdvertisingChannelType valueOf(
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

    private AdvertisingChannelType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum.AdvertisingChannelType)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum other = (com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum) obj;

    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum prototype) {
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
   * The channel type a campaign may target to serve on.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum)
      com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.enums.AdvertisingChannelTypeProto.internal_static_google_ads_googleads_v10_enums_AdvertisingChannelTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.enums.AdvertisingChannelTypeProto.internal_static_google_ads_googleads_v10_enums_AdvertisingChannelTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum.class, com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.enums.AdvertisingChannelTypeProto.internal_static_google_ads_googleads_v10_enums_AdvertisingChannelTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum build() {
      com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum buildPartial() {
      com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum result = new com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum other) {
      if (other == com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum)
  private static final com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum();
  }

  public static com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdvertisingChannelTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<AdvertisingChannelTypeEnum>() {
    @java.lang.Override
    public AdvertisingChannelTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AdvertisingChannelTypeEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AdvertisingChannelTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdvertisingChannelTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.enums.AdvertisingChannelTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


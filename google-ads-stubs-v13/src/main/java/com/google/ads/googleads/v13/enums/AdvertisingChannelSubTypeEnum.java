// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/enums/advertising_channel_sub_type.proto

package com.google.ads.googleads.v13.enums;

/**
 * <pre>
 * An immutable specialization of an Advertising Channel.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum}
 */
public final class AdvertisingChannelSubTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum)
    AdvertisingChannelSubTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdvertisingChannelSubTypeEnum.newBuilder() to construct.
  private AdvertisingChannelSubTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdvertisingChannelSubTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdvertisingChannelSubTypeEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeProto.internal_static_google_ads_googleads_v13_enums_AdvertisingChannelSubTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeProto.internal_static_google_ads_googleads_v13_enums_AdvertisingChannelSubTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum.class, com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing the different channel subtypes.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType}
   */
  public enum AdvertisingChannelSubType
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
     * Used as a return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Mobile app campaigns for Search.
     * </pre>
     *
     * <code>SEARCH_MOBILE_APP = 2;</code>
     */
    SEARCH_MOBILE_APP(2),
    /**
     * <pre>
     * Mobile app campaigns for Display.
     * </pre>
     *
     * <code>DISPLAY_MOBILE_APP = 3;</code>
     */
    DISPLAY_MOBILE_APP(3),
    /**
     * <pre>
     * AdWords express campaigns for search.
     * </pre>
     *
     * <code>SEARCH_EXPRESS = 4;</code>
     */
    SEARCH_EXPRESS(4),
    /**
     * <pre>
     * AdWords Express campaigns for display.
     * </pre>
     *
     * <code>DISPLAY_EXPRESS = 5;</code>
     */
    DISPLAY_EXPRESS(5),
    /**
     * <pre>
     * Smart Shopping campaigns.
     * </pre>
     *
     * <code>SHOPPING_SMART_ADS = 6;</code>
     */
    SHOPPING_SMART_ADS(6),
    /**
     * <pre>
     * Gmail Ad campaigns.
     * </pre>
     *
     * <code>DISPLAY_GMAIL_AD = 7;</code>
     */
    DISPLAY_GMAIL_AD(7),
    /**
     * <pre>
     * Smart display campaigns. New campaigns of this sub type cannot be
     * created.
     * </pre>
     *
     * <code>DISPLAY_SMART_CAMPAIGN = 8;</code>
     */
    DISPLAY_SMART_CAMPAIGN(8),
    /**
     * <pre>
     * Video Outstream campaigns.
     * </pre>
     *
     * <code>VIDEO_OUTSTREAM = 9;</code>
     */
    VIDEO_OUTSTREAM(9),
    /**
     * <pre>
     * Video TrueView for Action campaigns.
     * </pre>
     *
     * <code>VIDEO_ACTION = 10;</code>
     */
    VIDEO_ACTION(10),
    /**
     * <pre>
     * Video campaigns with non-skippable video ads.
     * </pre>
     *
     * <code>VIDEO_NON_SKIPPABLE = 11;</code>
     */
    VIDEO_NON_SKIPPABLE(11),
    /**
     * <pre>
     * App Campaign that lets you easily promote your Android or iOS app
     * across Google's top properties including Search, Play, YouTube, and the
     * Google Display Network.
     * </pre>
     *
     * <code>APP_CAMPAIGN = 12;</code>
     */
    APP_CAMPAIGN(12),
    /**
     * <pre>
     * App Campaign for engagement, focused on driving re-engagement with the
     * app across several of Google's top properties including Search, YouTube,
     * and the Google Display Network.
     * </pre>
     *
     * <code>APP_CAMPAIGN_FOR_ENGAGEMENT = 13;</code>
     */
    APP_CAMPAIGN_FOR_ENGAGEMENT(13),
    /**
     * <pre>
     * Campaigns specialized for local advertising.
     * </pre>
     *
     * <code>LOCAL_CAMPAIGN = 14;</code>
     */
    LOCAL_CAMPAIGN(14),
    /**
     * <pre>
     * Shopping Comparison Listing campaigns.
     * </pre>
     *
     * <code>SHOPPING_COMPARISON_LISTING_ADS = 15;</code>
     */
    SHOPPING_COMPARISON_LISTING_ADS(15),
    /**
     * <pre>
     * Standard Smart campaigns.
     * </pre>
     *
     * <code>SMART_CAMPAIGN = 16;</code>
     */
    SMART_CAMPAIGN(16),
    /**
     * <pre>
     * Video campaigns with sequence video ads.
     * </pre>
     *
     * <code>VIDEO_SEQUENCE = 17;</code>
     */
    VIDEO_SEQUENCE(17),
    /**
     * <pre>
     * App Campaign for pre registration, specialized for advertising mobile
     * app pre-registration, that targets multiple advertising channels across
     * Google Play, YouTube and Display Network. See
     * https://support.google.com/google-ads/answer/9441344 to learn more.
     * </pre>
     *
     * <code>APP_CAMPAIGN_FOR_PRE_REGISTRATION = 18;</code>
     */
    APP_CAMPAIGN_FOR_PRE_REGISTRATION(18),
    /**
     * <pre>
     * Video reach campaign with Target Frequency bidding strategy.
     * </pre>
     *
     * <code>VIDEO_REACH_TARGET_FREQUENCY = 19;</code>
     */
    VIDEO_REACH_TARGET_FREQUENCY(19),
    /**
     * <pre>
     * Travel Activities campaigns.
     * </pre>
     *
     * <code>TRAVEL_ACTIVITIES = 20;</code>
     */
    TRAVEL_ACTIVITIES(20),
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
     * Used as a return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Mobile app campaigns for Search.
     * </pre>
     *
     * <code>SEARCH_MOBILE_APP = 2;</code>
     */
    public static final int SEARCH_MOBILE_APP_VALUE = 2;
    /**
     * <pre>
     * Mobile app campaigns for Display.
     * </pre>
     *
     * <code>DISPLAY_MOBILE_APP = 3;</code>
     */
    public static final int DISPLAY_MOBILE_APP_VALUE = 3;
    /**
     * <pre>
     * AdWords express campaigns for search.
     * </pre>
     *
     * <code>SEARCH_EXPRESS = 4;</code>
     */
    public static final int SEARCH_EXPRESS_VALUE = 4;
    /**
     * <pre>
     * AdWords Express campaigns for display.
     * </pre>
     *
     * <code>DISPLAY_EXPRESS = 5;</code>
     */
    public static final int DISPLAY_EXPRESS_VALUE = 5;
    /**
     * <pre>
     * Smart Shopping campaigns.
     * </pre>
     *
     * <code>SHOPPING_SMART_ADS = 6;</code>
     */
    public static final int SHOPPING_SMART_ADS_VALUE = 6;
    /**
     * <pre>
     * Gmail Ad campaigns.
     * </pre>
     *
     * <code>DISPLAY_GMAIL_AD = 7;</code>
     */
    public static final int DISPLAY_GMAIL_AD_VALUE = 7;
    /**
     * <pre>
     * Smart display campaigns. New campaigns of this sub type cannot be
     * created.
     * </pre>
     *
     * <code>DISPLAY_SMART_CAMPAIGN = 8;</code>
     */
    public static final int DISPLAY_SMART_CAMPAIGN_VALUE = 8;
    /**
     * <pre>
     * Video Outstream campaigns.
     * </pre>
     *
     * <code>VIDEO_OUTSTREAM = 9;</code>
     */
    public static final int VIDEO_OUTSTREAM_VALUE = 9;
    /**
     * <pre>
     * Video TrueView for Action campaigns.
     * </pre>
     *
     * <code>VIDEO_ACTION = 10;</code>
     */
    public static final int VIDEO_ACTION_VALUE = 10;
    /**
     * <pre>
     * Video campaigns with non-skippable video ads.
     * </pre>
     *
     * <code>VIDEO_NON_SKIPPABLE = 11;</code>
     */
    public static final int VIDEO_NON_SKIPPABLE_VALUE = 11;
    /**
     * <pre>
     * App Campaign that lets you easily promote your Android or iOS app
     * across Google's top properties including Search, Play, YouTube, and the
     * Google Display Network.
     * </pre>
     *
     * <code>APP_CAMPAIGN = 12;</code>
     */
    public static final int APP_CAMPAIGN_VALUE = 12;
    /**
     * <pre>
     * App Campaign for engagement, focused on driving re-engagement with the
     * app across several of Google's top properties including Search, YouTube,
     * and the Google Display Network.
     * </pre>
     *
     * <code>APP_CAMPAIGN_FOR_ENGAGEMENT = 13;</code>
     */
    public static final int APP_CAMPAIGN_FOR_ENGAGEMENT_VALUE = 13;
    /**
     * <pre>
     * Campaigns specialized for local advertising.
     * </pre>
     *
     * <code>LOCAL_CAMPAIGN = 14;</code>
     */
    public static final int LOCAL_CAMPAIGN_VALUE = 14;
    /**
     * <pre>
     * Shopping Comparison Listing campaigns.
     * </pre>
     *
     * <code>SHOPPING_COMPARISON_LISTING_ADS = 15;</code>
     */
    public static final int SHOPPING_COMPARISON_LISTING_ADS_VALUE = 15;
    /**
     * <pre>
     * Standard Smart campaigns.
     * </pre>
     *
     * <code>SMART_CAMPAIGN = 16;</code>
     */
    public static final int SMART_CAMPAIGN_VALUE = 16;
    /**
     * <pre>
     * Video campaigns with sequence video ads.
     * </pre>
     *
     * <code>VIDEO_SEQUENCE = 17;</code>
     */
    public static final int VIDEO_SEQUENCE_VALUE = 17;
    /**
     * <pre>
     * App Campaign for pre registration, specialized for advertising mobile
     * app pre-registration, that targets multiple advertising channels across
     * Google Play, YouTube and Display Network. See
     * https://support.google.com/google-ads/answer/9441344 to learn more.
     * </pre>
     *
     * <code>APP_CAMPAIGN_FOR_PRE_REGISTRATION = 18;</code>
     */
    public static final int APP_CAMPAIGN_FOR_PRE_REGISTRATION_VALUE = 18;
    /**
     * <pre>
     * Video reach campaign with Target Frequency bidding strategy.
     * </pre>
     *
     * <code>VIDEO_REACH_TARGET_FREQUENCY = 19;</code>
     */
    public static final int VIDEO_REACH_TARGET_FREQUENCY_VALUE = 19;
    /**
     * <pre>
     * Travel Activities campaigns.
     * </pre>
     *
     * <code>TRAVEL_ACTIVITIES = 20;</code>
     */
    public static final int TRAVEL_ACTIVITIES_VALUE = 20;


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
    public static AdvertisingChannelSubType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AdvertisingChannelSubType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return SEARCH_MOBILE_APP;
        case 3: return DISPLAY_MOBILE_APP;
        case 4: return SEARCH_EXPRESS;
        case 5: return DISPLAY_EXPRESS;
        case 6: return SHOPPING_SMART_ADS;
        case 7: return DISPLAY_GMAIL_AD;
        case 8: return DISPLAY_SMART_CAMPAIGN;
        case 9: return VIDEO_OUTSTREAM;
        case 10: return VIDEO_ACTION;
        case 11: return VIDEO_NON_SKIPPABLE;
        case 12: return APP_CAMPAIGN;
        case 13: return APP_CAMPAIGN_FOR_ENGAGEMENT;
        case 14: return LOCAL_CAMPAIGN;
        case 15: return SHOPPING_COMPARISON_LISTING_ADS;
        case 16: return SMART_CAMPAIGN;
        case 17: return VIDEO_SEQUENCE;
        case 18: return APP_CAMPAIGN_FOR_PRE_REGISTRATION;
        case 19: return VIDEO_REACH_TARGET_FREQUENCY;
        case 20: return TRAVEL_ACTIVITIES;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AdvertisingChannelSubType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AdvertisingChannelSubType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AdvertisingChannelSubType>() {
            public AdvertisingChannelSubType findValueByNumber(int number) {
              return AdvertisingChannelSubType.forNumber(number);
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
      return com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AdvertisingChannelSubType[] VALUES = values();

    public static AdvertisingChannelSubType valueOf(
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

    private AdvertisingChannelSubType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum.AdvertisingChannelSubType)
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
    if (!(obj instanceof com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum other = (com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum) obj;

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

  public static com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum prototype) {
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
   * An immutable specialization of an Advertising Channel.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum)
      com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeProto.internal_static_google_ads_googleads_v13_enums_AdvertisingChannelSubTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeProto.internal_static_google_ads_googleads_v13_enums_AdvertisingChannelSubTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum.class, com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeProto.internal_static_google_ads_googleads_v13_enums_AdvertisingChannelSubTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum build() {
      com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum buildPartial() {
      com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum result = new com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum other) {
      if (other == com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum)
  private static final com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum();
  }

  public static com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdvertisingChannelSubTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<AdvertisingChannelSubTypeEnum>() {
    @java.lang.Override
    public AdvertisingChannelSubTypeEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdvertisingChannelSubTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdvertisingChannelSubTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v13.enums.AdvertisingChannelSubTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


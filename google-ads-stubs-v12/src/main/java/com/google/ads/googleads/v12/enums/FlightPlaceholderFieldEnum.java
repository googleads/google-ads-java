// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/enums/flight_placeholder_field.proto

package com.google.ads.googleads.v12.enums;

/**
 * <pre>
 * Values for Flight placeholder fields.
 * For more information about dynamic remarketing feeds, see
 * https://support.google.com/google-ads/answer/6053288.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum}
 */
public final class FlightPlaceholderFieldEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum)
    FlightPlaceholderFieldEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FlightPlaceholderFieldEnum.newBuilder() to construct.
  private FlightPlaceholderFieldEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FlightPlaceholderFieldEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FlightPlaceholderFieldEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.enums.FlightsPlaceholderFieldProto.internal_static_google_ads_googleads_v12_enums_FlightPlaceholderFieldEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.enums.FlightsPlaceholderFieldProto.internal_static_google_ads_googleads_v12_enums_FlightPlaceholderFieldEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum.class, com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum.Builder.class);
  }

  /**
   * <pre>
   * Possible values for Flight placeholder fields.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum.FlightPlaceholderField}
   */
  public enum FlightPlaceholderField
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
     * Data Type: STRING. Required. Destination id. Example: PAR, LON.
     * For feed items that only have destination id, destination id must be a
     * unique key. For feed items that have both destination id and origin id,
     * then the combination must be a unique key.
     * </pre>
     *
     * <code>DESTINATION_ID = 2;</code>
     */
    DESTINATION_ID(2),
    /**
     * <pre>
     * Data Type: STRING. Origin id. Example: PAR, LON.
     * Optional. Combination of destination id and origin id must be unique per
     * offer.
     * </pre>
     *
     * <code>ORIGIN_ID = 3;</code>
     */
    ORIGIN_ID(3),
    /**
     * <pre>
     * Data Type: STRING. Required. Main headline with product name to be shown
     * in dynamic ad.
     * </pre>
     *
     * <code>FLIGHT_DESCRIPTION = 4;</code>
     */
    FLIGHT_DESCRIPTION(4),
    /**
     * <pre>
     * Data Type: STRING. Shorter names are recommended.
     * </pre>
     *
     * <code>ORIGIN_NAME = 5;</code>
     */
    ORIGIN_NAME(5),
    /**
     * <pre>
     * Data Type: STRING. Shorter names are recommended.
     * </pre>
     *
     * <code>DESTINATION_NAME = 6;</code>
     */
    DESTINATION_NAME(6),
    /**
     * <pre>
     * Data Type: STRING. Price to be shown in the ad.
     * Example: "100.00 USD"
     * </pre>
     *
     * <code>FLIGHT_PRICE = 7;</code>
     */
    FLIGHT_PRICE(7),
    /**
     * <pre>
     * Data Type: STRING. Formatted price to be shown in the ad.
     * Example: "Starting at $100.00 USD", "$80 - $100"
     * </pre>
     *
     * <code>FORMATTED_PRICE = 8;</code>
     */
    FORMATTED_PRICE(8),
    /**
     * <pre>
     * Data Type: STRING. Sale price to be shown in the ad.
     * Example: "80.00 USD"
     * </pre>
     *
     * <code>FLIGHT_SALE_PRICE = 9;</code>
     */
    FLIGHT_SALE_PRICE(9),
    /**
     * <pre>
     * Data Type: STRING. Formatted sale price to be shown in the ad.
     * Example: "On sale for $80.00", "$60 - $80"
     * </pre>
     *
     * <code>FORMATTED_SALE_PRICE = 10;</code>
     */
    FORMATTED_SALE_PRICE(10),
    /**
     * <pre>
     * Data Type: URL. Image to be displayed in the ad.
     * </pre>
     *
     * <code>IMAGE_URL = 11;</code>
     */
    IMAGE_URL(11),
    /**
     * <pre>
     * Data Type: URL_LIST. Required. Final URLs for the ad when using Upgraded
     * URLs. User will be redirected to these URLs when they click on an ad, or
     * when they click on a specific flight for ads that show multiple
     * flights.
     * </pre>
     *
     * <code>FINAL_URLS = 12;</code>
     */
    FINAL_URLS(12),
    /**
     * <pre>
     * Data Type: URL_LIST. Final mobile URLs for the ad when using Upgraded
     * URLs.
     * </pre>
     *
     * <code>FINAL_MOBILE_URLS = 13;</code>
     */
    FINAL_MOBILE_URLS(13),
    /**
     * <pre>
     * Data Type: URL. Tracking template for the ad when using Upgraded URLs.
     * </pre>
     *
     * <code>TRACKING_URL = 14;</code>
     */
    TRACKING_URL(14),
    /**
     * <pre>
     * Data Type: STRING. Android app link. Must be formatted as:
     * android-app://{package_id}/{scheme}/{host_path}.
     * The components are defined as follows:
     * package_id: app ID as specified in Google Play.
     * scheme: the scheme to pass to the application. Can be HTTP, or a custom
     *   scheme.
     * host_path: identifies the specific content within your application.
     * </pre>
     *
     * <code>ANDROID_APP_LINK = 15;</code>
     */
    ANDROID_APP_LINK(15),
    /**
     * <pre>
     * Data Type: STRING_LIST. List of recommended destination IDs to show
     * together with this item.
     * </pre>
     *
     * <code>SIMILAR_DESTINATION_IDS = 16;</code>
     */
    SIMILAR_DESTINATION_IDS(16),
    /**
     * <pre>
     * Data Type: STRING. iOS app link.
     * </pre>
     *
     * <code>IOS_APP_LINK = 17;</code>
     */
    IOS_APP_LINK(17),
    /**
     * <pre>
     * Data Type: INT64. iOS app store ID.
     * </pre>
     *
     * <code>IOS_APP_STORE_ID = 18;</code>
     */
    IOS_APP_STORE_ID(18),
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
     * Data Type: STRING. Required. Destination id. Example: PAR, LON.
     * For feed items that only have destination id, destination id must be a
     * unique key. For feed items that have both destination id and origin id,
     * then the combination must be a unique key.
     * </pre>
     *
     * <code>DESTINATION_ID = 2;</code>
     */
    public static final int DESTINATION_ID_VALUE = 2;
    /**
     * <pre>
     * Data Type: STRING. Origin id. Example: PAR, LON.
     * Optional. Combination of destination id and origin id must be unique per
     * offer.
     * </pre>
     *
     * <code>ORIGIN_ID = 3;</code>
     */
    public static final int ORIGIN_ID_VALUE = 3;
    /**
     * <pre>
     * Data Type: STRING. Required. Main headline with product name to be shown
     * in dynamic ad.
     * </pre>
     *
     * <code>FLIGHT_DESCRIPTION = 4;</code>
     */
    public static final int FLIGHT_DESCRIPTION_VALUE = 4;
    /**
     * <pre>
     * Data Type: STRING. Shorter names are recommended.
     * </pre>
     *
     * <code>ORIGIN_NAME = 5;</code>
     */
    public static final int ORIGIN_NAME_VALUE = 5;
    /**
     * <pre>
     * Data Type: STRING. Shorter names are recommended.
     * </pre>
     *
     * <code>DESTINATION_NAME = 6;</code>
     */
    public static final int DESTINATION_NAME_VALUE = 6;
    /**
     * <pre>
     * Data Type: STRING. Price to be shown in the ad.
     * Example: "100.00 USD"
     * </pre>
     *
     * <code>FLIGHT_PRICE = 7;</code>
     */
    public static final int FLIGHT_PRICE_VALUE = 7;
    /**
     * <pre>
     * Data Type: STRING. Formatted price to be shown in the ad.
     * Example: "Starting at $100.00 USD", "$80 - $100"
     * </pre>
     *
     * <code>FORMATTED_PRICE = 8;</code>
     */
    public static final int FORMATTED_PRICE_VALUE = 8;
    /**
     * <pre>
     * Data Type: STRING. Sale price to be shown in the ad.
     * Example: "80.00 USD"
     * </pre>
     *
     * <code>FLIGHT_SALE_PRICE = 9;</code>
     */
    public static final int FLIGHT_SALE_PRICE_VALUE = 9;
    /**
     * <pre>
     * Data Type: STRING. Formatted sale price to be shown in the ad.
     * Example: "On sale for $80.00", "$60 - $80"
     * </pre>
     *
     * <code>FORMATTED_SALE_PRICE = 10;</code>
     */
    public static final int FORMATTED_SALE_PRICE_VALUE = 10;
    /**
     * <pre>
     * Data Type: URL. Image to be displayed in the ad.
     * </pre>
     *
     * <code>IMAGE_URL = 11;</code>
     */
    public static final int IMAGE_URL_VALUE = 11;
    /**
     * <pre>
     * Data Type: URL_LIST. Required. Final URLs for the ad when using Upgraded
     * URLs. User will be redirected to these URLs when they click on an ad, or
     * when they click on a specific flight for ads that show multiple
     * flights.
     * </pre>
     *
     * <code>FINAL_URLS = 12;</code>
     */
    public static final int FINAL_URLS_VALUE = 12;
    /**
     * <pre>
     * Data Type: URL_LIST. Final mobile URLs for the ad when using Upgraded
     * URLs.
     * </pre>
     *
     * <code>FINAL_MOBILE_URLS = 13;</code>
     */
    public static final int FINAL_MOBILE_URLS_VALUE = 13;
    /**
     * <pre>
     * Data Type: URL. Tracking template for the ad when using Upgraded URLs.
     * </pre>
     *
     * <code>TRACKING_URL = 14;</code>
     */
    public static final int TRACKING_URL_VALUE = 14;
    /**
     * <pre>
     * Data Type: STRING. Android app link. Must be formatted as:
     * android-app://{package_id}/{scheme}/{host_path}.
     * The components are defined as follows:
     * package_id: app ID as specified in Google Play.
     * scheme: the scheme to pass to the application. Can be HTTP, or a custom
     *   scheme.
     * host_path: identifies the specific content within your application.
     * </pre>
     *
     * <code>ANDROID_APP_LINK = 15;</code>
     */
    public static final int ANDROID_APP_LINK_VALUE = 15;
    /**
     * <pre>
     * Data Type: STRING_LIST. List of recommended destination IDs to show
     * together with this item.
     * </pre>
     *
     * <code>SIMILAR_DESTINATION_IDS = 16;</code>
     */
    public static final int SIMILAR_DESTINATION_IDS_VALUE = 16;
    /**
     * <pre>
     * Data Type: STRING. iOS app link.
     * </pre>
     *
     * <code>IOS_APP_LINK = 17;</code>
     */
    public static final int IOS_APP_LINK_VALUE = 17;
    /**
     * <pre>
     * Data Type: INT64. iOS app store ID.
     * </pre>
     *
     * <code>IOS_APP_STORE_ID = 18;</code>
     */
    public static final int IOS_APP_STORE_ID_VALUE = 18;


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
    public static FlightPlaceholderField valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FlightPlaceholderField forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return DESTINATION_ID;
        case 3: return ORIGIN_ID;
        case 4: return FLIGHT_DESCRIPTION;
        case 5: return ORIGIN_NAME;
        case 6: return DESTINATION_NAME;
        case 7: return FLIGHT_PRICE;
        case 8: return FORMATTED_PRICE;
        case 9: return FLIGHT_SALE_PRICE;
        case 10: return FORMATTED_SALE_PRICE;
        case 11: return IMAGE_URL;
        case 12: return FINAL_URLS;
        case 13: return FINAL_MOBILE_URLS;
        case 14: return TRACKING_URL;
        case 15: return ANDROID_APP_LINK;
        case 16: return SIMILAR_DESTINATION_IDS;
        case 17: return IOS_APP_LINK;
        case 18: return IOS_APP_STORE_ID;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FlightPlaceholderField>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FlightPlaceholderField> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FlightPlaceholderField>() {
            public FlightPlaceholderField findValueByNumber(int number) {
              return FlightPlaceholderField.forNumber(number);
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
      return com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final FlightPlaceholderField[] VALUES = values();

    public static FlightPlaceholderField valueOf(
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

    private FlightPlaceholderField(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum.FlightPlaceholderField)
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
    if (!(obj instanceof com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum other = (com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum) obj;

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

  public static com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum prototype) {
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
   * Values for Flight placeholder fields.
   * For more information about dynamic remarketing feeds, see
   * https://support.google.com/google-ads/answer/6053288.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum)
      com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.enums.FlightsPlaceholderFieldProto.internal_static_google_ads_googleads_v12_enums_FlightPlaceholderFieldEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.enums.FlightsPlaceholderFieldProto.internal_static_google_ads_googleads_v12_enums_FlightPlaceholderFieldEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum.class, com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum.newBuilder()
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
      return com.google.ads.googleads.v12.enums.FlightsPlaceholderFieldProto.internal_static_google_ads_googleads_v12_enums_FlightPlaceholderFieldEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum build() {
      com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum buildPartial() {
      com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum result = new com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum(this);
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
      if (other instanceof com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum) {
        return mergeFrom((com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum other) {
      if (other == com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum)
  private static final com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum();
  }

  public static com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FlightPlaceholderFieldEnum>
      PARSER = new com.google.protobuf.AbstractParser<FlightPlaceholderFieldEnum>() {
    @java.lang.Override
    public FlightPlaceholderFieldEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<FlightPlaceholderFieldEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FlightPlaceholderFieldEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.enums.FlightPlaceholderFieldEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


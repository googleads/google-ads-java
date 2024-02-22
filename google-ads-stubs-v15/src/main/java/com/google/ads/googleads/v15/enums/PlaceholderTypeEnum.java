// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/enums/placeholder_type.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.enums;

/**
 * <pre>
 * Container for enum describing possible placeholder types for a feed mapping.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.enums.PlaceholderTypeEnum}
 */
public final class PlaceholderTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.enums.PlaceholderTypeEnum)
    PlaceholderTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PlaceholderTypeEnum.newBuilder() to construct.
  private PlaceholderTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PlaceholderTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PlaceholderTypeEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.enums.PlaceholderTypeProto.internal_static_google_ads_googleads_v15_enums_PlaceholderTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.enums.PlaceholderTypeProto.internal_static_google_ads_googleads_v15_enums_PlaceholderTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.enums.PlaceholderTypeEnum.class, com.google.ads.googleads.v15.enums.PlaceholderTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Possible placeholder types for a feed mapping.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v15.enums.PlaceholderTypeEnum.PlaceholderType}
   */
  public enum PlaceholderType
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
     * Lets you show links in your ad to pages from your website, including the
     * main landing page.
     * </pre>
     *
     * <code>SITELINK = 2;</code>
     */
    SITELINK(2),
    /**
     * <pre>
     * Lets you attach a phone number to an ad, allowing customers to call
     * directly from the ad.
     * </pre>
     *
     * <code>CALL = 3;</code>
     */
    CALL(3),
    /**
     * <pre>
     * Lets you provide users with a link that points to a mobile app in
     * addition to a website.
     * </pre>
     *
     * <code>APP = 4;</code>
     */
    APP(4),
    /**
     * <pre>
     * Lets you show locations of businesses from your Business Profile
     * in your ad. This helps people find your locations by showing your
     * ads with your address, a map to your location, or the distance to your
     * business. This extension type is useful to draw customers to your
     * brick-and-mortar location.
     * </pre>
     *
     * <code>LOCATION = 5;</code>
     */
    LOCATION(5),
    /**
     * <pre>
     * If you sell your product through retail chains, affiliate location
     * extensions let you show nearby stores that carry your products.
     * </pre>
     *
     * <code>AFFILIATE_LOCATION = 6;</code>
     */
    AFFILIATE_LOCATION(6),
    /**
     * <pre>
     * Lets you include additional text with your search ads that provide
     * detailed information about your business, including products and services
     * you offer. Callouts appear in ads at the top and bottom of Google search
     * results.
     * </pre>
     *
     * <code>CALLOUT = 7;</code>
     */
    CALLOUT(7),
    /**
     * <pre>
     * Lets you add more info to your ad, specific to some predefined categories
     * such as types, brands, styles, etc. A minimum of 3 text (SNIPPETS) values
     * are required.
     * </pre>
     *
     * <code>STRUCTURED_SNIPPET = 8;</code>
     */
    STRUCTURED_SNIPPET(8),
    /**
     * <pre>
     * Allows users to see your ad, click an icon, and contact you directly by
     * text message. With one tap on your ad, people can contact you to book an
     * appointment, get a quote, ask for information, or request a service.
     * </pre>
     *
     * <code>MESSAGE = 9;</code>
     */
    MESSAGE(9),
    /**
     * <pre>
     * Lets you display prices for a list of items along with your ads. A price
     * feed is composed of three to eight price table rows.
     * </pre>
     *
     * <code>PRICE = 10;</code>
     */
    PRICE(10),
    /**
     * <pre>
     * Lets you highlight sales and other promotions that let users see how
     * they can save by buying now.
     * </pre>
     *
     * <code>PROMOTION = 11;</code>
     */
    PROMOTION(11),
    /**
     * <pre>
     * Lets you dynamically inject custom data into the title and description
     * of your ads.
     * </pre>
     *
     * <code>AD_CUSTOMIZER = 12;</code>
     */
    AD_CUSTOMIZER(12),
    /**
     * <pre>
     * Indicates that this feed is for education dynamic remarketing.
     * </pre>
     *
     * <code>DYNAMIC_EDUCATION = 13;</code>
     */
    DYNAMIC_EDUCATION(13),
    /**
     * <pre>
     * Indicates that this feed is for flight dynamic remarketing.
     * </pre>
     *
     * <code>DYNAMIC_FLIGHT = 14;</code>
     */
    DYNAMIC_FLIGHT(14),
    /**
     * <pre>
     * Indicates that this feed is for a custom dynamic remarketing type. Use
     * this only if the other business types don't apply to your products or
     * services.
     * </pre>
     *
     * <code>DYNAMIC_CUSTOM = 15;</code>
     */
    DYNAMIC_CUSTOM(15),
    /**
     * <pre>
     * Indicates that this feed is for hotels and rentals dynamic remarketing.
     * </pre>
     *
     * <code>DYNAMIC_HOTEL = 16;</code>
     */
    DYNAMIC_HOTEL(16),
    /**
     * <pre>
     * Indicates that this feed is for real estate dynamic remarketing.
     * </pre>
     *
     * <code>DYNAMIC_REAL_ESTATE = 17;</code>
     */
    DYNAMIC_REAL_ESTATE(17),
    /**
     * <pre>
     * Indicates that this feed is for travel dynamic remarketing.
     * </pre>
     *
     * <code>DYNAMIC_TRAVEL = 18;</code>
     */
    DYNAMIC_TRAVEL(18),
    /**
     * <pre>
     * Indicates that this feed is for local deals dynamic remarketing.
     * </pre>
     *
     * <code>DYNAMIC_LOCAL = 19;</code>
     */
    DYNAMIC_LOCAL(19),
    /**
     * <pre>
     * Indicates that this feed is for job dynamic remarketing.
     * </pre>
     *
     * <code>DYNAMIC_JOB = 20;</code>
     */
    DYNAMIC_JOB(20),
    /**
     * <pre>
     * Lets you attach an image to an ad.
     * </pre>
     *
     * <code>IMAGE = 21;</code>
     */
    IMAGE(21),
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
     * Lets you show links in your ad to pages from your website, including the
     * main landing page.
     * </pre>
     *
     * <code>SITELINK = 2;</code>
     */
    public static final int SITELINK_VALUE = 2;
    /**
     * <pre>
     * Lets you attach a phone number to an ad, allowing customers to call
     * directly from the ad.
     * </pre>
     *
     * <code>CALL = 3;</code>
     */
    public static final int CALL_VALUE = 3;
    /**
     * <pre>
     * Lets you provide users with a link that points to a mobile app in
     * addition to a website.
     * </pre>
     *
     * <code>APP = 4;</code>
     */
    public static final int APP_VALUE = 4;
    /**
     * <pre>
     * Lets you show locations of businesses from your Business Profile
     * in your ad. This helps people find your locations by showing your
     * ads with your address, a map to your location, or the distance to your
     * business. This extension type is useful to draw customers to your
     * brick-and-mortar location.
     * </pre>
     *
     * <code>LOCATION = 5;</code>
     */
    public static final int LOCATION_VALUE = 5;
    /**
     * <pre>
     * If you sell your product through retail chains, affiliate location
     * extensions let you show nearby stores that carry your products.
     * </pre>
     *
     * <code>AFFILIATE_LOCATION = 6;</code>
     */
    public static final int AFFILIATE_LOCATION_VALUE = 6;
    /**
     * <pre>
     * Lets you include additional text with your search ads that provide
     * detailed information about your business, including products and services
     * you offer. Callouts appear in ads at the top and bottom of Google search
     * results.
     * </pre>
     *
     * <code>CALLOUT = 7;</code>
     */
    public static final int CALLOUT_VALUE = 7;
    /**
     * <pre>
     * Lets you add more info to your ad, specific to some predefined categories
     * such as types, brands, styles, etc. A minimum of 3 text (SNIPPETS) values
     * are required.
     * </pre>
     *
     * <code>STRUCTURED_SNIPPET = 8;</code>
     */
    public static final int STRUCTURED_SNIPPET_VALUE = 8;
    /**
     * <pre>
     * Allows users to see your ad, click an icon, and contact you directly by
     * text message. With one tap on your ad, people can contact you to book an
     * appointment, get a quote, ask for information, or request a service.
     * </pre>
     *
     * <code>MESSAGE = 9;</code>
     */
    public static final int MESSAGE_VALUE = 9;
    /**
     * <pre>
     * Lets you display prices for a list of items along with your ads. A price
     * feed is composed of three to eight price table rows.
     * </pre>
     *
     * <code>PRICE = 10;</code>
     */
    public static final int PRICE_VALUE = 10;
    /**
     * <pre>
     * Lets you highlight sales and other promotions that let users see how
     * they can save by buying now.
     * </pre>
     *
     * <code>PROMOTION = 11;</code>
     */
    public static final int PROMOTION_VALUE = 11;
    /**
     * <pre>
     * Lets you dynamically inject custom data into the title and description
     * of your ads.
     * </pre>
     *
     * <code>AD_CUSTOMIZER = 12;</code>
     */
    public static final int AD_CUSTOMIZER_VALUE = 12;
    /**
     * <pre>
     * Indicates that this feed is for education dynamic remarketing.
     * </pre>
     *
     * <code>DYNAMIC_EDUCATION = 13;</code>
     */
    public static final int DYNAMIC_EDUCATION_VALUE = 13;
    /**
     * <pre>
     * Indicates that this feed is for flight dynamic remarketing.
     * </pre>
     *
     * <code>DYNAMIC_FLIGHT = 14;</code>
     */
    public static final int DYNAMIC_FLIGHT_VALUE = 14;
    /**
     * <pre>
     * Indicates that this feed is for a custom dynamic remarketing type. Use
     * this only if the other business types don't apply to your products or
     * services.
     * </pre>
     *
     * <code>DYNAMIC_CUSTOM = 15;</code>
     */
    public static final int DYNAMIC_CUSTOM_VALUE = 15;
    /**
     * <pre>
     * Indicates that this feed is for hotels and rentals dynamic remarketing.
     * </pre>
     *
     * <code>DYNAMIC_HOTEL = 16;</code>
     */
    public static final int DYNAMIC_HOTEL_VALUE = 16;
    /**
     * <pre>
     * Indicates that this feed is for real estate dynamic remarketing.
     * </pre>
     *
     * <code>DYNAMIC_REAL_ESTATE = 17;</code>
     */
    public static final int DYNAMIC_REAL_ESTATE_VALUE = 17;
    /**
     * <pre>
     * Indicates that this feed is for travel dynamic remarketing.
     * </pre>
     *
     * <code>DYNAMIC_TRAVEL = 18;</code>
     */
    public static final int DYNAMIC_TRAVEL_VALUE = 18;
    /**
     * <pre>
     * Indicates that this feed is for local deals dynamic remarketing.
     * </pre>
     *
     * <code>DYNAMIC_LOCAL = 19;</code>
     */
    public static final int DYNAMIC_LOCAL_VALUE = 19;
    /**
     * <pre>
     * Indicates that this feed is for job dynamic remarketing.
     * </pre>
     *
     * <code>DYNAMIC_JOB = 20;</code>
     */
    public static final int DYNAMIC_JOB_VALUE = 20;
    /**
     * <pre>
     * Lets you attach an image to an ad.
     * </pre>
     *
     * <code>IMAGE = 21;</code>
     */
    public static final int IMAGE_VALUE = 21;


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
    public static PlaceholderType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PlaceholderType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return SITELINK;
        case 3: return CALL;
        case 4: return APP;
        case 5: return LOCATION;
        case 6: return AFFILIATE_LOCATION;
        case 7: return CALLOUT;
        case 8: return STRUCTURED_SNIPPET;
        case 9: return MESSAGE;
        case 10: return PRICE;
        case 11: return PROMOTION;
        case 12: return AD_CUSTOMIZER;
        case 13: return DYNAMIC_EDUCATION;
        case 14: return DYNAMIC_FLIGHT;
        case 15: return DYNAMIC_CUSTOM;
        case 16: return DYNAMIC_HOTEL;
        case 17: return DYNAMIC_REAL_ESTATE;
        case 18: return DYNAMIC_TRAVEL;
        case 19: return DYNAMIC_LOCAL;
        case 20: return DYNAMIC_JOB;
        case 21: return IMAGE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PlaceholderType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PlaceholderType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PlaceholderType>() {
            public PlaceholderType findValueByNumber(int number) {
              return PlaceholderType.forNumber(number);
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
      return com.google.ads.googleads.v15.enums.PlaceholderTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final PlaceholderType[] VALUES = values();

    public static PlaceholderType valueOf(
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

    private PlaceholderType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v15.enums.PlaceholderTypeEnum.PlaceholderType)
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
    if (!(obj instanceof com.google.ads.googleads.v15.enums.PlaceholderTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.enums.PlaceholderTypeEnum other = (com.google.ads.googleads.v15.enums.PlaceholderTypeEnum) obj;

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

  public static com.google.ads.googleads.v15.enums.PlaceholderTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.enums.PlaceholderTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.PlaceholderTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.enums.PlaceholderTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.PlaceholderTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.enums.PlaceholderTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.PlaceholderTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.enums.PlaceholderTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.enums.PlaceholderTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.enums.PlaceholderTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.enums.PlaceholderTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.enums.PlaceholderTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.enums.PlaceholderTypeEnum prototype) {
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
   * Container for enum describing possible placeholder types for a feed mapping.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.enums.PlaceholderTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.enums.PlaceholderTypeEnum)
      com.google.ads.googleads.v15.enums.PlaceholderTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.enums.PlaceholderTypeProto.internal_static_google_ads_googleads_v15_enums_PlaceholderTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.enums.PlaceholderTypeProto.internal_static_google_ads_googleads_v15_enums_PlaceholderTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.enums.PlaceholderTypeEnum.class, com.google.ads.googleads.v15.enums.PlaceholderTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.enums.PlaceholderTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v15.enums.PlaceholderTypeProto.internal_static_google_ads_googleads_v15_enums_PlaceholderTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.enums.PlaceholderTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.enums.PlaceholderTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.enums.PlaceholderTypeEnum build() {
      com.google.ads.googleads.v15.enums.PlaceholderTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.enums.PlaceholderTypeEnum buildPartial() {
      com.google.ads.googleads.v15.enums.PlaceholderTypeEnum result = new com.google.ads.googleads.v15.enums.PlaceholderTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v15.enums.PlaceholderTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v15.enums.PlaceholderTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.enums.PlaceholderTypeEnum other) {
      if (other == com.google.ads.googleads.v15.enums.PlaceholderTypeEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.enums.PlaceholderTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.enums.PlaceholderTypeEnum)
  private static final com.google.ads.googleads.v15.enums.PlaceholderTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.enums.PlaceholderTypeEnum();
  }

  public static com.google.ads.googleads.v15.enums.PlaceholderTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PlaceholderTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<PlaceholderTypeEnum>() {
    @java.lang.Override
    public PlaceholderTypeEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<PlaceholderTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PlaceholderTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.enums.PlaceholderTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


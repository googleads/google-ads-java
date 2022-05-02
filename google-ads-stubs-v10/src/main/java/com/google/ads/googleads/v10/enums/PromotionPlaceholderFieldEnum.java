// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/enums/promotion_placeholder_field.proto

package com.google.ads.googleads.v10.enums;

/**
 * <pre>
 * Values for Promotion placeholder fields.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum}
 */
public final class PromotionPlaceholderFieldEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum)
    PromotionPlaceholderFieldEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PromotionPlaceholderFieldEnum.newBuilder() to construct.
  private PromotionPlaceholderFieldEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PromotionPlaceholderFieldEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PromotionPlaceholderFieldEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PromotionPlaceholderFieldEnum(
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
    return com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldProto.internal_static_google_ads_googleads_v10_enums_PromotionPlaceholderFieldEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldProto.internal_static_google_ads_googleads_v10_enums_PromotionPlaceholderFieldEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum.class, com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum.Builder.class);
  }

  /**
   * <pre>
   * Possible values for Promotion placeholder fields.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum.PromotionPlaceholderField}
   */
  public enum PromotionPlaceholderField
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
     * Data Type: STRING. The text that appears on the ad when the extension is
     * shown.
     * </pre>
     *
     * <code>PROMOTION_TARGET = 2;</code>
     */
    PROMOTION_TARGET(2),
    /**
     * <pre>
     * Data Type: STRING. Allows you to add "up to" phrase to the promotion,
     * in case you have variable promotion rates.
     * </pre>
     *
     * <code>DISCOUNT_MODIFIER = 3;</code>
     */
    DISCOUNT_MODIFIER(3),
    /**
     * <pre>
     * Data Type: INT64. Takes a value in micros, where 1 million micros
     * represents 1%, and is shown as a percentage when rendered.
     * </pre>
     *
     * <code>PERCENT_OFF = 4;</code>
     */
    PERCENT_OFF(4),
    /**
     * <pre>
     * Data Type: MONEY. Requires a currency and an amount of money.
     * </pre>
     *
     * <code>MONEY_AMOUNT_OFF = 5;</code>
     */
    MONEY_AMOUNT_OFF(5),
    /**
     * <pre>
     * Data Type: STRING. A string that the user enters to get the discount.
     * </pre>
     *
     * <code>PROMOTION_CODE = 6;</code>
     */
    PROMOTION_CODE(6),
    /**
     * <pre>
     * Data Type: MONEY. A minimum spend before the user qualifies for the
     * promotion.
     * </pre>
     *
     * <code>ORDERS_OVER_AMOUNT = 7;</code>
     */
    ORDERS_OVER_AMOUNT(7),
    /**
     * <pre>
     * Data Type: DATE. The start date of the promotion.
     * </pre>
     *
     * <code>PROMOTION_START = 8;</code>
     */
    PROMOTION_START(8),
    /**
     * <pre>
     * Data Type: DATE. The end date of the promotion.
     * </pre>
     *
     * <code>PROMOTION_END = 9;</code>
     */
    PROMOTION_END(9),
    /**
     * <pre>
     * Data Type: STRING. Describes the associated event for the promotion using
     * one of the PromotionExtensionOccasion enum values, for example NEW_YEARS.
     * </pre>
     *
     * <code>OCCASION = 10;</code>
     */
    OCCASION(10),
    /**
     * <pre>
     * Data Type: URL_LIST. Final URLs to be used in the ad when using Upgraded
     * URLs.
     * </pre>
     *
     * <code>FINAL_URLS = 11;</code>
     */
    FINAL_URLS(11),
    /**
     * <pre>
     * Data Type: URL_LIST. Final mobile URLs for the ad when using Upgraded
     * URLs.
     * </pre>
     *
     * <code>FINAL_MOBILE_URLS = 12;</code>
     */
    FINAL_MOBILE_URLS(12),
    /**
     * <pre>
     * Data Type: URL. Tracking template for the ad when using Upgraded URLs.
     * </pre>
     *
     * <code>TRACKING_URL = 13;</code>
     */
    TRACKING_URL(13),
    /**
     * <pre>
     * Data Type: STRING. A string represented by a language code for the
     * promotion.
     * </pre>
     *
     * <code>LANGUAGE = 14;</code>
     */
    LANGUAGE(14),
    /**
     * <pre>
     * Data Type: STRING. Final URL suffix for the ad when using parallel
     * tracking.
     * </pre>
     *
     * <code>FINAL_URL_SUFFIX = 15;</code>
     */
    FINAL_URL_SUFFIX(15),
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
     * Data Type: STRING. The text that appears on the ad when the extension is
     * shown.
     * </pre>
     *
     * <code>PROMOTION_TARGET = 2;</code>
     */
    public static final int PROMOTION_TARGET_VALUE = 2;
    /**
     * <pre>
     * Data Type: STRING. Allows you to add "up to" phrase to the promotion,
     * in case you have variable promotion rates.
     * </pre>
     *
     * <code>DISCOUNT_MODIFIER = 3;</code>
     */
    public static final int DISCOUNT_MODIFIER_VALUE = 3;
    /**
     * <pre>
     * Data Type: INT64. Takes a value in micros, where 1 million micros
     * represents 1%, and is shown as a percentage when rendered.
     * </pre>
     *
     * <code>PERCENT_OFF = 4;</code>
     */
    public static final int PERCENT_OFF_VALUE = 4;
    /**
     * <pre>
     * Data Type: MONEY. Requires a currency and an amount of money.
     * </pre>
     *
     * <code>MONEY_AMOUNT_OFF = 5;</code>
     */
    public static final int MONEY_AMOUNT_OFF_VALUE = 5;
    /**
     * <pre>
     * Data Type: STRING. A string that the user enters to get the discount.
     * </pre>
     *
     * <code>PROMOTION_CODE = 6;</code>
     */
    public static final int PROMOTION_CODE_VALUE = 6;
    /**
     * <pre>
     * Data Type: MONEY. A minimum spend before the user qualifies for the
     * promotion.
     * </pre>
     *
     * <code>ORDERS_OVER_AMOUNT = 7;</code>
     */
    public static final int ORDERS_OVER_AMOUNT_VALUE = 7;
    /**
     * <pre>
     * Data Type: DATE. The start date of the promotion.
     * </pre>
     *
     * <code>PROMOTION_START = 8;</code>
     */
    public static final int PROMOTION_START_VALUE = 8;
    /**
     * <pre>
     * Data Type: DATE. The end date of the promotion.
     * </pre>
     *
     * <code>PROMOTION_END = 9;</code>
     */
    public static final int PROMOTION_END_VALUE = 9;
    /**
     * <pre>
     * Data Type: STRING. Describes the associated event for the promotion using
     * one of the PromotionExtensionOccasion enum values, for example NEW_YEARS.
     * </pre>
     *
     * <code>OCCASION = 10;</code>
     */
    public static final int OCCASION_VALUE = 10;
    /**
     * <pre>
     * Data Type: URL_LIST. Final URLs to be used in the ad when using Upgraded
     * URLs.
     * </pre>
     *
     * <code>FINAL_URLS = 11;</code>
     */
    public static final int FINAL_URLS_VALUE = 11;
    /**
     * <pre>
     * Data Type: URL_LIST. Final mobile URLs for the ad when using Upgraded
     * URLs.
     * </pre>
     *
     * <code>FINAL_MOBILE_URLS = 12;</code>
     */
    public static final int FINAL_MOBILE_URLS_VALUE = 12;
    /**
     * <pre>
     * Data Type: URL. Tracking template for the ad when using Upgraded URLs.
     * </pre>
     *
     * <code>TRACKING_URL = 13;</code>
     */
    public static final int TRACKING_URL_VALUE = 13;
    /**
     * <pre>
     * Data Type: STRING. A string represented by a language code for the
     * promotion.
     * </pre>
     *
     * <code>LANGUAGE = 14;</code>
     */
    public static final int LANGUAGE_VALUE = 14;
    /**
     * <pre>
     * Data Type: STRING. Final URL suffix for the ad when using parallel
     * tracking.
     * </pre>
     *
     * <code>FINAL_URL_SUFFIX = 15;</code>
     */
    public static final int FINAL_URL_SUFFIX_VALUE = 15;


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
    public static PromotionPlaceholderField valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PromotionPlaceholderField forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return PROMOTION_TARGET;
        case 3: return DISCOUNT_MODIFIER;
        case 4: return PERCENT_OFF;
        case 5: return MONEY_AMOUNT_OFF;
        case 6: return PROMOTION_CODE;
        case 7: return ORDERS_OVER_AMOUNT;
        case 8: return PROMOTION_START;
        case 9: return PROMOTION_END;
        case 10: return OCCASION;
        case 11: return FINAL_URLS;
        case 12: return FINAL_MOBILE_URLS;
        case 13: return TRACKING_URL;
        case 14: return LANGUAGE;
        case 15: return FINAL_URL_SUFFIX;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PromotionPlaceholderField>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PromotionPlaceholderField> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PromotionPlaceholderField>() {
            public PromotionPlaceholderField findValueByNumber(int number) {
              return PromotionPlaceholderField.forNumber(number);
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
      return com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final PromotionPlaceholderField[] VALUES = values();

    public static PromotionPlaceholderField valueOf(
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

    private PromotionPlaceholderField(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum.PromotionPlaceholderField)
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
    if (!(obj instanceof com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum other = (com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum) obj;

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

  public static com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum prototype) {
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
   * Values for Promotion placeholder fields.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum)
      com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldProto.internal_static_google_ads_googleads_v10_enums_PromotionPlaceholderFieldEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldProto.internal_static_google_ads_googleads_v10_enums_PromotionPlaceholderFieldEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum.class, com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum.newBuilder()
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
      return com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldProto.internal_static_google_ads_googleads_v10_enums_PromotionPlaceholderFieldEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum build() {
      com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum buildPartial() {
      com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum result = new com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum(this);
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
      if (other instanceof com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum) {
        return mergeFrom((com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum other) {
      if (other == com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum)
  private static final com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum();
  }

  public static com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PromotionPlaceholderFieldEnum>
      PARSER = new com.google.protobuf.AbstractParser<PromotionPlaceholderFieldEnum>() {
    @java.lang.Override
    public PromotionPlaceholderFieldEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PromotionPlaceholderFieldEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PromotionPlaceholderFieldEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PromotionPlaceholderFieldEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.enums.PromotionPlaceholderFieldEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/enums/user_interest_taxonomy_type.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.enums;

/**
 * <pre>
 * Message describing a UserInterestTaxonomyType.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum}
 */
public final class UserInterestTaxonomyTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum)
    UserInterestTaxonomyTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserInterestTaxonomyTypeEnum.newBuilder() to construct.
  private UserInterestTaxonomyTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserInterestTaxonomyTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserInterestTaxonomyTypeEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeProto.internal_static_google_ads_googleads_v16_enums_UserInterestTaxonomyTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeProto.internal_static_google_ads_googleads_v16_enums_UserInterestTaxonomyTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum.class, com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum containing the possible UserInterestTaxonomyTypes.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum.UserInterestTaxonomyType}
   */
  public enum UserInterestTaxonomyType
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
     * The affinity for this user interest.
     * </pre>
     *
     * <code>AFFINITY = 2;</code>
     */
    AFFINITY(2),
    /**
     * <pre>
     * The market for this user interest.
     * </pre>
     *
     * <code>IN_MARKET = 3;</code>
     */
    IN_MARKET(3),
    /**
     * <pre>
     * Users known to have installed applications in the specified categories.
     * </pre>
     *
     * <code>MOBILE_APP_INSTALL_USER = 4;</code>
     */
    MOBILE_APP_INSTALL_USER(4),
    /**
     * <pre>
     * The geographical location of the interest-based vertical.
     * </pre>
     *
     * <code>VERTICAL_GEO = 5;</code>
     */
    VERTICAL_GEO(5),
    /**
     * <pre>
     * User interest criteria for new smart phone users.
     * </pre>
     *
     * <code>NEW_SMART_PHONE_USER = 6;</code>
     */
    NEW_SMART_PHONE_USER(6),
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
     * The affinity for this user interest.
     * </pre>
     *
     * <code>AFFINITY = 2;</code>
     */
    public static final int AFFINITY_VALUE = 2;
    /**
     * <pre>
     * The market for this user interest.
     * </pre>
     *
     * <code>IN_MARKET = 3;</code>
     */
    public static final int IN_MARKET_VALUE = 3;
    /**
     * <pre>
     * Users known to have installed applications in the specified categories.
     * </pre>
     *
     * <code>MOBILE_APP_INSTALL_USER = 4;</code>
     */
    public static final int MOBILE_APP_INSTALL_USER_VALUE = 4;
    /**
     * <pre>
     * The geographical location of the interest-based vertical.
     * </pre>
     *
     * <code>VERTICAL_GEO = 5;</code>
     */
    public static final int VERTICAL_GEO_VALUE = 5;
    /**
     * <pre>
     * User interest criteria for new smart phone users.
     * </pre>
     *
     * <code>NEW_SMART_PHONE_USER = 6;</code>
     */
    public static final int NEW_SMART_PHONE_USER_VALUE = 6;


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
    public static UserInterestTaxonomyType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static UserInterestTaxonomyType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return AFFINITY;
        case 3: return IN_MARKET;
        case 4: return MOBILE_APP_INSTALL_USER;
        case 5: return VERTICAL_GEO;
        case 6: return NEW_SMART_PHONE_USER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<UserInterestTaxonomyType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        UserInterestTaxonomyType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<UserInterestTaxonomyType>() {
            public UserInterestTaxonomyType findValueByNumber(int number) {
              return UserInterestTaxonomyType.forNumber(number);
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
      return com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final UserInterestTaxonomyType[] VALUES = values();

    public static UserInterestTaxonomyType valueOf(
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

    private UserInterestTaxonomyType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum.UserInterestTaxonomyType)
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
    if (!(obj instanceof com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum other = (com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum) obj;

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

  public static com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum prototype) {
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
   * Message describing a UserInterestTaxonomyType.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum)
      com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeProto.internal_static_google_ads_googleads_v16_enums_UserInterestTaxonomyTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeProto.internal_static_google_ads_googleads_v16_enums_UserInterestTaxonomyTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum.class, com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeProto.internal_static_google_ads_googleads_v16_enums_UserInterestTaxonomyTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum build() {
      com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum buildPartial() {
      com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum result = new com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum other) {
      if (other == com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum)
  private static final com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum();
  }

  public static com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserInterestTaxonomyTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<UserInterestTaxonomyTypeEnum>() {
    @java.lang.Override
    public UserInterestTaxonomyTypeEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserInterestTaxonomyTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserInterestTaxonomyTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


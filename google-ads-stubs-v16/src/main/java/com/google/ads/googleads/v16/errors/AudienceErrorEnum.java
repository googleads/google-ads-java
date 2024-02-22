// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/errors/audience_error.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.errors;

/**
 * <pre>
 * Container for enum describing possible audience errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.errors.AudienceErrorEnum}
 */
public final class AudienceErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.errors.AudienceErrorEnum)
    AudienceErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AudienceErrorEnum.newBuilder() to construct.
  private AudienceErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AudienceErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AudienceErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.errors.AudienceErrorProto.internal_static_google_ads_googleads_v16_errors_AudienceErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.errors.AudienceErrorProto.internal_static_google_ads_googleads_v16_errors_AudienceErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.errors.AudienceErrorEnum.class, com.google.ads.googleads.v16.errors.AudienceErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible audience errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v16.errors.AudienceErrorEnum.AudienceError}
   */
  public enum AudienceError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * An audience with this name already exists.
     * </pre>
     *
     * <code>NAME_ALREADY_IN_USE = 2;</code>
     */
    NAME_ALREADY_IN_USE(2),
    /**
     * <pre>
     * A dimension within the audience definition is not valid.
     * </pre>
     *
     * <code>DIMENSION_INVALID = 3;</code>
     */
    DIMENSION_INVALID(3),
    /**
     * <pre>
     * One of the audience segment added is not found.
     * </pre>
     *
     * <code>AUDIENCE_SEGMENT_NOT_FOUND = 4;</code>
     */
    AUDIENCE_SEGMENT_NOT_FOUND(4),
    /**
     * <pre>
     * One of the audience segment type is not supported.
     * </pre>
     *
     * <code>AUDIENCE_SEGMENT_TYPE_NOT_SUPPORTED = 5;</code>
     */
    AUDIENCE_SEGMENT_TYPE_NOT_SUPPORTED(5),
    /**
     * <pre>
     * The same segment already exists in this audience.
     * </pre>
     *
     * <code>DUPLICATE_AUDIENCE_SEGMENT = 6;</code>
     */
    DUPLICATE_AUDIENCE_SEGMENT(6),
    /**
     * <pre>
     * Audience can't have more than allowed number segments.
     * </pre>
     *
     * <code>TOO_MANY_SEGMENTS = 7;</code>
     */
    TOO_MANY_SEGMENTS(7),
    /**
     * <pre>
     * Audience can't have multiple dimensions of same type.
     * </pre>
     *
     * <code>TOO_MANY_DIMENSIONS_OF_SAME_TYPE = 8;</code>
     */
    TOO_MANY_DIMENSIONS_OF_SAME_TYPE(8),
    /**
     * <pre>
     * The audience cannot be removed, because it is currently used in an
     * ad group criterion or asset group signal in an (enabled or paused)
     * ad group or campaign.
     * </pre>
     *
     * <code>IN_USE = 9;</code>
     */
    IN_USE(9),
    /**
     * <pre>
     * Asset Group scoped audience requires an asset group ID.
     * </pre>
     *
     * <code>MISSING_ASSET_GROUP_ID = 10;</code>
     */
    MISSING_ASSET_GROUP_ID(10),
    /**
     * <pre>
     * Audience scope may not be changed from Customer to AssetGroup.
     * </pre>
     *
     * <code>CANNOT_CHANGE_FROM_CUSTOMER_TO_ASSET_GROUP_SCOPE = 11;</code>
     */
    CANNOT_CHANGE_FROM_CUSTOMER_TO_ASSET_GROUP_SCOPE(11),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * An audience with this name already exists.
     * </pre>
     *
     * <code>NAME_ALREADY_IN_USE = 2;</code>
     */
    public static final int NAME_ALREADY_IN_USE_VALUE = 2;
    /**
     * <pre>
     * A dimension within the audience definition is not valid.
     * </pre>
     *
     * <code>DIMENSION_INVALID = 3;</code>
     */
    public static final int DIMENSION_INVALID_VALUE = 3;
    /**
     * <pre>
     * One of the audience segment added is not found.
     * </pre>
     *
     * <code>AUDIENCE_SEGMENT_NOT_FOUND = 4;</code>
     */
    public static final int AUDIENCE_SEGMENT_NOT_FOUND_VALUE = 4;
    /**
     * <pre>
     * One of the audience segment type is not supported.
     * </pre>
     *
     * <code>AUDIENCE_SEGMENT_TYPE_NOT_SUPPORTED = 5;</code>
     */
    public static final int AUDIENCE_SEGMENT_TYPE_NOT_SUPPORTED_VALUE = 5;
    /**
     * <pre>
     * The same segment already exists in this audience.
     * </pre>
     *
     * <code>DUPLICATE_AUDIENCE_SEGMENT = 6;</code>
     */
    public static final int DUPLICATE_AUDIENCE_SEGMENT_VALUE = 6;
    /**
     * <pre>
     * Audience can't have more than allowed number segments.
     * </pre>
     *
     * <code>TOO_MANY_SEGMENTS = 7;</code>
     */
    public static final int TOO_MANY_SEGMENTS_VALUE = 7;
    /**
     * <pre>
     * Audience can't have multiple dimensions of same type.
     * </pre>
     *
     * <code>TOO_MANY_DIMENSIONS_OF_SAME_TYPE = 8;</code>
     */
    public static final int TOO_MANY_DIMENSIONS_OF_SAME_TYPE_VALUE = 8;
    /**
     * <pre>
     * The audience cannot be removed, because it is currently used in an
     * ad group criterion or asset group signal in an (enabled or paused)
     * ad group or campaign.
     * </pre>
     *
     * <code>IN_USE = 9;</code>
     */
    public static final int IN_USE_VALUE = 9;
    /**
     * <pre>
     * Asset Group scoped audience requires an asset group ID.
     * </pre>
     *
     * <code>MISSING_ASSET_GROUP_ID = 10;</code>
     */
    public static final int MISSING_ASSET_GROUP_ID_VALUE = 10;
    /**
     * <pre>
     * Audience scope may not be changed from Customer to AssetGroup.
     * </pre>
     *
     * <code>CANNOT_CHANGE_FROM_CUSTOMER_TO_ASSET_GROUP_SCOPE = 11;</code>
     */
    public static final int CANNOT_CHANGE_FROM_CUSTOMER_TO_ASSET_GROUP_SCOPE_VALUE = 11;


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
    public static AudienceError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AudienceError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return NAME_ALREADY_IN_USE;
        case 3: return DIMENSION_INVALID;
        case 4: return AUDIENCE_SEGMENT_NOT_FOUND;
        case 5: return AUDIENCE_SEGMENT_TYPE_NOT_SUPPORTED;
        case 6: return DUPLICATE_AUDIENCE_SEGMENT;
        case 7: return TOO_MANY_SEGMENTS;
        case 8: return TOO_MANY_DIMENSIONS_OF_SAME_TYPE;
        case 9: return IN_USE;
        case 10: return MISSING_ASSET_GROUP_ID;
        case 11: return CANNOT_CHANGE_FROM_CUSTOMER_TO_ASSET_GROUP_SCOPE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AudienceError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AudienceError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AudienceError>() {
            public AudienceError findValueByNumber(int number) {
              return AudienceError.forNumber(number);
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
      return com.google.ads.googleads.v16.errors.AudienceErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AudienceError[] VALUES = values();

    public static AudienceError valueOf(
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

    private AudienceError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v16.errors.AudienceErrorEnum.AudienceError)
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
    if (!(obj instanceof com.google.ads.googleads.v16.errors.AudienceErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.errors.AudienceErrorEnum other = (com.google.ads.googleads.v16.errors.AudienceErrorEnum) obj;

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

  public static com.google.ads.googleads.v16.errors.AudienceErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.errors.AudienceErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.errors.AudienceErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.errors.AudienceErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.errors.AudienceErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.errors.AudienceErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.errors.AudienceErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.errors.AudienceErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.errors.AudienceErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.errors.AudienceErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.errors.AudienceErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.errors.AudienceErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.errors.AudienceErrorEnum prototype) {
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
   * Container for enum describing possible audience errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.errors.AudienceErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.errors.AudienceErrorEnum)
      com.google.ads.googleads.v16.errors.AudienceErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.errors.AudienceErrorProto.internal_static_google_ads_googleads_v16_errors_AudienceErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.errors.AudienceErrorProto.internal_static_google_ads_googleads_v16_errors_AudienceErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.errors.AudienceErrorEnum.class, com.google.ads.googleads.v16.errors.AudienceErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.errors.AudienceErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v16.errors.AudienceErrorProto.internal_static_google_ads_googleads_v16_errors_AudienceErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.errors.AudienceErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.errors.AudienceErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.errors.AudienceErrorEnum build() {
      com.google.ads.googleads.v16.errors.AudienceErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.errors.AudienceErrorEnum buildPartial() {
      com.google.ads.googleads.v16.errors.AudienceErrorEnum result = new com.google.ads.googleads.v16.errors.AudienceErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v16.errors.AudienceErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v16.errors.AudienceErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.errors.AudienceErrorEnum other) {
      if (other == com.google.ads.googleads.v16.errors.AudienceErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.errors.AudienceErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.errors.AudienceErrorEnum)
  private static final com.google.ads.googleads.v16.errors.AudienceErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.errors.AudienceErrorEnum();
  }

  public static com.google.ads.googleads.v16.errors.AudienceErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AudienceErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<AudienceErrorEnum>() {
    @java.lang.Override
    public AudienceErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<AudienceErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AudienceErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.errors.AudienceErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


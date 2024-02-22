// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/errors/conversion_custom_variable_error.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.errors;

/**
 * <pre>
 * Container for enum describing possible conversion custom variable errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum}
 */
public final class ConversionCustomVariableErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum)
    ConversionCustomVariableErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConversionCustomVariableErrorEnum.newBuilder() to construct.
  private ConversionCustomVariableErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConversionCustomVariableErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConversionCustomVariableErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorProto.internal_static_google_ads_googleads_v15_errors_ConversionCustomVariableErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorProto.internal_static_google_ads_googleads_v15_errors_ConversionCustomVariableErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum.class, com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible conversion custom variable errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum.ConversionCustomVariableError}
   */
  public enum ConversionCustomVariableError
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
     * A conversion custom variable with the specified name already exists.
     * </pre>
     *
     * <code>DUPLICATE_NAME = 2;</code>
     */
    DUPLICATE_NAME(2),
    /**
     * <pre>
     * A conversion custom variable with the specified tag already exists.
     * </pre>
     *
     * <code>DUPLICATE_TAG = 3;</code>
     */
    DUPLICATE_TAG(3),
    /**
     * <pre>
     * A conversion custom variable with the specified tag is reserved for other
     * uses.
     * </pre>
     *
     * <code>RESERVED_TAG = 4;</code>
     */
    RESERVED_TAG(4),
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
     * A conversion custom variable with the specified name already exists.
     * </pre>
     *
     * <code>DUPLICATE_NAME = 2;</code>
     */
    public static final int DUPLICATE_NAME_VALUE = 2;
    /**
     * <pre>
     * A conversion custom variable with the specified tag already exists.
     * </pre>
     *
     * <code>DUPLICATE_TAG = 3;</code>
     */
    public static final int DUPLICATE_TAG_VALUE = 3;
    /**
     * <pre>
     * A conversion custom variable with the specified tag is reserved for other
     * uses.
     * </pre>
     *
     * <code>RESERVED_TAG = 4;</code>
     */
    public static final int RESERVED_TAG_VALUE = 4;


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
    public static ConversionCustomVariableError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ConversionCustomVariableError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return DUPLICATE_NAME;
        case 3: return DUPLICATE_TAG;
        case 4: return RESERVED_TAG;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ConversionCustomVariableError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ConversionCustomVariableError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ConversionCustomVariableError>() {
            public ConversionCustomVariableError findValueByNumber(int number) {
              return ConversionCustomVariableError.forNumber(number);
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
      return com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ConversionCustomVariableError[] VALUES = values();

    public static ConversionCustomVariableError valueOf(
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

    private ConversionCustomVariableError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum.ConversionCustomVariableError)
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
    if (!(obj instanceof com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum other = (com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum) obj;

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

  public static com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum prototype) {
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
   * Container for enum describing possible conversion custom variable errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum)
      com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorProto.internal_static_google_ads_googleads_v15_errors_ConversionCustomVariableErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorProto.internal_static_google_ads_googleads_v15_errors_ConversionCustomVariableErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum.class, com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorProto.internal_static_google_ads_googleads_v15_errors_ConversionCustomVariableErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum build() {
      com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum buildPartial() {
      com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum result = new com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum other) {
      if (other == com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum)
  private static final com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum();
  }

  public static com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConversionCustomVariableErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<ConversionCustomVariableErrorEnum>() {
    @java.lang.Override
    public ConversionCustomVariableErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConversionCustomVariableErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConversionCustomVariableErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.errors.ConversionCustomVariableErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


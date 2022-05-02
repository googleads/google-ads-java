// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/function_parsing_error.proto

package com.google.ads.googleads.v10.errors;

/**
 * <pre>
 * Container for enum describing possible function parsing errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.errors.FunctionParsingErrorEnum}
 */
public final class FunctionParsingErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.errors.FunctionParsingErrorEnum)
    FunctionParsingErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FunctionParsingErrorEnum.newBuilder() to construct.
  private FunctionParsingErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FunctionParsingErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FunctionParsingErrorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FunctionParsingErrorEnum(
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
    return com.google.ads.googleads.v10.errors.FunctionParsingErrorProto.internal_static_google_ads_googleads_v10_errors_FunctionParsingErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.errors.FunctionParsingErrorProto.internal_static_google_ads_googleads_v10_errors_FunctionParsingErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum.class, com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible function parsing errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v10.errors.FunctionParsingErrorEnum.FunctionParsingError}
   */
  public enum FunctionParsingError
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
     * Unexpected end of function string.
     * </pre>
     *
     * <code>NO_MORE_INPUT = 2;</code>
     */
    NO_MORE_INPUT(2),
    /**
     * <pre>
     * Could not find an expected character.
     * </pre>
     *
     * <code>EXPECTED_CHARACTER = 3;</code>
     */
    EXPECTED_CHARACTER(3),
    /**
     * <pre>
     * Unexpected separator character.
     * </pre>
     *
     * <code>UNEXPECTED_SEPARATOR = 4;</code>
     */
    UNEXPECTED_SEPARATOR(4),
    /**
     * <pre>
     * Unmatched left bracket or parenthesis.
     * </pre>
     *
     * <code>UNMATCHED_LEFT_BRACKET = 5;</code>
     */
    UNMATCHED_LEFT_BRACKET(5),
    /**
     * <pre>
     * Unmatched right bracket or parenthesis.
     * </pre>
     *
     * <code>UNMATCHED_RIGHT_BRACKET = 6;</code>
     */
    UNMATCHED_RIGHT_BRACKET(6),
    /**
     * <pre>
     * Functions are nested too deeply.
     * </pre>
     *
     * <code>TOO_MANY_NESTED_FUNCTIONS = 7;</code>
     */
    TOO_MANY_NESTED_FUNCTIONS(7),
    /**
     * <pre>
     * Missing right-hand-side operand.
     * </pre>
     *
     * <code>MISSING_RIGHT_HAND_OPERAND = 8;</code>
     */
    MISSING_RIGHT_HAND_OPERAND(8),
    /**
     * <pre>
     * Invalid operator/function name.
     * </pre>
     *
     * <code>INVALID_OPERATOR_NAME = 9;</code>
     */
    INVALID_OPERATOR_NAME(9),
    /**
     * <pre>
     * Feed attribute operand's argument is not an integer.
     * </pre>
     *
     * <code>FEED_ATTRIBUTE_OPERAND_ARGUMENT_NOT_INTEGER = 10;</code>
     */
    FEED_ATTRIBUTE_OPERAND_ARGUMENT_NOT_INTEGER(10),
    /**
     * <pre>
     * Missing function operands.
     * </pre>
     *
     * <code>NO_OPERANDS = 11;</code>
     */
    NO_OPERANDS(11),
    /**
     * <pre>
     * Function had too many operands.
     * </pre>
     *
     * <code>TOO_MANY_OPERANDS = 12;</code>
     */
    TOO_MANY_OPERANDS(12),
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
     * Unexpected end of function string.
     * </pre>
     *
     * <code>NO_MORE_INPUT = 2;</code>
     */
    public static final int NO_MORE_INPUT_VALUE = 2;
    /**
     * <pre>
     * Could not find an expected character.
     * </pre>
     *
     * <code>EXPECTED_CHARACTER = 3;</code>
     */
    public static final int EXPECTED_CHARACTER_VALUE = 3;
    /**
     * <pre>
     * Unexpected separator character.
     * </pre>
     *
     * <code>UNEXPECTED_SEPARATOR = 4;</code>
     */
    public static final int UNEXPECTED_SEPARATOR_VALUE = 4;
    /**
     * <pre>
     * Unmatched left bracket or parenthesis.
     * </pre>
     *
     * <code>UNMATCHED_LEFT_BRACKET = 5;</code>
     */
    public static final int UNMATCHED_LEFT_BRACKET_VALUE = 5;
    /**
     * <pre>
     * Unmatched right bracket or parenthesis.
     * </pre>
     *
     * <code>UNMATCHED_RIGHT_BRACKET = 6;</code>
     */
    public static final int UNMATCHED_RIGHT_BRACKET_VALUE = 6;
    /**
     * <pre>
     * Functions are nested too deeply.
     * </pre>
     *
     * <code>TOO_MANY_NESTED_FUNCTIONS = 7;</code>
     */
    public static final int TOO_MANY_NESTED_FUNCTIONS_VALUE = 7;
    /**
     * <pre>
     * Missing right-hand-side operand.
     * </pre>
     *
     * <code>MISSING_RIGHT_HAND_OPERAND = 8;</code>
     */
    public static final int MISSING_RIGHT_HAND_OPERAND_VALUE = 8;
    /**
     * <pre>
     * Invalid operator/function name.
     * </pre>
     *
     * <code>INVALID_OPERATOR_NAME = 9;</code>
     */
    public static final int INVALID_OPERATOR_NAME_VALUE = 9;
    /**
     * <pre>
     * Feed attribute operand's argument is not an integer.
     * </pre>
     *
     * <code>FEED_ATTRIBUTE_OPERAND_ARGUMENT_NOT_INTEGER = 10;</code>
     */
    public static final int FEED_ATTRIBUTE_OPERAND_ARGUMENT_NOT_INTEGER_VALUE = 10;
    /**
     * <pre>
     * Missing function operands.
     * </pre>
     *
     * <code>NO_OPERANDS = 11;</code>
     */
    public static final int NO_OPERANDS_VALUE = 11;
    /**
     * <pre>
     * Function had too many operands.
     * </pre>
     *
     * <code>TOO_MANY_OPERANDS = 12;</code>
     */
    public static final int TOO_MANY_OPERANDS_VALUE = 12;


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
    public static FunctionParsingError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FunctionParsingError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return NO_MORE_INPUT;
        case 3: return EXPECTED_CHARACTER;
        case 4: return UNEXPECTED_SEPARATOR;
        case 5: return UNMATCHED_LEFT_BRACKET;
        case 6: return UNMATCHED_RIGHT_BRACKET;
        case 7: return TOO_MANY_NESTED_FUNCTIONS;
        case 8: return MISSING_RIGHT_HAND_OPERAND;
        case 9: return INVALID_OPERATOR_NAME;
        case 10: return FEED_ATTRIBUTE_OPERAND_ARGUMENT_NOT_INTEGER;
        case 11: return NO_OPERANDS;
        case 12: return TOO_MANY_OPERANDS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FunctionParsingError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FunctionParsingError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FunctionParsingError>() {
            public FunctionParsingError findValueByNumber(int number) {
              return FunctionParsingError.forNumber(number);
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
      return com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final FunctionParsingError[] VALUES = values();

    public static FunctionParsingError valueOf(
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

    private FunctionParsingError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v10.errors.FunctionParsingErrorEnum.FunctionParsingError)
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
    if (!(obj instanceof com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum other = (com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum) obj;

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

  public static com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum prototype) {
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
   * Container for enum describing possible function parsing errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.errors.FunctionParsingErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.errors.FunctionParsingErrorEnum)
      com.google.ads.googleads.v10.errors.FunctionParsingErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.errors.FunctionParsingErrorProto.internal_static_google_ads_googleads_v10_errors_FunctionParsingErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.errors.FunctionParsingErrorProto.internal_static_google_ads_googleads_v10_errors_FunctionParsingErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum.class, com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v10.errors.FunctionParsingErrorProto.internal_static_google_ads_googleads_v10_errors_FunctionParsingErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum build() {
      com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum buildPartial() {
      com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum result = new com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum other) {
      if (other == com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.errors.FunctionParsingErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.errors.FunctionParsingErrorEnum)
  private static final com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum();
  }

  public static com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FunctionParsingErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<FunctionParsingErrorEnum>() {
    @java.lang.Override
    public FunctionParsingErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FunctionParsingErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FunctionParsingErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FunctionParsingErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.errors.FunctionParsingErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/enums/webpage_condition_operand.proto

package com.google.ads.googleads.v14.enums;

/**
 * <pre>
 * Container for enum describing webpage condition operand in webpage criterion.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.enums.WebpageConditionOperandEnum}
 */
public final class WebpageConditionOperandEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.enums.WebpageConditionOperandEnum)
    WebpageConditionOperandEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WebpageConditionOperandEnum.newBuilder() to construct.
  private WebpageConditionOperandEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WebpageConditionOperandEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new WebpageConditionOperandEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.enums.WebpageConditionOperandProto.internal_static_google_ads_googleads_v14_enums_WebpageConditionOperandEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.enums.WebpageConditionOperandProto.internal_static_google_ads_googleads_v14_enums_WebpageConditionOperandEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum.class, com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum.Builder.class);
  }

  /**
   * <pre>
   * The webpage condition operand in webpage criterion.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v14.enums.WebpageConditionOperandEnum.WebpageConditionOperand}
   */
  public enum WebpageConditionOperand
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
     * Operand denoting a webpage URL targeting condition.
     * </pre>
     *
     * <code>URL = 2;</code>
     */
    URL(2),
    /**
     * <pre>
     * Operand denoting a webpage category targeting condition.
     * </pre>
     *
     * <code>CATEGORY = 3;</code>
     */
    CATEGORY(3),
    /**
     * <pre>
     * Operand denoting a webpage title targeting condition.
     * </pre>
     *
     * <code>PAGE_TITLE = 4;</code>
     */
    PAGE_TITLE(4),
    /**
     * <pre>
     * Operand denoting a webpage content targeting condition.
     * </pre>
     *
     * <code>PAGE_CONTENT = 5;</code>
     */
    PAGE_CONTENT(5),
    /**
     * <pre>
     * Operand denoting a webpage custom label targeting condition.
     * </pre>
     *
     * <code>CUSTOM_LABEL = 6;</code>
     */
    CUSTOM_LABEL(6),
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
     * Operand denoting a webpage URL targeting condition.
     * </pre>
     *
     * <code>URL = 2;</code>
     */
    public static final int URL_VALUE = 2;
    /**
     * <pre>
     * Operand denoting a webpage category targeting condition.
     * </pre>
     *
     * <code>CATEGORY = 3;</code>
     */
    public static final int CATEGORY_VALUE = 3;
    /**
     * <pre>
     * Operand denoting a webpage title targeting condition.
     * </pre>
     *
     * <code>PAGE_TITLE = 4;</code>
     */
    public static final int PAGE_TITLE_VALUE = 4;
    /**
     * <pre>
     * Operand denoting a webpage content targeting condition.
     * </pre>
     *
     * <code>PAGE_CONTENT = 5;</code>
     */
    public static final int PAGE_CONTENT_VALUE = 5;
    /**
     * <pre>
     * Operand denoting a webpage custom label targeting condition.
     * </pre>
     *
     * <code>CUSTOM_LABEL = 6;</code>
     */
    public static final int CUSTOM_LABEL_VALUE = 6;


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
    public static WebpageConditionOperand valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static WebpageConditionOperand forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return URL;
        case 3: return CATEGORY;
        case 4: return PAGE_TITLE;
        case 5: return PAGE_CONTENT;
        case 6: return CUSTOM_LABEL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<WebpageConditionOperand>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        WebpageConditionOperand> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<WebpageConditionOperand>() {
            public WebpageConditionOperand findValueByNumber(int number) {
              return WebpageConditionOperand.forNumber(number);
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
      return com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final WebpageConditionOperand[] VALUES = values();

    public static WebpageConditionOperand valueOf(
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

    private WebpageConditionOperand(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v14.enums.WebpageConditionOperandEnum.WebpageConditionOperand)
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
    if (!(obj instanceof com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum other = (com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum) obj;

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

  public static com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum prototype) {
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
   * Container for enum describing webpage condition operand in webpage criterion.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.enums.WebpageConditionOperandEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.enums.WebpageConditionOperandEnum)
      com.google.ads.googleads.v14.enums.WebpageConditionOperandEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.enums.WebpageConditionOperandProto.internal_static_google_ads_googleads_v14_enums_WebpageConditionOperandEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.enums.WebpageConditionOperandProto.internal_static_google_ads_googleads_v14_enums_WebpageConditionOperandEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum.class, com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum.newBuilder()
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
      return com.google.ads.googleads.v14.enums.WebpageConditionOperandProto.internal_static_google_ads_googleads_v14_enums_WebpageConditionOperandEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum build() {
      com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum buildPartial() {
      com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum result = new com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum(this);
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
      if (other instanceof com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum) {
        return mergeFrom((com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum other) {
      if (other == com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.enums.WebpageConditionOperandEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.enums.WebpageConditionOperandEnum)
  private static final com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum();
  }

  public static com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WebpageConditionOperandEnum>
      PARSER = new com.google.protobuf.AbstractParser<WebpageConditionOperandEnum>() {
    @java.lang.Override
    public WebpageConditionOperandEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<WebpageConditionOperandEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WebpageConditionOperandEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.enums.WebpageConditionOperandEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


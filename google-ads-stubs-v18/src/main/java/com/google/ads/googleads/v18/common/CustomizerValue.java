// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/customizer_value.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.common;

/**
 * <pre>
 * A customizer value that is referenced in customizer linkage entities
 * like CustomerCustomizer, CampaignCustomizer, etc.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.common.CustomizerValue}
 */
public final class CustomizerValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.common.CustomizerValue)
    CustomizerValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomizerValue.newBuilder() to construct.
  private CustomizerValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomizerValue() {
    type_ = 0;
    stringValue_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomizerValue();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.common.CustomizerValueProto.internal_static_google_ads_googleads_v18_common_CustomizerValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.common.CustomizerValueProto.internal_static_google_ads_googleads_v18_common_CustomizerValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.common.CustomizerValue.class, com.google.ads.googleads.v18.common.CustomizerValue.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_ = 0;
  /**
   * <pre>
   * Required. The data type for the customizer value. It must match the
   * attribute type. The string_value content must match the constraints
   * associated with the type.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * Required. The data type for the customizer value. It must match the
   * attribute type. The string_value content must match the constraints
   * associated with the type.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The type.
   */
  @java.lang.Override public com.google.ads.googleads.v18.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType getType() {
    com.google.ads.googleads.v18.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType result = com.google.ads.googleads.v18.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType.forNumber(type_);
    return result == null ? com.google.ads.googleads.v18.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType.UNRECOGNIZED : result;
  }

  public static final int STRING_VALUE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object stringValue_ = "";
  /**
   * <pre>
   * Required. Value to insert in creative text. Customizer values of all types
   * are stored as string to make formatting unambiguous.
   * </pre>
   *
   * <code>string string_value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The stringValue.
   */
  @java.lang.Override
  public java.lang.String getStringValue() {
    java.lang.Object ref = stringValue_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stringValue_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. Value to insert in creative text. Customizer values of all types
   * are stored as string to make formatting unambiguous.
   * </pre>
   *
   * <code>string string_value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for stringValue.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStringValueBytes() {
    java.lang.Object ref = stringValue_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stringValue_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (type_ != com.google.ads.googleads.v18.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stringValue_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, stringValue_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.google.ads.googleads.v18.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stringValue_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, stringValue_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v18.common.CustomizerValue)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.common.CustomizerValue other = (com.google.ads.googleads.v18.common.CustomizerValue) obj;

    if (type_ != other.type_) return false;
    if (!getStringValue()
        .equals(other.getStringValue())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + STRING_VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getStringValue().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v18.common.CustomizerValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.CustomizerValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.CustomizerValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.CustomizerValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.CustomizerValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.CustomizerValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.CustomizerValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.common.CustomizerValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.common.CustomizerValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.common.CustomizerValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.CustomizerValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.common.CustomizerValue parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.common.CustomizerValue prototype) {
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
   * A customizer value that is referenced in customizer linkage entities
   * like CustomerCustomizer, CampaignCustomizer, etc.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.common.CustomizerValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.common.CustomizerValue)
      com.google.ads.googleads.v18.common.CustomizerValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.common.CustomizerValueProto.internal_static_google_ads_googleads_v18_common_CustomizerValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.common.CustomizerValueProto.internal_static_google_ads_googleads_v18_common_CustomizerValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.common.CustomizerValue.class, com.google.ads.googleads.v18.common.CustomizerValue.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.common.CustomizerValue.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      type_ = 0;
      stringValue_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v18.common.CustomizerValueProto.internal_static_google_ads_googleads_v18_common_CustomizerValue_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.CustomizerValue getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.common.CustomizerValue.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.CustomizerValue build() {
      com.google.ads.googleads.v18.common.CustomizerValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.CustomizerValue buildPartial() {
      com.google.ads.googleads.v18.common.CustomizerValue result = new com.google.ads.googleads.v18.common.CustomizerValue(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v18.common.CustomizerValue result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.stringValue_ = stringValue_;
      }
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
      if (other instanceof com.google.ads.googleads.v18.common.CustomizerValue) {
        return mergeFrom((com.google.ads.googleads.v18.common.CustomizerValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.common.CustomizerValue other) {
      if (other == com.google.ads.googleads.v18.common.CustomizerValue.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getStringValue().isEmpty()) {
        stringValue_ = other.stringValue_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
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
            case 8: {
              type_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              stringValue_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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
    private int bitField0_;

    private int type_ = 0;
    /**
     * <pre>
     * Required. The data type for the customizer value. It must match the
     * attribute type. The string_value content must match the constraints
     * associated with the type.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Required. The data type for the customizer value. It must match the
     * attribute type. The string_value content must match the constraints
     * associated with the type.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The data type for the customizer value. It must match the
     * attribute type. The string_value content must match the constraints
     * associated with the type.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The type.
     */
    @java.lang.Override
    public com.google.ads.googleads.v18.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType getType() {
      com.google.ads.googleads.v18.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType result = com.google.ads.googleads.v18.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType.forNumber(type_);
      return result == null ? com.google.ads.googleads.v18.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Required. The data type for the customizer value. It must match the
     * attribute type. The string_value content must match the constraints
     * associated with the type.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.ads.googleads.v18.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The data type for the customizer value. It must match the
     * attribute type. The string_value content must match the constraints
     * associated with the type.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.CustomizerAttributeTypeEnum.CustomizerAttributeType type = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object stringValue_ = "";
    /**
     * <pre>
     * Required. Value to insert in creative text. Customizer values of all types
     * are stored as string to make formatting unambiguous.
     * </pre>
     *
     * <code>string string_value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The stringValue.
     */
    public java.lang.String getStringValue() {
      java.lang.Object ref = stringValue_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stringValue_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. Value to insert in creative text. Customizer values of all types
     * are stored as string to make formatting unambiguous.
     * </pre>
     *
     * <code>string string_value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for stringValue.
     */
    public com.google.protobuf.ByteString
        getStringValueBytes() {
      java.lang.Object ref = stringValue_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stringValue_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. Value to insert in creative text. Customizer values of all types
     * are stored as string to make formatting unambiguous.
     * </pre>
     *
     * <code>string string_value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The stringValue to set.
     * @return This builder for chaining.
     */
    public Builder setStringValue(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      stringValue_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Value to insert in creative text. Customizer values of all types
     * are stored as string to make formatting unambiguous.
     * </pre>
     *
     * <code>string string_value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearStringValue() {
      stringValue_ = getDefaultInstance().getStringValue();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Value to insert in creative text. Customizer values of all types
     * are stored as string to make formatting unambiguous.
     * </pre>
     *
     * <code>string string_value = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for stringValue to set.
     * @return This builder for chaining.
     */
    public Builder setStringValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      stringValue_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.common.CustomizerValue)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.common.CustomizerValue)
  private static final com.google.ads.googleads.v18.common.CustomizerValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.common.CustomizerValue();
  }

  public static com.google.ads.googleads.v18.common.CustomizerValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomizerValue>
      PARSER = new com.google.protobuf.AbstractParser<CustomizerValue>() {
    @java.lang.Override
    public CustomizerValue parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomizerValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomizerValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.common.CustomizerValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


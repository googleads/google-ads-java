// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/feed.proto

package com.google.ads.googleads.v10.resources;

/**
 * <pre>
 * Operation to be performed on a feed attribute list in a mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.resources.FeedAttributeOperation}
 */
public final class FeedAttributeOperation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.resources.FeedAttributeOperation)
    FeedAttributeOperationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeedAttributeOperation.newBuilder() to construct.
  private FeedAttributeOperation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeedAttributeOperation() {
    operator_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeedAttributeOperation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FeedAttributeOperation(
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
          case 8: {
            int rawValue = input.readEnum();

            operator_ = rawValue;
            break;
          }
          case 18: {
            com.google.ads.googleads.v10.resources.FeedAttribute.Builder subBuilder = null;
            if (value_ != null) {
              subBuilder = value_.toBuilder();
            }
            value_ = input.readMessage(com.google.ads.googleads.v10.resources.FeedAttribute.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(value_);
              value_ = subBuilder.buildPartial();
            }

            break;
          }
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
    return com.google.ads.googleads.v10.resources.FeedProto.internal_static_google_ads_googleads_v10_resources_FeedAttributeOperation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.resources.FeedProto.internal_static_google_ads_googleads_v10_resources_FeedAttributeOperation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.resources.FeedAttributeOperation.class, com.google.ads.googleads.v10.resources.FeedAttributeOperation.Builder.class);
  }

  /**
   * <pre>
   * The operator.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v10.resources.FeedAttributeOperation.Operator}
   */
  public enum Operator
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified.
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
     * Add the attribute to the existing attributes.
     * </pre>
     *
     * <code>ADD = 2;</code>
     */
    ADD(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified.
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
     * Add the attribute to the existing attributes.
     * </pre>
     *
     * <code>ADD = 2;</code>
     */
    public static final int ADD_VALUE = 2;


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
    public static Operator valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Operator forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return ADD;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Operator>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Operator> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Operator>() {
            public Operator findValueByNumber(int number) {
              return Operator.forNumber(number);
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
      return com.google.ads.googleads.v10.resources.FeedAttributeOperation.getDescriptor().getEnumTypes().get(0);
    }

    private static final Operator[] VALUES = values();

    public static Operator valueOf(
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

    private Operator(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v10.resources.FeedAttributeOperation.Operator)
  }

  public static final int OPERATOR_FIELD_NUMBER = 1;
  private int operator_;
  /**
   * <pre>
   * Output only. Type of list operation to perform.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.FeedAttributeOperation.Operator operator = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for operator.
   */
  @java.lang.Override public int getOperatorValue() {
    return operator_;
  }
  /**
   * <pre>
   * Output only. Type of list operation to perform.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.FeedAttributeOperation.Operator operator = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The operator.
   */
  @java.lang.Override public com.google.ads.googleads.v10.resources.FeedAttributeOperation.Operator getOperator() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v10.resources.FeedAttributeOperation.Operator result = com.google.ads.googleads.v10.resources.FeedAttributeOperation.Operator.valueOf(operator_);
    return result == null ? com.google.ads.googleads.v10.resources.FeedAttributeOperation.Operator.UNRECOGNIZED : result;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v10.resources.FeedAttribute value_;
  /**
   * <pre>
   * Output only. The feed attribute being added to the list.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.FeedAttribute value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return value_ != null;
  }
  /**
   * <pre>
   * Output only. The feed attribute being added to the list.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.FeedAttribute value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The value.
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.resources.FeedAttribute getValue() {
    return value_ == null ? com.google.ads.googleads.v10.resources.FeedAttribute.getDefaultInstance() : value_;
  }
  /**
   * <pre>
   * Output only. The feed attribute being added to the list.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.resources.FeedAttribute value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.resources.FeedAttributeOrBuilder getValueOrBuilder() {
    return getValue();
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
    if (operator_ != com.google.ads.googleads.v10.resources.FeedAttributeOperation.Operator.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, operator_);
    }
    if (value_ != null) {
      output.writeMessage(2, getValue());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operator_ != com.google.ads.googleads.v10.resources.FeedAttributeOperation.Operator.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, operator_);
    }
    if (value_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getValue());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v10.resources.FeedAttributeOperation)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.resources.FeedAttributeOperation other = (com.google.ads.googleads.v10.resources.FeedAttributeOperation) obj;

    if (operator_ != other.operator_) return false;
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
    }
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
    hash = (37 * hash) + OPERATOR_FIELD_NUMBER;
    hash = (53 * hash) + operator_;
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.resources.FeedAttributeOperation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttributeOperation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttributeOperation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttributeOperation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttributeOperation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttributeOperation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttributeOperation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttributeOperation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttributeOperation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttributeOperation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttributeOperation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.FeedAttributeOperation parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.resources.FeedAttributeOperation prototype) {
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
   * Operation to be performed on a feed attribute list in a mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.resources.FeedAttributeOperation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.resources.FeedAttributeOperation)
      com.google.ads.googleads.v10.resources.FeedAttributeOperationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.resources.FeedProto.internal_static_google_ads_googleads_v10_resources_FeedAttributeOperation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.resources.FeedProto.internal_static_google_ads_googleads_v10_resources_FeedAttributeOperation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.resources.FeedAttributeOperation.class, com.google.ads.googleads.v10.resources.FeedAttributeOperation.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.resources.FeedAttributeOperation.newBuilder()
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
      operator_ = 0;

      if (valueBuilder_ == null) {
        value_ = null;
      } else {
        value_ = null;
        valueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.resources.FeedProto.internal_static_google_ads_googleads_v10_resources_FeedAttributeOperation_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.FeedAttributeOperation getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.resources.FeedAttributeOperation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.FeedAttributeOperation build() {
      com.google.ads.googleads.v10.resources.FeedAttributeOperation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.FeedAttributeOperation buildPartial() {
      com.google.ads.googleads.v10.resources.FeedAttributeOperation result = new com.google.ads.googleads.v10.resources.FeedAttributeOperation(this);
      result.operator_ = operator_;
      if (valueBuilder_ == null) {
        result.value_ = value_;
      } else {
        result.value_ = valueBuilder_.build();
      }
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
      if (other instanceof com.google.ads.googleads.v10.resources.FeedAttributeOperation) {
        return mergeFrom((com.google.ads.googleads.v10.resources.FeedAttributeOperation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.resources.FeedAttributeOperation other) {
      if (other == com.google.ads.googleads.v10.resources.FeedAttributeOperation.getDefaultInstance()) return this;
      if (other.operator_ != 0) {
        setOperatorValue(other.getOperatorValue());
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
      }
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
      com.google.ads.googleads.v10.resources.FeedAttributeOperation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.resources.FeedAttributeOperation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int operator_ = 0;
    /**
     * <pre>
     * Output only. Type of list operation to perform.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedAttributeOperation.Operator operator = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The enum numeric value on the wire for operator.
     */
    @java.lang.Override public int getOperatorValue() {
      return operator_;
    }
    /**
     * <pre>
     * Output only. Type of list operation to perform.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedAttributeOperation.Operator operator = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The enum numeric value on the wire for operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperatorValue(int value) {
      
      operator_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Type of list operation to perform.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedAttributeOperation.Operator operator = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The operator.
     */
    @java.lang.Override
    public com.google.ads.googleads.v10.resources.FeedAttributeOperation.Operator getOperator() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v10.resources.FeedAttributeOperation.Operator result = com.google.ads.googleads.v10.resources.FeedAttributeOperation.Operator.valueOf(operator_);
      return result == null ? com.google.ads.googleads.v10.resources.FeedAttributeOperation.Operator.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Output only. Type of list operation to perform.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedAttributeOperation.Operator operator = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperator(com.google.ads.googleads.v10.resources.FeedAttributeOperation.Operator value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      operator_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Type of list operation to perform.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedAttributeOperation.Operator operator = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearOperator() {
      
      operator_ = 0;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v10.resources.FeedAttribute value_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.resources.FeedAttribute, com.google.ads.googleads.v10.resources.FeedAttribute.Builder, com.google.ads.googleads.v10.resources.FeedAttributeOrBuilder> valueBuilder_;
    /**
     * <pre>
     * Output only. The feed attribute being added to the list.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedAttribute value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return valueBuilder_ != null || value_ != null;
    }
    /**
     * <pre>
     * Output only. The feed attribute being added to the list.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedAttribute value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The value.
     */
    public com.google.ads.googleads.v10.resources.FeedAttribute getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? com.google.ads.googleads.v10.resources.FeedAttribute.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Output only. The feed attribute being added to the list.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedAttribute value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setValue(com.google.ads.googleads.v10.resources.FeedAttribute value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        valueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The feed attribute being added to the list.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedAttribute value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setValue(
        com.google.ads.googleads.v10.resources.FeedAttribute.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The feed attribute being added to the list.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedAttribute value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeValue(com.google.ads.googleads.v10.resources.FeedAttribute value) {
      if (valueBuilder_ == null) {
        if (value_ != null) {
          value_ =
            com.google.ads.googleads.v10.resources.FeedAttribute.newBuilder(value_).mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        valueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The feed attribute being added to the list.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedAttribute value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearValue() {
      if (valueBuilder_ == null) {
        value_ = null;
        onChanged();
      } else {
        value_ = null;
        valueBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Output only. The feed attribute being added to the list.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedAttribute value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.ads.googleads.v10.resources.FeedAttribute.Builder getValueBuilder() {
      
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Output only. The feed attribute being added to the list.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedAttribute value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.ads.googleads.v10.resources.FeedAttributeOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            com.google.ads.googleads.v10.resources.FeedAttribute.getDefaultInstance() : value_;
      }
    }
    /**
     * <pre>
     * Output only. The feed attribute being added to the list.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.resources.FeedAttribute value = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.resources.FeedAttribute, com.google.ads.googleads.v10.resources.FeedAttribute.Builder, com.google.ads.googleads.v10.resources.FeedAttributeOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v10.resources.FeedAttribute, com.google.ads.googleads.v10.resources.FeedAttribute.Builder, com.google.ads.googleads.v10.resources.FeedAttributeOrBuilder>(
                getValue(),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.resources.FeedAttributeOperation)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.resources.FeedAttributeOperation)
  private static final com.google.ads.googleads.v10.resources.FeedAttributeOperation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.resources.FeedAttributeOperation();
  }

  public static com.google.ads.googleads.v10.resources.FeedAttributeOperation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeedAttributeOperation>
      PARSER = new com.google.protobuf.AbstractParser<FeedAttributeOperation>() {
    @java.lang.Override
    public FeedAttributeOperation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FeedAttributeOperation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FeedAttributeOperation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeedAttributeOperation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.resources.FeedAttributeOperation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


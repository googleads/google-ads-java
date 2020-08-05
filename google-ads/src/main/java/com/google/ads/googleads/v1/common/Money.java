// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/feed_common.proto

package com.google.ads.googleads.v1.common;

/**
 * <pre>
 * Represents a price in a particular currency.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.common.Money}
 */
public final class Money extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.common.Money)
    MoneyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Money.newBuilder() to construct.
  private Money(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Money() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Money();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Money(
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
          case 10: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (currencyCode_ != null) {
              subBuilder = currencyCode_.toBuilder();
            }
            currencyCode_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(currencyCode_);
              currencyCode_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.Int64Value.Builder subBuilder = null;
            if (amountMicros_ != null) {
              subBuilder = amountMicros_.toBuilder();
            }
            amountMicros_ = input.readMessage(com.google.protobuf.Int64Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(amountMicros_);
              amountMicros_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v1.common.FeedCommonProto.internal_static_google_ads_googleads_v1_common_Money_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.common.FeedCommonProto.internal_static_google_ads_googleads_v1_common_Money_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.common.Money.class, com.google.ads.googleads.v1.common.Money.Builder.class);
  }

  public static final int CURRENCY_CODE_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue currencyCode_;
  /**
   * <pre>
   * Three-character ISO 4217 currency code.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 1;</code>
   * @return Whether the currencyCode field is set.
   */
  @java.lang.Override
  public boolean hasCurrencyCode() {
    return currencyCode_ != null;
  }
  /**
   * <pre>
   * Three-character ISO 4217 currency code.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 1;</code>
   * @return The currencyCode.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getCurrencyCode() {
    return currencyCode_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : currencyCode_;
  }
  /**
   * <pre>
   * Three-character ISO 4217 currency code.
   * </pre>
   *
   * <code>.google.protobuf.StringValue currency_code = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getCurrencyCodeOrBuilder() {
    return getCurrencyCode();
  }

  public static final int AMOUNT_MICROS_FIELD_NUMBER = 2;
  private com.google.protobuf.Int64Value amountMicros_;
  /**
   * <pre>
   * Amount in micros. One million is equivalent to one unit.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value amount_micros = 2;</code>
   * @return Whether the amountMicros field is set.
   */
  @java.lang.Override
  public boolean hasAmountMicros() {
    return amountMicros_ != null;
  }
  /**
   * <pre>
   * Amount in micros. One million is equivalent to one unit.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value amount_micros = 2;</code>
   * @return The amountMicros.
   */
  @java.lang.Override
  public com.google.protobuf.Int64Value getAmountMicros() {
    return amountMicros_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : amountMicros_;
  }
  /**
   * <pre>
   * Amount in micros. One million is equivalent to one unit.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value amount_micros = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Int64ValueOrBuilder getAmountMicrosOrBuilder() {
    return getAmountMicros();
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
    if (currencyCode_ != null) {
      output.writeMessage(1, getCurrencyCode());
    }
    if (amountMicros_ != null) {
      output.writeMessage(2, getAmountMicros());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (currencyCode_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCurrencyCode());
    }
    if (amountMicros_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAmountMicros());
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
    if (!(obj instanceof com.google.ads.googleads.v1.common.Money)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.common.Money other = (com.google.ads.googleads.v1.common.Money) obj;

    if (hasCurrencyCode() != other.hasCurrencyCode()) return false;
    if (hasCurrencyCode()) {
      if (!getCurrencyCode()
          .equals(other.getCurrencyCode())) return false;
    }
    if (hasAmountMicros() != other.hasAmountMicros()) return false;
    if (hasAmountMicros()) {
      if (!getAmountMicros()
          .equals(other.getAmountMicros())) return false;
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
    if (hasCurrencyCode()) {
      hash = (37 * hash) + CURRENCY_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getCurrencyCode().hashCode();
    }
    if (hasAmountMicros()) {
      hash = (37 * hash) + AMOUNT_MICROS_FIELD_NUMBER;
      hash = (53 * hash) + getAmountMicros().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.common.Money parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.Money parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.Money parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.Money parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.Money parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.Money parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.Money parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.Money parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.Money parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.Money parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.Money parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.Money parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.common.Money prototype) {
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
   * Represents a price in a particular currency.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.common.Money}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.common.Money)
      com.google.ads.googleads.v1.common.MoneyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.common.FeedCommonProto.internal_static_google_ads_googleads_v1_common_Money_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.common.FeedCommonProto.internal_static_google_ads_googleads_v1_common_Money_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.common.Money.class, com.google.ads.googleads.v1.common.Money.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.common.Money.newBuilder()
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
      if (currencyCodeBuilder_ == null) {
        currencyCode_ = null;
      } else {
        currencyCode_ = null;
        currencyCodeBuilder_ = null;
      }
      if (amountMicrosBuilder_ == null) {
        amountMicros_ = null;
      } else {
        amountMicros_ = null;
        amountMicrosBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.common.FeedCommonProto.internal_static_google_ads_googleads_v1_common_Money_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.Money getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.common.Money.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.Money build() {
      com.google.ads.googleads.v1.common.Money result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.Money buildPartial() {
      com.google.ads.googleads.v1.common.Money result = new com.google.ads.googleads.v1.common.Money(this);
      if (currencyCodeBuilder_ == null) {
        result.currencyCode_ = currencyCode_;
      } else {
        result.currencyCode_ = currencyCodeBuilder_.build();
      }
      if (amountMicrosBuilder_ == null) {
        result.amountMicros_ = amountMicros_;
      } else {
        result.amountMicros_ = amountMicrosBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v1.common.Money) {
        return mergeFrom((com.google.ads.googleads.v1.common.Money)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.common.Money other) {
      if (other == com.google.ads.googleads.v1.common.Money.getDefaultInstance()) return this;
      if (other.hasCurrencyCode()) {
        mergeCurrencyCode(other.getCurrencyCode());
      }
      if (other.hasAmountMicros()) {
        mergeAmountMicros(other.getAmountMicros());
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
      com.google.ads.googleads.v1.common.Money parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.common.Money) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue currencyCode_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> currencyCodeBuilder_;
    /**
     * <pre>
     * Three-character ISO 4217 currency code.
     * </pre>
     *
     * <code>.google.protobuf.StringValue currency_code = 1;</code>
     * @return Whether the currencyCode field is set.
     */
    public boolean hasCurrencyCode() {
      return currencyCodeBuilder_ != null || currencyCode_ != null;
    }
    /**
     * <pre>
     * Three-character ISO 4217 currency code.
     * </pre>
     *
     * <code>.google.protobuf.StringValue currency_code = 1;</code>
     * @return The currencyCode.
     */
    public com.google.protobuf.StringValue getCurrencyCode() {
      if (currencyCodeBuilder_ == null) {
        return currencyCode_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : currencyCode_;
      } else {
        return currencyCodeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Three-character ISO 4217 currency code.
     * </pre>
     *
     * <code>.google.protobuf.StringValue currency_code = 1;</code>
     */
    public Builder setCurrencyCode(com.google.protobuf.StringValue value) {
      if (currencyCodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        currencyCode_ = value;
        onChanged();
      } else {
        currencyCodeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Three-character ISO 4217 currency code.
     * </pre>
     *
     * <code>.google.protobuf.StringValue currency_code = 1;</code>
     */
    public Builder setCurrencyCode(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (currencyCodeBuilder_ == null) {
        currencyCode_ = builderForValue.build();
        onChanged();
      } else {
        currencyCodeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Three-character ISO 4217 currency code.
     * </pre>
     *
     * <code>.google.protobuf.StringValue currency_code = 1;</code>
     */
    public Builder mergeCurrencyCode(com.google.protobuf.StringValue value) {
      if (currencyCodeBuilder_ == null) {
        if (currencyCode_ != null) {
          currencyCode_ =
            com.google.protobuf.StringValue.newBuilder(currencyCode_).mergeFrom(value).buildPartial();
        } else {
          currencyCode_ = value;
        }
        onChanged();
      } else {
        currencyCodeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Three-character ISO 4217 currency code.
     * </pre>
     *
     * <code>.google.protobuf.StringValue currency_code = 1;</code>
     */
    public Builder clearCurrencyCode() {
      if (currencyCodeBuilder_ == null) {
        currencyCode_ = null;
        onChanged();
      } else {
        currencyCode_ = null;
        currencyCodeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Three-character ISO 4217 currency code.
     * </pre>
     *
     * <code>.google.protobuf.StringValue currency_code = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getCurrencyCodeBuilder() {
      
      onChanged();
      return getCurrencyCodeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Three-character ISO 4217 currency code.
     * </pre>
     *
     * <code>.google.protobuf.StringValue currency_code = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getCurrencyCodeOrBuilder() {
      if (currencyCodeBuilder_ != null) {
        return currencyCodeBuilder_.getMessageOrBuilder();
      } else {
        return currencyCode_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : currencyCode_;
      }
    }
    /**
     * <pre>
     * Three-character ISO 4217 currency code.
     * </pre>
     *
     * <code>.google.protobuf.StringValue currency_code = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getCurrencyCodeFieldBuilder() {
      if (currencyCodeBuilder_ == null) {
        currencyCodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getCurrencyCode(),
                getParentForChildren(),
                isClean());
        currencyCode_ = null;
      }
      return currencyCodeBuilder_;
    }

    private com.google.protobuf.Int64Value amountMicros_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> amountMicrosBuilder_;
    /**
     * <pre>
     * Amount in micros. One million is equivalent to one unit.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value amount_micros = 2;</code>
     * @return Whether the amountMicros field is set.
     */
    public boolean hasAmountMicros() {
      return amountMicrosBuilder_ != null || amountMicros_ != null;
    }
    /**
     * <pre>
     * Amount in micros. One million is equivalent to one unit.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value amount_micros = 2;</code>
     * @return The amountMicros.
     */
    public com.google.protobuf.Int64Value getAmountMicros() {
      if (amountMicrosBuilder_ == null) {
        return amountMicros_ == null ? com.google.protobuf.Int64Value.getDefaultInstance() : amountMicros_;
      } else {
        return amountMicrosBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Amount in micros. One million is equivalent to one unit.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value amount_micros = 2;</code>
     */
    public Builder setAmountMicros(com.google.protobuf.Int64Value value) {
      if (amountMicrosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        amountMicros_ = value;
        onChanged();
      } else {
        amountMicrosBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Amount in micros. One million is equivalent to one unit.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value amount_micros = 2;</code>
     */
    public Builder setAmountMicros(
        com.google.protobuf.Int64Value.Builder builderForValue) {
      if (amountMicrosBuilder_ == null) {
        amountMicros_ = builderForValue.build();
        onChanged();
      } else {
        amountMicrosBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Amount in micros. One million is equivalent to one unit.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value amount_micros = 2;</code>
     */
    public Builder mergeAmountMicros(com.google.protobuf.Int64Value value) {
      if (amountMicrosBuilder_ == null) {
        if (amountMicros_ != null) {
          amountMicros_ =
            com.google.protobuf.Int64Value.newBuilder(amountMicros_).mergeFrom(value).buildPartial();
        } else {
          amountMicros_ = value;
        }
        onChanged();
      } else {
        amountMicrosBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Amount in micros. One million is equivalent to one unit.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value amount_micros = 2;</code>
     */
    public Builder clearAmountMicros() {
      if (amountMicrosBuilder_ == null) {
        amountMicros_ = null;
        onChanged();
      } else {
        amountMicros_ = null;
        amountMicrosBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Amount in micros. One million is equivalent to one unit.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value amount_micros = 2;</code>
     */
    public com.google.protobuf.Int64Value.Builder getAmountMicrosBuilder() {
      
      onChanged();
      return getAmountMicrosFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Amount in micros. One million is equivalent to one unit.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value amount_micros = 2;</code>
     */
    public com.google.protobuf.Int64ValueOrBuilder getAmountMicrosOrBuilder() {
      if (amountMicrosBuilder_ != null) {
        return amountMicrosBuilder_.getMessageOrBuilder();
      } else {
        return amountMicros_ == null ?
            com.google.protobuf.Int64Value.getDefaultInstance() : amountMicros_;
      }
    }
    /**
     * <pre>
     * Amount in micros. One million is equivalent to one unit.
     * </pre>
     *
     * <code>.google.protobuf.Int64Value amount_micros = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder> 
        getAmountMicrosFieldBuilder() {
      if (amountMicrosBuilder_ == null) {
        amountMicrosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Int64Value, com.google.protobuf.Int64Value.Builder, com.google.protobuf.Int64ValueOrBuilder>(
                getAmountMicros(),
                getParentForChildren(),
                isClean());
        amountMicros_ = null;
      }
      return amountMicrosBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.common.Money)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.common.Money)
  private static final com.google.ads.googleads.v1.common.Money DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.common.Money();
  }

  public static com.google.ads.googleads.v1.common.Money getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Money>
      PARSER = new com.google.protobuf.AbstractParser<Money>() {
    @java.lang.Override
    public Money parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Money(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Money> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Money> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.common.Money getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

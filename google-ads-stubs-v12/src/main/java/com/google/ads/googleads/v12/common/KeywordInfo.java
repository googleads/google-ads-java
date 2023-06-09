// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/criteria.proto

package com.google.ads.googleads.v12.common;

/**
 * <pre>
 * A keyword criterion.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.common.KeywordInfo}
 */
public final class KeywordInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.common.KeywordInfo)
    KeywordInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordInfo.newBuilder() to construct.
  private KeywordInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordInfo() {
    text_ = "";
    matchType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeywordInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.common.CriteriaProto.internal_static_google_ads_googleads_v12_common_KeywordInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.common.CriteriaProto.internal_static_google_ads_googleads_v12_common_KeywordInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.common.KeywordInfo.class, com.google.ads.googleads.v12.common.KeywordInfo.Builder.class);
  }

  private int bitField0_;
  public static final int TEXT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object text_ = "";
  /**
   * <pre>
   * The text of the keyword (at most 80 characters and 10 words).
   * </pre>
   *
   * <code>optional string text = 3;</code>
   * @return Whether the text field is set.
   */
  @java.lang.Override
  public boolean hasText() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The text of the keyword (at most 80 characters and 10 words).
   * </pre>
   *
   * <code>optional string text = 3;</code>
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      text_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The text of the keyword (at most 80 characters and 10 words).
   * </pre>
   *
   * <code>optional string text = 3;</code>
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextBytes() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      text_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MATCH_TYPE_FIELD_NUMBER = 2;
  private int matchType_ = 0;
  /**
   * <pre>
   * The match type of the keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 2;</code>
   * @return The enum numeric value on the wire for matchType.
   */
  @java.lang.Override public int getMatchTypeValue() {
    return matchType_;
  }
  /**
   * <pre>
   * The match type of the keyword.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 2;</code>
   * @return The matchType.
   */
  @java.lang.Override public com.google.ads.googleads.v12.enums.KeywordMatchTypeEnum.KeywordMatchType getMatchType() {
    com.google.ads.googleads.v12.enums.KeywordMatchTypeEnum.KeywordMatchType result = com.google.ads.googleads.v12.enums.KeywordMatchTypeEnum.KeywordMatchType.forNumber(matchType_);
    return result == null ? com.google.ads.googleads.v12.enums.KeywordMatchTypeEnum.KeywordMatchType.UNRECOGNIZED : result;
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
    if (matchType_ != com.google.ads.googleads.v12.enums.KeywordMatchTypeEnum.KeywordMatchType.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, matchType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, text_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (matchType_ != com.google.ads.googleads.v12.enums.KeywordMatchTypeEnum.KeywordMatchType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, matchType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, text_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.common.KeywordInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.common.KeywordInfo other = (com.google.ads.googleads.v12.common.KeywordInfo) obj;

    if (hasText() != other.hasText()) return false;
    if (hasText()) {
      if (!getText()
          .equals(other.getText())) return false;
    }
    if (matchType_ != other.matchType_) return false;
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
    if (hasText()) {
      hash = (37 * hash) + TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getText().hashCode();
    }
    hash = (37 * hash) + MATCH_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + matchType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.common.KeywordInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.KeywordInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.KeywordInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.KeywordInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.KeywordInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.KeywordInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.KeywordInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.KeywordInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v12.common.KeywordInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v12.common.KeywordInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.KeywordInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.KeywordInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.common.KeywordInfo prototype) {
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
   * A keyword criterion.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.common.KeywordInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.common.KeywordInfo)
      com.google.ads.googleads.v12.common.KeywordInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.common.CriteriaProto.internal_static_google_ads_googleads_v12_common_KeywordInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.common.CriteriaProto.internal_static_google_ads_googleads_v12_common_KeywordInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.common.KeywordInfo.class, com.google.ads.googleads.v12.common.KeywordInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.common.KeywordInfo.newBuilder()
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
      text_ = "";
      matchType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.common.CriteriaProto.internal_static_google_ads_googleads_v12_common_KeywordInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.KeywordInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.common.KeywordInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.KeywordInfo build() {
      com.google.ads.googleads.v12.common.KeywordInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.KeywordInfo buildPartial() {
      com.google.ads.googleads.v12.common.KeywordInfo result = new com.google.ads.googleads.v12.common.KeywordInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.common.KeywordInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.text_ = text_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.matchType_ = matchType_;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.ads.googleads.v12.common.KeywordInfo) {
        return mergeFrom((com.google.ads.googleads.v12.common.KeywordInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.common.KeywordInfo other) {
      if (other == com.google.ads.googleads.v12.common.KeywordInfo.getDefaultInstance()) return this;
      if (other.hasText()) {
        text_ = other.text_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.matchType_ != 0) {
        setMatchTypeValue(other.getMatchTypeValue());
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
            case 16: {
              matchType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              text_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 26
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

    private java.lang.Object text_ = "";
    /**
     * <pre>
     * The text of the keyword (at most 80 characters and 10 words).
     * </pre>
     *
     * <code>optional string text = 3;</code>
     * @return Whether the text field is set.
     */
    public boolean hasText() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The text of the keyword (at most 80 characters and 10 words).
     * </pre>
     *
     * <code>optional string text = 3;</code>
     * @return The text.
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        text_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The text of the keyword (at most 80 characters and 10 words).
     * </pre>
     *
     * <code>optional string text = 3;</code>
     * @return The bytes for text.
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The text of the keyword (at most 80 characters and 10 words).
     * </pre>
     *
     * <code>optional string text = 3;</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      text_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The text of the keyword (at most 80 characters and 10 words).
     * </pre>
     *
     * <code>optional string text = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      text_ = getDefaultInstance().getText();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The text of the keyword (at most 80 characters and 10 words).
     * </pre>
     *
     * <code>optional string text = 3;</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      text_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int matchType_ = 0;
    /**
     * <pre>
     * The match type of the keyword.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 2;</code>
     * @return The enum numeric value on the wire for matchType.
     */
    @java.lang.Override public int getMatchTypeValue() {
      return matchType_;
    }
    /**
     * <pre>
     * The match type of the keyword.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 2;</code>
     * @param value The enum numeric value on the wire for matchType to set.
     * @return This builder for chaining.
     */
    public Builder setMatchTypeValue(int value) {
      matchType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The match type of the keyword.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 2;</code>
     * @return The matchType.
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.enums.KeywordMatchTypeEnum.KeywordMatchType getMatchType() {
      com.google.ads.googleads.v12.enums.KeywordMatchTypeEnum.KeywordMatchType result = com.google.ads.googleads.v12.enums.KeywordMatchTypeEnum.KeywordMatchType.forNumber(matchType_);
      return result == null ? com.google.ads.googleads.v12.enums.KeywordMatchTypeEnum.KeywordMatchType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The match type of the keyword.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 2;</code>
     * @param value The matchType to set.
     * @return This builder for chaining.
     */
    public Builder setMatchType(com.google.ads.googleads.v12.enums.KeywordMatchTypeEnum.KeywordMatchType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      matchType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The match type of the keyword.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.KeywordMatchTypeEnum.KeywordMatchType match_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMatchType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      matchType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.common.KeywordInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.common.KeywordInfo)
  private static final com.google.ads.googleads.v12.common.KeywordInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.common.KeywordInfo();
  }

  public static com.google.ads.googleads.v12.common.KeywordInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordInfo>
      PARSER = new com.google.protobuf.AbstractParser<KeywordInfo>() {
    @java.lang.Override
    public KeywordInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<KeywordInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.common.KeywordInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


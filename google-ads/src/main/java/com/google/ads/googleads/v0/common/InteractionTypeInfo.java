// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/criteria.proto

package com.google.ads.googleads.v0.common;

/**
 * <pre>
 * Criterion for Interaction Type.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v0.common.InteractionTypeInfo}
 */
public  final class InteractionTypeInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v0.common.InteractionTypeInfo)
    InteractionTypeInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InteractionTypeInfo.newBuilder() to construct.
  private InteractionTypeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InteractionTypeInfo() {
    type_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private InteractionTypeInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            type_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return com.google.ads.googleads.v0.common.CriteriaProto.internal_static_google_ads_googleads_v0_common_InteractionTypeInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v0.common.CriteriaProto.internal_static_google_ads_googleads_v0_common_InteractionTypeInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v0.common.InteractionTypeInfo.class, com.google.ads.googleads.v0.common.InteractionTypeInfo.Builder.class);
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * The interaction type.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.enums.InteractionTypeEnum.InteractionType type = 1;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * The interaction type.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.enums.InteractionTypeEnum.InteractionType type = 1;</code>
   */
  public com.google.ads.googleads.v0.enums.InteractionTypeEnum.InteractionType getType() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v0.enums.InteractionTypeEnum.InteractionType result = com.google.ads.googleads.v0.enums.InteractionTypeEnum.InteractionType.valueOf(type_);
    return result == null ? com.google.ads.googleads.v0.enums.InteractionTypeEnum.InteractionType.UNRECOGNIZED : result;
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
    if (type_ != com.google.ads.googleads.v0.enums.InteractionTypeEnum.InteractionType.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, type_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != com.google.ads.googleads.v0.enums.InteractionTypeEnum.InteractionType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
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
    if (!(obj instanceof com.google.ads.googleads.v0.common.InteractionTypeInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v0.common.InteractionTypeInfo other = (com.google.ads.googleads.v0.common.InteractionTypeInfo) obj;

    boolean result = true;
    result = result && type_ == other.type_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v0.common.InteractionTypeInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.common.InteractionTypeInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.InteractionTypeInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.common.InteractionTypeInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.InteractionTypeInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.common.InteractionTypeInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.InteractionTypeInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.common.InteractionTypeInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.InteractionTypeInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.common.InteractionTypeInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.InteractionTypeInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.common.InteractionTypeInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v0.common.InteractionTypeInfo prototype) {
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
   * Criterion for Interaction Type.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v0.common.InteractionTypeInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v0.common.InteractionTypeInfo)
      com.google.ads.googleads.v0.common.InteractionTypeInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.common.CriteriaProto.internal_static_google_ads_googleads_v0_common_InteractionTypeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v0.common.CriteriaProto.internal_static_google_ads_googleads_v0_common_InteractionTypeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v0.common.InteractionTypeInfo.class, com.google.ads.googleads.v0.common.InteractionTypeInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v0.common.InteractionTypeInfo.newBuilder()
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
      type_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v0.common.CriteriaProto.internal_static_google_ads_googleads_v0_common_InteractionTypeInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.common.InteractionTypeInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v0.common.InteractionTypeInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.common.InteractionTypeInfo build() {
      com.google.ads.googleads.v0.common.InteractionTypeInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.common.InteractionTypeInfo buildPartial() {
      com.google.ads.googleads.v0.common.InteractionTypeInfo result = new com.google.ads.googleads.v0.common.InteractionTypeInfo(this);
      result.type_ = type_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v0.common.InteractionTypeInfo) {
        return mergeFrom((com.google.ads.googleads.v0.common.InteractionTypeInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v0.common.InteractionTypeInfo other) {
      if (other == com.google.ads.googleads.v0.common.InteractionTypeInfo.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
      com.google.ads.googleads.v0.common.InteractionTypeInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v0.common.InteractionTypeInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <pre>
     * The interaction type.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.enums.InteractionTypeEnum.InteractionType type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * The interaction type.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.enums.InteractionTypeEnum.InteractionType type = 1;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The interaction type.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.enums.InteractionTypeEnum.InteractionType type = 1;</code>
     */
    public com.google.ads.googleads.v0.enums.InteractionTypeEnum.InteractionType getType() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v0.enums.InteractionTypeEnum.InteractionType result = com.google.ads.googleads.v0.enums.InteractionTypeEnum.InteractionType.valueOf(type_);
      return result == null ? com.google.ads.googleads.v0.enums.InteractionTypeEnum.InteractionType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The interaction type.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.enums.InteractionTypeEnum.InteractionType type = 1;</code>
     */
    public Builder setType(com.google.ads.googleads.v0.enums.InteractionTypeEnum.InteractionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The interaction type.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.enums.InteractionTypeEnum.InteractionType type = 1;</code>
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v0.common.InteractionTypeInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v0.common.InteractionTypeInfo)
  private static final com.google.ads.googleads.v0.common.InteractionTypeInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v0.common.InteractionTypeInfo();
  }

  public static com.google.ads.googleads.v0.common.InteractionTypeInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InteractionTypeInfo>
      PARSER = new com.google.protobuf.AbstractParser<InteractionTypeInfo>() {
    @java.lang.Override
    public InteractionTypeInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new InteractionTypeInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<InteractionTypeInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InteractionTypeInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v0.common.InteractionTypeInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


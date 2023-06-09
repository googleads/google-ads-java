// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/common/asset_types.proto

package com.google.ads.googleads.v13.common;

/**
 * <pre>
 * A call to action asset.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v13.common.CallToActionAsset}
 */
public final class CallToActionAsset extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v13.common.CallToActionAsset)
    CallToActionAssetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CallToActionAsset.newBuilder() to construct.
  private CallToActionAsset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CallToActionAsset() {
    callToAction_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CallToActionAsset();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v13.common.AssetTypesProto.internal_static_google_ads_googleads_v13_common_CallToActionAsset_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v13.common.AssetTypesProto.internal_static_google_ads_googleads_v13_common_CallToActionAsset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v13.common.CallToActionAsset.class, com.google.ads.googleads.v13.common.CallToActionAsset.Builder.class);
  }

  public static final int CALL_TO_ACTION_FIELD_NUMBER = 1;
  private int callToAction_ = 0;
  /**
   * <pre>
   * Call to action.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.CallToActionTypeEnum.CallToActionType call_to_action = 1;</code>
   * @return The enum numeric value on the wire for callToAction.
   */
  @java.lang.Override public int getCallToActionValue() {
    return callToAction_;
  }
  /**
   * <pre>
   * Call to action.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.CallToActionTypeEnum.CallToActionType call_to_action = 1;</code>
   * @return The callToAction.
   */
  @java.lang.Override public com.google.ads.googleads.v13.enums.CallToActionTypeEnum.CallToActionType getCallToAction() {
    com.google.ads.googleads.v13.enums.CallToActionTypeEnum.CallToActionType result = com.google.ads.googleads.v13.enums.CallToActionTypeEnum.CallToActionType.forNumber(callToAction_);
    return result == null ? com.google.ads.googleads.v13.enums.CallToActionTypeEnum.CallToActionType.UNRECOGNIZED : result;
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
    if (callToAction_ != com.google.ads.googleads.v13.enums.CallToActionTypeEnum.CallToActionType.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, callToAction_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (callToAction_ != com.google.ads.googleads.v13.enums.CallToActionTypeEnum.CallToActionType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, callToAction_);
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
    if (!(obj instanceof com.google.ads.googleads.v13.common.CallToActionAsset)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v13.common.CallToActionAsset other = (com.google.ads.googleads.v13.common.CallToActionAsset) obj;

    if (callToAction_ != other.callToAction_) return false;
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
    hash = (37 * hash) + CALL_TO_ACTION_FIELD_NUMBER;
    hash = (53 * hash) + callToAction_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v13.common.CallToActionAsset parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.common.CallToActionAsset parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.CallToActionAsset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.common.CallToActionAsset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.CallToActionAsset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.common.CallToActionAsset parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.CallToActionAsset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.common.CallToActionAsset parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v13.common.CallToActionAsset parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v13.common.CallToActionAsset parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.CallToActionAsset parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.common.CallToActionAsset parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v13.common.CallToActionAsset prototype) {
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
   * A call to action asset.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v13.common.CallToActionAsset}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v13.common.CallToActionAsset)
      com.google.ads.googleads.v13.common.CallToActionAssetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v13.common.AssetTypesProto.internal_static_google_ads_googleads_v13_common_CallToActionAsset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v13.common.AssetTypesProto.internal_static_google_ads_googleads_v13_common_CallToActionAsset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v13.common.CallToActionAsset.class, com.google.ads.googleads.v13.common.CallToActionAsset.Builder.class);
    }

    // Construct using com.google.ads.googleads.v13.common.CallToActionAsset.newBuilder()
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
      callToAction_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v13.common.AssetTypesProto.internal_static_google_ads_googleads_v13_common_CallToActionAsset_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.common.CallToActionAsset getDefaultInstanceForType() {
      return com.google.ads.googleads.v13.common.CallToActionAsset.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.common.CallToActionAsset build() {
      com.google.ads.googleads.v13.common.CallToActionAsset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.common.CallToActionAsset buildPartial() {
      com.google.ads.googleads.v13.common.CallToActionAsset result = new com.google.ads.googleads.v13.common.CallToActionAsset(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v13.common.CallToActionAsset result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.callToAction_ = callToAction_;
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
      if (other instanceof com.google.ads.googleads.v13.common.CallToActionAsset) {
        return mergeFrom((com.google.ads.googleads.v13.common.CallToActionAsset)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v13.common.CallToActionAsset other) {
      if (other == com.google.ads.googleads.v13.common.CallToActionAsset.getDefaultInstance()) return this;
      if (other.callToAction_ != 0) {
        setCallToActionValue(other.getCallToActionValue());
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
              callToAction_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int callToAction_ = 0;
    /**
     * <pre>
     * Call to action.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.enums.CallToActionTypeEnum.CallToActionType call_to_action = 1;</code>
     * @return The enum numeric value on the wire for callToAction.
     */
    @java.lang.Override public int getCallToActionValue() {
      return callToAction_;
    }
    /**
     * <pre>
     * Call to action.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.enums.CallToActionTypeEnum.CallToActionType call_to_action = 1;</code>
     * @param value The enum numeric value on the wire for callToAction to set.
     * @return This builder for chaining.
     */
    public Builder setCallToActionValue(int value) {
      callToAction_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Call to action.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.enums.CallToActionTypeEnum.CallToActionType call_to_action = 1;</code>
     * @return The callToAction.
     */
    @java.lang.Override
    public com.google.ads.googleads.v13.enums.CallToActionTypeEnum.CallToActionType getCallToAction() {
      com.google.ads.googleads.v13.enums.CallToActionTypeEnum.CallToActionType result = com.google.ads.googleads.v13.enums.CallToActionTypeEnum.CallToActionType.forNumber(callToAction_);
      return result == null ? com.google.ads.googleads.v13.enums.CallToActionTypeEnum.CallToActionType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Call to action.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.enums.CallToActionTypeEnum.CallToActionType call_to_action = 1;</code>
     * @param value The callToAction to set.
     * @return This builder for chaining.
     */
    public Builder setCallToAction(com.google.ads.googleads.v13.enums.CallToActionTypeEnum.CallToActionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      callToAction_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Call to action.
     * </pre>
     *
     * <code>.google.ads.googleads.v13.enums.CallToActionTypeEnum.CallToActionType call_to_action = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCallToAction() {
      bitField0_ = (bitField0_ & ~0x00000001);
      callToAction_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v13.common.CallToActionAsset)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v13.common.CallToActionAsset)
  private static final com.google.ads.googleads.v13.common.CallToActionAsset DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v13.common.CallToActionAsset();
  }

  public static com.google.ads.googleads.v13.common.CallToActionAsset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CallToActionAsset>
      PARSER = new com.google.protobuf.AbstractParser<CallToActionAsset>() {
    @java.lang.Override
    public CallToActionAsset parsePartialFrom(
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

  public static com.google.protobuf.Parser<CallToActionAsset> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CallToActionAsset> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v13.common.CallToActionAsset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/criteria.proto

package com.google.ads.googleads.v0.common;

/**
 * <pre>
 * State the hotel is located in.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v0.common.HotelStateInfo}
 */
public  final class HotelStateInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v0.common.HotelStateInfo)
    HotelStateInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HotelStateInfo.newBuilder() to construct.
  private HotelStateInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HotelStateInfo() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HotelStateInfo(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (stateCriterion_ != null) {
              subBuilder = stateCriterion_.toBuilder();
            }
            stateCriterion_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(stateCriterion_);
              stateCriterion_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v0.common.CriteriaProto.internal_static_google_ads_googleads_v0_common_HotelStateInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v0.common.CriteriaProto.internal_static_google_ads_googleads_v0_common_HotelStateInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v0.common.HotelStateInfo.class, com.google.ads.googleads.v0.common.HotelStateInfo.Builder.class);
  }

  public static final int STATE_CRITERION_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue stateCriterion_;
  /**
   * <pre>
   * The Geo Target Constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue state_criterion = 1;</code>
   */
  public boolean hasStateCriterion() {
    return stateCriterion_ != null;
  }
  /**
   * <pre>
   * The Geo Target Constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue state_criterion = 1;</code>
   */
  public com.google.protobuf.StringValue getStateCriterion() {
    return stateCriterion_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : stateCriterion_;
  }
  /**
   * <pre>
   * The Geo Target Constant resource name.
   * </pre>
   *
   * <code>.google.protobuf.StringValue state_criterion = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getStateCriterionOrBuilder() {
    return getStateCriterion();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (stateCriterion_ != null) {
      output.writeMessage(1, getStateCriterion());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (stateCriterion_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getStateCriterion());
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
    if (!(obj instanceof com.google.ads.googleads.v0.common.HotelStateInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v0.common.HotelStateInfo other = (com.google.ads.googleads.v0.common.HotelStateInfo) obj;

    boolean result = true;
    result = result && (hasStateCriterion() == other.hasStateCriterion());
    if (hasStateCriterion()) {
      result = result && getStateCriterion()
          .equals(other.getStateCriterion());
    }
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
    if (hasStateCriterion()) {
      hash = (37 * hash) + STATE_CRITERION_FIELD_NUMBER;
      hash = (53 * hash) + getStateCriterion().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v0.common.HotelStateInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.common.HotelStateInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.HotelStateInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.common.HotelStateInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.HotelStateInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.common.HotelStateInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.HotelStateInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.common.HotelStateInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.HotelStateInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.common.HotelStateInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.HotelStateInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.common.HotelStateInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v0.common.HotelStateInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * State the hotel is located in.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v0.common.HotelStateInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v0.common.HotelStateInfo)
      com.google.ads.googleads.v0.common.HotelStateInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.common.CriteriaProto.internal_static_google_ads_googleads_v0_common_HotelStateInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v0.common.CriteriaProto.internal_static_google_ads_googleads_v0_common_HotelStateInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v0.common.HotelStateInfo.class, com.google.ads.googleads.v0.common.HotelStateInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v0.common.HotelStateInfo.newBuilder()
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
    public Builder clear() {
      super.clear();
      if (stateCriterionBuilder_ == null) {
        stateCriterion_ = null;
      } else {
        stateCriterion_ = null;
        stateCriterionBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v0.common.CriteriaProto.internal_static_google_ads_googleads_v0_common_HotelStateInfo_descriptor;
    }

    public com.google.ads.googleads.v0.common.HotelStateInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v0.common.HotelStateInfo.getDefaultInstance();
    }

    public com.google.ads.googleads.v0.common.HotelStateInfo build() {
      com.google.ads.googleads.v0.common.HotelStateInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.ads.googleads.v0.common.HotelStateInfo buildPartial() {
      com.google.ads.googleads.v0.common.HotelStateInfo result = new com.google.ads.googleads.v0.common.HotelStateInfo(this);
      if (stateCriterionBuilder_ == null) {
        result.stateCriterion_ = stateCriterion_;
      } else {
        result.stateCriterion_ = stateCriterionBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v0.common.HotelStateInfo) {
        return mergeFrom((com.google.ads.googleads.v0.common.HotelStateInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v0.common.HotelStateInfo other) {
      if (other == com.google.ads.googleads.v0.common.HotelStateInfo.getDefaultInstance()) return this;
      if (other.hasStateCriterion()) {
        mergeStateCriterion(other.getStateCriterion());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v0.common.HotelStateInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v0.common.HotelStateInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue stateCriterion_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> stateCriterionBuilder_;
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue state_criterion = 1;</code>
     */
    public boolean hasStateCriterion() {
      return stateCriterionBuilder_ != null || stateCriterion_ != null;
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue state_criterion = 1;</code>
     */
    public com.google.protobuf.StringValue getStateCriterion() {
      if (stateCriterionBuilder_ == null) {
        return stateCriterion_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : stateCriterion_;
      } else {
        return stateCriterionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue state_criterion = 1;</code>
     */
    public Builder setStateCriterion(com.google.protobuf.StringValue value) {
      if (stateCriterionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        stateCriterion_ = value;
        onChanged();
      } else {
        stateCriterionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue state_criterion = 1;</code>
     */
    public Builder setStateCriterion(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (stateCriterionBuilder_ == null) {
        stateCriterion_ = builderForValue.build();
        onChanged();
      } else {
        stateCriterionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue state_criterion = 1;</code>
     */
    public Builder mergeStateCriterion(com.google.protobuf.StringValue value) {
      if (stateCriterionBuilder_ == null) {
        if (stateCriterion_ != null) {
          stateCriterion_ =
            com.google.protobuf.StringValue.newBuilder(stateCriterion_).mergeFrom(value).buildPartial();
        } else {
          stateCriterion_ = value;
        }
        onChanged();
      } else {
        stateCriterionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue state_criterion = 1;</code>
     */
    public Builder clearStateCriterion() {
      if (stateCriterionBuilder_ == null) {
        stateCriterion_ = null;
        onChanged();
      } else {
        stateCriterion_ = null;
        stateCriterionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue state_criterion = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getStateCriterionBuilder() {
      
      onChanged();
      return getStateCriterionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue state_criterion = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getStateCriterionOrBuilder() {
      if (stateCriterionBuilder_ != null) {
        return stateCriterionBuilder_.getMessageOrBuilder();
      } else {
        return stateCriterion_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : stateCriterion_;
      }
    }
    /**
     * <pre>
     * The Geo Target Constant resource name.
     * </pre>
     *
     * <code>.google.protobuf.StringValue state_criterion = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getStateCriterionFieldBuilder() {
      if (stateCriterionBuilder_ == null) {
        stateCriterionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getStateCriterion(),
                getParentForChildren(),
                isClean());
        stateCriterion_ = null;
      }
      return stateCriterionBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v0.common.HotelStateInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v0.common.HotelStateInfo)
  private static final com.google.ads.googleads.v0.common.HotelStateInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v0.common.HotelStateInfo();
  }

  public static com.google.ads.googleads.v0.common.HotelStateInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HotelStateInfo>
      PARSER = new com.google.protobuf.AbstractParser<HotelStateInfo>() {
    public HotelStateInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HotelStateInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HotelStateInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HotelStateInfo> getParserForType() {
    return PARSER;
  }

  public com.google.ads.googleads.v0.common.HotelStateInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


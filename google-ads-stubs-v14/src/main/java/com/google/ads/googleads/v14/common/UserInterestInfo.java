// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/criteria.proto

package com.google.ads.googleads.v14.common;

/**
 * <pre>
 * Represents a particular interest-based topic to be targeted.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.common.UserInterestInfo}
 */
public final class UserInterestInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.common.UserInterestInfo)
    UserInterestInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserInterestInfo.newBuilder() to construct.
  private UserInterestInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserInterestInfo() {
    userInterestCategory_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserInterestInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.common.CriteriaProto.internal_static_google_ads_googleads_v14_common_UserInterestInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.common.CriteriaProto.internal_static_google_ads_googleads_v14_common_UserInterestInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.common.UserInterestInfo.class, com.google.ads.googleads.v14.common.UserInterestInfo.Builder.class);
  }

  private int bitField0_;
  public static final int USER_INTEREST_CATEGORY_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userInterestCategory_ = "";
  /**
   * <pre>
   * The UserInterest resource name.
   * </pre>
   *
   * <code>optional string user_interest_category = 2;</code>
   * @return Whether the userInterestCategory field is set.
   */
  @java.lang.Override
  public boolean hasUserInterestCategory() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The UserInterest resource name.
   * </pre>
   *
   * <code>optional string user_interest_category = 2;</code>
   * @return The userInterestCategory.
   */
  @java.lang.Override
  public java.lang.String getUserInterestCategory() {
    java.lang.Object ref = userInterestCategory_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userInterestCategory_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The UserInterest resource name.
   * </pre>
   *
   * <code>optional string user_interest_category = 2;</code>
   * @return The bytes for userInterestCategory.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserInterestCategoryBytes() {
    java.lang.Object ref = userInterestCategory_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userInterestCategory_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userInterestCategory_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userInterestCategory_);
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
    if (!(obj instanceof com.google.ads.googleads.v14.common.UserInterestInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.common.UserInterestInfo other = (com.google.ads.googleads.v14.common.UserInterestInfo) obj;

    if (hasUserInterestCategory() != other.hasUserInterestCategory()) return false;
    if (hasUserInterestCategory()) {
      if (!getUserInterestCategory()
          .equals(other.getUserInterestCategory())) return false;
    }
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
    if (hasUserInterestCategory()) {
      hash = (37 * hash) + USER_INTEREST_CATEGORY_FIELD_NUMBER;
      hash = (53 * hash) + getUserInterestCategory().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v14.common.UserInterestInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.UserInterestInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.UserInterestInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.UserInterestInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.UserInterestInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.UserInterestInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.UserInterestInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.common.UserInterestInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.common.UserInterestInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.common.UserInterestInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.UserInterestInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.common.UserInterestInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.common.UserInterestInfo prototype) {
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
   * Represents a particular interest-based topic to be targeted.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.common.UserInterestInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.common.UserInterestInfo)
      com.google.ads.googleads.v14.common.UserInterestInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.common.CriteriaProto.internal_static_google_ads_googleads_v14_common_UserInterestInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.common.CriteriaProto.internal_static_google_ads_googleads_v14_common_UserInterestInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.common.UserInterestInfo.class, com.google.ads.googleads.v14.common.UserInterestInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.common.UserInterestInfo.newBuilder()
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
      userInterestCategory_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v14.common.CriteriaProto.internal_static_google_ads_googleads_v14_common_UserInterestInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.UserInterestInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.common.UserInterestInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.UserInterestInfo build() {
      com.google.ads.googleads.v14.common.UserInterestInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.UserInterestInfo buildPartial() {
      com.google.ads.googleads.v14.common.UserInterestInfo result = new com.google.ads.googleads.v14.common.UserInterestInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v14.common.UserInterestInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userInterestCategory_ = userInterestCategory_;
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.ads.googleads.v14.common.UserInterestInfo) {
        return mergeFrom((com.google.ads.googleads.v14.common.UserInterestInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.common.UserInterestInfo other) {
      if (other == com.google.ads.googleads.v14.common.UserInterestInfo.getDefaultInstance()) return this;
      if (other.hasUserInterestCategory()) {
        userInterestCategory_ = other.userInterestCategory_;
        bitField0_ |= 0x00000001;
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
            case 18: {
              userInterestCategory_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
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

    private java.lang.Object userInterestCategory_ = "";
    /**
     * <pre>
     * The UserInterest resource name.
     * </pre>
     *
     * <code>optional string user_interest_category = 2;</code>
     * @return Whether the userInterestCategory field is set.
     */
    public boolean hasUserInterestCategory() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The UserInterest resource name.
     * </pre>
     *
     * <code>optional string user_interest_category = 2;</code>
     * @return The userInterestCategory.
     */
    public java.lang.String getUserInterestCategory() {
      java.lang.Object ref = userInterestCategory_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userInterestCategory_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The UserInterest resource name.
     * </pre>
     *
     * <code>optional string user_interest_category = 2;</code>
     * @return The bytes for userInterestCategory.
     */
    public com.google.protobuf.ByteString
        getUserInterestCategoryBytes() {
      java.lang.Object ref = userInterestCategory_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userInterestCategory_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The UserInterest resource name.
     * </pre>
     *
     * <code>optional string user_interest_category = 2;</code>
     * @param value The userInterestCategory to set.
     * @return This builder for chaining.
     */
    public Builder setUserInterestCategory(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userInterestCategory_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The UserInterest resource name.
     * </pre>
     *
     * <code>optional string user_interest_category = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserInterestCategory() {
      userInterestCategory_ = getDefaultInstance().getUserInterestCategory();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The UserInterest resource name.
     * </pre>
     *
     * <code>optional string user_interest_category = 2;</code>
     * @param value The bytes for userInterestCategory to set.
     * @return This builder for chaining.
     */
    public Builder setUserInterestCategoryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userInterestCategory_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.common.UserInterestInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.common.UserInterestInfo)
  private static final com.google.ads.googleads.v14.common.UserInterestInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.common.UserInterestInfo();
  }

  public static com.google.ads.googleads.v14.common.UserInterestInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserInterestInfo>
      PARSER = new com.google.protobuf.AbstractParser<UserInterestInfo>() {
    @java.lang.Override
    public UserInterestInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserInterestInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserInterestInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.common.UserInterestInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/common/user_lists.proto

package com.google.ads.googleads.v5.common;

/**
 * <pre>
 * Operand of logical user list that consists of a user list.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v5.common.LogicalUserListOperandInfo}
 */
public final class LogicalUserListOperandInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v5.common.LogicalUserListOperandInfo)
    LogicalUserListOperandInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogicalUserListOperandInfo.newBuilder() to construct.
  private LogicalUserListOperandInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogicalUserListOperandInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LogicalUserListOperandInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LogicalUserListOperandInfo(
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
            if (userList_ != null) {
              subBuilder = userList_.toBuilder();
            }
            userList_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(userList_);
              userList_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v5.common.UserListsProto.internal_static_google_ads_googleads_v5_common_LogicalUserListOperandInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v5.common.UserListsProto.internal_static_google_ads_googleads_v5_common_LogicalUserListOperandInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v5.common.LogicalUserListOperandInfo.class, com.google.ads.googleads.v5.common.LogicalUserListOperandInfo.Builder.class);
  }

  public static final int USER_LIST_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue userList_;
  /**
   * <pre>
   * Resource name of a user list as an operand.
   * </pre>
   *
   * <code>.google.protobuf.StringValue user_list = 1;</code>
   * @return Whether the userList field is set.
   */
  @java.lang.Override
  public boolean hasUserList() {
    return userList_ != null;
  }
  /**
   * <pre>
   * Resource name of a user list as an operand.
   * </pre>
   *
   * <code>.google.protobuf.StringValue user_list = 1;</code>
   * @return The userList.
   */
  @java.lang.Override
  public com.google.protobuf.StringValue getUserList() {
    return userList_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : userList_;
  }
  /**
   * <pre>
   * Resource name of a user list as an operand.
   * </pre>
   *
   * <code>.google.protobuf.StringValue user_list = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StringValueOrBuilder getUserListOrBuilder() {
    return getUserList();
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
    if (userList_ != null) {
      output.writeMessage(1, getUserList());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userList_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUserList());
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
    if (!(obj instanceof com.google.ads.googleads.v5.common.LogicalUserListOperandInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v5.common.LogicalUserListOperandInfo other = (com.google.ads.googleads.v5.common.LogicalUserListOperandInfo) obj;

    if (hasUserList() != other.hasUserList()) return false;
    if (hasUserList()) {
      if (!getUserList()
          .equals(other.getUserList())) return false;
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
    if (hasUserList()) {
      hash = (37 * hash) + USER_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getUserList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v5.common.LogicalUserListOperandInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v5.common.LogicalUserListOperandInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v5.common.LogicalUserListOperandInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v5.common.LogicalUserListOperandInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v5.common.LogicalUserListOperandInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v5.common.LogicalUserListOperandInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v5.common.LogicalUserListOperandInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v5.common.LogicalUserListOperandInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v5.common.LogicalUserListOperandInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v5.common.LogicalUserListOperandInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v5.common.LogicalUserListOperandInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v5.common.LogicalUserListOperandInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v5.common.LogicalUserListOperandInfo prototype) {
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
   * Operand of logical user list that consists of a user list.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v5.common.LogicalUserListOperandInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v5.common.LogicalUserListOperandInfo)
      com.google.ads.googleads.v5.common.LogicalUserListOperandInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v5.common.UserListsProto.internal_static_google_ads_googleads_v5_common_LogicalUserListOperandInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v5.common.UserListsProto.internal_static_google_ads_googleads_v5_common_LogicalUserListOperandInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v5.common.LogicalUserListOperandInfo.class, com.google.ads.googleads.v5.common.LogicalUserListOperandInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v5.common.LogicalUserListOperandInfo.newBuilder()
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
      if (userListBuilder_ == null) {
        userList_ = null;
      } else {
        userList_ = null;
        userListBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v5.common.UserListsProto.internal_static_google_ads_googleads_v5_common_LogicalUserListOperandInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v5.common.LogicalUserListOperandInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v5.common.LogicalUserListOperandInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v5.common.LogicalUserListOperandInfo build() {
      com.google.ads.googleads.v5.common.LogicalUserListOperandInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v5.common.LogicalUserListOperandInfo buildPartial() {
      com.google.ads.googleads.v5.common.LogicalUserListOperandInfo result = new com.google.ads.googleads.v5.common.LogicalUserListOperandInfo(this);
      if (userListBuilder_ == null) {
        result.userList_ = userList_;
      } else {
        result.userList_ = userListBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v5.common.LogicalUserListOperandInfo) {
        return mergeFrom((com.google.ads.googleads.v5.common.LogicalUserListOperandInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v5.common.LogicalUserListOperandInfo other) {
      if (other == com.google.ads.googleads.v5.common.LogicalUserListOperandInfo.getDefaultInstance()) return this;
      if (other.hasUserList()) {
        mergeUserList(other.getUserList());
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
      com.google.ads.googleads.v5.common.LogicalUserListOperandInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v5.common.LogicalUserListOperandInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue userList_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> userListBuilder_;
    /**
     * <pre>
     * Resource name of a user list as an operand.
     * </pre>
     *
     * <code>.google.protobuf.StringValue user_list = 1;</code>
     * @return Whether the userList field is set.
     */
    public boolean hasUserList() {
      return userListBuilder_ != null || userList_ != null;
    }
    /**
     * <pre>
     * Resource name of a user list as an operand.
     * </pre>
     *
     * <code>.google.protobuf.StringValue user_list = 1;</code>
     * @return The userList.
     */
    public com.google.protobuf.StringValue getUserList() {
      if (userListBuilder_ == null) {
        return userList_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : userList_;
      } else {
        return userListBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Resource name of a user list as an operand.
     * </pre>
     *
     * <code>.google.protobuf.StringValue user_list = 1;</code>
     */
    public Builder setUserList(com.google.protobuf.StringValue value) {
      if (userListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        userList_ = value;
        onChanged();
      } else {
        userListBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Resource name of a user list as an operand.
     * </pre>
     *
     * <code>.google.protobuf.StringValue user_list = 1;</code>
     */
    public Builder setUserList(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (userListBuilder_ == null) {
        userList_ = builderForValue.build();
        onChanged();
      } else {
        userListBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Resource name of a user list as an operand.
     * </pre>
     *
     * <code>.google.protobuf.StringValue user_list = 1;</code>
     */
    public Builder mergeUserList(com.google.protobuf.StringValue value) {
      if (userListBuilder_ == null) {
        if (userList_ != null) {
          userList_ =
            com.google.protobuf.StringValue.newBuilder(userList_).mergeFrom(value).buildPartial();
        } else {
          userList_ = value;
        }
        onChanged();
      } else {
        userListBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Resource name of a user list as an operand.
     * </pre>
     *
     * <code>.google.protobuf.StringValue user_list = 1;</code>
     */
    public Builder clearUserList() {
      if (userListBuilder_ == null) {
        userList_ = null;
        onChanged();
      } else {
        userList_ = null;
        userListBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Resource name of a user list as an operand.
     * </pre>
     *
     * <code>.google.protobuf.StringValue user_list = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getUserListBuilder() {
      
      onChanged();
      return getUserListFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Resource name of a user list as an operand.
     * </pre>
     *
     * <code>.google.protobuf.StringValue user_list = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getUserListOrBuilder() {
      if (userListBuilder_ != null) {
        return userListBuilder_.getMessageOrBuilder();
      } else {
        return userList_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : userList_;
      }
    }
    /**
     * <pre>
     * Resource name of a user list as an operand.
     * </pre>
     *
     * <code>.google.protobuf.StringValue user_list = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getUserListFieldBuilder() {
      if (userListBuilder_ == null) {
        userListBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getUserList(),
                getParentForChildren(),
                isClean());
        userList_ = null;
      }
      return userListBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v5.common.LogicalUserListOperandInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v5.common.LogicalUserListOperandInfo)
  private static final com.google.ads.googleads.v5.common.LogicalUserListOperandInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v5.common.LogicalUserListOperandInfo();
  }

  public static com.google.ads.googleads.v5.common.LogicalUserListOperandInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogicalUserListOperandInfo>
      PARSER = new com.google.protobuf.AbstractParser<LogicalUserListOperandInfo>() {
    @java.lang.Override
    public LogicalUserListOperandInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LogicalUserListOperandInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LogicalUserListOperandInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogicalUserListOperandInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v5.common.LogicalUserListOperandInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


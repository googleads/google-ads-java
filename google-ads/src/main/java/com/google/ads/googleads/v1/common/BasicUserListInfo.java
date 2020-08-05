// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v1/common/user_lists.proto

package com.google.ads.googleads.v1.common;

/**
 * <pre>
 * User list targeting as a collection of conversions or remarketing actions.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v1.common.BasicUserListInfo}
 */
public final class BasicUserListInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v1.common.BasicUserListInfo)
    BasicUserListInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BasicUserListInfo.newBuilder() to construct.
  private BasicUserListInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BasicUserListInfo() {
    actions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BasicUserListInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BasicUserListInfo(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              actions_ = new java.util.ArrayList<com.google.ads.googleads.v1.common.UserListActionInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            actions_.add(
                input.readMessage(com.google.ads.googleads.v1.common.UserListActionInfo.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        actions_ = java.util.Collections.unmodifiableList(actions_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v1.common.UserListsProto.internal_static_google_ads_googleads_v1_common_BasicUserListInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v1.common.UserListsProto.internal_static_google_ads_googleads_v1_common_BasicUserListInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v1.common.BasicUserListInfo.class, com.google.ads.googleads.v1.common.BasicUserListInfo.Builder.class);
  }

  public static final int ACTIONS_FIELD_NUMBER = 1;
  private java.util.List<com.google.ads.googleads.v1.common.UserListActionInfo> actions_;
  /**
   * <pre>
   * Actions associated with this user list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v1.common.UserListActionInfo> getActionsList() {
    return actions_;
  }
  /**
   * <pre>
   * Actions associated with this user list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v1.common.UserListActionInfoOrBuilder> 
      getActionsOrBuilderList() {
    return actions_;
  }
  /**
   * <pre>
   * Actions associated with this user list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
   */
  @java.lang.Override
  public int getActionsCount() {
    return actions_.size();
  }
  /**
   * <pre>
   * Actions associated with this user list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v1.common.UserListActionInfo getActions(int index) {
    return actions_.get(index);
  }
  /**
   * <pre>
   * Actions associated with this user list.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v1.common.UserListActionInfoOrBuilder getActionsOrBuilder(
      int index) {
    return actions_.get(index);
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
    for (int i = 0; i < actions_.size(); i++) {
      output.writeMessage(1, actions_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < actions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, actions_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v1.common.BasicUserListInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v1.common.BasicUserListInfo other = (com.google.ads.googleads.v1.common.BasicUserListInfo) obj;

    if (!getActionsList()
        .equals(other.getActionsList())) return false;
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
    if (getActionsCount() > 0) {
      hash = (37 * hash) + ACTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getActionsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v1.common.BasicUserListInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.BasicUserListInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.BasicUserListInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.BasicUserListInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.BasicUserListInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v1.common.BasicUserListInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.BasicUserListInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.BasicUserListInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.BasicUserListInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.BasicUserListInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v1.common.BasicUserListInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v1.common.BasicUserListInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v1.common.BasicUserListInfo prototype) {
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
   * User list targeting as a collection of conversions or remarketing actions.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v1.common.BasicUserListInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v1.common.BasicUserListInfo)
      com.google.ads.googleads.v1.common.BasicUserListInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v1.common.UserListsProto.internal_static_google_ads_googleads_v1_common_BasicUserListInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v1.common.UserListsProto.internal_static_google_ads_googleads_v1_common_BasicUserListInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v1.common.BasicUserListInfo.class, com.google.ads.googleads.v1.common.BasicUserListInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v1.common.BasicUserListInfo.newBuilder()
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
        getActionsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (actionsBuilder_ == null) {
        actions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        actionsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v1.common.UserListsProto.internal_static_google_ads_googleads_v1_common_BasicUserListInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.BasicUserListInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v1.common.BasicUserListInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.BasicUserListInfo build() {
      com.google.ads.googleads.v1.common.BasicUserListInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v1.common.BasicUserListInfo buildPartial() {
      com.google.ads.googleads.v1.common.BasicUserListInfo result = new com.google.ads.googleads.v1.common.BasicUserListInfo(this);
      int from_bitField0_ = bitField0_;
      if (actionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          actions_ = java.util.Collections.unmodifiableList(actions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.actions_ = actions_;
      } else {
        result.actions_ = actionsBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v1.common.BasicUserListInfo) {
        return mergeFrom((com.google.ads.googleads.v1.common.BasicUserListInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v1.common.BasicUserListInfo other) {
      if (other == com.google.ads.googleads.v1.common.BasicUserListInfo.getDefaultInstance()) return this;
      if (actionsBuilder_ == null) {
        if (!other.actions_.isEmpty()) {
          if (actions_.isEmpty()) {
            actions_ = other.actions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureActionsIsMutable();
            actions_.addAll(other.actions_);
          }
          onChanged();
        }
      } else {
        if (!other.actions_.isEmpty()) {
          if (actionsBuilder_.isEmpty()) {
            actionsBuilder_.dispose();
            actionsBuilder_ = null;
            actions_ = other.actions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            actionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getActionsFieldBuilder() : null;
          } else {
            actionsBuilder_.addAllMessages(other.actions_);
          }
        }
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
      com.google.ads.googleads.v1.common.BasicUserListInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v1.common.BasicUserListInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.google.ads.googleads.v1.common.UserListActionInfo> actions_ =
      java.util.Collections.emptyList();
    private void ensureActionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        actions_ = new java.util.ArrayList<com.google.ads.googleads.v1.common.UserListActionInfo>(actions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v1.common.UserListActionInfo, com.google.ads.googleads.v1.common.UserListActionInfo.Builder, com.google.ads.googleads.v1.common.UserListActionInfoOrBuilder> actionsBuilder_;

    /**
     * <pre>
     * Actions associated with this user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v1.common.UserListActionInfo> getActionsList() {
      if (actionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(actions_);
      } else {
        return actionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Actions associated with this user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
     */
    public int getActionsCount() {
      if (actionsBuilder_ == null) {
        return actions_.size();
      } else {
        return actionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Actions associated with this user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
     */
    public com.google.ads.googleads.v1.common.UserListActionInfo getActions(int index) {
      if (actionsBuilder_ == null) {
        return actions_.get(index);
      } else {
        return actionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Actions associated with this user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
     */
    public Builder setActions(
        int index, com.google.ads.googleads.v1.common.UserListActionInfo value) {
      if (actionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActionsIsMutable();
        actions_.set(index, value);
        onChanged();
      } else {
        actionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Actions associated with this user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
     */
    public Builder setActions(
        int index, com.google.ads.googleads.v1.common.UserListActionInfo.Builder builderForValue) {
      if (actionsBuilder_ == null) {
        ensureActionsIsMutable();
        actions_.set(index, builderForValue.build());
        onChanged();
      } else {
        actionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Actions associated with this user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
     */
    public Builder addActions(com.google.ads.googleads.v1.common.UserListActionInfo value) {
      if (actionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActionsIsMutable();
        actions_.add(value);
        onChanged();
      } else {
        actionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Actions associated with this user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
     */
    public Builder addActions(
        int index, com.google.ads.googleads.v1.common.UserListActionInfo value) {
      if (actionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureActionsIsMutable();
        actions_.add(index, value);
        onChanged();
      } else {
        actionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Actions associated with this user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
     */
    public Builder addActions(
        com.google.ads.googleads.v1.common.UserListActionInfo.Builder builderForValue) {
      if (actionsBuilder_ == null) {
        ensureActionsIsMutable();
        actions_.add(builderForValue.build());
        onChanged();
      } else {
        actionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Actions associated with this user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
     */
    public Builder addActions(
        int index, com.google.ads.googleads.v1.common.UserListActionInfo.Builder builderForValue) {
      if (actionsBuilder_ == null) {
        ensureActionsIsMutable();
        actions_.add(index, builderForValue.build());
        onChanged();
      } else {
        actionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Actions associated with this user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
     */
    public Builder addAllActions(
        java.lang.Iterable<? extends com.google.ads.googleads.v1.common.UserListActionInfo> values) {
      if (actionsBuilder_ == null) {
        ensureActionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, actions_);
        onChanged();
      } else {
        actionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Actions associated with this user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
     */
    public Builder clearActions() {
      if (actionsBuilder_ == null) {
        actions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        actionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Actions associated with this user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
     */
    public Builder removeActions(int index) {
      if (actionsBuilder_ == null) {
        ensureActionsIsMutable();
        actions_.remove(index);
        onChanged();
      } else {
        actionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Actions associated with this user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
     */
    public com.google.ads.googleads.v1.common.UserListActionInfo.Builder getActionsBuilder(
        int index) {
      return getActionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Actions associated with this user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
     */
    public com.google.ads.googleads.v1.common.UserListActionInfoOrBuilder getActionsOrBuilder(
        int index) {
      if (actionsBuilder_ == null) {
        return actions_.get(index);  } else {
        return actionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Actions associated with this user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v1.common.UserListActionInfoOrBuilder> 
         getActionsOrBuilderList() {
      if (actionsBuilder_ != null) {
        return actionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(actions_);
      }
    }
    /**
     * <pre>
     * Actions associated with this user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
     */
    public com.google.ads.googleads.v1.common.UserListActionInfo.Builder addActionsBuilder() {
      return getActionsFieldBuilder().addBuilder(
          com.google.ads.googleads.v1.common.UserListActionInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * Actions associated with this user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
     */
    public com.google.ads.googleads.v1.common.UserListActionInfo.Builder addActionsBuilder(
        int index) {
      return getActionsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v1.common.UserListActionInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * Actions associated with this user list.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v1.common.UserListActionInfo actions = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v1.common.UserListActionInfo.Builder> 
         getActionsBuilderList() {
      return getActionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v1.common.UserListActionInfo, com.google.ads.googleads.v1.common.UserListActionInfo.Builder, com.google.ads.googleads.v1.common.UserListActionInfoOrBuilder> 
        getActionsFieldBuilder() {
      if (actionsBuilder_ == null) {
        actionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v1.common.UserListActionInfo, com.google.ads.googleads.v1.common.UserListActionInfo.Builder, com.google.ads.googleads.v1.common.UserListActionInfoOrBuilder>(
                actions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        actions_ = null;
      }
      return actionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v1.common.BasicUserListInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v1.common.BasicUserListInfo)
  private static final com.google.ads.googleads.v1.common.BasicUserListInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v1.common.BasicUserListInfo();
  }

  public static com.google.ads.googleads.v1.common.BasicUserListInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BasicUserListInfo>
      PARSER = new com.google.protobuf.AbstractParser<BasicUserListInfo>() {
    @java.lang.Override
    public BasicUserListInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BasicUserListInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BasicUserListInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BasicUserListInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v1.common.BasicUserListInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

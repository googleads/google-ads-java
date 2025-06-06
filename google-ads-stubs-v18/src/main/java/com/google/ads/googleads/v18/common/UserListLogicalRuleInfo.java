// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/user_lists.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.common;

/**
 * <pre>
 * A user list logical rule. A rule has a logical operator (and/or/not) and a
 * list of user lists as operands.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.common.UserListLogicalRuleInfo}
 */
public final class UserListLogicalRuleInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.common.UserListLogicalRuleInfo)
    UserListLogicalRuleInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserListLogicalRuleInfo.newBuilder() to construct.
  private UserListLogicalRuleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserListLogicalRuleInfo() {
    operator_ = 0;
    ruleOperands_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserListLogicalRuleInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.common.UserListsProto.internal_static_google_ads_googleads_v18_common_UserListLogicalRuleInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.common.UserListsProto.internal_static_google_ads_googleads_v18_common_UserListLogicalRuleInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.common.UserListLogicalRuleInfo.class, com.google.ads.googleads.v18.common.UserListLogicalRuleInfo.Builder.class);
  }

  public static final int OPERATOR_FIELD_NUMBER = 1;
  private int operator_ = 0;
  /**
   * <pre>
   * The logical operator of the rule.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.UserListLogicalRuleOperatorEnum.UserListLogicalRuleOperator operator = 1;</code>
   * @return The enum numeric value on the wire for operator.
   */
  @java.lang.Override public int getOperatorValue() {
    return operator_;
  }
  /**
   * <pre>
   * The logical operator of the rule.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.UserListLogicalRuleOperatorEnum.UserListLogicalRuleOperator operator = 1;</code>
   * @return The operator.
   */
  @java.lang.Override public com.google.ads.googleads.v18.enums.UserListLogicalRuleOperatorEnum.UserListLogicalRuleOperator getOperator() {
    com.google.ads.googleads.v18.enums.UserListLogicalRuleOperatorEnum.UserListLogicalRuleOperator result = com.google.ads.googleads.v18.enums.UserListLogicalRuleOperatorEnum.UserListLogicalRuleOperator.forNumber(operator_);
    return result == null ? com.google.ads.googleads.v18.enums.UserListLogicalRuleOperatorEnum.UserListLogicalRuleOperator.UNRECOGNIZED : result;
  }

  public static final int RULE_OPERANDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v18.common.LogicalUserListOperandInfo> ruleOperands_;
  /**
   * <pre>
   * The list of operands of the rule.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v18.common.LogicalUserListOperandInfo> getRuleOperandsList() {
    return ruleOperands_;
  }
  /**
   * <pre>
   * The list of operands of the rule.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v18.common.LogicalUserListOperandInfoOrBuilder> 
      getRuleOperandsOrBuilderList() {
    return ruleOperands_;
  }
  /**
   * <pre>
   * The list of operands of the rule.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
   */
  @java.lang.Override
  public int getRuleOperandsCount() {
    return ruleOperands_.size();
  }
  /**
   * <pre>
   * The list of operands of the rule.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v18.common.LogicalUserListOperandInfo getRuleOperands(int index) {
    return ruleOperands_.get(index);
  }
  /**
   * <pre>
   * The list of operands of the rule.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v18.common.LogicalUserListOperandInfoOrBuilder getRuleOperandsOrBuilder(
      int index) {
    return ruleOperands_.get(index);
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
    if (operator_ != com.google.ads.googleads.v18.enums.UserListLogicalRuleOperatorEnum.UserListLogicalRuleOperator.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, operator_);
    }
    for (int i = 0; i < ruleOperands_.size(); i++) {
      output.writeMessage(2, ruleOperands_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operator_ != com.google.ads.googleads.v18.enums.UserListLogicalRuleOperatorEnum.UserListLogicalRuleOperator.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, operator_);
    }
    for (int i = 0; i < ruleOperands_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, ruleOperands_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v18.common.UserListLogicalRuleInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.common.UserListLogicalRuleInfo other = (com.google.ads.googleads.v18.common.UserListLogicalRuleInfo) obj;

    if (operator_ != other.operator_) return false;
    if (!getRuleOperandsList()
        .equals(other.getRuleOperandsList())) return false;
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
    hash = (37 * hash) + OPERATOR_FIELD_NUMBER;
    hash = (53 * hash) + operator_;
    if (getRuleOperandsCount() > 0) {
      hash = (37 * hash) + RULE_OPERANDS_FIELD_NUMBER;
      hash = (53 * hash) + getRuleOperandsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v18.common.UserListLogicalRuleInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.UserListLogicalRuleInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.UserListLogicalRuleInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.UserListLogicalRuleInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.UserListLogicalRuleInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.UserListLogicalRuleInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.UserListLogicalRuleInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.common.UserListLogicalRuleInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.common.UserListLogicalRuleInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.common.UserListLogicalRuleInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.UserListLogicalRuleInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.common.UserListLogicalRuleInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.common.UserListLogicalRuleInfo prototype) {
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
   * A user list logical rule. A rule has a logical operator (and/or/not) and a
   * list of user lists as operands.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.common.UserListLogicalRuleInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.common.UserListLogicalRuleInfo)
      com.google.ads.googleads.v18.common.UserListLogicalRuleInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.common.UserListsProto.internal_static_google_ads_googleads_v18_common_UserListLogicalRuleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.common.UserListsProto.internal_static_google_ads_googleads_v18_common_UserListLogicalRuleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.common.UserListLogicalRuleInfo.class, com.google.ads.googleads.v18.common.UserListLogicalRuleInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.common.UserListLogicalRuleInfo.newBuilder()
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
      operator_ = 0;
      if (ruleOperandsBuilder_ == null) {
        ruleOperands_ = java.util.Collections.emptyList();
      } else {
        ruleOperands_ = null;
        ruleOperandsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v18.common.UserListsProto.internal_static_google_ads_googleads_v18_common_UserListLogicalRuleInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.UserListLogicalRuleInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.common.UserListLogicalRuleInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.UserListLogicalRuleInfo build() {
      com.google.ads.googleads.v18.common.UserListLogicalRuleInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.UserListLogicalRuleInfo buildPartial() {
      com.google.ads.googleads.v18.common.UserListLogicalRuleInfo result = new com.google.ads.googleads.v18.common.UserListLogicalRuleInfo(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v18.common.UserListLogicalRuleInfo result) {
      if (ruleOperandsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          ruleOperands_ = java.util.Collections.unmodifiableList(ruleOperands_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.ruleOperands_ = ruleOperands_;
      } else {
        result.ruleOperands_ = ruleOperandsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v18.common.UserListLogicalRuleInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.operator_ = operator_;
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
      if (other instanceof com.google.ads.googleads.v18.common.UserListLogicalRuleInfo) {
        return mergeFrom((com.google.ads.googleads.v18.common.UserListLogicalRuleInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.common.UserListLogicalRuleInfo other) {
      if (other == com.google.ads.googleads.v18.common.UserListLogicalRuleInfo.getDefaultInstance()) return this;
      if (other.operator_ != 0) {
        setOperatorValue(other.getOperatorValue());
      }
      if (ruleOperandsBuilder_ == null) {
        if (!other.ruleOperands_.isEmpty()) {
          if (ruleOperands_.isEmpty()) {
            ruleOperands_ = other.ruleOperands_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureRuleOperandsIsMutable();
            ruleOperands_.addAll(other.ruleOperands_);
          }
          onChanged();
        }
      } else {
        if (!other.ruleOperands_.isEmpty()) {
          if (ruleOperandsBuilder_.isEmpty()) {
            ruleOperandsBuilder_.dispose();
            ruleOperandsBuilder_ = null;
            ruleOperands_ = other.ruleOperands_;
            bitField0_ = (bitField0_ & ~0x00000002);
            ruleOperandsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRuleOperandsFieldBuilder() : null;
          } else {
            ruleOperandsBuilder_.addAllMessages(other.ruleOperands_);
          }
        }
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
              operator_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              com.google.ads.googleads.v18.common.LogicalUserListOperandInfo m =
                  input.readMessage(
                      com.google.ads.googleads.v18.common.LogicalUserListOperandInfo.parser(),
                      extensionRegistry);
              if (ruleOperandsBuilder_ == null) {
                ensureRuleOperandsIsMutable();
                ruleOperands_.add(m);
              } else {
                ruleOperandsBuilder_.addMessage(m);
              }
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

    private int operator_ = 0;
    /**
     * <pre>
     * The logical operator of the rule.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.UserListLogicalRuleOperatorEnum.UserListLogicalRuleOperator operator = 1;</code>
     * @return The enum numeric value on the wire for operator.
     */
    @java.lang.Override public int getOperatorValue() {
      return operator_;
    }
    /**
     * <pre>
     * The logical operator of the rule.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.UserListLogicalRuleOperatorEnum.UserListLogicalRuleOperator operator = 1;</code>
     * @param value The enum numeric value on the wire for operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperatorValue(int value) {
      operator_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The logical operator of the rule.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.UserListLogicalRuleOperatorEnum.UserListLogicalRuleOperator operator = 1;</code>
     * @return The operator.
     */
    @java.lang.Override
    public com.google.ads.googleads.v18.enums.UserListLogicalRuleOperatorEnum.UserListLogicalRuleOperator getOperator() {
      com.google.ads.googleads.v18.enums.UserListLogicalRuleOperatorEnum.UserListLogicalRuleOperator result = com.google.ads.googleads.v18.enums.UserListLogicalRuleOperatorEnum.UserListLogicalRuleOperator.forNumber(operator_);
      return result == null ? com.google.ads.googleads.v18.enums.UserListLogicalRuleOperatorEnum.UserListLogicalRuleOperator.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The logical operator of the rule.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.UserListLogicalRuleOperatorEnum.UserListLogicalRuleOperator operator = 1;</code>
     * @param value The operator to set.
     * @return This builder for chaining.
     */
    public Builder setOperator(com.google.ads.googleads.v18.enums.UserListLogicalRuleOperatorEnum.UserListLogicalRuleOperator value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      operator_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The logical operator of the rule.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.UserListLogicalRuleOperatorEnum.UserListLogicalRuleOperator operator = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOperator() {
      bitField0_ = (bitField0_ & ~0x00000001);
      operator_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.google.ads.googleads.v18.common.LogicalUserListOperandInfo> ruleOperands_ =
      java.util.Collections.emptyList();
    private void ensureRuleOperandsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        ruleOperands_ = new java.util.ArrayList<com.google.ads.googleads.v18.common.LogicalUserListOperandInfo>(ruleOperands_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v18.common.LogicalUserListOperandInfo, com.google.ads.googleads.v18.common.LogicalUserListOperandInfo.Builder, com.google.ads.googleads.v18.common.LogicalUserListOperandInfoOrBuilder> ruleOperandsBuilder_;

    /**
     * <pre>
     * The list of operands of the rule.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
     */
    public java.util.List<com.google.ads.googleads.v18.common.LogicalUserListOperandInfo> getRuleOperandsList() {
      if (ruleOperandsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ruleOperands_);
      } else {
        return ruleOperandsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of operands of the rule.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
     */
    public int getRuleOperandsCount() {
      if (ruleOperandsBuilder_ == null) {
        return ruleOperands_.size();
      } else {
        return ruleOperandsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of operands of the rule.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
     */
    public com.google.ads.googleads.v18.common.LogicalUserListOperandInfo getRuleOperands(int index) {
      if (ruleOperandsBuilder_ == null) {
        return ruleOperands_.get(index);
      } else {
        return ruleOperandsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of operands of the rule.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
     */
    public Builder setRuleOperands(
        int index, com.google.ads.googleads.v18.common.LogicalUserListOperandInfo value) {
      if (ruleOperandsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRuleOperandsIsMutable();
        ruleOperands_.set(index, value);
        onChanged();
      } else {
        ruleOperandsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of operands of the rule.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
     */
    public Builder setRuleOperands(
        int index, com.google.ads.googleads.v18.common.LogicalUserListOperandInfo.Builder builderForValue) {
      if (ruleOperandsBuilder_ == null) {
        ensureRuleOperandsIsMutable();
        ruleOperands_.set(index, builderForValue.build());
        onChanged();
      } else {
        ruleOperandsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of operands of the rule.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
     */
    public Builder addRuleOperands(com.google.ads.googleads.v18.common.LogicalUserListOperandInfo value) {
      if (ruleOperandsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRuleOperandsIsMutable();
        ruleOperands_.add(value);
        onChanged();
      } else {
        ruleOperandsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of operands of the rule.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
     */
    public Builder addRuleOperands(
        int index, com.google.ads.googleads.v18.common.LogicalUserListOperandInfo value) {
      if (ruleOperandsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRuleOperandsIsMutable();
        ruleOperands_.add(index, value);
        onChanged();
      } else {
        ruleOperandsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of operands of the rule.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
     */
    public Builder addRuleOperands(
        com.google.ads.googleads.v18.common.LogicalUserListOperandInfo.Builder builderForValue) {
      if (ruleOperandsBuilder_ == null) {
        ensureRuleOperandsIsMutable();
        ruleOperands_.add(builderForValue.build());
        onChanged();
      } else {
        ruleOperandsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of operands of the rule.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
     */
    public Builder addRuleOperands(
        int index, com.google.ads.googleads.v18.common.LogicalUserListOperandInfo.Builder builderForValue) {
      if (ruleOperandsBuilder_ == null) {
        ensureRuleOperandsIsMutable();
        ruleOperands_.add(index, builderForValue.build());
        onChanged();
      } else {
        ruleOperandsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of operands of the rule.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
     */
    public Builder addAllRuleOperands(
        java.lang.Iterable<? extends com.google.ads.googleads.v18.common.LogicalUserListOperandInfo> values) {
      if (ruleOperandsBuilder_ == null) {
        ensureRuleOperandsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ruleOperands_);
        onChanged();
      } else {
        ruleOperandsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of operands of the rule.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
     */
    public Builder clearRuleOperands() {
      if (ruleOperandsBuilder_ == null) {
        ruleOperands_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        ruleOperandsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of operands of the rule.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
     */
    public Builder removeRuleOperands(int index) {
      if (ruleOperandsBuilder_ == null) {
        ensureRuleOperandsIsMutable();
        ruleOperands_.remove(index);
        onChanged();
      } else {
        ruleOperandsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of operands of the rule.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
     */
    public com.google.ads.googleads.v18.common.LogicalUserListOperandInfo.Builder getRuleOperandsBuilder(
        int index) {
      return getRuleOperandsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of operands of the rule.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
     */
    public com.google.ads.googleads.v18.common.LogicalUserListOperandInfoOrBuilder getRuleOperandsOrBuilder(
        int index) {
      if (ruleOperandsBuilder_ == null) {
        return ruleOperands_.get(index);  } else {
        return ruleOperandsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of operands of the rule.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v18.common.LogicalUserListOperandInfoOrBuilder> 
         getRuleOperandsOrBuilderList() {
      if (ruleOperandsBuilder_ != null) {
        return ruleOperandsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ruleOperands_);
      }
    }
    /**
     * <pre>
     * The list of operands of the rule.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
     */
    public com.google.ads.googleads.v18.common.LogicalUserListOperandInfo.Builder addRuleOperandsBuilder() {
      return getRuleOperandsFieldBuilder().addBuilder(
          com.google.ads.googleads.v18.common.LogicalUserListOperandInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of operands of the rule.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
     */
    public com.google.ads.googleads.v18.common.LogicalUserListOperandInfo.Builder addRuleOperandsBuilder(
        int index) {
      return getRuleOperandsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v18.common.LogicalUserListOperandInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of operands of the rule.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.LogicalUserListOperandInfo rule_operands = 2;</code>
     */
    public java.util.List<com.google.ads.googleads.v18.common.LogicalUserListOperandInfo.Builder> 
         getRuleOperandsBuilderList() {
      return getRuleOperandsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v18.common.LogicalUserListOperandInfo, com.google.ads.googleads.v18.common.LogicalUserListOperandInfo.Builder, com.google.ads.googleads.v18.common.LogicalUserListOperandInfoOrBuilder> 
        getRuleOperandsFieldBuilder() {
      if (ruleOperandsBuilder_ == null) {
        ruleOperandsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v18.common.LogicalUserListOperandInfo, com.google.ads.googleads.v18.common.LogicalUserListOperandInfo.Builder, com.google.ads.googleads.v18.common.LogicalUserListOperandInfoOrBuilder>(
                ruleOperands_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        ruleOperands_ = null;
      }
      return ruleOperandsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.common.UserListLogicalRuleInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.common.UserListLogicalRuleInfo)
  private static final com.google.ads.googleads.v18.common.UserListLogicalRuleInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.common.UserListLogicalRuleInfo();
  }

  public static com.google.ads.googleads.v18.common.UserListLogicalRuleInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserListLogicalRuleInfo>
      PARSER = new com.google.protobuf.AbstractParser<UserListLogicalRuleInfo>() {
    @java.lang.Override
    public UserListLogicalRuleInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserListLogicalRuleInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserListLogicalRuleInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.common.UserListLogicalRuleInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


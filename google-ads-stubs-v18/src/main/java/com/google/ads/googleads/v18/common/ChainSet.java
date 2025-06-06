// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/common/asset_set_types.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.common;

/**
 * <pre>
 * Data used to configure a location set populated with the specified chains.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v18.common.ChainSet}
 */
public final class ChainSet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v18.common.ChainSet)
    ChainSetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChainSet.newBuilder() to construct.
  private ChainSet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChainSet() {
    relationshipType_ = 0;
    chains_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChainSet();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v18.common.AssetSetTypesProto.internal_static_google_ads_googleads_v18_common_ChainSet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v18.common.AssetSetTypesProto.internal_static_google_ads_googleads_v18_common_ChainSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v18.common.ChainSet.class, com.google.ads.googleads.v18.common.ChainSet.Builder.class);
  }

  public static final int RELATIONSHIP_TYPE_FIELD_NUMBER = 1;
  private int relationshipType_ = 0;
  /**
   * <pre>
   * Required. Immutable. Relationship type the specified chains have with this
   * advertiser.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.ChainRelationshipTypeEnum.ChainRelationshipType relationship_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for relationshipType.
   */
  @java.lang.Override public int getRelationshipTypeValue() {
    return relationshipType_;
  }
  /**
   * <pre>
   * Required. Immutable. Relationship type the specified chains have with this
   * advertiser.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.enums.ChainRelationshipTypeEnum.ChainRelationshipType relationship_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The relationshipType.
   */
  @java.lang.Override public com.google.ads.googleads.v18.enums.ChainRelationshipTypeEnum.ChainRelationshipType getRelationshipType() {
    com.google.ads.googleads.v18.enums.ChainRelationshipTypeEnum.ChainRelationshipType result = com.google.ads.googleads.v18.enums.ChainRelationshipTypeEnum.ChainRelationshipType.forNumber(relationshipType_);
    return result == null ? com.google.ads.googleads.v18.enums.ChainRelationshipTypeEnum.ChainRelationshipType.UNRECOGNIZED : result;
  }

  public static final int CHAINS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v18.common.ChainFilter> chains_;
  /**
   * <pre>
   * Required. A list of chain level filters, all filters are OR'ed together.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v18.common.ChainFilter> getChainsList() {
    return chains_;
  }
  /**
   * <pre>
   * Required. A list of chain level filters, all filters are OR'ed together.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v18.common.ChainFilterOrBuilder> 
      getChainsOrBuilderList() {
    return chains_;
  }
  /**
   * <pre>
   * Required. A list of chain level filters, all filters are OR'ed together.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public int getChainsCount() {
    return chains_.size();
  }
  /**
   * <pre>
   * Required. A list of chain level filters, all filters are OR'ed together.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v18.common.ChainFilter getChains(int index) {
    return chains_.get(index);
  }
  /**
   * <pre>
   * Required. A list of chain level filters, all filters are OR'ed together.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v18.common.ChainFilterOrBuilder getChainsOrBuilder(
      int index) {
    return chains_.get(index);
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
    if (relationshipType_ != com.google.ads.googleads.v18.enums.ChainRelationshipTypeEnum.ChainRelationshipType.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, relationshipType_);
    }
    for (int i = 0; i < chains_.size(); i++) {
      output.writeMessage(2, chains_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (relationshipType_ != com.google.ads.googleads.v18.enums.ChainRelationshipTypeEnum.ChainRelationshipType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, relationshipType_);
    }
    for (int i = 0; i < chains_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, chains_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v18.common.ChainSet)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v18.common.ChainSet other = (com.google.ads.googleads.v18.common.ChainSet) obj;

    if (relationshipType_ != other.relationshipType_) return false;
    if (!getChainsList()
        .equals(other.getChainsList())) return false;
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
    hash = (37 * hash) + RELATIONSHIP_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + relationshipType_;
    if (getChainsCount() > 0) {
      hash = (37 * hash) + CHAINS_FIELD_NUMBER;
      hash = (53 * hash) + getChainsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v18.common.ChainSet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.ChainSet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.ChainSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.ChainSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.ChainSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v18.common.ChainSet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.ChainSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.common.ChainSet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v18.common.ChainSet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v18.common.ChainSet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v18.common.ChainSet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v18.common.ChainSet parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v18.common.ChainSet prototype) {
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
   * Data used to configure a location set populated with the specified chains.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v18.common.ChainSet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v18.common.ChainSet)
      com.google.ads.googleads.v18.common.ChainSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v18.common.AssetSetTypesProto.internal_static_google_ads_googleads_v18_common_ChainSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v18.common.AssetSetTypesProto.internal_static_google_ads_googleads_v18_common_ChainSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v18.common.ChainSet.class, com.google.ads.googleads.v18.common.ChainSet.Builder.class);
    }

    // Construct using com.google.ads.googleads.v18.common.ChainSet.newBuilder()
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
      relationshipType_ = 0;
      if (chainsBuilder_ == null) {
        chains_ = java.util.Collections.emptyList();
      } else {
        chains_ = null;
        chainsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v18.common.AssetSetTypesProto.internal_static_google_ads_googleads_v18_common_ChainSet_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.ChainSet getDefaultInstanceForType() {
      return com.google.ads.googleads.v18.common.ChainSet.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.ChainSet build() {
      com.google.ads.googleads.v18.common.ChainSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v18.common.ChainSet buildPartial() {
      com.google.ads.googleads.v18.common.ChainSet result = new com.google.ads.googleads.v18.common.ChainSet(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v18.common.ChainSet result) {
      if (chainsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          chains_ = java.util.Collections.unmodifiableList(chains_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.chains_ = chains_;
      } else {
        result.chains_ = chainsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v18.common.ChainSet result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.relationshipType_ = relationshipType_;
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
      if (other instanceof com.google.ads.googleads.v18.common.ChainSet) {
        return mergeFrom((com.google.ads.googleads.v18.common.ChainSet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v18.common.ChainSet other) {
      if (other == com.google.ads.googleads.v18.common.ChainSet.getDefaultInstance()) return this;
      if (other.relationshipType_ != 0) {
        setRelationshipTypeValue(other.getRelationshipTypeValue());
      }
      if (chainsBuilder_ == null) {
        if (!other.chains_.isEmpty()) {
          if (chains_.isEmpty()) {
            chains_ = other.chains_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureChainsIsMutable();
            chains_.addAll(other.chains_);
          }
          onChanged();
        }
      } else {
        if (!other.chains_.isEmpty()) {
          if (chainsBuilder_.isEmpty()) {
            chainsBuilder_.dispose();
            chainsBuilder_ = null;
            chains_ = other.chains_;
            bitField0_ = (bitField0_ & ~0x00000002);
            chainsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getChainsFieldBuilder() : null;
          } else {
            chainsBuilder_.addAllMessages(other.chains_);
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
              relationshipType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              com.google.ads.googleads.v18.common.ChainFilter m =
                  input.readMessage(
                      com.google.ads.googleads.v18.common.ChainFilter.parser(),
                      extensionRegistry);
              if (chainsBuilder_ == null) {
                ensureChainsIsMutable();
                chains_.add(m);
              } else {
                chainsBuilder_.addMessage(m);
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

    private int relationshipType_ = 0;
    /**
     * <pre>
     * Required. Immutable. Relationship type the specified chains have with this
     * advertiser.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.ChainRelationshipTypeEnum.ChainRelationshipType relationship_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The enum numeric value on the wire for relationshipType.
     */
    @java.lang.Override public int getRelationshipTypeValue() {
      return relationshipType_;
    }
    /**
     * <pre>
     * Required. Immutable. Relationship type the specified chains have with this
     * advertiser.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.ChainRelationshipTypeEnum.ChainRelationshipType relationship_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The enum numeric value on the wire for relationshipType to set.
     * @return This builder for chaining.
     */
    public Builder setRelationshipTypeValue(int value) {
      relationshipType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Immutable. Relationship type the specified chains have with this
     * advertiser.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.ChainRelationshipTypeEnum.ChainRelationshipType relationship_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The relationshipType.
     */
    @java.lang.Override
    public com.google.ads.googleads.v18.enums.ChainRelationshipTypeEnum.ChainRelationshipType getRelationshipType() {
      com.google.ads.googleads.v18.enums.ChainRelationshipTypeEnum.ChainRelationshipType result = com.google.ads.googleads.v18.enums.ChainRelationshipTypeEnum.ChainRelationshipType.forNumber(relationshipType_);
      return result == null ? com.google.ads.googleads.v18.enums.ChainRelationshipTypeEnum.ChainRelationshipType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Required. Immutable. Relationship type the specified chains have with this
     * advertiser.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.ChainRelationshipTypeEnum.ChainRelationshipType relationship_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The relationshipType to set.
     * @return This builder for chaining.
     */
    public Builder setRelationshipType(com.google.ads.googleads.v18.enums.ChainRelationshipTypeEnum.ChainRelationshipType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      relationshipType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. Immutable. Relationship type the specified chains have with this
     * advertiser.
     * </pre>
     *
     * <code>.google.ads.googleads.v18.enums.ChainRelationshipTypeEnum.ChainRelationshipType relationship_type = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];</code>
     * @return This builder for chaining.
     */
    public Builder clearRelationshipType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      relationshipType_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.google.ads.googleads.v18.common.ChainFilter> chains_ =
      java.util.Collections.emptyList();
    private void ensureChainsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        chains_ = new java.util.ArrayList<com.google.ads.googleads.v18.common.ChainFilter>(chains_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v18.common.ChainFilter, com.google.ads.googleads.v18.common.ChainFilter.Builder, com.google.ads.googleads.v18.common.ChainFilterOrBuilder> chainsBuilder_;

    /**
     * <pre>
     * Required. A list of chain level filters, all filters are OR'ed together.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.ads.googleads.v18.common.ChainFilter> getChainsList() {
      if (chainsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(chains_);
      } else {
        return chainsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Required. A list of chain level filters, all filters are OR'ed together.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public int getChainsCount() {
      if (chainsBuilder_ == null) {
        return chains_.size();
      } else {
        return chainsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Required. A list of chain level filters, all filters are OR'ed together.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v18.common.ChainFilter getChains(int index) {
      if (chainsBuilder_ == null) {
        return chains_.get(index);
      } else {
        return chainsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Required. A list of chain level filters, all filters are OR'ed together.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setChains(
        int index, com.google.ads.googleads.v18.common.ChainFilter value) {
      if (chainsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChainsIsMutable();
        chains_.set(index, value);
        onChanged();
      } else {
        chainsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of chain level filters, all filters are OR'ed together.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setChains(
        int index, com.google.ads.googleads.v18.common.ChainFilter.Builder builderForValue) {
      if (chainsBuilder_ == null) {
        ensureChainsIsMutable();
        chains_.set(index, builderForValue.build());
        onChanged();
      } else {
        chainsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of chain level filters, all filters are OR'ed together.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addChains(com.google.ads.googleads.v18.common.ChainFilter value) {
      if (chainsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChainsIsMutable();
        chains_.add(value);
        onChanged();
      } else {
        chainsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of chain level filters, all filters are OR'ed together.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addChains(
        int index, com.google.ads.googleads.v18.common.ChainFilter value) {
      if (chainsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChainsIsMutable();
        chains_.add(index, value);
        onChanged();
      } else {
        chainsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of chain level filters, all filters are OR'ed together.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addChains(
        com.google.ads.googleads.v18.common.ChainFilter.Builder builderForValue) {
      if (chainsBuilder_ == null) {
        ensureChainsIsMutable();
        chains_.add(builderForValue.build());
        onChanged();
      } else {
        chainsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of chain level filters, all filters are OR'ed together.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addChains(
        int index, com.google.ads.googleads.v18.common.ChainFilter.Builder builderForValue) {
      if (chainsBuilder_ == null) {
        ensureChainsIsMutable();
        chains_.add(index, builderForValue.build());
        onChanged();
      } else {
        chainsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of chain level filters, all filters are OR'ed together.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAllChains(
        java.lang.Iterable<? extends com.google.ads.googleads.v18.common.ChainFilter> values) {
      if (chainsBuilder_ == null) {
        ensureChainsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, chains_);
        onChanged();
      } else {
        chainsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of chain level filters, all filters are OR'ed together.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearChains() {
      if (chainsBuilder_ == null) {
        chains_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        chainsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of chain level filters, all filters are OR'ed together.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder removeChains(int index) {
      if (chainsBuilder_ == null) {
        ensureChainsIsMutable();
        chains_.remove(index);
        onChanged();
      } else {
        chainsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of chain level filters, all filters are OR'ed together.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v18.common.ChainFilter.Builder getChainsBuilder(
        int index) {
      return getChainsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Required. A list of chain level filters, all filters are OR'ed together.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v18.common.ChainFilterOrBuilder getChainsOrBuilder(
        int index) {
      if (chainsBuilder_ == null) {
        return chains_.get(index);  } else {
        return chainsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Required. A list of chain level filters, all filters are OR'ed together.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v18.common.ChainFilterOrBuilder> 
         getChainsOrBuilderList() {
      if (chainsBuilder_ != null) {
        return chainsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(chains_);
      }
    }
    /**
     * <pre>
     * Required. A list of chain level filters, all filters are OR'ed together.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v18.common.ChainFilter.Builder addChainsBuilder() {
      return getChainsFieldBuilder().addBuilder(
          com.google.ads.googleads.v18.common.ChainFilter.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. A list of chain level filters, all filters are OR'ed together.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v18.common.ChainFilter.Builder addChainsBuilder(
        int index) {
      return getChainsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v18.common.ChainFilter.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. A list of chain level filters, all filters are OR'ed together.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v18.common.ChainFilter chains = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.ads.googleads.v18.common.ChainFilter.Builder> 
         getChainsBuilderList() {
      return getChainsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v18.common.ChainFilter, com.google.ads.googleads.v18.common.ChainFilter.Builder, com.google.ads.googleads.v18.common.ChainFilterOrBuilder> 
        getChainsFieldBuilder() {
      if (chainsBuilder_ == null) {
        chainsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v18.common.ChainFilter, com.google.ads.googleads.v18.common.ChainFilter.Builder, com.google.ads.googleads.v18.common.ChainFilterOrBuilder>(
                chains_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        chains_ = null;
      }
      return chainsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v18.common.ChainSet)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v18.common.ChainSet)
  private static final com.google.ads.googleads.v18.common.ChainSet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v18.common.ChainSet();
  }

  public static com.google.ads.googleads.v18.common.ChainSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChainSet>
      PARSER = new com.google.protobuf.AbstractParser<ChainSet>() {
    @java.lang.Override
    public ChainSet parsePartialFrom(
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

  public static com.google.protobuf.Parser<ChainSet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChainSet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v18.common.ChainSet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


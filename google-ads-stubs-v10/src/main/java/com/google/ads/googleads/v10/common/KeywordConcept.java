// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/keyword_plan_common.proto

package com.google.ads.googleads.v10.common;

/**
 * <pre>
 * The concept for the keyword.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.common.KeywordConcept}
 */
public final class KeywordConcept extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.common.KeywordConcept)
    KeywordConceptOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordConcept.newBuilder() to construct.
  private KeywordConcept(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordConcept() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeywordConcept();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private KeywordConcept(
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
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            com.google.ads.googleads.v10.common.ConceptGroup.Builder subBuilder = null;
            if (conceptGroup_ != null) {
              subBuilder = conceptGroup_.toBuilder();
            }
            conceptGroup_ = input.readMessage(com.google.ads.googleads.v10.common.ConceptGroup.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(conceptGroup_);
              conceptGroup_ = subBuilder.buildPartial();
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.google.ads.googleads.v10.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v10_common_KeywordConcept_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v10_common_KeywordConcept_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.common.KeywordConcept.class, com.google.ads.googleads.v10.common.KeywordConcept.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The concept name for the keyword in the concept_group.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The concept name for the keyword in the concept_group.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONCEPT_GROUP_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v10.common.ConceptGroup conceptGroup_;
  /**
   * <pre>
   * The concept group of the concept details.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.ConceptGroup concept_group = 2;</code>
   * @return Whether the conceptGroup field is set.
   */
  @java.lang.Override
  public boolean hasConceptGroup() {
    return conceptGroup_ != null;
  }
  /**
   * <pre>
   * The concept group of the concept details.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.ConceptGroup concept_group = 2;</code>
   * @return The conceptGroup.
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.common.ConceptGroup getConceptGroup() {
    return conceptGroup_ == null ? com.google.ads.googleads.v10.common.ConceptGroup.getDefaultInstance() : conceptGroup_;
  }
  /**
   * <pre>
   * The concept group of the concept details.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.common.ConceptGroup concept_group = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v10.common.ConceptGroupOrBuilder getConceptGroupOrBuilder() {
    return getConceptGroup();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (conceptGroup_ != null) {
      output.writeMessage(2, getConceptGroup());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (conceptGroup_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConceptGroup());
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
    if (!(obj instanceof com.google.ads.googleads.v10.common.KeywordConcept)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.common.KeywordConcept other = (com.google.ads.googleads.v10.common.KeywordConcept) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasConceptGroup() != other.hasConceptGroup()) return false;
    if (hasConceptGroup()) {
      if (!getConceptGroup()
          .equals(other.getConceptGroup())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasConceptGroup()) {
      hash = (37 * hash) + CONCEPT_GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getConceptGroup().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.common.KeywordConcept parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.KeywordConcept parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.KeywordConcept parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.KeywordConcept parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.KeywordConcept parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.common.KeywordConcept parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.KeywordConcept parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.KeywordConcept parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.KeywordConcept parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.KeywordConcept parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.common.KeywordConcept parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.common.KeywordConcept parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.common.KeywordConcept prototype) {
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
   * The concept for the keyword.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.common.KeywordConcept}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.common.KeywordConcept)
      com.google.ads.googleads.v10.common.KeywordConceptOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v10_common_KeywordConcept_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v10_common_KeywordConcept_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.common.KeywordConcept.class, com.google.ads.googleads.v10.common.KeywordConcept.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.common.KeywordConcept.newBuilder()
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
      name_ = "";

      if (conceptGroupBuilder_ == null) {
        conceptGroup_ = null;
      } else {
        conceptGroup_ = null;
        conceptGroupBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.common.KeywordPlanCommonProto.internal_static_google_ads_googleads_v10_common_KeywordConcept_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.KeywordConcept getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.common.KeywordConcept.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.KeywordConcept build() {
      com.google.ads.googleads.v10.common.KeywordConcept result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.common.KeywordConcept buildPartial() {
      com.google.ads.googleads.v10.common.KeywordConcept result = new com.google.ads.googleads.v10.common.KeywordConcept(this);
      result.name_ = name_;
      if (conceptGroupBuilder_ == null) {
        result.conceptGroup_ = conceptGroup_;
      } else {
        result.conceptGroup_ = conceptGroupBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v10.common.KeywordConcept) {
        return mergeFrom((com.google.ads.googleads.v10.common.KeywordConcept)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.common.KeywordConcept other) {
      if (other == com.google.ads.googleads.v10.common.KeywordConcept.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasConceptGroup()) {
        mergeConceptGroup(other.getConceptGroup());
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
      com.google.ads.googleads.v10.common.KeywordConcept parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.common.KeywordConcept) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The concept name for the keyword in the concept_group.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The concept name for the keyword in the concept_group.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The concept name for the keyword in the concept_group.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The concept name for the keyword in the concept_group.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The concept name for the keyword in the concept_group.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v10.common.ConceptGroup conceptGroup_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.common.ConceptGroup, com.google.ads.googleads.v10.common.ConceptGroup.Builder, com.google.ads.googleads.v10.common.ConceptGroupOrBuilder> conceptGroupBuilder_;
    /**
     * <pre>
     * The concept group of the concept details.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.ConceptGroup concept_group = 2;</code>
     * @return Whether the conceptGroup field is set.
     */
    public boolean hasConceptGroup() {
      return conceptGroupBuilder_ != null || conceptGroup_ != null;
    }
    /**
     * <pre>
     * The concept group of the concept details.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.ConceptGroup concept_group = 2;</code>
     * @return The conceptGroup.
     */
    public com.google.ads.googleads.v10.common.ConceptGroup getConceptGroup() {
      if (conceptGroupBuilder_ == null) {
        return conceptGroup_ == null ? com.google.ads.googleads.v10.common.ConceptGroup.getDefaultInstance() : conceptGroup_;
      } else {
        return conceptGroupBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The concept group of the concept details.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.ConceptGroup concept_group = 2;</code>
     */
    public Builder setConceptGroup(com.google.ads.googleads.v10.common.ConceptGroup value) {
      if (conceptGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        conceptGroup_ = value;
        onChanged();
      } else {
        conceptGroupBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The concept group of the concept details.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.ConceptGroup concept_group = 2;</code>
     */
    public Builder setConceptGroup(
        com.google.ads.googleads.v10.common.ConceptGroup.Builder builderForValue) {
      if (conceptGroupBuilder_ == null) {
        conceptGroup_ = builderForValue.build();
        onChanged();
      } else {
        conceptGroupBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The concept group of the concept details.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.ConceptGroup concept_group = 2;</code>
     */
    public Builder mergeConceptGroup(com.google.ads.googleads.v10.common.ConceptGroup value) {
      if (conceptGroupBuilder_ == null) {
        if (conceptGroup_ != null) {
          conceptGroup_ =
            com.google.ads.googleads.v10.common.ConceptGroup.newBuilder(conceptGroup_).mergeFrom(value).buildPartial();
        } else {
          conceptGroup_ = value;
        }
        onChanged();
      } else {
        conceptGroupBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The concept group of the concept details.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.ConceptGroup concept_group = 2;</code>
     */
    public Builder clearConceptGroup() {
      if (conceptGroupBuilder_ == null) {
        conceptGroup_ = null;
        onChanged();
      } else {
        conceptGroup_ = null;
        conceptGroupBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The concept group of the concept details.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.ConceptGroup concept_group = 2;</code>
     */
    public com.google.ads.googleads.v10.common.ConceptGroup.Builder getConceptGroupBuilder() {
      
      onChanged();
      return getConceptGroupFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The concept group of the concept details.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.ConceptGroup concept_group = 2;</code>
     */
    public com.google.ads.googleads.v10.common.ConceptGroupOrBuilder getConceptGroupOrBuilder() {
      if (conceptGroupBuilder_ != null) {
        return conceptGroupBuilder_.getMessageOrBuilder();
      } else {
        return conceptGroup_ == null ?
            com.google.ads.googleads.v10.common.ConceptGroup.getDefaultInstance() : conceptGroup_;
      }
    }
    /**
     * <pre>
     * The concept group of the concept details.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.common.ConceptGroup concept_group = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v10.common.ConceptGroup, com.google.ads.googleads.v10.common.ConceptGroup.Builder, com.google.ads.googleads.v10.common.ConceptGroupOrBuilder> 
        getConceptGroupFieldBuilder() {
      if (conceptGroupBuilder_ == null) {
        conceptGroupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v10.common.ConceptGroup, com.google.ads.googleads.v10.common.ConceptGroup.Builder, com.google.ads.googleads.v10.common.ConceptGroupOrBuilder>(
                getConceptGroup(),
                getParentForChildren(),
                isClean());
        conceptGroup_ = null;
      }
      return conceptGroupBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.common.KeywordConcept)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.common.KeywordConcept)
  private static final com.google.ads.googleads.v10.common.KeywordConcept DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.common.KeywordConcept();
  }

  public static com.google.ads.googleads.v10.common.KeywordConcept getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordConcept>
      PARSER = new com.google.protobuf.AbstractParser<KeywordConcept>() {
    @java.lang.Override
    public KeywordConcept parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new KeywordConcept(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<KeywordConcept> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordConcept> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.common.KeywordConcept getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


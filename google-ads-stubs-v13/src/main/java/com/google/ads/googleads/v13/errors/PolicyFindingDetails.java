// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/errors/errors.proto

package com.google.ads.googleads.v13.errors;

/**
 * <pre>
 * Error returned as part of a mutate response.
 * This error indicates one or more policy findings in the fields of a
 * resource.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v13.errors.PolicyFindingDetails}
 */
public final class PolicyFindingDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v13.errors.PolicyFindingDetails)
    PolicyFindingDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PolicyFindingDetails.newBuilder() to construct.
  private PolicyFindingDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PolicyFindingDetails() {
    policyTopicEntries_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PolicyFindingDetails();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v13.errors.ErrorsProto.internal_static_google_ads_googleads_v13_errors_PolicyFindingDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v13.errors.ErrorsProto.internal_static_google_ads_googleads_v13_errors_PolicyFindingDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v13.errors.PolicyFindingDetails.class, com.google.ads.googleads.v13.errors.PolicyFindingDetails.Builder.class);
  }

  public static final int POLICY_TOPIC_ENTRIES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v13.common.PolicyTopicEntry> policyTopicEntries_;
  /**
   * <pre>
   * The list of policy topics for the resource. Contains the PROHIBITED or
   * FULLY_LIMITED policy topic entries that prevented the resource from being
   * saved (among any other entries the resource may also have).
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v13.common.PolicyTopicEntry> getPolicyTopicEntriesList() {
    return policyTopicEntries_;
  }
  /**
   * <pre>
   * The list of policy topics for the resource. Contains the PROHIBITED or
   * FULLY_LIMITED policy topic entries that prevented the resource from being
   * saved (among any other entries the resource may also have).
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v13.common.PolicyTopicEntryOrBuilder> 
      getPolicyTopicEntriesOrBuilderList() {
    return policyTopicEntries_;
  }
  /**
   * <pre>
   * The list of policy topics for the resource. Contains the PROHIBITED or
   * FULLY_LIMITED policy topic entries that prevented the resource from being
   * saved (among any other entries the resource may also have).
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  @java.lang.Override
  public int getPolicyTopicEntriesCount() {
    return policyTopicEntries_.size();
  }
  /**
   * <pre>
   * The list of policy topics for the resource. Contains the PROHIBITED or
   * FULLY_LIMITED policy topic entries that prevented the resource from being
   * saved (among any other entries the resource may also have).
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v13.common.PolicyTopicEntry getPolicyTopicEntries(int index) {
    return policyTopicEntries_.get(index);
  }
  /**
   * <pre>
   * The list of policy topics for the resource. Contains the PROHIBITED or
   * FULLY_LIMITED policy topic entries that prevented the resource from being
   * saved (among any other entries the resource may also have).
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v13.common.PolicyTopicEntryOrBuilder getPolicyTopicEntriesOrBuilder(
      int index) {
    return policyTopicEntries_.get(index);
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
    for (int i = 0; i < policyTopicEntries_.size(); i++) {
      output.writeMessage(1, policyTopicEntries_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < policyTopicEntries_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, policyTopicEntries_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v13.errors.PolicyFindingDetails)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v13.errors.PolicyFindingDetails other = (com.google.ads.googleads.v13.errors.PolicyFindingDetails) obj;

    if (!getPolicyTopicEntriesList()
        .equals(other.getPolicyTopicEntriesList())) return false;
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
    if (getPolicyTopicEntriesCount() > 0) {
      hash = (37 * hash) + POLICY_TOPIC_ENTRIES_FIELD_NUMBER;
      hash = (53 * hash) + getPolicyTopicEntriesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v13.errors.PolicyFindingDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.errors.PolicyFindingDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.errors.PolicyFindingDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.errors.PolicyFindingDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.errors.PolicyFindingDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.errors.PolicyFindingDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.errors.PolicyFindingDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.errors.PolicyFindingDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v13.errors.PolicyFindingDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v13.errors.PolicyFindingDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.errors.PolicyFindingDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.errors.PolicyFindingDetails parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v13.errors.PolicyFindingDetails prototype) {
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
   * Error returned as part of a mutate response.
   * This error indicates one or more policy findings in the fields of a
   * resource.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v13.errors.PolicyFindingDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v13.errors.PolicyFindingDetails)
      com.google.ads.googleads.v13.errors.PolicyFindingDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v13.errors.ErrorsProto.internal_static_google_ads_googleads_v13_errors_PolicyFindingDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v13.errors.ErrorsProto.internal_static_google_ads_googleads_v13_errors_PolicyFindingDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v13.errors.PolicyFindingDetails.class, com.google.ads.googleads.v13.errors.PolicyFindingDetails.Builder.class);
    }

    // Construct using com.google.ads.googleads.v13.errors.PolicyFindingDetails.newBuilder()
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
      if (policyTopicEntriesBuilder_ == null) {
        policyTopicEntries_ = java.util.Collections.emptyList();
      } else {
        policyTopicEntries_ = null;
        policyTopicEntriesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v13.errors.ErrorsProto.internal_static_google_ads_googleads_v13_errors_PolicyFindingDetails_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.errors.PolicyFindingDetails getDefaultInstanceForType() {
      return com.google.ads.googleads.v13.errors.PolicyFindingDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.errors.PolicyFindingDetails build() {
      com.google.ads.googleads.v13.errors.PolicyFindingDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.errors.PolicyFindingDetails buildPartial() {
      com.google.ads.googleads.v13.errors.PolicyFindingDetails result = new com.google.ads.googleads.v13.errors.PolicyFindingDetails(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v13.errors.PolicyFindingDetails result) {
      if (policyTopicEntriesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          policyTopicEntries_ = java.util.Collections.unmodifiableList(policyTopicEntries_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.policyTopicEntries_ = policyTopicEntries_;
      } else {
        result.policyTopicEntries_ = policyTopicEntriesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v13.errors.PolicyFindingDetails result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.ads.googleads.v13.errors.PolicyFindingDetails) {
        return mergeFrom((com.google.ads.googleads.v13.errors.PolicyFindingDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v13.errors.PolicyFindingDetails other) {
      if (other == com.google.ads.googleads.v13.errors.PolicyFindingDetails.getDefaultInstance()) return this;
      if (policyTopicEntriesBuilder_ == null) {
        if (!other.policyTopicEntries_.isEmpty()) {
          if (policyTopicEntries_.isEmpty()) {
            policyTopicEntries_ = other.policyTopicEntries_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePolicyTopicEntriesIsMutable();
            policyTopicEntries_.addAll(other.policyTopicEntries_);
          }
          onChanged();
        }
      } else {
        if (!other.policyTopicEntries_.isEmpty()) {
          if (policyTopicEntriesBuilder_.isEmpty()) {
            policyTopicEntriesBuilder_.dispose();
            policyTopicEntriesBuilder_ = null;
            policyTopicEntries_ = other.policyTopicEntries_;
            bitField0_ = (bitField0_ & ~0x00000001);
            policyTopicEntriesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPolicyTopicEntriesFieldBuilder() : null;
          } else {
            policyTopicEntriesBuilder_.addAllMessages(other.policyTopicEntries_);
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
            case 10: {
              com.google.ads.googleads.v13.common.PolicyTopicEntry m =
                  input.readMessage(
                      com.google.ads.googleads.v13.common.PolicyTopicEntry.parser(),
                      extensionRegistry);
              if (policyTopicEntriesBuilder_ == null) {
                ensurePolicyTopicEntriesIsMutable();
                policyTopicEntries_.add(m);
              } else {
                policyTopicEntriesBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<com.google.ads.googleads.v13.common.PolicyTopicEntry> policyTopicEntries_ =
      java.util.Collections.emptyList();
    private void ensurePolicyTopicEntriesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        policyTopicEntries_ = new java.util.ArrayList<com.google.ads.googleads.v13.common.PolicyTopicEntry>(policyTopicEntries_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v13.common.PolicyTopicEntry, com.google.ads.googleads.v13.common.PolicyTopicEntry.Builder, com.google.ads.googleads.v13.common.PolicyTopicEntryOrBuilder> policyTopicEntriesBuilder_;

    /**
     * <pre>
     * The list of policy topics for the resource. Contains the PROHIBITED or
     * FULLY_LIMITED policy topic entries that prevented the resource from being
     * saved (among any other entries the resource may also have).
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v13.common.PolicyTopicEntry> getPolicyTopicEntriesList() {
      if (policyTopicEntriesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(policyTopicEntries_);
      } else {
        return policyTopicEntriesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of policy topics for the resource. Contains the PROHIBITED or
     * FULLY_LIMITED policy topic entries that prevented the resource from being
     * saved (among any other entries the resource may also have).
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
     */
    public int getPolicyTopicEntriesCount() {
      if (policyTopicEntriesBuilder_ == null) {
        return policyTopicEntries_.size();
      } else {
        return policyTopicEntriesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * The list of policy topics for the resource. Contains the PROHIBITED or
     * FULLY_LIMITED policy topic entries that prevented the resource from being
     * saved (among any other entries the resource may also have).
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
     */
    public com.google.ads.googleads.v13.common.PolicyTopicEntry getPolicyTopicEntries(int index) {
      if (policyTopicEntriesBuilder_ == null) {
        return policyTopicEntries_.get(index);
      } else {
        return policyTopicEntriesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of policy topics for the resource. Contains the PROHIBITED or
     * FULLY_LIMITED policy topic entries that prevented the resource from being
     * saved (among any other entries the resource may also have).
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
     */
    public Builder setPolicyTopicEntries(
        int index, com.google.ads.googleads.v13.common.PolicyTopicEntry value) {
      if (policyTopicEntriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolicyTopicEntriesIsMutable();
        policyTopicEntries_.set(index, value);
        onChanged();
      } else {
        policyTopicEntriesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of policy topics for the resource. Contains the PROHIBITED or
     * FULLY_LIMITED policy topic entries that prevented the resource from being
     * saved (among any other entries the resource may also have).
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
     */
    public Builder setPolicyTopicEntries(
        int index, com.google.ads.googleads.v13.common.PolicyTopicEntry.Builder builderForValue) {
      if (policyTopicEntriesBuilder_ == null) {
        ensurePolicyTopicEntriesIsMutable();
        policyTopicEntries_.set(index, builderForValue.build());
        onChanged();
      } else {
        policyTopicEntriesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of policy topics for the resource. Contains the PROHIBITED or
     * FULLY_LIMITED policy topic entries that prevented the resource from being
     * saved (among any other entries the resource may also have).
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
     */
    public Builder addPolicyTopicEntries(com.google.ads.googleads.v13.common.PolicyTopicEntry value) {
      if (policyTopicEntriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolicyTopicEntriesIsMutable();
        policyTopicEntries_.add(value);
        onChanged();
      } else {
        policyTopicEntriesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of policy topics for the resource. Contains the PROHIBITED or
     * FULLY_LIMITED policy topic entries that prevented the resource from being
     * saved (among any other entries the resource may also have).
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
     */
    public Builder addPolicyTopicEntries(
        int index, com.google.ads.googleads.v13.common.PolicyTopicEntry value) {
      if (policyTopicEntriesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePolicyTopicEntriesIsMutable();
        policyTopicEntries_.add(index, value);
        onChanged();
      } else {
        policyTopicEntriesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * The list of policy topics for the resource. Contains the PROHIBITED or
     * FULLY_LIMITED policy topic entries that prevented the resource from being
     * saved (among any other entries the resource may also have).
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
     */
    public Builder addPolicyTopicEntries(
        com.google.ads.googleads.v13.common.PolicyTopicEntry.Builder builderForValue) {
      if (policyTopicEntriesBuilder_ == null) {
        ensurePolicyTopicEntriesIsMutable();
        policyTopicEntries_.add(builderForValue.build());
        onChanged();
      } else {
        policyTopicEntriesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of policy topics for the resource. Contains the PROHIBITED or
     * FULLY_LIMITED policy topic entries that prevented the resource from being
     * saved (among any other entries the resource may also have).
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
     */
    public Builder addPolicyTopicEntries(
        int index, com.google.ads.googleads.v13.common.PolicyTopicEntry.Builder builderForValue) {
      if (policyTopicEntriesBuilder_ == null) {
        ensurePolicyTopicEntriesIsMutable();
        policyTopicEntries_.add(index, builderForValue.build());
        onChanged();
      } else {
        policyTopicEntriesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * The list of policy topics for the resource. Contains the PROHIBITED or
     * FULLY_LIMITED policy topic entries that prevented the resource from being
     * saved (among any other entries the resource may also have).
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
     */
    public Builder addAllPolicyTopicEntries(
        java.lang.Iterable<? extends com.google.ads.googleads.v13.common.PolicyTopicEntry> values) {
      if (policyTopicEntriesBuilder_ == null) {
        ensurePolicyTopicEntriesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, policyTopicEntries_);
        onChanged();
      } else {
        policyTopicEntriesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * The list of policy topics for the resource. Contains the PROHIBITED or
     * FULLY_LIMITED policy topic entries that prevented the resource from being
     * saved (among any other entries the resource may also have).
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
     */
    public Builder clearPolicyTopicEntries() {
      if (policyTopicEntriesBuilder_ == null) {
        policyTopicEntries_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        policyTopicEntriesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * The list of policy topics for the resource. Contains the PROHIBITED or
     * FULLY_LIMITED policy topic entries that prevented the resource from being
     * saved (among any other entries the resource may also have).
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
     */
    public Builder removePolicyTopicEntries(int index) {
      if (policyTopicEntriesBuilder_ == null) {
        ensurePolicyTopicEntriesIsMutable();
        policyTopicEntries_.remove(index);
        onChanged();
      } else {
        policyTopicEntriesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * The list of policy topics for the resource. Contains the PROHIBITED or
     * FULLY_LIMITED policy topic entries that prevented the resource from being
     * saved (among any other entries the resource may also have).
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
     */
    public com.google.ads.googleads.v13.common.PolicyTopicEntry.Builder getPolicyTopicEntriesBuilder(
        int index) {
      return getPolicyTopicEntriesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of policy topics for the resource. Contains the PROHIBITED or
     * FULLY_LIMITED policy topic entries that prevented the resource from being
     * saved (among any other entries the resource may also have).
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
     */
    public com.google.ads.googleads.v13.common.PolicyTopicEntryOrBuilder getPolicyTopicEntriesOrBuilder(
        int index) {
      if (policyTopicEntriesBuilder_ == null) {
        return policyTopicEntries_.get(index);  } else {
        return policyTopicEntriesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of policy topics for the resource. Contains the PROHIBITED or
     * FULLY_LIMITED policy topic entries that prevented the resource from being
     * saved (among any other entries the resource may also have).
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v13.common.PolicyTopicEntryOrBuilder> 
         getPolicyTopicEntriesOrBuilderList() {
      if (policyTopicEntriesBuilder_ != null) {
        return policyTopicEntriesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(policyTopicEntries_);
      }
    }
    /**
     * <pre>
     * The list of policy topics for the resource. Contains the PROHIBITED or
     * FULLY_LIMITED policy topic entries that prevented the resource from being
     * saved (among any other entries the resource may also have).
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
     */
    public com.google.ads.googleads.v13.common.PolicyTopicEntry.Builder addPolicyTopicEntriesBuilder() {
      return getPolicyTopicEntriesFieldBuilder().addBuilder(
          com.google.ads.googleads.v13.common.PolicyTopicEntry.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of policy topics for the resource. Contains the PROHIBITED or
     * FULLY_LIMITED policy topic entries that prevented the resource from being
     * saved (among any other entries the resource may also have).
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
     */
    public com.google.ads.googleads.v13.common.PolicyTopicEntry.Builder addPolicyTopicEntriesBuilder(
        int index) {
      return getPolicyTopicEntriesFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v13.common.PolicyTopicEntry.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of policy topics for the resource. Contains the PROHIBITED or
     * FULLY_LIMITED policy topic entries that prevented the resource from being
     * saved (among any other entries the resource may also have).
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.common.PolicyTopicEntry policy_topic_entries = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v13.common.PolicyTopicEntry.Builder> 
         getPolicyTopicEntriesBuilderList() {
      return getPolicyTopicEntriesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v13.common.PolicyTopicEntry, com.google.ads.googleads.v13.common.PolicyTopicEntry.Builder, com.google.ads.googleads.v13.common.PolicyTopicEntryOrBuilder> 
        getPolicyTopicEntriesFieldBuilder() {
      if (policyTopicEntriesBuilder_ == null) {
        policyTopicEntriesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v13.common.PolicyTopicEntry, com.google.ads.googleads.v13.common.PolicyTopicEntry.Builder, com.google.ads.googleads.v13.common.PolicyTopicEntryOrBuilder>(
                policyTopicEntries_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        policyTopicEntries_ = null;
      }
      return policyTopicEntriesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v13.errors.PolicyFindingDetails)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v13.errors.PolicyFindingDetails)
  private static final com.google.ads.googleads.v13.errors.PolicyFindingDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v13.errors.PolicyFindingDetails();
  }

  public static com.google.ads.googleads.v13.errors.PolicyFindingDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PolicyFindingDetails>
      PARSER = new com.google.protobuf.AbstractParser<PolicyFindingDetails>() {
    @java.lang.Override
    public PolicyFindingDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<PolicyFindingDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PolicyFindingDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v13.errors.PolicyFindingDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/customer_conversion_goal_service.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.services;

/**
 * <pre>
 * Response message for a customer conversion goal mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse}
 */
public final class MutateCustomerConversionGoalsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse)
    MutateCustomerConversionGoalsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateCustomerConversionGoalsResponse.newBuilder() to construct.
  private MutateCustomerConversionGoalsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateCustomerConversionGoalsResponse() {
    results_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateCustomerConversionGoalsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.services.CustomerConversionGoalServiceProto.internal_static_google_ads_googleads_v15_services_MutateCustomerConversionGoalsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.services.CustomerConversionGoalServiceProto.internal_static_google_ads_googleads_v15_services_MutateCustomerConversionGoalsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse.class, com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse.Builder.class);
  }

  public static final int RESULTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult> results_;
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult> getResultsList() {
    return results_;
  }
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResultOrBuilder> 
      getResultsOrBuilderList() {
    return results_;
  }
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
   */
  @java.lang.Override
  public int getResultsCount() {
    return results_.size();
  }
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult getResults(int index) {
    return results_.get(index);
  }
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResultOrBuilder getResultsOrBuilder(
      int index) {
    return results_.get(index);
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
    for (int i = 0; i < results_.size(); i++) {
      output.writeMessage(1, results_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < results_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, results_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse other = (com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse) obj;

    if (!getResultsList()
        .equals(other.getResultsList())) return false;
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
    if (getResultsCount() > 0) {
      hash = (37 * hash) + RESULTS_FIELD_NUMBER;
      hash = (53 * hash) + getResultsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse prototype) {
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
   * Response message for a customer conversion goal mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse)
      com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.services.CustomerConversionGoalServiceProto.internal_static_google_ads_googleads_v15_services_MutateCustomerConversionGoalsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.services.CustomerConversionGoalServiceProto.internal_static_google_ads_googleads_v15_services_MutateCustomerConversionGoalsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse.class, com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse.newBuilder()
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
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
      } else {
        results_ = null;
        resultsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.services.CustomerConversionGoalServiceProto.internal_static_google_ads_googleads_v15_services_MutateCustomerConversionGoalsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse build() {
      com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse buildPartial() {
      com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse result = new com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse result) {
      if (resultsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          results_ = java.util.Collections.unmodifiableList(results_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.results_ = results_;
      } else {
        result.results_ = resultsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse result) {
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
      if (other instanceof com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse) {
        return mergeFrom((com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse other) {
      if (other == com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse.getDefaultInstance()) return this;
      if (resultsBuilder_ == null) {
        if (!other.results_.isEmpty()) {
          if (results_.isEmpty()) {
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResultsIsMutable();
            results_.addAll(other.results_);
          }
          onChanged();
        }
      } else {
        if (!other.results_.isEmpty()) {
          if (resultsBuilder_.isEmpty()) {
            resultsBuilder_.dispose();
            resultsBuilder_ = null;
            results_ = other.results_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resultsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getResultsFieldBuilder() : null;
          } else {
            resultsBuilder_.addAllMessages(other.results_);
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
              com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult m =
                  input.readMessage(
                      com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult.parser(),
                      extensionRegistry);
              if (resultsBuilder_ == null) {
                ensureResultsIsMutable();
                results_.add(m);
              } else {
                resultsBuilder_.addMessage(m);
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

    private java.util.List<com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult> results_ =
      java.util.Collections.emptyList();
    private void ensureResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        results_ = new java.util.ArrayList<com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult>(results_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult, com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult.Builder, com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResultOrBuilder> resultsBuilder_;

    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult> getResultsList() {
      if (resultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(results_);
      } else {
        return resultsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
     */
    public int getResultsCount() {
      if (resultsBuilder_ == null) {
        return results_.size();
      } else {
        return resultsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
     */
    public com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult getResults(int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);
      } else {
        return resultsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
     */
    public Builder setResults(
        int index, com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.set(index, value);
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
     */
    public Builder setResults(
        int index, com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.set(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
     */
    public Builder addResults(com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
     */
    public Builder addResults(
        int index, com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult value) {
      if (resultsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultsIsMutable();
        results_.add(index, value);
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
     */
    public Builder addResults(
        com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
     */
    public Builder addResults(
        int index, com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult.Builder builderForValue) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.add(index, builderForValue.build());
        onChanged();
      } else {
        resultsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
     */
    public Builder addAllResults(
        java.lang.Iterable<? extends com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult> values) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, results_);
        onChanged();
      } else {
        resultsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
     */
    public Builder clearResults() {
      if (resultsBuilder_ == null) {
        results_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resultsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
     */
    public Builder removeResults(int index) {
      if (resultsBuilder_ == null) {
        ensureResultsIsMutable();
        results_.remove(index);
        onChanged();
      } else {
        resultsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
     */
    public com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult.Builder getResultsBuilder(
        int index) {
      return getResultsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
     */
    public com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResultOrBuilder getResultsOrBuilder(
        int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);  } else {
        return resultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResultOrBuilder> 
         getResultsOrBuilderList() {
      if (resultsBuilder_ != null) {
        return resultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(results_);
      }
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
     */
    public com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult.Builder addResultsBuilder() {
      return getResultsFieldBuilder().addBuilder(
          com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult.getDefaultInstance());
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
     */
    public com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult.Builder addResultsBuilder(
        int index) {
      return getResultsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult.getDefaultInstance());
    }
    /**
     * <pre>
     * All results for the mutate.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.services.MutateCustomerConversionGoalResult results = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult.Builder> 
         getResultsBuilderList() {
      return getResultsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult, com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult.Builder, com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResultOrBuilder> 
        getResultsFieldBuilder() {
      if (resultsBuilder_ == null) {
        resultsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult, com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResult.Builder, com.google.ads.googleads.v15.services.MutateCustomerConversionGoalResultOrBuilder>(
                results_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        results_ = null;
      }
      return resultsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse)
  private static final com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse();
  }

  public static com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateCustomerConversionGoalsResponse>
      PARSER = new com.google.protobuf.AbstractParser<MutateCustomerConversionGoalsResponse>() {
    @java.lang.Override
    public MutateCustomerConversionGoalsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MutateCustomerConversionGoalsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateCustomerConversionGoalsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.services.MutateCustomerConversionGoalsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/services/google_ads_field_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.services;

/**
 * <pre>
 * Response message for
 * [GoogleAdsFieldService.SearchGoogleAdsFields][google.ads.googleads.v20.services.GoogleAdsFieldService.SearchGoogleAdsFields].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse}
 */
public final class SearchGoogleAdsFieldsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse)
    SearchGoogleAdsFieldsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchGoogleAdsFieldsResponse.newBuilder() to construct.
  private SearchGoogleAdsFieldsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchGoogleAdsFieldsResponse() {
    results_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchGoogleAdsFieldsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v20.services.GoogleAdsFieldServiceProto.internal_static_google_ads_googleads_v20_services_SearchGoogleAdsFieldsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v20.services.GoogleAdsFieldServiceProto.internal_static_google_ads_googleads_v20_services_SearchGoogleAdsFieldsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse.class, com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse.Builder.class);
  }

  public static final int RESULTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v20.resources.GoogleAdsField> results_;
  /**
   * <pre>
   * The list of fields that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v20.resources.GoogleAdsField> getResultsList() {
    return results_;
  }
  /**
   * <pre>
   * The list of fields that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v20.resources.GoogleAdsFieldOrBuilder> 
      getResultsOrBuilderList() {
    return results_;
  }
  /**
   * <pre>
   * The list of fields that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
   */
  @java.lang.Override
  public int getResultsCount() {
    return results_.size();
  }
  /**
   * <pre>
   * The list of fields that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v20.resources.GoogleAdsField getResults(int index) {
    return results_.get(index);
  }
  /**
   * <pre>
   * The list of fields that matched the query.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v20.resources.GoogleAdsFieldOrBuilder getResultsOrBuilder(
      int index) {
    return results_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   * <pre>
   * Pagination token used to retrieve the next page of results. Pass the
   * content of this string as the `page_token` attribute of the next request.
   * `next_page_token` is not returned for the last page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Pagination token used to retrieve the next page of results. Pass the
   * content of this string as the `page_token` attribute of the next request.
   * `next_page_token` is not returned for the last page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTAL_RESULTS_COUNT_FIELD_NUMBER = 3;
  private long totalResultsCount_ = 0L;
  /**
   * <pre>
   * Total number of results that match the query ignoring the LIMIT clause.
   * </pre>
   *
   * <code>int64 total_results_count = 3;</code>
   * @return The totalResultsCount.
   */
  @java.lang.Override
  public long getTotalResultsCount() {
    return totalResultsCount_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    if (totalResultsCount_ != 0L) {
      output.writeInt64(3, totalResultsCount_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    if (totalResultsCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, totalResultsCount_);
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
    if (!(obj instanceof com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse other = (com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse) obj;

    if (!getResultsList()
        .equals(other.getResultsList())) return false;
    if (!getNextPageToken()
        .equals(other.getNextPageToken())) return false;
    if (getTotalResultsCount()
        != other.getTotalResultsCount()) return false;
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
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (37 * hash) + TOTAL_RESULTS_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalResultsCount());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse prototype) {
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
   * Response message for
   * [GoogleAdsFieldService.SearchGoogleAdsFields][google.ads.googleads.v20.services.GoogleAdsFieldService.SearchGoogleAdsFields].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse)
      com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v20.services.GoogleAdsFieldServiceProto.internal_static_google_ads_googleads_v20_services_SearchGoogleAdsFieldsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v20.services.GoogleAdsFieldServiceProto.internal_static_google_ads_googleads_v20_services_SearchGoogleAdsFieldsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse.class, com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse.newBuilder()
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
      nextPageToken_ = "";
      totalResultsCount_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v20.services.GoogleAdsFieldServiceProto.internal_static_google_ads_googleads_v20_services_SearchGoogleAdsFieldsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse build() {
      com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse buildPartial() {
      com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse result = new com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse result) {
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

    private void buildPartial0(com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.totalResultsCount_ = totalResultsCount_;
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
      if (other instanceof com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse) {
        return mergeFrom((com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse other) {
      if (other == com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse.getDefaultInstance()) return this;
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
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getTotalResultsCount() != 0L) {
        setTotalResultsCount(other.getTotalResultsCount());
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
              com.google.ads.googleads.v20.resources.GoogleAdsField m =
                  input.readMessage(
                      com.google.ads.googleads.v20.resources.GoogleAdsField.parser(),
                      extensionRegistry);
              if (resultsBuilder_ == null) {
                ensureResultsIsMutable();
                results_.add(m);
              } else {
                resultsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              nextPageToken_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              totalResultsCount_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private java.util.List<com.google.ads.googleads.v20.resources.GoogleAdsField> results_ =
      java.util.Collections.emptyList();
    private void ensureResultsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        results_ = new java.util.ArrayList<com.google.ads.googleads.v20.resources.GoogleAdsField>(results_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v20.resources.GoogleAdsField, com.google.ads.googleads.v20.resources.GoogleAdsField.Builder, com.google.ads.googleads.v20.resources.GoogleAdsFieldOrBuilder> resultsBuilder_;

    /**
     * <pre>
     * The list of fields that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v20.resources.GoogleAdsField> getResultsList() {
      if (resultsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(results_);
      } else {
        return resultsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * The list of fields that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
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
     * The list of fields that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
     */
    public com.google.ads.googleads.v20.resources.GoogleAdsField getResults(int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);
      } else {
        return resultsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * The list of fields that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
     */
    public Builder setResults(
        int index, com.google.ads.googleads.v20.resources.GoogleAdsField value) {
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
     * The list of fields that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
     */
    public Builder setResults(
        int index, com.google.ads.googleads.v20.resources.GoogleAdsField.Builder builderForValue) {
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
     * The list of fields that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
     */
    public Builder addResults(com.google.ads.googleads.v20.resources.GoogleAdsField value) {
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
     * The list of fields that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
     */
    public Builder addResults(
        int index, com.google.ads.googleads.v20.resources.GoogleAdsField value) {
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
     * The list of fields that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
     */
    public Builder addResults(
        com.google.ads.googleads.v20.resources.GoogleAdsField.Builder builderForValue) {
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
     * The list of fields that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
     */
    public Builder addResults(
        int index, com.google.ads.googleads.v20.resources.GoogleAdsField.Builder builderForValue) {
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
     * The list of fields that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
     */
    public Builder addAllResults(
        java.lang.Iterable<? extends com.google.ads.googleads.v20.resources.GoogleAdsField> values) {
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
     * The list of fields that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
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
     * The list of fields that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
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
     * The list of fields that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
     */
    public com.google.ads.googleads.v20.resources.GoogleAdsField.Builder getResultsBuilder(
        int index) {
      return getResultsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * The list of fields that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
     */
    public com.google.ads.googleads.v20.resources.GoogleAdsFieldOrBuilder getResultsOrBuilder(
        int index) {
      if (resultsBuilder_ == null) {
        return results_.get(index);  } else {
        return resultsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * The list of fields that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v20.resources.GoogleAdsFieldOrBuilder> 
         getResultsOrBuilderList() {
      if (resultsBuilder_ != null) {
        return resultsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(results_);
      }
    }
    /**
     * <pre>
     * The list of fields that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
     */
    public com.google.ads.googleads.v20.resources.GoogleAdsField.Builder addResultsBuilder() {
      return getResultsFieldBuilder().addBuilder(
          com.google.ads.googleads.v20.resources.GoogleAdsField.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of fields that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
     */
    public com.google.ads.googleads.v20.resources.GoogleAdsField.Builder addResultsBuilder(
        int index) {
      return getResultsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v20.resources.GoogleAdsField.getDefaultInstance());
    }
    /**
     * <pre>
     * The list of fields that matched the query.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v20.resources.GoogleAdsField results = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v20.resources.GoogleAdsField.Builder> 
         getResultsBuilderList() {
      return getResultsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v20.resources.GoogleAdsField, com.google.ads.googleads.v20.resources.GoogleAdsField.Builder, com.google.ads.googleads.v20.resources.GoogleAdsFieldOrBuilder> 
        getResultsFieldBuilder() {
      if (resultsBuilder_ == null) {
        resultsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v20.resources.GoogleAdsField, com.google.ads.googleads.v20.resources.GoogleAdsField.Builder, com.google.ads.googleads.v20.resources.GoogleAdsFieldOrBuilder>(
                results_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        results_ = null;
      }
      return resultsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     * <pre>
     * Pagination token used to retrieve the next page of results. Pass the
     * content of this string as the `page_token` attribute of the next request.
     * `next_page_token` is not returned for the last page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Pagination token used to retrieve the next page of results. Pass the
     * content of this string as the `page_token` attribute of the next request.
     * `next_page_token` is not returned for the last page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString
        getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Pagination token used to retrieve the next page of results. Pass the
     * content of this string as the `page_token` attribute of the next request.
     * `next_page_token` is not returned for the last page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Pagination token used to retrieve the next page of results. Pass the
     * content of this string as the `page_token` attribute of the next request.
     * `next_page_token` is not returned for the last page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Pagination token used to retrieve the next page of results. Pass the
     * content of this string as the `page_token` attribute of the next request.
     * `next_page_token` is not returned for the last page.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long totalResultsCount_ ;
    /**
     * <pre>
     * Total number of results that match the query ignoring the LIMIT clause.
     * </pre>
     *
     * <code>int64 total_results_count = 3;</code>
     * @return The totalResultsCount.
     */
    @java.lang.Override
    public long getTotalResultsCount() {
      return totalResultsCount_;
    }
    /**
     * <pre>
     * Total number of results that match the query ignoring the LIMIT clause.
     * </pre>
     *
     * <code>int64 total_results_count = 3;</code>
     * @param value The totalResultsCount to set.
     * @return This builder for chaining.
     */
    public Builder setTotalResultsCount(long value) {

      totalResultsCount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Total number of results that match the query ignoring the LIMIT clause.
     * </pre>
     *
     * <code>int64 total_results_count = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalResultsCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      totalResultsCount_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse)
  private static final com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse();
  }

  public static com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchGoogleAdsFieldsResponse>
      PARSER = new com.google.protobuf.AbstractParser<SearchGoogleAdsFieldsResponse>() {
    @java.lang.Override
    public SearchGoogleAdsFieldsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchGoogleAdsFieldsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchGoogleAdsFieldsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v20.services.SearchGoogleAdsFieldsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


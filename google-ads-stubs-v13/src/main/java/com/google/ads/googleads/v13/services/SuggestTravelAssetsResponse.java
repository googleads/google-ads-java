// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/services/travel_asset_suggestion_service.proto

package com.google.ads.googleads.v13.services;

/**
 * <pre>
 * Response message for
 * [TravelSuggestAssetsService.SuggestTravelAssets][].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v13.services.SuggestTravelAssetsResponse}
 */
public final class SuggestTravelAssetsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v13.services.SuggestTravelAssetsResponse)
    SuggestTravelAssetsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SuggestTravelAssetsResponse.newBuilder() to construct.
  private SuggestTravelAssetsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SuggestTravelAssetsResponse() {
    hotelAssetSuggestions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SuggestTravelAssetsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v13.services.TravelAssetSuggestionServiceProto.internal_static_google_ads_googleads_v13_services_SuggestTravelAssetsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v13.services.TravelAssetSuggestionServiceProto.internal_static_google_ads_googleads_v13_services_SuggestTravelAssetsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse.class, com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse.Builder.class);
  }

  public static final int HOTEL_ASSET_SUGGESTIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v13.services.HotelAssetSuggestion> hotelAssetSuggestions_;
  /**
   * <pre>
   * Asset suggestions for each place ID submitted in the request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v13.services.HotelAssetSuggestion> getHotelAssetSuggestionsList() {
    return hotelAssetSuggestions_;
  }
  /**
   * <pre>
   * Asset suggestions for each place ID submitted in the request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v13.services.HotelAssetSuggestionOrBuilder> 
      getHotelAssetSuggestionsOrBuilderList() {
    return hotelAssetSuggestions_;
  }
  /**
   * <pre>
   * Asset suggestions for each place ID submitted in the request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
   */
  @java.lang.Override
  public int getHotelAssetSuggestionsCount() {
    return hotelAssetSuggestions_.size();
  }
  /**
   * <pre>
   * Asset suggestions for each place ID submitted in the request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v13.services.HotelAssetSuggestion getHotelAssetSuggestions(int index) {
    return hotelAssetSuggestions_.get(index);
  }
  /**
   * <pre>
   * Asset suggestions for each place ID submitted in the request.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v13.services.HotelAssetSuggestionOrBuilder getHotelAssetSuggestionsOrBuilder(
      int index) {
    return hotelAssetSuggestions_.get(index);
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
    for (int i = 0; i < hotelAssetSuggestions_.size(); i++) {
      output.writeMessage(1, hotelAssetSuggestions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < hotelAssetSuggestions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, hotelAssetSuggestions_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse other = (com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse) obj;

    if (!getHotelAssetSuggestionsList()
        .equals(other.getHotelAssetSuggestionsList())) return false;
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
    if (getHotelAssetSuggestionsCount() > 0) {
      hash = (37 * hash) + HOTEL_ASSET_SUGGESTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getHotelAssetSuggestionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse prototype) {
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
   * [TravelSuggestAssetsService.SuggestTravelAssets][].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v13.services.SuggestTravelAssetsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v13.services.SuggestTravelAssetsResponse)
      com.google.ads.googleads.v13.services.SuggestTravelAssetsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v13.services.TravelAssetSuggestionServiceProto.internal_static_google_ads_googleads_v13_services_SuggestTravelAssetsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v13.services.TravelAssetSuggestionServiceProto.internal_static_google_ads_googleads_v13_services_SuggestTravelAssetsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse.class, com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse.newBuilder()
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
      if (hotelAssetSuggestionsBuilder_ == null) {
        hotelAssetSuggestions_ = java.util.Collections.emptyList();
      } else {
        hotelAssetSuggestions_ = null;
        hotelAssetSuggestionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v13.services.TravelAssetSuggestionServiceProto.internal_static_google_ads_googleads_v13_services_SuggestTravelAssetsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse build() {
      com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse buildPartial() {
      com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse result = new com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse result) {
      if (hotelAssetSuggestionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          hotelAssetSuggestions_ = java.util.Collections.unmodifiableList(hotelAssetSuggestions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.hotelAssetSuggestions_ = hotelAssetSuggestions_;
      } else {
        result.hotelAssetSuggestions_ = hotelAssetSuggestionsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse result) {
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
      if (other instanceof com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse) {
        return mergeFrom((com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse other) {
      if (other == com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse.getDefaultInstance()) return this;
      if (hotelAssetSuggestionsBuilder_ == null) {
        if (!other.hotelAssetSuggestions_.isEmpty()) {
          if (hotelAssetSuggestions_.isEmpty()) {
            hotelAssetSuggestions_ = other.hotelAssetSuggestions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureHotelAssetSuggestionsIsMutable();
            hotelAssetSuggestions_.addAll(other.hotelAssetSuggestions_);
          }
          onChanged();
        }
      } else {
        if (!other.hotelAssetSuggestions_.isEmpty()) {
          if (hotelAssetSuggestionsBuilder_.isEmpty()) {
            hotelAssetSuggestionsBuilder_.dispose();
            hotelAssetSuggestionsBuilder_ = null;
            hotelAssetSuggestions_ = other.hotelAssetSuggestions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            hotelAssetSuggestionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getHotelAssetSuggestionsFieldBuilder() : null;
          } else {
            hotelAssetSuggestionsBuilder_.addAllMessages(other.hotelAssetSuggestions_);
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
              com.google.ads.googleads.v13.services.HotelAssetSuggestion m =
                  input.readMessage(
                      com.google.ads.googleads.v13.services.HotelAssetSuggestion.parser(),
                      extensionRegistry);
              if (hotelAssetSuggestionsBuilder_ == null) {
                ensureHotelAssetSuggestionsIsMutable();
                hotelAssetSuggestions_.add(m);
              } else {
                hotelAssetSuggestionsBuilder_.addMessage(m);
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

    private java.util.List<com.google.ads.googleads.v13.services.HotelAssetSuggestion> hotelAssetSuggestions_ =
      java.util.Collections.emptyList();
    private void ensureHotelAssetSuggestionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        hotelAssetSuggestions_ = new java.util.ArrayList<com.google.ads.googleads.v13.services.HotelAssetSuggestion>(hotelAssetSuggestions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v13.services.HotelAssetSuggestion, com.google.ads.googleads.v13.services.HotelAssetSuggestion.Builder, com.google.ads.googleads.v13.services.HotelAssetSuggestionOrBuilder> hotelAssetSuggestionsBuilder_;

    /**
     * <pre>
     * Asset suggestions for each place ID submitted in the request.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v13.services.HotelAssetSuggestion> getHotelAssetSuggestionsList() {
      if (hotelAssetSuggestionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(hotelAssetSuggestions_);
      } else {
        return hotelAssetSuggestionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Asset suggestions for each place ID submitted in the request.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
     */
    public int getHotelAssetSuggestionsCount() {
      if (hotelAssetSuggestionsBuilder_ == null) {
        return hotelAssetSuggestions_.size();
      } else {
        return hotelAssetSuggestionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Asset suggestions for each place ID submitted in the request.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
     */
    public com.google.ads.googleads.v13.services.HotelAssetSuggestion getHotelAssetSuggestions(int index) {
      if (hotelAssetSuggestionsBuilder_ == null) {
        return hotelAssetSuggestions_.get(index);
      } else {
        return hotelAssetSuggestionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Asset suggestions for each place ID submitted in the request.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
     */
    public Builder setHotelAssetSuggestions(
        int index, com.google.ads.googleads.v13.services.HotelAssetSuggestion value) {
      if (hotelAssetSuggestionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHotelAssetSuggestionsIsMutable();
        hotelAssetSuggestions_.set(index, value);
        onChanged();
      } else {
        hotelAssetSuggestionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Asset suggestions for each place ID submitted in the request.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
     */
    public Builder setHotelAssetSuggestions(
        int index, com.google.ads.googleads.v13.services.HotelAssetSuggestion.Builder builderForValue) {
      if (hotelAssetSuggestionsBuilder_ == null) {
        ensureHotelAssetSuggestionsIsMutable();
        hotelAssetSuggestions_.set(index, builderForValue.build());
        onChanged();
      } else {
        hotelAssetSuggestionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Asset suggestions for each place ID submitted in the request.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
     */
    public Builder addHotelAssetSuggestions(com.google.ads.googleads.v13.services.HotelAssetSuggestion value) {
      if (hotelAssetSuggestionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHotelAssetSuggestionsIsMutable();
        hotelAssetSuggestions_.add(value);
        onChanged();
      } else {
        hotelAssetSuggestionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Asset suggestions for each place ID submitted in the request.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
     */
    public Builder addHotelAssetSuggestions(
        int index, com.google.ads.googleads.v13.services.HotelAssetSuggestion value) {
      if (hotelAssetSuggestionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureHotelAssetSuggestionsIsMutable();
        hotelAssetSuggestions_.add(index, value);
        onChanged();
      } else {
        hotelAssetSuggestionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Asset suggestions for each place ID submitted in the request.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
     */
    public Builder addHotelAssetSuggestions(
        com.google.ads.googleads.v13.services.HotelAssetSuggestion.Builder builderForValue) {
      if (hotelAssetSuggestionsBuilder_ == null) {
        ensureHotelAssetSuggestionsIsMutable();
        hotelAssetSuggestions_.add(builderForValue.build());
        onChanged();
      } else {
        hotelAssetSuggestionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Asset suggestions for each place ID submitted in the request.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
     */
    public Builder addHotelAssetSuggestions(
        int index, com.google.ads.googleads.v13.services.HotelAssetSuggestion.Builder builderForValue) {
      if (hotelAssetSuggestionsBuilder_ == null) {
        ensureHotelAssetSuggestionsIsMutable();
        hotelAssetSuggestions_.add(index, builderForValue.build());
        onChanged();
      } else {
        hotelAssetSuggestionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Asset suggestions for each place ID submitted in the request.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
     */
    public Builder addAllHotelAssetSuggestions(
        java.lang.Iterable<? extends com.google.ads.googleads.v13.services.HotelAssetSuggestion> values) {
      if (hotelAssetSuggestionsBuilder_ == null) {
        ensureHotelAssetSuggestionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, hotelAssetSuggestions_);
        onChanged();
      } else {
        hotelAssetSuggestionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Asset suggestions for each place ID submitted in the request.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
     */
    public Builder clearHotelAssetSuggestions() {
      if (hotelAssetSuggestionsBuilder_ == null) {
        hotelAssetSuggestions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        hotelAssetSuggestionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Asset suggestions for each place ID submitted in the request.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
     */
    public Builder removeHotelAssetSuggestions(int index) {
      if (hotelAssetSuggestionsBuilder_ == null) {
        ensureHotelAssetSuggestionsIsMutable();
        hotelAssetSuggestions_.remove(index);
        onChanged();
      } else {
        hotelAssetSuggestionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Asset suggestions for each place ID submitted in the request.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
     */
    public com.google.ads.googleads.v13.services.HotelAssetSuggestion.Builder getHotelAssetSuggestionsBuilder(
        int index) {
      return getHotelAssetSuggestionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Asset suggestions for each place ID submitted in the request.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
     */
    public com.google.ads.googleads.v13.services.HotelAssetSuggestionOrBuilder getHotelAssetSuggestionsOrBuilder(
        int index) {
      if (hotelAssetSuggestionsBuilder_ == null) {
        return hotelAssetSuggestions_.get(index);  } else {
        return hotelAssetSuggestionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Asset suggestions for each place ID submitted in the request.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v13.services.HotelAssetSuggestionOrBuilder> 
         getHotelAssetSuggestionsOrBuilderList() {
      if (hotelAssetSuggestionsBuilder_ != null) {
        return hotelAssetSuggestionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(hotelAssetSuggestions_);
      }
    }
    /**
     * <pre>
     * Asset suggestions for each place ID submitted in the request.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
     */
    public com.google.ads.googleads.v13.services.HotelAssetSuggestion.Builder addHotelAssetSuggestionsBuilder() {
      return getHotelAssetSuggestionsFieldBuilder().addBuilder(
          com.google.ads.googleads.v13.services.HotelAssetSuggestion.getDefaultInstance());
    }
    /**
     * <pre>
     * Asset suggestions for each place ID submitted in the request.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
     */
    public com.google.ads.googleads.v13.services.HotelAssetSuggestion.Builder addHotelAssetSuggestionsBuilder(
        int index) {
      return getHotelAssetSuggestionsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v13.services.HotelAssetSuggestion.getDefaultInstance());
    }
    /**
     * <pre>
     * Asset suggestions for each place ID submitted in the request.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v13.services.HotelAssetSuggestion hotel_asset_suggestions = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v13.services.HotelAssetSuggestion.Builder> 
         getHotelAssetSuggestionsBuilderList() {
      return getHotelAssetSuggestionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v13.services.HotelAssetSuggestion, com.google.ads.googleads.v13.services.HotelAssetSuggestion.Builder, com.google.ads.googleads.v13.services.HotelAssetSuggestionOrBuilder> 
        getHotelAssetSuggestionsFieldBuilder() {
      if (hotelAssetSuggestionsBuilder_ == null) {
        hotelAssetSuggestionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v13.services.HotelAssetSuggestion, com.google.ads.googleads.v13.services.HotelAssetSuggestion.Builder, com.google.ads.googleads.v13.services.HotelAssetSuggestionOrBuilder>(
                hotelAssetSuggestions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        hotelAssetSuggestions_ = null;
      }
      return hotelAssetSuggestionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v13.services.SuggestTravelAssetsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v13.services.SuggestTravelAssetsResponse)
  private static final com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse();
  }

  public static com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SuggestTravelAssetsResponse>
      PARSER = new com.google.protobuf.AbstractParser<SuggestTravelAssetsResponse>() {
    @java.lang.Override
    public SuggestTravelAssetsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SuggestTravelAssetsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SuggestTravelAssetsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v13.services.SuggestTravelAssetsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


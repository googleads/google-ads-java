// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/services/travel_asset_suggestion_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.services;

/**
 * <pre>
 * Request message for
 * [TravelAssetSuggestionService.SuggestTravelAssets][google.ads.googleads.v19.services.TravelAssetSuggestionService.SuggestTravelAssets].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.services.SuggestTravelAssetsRequest}
 */
public final class SuggestTravelAssetsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.services.SuggestTravelAssetsRequest)
    SuggestTravelAssetsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SuggestTravelAssetsRequest.newBuilder() to construct.
  private SuggestTravelAssetsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SuggestTravelAssetsRequest() {
    customerId_ = "";
    languageOption_ = "";
    placeIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SuggestTravelAssetsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.services.TravelAssetSuggestionServiceProto.internal_static_google_ads_googleads_v19_services_SuggestTravelAssetsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.services.TravelAssetSuggestionServiceProto.internal_static_google_ads_googleads_v19_services_SuggestTravelAssetsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest.class, com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest.Builder.class);
  }

  public static final int CUSTOMER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object customerId_ = "";
  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  @java.lang.Override
  public java.lang.String getCustomerId() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID of the customer.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerIdBytes() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LANGUAGE_OPTION_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object languageOption_ = "";
  /**
   * <pre>
   * Required. The language specifications in BCP 47 format (for example, en-US,
   * zh-CN, etc.) for the asset suggestions. Text will be in this language.
   * Usually matches one of the campaign target languages.
   * </pre>
   *
   * <code>string language_option = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The languageOption.
   */
  @java.lang.Override
  public java.lang.String getLanguageOption() {
    java.lang.Object ref = languageOption_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      languageOption_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The language specifications in BCP 47 format (for example, en-US,
   * zh-CN, etc.) for the asset suggestions. Text will be in this language.
   * Usually matches one of the campaign target languages.
   * </pre>
   *
   * <code>string language_option = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for languageOption.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLanguageOptionBytes() {
    java.lang.Object ref = languageOption_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      languageOption_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLACE_IDS_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList placeIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * The Google Maps Place IDs of hotels for which assets are requested. See
   * https://developers.google.com/places/web-service/place-id for more
   * information.
   * </pre>
   *
   * <code>repeated string place_ids = 4;</code>
   * @return A list containing the placeIds.
   */
  public com.google.protobuf.ProtocolStringList
      getPlaceIdsList() {
    return placeIds_;
  }
  /**
   * <pre>
   * The Google Maps Place IDs of hotels for which assets are requested. See
   * https://developers.google.com/places/web-service/place-id for more
   * information.
   * </pre>
   *
   * <code>repeated string place_ids = 4;</code>
   * @return The count of placeIds.
   */
  public int getPlaceIdsCount() {
    return placeIds_.size();
  }
  /**
   * <pre>
   * The Google Maps Place IDs of hotels for which assets are requested. See
   * https://developers.google.com/places/web-service/place-id for more
   * information.
   * </pre>
   *
   * <code>repeated string place_ids = 4;</code>
   * @param index The index of the element to return.
   * @return The placeIds at the given index.
   */
  public java.lang.String getPlaceIds(int index) {
    return placeIds_.get(index);
  }
  /**
   * <pre>
   * The Google Maps Place IDs of hotels for which assets are requested. See
   * https://developers.google.com/places/web-service/place-id for more
   * information.
   * </pre>
   *
   * <code>repeated string place_ids = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the placeIds at the given index.
   */
  public com.google.protobuf.ByteString
      getPlaceIdsBytes(int index) {
    return placeIds_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customerId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageOption_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, languageOption_);
    }
    for (int i = 0; i < placeIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, placeIds_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customerId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(languageOption_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, languageOption_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < placeIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(placeIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPlaceIdsList().size();
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
    if (!(obj instanceof com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest other = (com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest) obj;

    if (!getCustomerId()
        .equals(other.getCustomerId())) return false;
    if (!getLanguageOption()
        .equals(other.getLanguageOption())) return false;
    if (!getPlaceIdsList()
        .equals(other.getPlaceIdsList())) return false;
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
    hash = (37 * hash) + CUSTOMER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerId().hashCode();
    hash = (37 * hash) + LANGUAGE_OPTION_FIELD_NUMBER;
    hash = (53 * hash) + getLanguageOption().hashCode();
    if (getPlaceIdsCount() > 0) {
      hash = (37 * hash) + PLACE_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getPlaceIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest prototype) {
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
   * Request message for
   * [TravelAssetSuggestionService.SuggestTravelAssets][google.ads.googleads.v19.services.TravelAssetSuggestionService.SuggestTravelAssets].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.services.SuggestTravelAssetsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.services.SuggestTravelAssetsRequest)
      com.google.ads.googleads.v19.services.SuggestTravelAssetsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.services.TravelAssetSuggestionServiceProto.internal_static_google_ads_googleads_v19_services_SuggestTravelAssetsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.services.TravelAssetSuggestionServiceProto.internal_static_google_ads_googleads_v19_services_SuggestTravelAssetsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest.class, com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest.newBuilder()
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
      customerId_ = "";
      languageOption_ = "";
      placeIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.services.TravelAssetSuggestionServiceProto.internal_static_google_ads_googleads_v19_services_SuggestTravelAssetsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest build() {
      com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest buildPartial() {
      com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest result = new com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.customerId_ = customerId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.languageOption_ = languageOption_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        placeIds_.makeImmutable();
        result.placeIds_ = placeIds_;
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
      if (other instanceof com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest) {
        return mergeFrom((com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest other) {
      if (other == com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getLanguageOption().isEmpty()) {
        languageOption_ = other.languageOption_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.placeIds_.isEmpty()) {
        if (placeIds_.isEmpty()) {
          placeIds_ = other.placeIds_;
          bitField0_ |= 0x00000004;
        } else {
          ensurePlaceIdsIsMutable();
          placeIds_.addAll(other.placeIds_);
        }
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
            case 10: {
              customerId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              languageOption_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();
              ensurePlaceIdsIsMutable();
              placeIds_.add(s);
              break;
            } // case 34
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

    private java.lang.Object customerId_ = "";
    /**
     * <pre>
     * Required. The ID of the customer.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The customerId.
     */
    public java.lang.String getCustomerId() {
      java.lang.Object ref = customerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the customer.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for customerId.
     */
    public com.google.protobuf.ByteString
        getCustomerIdBytes() {
      java.lang.Object ref = customerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the customer.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      customerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the customer.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomerId() {
      customerId_ = getDefaultInstance().getCustomerId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the customer.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      customerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object languageOption_ = "";
    /**
     * <pre>
     * Required. The language specifications in BCP 47 format (for example, en-US,
     * zh-CN, etc.) for the asset suggestions. Text will be in this language.
     * Usually matches one of the campaign target languages.
     * </pre>
     *
     * <code>string language_option = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The languageOption.
     */
    public java.lang.String getLanguageOption() {
      java.lang.Object ref = languageOption_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        languageOption_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The language specifications in BCP 47 format (for example, en-US,
     * zh-CN, etc.) for the asset suggestions. Text will be in this language.
     * Usually matches one of the campaign target languages.
     * </pre>
     *
     * <code>string language_option = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for languageOption.
     */
    public com.google.protobuf.ByteString
        getLanguageOptionBytes() {
      java.lang.Object ref = languageOption_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        languageOption_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The language specifications in BCP 47 format (for example, en-US,
     * zh-CN, etc.) for the asset suggestions. Text will be in this language.
     * Usually matches one of the campaign target languages.
     * </pre>
     *
     * <code>string language_option = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The languageOption to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageOption(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      languageOption_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The language specifications in BCP 47 format (for example, en-US,
     * zh-CN, etc.) for the asset suggestions. Text will be in this language.
     * Usually matches one of the campaign target languages.
     * </pre>
     *
     * <code>string language_option = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearLanguageOption() {
      languageOption_ = getDefaultInstance().getLanguageOption();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The language specifications in BCP 47 format (for example, en-US,
     * zh-CN, etc.) for the asset suggestions. Text will be in this language.
     * Usually matches one of the campaign target languages.
     * </pre>
     *
     * <code>string language_option = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for languageOption to set.
     * @return This builder for chaining.
     */
    public Builder setLanguageOptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      languageOption_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList placeIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensurePlaceIdsIsMutable() {
      if (!placeIds_.isModifiable()) {
        placeIds_ = new com.google.protobuf.LazyStringArrayList(placeIds_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <pre>
     * The Google Maps Place IDs of hotels for which assets are requested. See
     * https://developers.google.com/places/web-service/place-id for more
     * information.
     * </pre>
     *
     * <code>repeated string place_ids = 4;</code>
     * @return A list containing the placeIds.
     */
    public com.google.protobuf.ProtocolStringList
        getPlaceIdsList() {
      placeIds_.makeImmutable();
      return placeIds_;
    }
    /**
     * <pre>
     * The Google Maps Place IDs of hotels for which assets are requested. See
     * https://developers.google.com/places/web-service/place-id for more
     * information.
     * </pre>
     *
     * <code>repeated string place_ids = 4;</code>
     * @return The count of placeIds.
     */
    public int getPlaceIdsCount() {
      return placeIds_.size();
    }
    /**
     * <pre>
     * The Google Maps Place IDs of hotels for which assets are requested. See
     * https://developers.google.com/places/web-service/place-id for more
     * information.
     * </pre>
     *
     * <code>repeated string place_ids = 4;</code>
     * @param index The index of the element to return.
     * @return The placeIds at the given index.
     */
    public java.lang.String getPlaceIds(int index) {
      return placeIds_.get(index);
    }
    /**
     * <pre>
     * The Google Maps Place IDs of hotels for which assets are requested. See
     * https://developers.google.com/places/web-service/place-id for more
     * information.
     * </pre>
     *
     * <code>repeated string place_ids = 4;</code>
     * @param index The index of the value to return.
     * @return The bytes of the placeIds at the given index.
     */
    public com.google.protobuf.ByteString
        getPlaceIdsBytes(int index) {
      return placeIds_.getByteString(index);
    }
    /**
     * <pre>
     * The Google Maps Place IDs of hotels for which assets are requested. See
     * https://developers.google.com/places/web-service/place-id for more
     * information.
     * </pre>
     *
     * <code>repeated string place_ids = 4;</code>
     * @param index The index to set the value at.
     * @param value The placeIds to set.
     * @return This builder for chaining.
     */
    public Builder setPlaceIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePlaceIdsIsMutable();
      placeIds_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Google Maps Place IDs of hotels for which assets are requested. See
     * https://developers.google.com/places/web-service/place-id for more
     * information.
     * </pre>
     *
     * <code>repeated string place_ids = 4;</code>
     * @param value The placeIds to add.
     * @return This builder for chaining.
     */
    public Builder addPlaceIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePlaceIdsIsMutable();
      placeIds_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Google Maps Place IDs of hotels for which assets are requested. See
     * https://developers.google.com/places/web-service/place-id for more
     * information.
     * </pre>
     *
     * <code>repeated string place_ids = 4;</code>
     * @param values The placeIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllPlaceIds(
        java.lang.Iterable<java.lang.String> values) {
      ensurePlaceIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, placeIds_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Google Maps Place IDs of hotels for which assets are requested. See
     * https://developers.google.com/places/web-service/place-id for more
     * information.
     * </pre>
     *
     * <code>repeated string place_ids = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlaceIds() {
      placeIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Google Maps Place IDs of hotels for which assets are requested. See
     * https://developers.google.com/places/web-service/place-id for more
     * information.
     * </pre>
     *
     * <code>repeated string place_ids = 4;</code>
     * @param value The bytes of the placeIds to add.
     * @return This builder for chaining.
     */
    public Builder addPlaceIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensurePlaceIdsIsMutable();
      placeIds_.add(value);
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.services.SuggestTravelAssetsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.services.SuggestTravelAssetsRequest)
  private static final com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest();
  }

  public static com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SuggestTravelAssetsRequest>
      PARSER = new com.google.protobuf.AbstractParser<SuggestTravelAssetsRequest>() {
    @java.lang.Override
    public SuggestTravelAssetsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SuggestTravelAssetsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SuggestTravelAssetsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.services.SuggestTravelAssetsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


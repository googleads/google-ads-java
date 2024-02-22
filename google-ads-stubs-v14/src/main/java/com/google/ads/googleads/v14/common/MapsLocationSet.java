// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/asset_set_types.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v14.common;

/**
 * <pre>
 * Wrapper for multiple maps location sync data
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.common.MapsLocationSet}
 */
public final class MapsLocationSet extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.common.MapsLocationSet)
    MapsLocationSetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MapsLocationSet.newBuilder() to construct.
  private MapsLocationSet(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MapsLocationSet() {
    mapsLocations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MapsLocationSet();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.common.AssetSetTypesProto.internal_static_google_ads_googleads_v14_common_MapsLocationSet_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.common.AssetSetTypesProto.internal_static_google_ads_googleads_v14_common_MapsLocationSet_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.common.MapsLocationSet.class, com.google.ads.googleads.v14.common.MapsLocationSet.Builder.class);
  }

  public static final int MAPS_LOCATIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v14.common.MapsLocationInfo> mapsLocations_;
  /**
   * <pre>
   * Required. A list of maps location info that user manually synced in.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v14.common.MapsLocationInfo> getMapsLocationsList() {
    return mapsLocations_;
  }
  /**
   * <pre>
   * Required. A list of maps location info that user manually synced in.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v14.common.MapsLocationInfoOrBuilder> 
      getMapsLocationsOrBuilderList() {
    return mapsLocations_;
  }
  /**
   * <pre>
   * Required. A list of maps location info that user manually synced in.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public int getMapsLocationsCount() {
    return mapsLocations_.size();
  }
  /**
   * <pre>
   * Required. A list of maps location info that user manually synced in.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v14.common.MapsLocationInfo getMapsLocations(int index) {
    return mapsLocations_.get(index);
  }
  /**
   * <pre>
   * Required. A list of maps location info that user manually synced in.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v14.common.MapsLocationInfoOrBuilder getMapsLocationsOrBuilder(
      int index) {
    return mapsLocations_.get(index);
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
    for (int i = 0; i < mapsLocations_.size(); i++) {
      output.writeMessage(1, mapsLocations_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < mapsLocations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, mapsLocations_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v14.common.MapsLocationSet)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.common.MapsLocationSet other = (com.google.ads.googleads.v14.common.MapsLocationSet) obj;

    if (!getMapsLocationsList()
        .equals(other.getMapsLocationsList())) return false;
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
    if (getMapsLocationsCount() > 0) {
      hash = (37 * hash) + MAPS_LOCATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getMapsLocationsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v14.common.MapsLocationSet parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.MapsLocationSet parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.MapsLocationSet parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.MapsLocationSet parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.MapsLocationSet parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.MapsLocationSet parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.MapsLocationSet parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.common.MapsLocationSet parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.common.MapsLocationSet parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.common.MapsLocationSet parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.MapsLocationSet parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.common.MapsLocationSet parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.common.MapsLocationSet prototype) {
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
   * Wrapper for multiple maps location sync data
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.common.MapsLocationSet}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.common.MapsLocationSet)
      com.google.ads.googleads.v14.common.MapsLocationSetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.common.AssetSetTypesProto.internal_static_google_ads_googleads_v14_common_MapsLocationSet_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.common.AssetSetTypesProto.internal_static_google_ads_googleads_v14_common_MapsLocationSet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.common.MapsLocationSet.class, com.google.ads.googleads.v14.common.MapsLocationSet.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.common.MapsLocationSet.newBuilder()
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
      if (mapsLocationsBuilder_ == null) {
        mapsLocations_ = java.util.Collections.emptyList();
      } else {
        mapsLocations_ = null;
        mapsLocationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v14.common.AssetSetTypesProto.internal_static_google_ads_googleads_v14_common_MapsLocationSet_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.MapsLocationSet getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.common.MapsLocationSet.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.MapsLocationSet build() {
      com.google.ads.googleads.v14.common.MapsLocationSet result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.MapsLocationSet buildPartial() {
      com.google.ads.googleads.v14.common.MapsLocationSet result = new com.google.ads.googleads.v14.common.MapsLocationSet(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v14.common.MapsLocationSet result) {
      if (mapsLocationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          mapsLocations_ = java.util.Collections.unmodifiableList(mapsLocations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mapsLocations_ = mapsLocations_;
      } else {
        result.mapsLocations_ = mapsLocationsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v14.common.MapsLocationSet result) {
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
      if (other instanceof com.google.ads.googleads.v14.common.MapsLocationSet) {
        return mergeFrom((com.google.ads.googleads.v14.common.MapsLocationSet)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.common.MapsLocationSet other) {
      if (other == com.google.ads.googleads.v14.common.MapsLocationSet.getDefaultInstance()) return this;
      if (mapsLocationsBuilder_ == null) {
        if (!other.mapsLocations_.isEmpty()) {
          if (mapsLocations_.isEmpty()) {
            mapsLocations_ = other.mapsLocations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMapsLocationsIsMutable();
            mapsLocations_.addAll(other.mapsLocations_);
          }
          onChanged();
        }
      } else {
        if (!other.mapsLocations_.isEmpty()) {
          if (mapsLocationsBuilder_.isEmpty()) {
            mapsLocationsBuilder_.dispose();
            mapsLocationsBuilder_ = null;
            mapsLocations_ = other.mapsLocations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            mapsLocationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMapsLocationsFieldBuilder() : null;
          } else {
            mapsLocationsBuilder_.addAllMessages(other.mapsLocations_);
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
              com.google.ads.googleads.v14.common.MapsLocationInfo m =
                  input.readMessage(
                      com.google.ads.googleads.v14.common.MapsLocationInfo.parser(),
                      extensionRegistry);
              if (mapsLocationsBuilder_ == null) {
                ensureMapsLocationsIsMutable();
                mapsLocations_.add(m);
              } else {
                mapsLocationsBuilder_.addMessage(m);
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

    private java.util.List<com.google.ads.googleads.v14.common.MapsLocationInfo> mapsLocations_ =
      java.util.Collections.emptyList();
    private void ensureMapsLocationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mapsLocations_ = new java.util.ArrayList<com.google.ads.googleads.v14.common.MapsLocationInfo>(mapsLocations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v14.common.MapsLocationInfo, com.google.ads.googleads.v14.common.MapsLocationInfo.Builder, com.google.ads.googleads.v14.common.MapsLocationInfoOrBuilder> mapsLocationsBuilder_;

    /**
     * <pre>
     * Required. A list of maps location info that user manually synced in.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.ads.googleads.v14.common.MapsLocationInfo> getMapsLocationsList() {
      if (mapsLocationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mapsLocations_);
      } else {
        return mapsLocationsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Required. A list of maps location info that user manually synced in.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public int getMapsLocationsCount() {
      if (mapsLocationsBuilder_ == null) {
        return mapsLocations_.size();
      } else {
        return mapsLocationsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Required. A list of maps location info that user manually synced in.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v14.common.MapsLocationInfo getMapsLocations(int index) {
      if (mapsLocationsBuilder_ == null) {
        return mapsLocations_.get(index);
      } else {
        return mapsLocationsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Required. A list of maps location info that user manually synced in.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setMapsLocations(
        int index, com.google.ads.googleads.v14.common.MapsLocationInfo value) {
      if (mapsLocationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMapsLocationsIsMutable();
        mapsLocations_.set(index, value);
        onChanged();
      } else {
        mapsLocationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of maps location info that user manually synced in.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setMapsLocations(
        int index, com.google.ads.googleads.v14.common.MapsLocationInfo.Builder builderForValue) {
      if (mapsLocationsBuilder_ == null) {
        ensureMapsLocationsIsMutable();
        mapsLocations_.set(index, builderForValue.build());
        onChanged();
      } else {
        mapsLocationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of maps location info that user manually synced in.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addMapsLocations(com.google.ads.googleads.v14.common.MapsLocationInfo value) {
      if (mapsLocationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMapsLocationsIsMutable();
        mapsLocations_.add(value);
        onChanged();
      } else {
        mapsLocationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of maps location info that user manually synced in.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addMapsLocations(
        int index, com.google.ads.googleads.v14.common.MapsLocationInfo value) {
      if (mapsLocationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMapsLocationsIsMutable();
        mapsLocations_.add(index, value);
        onChanged();
      } else {
        mapsLocationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of maps location info that user manually synced in.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addMapsLocations(
        com.google.ads.googleads.v14.common.MapsLocationInfo.Builder builderForValue) {
      if (mapsLocationsBuilder_ == null) {
        ensureMapsLocationsIsMutable();
        mapsLocations_.add(builderForValue.build());
        onChanged();
      } else {
        mapsLocationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of maps location info that user manually synced in.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addMapsLocations(
        int index, com.google.ads.googleads.v14.common.MapsLocationInfo.Builder builderForValue) {
      if (mapsLocationsBuilder_ == null) {
        ensureMapsLocationsIsMutable();
        mapsLocations_.add(index, builderForValue.build());
        onChanged();
      } else {
        mapsLocationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of maps location info that user manually synced in.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder addAllMapsLocations(
        java.lang.Iterable<? extends com.google.ads.googleads.v14.common.MapsLocationInfo> values) {
      if (mapsLocationsBuilder_ == null) {
        ensureMapsLocationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mapsLocations_);
        onChanged();
      } else {
        mapsLocationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of maps location info that user manually synced in.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearMapsLocations() {
      if (mapsLocationsBuilder_ == null) {
        mapsLocations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        mapsLocationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of maps location info that user manually synced in.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder removeMapsLocations(int index) {
      if (mapsLocationsBuilder_ == null) {
        ensureMapsLocationsIsMutable();
        mapsLocations_.remove(index);
        onChanged();
      } else {
        mapsLocationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Required. A list of maps location info that user manually synced in.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v14.common.MapsLocationInfo.Builder getMapsLocationsBuilder(
        int index) {
      return getMapsLocationsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Required. A list of maps location info that user manually synced in.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v14.common.MapsLocationInfoOrBuilder getMapsLocationsOrBuilder(
        int index) {
      if (mapsLocationsBuilder_ == null) {
        return mapsLocations_.get(index);  } else {
        return mapsLocationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Required. A list of maps location info that user manually synced in.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v14.common.MapsLocationInfoOrBuilder> 
         getMapsLocationsOrBuilderList() {
      if (mapsLocationsBuilder_ != null) {
        return mapsLocationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mapsLocations_);
      }
    }
    /**
     * <pre>
     * Required. A list of maps location info that user manually synced in.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v14.common.MapsLocationInfo.Builder addMapsLocationsBuilder() {
      return getMapsLocationsFieldBuilder().addBuilder(
          com.google.ads.googleads.v14.common.MapsLocationInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. A list of maps location info that user manually synced in.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.ads.googleads.v14.common.MapsLocationInfo.Builder addMapsLocationsBuilder(
        int index) {
      return getMapsLocationsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v14.common.MapsLocationInfo.getDefaultInstance());
    }
    /**
     * <pre>
     * Required. A list of maps location info that user manually synced in.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v14.common.MapsLocationInfo maps_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.util.List<com.google.ads.googleads.v14.common.MapsLocationInfo.Builder> 
         getMapsLocationsBuilderList() {
      return getMapsLocationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v14.common.MapsLocationInfo, com.google.ads.googleads.v14.common.MapsLocationInfo.Builder, com.google.ads.googleads.v14.common.MapsLocationInfoOrBuilder> 
        getMapsLocationsFieldBuilder() {
      if (mapsLocationsBuilder_ == null) {
        mapsLocationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v14.common.MapsLocationInfo, com.google.ads.googleads.v14.common.MapsLocationInfo.Builder, com.google.ads.googleads.v14.common.MapsLocationInfoOrBuilder>(
                mapsLocations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        mapsLocations_ = null;
      }
      return mapsLocationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.common.MapsLocationSet)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.common.MapsLocationSet)
  private static final com.google.ads.googleads.v14.common.MapsLocationSet DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.common.MapsLocationSet();
  }

  public static com.google.ads.googleads.v14.common.MapsLocationSet getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MapsLocationSet>
      PARSER = new com.google.protobuf.AbstractParser<MapsLocationSet>() {
    @java.lang.Override
    public MapsLocationSet parsePartialFrom(
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

  public static com.google.protobuf.Parser<MapsLocationSet> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MapsLocationSet> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.common.MapsLocationSet getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


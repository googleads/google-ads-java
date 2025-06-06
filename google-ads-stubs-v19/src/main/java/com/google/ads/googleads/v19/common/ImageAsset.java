// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/asset_types.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.common;

/**
 * <pre>
 * An Image asset.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v19.common.ImageAsset}
 */
public final class ImageAsset extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v19.common.ImageAsset)
    ImageAssetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImageAsset.newBuilder() to construct.
  private ImageAsset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImageAsset() {
    data_ = com.google.protobuf.ByteString.EMPTY;
    mimeType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ImageAsset();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v19.common.AssetTypesProto.internal_static_google_ads_googleads_v19_common_ImageAsset_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v19.common.AssetTypesProto.internal_static_google_ads_googleads_v19_common_ImageAsset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v19.common.ImageAsset.class, com.google.ads.googleads.v19.common.ImageAsset.Builder.class);
  }

  private int bitField0_;
  public static final int DATA_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * The raw bytes data of an image. This field is mutate only.
   * </pre>
   *
   * <code>optional bytes data = 5;</code>
   * @return Whether the data field is set.
   */
  @java.lang.Override
  public boolean hasData() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The raw bytes data of an image. This field is mutate only.
   * </pre>
   *
   * <code>optional bytes data = 5;</code>
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getData() {
    return data_;
  }

  public static final int FILE_SIZE_FIELD_NUMBER = 6;
  private long fileSize_ = 0L;
  /**
   * <pre>
   * File size of the image asset in bytes.
   * </pre>
   *
   * <code>optional int64 file_size = 6;</code>
   * @return Whether the fileSize field is set.
   */
  @java.lang.Override
  public boolean hasFileSize() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * File size of the image asset in bytes.
   * </pre>
   *
   * <code>optional int64 file_size = 6;</code>
   * @return The fileSize.
   */
  @java.lang.Override
  public long getFileSize() {
    return fileSize_;
  }

  public static final int MIME_TYPE_FIELD_NUMBER = 3;
  private int mimeType_ = 0;
  /**
   * <pre>
   * MIME type of the image asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.MimeTypeEnum.MimeType mime_type = 3;</code>
   * @return The enum numeric value on the wire for mimeType.
   */
  @java.lang.Override public int getMimeTypeValue() {
    return mimeType_;
  }
  /**
   * <pre>
   * MIME type of the image asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.enums.MimeTypeEnum.MimeType mime_type = 3;</code>
   * @return The mimeType.
   */
  @java.lang.Override public com.google.ads.googleads.v19.enums.MimeTypeEnum.MimeType getMimeType() {
    com.google.ads.googleads.v19.enums.MimeTypeEnum.MimeType result = com.google.ads.googleads.v19.enums.MimeTypeEnum.MimeType.forNumber(mimeType_);
    return result == null ? com.google.ads.googleads.v19.enums.MimeTypeEnum.MimeType.UNRECOGNIZED : result;
  }

  public static final int FULL_SIZE_FIELD_NUMBER = 4;
  private com.google.ads.googleads.v19.common.ImageDimension fullSize_;
  /**
   * <pre>
   * Metadata for this image at its original size.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.ImageDimension full_size = 4;</code>
   * @return Whether the fullSize field is set.
   */
  @java.lang.Override
  public boolean hasFullSize() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <pre>
   * Metadata for this image at its original size.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.ImageDimension full_size = 4;</code>
   * @return The fullSize.
   */
  @java.lang.Override
  public com.google.ads.googleads.v19.common.ImageDimension getFullSize() {
    return fullSize_ == null ? com.google.ads.googleads.v19.common.ImageDimension.getDefaultInstance() : fullSize_;
  }
  /**
   * <pre>
   * Metadata for this image at its original size.
   * </pre>
   *
   * <code>.google.ads.googleads.v19.common.ImageDimension full_size = 4;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v19.common.ImageDimensionOrBuilder getFullSizeOrBuilder() {
    return fullSize_ == null ? com.google.ads.googleads.v19.common.ImageDimension.getDefaultInstance() : fullSize_;
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
    if (mimeType_ != com.google.ads.googleads.v19.enums.MimeTypeEnum.MimeType.UNSPECIFIED.getNumber()) {
      output.writeEnum(3, mimeType_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(4, getFullSize());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBytes(5, data_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(6, fileSize_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mimeType_ != com.google.ads.googleads.v19.enums.MimeTypeEnum.MimeType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, mimeType_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getFullSize());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, data_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, fileSize_);
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
    if (!(obj instanceof com.google.ads.googleads.v19.common.ImageAsset)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v19.common.ImageAsset other = (com.google.ads.googleads.v19.common.ImageAsset) obj;

    if (hasData() != other.hasData()) return false;
    if (hasData()) {
      if (!getData()
          .equals(other.getData())) return false;
    }
    if (hasFileSize() != other.hasFileSize()) return false;
    if (hasFileSize()) {
      if (getFileSize()
          != other.getFileSize()) return false;
    }
    if (mimeType_ != other.mimeType_) return false;
    if (hasFullSize() != other.hasFullSize()) return false;
    if (hasFullSize()) {
      if (!getFullSize()
          .equals(other.getFullSize())) return false;
    }
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
    if (hasData()) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getData().hashCode();
    }
    if (hasFileSize()) {
      hash = (37 * hash) + FILE_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getFileSize());
    }
    hash = (37 * hash) + MIME_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + mimeType_;
    if (hasFullSize()) {
      hash = (37 * hash) + FULL_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getFullSize().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v19.common.ImageAsset parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.ImageAsset parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.ImageAsset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.ImageAsset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.ImageAsset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v19.common.ImageAsset parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.ImageAsset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.common.ImageAsset parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v19.common.ImageAsset parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v19.common.ImageAsset parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v19.common.ImageAsset parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v19.common.ImageAsset parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v19.common.ImageAsset prototype) {
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
   * An Image asset.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v19.common.ImageAsset}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v19.common.ImageAsset)
      com.google.ads.googleads.v19.common.ImageAssetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v19.common.AssetTypesProto.internal_static_google_ads_googleads_v19_common_ImageAsset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v19.common.AssetTypesProto.internal_static_google_ads_googleads_v19_common_ImageAsset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v19.common.ImageAsset.class, com.google.ads.googleads.v19.common.ImageAsset.Builder.class);
    }

    // Construct using com.google.ads.googleads.v19.common.ImageAsset.newBuilder()
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
        getFullSizeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      data_ = com.google.protobuf.ByteString.EMPTY;
      fileSize_ = 0L;
      mimeType_ = 0;
      fullSize_ = null;
      if (fullSizeBuilder_ != null) {
        fullSizeBuilder_.dispose();
        fullSizeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v19.common.AssetTypesProto.internal_static_google_ads_googleads_v19_common_ImageAsset_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.ImageAsset getDefaultInstanceForType() {
      return com.google.ads.googleads.v19.common.ImageAsset.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.ImageAsset build() {
      com.google.ads.googleads.v19.common.ImageAsset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v19.common.ImageAsset buildPartial() {
      com.google.ads.googleads.v19.common.ImageAsset result = new com.google.ads.googleads.v19.common.ImageAsset(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v19.common.ImageAsset result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.data_ = data_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fileSize_ = fileSize_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.mimeType_ = mimeType_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.fullSize_ = fullSizeBuilder_ == null
            ? fullSize_
            : fullSizeBuilder_.build();
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.ads.googleads.v19.common.ImageAsset) {
        return mergeFrom((com.google.ads.googleads.v19.common.ImageAsset)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v19.common.ImageAsset other) {
      if (other == com.google.ads.googleads.v19.common.ImageAsset.getDefaultInstance()) return this;
      if (other.hasData()) {
        setData(other.getData());
      }
      if (other.hasFileSize()) {
        setFileSize(other.getFileSize());
      }
      if (other.mimeType_ != 0) {
        setMimeTypeValue(other.getMimeTypeValue());
      }
      if (other.hasFullSize()) {
        mergeFullSize(other.getFullSize());
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
            case 24: {
              mimeType_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getFullSizeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              data_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 42
            case 48: {
              fileSize_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 48
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

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * The raw bytes data of an image. This field is mutate only.
     * </pre>
     *
     * <code>optional bytes data = 5;</code>
     * @return Whether the data field is set.
     */
    @java.lang.Override
    public boolean hasData() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The raw bytes data of an image. This field is mutate only.
     * </pre>
     *
     * <code>optional bytes data = 5;</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <pre>
     * The raw bytes data of an image. This field is mutate only.
     * </pre>
     *
     * <code>optional bytes data = 5;</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      data_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The raw bytes data of an image. This field is mutate only.
     * </pre>
     *
     * <code>optional bytes data = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      bitField0_ = (bitField0_ & ~0x00000001);
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }

    private long fileSize_ ;
    /**
     * <pre>
     * File size of the image asset in bytes.
     * </pre>
     *
     * <code>optional int64 file_size = 6;</code>
     * @return Whether the fileSize field is set.
     */
    @java.lang.Override
    public boolean hasFileSize() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * File size of the image asset in bytes.
     * </pre>
     *
     * <code>optional int64 file_size = 6;</code>
     * @return The fileSize.
     */
    @java.lang.Override
    public long getFileSize() {
      return fileSize_;
    }
    /**
     * <pre>
     * File size of the image asset in bytes.
     * </pre>
     *
     * <code>optional int64 file_size = 6;</code>
     * @param value The fileSize to set.
     * @return This builder for chaining.
     */
    public Builder setFileSize(long value) {

      fileSize_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * File size of the image asset in bytes.
     * </pre>
     *
     * <code>optional int64 file_size = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearFileSize() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fileSize_ = 0L;
      onChanged();
      return this;
    }

    private int mimeType_ = 0;
    /**
     * <pre>
     * MIME type of the image asset.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.enums.MimeTypeEnum.MimeType mime_type = 3;</code>
     * @return The enum numeric value on the wire for mimeType.
     */
    @java.lang.Override public int getMimeTypeValue() {
      return mimeType_;
    }
    /**
     * <pre>
     * MIME type of the image asset.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.enums.MimeTypeEnum.MimeType mime_type = 3;</code>
     * @param value The enum numeric value on the wire for mimeType to set.
     * @return This builder for chaining.
     */
    public Builder setMimeTypeValue(int value) {
      mimeType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MIME type of the image asset.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.enums.MimeTypeEnum.MimeType mime_type = 3;</code>
     * @return The mimeType.
     */
    @java.lang.Override
    public com.google.ads.googleads.v19.enums.MimeTypeEnum.MimeType getMimeType() {
      com.google.ads.googleads.v19.enums.MimeTypeEnum.MimeType result = com.google.ads.googleads.v19.enums.MimeTypeEnum.MimeType.forNumber(mimeType_);
      return result == null ? com.google.ads.googleads.v19.enums.MimeTypeEnum.MimeType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * MIME type of the image asset.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.enums.MimeTypeEnum.MimeType mime_type = 3;</code>
     * @param value The mimeType to set.
     * @return This builder for chaining.
     */
    public Builder setMimeType(com.google.ads.googleads.v19.enums.MimeTypeEnum.MimeType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      mimeType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * MIME type of the image asset.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.enums.MimeTypeEnum.MimeType mime_type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMimeType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      mimeType_ = 0;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v19.common.ImageDimension fullSize_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v19.common.ImageDimension, com.google.ads.googleads.v19.common.ImageDimension.Builder, com.google.ads.googleads.v19.common.ImageDimensionOrBuilder> fullSizeBuilder_;
    /**
     * <pre>
     * Metadata for this image at its original size.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.common.ImageDimension full_size = 4;</code>
     * @return Whether the fullSize field is set.
     */
    public boolean hasFullSize() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Metadata for this image at its original size.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.common.ImageDimension full_size = 4;</code>
     * @return The fullSize.
     */
    public com.google.ads.googleads.v19.common.ImageDimension getFullSize() {
      if (fullSizeBuilder_ == null) {
        return fullSize_ == null ? com.google.ads.googleads.v19.common.ImageDimension.getDefaultInstance() : fullSize_;
      } else {
        return fullSizeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Metadata for this image at its original size.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.common.ImageDimension full_size = 4;</code>
     */
    public Builder setFullSize(com.google.ads.googleads.v19.common.ImageDimension value) {
      if (fullSizeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fullSize_ = value;
      } else {
        fullSizeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata for this image at its original size.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.common.ImageDimension full_size = 4;</code>
     */
    public Builder setFullSize(
        com.google.ads.googleads.v19.common.ImageDimension.Builder builderForValue) {
      if (fullSizeBuilder_ == null) {
        fullSize_ = builderForValue.build();
      } else {
        fullSizeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata for this image at its original size.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.common.ImageDimension full_size = 4;</code>
     */
    public Builder mergeFullSize(com.google.ads.googleads.v19.common.ImageDimension value) {
      if (fullSizeBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          fullSize_ != null &&
          fullSize_ != com.google.ads.googleads.v19.common.ImageDimension.getDefaultInstance()) {
          getFullSizeBuilder().mergeFrom(value);
        } else {
          fullSize_ = value;
        }
      } else {
        fullSizeBuilder_.mergeFrom(value);
      }
      if (fullSize_ != null) {
        bitField0_ |= 0x00000008;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Metadata for this image at its original size.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.common.ImageDimension full_size = 4;</code>
     */
    public Builder clearFullSize() {
      bitField0_ = (bitField0_ & ~0x00000008);
      fullSize_ = null;
      if (fullSizeBuilder_ != null) {
        fullSizeBuilder_.dispose();
        fullSizeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Metadata for this image at its original size.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.common.ImageDimension full_size = 4;</code>
     */
    public com.google.ads.googleads.v19.common.ImageDimension.Builder getFullSizeBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getFullSizeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Metadata for this image at its original size.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.common.ImageDimension full_size = 4;</code>
     */
    public com.google.ads.googleads.v19.common.ImageDimensionOrBuilder getFullSizeOrBuilder() {
      if (fullSizeBuilder_ != null) {
        return fullSizeBuilder_.getMessageOrBuilder();
      } else {
        return fullSize_ == null ?
            com.google.ads.googleads.v19.common.ImageDimension.getDefaultInstance() : fullSize_;
      }
    }
    /**
     * <pre>
     * Metadata for this image at its original size.
     * </pre>
     *
     * <code>.google.ads.googleads.v19.common.ImageDimension full_size = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v19.common.ImageDimension, com.google.ads.googleads.v19.common.ImageDimension.Builder, com.google.ads.googleads.v19.common.ImageDimensionOrBuilder> 
        getFullSizeFieldBuilder() {
      if (fullSizeBuilder_ == null) {
        fullSizeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v19.common.ImageDimension, com.google.ads.googleads.v19.common.ImageDimension.Builder, com.google.ads.googleads.v19.common.ImageDimensionOrBuilder>(
                getFullSize(),
                getParentForChildren(),
                isClean());
        fullSize_ = null;
      }
      return fullSizeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v19.common.ImageAsset)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v19.common.ImageAsset)
  private static final com.google.ads.googleads.v19.common.ImageAsset DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v19.common.ImageAsset();
  }

  public static com.google.ads.googleads.v19.common.ImageAsset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImageAsset>
      PARSER = new com.google.protobuf.AbstractParser<ImageAsset>() {
    @java.lang.Override
    public ImageAsset parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImageAsset> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImageAsset> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v19.common.ImageAsset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


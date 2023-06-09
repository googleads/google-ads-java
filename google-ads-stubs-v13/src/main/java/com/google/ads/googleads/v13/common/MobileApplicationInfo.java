// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/common/criteria.proto

package com.google.ads.googleads.v13.common;

/**
 * <pre>
 * A mobile application criterion.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v13.common.MobileApplicationInfo}
 */
public final class MobileApplicationInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v13.common.MobileApplicationInfo)
    MobileApplicationInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MobileApplicationInfo.newBuilder() to construct.
  private MobileApplicationInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MobileApplicationInfo() {
    appId_ = "";
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MobileApplicationInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v13.common.CriteriaProto.internal_static_google_ads_googleads_v13_common_MobileApplicationInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v13.common.CriteriaProto.internal_static_google_ads_googleads_v13_common_MobileApplicationInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v13.common.MobileApplicationInfo.class, com.google.ads.googleads.v13.common.MobileApplicationInfo.Builder.class);
  }

  private int bitField0_;
  public static final int APP_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object appId_ = "";
  /**
   * <pre>
   * A string that uniquely identifies a mobile application to Google Ads API.
   * The format of this string is "{platform}-{platform_native_id}", where
   * platform is "1" for iOS apps and "2" for Android apps, and where
   * platform_native_id is the mobile application identifier native to the
   * corresponding platform.
   * For iOS, this native identifier is the 9 digit string that appears at the
   * end of an App Store URL (for example, "476943146" for "Flood-It! 2" whose
   * App Store link is
   * "http://itunes.apple.com/us/app/flood-it!-2/id476943146"). For Android,
   * this native identifier is the application's package name (for example,
   * "com.labpixies.colordrips" for "Color Drips" given Google Play link
   * "https://play.google.com/store/apps/details?id=com.labpixies.colordrips").
   * A well formed app id for Google Ads API would thus be "1-476943146" for iOS
   * and "2-com.labpixies.colordrips" for Android.
   * This field is required and must be set in CREATE operations.
   * </pre>
   *
   * <code>optional string app_id = 4;</code>
   * @return Whether the appId field is set.
   */
  @java.lang.Override
  public boolean hasAppId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * A string that uniquely identifies a mobile application to Google Ads API.
   * The format of this string is "{platform}-{platform_native_id}", where
   * platform is "1" for iOS apps and "2" for Android apps, and where
   * platform_native_id is the mobile application identifier native to the
   * corresponding platform.
   * For iOS, this native identifier is the 9 digit string that appears at the
   * end of an App Store URL (for example, "476943146" for "Flood-It! 2" whose
   * App Store link is
   * "http://itunes.apple.com/us/app/flood-it!-2/id476943146"). For Android,
   * this native identifier is the application's package name (for example,
   * "com.labpixies.colordrips" for "Color Drips" given Google Play link
   * "https://play.google.com/store/apps/details?id=com.labpixies.colordrips").
   * A well formed app id for Google Ads API would thus be "1-476943146" for iOS
   * and "2-com.labpixies.colordrips" for Android.
   * This field is required and must be set in CREATE operations.
   * </pre>
   *
   * <code>optional string app_id = 4;</code>
   * @return The appId.
   */
  @java.lang.Override
  public java.lang.String getAppId() {
    java.lang.Object ref = appId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      appId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * A string that uniquely identifies a mobile application to Google Ads API.
   * The format of this string is "{platform}-{platform_native_id}", where
   * platform is "1" for iOS apps and "2" for Android apps, and where
   * platform_native_id is the mobile application identifier native to the
   * corresponding platform.
   * For iOS, this native identifier is the 9 digit string that appears at the
   * end of an App Store URL (for example, "476943146" for "Flood-It! 2" whose
   * App Store link is
   * "http://itunes.apple.com/us/app/flood-it!-2/id476943146"). For Android,
   * this native identifier is the application's package name (for example,
   * "com.labpixies.colordrips" for "Color Drips" given Google Play link
   * "https://play.google.com/store/apps/details?id=com.labpixies.colordrips").
   * A well formed app id for Google Ads API would thus be "1-476943146" for iOS
   * and "2-com.labpixies.colordrips" for Android.
   * This field is required and must be set in CREATE operations.
   * </pre>
   *
   * <code>optional string app_id = 4;</code>
   * @return The bytes for appId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAppIdBytes() {
    java.lang.Object ref = appId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      appId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <pre>
   * Name of this mobile application.
   * </pre>
   *
   * <code>optional string name = 5;</code>
   * @return Whether the name field is set.
   */
  @java.lang.Override
  public boolean hasName() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Name of this mobile application.
   * </pre>
   *
   * <code>optional string name = 5;</code>
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
   * Name of this mobile application.
   * </pre>
   *
   * <code>optional string name = 5;</code>
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
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, appId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, name_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, appId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, name_);
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
    if (!(obj instanceof com.google.ads.googleads.v13.common.MobileApplicationInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v13.common.MobileApplicationInfo other = (com.google.ads.googleads.v13.common.MobileApplicationInfo) obj;

    if (hasAppId() != other.hasAppId()) return false;
    if (hasAppId()) {
      if (!getAppId()
          .equals(other.getAppId())) return false;
    }
    if (hasName() != other.hasName()) return false;
    if (hasName()) {
      if (!getName()
          .equals(other.getName())) return false;
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
    if (hasAppId()) {
      hash = (37 * hash) + APP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAppId().hashCode();
    }
    if (hasName()) {
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v13.common.MobileApplicationInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.common.MobileApplicationInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.MobileApplicationInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.common.MobileApplicationInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.MobileApplicationInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.common.MobileApplicationInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.MobileApplicationInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.common.MobileApplicationInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v13.common.MobileApplicationInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v13.common.MobileApplicationInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.common.MobileApplicationInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.common.MobileApplicationInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v13.common.MobileApplicationInfo prototype) {
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
   * A mobile application criterion.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v13.common.MobileApplicationInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v13.common.MobileApplicationInfo)
      com.google.ads.googleads.v13.common.MobileApplicationInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v13.common.CriteriaProto.internal_static_google_ads_googleads_v13_common_MobileApplicationInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v13.common.CriteriaProto.internal_static_google_ads_googleads_v13_common_MobileApplicationInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v13.common.MobileApplicationInfo.class, com.google.ads.googleads.v13.common.MobileApplicationInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v13.common.MobileApplicationInfo.newBuilder()
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
      appId_ = "";
      name_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v13.common.CriteriaProto.internal_static_google_ads_googleads_v13_common_MobileApplicationInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.common.MobileApplicationInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v13.common.MobileApplicationInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.common.MobileApplicationInfo build() {
      com.google.ads.googleads.v13.common.MobileApplicationInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.common.MobileApplicationInfo buildPartial() {
      com.google.ads.googleads.v13.common.MobileApplicationInfo result = new com.google.ads.googleads.v13.common.MobileApplicationInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v13.common.MobileApplicationInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.appId_ = appId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.ads.googleads.v13.common.MobileApplicationInfo) {
        return mergeFrom((com.google.ads.googleads.v13.common.MobileApplicationInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v13.common.MobileApplicationInfo other) {
      if (other == com.google.ads.googleads.v13.common.MobileApplicationInfo.getDefaultInstance()) return this;
      if (other.hasAppId()) {
        appId_ = other.appId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasName()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
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
            case 34: {
              appId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 34
            case 42: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 42
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

    private java.lang.Object appId_ = "";
    /**
     * <pre>
     * A string that uniquely identifies a mobile application to Google Ads API.
     * The format of this string is "{platform}-{platform_native_id}", where
     * platform is "1" for iOS apps and "2" for Android apps, and where
     * platform_native_id is the mobile application identifier native to the
     * corresponding platform.
     * For iOS, this native identifier is the 9 digit string that appears at the
     * end of an App Store URL (for example, "476943146" for "Flood-It! 2" whose
     * App Store link is
     * "http://itunes.apple.com/us/app/flood-it!-2/id476943146"). For Android,
     * this native identifier is the application's package name (for example,
     * "com.labpixies.colordrips" for "Color Drips" given Google Play link
     * "https://play.google.com/store/apps/details?id=com.labpixies.colordrips").
     * A well formed app id for Google Ads API would thus be "1-476943146" for iOS
     * and "2-com.labpixies.colordrips" for Android.
     * This field is required and must be set in CREATE operations.
     * </pre>
     *
     * <code>optional string app_id = 4;</code>
     * @return Whether the appId field is set.
     */
    public boolean hasAppId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * A string that uniquely identifies a mobile application to Google Ads API.
     * The format of this string is "{platform}-{platform_native_id}", where
     * platform is "1" for iOS apps and "2" for Android apps, and where
     * platform_native_id is the mobile application identifier native to the
     * corresponding platform.
     * For iOS, this native identifier is the 9 digit string that appears at the
     * end of an App Store URL (for example, "476943146" for "Flood-It! 2" whose
     * App Store link is
     * "http://itunes.apple.com/us/app/flood-it!-2/id476943146"). For Android,
     * this native identifier is the application's package name (for example,
     * "com.labpixies.colordrips" for "Color Drips" given Google Play link
     * "https://play.google.com/store/apps/details?id=com.labpixies.colordrips").
     * A well formed app id for Google Ads API would thus be "1-476943146" for iOS
     * and "2-com.labpixies.colordrips" for Android.
     * This field is required and must be set in CREATE operations.
     * </pre>
     *
     * <code>optional string app_id = 4;</code>
     * @return The appId.
     */
    public java.lang.String getAppId() {
      java.lang.Object ref = appId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        appId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A string that uniquely identifies a mobile application to Google Ads API.
     * The format of this string is "{platform}-{platform_native_id}", where
     * platform is "1" for iOS apps and "2" for Android apps, and where
     * platform_native_id is the mobile application identifier native to the
     * corresponding platform.
     * For iOS, this native identifier is the 9 digit string that appears at the
     * end of an App Store URL (for example, "476943146" for "Flood-It! 2" whose
     * App Store link is
     * "http://itunes.apple.com/us/app/flood-it!-2/id476943146"). For Android,
     * this native identifier is the application's package name (for example,
     * "com.labpixies.colordrips" for "Color Drips" given Google Play link
     * "https://play.google.com/store/apps/details?id=com.labpixies.colordrips").
     * A well formed app id for Google Ads API would thus be "1-476943146" for iOS
     * and "2-com.labpixies.colordrips" for Android.
     * This field is required and must be set in CREATE operations.
     * </pre>
     *
     * <code>optional string app_id = 4;</code>
     * @return The bytes for appId.
     */
    public com.google.protobuf.ByteString
        getAppIdBytes() {
      java.lang.Object ref = appId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A string that uniquely identifies a mobile application to Google Ads API.
     * The format of this string is "{platform}-{platform_native_id}", where
     * platform is "1" for iOS apps and "2" for Android apps, and where
     * platform_native_id is the mobile application identifier native to the
     * corresponding platform.
     * For iOS, this native identifier is the 9 digit string that appears at the
     * end of an App Store URL (for example, "476943146" for "Flood-It! 2" whose
     * App Store link is
     * "http://itunes.apple.com/us/app/flood-it!-2/id476943146"). For Android,
     * this native identifier is the application's package name (for example,
     * "com.labpixies.colordrips" for "Color Drips" given Google Play link
     * "https://play.google.com/store/apps/details?id=com.labpixies.colordrips").
     * A well formed app id for Google Ads API would thus be "1-476943146" for iOS
     * and "2-com.labpixies.colordrips" for Android.
     * This field is required and must be set in CREATE operations.
     * </pre>
     *
     * <code>optional string app_id = 4;</code>
     * @param value The appId to set.
     * @return This builder for chaining.
     */
    public Builder setAppId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      appId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A string that uniquely identifies a mobile application to Google Ads API.
     * The format of this string is "{platform}-{platform_native_id}", where
     * platform is "1" for iOS apps and "2" for Android apps, and where
     * platform_native_id is the mobile application identifier native to the
     * corresponding platform.
     * For iOS, this native identifier is the 9 digit string that appears at the
     * end of an App Store URL (for example, "476943146" for "Flood-It! 2" whose
     * App Store link is
     * "http://itunes.apple.com/us/app/flood-it!-2/id476943146"). For Android,
     * this native identifier is the application's package name (for example,
     * "com.labpixies.colordrips" for "Color Drips" given Google Play link
     * "https://play.google.com/store/apps/details?id=com.labpixies.colordrips").
     * A well formed app id for Google Ads API would thus be "1-476943146" for iOS
     * and "2-com.labpixies.colordrips" for Android.
     * This field is required and must be set in CREATE operations.
     * </pre>
     *
     * <code>optional string app_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearAppId() {
      appId_ = getDefaultInstance().getAppId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A string that uniquely identifies a mobile application to Google Ads API.
     * The format of this string is "{platform}-{platform_native_id}", where
     * platform is "1" for iOS apps and "2" for Android apps, and where
     * platform_native_id is the mobile application identifier native to the
     * corresponding platform.
     * For iOS, this native identifier is the 9 digit string that appears at the
     * end of an App Store URL (for example, "476943146" for "Flood-It! 2" whose
     * App Store link is
     * "http://itunes.apple.com/us/app/flood-it!-2/id476943146"). For Android,
     * this native identifier is the application's package name (for example,
     * "com.labpixies.colordrips" for "Color Drips" given Google Play link
     * "https://play.google.com/store/apps/details?id=com.labpixies.colordrips").
     * A well formed app id for Google Ads API would thus be "1-476943146" for iOS
     * and "2-com.labpixies.colordrips" for Android.
     * This field is required and must be set in CREATE operations.
     * </pre>
     *
     * <code>optional string app_id = 4;</code>
     * @param value The bytes for appId to set.
     * @return This builder for chaining.
     */
    public Builder setAppIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      appId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Name of this mobile application.
     * </pre>
     *
     * <code>optional string name = 5;</code>
     * @return Whether the name field is set.
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Name of this mobile application.
     * </pre>
     *
     * <code>optional string name = 5;</code>
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
     * Name of this mobile application.
     * </pre>
     *
     * <code>optional string name = 5;</code>
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
     * Name of this mobile application.
     * </pre>
     *
     * <code>optional string name = 5;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of this mobile application.
     * </pre>
     *
     * <code>optional string name = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of this mobile application.
     * </pre>
     *
     * <code>optional string name = 5;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v13.common.MobileApplicationInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v13.common.MobileApplicationInfo)
  private static final com.google.ads.googleads.v13.common.MobileApplicationInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v13.common.MobileApplicationInfo();
  }

  public static com.google.ads.googleads.v13.common.MobileApplicationInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MobileApplicationInfo>
      PARSER = new com.google.protobuf.AbstractParser<MobileApplicationInfo>() {
    @java.lang.Override
    public MobileApplicationInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<MobileApplicationInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MobileApplicationInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v13.common.MobileApplicationInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


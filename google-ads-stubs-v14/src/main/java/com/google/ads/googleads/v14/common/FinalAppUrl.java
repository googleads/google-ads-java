// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/final_app_url.proto

package com.google.ads.googleads.v14.common;

/**
 * <pre>
 * A URL for deep linking into an app for the given operating system.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.common.FinalAppUrl}
 */
public final class FinalAppUrl extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.common.FinalAppUrl)
    FinalAppUrlOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FinalAppUrl.newBuilder() to construct.
  private FinalAppUrl(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FinalAppUrl() {
    osType_ = 0;
    url_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FinalAppUrl();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.common.FinalAppUrlProto.internal_static_google_ads_googleads_v14_common_FinalAppUrl_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.common.FinalAppUrlProto.internal_static_google_ads_googleads_v14_common_FinalAppUrl_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.common.FinalAppUrl.class, com.google.ads.googleads.v14.common.FinalAppUrl.Builder.class);
  }

  private int bitField0_;
  public static final int OS_TYPE_FIELD_NUMBER = 1;
  private int osType_ = 0;
  /**
   * <pre>
   * The operating system targeted by this URL. Required.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.AppUrlOperatingSystemTypeEnum.AppUrlOperatingSystemType os_type = 1;</code>
   * @return The enum numeric value on the wire for osType.
   */
  @java.lang.Override public int getOsTypeValue() {
    return osType_;
  }
  /**
   * <pre>
   * The operating system targeted by this URL. Required.
   * </pre>
   *
   * <code>.google.ads.googleads.v14.enums.AppUrlOperatingSystemTypeEnum.AppUrlOperatingSystemType os_type = 1;</code>
   * @return The osType.
   */
  @java.lang.Override public com.google.ads.googleads.v14.enums.AppUrlOperatingSystemTypeEnum.AppUrlOperatingSystemType getOsType() {
    com.google.ads.googleads.v14.enums.AppUrlOperatingSystemTypeEnum.AppUrlOperatingSystemType result = com.google.ads.googleads.v14.enums.AppUrlOperatingSystemTypeEnum.AppUrlOperatingSystemType.forNumber(osType_);
    return result == null ? com.google.ads.googleads.v14.enums.AppUrlOperatingSystemTypeEnum.AppUrlOperatingSystemType.UNRECOGNIZED : result;
  }

  public static final int URL_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object url_ = "";
  /**
   * <pre>
   * The app deep link URL. Deep links specify a location in an app that
   * corresponds to the content you'd like to show, and should be of the form
   * {scheme}://{host_path}
   * The scheme identifies which app to open. For your app, you can use a custom
   * scheme that starts with the app's name. The host and path specify the
   * unique location in the app where your content exists.
   * Example: "exampleapp://productid_1234". Required.
   * </pre>
   *
   * <code>optional string url = 3;</code>
   * @return Whether the url field is set.
   */
  @java.lang.Override
  public boolean hasUrl() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The app deep link URL. Deep links specify a location in an app that
   * corresponds to the content you'd like to show, and should be of the form
   * {scheme}://{host_path}
   * The scheme identifies which app to open. For your app, you can use a custom
   * scheme that starts with the app's name. The host and path specify the
   * unique location in the app where your content exists.
   * Example: "exampleapp://productid_1234". Required.
   * </pre>
   *
   * <code>optional string url = 3;</code>
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The app deep link URL. Deep links specify a location in an app that
   * corresponds to the content you'd like to show, and should be of the form
   * {scheme}://{host_path}
   * The scheme identifies which app to open. For your app, you can use a custom
   * scheme that starts with the app's name. The host and path specify the
   * unique location in the app where your content exists.
   * Example: "exampleapp://productid_1234". Required.
   * </pre>
   *
   * <code>optional string url = 3;</code>
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      url_ = b;
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
    if (osType_ != com.google.ads.googleads.v14.enums.AppUrlOperatingSystemTypeEnum.AppUrlOperatingSystemType.UNSPECIFIED.getNumber()) {
      output.writeEnum(1, osType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, url_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (osType_ != com.google.ads.googleads.v14.enums.AppUrlOperatingSystemTypeEnum.AppUrlOperatingSystemType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, osType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, url_);
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
    if (!(obj instanceof com.google.ads.googleads.v14.common.FinalAppUrl)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.common.FinalAppUrl other = (com.google.ads.googleads.v14.common.FinalAppUrl) obj;

    if (osType_ != other.osType_) return false;
    if (hasUrl() != other.hasUrl()) return false;
    if (hasUrl()) {
      if (!getUrl()
          .equals(other.getUrl())) return false;
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
    hash = (37 * hash) + OS_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + osType_;
    if (hasUrl()) {
      hash = (37 * hash) + URL_FIELD_NUMBER;
      hash = (53 * hash) + getUrl().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v14.common.FinalAppUrl parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.FinalAppUrl parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.FinalAppUrl parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.FinalAppUrl parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.FinalAppUrl parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.FinalAppUrl parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.FinalAppUrl parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.common.FinalAppUrl parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.common.FinalAppUrl parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.common.FinalAppUrl parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.FinalAppUrl parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.common.FinalAppUrl parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.common.FinalAppUrl prototype) {
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
   * A URL for deep linking into an app for the given operating system.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.common.FinalAppUrl}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.common.FinalAppUrl)
      com.google.ads.googleads.v14.common.FinalAppUrlOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.common.FinalAppUrlProto.internal_static_google_ads_googleads_v14_common_FinalAppUrl_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.common.FinalAppUrlProto.internal_static_google_ads_googleads_v14_common_FinalAppUrl_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.common.FinalAppUrl.class, com.google.ads.googleads.v14.common.FinalAppUrl.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.common.FinalAppUrl.newBuilder()
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
      osType_ = 0;
      url_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v14.common.FinalAppUrlProto.internal_static_google_ads_googleads_v14_common_FinalAppUrl_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.FinalAppUrl getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.common.FinalAppUrl.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.FinalAppUrl build() {
      com.google.ads.googleads.v14.common.FinalAppUrl result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.FinalAppUrl buildPartial() {
      com.google.ads.googleads.v14.common.FinalAppUrl result = new com.google.ads.googleads.v14.common.FinalAppUrl(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v14.common.FinalAppUrl result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.osType_ = osType_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.url_ = url_;
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.ads.googleads.v14.common.FinalAppUrl) {
        return mergeFrom((com.google.ads.googleads.v14.common.FinalAppUrl)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.common.FinalAppUrl other) {
      if (other == com.google.ads.googleads.v14.common.FinalAppUrl.getDefaultInstance()) return this;
      if (other.osType_ != 0) {
        setOsTypeValue(other.getOsTypeValue());
      }
      if (other.hasUrl()) {
        url_ = other.url_;
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
            case 8: {
              osType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 26: {
              url_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 26
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

    private int osType_ = 0;
    /**
     * <pre>
     * The operating system targeted by this URL. Required.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.AppUrlOperatingSystemTypeEnum.AppUrlOperatingSystemType os_type = 1;</code>
     * @return The enum numeric value on the wire for osType.
     */
    @java.lang.Override public int getOsTypeValue() {
      return osType_;
    }
    /**
     * <pre>
     * The operating system targeted by this URL. Required.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.AppUrlOperatingSystemTypeEnum.AppUrlOperatingSystemType os_type = 1;</code>
     * @param value The enum numeric value on the wire for osType to set.
     * @return This builder for chaining.
     */
    public Builder setOsTypeValue(int value) {
      osType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The operating system targeted by this URL. Required.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.AppUrlOperatingSystemTypeEnum.AppUrlOperatingSystemType os_type = 1;</code>
     * @return The osType.
     */
    @java.lang.Override
    public com.google.ads.googleads.v14.enums.AppUrlOperatingSystemTypeEnum.AppUrlOperatingSystemType getOsType() {
      com.google.ads.googleads.v14.enums.AppUrlOperatingSystemTypeEnum.AppUrlOperatingSystemType result = com.google.ads.googleads.v14.enums.AppUrlOperatingSystemTypeEnum.AppUrlOperatingSystemType.forNumber(osType_);
      return result == null ? com.google.ads.googleads.v14.enums.AppUrlOperatingSystemTypeEnum.AppUrlOperatingSystemType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The operating system targeted by this URL. Required.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.AppUrlOperatingSystemTypeEnum.AppUrlOperatingSystemType os_type = 1;</code>
     * @param value The osType to set.
     * @return This builder for chaining.
     */
    public Builder setOsType(com.google.ads.googleads.v14.enums.AppUrlOperatingSystemTypeEnum.AppUrlOperatingSystemType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      osType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The operating system targeted by this URL. Required.
     * </pre>
     *
     * <code>.google.ads.googleads.v14.enums.AppUrlOperatingSystemTypeEnum.AppUrlOperatingSystemType os_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearOsType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      osType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object url_ = "";
    /**
     * <pre>
     * The app deep link URL. Deep links specify a location in an app that
     * corresponds to the content you'd like to show, and should be of the form
     * {scheme}://{host_path}
     * The scheme identifies which app to open. For your app, you can use a custom
     * scheme that starts with the app's name. The host and path specify the
     * unique location in the app where your content exists.
     * Example: "exampleapp://productid_1234". Required.
     * </pre>
     *
     * <code>optional string url = 3;</code>
     * @return Whether the url field is set.
     */
    public boolean hasUrl() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The app deep link URL. Deep links specify a location in an app that
     * corresponds to the content you'd like to show, and should be of the form
     * {scheme}://{host_path}
     * The scheme identifies which app to open. For your app, you can use a custom
     * scheme that starts with the app's name. The host and path specify the
     * unique location in the app where your content exists.
     * Example: "exampleapp://productid_1234". Required.
     * </pre>
     *
     * <code>optional string url = 3;</code>
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The app deep link URL. Deep links specify a location in an app that
     * corresponds to the content you'd like to show, and should be of the form
     * {scheme}://{host_path}
     * The scheme identifies which app to open. For your app, you can use a custom
     * scheme that starts with the app's name. The host and path specify the
     * unique location in the app where your content exists.
     * Example: "exampleapp://productid_1234". Required.
     * </pre>
     *
     * <code>optional string url = 3;</code>
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The app deep link URL. Deep links specify a location in an app that
     * corresponds to the content you'd like to show, and should be of the form
     * {scheme}://{host_path}
     * The scheme identifies which app to open. For your app, you can use a custom
     * scheme that starts with the app's name. The host and path specify the
     * unique location in the app where your content exists.
     * Example: "exampleapp://productid_1234". Required.
     * </pre>
     *
     * <code>optional string url = 3;</code>
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      url_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The app deep link URL. Deep links specify a location in an app that
     * corresponds to the content you'd like to show, and should be of the form
     * {scheme}://{host_path}
     * The scheme identifies which app to open. For your app, you can use a custom
     * scheme that starts with the app's name. The host and path specify the
     * unique location in the app where your content exists.
     * Example: "exampleapp://productid_1234". Required.
     * </pre>
     *
     * <code>optional string url = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      url_ = getDefaultInstance().getUrl();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The app deep link URL. Deep links specify a location in an app that
     * corresponds to the content you'd like to show, and should be of the form
     * {scheme}://{host_path}
     * The scheme identifies which app to open. For your app, you can use a custom
     * scheme that starts with the app's name. The host and path specify the
     * unique location in the app where your content exists.
     * Example: "exampleapp://productid_1234". Required.
     * </pre>
     *
     * <code>optional string url = 3;</code>
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      url_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.common.FinalAppUrl)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.common.FinalAppUrl)
  private static final com.google.ads.googleads.v14.common.FinalAppUrl DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.common.FinalAppUrl();
  }

  public static com.google.ads.googleads.v14.common.FinalAppUrl getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FinalAppUrl>
      PARSER = new com.google.protobuf.AbstractParser<FinalAppUrl>() {
    @java.lang.Override
    public FinalAppUrl parsePartialFrom(
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

  public static com.google.protobuf.Parser<FinalAppUrl> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FinalAppUrl> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.common.FinalAppUrl getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


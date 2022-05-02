// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/resources/account_link.proto

package com.google.ads.googleads.v10.resources;

/**
 * <pre>
 * The identifiers of a Third Party App Analytics Link.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier}
 */
public final class ThirdPartyAppAnalyticsLinkIdentifier extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier)
    ThirdPartyAppAnalyticsLinkIdentifierOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ThirdPartyAppAnalyticsLinkIdentifier.newBuilder() to construct.
  private ThirdPartyAppAnalyticsLinkIdentifier(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ThirdPartyAppAnalyticsLinkIdentifier() {
    appId_ = "";
    appVendor_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ThirdPartyAppAnalyticsLinkIdentifier();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ThirdPartyAppAnalyticsLinkIdentifier(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 24: {
            int rawValue = input.readEnum();

            appVendor_ = rawValue;
            break;
          }
          case 32: {
            bitField0_ |= 0x00000001;
            appAnalyticsProviderId_ = input.readInt64();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();
            bitField0_ |= 0x00000002;
            appId_ = s;
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
    return com.google.ads.googleads.v10.resources.AccountLinkProto.internal_static_google_ads_googleads_v10_resources_ThirdPartyAppAnalyticsLinkIdentifier_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.resources.AccountLinkProto.internal_static_google_ads_googleads_v10_resources_ThirdPartyAppAnalyticsLinkIdentifier_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier.class, com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier.Builder.class);
  }

  private int bitField0_;
  public static final int APP_ANALYTICS_PROVIDER_ID_FIELD_NUMBER = 4;
  private long appAnalyticsProviderId_;
  /**
   * <pre>
   * Immutable. The ID of the app analytics provider.
   * This field should not be empty when creating a new third
   * party app analytics link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional int64 app_analytics_provider_id = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the appAnalyticsProviderId field is set.
   */
  @java.lang.Override
  public boolean hasAppAnalyticsProviderId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Immutable. The ID of the app analytics provider.
   * This field should not be empty when creating a new third
   * party app analytics link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional int64 app_analytics_provider_id = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The appAnalyticsProviderId.
   */
  @java.lang.Override
  public long getAppAnalyticsProviderId() {
    return appAnalyticsProviderId_;
  }

  public static final int APP_ID_FIELD_NUMBER = 5;
  private volatile java.lang.Object appId_;
  /**
   * <pre>
   * Immutable. A string that uniquely identifies a mobile application from which the data
   * was collected to the Google Ads API. For iOS, the ID string is the 9 digit
   * string that appears at the end of an App Store URL (e.g., "422689480" for
   * "Gmail" whose App Store link is
   * https://apps.apple.com/us/app/gmail-email-by-google/id422689480). For
   * Android, the ID string is the application's package name (e.g.,
   * "com.google.android.gm" for "Gmail" given Google Play link
   * https://play.google.com/store/apps/details?id=com.google.android.gm)
   * This field should not be empty when creating a new third
   * party app analytics link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional string app_id = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the appId field is set.
   */
  @java.lang.Override
  public boolean hasAppId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Immutable. A string that uniquely identifies a mobile application from which the data
   * was collected to the Google Ads API. For iOS, the ID string is the 9 digit
   * string that appears at the end of an App Store URL (e.g., "422689480" for
   * "Gmail" whose App Store link is
   * https://apps.apple.com/us/app/gmail-email-by-google/id422689480). For
   * Android, the ID string is the application's package name (e.g.,
   * "com.google.android.gm" for "Gmail" given Google Play link
   * https://play.google.com/store/apps/details?id=com.google.android.gm)
   * This field should not be empty when creating a new third
   * party app analytics link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional string app_id = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
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
   * Immutable. A string that uniquely identifies a mobile application from which the data
   * was collected to the Google Ads API. For iOS, the ID string is the 9 digit
   * string that appears at the end of an App Store URL (e.g., "422689480" for
   * "Gmail" whose App Store link is
   * https://apps.apple.com/us/app/gmail-email-by-google/id422689480). For
   * Android, the ID string is the application's package name (e.g.,
   * "com.google.android.gm" for "Gmail" given Google Play link
   * https://play.google.com/store/apps/details?id=com.google.android.gm)
   * This field should not be empty when creating a new third
   * party app analytics link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>optional string app_id = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
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

  public static final int APP_VENDOR_FIELD_NUMBER = 3;
  private int appVendor_;
  /**
   * <pre>
   * Immutable. The vendor of the app.
   * This field should not be empty when creating a new third
   * party app analytics link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.MobileAppVendorEnum.MobileAppVendor app_vendor = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for appVendor.
   */
  @java.lang.Override public int getAppVendorValue() {
    return appVendor_;
  }
  /**
   * <pre>
   * Immutable. The vendor of the app.
   * This field should not be empty when creating a new third
   * party app analytics link. It is unable to be modified after the creation of
   * the link.
   * </pre>
   *
   * <code>.google.ads.googleads.v10.enums.MobileAppVendorEnum.MobileAppVendor app_vendor = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The appVendor.
   */
  @java.lang.Override public com.google.ads.googleads.v10.enums.MobileAppVendorEnum.MobileAppVendor getAppVendor() {
    @SuppressWarnings("deprecation")
    com.google.ads.googleads.v10.enums.MobileAppVendorEnum.MobileAppVendor result = com.google.ads.googleads.v10.enums.MobileAppVendorEnum.MobileAppVendor.valueOf(appVendor_);
    return result == null ? com.google.ads.googleads.v10.enums.MobileAppVendorEnum.MobileAppVendor.UNRECOGNIZED : result;
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
    if (appVendor_ != com.google.ads.googleads.v10.enums.MobileAppVendorEnum.MobileAppVendor.UNSPECIFIED.getNumber()) {
      output.writeEnum(3, appVendor_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(4, appAnalyticsProviderId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, appId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (appVendor_ != com.google.ads.googleads.v10.enums.MobileAppVendorEnum.MobileAppVendor.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, appVendor_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, appAnalyticsProviderId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, appId_);
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
    if (!(obj instanceof com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier other = (com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier) obj;

    if (hasAppAnalyticsProviderId() != other.hasAppAnalyticsProviderId()) return false;
    if (hasAppAnalyticsProviderId()) {
      if (getAppAnalyticsProviderId()
          != other.getAppAnalyticsProviderId()) return false;
    }
    if (hasAppId() != other.hasAppId()) return false;
    if (hasAppId()) {
      if (!getAppId()
          .equals(other.getAppId())) return false;
    }
    if (appVendor_ != other.appVendor_) return false;
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
    if (hasAppAnalyticsProviderId()) {
      hash = (37 * hash) + APP_ANALYTICS_PROVIDER_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAppAnalyticsProviderId());
    }
    if (hasAppId()) {
      hash = (37 * hash) + APP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAppId().hashCode();
    }
    hash = (37 * hash) + APP_VENDOR_FIELD_NUMBER;
    hash = (53 * hash) + appVendor_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier prototype) {
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
   * The identifiers of a Third Party App Analytics Link.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier)
      com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifierOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.resources.AccountLinkProto.internal_static_google_ads_googleads_v10_resources_ThirdPartyAppAnalyticsLinkIdentifier_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.resources.AccountLinkProto.internal_static_google_ads_googleads_v10_resources_ThirdPartyAppAnalyticsLinkIdentifier_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier.class, com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier.newBuilder()
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
      appAnalyticsProviderId_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      appId_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      appVendor_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.resources.AccountLinkProto.internal_static_google_ads_googleads_v10_resources_ThirdPartyAppAnalyticsLinkIdentifier_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier build() {
      com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier buildPartial() {
      com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier result = new com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.appAnalyticsProviderId_ = appAnalyticsProviderId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.appId_ = appId_;
      result.appVendor_ = appVendor_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier) {
        return mergeFrom((com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier other) {
      if (other == com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier.getDefaultInstance()) return this;
      if (other.hasAppAnalyticsProviderId()) {
        setAppAnalyticsProviderId(other.getAppAnalyticsProviderId());
      }
      if (other.hasAppId()) {
        bitField0_ |= 0x00000002;
        appId_ = other.appId_;
        onChanged();
      }
      if (other.appVendor_ != 0) {
        setAppVendorValue(other.getAppVendorValue());
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
      com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long appAnalyticsProviderId_ ;
    /**
     * <pre>
     * Immutable. The ID of the app analytics provider.
     * This field should not be empty when creating a new third
     * party app analytics link. It is unable to be modified after the creation of
     * the link.
     * </pre>
     *
     * <code>optional int64 app_analytics_provider_id = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return Whether the appAnalyticsProviderId field is set.
     */
    @java.lang.Override
    public boolean hasAppAnalyticsProviderId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Immutable. The ID of the app analytics provider.
     * This field should not be empty when creating a new third
     * party app analytics link. It is unable to be modified after the creation of
     * the link.
     * </pre>
     *
     * <code>optional int64 app_analytics_provider_id = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The appAnalyticsProviderId.
     */
    @java.lang.Override
    public long getAppAnalyticsProviderId() {
      return appAnalyticsProviderId_;
    }
    /**
     * <pre>
     * Immutable. The ID of the app analytics provider.
     * This field should not be empty when creating a new third
     * party app analytics link. It is unable to be modified after the creation of
     * the link.
     * </pre>
     *
     * <code>optional int64 app_analytics_provider_id = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The appAnalyticsProviderId to set.
     * @return This builder for chaining.
     */
    public Builder setAppAnalyticsProviderId(long value) {
      bitField0_ |= 0x00000001;
      appAnalyticsProviderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The ID of the app analytics provider.
     * This field should not be empty when creating a new third
     * party app analytics link. It is unable to be modified after the creation of
     * the link.
     * </pre>
     *
     * <code>optional int64 app_analytics_provider_id = 4 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return This builder for chaining.
     */
    public Builder clearAppAnalyticsProviderId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      appAnalyticsProviderId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object appId_ = "";
    /**
     * <pre>
     * Immutable. A string that uniquely identifies a mobile application from which the data
     * was collected to the Google Ads API. For iOS, the ID string is the 9 digit
     * string that appears at the end of an App Store URL (e.g., "422689480" for
     * "Gmail" whose App Store link is
     * https://apps.apple.com/us/app/gmail-email-by-google/id422689480). For
     * Android, the ID string is the application's package name (e.g.,
     * "com.google.android.gm" for "Gmail" given Google Play link
     * https://play.google.com/store/apps/details?id=com.google.android.gm)
     * This field should not be empty when creating a new third
     * party app analytics link. It is unable to be modified after the creation of
     * the link.
     * </pre>
     *
     * <code>optional string app_id = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return Whether the appId field is set.
     */
    public boolean hasAppId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Immutable. A string that uniquely identifies a mobile application from which the data
     * was collected to the Google Ads API. For iOS, the ID string is the 9 digit
     * string that appears at the end of an App Store URL (e.g., "422689480" for
     * "Gmail" whose App Store link is
     * https://apps.apple.com/us/app/gmail-email-by-google/id422689480). For
     * Android, the ID string is the application's package name (e.g.,
     * "com.google.android.gm" for "Gmail" given Google Play link
     * https://play.google.com/store/apps/details?id=com.google.android.gm)
     * This field should not be empty when creating a new third
     * party app analytics link. It is unable to be modified after the creation of
     * the link.
     * </pre>
     *
     * <code>optional string app_id = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
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
     * Immutable. A string that uniquely identifies a mobile application from which the data
     * was collected to the Google Ads API. For iOS, the ID string is the 9 digit
     * string that appears at the end of an App Store URL (e.g., "422689480" for
     * "Gmail" whose App Store link is
     * https://apps.apple.com/us/app/gmail-email-by-google/id422689480). For
     * Android, the ID string is the application's package name (e.g.,
     * "com.google.android.gm" for "Gmail" given Google Play link
     * https://play.google.com/store/apps/details?id=com.google.android.gm)
     * This field should not be empty when creating a new third
     * party app analytics link. It is unable to be modified after the creation of
     * the link.
     * </pre>
     *
     * <code>optional string app_id = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
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
     * Immutable. A string that uniquely identifies a mobile application from which the data
     * was collected to the Google Ads API. For iOS, the ID string is the 9 digit
     * string that appears at the end of an App Store URL (e.g., "422689480" for
     * "Gmail" whose App Store link is
     * https://apps.apple.com/us/app/gmail-email-by-google/id422689480). For
     * Android, the ID string is the application's package name (e.g.,
     * "com.google.android.gm" for "Gmail" given Google Play link
     * https://play.google.com/store/apps/details?id=com.google.android.gm)
     * This field should not be empty when creating a new third
     * party app analytics link. It is unable to be modified after the creation of
     * the link.
     * </pre>
     *
     * <code>optional string app_id = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The appId to set.
     * @return This builder for chaining.
     */
    public Builder setAppId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      appId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. A string that uniquely identifies a mobile application from which the data
     * was collected to the Google Ads API. For iOS, the ID string is the 9 digit
     * string that appears at the end of an App Store URL (e.g., "422689480" for
     * "Gmail" whose App Store link is
     * https://apps.apple.com/us/app/gmail-email-by-google/id422689480). For
     * Android, the ID string is the application's package name (e.g.,
     * "com.google.android.gm" for "Gmail" given Google Play link
     * https://play.google.com/store/apps/details?id=com.google.android.gm)
     * This field should not be empty when creating a new third
     * party app analytics link. It is unable to be modified after the creation of
     * the link.
     * </pre>
     *
     * <code>optional string app_id = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return This builder for chaining.
     */
    public Builder clearAppId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      appId_ = getDefaultInstance().getAppId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. A string that uniquely identifies a mobile application from which the data
     * was collected to the Google Ads API. For iOS, the ID string is the 9 digit
     * string that appears at the end of an App Store URL (e.g., "422689480" for
     * "Gmail" whose App Store link is
     * https://apps.apple.com/us/app/gmail-email-by-google/id422689480). For
     * Android, the ID string is the application's package name (e.g.,
     * "com.google.android.gm" for "Gmail" given Google Play link
     * https://play.google.com/store/apps/details?id=com.google.android.gm)
     * This field should not be empty when creating a new third
     * party app analytics link. It is unable to be modified after the creation of
     * the link.
     * </pre>
     *
     * <code>optional string app_id = 5 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The bytes for appId to set.
     * @return This builder for chaining.
     */
    public Builder setAppIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      appId_ = value;
      onChanged();
      return this;
    }

    private int appVendor_ = 0;
    /**
     * <pre>
     * Immutable. The vendor of the app.
     * This field should not be empty when creating a new third
     * party app analytics link. It is unable to be modified after the creation of
     * the link.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.MobileAppVendorEnum.MobileAppVendor app_vendor = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The enum numeric value on the wire for appVendor.
     */
    @java.lang.Override public int getAppVendorValue() {
      return appVendor_;
    }
    /**
     * <pre>
     * Immutable. The vendor of the app.
     * This field should not be empty when creating a new third
     * party app analytics link. It is unable to be modified after the creation of
     * the link.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.MobileAppVendorEnum.MobileAppVendor app_vendor = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The enum numeric value on the wire for appVendor to set.
     * @return This builder for chaining.
     */
    public Builder setAppVendorValue(int value) {
      
      appVendor_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The vendor of the app.
     * This field should not be empty when creating a new third
     * party app analytics link. It is unable to be modified after the creation of
     * the link.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.MobileAppVendorEnum.MobileAppVendor app_vendor = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return The appVendor.
     */
    @java.lang.Override
    public com.google.ads.googleads.v10.enums.MobileAppVendorEnum.MobileAppVendor getAppVendor() {
      @SuppressWarnings("deprecation")
      com.google.ads.googleads.v10.enums.MobileAppVendorEnum.MobileAppVendor result = com.google.ads.googleads.v10.enums.MobileAppVendorEnum.MobileAppVendor.valueOf(appVendor_);
      return result == null ? com.google.ads.googleads.v10.enums.MobileAppVendorEnum.MobileAppVendor.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Immutable. The vendor of the app.
     * This field should not be empty when creating a new third
     * party app analytics link. It is unable to be modified after the creation of
     * the link.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.MobileAppVendorEnum.MobileAppVendor app_vendor = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @param value The appVendor to set.
     * @return This builder for chaining.
     */
    public Builder setAppVendor(com.google.ads.googleads.v10.enums.MobileAppVendorEnum.MobileAppVendor value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      appVendor_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Immutable. The vendor of the app.
     * This field should not be empty when creating a new third
     * party app analytics link. It is unable to be modified after the creation of
     * the link.
     * </pre>
     *
     * <code>.google.ads.googleads.v10.enums.MobileAppVendorEnum.MobileAppVendor app_vendor = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     * @return This builder for chaining.
     */
    public Builder clearAppVendor() {
      
      appVendor_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier)
  private static final com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier();
  }

  public static com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThirdPartyAppAnalyticsLinkIdentifier>
      PARSER = new com.google.protobuf.AbstractParser<ThirdPartyAppAnalyticsLinkIdentifier>() {
    @java.lang.Override
    public ThirdPartyAppAnalyticsLinkIdentifier parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ThirdPartyAppAnalyticsLinkIdentifier(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ThirdPartyAppAnalyticsLinkIdentifier> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThirdPartyAppAnalyticsLinkIdentifier> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.resources.ThirdPartyAppAnalyticsLinkIdentifier getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


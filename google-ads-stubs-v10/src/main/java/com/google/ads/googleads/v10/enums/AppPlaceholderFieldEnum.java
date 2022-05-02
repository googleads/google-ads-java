// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/enums/app_placeholder_field.proto

package com.google.ads.googleads.v10.enums;

/**
 * <pre>
 * Values for App placeholder fields.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v10.enums.AppPlaceholderFieldEnum}
 */
public final class AppPlaceholderFieldEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v10.enums.AppPlaceholderFieldEnum)
    AppPlaceholderFieldEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AppPlaceholderFieldEnum.newBuilder() to construct.
  private AppPlaceholderFieldEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AppPlaceholderFieldEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AppPlaceholderFieldEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AppPlaceholderFieldEnum(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
    return com.google.ads.googleads.v10.enums.AppPlaceholderFieldProto.internal_static_google_ads_googleads_v10_enums_AppPlaceholderFieldEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v10.enums.AppPlaceholderFieldProto.internal_static_google_ads_googleads_v10_enums_AppPlaceholderFieldEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum.class, com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum.Builder.class);
  }

  /**
   * <pre>
   * Possible values for App placeholder fields.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v10.enums.AppPlaceholderFieldEnum.AppPlaceholderField}
   */
  public enum AppPlaceholderField
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Data Type: INT64. The application store that the target application
     * belongs to. Valid values are: 1 = Apple iTunes Store; 2 = Google Play
     * Store.
     * </pre>
     *
     * <code>STORE = 2;</code>
     */
    STORE(2),
    /**
     * <pre>
     * Data Type: STRING. The store-specific ID for the target application.
     * </pre>
     *
     * <code>ID = 3;</code>
     */
    ID(3),
    /**
     * <pre>
     * Data Type: STRING. The visible text displayed when the link is rendered
     * in an ad.
     * </pre>
     *
     * <code>LINK_TEXT = 4;</code>
     */
    LINK_TEXT(4),
    /**
     * <pre>
     * Data Type: STRING. The destination URL of the in-app link.
     * </pre>
     *
     * <code>URL = 5;</code>
     */
    URL(5),
    /**
     * <pre>
     * Data Type: URL_LIST. Final URLs for the in-app link when using Upgraded
     * URLs.
     * </pre>
     *
     * <code>FINAL_URLS = 6;</code>
     */
    FINAL_URLS(6),
    /**
     * <pre>
     * Data Type: URL_LIST. Final Mobile URLs for the in-app link when using
     * Upgraded URLs.
     * </pre>
     *
     * <code>FINAL_MOBILE_URLS = 7;</code>
     */
    FINAL_MOBILE_URLS(7),
    /**
     * <pre>
     * Data Type: URL. Tracking template for the in-app link when using Upgraded
     * URLs.
     * </pre>
     *
     * <code>TRACKING_URL = 8;</code>
     */
    TRACKING_URL(8),
    /**
     * <pre>
     * Data Type: STRING. Final URL suffix for the in-app link when using
     * parallel tracking.
     * </pre>
     *
     * <code>FINAL_URL_SUFFIX = 9;</code>
     */
    FINAL_URL_SUFFIX(9),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Data Type: INT64. The application store that the target application
     * belongs to. Valid values are: 1 = Apple iTunes Store; 2 = Google Play
     * Store.
     * </pre>
     *
     * <code>STORE = 2;</code>
     */
    public static final int STORE_VALUE = 2;
    /**
     * <pre>
     * Data Type: STRING. The store-specific ID for the target application.
     * </pre>
     *
     * <code>ID = 3;</code>
     */
    public static final int ID_VALUE = 3;
    /**
     * <pre>
     * Data Type: STRING. The visible text displayed when the link is rendered
     * in an ad.
     * </pre>
     *
     * <code>LINK_TEXT = 4;</code>
     */
    public static final int LINK_TEXT_VALUE = 4;
    /**
     * <pre>
     * Data Type: STRING. The destination URL of the in-app link.
     * </pre>
     *
     * <code>URL = 5;</code>
     */
    public static final int URL_VALUE = 5;
    /**
     * <pre>
     * Data Type: URL_LIST. Final URLs for the in-app link when using Upgraded
     * URLs.
     * </pre>
     *
     * <code>FINAL_URLS = 6;</code>
     */
    public static final int FINAL_URLS_VALUE = 6;
    /**
     * <pre>
     * Data Type: URL_LIST. Final Mobile URLs for the in-app link when using
     * Upgraded URLs.
     * </pre>
     *
     * <code>FINAL_MOBILE_URLS = 7;</code>
     */
    public static final int FINAL_MOBILE_URLS_VALUE = 7;
    /**
     * <pre>
     * Data Type: URL. Tracking template for the in-app link when using Upgraded
     * URLs.
     * </pre>
     *
     * <code>TRACKING_URL = 8;</code>
     */
    public static final int TRACKING_URL_VALUE = 8;
    /**
     * <pre>
     * Data Type: STRING. Final URL suffix for the in-app link when using
     * parallel tracking.
     * </pre>
     *
     * <code>FINAL_URL_SUFFIX = 9;</code>
     */
    public static final int FINAL_URL_SUFFIX_VALUE = 9;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AppPlaceholderField valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AppPlaceholderField forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return STORE;
        case 3: return ID;
        case 4: return LINK_TEXT;
        case 5: return URL;
        case 6: return FINAL_URLS;
        case 7: return FINAL_MOBILE_URLS;
        case 8: return TRACKING_URL;
        case 9: return FINAL_URL_SUFFIX;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AppPlaceholderField>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AppPlaceholderField> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AppPlaceholderField>() {
            public AppPlaceholderField findValueByNumber(int number) {
              return AppPlaceholderField.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AppPlaceholderField[] VALUES = values();

    public static AppPlaceholderField valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AppPlaceholderField(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v10.enums.AppPlaceholderFieldEnum.AppPlaceholderField)
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum other = (com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum prototype) {
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
   * Values for App placeholder fields.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v10.enums.AppPlaceholderFieldEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v10.enums.AppPlaceholderFieldEnum)
      com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v10.enums.AppPlaceholderFieldProto.internal_static_google_ads_googleads_v10_enums_AppPlaceholderFieldEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v10.enums.AppPlaceholderFieldProto.internal_static_google_ads_googleads_v10_enums_AppPlaceholderFieldEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum.class, com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v10.enums.AppPlaceholderFieldProto.internal_static_google_ads_googleads_v10_enums_AppPlaceholderFieldEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum build() {
      com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum buildPartial() {
      com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum result = new com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum(this);
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
      if (other instanceof com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum) {
        return mergeFrom((com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum other) {
      if (other == com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v10.enums.AppPlaceholderFieldEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v10.enums.AppPlaceholderFieldEnum)
  private static final com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum();
  }

  public static com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AppPlaceholderFieldEnum>
      PARSER = new com.google.protobuf.AbstractParser<AppPlaceholderFieldEnum>() {
    @java.lang.Override
    public AppPlaceholderFieldEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AppPlaceholderFieldEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AppPlaceholderFieldEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AppPlaceholderFieldEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v10.enums.AppPlaceholderFieldEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


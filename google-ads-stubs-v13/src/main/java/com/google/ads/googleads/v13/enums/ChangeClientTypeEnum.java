// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/enums/change_client_type.proto

package com.google.ads.googleads.v13.enums;

/**
 * <pre>
 * Container for enum describing the sources that the change event resource
 * was made through.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v13.enums.ChangeClientTypeEnum}
 */
public final class ChangeClientTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v13.enums.ChangeClientTypeEnum)
    ChangeClientTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChangeClientTypeEnum.newBuilder() to construct.
  private ChangeClientTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChangeClientTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChangeClientTypeEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v13.enums.ChangeClientTypeProto.internal_static_google_ads_googleads_v13_enums_ChangeClientTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v13.enums.ChangeClientTypeProto.internal_static_google_ads_googleads_v13_enums_ChangeClientTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v13.enums.ChangeClientTypeEnum.class, com.google.ads.googleads.v13.enums.ChangeClientTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * The source that the change_event resource was made through.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v13.enums.ChangeClientTypeEnum.ChangeClientType}
   */
  public enum ChangeClientType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * No value has been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents an unclassified client type
     * unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Changes made through the "ads.google.com".
     * For example, changes made through campaign management.
     * </pre>
     *
     * <code>GOOGLE_ADS_WEB_CLIENT = 2;</code>
     */
    GOOGLE_ADS_WEB_CLIENT(2),
    /**
     * <pre>
     * Changes made through Google Ads automated rules.
     * </pre>
     *
     * <code>GOOGLE_ADS_AUTOMATED_RULE = 3;</code>
     */
    GOOGLE_ADS_AUTOMATED_RULE(3),
    /**
     * <pre>
     * Changes made through Google Ads scripts.
     * </pre>
     *
     * <code>GOOGLE_ADS_SCRIPTS = 4;</code>
     */
    GOOGLE_ADS_SCRIPTS(4),
    /**
     * <pre>
     * Changes made by Google Ads bulk upload.
     * </pre>
     *
     * <code>GOOGLE_ADS_BULK_UPLOAD = 5;</code>
     */
    GOOGLE_ADS_BULK_UPLOAD(5),
    /**
     * <pre>
     * Changes made by Google Ads API.
     * </pre>
     *
     * <code>GOOGLE_ADS_API = 6;</code>
     */
    GOOGLE_ADS_API(6),
    /**
     * <pre>
     * Changes made by Google Ads Editor. This value is a placeholder.
     * The API does not return these changes.
     * </pre>
     *
     * <code>GOOGLE_ADS_EDITOR = 7;</code>
     */
    GOOGLE_ADS_EDITOR(7),
    /**
     * <pre>
     * Changes made by Google Ads mobile app.
     * </pre>
     *
     * <code>GOOGLE_ADS_MOBILE_APP = 8;</code>
     */
    GOOGLE_ADS_MOBILE_APP(8),
    /**
     * <pre>
     * Changes made through Google Ads recommendations.
     * </pre>
     *
     * <code>GOOGLE_ADS_RECOMMENDATIONS = 9;</code>
     */
    GOOGLE_ADS_RECOMMENDATIONS(9),
    /**
     * <pre>
     * Changes made through Search Ads 360 Sync.
     * </pre>
     *
     * <code>SEARCH_ADS_360_SYNC = 10;</code>
     */
    SEARCH_ADS_360_SYNC(10),
    /**
     * <pre>
     * Changes made through Search Ads 360 Post.
     * </pre>
     *
     * <code>SEARCH_ADS_360_POST = 11;</code>
     */
    SEARCH_ADS_360_POST(11),
    /**
     * <pre>
     * Changes made through internal tools.
     * For example, when a user sets a URL template on an entity like a
     * Campaign, it's automatically wrapped with the SA360 Clickserver URL.
     * </pre>
     *
     * <code>INTERNAL_TOOL = 12;</code>
     */
    INTERNAL_TOOL(12),
    /**
     * <pre>
     * Types of changes that are not categorized, for example,
     * changes made by coupon redemption through Google Ads.
     * </pre>
     *
     * <code>OTHER = 13;</code>
     */
    OTHER(13),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * No value has been specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents an unclassified client type
     * unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Changes made through the "ads.google.com".
     * For example, changes made through campaign management.
     * </pre>
     *
     * <code>GOOGLE_ADS_WEB_CLIENT = 2;</code>
     */
    public static final int GOOGLE_ADS_WEB_CLIENT_VALUE = 2;
    /**
     * <pre>
     * Changes made through Google Ads automated rules.
     * </pre>
     *
     * <code>GOOGLE_ADS_AUTOMATED_RULE = 3;</code>
     */
    public static final int GOOGLE_ADS_AUTOMATED_RULE_VALUE = 3;
    /**
     * <pre>
     * Changes made through Google Ads scripts.
     * </pre>
     *
     * <code>GOOGLE_ADS_SCRIPTS = 4;</code>
     */
    public static final int GOOGLE_ADS_SCRIPTS_VALUE = 4;
    /**
     * <pre>
     * Changes made by Google Ads bulk upload.
     * </pre>
     *
     * <code>GOOGLE_ADS_BULK_UPLOAD = 5;</code>
     */
    public static final int GOOGLE_ADS_BULK_UPLOAD_VALUE = 5;
    /**
     * <pre>
     * Changes made by Google Ads API.
     * </pre>
     *
     * <code>GOOGLE_ADS_API = 6;</code>
     */
    public static final int GOOGLE_ADS_API_VALUE = 6;
    /**
     * <pre>
     * Changes made by Google Ads Editor. This value is a placeholder.
     * The API does not return these changes.
     * </pre>
     *
     * <code>GOOGLE_ADS_EDITOR = 7;</code>
     */
    public static final int GOOGLE_ADS_EDITOR_VALUE = 7;
    /**
     * <pre>
     * Changes made by Google Ads mobile app.
     * </pre>
     *
     * <code>GOOGLE_ADS_MOBILE_APP = 8;</code>
     */
    public static final int GOOGLE_ADS_MOBILE_APP_VALUE = 8;
    /**
     * <pre>
     * Changes made through Google Ads recommendations.
     * </pre>
     *
     * <code>GOOGLE_ADS_RECOMMENDATIONS = 9;</code>
     */
    public static final int GOOGLE_ADS_RECOMMENDATIONS_VALUE = 9;
    /**
     * <pre>
     * Changes made through Search Ads 360 Sync.
     * </pre>
     *
     * <code>SEARCH_ADS_360_SYNC = 10;</code>
     */
    public static final int SEARCH_ADS_360_SYNC_VALUE = 10;
    /**
     * <pre>
     * Changes made through Search Ads 360 Post.
     * </pre>
     *
     * <code>SEARCH_ADS_360_POST = 11;</code>
     */
    public static final int SEARCH_ADS_360_POST_VALUE = 11;
    /**
     * <pre>
     * Changes made through internal tools.
     * For example, when a user sets a URL template on an entity like a
     * Campaign, it's automatically wrapped with the SA360 Clickserver URL.
     * </pre>
     *
     * <code>INTERNAL_TOOL = 12;</code>
     */
    public static final int INTERNAL_TOOL_VALUE = 12;
    /**
     * <pre>
     * Types of changes that are not categorized, for example,
     * changes made by coupon redemption through Google Ads.
     * </pre>
     *
     * <code>OTHER = 13;</code>
     */
    public static final int OTHER_VALUE = 13;


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
    public static ChangeClientType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ChangeClientType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return GOOGLE_ADS_WEB_CLIENT;
        case 3: return GOOGLE_ADS_AUTOMATED_RULE;
        case 4: return GOOGLE_ADS_SCRIPTS;
        case 5: return GOOGLE_ADS_BULK_UPLOAD;
        case 6: return GOOGLE_ADS_API;
        case 7: return GOOGLE_ADS_EDITOR;
        case 8: return GOOGLE_ADS_MOBILE_APP;
        case 9: return GOOGLE_ADS_RECOMMENDATIONS;
        case 10: return SEARCH_ADS_360_SYNC;
        case 11: return SEARCH_ADS_360_POST;
        case 12: return INTERNAL_TOOL;
        case 13: return OTHER;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ChangeClientType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ChangeClientType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ChangeClientType>() {
            public ChangeClientType findValueByNumber(int number) {
              return ChangeClientType.forNumber(number);
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
      return com.google.ads.googleads.v13.enums.ChangeClientTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ChangeClientType[] VALUES = values();

    public static ChangeClientType valueOf(
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

    private ChangeClientType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v13.enums.ChangeClientTypeEnum.ChangeClientType)
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v13.enums.ChangeClientTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v13.enums.ChangeClientTypeEnum other = (com.google.ads.googleads.v13.enums.ChangeClientTypeEnum) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v13.enums.ChangeClientTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.enums.ChangeClientTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.enums.ChangeClientTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.enums.ChangeClientTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.enums.ChangeClientTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v13.enums.ChangeClientTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.enums.ChangeClientTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.enums.ChangeClientTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v13.enums.ChangeClientTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v13.enums.ChangeClientTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v13.enums.ChangeClientTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v13.enums.ChangeClientTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v13.enums.ChangeClientTypeEnum prototype) {
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
   * Container for enum describing the sources that the change event resource
   * was made through.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v13.enums.ChangeClientTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v13.enums.ChangeClientTypeEnum)
      com.google.ads.googleads.v13.enums.ChangeClientTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v13.enums.ChangeClientTypeProto.internal_static_google_ads_googleads_v13_enums_ChangeClientTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v13.enums.ChangeClientTypeProto.internal_static_google_ads_googleads_v13_enums_ChangeClientTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v13.enums.ChangeClientTypeEnum.class, com.google.ads.googleads.v13.enums.ChangeClientTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v13.enums.ChangeClientTypeEnum.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v13.enums.ChangeClientTypeProto.internal_static_google_ads_googleads_v13_enums_ChangeClientTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.enums.ChangeClientTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v13.enums.ChangeClientTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.enums.ChangeClientTypeEnum build() {
      com.google.ads.googleads.v13.enums.ChangeClientTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v13.enums.ChangeClientTypeEnum buildPartial() {
      com.google.ads.googleads.v13.enums.ChangeClientTypeEnum result = new com.google.ads.googleads.v13.enums.ChangeClientTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v13.enums.ChangeClientTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v13.enums.ChangeClientTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v13.enums.ChangeClientTypeEnum other) {
      if (other == com.google.ads.googleads.v13.enums.ChangeClientTypeEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v13.enums.ChangeClientTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v13.enums.ChangeClientTypeEnum)
  private static final com.google.ads.googleads.v13.enums.ChangeClientTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v13.enums.ChangeClientTypeEnum();
  }

  public static com.google.ads.googleads.v13.enums.ChangeClientTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChangeClientTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<ChangeClientTypeEnum>() {
    @java.lang.Override
    public ChangeClientTypeEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<ChangeClientTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChangeClientTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v13.enums.ChangeClientTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/enums/data_driven_model_status.proto

package com.google.ads.googleads.v14.enums;

/**
 * <pre>
 * Container for enum indicating data driven model status.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.enums.DataDrivenModelStatusEnum}
 */
public final class DataDrivenModelStatusEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.enums.DataDrivenModelStatusEnum)
    DataDrivenModelStatusEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DataDrivenModelStatusEnum.newBuilder() to construct.
  private DataDrivenModelStatusEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DataDrivenModelStatusEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DataDrivenModelStatusEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.enums.DataDrivenModelStatusProto.internal_static_google_ads_googleads_v14_enums_DataDrivenModelStatusEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.enums.DataDrivenModelStatusProto.internal_static_google_ads_googleads_v14_enums_DataDrivenModelStatusEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum.class, com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum.Builder.class);
  }

  /**
   * <pre>
   * Enumerates data driven model statuses.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v14.enums.DataDrivenModelStatusEnum.DataDrivenModelStatus}
   */
  public enum DataDrivenModelStatus
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
     * The data driven model is available.
     * </pre>
     *
     * <code>AVAILABLE = 2;</code>
     */
    AVAILABLE(2),
    /**
     * <pre>
     * The data driven model is stale. It hasn't been updated for at least 7
     * days. It is still being used, but will become expired if it does not get
     * updated for 30 days.
     * </pre>
     *
     * <code>STALE = 3;</code>
     */
    STALE(3),
    /**
     * <pre>
     * The data driven model expired. It hasn't been updated for at least 30
     * days and cannot be used. Most commonly this is because there hasn't been
     * the required number of events in a recent 30-day period.
     * </pre>
     *
     * <code>EXPIRED = 4;</code>
     */
    EXPIRED(4),
    /**
     * <pre>
     * The data driven model has never been generated. Most commonly this is
     * because there has never been the required number of events in any 30-day
     * period.
     * </pre>
     *
     * <code>NEVER_GENERATED = 5;</code>
     */
    NEVER_GENERATED(5),
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
     * The data driven model is available.
     * </pre>
     *
     * <code>AVAILABLE = 2;</code>
     */
    public static final int AVAILABLE_VALUE = 2;
    /**
     * <pre>
     * The data driven model is stale. It hasn't been updated for at least 7
     * days. It is still being used, but will become expired if it does not get
     * updated for 30 days.
     * </pre>
     *
     * <code>STALE = 3;</code>
     */
    public static final int STALE_VALUE = 3;
    /**
     * <pre>
     * The data driven model expired. It hasn't been updated for at least 30
     * days and cannot be used. Most commonly this is because there hasn't been
     * the required number of events in a recent 30-day period.
     * </pre>
     *
     * <code>EXPIRED = 4;</code>
     */
    public static final int EXPIRED_VALUE = 4;
    /**
     * <pre>
     * The data driven model has never been generated. Most commonly this is
     * because there has never been the required number of events in any 30-day
     * period.
     * </pre>
     *
     * <code>NEVER_GENERATED = 5;</code>
     */
    public static final int NEVER_GENERATED_VALUE = 5;


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
    public static DataDrivenModelStatus valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DataDrivenModelStatus forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return AVAILABLE;
        case 3: return STALE;
        case 4: return EXPIRED;
        case 5: return NEVER_GENERATED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DataDrivenModelStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DataDrivenModelStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DataDrivenModelStatus>() {
            public DataDrivenModelStatus findValueByNumber(int number) {
              return DataDrivenModelStatus.forNumber(number);
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
      return com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final DataDrivenModelStatus[] VALUES = values();

    public static DataDrivenModelStatus valueOf(
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

    private DataDrivenModelStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v14.enums.DataDrivenModelStatusEnum.DataDrivenModelStatus)
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
    if (!(obj instanceof com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum other = (com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum) obj;

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

  public static com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum prototype) {
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
   * Container for enum indicating data driven model status.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.enums.DataDrivenModelStatusEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.enums.DataDrivenModelStatusEnum)
      com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.enums.DataDrivenModelStatusProto.internal_static_google_ads_googleads_v14_enums_DataDrivenModelStatusEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.enums.DataDrivenModelStatusProto.internal_static_google_ads_googleads_v14_enums_DataDrivenModelStatusEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum.class, com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum.newBuilder()
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
      return com.google.ads.googleads.v14.enums.DataDrivenModelStatusProto.internal_static_google_ads_googleads_v14_enums_DataDrivenModelStatusEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum build() {
      com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum buildPartial() {
      com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum result = new com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum(this);
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
      if (other instanceof com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum) {
        return mergeFrom((com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum other) {
      if (other == com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.enums.DataDrivenModelStatusEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.enums.DataDrivenModelStatusEnum)
  private static final com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum();
  }

  public static com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataDrivenModelStatusEnum>
      PARSER = new com.google.protobuf.AbstractParser<DataDrivenModelStatusEnum>() {
    @java.lang.Override
    public DataDrivenModelStatusEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataDrivenModelStatusEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataDrivenModelStatusEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.enums.DataDrivenModelStatusEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


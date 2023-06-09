// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/errors/campaign_draft_error.proto

package com.google.ads.googleads.v12.errors;

/**
 * <pre>
 * Container for enum describing possible campaign draft errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.errors.CampaignDraftErrorEnum}
 */
public final class CampaignDraftErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.errors.CampaignDraftErrorEnum)
    CampaignDraftErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CampaignDraftErrorEnum.newBuilder() to construct.
  private CampaignDraftErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CampaignDraftErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CampaignDraftErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.errors.CampaignDraftErrorProto.internal_static_google_ads_googleads_v12_errors_CampaignDraftErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.errors.CampaignDraftErrorProto.internal_static_google_ads_googleads_v12_errors_CampaignDraftErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum.class, com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible campaign draft errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v12.errors.CampaignDraftErrorEnum.CampaignDraftError}
   */
  public enum CampaignDraftError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * A draft with this name already exists for this campaign.
     * </pre>
     *
     * <code>DUPLICATE_DRAFT_NAME = 2;</code>
     */
    DUPLICATE_DRAFT_NAME(2),
    /**
     * <pre>
     * The draft is removed and cannot be transitioned to another status.
     * </pre>
     *
     * <code>INVALID_STATUS_TRANSITION_FROM_REMOVED = 3;</code>
     */
    INVALID_STATUS_TRANSITION_FROM_REMOVED(3),
    /**
     * <pre>
     * The draft has been promoted and cannot be transitioned to the specified
     * status.
     * </pre>
     *
     * <code>INVALID_STATUS_TRANSITION_FROM_PROMOTED = 4;</code>
     */
    INVALID_STATUS_TRANSITION_FROM_PROMOTED(4),
    /**
     * <pre>
     * The draft has failed to be promoted and cannot be transitioned to the
     * specified status.
     * </pre>
     *
     * <code>INVALID_STATUS_TRANSITION_FROM_PROMOTE_FAILED = 5;</code>
     */
    INVALID_STATUS_TRANSITION_FROM_PROMOTE_FAILED(5),
    /**
     * <pre>
     * This customer is not allowed to create drafts.
     * </pre>
     *
     * <code>CUSTOMER_CANNOT_CREATE_DRAFT = 6;</code>
     */
    CUSTOMER_CANNOT_CREATE_DRAFT(6),
    /**
     * <pre>
     * This campaign is not allowed to create drafts.
     * </pre>
     *
     * <code>CAMPAIGN_CANNOT_CREATE_DRAFT = 7;</code>
     */
    CAMPAIGN_CANNOT_CREATE_DRAFT(7),
    /**
     * <pre>
     * This modification cannot be made on a draft.
     * </pre>
     *
     * <code>INVALID_DRAFT_CHANGE = 8;</code>
     */
    INVALID_DRAFT_CHANGE(8),
    /**
     * <pre>
     * The draft cannot be transitioned to the specified status from its
     * current status.
     * </pre>
     *
     * <code>INVALID_STATUS_TRANSITION = 9;</code>
     */
    INVALID_STATUS_TRANSITION(9),
    /**
     * <pre>
     * The campaign has reached the maximum number of drafts that can be created
     * for a campaign throughout its lifetime. No additional drafts can be
     * created for this campaign. Removed drafts also count towards this limit.
     * </pre>
     *
     * <code>MAX_NUMBER_OF_DRAFTS_PER_CAMPAIGN_REACHED = 10;</code>
     */
    MAX_NUMBER_OF_DRAFTS_PER_CAMPAIGN_REACHED(10),
    /**
     * <pre>
     * ListAsyncErrors was called without first promoting the draft.
     * </pre>
     *
     * <code>LIST_ERRORS_FOR_PROMOTED_DRAFT_ONLY = 11;</code>
     */
    LIST_ERRORS_FOR_PROMOTED_DRAFT_ONLY(11),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * A draft with this name already exists for this campaign.
     * </pre>
     *
     * <code>DUPLICATE_DRAFT_NAME = 2;</code>
     */
    public static final int DUPLICATE_DRAFT_NAME_VALUE = 2;
    /**
     * <pre>
     * The draft is removed and cannot be transitioned to another status.
     * </pre>
     *
     * <code>INVALID_STATUS_TRANSITION_FROM_REMOVED = 3;</code>
     */
    public static final int INVALID_STATUS_TRANSITION_FROM_REMOVED_VALUE = 3;
    /**
     * <pre>
     * The draft has been promoted and cannot be transitioned to the specified
     * status.
     * </pre>
     *
     * <code>INVALID_STATUS_TRANSITION_FROM_PROMOTED = 4;</code>
     */
    public static final int INVALID_STATUS_TRANSITION_FROM_PROMOTED_VALUE = 4;
    /**
     * <pre>
     * The draft has failed to be promoted and cannot be transitioned to the
     * specified status.
     * </pre>
     *
     * <code>INVALID_STATUS_TRANSITION_FROM_PROMOTE_FAILED = 5;</code>
     */
    public static final int INVALID_STATUS_TRANSITION_FROM_PROMOTE_FAILED_VALUE = 5;
    /**
     * <pre>
     * This customer is not allowed to create drafts.
     * </pre>
     *
     * <code>CUSTOMER_CANNOT_CREATE_DRAFT = 6;</code>
     */
    public static final int CUSTOMER_CANNOT_CREATE_DRAFT_VALUE = 6;
    /**
     * <pre>
     * This campaign is not allowed to create drafts.
     * </pre>
     *
     * <code>CAMPAIGN_CANNOT_CREATE_DRAFT = 7;</code>
     */
    public static final int CAMPAIGN_CANNOT_CREATE_DRAFT_VALUE = 7;
    /**
     * <pre>
     * This modification cannot be made on a draft.
     * </pre>
     *
     * <code>INVALID_DRAFT_CHANGE = 8;</code>
     */
    public static final int INVALID_DRAFT_CHANGE_VALUE = 8;
    /**
     * <pre>
     * The draft cannot be transitioned to the specified status from its
     * current status.
     * </pre>
     *
     * <code>INVALID_STATUS_TRANSITION = 9;</code>
     */
    public static final int INVALID_STATUS_TRANSITION_VALUE = 9;
    /**
     * <pre>
     * The campaign has reached the maximum number of drafts that can be created
     * for a campaign throughout its lifetime. No additional drafts can be
     * created for this campaign. Removed drafts also count towards this limit.
     * </pre>
     *
     * <code>MAX_NUMBER_OF_DRAFTS_PER_CAMPAIGN_REACHED = 10;</code>
     */
    public static final int MAX_NUMBER_OF_DRAFTS_PER_CAMPAIGN_REACHED_VALUE = 10;
    /**
     * <pre>
     * ListAsyncErrors was called without first promoting the draft.
     * </pre>
     *
     * <code>LIST_ERRORS_FOR_PROMOTED_DRAFT_ONLY = 11;</code>
     */
    public static final int LIST_ERRORS_FOR_PROMOTED_DRAFT_ONLY_VALUE = 11;


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
    public static CampaignDraftError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CampaignDraftError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return DUPLICATE_DRAFT_NAME;
        case 3: return INVALID_STATUS_TRANSITION_FROM_REMOVED;
        case 4: return INVALID_STATUS_TRANSITION_FROM_PROMOTED;
        case 5: return INVALID_STATUS_TRANSITION_FROM_PROMOTE_FAILED;
        case 6: return CUSTOMER_CANNOT_CREATE_DRAFT;
        case 7: return CAMPAIGN_CANNOT_CREATE_DRAFT;
        case 8: return INVALID_DRAFT_CHANGE;
        case 9: return INVALID_STATUS_TRANSITION;
        case 10: return MAX_NUMBER_OF_DRAFTS_PER_CAMPAIGN_REACHED;
        case 11: return LIST_ERRORS_FOR_PROMOTED_DRAFT_ONLY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CampaignDraftError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CampaignDraftError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CampaignDraftError>() {
            public CampaignDraftError findValueByNumber(int number) {
              return CampaignDraftError.forNumber(number);
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
      return com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final CampaignDraftError[] VALUES = values();

    public static CampaignDraftError valueOf(
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

    private CampaignDraftError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v12.errors.CampaignDraftErrorEnum.CampaignDraftError)
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
    if (!(obj instanceof com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum other = (com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum) obj;

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

  public static com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum prototype) {
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
   * Container for enum describing possible campaign draft errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.errors.CampaignDraftErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.errors.CampaignDraftErrorEnum)
      com.google.ads.googleads.v12.errors.CampaignDraftErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.errors.CampaignDraftErrorProto.internal_static_google_ads_googleads_v12_errors_CampaignDraftErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.errors.CampaignDraftErrorProto.internal_static_google_ads_googleads_v12_errors_CampaignDraftErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum.class, com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v12.errors.CampaignDraftErrorProto.internal_static_google_ads_googleads_v12_errors_CampaignDraftErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum build() {
      com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum buildPartial() {
      com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum result = new com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum other) {
      if (other == com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.errors.CampaignDraftErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.errors.CampaignDraftErrorEnum)
  private static final com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum();
  }

  public static com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CampaignDraftErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<CampaignDraftErrorEnum>() {
    @java.lang.Override
    public CampaignDraftErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<CampaignDraftErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CampaignDraftErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.errors.CampaignDraftErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


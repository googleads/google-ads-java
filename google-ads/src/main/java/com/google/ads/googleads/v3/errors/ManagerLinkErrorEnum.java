// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v3/errors/manager_link_error.proto

package com.google.ads.googleads.v3.errors;

/**
 * <pre>
 * Container for enum describing possible ManagerLink errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v3.errors.ManagerLinkErrorEnum}
 */
public final class ManagerLinkErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v3.errors.ManagerLinkErrorEnum)
    ManagerLinkErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ManagerLinkErrorEnum.newBuilder() to construct.
  private ManagerLinkErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ManagerLinkErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ManagerLinkErrorEnum();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ManagerLinkErrorEnum(
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
    return com.google.ads.googleads.v3.errors.ManagerLinkErrorProto.internal_static_google_ads_googleads_v3_errors_ManagerLinkErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v3.errors.ManagerLinkErrorProto.internal_static_google_ads_googleads_v3_errors_ManagerLinkErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum.class, com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible ManagerLink errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v3.errors.ManagerLinkErrorEnum.ManagerLinkError}
   */
  public enum ManagerLinkError
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
     * The manager and client have incompatible account types.
     * </pre>
     *
     * <code>ACCOUNTS_NOT_COMPATIBLE_FOR_LINKING = 2;</code>
     */
    ACCOUNTS_NOT_COMPATIBLE_FOR_LINKING(2),
    /**
     * <pre>
     * Client is already linked to too many managers.
     * </pre>
     *
     * <code>TOO_MANY_MANAGERS = 3;</code>
     */
    TOO_MANY_MANAGERS(3),
    /**
     * <pre>
     * Manager has too many pending invitations.
     * </pre>
     *
     * <code>TOO_MANY_INVITES = 4;</code>
     */
    TOO_MANY_INVITES(4),
    /**
     * <pre>
     * Client is already invited by this manager.
     * </pre>
     *
     * <code>ALREADY_INVITED_BY_THIS_MANAGER = 5;</code>
     */
    ALREADY_INVITED_BY_THIS_MANAGER(5),
    /**
     * <pre>
     * The client is already managed by this manager.
     * </pre>
     *
     * <code>ALREADY_MANAGED_BY_THIS_MANAGER = 6;</code>
     */
    ALREADY_MANAGED_BY_THIS_MANAGER(6),
    /**
     * <pre>
     * Client is already managed in hierarchy.
     * </pre>
     *
     * <code>ALREADY_MANAGED_IN_HIERARCHY = 7;</code>
     */
    ALREADY_MANAGED_IN_HIERARCHY(7),
    /**
     * <pre>
     * Manger and sub-manager to be linked have duplicate client.
     * </pre>
     *
     * <code>DUPLICATE_CHILD_FOUND = 8;</code>
     */
    DUPLICATE_CHILD_FOUND(8),
    /**
     * <pre>
     * Client has no active user that can access the client account.
     * </pre>
     *
     * <code>CLIENT_HAS_NO_ADMIN_USER = 9;</code>
     */
    CLIENT_HAS_NO_ADMIN_USER(9),
    /**
     * <pre>
     * Adding this link would exceed the maximum hierarchy depth.
     * </pre>
     *
     * <code>MAX_DEPTH_EXCEEDED = 10;</code>
     */
    MAX_DEPTH_EXCEEDED(10),
    /**
     * <pre>
     * Adding this link will create a cycle.
     * </pre>
     *
     * <code>CYCLE_NOT_ALLOWED = 11;</code>
     */
    CYCLE_NOT_ALLOWED(11),
    /**
     * <pre>
     * Manager account has the maximum number of linked clients.
     * </pre>
     *
     * <code>TOO_MANY_ACCOUNTS = 12;</code>
     */
    TOO_MANY_ACCOUNTS(12),
    /**
     * <pre>
     * Parent manager account has the maximum number of linked clients.
     * </pre>
     *
     * <code>TOO_MANY_ACCOUNTS_AT_MANAGER = 13;</code>
     */
    TOO_MANY_ACCOUNTS_AT_MANAGER(13),
    /**
     * <pre>
     * The account is not authorized owner.
     * </pre>
     *
     * <code>NON_OWNER_USER_CANNOT_MODIFY_LINK = 14;</code>
     */
    NON_OWNER_USER_CANNOT_MODIFY_LINK(14),
    /**
     * <pre>
     * Your manager account is suspended, and you are no longer allowed to link
     * to clients.
     * </pre>
     *
     * <code>SUSPENDED_ACCOUNT_CANNOT_ADD_CLIENTS = 15;</code>
     */
    SUSPENDED_ACCOUNT_CANNOT_ADD_CLIENTS(15),
    /**
     * <pre>
     * You are not allowed to move a client to a manager that is not under your
     * current hierarchy.
     * </pre>
     *
     * <code>CLIENT_OUTSIDE_TREE = 16;</code>
     */
    CLIENT_OUTSIDE_TREE(16),
    /**
     * <pre>
     * The changed status for mutate link is invalid.
     * </pre>
     *
     * <code>INVALID_STATUS_CHANGE = 17;</code>
     */
    INVALID_STATUS_CHANGE(17),
    /**
     * <pre>
     * The change for mutate link is invalid.
     * </pre>
     *
     * <code>INVALID_CHANGE = 18;</code>
     */
    INVALID_CHANGE(18),
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
     * The manager and client have incompatible account types.
     * </pre>
     *
     * <code>ACCOUNTS_NOT_COMPATIBLE_FOR_LINKING = 2;</code>
     */
    public static final int ACCOUNTS_NOT_COMPATIBLE_FOR_LINKING_VALUE = 2;
    /**
     * <pre>
     * Client is already linked to too many managers.
     * </pre>
     *
     * <code>TOO_MANY_MANAGERS = 3;</code>
     */
    public static final int TOO_MANY_MANAGERS_VALUE = 3;
    /**
     * <pre>
     * Manager has too many pending invitations.
     * </pre>
     *
     * <code>TOO_MANY_INVITES = 4;</code>
     */
    public static final int TOO_MANY_INVITES_VALUE = 4;
    /**
     * <pre>
     * Client is already invited by this manager.
     * </pre>
     *
     * <code>ALREADY_INVITED_BY_THIS_MANAGER = 5;</code>
     */
    public static final int ALREADY_INVITED_BY_THIS_MANAGER_VALUE = 5;
    /**
     * <pre>
     * The client is already managed by this manager.
     * </pre>
     *
     * <code>ALREADY_MANAGED_BY_THIS_MANAGER = 6;</code>
     */
    public static final int ALREADY_MANAGED_BY_THIS_MANAGER_VALUE = 6;
    /**
     * <pre>
     * Client is already managed in hierarchy.
     * </pre>
     *
     * <code>ALREADY_MANAGED_IN_HIERARCHY = 7;</code>
     */
    public static final int ALREADY_MANAGED_IN_HIERARCHY_VALUE = 7;
    /**
     * <pre>
     * Manger and sub-manager to be linked have duplicate client.
     * </pre>
     *
     * <code>DUPLICATE_CHILD_FOUND = 8;</code>
     */
    public static final int DUPLICATE_CHILD_FOUND_VALUE = 8;
    /**
     * <pre>
     * Client has no active user that can access the client account.
     * </pre>
     *
     * <code>CLIENT_HAS_NO_ADMIN_USER = 9;</code>
     */
    public static final int CLIENT_HAS_NO_ADMIN_USER_VALUE = 9;
    /**
     * <pre>
     * Adding this link would exceed the maximum hierarchy depth.
     * </pre>
     *
     * <code>MAX_DEPTH_EXCEEDED = 10;</code>
     */
    public static final int MAX_DEPTH_EXCEEDED_VALUE = 10;
    /**
     * <pre>
     * Adding this link will create a cycle.
     * </pre>
     *
     * <code>CYCLE_NOT_ALLOWED = 11;</code>
     */
    public static final int CYCLE_NOT_ALLOWED_VALUE = 11;
    /**
     * <pre>
     * Manager account has the maximum number of linked clients.
     * </pre>
     *
     * <code>TOO_MANY_ACCOUNTS = 12;</code>
     */
    public static final int TOO_MANY_ACCOUNTS_VALUE = 12;
    /**
     * <pre>
     * Parent manager account has the maximum number of linked clients.
     * </pre>
     *
     * <code>TOO_MANY_ACCOUNTS_AT_MANAGER = 13;</code>
     */
    public static final int TOO_MANY_ACCOUNTS_AT_MANAGER_VALUE = 13;
    /**
     * <pre>
     * The account is not authorized owner.
     * </pre>
     *
     * <code>NON_OWNER_USER_CANNOT_MODIFY_LINK = 14;</code>
     */
    public static final int NON_OWNER_USER_CANNOT_MODIFY_LINK_VALUE = 14;
    /**
     * <pre>
     * Your manager account is suspended, and you are no longer allowed to link
     * to clients.
     * </pre>
     *
     * <code>SUSPENDED_ACCOUNT_CANNOT_ADD_CLIENTS = 15;</code>
     */
    public static final int SUSPENDED_ACCOUNT_CANNOT_ADD_CLIENTS_VALUE = 15;
    /**
     * <pre>
     * You are not allowed to move a client to a manager that is not under your
     * current hierarchy.
     * </pre>
     *
     * <code>CLIENT_OUTSIDE_TREE = 16;</code>
     */
    public static final int CLIENT_OUTSIDE_TREE_VALUE = 16;
    /**
     * <pre>
     * The changed status for mutate link is invalid.
     * </pre>
     *
     * <code>INVALID_STATUS_CHANGE = 17;</code>
     */
    public static final int INVALID_STATUS_CHANGE_VALUE = 17;
    /**
     * <pre>
     * The change for mutate link is invalid.
     * </pre>
     *
     * <code>INVALID_CHANGE = 18;</code>
     */
    public static final int INVALID_CHANGE_VALUE = 18;


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
    public static ManagerLinkError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ManagerLinkError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return ACCOUNTS_NOT_COMPATIBLE_FOR_LINKING;
        case 3: return TOO_MANY_MANAGERS;
        case 4: return TOO_MANY_INVITES;
        case 5: return ALREADY_INVITED_BY_THIS_MANAGER;
        case 6: return ALREADY_MANAGED_BY_THIS_MANAGER;
        case 7: return ALREADY_MANAGED_IN_HIERARCHY;
        case 8: return DUPLICATE_CHILD_FOUND;
        case 9: return CLIENT_HAS_NO_ADMIN_USER;
        case 10: return MAX_DEPTH_EXCEEDED;
        case 11: return CYCLE_NOT_ALLOWED;
        case 12: return TOO_MANY_ACCOUNTS;
        case 13: return TOO_MANY_ACCOUNTS_AT_MANAGER;
        case 14: return NON_OWNER_USER_CANNOT_MODIFY_LINK;
        case 15: return SUSPENDED_ACCOUNT_CANNOT_ADD_CLIENTS;
        case 16: return CLIENT_OUTSIDE_TREE;
        case 17: return INVALID_STATUS_CHANGE;
        case 18: return INVALID_CHANGE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ManagerLinkError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ManagerLinkError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ManagerLinkError>() {
            public ManagerLinkError findValueByNumber(int number) {
              return ManagerLinkError.forNumber(number);
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
      return com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ManagerLinkError[] VALUES = values();

    public static ManagerLinkError valueOf(
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

    private ManagerLinkError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v3.errors.ManagerLinkErrorEnum.ManagerLinkError)
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
    if (!(obj instanceof com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum other = (com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum) obj;

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

  public static com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum prototype) {
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
   * Container for enum describing possible ManagerLink errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v3.errors.ManagerLinkErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v3.errors.ManagerLinkErrorEnum)
      com.google.ads.googleads.v3.errors.ManagerLinkErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v3.errors.ManagerLinkErrorProto.internal_static_google_ads_googleads_v3_errors_ManagerLinkErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v3.errors.ManagerLinkErrorProto.internal_static_google_ads_googleads_v3_errors_ManagerLinkErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum.class, com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v3.errors.ManagerLinkErrorProto.internal_static_google_ads_googleads_v3_errors_ManagerLinkErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum build() {
      com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum buildPartial() {
      com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum result = new com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum other) {
      if (other == com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v3.errors.ManagerLinkErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v3.errors.ManagerLinkErrorEnum)
  private static final com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum();
  }

  public static com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ManagerLinkErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<ManagerLinkErrorEnum>() {
    @java.lang.Override
    public ManagerLinkErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ManagerLinkErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ManagerLinkErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ManagerLinkErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v3.errors.ManagerLinkErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


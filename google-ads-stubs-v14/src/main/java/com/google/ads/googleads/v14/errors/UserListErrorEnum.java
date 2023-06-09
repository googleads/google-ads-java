// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/errors/user_list_error.proto

package com.google.ads.googleads.v14.errors;

/**
 * <pre>
 * Container for enum describing possible user list errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.errors.UserListErrorEnum}
 */
public final class UserListErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.errors.UserListErrorEnum)
    UserListErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserListErrorEnum.newBuilder() to construct.
  private UserListErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserListErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserListErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.errors.UserListErrorProto.internal_static_google_ads_googleads_v14_errors_UserListErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.errors.UserListErrorProto.internal_static_google_ads_googleads_v14_errors_UserListErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.errors.UserListErrorEnum.class, com.google.ads.googleads.v14.errors.UserListErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible user list errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v14.errors.UserListErrorEnum.UserListError}
   */
  public enum UserListError
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
     * Creating and updating external remarketing user lists is not supported.
     * </pre>
     *
     * <code>EXTERNAL_REMARKETING_USER_LIST_MUTATE_NOT_SUPPORTED = 2;</code>
     */
    EXTERNAL_REMARKETING_USER_LIST_MUTATE_NOT_SUPPORTED(2),
    /**
     * <pre>
     * Concrete type of user list is required.
     * </pre>
     *
     * <code>CONCRETE_TYPE_REQUIRED = 3;</code>
     */
    CONCRETE_TYPE_REQUIRED(3),
    /**
     * <pre>
     * Creating/updating user list conversion types requires specifying the
     * conversion type Id.
     * </pre>
     *
     * <code>CONVERSION_TYPE_ID_REQUIRED = 4;</code>
     */
    CONVERSION_TYPE_ID_REQUIRED(4),
    /**
     * <pre>
     * Remarketing user list cannot have duplicate conversion types.
     * </pre>
     *
     * <code>DUPLICATE_CONVERSION_TYPES = 5;</code>
     */
    DUPLICATE_CONVERSION_TYPES(5),
    /**
     * <pre>
     * Conversion type is invalid/unknown.
     * </pre>
     *
     * <code>INVALID_CONVERSION_TYPE = 6;</code>
     */
    INVALID_CONVERSION_TYPE(6),
    /**
     * <pre>
     * User list description is empty or invalid.
     * </pre>
     *
     * <code>INVALID_DESCRIPTION = 7;</code>
     */
    INVALID_DESCRIPTION(7),
    /**
     * <pre>
     * User list name is empty or invalid.
     * </pre>
     *
     * <code>INVALID_NAME = 8;</code>
     */
    INVALID_NAME(8),
    /**
     * <pre>
     * Type of the UserList does not match.
     * </pre>
     *
     * <code>INVALID_TYPE = 9;</code>
     */
    INVALID_TYPE(9),
    /**
     * <pre>
     * Embedded logical user lists are not allowed.
     * </pre>
     *
     * <code>CAN_NOT_ADD_LOGICAL_LIST_AS_LOGICAL_LIST_OPERAND = 10;</code>
     */
    CAN_NOT_ADD_LOGICAL_LIST_AS_LOGICAL_LIST_OPERAND(10),
    /**
     * <pre>
     * User list rule operand is invalid.
     * </pre>
     *
     * <code>INVALID_USER_LIST_LOGICAL_RULE_OPERAND = 11;</code>
     */
    INVALID_USER_LIST_LOGICAL_RULE_OPERAND(11),
    /**
     * <pre>
     * Name is already being used for another user list for the account.
     * </pre>
     *
     * <code>NAME_ALREADY_USED = 12;</code>
     */
    NAME_ALREADY_USED(12),
    /**
     * <pre>
     * Name is required when creating a new conversion type.
     * </pre>
     *
     * <code>NEW_CONVERSION_TYPE_NAME_REQUIRED = 13;</code>
     */
    NEW_CONVERSION_TYPE_NAME_REQUIRED(13),
    /**
     * <pre>
     * The given conversion type name has been used.
     * </pre>
     *
     * <code>CONVERSION_TYPE_NAME_ALREADY_USED = 14;</code>
     */
    CONVERSION_TYPE_NAME_ALREADY_USED(14),
    /**
     * <pre>
     * Only an owner account may edit a user list.
     * </pre>
     *
     * <code>OWNERSHIP_REQUIRED_FOR_SET = 15;</code>
     */
    OWNERSHIP_REQUIRED_FOR_SET(15),
    /**
     * <pre>
     * Creating user list without setting type in oneof user_list field, or
     * creating/updating read-only user list types is not allowed.
     * </pre>
     *
     * <code>USER_LIST_MUTATE_NOT_SUPPORTED = 16;</code>
     */
    USER_LIST_MUTATE_NOT_SUPPORTED(16),
    /**
     * <pre>
     * Rule is invalid.
     * </pre>
     *
     * <code>INVALID_RULE = 17;</code>
     */
    INVALID_RULE(17),
    /**
     * <pre>
     * The specified date range is empty.
     * </pre>
     *
     * <code>INVALID_DATE_RANGE = 27;</code>
     */
    INVALID_DATE_RANGE(27),
    /**
     * <pre>
     * A UserList which is privacy sensitive or legal rejected cannot be mutated
     * by external users.
     * </pre>
     *
     * <code>CAN_NOT_MUTATE_SENSITIVE_USERLIST = 28;</code>
     */
    CAN_NOT_MUTATE_SENSITIVE_USERLIST(28),
    /**
     * <pre>
     * Maximum number of rulebased user lists a customer can have.
     * </pre>
     *
     * <code>MAX_NUM_RULEBASED_USERLISTS = 29;</code>
     */
    MAX_NUM_RULEBASED_USERLISTS(29),
    /**
     * <pre>
     * BasicUserList's billable record field cannot be modified once it is set.
     * </pre>
     *
     * <code>CANNOT_MODIFY_BILLABLE_RECORD_COUNT = 30;</code>
     */
    CANNOT_MODIFY_BILLABLE_RECORD_COUNT(30),
    /**
     * <pre>
     * crm_based_user_list.app_id field must be set when upload_key_type is
     * MOBILE_ADVERTISING_ID.
     * </pre>
     *
     * <code>APP_ID_NOT_SET = 31;</code>
     */
    APP_ID_NOT_SET(31),
    /**
     * <pre>
     * Name of the user list is reserved for system generated lists and cannot
     * be used.
     * </pre>
     *
     * <code>USERLIST_NAME_IS_RESERVED_FOR_SYSTEM_LIST = 32;</code>
     */
    USERLIST_NAME_IS_RESERVED_FOR_SYSTEM_LIST(32),
    /**
     * <pre>
     * Advertiser needs to be on the allow-list to use remarketing lists created
     * from advertiser uploaded data (for example, Customer Match lists).
     * </pre>
     *
     * <code>ADVERTISER_NOT_ON_ALLOWLIST_FOR_USING_UPLOADED_DATA = 37;</code>
     */
    ADVERTISER_NOT_ON_ALLOWLIST_FOR_USING_UPLOADED_DATA(37),
    /**
     * <pre>
     * The provided rule_type is not supported for the user list.
     * </pre>
     *
     * <code>RULE_TYPE_IS_NOT_SUPPORTED = 34;</code>
     */
    RULE_TYPE_IS_NOT_SUPPORTED(34),
    /**
     * <pre>
     * Similar user list cannot be used as a logical user list operand.
     * </pre>
     *
     * <code>CAN_NOT_ADD_A_SIMILAR_USERLIST_AS_LOGICAL_LIST_OPERAND = 35;</code>
     */
    CAN_NOT_ADD_A_SIMILAR_USERLIST_AS_LOGICAL_LIST_OPERAND(35),
    /**
     * <pre>
     * Logical user list should not have a mix of CRM based user list and other
     * types of lists in its rules.
     * </pre>
     *
     * <code>CAN_NOT_MIX_CRM_BASED_IN_LOGICAL_LIST_WITH_OTHER_LISTS = 36;</code>
     */
    CAN_NOT_MIX_CRM_BASED_IN_LOGICAL_LIST_WITH_OTHER_LISTS(36),
    /**
     * <pre>
     * crm_based_user_list.app_id field can only be set when upload_key_type is
     * MOBILE_ADVERTISING_ID.
     * </pre>
     *
     * <code>APP_ID_NOT_ALLOWED = 39;</code>
     */
    APP_ID_NOT_ALLOWED(39),
    /**
     * <pre>
     * Google system generated user lists cannot be mutated.
     * </pre>
     *
     * <code>CANNOT_MUTATE_SYSTEM_LIST = 40;</code>
     */
    CANNOT_MUTATE_SYSTEM_LIST(40),
    /**
     * <pre>
     * The mobile app associated with the remarketing list is sensitive.
     * </pre>
     *
     * <code>MOBILE_APP_IS_SENSITIVE = 41;</code>
     */
    MOBILE_APP_IS_SENSITIVE(41),
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
     * Creating and updating external remarketing user lists is not supported.
     * </pre>
     *
     * <code>EXTERNAL_REMARKETING_USER_LIST_MUTATE_NOT_SUPPORTED = 2;</code>
     */
    public static final int EXTERNAL_REMARKETING_USER_LIST_MUTATE_NOT_SUPPORTED_VALUE = 2;
    /**
     * <pre>
     * Concrete type of user list is required.
     * </pre>
     *
     * <code>CONCRETE_TYPE_REQUIRED = 3;</code>
     */
    public static final int CONCRETE_TYPE_REQUIRED_VALUE = 3;
    /**
     * <pre>
     * Creating/updating user list conversion types requires specifying the
     * conversion type Id.
     * </pre>
     *
     * <code>CONVERSION_TYPE_ID_REQUIRED = 4;</code>
     */
    public static final int CONVERSION_TYPE_ID_REQUIRED_VALUE = 4;
    /**
     * <pre>
     * Remarketing user list cannot have duplicate conversion types.
     * </pre>
     *
     * <code>DUPLICATE_CONVERSION_TYPES = 5;</code>
     */
    public static final int DUPLICATE_CONVERSION_TYPES_VALUE = 5;
    /**
     * <pre>
     * Conversion type is invalid/unknown.
     * </pre>
     *
     * <code>INVALID_CONVERSION_TYPE = 6;</code>
     */
    public static final int INVALID_CONVERSION_TYPE_VALUE = 6;
    /**
     * <pre>
     * User list description is empty or invalid.
     * </pre>
     *
     * <code>INVALID_DESCRIPTION = 7;</code>
     */
    public static final int INVALID_DESCRIPTION_VALUE = 7;
    /**
     * <pre>
     * User list name is empty or invalid.
     * </pre>
     *
     * <code>INVALID_NAME = 8;</code>
     */
    public static final int INVALID_NAME_VALUE = 8;
    /**
     * <pre>
     * Type of the UserList does not match.
     * </pre>
     *
     * <code>INVALID_TYPE = 9;</code>
     */
    public static final int INVALID_TYPE_VALUE = 9;
    /**
     * <pre>
     * Embedded logical user lists are not allowed.
     * </pre>
     *
     * <code>CAN_NOT_ADD_LOGICAL_LIST_AS_LOGICAL_LIST_OPERAND = 10;</code>
     */
    public static final int CAN_NOT_ADD_LOGICAL_LIST_AS_LOGICAL_LIST_OPERAND_VALUE = 10;
    /**
     * <pre>
     * User list rule operand is invalid.
     * </pre>
     *
     * <code>INVALID_USER_LIST_LOGICAL_RULE_OPERAND = 11;</code>
     */
    public static final int INVALID_USER_LIST_LOGICAL_RULE_OPERAND_VALUE = 11;
    /**
     * <pre>
     * Name is already being used for another user list for the account.
     * </pre>
     *
     * <code>NAME_ALREADY_USED = 12;</code>
     */
    public static final int NAME_ALREADY_USED_VALUE = 12;
    /**
     * <pre>
     * Name is required when creating a new conversion type.
     * </pre>
     *
     * <code>NEW_CONVERSION_TYPE_NAME_REQUIRED = 13;</code>
     */
    public static final int NEW_CONVERSION_TYPE_NAME_REQUIRED_VALUE = 13;
    /**
     * <pre>
     * The given conversion type name has been used.
     * </pre>
     *
     * <code>CONVERSION_TYPE_NAME_ALREADY_USED = 14;</code>
     */
    public static final int CONVERSION_TYPE_NAME_ALREADY_USED_VALUE = 14;
    /**
     * <pre>
     * Only an owner account may edit a user list.
     * </pre>
     *
     * <code>OWNERSHIP_REQUIRED_FOR_SET = 15;</code>
     */
    public static final int OWNERSHIP_REQUIRED_FOR_SET_VALUE = 15;
    /**
     * <pre>
     * Creating user list without setting type in oneof user_list field, or
     * creating/updating read-only user list types is not allowed.
     * </pre>
     *
     * <code>USER_LIST_MUTATE_NOT_SUPPORTED = 16;</code>
     */
    public static final int USER_LIST_MUTATE_NOT_SUPPORTED_VALUE = 16;
    /**
     * <pre>
     * Rule is invalid.
     * </pre>
     *
     * <code>INVALID_RULE = 17;</code>
     */
    public static final int INVALID_RULE_VALUE = 17;
    /**
     * <pre>
     * The specified date range is empty.
     * </pre>
     *
     * <code>INVALID_DATE_RANGE = 27;</code>
     */
    public static final int INVALID_DATE_RANGE_VALUE = 27;
    /**
     * <pre>
     * A UserList which is privacy sensitive or legal rejected cannot be mutated
     * by external users.
     * </pre>
     *
     * <code>CAN_NOT_MUTATE_SENSITIVE_USERLIST = 28;</code>
     */
    public static final int CAN_NOT_MUTATE_SENSITIVE_USERLIST_VALUE = 28;
    /**
     * <pre>
     * Maximum number of rulebased user lists a customer can have.
     * </pre>
     *
     * <code>MAX_NUM_RULEBASED_USERLISTS = 29;</code>
     */
    public static final int MAX_NUM_RULEBASED_USERLISTS_VALUE = 29;
    /**
     * <pre>
     * BasicUserList's billable record field cannot be modified once it is set.
     * </pre>
     *
     * <code>CANNOT_MODIFY_BILLABLE_RECORD_COUNT = 30;</code>
     */
    public static final int CANNOT_MODIFY_BILLABLE_RECORD_COUNT_VALUE = 30;
    /**
     * <pre>
     * crm_based_user_list.app_id field must be set when upload_key_type is
     * MOBILE_ADVERTISING_ID.
     * </pre>
     *
     * <code>APP_ID_NOT_SET = 31;</code>
     */
    public static final int APP_ID_NOT_SET_VALUE = 31;
    /**
     * <pre>
     * Name of the user list is reserved for system generated lists and cannot
     * be used.
     * </pre>
     *
     * <code>USERLIST_NAME_IS_RESERVED_FOR_SYSTEM_LIST = 32;</code>
     */
    public static final int USERLIST_NAME_IS_RESERVED_FOR_SYSTEM_LIST_VALUE = 32;
    /**
     * <pre>
     * Advertiser needs to be on the allow-list to use remarketing lists created
     * from advertiser uploaded data (for example, Customer Match lists).
     * </pre>
     *
     * <code>ADVERTISER_NOT_ON_ALLOWLIST_FOR_USING_UPLOADED_DATA = 37;</code>
     */
    public static final int ADVERTISER_NOT_ON_ALLOWLIST_FOR_USING_UPLOADED_DATA_VALUE = 37;
    /**
     * <pre>
     * The provided rule_type is not supported for the user list.
     * </pre>
     *
     * <code>RULE_TYPE_IS_NOT_SUPPORTED = 34;</code>
     */
    public static final int RULE_TYPE_IS_NOT_SUPPORTED_VALUE = 34;
    /**
     * <pre>
     * Similar user list cannot be used as a logical user list operand.
     * </pre>
     *
     * <code>CAN_NOT_ADD_A_SIMILAR_USERLIST_AS_LOGICAL_LIST_OPERAND = 35;</code>
     */
    public static final int CAN_NOT_ADD_A_SIMILAR_USERLIST_AS_LOGICAL_LIST_OPERAND_VALUE = 35;
    /**
     * <pre>
     * Logical user list should not have a mix of CRM based user list and other
     * types of lists in its rules.
     * </pre>
     *
     * <code>CAN_NOT_MIX_CRM_BASED_IN_LOGICAL_LIST_WITH_OTHER_LISTS = 36;</code>
     */
    public static final int CAN_NOT_MIX_CRM_BASED_IN_LOGICAL_LIST_WITH_OTHER_LISTS_VALUE = 36;
    /**
     * <pre>
     * crm_based_user_list.app_id field can only be set when upload_key_type is
     * MOBILE_ADVERTISING_ID.
     * </pre>
     *
     * <code>APP_ID_NOT_ALLOWED = 39;</code>
     */
    public static final int APP_ID_NOT_ALLOWED_VALUE = 39;
    /**
     * <pre>
     * Google system generated user lists cannot be mutated.
     * </pre>
     *
     * <code>CANNOT_MUTATE_SYSTEM_LIST = 40;</code>
     */
    public static final int CANNOT_MUTATE_SYSTEM_LIST_VALUE = 40;
    /**
     * <pre>
     * The mobile app associated with the remarketing list is sensitive.
     * </pre>
     *
     * <code>MOBILE_APP_IS_SENSITIVE = 41;</code>
     */
    public static final int MOBILE_APP_IS_SENSITIVE_VALUE = 41;


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
    public static UserListError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static UserListError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return EXTERNAL_REMARKETING_USER_LIST_MUTATE_NOT_SUPPORTED;
        case 3: return CONCRETE_TYPE_REQUIRED;
        case 4: return CONVERSION_TYPE_ID_REQUIRED;
        case 5: return DUPLICATE_CONVERSION_TYPES;
        case 6: return INVALID_CONVERSION_TYPE;
        case 7: return INVALID_DESCRIPTION;
        case 8: return INVALID_NAME;
        case 9: return INVALID_TYPE;
        case 10: return CAN_NOT_ADD_LOGICAL_LIST_AS_LOGICAL_LIST_OPERAND;
        case 11: return INVALID_USER_LIST_LOGICAL_RULE_OPERAND;
        case 12: return NAME_ALREADY_USED;
        case 13: return NEW_CONVERSION_TYPE_NAME_REQUIRED;
        case 14: return CONVERSION_TYPE_NAME_ALREADY_USED;
        case 15: return OWNERSHIP_REQUIRED_FOR_SET;
        case 16: return USER_LIST_MUTATE_NOT_SUPPORTED;
        case 17: return INVALID_RULE;
        case 27: return INVALID_DATE_RANGE;
        case 28: return CAN_NOT_MUTATE_SENSITIVE_USERLIST;
        case 29: return MAX_NUM_RULEBASED_USERLISTS;
        case 30: return CANNOT_MODIFY_BILLABLE_RECORD_COUNT;
        case 31: return APP_ID_NOT_SET;
        case 32: return USERLIST_NAME_IS_RESERVED_FOR_SYSTEM_LIST;
        case 37: return ADVERTISER_NOT_ON_ALLOWLIST_FOR_USING_UPLOADED_DATA;
        case 34: return RULE_TYPE_IS_NOT_SUPPORTED;
        case 35: return CAN_NOT_ADD_A_SIMILAR_USERLIST_AS_LOGICAL_LIST_OPERAND;
        case 36: return CAN_NOT_MIX_CRM_BASED_IN_LOGICAL_LIST_WITH_OTHER_LISTS;
        case 39: return APP_ID_NOT_ALLOWED;
        case 40: return CANNOT_MUTATE_SYSTEM_LIST;
        case 41: return MOBILE_APP_IS_SENSITIVE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<UserListError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        UserListError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<UserListError>() {
            public UserListError findValueByNumber(int number) {
              return UserListError.forNumber(number);
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
      return com.google.ads.googleads.v14.errors.UserListErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final UserListError[] VALUES = values();

    public static UserListError valueOf(
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

    private UserListError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v14.errors.UserListErrorEnum.UserListError)
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
    if (!(obj instanceof com.google.ads.googleads.v14.errors.UserListErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.errors.UserListErrorEnum other = (com.google.ads.googleads.v14.errors.UserListErrorEnum) obj;

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

  public static com.google.ads.googleads.v14.errors.UserListErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.errors.UserListErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.errors.UserListErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.errors.UserListErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.errors.UserListErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.errors.UserListErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.errors.UserListErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.errors.UserListErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.errors.UserListErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.errors.UserListErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.errors.UserListErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.errors.UserListErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.errors.UserListErrorEnum prototype) {
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
   * Container for enum describing possible user list errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.errors.UserListErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.errors.UserListErrorEnum)
      com.google.ads.googleads.v14.errors.UserListErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.errors.UserListErrorProto.internal_static_google_ads_googleads_v14_errors_UserListErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.errors.UserListErrorProto.internal_static_google_ads_googleads_v14_errors_UserListErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.errors.UserListErrorEnum.class, com.google.ads.googleads.v14.errors.UserListErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.errors.UserListErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v14.errors.UserListErrorProto.internal_static_google_ads_googleads_v14_errors_UserListErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.errors.UserListErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.errors.UserListErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.errors.UserListErrorEnum build() {
      com.google.ads.googleads.v14.errors.UserListErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.errors.UserListErrorEnum buildPartial() {
      com.google.ads.googleads.v14.errors.UserListErrorEnum result = new com.google.ads.googleads.v14.errors.UserListErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v14.errors.UserListErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v14.errors.UserListErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.errors.UserListErrorEnum other) {
      if (other == com.google.ads.googleads.v14.errors.UserListErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.errors.UserListErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.errors.UserListErrorEnum)
  private static final com.google.ads.googleads.v14.errors.UserListErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.errors.UserListErrorEnum();
  }

  public static com.google.ads.googleads.v14.errors.UserListErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserListErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<UserListErrorEnum>() {
    @java.lang.Override
    public UserListErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserListErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserListErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.errors.UserListErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/errors/account_budget_proposal_error.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.errors;

/**
 * <pre>
 * Container for enum describing possible account budget proposal errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum}
 */
public final class AccountBudgetProposalErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum)
    AccountBudgetProposalErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AccountBudgetProposalErrorEnum.newBuilder() to construct.
  private AccountBudgetProposalErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AccountBudgetProposalErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AccountBudgetProposalErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorProto.internal_static_google_ads_googleads_v16_errors_AccountBudgetProposalErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorProto.internal_static_google_ads_googleads_v16_errors_AccountBudgetProposalErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum.class, com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible account budget proposal errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum.AccountBudgetProposalError}
   */
  public enum AccountBudgetProposalError
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
     * The field mask must be empty for create/end/remove proposals.
     * </pre>
     *
     * <code>FIELD_MASK_NOT_ALLOWED = 2;</code>
     */
    FIELD_MASK_NOT_ALLOWED(2),
    /**
     * <pre>
     * The field cannot be set because of the proposal type.
     * </pre>
     *
     * <code>IMMUTABLE_FIELD = 3;</code>
     */
    IMMUTABLE_FIELD(3),
    /**
     * <pre>
     * The field is required because of the proposal type.
     * </pre>
     *
     * <code>REQUIRED_FIELD_MISSING = 4;</code>
     */
    REQUIRED_FIELD_MISSING(4),
    /**
     * <pre>
     * Proposals that have been approved cannot be cancelled.
     * </pre>
     *
     * <code>CANNOT_CANCEL_APPROVED_PROPOSAL = 5;</code>
     */
    CANNOT_CANCEL_APPROVED_PROPOSAL(5),
    /**
     * <pre>
     * Budgets that haven't been approved cannot be removed.
     * </pre>
     *
     * <code>CANNOT_REMOVE_UNAPPROVED_BUDGET = 6;</code>
     */
    CANNOT_REMOVE_UNAPPROVED_BUDGET(6),
    /**
     * <pre>
     * Budgets that are currently running cannot be removed.
     * </pre>
     *
     * <code>CANNOT_REMOVE_RUNNING_BUDGET = 7;</code>
     */
    CANNOT_REMOVE_RUNNING_BUDGET(7),
    /**
     * <pre>
     * Budgets that haven't been approved cannot be truncated.
     * </pre>
     *
     * <code>CANNOT_END_UNAPPROVED_BUDGET = 8;</code>
     */
    CANNOT_END_UNAPPROVED_BUDGET(8),
    /**
     * <pre>
     * Only budgets that are currently running can be truncated.
     * </pre>
     *
     * <code>CANNOT_END_INACTIVE_BUDGET = 9;</code>
     */
    CANNOT_END_INACTIVE_BUDGET(9),
    /**
     * <pre>
     * All budgets must have names.
     * </pre>
     *
     * <code>BUDGET_NAME_REQUIRED = 10;</code>
     */
    BUDGET_NAME_REQUIRED(10),
    /**
     * <pre>
     * Expired budgets cannot be edited after a sufficient amount of time has
     * passed.
     * </pre>
     *
     * <code>CANNOT_UPDATE_OLD_BUDGET = 11;</code>
     */
    CANNOT_UPDATE_OLD_BUDGET(11),
    /**
     * <pre>
     * It is not permissible a propose a new budget that ends in the past.
     * </pre>
     *
     * <code>CANNOT_END_IN_PAST = 12;</code>
     */
    CANNOT_END_IN_PAST(12),
    /**
     * <pre>
     * An expired budget cannot be extended to overlap with the running budget.
     * </pre>
     *
     * <code>CANNOT_EXTEND_END_TIME = 13;</code>
     */
    CANNOT_EXTEND_END_TIME(13),
    /**
     * <pre>
     * A purchase order number is required.
     * </pre>
     *
     * <code>PURCHASE_ORDER_NUMBER_REQUIRED = 14;</code>
     */
    PURCHASE_ORDER_NUMBER_REQUIRED(14),
    /**
     * <pre>
     * Budgets that have a pending update cannot be updated.
     * </pre>
     *
     * <code>PENDING_UPDATE_PROPOSAL_EXISTS = 15;</code>
     */
    PENDING_UPDATE_PROPOSAL_EXISTS(15),
    /**
     * <pre>
     * Cannot propose more than one budget when the corresponding billing setup
     * hasn't been approved.
     * </pre>
     *
     * <code>MULTIPLE_BUDGETS_NOT_ALLOWED_FOR_UNAPPROVED_BILLING_SETUP = 16;</code>
     */
    MULTIPLE_BUDGETS_NOT_ALLOWED_FOR_UNAPPROVED_BILLING_SETUP(16),
    /**
     * <pre>
     * Cannot update the start time of a budget that has already started.
     * </pre>
     *
     * <code>CANNOT_UPDATE_START_TIME_FOR_STARTED_BUDGET = 17;</code>
     */
    CANNOT_UPDATE_START_TIME_FOR_STARTED_BUDGET(17),
    /**
     * <pre>
     * Cannot update the spending limit of a budget with an amount lower than
     * what has already been spent.
     * </pre>
     *
     * <code>SPENDING_LIMIT_LOWER_THAN_ACCRUED_COST_NOT_ALLOWED = 18;</code>
     */
    SPENDING_LIMIT_LOWER_THAN_ACCRUED_COST_NOT_ALLOWED(18),
    /**
     * <pre>
     * Cannot propose a budget update without actually changing any fields.
     * </pre>
     *
     * <code>UPDATE_IS_NO_OP = 19;</code>
     */
    UPDATE_IS_NO_OP(19),
    /**
     * <pre>
     * The end time must come after the start time.
     * </pre>
     *
     * <code>END_TIME_MUST_FOLLOW_START_TIME = 20;</code>
     */
    END_TIME_MUST_FOLLOW_START_TIME(20),
    /**
     * <pre>
     * The budget's date range must fall within the date range of its billing
     * setup.
     * </pre>
     *
     * <code>BUDGET_DATE_RANGE_INCOMPATIBLE_WITH_BILLING_SETUP = 21;</code>
     */
    BUDGET_DATE_RANGE_INCOMPATIBLE_WITH_BILLING_SETUP(21),
    /**
     * <pre>
     * The user is not authorized to mutate budgets for the given billing setup.
     * </pre>
     *
     * <code>NOT_AUTHORIZED = 22;</code>
     */
    NOT_AUTHORIZED(22),
    /**
     * <pre>
     * Mutates are not allowed for the given billing setup.
     * </pre>
     *
     * <code>INVALID_BILLING_SETUP = 23;</code>
     */
    INVALID_BILLING_SETUP(23),
    /**
     * <pre>
     * Budget creation failed as it overlaps with a pending budget proposal
     * or an approved budget.
     * </pre>
     *
     * <code>OVERLAPS_EXISTING_BUDGET = 24;</code>
     */
    OVERLAPS_EXISTING_BUDGET(24),
    /**
     * <pre>
     * The control setting in user's payments profile doesn't allow budget
     * creation through API. Log in to Google Ads to create budget.
     * </pre>
     *
     * <code>CANNOT_CREATE_BUDGET_THROUGH_API = 25;</code>
     */
    CANNOT_CREATE_BUDGET_THROUGH_API(25),
    /**
     * <pre>
     * Master service agreement has not been signed yet for the Payments
     * Profile.
     * </pre>
     *
     * <code>INVALID_MASTER_SERVICE_AGREEMENT = 26;</code>
     */
    INVALID_MASTER_SERVICE_AGREEMENT(26),
    /**
     * <pre>
     * Budget mutates are not allowed because the given billing setup is
     * canceled.
     * </pre>
     *
     * <code>CANCELED_BILLING_SETUP = 27;</code>
     */
    CANCELED_BILLING_SETUP(27),
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
     * The field mask must be empty for create/end/remove proposals.
     * </pre>
     *
     * <code>FIELD_MASK_NOT_ALLOWED = 2;</code>
     */
    public static final int FIELD_MASK_NOT_ALLOWED_VALUE = 2;
    /**
     * <pre>
     * The field cannot be set because of the proposal type.
     * </pre>
     *
     * <code>IMMUTABLE_FIELD = 3;</code>
     */
    public static final int IMMUTABLE_FIELD_VALUE = 3;
    /**
     * <pre>
     * The field is required because of the proposal type.
     * </pre>
     *
     * <code>REQUIRED_FIELD_MISSING = 4;</code>
     */
    public static final int REQUIRED_FIELD_MISSING_VALUE = 4;
    /**
     * <pre>
     * Proposals that have been approved cannot be cancelled.
     * </pre>
     *
     * <code>CANNOT_CANCEL_APPROVED_PROPOSAL = 5;</code>
     */
    public static final int CANNOT_CANCEL_APPROVED_PROPOSAL_VALUE = 5;
    /**
     * <pre>
     * Budgets that haven't been approved cannot be removed.
     * </pre>
     *
     * <code>CANNOT_REMOVE_UNAPPROVED_BUDGET = 6;</code>
     */
    public static final int CANNOT_REMOVE_UNAPPROVED_BUDGET_VALUE = 6;
    /**
     * <pre>
     * Budgets that are currently running cannot be removed.
     * </pre>
     *
     * <code>CANNOT_REMOVE_RUNNING_BUDGET = 7;</code>
     */
    public static final int CANNOT_REMOVE_RUNNING_BUDGET_VALUE = 7;
    /**
     * <pre>
     * Budgets that haven't been approved cannot be truncated.
     * </pre>
     *
     * <code>CANNOT_END_UNAPPROVED_BUDGET = 8;</code>
     */
    public static final int CANNOT_END_UNAPPROVED_BUDGET_VALUE = 8;
    /**
     * <pre>
     * Only budgets that are currently running can be truncated.
     * </pre>
     *
     * <code>CANNOT_END_INACTIVE_BUDGET = 9;</code>
     */
    public static final int CANNOT_END_INACTIVE_BUDGET_VALUE = 9;
    /**
     * <pre>
     * All budgets must have names.
     * </pre>
     *
     * <code>BUDGET_NAME_REQUIRED = 10;</code>
     */
    public static final int BUDGET_NAME_REQUIRED_VALUE = 10;
    /**
     * <pre>
     * Expired budgets cannot be edited after a sufficient amount of time has
     * passed.
     * </pre>
     *
     * <code>CANNOT_UPDATE_OLD_BUDGET = 11;</code>
     */
    public static final int CANNOT_UPDATE_OLD_BUDGET_VALUE = 11;
    /**
     * <pre>
     * It is not permissible a propose a new budget that ends in the past.
     * </pre>
     *
     * <code>CANNOT_END_IN_PAST = 12;</code>
     */
    public static final int CANNOT_END_IN_PAST_VALUE = 12;
    /**
     * <pre>
     * An expired budget cannot be extended to overlap with the running budget.
     * </pre>
     *
     * <code>CANNOT_EXTEND_END_TIME = 13;</code>
     */
    public static final int CANNOT_EXTEND_END_TIME_VALUE = 13;
    /**
     * <pre>
     * A purchase order number is required.
     * </pre>
     *
     * <code>PURCHASE_ORDER_NUMBER_REQUIRED = 14;</code>
     */
    public static final int PURCHASE_ORDER_NUMBER_REQUIRED_VALUE = 14;
    /**
     * <pre>
     * Budgets that have a pending update cannot be updated.
     * </pre>
     *
     * <code>PENDING_UPDATE_PROPOSAL_EXISTS = 15;</code>
     */
    public static final int PENDING_UPDATE_PROPOSAL_EXISTS_VALUE = 15;
    /**
     * <pre>
     * Cannot propose more than one budget when the corresponding billing setup
     * hasn't been approved.
     * </pre>
     *
     * <code>MULTIPLE_BUDGETS_NOT_ALLOWED_FOR_UNAPPROVED_BILLING_SETUP = 16;</code>
     */
    public static final int MULTIPLE_BUDGETS_NOT_ALLOWED_FOR_UNAPPROVED_BILLING_SETUP_VALUE = 16;
    /**
     * <pre>
     * Cannot update the start time of a budget that has already started.
     * </pre>
     *
     * <code>CANNOT_UPDATE_START_TIME_FOR_STARTED_BUDGET = 17;</code>
     */
    public static final int CANNOT_UPDATE_START_TIME_FOR_STARTED_BUDGET_VALUE = 17;
    /**
     * <pre>
     * Cannot update the spending limit of a budget with an amount lower than
     * what has already been spent.
     * </pre>
     *
     * <code>SPENDING_LIMIT_LOWER_THAN_ACCRUED_COST_NOT_ALLOWED = 18;</code>
     */
    public static final int SPENDING_LIMIT_LOWER_THAN_ACCRUED_COST_NOT_ALLOWED_VALUE = 18;
    /**
     * <pre>
     * Cannot propose a budget update without actually changing any fields.
     * </pre>
     *
     * <code>UPDATE_IS_NO_OP = 19;</code>
     */
    public static final int UPDATE_IS_NO_OP_VALUE = 19;
    /**
     * <pre>
     * The end time must come after the start time.
     * </pre>
     *
     * <code>END_TIME_MUST_FOLLOW_START_TIME = 20;</code>
     */
    public static final int END_TIME_MUST_FOLLOW_START_TIME_VALUE = 20;
    /**
     * <pre>
     * The budget's date range must fall within the date range of its billing
     * setup.
     * </pre>
     *
     * <code>BUDGET_DATE_RANGE_INCOMPATIBLE_WITH_BILLING_SETUP = 21;</code>
     */
    public static final int BUDGET_DATE_RANGE_INCOMPATIBLE_WITH_BILLING_SETUP_VALUE = 21;
    /**
     * <pre>
     * The user is not authorized to mutate budgets for the given billing setup.
     * </pre>
     *
     * <code>NOT_AUTHORIZED = 22;</code>
     */
    public static final int NOT_AUTHORIZED_VALUE = 22;
    /**
     * <pre>
     * Mutates are not allowed for the given billing setup.
     * </pre>
     *
     * <code>INVALID_BILLING_SETUP = 23;</code>
     */
    public static final int INVALID_BILLING_SETUP_VALUE = 23;
    /**
     * <pre>
     * Budget creation failed as it overlaps with a pending budget proposal
     * or an approved budget.
     * </pre>
     *
     * <code>OVERLAPS_EXISTING_BUDGET = 24;</code>
     */
    public static final int OVERLAPS_EXISTING_BUDGET_VALUE = 24;
    /**
     * <pre>
     * The control setting in user's payments profile doesn't allow budget
     * creation through API. Log in to Google Ads to create budget.
     * </pre>
     *
     * <code>CANNOT_CREATE_BUDGET_THROUGH_API = 25;</code>
     */
    public static final int CANNOT_CREATE_BUDGET_THROUGH_API_VALUE = 25;
    /**
     * <pre>
     * Master service agreement has not been signed yet for the Payments
     * Profile.
     * </pre>
     *
     * <code>INVALID_MASTER_SERVICE_AGREEMENT = 26;</code>
     */
    public static final int INVALID_MASTER_SERVICE_AGREEMENT_VALUE = 26;
    /**
     * <pre>
     * Budget mutates are not allowed because the given billing setup is
     * canceled.
     * </pre>
     *
     * <code>CANCELED_BILLING_SETUP = 27;</code>
     */
    public static final int CANCELED_BILLING_SETUP_VALUE = 27;


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
    public static AccountBudgetProposalError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AccountBudgetProposalError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return FIELD_MASK_NOT_ALLOWED;
        case 3: return IMMUTABLE_FIELD;
        case 4: return REQUIRED_FIELD_MISSING;
        case 5: return CANNOT_CANCEL_APPROVED_PROPOSAL;
        case 6: return CANNOT_REMOVE_UNAPPROVED_BUDGET;
        case 7: return CANNOT_REMOVE_RUNNING_BUDGET;
        case 8: return CANNOT_END_UNAPPROVED_BUDGET;
        case 9: return CANNOT_END_INACTIVE_BUDGET;
        case 10: return BUDGET_NAME_REQUIRED;
        case 11: return CANNOT_UPDATE_OLD_BUDGET;
        case 12: return CANNOT_END_IN_PAST;
        case 13: return CANNOT_EXTEND_END_TIME;
        case 14: return PURCHASE_ORDER_NUMBER_REQUIRED;
        case 15: return PENDING_UPDATE_PROPOSAL_EXISTS;
        case 16: return MULTIPLE_BUDGETS_NOT_ALLOWED_FOR_UNAPPROVED_BILLING_SETUP;
        case 17: return CANNOT_UPDATE_START_TIME_FOR_STARTED_BUDGET;
        case 18: return SPENDING_LIMIT_LOWER_THAN_ACCRUED_COST_NOT_ALLOWED;
        case 19: return UPDATE_IS_NO_OP;
        case 20: return END_TIME_MUST_FOLLOW_START_TIME;
        case 21: return BUDGET_DATE_RANGE_INCOMPATIBLE_WITH_BILLING_SETUP;
        case 22: return NOT_AUTHORIZED;
        case 23: return INVALID_BILLING_SETUP;
        case 24: return OVERLAPS_EXISTING_BUDGET;
        case 25: return CANNOT_CREATE_BUDGET_THROUGH_API;
        case 26: return INVALID_MASTER_SERVICE_AGREEMENT;
        case 27: return CANCELED_BILLING_SETUP;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AccountBudgetProposalError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AccountBudgetProposalError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AccountBudgetProposalError>() {
            public AccountBudgetProposalError findValueByNumber(int number) {
              return AccountBudgetProposalError.forNumber(number);
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
      return com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AccountBudgetProposalError[] VALUES = values();

    public static AccountBudgetProposalError valueOf(
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

    private AccountBudgetProposalError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum.AccountBudgetProposalError)
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
    if (!(obj instanceof com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum other = (com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum) obj;

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

  public static com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum prototype) {
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
   * Container for enum describing possible account budget proposal errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum)
      com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorProto.internal_static_google_ads_googleads_v16_errors_AccountBudgetProposalErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorProto.internal_static_google_ads_googleads_v16_errors_AccountBudgetProposalErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum.class, com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorProto.internal_static_google_ads_googleads_v16_errors_AccountBudgetProposalErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum build() {
      com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum buildPartial() {
      com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum result = new com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum other) {
      if (other == com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum)
  private static final com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum();
  }

  public static com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccountBudgetProposalErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<AccountBudgetProposalErrorEnum>() {
    @java.lang.Override
    public AccountBudgetProposalErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<AccountBudgetProposalErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccountBudgetProposalErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.errors.AccountBudgetProposalErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


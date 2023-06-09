// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/services/invoice_service.proto

package com.google.ads.googleads.v12.services;

/**
 * <pre>
 * Request message for fetching the invoices of a given billing setup that were
 * issued during a given month.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.services.ListInvoicesRequest}
 */
public final class ListInvoicesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.services.ListInvoicesRequest)
    ListInvoicesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListInvoicesRequest.newBuilder() to construct.
  private ListInvoicesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListInvoicesRequest() {
    customerId_ = "";
    billingSetup_ = "";
    issueYear_ = "";
    issueMonth_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListInvoicesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.services.InvoiceServiceProto.internal_static_google_ads_googleads_v12_services_ListInvoicesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.services.InvoiceServiceProto.internal_static_google_ads_googleads_v12_services_ListInvoicesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.services.ListInvoicesRequest.class, com.google.ads.googleads.v12.services.ListInvoicesRequest.Builder.class);
  }

  public static final int CUSTOMER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object customerId_ = "";
  /**
   * <pre>
   * Required. The ID of the customer to fetch invoices for.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  @java.lang.Override
  public java.lang.String getCustomerId() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customerId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The ID of the customer to fetch invoices for.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerIdBytes() {
    java.lang.Object ref = customerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BILLING_SETUP_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object billingSetup_ = "";
  /**
   * <pre>
   * Required. The billing setup resource name of the requested invoices.
   *
   * `customers/{customer_id}/billingSetups/{billing_setup_id}`
   * </pre>
   *
   * <code>string billing_setup = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The billingSetup.
   */
  @java.lang.Override
  public java.lang.String getBillingSetup() {
    java.lang.Object ref = billingSetup_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      billingSetup_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The billing setup resource name of the requested invoices.
   *
   * `customers/{customer_id}/billingSetups/{billing_setup_id}`
   * </pre>
   *
   * <code>string billing_setup = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for billingSetup.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBillingSetupBytes() {
    java.lang.Object ref = billingSetup_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      billingSetup_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ISSUE_YEAR_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object issueYear_ = "";
  /**
   * <pre>
   * Required. The issue year to retrieve invoices, in yyyy format. Only
   * invoices issued in 2019 or later can be retrieved.
   * </pre>
   *
   * <code>string issue_year = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The issueYear.
   */
  @java.lang.Override
  public java.lang.String getIssueYear() {
    java.lang.Object ref = issueYear_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      issueYear_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Required. The issue year to retrieve invoices, in yyyy format. Only
   * invoices issued in 2019 or later can be retrieved.
   * </pre>
   *
   * <code>string issue_year = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for issueYear.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIssueYearBytes() {
    java.lang.Object ref = issueYear_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      issueYear_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ISSUE_MONTH_FIELD_NUMBER = 4;
  private int issueMonth_ = 0;
  /**
   * <pre>
   * Required. The issue month to retrieve invoices.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.MonthOfYearEnum.MonthOfYear issue_month = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for issueMonth.
   */
  @java.lang.Override public int getIssueMonthValue() {
    return issueMonth_;
  }
  /**
   * <pre>
   * Required. The issue month to retrieve invoices.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.enums.MonthOfYearEnum.MonthOfYear issue_month = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The issueMonth.
   */
  @java.lang.Override public com.google.ads.googleads.v12.enums.MonthOfYearEnum.MonthOfYear getIssueMonth() {
    com.google.ads.googleads.v12.enums.MonthOfYearEnum.MonthOfYear result = com.google.ads.googleads.v12.enums.MonthOfYearEnum.MonthOfYear.forNumber(issueMonth_);
    return result == null ? com.google.ads.googleads.v12.enums.MonthOfYearEnum.MonthOfYear.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customerId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(billingSetup_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, billingSetup_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(issueYear_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, issueYear_);
    }
    if (issueMonth_ != com.google.ads.googleads.v12.enums.MonthOfYearEnum.MonthOfYear.UNSPECIFIED.getNumber()) {
      output.writeEnum(4, issueMonth_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customerId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(billingSetup_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, billingSetup_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(issueYear_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, issueYear_);
    }
    if (issueMonth_ != com.google.ads.googleads.v12.enums.MonthOfYearEnum.MonthOfYear.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, issueMonth_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.services.ListInvoicesRequest)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.services.ListInvoicesRequest other = (com.google.ads.googleads.v12.services.ListInvoicesRequest) obj;

    if (!getCustomerId()
        .equals(other.getCustomerId())) return false;
    if (!getBillingSetup()
        .equals(other.getBillingSetup())) return false;
    if (!getIssueYear()
        .equals(other.getIssueYear())) return false;
    if (issueMonth_ != other.issueMonth_) return false;
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
    hash = (37 * hash) + CUSTOMER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCustomerId().hashCode();
    hash = (37 * hash) + BILLING_SETUP_FIELD_NUMBER;
    hash = (53 * hash) + getBillingSetup().hashCode();
    hash = (37 * hash) + ISSUE_YEAR_FIELD_NUMBER;
    hash = (53 * hash) + getIssueYear().hashCode();
    hash = (37 * hash) + ISSUE_MONTH_FIELD_NUMBER;
    hash = (53 * hash) + issueMonth_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.services.ListInvoicesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.ListInvoicesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.ListInvoicesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.ListInvoicesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.ListInvoicesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.services.ListInvoicesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.ListInvoicesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.ListInvoicesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v12.services.ListInvoicesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v12.services.ListInvoicesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.services.ListInvoicesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.services.ListInvoicesRequest parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.services.ListInvoicesRequest prototype) {
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
   * Request message for fetching the invoices of a given billing setup that were
   * issued during a given month.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.services.ListInvoicesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.services.ListInvoicesRequest)
      com.google.ads.googleads.v12.services.ListInvoicesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.services.InvoiceServiceProto.internal_static_google_ads_googleads_v12_services_ListInvoicesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.services.InvoiceServiceProto.internal_static_google_ads_googleads_v12_services_ListInvoicesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.services.ListInvoicesRequest.class, com.google.ads.googleads.v12.services.ListInvoicesRequest.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.services.ListInvoicesRequest.newBuilder()
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
      customerId_ = "";
      billingSetup_ = "";
      issueYear_ = "";
      issueMonth_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.services.InvoiceServiceProto.internal_static_google_ads_googleads_v12_services_ListInvoicesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.ListInvoicesRequest getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.services.ListInvoicesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.ListInvoicesRequest build() {
      com.google.ads.googleads.v12.services.ListInvoicesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.services.ListInvoicesRequest buildPartial() {
      com.google.ads.googleads.v12.services.ListInvoicesRequest result = new com.google.ads.googleads.v12.services.ListInvoicesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.services.ListInvoicesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.customerId_ = customerId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.billingSetup_ = billingSetup_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.issueYear_ = issueYear_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.issueMonth_ = issueMonth_;
      }
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
      if (other instanceof com.google.ads.googleads.v12.services.ListInvoicesRequest) {
        return mergeFrom((com.google.ads.googleads.v12.services.ListInvoicesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.services.ListInvoicesRequest other) {
      if (other == com.google.ads.googleads.v12.services.ListInvoicesRequest.getDefaultInstance()) return this;
      if (!other.getCustomerId().isEmpty()) {
        customerId_ = other.customerId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getBillingSetup().isEmpty()) {
        billingSetup_ = other.billingSetup_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getIssueYear().isEmpty()) {
        issueYear_ = other.issueYear_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.issueMonth_ != 0) {
        setIssueMonthValue(other.getIssueMonthValue());
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
            case 10: {
              customerId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              billingSetup_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              issueYear_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              issueMonth_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
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

    private java.lang.Object customerId_ = "";
    /**
     * <pre>
     * Required. The ID of the customer to fetch invoices for.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The customerId.
     */
    public java.lang.String getCustomerId() {
      java.lang.Object ref = customerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the customer to fetch invoices for.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for customerId.
     */
    public com.google.protobuf.ByteString
        getCustomerIdBytes() {
      java.lang.Object ref = customerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The ID of the customer to fetch invoices for.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      customerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the customer to fetch invoices for.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomerId() {
      customerId_ = getDefaultInstance().getCustomerId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The ID of the customer to fetch invoices for.
     * </pre>
     *
     * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for customerId to set.
     * @return This builder for chaining.
     */
    public Builder setCustomerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      customerId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object billingSetup_ = "";
    /**
     * <pre>
     * Required. The billing setup resource name of the requested invoices.
     *
     * `customers/{customer_id}/billingSetups/{billing_setup_id}`
     * </pre>
     *
     * <code>string billing_setup = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The billingSetup.
     */
    public java.lang.String getBillingSetup() {
      java.lang.Object ref = billingSetup_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        billingSetup_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The billing setup resource name of the requested invoices.
     *
     * `customers/{customer_id}/billingSetups/{billing_setup_id}`
     * </pre>
     *
     * <code>string billing_setup = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for billingSetup.
     */
    public com.google.protobuf.ByteString
        getBillingSetupBytes() {
      java.lang.Object ref = billingSetup_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        billingSetup_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The billing setup resource name of the requested invoices.
     *
     * `customers/{customer_id}/billingSetups/{billing_setup_id}`
     * </pre>
     *
     * <code>string billing_setup = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The billingSetup to set.
     * @return This builder for chaining.
     */
    public Builder setBillingSetup(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      billingSetup_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The billing setup resource name of the requested invoices.
     *
     * `customers/{customer_id}/billingSetups/{billing_setup_id}`
     * </pre>
     *
     * <code>string billing_setup = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearBillingSetup() {
      billingSetup_ = getDefaultInstance().getBillingSetup();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The billing setup resource name of the requested invoices.
     *
     * `customers/{customer_id}/billingSetups/{billing_setup_id}`
     * </pre>
     *
     * <code>string billing_setup = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for billingSetup to set.
     * @return This builder for chaining.
     */
    public Builder setBillingSetupBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      billingSetup_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object issueYear_ = "";
    /**
     * <pre>
     * Required. The issue year to retrieve invoices, in yyyy format. Only
     * invoices issued in 2019 or later can be retrieved.
     * </pre>
     *
     * <code>string issue_year = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The issueYear.
     */
    public java.lang.String getIssueYear() {
      java.lang.Object ref = issueYear_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        issueYear_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Required. The issue year to retrieve invoices, in yyyy format. Only
     * invoices issued in 2019 or later can be retrieved.
     * </pre>
     *
     * <code>string issue_year = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The bytes for issueYear.
     */
    public com.google.protobuf.ByteString
        getIssueYearBytes() {
      java.lang.Object ref = issueYear_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        issueYear_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Required. The issue year to retrieve invoices, in yyyy format. Only
     * invoices issued in 2019 or later can be retrieved.
     * </pre>
     *
     * <code>string issue_year = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The issueYear to set.
     * @return This builder for chaining.
     */
    public Builder setIssueYear(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      issueYear_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The issue year to retrieve invoices, in yyyy format. Only
     * invoices issued in 2019 or later can be retrieved.
     * </pre>
     *
     * <code>string issue_year = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearIssueYear() {
      issueYear_ = getDefaultInstance().getIssueYear();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The issue year to retrieve invoices, in yyyy format. Only
     * invoices issued in 2019 or later can be retrieved.
     * </pre>
     *
     * <code>string issue_year = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The bytes for issueYear to set.
     * @return This builder for chaining.
     */
    public Builder setIssueYearBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      issueYear_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int issueMonth_ = 0;
    /**
     * <pre>
     * Required. The issue month to retrieve invoices.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.MonthOfYearEnum.MonthOfYear issue_month = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The enum numeric value on the wire for issueMonth.
     */
    @java.lang.Override public int getIssueMonthValue() {
      return issueMonth_;
    }
    /**
     * <pre>
     * Required. The issue month to retrieve invoices.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.MonthOfYearEnum.MonthOfYear issue_month = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The enum numeric value on the wire for issueMonth to set.
     * @return This builder for chaining.
     */
    public Builder setIssueMonthValue(int value) {
      issueMonth_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The issue month to retrieve invoices.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.MonthOfYearEnum.MonthOfYear issue_month = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return The issueMonth.
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.enums.MonthOfYearEnum.MonthOfYear getIssueMonth() {
      com.google.ads.googleads.v12.enums.MonthOfYearEnum.MonthOfYear result = com.google.ads.googleads.v12.enums.MonthOfYearEnum.MonthOfYear.forNumber(issueMonth_);
      return result == null ? com.google.ads.googleads.v12.enums.MonthOfYearEnum.MonthOfYear.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Required. The issue month to retrieve invoices.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.MonthOfYearEnum.MonthOfYear issue_month = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param value The issueMonth to set.
     * @return This builder for chaining.
     */
    public Builder setIssueMonth(com.google.ads.googleads.v12.enums.MonthOfYearEnum.MonthOfYear value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      issueMonth_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Required. The issue month to retrieve invoices.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.enums.MonthOfYearEnum.MonthOfYear issue_month = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return This builder for chaining.
     */
    public Builder clearIssueMonth() {
      bitField0_ = (bitField0_ & ~0x00000008);
      issueMonth_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.services.ListInvoicesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.services.ListInvoicesRequest)
  private static final com.google.ads.googleads.v12.services.ListInvoicesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.services.ListInvoicesRequest();
  }

  public static com.google.ads.googleads.v12.services.ListInvoicesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListInvoicesRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListInvoicesRequest>() {
    @java.lang.Override
    public ListInvoicesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListInvoicesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListInvoicesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.services.ListInvoicesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


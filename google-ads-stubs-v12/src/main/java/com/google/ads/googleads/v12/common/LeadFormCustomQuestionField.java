// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v12/common/asset_types.proto

package com.google.ads.googleads.v12.common;

/**
 * <pre>
 * One custom question input field instance within a form.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v12.common.LeadFormCustomQuestionField}
 */
public final class LeadFormCustomQuestionField extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v12.common.LeadFormCustomQuestionField)
    LeadFormCustomQuestionFieldOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LeadFormCustomQuestionField.newBuilder() to construct.
  private LeadFormCustomQuestionField(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LeadFormCustomQuestionField() {
    customQuestionText_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LeadFormCustomQuestionField();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v12.common.AssetTypesProto.internal_static_google_ads_googleads_v12_common_LeadFormCustomQuestionField_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v12.common.AssetTypesProto.internal_static_google_ads_googleads_v12_common_LeadFormCustomQuestionField_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v12.common.LeadFormCustomQuestionField.class, com.google.ads.googleads.v12.common.LeadFormCustomQuestionField.Builder.class);
  }

  private int answersCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object answers_;
  public enum AnswersCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    SINGLE_CHOICE_ANSWERS(2),
    ANSWERS_NOT_SET(0);
    private final int value;
    private AnswersCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AnswersCase valueOf(int value) {
      return forNumber(value);
    }

    public static AnswersCase forNumber(int value) {
      switch (value) {
        case 2: return SINGLE_CHOICE_ANSWERS;
        case 0: return ANSWERS_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public AnswersCase
  getAnswersCase() {
    return AnswersCase.forNumber(
        answersCase_);
  }

  public static final int CUSTOM_QUESTION_TEXT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object customQuestionText_ = "";
  /**
   * <pre>
   * The exact custom question field text (for example, "What kind of vehicle
   * do you have?").
   * </pre>
   *
   * <code>string custom_question_text = 1;</code>
   * @return The customQuestionText.
   */
  @java.lang.Override
  public java.lang.String getCustomQuestionText() {
    java.lang.Object ref = customQuestionText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      customQuestionText_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The exact custom question field text (for example, "What kind of vehicle
   * do you have?").
   * </pre>
   *
   * <code>string custom_question_text = 1;</code>
   * @return The bytes for customQuestionText.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomQuestionTextBytes() {
    java.lang.Object ref = customQuestionText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      customQuestionText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SINGLE_CHOICE_ANSWERS_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Answer configuration for a single choice question.
   * Minimum of 2 answers and maximum of 12 allowed.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
   * @return Whether the singleChoiceAnswers field is set.
   */
  @java.lang.Override
  public boolean hasSingleChoiceAnswers() {
    return answersCase_ == 2;
  }
  /**
   * <pre>
   * Answer configuration for a single choice question.
   * Minimum of 2 answers and maximum of 12 allowed.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
   * @return The singleChoiceAnswers.
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers getSingleChoiceAnswers() {
    if (answersCase_ == 2) {
       return (com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers) answers_;
    }
    return com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers.getDefaultInstance();
  }
  /**
   * <pre>
   * Answer configuration for a single choice question.
   * Minimum of 2 answers and maximum of 12 allowed.
   * </pre>
   *
   * <code>.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswersOrBuilder getSingleChoiceAnswersOrBuilder() {
    if (answersCase_ == 2) {
       return (com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers) answers_;
    }
    return com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers.getDefaultInstance();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customQuestionText_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, customQuestionText_);
    }
    if (answersCase_ == 2) {
      output.writeMessage(2, (com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers) answers_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(customQuestionText_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, customQuestionText_);
    }
    if (answersCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers) answers_);
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
    if (!(obj instanceof com.google.ads.googleads.v12.common.LeadFormCustomQuestionField)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v12.common.LeadFormCustomQuestionField other = (com.google.ads.googleads.v12.common.LeadFormCustomQuestionField) obj;

    if (!getCustomQuestionText()
        .equals(other.getCustomQuestionText())) return false;
    if (!getAnswersCase().equals(other.getAnswersCase())) return false;
    switch (answersCase_) {
      case 2:
        if (!getSingleChoiceAnswers()
            .equals(other.getSingleChoiceAnswers())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + CUSTOM_QUESTION_TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getCustomQuestionText().hashCode();
    switch (answersCase_) {
      case 2:
        hash = (37 * hash) + SINGLE_CHOICE_ANSWERS_FIELD_NUMBER;
        hash = (53 * hash) + getSingleChoiceAnswers().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v12.common.LeadFormCustomQuestionField parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.LeadFormCustomQuestionField parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.LeadFormCustomQuestionField parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.LeadFormCustomQuestionField parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.LeadFormCustomQuestionField parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v12.common.LeadFormCustomQuestionField parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.LeadFormCustomQuestionField parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.LeadFormCustomQuestionField parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v12.common.LeadFormCustomQuestionField parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v12.common.LeadFormCustomQuestionField parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v12.common.LeadFormCustomQuestionField parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v12.common.LeadFormCustomQuestionField parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v12.common.LeadFormCustomQuestionField prototype) {
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
   * One custom question input field instance within a form.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v12.common.LeadFormCustomQuestionField}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v12.common.LeadFormCustomQuestionField)
      com.google.ads.googleads.v12.common.LeadFormCustomQuestionFieldOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v12.common.AssetTypesProto.internal_static_google_ads_googleads_v12_common_LeadFormCustomQuestionField_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v12.common.AssetTypesProto.internal_static_google_ads_googleads_v12_common_LeadFormCustomQuestionField_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v12.common.LeadFormCustomQuestionField.class, com.google.ads.googleads.v12.common.LeadFormCustomQuestionField.Builder.class);
    }

    // Construct using com.google.ads.googleads.v12.common.LeadFormCustomQuestionField.newBuilder()
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
      customQuestionText_ = "";
      if (singleChoiceAnswersBuilder_ != null) {
        singleChoiceAnswersBuilder_.clear();
      }
      answersCase_ = 0;
      answers_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v12.common.AssetTypesProto.internal_static_google_ads_googleads_v12_common_LeadFormCustomQuestionField_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.LeadFormCustomQuestionField getDefaultInstanceForType() {
      return com.google.ads.googleads.v12.common.LeadFormCustomQuestionField.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.LeadFormCustomQuestionField build() {
      com.google.ads.googleads.v12.common.LeadFormCustomQuestionField result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v12.common.LeadFormCustomQuestionField buildPartial() {
      com.google.ads.googleads.v12.common.LeadFormCustomQuestionField result = new com.google.ads.googleads.v12.common.LeadFormCustomQuestionField(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v12.common.LeadFormCustomQuestionField result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.customQuestionText_ = customQuestionText_;
      }
    }

    private void buildPartialOneofs(com.google.ads.googleads.v12.common.LeadFormCustomQuestionField result) {
      result.answersCase_ = answersCase_;
      result.answers_ = this.answers_;
      if (answersCase_ == 2 &&
          singleChoiceAnswersBuilder_ != null) {
        result.answers_ = singleChoiceAnswersBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v12.common.LeadFormCustomQuestionField) {
        return mergeFrom((com.google.ads.googleads.v12.common.LeadFormCustomQuestionField)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v12.common.LeadFormCustomQuestionField other) {
      if (other == com.google.ads.googleads.v12.common.LeadFormCustomQuestionField.getDefaultInstance()) return this;
      if (!other.getCustomQuestionText().isEmpty()) {
        customQuestionText_ = other.customQuestionText_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      switch (other.getAnswersCase()) {
        case SINGLE_CHOICE_ANSWERS: {
          mergeSingleChoiceAnswers(other.getSingleChoiceAnswers());
          break;
        }
        case ANSWERS_NOT_SET: {
          break;
        }
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
              customQuestionText_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getSingleChoiceAnswersFieldBuilder().getBuilder(),
                  extensionRegistry);
              answersCase_ = 2;
              break;
            } // case 18
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
    private int answersCase_ = 0;
    private java.lang.Object answers_;
    public AnswersCase
        getAnswersCase() {
      return AnswersCase.forNumber(
          answersCase_);
    }

    public Builder clearAnswers() {
      answersCase_ = 0;
      answers_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private java.lang.Object customQuestionText_ = "";
    /**
     * <pre>
     * The exact custom question field text (for example, "What kind of vehicle
     * do you have?").
     * </pre>
     *
     * <code>string custom_question_text = 1;</code>
     * @return The customQuestionText.
     */
    public java.lang.String getCustomQuestionText() {
      java.lang.Object ref = customQuestionText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        customQuestionText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The exact custom question field text (for example, "What kind of vehicle
     * do you have?").
     * </pre>
     *
     * <code>string custom_question_text = 1;</code>
     * @return The bytes for customQuestionText.
     */
    public com.google.protobuf.ByteString
        getCustomQuestionTextBytes() {
      java.lang.Object ref = customQuestionText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        customQuestionText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The exact custom question field text (for example, "What kind of vehicle
     * do you have?").
     * </pre>
     *
     * <code>string custom_question_text = 1;</code>
     * @param value The customQuestionText to set.
     * @return This builder for chaining.
     */
    public Builder setCustomQuestionText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      customQuestionText_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The exact custom question field text (for example, "What kind of vehicle
     * do you have?").
     * </pre>
     *
     * <code>string custom_question_text = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCustomQuestionText() {
      customQuestionText_ = getDefaultInstance().getCustomQuestionText();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The exact custom question field text (for example, "What kind of vehicle
     * do you have?").
     * </pre>
     *
     * <code>string custom_question_text = 1;</code>
     * @param value The bytes for customQuestionText to set.
     * @return This builder for chaining.
     */
    public Builder setCustomQuestionTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      customQuestionText_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers, com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers.Builder, com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswersOrBuilder> singleChoiceAnswersBuilder_;
    /**
     * <pre>
     * Answer configuration for a single choice question.
     * Minimum of 2 answers and maximum of 12 allowed.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
     * @return Whether the singleChoiceAnswers field is set.
     */
    @java.lang.Override
    public boolean hasSingleChoiceAnswers() {
      return answersCase_ == 2;
    }
    /**
     * <pre>
     * Answer configuration for a single choice question.
     * Minimum of 2 answers and maximum of 12 allowed.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
     * @return The singleChoiceAnswers.
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers getSingleChoiceAnswers() {
      if (singleChoiceAnswersBuilder_ == null) {
        if (answersCase_ == 2) {
          return (com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers) answers_;
        }
        return com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers.getDefaultInstance();
      } else {
        if (answersCase_ == 2) {
          return singleChoiceAnswersBuilder_.getMessage();
        }
        return com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Answer configuration for a single choice question.
     * Minimum of 2 answers and maximum of 12 allowed.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
     */
    public Builder setSingleChoiceAnswers(com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers value) {
      if (singleChoiceAnswersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        answers_ = value;
        onChanged();
      } else {
        singleChoiceAnswersBuilder_.setMessage(value);
      }
      answersCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Answer configuration for a single choice question.
     * Minimum of 2 answers and maximum of 12 allowed.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
     */
    public Builder setSingleChoiceAnswers(
        com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers.Builder builderForValue) {
      if (singleChoiceAnswersBuilder_ == null) {
        answers_ = builderForValue.build();
        onChanged();
      } else {
        singleChoiceAnswersBuilder_.setMessage(builderForValue.build());
      }
      answersCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Answer configuration for a single choice question.
     * Minimum of 2 answers and maximum of 12 allowed.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
     */
    public Builder mergeSingleChoiceAnswers(com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers value) {
      if (singleChoiceAnswersBuilder_ == null) {
        if (answersCase_ == 2 &&
            answers_ != com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers.getDefaultInstance()) {
          answers_ = com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers.newBuilder((com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers) answers_)
              .mergeFrom(value).buildPartial();
        } else {
          answers_ = value;
        }
        onChanged();
      } else {
        if (answersCase_ == 2) {
          singleChoiceAnswersBuilder_.mergeFrom(value);
        } else {
          singleChoiceAnswersBuilder_.setMessage(value);
        }
      }
      answersCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Answer configuration for a single choice question.
     * Minimum of 2 answers and maximum of 12 allowed.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
     */
    public Builder clearSingleChoiceAnswers() {
      if (singleChoiceAnswersBuilder_ == null) {
        if (answersCase_ == 2) {
          answersCase_ = 0;
          answers_ = null;
          onChanged();
        }
      } else {
        if (answersCase_ == 2) {
          answersCase_ = 0;
          answers_ = null;
        }
        singleChoiceAnswersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Answer configuration for a single choice question.
     * Minimum of 2 answers and maximum of 12 allowed.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
     */
    public com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers.Builder getSingleChoiceAnswersBuilder() {
      return getSingleChoiceAnswersFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Answer configuration for a single choice question.
     * Minimum of 2 answers and maximum of 12 allowed.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
     */
    @java.lang.Override
    public com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswersOrBuilder getSingleChoiceAnswersOrBuilder() {
      if ((answersCase_ == 2) && (singleChoiceAnswersBuilder_ != null)) {
        return singleChoiceAnswersBuilder_.getMessageOrBuilder();
      } else {
        if (answersCase_ == 2) {
          return (com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers) answers_;
        }
        return com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Answer configuration for a single choice question.
     * Minimum of 2 answers and maximum of 12 allowed.
     * </pre>
     *
     * <code>.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers single_choice_answers = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers, com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers.Builder, com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswersOrBuilder> 
        getSingleChoiceAnswersFieldBuilder() {
      if (singleChoiceAnswersBuilder_ == null) {
        if (!(answersCase_ == 2)) {
          answers_ = com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers.getDefaultInstance();
        }
        singleChoiceAnswersBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers, com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers.Builder, com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswersOrBuilder>(
                (com.google.ads.googleads.v12.common.LeadFormSingleChoiceAnswers) answers_,
                getParentForChildren(),
                isClean());
        answers_ = null;
      }
      answersCase_ = 2;
      onChanged();
      return singleChoiceAnswersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v12.common.LeadFormCustomQuestionField)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v12.common.LeadFormCustomQuestionField)
  private static final com.google.ads.googleads.v12.common.LeadFormCustomQuestionField DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v12.common.LeadFormCustomQuestionField();
  }

  public static com.google.ads.googleads.v12.common.LeadFormCustomQuestionField getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LeadFormCustomQuestionField>
      PARSER = new com.google.protobuf.AbstractParser<LeadFormCustomQuestionField>() {
    @java.lang.Override
    public LeadFormCustomQuestionField parsePartialFrom(
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

  public static com.google.protobuf.Parser<LeadFormCustomQuestionField> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LeadFormCustomQuestionField> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v12.common.LeadFormCustomQuestionField getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


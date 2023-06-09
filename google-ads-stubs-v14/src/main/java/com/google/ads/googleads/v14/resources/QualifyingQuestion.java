// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/resources/qualifying_question.proto

package com.google.ads.googleads.v14.resources;

/**
 * <pre>
 * Qualifying Questions for Lead Form.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.resources.QualifyingQuestion}
 */
public final class QualifyingQuestion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.resources.QualifyingQuestion)
    QualifyingQuestionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QualifyingQuestion.newBuilder() to construct.
  private QualifyingQuestion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QualifyingQuestion() {
    resourceName_ = "";
    locale_ = "";
    text_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QualifyingQuestion();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.resources.QualifyingQuestionProto.internal_static_google_ads_googleads_v14_resources_QualifyingQuestion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.resources.QualifyingQuestionProto.internal_static_google_ads_googleads_v14_resources_QualifyingQuestion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.resources.QualifyingQuestion.class, com.google.ads.googleads.v14.resources.QualifyingQuestion.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceName_ = "";
  /**
   * <pre>
   * Output only. The resource name of the qualifying question.
   *
   * 'qualifyingQuestions/{qualifyingQuestionId}'
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The resource name of the qualifying question.
   *
   * 'qualifyingQuestions/{qualifyingQuestionId}'
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int QUALIFYING_QUESTION_ID_FIELD_NUMBER = 2;
  private long qualifyingQuestionId_ = 0L;
  /**
   * <pre>
   * Output only. The id of the qualifying question.
   * </pre>
   *
   * <code>int64 qualifying_question_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The qualifyingQuestionId.
   */
  @java.lang.Override
  public long getQualifyingQuestionId() {
    return qualifyingQuestionId_;
  }

  public static final int LOCALE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object locale_ = "";
  /**
   * <pre>
   * Output only. The locale of the qualifying question.
   * </pre>
   *
   * <code>string locale = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The locale.
   */
  @java.lang.Override
  public java.lang.String getLocale() {
    java.lang.Object ref = locale_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      locale_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The locale of the qualifying question.
   * </pre>
   *
   * <code>string locale = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for locale.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLocaleBytes() {
    java.lang.Object ref = locale_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      locale_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEXT_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object text_ = "";
  /**
   * <pre>
   * Output only. The qualifying question.
   * </pre>
   *
   * <code>string text = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      text_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. The qualifying question.
   * </pre>
   *
   * <code>string text = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextBytes() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      text_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (qualifyingQuestionId_ != 0L) {
      output.writeInt64(2, qualifyingQuestionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(locale_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, locale_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, text_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (qualifyingQuestionId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, qualifyingQuestionId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(locale_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, locale_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, text_);
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
    if (!(obj instanceof com.google.ads.googleads.v14.resources.QualifyingQuestion)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.resources.QualifyingQuestion other = (com.google.ads.googleads.v14.resources.QualifyingQuestion) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (getQualifyingQuestionId()
        != other.getQualifyingQuestionId()) return false;
    if (!getLocale()
        .equals(other.getLocale())) return false;
    if (!getText()
        .equals(other.getText())) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    hash = (37 * hash) + QUALIFYING_QUESTION_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getQualifyingQuestionId());
    hash = (37 * hash) + LOCALE_FIELD_NUMBER;
    hash = (53 * hash) + getLocale().hashCode();
    hash = (37 * hash) + TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getText().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v14.resources.QualifyingQuestion parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.resources.QualifyingQuestion parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.resources.QualifyingQuestion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.resources.QualifyingQuestion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.resources.QualifyingQuestion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.resources.QualifyingQuestion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.resources.QualifyingQuestion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.resources.QualifyingQuestion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.resources.QualifyingQuestion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.resources.QualifyingQuestion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.resources.QualifyingQuestion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.resources.QualifyingQuestion parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.resources.QualifyingQuestion prototype) {
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
   * Qualifying Questions for Lead Form.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.resources.QualifyingQuestion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.resources.QualifyingQuestion)
      com.google.ads.googleads.v14.resources.QualifyingQuestionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.resources.QualifyingQuestionProto.internal_static_google_ads_googleads_v14_resources_QualifyingQuestion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.resources.QualifyingQuestionProto.internal_static_google_ads_googleads_v14_resources_QualifyingQuestion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.resources.QualifyingQuestion.class, com.google.ads.googleads.v14.resources.QualifyingQuestion.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.resources.QualifyingQuestion.newBuilder()
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
      resourceName_ = "";
      qualifyingQuestionId_ = 0L;
      locale_ = "";
      text_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v14.resources.QualifyingQuestionProto.internal_static_google_ads_googleads_v14_resources_QualifyingQuestion_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.resources.QualifyingQuestion getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.resources.QualifyingQuestion.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.resources.QualifyingQuestion build() {
      com.google.ads.googleads.v14.resources.QualifyingQuestion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.resources.QualifyingQuestion buildPartial() {
      com.google.ads.googleads.v14.resources.QualifyingQuestion result = new com.google.ads.googleads.v14.resources.QualifyingQuestion(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v14.resources.QualifyingQuestion result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceName_ = resourceName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.qualifyingQuestionId_ = qualifyingQuestionId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.locale_ = locale_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.text_ = text_;
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
      if (other instanceof com.google.ads.googleads.v14.resources.QualifyingQuestion) {
        return mergeFrom((com.google.ads.googleads.v14.resources.QualifyingQuestion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.resources.QualifyingQuestion other) {
      if (other == com.google.ads.googleads.v14.resources.QualifyingQuestion.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getQualifyingQuestionId() != 0L) {
        setQualifyingQuestionId(other.getQualifyingQuestionId());
      }
      if (!other.getLocale().isEmpty()) {
        locale_ = other.locale_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getText().isEmpty()) {
        text_ = other.text_;
        bitField0_ |= 0x00000008;
        onChanged();
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
              resourceName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              qualifyingQuestionId_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              locale_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              text_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Output only. The resource name of the qualifying question.
     *
     * 'qualifyingQuestions/{qualifyingQuestionId}'
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The resource name of the qualifying question.
     *
     * 'qualifyingQuestions/{qualifyingQuestionId}'
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The resource name of the qualifying question.
     *
     * 'qualifyingQuestions/{qualifyingQuestionId}'
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      resourceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the qualifying question.
     *
     * 'qualifyingQuestions/{qualifyingQuestionId}'
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      resourceName_ = getDefaultInstance().getResourceName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The resource name of the qualifying question.
     *
     * 'qualifyingQuestions/{qualifyingQuestionId}'
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      resourceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long qualifyingQuestionId_ ;
    /**
     * <pre>
     * Output only. The id of the qualifying question.
     * </pre>
     *
     * <code>int64 qualifying_question_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The qualifyingQuestionId.
     */
    @java.lang.Override
    public long getQualifyingQuestionId() {
      return qualifyingQuestionId_;
    }
    /**
     * <pre>
     * Output only. The id of the qualifying question.
     * </pre>
     *
     * <code>int64 qualifying_question_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The qualifyingQuestionId to set.
     * @return This builder for chaining.
     */
    public Builder setQualifyingQuestionId(long value) {

      qualifyingQuestionId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The id of the qualifying question.
     * </pre>
     *
     * <code>int64 qualifying_question_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearQualifyingQuestionId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      qualifyingQuestionId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object locale_ = "";
    /**
     * <pre>
     * Output only. The locale of the qualifying question.
     * </pre>
     *
     * <code>string locale = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The locale.
     */
    public java.lang.String getLocale() {
      java.lang.Object ref = locale_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        locale_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The locale of the qualifying question.
     * </pre>
     *
     * <code>string locale = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for locale.
     */
    public com.google.protobuf.ByteString
        getLocaleBytes() {
      java.lang.Object ref = locale_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        locale_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The locale of the qualifying question.
     * </pre>
     *
     * <code>string locale = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The locale to set.
     * @return This builder for chaining.
     */
    public Builder setLocale(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      locale_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The locale of the qualifying question.
     * </pre>
     *
     * <code>string locale = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearLocale() {
      locale_ = getDefaultInstance().getLocale();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The locale of the qualifying question.
     * </pre>
     *
     * <code>string locale = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for locale to set.
     * @return This builder for chaining.
     */
    public Builder setLocaleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      locale_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object text_ = "";
    /**
     * <pre>
     * Output only. The qualifying question.
     * </pre>
     *
     * <code>string text = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The text.
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        text_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. The qualifying question.
     * </pre>
     *
     * <code>string text = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for text.
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. The qualifying question.
     * </pre>
     *
     * <code>string text = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      text_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The qualifying question.
     * </pre>
     *
     * <code>string text = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      text_ = getDefaultInstance().getText();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The qualifying question.
     * </pre>
     *
     * <code>string text = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      text_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.resources.QualifyingQuestion)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.resources.QualifyingQuestion)
  private static final com.google.ads.googleads.v14.resources.QualifyingQuestion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.resources.QualifyingQuestion();
  }

  public static com.google.ads.googleads.v14.resources.QualifyingQuestion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QualifyingQuestion>
      PARSER = new com.google.protobuf.AbstractParser<QualifyingQuestion>() {
    @java.lang.Override
    public QualifyingQuestion parsePartialFrom(
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

  public static com.google.protobuf.Parser<QualifyingQuestion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QualifyingQuestion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.resources.QualifyingQuestion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


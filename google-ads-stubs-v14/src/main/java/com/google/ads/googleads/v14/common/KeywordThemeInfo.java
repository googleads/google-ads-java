// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/common/criteria.proto

package com.google.ads.googleads.v14.common;

/**
 * <pre>
 * A Smart Campaign keyword theme.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.common.KeywordThemeInfo}
 */
public final class KeywordThemeInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.common.KeywordThemeInfo)
    KeywordThemeInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeywordThemeInfo.newBuilder() to construct.
  private KeywordThemeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeywordThemeInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeywordThemeInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.common.CriteriaProto.internal_static_google_ads_googleads_v14_common_KeywordThemeInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.common.CriteriaProto.internal_static_google_ads_googleads_v14_common_KeywordThemeInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.common.KeywordThemeInfo.class, com.google.ads.googleads.v14.common.KeywordThemeInfo.Builder.class);
  }

  private int keywordThemeCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object keywordTheme_;
  public enum KeywordThemeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    KEYWORD_THEME_CONSTANT(1),
    FREE_FORM_KEYWORD_THEME(2),
    KEYWORDTHEME_NOT_SET(0);
    private final int value;
    private KeywordThemeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static KeywordThemeCase valueOf(int value) {
      return forNumber(value);
    }

    public static KeywordThemeCase forNumber(int value) {
      switch (value) {
        case 1: return KEYWORD_THEME_CONSTANT;
        case 2: return FREE_FORM_KEYWORD_THEME;
        case 0: return KEYWORDTHEME_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public KeywordThemeCase
  getKeywordThemeCase() {
    return KeywordThemeCase.forNumber(
        keywordThemeCase_);
  }

  public static final int KEYWORD_THEME_CONSTANT_FIELD_NUMBER = 1;
  /**
   * <pre>
   * The resource name of a Smart Campaign keyword theme constant.
   * `keywordThemeConstants/{keyword_theme_id}~{sub_keyword_theme_id}`
   * </pre>
   *
   * <code>string keyword_theme_constant = 1;</code>
   * @return Whether the keywordThemeConstant field is set.
   */
  public boolean hasKeywordThemeConstant() {
    return keywordThemeCase_ == 1;
  }
  /**
   * <pre>
   * The resource name of a Smart Campaign keyword theme constant.
   * `keywordThemeConstants/{keyword_theme_id}~{sub_keyword_theme_id}`
   * </pre>
   *
   * <code>string keyword_theme_constant = 1;</code>
   * @return The keywordThemeConstant.
   */
  public java.lang.String getKeywordThemeConstant() {
    java.lang.Object ref = "";
    if (keywordThemeCase_ == 1) {
      ref = keywordTheme_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (keywordThemeCase_ == 1) {
        keywordTheme_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * The resource name of a Smart Campaign keyword theme constant.
   * `keywordThemeConstants/{keyword_theme_id}~{sub_keyword_theme_id}`
   * </pre>
   *
   * <code>string keyword_theme_constant = 1;</code>
   * @return The bytes for keywordThemeConstant.
   */
  public com.google.protobuf.ByteString
      getKeywordThemeConstantBytes() {
    java.lang.Object ref = "";
    if (keywordThemeCase_ == 1) {
      ref = keywordTheme_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (keywordThemeCase_ == 1) {
        keywordTheme_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FREE_FORM_KEYWORD_THEME_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Free-form text to be matched to a Smart Campaign keyword theme constant
   * on a best-effort basis.
   * </pre>
   *
   * <code>string free_form_keyword_theme = 2;</code>
   * @return Whether the freeFormKeywordTheme field is set.
   */
  public boolean hasFreeFormKeywordTheme() {
    return keywordThemeCase_ == 2;
  }
  /**
   * <pre>
   * Free-form text to be matched to a Smart Campaign keyword theme constant
   * on a best-effort basis.
   * </pre>
   *
   * <code>string free_form_keyword_theme = 2;</code>
   * @return The freeFormKeywordTheme.
   */
  public java.lang.String getFreeFormKeywordTheme() {
    java.lang.Object ref = "";
    if (keywordThemeCase_ == 2) {
      ref = keywordTheme_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (keywordThemeCase_ == 2) {
        keywordTheme_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Free-form text to be matched to a Smart Campaign keyword theme constant
   * on a best-effort basis.
   * </pre>
   *
   * <code>string free_form_keyword_theme = 2;</code>
   * @return The bytes for freeFormKeywordTheme.
   */
  public com.google.protobuf.ByteString
      getFreeFormKeywordThemeBytes() {
    java.lang.Object ref = "";
    if (keywordThemeCase_ == 2) {
      ref = keywordTheme_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (keywordThemeCase_ == 2) {
        keywordTheme_ = b;
      }
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
    if (keywordThemeCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, keywordTheme_);
    }
    if (keywordThemeCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, keywordTheme_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (keywordThemeCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, keywordTheme_);
    }
    if (keywordThemeCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, keywordTheme_);
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
    if (!(obj instanceof com.google.ads.googleads.v14.common.KeywordThemeInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.common.KeywordThemeInfo other = (com.google.ads.googleads.v14.common.KeywordThemeInfo) obj;

    if (!getKeywordThemeCase().equals(other.getKeywordThemeCase())) return false;
    switch (keywordThemeCase_) {
      case 1:
        if (!getKeywordThemeConstant()
            .equals(other.getKeywordThemeConstant())) return false;
        break;
      case 2:
        if (!getFreeFormKeywordTheme()
            .equals(other.getFreeFormKeywordTheme())) return false;
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
    switch (keywordThemeCase_) {
      case 1:
        hash = (37 * hash) + KEYWORD_THEME_CONSTANT_FIELD_NUMBER;
        hash = (53 * hash) + getKeywordThemeConstant().hashCode();
        break;
      case 2:
        hash = (37 * hash) + FREE_FORM_KEYWORD_THEME_FIELD_NUMBER;
        hash = (53 * hash) + getFreeFormKeywordTheme().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v14.common.KeywordThemeInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.KeywordThemeInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.KeywordThemeInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.KeywordThemeInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.KeywordThemeInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.common.KeywordThemeInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.KeywordThemeInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.common.KeywordThemeInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.common.KeywordThemeInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.common.KeywordThemeInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.common.KeywordThemeInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.common.KeywordThemeInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.common.KeywordThemeInfo prototype) {
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
   * A Smart Campaign keyword theme.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.common.KeywordThemeInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.common.KeywordThemeInfo)
      com.google.ads.googleads.v14.common.KeywordThemeInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.common.CriteriaProto.internal_static_google_ads_googleads_v14_common_KeywordThemeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.common.CriteriaProto.internal_static_google_ads_googleads_v14_common_KeywordThemeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.common.KeywordThemeInfo.class, com.google.ads.googleads.v14.common.KeywordThemeInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.common.KeywordThemeInfo.newBuilder()
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
      keywordThemeCase_ = 0;
      keywordTheme_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v14.common.CriteriaProto.internal_static_google_ads_googleads_v14_common_KeywordThemeInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.KeywordThemeInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.common.KeywordThemeInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.KeywordThemeInfo build() {
      com.google.ads.googleads.v14.common.KeywordThemeInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.common.KeywordThemeInfo buildPartial() {
      com.google.ads.googleads.v14.common.KeywordThemeInfo result = new com.google.ads.googleads.v14.common.KeywordThemeInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v14.common.KeywordThemeInfo result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.ads.googleads.v14.common.KeywordThemeInfo result) {
      result.keywordThemeCase_ = keywordThemeCase_;
      result.keywordTheme_ = this.keywordTheme_;
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
      if (other instanceof com.google.ads.googleads.v14.common.KeywordThemeInfo) {
        return mergeFrom((com.google.ads.googleads.v14.common.KeywordThemeInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.common.KeywordThemeInfo other) {
      if (other == com.google.ads.googleads.v14.common.KeywordThemeInfo.getDefaultInstance()) return this;
      switch (other.getKeywordThemeCase()) {
        case KEYWORD_THEME_CONSTANT: {
          keywordThemeCase_ = 1;
          keywordTheme_ = other.keywordTheme_;
          onChanged();
          break;
        }
        case FREE_FORM_KEYWORD_THEME: {
          keywordThemeCase_ = 2;
          keywordTheme_ = other.keywordTheme_;
          onChanged();
          break;
        }
        case KEYWORDTHEME_NOT_SET: {
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
              java.lang.String s = input.readStringRequireUtf8();
              keywordThemeCase_ = 1;
              keywordTheme_ = s;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              keywordThemeCase_ = 2;
              keywordTheme_ = s;
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
    private int keywordThemeCase_ = 0;
    private java.lang.Object keywordTheme_;
    public KeywordThemeCase
        getKeywordThemeCase() {
      return KeywordThemeCase.forNumber(
          keywordThemeCase_);
    }

    public Builder clearKeywordTheme() {
      keywordThemeCase_ = 0;
      keywordTheme_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <pre>
     * The resource name of a Smart Campaign keyword theme constant.
     * `keywordThemeConstants/{keyword_theme_id}~{sub_keyword_theme_id}`
     * </pre>
     *
     * <code>string keyword_theme_constant = 1;</code>
     * @return Whether the keywordThemeConstant field is set.
     */
    @java.lang.Override
    public boolean hasKeywordThemeConstant() {
      return keywordThemeCase_ == 1;
    }
    /**
     * <pre>
     * The resource name of a Smart Campaign keyword theme constant.
     * `keywordThemeConstants/{keyword_theme_id}~{sub_keyword_theme_id}`
     * </pre>
     *
     * <code>string keyword_theme_constant = 1;</code>
     * @return The keywordThemeConstant.
     */
    @java.lang.Override
    public java.lang.String getKeywordThemeConstant() {
      java.lang.Object ref = "";
      if (keywordThemeCase_ == 1) {
        ref = keywordTheme_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (keywordThemeCase_ == 1) {
          keywordTheme_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The resource name of a Smart Campaign keyword theme constant.
     * `keywordThemeConstants/{keyword_theme_id}~{sub_keyword_theme_id}`
     * </pre>
     *
     * <code>string keyword_theme_constant = 1;</code>
     * @return The bytes for keywordThemeConstant.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getKeywordThemeConstantBytes() {
      java.lang.Object ref = "";
      if (keywordThemeCase_ == 1) {
        ref = keywordTheme_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (keywordThemeCase_ == 1) {
          keywordTheme_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The resource name of a Smart Campaign keyword theme constant.
     * `keywordThemeConstants/{keyword_theme_id}~{sub_keyword_theme_id}`
     * </pre>
     *
     * <code>string keyword_theme_constant = 1;</code>
     * @param value The keywordThemeConstant to set.
     * @return This builder for chaining.
     */
    public Builder setKeywordThemeConstant(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      keywordThemeCase_ = 1;
      keywordTheme_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The resource name of a Smart Campaign keyword theme constant.
     * `keywordThemeConstants/{keyword_theme_id}~{sub_keyword_theme_id}`
     * </pre>
     *
     * <code>string keyword_theme_constant = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKeywordThemeConstant() {
      if (keywordThemeCase_ == 1) {
        keywordThemeCase_ = 0;
        keywordTheme_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The resource name of a Smart Campaign keyword theme constant.
     * `keywordThemeConstants/{keyword_theme_id}~{sub_keyword_theme_id}`
     * </pre>
     *
     * <code>string keyword_theme_constant = 1;</code>
     * @param value The bytes for keywordThemeConstant to set.
     * @return This builder for chaining.
     */
    public Builder setKeywordThemeConstantBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      keywordThemeCase_ = 1;
      keywordTheme_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * Free-form text to be matched to a Smart Campaign keyword theme constant
     * on a best-effort basis.
     * </pre>
     *
     * <code>string free_form_keyword_theme = 2;</code>
     * @return Whether the freeFormKeywordTheme field is set.
     */
    @java.lang.Override
    public boolean hasFreeFormKeywordTheme() {
      return keywordThemeCase_ == 2;
    }
    /**
     * <pre>
     * Free-form text to be matched to a Smart Campaign keyword theme constant
     * on a best-effort basis.
     * </pre>
     *
     * <code>string free_form_keyword_theme = 2;</code>
     * @return The freeFormKeywordTheme.
     */
    @java.lang.Override
    public java.lang.String getFreeFormKeywordTheme() {
      java.lang.Object ref = "";
      if (keywordThemeCase_ == 2) {
        ref = keywordTheme_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (keywordThemeCase_ == 2) {
          keywordTheme_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Free-form text to be matched to a Smart Campaign keyword theme constant
     * on a best-effort basis.
     * </pre>
     *
     * <code>string free_form_keyword_theme = 2;</code>
     * @return The bytes for freeFormKeywordTheme.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFreeFormKeywordThemeBytes() {
      java.lang.Object ref = "";
      if (keywordThemeCase_ == 2) {
        ref = keywordTheme_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (keywordThemeCase_ == 2) {
          keywordTheme_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Free-form text to be matched to a Smart Campaign keyword theme constant
     * on a best-effort basis.
     * </pre>
     *
     * <code>string free_form_keyword_theme = 2;</code>
     * @param value The freeFormKeywordTheme to set.
     * @return This builder for chaining.
     */
    public Builder setFreeFormKeywordTheme(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      keywordThemeCase_ = 2;
      keywordTheme_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Free-form text to be matched to a Smart Campaign keyword theme constant
     * on a best-effort basis.
     * </pre>
     *
     * <code>string free_form_keyword_theme = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFreeFormKeywordTheme() {
      if (keywordThemeCase_ == 2) {
        keywordThemeCase_ = 0;
        keywordTheme_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Free-form text to be matched to a Smart Campaign keyword theme constant
     * on a best-effort basis.
     * </pre>
     *
     * <code>string free_form_keyword_theme = 2;</code>
     * @param value The bytes for freeFormKeywordTheme to set.
     * @return This builder for chaining.
     */
    public Builder setFreeFormKeywordThemeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      keywordThemeCase_ = 2;
      keywordTheme_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.common.KeywordThemeInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.common.KeywordThemeInfo)
  private static final com.google.ads.googleads.v14.common.KeywordThemeInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.common.KeywordThemeInfo();
  }

  public static com.google.ads.googleads.v14.common.KeywordThemeInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeywordThemeInfo>
      PARSER = new com.google.protobuf.AbstractParser<KeywordThemeInfo>() {
    @java.lang.Override
    public KeywordThemeInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<KeywordThemeInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeywordThemeInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.common.KeywordThemeInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


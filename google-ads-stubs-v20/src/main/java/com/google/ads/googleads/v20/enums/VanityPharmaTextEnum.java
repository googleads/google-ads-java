// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v20/enums/vanity_pharma_text.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v20.enums;

/**
 * <pre>
 * The text that will be displayed in display URL of the text ad when website
 * description is the selected display mode for vanity pharma URLs.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v20.enums.VanityPharmaTextEnum}
 */
public final class VanityPharmaTextEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v20.enums.VanityPharmaTextEnum)
    VanityPharmaTextEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VanityPharmaTextEnum.newBuilder() to construct.
  private VanityPharmaTextEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VanityPharmaTextEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VanityPharmaTextEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v20.enums.VanityPharmaTextProto.internal_static_google_ads_googleads_v20_enums_VanityPharmaTextEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v20.enums.VanityPharmaTextProto.internal_static_google_ads_googleads_v20_enums_VanityPharmaTextEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v20.enums.VanityPharmaTextEnum.class, com.google.ads.googleads.v20.enums.VanityPharmaTextEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible text.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v20.enums.VanityPharmaTextEnum.VanityPharmaText}
   */
  public enum VanityPharmaText
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
     * Prescription treatment website with website content in English.
     * </pre>
     *
     * <code>PRESCRIPTION_TREATMENT_WEBSITE_EN = 2;</code>
     */
    PRESCRIPTION_TREATMENT_WEBSITE_EN(2),
    /**
     * <pre>
     * Prescription treatment website with website content in Spanish
     * (Sitio de tratamientos con receta).
     * </pre>
     *
     * <code>PRESCRIPTION_TREATMENT_WEBSITE_ES = 3;</code>
     */
    PRESCRIPTION_TREATMENT_WEBSITE_ES(3),
    /**
     * <pre>
     * Prescription device website with website content in English.
     * </pre>
     *
     * <code>PRESCRIPTION_DEVICE_WEBSITE_EN = 4;</code>
     */
    PRESCRIPTION_DEVICE_WEBSITE_EN(4),
    /**
     * <pre>
     * Prescription device website with website content in Spanish (Sitio de
     * dispositivos con receta).
     * </pre>
     *
     * <code>PRESCRIPTION_DEVICE_WEBSITE_ES = 5;</code>
     */
    PRESCRIPTION_DEVICE_WEBSITE_ES(5),
    /**
     * <pre>
     * Medical device website with website content in English.
     * </pre>
     *
     * <code>MEDICAL_DEVICE_WEBSITE_EN = 6;</code>
     */
    MEDICAL_DEVICE_WEBSITE_EN(6),
    /**
     * <pre>
     * Medical device website with website content in Spanish (Sitio de
     * dispositivos médicos).
     * </pre>
     *
     * <code>MEDICAL_DEVICE_WEBSITE_ES = 7;</code>
     */
    MEDICAL_DEVICE_WEBSITE_ES(7),
    /**
     * <pre>
     * Preventative treatment website with website content in English.
     * </pre>
     *
     * <code>PREVENTATIVE_TREATMENT_WEBSITE_EN = 8;</code>
     */
    PREVENTATIVE_TREATMENT_WEBSITE_EN(8),
    /**
     * <pre>
     * Preventative treatment website with website content in Spanish (Sitio de
     * tratamientos preventivos).
     * </pre>
     *
     * <code>PREVENTATIVE_TREATMENT_WEBSITE_ES = 9;</code>
     */
    PREVENTATIVE_TREATMENT_WEBSITE_ES(9),
    /**
     * <pre>
     * Prescription contraception website with website content in English.
     * </pre>
     *
     * <code>PRESCRIPTION_CONTRACEPTION_WEBSITE_EN = 10;</code>
     */
    PRESCRIPTION_CONTRACEPTION_WEBSITE_EN(10),
    /**
     * <pre>
     * Prescription contraception website with website content in Spanish (Sitio
     * de anticonceptivos con receta).
     * </pre>
     *
     * <code>PRESCRIPTION_CONTRACEPTION_WEBSITE_ES = 11;</code>
     */
    PRESCRIPTION_CONTRACEPTION_WEBSITE_ES(11),
    /**
     * <pre>
     * Prescription vaccine website with website content in English.
     * </pre>
     *
     * <code>PRESCRIPTION_VACCINE_WEBSITE_EN = 12;</code>
     */
    PRESCRIPTION_VACCINE_WEBSITE_EN(12),
    /**
     * <pre>
     * Prescription vaccine website with website content in Spanish (Sitio de
     * vacunas con receta).
     * </pre>
     *
     * <code>PRESCRIPTION_VACCINE_WEBSITE_ES = 13;</code>
     */
    PRESCRIPTION_VACCINE_WEBSITE_ES(13),
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
     * Prescription treatment website with website content in English.
     * </pre>
     *
     * <code>PRESCRIPTION_TREATMENT_WEBSITE_EN = 2;</code>
     */
    public static final int PRESCRIPTION_TREATMENT_WEBSITE_EN_VALUE = 2;
    /**
     * <pre>
     * Prescription treatment website with website content in Spanish
     * (Sitio de tratamientos con receta).
     * </pre>
     *
     * <code>PRESCRIPTION_TREATMENT_WEBSITE_ES = 3;</code>
     */
    public static final int PRESCRIPTION_TREATMENT_WEBSITE_ES_VALUE = 3;
    /**
     * <pre>
     * Prescription device website with website content in English.
     * </pre>
     *
     * <code>PRESCRIPTION_DEVICE_WEBSITE_EN = 4;</code>
     */
    public static final int PRESCRIPTION_DEVICE_WEBSITE_EN_VALUE = 4;
    /**
     * <pre>
     * Prescription device website with website content in Spanish (Sitio de
     * dispositivos con receta).
     * </pre>
     *
     * <code>PRESCRIPTION_DEVICE_WEBSITE_ES = 5;</code>
     */
    public static final int PRESCRIPTION_DEVICE_WEBSITE_ES_VALUE = 5;
    /**
     * <pre>
     * Medical device website with website content in English.
     * </pre>
     *
     * <code>MEDICAL_DEVICE_WEBSITE_EN = 6;</code>
     */
    public static final int MEDICAL_DEVICE_WEBSITE_EN_VALUE = 6;
    /**
     * <pre>
     * Medical device website with website content in Spanish (Sitio de
     * dispositivos médicos).
     * </pre>
     *
     * <code>MEDICAL_DEVICE_WEBSITE_ES = 7;</code>
     */
    public static final int MEDICAL_DEVICE_WEBSITE_ES_VALUE = 7;
    /**
     * <pre>
     * Preventative treatment website with website content in English.
     * </pre>
     *
     * <code>PREVENTATIVE_TREATMENT_WEBSITE_EN = 8;</code>
     */
    public static final int PREVENTATIVE_TREATMENT_WEBSITE_EN_VALUE = 8;
    /**
     * <pre>
     * Preventative treatment website with website content in Spanish (Sitio de
     * tratamientos preventivos).
     * </pre>
     *
     * <code>PREVENTATIVE_TREATMENT_WEBSITE_ES = 9;</code>
     */
    public static final int PREVENTATIVE_TREATMENT_WEBSITE_ES_VALUE = 9;
    /**
     * <pre>
     * Prescription contraception website with website content in English.
     * </pre>
     *
     * <code>PRESCRIPTION_CONTRACEPTION_WEBSITE_EN = 10;</code>
     */
    public static final int PRESCRIPTION_CONTRACEPTION_WEBSITE_EN_VALUE = 10;
    /**
     * <pre>
     * Prescription contraception website with website content in Spanish (Sitio
     * de anticonceptivos con receta).
     * </pre>
     *
     * <code>PRESCRIPTION_CONTRACEPTION_WEBSITE_ES = 11;</code>
     */
    public static final int PRESCRIPTION_CONTRACEPTION_WEBSITE_ES_VALUE = 11;
    /**
     * <pre>
     * Prescription vaccine website with website content in English.
     * </pre>
     *
     * <code>PRESCRIPTION_VACCINE_WEBSITE_EN = 12;</code>
     */
    public static final int PRESCRIPTION_VACCINE_WEBSITE_EN_VALUE = 12;
    /**
     * <pre>
     * Prescription vaccine website with website content in Spanish (Sitio de
     * vacunas con receta).
     * </pre>
     *
     * <code>PRESCRIPTION_VACCINE_WEBSITE_ES = 13;</code>
     */
    public static final int PRESCRIPTION_VACCINE_WEBSITE_ES_VALUE = 13;


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
    public static VanityPharmaText valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static VanityPharmaText forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return PRESCRIPTION_TREATMENT_WEBSITE_EN;
        case 3: return PRESCRIPTION_TREATMENT_WEBSITE_ES;
        case 4: return PRESCRIPTION_DEVICE_WEBSITE_EN;
        case 5: return PRESCRIPTION_DEVICE_WEBSITE_ES;
        case 6: return MEDICAL_DEVICE_WEBSITE_EN;
        case 7: return MEDICAL_DEVICE_WEBSITE_ES;
        case 8: return PREVENTATIVE_TREATMENT_WEBSITE_EN;
        case 9: return PREVENTATIVE_TREATMENT_WEBSITE_ES;
        case 10: return PRESCRIPTION_CONTRACEPTION_WEBSITE_EN;
        case 11: return PRESCRIPTION_CONTRACEPTION_WEBSITE_ES;
        case 12: return PRESCRIPTION_VACCINE_WEBSITE_EN;
        case 13: return PRESCRIPTION_VACCINE_WEBSITE_ES;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<VanityPharmaText>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        VanityPharmaText> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<VanityPharmaText>() {
            public VanityPharmaText findValueByNumber(int number) {
              return VanityPharmaText.forNumber(number);
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
      return com.google.ads.googleads.v20.enums.VanityPharmaTextEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final VanityPharmaText[] VALUES = values();

    public static VanityPharmaText valueOf(
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

    private VanityPharmaText(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v20.enums.VanityPharmaTextEnum.VanityPharmaText)
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
    if (!(obj instanceof com.google.ads.googleads.v20.enums.VanityPharmaTextEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v20.enums.VanityPharmaTextEnum other = (com.google.ads.googleads.v20.enums.VanityPharmaTextEnum) obj;

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

  public static com.google.ads.googleads.v20.enums.VanityPharmaTextEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.enums.VanityPharmaTextEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.enums.VanityPharmaTextEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.enums.VanityPharmaTextEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.enums.VanityPharmaTextEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v20.enums.VanityPharmaTextEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.enums.VanityPharmaTextEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.enums.VanityPharmaTextEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v20.enums.VanityPharmaTextEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v20.enums.VanityPharmaTextEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v20.enums.VanityPharmaTextEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v20.enums.VanityPharmaTextEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v20.enums.VanityPharmaTextEnum prototype) {
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
   * The text that will be displayed in display URL of the text ad when website
   * description is the selected display mode for vanity pharma URLs.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v20.enums.VanityPharmaTextEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v20.enums.VanityPharmaTextEnum)
      com.google.ads.googleads.v20.enums.VanityPharmaTextEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v20.enums.VanityPharmaTextProto.internal_static_google_ads_googleads_v20_enums_VanityPharmaTextEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v20.enums.VanityPharmaTextProto.internal_static_google_ads_googleads_v20_enums_VanityPharmaTextEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v20.enums.VanityPharmaTextEnum.class, com.google.ads.googleads.v20.enums.VanityPharmaTextEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v20.enums.VanityPharmaTextEnum.newBuilder()
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
      return com.google.ads.googleads.v20.enums.VanityPharmaTextProto.internal_static_google_ads_googleads_v20_enums_VanityPharmaTextEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.enums.VanityPharmaTextEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v20.enums.VanityPharmaTextEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.enums.VanityPharmaTextEnum build() {
      com.google.ads.googleads.v20.enums.VanityPharmaTextEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v20.enums.VanityPharmaTextEnum buildPartial() {
      com.google.ads.googleads.v20.enums.VanityPharmaTextEnum result = new com.google.ads.googleads.v20.enums.VanityPharmaTextEnum(this);
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
      if (other instanceof com.google.ads.googleads.v20.enums.VanityPharmaTextEnum) {
        return mergeFrom((com.google.ads.googleads.v20.enums.VanityPharmaTextEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v20.enums.VanityPharmaTextEnum other) {
      if (other == com.google.ads.googleads.v20.enums.VanityPharmaTextEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v20.enums.VanityPharmaTextEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v20.enums.VanityPharmaTextEnum)
  private static final com.google.ads.googleads.v20.enums.VanityPharmaTextEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v20.enums.VanityPharmaTextEnum();
  }

  public static com.google.ads.googleads.v20.enums.VanityPharmaTextEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VanityPharmaTextEnum>
      PARSER = new com.google.protobuf.AbstractParser<VanityPharmaTextEnum>() {
    @java.lang.Override
    public VanityPharmaTextEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<VanityPharmaTextEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VanityPharmaTextEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v20.enums.VanityPharmaTextEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


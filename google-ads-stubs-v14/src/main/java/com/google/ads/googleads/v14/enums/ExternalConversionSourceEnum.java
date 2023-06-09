// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/enums/external_conversion_source.proto

package com.google.ads.googleads.v14.enums;

/**
 * <pre>
 * Container for enum describing the external conversion source that is
 * associated with a ConversionAction.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v14.enums.ExternalConversionSourceEnum}
 */
public final class ExternalConversionSourceEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v14.enums.ExternalConversionSourceEnum)
    ExternalConversionSourceEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExternalConversionSourceEnum.newBuilder() to construct.
  private ExternalConversionSourceEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExternalConversionSourceEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExternalConversionSourceEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v14.enums.ExternalConversionSourceProto.internal_static_google_ads_googleads_v14_enums_ExternalConversionSourceEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v14.enums.ExternalConversionSourceProto.internal_static_google_ads_googleads_v14_enums_ExternalConversionSourceEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum.class, com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum.Builder.class);
  }

  /**
   * <pre>
   * The external conversion source that is associated with a ConversionAction.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v14.enums.ExternalConversionSourceEnum.ExternalConversionSource}
   */
  public enum ExternalConversionSource
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
     * Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Conversion that occurs when a user navigates to a particular webpage
     * after viewing an ad; Displayed in Google Ads UI as 'Website'.
     * </pre>
     *
     * <code>WEBPAGE = 2;</code>
     */
    WEBPAGE(2),
    /**
     * <pre>
     * Conversion that comes from linked Google Analytics goal or transaction;
     * Displayed in Google Ads UI as 'Analytics'.
     * </pre>
     *
     * <code>ANALYTICS = 3;</code>
     */
    ANALYTICS(3),
    /**
     * <pre>
     * Website conversion that is uploaded through ConversionUploadService;
     * Displayed in Google Ads UI as 'Import from clicks'.
     * </pre>
     *
     * <code>UPLOAD = 4;</code>
     */
    UPLOAD(4),
    /**
     * <pre>
     * Conversion that occurs when a user clicks on a call extension directly on
     * an ad; Displayed in Google Ads UI as 'Calls from ads'.
     * </pre>
     *
     * <code>AD_CALL_METRICS = 5;</code>
     */
    AD_CALL_METRICS(5),
    /**
     * <pre>
     * Conversion that occurs when a user calls a dynamically-generated phone
     * number (by installed javascript) from an advertiser's website after
     * clicking on an ad; Displayed in Google Ads UI as 'Calls from website'.
     * </pre>
     *
     * <code>WEBSITE_CALL_METRICS = 6;</code>
     */
    WEBSITE_CALL_METRICS(6),
    /**
     * <pre>
     * Conversion that occurs when a user visits an advertiser's retail store
     * after clicking on a Google ad;
     * Displayed in Google Ads UI as 'Store visits'.
     * </pre>
     *
     * <code>STORE_VISITS = 7;</code>
     */
    STORE_VISITS(7),
    /**
     * <pre>
     * Conversion that occurs when a user takes an in-app action such as a
     * purchase in an Android app;
     * Displayed in Google Ads UI as 'Android in-app action'.
     * </pre>
     *
     * <code>ANDROID_IN_APP = 8;</code>
     */
    ANDROID_IN_APP(8),
    /**
     * <pre>
     * Conversion that occurs when a user takes an in-app action such as a
     * purchase in an iOS app;
     * Displayed in Google Ads UI as 'iOS in-app action'.
     * </pre>
     *
     * <code>IOS_IN_APP = 9;</code>
     */
    IOS_IN_APP(9),
    /**
     * <pre>
     * Conversion that occurs when a user opens an iOS app for the first time;
     * Displayed in Google Ads UI as 'iOS app install (first open)'.
     * </pre>
     *
     * <code>IOS_FIRST_OPEN = 10;</code>
     */
    IOS_FIRST_OPEN(10),
    /**
     * <pre>
     * Legacy app conversions that do not have an AppPlatform provided;
     * Displayed in Google Ads UI as 'Mobile app'.
     * </pre>
     *
     * <code>APP_UNSPECIFIED = 11;</code>
     */
    APP_UNSPECIFIED(11),
    /**
     * <pre>
     * Conversion that occurs when a user opens an Android app for the first
     * time; Displayed in Google Ads UI as 'Android app install (first open)'.
     * </pre>
     *
     * <code>ANDROID_FIRST_OPEN = 12;</code>
     */
    ANDROID_FIRST_OPEN(12),
    /**
     * <pre>
     * Call conversion that is uploaded through ConversionUploadService;
     * Displayed in Google Ads UI as 'Import from calls'.
     * </pre>
     *
     * <code>UPLOAD_CALLS = 13;</code>
     */
    UPLOAD_CALLS(13),
    /**
     * <pre>
     * Conversion that comes from a linked Firebase event;
     * Displayed in Google Ads UI as 'Firebase'.
     * </pre>
     *
     * <code>FIREBASE = 14;</code>
     */
    FIREBASE(14),
    /**
     * <pre>
     * Conversion that occurs when a user clicks on a mobile phone number;
     * Displayed in Google Ads UI as 'Phone number clicks'.
     * </pre>
     *
     * <code>CLICK_TO_CALL = 15;</code>
     */
    CLICK_TO_CALL(15),
    /**
     * <pre>
     * Conversion that comes from Salesforce;
     * Displayed in Google Ads UI as 'Salesforce.com'.
     * </pre>
     *
     * <code>SALESFORCE = 16;</code>
     */
    SALESFORCE(16),
    /**
     * <pre>
     * Conversion that comes from in-store purchases recorded by CRM;
     * Displayed in Google Ads UI as 'Store sales (data partner)'.
     * </pre>
     *
     * <code>STORE_SALES_CRM = 17;</code>
     */
    STORE_SALES_CRM(17),
    /**
     * <pre>
     * Conversion that comes from in-store purchases from payment network;
     * Displayed in Google Ads UI as 'Store sales (payment network)'.
     * </pre>
     *
     * <code>STORE_SALES_PAYMENT_NETWORK = 18;</code>
     */
    STORE_SALES_PAYMENT_NETWORK(18),
    /**
     * <pre>
     * Codeless Google Play conversion;
     * Displayed in Google Ads UI as 'Google Play'.
     * </pre>
     *
     * <code>GOOGLE_PLAY = 19;</code>
     */
    GOOGLE_PLAY(19),
    /**
     * <pre>
     * Conversion that comes from a linked third-party app analytics event;
     * Displayed in Google Ads UI as 'Third-party app analytics'.
     * </pre>
     *
     * <code>THIRD_PARTY_APP_ANALYTICS = 20;</code>
     */
    THIRD_PARTY_APP_ANALYTICS(20),
    /**
     * <pre>
     * Conversion that is controlled by Google Attribution.
     * </pre>
     *
     * <code>GOOGLE_ATTRIBUTION = 21;</code>
     */
    GOOGLE_ATTRIBUTION(21),
    /**
     * <pre>
     * Store Sales conversion based on first-party or third-party merchant data
     * uploads. Displayed in Google Ads UI as 'Store sales (direct upload)'.
     * </pre>
     *
     * <code>STORE_SALES_DIRECT_UPLOAD = 23;</code>
     */
    STORE_SALES_DIRECT_UPLOAD(23),
    /**
     * <pre>
     * Store Sales conversion based on first-party or third-party merchant
     * data uploads and/or from in-store purchases using cards from payment
     * networks. Displayed in Google Ads UI as 'Store sales'.
     * </pre>
     *
     * <code>STORE_SALES = 24;</code>
     */
    STORE_SALES(24),
    /**
     * <pre>
     * Conversions imported from Search Ads 360 Floodlight data.
     * </pre>
     *
     * <code>SEARCH_ADS_360 = 25;</code>
     */
    SEARCH_ADS_360(25),
    /**
     * <pre>
     * Conversions that track local actions from Google's products and services
     * after interacting with an ad.
     * </pre>
     *
     * <code>GOOGLE_HOSTED = 27;</code>
     */
    GOOGLE_HOSTED(27),
    /**
     * <pre>
     * Conversions reported by Floodlight tags.
     * </pre>
     *
     * <code>FLOODLIGHT = 29;</code>
     */
    FLOODLIGHT(29),
    /**
     * <pre>
     * Conversions that come from Google Analytics specifically for Search Ads
     * 360. Displayed in Google Ads UI as Analytics (SA360).
     * </pre>
     *
     * <code>ANALYTICS_SEARCH_ADS_360 = 31;</code>
     */
    ANALYTICS_SEARCH_ADS_360(31),
    /**
     * <pre>
     * Conversion that comes from a linked Firebase event for Search Ads 360.
     * </pre>
     *
     * <code>FIREBASE_SEARCH_ADS_360 = 33;</code>
     */
    FIREBASE_SEARCH_ADS_360(33),
    /**
     * <pre>
     * Conversion that is reported by Floodlight for DV360.
     * </pre>
     *
     * <code>DISPLAY_AND_VIDEO_360_FLOODLIGHT = 34;</code>
     */
    DISPLAY_AND_VIDEO_360_FLOODLIGHT(34),
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
     * Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Conversion that occurs when a user navigates to a particular webpage
     * after viewing an ad; Displayed in Google Ads UI as 'Website'.
     * </pre>
     *
     * <code>WEBPAGE = 2;</code>
     */
    public static final int WEBPAGE_VALUE = 2;
    /**
     * <pre>
     * Conversion that comes from linked Google Analytics goal or transaction;
     * Displayed in Google Ads UI as 'Analytics'.
     * </pre>
     *
     * <code>ANALYTICS = 3;</code>
     */
    public static final int ANALYTICS_VALUE = 3;
    /**
     * <pre>
     * Website conversion that is uploaded through ConversionUploadService;
     * Displayed in Google Ads UI as 'Import from clicks'.
     * </pre>
     *
     * <code>UPLOAD = 4;</code>
     */
    public static final int UPLOAD_VALUE = 4;
    /**
     * <pre>
     * Conversion that occurs when a user clicks on a call extension directly on
     * an ad; Displayed in Google Ads UI as 'Calls from ads'.
     * </pre>
     *
     * <code>AD_CALL_METRICS = 5;</code>
     */
    public static final int AD_CALL_METRICS_VALUE = 5;
    /**
     * <pre>
     * Conversion that occurs when a user calls a dynamically-generated phone
     * number (by installed javascript) from an advertiser's website after
     * clicking on an ad; Displayed in Google Ads UI as 'Calls from website'.
     * </pre>
     *
     * <code>WEBSITE_CALL_METRICS = 6;</code>
     */
    public static final int WEBSITE_CALL_METRICS_VALUE = 6;
    /**
     * <pre>
     * Conversion that occurs when a user visits an advertiser's retail store
     * after clicking on a Google ad;
     * Displayed in Google Ads UI as 'Store visits'.
     * </pre>
     *
     * <code>STORE_VISITS = 7;</code>
     */
    public static final int STORE_VISITS_VALUE = 7;
    /**
     * <pre>
     * Conversion that occurs when a user takes an in-app action such as a
     * purchase in an Android app;
     * Displayed in Google Ads UI as 'Android in-app action'.
     * </pre>
     *
     * <code>ANDROID_IN_APP = 8;</code>
     */
    public static final int ANDROID_IN_APP_VALUE = 8;
    /**
     * <pre>
     * Conversion that occurs when a user takes an in-app action such as a
     * purchase in an iOS app;
     * Displayed in Google Ads UI as 'iOS in-app action'.
     * </pre>
     *
     * <code>IOS_IN_APP = 9;</code>
     */
    public static final int IOS_IN_APP_VALUE = 9;
    /**
     * <pre>
     * Conversion that occurs when a user opens an iOS app for the first time;
     * Displayed in Google Ads UI as 'iOS app install (first open)'.
     * </pre>
     *
     * <code>IOS_FIRST_OPEN = 10;</code>
     */
    public static final int IOS_FIRST_OPEN_VALUE = 10;
    /**
     * <pre>
     * Legacy app conversions that do not have an AppPlatform provided;
     * Displayed in Google Ads UI as 'Mobile app'.
     * </pre>
     *
     * <code>APP_UNSPECIFIED = 11;</code>
     */
    public static final int APP_UNSPECIFIED_VALUE = 11;
    /**
     * <pre>
     * Conversion that occurs when a user opens an Android app for the first
     * time; Displayed in Google Ads UI as 'Android app install (first open)'.
     * </pre>
     *
     * <code>ANDROID_FIRST_OPEN = 12;</code>
     */
    public static final int ANDROID_FIRST_OPEN_VALUE = 12;
    /**
     * <pre>
     * Call conversion that is uploaded through ConversionUploadService;
     * Displayed in Google Ads UI as 'Import from calls'.
     * </pre>
     *
     * <code>UPLOAD_CALLS = 13;</code>
     */
    public static final int UPLOAD_CALLS_VALUE = 13;
    /**
     * <pre>
     * Conversion that comes from a linked Firebase event;
     * Displayed in Google Ads UI as 'Firebase'.
     * </pre>
     *
     * <code>FIREBASE = 14;</code>
     */
    public static final int FIREBASE_VALUE = 14;
    /**
     * <pre>
     * Conversion that occurs when a user clicks on a mobile phone number;
     * Displayed in Google Ads UI as 'Phone number clicks'.
     * </pre>
     *
     * <code>CLICK_TO_CALL = 15;</code>
     */
    public static final int CLICK_TO_CALL_VALUE = 15;
    /**
     * <pre>
     * Conversion that comes from Salesforce;
     * Displayed in Google Ads UI as 'Salesforce.com'.
     * </pre>
     *
     * <code>SALESFORCE = 16;</code>
     */
    public static final int SALESFORCE_VALUE = 16;
    /**
     * <pre>
     * Conversion that comes from in-store purchases recorded by CRM;
     * Displayed in Google Ads UI as 'Store sales (data partner)'.
     * </pre>
     *
     * <code>STORE_SALES_CRM = 17;</code>
     */
    public static final int STORE_SALES_CRM_VALUE = 17;
    /**
     * <pre>
     * Conversion that comes from in-store purchases from payment network;
     * Displayed in Google Ads UI as 'Store sales (payment network)'.
     * </pre>
     *
     * <code>STORE_SALES_PAYMENT_NETWORK = 18;</code>
     */
    public static final int STORE_SALES_PAYMENT_NETWORK_VALUE = 18;
    /**
     * <pre>
     * Codeless Google Play conversion;
     * Displayed in Google Ads UI as 'Google Play'.
     * </pre>
     *
     * <code>GOOGLE_PLAY = 19;</code>
     */
    public static final int GOOGLE_PLAY_VALUE = 19;
    /**
     * <pre>
     * Conversion that comes from a linked third-party app analytics event;
     * Displayed in Google Ads UI as 'Third-party app analytics'.
     * </pre>
     *
     * <code>THIRD_PARTY_APP_ANALYTICS = 20;</code>
     */
    public static final int THIRD_PARTY_APP_ANALYTICS_VALUE = 20;
    /**
     * <pre>
     * Conversion that is controlled by Google Attribution.
     * </pre>
     *
     * <code>GOOGLE_ATTRIBUTION = 21;</code>
     */
    public static final int GOOGLE_ATTRIBUTION_VALUE = 21;
    /**
     * <pre>
     * Store Sales conversion based on first-party or third-party merchant data
     * uploads. Displayed in Google Ads UI as 'Store sales (direct upload)'.
     * </pre>
     *
     * <code>STORE_SALES_DIRECT_UPLOAD = 23;</code>
     */
    public static final int STORE_SALES_DIRECT_UPLOAD_VALUE = 23;
    /**
     * <pre>
     * Store Sales conversion based on first-party or third-party merchant
     * data uploads and/or from in-store purchases using cards from payment
     * networks. Displayed in Google Ads UI as 'Store sales'.
     * </pre>
     *
     * <code>STORE_SALES = 24;</code>
     */
    public static final int STORE_SALES_VALUE = 24;
    /**
     * <pre>
     * Conversions imported from Search Ads 360 Floodlight data.
     * </pre>
     *
     * <code>SEARCH_ADS_360 = 25;</code>
     */
    public static final int SEARCH_ADS_360_VALUE = 25;
    /**
     * <pre>
     * Conversions that track local actions from Google's products and services
     * after interacting with an ad.
     * </pre>
     *
     * <code>GOOGLE_HOSTED = 27;</code>
     */
    public static final int GOOGLE_HOSTED_VALUE = 27;
    /**
     * <pre>
     * Conversions reported by Floodlight tags.
     * </pre>
     *
     * <code>FLOODLIGHT = 29;</code>
     */
    public static final int FLOODLIGHT_VALUE = 29;
    /**
     * <pre>
     * Conversions that come from Google Analytics specifically for Search Ads
     * 360. Displayed in Google Ads UI as Analytics (SA360).
     * </pre>
     *
     * <code>ANALYTICS_SEARCH_ADS_360 = 31;</code>
     */
    public static final int ANALYTICS_SEARCH_ADS_360_VALUE = 31;
    /**
     * <pre>
     * Conversion that comes from a linked Firebase event for Search Ads 360.
     * </pre>
     *
     * <code>FIREBASE_SEARCH_ADS_360 = 33;</code>
     */
    public static final int FIREBASE_SEARCH_ADS_360_VALUE = 33;
    /**
     * <pre>
     * Conversion that is reported by Floodlight for DV360.
     * </pre>
     *
     * <code>DISPLAY_AND_VIDEO_360_FLOODLIGHT = 34;</code>
     */
    public static final int DISPLAY_AND_VIDEO_360_FLOODLIGHT_VALUE = 34;


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
    public static ExternalConversionSource valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ExternalConversionSource forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return WEBPAGE;
        case 3: return ANALYTICS;
        case 4: return UPLOAD;
        case 5: return AD_CALL_METRICS;
        case 6: return WEBSITE_CALL_METRICS;
        case 7: return STORE_VISITS;
        case 8: return ANDROID_IN_APP;
        case 9: return IOS_IN_APP;
        case 10: return IOS_FIRST_OPEN;
        case 11: return APP_UNSPECIFIED;
        case 12: return ANDROID_FIRST_OPEN;
        case 13: return UPLOAD_CALLS;
        case 14: return FIREBASE;
        case 15: return CLICK_TO_CALL;
        case 16: return SALESFORCE;
        case 17: return STORE_SALES_CRM;
        case 18: return STORE_SALES_PAYMENT_NETWORK;
        case 19: return GOOGLE_PLAY;
        case 20: return THIRD_PARTY_APP_ANALYTICS;
        case 21: return GOOGLE_ATTRIBUTION;
        case 23: return STORE_SALES_DIRECT_UPLOAD;
        case 24: return STORE_SALES;
        case 25: return SEARCH_ADS_360;
        case 27: return GOOGLE_HOSTED;
        case 29: return FLOODLIGHT;
        case 31: return ANALYTICS_SEARCH_ADS_360;
        case 33: return FIREBASE_SEARCH_ADS_360;
        case 34: return DISPLAY_AND_VIDEO_360_FLOODLIGHT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ExternalConversionSource>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ExternalConversionSource> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ExternalConversionSource>() {
            public ExternalConversionSource findValueByNumber(int number) {
              return ExternalConversionSource.forNumber(number);
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
      return com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final ExternalConversionSource[] VALUES = values();

    public static ExternalConversionSource valueOf(
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

    private ExternalConversionSource(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v14.enums.ExternalConversionSourceEnum.ExternalConversionSource)
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
    if (!(obj instanceof com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum other = (com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum) obj;

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

  public static com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum prototype) {
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
   * Container for enum describing the external conversion source that is
   * associated with a ConversionAction.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v14.enums.ExternalConversionSourceEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v14.enums.ExternalConversionSourceEnum)
      com.google.ads.googleads.v14.enums.ExternalConversionSourceEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v14.enums.ExternalConversionSourceProto.internal_static_google_ads_googleads_v14_enums_ExternalConversionSourceEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v14.enums.ExternalConversionSourceProto.internal_static_google_ads_googleads_v14_enums_ExternalConversionSourceEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum.class, com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum.newBuilder()
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
      return com.google.ads.googleads.v14.enums.ExternalConversionSourceProto.internal_static_google_ads_googleads_v14_enums_ExternalConversionSourceEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum build() {
      com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum buildPartial() {
      com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum result = new com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum(this);
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
      if (other instanceof com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum) {
        return mergeFrom((com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum other) {
      if (other == com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v14.enums.ExternalConversionSourceEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v14.enums.ExternalConversionSourceEnum)
  private static final com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum();
  }

  public static com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExternalConversionSourceEnum>
      PARSER = new com.google.protobuf.AbstractParser<ExternalConversionSourceEnum>() {
    @java.lang.Override
    public ExternalConversionSourceEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExternalConversionSourceEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExternalConversionSourceEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v14.enums.ExternalConversionSourceEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


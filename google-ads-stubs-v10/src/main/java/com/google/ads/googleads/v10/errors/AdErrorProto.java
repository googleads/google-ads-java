// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/errors/ad_error.proto

package com.google.ads.googleads.v10.errors;

public final class AdErrorProto {
  private AdErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_errors_AdErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_errors_AdErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/ads/googleads/v10/errors/ad_err" +
      "or.proto\022\037google.ads.googleads.v10.error" +
      "s\"\316(\n\013AdErrorEnum\"\276(\n\007AdError\022\017\n\013UNSPECI" +
      "FIED\020\000\022\013\n\007UNKNOWN\020\001\022,\n(AD_CUSTOMIZERS_NO" +
      "T_SUPPORTED_FOR_AD_TYPE\020\002\022\032\n\026APPROXIMATE" +
      "LY_TOO_LONG\020\003\022\033\n\027APPROXIMATELY_TOO_SHORT" +
      "\020\004\022\017\n\013BAD_SNIPPET\020\005\022\024\n\020CANNOT_MODIFY_AD\020" +
      "\006\022\'\n#CANNOT_SET_BUSINESS_NAME_IF_URL_SET" +
      "\020\007\022\024\n\020CANNOT_SET_FIELD\020\010\022*\n&CANNOT_SET_F" +
      "IELD_WITH_ORIGIN_AD_ID_SET\020\t\022/\n+CANNOT_S" +
      "ET_FIELD_WITH_AD_ID_SET_FOR_SHARING\020\n\022)\n" +
      "%CANNOT_SET_ALLOW_FLEXIBLE_COLOR_FALSE\020\013" +
      "\0227\n3CANNOT_SET_COLOR_CONTROL_WHEN_NATIVE" +
      "_FORMAT_SETTING\020\014\022\022\n\016CANNOT_SET_URL\020\r\022!\n" +
      "\035CANNOT_SET_WITHOUT_FINAL_URLS\020\016\022\036\n\032CANN" +
      "OT_SET_WITH_FINAL_URLS\020\017\022\034\n\030CANNOT_SET_W" +
      "ITH_URL_DATA\020\021\022\'\n#CANNOT_USE_AD_SUBCLASS" +
      "_FOR_OPERATOR\020\022\022#\n\037CUSTOMER_NOT_APPROVED" +
      "_MOBILEADS\020\023\022(\n$CUSTOMER_NOT_APPROVED_TH" +
      "IRDPARTY_ADS\020\024\0221\n-CUSTOMER_NOT_APPROVED_" +
      "THIRDPARTY_REDIRECT_ADS\020\025\022\031\n\025CUSTOMER_NO" +
      "T_ELIGIBLE\020\026\0221\n-CUSTOMER_NOT_ELIGIBLE_FO" +
      "R_UPDATING_BEACON_URL\020\027\022\036\n\032DIMENSION_ALR" +
      "EADY_IN_UNION\020\030\022\031\n\025DIMENSION_MUST_BE_SET" +
      "\020\031\022\032\n\026DIMENSION_NOT_IN_UNION\020\032\022#\n\037DISPLA" +
      "Y_URL_CANNOT_BE_SPECIFIED\020\033\022 \n\034DOMESTIC_" +
      "PHONE_NUMBER_FORMAT\020\034\022\032\n\026EMERGENCY_PHONE" +
      "_NUMBER\020\035\022\017\n\013EMPTY_FIELD\020\036\0220\n,FEED_ATTRI" +
      "BUTE_MUST_HAVE_MAPPING_FOR_TYPE_ID\020\037\022(\n$" +
      "FEED_ATTRIBUTE_MAPPING_TYPE_MISMATCH\020 \022!" +
      "\n\035ILLEGAL_AD_CUSTOMIZER_TAG_USE\020!\022\023\n\017ILL" +
      "EGAL_TAG_USE\020\"\022\033\n\027INCONSISTENT_DIMENSION" +
      "S\020#\022)\n%INCONSISTENT_STATUS_IN_TEMPLATE_U" +
      "NION\020$\022\024\n\020INCORRECT_LENGTH\020%\022\032\n\026INELIGIB" +
      "LE_FOR_UPGRADE\020&\022&\n\"INVALID_AD_ADDRESS_C" +
      "AMPAIGN_TARGET\020\'\022\023\n\017INVALID_AD_TYPE\020(\022\'\n" +
      "#INVALID_ATTRIBUTES_FOR_MOBILE_IMAGE\020)\022&" +
      "\n\"INVALID_ATTRIBUTES_FOR_MOBILE_TEXT\020*\022\037" +
      "\n\033INVALID_CALL_TO_ACTION_TEXT\020+\022\035\n\031INVAL" +
      "ID_CHARACTER_FOR_URL\020,\022\030\n\024INVALID_COUNTR" +
      "Y_CODE\020-\022*\n&INVALID_EXPANDED_DYNAMIC_SEA" +
      "RCH_AD_TAG\020/\022\021\n\rINVALID_INPUT\0200\022\033\n\027INVAL" +
      "ID_MARKUP_LANGUAGE\0201\022\032\n\026INVALID_MOBILE_C" +
      "ARRIER\0202\022!\n\035INVALID_MOBILE_CARRIER_TARGE" +
      "T\0203\022\036\n\032INVALID_NUMBER_OF_ELEMENTS\0204\022\037\n\033I" +
      "NVALID_PHONE_NUMBER_FORMAT\0205\0221\n-INVALID_" +
      "RICH_MEDIA_CERTIFIED_VENDOR_FORMAT_ID\0206\022" +
      "\031\n\025INVALID_TEMPLATE_DATA\0207\022\'\n#INVALID_TE" +
      "MPLATE_ELEMENT_FIELD_TYPE\0208\022\027\n\023INVALID_T" +
      "EMPLATE_ID\0209\022\021\n\rLINE_TOO_WIDE\020:\022!\n\035MISSI" +
      "NG_AD_CUSTOMIZER_MAPPING\020;\022\035\n\031MISSING_AD" +
      "DRESS_COMPONENT\020<\022\036\n\032MISSING_ADVERTISEME" +
      "NT_NAME\020=\022\031\n\025MISSING_BUSINESS_NAME\020>\022\030\n\024" +
      "MISSING_DESCRIPTION1\020?\022\030\n\024MISSING_DESCRI" +
      "PTION2\020@\022\037\n\033MISSING_DESTINATION_URL_TAG\020" +
      "A\022 \n\034MISSING_LANDING_PAGE_URL_TAG\020B\022\025\n\021M" +
      "ISSING_DIMENSION\020C\022\027\n\023MISSING_DISPLAY_UR" +
      "L\020D\022\024\n\020MISSING_HEADLINE\020E\022\022\n\016MISSING_HEI" +
      "GHT\020F\022\021\n\rMISSING_IMAGE\020G\022-\n)MISSING_MARK" +
      "ETING_IMAGE_OR_PRODUCT_VIDEOS\020H\022\034\n\030MISSI" +
      "NG_MARKUP_LANGUAGES\020I\022\032\n\026MISSING_MOBILE_" +
      "CARRIER\020J\022\021\n\rMISSING_PHONE\020K\022$\n MISSING_" +
      "REQUIRED_TEMPLATE_FIELDS\020L\022 \n\034MISSING_TE" +
      "MPLATE_FIELD_VALUE\020M\022\020\n\014MISSING_TEXT\020N\022\027" +
      "\n\023MISSING_VISIBLE_URL\020O\022\021\n\rMISSING_WIDTH" +
      "\020P\022\'\n#MULTIPLE_DISTINCT_FEEDS_UNSUPPORTE" +
      "D\020Q\022$\n MUST_USE_TEMP_AD_UNION_ID_ON_ADD\020" +
      "R\022\014\n\010TOO_LONG\020S\022\r\n\tTOO_SHORT\020T\022\"\n\036UNION_" +
      "DIMENSIONS_CANNOT_CHANGE\020U\022\035\n\031UNKNOWN_AD" +
      "DRESS_COMPONENT\020V\022\026\n\022UNKNOWN_FIELD_NAME\020" +
      "W\022\027\n\023UNKNOWN_UNIQUE_NAME\020X\022\032\n\026UNSUPPORTE" +
      "D_DIMENSIONS\020Y\022\026\n\022URL_INVALID_SCHEME\020Z\022 " +
      "\n\034URL_INVALID_TOP_LEVEL_DOMAIN\020[\022\021\n\rURL_" +
      "MALFORMED\020\\\022\017\n\013URL_NO_HOST\020]\022\026\n\022URL_NOT_" +
      "EQUIVALENT\020^\022\032\n\026URL_HOST_NAME_TOO_LONG\020_" +
      "\022\021\n\rURL_NO_SCHEME\020`\022\033\n\027URL_NO_TOP_LEVEL_" +
      "DOMAIN\020a\022\030\n\024URL_PATH_NOT_ALLOWED\020b\022\030\n\024UR" +
      "L_PORT_NOT_ALLOWED\020c\022\031\n\025URL_QUERY_NOT_AL" +
      "LOWED\020d\0224\n0URL_SCHEME_BEFORE_EXPANDED_DY" +
      "NAMIC_SEARCH_AD_TAG\020f\022)\n%USER_DOES_NOT_H" +
      "AVE_ACCESS_TO_TEMPLATE\020g\022$\n INCONSISTENT" +
      "_EXPANDABLE_SETTINGS\020h\022\022\n\016INVALID_FORMAT" +
      "\020i\022\026\n\022INVALID_FIELD_TEXT\020j\022\027\n\023ELEMENT_NO" +
      "T_PRESENT\020k\022\017\n\013IMAGE_ERROR\020l\022\026\n\022VALUE_NO" +
      "T_IN_RANGE\020m\022\025\n\021FIELD_NOT_PRESENT\020n\022\030\n\024A" +
      "DDRESS_NOT_COMPLETE\020o\022\023\n\017ADDRESS_INVALID" +
      "\020p\022\031\n\025VIDEO_RETRIEVAL_ERROR\020q\022\017\n\013AUDIO_E" +
      "RROR\020r\022\037\n\033INVALID_YOUTUBE_DISPLAY_URL\020s\022" +
      "\033\n\027TOO_MANY_PRODUCT_IMAGES\020t\022\033\n\027TOO_MANY" +
      "_PRODUCT_VIDEOS\020u\022.\n*INCOMPATIBLE_AD_TYP" +
      "E_AND_DEVICE_PREFERENCE\020v\022*\n&CALLTRACKIN" +
      "G_NOT_SUPPORTED_FOR_COUNTRY\020w\022-\n)CARRIER" +
      "_SPECIFIC_SHORT_NUMBER_NOT_ALLOWED\020x\022\032\n\026" +
      "DISALLOWED_NUMBER_TYPE\020y\022*\n&PHONE_NUMBER" +
      "_NOT_SUPPORTED_FOR_COUNTRY\020z\022<\n8PHONE_NU" +
      "MBER_NOT_SUPPORTED_WITH_CALLTRACKING_FOR" +
      "_COUNTRY\020{\022#\n\037PREMIUM_RATE_NUMBER_NOT_AL" +
      "LOWED\020|\022#\n\037VANITY_PHONE_NUMBER_NOT_ALLOW" +
      "ED\020}\022#\n\037INVALID_CALL_CONVERSION_TYPE_ID\020" +
      "~\022=\n9CANNOT_DISABLE_CALL_CONVERSION_AND_" +
      "SET_CONVERSION_TYPE_ID\020\177\022#\n\036CANNOT_SET_P" +
      "ATH2_WITHOUT_PATH1\020\200\001\0223\n.MISSING_DYNAMIC" +
      "_SEARCH_ADS_SETTING_DOMAIN_NAME\020\201\001\022\'\n\"IN" +
      "COMPATIBLE_WITH_RESTRICTION_TYPE\020\202\001\0221\n,C" +
      "USTOMER_CONSENT_FOR_CALL_RECORDING_REQUI" +
      "RED\020\203\001\022\"\n\035MISSING_IMAGE_OR_MEDIA_BUNDLE\020" +
      "\204\001\0220\n+PRODUCT_TYPE_NOT_SUPPORTED_IN_THIS" +
      "_CAMPAIGN\020\205\001\0220\n+PLACEHOLDER_CANNOT_HAVE_" +
      "EMPTY_DEFAULT_VALUE\020\206\001\022=\n8PLACEHOLDER_CO" +
      "UNTDOWN_FUNCTION_CANNOT_HAVE_DEFAULT_VAL" +
      "UE\020\207\001\022&\n!PLACEHOLDER_DEFAULT_VALUE_MISSI" +
      "NG\020\210\001\022)\n$UNEXPECTED_PLACEHOLDER_DEFAULT_" +
      "VALUE\020\211\001\022\'\n\"AD_CUSTOMIZERS_MAY_NOT_BE_AD" +
      "JACENT\020\212\001\022,\n\'UPDATING_AD_WITH_NO_ENABLED" +
      "_ASSOCIATION\020\213\001\022A\n<CALL_AD_VERIFICATION_" +
      "URL_FINAL_URL_DOES_NOT_HAVE_SAME_DOMAIN\020" +
      "\214\001\022@\n;CALL_AD_FINAL_URL_AND_VERIFICATION" +
      "_URL_CANNOT_BOTH_BE_EMPTY\020\232\001\022\034\n\027TOO_MANY" +
      "_AD_CUSTOMIZERS\020\215\001\022!\n\034INVALID_AD_CUSTOMI" +
      "ZER_FORMAT\020\216\001\022 \n\033NESTED_AD_CUSTOMIZER_SY" +
      "NTAX\020\217\001\022%\n UNSUPPORTED_AD_CUSTOMIZER_SYN" +
      "TAX\020\220\001\022(\n#UNPAIRED_BRACE_IN_AD_CUSTOMIZE" +
      "R_TAG\020\221\001\022,\n\'MORE_THAN_ONE_COUNTDOWN_TAG_" +
      "TYPE_EXISTS\020\222\001\022*\n%DATE_TIME_IN_COUNTDOWN" +
      "_TAG_IS_INVALID\020\223\001\022\'\n\"DATE_TIME_IN_COUNT" +
      "DOWN_TAG_IS_PAST\020\224\001\022)\n$UNRECOGNIZED_AD_C" +
      "USTOMIZER_TAG_FOUND\020\225\001\022(\n#CUSTOMIZER_TYP" +
      "E_FORBIDDEN_FOR_FIELD\020\226\001\022&\n!INVALID_CUST" +
      "OMIZER_ATTRIBUTE_NAME\020\227\001\022\023\n\016STORE_MISMAT" +
      "CH\020\230\001\022(\n#MISSING_REQUIRED_IMAGE_ASPECT_R" +
      "ATIO\020\231\001\022\035\n\030MISMATCHED_ASPECT_RATIOS\020\233\001\022*" +
      "\n%DUPLICATE_IMAGE_ACROSS_CAROUSEL_CARDS\020" +
      "\234\001B\354\001\n#com.google.ads.googleads.v10.erro" +
      "rsB\014AdErrorProtoP\001ZEgoogle.golang.org/ge" +
      "nproto/googleapis/ads/googleads/v10/erro" +
      "rs;errors\242\002\003GAA\252\002\037Google.Ads.GoogleAds.V" +
      "10.Errors\312\002\037Google\\Ads\\GoogleAds\\V10\\Err" +
      "ors\352\002#Google::Ads::GoogleAds::V10::Error" +
      "sb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v10_errors_AdErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_errors_AdErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_errors_AdErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

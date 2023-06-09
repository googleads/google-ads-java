// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v14/errors/feed_item_validation_error.proto

package com.google.ads.googleads.v14.errors;

public final class FeedItemValidationErrorProto {
  private FeedItemValidationErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v14_errors_FeedItemValidationErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v14_errors_FeedItemValidationErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v14/errors/feed_i" +
      "tem_validation_error.proto\022\037google.ads.g" +
      "oogleads.v14.errors\"\356\033\n\033FeedItemValidati" +
      "onErrorEnum\"\316\033\n\027FeedItemValidationError\022" +
      "\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNOWN\020\001\022\024\n\020STRING_" +
      "TOO_SHORT\020\002\022\023\n\017STRING_TOO_LONG\020\003\022\027\n\023VALU" +
      "E_NOT_SPECIFIED\020\004\022(\n$INVALID_DOMESTIC_PH" +
      "ONE_NUMBER_FORMAT\020\005\022\030\n\024INVALID_PHONE_NUM" +
      "BER\020\006\022*\n&PHONE_NUMBER_NOT_SUPPORTED_FOR_" +
      "COUNTRY\020\007\022#\n\037PREMIUM_RATE_NUMBER_NOT_ALL" +
      "OWED\020\010\022\032\n\026DISALLOWED_NUMBER_TYPE\020\t\022\026\n\022VA" +
      "LUE_OUT_OF_RANGE\020\n\022*\n&CALLTRACKING_NOT_S" +
      "UPPORTED_FOR_COUNTRY\020\013\022.\n*CUSTOMER_NOT_I" +
      "N_ALLOWLIST_FOR_CALLTRACKING\020c\022\030\n\024INVALI" +
      "D_COUNTRY_CODE\020\r\022\022\n\016INVALID_APP_ID\020\016\022!\n\035" +
      "MISSING_ATTRIBUTES_FOR_FIELDS\020\017\022\023\n\017INVAL" +
      "ID_TYPE_ID\020\020\022\031\n\025INVALID_EMAIL_ADDRESS\020\021\022" +
      "\025\n\021INVALID_HTTPS_URL\020\022\022\034\n\030MISSING_DELIVE" +
      "RY_ADDRESS\020\023\022\035\n\031START_DATE_AFTER_END_DAT" +
      "E\020\024\022 \n\034MISSING_FEED_ITEM_START_TIME\020\025\022\036\n" +
      "\032MISSING_FEED_ITEM_END_TIME\020\026\022\030\n\024MISSING" +
      "_FEED_ITEM_ID\020\027\022#\n\037VANITY_PHONE_NUMBER_N" +
      "OT_ALLOWED\020\030\022$\n INVALID_REVIEW_EXTENSION" +
      "_SNIPPET\020\031\022\031\n\025INVALID_NUMBER_FORMAT\020\032\022\027\n" +
      "\023INVALID_DATE_FORMAT\020\033\022\030\n\024INVALID_PRICE_" +
      "FORMAT\020\034\022\035\n\031UNKNOWN_PLACEHOLDER_FIELD\020\035\022" +
      ".\n*MISSING_ENHANCED_SITELINK_DESCRIPTION" +
      "_LINE\020\036\022&\n\"REVIEW_EXTENSION_SOURCE_INELI" +
      "GIBLE\020\037\022\'\n#HYPHENS_IN_REVIEW_EXTENSION_S" +
      "NIPPET\020 \022-\n)DOUBLE_QUOTES_IN_REVIEW_EXTE" +
      "NSION_SNIPPET\020!\022&\n\"QUOTES_IN_REVIEW_EXTE" +
      "NSION_SNIPPET\020\"\022\037\n\033INVALID_FORM_ENCODED_" +
      "PARAMS\020#\022\036\n\032INVALID_URL_PARAMETER_NAME\020$" +
      "\022\027\n\023NO_GEOCODING_RESULT\020%\022(\n$SOURCE_NAME" +
      "_IN_REVIEW_EXTENSION_TEXT\020&\022-\n)CARRIER_S" +
      "PECIFIC_SHORT_NUMBER_NOT_ALLOWED\020\'\022 \n\034IN" +
      "VALID_PLACEHOLDER_FIELD_ID\020(\022\023\n\017INVALID_" +
      "URL_TAG\020)\022\021\n\rLIST_TOO_LONG\020*\022\"\n\036INVALID_" +
      "ATTRIBUTES_COMBINATION\020+\022\024\n\020DUPLICATE_VA" +
      "LUES\020,\022%\n!INVALID_CALL_CONVERSION_ACTION" +
      "_ID\020-\022!\n\035CANNOT_SET_WITHOUT_FINAL_URLS\020." +
      "\022$\n APP_ID_DOESNT_EXIST_IN_APP_STORE\020/\022\025" +
      "\n\021INVALID_FINAL_URL\0200\022\030\n\024INVALID_TRACKIN" +
      "G_URL\0201\022*\n&INVALID_FINAL_URL_FOR_APP_DOW" +
      "NLOAD_URL\0202\022\022\n\016LIST_TOO_SHORT\0203\022\027\n\023INVAL" +
      "ID_USER_ACTION\0204\022\025\n\021INVALID_TYPE_NAME\0205\022" +
      "\037\n\033INVALID_EVENT_CHANGE_STATUS\0206\022\033\n\027INVA" +
      "LID_SNIPPETS_HEADER\0207\022\034\n\030INVALID_ANDROID" +
      "_APP_LINK\0208\022;\n7NUMBER_TYPE_WITH_CALLTRAC" +
      "KING_NOT_SUPPORTED_FOR_COUNTRY\0209\022\032\n\026RESE" +
      "RVED_KEYWORD_OTHER\020:\022\033\n\027DUPLICATE_OPTION" +
      "_LABELS\020;\022\035\n\031DUPLICATE_OPTION_PREFILLS\020<" +
      "\022\030\n\024UNEQUAL_LIST_LENGTHS\020=\022\037\n\033INCONSISTE" +
      "NT_CURRENCY_CODES\020>\022*\n&PRICE_EXTENSION_H" +
      "AS_DUPLICATED_HEADERS\020?\022.\n*ITEM_HAS_DUPL" +
      "ICATED_HEADER_AND_DESCRIPTION\020@\022%\n!PRICE" +
      "_EXTENSION_HAS_TOO_FEW_ITEMS\020A\022\025\n\021UNSUPP" +
      "ORTED_VALUE\020B\022\034\n\030INVALID_FINAL_MOBILE_UR" +
      "L\020C\022%\n!INVALID_KEYWORDLESS_AD_RULE_LABEL" +
      "\020D\022\'\n#VALUE_TRACK_PARAMETER_NOT_SUPPORTE" +
      "D\020E\022*\n&UNSUPPORTED_VALUE_IN_SELECTED_LAN" +
      "GUAGE\020F\022\030\n\024INVALID_IOS_APP_LINK\020G\022,\n(MIS" +
      "SING_IOS_APP_LINK_OR_IOS_APP_STORE_ID\020H\022" +
      "\032\n\026PROMOTION_INVALID_TIME\020I\0229\n5PROMOTION" +
      "_CANNOT_SET_PERCENT_OFF_AND_MONEY_AMOUNT" +
      "_OFF\020J\022>\n:PROMOTION_CANNOT_SET_PROMOTION" +
      "_CODE_AND_ORDERS_OVER_AMOUNT\020K\022%\n!TOO_MA" +
      "NY_DECIMAL_PLACES_SPECIFIED\020L\022\036\n\032AD_CUST" +
      "OMIZERS_NOT_ALLOWED\020M\022\031\n\025INVALID_LANGUAG" +
      "E_CODE\020N\022\030\n\024UNSUPPORTED_LANGUAGE\020O\022\033\n\027IF" +
      "_FUNCTION_NOT_ALLOWED\020P\022\034\n\030INVALID_FINAL" +
      "_URL_SUFFIX\020Q\022#\n\037INVALID_TAG_IN_FINAL_UR" +
      "L_SUFFIX\020R\022#\n\037INVALID_FINAL_URL_SUFFIX_F" +
      "ORMAT\020S\0220\n,CUSTOMER_CONSENT_FOR_CALL_REC" +
      "ORDING_REQUIRED\020T\022\'\n#ONLY_ONE_DELIVERY_O" +
      "PTION_IS_ALLOWED\020U\022\035\n\031NO_DELIVERY_OPTION" +
      "_IS_SET\020V\022&\n\"INVALID_CONVERSION_REPORTIN" +
      "G_STATE\020W\022\024\n\020IMAGE_SIZE_WRONG\020X\022+\n\'EMAIL" +
      "_DELIVERY_NOT_AVAILABLE_IN_COUNTRY\020Y\022\'\n#" +
      "AUTO_REPLY_NOT_AVAILABLE_IN_COUNTRY\020Z\022\032\n" +
      "\026INVALID_LATITUDE_VALUE\020[\022\033\n\027INVALID_LON" +
      "GITUDE_VALUE\020\\\022\023\n\017TOO_MANY_LABELS\020]\022\025\n\021I" +
      "NVALID_IMAGE_URL\020^\022\032\n\026MISSING_LATITUDE_V" +
      "ALUE\020_\022\033\n\027MISSING_LONGITUDE_VALUE\020`\022\025\n\021A" +
      "DDRESS_NOT_FOUND\020a\022\032\n\026ADDRESS_NOT_TARGET" +
      "ABLE\020b\022\024\n\020INVALID_ASSET_ID\020d\022\033\n\027INCOMPAT" +
      "IBLE_ASSET_TYPE\020e\022\037\n\033IMAGE_ERROR_UNEXPEC" +
      "TED_SIZE\020f\022(\n$IMAGE_ERROR_ASPECT_RATIO_N" +
      "OT_ALLOWED\020g\022\036\n\032IMAGE_ERROR_FILE_TOO_LAR" +
      "GE\020h\022\"\n\036IMAGE_ERROR_FORMAT_NOT_ALLOWED\020i" +
      "\022$\n IMAGE_ERROR_CONSTRAINTS_VIOLATED\020j\022\034" +
      "\n\030IMAGE_ERROR_SERVER_ERROR\020kB\374\001\n#com.goo" +
      "gle.ads.googleads.v14.errorsB\034FeedItemVa" +
      "lidationErrorProtoP\001ZEgoogle.golang.org/" +
      "genproto/googleapis/ads/googleads/v14/er" +
      "rors;errors\242\002\003GAA\252\002\037Google.Ads.GoogleAds" +
      ".V14.Errors\312\002\037Google\\Ads\\GoogleAds\\V14\\E" +
      "rrors\352\002#Google::Ads::GoogleAds::V14::Err" +
      "orsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v14_errors_FeedItemValidationErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v14_errors_FeedItemValidationErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v14_errors_FeedItemValidationErrorEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

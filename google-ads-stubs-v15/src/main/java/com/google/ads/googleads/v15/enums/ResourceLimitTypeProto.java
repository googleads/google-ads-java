// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/enums/resource_limit_type.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v15.enums;

public final class ResourceLimitTypeProto {
  private ResourceLimitTypeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_enums_ResourceLimitTypeEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_enums_ResourceLimitTypeEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v15/enums/resourc" +
      "e_limit_type.proto\022\036google.ads.googleads" +
      ".v15.enums\"\352-\n\025ResourceLimitTypeEnum\"\320-\n" +
      "\021ResourceLimitType\022\017\n\013UNSPECIFIED\020\000\022\013\n\007U" +
      "NKNOWN\020\001\022\032\n\026CAMPAIGNS_PER_CUSTOMER\020\002\022\037\n\033" +
      "BASE_CAMPAIGNS_PER_CUSTOMER\020\003\022%\n!EXPERIM" +
      "ENT_CAMPAIGNS_PER_CUSTOMER\020i\022 \n\034HOTEL_CA" +
      "MPAIGNS_PER_CUSTOMER\020\004\022)\n%SMART_SHOPPING" +
      "_CAMPAIGNS_PER_CUSTOMER\020\005\022\032\n\026AD_GROUPS_P" +
      "ER_CAMPAIGN\020\006\022#\n\037AD_GROUPS_PER_SHOPPING_" +
      "CAMPAIGN\020\010\022 \n\034AD_GROUPS_PER_HOTEL_CAMPAI" +
      "GN\020\t\022*\n&REPORTING_AD_GROUPS_PER_LOCAL_CA" +
      "MPAIGN\020\n\022(\n$REPORTING_AD_GROUPS_PER_APP_" +
      "CAMPAIGN\020\013\022(\n$MANAGED_AD_GROUPS_PER_SMAR" +
      "T_CAMPAIGN\0204\022\"\n\036AD_GROUP_CRITERIA_PER_CU" +
      "STOMER\020\014\022\'\n#BASE_AD_GROUP_CRITERIA_PER_C" +
      "USTOMER\020\r\022-\n)EXPERIMENT_AD_GROUP_CRITERI" +
      "A_PER_CUSTOMER\020k\022\"\n\036AD_GROUP_CRITERIA_PE" +
      "R_CAMPAIGN\020\016\022\"\n\036CAMPAIGN_CRITERIA_PER_CU" +
      "STOMER\020\017\022\'\n#BASE_CAMPAIGN_CRITERIA_PER_C" +
      "USTOMER\020\020\022-\n)EXPERIMENT_CAMPAIGN_CRITERI" +
      "A_PER_CUSTOMER\020l\022!\n\035WEBPAGE_CRITERIA_PER" +
      "_CUSTOMER\020\021\022&\n\"BASE_WEBPAGE_CRITERIA_PER" +
      "_CUSTOMER\020\022\022,\n(EXPERIMENT_WEBPAGE_CRITER" +
      "IA_PER_CUSTOMER\020\023\022+\n\'COMBINED_AUDIENCE_C" +
      "RITERIA_PER_AD_GROUP\020\024\0225\n1CUSTOMER_NEGAT" +
      "IVE_PLACEMENT_CRITERIA_PER_CUSTOMER\020\025\022;\n" +
      "7CUSTOMER_NEGATIVE_YOUTUBE_CHANNEL_CRITE" +
      "RIA_PER_CUSTOMER\020\026\022\031\n\025CRITERIA_PER_AD_GR" +
      "OUP\020\027\022\037\n\033LISTING_GROUPS_PER_AD_GROUP\020\030\022*" +
      "\n&EXPLICITLY_SHARED_BUDGETS_PER_CUSTOMER" +
      "\020\031\022*\n&IMPLICITLY_SHARED_BUDGETS_PER_CUST" +
      "OMER\020\032\022+\n\'COMBINED_AUDIENCE_CRITERIA_PER" +
      "_CAMPAIGN\020\033\022\"\n\036NEGATIVE_KEYWORDS_PER_CAM" +
      "PAIGN\020\034\022$\n NEGATIVE_PLACEMENTS_PER_CAMPA" +
      "IGN\020\035\022\034\n\030GEO_TARGETS_PER_CAMPAIGN\020\036\022#\n\037N" +
      "EGATIVE_IP_BLOCKS_PER_CAMPAIGN\020 \022\034\n\030PROX" +
      "IMITIES_PER_CAMPAIGN\020!\022(\n$LISTING_SCOPES" +
      "_PER_SHOPPING_CAMPAIGN\020\"\022,\n(LISTING_SCOP" +
      "ES_PER_NON_SHOPPING_CAMPAIGN\020#\022$\n NEGATI" +
      "VE_KEYWORDS_PER_SHARED_SET\020$\022&\n\"NEGATIVE" +
      "_PLACEMENTS_PER_SHARED_SET\020%\022-\n)SHARED_S" +
      "ETS_PER_CUSTOMER_FOR_TYPE_DEFAULT\020(\022>\n:S" +
      "HARED_SETS_PER_CUSTOMER_FOR_NEGATIVE_PLA" +
      "CEMENT_LIST_LOWER\020)\022;\n7HOTEL_ADVANCE_BOO" +
      "KING_WINDOW_BID_MODIFIERS_PER_AD_GROUP\020," +
      "\022#\n\037BIDDING_STRATEGIES_PER_CUSTOMER\020-\022!\n" +
      "\035BASIC_USER_LISTS_PER_CUSTOMER\020/\022#\n\037LOGI" +
      "CAL_USER_LISTS_PER_CUSTOMER\0200\022\'\n\"RULE_BA" +
      "SED_USER_LISTS_PER_CUSTOMER\020\231\001\022\"\n\036BASE_A" +
      "D_GROUP_ADS_PER_CUSTOMER\0205\022(\n$EXPERIMENT" +
      "_AD_GROUP_ADS_PER_CUSTOMER\0206\022\035\n\031AD_GROUP" +
      "_ADS_PER_CAMPAIGN\0207\022#\n\037TEXT_AND_OTHER_AD" +
      "S_PER_AD_GROUP\0208\022\032\n\026IMAGE_ADS_PER_AD_GRO" +
      "UP\0209\022#\n\037SHOPPING_SMART_ADS_PER_AD_GROUP\020" +
      ":\022&\n\"RESPONSIVE_SEARCH_ADS_PER_AD_GROUP\020" +
      ";\022\030\n\024APP_ADS_PER_AD_GROUP\020<\022#\n\037APP_ENGAG" +
      "EMENT_ADS_PER_AD_GROUP\020=\022\032\n\026LOCAL_ADS_PE" +
      "R_AD_GROUP\020>\022\032\n\026VIDEO_ADS_PER_AD_GROUP\020?" +
      "\022+\n&LEAD_FORM_CAMPAIGN_ASSETS_PER_CAMPAI" +
      "GN\020\217\001\022*\n&PROMOTION_CUSTOMER_ASSETS_PER_C" +
      "USTOMER\020O\022*\n&PROMOTION_CAMPAIGN_ASSETS_P" +
      "ER_CAMPAIGN\020P\022*\n&PROMOTION_AD_GROUP_ASSE" +
      "TS_PER_AD_GROUP\020Q\022)\n$CALLOUT_CUSTOMER_AS" +
      "SETS_PER_CUSTOMER\020\206\001\022)\n$CALLOUT_CAMPAIGN" +
      "_ASSETS_PER_CAMPAIGN\020\207\001\022)\n$CALLOUT_AD_GR" +
      "OUP_ASSETS_PER_AD_GROUP\020\210\001\022*\n%SITELINK_C" +
      "USTOMER_ASSETS_PER_CUSTOMER\020\211\001\022*\n%SITELI" +
      "NK_CAMPAIGN_ASSETS_PER_CAMPAIGN\020\212\001\022*\n%SI" +
      "TELINK_AD_GROUP_ASSETS_PER_AD_GROUP\020\213\001\0224" +
      "\n/STRUCTURED_SNIPPET_CUSTOMER_ASSETS_PER" +
      "_CUSTOMER\020\214\001\0224\n/STRUCTURED_SNIPPET_CAMPA" +
      "IGN_ASSETS_PER_CAMPAIGN\020\215\001\0224\n/STRUCTURED" +
      "_SNIPPET_AD_GROUP_ASSETS_PER_AD_GROUP\020\216\001" +
      "\022,\n\'MOBILE_APP_CUSTOMER_ASSETS_PER_CUSTO" +
      "MER\020\220\001\022,\n\'MOBILE_APP_CAMPAIGN_ASSETS_PER" +
      "_CAMPAIGN\020\221\001\022,\n\'MOBILE_APP_AD_GROUP_ASSE" +
      "TS_PER_AD_GROUP\020\222\001\022/\n*HOTEL_CALLOUT_CUST" +
      "OMER_ASSETS_PER_CUSTOMER\020\223\001\022/\n*HOTEL_CAL" +
      "LOUT_CAMPAIGN_ASSETS_PER_CAMPAIGN\020\224\001\022/\n*" +
      "HOTEL_CALLOUT_AD_GROUP_ASSETS_PER_AD_GRO" +
      "UP\020\225\001\022&\n!CALL_CUSTOMER_ASSETS_PER_CUSTOM" +
      "ER\020\226\001\022&\n!CALL_CAMPAIGN_ASSETS_PER_CAMPAI" +
      "GN\020\227\001\022&\n!CALL_AD_GROUP_ASSETS_PER_AD_GRO" +
      "UP\020\230\001\022\'\n\"PRICE_CUSTOMER_ASSETS_PER_CUSTO" +
      "MER\020\232\001\022\'\n\"PRICE_CAMPAIGN_ASSETS_PER_CAMP" +
      "AIGN\020\233\001\022\'\n\"PRICE_AD_GROUP_ASSETS_PER_AD_" +
      "GROUP\020\234\001\022*\n%AD_IMAGE_CAMPAIGN_ASSETS_PER" +
      "_CAMPAIGN\020\257\001\022*\n%AD_IMAGE_AD_GROUP_ASSETS" +
      "_PER_AD_GROUP\020\260\001\022&\n!PAGE_FEED_ASSET_SETS" +
      "_PER_CUSTOMER\020\235\001\0223\n.DYNAMIC_EDUCATION_FE" +
      "ED_ASSET_SETS_PER_CUSTOMER\020\236\001\022#\n\036ASSETS_" +
      "PER_PAGE_FEED_ASSET_SET\020\237\001\0220\n+ASSETS_PER" +
      "_DYNAMIC_EDUCATION_FEED_ASSET_SET\020\240\001\0220\n+" +
      "DYNAMIC_REAL_ESTATE_ASSET_SETS_PER_CUSTO" +
      "MER\020\241\001\022-\n(ASSETS_PER_DYNAMIC_REAL_ESTATE" +
      "_ASSET_SET\020\242\001\022+\n&DYNAMIC_CUSTOM_ASSET_SE" +
      "TS_PER_CUSTOMER\020\243\001\022(\n#ASSETS_PER_DYNAMIC" +
      "_CUSTOM_ASSET_SET\020\244\001\0227\n2DYNAMIC_HOTELS_A" +
      "ND_RENTALS_ASSET_SETS_PER_CUSTOMER\020\245\001\0224\n" +
      "/ASSETS_PER_DYNAMIC_HOTELS_AND_RENTALS_A" +
      "SSET_SET\020\246\001\022*\n%DYNAMIC_LOCAL_ASSET_SETS_" +
      "PER_CUSTOMER\020\247\001\022\'\n\"ASSETS_PER_DYNAMIC_LO" +
      "CAL_ASSET_SET\020\250\001\022,\n\'DYNAMIC_FLIGHTS_ASSE" +
      "T_SETS_PER_CUSTOMER\020\251\001\022)\n$ASSETS_PER_DYN" +
      "AMIC_FLIGHTS_ASSET_SET\020\252\001\022+\n&DYNAMIC_TRA" +
      "VEL_ASSET_SETS_PER_CUSTOMER\020\253\001\022(\n#ASSETS" +
      "_PER_DYNAMIC_TRAVEL_ASSET_SET\020\254\001\022)\n$DYNA" +
      "MIC_JOBS_ASSET_SETS_PER_CUSTOMER\020\255\001\022&\n!A" +
      "SSETS_PER_DYNAMIC_JOBS_ASSET_SET\020\256\001\022/\n*B" +
      "USINESS_NAME_CAMPAIGN_ASSETS_PER_CAMPAIG" +
      "N\020\263\001\022/\n*BUSINESS_LOGO_CAMPAIGN_ASSETS_PE" +
      "R_CAMPAIGN\020\264\001\022\023\n\017VERSIONS_PER_AD\020R\022\033\n\027US" +
      "ER_FEEDS_PER_CUSTOMER\020Z\022\035\n\031SYSTEM_FEEDS_" +
      "PER_CUSTOMER\020[\022\034\n\030FEED_ATTRIBUTES_PER_FE" +
      "ED\020\\\022\033\n\027FEED_ITEMS_PER_CUSTOMER\020^\022\037\n\033CAM" +
      "PAIGN_FEEDS_PER_CUSTOMER\020_\022$\n BASE_CAMPA" +
      "IGN_FEEDS_PER_CUSTOMER\020`\022*\n&EXPERIMENT_C" +
      "AMPAIGN_FEEDS_PER_CUSTOMER\020m\022\037\n\033AD_GROUP" +
      "_FEEDS_PER_CUSTOMER\020a\022$\n BASE_AD_GROUP_F" +
      "EEDS_PER_CUSTOMER\020b\022*\n&EXPERIMENT_AD_GRO" +
      "UP_FEEDS_PER_CUSTOMER\020n\022\037\n\033AD_GROUP_FEED" +
      "S_PER_CAMPAIGN\020c\022\037\n\033FEED_ITEM_SETS_PER_C" +
      "USTOMER\020d\022 \n\034FEED_ITEMS_PER_FEED_ITEM_SE" +
      "T\020e\022%\n!CAMPAIGN_EXPERIMENTS_PER_CUSTOMER" +
      "\020p\022(\n$EXPERIMENT_ARMS_PER_VIDEO_EXPERIME" +
      "NT\020q\022\035\n\031OWNED_LABELS_PER_CUSTOMER\020s\022\027\n\023L" +
      "ABELS_PER_CAMPAIGN\020u\022\027\n\023LABELS_PER_AD_GR" +
      "OUP\020v\022\032\n\026LABELS_PER_AD_GROUP_AD\020w\022!\n\035LAB" +
      "ELS_PER_AD_GROUP_CRITERION\020x\022\036\n\032TARGET_C" +
      "USTOMERS_PER_LABEL\020y\022\'\n#KEYWORD_PLANS_PE" +
      "R_USER_PER_CUSTOMER\020z\0223\n/KEYWORD_PLAN_AD" +
      "_GROUP_KEYWORDS_PER_KEYWORD_PLAN\020{\022+\n\'KE" +
      "YWORD_PLAN_AD_GROUPS_PER_KEYWORD_PLAN\020|\022" +
      "3\n/KEYWORD_PLAN_NEGATIVE_KEYWORDS_PER_KE" +
      "YWORD_PLAN\020}\022+\n\'KEYWORD_PLAN_CAMPAIGNS_P" +
      "ER_KEYWORD_PLAN\020~\022$\n\037CONVERSION_ACTIONS_" +
      "PER_CUSTOMER\020\200\001\022!\n\034BATCH_JOB_OPERATIONS_" +
      "PER_JOB\020\202\001\022\034\n\027BATCH_JOBS_PER_CUSTOMER\020\203\001" +
      "\0229\n4HOTEL_CHECK_IN_DATE_RANGE_BID_MODIFI" +
      "ERS_PER_AD_GROUP\020\204\001\022@\n;SHARED_SETS_PER_A" +
      "CCOUNT_FOR_ACCOUNT_LEVEL_NEGATIVE_KEYWOR" +
      "DS\020\261\001\0223\n.ACCOUNT_LEVEL_NEGATIVE_KEYWORDS" +
      "_PER_SHARED_SET\020\262\001\022/\n*ENABLED_ASSET_PER_" +
      "HOTEL_PROPERTY_ASSET_SET\020\265\001\0227\n2ENABLED_H" +
      "OTEL_PROPERTY_ASSET_LINKS_PER_ASSET_GROU" +
      "P\020\266\001\022\032\n\025BRANDS_PER_SHARED_SET\020\267\001\022-\n(ENAB" +
      "LED_BRAND_LIST_CRITERIA_PER_CAMPAIGN\020\270\001\022" +
      "&\n!SHARED_SETS_PER_ACCOUNT_FOR_BRAND\020\271\001B" +
      "\360\001\n\"com.google.ads.googleads.v15.enumsB\026" +
      "ResourceLimitTypeProtoP\001ZCgoogle.golang." +
      "org/genproto/googleapis/ads/googleads/v1" +
      "5/enums;enums\242\002\003GAA\252\002\036Google.Ads.GoogleA" +
      "ds.V15.Enums\312\002\036Google\\Ads\\GoogleAds\\V15\\" +
      "Enums\352\002\"Google::Ads::GoogleAds::V15::Enu" +
      "msb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_google_ads_googleads_v15_enums_ResourceLimitTypeEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_enums_ResourceLimitTypeEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_enums_ResourceLimitTypeEnum_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

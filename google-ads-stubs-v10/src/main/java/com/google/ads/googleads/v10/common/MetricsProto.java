// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v10/common/metrics.proto

package com.google.ads.googleads.v10.common;

public final class MetricsProto {
  private MetricsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v10_common_Metrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v10_common_Metrics_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/ads/googleads/v10/common/metric" +
      "s.proto\022\037google.ads.googleads.v10.common" +
      "\032;google/ads/googleads/v10/enums/interac" +
      "tion_event_type.proto\0329google/ads/google" +
      "ads/v10/enums/quality_score_bucket.proto" +
      "\"\205G\n\007Metrics\0220\n\"absolute_top_impression_" +
      "percentage\030\267\001 \001(\001H\000\210\001\001\022\035\n\017active_view_cp" +
      "m\030\270\001 \001(\001H\001\210\001\001\022\035\n\017active_view_ctr\030\271\001 \001(\001H" +
      "\002\210\001\001\022%\n\027active_view_impressions\030\272\001 \001(\003H\003" +
      "\210\001\001\022\'\n\031active_view_measurability\030\273\001 \001(\001H" +
      "\004\210\001\001\0220\n\"active_view_measurable_cost_micr" +
      "os\030\274\001 \001(\003H\005\210\001\001\0220\n\"active_view_measurable" +
      "_impressions\030\275\001 \001(\003H\006\210\001\001\022%\n\027active_view_" +
      "viewability\030\276\001 \001(\001H\007\210\001\001\0224\n&all_conversio" +
      "ns_from_interactions_rate\030\277\001 \001(\001H\010\210\001\001\022#\n" +
      "\025all_conversions_value\030\300\001 \001(\001H\t\210\001\001\0221\n(al" +
      "l_conversions_value_by_conversion_date\030\360" +
      "\001 \001(\001\022\035\n\017all_conversions\030\301\001 \001(\001H\n\210\001\001\022+\n\"" +
      "all_conversions_by_conversion_date\030\361\001 \001(" +
      "\001\022,\n\036all_conversions_value_per_cost\030\302\001 \001" +
      "(\001H\013\210\001\001\0220\n\"all_conversions_from_click_to" +
      "_call\030\303\001 \001(\001H\014\210\001\001\022-\n\037all_conversions_fro" +
      "m_directions\030\304\001 \001(\001H\r\210\001\001\022E\n7all_conversi" +
      "ons_from_interactions_value_per_interact" +
      "ion\030\305\001 \001(\001H\016\210\001\001\022\'\n\031all_conversions_from_" +
      "menu\030\306\001 \001(\001H\017\210\001\001\022(\n\032all_conversions_from" +
      "_order\030\307\001 \001(\001H\020\210\001\001\0223\n%all_conversions_fr" +
      "om_other_engagement\030\310\001 \001(\001H\021\210\001\001\022.\n all_c" +
      "onversions_from_store_visit\030\311\001 \001(\001H\022\210\001\001\022" +
      "0\n\"all_conversions_from_store_website\030\312\001" +
      " \001(\001H\023\210\001\001\022\032\n\014average_cost\030\313\001 \001(\001H\024\210\001\001\022\031\n" +
      "\013average_cpc\030\314\001 \001(\001H\025\210\001\001\022\031\n\013average_cpe\030" +
      "\315\001 \001(\001H\026\210\001\001\022\031\n\013average_cpm\030\316\001 \001(\001H\027\210\001\001\022\031" +
      "\n\013average_cpv\030\317\001 \001(\001H\030\210\001\001\022 \n\022average_pag" +
      "e_views\030\320\001 \001(\001H\031\210\001\001\022\"\n\024average_time_on_s" +
      "ite\030\321\001 \001(\001H\032\210\001\001\022\'\n\031benchmark_average_max" +
      "_cpc\030\322\001 \001(\001H\033\210\001\001\022.\n biddable_app_install" +
      "_conversions\030\376\001 \001(\001H\034\210\001\001\0223\n%biddable_app" +
      "_post_install_conversions\030\377\001 \001(\001H\035\210\001\001\022\033\n" +
      "\rbenchmark_ctr\030\323\001 \001(\001H\036\210\001\001\022\031\n\013bounce_rat" +
      "e\030\324\001 \001(\001H\037\210\001\001\022\024\n\006clicks\030\203\001 \001(\003H \210\001\001\022\035\n\017c" +
      "ombined_clicks\030\234\001 \001(\003H!\210\001\001\022\'\n\031combined_c" +
      "licks_per_query\030\235\001 \001(\001H\"\210\001\001\022\036\n\020combined_" +
      "queries\030\236\001 \001(\003H#\210\001\001\0222\n$content_budget_lo" +
      "st_impression_share\030\237\001 \001(\001H$\210\001\001\022&\n\030conte" +
      "nt_impression_share\030\240\001 \001(\001H%\210\001\001\0228\n*conve" +
      "rsion_last_received_request_date_time\030\241\001" +
      " \001(\tH&\210\001\001\022-\n\037conversion_last_conversion_" +
      "date\030\242\001 \001(\tH\'\210\001\001\0220\n\"content_rank_lost_im" +
      "pression_share\030\243\001 \001(\001H(\210\001\001\0220\n\"conversion" +
      "s_from_interactions_rate\030\244\001 \001(\001H)\210\001\001\022\037\n\021" +
      "conversions_value\030\245\001 \001(\001H*\210\001\001\022-\n$convers" +
      "ions_value_by_conversion_date\030\362\001 \001(\001\022(\n\032" +
      "conversions_value_per_cost\030\246\001 \001(\001H+\210\001\001\022A" +
      "\n3conversions_from_interactions_value_pe" +
      "r_interaction\030\247\001 \001(\001H,\210\001\001\022\031\n\013conversions" +
      "\030\250\001 \001(\001H-\210\001\001\022\'\n\036conversions_by_conversio" +
      "n_date\030\363\001 \001(\001\022\031\n\013cost_micros\030\251\001 \001(\003H.\210\001\001" +
      "\022&\n\030cost_per_all_conversions\030\252\001 \001(\001H/\210\001\001" +
      "\022!\n\023cost_per_conversion\030\253\001 \001(\001H0\210\001\001\022:\n,c" +
      "ost_per_current_model_attributed_convers" +
      "ion\030\254\001 \001(\001H1\210\001\001\022&\n\030cross_device_conversi" +
      "ons\030\255\001 \001(\001H2\210\001\001\022\021\n\003ctr\030\256\001 \001(\001H3\210\001\001\0222\n$cu" +
      "rrent_model_attributed_conversions\030\257\001 \001(" +
      "\001H4\210\001\001\022I\n;current_model_attributed_conve" +
      "rsions_from_interactions_rate\030\260\001 \001(\001H5\210\001" +
      "\001\022Z\nLcurrent_model_attributed_conversion" +
      "s_from_interactions_value_per_interactio" +
      "n\030\261\001 \001(\001H6\210\001\001\0228\n*current_model_attribute" +
      "d_conversions_value\030\262\001 \001(\001H7\210\001\001\022A\n3curre" +
      "nt_model_attributed_conversions_value_pe" +
      "r_cost\030\263\001 \001(\001H8\210\001\001\022\035\n\017engagement_rate\030\264\001" +
      " \001(\001H9\210\001\001\022\031\n\013engagements\030\265\001 \001(\003H:\210\001\001\022-\n\037" +
      "hotel_average_lead_value_micros\030\325\001 \001(\001H;" +
      "\210\001\001\022*\n\034hotel_commission_rate_micros\030\200\002 \001" +
      "(\003H<\210\001\001\022,\n\036hotel_expected_commission_cos" +
      "t\030\201\002 \001(\001H=\210\001\001\022/\n!hotel_price_difference_" +
      "percentage\030\326\001 \001(\001H>\210\001\001\022(\n\032hotel_eligible" +
      "_impressions\030\327\001 \001(\003H?\210\001\001\022t\n!historical_c" +
      "reative_quality_score\030P \001(\0162I.google.ads" +
      ".googleads.v10.enums.QualityScoreBucketE" +
      "num.QualityScoreBucket\022x\n%historical_lan" +
      "ding_page_quality_score\030Q \001(\0162I.google.a" +
      "ds.googleads.v10.enums.QualityScoreBucke" +
      "tEnum.QualityScoreBucket\022&\n\030historical_q" +
      "uality_score\030\330\001 \001(\003H@\210\001\001\022r\n\037historical_s" +
      "earch_predicted_ctr\030S \001(\0162I.google.ads.g" +
      "oogleads.v10.enums.QualityScoreBucketEnu" +
      "m.QualityScoreBucket\022\034\n\016gmail_forwards\030\331" +
      "\001 \001(\003HA\210\001\001\022\031\n\013gmail_saves\030\332\001 \001(\003HB\210\001\001\022$\n" +
      "\026gmail_secondary_clicks\030\333\001 \001(\003HC\210\001\001\022*\n\034i" +
      "mpressions_from_store_reach\030\334\001 \001(\003HD\210\001\001\022" +
      "\031\n\013impressions\030\335\001 \001(\003HE\210\001\001\022\036\n\020interactio" +
      "n_rate\030\336\001 \001(\001HF\210\001\001\022\032\n\014interactions\030\337\001 \001(" +
      "\003HG\210\001\001\022n\n\027interaction_event_types\030d \003(\0162" +
      "M.google.ads.googleads.v10.enums.Interac" +
      "tionEventTypeEnum.InteractionEventType\022 " +
      "\n\022invalid_click_rate\030\340\001 \001(\001HH\210\001\001\022\034\n\016inva" +
      "lid_clicks\030\341\001 \001(\003HI\210\001\001\022\033\n\rmessage_chats\030" +
      "\342\001 \001(\003HJ\210\001\001\022!\n\023message_impressions\030\343\001 \001(" +
      "\003HK\210\001\001\022\037\n\021message_chat_rate\030\344\001 \001(\001HL\210\001\001\022" +
      "/\n!mobile_friendly_clicks_percentage\030\345\001 " +
      "\001(\001HM\210\001\001\022\'\n\031optimization_score_uplift\030\367\001" +
      " \001(\001HN\210\001\001\022$\n\026optimization_score_url\030\370\001 \001" +
      "(\tHO\210\001\001\022\034\n\016organic_clicks\030\346\001 \001(\003HP\210\001\001\022&\n" +
      "\030organic_clicks_per_query\030\347\001 \001(\001HQ\210\001\001\022!\n" +
      "\023organic_impressions\030\350\001 \001(\003HR\210\001\001\022+\n\035orga" +
      "nic_impressions_per_query\030\351\001 \001(\001HS\210\001\001\022\035\n" +
      "\017organic_queries\030\352\001 \001(\003HT\210\001\001\022\"\n\024percent_" +
      "new_visitors\030\353\001 \001(\001HU\210\001\001\022\031\n\013phone_calls\030" +
      "\354\001 \001(\003HV\210\001\001\022\037\n\021phone_impressions\030\355\001 \001(\003H" +
      "W\210\001\001\022 \n\022phone_through_rate\030\356\001 \001(\001HX\210\001\001\022\032" +
      "\n\014relative_ctr\030\357\001 \001(\001HY\210\001\001\0222\n$search_abs" +
      "olute_top_impression_share\030\210\001 \001(\001HZ\210\001\001\022>" +
      "\n0search_budget_lost_absolute_top_impres" +
      "sion_share\030\211\001 \001(\001H[\210\001\001\0221\n#search_budget_" +
      "lost_impression_share\030\212\001 \001(\001H\\\210\001\001\0225\n\'sea" +
      "rch_budget_lost_top_impression_share\030\213\001 " +
      "\001(\001H]\210\001\001\022 \n\022search_click_share\030\214\001 \001(\001H^\210" +
      "\001\001\0221\n#search_exact_match_impression_shar" +
      "e\030\215\001 \001(\001H_\210\001\001\022%\n\027search_impression_share" +
      "\030\216\001 \001(\001H`\210\001\001\022<\n.search_rank_lost_absolut" +
      "e_top_impression_share\030\217\001 \001(\001Ha\210\001\001\022/\n!se" +
      "arch_rank_lost_impression_share\030\220\001 \001(\001Hb" +
      "\210\001\001\0223\n%search_rank_lost_top_impression_s" +
      "hare\030\221\001 \001(\001Hc\210\001\001\022)\n\033search_top_impressio" +
      "n_share\030\222\001 \001(\001Hd\210\001\001\022\031\n\013speed_score\030\223\001 \001(" +
      "\003He\210\001\001\022\'\n\031top_impression_percentage\030\224\001 \001" +
      "(\001Hf\210\001\001\022>\n0valid_accelerated_mobile_page" +
      "s_clicks_percentage\030\225\001 \001(\001Hg\210\001\001\022\'\n\031value" +
      "_per_all_conversions\030\226\001 \001(\001Hh\210\001\001\022:\n,valu" +
      "e_per_all_conversions_by_conversion_date" +
      "\030\364\001 \001(\001Hi\210\001\001\022\"\n\024value_per_conversion\030\227\001 " +
      "\001(\001Hj\210\001\001\0226\n(value_per_conversions_by_con" +
      "version_date\030\365\001 \001(\001Hk\210\001\001\022;\n-value_per_cu" +
      "rrent_model_attributed_conversion\030\230\001 \001(\001" +
      "Hl\210\001\001\022&\n\030video_quartile_p100_rate\030\204\001 \001(\001" +
      "Hm\210\001\001\022%\n\027video_quartile_p25_rate\030\205\001 \001(\001H" +
      "n\210\001\001\022%\n\027video_quartile_p50_rate\030\206\001 \001(\001Ho" +
      "\210\001\001\022%\n\027video_quartile_p75_rate\030\207\001 \001(\001Hp\210" +
      "\001\001\022\035\n\017video_view_rate\030\231\001 \001(\001Hq\210\001\001\022\031\n\013vid" +
      "eo_views\030\232\001 \001(\003Hr\210\001\001\022&\n\030view_through_con" +
      "versions\030\233\001 \001(\003Hs\210\001\001\022\"\n\031sk_ad_network_co" +
      "nversions\030\366\001 \001(\003B%\n#_absolute_top_impres" +
      "sion_percentageB\022\n\020_active_view_cpmB\022\n\020_" +
      "active_view_ctrB\032\n\030_active_view_impressi" +
      "onsB\034\n\032_active_view_measurabilityB%\n#_ac" +
      "tive_view_measurable_cost_microsB%\n#_act" +
      "ive_view_measurable_impressionsB\032\n\030_acti" +
      "ve_view_viewabilityB)\n\'_all_conversions_" +
      "from_interactions_rateB\030\n\026_all_conversio" +
      "ns_valueB\022\n\020_all_conversionsB!\n\037_all_con" +
      "versions_value_per_costB%\n#_all_conversi" +
      "ons_from_click_to_callB\"\n _all_conversio" +
      "ns_from_directionsB:\n8_all_conversions_f" +
      "rom_interactions_value_per_interactionB\034" +
      "\n\032_all_conversions_from_menuB\035\n\033_all_con" +
      "versions_from_orderB(\n&_all_conversions_" +
      "from_other_engagementB#\n!_all_conversion" +
      "s_from_store_visitB%\n#_all_conversions_f" +
      "rom_store_websiteB\017\n\r_average_costB\016\n\014_a" +
      "verage_cpcB\016\n\014_average_cpeB\016\n\014_average_c" +
      "pmB\016\n\014_average_cpvB\025\n\023_average_page_view" +
      "sB\027\n\025_average_time_on_siteB\034\n\032_benchmark" +
      "_average_max_cpcB#\n!_biddable_app_instal" +
      "l_conversionsB(\n&_biddable_app_post_inst" +
      "all_conversionsB\020\n\016_benchmark_ctrB\016\n\014_bo" +
      "unce_rateB\t\n\007_clicksB\022\n\020_combined_clicks" +
      "B\034\n\032_combined_clicks_per_queryB\023\n\021_combi" +
      "ned_queriesB\'\n%_content_budget_lost_impr" +
      "ession_shareB\033\n\031_content_impression_shar" +
      "eB-\n+_conversion_last_received_request_d" +
      "ate_timeB\"\n _conversion_last_conversion_" +
      "dateB%\n#_content_rank_lost_impression_sh" +
      "areB%\n#_conversions_from_interactions_ra" +
      "teB\024\n\022_conversions_valueB\035\n\033_conversions" +
      "_value_per_costB6\n4_conversions_from_int" +
      "eractions_value_per_interactionB\016\n\014_conv" +
      "ersionsB\016\n\014_cost_microsB\033\n\031_cost_per_all" +
      "_conversionsB\026\n\024_cost_per_conversionB/\n-" +
      "_cost_per_current_model_attributed_conve" +
      "rsionB\033\n\031_cross_device_conversionsB\006\n\004_c" +
      "trB\'\n%_current_model_attributed_conversi" +
      "onsB>\n<_current_model_attributed_convers" +
      "ions_from_interactions_rateBO\nM_current_" +
      "model_attributed_conversions_from_intera" +
      "ctions_value_per_interactionB-\n+_current" +
      "_model_attributed_conversions_valueB6\n4_" +
      "current_model_attributed_conversions_val" +
      "ue_per_costB\022\n\020_engagement_rateB\016\n\014_enga" +
      "gementsB\"\n _hotel_average_lead_value_mic" +
      "rosB\037\n\035_hotel_commission_rate_microsB!\n\037" +
      "_hotel_expected_commission_costB$\n\"_hote" +
      "l_price_difference_percentageB\035\n\033_hotel_" +
      "eligible_impressionsB\033\n\031_historical_qual" +
      "ity_scoreB\021\n\017_gmail_forwardsB\016\n\014_gmail_s" +
      "avesB\031\n\027_gmail_secondary_clicksB\037\n\035_impr" +
      "essions_from_store_reachB\016\n\014_impressions" +
      "B\023\n\021_interaction_rateB\017\n\r_interactionsB\025" +
      "\n\023_invalid_click_rateB\021\n\017_invalid_clicks" +
      "B\020\n\016_message_chatsB\026\n\024_message_impressio" +
      "nsB\024\n\022_message_chat_rateB$\n\"_mobile_frie" +
      "ndly_clicks_percentageB\034\n\032_optimization_" +
      "score_upliftB\031\n\027_optimization_score_urlB" +
      "\021\n\017_organic_clicksB\033\n\031_organic_clicks_pe" +
      "r_queryB\026\n\024_organic_impressionsB \n\036_orga" +
      "nic_impressions_per_queryB\022\n\020_organic_qu" +
      "eriesB\027\n\025_percent_new_visitorsB\016\n\014_phone" +
      "_callsB\024\n\022_phone_impressionsB\025\n\023_phone_t" +
      "hrough_rateB\017\n\r_relative_ctrB\'\n%_search_" +
      "absolute_top_impression_shareB3\n1_search" +
      "_budget_lost_absolute_top_impression_sha" +
      "reB&\n$_search_budget_lost_impression_sha" +
      "reB*\n(_search_budget_lost_top_impression" +
      "_shareB\025\n\023_search_click_shareB&\n$_search" +
      "_exact_match_impression_shareB\032\n\030_search" +
      "_impression_shareB1\n/_search_rank_lost_a" +
      "bsolute_top_impression_shareB$\n\"_search_" +
      "rank_lost_impression_shareB(\n&_search_ra" +
      "nk_lost_top_impression_shareB\036\n\034_search_" +
      "top_impression_shareB\016\n\014_speed_scoreB\034\n\032" +
      "_top_impression_percentageB3\n1_valid_acc" +
      "elerated_mobile_pages_clicks_percentageB" +
      "\034\n\032_value_per_all_conversionsB/\n-_value_" +
      "per_all_conversions_by_conversion_dateB\027" +
      "\n\025_value_per_conversionB+\n)_value_per_co" +
      "nversions_by_conversion_dateB0\n._value_p" +
      "er_current_model_attributed_conversionB\033" +
      "\n\031_video_quartile_p100_rateB\032\n\030_video_qu" +
      "artile_p25_rateB\032\n\030_video_quartile_p50_r" +
      "ateB\032\n\030_video_quartile_p75_rateB\022\n\020_vide" +
      "o_view_rateB\016\n\014_video_viewsB\033\n\031_view_thr" +
      "ough_conversionsB\354\001\n#com.google.ads.goog" +
      "leads.v10.commonB\014MetricsProtoP\001ZEgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v10/common;common\242\002\003GAA\252\002\037Google.A" +
      "ds.GoogleAds.V10.Common\312\002\037Google\\Ads\\Goo" +
      "gleAds\\V10\\Common\352\002#Google::Ads::GoogleA" +
      "ds::V10::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v10.enums.InteractionEventTypeProto.getDescriptor(),
          com.google.ads.googleads.v10.enums.QualityScoreBucketProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v10_common_Metrics_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v10_common_Metrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v10_common_Metrics_descriptor,
        new java.lang.String[] { "AbsoluteTopImpressionPercentage", "ActiveViewCpm", "ActiveViewCtr", "ActiveViewImpressions", "ActiveViewMeasurability", "ActiveViewMeasurableCostMicros", "ActiveViewMeasurableImpressions", "ActiveViewViewability", "AllConversionsFromInteractionsRate", "AllConversionsValue", "AllConversionsValueByConversionDate", "AllConversions", "AllConversionsByConversionDate", "AllConversionsValuePerCost", "AllConversionsFromClickToCall", "AllConversionsFromDirections", "AllConversionsFromInteractionsValuePerInteraction", "AllConversionsFromMenu", "AllConversionsFromOrder", "AllConversionsFromOtherEngagement", "AllConversionsFromStoreVisit", "AllConversionsFromStoreWebsite", "AverageCost", "AverageCpc", "AverageCpe", "AverageCpm", "AverageCpv", "AveragePageViews", "AverageTimeOnSite", "BenchmarkAverageMaxCpc", "BiddableAppInstallConversions", "BiddableAppPostInstallConversions", "BenchmarkCtr", "BounceRate", "Clicks", "CombinedClicks", "CombinedClicksPerQuery", "CombinedQueries", "ContentBudgetLostImpressionShare", "ContentImpressionShare", "ConversionLastReceivedRequestDateTime", "ConversionLastConversionDate", "ContentRankLostImpressionShare", "ConversionsFromInteractionsRate", "ConversionsValue", "ConversionsValueByConversionDate", "ConversionsValuePerCost", "ConversionsFromInteractionsValuePerInteraction", "Conversions", "ConversionsByConversionDate", "CostMicros", "CostPerAllConversions", "CostPerConversion", "CostPerCurrentModelAttributedConversion", "CrossDeviceConversions", "Ctr", "CurrentModelAttributedConversions", "CurrentModelAttributedConversionsFromInteractionsRate", "CurrentModelAttributedConversionsFromInteractionsValuePerInteraction", "CurrentModelAttributedConversionsValue", "CurrentModelAttributedConversionsValuePerCost", "EngagementRate", "Engagements", "HotelAverageLeadValueMicros", "HotelCommissionRateMicros", "HotelExpectedCommissionCost", "HotelPriceDifferencePercentage", "HotelEligibleImpressions", "HistoricalCreativeQualityScore", "HistoricalLandingPageQualityScore", "HistoricalQualityScore", "HistoricalSearchPredictedCtr", "GmailForwards", "GmailSaves", "GmailSecondaryClicks", "ImpressionsFromStoreReach", "Impressions", "InteractionRate", "Interactions", "InteractionEventTypes", "InvalidClickRate", "InvalidClicks", "MessageChats", "MessageImpressions", "MessageChatRate", "MobileFriendlyClicksPercentage", "OptimizationScoreUplift", "OptimizationScoreUrl", "OrganicClicks", "OrganicClicksPerQuery", "OrganicImpressions", "OrganicImpressionsPerQuery", "OrganicQueries", "PercentNewVisitors", "PhoneCalls", "PhoneImpressions", "PhoneThroughRate", "RelativeCtr", "SearchAbsoluteTopImpressionShare", "SearchBudgetLostAbsoluteTopImpressionShare", "SearchBudgetLostImpressionShare", "SearchBudgetLostTopImpressionShare", "SearchClickShare", "SearchExactMatchImpressionShare", "SearchImpressionShare", "SearchRankLostAbsoluteTopImpressionShare", "SearchRankLostImpressionShare", "SearchRankLostTopImpressionShare", "SearchTopImpressionShare", "SpeedScore", "TopImpressionPercentage", "ValidAcceleratedMobilePagesClicksPercentage", "ValuePerAllConversions", "ValuePerAllConversionsByConversionDate", "ValuePerConversion", "ValuePerConversionsByConversionDate", "ValuePerCurrentModelAttributedConversion", "VideoQuartileP100Rate", "VideoQuartileP25Rate", "VideoQuartileP50Rate", "VideoQuartileP75Rate", "VideoViewRate", "VideoViews", "ViewThroughConversions", "SkAdNetworkConversions", "AbsoluteTopImpressionPercentage", "ActiveViewCpm", "ActiveViewCtr", "ActiveViewImpressions", "ActiveViewMeasurability", "ActiveViewMeasurableCostMicros", "ActiveViewMeasurableImpressions", "ActiveViewViewability", "AllConversionsFromInteractionsRate", "AllConversionsValue", "AllConversions", "AllConversionsValuePerCost", "AllConversionsFromClickToCall", "AllConversionsFromDirections", "AllConversionsFromInteractionsValuePerInteraction", "AllConversionsFromMenu", "AllConversionsFromOrder", "AllConversionsFromOtherEngagement", "AllConversionsFromStoreVisit", "AllConversionsFromStoreWebsite", "AverageCost", "AverageCpc", "AverageCpe", "AverageCpm", "AverageCpv", "AveragePageViews", "AverageTimeOnSite", "BenchmarkAverageMaxCpc", "BiddableAppInstallConversions", "BiddableAppPostInstallConversions", "BenchmarkCtr", "BounceRate", "Clicks", "CombinedClicks", "CombinedClicksPerQuery", "CombinedQueries", "ContentBudgetLostImpressionShare", "ContentImpressionShare", "ConversionLastReceivedRequestDateTime", "ConversionLastConversionDate", "ContentRankLostImpressionShare", "ConversionsFromInteractionsRate", "ConversionsValue", "ConversionsValuePerCost", "ConversionsFromInteractionsValuePerInteraction", "Conversions", "CostMicros", "CostPerAllConversions", "CostPerConversion", "CostPerCurrentModelAttributedConversion", "CrossDeviceConversions", "Ctr", "CurrentModelAttributedConversions", "CurrentModelAttributedConversionsFromInteractionsRate", "CurrentModelAttributedConversionsFromInteractionsValuePerInteraction", "CurrentModelAttributedConversionsValue", "CurrentModelAttributedConversionsValuePerCost", "EngagementRate", "Engagements", "HotelAverageLeadValueMicros", "HotelCommissionRateMicros", "HotelExpectedCommissionCost", "HotelPriceDifferencePercentage", "HotelEligibleImpressions", "HistoricalQualityScore", "GmailForwards", "GmailSaves", "GmailSecondaryClicks", "ImpressionsFromStoreReach", "Impressions", "InteractionRate", "Interactions", "InvalidClickRate", "InvalidClicks", "MessageChats", "MessageImpressions", "MessageChatRate", "MobileFriendlyClicksPercentage", "OptimizationScoreUplift", "OptimizationScoreUrl", "OrganicClicks", "OrganicClicksPerQuery", "OrganicImpressions", "OrganicImpressionsPerQuery", "OrganicQueries", "PercentNewVisitors", "PhoneCalls", "PhoneImpressions", "PhoneThroughRate", "RelativeCtr", "SearchAbsoluteTopImpressionShare", "SearchBudgetLostAbsoluteTopImpressionShare", "SearchBudgetLostImpressionShare", "SearchBudgetLostTopImpressionShare", "SearchClickShare", "SearchExactMatchImpressionShare", "SearchImpressionShare", "SearchRankLostAbsoluteTopImpressionShare", "SearchRankLostImpressionShare", "SearchRankLostTopImpressionShare", "SearchTopImpressionShare", "SpeedScore", "TopImpressionPercentage", "ValidAcceleratedMobilePagesClicksPercentage", "ValuePerAllConversions", "ValuePerAllConversionsByConversionDate", "ValuePerConversion", "ValuePerConversionsByConversionDate", "ValuePerCurrentModelAttributedConversion", "VideoQuartileP100Rate", "VideoQuartileP25Rate", "VideoQuartileP50Rate", "VideoQuartileP75Rate", "VideoViewRate", "VideoViews", "ViewThroughConversions", });
    com.google.ads.googleads.v10.enums.InteractionEventTypeProto.getDescriptor();
    com.google.ads.googleads.v10.enums.QualityScoreBucketProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

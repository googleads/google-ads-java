// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/metrics.proto

// Protobuf Java Version: 3.25.2
package com.google.ads.googleads.v16.common;

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
    internal_static_google_ads_googleads_v16_common_Metrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_common_Metrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_common_SearchVolumeRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_common_SearchVolumeRange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/ads/googleads/v16/common/metric" +
      "s.proto\022\037google.ads.googleads.v16.common" +
      "\032;google/ads/googleads/v16/enums/interac" +
      "tion_event_type.proto\0329google/ads/google" +
      "ads/v16/enums/quality_score_bucket.proto" +
      "\"\271h\n\007Metrics\0220\n\"absolute_top_impression_" +
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
      "\001 \001(\001\022-\n\037all_new_customer_lifetime_value" +
      "\030\246\002 \001(\001H\n\210\001\001\022\035\n\017all_conversions\030\301\001 \001(\001H\013" +
      "\210\001\001\022+\n\"all_conversions_by_conversion_dat" +
      "e\030\361\001 \001(\001\022,\n\036all_conversions_value_per_co" +
      "st\030\302\001 \001(\001H\014\210\001\001\0220\n\"all_conversions_from_c" +
      "lick_to_call\030\303\001 \001(\001H\r\210\001\001\022-\n\037all_conversi" +
      "ons_from_directions\030\304\001 \001(\001H\016\210\001\001\022E\n7all_c" +
      "onversions_from_interactions_value_per_i" +
      "nteraction\030\305\001 \001(\001H\017\210\001\001\022\'\n\031all_conversion" +
      "s_from_menu\030\306\001 \001(\001H\020\210\001\001\022(\n\032all_conversio" +
      "ns_from_order\030\307\001 \001(\001H\021\210\001\001\0223\n%all_convers" +
      "ions_from_other_engagement\030\310\001 \001(\001H\022\210\001\001\022." +
      "\n all_conversions_from_store_visit\030\311\001 \001(" +
      "\001H\023\210\001\001\0220\n\"all_conversions_from_store_web" +
      "site\030\312\001 \001(\001H\024\210\001\001\022G\n9auction_insight_sear" +
      "ch_absolute_top_impression_percentage\030\202\002" +
      " \001(\001H\025\210\001\001\0225\n\'auction_insight_search_impr" +
      "ession_share\030\203\002 \001(\001H\026\210\001\001\0225\n\'auction_insi" +
      "ght_search_outranking_share\030\204\002 \001(\001H\027\210\001\001\022" +
      "1\n#auction_insight_search_overlap_rate\030\205" +
      "\002 \001(\001H\030\210\001\001\0228\n*auction_insight_search_pos" +
      "ition_above_rate\030\206\002 \001(\001H\031\210\001\001\022>\n0auction_" +
      "insight_search_top_impression_percentage" +
      "\030\207\002 \001(\001H\032\210\001\001\022\032\n\014average_cost\030\313\001 \001(\001H\033\210\001\001" +
      "\022\031\n\013average_cpc\030\314\001 \001(\001H\034\210\001\001\022\031\n\013average_c" +
      "pe\030\315\001 \001(\001H\035\210\001\001\022\031\n\013average_cpm\030\316\001 \001(\001H\036\210\001" +
      "\001\022\031\n\013average_cpv\030\317\001 \001(\001H\037\210\001\001\022 \n\022average_" +
      "page_views\030\320\001 \001(\001H \210\001\001\022\"\n\024average_time_o" +
      "n_site\030\321\001 \001(\001H!\210\001\001\022\'\n\031benchmark_average_" +
      "max_cpc\030\322\001 \001(\001H\"\210\001\001\022.\n biddable_app_inst" +
      "all_conversions\030\376\001 \001(\001H#\210\001\001\0223\n%biddable_" +
      "app_post_install_conversions\030\377\001 \001(\001H$\210\001\001" +
      "\022\033\n\rbenchmark_ctr\030\323\001 \001(\001H%\210\001\001\022\031\n\013bounce_" +
      "rate\030\324\001 \001(\001H&\210\001\001\022\024\n\006clicks\030\203\001 \001(\003H\'\210\001\001\022\035" +
      "\n\017combined_clicks\030\234\001 \001(\003H(\210\001\001\022\'\n\031combine" +
      "d_clicks_per_query\030\235\001 \001(\001H)\210\001\001\022\036\n\020combin" +
      "ed_queries\030\236\001 \001(\003H*\210\001\001\0222\n$content_budget" +
      "_lost_impression_share\030\237\001 \001(\001H+\210\001\001\022&\n\030co" +
      "ntent_impression_share\030\240\001 \001(\001H,\210\001\001\0228\n*co" +
      "nversion_last_received_request_date_time" +
      "\030\241\001 \001(\tH-\210\001\001\022-\n\037conversion_last_conversi" +
      "on_date\030\242\001 \001(\tH.\210\001\001\0220\n\"content_rank_lost" +
      "_impression_share\030\243\001 \001(\001H/\210\001\001\0220\n\"convers" +
      "ions_from_interactions_rate\030\244\001 \001(\001H0\210\001\001\022" +
      "\037\n\021conversions_value\030\245\001 \001(\001H1\210\001\001\022-\n$conv" +
      "ersions_value_by_conversion_date\030\362\001 \001(\001\022" +
      ")\n\033new_customer_lifetime_value\030\245\002 \001(\001H2\210" +
      "\001\001\022(\n\032conversions_value_per_cost\030\246\001 \001(\001H" +
      "3\210\001\001\022A\n3conversions_from_interactions_va" +
      "lue_per_interaction\030\247\001 \001(\001H4\210\001\001\022\031\n\013conve" +
      "rsions\030\250\001 \001(\001H5\210\001\001\022\'\n\036conversions_by_con" +
      "version_date\030\363\001 \001(\001\022\031\n\013cost_micros\030\251\001 \001(" +
      "\003H6\210\001\001\022&\n\030cost_per_all_conversions\030\252\001 \001(" +
      "\001H7\210\001\001\022!\n\023cost_per_conversion\030\253\001 \001(\001H8\210\001" +
      "\001\022:\n,cost_per_current_model_attributed_c" +
      "onversion\030\254\001 \001(\001H9\210\001\001\022&\n\030cross_device_co" +
      "nversions\030\255\001 \001(\001H:\210\001\001\0223\n%cross_device_co" +
      "nversions_value_micros\030\270\002 \001(\003H;\210\001\001\022\021\n\003ct" +
      "r\030\256\001 \001(\001H<\210\001\001\0222\n$current_model_attribute" +
      "d_conversions\030\257\001 \001(\001H=\210\001\001\022I\n;current_mod" +
      "el_attributed_conversions_from_interacti" +
      "ons_rate\030\260\001 \001(\001H>\210\001\001\022Z\nLcurrent_model_at" +
      "tributed_conversions_from_interactions_v" +
      "alue_per_interaction\030\261\001 \001(\001H?\210\001\001\0228\n*curr" +
      "ent_model_attributed_conversions_value\030\262" +
      "\001 \001(\001H@\210\001\001\022A\n3current_model_attributed_c" +
      "onversions_value_per_cost\030\263\001 \001(\001HA\210\001\001\022\035\n" +
      "\017engagement_rate\030\264\001 \001(\001HB\210\001\001\022\031\n\013engageme" +
      "nts\030\265\001 \001(\003HC\210\001\001\022-\n\037hotel_average_lead_va" +
      "lue_micros\030\325\001 \001(\001HD\210\001\001\022*\n\034hotel_commissi" +
      "on_rate_micros\030\200\002 \001(\003HE\210\001\001\022,\n\036hotel_expe" +
      "cted_commission_cost\030\201\002 \001(\001HF\210\001\001\022/\n!hote" +
      "l_price_difference_percentage\030\326\001 \001(\001HG\210\001" +
      "\001\022(\n\032hotel_eligible_impressions\030\327\001 \001(\003HH" +
      "\210\001\001\022t\n!historical_creative_quality_score" +
      "\030P \001(\0162I.google.ads.googleads.v16.enums." +
      "QualityScoreBucketEnum.QualityScoreBucke" +
      "t\022x\n%historical_landing_page_quality_sco" +
      "re\030Q \001(\0162I.google.ads.googleads.v16.enum" +
      "s.QualityScoreBucketEnum.QualityScoreBuc" +
      "ket\022&\n\030historical_quality_score\030\330\001 \001(\003HI" +
      "\210\001\001\022r\n\037historical_search_predicted_ctr\030S" +
      " \001(\0162I.google.ads.googleads.v16.enums.Qu" +
      "alityScoreBucketEnum.QualityScoreBucket\022" +
      "\034\n\016gmail_forwards\030\331\001 \001(\003HJ\210\001\001\022\031\n\013gmail_s" +
      "aves\030\332\001 \001(\003HK\210\001\001\022$\n\026gmail_secondary_clic" +
      "ks\030\333\001 \001(\003HL\210\001\001\022*\n\034impressions_from_store" +
      "_reach\030\334\001 \001(\003HM\210\001\001\022\031\n\013impressions\030\335\001 \001(\003" +
      "HN\210\001\001\022\036\n\020interaction_rate\030\336\001 \001(\001HO\210\001\001\022\032\n" +
      "\014interactions\030\337\001 \001(\003HP\210\001\001\022n\n\027interaction" +
      "_event_types\030d \003(\0162M.google.ads.googlead" +
      "s.v16.enums.InteractionEventTypeEnum.Int" +
      "eractionEventType\022 \n\022invalid_click_rate\030" +
      "\340\001 \001(\001HQ\210\001\001\022\034\n\016invalid_clicks\030\341\001 \001(\003HR\210\001" +
      "\001\022\033\n\rmessage_chats\030\342\001 \001(\003HS\210\001\001\022!\n\023messag" +
      "e_impressions\030\343\001 \001(\003HT\210\001\001\022\037\n\021message_cha" +
      "t_rate\030\344\001 \001(\001HU\210\001\001\022/\n!mobile_friendly_cl" +
      "icks_percentage\030\345\001 \001(\001HV\210\001\001\022\'\n\031optimizat" +
      "ion_score_uplift\030\367\001 \001(\001HW\210\001\001\022$\n\026optimiza" +
      "tion_score_url\030\370\001 \001(\tHX\210\001\001\022\034\n\016organic_cl" +
      "icks\030\346\001 \001(\003HY\210\001\001\022&\n\030organic_clicks_per_q" +
      "uery\030\347\001 \001(\001HZ\210\001\001\022!\n\023organic_impressions\030" +
      "\350\001 \001(\003H[\210\001\001\022+\n\035organic_impressions_per_q" +
      "uery\030\351\001 \001(\001H\\\210\001\001\022\035\n\017organic_queries\030\352\001 \001" +
      "(\003H]\210\001\001\022\"\n\024percent_new_visitors\030\353\001 \001(\001H^" +
      "\210\001\001\022\031\n\013phone_calls\030\354\001 \001(\003H_\210\001\001\022\037\n\021phone_" +
      "impressions\030\355\001 \001(\003H`\210\001\001\022 \n\022phone_through" +
      "_rate\030\356\001 \001(\001Ha\210\001\001\022\032\n\014relative_ctr\030\357\001 \001(\001" +
      "Hb\210\001\001\0222\n$search_absolute_top_impression_" +
      "share\030\210\001 \001(\001Hc\210\001\001\022>\n0search_budget_lost_" +
      "absolute_top_impression_share\030\211\001 \001(\001Hd\210\001" +
      "\001\0221\n#search_budget_lost_impression_share" +
      "\030\212\001 \001(\001He\210\001\001\0225\n\'search_budget_lost_top_i" +
      "mpression_share\030\213\001 \001(\001Hf\210\001\001\022 \n\022search_cl" +
      "ick_share\030\214\001 \001(\001Hg\210\001\001\0221\n#search_exact_ma" +
      "tch_impression_share\030\215\001 \001(\001Hh\210\001\001\022%\n\027sear" +
      "ch_impression_share\030\216\001 \001(\001Hi\210\001\001\022<\n.searc" +
      "h_rank_lost_absolute_top_impression_shar" +
      "e\030\217\001 \001(\001Hj\210\001\001\022/\n!search_rank_lost_impres" +
      "sion_share\030\220\001 \001(\001Hk\210\001\001\0223\n%search_rank_lo" +
      "st_top_impression_share\030\221\001 \001(\001Hl\210\001\001\022)\n\033s" +
      "earch_top_impression_share\030\222\001 \001(\001Hm\210\001\001\022O" +
      "\n\rsearch_volume\030\247\002 \001(\01322.google.ads.goog" +
      "leads.v16.common.SearchVolumeRangeHn\210\001\001\022" +
      "\031\n\013speed_score\030\223\001 \001(\003Ho\210\001\001\022\'\n\031average_ta" +
      "rget_cpa_micros\030\242\002 \001(\003Hp\210\001\001\022!\n\023average_t" +
      "arget_roas\030\372\001 \001(\001Hq\210\001\001\022\'\n\031top_impression" +
      "_percentage\030\224\001 \001(\001Hr\210\001\001\022>\n0valid_acceler" +
      "ated_mobile_pages_clicks_percentage\030\225\001 \001" +
      "(\001Hs\210\001\001\022\'\n\031value_per_all_conversions\030\226\001 " +
      "\001(\001Ht\210\001\001\022:\n,value_per_all_conversions_by" +
      "_conversion_date\030\364\001 \001(\001Hu\210\001\001\022\"\n\024value_pe" +
      "r_conversion\030\227\001 \001(\001Hv\210\001\001\0226\n(value_per_co" +
      "nversions_by_conversion_date\030\365\001 \001(\001Hw\210\001\001" +
      "\022;\n-value_per_current_model_attributed_c" +
      "onversion\030\230\001 \001(\001Hx\210\001\001\022&\n\030video_quartile_" +
      "p100_rate\030\204\001 \001(\001Hy\210\001\001\022%\n\027video_quartile_" +
      "p25_rate\030\205\001 \001(\001Hz\210\001\001\022%\n\027video_quartile_p" +
      "50_rate\030\206\001 \001(\001H{\210\001\001\022%\n\027video_quartile_p7" +
      "5_rate\030\207\001 \001(\001H|\210\001\001\022\035\n\017video_view_rate\030\231\001" +
      " \001(\001H}\210\001\001\022\031\n\013video_views\030\232\001 \001(\003H~\210\001\001\022&\n\030" +
      "view_through_conversions\030\233\001 \001(\003H\177\210\001\001\022\037\n\026" +
      "sk_ad_network_installs\030\366\001 \001(\003\022(\n\037sk_ad_n" +
      "etwork_total_conversions\030\244\002 \001(\003\022#\n\032publi" +
      "sher_purchased_clicks\030\210\002 \001(\003\022!\n\030publishe" +
      "r_organic_clicks\030\211\002 \001(\003\022!\n\030publisher_unk" +
      "nown_clicks\030\212\002 \001(\003\022@\n1all_conversions_fr" +
      "om_location_asset_click_to_call\030\213\002 \001(\001H\200" +
      "\001\210\001\001\022=\n.all_conversions_from_location_as" +
      "set_directions\030\214\002 \001(\001H\201\001\210\001\001\0227\n(all_conve" +
      "rsions_from_location_asset_menu\030\215\002 \001(\001H\202" +
      "\001\210\001\001\0228\n)all_conversions_from_location_as" +
      "set_order\030\216\002 \001(\001H\203\001\210\001\001\022C\n4all_conversion" +
      "s_from_location_asset_other_engagement\030\217" +
      "\002 \001(\001H\204\001\210\001\001\022?\n0all_conversions_from_loca" +
      "tion_asset_store_visits\030\220\002 \001(\001H\205\001\210\001\001\022:\n+" +
      "all_conversions_from_location_asset_webs" +
      "ite\030\221\002 \001(\001H\206\001\210\001\001\022C\n4eligible_impressions" +
      "_from_location_asset_store_reach\030\222\002 \001(\003H" +
      "\207\001\210\001\001\022I\n:view_through_conversions_from_l" +
      "ocation_asset_click_to_call\030\223\002 \001(\001H\210\001\210\001\001" +
      "\022F\n7view_through_conversions_from_locati" +
      "on_asset_directions\030\224\002 \001(\001H\211\001\210\001\001\022@\n1view" +
      "_through_conversions_from_location_asset" +
      "_menu\030\225\002 \001(\001H\212\001\210\001\001\022A\n2view_through_conve" +
      "rsions_from_location_asset_order\030\226\002 \001(\001H" +
      "\213\001\210\001\001\022L\n=view_through_conversions_from_l" +
      "ocation_asset_other_engagement\030\227\002 \001(\001H\214\001" +
      "\210\001\001\022H\n9view_through_conversions_from_loc" +
      "ation_asset_store_visits\030\230\002 \001(\001H\215\001\210\001\001\022C\n" +
      "4view_through_conversions_from_location_" +
      "asset_website\030\231\002 \001(\001H\216\001\210\001\001\022\025\n\006orders\030\250\002 " +
      "\001(\001H\217\001\210\001\001\022)\n\032average_order_value_micros\030" +
      "\251\002 \001(\003H\220\001\210\001\001\022 \n\021average_cart_size\030\252\002 \001(\001" +
      "H\221\001\210\001\001\022(\n\031cost_of_goods_sold_micros\030\253\002 \001" +
      "(\003H\222\001\210\001\001\022\"\n\023gross_profit_micros\030\254\002 \001(\003H\223" +
      "\001\210\001\001\022\"\n\023gross_profit_margin\030\255\002 \001(\001H\224\001\210\001\001" +
      "\022\035\n\016revenue_micros\030\256\002 \001(\003H\225\001\210\001\001\022\031\n\nunits" +
      "_sold\030\257\002 \001(\001H\226\001\210\001\001\0223\n$cross_sell_cost_of" +
      "_goods_sold_micros\030\260\002 \001(\003H\227\001\210\001\001\022-\n\036cross" +
      "_sell_gross_profit_micros\030\261\002 \001(\003H\230\001\210\001\001\022(" +
      "\n\031cross_sell_revenue_micros\030\262\002 \001(\003H\231\001\210\001\001" +
      "\022$\n\025cross_sell_units_sold\030\263\002 \001(\001H\232\001\210\001\001\022-" +
      "\n\036lead_cost_of_goods_sold_micros\030\264\002 \001(\003H" +
      "\233\001\210\001\001\022\'\n\030lead_gross_profit_micros\030\265\002 \001(\003" +
      "H\234\001\210\001\001\022\"\n\023lead_revenue_micros\030\266\002 \001(\003H\235\001\210" +
      "\001\001\022\036\n\017lead_units_sold\030\267\002 \001(\001H\236\001\210\001\001\022\033\n\014un" +
      "ique_users\030\277\002 \001(\003H\237\001\210\001\001\0224\n%average_impre" +
      "ssion_frequency_per_user\030\300\002 \001(\001H\240\001\210\001\001B%\n" +
      "#_absolute_top_impression_percentageB\022\n\020" +
      "_active_view_cpmB\022\n\020_active_view_ctrB\032\n\030" +
      "_active_view_impressionsB\034\n\032_active_view" +
      "_measurabilityB%\n#_active_view_measurabl" +
      "e_cost_microsB%\n#_active_view_measurable" +
      "_impressionsB\032\n\030_active_view_viewability" +
      "B)\n\'_all_conversions_from_interactions_r" +
      "ateB\030\n\026_all_conversions_valueB\"\n _all_ne" +
      "w_customer_lifetime_valueB\022\n\020_all_conver" +
      "sionsB!\n\037_all_conversions_value_per_cost" +
      "B%\n#_all_conversions_from_click_to_callB" +
      "\"\n _all_conversions_from_directionsB:\n8_" +
      "all_conversions_from_interactions_value_" +
      "per_interactionB\034\n\032_all_conversions_from" +
      "_menuB\035\n\033_all_conversions_from_orderB(\n&" +
      "_all_conversions_from_other_engagementB#" +
      "\n!_all_conversions_from_store_visitB%\n#_" +
      "all_conversions_from_store_websiteB<\n:_a" +
      "uction_insight_search_absolute_top_impre" +
      "ssion_percentageB*\n(_auction_insight_sea" +
      "rch_impression_shareB*\n(_auction_insight" +
      "_search_outranking_shareB&\n$_auction_ins" +
      "ight_search_overlap_rateB-\n+_auction_ins" +
      "ight_search_position_above_rateB3\n1_auct" +
      "ion_insight_search_top_impression_percen" +
      "tageB\017\n\r_average_costB\016\n\014_average_cpcB\016\n" +
      "\014_average_cpeB\016\n\014_average_cpmB\016\n\014_averag" +
      "e_cpvB\025\n\023_average_page_viewsB\027\n\025_average" +
      "_time_on_siteB\034\n\032_benchmark_average_max_" +
      "cpcB#\n!_biddable_app_install_conversions" +
      "B(\n&_biddable_app_post_install_conversio" +
      "nsB\020\n\016_benchmark_ctrB\016\n\014_bounce_rateB\t\n\007" +
      "_clicksB\022\n\020_combined_clicksB\034\n\032_combined" +
      "_clicks_per_queryB\023\n\021_combined_queriesB\'" +
      "\n%_content_budget_lost_impression_shareB" +
      "\033\n\031_content_impression_shareB-\n+_convers" +
      "ion_last_received_request_date_timeB\"\n _" +
      "conversion_last_conversion_dateB%\n#_cont" +
      "ent_rank_lost_impression_shareB%\n#_conve" +
      "rsions_from_interactions_rateB\024\n\022_conver" +
      "sions_valueB\036\n\034_new_customer_lifetime_va" +
      "lueB\035\n\033_conversions_value_per_costB6\n4_c" +
      "onversions_from_interactions_value_per_i" +
      "nteractionB\016\n\014_conversionsB\016\n\014_cost_micr" +
      "osB\033\n\031_cost_per_all_conversionsB\026\n\024_cost" +
      "_per_conversionB/\n-_cost_per_current_mod" +
      "el_attributed_conversionB\033\n\031_cross_devic" +
      "e_conversionsB(\n&_cross_device_conversio" +
      "ns_value_microsB\006\n\004_ctrB\'\n%_current_mode" +
      "l_attributed_conversionsB>\n<_current_mod" +
      "el_attributed_conversions_from_interacti" +
      "ons_rateBO\nM_current_model_attributed_co" +
      "nversions_from_interactions_value_per_in" +
      "teractionB-\n+_current_model_attributed_c" +
      "onversions_valueB6\n4_current_model_attri" +
      "buted_conversions_value_per_costB\022\n\020_eng" +
      "agement_rateB\016\n\014_engagementsB\"\n _hotel_a" +
      "verage_lead_value_microsB\037\n\035_hotel_commi" +
      "ssion_rate_microsB!\n\037_hotel_expected_com" +
      "mission_costB$\n\"_hotel_price_difference_" +
      "percentageB\035\n\033_hotel_eligible_impression" +
      "sB\033\n\031_historical_quality_scoreB\021\n\017_gmail" +
      "_forwardsB\016\n\014_gmail_savesB\031\n\027_gmail_seco" +
      "ndary_clicksB\037\n\035_impressions_from_store_" +
      "reachB\016\n\014_impressionsB\023\n\021_interaction_ra" +
      "teB\017\n\r_interactionsB\025\n\023_invalid_click_ra" +
      "teB\021\n\017_invalid_clicksB\020\n\016_message_chatsB" +
      "\026\n\024_message_impressionsB\024\n\022_message_chat" +
      "_rateB$\n\"_mobile_friendly_clicks_percent" +
      "ageB\034\n\032_optimization_score_upliftB\031\n\027_op" +
      "timization_score_urlB\021\n\017_organic_clicksB" +
      "\033\n\031_organic_clicks_per_queryB\026\n\024_organic" +
      "_impressionsB \n\036_organic_impressions_per" +
      "_queryB\022\n\020_organic_queriesB\027\n\025_percent_n" +
      "ew_visitorsB\016\n\014_phone_callsB\024\n\022_phone_im" +
      "pressionsB\025\n\023_phone_through_rateB\017\n\r_rel" +
      "ative_ctrB\'\n%_search_absolute_top_impres" +
      "sion_shareB3\n1_search_budget_lost_absolu" +
      "te_top_impression_shareB&\n$_search_budge" +
      "t_lost_impression_shareB*\n(_search_budge" +
      "t_lost_top_impression_shareB\025\n\023_search_c" +
      "lick_shareB&\n$_search_exact_match_impres" +
      "sion_shareB\032\n\030_search_impression_shareB1" +
      "\n/_search_rank_lost_absolute_top_impress" +
      "ion_shareB$\n\"_search_rank_lost_impressio" +
      "n_shareB(\n&_search_rank_lost_top_impress" +
      "ion_shareB\036\n\034_search_top_impression_shar" +
      "eB\020\n\016_search_volumeB\016\n\014_speed_scoreB\034\n\032_" +
      "average_target_cpa_microsB\026\n\024_average_ta" +
      "rget_roasB\034\n\032_top_impression_percentageB" +
      "3\n1_valid_accelerated_mobile_pages_click" +
      "s_percentageB\034\n\032_value_per_all_conversio" +
      "nsB/\n-_value_per_all_conversions_by_conv" +
      "ersion_dateB\027\n\025_value_per_conversionB+\n)" +
      "_value_per_conversions_by_conversion_dat" +
      "eB0\n._value_per_current_model_attributed" +
      "_conversionB\033\n\031_video_quartile_p100_rate" +
      "B\032\n\030_video_quartile_p25_rateB\032\n\030_video_q" +
      "uartile_p50_rateB\032\n\030_video_quartile_p75_" +
      "rateB\022\n\020_video_view_rateB\016\n\014_video_views" +
      "B\033\n\031_view_through_conversionsB4\n2_all_co" +
      "nversions_from_location_asset_click_to_c" +
      "allB1\n/_all_conversions_from_location_as" +
      "set_directionsB+\n)_all_conversions_from_" +
      "location_asset_menuB,\n*_all_conversions_" +
      "from_location_asset_orderB7\n5_all_conver" +
      "sions_from_location_asset_other_engageme" +
      "ntB3\n1_all_conversions_from_location_ass" +
      "et_store_visitsB.\n,_all_conversions_from" +
      "_location_asset_websiteB7\n5_eligible_imp" +
      "ressions_from_location_asset_store_reach" +
      "B=\n;_view_through_conversions_from_locat" +
      "ion_asset_click_to_callB:\n8_view_through" +
      "_conversions_from_location_asset_directi" +
      "onsB4\n2_view_through_conversions_from_lo" +
      "cation_asset_menuB5\n3_view_through_conve" +
      "rsions_from_location_asset_orderB@\n>_vie" +
      "w_through_conversions_from_location_asse" +
      "t_other_engagementB<\n:_view_through_conv" +
      "ersions_from_location_asset_store_visits" +
      "B7\n5_view_through_conversions_from_locat" +
      "ion_asset_websiteB\t\n\007_ordersB\035\n\033_average" +
      "_order_value_microsB\024\n\022_average_cart_siz" +
      "eB\034\n\032_cost_of_goods_sold_microsB\026\n\024_gros" +
      "s_profit_microsB\026\n\024_gross_profit_marginB" +
      "\021\n\017_revenue_microsB\r\n\013_units_soldB\'\n%_cr" +
      "oss_sell_cost_of_goods_sold_microsB!\n\037_c" +
      "ross_sell_gross_profit_microsB\034\n\032_cross_" +
      "sell_revenue_microsB\030\n\026_cross_sell_units" +
      "_soldB!\n\037_lead_cost_of_goods_sold_micros" +
      "B\033\n\031_lead_gross_profit_microsB\026\n\024_lead_r" +
      "evenue_microsB\022\n\020_lead_units_soldB\017\n\r_un" +
      "ique_usersB(\n&_average_impression_freque" +
      "ncy_per_user\"G\n\021SearchVolumeRange\022\020\n\003min" +
      "\030\001 \001(\003H\000\210\001\001\022\020\n\003max\030\002 \001(\003H\001\210\001\001B\006\n\004_minB\006\n" +
      "\004_maxB\354\001\n#com.google.ads.googleads.v16.c" +
      "ommonB\014MetricsProtoP\001ZEgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v16/c" +
      "ommon;common\242\002\003GAA\252\002\037Google.Ads.GoogleAd" +
      "s.V16.Common\312\002\037Google\\Ads\\GoogleAds\\V16\\" +
      "Common\352\002#Google::Ads::GoogleAds::V16::Co" +
      "mmonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.enums.InteractionEventTypeProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.QualityScoreBucketProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_common_Metrics_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_common_Metrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_common_Metrics_descriptor,
        new java.lang.String[] { "AbsoluteTopImpressionPercentage", "ActiveViewCpm", "ActiveViewCtr", "ActiveViewImpressions", "ActiveViewMeasurability", "ActiveViewMeasurableCostMicros", "ActiveViewMeasurableImpressions", "ActiveViewViewability", "AllConversionsFromInteractionsRate", "AllConversionsValue", "AllConversionsValueByConversionDate", "AllNewCustomerLifetimeValue", "AllConversions", "AllConversionsByConversionDate", "AllConversionsValuePerCost", "AllConversionsFromClickToCall", "AllConversionsFromDirections", "AllConversionsFromInteractionsValuePerInteraction", "AllConversionsFromMenu", "AllConversionsFromOrder", "AllConversionsFromOtherEngagement", "AllConversionsFromStoreVisit", "AllConversionsFromStoreWebsite", "AuctionInsightSearchAbsoluteTopImpressionPercentage", "AuctionInsightSearchImpressionShare", "AuctionInsightSearchOutrankingShare", "AuctionInsightSearchOverlapRate", "AuctionInsightSearchPositionAboveRate", "AuctionInsightSearchTopImpressionPercentage", "AverageCost", "AverageCpc", "AverageCpe", "AverageCpm", "AverageCpv", "AveragePageViews", "AverageTimeOnSite", "BenchmarkAverageMaxCpc", "BiddableAppInstallConversions", "BiddableAppPostInstallConversions", "BenchmarkCtr", "BounceRate", "Clicks", "CombinedClicks", "CombinedClicksPerQuery", "CombinedQueries", "ContentBudgetLostImpressionShare", "ContentImpressionShare", "ConversionLastReceivedRequestDateTime", "ConversionLastConversionDate", "ContentRankLostImpressionShare", "ConversionsFromInteractionsRate", "ConversionsValue", "ConversionsValueByConversionDate", "NewCustomerLifetimeValue", "ConversionsValuePerCost", "ConversionsFromInteractionsValuePerInteraction", "Conversions", "ConversionsByConversionDate", "CostMicros", "CostPerAllConversions", "CostPerConversion", "CostPerCurrentModelAttributedConversion", "CrossDeviceConversions", "CrossDeviceConversionsValueMicros", "Ctr", "CurrentModelAttributedConversions", "CurrentModelAttributedConversionsFromInteractionsRate", "CurrentModelAttributedConversionsFromInteractionsValuePerInteraction", "CurrentModelAttributedConversionsValue", "CurrentModelAttributedConversionsValuePerCost", "EngagementRate", "Engagements", "HotelAverageLeadValueMicros", "HotelCommissionRateMicros", "HotelExpectedCommissionCost", "HotelPriceDifferencePercentage", "HotelEligibleImpressions", "HistoricalCreativeQualityScore", "HistoricalLandingPageQualityScore", "HistoricalQualityScore", "HistoricalSearchPredictedCtr", "GmailForwards", "GmailSaves", "GmailSecondaryClicks", "ImpressionsFromStoreReach", "Impressions", "InteractionRate", "Interactions", "InteractionEventTypes", "InvalidClickRate", "InvalidClicks", "MessageChats", "MessageImpressions", "MessageChatRate", "MobileFriendlyClicksPercentage", "OptimizationScoreUplift", "OptimizationScoreUrl", "OrganicClicks", "OrganicClicksPerQuery", "OrganicImpressions", "OrganicImpressionsPerQuery", "OrganicQueries", "PercentNewVisitors", "PhoneCalls", "PhoneImpressions", "PhoneThroughRate", "RelativeCtr", "SearchAbsoluteTopImpressionShare", "SearchBudgetLostAbsoluteTopImpressionShare", "SearchBudgetLostImpressionShare", "SearchBudgetLostTopImpressionShare", "SearchClickShare", "SearchExactMatchImpressionShare", "SearchImpressionShare", "SearchRankLostAbsoluteTopImpressionShare", "SearchRankLostImpressionShare", "SearchRankLostTopImpressionShare", "SearchTopImpressionShare", "SearchVolume", "SpeedScore", "AverageTargetCpaMicros", "AverageTargetRoas", "TopImpressionPercentage", "ValidAcceleratedMobilePagesClicksPercentage", "ValuePerAllConversions", "ValuePerAllConversionsByConversionDate", "ValuePerConversion", "ValuePerConversionsByConversionDate", "ValuePerCurrentModelAttributedConversion", "VideoQuartileP100Rate", "VideoQuartileP25Rate", "VideoQuartileP50Rate", "VideoQuartileP75Rate", "VideoViewRate", "VideoViews", "ViewThroughConversions", "SkAdNetworkInstalls", "SkAdNetworkTotalConversions", "PublisherPurchasedClicks", "PublisherOrganicClicks", "PublisherUnknownClicks", "AllConversionsFromLocationAssetClickToCall", "AllConversionsFromLocationAssetDirections", "AllConversionsFromLocationAssetMenu", "AllConversionsFromLocationAssetOrder", "AllConversionsFromLocationAssetOtherEngagement", "AllConversionsFromLocationAssetStoreVisits", "AllConversionsFromLocationAssetWebsite", "EligibleImpressionsFromLocationAssetStoreReach", "ViewThroughConversionsFromLocationAssetClickToCall", "ViewThroughConversionsFromLocationAssetDirections", "ViewThroughConversionsFromLocationAssetMenu", "ViewThroughConversionsFromLocationAssetOrder", "ViewThroughConversionsFromLocationAssetOtherEngagement", "ViewThroughConversionsFromLocationAssetStoreVisits", "ViewThroughConversionsFromLocationAssetWebsite", "Orders", "AverageOrderValueMicros", "AverageCartSize", "CostOfGoodsSoldMicros", "GrossProfitMicros", "GrossProfitMargin", "RevenueMicros", "UnitsSold", "CrossSellCostOfGoodsSoldMicros", "CrossSellGrossProfitMicros", "CrossSellRevenueMicros", "CrossSellUnitsSold", "LeadCostOfGoodsSoldMicros", "LeadGrossProfitMicros", "LeadRevenueMicros", "LeadUnitsSold", "UniqueUsers", "AverageImpressionFrequencyPerUser", });
    internal_static_google_ads_googleads_v16_common_SearchVolumeRange_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v16_common_SearchVolumeRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_common_SearchVolumeRange_descriptor,
        new java.lang.String[] { "Min", "Max", });
    com.google.ads.googleads.v16.enums.InteractionEventTypeProto.getDescriptor();
    com.google.ads.googleads.v16.enums.QualityScoreBucketProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

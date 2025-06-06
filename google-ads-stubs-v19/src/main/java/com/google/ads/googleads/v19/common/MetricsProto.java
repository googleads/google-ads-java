// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v19/common/metrics.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v19.common;

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
    internal_static_google_ads_googleads_v19_common_Metrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_common_Metrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v19_common_SearchVolumeRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v19_common_SearchVolumeRange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-google/ads/googleads/v19/common/metric" +
      "s.proto\022\037google.ads.googleads.v19.common" +
      "\032;google/ads/googleads/v19/enums/interac" +
      "tion_event_type.proto\0329google/ads/google" +
      "ads/v19/enums/quality_score_bucket.proto" +
      "\"\327\177\n\007Metrics\0220\n\"absolute_top_impression_" +
      "percentage\030\267\001 \001(\001H\000\210\001\001\022\035\n\017active_view_cp" +
      "m\030\270\001 \001(\001H\001\210\001\001\022\035\n\017active_view_ctr\030\271\001 \001(\001H" +
      "\002\210\001\001\022%\n\027active_view_impressions\030\272\001 \001(\003H\003" +
      "\210\001\001\022\'\n\031active_view_measurability\030\273\001 \001(\001H" +
      "\004\210\001\001\0220\n\"active_view_measurable_cost_micr" +
      "os\030\274\001 \001(\003H\005\210\001\001\0220\n\"active_view_measurable" +
      "_impressions\030\275\001 \001(\003H\006\210\001\001\022%\n\027active_view_" +
      "viewability\030\276\001 \001(\001H\007\210\001\001\0224\n&all_conversio" +
      "ns_from_interactions_rate\030\277\001 \001(\001H\010\210\001\001\022#\n" +
      "\025all_conversions_value\030\300\001 \001(\001H\t\210\001\001\0226\n(al" +
      "l_conversions_value_by_conversion_date\030\360" +
      "\001 \001(\001H\n\210\001\001\022-\n\037all_new_customer_lifetime_" +
      "value\030\246\002 \001(\001H\013\210\001\001\022\035\n\017all_conversions\030\301\001 " +
      "\001(\001H\014\210\001\001\0220\n\"all_conversions_by_conversio" +
      "n_date\030\361\001 \001(\001H\r\210\001\001\022,\n\036all_conversions_va" +
      "lue_per_cost\030\302\001 \001(\001H\016\210\001\001\0220\n\"all_conversi" +
      "ons_from_click_to_call\030\303\001 \001(\001H\017\210\001\001\022-\n\037al" +
      "l_conversions_from_directions\030\304\001 \001(\001H\020\210\001" +
      "\001\022E\n7all_conversions_from_interactions_v" +
      "alue_per_interaction\030\305\001 \001(\001H\021\210\001\001\022\'\n\031all_" +
      "conversions_from_menu\030\306\001 \001(\001H\022\210\001\001\022(\n\032all" +
      "_conversions_from_order\030\307\001 \001(\001H\023\210\001\001\0223\n%a" +
      "ll_conversions_from_other_engagement\030\310\001 " +
      "\001(\001H\024\210\001\001\022.\n all_conversions_from_store_v" +
      "isit\030\311\001 \001(\001H\025\210\001\001\0220\n\"all_conversions_from" +
      "_store_website\030\312\001 \001(\001H\026\210\001\001\022G\n9auction_in" +
      "sight_search_absolute_top_impression_per" +
      "centage\030\202\002 \001(\001H\027\210\001\001\0225\n\'auction_insight_s" +
      "earch_impression_share\030\203\002 \001(\001H\030\210\001\001\0225\n\'au" +
      "ction_insight_search_outranking_share\030\204\002" +
      " \001(\001H\031\210\001\001\0221\n#auction_insight_search_over" +
      "lap_rate\030\205\002 \001(\001H\032\210\001\001\0228\n*auction_insight_" +
      "search_position_above_rate\030\206\002 \001(\001H\033\210\001\001\022>" +
      "\n0auction_insight_search_top_impression_" +
      "percentage\030\207\002 \001(\001H\034\210\001\001\022\032\n\014average_cost\030\313" +
      "\001 \001(\001H\035\210\001\001\022\031\n\013average_cpc\030\314\001 \001(\001H\036\210\001\001\022\031\n" +
      "\013average_cpe\030\315\001 \001(\001H\037\210\001\001\022\031\n\013average_cpm\030" +
      "\316\001 \001(\001H \210\001\001\022\031\n\013average_cpv\030\317\001 \001(\001H!\210\001\001\022 " +
      "\n\022average_page_views\030\320\001 \001(\001H\"\210\001\001\022\"\n\024aver" +
      "age_time_on_site\030\321\001 \001(\001H#\210\001\001\022\'\n\031benchmar" +
      "k_average_max_cpc\030\322\001 \001(\001H$\210\001\001\022.\n biddabl" +
      "e_app_install_conversions\030\376\001 \001(\001H%\210\001\001\0223\n" +
      "%biddable_app_post_install_conversions\030\377" +
      "\001 \001(\001H&\210\001\001\022:\n,biddable_cohort_app_post_i" +
      "nstall_conversions\030\372\002 \001(\001H\'\210\001\001\022\033\n\rbenchm" +
      "ark_ctr\030\323\001 \001(\001H(\210\001\001\022\031\n\013bounce_rate\030\324\001 \001(" +
      "\001H)\210\001\001\022\024\n\006clicks\030\203\001 \001(\003H*\210\001\001\022\035\n\017combined" +
      "_clicks\030\234\001 \001(\003H+\210\001\001\022\'\n\031combined_clicks_p" +
      "er_query\030\235\001 \001(\001H,\210\001\001\022\036\n\020combined_queries" +
      "\030\236\001 \001(\003H-\210\001\001\0222\n$content_budget_lost_impr" +
      "ession_share\030\237\001 \001(\001H.\210\001\001\022&\n\030content_impr" +
      "ession_share\030\240\001 \001(\001H/\210\001\001\0228\n*conversion_l" +
      "ast_received_request_date_time\030\241\001 \001(\tH0\210" +
      "\001\001\022-\n\037conversion_last_conversion_date\030\242\001" +
      " \001(\tH1\210\001\001\0220\n\"content_rank_lost_impressio" +
      "n_share\030\243\001 \001(\001H2\210\001\001\0220\n\"conversions_from_" +
      "interactions_rate\030\244\001 \001(\001H3\210\001\001\022\037\n\021convers" +
      "ions_value\030\245\001 \001(\001H4\210\001\001\0222\n$conversions_va" +
      "lue_by_conversion_date\030\362\001 \001(\001H5\210\001\001\022)\n\033ne" +
      "w_customer_lifetime_value\030\245\002 \001(\001H6\210\001\001\022(\n" +
      "\032conversions_value_per_cost\030\246\001 \001(\001H7\210\001\001\022" +
      "A\n3conversions_from_interactions_value_p" +
      "er_interaction\030\247\001 \001(\001H8\210\001\001\022\031\n\013conversion" +
      "s\030\250\001 \001(\001H9\210\001\001\022,\n\036conversions_by_conversi" +
      "on_date\030\363\001 \001(\001H:\210\001\001\022\031\n\013cost_micros\030\251\001 \001(" +
      "\003H;\210\001\001\022&\n\030cost_per_all_conversions\030\252\001 \001(" +
      "\001H<\210\001\001\022!\n\023cost_per_conversion\030\253\001 \001(\001H=\210\001" +
      "\001\022:\n,cost_per_current_model_attributed_c" +
      "onversion\030\254\001 \001(\001H>\210\001\001\022&\n\030cross_device_co" +
      "nversions\030\255\001 \001(\001H?\210\001\001\0223\n%cross_device_co" +
      "nversions_value_micros\030\270\002 \001(\003H@\210\001\001\022\021\n\003ct" +
      "r\030\256\001 \001(\001HA\210\001\001\0222\n$current_model_attribute" +
      "d_conversions\030\257\001 \001(\001HB\210\001\001\022I\n;current_mod" +
      "el_attributed_conversions_from_interacti" +
      "ons_rate\030\260\001 \001(\001HC\210\001\001\022Z\nLcurrent_model_at" +
      "tributed_conversions_from_interactions_v" +
      "alue_per_interaction\030\261\001 \001(\001HD\210\001\001\0228\n*curr" +
      "ent_model_attributed_conversions_value\030\262" +
      "\001 \001(\001HE\210\001\001\022A\n3current_model_attributed_c" +
      "onversions_value_per_cost\030\263\001 \001(\001HF\210\001\001\022\035\n" +
      "\017engagement_rate\030\264\001 \001(\001HG\210\001\001\022\031\n\013engageme" +
      "nts\030\265\001 \001(\003HH\210\001\001\022-\n\037hotel_average_lead_va" +
      "lue_micros\030\325\001 \001(\001HI\210\001\001\022*\n\034hotel_commissi" +
      "on_rate_micros\030\200\002 \001(\003HJ\210\001\001\022,\n\036hotel_expe" +
      "cted_commission_cost\030\201\002 \001(\001HK\210\001\001\022/\n!hote" +
      "l_price_difference_percentage\030\326\001 \001(\001HL\210\001" +
      "\001\022(\n\032hotel_eligible_impressions\030\327\001 \001(\003HM" +
      "\210\001\001\022t\n!historical_creative_quality_score" +
      "\030P \001(\0162I.google.ads.googleads.v19.enums." +
      "QualityScoreBucketEnum.QualityScoreBucke" +
      "t\022x\n%historical_landing_page_quality_sco" +
      "re\030Q \001(\0162I.google.ads.googleads.v19.enum" +
      "s.QualityScoreBucketEnum.QualityScoreBuc" +
      "ket\022&\n\030historical_quality_score\030\330\001 \001(\003HN" +
      "\210\001\001\022r\n\037historical_search_predicted_ctr\030S" +
      " \001(\0162I.google.ads.googleads.v19.enums.Qu" +
      "alityScoreBucketEnum.QualityScoreBucket\022" +
      "\034\n\016gmail_forwards\030\331\001 \001(\003HO\210\001\001\022\031\n\013gmail_s" +
      "aves\030\332\001 \001(\003HP\210\001\001\022$\n\026gmail_secondary_clic" +
      "ks\030\333\001 \001(\003HQ\210\001\001\022*\n\034impressions_from_store" +
      "_reach\030\334\001 \001(\003HR\210\001\001\022\031\n\013impressions\030\335\001 \001(\003" +
      "HS\210\001\001\022\036\n\020interaction_rate\030\336\001 \001(\001HT\210\001\001\022\032\n" +
      "\014interactions\030\337\001 \001(\003HU\210\001\001\022n\n\027interaction" +
      "_event_types\030d \003(\0162M.google.ads.googlead" +
      "s.v19.enums.InteractionEventTypeEnum.Int" +
      "eractionEventType\022 \n\022invalid_click_rate\030" +
      "\340\001 \001(\001HV\210\001\001\022\034\n\016invalid_clicks\030\341\001 \001(\003HW\210\001" +
      "\001\022(\n\032general_invalid_click_rate\030\362\002 \001(\001HX" +
      "\210\001\001\022$\n\026general_invalid_clicks\030\363\002 \001(\003HY\210\001" +
      "\001\022\033\n\rmessage_chats\030\342\001 \001(\003HZ\210\001\001\022!\n\023messag" +
      "e_impressions\030\343\001 \001(\003H[\210\001\001\022\037\n\021message_cha" +
      "t_rate\030\344\001 \001(\001H\\\210\001\001\022/\n!mobile_friendly_cl" +
      "icks_percentage\030\345\001 \001(\001H]\210\001\001\022\'\n\031optimizat" +
      "ion_score_uplift\030\367\001 \001(\001H^\210\001\001\022$\n\026optimiza" +
      "tion_score_url\030\370\001 \001(\tH_\210\001\001\022\034\n\016organic_cl" +
      "icks\030\346\001 \001(\003H`\210\001\001\022&\n\030organic_clicks_per_q" +
      "uery\030\347\001 \001(\001Ha\210\001\001\022!\n\023organic_impressions\030" +
      "\350\001 \001(\003Hb\210\001\001\022+\n\035organic_impressions_per_q" +
      "uery\030\351\001 \001(\001Hc\210\001\001\022\035\n\017organic_queries\030\352\001 \001" +
      "(\003Hd\210\001\001\022\"\n\024percent_new_visitors\030\353\001 \001(\001He" +
      "\210\001\001\022\031\n\013phone_calls\030\354\001 \001(\003Hf\210\001\001\022\037\n\021phone_" +
      "impressions\030\355\001 \001(\003Hg\210\001\001\022 \n\022phone_through" +
      "_rate\030\356\001 \001(\001Hh\210\001\001\022\032\n\014relative_ctr\030\357\001 \001(\001" +
      "Hi\210\001\001\0222\n$search_absolute_top_impression_" +
      "share\030\210\001 \001(\001Hj\210\001\001\022>\n0search_budget_lost_" +
      "absolute_top_impression_share\030\211\001 \001(\001Hk\210\001" +
      "\001\0221\n#search_budget_lost_impression_share" +
      "\030\212\001 \001(\001Hl\210\001\001\0225\n\'search_budget_lost_top_i" +
      "mpression_share\030\213\001 \001(\001Hm\210\001\001\022 \n\022search_cl" +
      "ick_share\030\214\001 \001(\001Hn\210\001\001\0221\n#search_exact_ma" +
      "tch_impression_share\030\215\001 \001(\001Ho\210\001\001\022%\n\027sear" +
      "ch_impression_share\030\216\001 \001(\001Hp\210\001\001\022<\n.searc" +
      "h_rank_lost_absolute_top_impression_shar" +
      "e\030\217\001 \001(\001Hq\210\001\001\022/\n!search_rank_lost_impres" +
      "sion_share\030\220\001 \001(\001Hr\210\001\001\0223\n%search_rank_lo" +
      "st_top_impression_share\030\221\001 \001(\001Hs\210\001\001\022)\n\033s" +
      "earch_top_impression_share\030\222\001 \001(\001Ht\210\001\001\022O" +
      "\n\rsearch_volume\030\247\002 \001(\01322.google.ads.goog" +
      "leads.v19.common.SearchVolumeRangeHu\210\001\001\022" +
      "\031\n\013speed_score\030\223\001 \001(\003Hv\210\001\001\022\'\n\031average_ta" +
      "rget_cpa_micros\030\242\002 \001(\003Hw\210\001\001\022!\n\023average_t" +
      "arget_roas\030\372\001 \001(\001Hx\210\001\001\022\'\n\031top_impression" +
      "_percentage\030\224\001 \001(\001Hy\210\001\001\022>\n0valid_acceler" +
      "ated_mobile_pages_clicks_percentage\030\225\001 \001" +
      "(\001Hz\210\001\001\022\'\n\031value_per_all_conversions\030\226\001 " +
      "\001(\001H{\210\001\001\022:\n,value_per_all_conversions_by" +
      "_conversion_date\030\364\001 \001(\001H|\210\001\001\022\"\n\024value_pe" +
      "r_conversion\030\227\001 \001(\001H}\210\001\001\0226\n(value_per_co" +
      "nversions_by_conversion_date\030\365\001 \001(\001H~\210\001\001" +
      "\022;\n-value_per_current_model_attributed_c" +
      "onversion\030\230\001 \001(\001H\177\210\001\001\022\'\n\030video_quartile_" +
      "p100_rate\030\204\001 \001(\001H\200\001\210\001\001\022&\n\027video_quartile" +
      "_p25_rate\030\205\001 \001(\001H\201\001\210\001\001\022&\n\027video_quartile" +
      "_p50_rate\030\206\001 \001(\001H\202\001\210\001\001\022&\n\027video_quartile" +
      "_p75_rate\030\207\001 \001(\001H\203\001\210\001\001\022\036\n\017video_view_rat" +
      "e\030\231\001 \001(\001H\204\001\210\001\001\022\032\n\013video_views\030\232\001 \001(\003H\205\001\210" +
      "\001\001\022\'\n\030view_through_conversions\030\233\001 \001(\003H\206\001" +
      "\210\001\001\022\037\n\026sk_ad_network_installs\030\366\001 \001(\003\022(\n\037" +
      "sk_ad_network_total_conversions\030\244\002 \001(\003\022#" +
      "\n\032publisher_purchased_clicks\030\210\002 \001(\003\022!\n\030p" +
      "ublisher_organic_clicks\030\211\002 \001(\003\022!\n\030publis" +
      "her_unknown_clicks\030\212\002 \001(\003\022@\n1all_convers" +
      "ions_from_location_asset_click_to_call\030\213" +
      "\002 \001(\001H\207\001\210\001\001\022=\n.all_conversions_from_loca" +
      "tion_asset_directions\030\214\002 \001(\001H\210\001\210\001\001\0227\n(al" +
      "l_conversions_from_location_asset_menu\030\215" +
      "\002 \001(\001H\211\001\210\001\001\0228\n)all_conversions_from_loca" +
      "tion_asset_order\030\216\002 \001(\001H\212\001\210\001\001\022C\n4all_con" +
      "versions_from_location_asset_other_engag" +
      "ement\030\217\002 \001(\001H\213\001\210\001\001\022?\n0all_conversions_fr" +
      "om_location_asset_store_visits\030\220\002 \001(\001H\214\001" +
      "\210\001\001\022:\n+all_conversions_from_location_ass" +
      "et_website\030\221\002 \001(\001H\215\001\210\001\001\022C\n4eligible_impr" +
      "essions_from_location_asset_store_reach\030" +
      "\222\002 \001(\003H\216\001\210\001\001\022I\n:view_through_conversions" +
      "_from_location_asset_click_to_call\030\223\002 \001(" +
      "\001H\217\001\210\001\001\022F\n7view_through_conversions_from" +
      "_location_asset_directions\030\224\002 \001(\001H\220\001\210\001\001\022" +
      "@\n1view_through_conversions_from_locatio" +
      "n_asset_menu\030\225\002 \001(\001H\221\001\210\001\001\022A\n2view_throug" +
      "h_conversions_from_location_asset_order\030" +
      "\226\002 \001(\001H\222\001\210\001\001\022L\n=view_through_conversions" +
      "_from_location_asset_other_engagement\030\227\002" +
      " \001(\001H\223\001\210\001\001\022H\n9view_through_conversions_f" +
      "rom_location_asset_store_visits\030\230\002 \001(\001H\224" +
      "\001\210\001\001\022C\n4view_through_conversions_from_lo" +
      "cation_asset_website\030\231\002 \001(\001H\225\001\210\001\001\022\025\n\006ord" +
      "ers\030\250\002 \001(\001H\226\001\210\001\001\022)\n\032average_order_value_" +
      "micros\030\251\002 \001(\003H\227\001\210\001\001\022 \n\021average_cart_size" +
      "\030\252\002 \001(\001H\230\001\210\001\001\022(\n\031cost_of_goods_sold_micr" +
      "os\030\253\002 \001(\003H\231\001\210\001\001\022\"\n\023gross_profit_micros\030\254" +
      "\002 \001(\003H\232\001\210\001\001\022\"\n\023gross_profit_margin\030\255\002 \001(" +
      "\001H\233\001\210\001\001\022\035\n\016revenue_micros\030\256\002 \001(\003H\234\001\210\001\001\022\031" +
      "\n\nunits_sold\030\257\002 \001(\001H\235\001\210\001\001\0223\n$cross_sell_" +
      "cost_of_goods_sold_micros\030\260\002 \001(\003H\236\001\210\001\001\022-" +
      "\n\036cross_sell_gross_profit_micros\030\261\002 \001(\003H" +
      "\237\001\210\001\001\022(\n\031cross_sell_revenue_micros\030\262\002 \001(" +
      "\003H\240\001\210\001\001\022$\n\025cross_sell_units_sold\030\263\002 \001(\001H" +
      "\241\001\210\001\001\022-\n\036lead_cost_of_goods_sold_micros\030" +
      "\264\002 \001(\003H\242\001\210\001\001\022\'\n\030lead_gross_profit_micros" +
      "\030\265\002 \001(\003H\243\001\210\001\001\022\"\n\023lead_revenue_micros\030\266\002 " +
      "\001(\003H\244\001\210\001\001\022\036\n\017lead_units_sold\030\267\002 \001(\001H\245\001\210\001" +
      "\001\022\033\n\014unique_users\030\277\002 \001(\003H\246\001\210\001\001\0224\n%averag" +
      "e_impression_frequency_per_user\030\300\002 \001(\001H\247" +
      "\001\210\001\001\022$\n\025linked_entities_count\030\325\002 \001(\003H\250\001\210" +
      "\001\001\022\037\n\026linked_sample_entities\030\326\002 \003(\t\022)\n s" +
      "ample_best_performance_entities\030\327\002 \003(\t\022)" +
      "\n sample_good_performance_entities\030\330\002 \003(" +
      "\t\022(\n\037sample_low_performance_entities\030\331\002 " +
      "\003(\t\022-\n$sample_learning_performance_entit" +
      "ies\030\332\002 \003(\t\022,\n#sample_unrated_performance" +
      "_entities\030\333\002 \003(\t\022\'\n\030asset_pinned_total_c" +
      "ount\030\334\002 \001(\003H\251\001\210\001\001\022:\n+asset_pinned_as_hea" +
      "dline_position_one_count\030\335\002 \001(\003H\252\001\210\001\001\022:\n" +
      "+asset_pinned_as_headline_position_two_c" +
      "ount\030\336\002 \001(\003H\253\001\210\001\001\022<\n-asset_pinned_as_hea" +
      "dline_position_three_count\030\337\002 \001(\003H\254\001\210\001\001\022" +
      "=\n.asset_pinned_as_description_position_" +
      "one_count\030\340\002 \001(\003H\255\001\210\001\001\022=\n.asset_pinned_a" +
      "s_description_position_two_count\030\341\002 \001(\003H" +
      "\256\001\210\001\001\022;\n,asset_best_performance_impressi" +
      "on_percentage\030\342\002 \001(\001H\257\001\210\001\001\022;\n,asset_good" +
      "_performance_impression_percentage\030\343\002 \001(" +
      "\001H\260\001\210\001\001\022:\n+asset_low_performance_impress" +
      "ion_percentage\030\344\002 \001(\001H\261\001\210\001\001\022?\n0asset_lea" +
      "rning_performance_impression_percentage\030" +
      "\345\002 \001(\001H\262\001\210\001\001\022>\n/asset_unrated_performanc" +
      "e_impression_percentage\030\346\002 \001(\001H\263\001\210\001\001\0225\n&" +
      "asset_best_performance_cost_percentage\030\347" +
      "\002 \001(\001H\264\001\210\001\001\0225\n&asset_good_performance_co" +
      "st_percentage\030\350\002 \001(\001H\265\001\210\001\001\0224\n%asset_low_" +
      "performance_cost_percentage\030\351\002 \001(\001H\266\001\210\001\001" +
      "\0229\n*asset_learning_performance_cost_perc" +
      "entage\030\352\002 \001(\001H\267\001\210\001\001\0228\n)asset_unrated_per" +
      "formance_cost_percentage\030\353\002 \001(\001H\270\001\210\001\001\022C\n" +
      "4store_visits_last_click_model_attribute" +
      "d_conversions\030\355\002 \001(\001H\271\001\210\001\001\022+\n\034results_co" +
      "nversions_purchase\030\356\002 \001(\001H\272\001\210\001\001\022&\n\027video" +
      "_view_rate_in_feed\030\357\002 \001(\001H\273\001\210\001\001\022(\n\031video" +
      "_view_rate_in_stream\030\360\002 \001(\001H\274\001\210\001\001\022%\n\026vid" +
      "eo_view_rate_shorts\030\361\002 \001(\001H\275\001\210\001\001\022#\n\024covi" +
      "ewed_impressions\030\374\002 \001(\003H\276\001\210\001\001\022\"\n\023primary" +
      "_impressions\030\375\002 \001(\003H\277\001\210\001\001B%\n#_absolute_t" +
      "op_impression_percentageB\022\n\020_active_view" +
      "_cpmB\022\n\020_active_view_ctrB\032\n\030_active_view" +
      "_impressionsB\034\n\032_active_view_measurabili" +
      "tyB%\n#_active_view_measurable_cost_micro" +
      "sB%\n#_active_view_measurable_impressions" +
      "B\032\n\030_active_view_viewabilityB)\n\'_all_con" +
      "versions_from_interactions_rateB\030\n\026_all_" +
      "conversions_valueB+\n)_all_conversions_va" +
      "lue_by_conversion_dateB\"\n _all_new_custo" +
      "mer_lifetime_valueB\022\n\020_all_conversionsB%" +
      "\n#_all_conversions_by_conversion_dateB!\n" +
      "\037_all_conversions_value_per_costB%\n#_all" +
      "_conversions_from_click_to_callB\"\n _all_" +
      "conversions_from_directionsB:\n8_all_conv" +
      "ersions_from_interactions_value_per_inte" +
      "ractionB\034\n\032_all_conversions_from_menuB\035\n" +
      "\033_all_conversions_from_orderB(\n&_all_con" +
      "versions_from_other_engagementB#\n!_all_c" +
      "onversions_from_store_visitB%\n#_all_conv" +
      "ersions_from_store_websiteB<\n:_auction_i" +
      "nsight_search_absolute_top_impression_pe" +
      "rcentageB*\n(_auction_insight_search_impr" +
      "ession_shareB*\n(_auction_insight_search_" +
      "outranking_shareB&\n$_auction_insight_sea" +
      "rch_overlap_rateB-\n+_auction_insight_sea" +
      "rch_position_above_rateB3\n1_auction_insi" +
      "ght_search_top_impression_percentageB\017\n\r" +
      "_average_costB\016\n\014_average_cpcB\016\n\014_averag" +
      "e_cpeB\016\n\014_average_cpmB\016\n\014_average_cpvB\025\n" +
      "\023_average_page_viewsB\027\n\025_average_time_on" +
      "_siteB\034\n\032_benchmark_average_max_cpcB#\n!_" +
      "biddable_app_install_conversionsB(\n&_bid" +
      "dable_app_post_install_conversionsB/\n-_b" +
      "iddable_cohort_app_post_install_conversi" +
      "onsB\020\n\016_benchmark_ctrB\016\n\014_bounce_rateB\t\n" +
      "\007_clicksB\022\n\020_combined_clicksB\034\n\032_combine" +
      "d_clicks_per_queryB\023\n\021_combined_queriesB" +
      "\'\n%_content_budget_lost_impression_share" +
      "B\033\n\031_content_impression_shareB-\n+_conver" +
      "sion_last_received_request_date_timeB\"\n " +
      "_conversion_last_conversion_dateB%\n#_con" +
      "tent_rank_lost_impression_shareB%\n#_conv" +
      "ersions_from_interactions_rateB\024\n\022_conve" +
      "rsions_valueB\'\n%_conversions_value_by_co" +
      "nversion_dateB\036\n\034_new_customer_lifetime_" +
      "valueB\035\n\033_conversions_value_per_costB6\n4" +
      "_conversions_from_interactions_value_per" +
      "_interactionB\016\n\014_conversionsB!\n\037_convers" +
      "ions_by_conversion_dateB\016\n\014_cost_microsB" +
      "\033\n\031_cost_per_all_conversionsB\026\n\024_cost_pe" +
      "r_conversionB/\n-_cost_per_current_model_" +
      "attributed_conversionB\033\n\031_cross_device_c" +
      "onversionsB(\n&_cross_device_conversions_" +
      "value_microsB\006\n\004_ctrB\'\n%_current_model_a" +
      "ttributed_conversionsB>\n<_current_model_" +
      "attributed_conversions_from_interactions" +
      "_rateBO\nM_current_model_attributed_conve" +
      "rsions_from_interactions_value_per_inter" +
      "actionB-\n+_current_model_attributed_conv" +
      "ersions_valueB6\n4_current_model_attribut" +
      "ed_conversions_value_per_costB\022\n\020_engage" +
      "ment_rateB\016\n\014_engagementsB\"\n _hotel_aver" +
      "age_lead_value_microsB\037\n\035_hotel_commissi" +
      "on_rate_microsB!\n\037_hotel_expected_commis" +
      "sion_costB$\n\"_hotel_price_difference_per" +
      "centageB\035\n\033_hotel_eligible_impressionsB\033" +
      "\n\031_historical_quality_scoreB\021\n\017_gmail_fo" +
      "rwardsB\016\n\014_gmail_savesB\031\n\027_gmail_seconda" +
      "ry_clicksB\037\n\035_impressions_from_store_rea" +
      "chB\016\n\014_impressionsB\023\n\021_interaction_rateB" +
      "\017\n\r_interactionsB\025\n\023_invalid_click_rateB" +
      "\021\n\017_invalid_clicksB\035\n\033_general_invalid_c" +
      "lick_rateB\031\n\027_general_invalid_clicksB\020\n\016" +
      "_message_chatsB\026\n\024_message_impressionsB\024" +
      "\n\022_message_chat_rateB$\n\"_mobile_friendly" +
      "_clicks_percentageB\034\n\032_optimization_scor" +
      "e_upliftB\031\n\027_optimization_score_urlB\021\n\017_" +
      "organic_clicksB\033\n\031_organic_clicks_per_qu" +
      "eryB\026\n\024_organic_impressionsB \n\036_organic_" +
      "impressions_per_queryB\022\n\020_organic_querie" +
      "sB\027\n\025_percent_new_visitorsB\016\n\014_phone_cal" +
      "lsB\024\n\022_phone_impressionsB\025\n\023_phone_throu" +
      "gh_rateB\017\n\r_relative_ctrB\'\n%_search_abso" +
      "lute_top_impression_shareB3\n1_search_bud" +
      "get_lost_absolute_top_impression_shareB&" +
      "\n$_search_budget_lost_impression_shareB*" +
      "\n(_search_budget_lost_top_impression_sha" +
      "reB\025\n\023_search_click_shareB&\n$_search_exa" +
      "ct_match_impression_shareB\032\n\030_search_imp" +
      "ression_shareB1\n/_search_rank_lost_absol" +
      "ute_top_impression_shareB$\n\"_search_rank" +
      "_lost_impression_shareB(\n&_search_rank_l" +
      "ost_top_impression_shareB\036\n\034_search_top_" +
      "impression_shareB\020\n\016_search_volumeB\016\n\014_s" +
      "peed_scoreB\034\n\032_average_target_cpa_micros" +
      "B\026\n\024_average_target_roasB\034\n\032_top_impress" +
      "ion_percentageB3\n1_valid_accelerated_mob" +
      "ile_pages_clicks_percentageB\034\n\032_value_pe" +
      "r_all_conversionsB/\n-_value_per_all_conv" +
      "ersions_by_conversion_dateB\027\n\025_value_per" +
      "_conversionB+\n)_value_per_conversions_by" +
      "_conversion_dateB0\n._value_per_current_m" +
      "odel_attributed_conversionB\033\n\031_video_qua" +
      "rtile_p100_rateB\032\n\030_video_quartile_p25_r" +
      "ateB\032\n\030_video_quartile_p50_rateB\032\n\030_vide" +
      "o_quartile_p75_rateB\022\n\020_video_view_rateB" +
      "\016\n\014_video_viewsB\033\n\031_view_through_convers" +
      "ionsB4\n2_all_conversions_from_location_a" +
      "sset_click_to_callB1\n/_all_conversions_f" +
      "rom_location_asset_directionsB+\n)_all_co" +
      "nversions_from_location_asset_menuB,\n*_a" +
      "ll_conversions_from_location_asset_order" +
      "B7\n5_all_conversions_from_location_asset" +
      "_other_engagementB3\n1_all_conversions_fr" +
      "om_location_asset_store_visitsB.\n,_all_c" +
      "onversions_from_location_asset_websiteB7" +
      "\n5_eligible_impressions_from_location_as" +
      "set_store_reachB=\n;_view_through_convers" +
      "ions_from_location_asset_click_to_callB:" +
      "\n8_view_through_conversions_from_locatio" +
      "n_asset_directionsB4\n2_view_through_conv" +
      "ersions_from_location_asset_menuB5\n3_vie" +
      "w_through_conversions_from_location_asse" +
      "t_orderB@\n>_view_through_conversions_fro" +
      "m_location_asset_other_engagementB<\n:_vi" +
      "ew_through_conversions_from_location_ass" +
      "et_store_visitsB7\n5_view_through_convers" +
      "ions_from_location_asset_websiteB\t\n\007_ord" +
      "ersB\035\n\033_average_order_value_microsB\024\n\022_a" +
      "verage_cart_sizeB\034\n\032_cost_of_goods_sold_" +
      "microsB\026\n\024_gross_profit_microsB\026\n\024_gross" +
      "_profit_marginB\021\n\017_revenue_microsB\r\n\013_un" +
      "its_soldB\'\n%_cross_sell_cost_of_goods_so" +
      "ld_microsB!\n\037_cross_sell_gross_profit_mi" +
      "crosB\034\n\032_cross_sell_revenue_microsB\030\n\026_c" +
      "ross_sell_units_soldB!\n\037_lead_cost_of_go" +
      "ods_sold_microsB\033\n\031_lead_gross_profit_mi" +
      "crosB\026\n\024_lead_revenue_microsB\022\n\020_lead_un" +
      "its_soldB\017\n\r_unique_usersB(\n&_average_im" +
      "pression_frequency_per_userB\030\n\026_linked_e" +
      "ntities_countB\033\n\031_asset_pinned_total_cou" +
      "ntB.\n,_asset_pinned_as_headline_position" +
      "_one_countB.\n,_asset_pinned_as_headline_" +
      "position_two_countB0\n._asset_pinned_as_h" +
      "eadline_position_three_countB1\n/_asset_p" +
      "inned_as_description_position_one_countB" +
      "1\n/_asset_pinned_as_description_position" +
      "_two_countB/\n-_asset_best_performance_im" +
      "pression_percentageB/\n-_asset_good_perfo" +
      "rmance_impression_percentageB.\n,_asset_l" +
      "ow_performance_impression_percentageB3\n1",
      "_asset_learning_performance_impression_p" +
      "ercentageB2\n0_asset_unrated_performance_" +
      "impression_percentageB)\n\'_asset_best_per" +
      "formance_cost_percentageB)\n\'_asset_good_" +
      "performance_cost_percentageB(\n&_asset_lo" +
      "w_performance_cost_percentageB-\n+_asset_" +
      "learning_performance_cost_percentageB,\n*" +
      "_asset_unrated_performance_cost_percenta" +
      "geB7\n5_store_visits_last_click_model_att" +
      "ributed_conversionsB\037\n\035_results_conversi" +
      "ons_purchaseB\032\n\030_video_view_rate_in_feed" +
      "B\034\n\032_video_view_rate_in_streamB\031\n\027_video" +
      "_view_rate_shortsB\027\n\025_coviewed_impressio" +
      "nsB\026\n\024_primary_impressions\"G\n\021SearchVolu" +
      "meRange\022\020\n\003min\030\001 \001(\003H\000\210\001\001\022\020\n\003max\030\002 \001(\003H\001" +
      "\210\001\001B\006\n\004_minB\006\n\004_maxB\354\001\n#com.google.ads.g" +
      "oogleads.v19.commonB\014MetricsProtoP\001ZEgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v19/common;common\242\002\003GAA\252\002\037Googl" +
      "e.Ads.GoogleAds.V19.Common\312\002\037Google\\Ads\\" +
      "GoogleAds\\V19\\Common\352\002#Google::Ads::Goog" +
      "leAds::V19::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v19.enums.InteractionEventTypeProto.getDescriptor(),
          com.google.ads.googleads.v19.enums.QualityScoreBucketProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v19_common_Metrics_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v19_common_Metrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_common_Metrics_descriptor,
        new java.lang.String[] { "AbsoluteTopImpressionPercentage", "ActiveViewCpm", "ActiveViewCtr", "ActiveViewImpressions", "ActiveViewMeasurability", "ActiveViewMeasurableCostMicros", "ActiveViewMeasurableImpressions", "ActiveViewViewability", "AllConversionsFromInteractionsRate", "AllConversionsValue", "AllConversionsValueByConversionDate", "AllNewCustomerLifetimeValue", "AllConversions", "AllConversionsByConversionDate", "AllConversionsValuePerCost", "AllConversionsFromClickToCall", "AllConversionsFromDirections", "AllConversionsFromInteractionsValuePerInteraction", "AllConversionsFromMenu", "AllConversionsFromOrder", "AllConversionsFromOtherEngagement", "AllConversionsFromStoreVisit", "AllConversionsFromStoreWebsite", "AuctionInsightSearchAbsoluteTopImpressionPercentage", "AuctionInsightSearchImpressionShare", "AuctionInsightSearchOutrankingShare", "AuctionInsightSearchOverlapRate", "AuctionInsightSearchPositionAboveRate", "AuctionInsightSearchTopImpressionPercentage", "AverageCost", "AverageCpc", "AverageCpe", "AverageCpm", "AverageCpv", "AveragePageViews", "AverageTimeOnSite", "BenchmarkAverageMaxCpc", "BiddableAppInstallConversions", "BiddableAppPostInstallConversions", "BiddableCohortAppPostInstallConversions", "BenchmarkCtr", "BounceRate", "Clicks", "CombinedClicks", "CombinedClicksPerQuery", "CombinedQueries", "ContentBudgetLostImpressionShare", "ContentImpressionShare", "ConversionLastReceivedRequestDateTime", "ConversionLastConversionDate", "ContentRankLostImpressionShare", "ConversionsFromInteractionsRate", "ConversionsValue", "ConversionsValueByConversionDate", "NewCustomerLifetimeValue", "ConversionsValuePerCost", "ConversionsFromInteractionsValuePerInteraction", "Conversions", "ConversionsByConversionDate", "CostMicros", "CostPerAllConversions", "CostPerConversion", "CostPerCurrentModelAttributedConversion", "CrossDeviceConversions", "CrossDeviceConversionsValueMicros", "Ctr", "CurrentModelAttributedConversions", "CurrentModelAttributedConversionsFromInteractionsRate", "CurrentModelAttributedConversionsFromInteractionsValuePerInteraction", "CurrentModelAttributedConversionsValue", "CurrentModelAttributedConversionsValuePerCost", "EngagementRate", "Engagements", "HotelAverageLeadValueMicros", "HotelCommissionRateMicros", "HotelExpectedCommissionCost", "HotelPriceDifferencePercentage", "HotelEligibleImpressions", "HistoricalCreativeQualityScore", "HistoricalLandingPageQualityScore", "HistoricalQualityScore", "HistoricalSearchPredictedCtr", "GmailForwards", "GmailSaves", "GmailSecondaryClicks", "ImpressionsFromStoreReach", "Impressions", "InteractionRate", "Interactions", "InteractionEventTypes", "InvalidClickRate", "InvalidClicks", "GeneralInvalidClickRate", "GeneralInvalidClicks", "MessageChats", "MessageImpressions", "MessageChatRate", "MobileFriendlyClicksPercentage", "OptimizationScoreUplift", "OptimizationScoreUrl", "OrganicClicks", "OrganicClicksPerQuery", "OrganicImpressions", "OrganicImpressionsPerQuery", "OrganicQueries", "PercentNewVisitors", "PhoneCalls", "PhoneImpressions", "PhoneThroughRate", "RelativeCtr", "SearchAbsoluteTopImpressionShare", "SearchBudgetLostAbsoluteTopImpressionShare", "SearchBudgetLostImpressionShare", "SearchBudgetLostTopImpressionShare", "SearchClickShare", "SearchExactMatchImpressionShare", "SearchImpressionShare", "SearchRankLostAbsoluteTopImpressionShare", "SearchRankLostImpressionShare", "SearchRankLostTopImpressionShare", "SearchTopImpressionShare", "SearchVolume", "SpeedScore", "AverageTargetCpaMicros", "AverageTargetRoas", "TopImpressionPercentage", "ValidAcceleratedMobilePagesClicksPercentage", "ValuePerAllConversions", "ValuePerAllConversionsByConversionDate", "ValuePerConversion", "ValuePerConversionsByConversionDate", "ValuePerCurrentModelAttributedConversion", "VideoQuartileP100Rate", "VideoQuartileP25Rate", "VideoQuartileP50Rate", "VideoQuartileP75Rate", "VideoViewRate", "VideoViews", "ViewThroughConversions", "SkAdNetworkInstalls", "SkAdNetworkTotalConversions", "PublisherPurchasedClicks", "PublisherOrganicClicks", "PublisherUnknownClicks", "AllConversionsFromLocationAssetClickToCall", "AllConversionsFromLocationAssetDirections", "AllConversionsFromLocationAssetMenu", "AllConversionsFromLocationAssetOrder", "AllConversionsFromLocationAssetOtherEngagement", "AllConversionsFromLocationAssetStoreVisits", "AllConversionsFromLocationAssetWebsite", "EligibleImpressionsFromLocationAssetStoreReach", "ViewThroughConversionsFromLocationAssetClickToCall", "ViewThroughConversionsFromLocationAssetDirections", "ViewThroughConversionsFromLocationAssetMenu", "ViewThroughConversionsFromLocationAssetOrder", "ViewThroughConversionsFromLocationAssetOtherEngagement", "ViewThroughConversionsFromLocationAssetStoreVisits", "ViewThroughConversionsFromLocationAssetWebsite", "Orders", "AverageOrderValueMicros", "AverageCartSize", "CostOfGoodsSoldMicros", "GrossProfitMicros", "GrossProfitMargin", "RevenueMicros", "UnitsSold", "CrossSellCostOfGoodsSoldMicros", "CrossSellGrossProfitMicros", "CrossSellRevenueMicros", "CrossSellUnitsSold", "LeadCostOfGoodsSoldMicros", "LeadGrossProfitMicros", "LeadRevenueMicros", "LeadUnitsSold", "UniqueUsers", "AverageImpressionFrequencyPerUser", "LinkedEntitiesCount", "LinkedSampleEntities", "SampleBestPerformanceEntities", "SampleGoodPerformanceEntities", "SampleLowPerformanceEntities", "SampleLearningPerformanceEntities", "SampleUnratedPerformanceEntities", "AssetPinnedTotalCount", "AssetPinnedAsHeadlinePositionOneCount", "AssetPinnedAsHeadlinePositionTwoCount", "AssetPinnedAsHeadlinePositionThreeCount", "AssetPinnedAsDescriptionPositionOneCount", "AssetPinnedAsDescriptionPositionTwoCount", "AssetBestPerformanceImpressionPercentage", "AssetGoodPerformanceImpressionPercentage", "AssetLowPerformanceImpressionPercentage", "AssetLearningPerformanceImpressionPercentage", "AssetUnratedPerformanceImpressionPercentage", "AssetBestPerformanceCostPercentage", "AssetGoodPerformanceCostPercentage", "AssetLowPerformanceCostPercentage", "AssetLearningPerformanceCostPercentage", "AssetUnratedPerformanceCostPercentage", "StoreVisitsLastClickModelAttributedConversions", "ResultsConversionsPurchase", "VideoViewRateInFeed", "VideoViewRateInStream", "VideoViewRateShorts", "CoviewedImpressions", "PrimaryImpressions", });
    internal_static_google_ads_googleads_v19_common_SearchVolumeRange_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v19_common_SearchVolumeRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v19_common_SearchVolumeRange_descriptor,
        new java.lang.String[] { "Min", "Max", });
    com.google.ads.googleads.v19.enums.InteractionEventTypeProto.getDescriptor();
    com.google.ads.googleads.v19.enums.QualityScoreBucketProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v18/services/audience_insights_service.proto

// Protobuf Java Version: 3.25.7
package com.google.ads.googleads.v18.services;

public interface InsightsAudienceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v18.services.InsightsAudience)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The countries for the audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.LocationInfo country_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v18.common.LocationInfo> 
      getCountryLocationsList();
  /**
   * <pre>
   * Required. The countries for the audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.LocationInfo country_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v18.common.LocationInfo getCountryLocations(int index);
  /**
   * <pre>
   * Required. The countries for the audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.LocationInfo country_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getCountryLocationsCount();
  /**
   * <pre>
   * Required. The countries for the audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.LocationInfo country_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v18.common.LocationInfoOrBuilder> 
      getCountryLocationsOrBuilderList();
  /**
   * <pre>
   * Required. The countries for the audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.LocationInfo country_locations = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v18.common.LocationInfoOrBuilder getCountryLocationsOrBuilder(
      int index);

  /**
   * <pre>
   * Sub-country geographic location attributes.  If present, each of these
   * must be contained in one of the countries in this audience.  If absent, the
   * audience is geographically to the country_locations and no further.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.LocationInfo sub_country_locations = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v18.common.LocationInfo> 
      getSubCountryLocationsList();
  /**
   * <pre>
   * Sub-country geographic location attributes.  If present, each of these
   * must be contained in one of the countries in this audience.  If absent, the
   * audience is geographically to the country_locations and no further.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.LocationInfo sub_country_locations = 2;</code>
   */
  com.google.ads.googleads.v18.common.LocationInfo getSubCountryLocations(int index);
  /**
   * <pre>
   * Sub-country geographic location attributes.  If present, each of these
   * must be contained in one of the countries in this audience.  If absent, the
   * audience is geographically to the country_locations and no further.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.LocationInfo sub_country_locations = 2;</code>
   */
  int getSubCountryLocationsCount();
  /**
   * <pre>
   * Sub-country geographic location attributes.  If present, each of these
   * must be contained in one of the countries in this audience.  If absent, the
   * audience is geographically to the country_locations and no further.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.LocationInfo sub_country_locations = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v18.common.LocationInfoOrBuilder> 
      getSubCountryLocationsOrBuilderList();
  /**
   * <pre>
   * Sub-country geographic location attributes.  If present, each of these
   * must be contained in one of the countries in this audience.  If absent, the
   * audience is geographically to the country_locations and no further.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.LocationInfo sub_country_locations = 2;</code>
   */
  com.google.ads.googleads.v18.common.LocationInfoOrBuilder getSubCountryLocationsOrBuilder(
      int index);

  /**
   * <pre>
   * Gender for the audience.  If absent, the audience does not restrict by
   * gender.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.GenderInfo gender = 3;</code>
   * @return Whether the gender field is set.
   */
  boolean hasGender();
  /**
   * <pre>
   * Gender for the audience.  If absent, the audience does not restrict by
   * gender.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.GenderInfo gender = 3;</code>
   * @return The gender.
   */
  com.google.ads.googleads.v18.common.GenderInfo getGender();
  /**
   * <pre>
   * Gender for the audience.  If absent, the audience does not restrict by
   * gender.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.GenderInfo gender = 3;</code>
   */
  com.google.ads.googleads.v18.common.GenderInfoOrBuilder getGenderOrBuilder();

  /**
   * <pre>
   * Age ranges for the audience.  If absent, the audience represents all people
   * over 18 that match the other attributes.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.AgeRangeInfo age_ranges = 4;</code>
   */
  java.util.List<com.google.ads.googleads.v18.common.AgeRangeInfo> 
      getAgeRangesList();
  /**
   * <pre>
   * Age ranges for the audience.  If absent, the audience represents all people
   * over 18 that match the other attributes.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.AgeRangeInfo age_ranges = 4;</code>
   */
  com.google.ads.googleads.v18.common.AgeRangeInfo getAgeRanges(int index);
  /**
   * <pre>
   * Age ranges for the audience.  If absent, the audience represents all people
   * over 18 that match the other attributes.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.AgeRangeInfo age_ranges = 4;</code>
   */
  int getAgeRangesCount();
  /**
   * <pre>
   * Age ranges for the audience.  If absent, the audience represents all people
   * over 18 that match the other attributes.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.AgeRangeInfo age_ranges = 4;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v18.common.AgeRangeInfoOrBuilder> 
      getAgeRangesOrBuilderList();
  /**
   * <pre>
   * Age ranges for the audience.  If absent, the audience represents all people
   * over 18 that match the other attributes.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.AgeRangeInfo age_ranges = 4;</code>
   */
  com.google.ads.googleads.v18.common.AgeRangeInfoOrBuilder getAgeRangesOrBuilder(
      int index);

  /**
   * <pre>
   * Parental status for the audience.  If absent, the audience does not
   * restrict by parental status.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.ParentalStatusInfo parental_status = 5;</code>
   * @return Whether the parentalStatus field is set.
   */
  boolean hasParentalStatus();
  /**
   * <pre>
   * Parental status for the audience.  If absent, the audience does not
   * restrict by parental status.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.ParentalStatusInfo parental_status = 5;</code>
   * @return The parentalStatus.
   */
  com.google.ads.googleads.v18.common.ParentalStatusInfo getParentalStatus();
  /**
   * <pre>
   * Parental status for the audience.  If absent, the audience does not
   * restrict by parental status.
   * </pre>
   *
   * <code>.google.ads.googleads.v18.common.ParentalStatusInfo parental_status = 5;</code>
   */
  com.google.ads.googleads.v18.common.ParentalStatusInfoOrBuilder getParentalStatusOrBuilder();

  /**
   * <pre>
   * Household income percentile ranges for the audience.  If absent, the
   * audience does not restrict by household income range.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.IncomeRangeInfo income_ranges = 6;</code>
   */
  java.util.List<com.google.ads.googleads.v18.common.IncomeRangeInfo> 
      getIncomeRangesList();
  /**
   * <pre>
   * Household income percentile ranges for the audience.  If absent, the
   * audience does not restrict by household income range.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.IncomeRangeInfo income_ranges = 6;</code>
   */
  com.google.ads.googleads.v18.common.IncomeRangeInfo getIncomeRanges(int index);
  /**
   * <pre>
   * Household income percentile ranges for the audience.  If absent, the
   * audience does not restrict by household income range.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.IncomeRangeInfo income_ranges = 6;</code>
   */
  int getIncomeRangesCount();
  /**
   * <pre>
   * Household income percentile ranges for the audience.  If absent, the
   * audience does not restrict by household income range.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.IncomeRangeInfo income_ranges = 6;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v18.common.IncomeRangeInfoOrBuilder> 
      getIncomeRangesOrBuilderList();
  /**
   * <pre>
   * Household income percentile ranges for the audience.  If absent, the
   * audience does not restrict by household income range.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.common.IncomeRangeInfo income_ranges = 6;</code>
   */
  com.google.ads.googleads.v18.common.IncomeRangeInfoOrBuilder getIncomeRangesOrBuilder(
      int index);

  /**
   * <pre>
   * Dynamic lineups representing the YouTube content viewed by the audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.AudienceInsightsDynamicLineup dynamic_lineups = 7;</code>
   */
  java.util.List<com.google.ads.googleads.v18.services.AudienceInsightsDynamicLineup> 
      getDynamicLineupsList();
  /**
   * <pre>
   * Dynamic lineups representing the YouTube content viewed by the audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.AudienceInsightsDynamicLineup dynamic_lineups = 7;</code>
   */
  com.google.ads.googleads.v18.services.AudienceInsightsDynamicLineup getDynamicLineups(int index);
  /**
   * <pre>
   * Dynamic lineups representing the YouTube content viewed by the audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.AudienceInsightsDynamicLineup dynamic_lineups = 7;</code>
   */
  int getDynamicLineupsCount();
  /**
   * <pre>
   * Dynamic lineups representing the YouTube content viewed by the audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.AudienceInsightsDynamicLineup dynamic_lineups = 7;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v18.services.AudienceInsightsDynamicLineupOrBuilder> 
      getDynamicLineupsOrBuilderList();
  /**
   * <pre>
   * Dynamic lineups representing the YouTube content viewed by the audience.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.AudienceInsightsDynamicLineup dynamic_lineups = 7;</code>
   */
  com.google.ads.googleads.v18.services.AudienceInsightsDynamicLineupOrBuilder getDynamicLineupsOrBuilder(
      int index);

  /**
   * <pre>
   * A combination of entity, category and user interest attributes defining the
   * audience. The combination has a logical AND-of-ORs structure: Attributes
   * within each InsightsAudienceAttributeGroup are combined with OR, and
   * the combinations themselves are combined together with AND.  For example,
   * the expression (Entity OR Affinity) AND (In-Market OR Category) can be
   * formed using two InsightsAudienceAttributeGroups with two Attributes
   * each.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.InsightsAudienceAttributeGroup topic_audience_combinations = 8;</code>
   */
  java.util.List<com.google.ads.googleads.v18.services.InsightsAudienceAttributeGroup> 
      getTopicAudienceCombinationsList();
  /**
   * <pre>
   * A combination of entity, category and user interest attributes defining the
   * audience. The combination has a logical AND-of-ORs structure: Attributes
   * within each InsightsAudienceAttributeGroup are combined with OR, and
   * the combinations themselves are combined together with AND.  For example,
   * the expression (Entity OR Affinity) AND (In-Market OR Category) can be
   * formed using two InsightsAudienceAttributeGroups with two Attributes
   * each.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.InsightsAudienceAttributeGroup topic_audience_combinations = 8;</code>
   */
  com.google.ads.googleads.v18.services.InsightsAudienceAttributeGroup getTopicAudienceCombinations(int index);
  /**
   * <pre>
   * A combination of entity, category and user interest attributes defining the
   * audience. The combination has a logical AND-of-ORs structure: Attributes
   * within each InsightsAudienceAttributeGroup are combined with OR, and
   * the combinations themselves are combined together with AND.  For example,
   * the expression (Entity OR Affinity) AND (In-Market OR Category) can be
   * formed using two InsightsAudienceAttributeGroups with two Attributes
   * each.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.InsightsAudienceAttributeGroup topic_audience_combinations = 8;</code>
   */
  int getTopicAudienceCombinationsCount();
  /**
   * <pre>
   * A combination of entity, category and user interest attributes defining the
   * audience. The combination has a logical AND-of-ORs structure: Attributes
   * within each InsightsAudienceAttributeGroup are combined with OR, and
   * the combinations themselves are combined together with AND.  For example,
   * the expression (Entity OR Affinity) AND (In-Market OR Category) can be
   * formed using two InsightsAudienceAttributeGroups with two Attributes
   * each.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.InsightsAudienceAttributeGroup topic_audience_combinations = 8;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v18.services.InsightsAudienceAttributeGroupOrBuilder> 
      getTopicAudienceCombinationsOrBuilderList();
  /**
   * <pre>
   * A combination of entity, category and user interest attributes defining the
   * audience. The combination has a logical AND-of-ORs structure: Attributes
   * within each InsightsAudienceAttributeGroup are combined with OR, and
   * the combinations themselves are combined together with AND.  For example,
   * the expression (Entity OR Affinity) AND (In-Market OR Category) can be
   * formed using two InsightsAudienceAttributeGroups with two Attributes
   * each.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v18.services.InsightsAudienceAttributeGroup topic_audience_combinations = 8;</code>
   */
  com.google.ads.googleads.v18.services.InsightsAudienceAttributeGroupOrBuilder getTopicAudienceCombinationsOrBuilder(
      int index);
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v13/resources/conversion_value_rule_set.proto

package com.google.ads.googleads.v13.resources;

public interface ConversionValueRuleSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v13.resources.ConversionValueRuleSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the conversion value rule set.
   * Conversion value rule set resource names have the form:
   *
   * `customers/{customer_id}/conversionValueRuleSets/{conversion_value_rule_set_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the conversion value rule set.
   * Conversion value rule set resource names have the form:
   *
   * `customers/{customer_id}/conversionValueRuleSets/{conversion_value_rule_set_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the conversion value rule set.
   * </pre>
   *
   * <code>int64 id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Resource names of rules within the rule set.
   * </pre>
   *
   * <code>repeated string conversion_value_rules = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return A list containing the conversionValueRules.
   */
  java.util.List<java.lang.String>
      getConversionValueRulesList();
  /**
   * <pre>
   * Resource names of rules within the rule set.
   * </pre>
   *
   * <code>repeated string conversion_value_rules = 3 [(.google.api.resource_reference) = { ... }</code>
   * @return The count of conversionValueRules.
   */
  int getConversionValueRulesCount();
  /**
   * <pre>
   * Resource names of rules within the rule set.
   * </pre>
   *
   * <code>repeated string conversion_value_rules = 3 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the element to return.
   * @return The conversionValueRules at the given index.
   */
  java.lang.String getConversionValueRules(int index);
  /**
   * <pre>
   * Resource names of rules within the rule set.
   * </pre>
   *
   * <code>repeated string conversion_value_rules = 3 [(.google.api.resource_reference) = { ... }</code>
   * @param index The index of the value to return.
   * @return The bytes of the conversionValueRules at the given index.
   */
  com.google.protobuf.ByteString
      getConversionValueRulesBytes(int index);

  /**
   * <pre>
   * Defines dimensions for Value Rule conditions. The condition types of value
   * rules within this value rule set must be of these dimensions. The first
   * entry in this list is the primary dimension of the included value rules.
   * When using value rule primary dimension segmentation, conversion values
   * will be segmented into the values adjusted by value rules and the original
   * values, if some value rules apply.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.enums.ValueRuleSetDimensionEnum.ValueRuleSetDimension dimensions = 4;</code>
   * @return A list containing the dimensions.
   */
  java.util.List<com.google.ads.googleads.v13.enums.ValueRuleSetDimensionEnum.ValueRuleSetDimension> getDimensionsList();
  /**
   * <pre>
   * Defines dimensions for Value Rule conditions. The condition types of value
   * rules within this value rule set must be of these dimensions. The first
   * entry in this list is the primary dimension of the included value rules.
   * When using value rule primary dimension segmentation, conversion values
   * will be segmented into the values adjusted by value rules and the original
   * values, if some value rules apply.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.enums.ValueRuleSetDimensionEnum.ValueRuleSetDimension dimensions = 4;</code>
   * @return The count of dimensions.
   */
  int getDimensionsCount();
  /**
   * <pre>
   * Defines dimensions for Value Rule conditions. The condition types of value
   * rules within this value rule set must be of these dimensions. The first
   * entry in this list is the primary dimension of the included value rules.
   * When using value rule primary dimension segmentation, conversion values
   * will be segmented into the values adjusted by value rules and the original
   * values, if some value rules apply.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.enums.ValueRuleSetDimensionEnum.ValueRuleSetDimension dimensions = 4;</code>
   * @param index The index of the element to return.
   * @return The dimensions at the given index.
   */
  com.google.ads.googleads.v13.enums.ValueRuleSetDimensionEnum.ValueRuleSetDimension getDimensions(int index);
  /**
   * <pre>
   * Defines dimensions for Value Rule conditions. The condition types of value
   * rules within this value rule set must be of these dimensions. The first
   * entry in this list is the primary dimension of the included value rules.
   * When using value rule primary dimension segmentation, conversion values
   * will be segmented into the values adjusted by value rules and the original
   * values, if some value rules apply.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.enums.ValueRuleSetDimensionEnum.ValueRuleSetDimension dimensions = 4;</code>
   * @return A list containing the enum numeric values on the wire for dimensions.
   */
  java.util.List<java.lang.Integer>
  getDimensionsValueList();
  /**
   * <pre>
   * Defines dimensions for Value Rule conditions. The condition types of value
   * rules within this value rule set must be of these dimensions. The first
   * entry in this list is the primary dimension of the included value rules.
   * When using value rule primary dimension segmentation, conversion values
   * will be segmented into the values adjusted by value rules and the original
   * values, if some value rules apply.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.enums.ValueRuleSetDimensionEnum.ValueRuleSetDimension dimensions = 4;</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of dimensions at the given index.
   */
  int getDimensionsValue(int index);

  /**
   * <pre>
   * Output only. The resource name of the conversion value rule set's owner
   * customer. When the value rule set is inherited from a manager customer,
   * owner_customer will be the resource name of the manager whereas the
   * customer in the resource_name will be of the requesting serving customer.
   * ** Read-only **
   * </pre>
   *
   * <code>string owner_customer = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The ownerCustomer.
   */
  java.lang.String getOwnerCustomer();
  /**
   * <pre>
   * Output only. The resource name of the conversion value rule set's owner
   * customer. When the value rule set is inherited from a manager customer,
   * owner_customer will be the resource name of the manager whereas the
   * customer in the resource_name will be of the requesting serving customer.
   * ** Read-only **
   * </pre>
   *
   * <code>string owner_customer = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for ownerCustomer.
   */
  com.google.protobuf.ByteString
      getOwnerCustomerBytes();

  /**
   * <pre>
   * Immutable. Defines the scope where the conversion value rule set is
   * attached.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.ValueRuleSetAttachmentTypeEnum.ValueRuleSetAttachmentType attachment_type = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The enum numeric value on the wire for attachmentType.
   */
  int getAttachmentTypeValue();
  /**
   * <pre>
   * Immutable. Defines the scope where the conversion value rule set is
   * attached.
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.ValueRuleSetAttachmentTypeEnum.ValueRuleSetAttachmentType attachment_type = 6 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The attachmentType.
   */
  com.google.ads.googleads.v13.enums.ValueRuleSetAttachmentTypeEnum.ValueRuleSetAttachmentType getAttachmentType();

  /**
   * <pre>
   * The resource name of the campaign when the conversion value rule
   * set is attached to a campaign.
   * </pre>
   *
   * <code>string campaign = 7 [(.google.api.resource_reference) = { ... }</code>
   * @return The campaign.
   */
  java.lang.String getCampaign();
  /**
   * <pre>
   * The resource name of the campaign when the conversion value rule
   * set is attached to a campaign.
   * </pre>
   *
   * <code>string campaign = 7 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for campaign.
   */
  com.google.protobuf.ByteString
      getCampaignBytes();

  /**
   * <pre>
   * Output only. The status of the conversion value rule set.
   * ** Read-only **
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.ConversionValueRuleSetStatusEnum.ConversionValueRuleSetStatus status = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of the conversion value rule set.
   * ** Read-only **
   * </pre>
   *
   * <code>.google.ads.googleads.v13.enums.ConversionValueRuleSetStatusEnum.ConversionValueRuleSetStatus status = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v13.enums.ConversionValueRuleSetStatusEnum.ConversionValueRuleSetStatus getStatus();

  /**
   * <pre>
   * Immutable. The conversion action categories of the conversion value rule
   * set.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.enums.ConversionActionCategoryEnum.ConversionActionCategory conversion_action_categories = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return A list containing the conversionActionCategories.
   */
  java.util.List<com.google.ads.googleads.v13.enums.ConversionActionCategoryEnum.ConversionActionCategory> getConversionActionCategoriesList();
  /**
   * <pre>
   * Immutable. The conversion action categories of the conversion value rule
   * set.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.enums.ConversionActionCategoryEnum.ConversionActionCategory conversion_action_categories = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The count of conversionActionCategories.
   */
  int getConversionActionCategoriesCount();
  /**
   * <pre>
   * Immutable. The conversion action categories of the conversion value rule
   * set.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.enums.ConversionActionCategoryEnum.ConversionActionCategory conversion_action_categories = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @param index The index of the element to return.
   * @return The conversionActionCategories at the given index.
   */
  com.google.ads.googleads.v13.enums.ConversionActionCategoryEnum.ConversionActionCategory getConversionActionCategories(int index);
  /**
   * <pre>
   * Immutable. The conversion action categories of the conversion value rule
   * set.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.enums.ConversionActionCategoryEnum.ConversionActionCategory conversion_action_categories = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return A list containing the enum numeric values on the wire for conversionActionCategories.
   */
  java.util.List<java.lang.Integer>
  getConversionActionCategoriesValueList();
  /**
   * <pre>
   * Immutable. The conversion action categories of the conversion value rule
   * set.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v13.enums.ConversionActionCategoryEnum.ConversionActionCategory conversion_action_categories = 9 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of conversionActionCategories at the given index.
   */
  int getConversionActionCategoriesValue(int index);
}

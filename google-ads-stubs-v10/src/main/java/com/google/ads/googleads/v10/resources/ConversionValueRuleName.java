/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.ads.googleads.v10.resources;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@Generated("by gapic-generator-java")
public class ConversionValueRuleName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CONVERSION_VALUE_RULE_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/conversionValueRules/{conversion_value_rule_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String conversionValueRuleId;

  @Deprecated
  protected ConversionValueRuleName() {
    customerId = null;
    conversionValueRuleId = null;
  }

  private ConversionValueRuleName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    conversionValueRuleId = Preconditions.checkNotNull(builder.getConversionValueRuleId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getConversionValueRuleId() {
    return conversionValueRuleId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static ConversionValueRuleName of(String customerId, String conversionValueRuleId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setConversionValueRuleId(conversionValueRuleId)
        .build();
  }

  public static String format(String customerId, String conversionValueRuleId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setConversionValueRuleId(conversionValueRuleId)
        .build()
        .toString();
  }

  public static ConversionValueRuleName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CONVERSION_VALUE_RULE_ID.validatedMatch(
            formattedString, "ConversionValueRuleName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("conversion_value_rule_id"));
  }

  public static List<ConversionValueRuleName> parseList(List<String> formattedStrings) {
    List<ConversionValueRuleName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ConversionValueRuleName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ConversionValueRuleName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CONVERSION_VALUE_RULE_ID.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (customerId != null) {
            fieldMapBuilder.put("customer_id", customerId);
          }
          if (conversionValueRuleId != null) {
            fieldMapBuilder.put("conversion_value_rule_id", conversionValueRuleId);
          }
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return CUSTOMER_ID_CONVERSION_VALUE_RULE_ID.instantiate(
        "customer_id", customerId, "conversion_value_rule_id", conversionValueRuleId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      ConversionValueRuleName that = ((ConversionValueRuleName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.conversionValueRuleId, that.conversionValueRuleId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(conversionValueRuleId);
    return h;
  }

  /** Builder for customers/{customer_id}/conversionValueRules/{conversion_value_rule_id}. */
  public static class Builder {
    private String customerId;
    private String conversionValueRuleId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getConversionValueRuleId() {
      return conversionValueRuleId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setConversionValueRuleId(String conversionValueRuleId) {
      this.conversionValueRuleId = conversionValueRuleId;
      return this;
    }

    private Builder(ConversionValueRuleName conversionValueRuleName) {
      this.customerId = conversionValueRuleName.customerId;
      this.conversionValueRuleId = conversionValueRuleName.conversionValueRuleId;
    }

    public ConversionValueRuleName build() {
      return new ConversionValueRuleName(this);
    }
  }
}

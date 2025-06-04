/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v18.resources;

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
public class ConversionValueRuleSetName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CONVERSION_VALUE_RULE_SET_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/conversionValueRuleSets/{conversion_value_rule_set_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String conversionValueRuleSetId;

  @Deprecated
  protected ConversionValueRuleSetName() {
    customerId = null;
    conversionValueRuleSetId = null;
  }

  private ConversionValueRuleSetName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    conversionValueRuleSetId = Preconditions.checkNotNull(builder.getConversionValueRuleSetId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getConversionValueRuleSetId() {
    return conversionValueRuleSetId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static ConversionValueRuleSetName of(String customerId, String conversionValueRuleSetId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setConversionValueRuleSetId(conversionValueRuleSetId)
        .build();
  }

  public static String format(String customerId, String conversionValueRuleSetId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setConversionValueRuleSetId(conversionValueRuleSetId)
        .build()
        .toString();
  }

  public static ConversionValueRuleSetName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CONVERSION_VALUE_RULE_SET_ID.validatedMatch(
            formattedString,
            "ConversionValueRuleSetName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("conversion_value_rule_set_id"));
  }

  public static List<ConversionValueRuleSetName> parseList(List<String> formattedStrings) {
    List<ConversionValueRuleSetName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ConversionValueRuleSetName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ConversionValueRuleSetName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CONVERSION_VALUE_RULE_SET_ID.matches(formattedString);
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
          if (conversionValueRuleSetId != null) {
            fieldMapBuilder.put("conversion_value_rule_set_id", conversionValueRuleSetId);
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
    return CUSTOMER_ID_CONVERSION_VALUE_RULE_SET_ID.instantiate(
        "customer_id", customerId, "conversion_value_rule_set_id", conversionValueRuleSetId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      ConversionValueRuleSetName that = ((ConversionValueRuleSetName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.conversionValueRuleSetId, that.conversionValueRuleSetId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(conversionValueRuleSetId);
    return h;
  }

  /** Builder for customers/{customer_id}/conversionValueRuleSets/{conversion_value_rule_set_id}. */
  public static class Builder {
    private String customerId;
    private String conversionValueRuleSetId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getConversionValueRuleSetId() {
      return conversionValueRuleSetId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setConversionValueRuleSetId(String conversionValueRuleSetId) {
      this.conversionValueRuleSetId = conversionValueRuleSetId;
      return this;
    }

    private Builder(ConversionValueRuleSetName conversionValueRuleSetName) {
      this.customerId = conversionValueRuleSetName.customerId;
      this.conversionValueRuleSetId = conversionValueRuleSetName.conversionValueRuleSetId;
    }

    public ConversionValueRuleSetName build() {
      return new ConversionValueRuleSetName(this);
    }
  }
}

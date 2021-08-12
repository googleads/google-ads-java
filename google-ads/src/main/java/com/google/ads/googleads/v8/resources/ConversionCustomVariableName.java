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

package com.google.ads.googleads.v8.resources;

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
public class ConversionCustomVariableName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CONVERSION_CUSTOM_VARIABLE_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/conversionCustomVariables/{conversion_custom_variable_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String conversionCustomVariableId;

  @Deprecated
  protected ConversionCustomVariableName() {
    customerId = null;
    conversionCustomVariableId = null;
  }

  private ConversionCustomVariableName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    conversionCustomVariableId =
        Preconditions.checkNotNull(builder.getConversionCustomVariableId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getConversionCustomVariableId() {
    return conversionCustomVariableId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static ConversionCustomVariableName of(
      String customerId, String conversionCustomVariableId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setConversionCustomVariableId(conversionCustomVariableId)
        .build();
  }

  public static String format(String customerId, String conversionCustomVariableId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setConversionCustomVariableId(conversionCustomVariableId)
        .build()
        .toString();
  }

  public static ConversionCustomVariableName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CONVERSION_CUSTOM_VARIABLE_ID.validatedMatch(
            formattedString,
            "ConversionCustomVariableName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("conversion_custom_variable_id"));
  }

  public static List<ConversionCustomVariableName> parseList(List<String> formattedStrings) {
    List<ConversionCustomVariableName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ConversionCustomVariableName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ConversionCustomVariableName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CONVERSION_CUSTOM_VARIABLE_ID.matches(formattedString);
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
          if (conversionCustomVariableId != null) {
            fieldMapBuilder.put("conversion_custom_variable_id", conversionCustomVariableId);
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
    return CUSTOMER_ID_CONVERSION_CUSTOM_VARIABLE_ID.instantiate(
        "customer_id", customerId, "conversion_custom_variable_id", conversionCustomVariableId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      ConversionCustomVariableName that = ((ConversionCustomVariableName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.conversionCustomVariableId, that.conversionCustomVariableId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(conversionCustomVariableId);
    return h;
  }

  /**
   * Builder for customers/{customer_id}/conversionCustomVariables/{conversion_custom_variable_id}.
   */
  public static class Builder {
    private String customerId;
    private String conversionCustomVariableId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getConversionCustomVariableId() {
      return conversionCustomVariableId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setConversionCustomVariableId(String conversionCustomVariableId) {
      this.conversionCustomVariableId = conversionCustomVariableId;
      return this;
    }

    private Builder(ConversionCustomVariableName conversionCustomVariableName) {
      this.customerId = conversionCustomVariableName.customerId;
      this.conversionCustomVariableId = conversionCustomVariableName.conversionCustomVariableId;
    }

    public ConversionCustomVariableName build() {
      return new ConversionCustomVariableName(this);
    }
  }
}

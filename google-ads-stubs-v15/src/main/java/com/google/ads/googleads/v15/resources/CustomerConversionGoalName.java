/*
 * Copyright 2023 Google LLC
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

package com.google.ads.googleads.v15.resources;

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
public class CustomerConversionGoalName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CATEGORY_SOURCE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/customerConversionGoals/{category}~{source}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String category;
  private final String source;

  @Deprecated
  protected CustomerConversionGoalName() {
    customerId = null;
    category = null;
    source = null;
  }

  private CustomerConversionGoalName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    category = Preconditions.checkNotNull(builder.getCategory());
    source = Preconditions.checkNotNull(builder.getSource());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getCategory() {
    return category;
  }

  public String getSource() {
    return source;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static CustomerConversionGoalName of(String customerId, String category, String source) {
    return newBuilder().setCustomerId(customerId).setCategory(category).setSource(source).build();
  }

  public static String format(String customerId, String category, String source) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCategory(category)
        .setSource(source)
        .build()
        .toString();
  }

  public static CustomerConversionGoalName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CATEGORY_SOURCE.validatedMatch(
            formattedString,
            "CustomerConversionGoalName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("category"), matchMap.get("source"));
  }

  public static List<CustomerConversionGoalName> parseList(List<String> formattedStrings) {
    List<CustomerConversionGoalName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CustomerConversionGoalName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CustomerConversionGoalName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CATEGORY_SOURCE.matches(formattedString);
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
          if (category != null) {
            fieldMapBuilder.put("category", category);
          }
          if (source != null) {
            fieldMapBuilder.put("source", source);
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
    return CUSTOMER_ID_CATEGORY_SOURCE.instantiate(
        "customer_id", customerId, "category", category, "source", source);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      CustomerConversionGoalName that = ((CustomerConversionGoalName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.category, that.category)
          && Objects.equals(this.source, that.source);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(category);
    h *= 1000003;
    h ^= Objects.hashCode(source);
    return h;
  }

  /** Builder for customers/{customer_id}/customerConversionGoals/{category}~{source}. */
  public static class Builder {
    private String customerId;
    private String category;
    private String source;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getCategory() {
      return category;
    }

    public String getSource() {
      return source;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCategory(String category) {
      this.category = category;
      return this;
    }

    public Builder setSource(String source) {
      this.source = source;
      return this;
    }

    private Builder(CustomerConversionGoalName customerConversionGoalName) {
      this.customerId = customerConversionGoalName.customerId;
      this.category = customerConversionGoalName.category;
      this.source = customerConversionGoalName.source;
    }

    public CustomerConversionGoalName build() {
      return new CustomerConversionGoalName(this);
    }
  }
}

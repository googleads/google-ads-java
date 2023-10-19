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
public class CustomerLifecycleGoalName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/customerLifecycleGoals");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;

  @Deprecated
  protected CustomerLifecycleGoalName() {
    customerId = null;
  }

  private CustomerLifecycleGoalName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static CustomerLifecycleGoalName of(String customerId) {
    return newBuilder().setCustomerId(customerId).build();
  }

  public static String format(String customerId) {
    return newBuilder().setCustomerId(customerId).build().toString();
  }

  public static CustomerLifecycleGoalName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID.validatedMatch(
            formattedString,
            "CustomerLifecycleGoalName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"));
  }

  public static List<CustomerLifecycleGoalName> parseList(List<String> formattedStrings) {
    List<CustomerLifecycleGoalName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CustomerLifecycleGoalName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CustomerLifecycleGoalName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID.matches(formattedString);
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
    return CUSTOMER_ID.instantiate("customer_id", customerId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      CustomerLifecycleGoalName that = ((CustomerLifecycleGoalName) o);
      return Objects.equals(this.customerId, that.customerId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    return h;
  }

  /** Builder for customers/{customer_id}/customerLifecycleGoals. */
  public static class Builder {
    private String customerId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    private Builder(CustomerLifecycleGoalName customerLifecycleGoalName) {
      this.customerId = customerLifecycleGoalName.customerId;
    }

    public CustomerLifecycleGoalName build() {
      return new CustomerLifecycleGoalName(this);
    }
  }
}

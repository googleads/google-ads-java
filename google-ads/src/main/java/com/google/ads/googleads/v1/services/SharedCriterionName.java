/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.ads.googleads.v1.services;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

/**
 * AUTO-GENERATED DOCUMENTATION AND CLASS
 */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class SharedCriterionName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/sharedCriteria/{shared_criterion}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String sharedCriterion;

  public String getCustomer() {
    return customer;
  }

  public String getSharedCriterion() {
    return sharedCriterion;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private SharedCriterionName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    sharedCriterion = Preconditions.checkNotNull(builder.getSharedCriterion());
  }

  public static SharedCriterionName of(String customer, String sharedCriterion) {
    return newBuilder()
      .setCustomer(customer)
      .setSharedCriterion(sharedCriterion)
      .build();
  }

  public static String format(String customer, String sharedCriterion) {
    return newBuilder()
      .setCustomer(customer)
      .setSharedCriterion(sharedCriterion)
      .build()
      .toString();
  }

  public static SharedCriterionName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "SharedCriterionName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("shared_criterion"));
  }

  public static List<SharedCriterionName> parseList(List<String> formattedStrings) {
    List<SharedCriterionName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<SharedCriterionName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (SharedCriterionName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("customer", customer);
          fieldMapBuilder.put("sharedCriterion", sharedCriterion);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "shared_criterion", sharedCriterion);
  }

  /** Builder for SharedCriterionName. */
  public static class Builder {

    private String customer;
    private String sharedCriterion;

    public String getCustomer() {
      return customer;
    }

    public String getSharedCriterion() {
      return sharedCriterion;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setSharedCriterion(String sharedCriterion) {
      this.sharedCriterion = sharedCriterion;
      return this;
    }

    private Builder() {
    }

    private Builder(SharedCriterionName sharedCriterionName) {
      customer = sharedCriterionName.customer;
      sharedCriterion = sharedCriterionName.sharedCriterion;
    }

    public SharedCriterionName build() {
      return new SharedCriterionName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SharedCriterionName) {
      SharedCriterionName that = (SharedCriterionName) o;
      return (this.customer.equals(that.customer))
          && (this.sharedCriterion.equals(that.sharedCriterion));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= sharedCriterion.hashCode();
    return h;
  }
}


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

package com.google.ads.googleads.v4.services;

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
public class CustomerNegativeCriterionName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/customerNegativeCriteria/{customer_negative_criterion}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String customerNegativeCriterion;

  public String getCustomer() {
    return customer;
  }

  public String getCustomerNegativeCriterion() {
    return customerNegativeCriterion;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private CustomerNegativeCriterionName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    customerNegativeCriterion = Preconditions.checkNotNull(builder.getCustomerNegativeCriterion());
  }

  public static CustomerNegativeCriterionName of(String customer, String customerNegativeCriterion) {
    return newBuilder()
      .setCustomer(customer)
      .setCustomerNegativeCriterion(customerNegativeCriterion)
      .build();
  }

  public static String format(String customer, String customerNegativeCriterion) {
    return newBuilder()
      .setCustomer(customer)
      .setCustomerNegativeCriterion(customerNegativeCriterion)
      .build()
      .toString();
  }

  public static CustomerNegativeCriterionName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "CustomerNegativeCriterionName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("customer_negative_criterion"));
  }

  public static List<CustomerNegativeCriterionName> parseList(List<String> formattedStrings) {
    List<CustomerNegativeCriterionName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CustomerNegativeCriterionName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (CustomerNegativeCriterionName value : values) {
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
          fieldMapBuilder.put("customerNegativeCriterion", customerNegativeCriterion);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "customer_negative_criterion", customerNegativeCriterion);
  }

  /** Builder for CustomerNegativeCriterionName. */
  public static class Builder {

    private String customer;
    private String customerNegativeCriterion;

    public String getCustomer() {
      return customer;
    }

    public String getCustomerNegativeCriterion() {
      return customerNegativeCriterion;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setCustomerNegativeCriterion(String customerNegativeCriterion) {
      this.customerNegativeCriterion = customerNegativeCriterion;
      return this;
    }

    private Builder() {
    }

    private Builder(CustomerNegativeCriterionName customerNegativeCriterionName) {
      customer = customerNegativeCriterionName.customer;
      customerNegativeCriterion = customerNegativeCriterionName.customerNegativeCriterion;
    }

    public CustomerNegativeCriterionName build() {
      return new CustomerNegativeCriterionName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CustomerNegativeCriterionName) {
      CustomerNegativeCriterionName that = (CustomerNegativeCriterionName) o;
      return (this.customer.equals(that.customer))
          && (this.customerNegativeCriterion.equals(that.customerNegativeCriterion));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= customerNegativeCriterion.hashCode();
    return h;
  }
}


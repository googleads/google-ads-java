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
public class CustomerFeedName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/customerFeeds/{customer_feed}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String customerFeed;

  public String getCustomer() {
    return customer;
  }

  public String getCustomerFeed() {
    return customerFeed;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private CustomerFeedName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    customerFeed = Preconditions.checkNotNull(builder.getCustomerFeed());
  }

  public static CustomerFeedName of(String customer, String customerFeed) {
    return newBuilder()
      .setCustomer(customer)
      .setCustomerFeed(customerFeed)
      .build();
  }

  public static String format(String customer, String customerFeed) {
    return newBuilder()
      .setCustomer(customer)
      .setCustomerFeed(customerFeed)
      .build()
      .toString();
  }

  public static CustomerFeedName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "CustomerFeedName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("customer_feed"));
  }

  public static List<CustomerFeedName> parseList(List<String> formattedStrings) {
    List<CustomerFeedName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CustomerFeedName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (CustomerFeedName value : values) {
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
          fieldMapBuilder.put("customerFeed", customerFeed);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "customer_feed", customerFeed);
  }

  /** Builder for CustomerFeedName. */
  public static class Builder {

    private String customer;
    private String customerFeed;

    public String getCustomer() {
      return customer;
    }

    public String getCustomerFeed() {
      return customerFeed;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setCustomerFeed(String customerFeed) {
      this.customerFeed = customerFeed;
      return this;
    }

    private Builder() {
    }

    private Builder(CustomerFeedName customerFeedName) {
      customer = customerFeedName.customer;
      customerFeed = customerFeedName.customerFeed;
    }

    public CustomerFeedName build() {
      return new CustomerFeedName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CustomerFeedName) {
      CustomerFeedName that = (CustomerFeedName) o;
      return (this.customer.equals(that.customer))
          && (this.customerFeed.equals(that.customerFeed));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= customerFeed.hashCode();
    return h;
  }
}


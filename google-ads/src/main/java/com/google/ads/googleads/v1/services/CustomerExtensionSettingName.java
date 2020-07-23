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
public class CustomerExtensionSettingName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/customerExtensionSettings/{customer_extension_setting}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String customerExtensionSetting;

  public String getCustomer() {
    return customer;
  }

  public String getCustomerExtensionSetting() {
    return customerExtensionSetting;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private CustomerExtensionSettingName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    customerExtensionSetting = Preconditions.checkNotNull(builder.getCustomerExtensionSetting());
  }

  public static CustomerExtensionSettingName of(String customer, String customerExtensionSetting) {
    return newBuilder()
      .setCustomer(customer)
      .setCustomerExtensionSetting(customerExtensionSetting)
      .build();
  }

  public static String format(String customer, String customerExtensionSetting) {
    return newBuilder()
      .setCustomer(customer)
      .setCustomerExtensionSetting(customerExtensionSetting)
      .build()
      .toString();
  }

  public static CustomerExtensionSettingName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "CustomerExtensionSettingName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("customer_extension_setting"));
  }

  public static List<CustomerExtensionSettingName> parseList(List<String> formattedStrings) {
    List<CustomerExtensionSettingName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CustomerExtensionSettingName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (CustomerExtensionSettingName value : values) {
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
          fieldMapBuilder.put("customerExtensionSetting", customerExtensionSetting);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "customer_extension_setting", customerExtensionSetting);
  }

  /** Builder for CustomerExtensionSettingName. */
  public static class Builder {

    private String customer;
    private String customerExtensionSetting;

    public String getCustomer() {
      return customer;
    }

    public String getCustomerExtensionSetting() {
      return customerExtensionSetting;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setCustomerExtensionSetting(String customerExtensionSetting) {
      this.customerExtensionSetting = customerExtensionSetting;
      return this;
    }

    private Builder() {
    }

    private Builder(CustomerExtensionSettingName customerExtensionSettingName) {
      customer = customerExtensionSettingName.customer;
      customerExtensionSetting = customerExtensionSettingName.customerExtensionSetting;
    }

    public CustomerExtensionSettingName build() {
      return new CustomerExtensionSettingName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CustomerExtensionSettingName) {
      CustomerExtensionSettingName that = (CustomerExtensionSettingName) o;
      return (this.customer.equals(that.customer))
          && (this.customerExtensionSetting.equals(that.customerExtensionSetting));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= customerExtensionSetting.hashCode();
    return h;
  }
}


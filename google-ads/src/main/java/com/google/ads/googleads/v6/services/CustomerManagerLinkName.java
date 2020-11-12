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

package com.google.ads.googleads.v6.services;

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
public class CustomerManagerLinkName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String managerCustomerId;
  private final String managerLinkId;

  public String getCustomerId() {
    return customerId;
  }

  public String getManagerCustomerId() {
    return managerCustomerId;
  }

  public String getManagerLinkId() {
    return managerLinkId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private CustomerManagerLinkName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    managerCustomerId = Preconditions.checkNotNull(builder.getManagerCustomerId());
    managerLinkId = Preconditions.checkNotNull(builder.getManagerLinkId());
  }

  public static CustomerManagerLinkName of(String customerId, String managerCustomerId, String managerLinkId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setManagerCustomerId(managerCustomerId)
      .setManagerLinkId(managerLinkId)
      .build();
  }

  public static String format(String customerId, String managerCustomerId, String managerLinkId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setManagerCustomerId(managerCustomerId)
      .setManagerLinkId(managerLinkId)
      .build()
      .toString();
  }

  public static CustomerManagerLinkName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "CustomerManagerLinkName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("manager_customer_id"), matchMap.get("manager_link_id"));
  }

  public static List<CustomerManagerLinkName> parseList(List<String> formattedStrings) {
    List<CustomerManagerLinkName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CustomerManagerLinkName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (CustomerManagerLinkName value : values) {
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
          fieldMapBuilder.put("customerId", customerId);
          fieldMapBuilder.put("managerCustomerId", managerCustomerId);
          fieldMapBuilder.put("managerLinkId", managerLinkId);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "manager_customer_id", managerCustomerId, "manager_link_id", managerLinkId);
  }

  /** Builder for CustomerManagerLinkName. */
  public static class Builder {

    private String customerId;
    private String managerCustomerId;
    private String managerLinkId;

    public String getCustomerId() {
      return customerId;
    }

    public String getManagerCustomerId() {
      return managerCustomerId;
    }

    public String getManagerLinkId() {
      return managerLinkId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setManagerCustomerId(String managerCustomerId) {
      this.managerCustomerId = managerCustomerId;
      return this;
    }

    public Builder setManagerLinkId(String managerLinkId) {
      this.managerLinkId = managerLinkId;
      return this;
    }

    private Builder() {
    }

    private Builder(CustomerManagerLinkName customerManagerLinkName) {
      customerId = customerManagerLinkName.customerId;
      managerCustomerId = customerManagerLinkName.managerCustomerId;
      managerLinkId = customerManagerLinkName.managerLinkId;
    }

    public CustomerManagerLinkName build() {
      return new CustomerManagerLinkName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CustomerManagerLinkName) {
      CustomerManagerLinkName that = (CustomerManagerLinkName) o;
      return (this.customerId.equals(that.customerId))
          && (this.managerCustomerId.equals(that.managerCustomerId))
          && (this.managerLinkId.equals(that.managerLinkId));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= managerCustomerId.hashCode();
    h *= 1000003;
    h ^= managerLinkId.hashCode();
    return h;
  }
}


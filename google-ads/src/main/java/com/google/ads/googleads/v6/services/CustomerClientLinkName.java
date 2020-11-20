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
public class CustomerClientLinkName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/customerClientLinks/{client_customer_id}~{manager_link_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String clientCustomerId;
  private final String managerLinkId;

  public String getCustomerId() {
    return customerId;
  }

  public String getClientCustomerId() {
    return clientCustomerId;
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

  private CustomerClientLinkName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    clientCustomerId = Preconditions.checkNotNull(builder.getClientCustomerId());
    managerLinkId = Preconditions.checkNotNull(builder.getManagerLinkId());
  }

  public static CustomerClientLinkName of(String customerId, String clientCustomerId, String managerLinkId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setClientCustomerId(clientCustomerId)
      .setManagerLinkId(managerLinkId)
      .build();
  }

  public static String format(String customerId, String clientCustomerId, String managerLinkId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setClientCustomerId(clientCustomerId)
      .setManagerLinkId(managerLinkId)
      .build()
      .toString();
  }

  public static CustomerClientLinkName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "CustomerClientLinkName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("client_customer_id"), matchMap.get("manager_link_id"));
  }

  public static List<CustomerClientLinkName> parseList(List<String> formattedStrings) {
    List<CustomerClientLinkName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CustomerClientLinkName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (CustomerClientLinkName value : values) {
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
          fieldMapBuilder.put("clientCustomerId", clientCustomerId);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "client_customer_id", clientCustomerId, "manager_link_id", managerLinkId);
  }

  /** Builder for CustomerClientLinkName. */
  public static class Builder {

    private String customerId;
    private String clientCustomerId;
    private String managerLinkId;

    public String getCustomerId() {
      return customerId;
    }

    public String getClientCustomerId() {
      return clientCustomerId;
    }

    public String getManagerLinkId() {
      return managerLinkId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setClientCustomerId(String clientCustomerId) {
      this.clientCustomerId = clientCustomerId;
      return this;
    }

    public Builder setManagerLinkId(String managerLinkId) {
      this.managerLinkId = managerLinkId;
      return this;
    }

    private Builder() {
    }

    private Builder(CustomerClientLinkName customerClientLinkName) {
      customerId = customerClientLinkName.customerId;
      clientCustomerId = customerClientLinkName.clientCustomerId;
      managerLinkId = customerClientLinkName.managerLinkId;
    }

    public CustomerClientLinkName build() {
      return new CustomerClientLinkName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CustomerClientLinkName) {
      CustomerClientLinkName that = (CustomerClientLinkName) o;
      return (this.customerId.equals(that.customerId))
          && (this.clientCustomerId.equals(that.clientCustomerId))
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
    h ^= clientCustomerId.hashCode();
    h *= 1000003;
    h ^= managerLinkId.hashCode();
    return h;
  }
}


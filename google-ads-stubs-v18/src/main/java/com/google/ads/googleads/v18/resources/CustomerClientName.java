/*
 * Copyright 2024 Google LLC
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
public class CustomerClientName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CLIENT_CUSTOMER_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/customerClients/{client_customer_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String clientCustomerId;

  @Deprecated
  protected CustomerClientName() {
    customerId = null;
    clientCustomerId = null;
  }

  private CustomerClientName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    clientCustomerId = Preconditions.checkNotNull(builder.getClientCustomerId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getClientCustomerId() {
    return clientCustomerId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static CustomerClientName of(String customerId, String clientCustomerId) {
    return newBuilder().setCustomerId(customerId).setClientCustomerId(clientCustomerId).build();
  }

  public static String format(String customerId, String clientCustomerId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setClientCustomerId(clientCustomerId)
        .build()
        .toString();
  }

  public static CustomerClientName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CLIENT_CUSTOMER_ID.validatedMatch(
            formattedString, "CustomerClientName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("client_customer_id"));
  }

  public static List<CustomerClientName> parseList(List<String> formattedStrings) {
    List<CustomerClientName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CustomerClientName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CustomerClientName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CLIENT_CUSTOMER_ID.matches(formattedString);
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
          if (clientCustomerId != null) {
            fieldMapBuilder.put("client_customer_id", clientCustomerId);
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
    return CUSTOMER_ID_CLIENT_CUSTOMER_ID.instantiate(
        "customer_id", customerId, "client_customer_id", clientCustomerId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      CustomerClientName that = ((CustomerClientName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.clientCustomerId, that.clientCustomerId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(clientCustomerId);
    return h;
  }

  /** Builder for customers/{customer_id}/customerClients/{client_customer_id}. */
  public static class Builder {
    private String customerId;
    private String clientCustomerId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getClientCustomerId() {
      return clientCustomerId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setClientCustomerId(String clientCustomerId) {
      this.clientCustomerId = clientCustomerId;
      return this;
    }

    private Builder(CustomerClientName customerClientName) {
      this.customerId = customerClientName.customerId;
      this.clientCustomerId = customerClientName.clientCustomerId;
    }

    public CustomerClientName build() {
      return new CustomerClientName(this);
    }
  }
}

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

package com.google.ads.googleads.v16.resources;

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
public class CustomerManagerLinkName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_MANAGER_CUSTOMER_ID_MANAGER_LINK_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String managerCustomerId;
  private final String managerLinkId;

  @Deprecated
  protected CustomerManagerLinkName() {
    customerId = null;
    managerCustomerId = null;
    managerLinkId = null;
  }

  private CustomerManagerLinkName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    managerCustomerId = Preconditions.checkNotNull(builder.getManagerCustomerId());
    managerLinkId = Preconditions.checkNotNull(builder.getManagerLinkId());
  }

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

  public static CustomerManagerLinkName of(
      String customerId, String managerCustomerId, String managerLinkId) {
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
        CUSTOMER_ID_MANAGER_CUSTOMER_ID_MANAGER_LINK_ID.validatedMatch(
            formattedString, "CustomerManagerLinkName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("manager_customer_id"),
        matchMap.get("manager_link_id"));
  }

  public static List<CustomerManagerLinkName> parseList(List<String> formattedStrings) {
    List<CustomerManagerLinkName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CustomerManagerLinkName> values) {
    List<String> list = new ArrayList<>(values.size());
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
    return CUSTOMER_ID_MANAGER_CUSTOMER_ID_MANAGER_LINK_ID.matches(formattedString);
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
          if (managerCustomerId != null) {
            fieldMapBuilder.put("manager_customer_id", managerCustomerId);
          }
          if (managerLinkId != null) {
            fieldMapBuilder.put("manager_link_id", managerLinkId);
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
    return CUSTOMER_ID_MANAGER_CUSTOMER_ID_MANAGER_LINK_ID.instantiate(
        "customer_id",
        customerId,
        "manager_customer_id",
        managerCustomerId,
        "manager_link_id",
        managerLinkId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      CustomerManagerLinkName that = ((CustomerManagerLinkName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.managerCustomerId, that.managerCustomerId)
          && Objects.equals(this.managerLinkId, that.managerLinkId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(managerCustomerId);
    h *= 1000003;
    h ^= Objects.hashCode(managerLinkId);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/customerManagerLinks/{manager_customer_id}~{manager_link_id}.
   */
  public static class Builder {
    private String customerId;
    private String managerCustomerId;
    private String managerLinkId;

    protected Builder() {}

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

    private Builder(CustomerManagerLinkName customerManagerLinkName) {
      this.customerId = customerManagerLinkName.customerId;
      this.managerCustomerId = customerManagerLinkName.managerCustomerId;
      this.managerLinkId = customerManagerLinkName.managerLinkId;
    }

    public CustomerManagerLinkName build() {
      return new CustomerManagerLinkName(this);
    }
  }
}

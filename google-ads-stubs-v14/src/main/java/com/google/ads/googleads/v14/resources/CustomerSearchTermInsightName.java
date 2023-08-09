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

package com.google.ads.googleads.v14.resources;

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
public class CustomerSearchTermInsightName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CLUSTER_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/customerSearchTermInsights/{cluster_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String clusterId;

  @Deprecated
  protected CustomerSearchTermInsightName() {
    customerId = null;
    clusterId = null;
  }

  private CustomerSearchTermInsightName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    clusterId = Preconditions.checkNotNull(builder.getClusterId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getClusterId() {
    return clusterId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static CustomerSearchTermInsightName of(String customerId, String clusterId) {
    return newBuilder().setCustomerId(customerId).setClusterId(clusterId).build();
  }

  public static String format(String customerId, String clusterId) {
    return newBuilder().setCustomerId(customerId).setClusterId(clusterId).build().toString();
  }

  public static CustomerSearchTermInsightName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CLUSTER_ID.validatedMatch(
            formattedString,
            "CustomerSearchTermInsightName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("cluster_id"));
  }

  public static List<CustomerSearchTermInsightName> parseList(List<String> formattedStrings) {
    List<CustomerSearchTermInsightName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CustomerSearchTermInsightName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CustomerSearchTermInsightName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CLUSTER_ID.matches(formattedString);
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
          if (clusterId != null) {
            fieldMapBuilder.put("cluster_id", clusterId);
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
    return CUSTOMER_ID_CLUSTER_ID.instantiate("customer_id", customerId, "cluster_id", clusterId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      CustomerSearchTermInsightName that = ((CustomerSearchTermInsightName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.clusterId, that.clusterId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(clusterId);
    return h;
  }

  /** Builder for customers/{customer_id}/customerSearchTermInsights/{cluster_id}. */
  public static class Builder {
    private String customerId;
    private String clusterId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getClusterId() {
      return clusterId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setClusterId(String clusterId) {
      this.clusterId = clusterId;
      return this;
    }

    private Builder(CustomerSearchTermInsightName customerSearchTermInsightName) {
      this.customerId = customerSearchTermInsightName.customerId;
      this.clusterId = customerSearchTermInsightName.clusterId;
    }

    public CustomerSearchTermInsightName build() {
      return new CustomerSearchTermInsightName(this);
    }
  }
}

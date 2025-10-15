/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v22.resources;

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
public class LocalServicesLeadName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_LOCAL_SERVICES_LEAD_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/localServicesLeads/{local_services_lead_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String localServicesLeadId;

  @Deprecated
  protected LocalServicesLeadName() {
    customerId = null;
    localServicesLeadId = null;
  }

  private LocalServicesLeadName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    localServicesLeadId = Preconditions.checkNotNull(builder.getLocalServicesLeadId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getLocalServicesLeadId() {
    return localServicesLeadId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static LocalServicesLeadName of(String customerId, String localServicesLeadId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setLocalServicesLeadId(localServicesLeadId)
        .build();
  }

  public static String format(String customerId, String localServicesLeadId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setLocalServicesLeadId(localServicesLeadId)
        .build()
        .toString();
  }

  public static LocalServicesLeadName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_LOCAL_SERVICES_LEAD_ID.validatedMatch(
            formattedString, "LocalServicesLeadName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("local_services_lead_id"));
  }

  public static List<LocalServicesLeadName> parseList(List<String> formattedStrings) {
    List<LocalServicesLeadName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<LocalServicesLeadName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (LocalServicesLeadName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_LOCAL_SERVICES_LEAD_ID.matches(formattedString);
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
          if (localServicesLeadId != null) {
            fieldMapBuilder.put("local_services_lead_id", localServicesLeadId);
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
    return CUSTOMER_ID_LOCAL_SERVICES_LEAD_ID.instantiate(
        "customer_id", customerId, "local_services_lead_id", localServicesLeadId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      LocalServicesLeadName that = ((LocalServicesLeadName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.localServicesLeadId, that.localServicesLeadId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(localServicesLeadId);
    return h;
  }

  /** Builder for customers/{customer_id}/localServicesLeads/{local_services_lead_id}. */
  public static class Builder {
    private String customerId;
    private String localServicesLeadId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getLocalServicesLeadId() {
      return localServicesLeadId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setLocalServicesLeadId(String localServicesLeadId) {
      this.localServicesLeadId = localServicesLeadId;
      return this;
    }

    private Builder(LocalServicesLeadName localServicesLeadName) {
      this.customerId = localServicesLeadName.customerId;
      this.localServicesLeadId = localServicesLeadName.localServicesLeadId;
    }

    public LocalServicesLeadName build() {
      return new LocalServicesLeadName(this);
    }
  }
}

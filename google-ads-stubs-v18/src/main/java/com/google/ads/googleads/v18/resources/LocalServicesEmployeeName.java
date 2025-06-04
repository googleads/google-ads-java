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
public class LocalServicesEmployeeName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_GLS_EMPLOYEE_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/localServicesEmployees/{gls_employee_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String glsEmployeeId;

  @Deprecated
  protected LocalServicesEmployeeName() {
    customerId = null;
    glsEmployeeId = null;
  }

  private LocalServicesEmployeeName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    glsEmployeeId = Preconditions.checkNotNull(builder.getGlsEmployeeId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getGlsEmployeeId() {
    return glsEmployeeId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static LocalServicesEmployeeName of(String customerId, String glsEmployeeId) {
    return newBuilder().setCustomerId(customerId).setGlsEmployeeId(glsEmployeeId).build();
  }

  public static String format(String customerId, String glsEmployeeId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setGlsEmployeeId(glsEmployeeId)
        .build()
        .toString();
  }

  public static LocalServicesEmployeeName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_GLS_EMPLOYEE_ID.validatedMatch(
            formattedString,
            "LocalServicesEmployeeName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("gls_employee_id"));
  }

  public static List<LocalServicesEmployeeName> parseList(List<String> formattedStrings) {
    List<LocalServicesEmployeeName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<LocalServicesEmployeeName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (LocalServicesEmployeeName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_GLS_EMPLOYEE_ID.matches(formattedString);
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
          if (glsEmployeeId != null) {
            fieldMapBuilder.put("gls_employee_id", glsEmployeeId);
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
    return CUSTOMER_ID_GLS_EMPLOYEE_ID.instantiate(
        "customer_id", customerId, "gls_employee_id", glsEmployeeId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      LocalServicesEmployeeName that = ((LocalServicesEmployeeName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.glsEmployeeId, that.glsEmployeeId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(glsEmployeeId);
    return h;
  }

  /** Builder for customers/{customer_id}/localServicesEmployees/{gls_employee_id}. */
  public static class Builder {
    private String customerId;
    private String glsEmployeeId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getGlsEmployeeId() {
      return glsEmployeeId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setGlsEmployeeId(String glsEmployeeId) {
      this.glsEmployeeId = glsEmployeeId;
      return this;
    }

    private Builder(LocalServicesEmployeeName localServicesEmployeeName) {
      this.customerId = localServicesEmployeeName.customerId;
      this.glsEmployeeId = localServicesEmployeeName.glsEmployeeId;
    }

    public LocalServicesEmployeeName build() {
      return new LocalServicesEmployeeName(this);
    }
  }
}

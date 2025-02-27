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

package com.google.ads.googleads.v19.resources;

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
public class PerformanceMaxPlacementViewName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_BASE64_PLACEMENT =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/performanceMaxPlacementViews/{base_64_placement}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String base64Placement;

  @Deprecated
  protected PerformanceMaxPlacementViewName() {
    customerId = null;
    base64Placement = null;
  }

  private PerformanceMaxPlacementViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    base64Placement = Preconditions.checkNotNull(builder.getBase64Placement());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getBase64Placement() {
    return base64Placement;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static PerformanceMaxPlacementViewName of(String customerId, String base64Placement) {
    return newBuilder().setCustomerId(customerId).setBase64Placement(base64Placement).build();
  }

  public static String format(String customerId, String base64Placement) {
    return newBuilder()
        .setCustomerId(customerId)
        .setBase64Placement(base64Placement)
        .build()
        .toString();
  }

  public static PerformanceMaxPlacementViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_BASE64_PLACEMENT.validatedMatch(
            formattedString,
            "PerformanceMaxPlacementViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("base_64_placement"));
  }

  public static List<PerformanceMaxPlacementViewName> parseList(List<String> formattedStrings) {
    List<PerformanceMaxPlacementViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<PerformanceMaxPlacementViewName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (PerformanceMaxPlacementViewName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_BASE64_PLACEMENT.matches(formattedString);
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
          if (base64Placement != null) {
            fieldMapBuilder.put("base_64_placement", base64Placement);
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
    return CUSTOMER_ID_BASE64_PLACEMENT.instantiate(
        "customer_id", customerId, "base_64_placement", base64Placement);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      PerformanceMaxPlacementViewName that = ((PerformanceMaxPlacementViewName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.base64Placement, that.base64Placement);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(base64Placement);
    return h;
  }

  /** Builder for customers/{customer_id}/performanceMaxPlacementViews/{base_64_placement}. */
  public static class Builder {
    private String customerId;
    private String base64Placement;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getBase64Placement() {
      return base64Placement;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setBase64Placement(String base64Placement) {
      this.base64Placement = base64Placement;
      return this;
    }

    private Builder(PerformanceMaxPlacementViewName performanceMaxPlacementViewName) {
      this.customerId = performanceMaxPlacementViewName.customerId;
      this.base64Placement = performanceMaxPlacementViewName.base64Placement;
    }

    public PerformanceMaxPlacementViewName build() {
      return new PerformanceMaxPlacementViewName(this);
    }
  }
}

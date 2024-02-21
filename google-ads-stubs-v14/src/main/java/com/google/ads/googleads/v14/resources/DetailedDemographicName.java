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
public class DetailedDemographicName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_DETAILED_DEMOGRAPHIC_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/detailedDemographics/{detailed_demographic_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String detailedDemographicId;

  @Deprecated
  protected DetailedDemographicName() {
    customerId = null;
    detailedDemographicId = null;
  }

  private DetailedDemographicName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    detailedDemographicId = Preconditions.checkNotNull(builder.getDetailedDemographicId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getDetailedDemographicId() {
    return detailedDemographicId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static DetailedDemographicName of(String customerId, String detailedDemographicId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setDetailedDemographicId(detailedDemographicId)
        .build();
  }

  public static String format(String customerId, String detailedDemographicId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setDetailedDemographicId(detailedDemographicId)
        .build()
        .toString();
  }

  public static DetailedDemographicName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_DETAILED_DEMOGRAPHIC_ID.validatedMatch(
            formattedString, "DetailedDemographicName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("detailed_demographic_id"));
  }

  public static List<DetailedDemographicName> parseList(List<String> formattedStrings) {
    List<DetailedDemographicName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<DetailedDemographicName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (DetailedDemographicName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_DETAILED_DEMOGRAPHIC_ID.matches(formattedString);
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
          if (detailedDemographicId != null) {
            fieldMapBuilder.put("detailed_demographic_id", detailedDemographicId);
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
    return CUSTOMER_ID_DETAILED_DEMOGRAPHIC_ID.instantiate(
        "customer_id", customerId, "detailed_demographic_id", detailedDemographicId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      DetailedDemographicName that = ((DetailedDemographicName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.detailedDemographicId, that.detailedDemographicId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(detailedDemographicId);
    return h;
  }

  /** Builder for customers/{customer_id}/detailedDemographics/{detailed_demographic_id}. */
  public static class Builder {
    private String customerId;
    private String detailedDemographicId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getDetailedDemographicId() {
      return detailedDemographicId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setDetailedDemographicId(String detailedDemographicId) {
      this.detailedDemographicId = detailedDemographicId;
      return this;
    }

    private Builder(DetailedDemographicName detailedDemographicName) {
      this.customerId = detailedDemographicName.customerId;
      this.detailedDemographicId = detailedDemographicName.detailedDemographicId;
    }

    public DetailedDemographicName build() {
      return new DetailedDemographicName(this);
    }
  }
}

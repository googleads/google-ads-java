/*
 * Copyright 2021 Google LLC
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

package com.google.ads.googleads.v10.resources;

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
public class GeographicViewName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_COUNTRY_CRITERION_ID_LOCATION_TYPE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/geographicViews/{country_criterion_id}~{location_type}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String countryCriterionId;
  private final String locationType;

  @Deprecated
  protected GeographicViewName() {
    customerId = null;
    countryCriterionId = null;
    locationType = null;
  }

  private GeographicViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    countryCriterionId = Preconditions.checkNotNull(builder.getCountryCriterionId());
    locationType = Preconditions.checkNotNull(builder.getLocationType());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getCountryCriterionId() {
    return countryCriterionId;
  }

  public String getLocationType() {
    return locationType;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static GeographicViewName of(
      String customerId, String countryCriterionId, String locationType) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCountryCriterionId(countryCriterionId)
        .setLocationType(locationType)
        .build();
  }

  public static String format(String customerId, String countryCriterionId, String locationType) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCountryCriterionId(countryCriterionId)
        .setLocationType(locationType)
        .build()
        .toString();
  }

  public static GeographicViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_COUNTRY_CRITERION_ID_LOCATION_TYPE.validatedMatch(
            formattedString, "GeographicViewName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("country_criterion_id"),
        matchMap.get("location_type"));
  }

  public static List<GeographicViewName> parseList(List<String> formattedStrings) {
    List<GeographicViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<GeographicViewName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (GeographicViewName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_COUNTRY_CRITERION_ID_LOCATION_TYPE.matches(formattedString);
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
          if (countryCriterionId != null) {
            fieldMapBuilder.put("country_criterion_id", countryCriterionId);
          }
          if (locationType != null) {
            fieldMapBuilder.put("location_type", locationType);
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
    return CUSTOMER_ID_COUNTRY_CRITERION_ID_LOCATION_TYPE.instantiate(
        "customer_id",
        customerId,
        "country_criterion_id",
        countryCriterionId,
        "location_type",
        locationType);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      GeographicViewName that = ((GeographicViewName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.countryCriterionId, that.countryCriterionId)
          && Objects.equals(this.locationType, that.locationType);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(countryCriterionId);
    h *= 1000003;
    h ^= Objects.hashCode(locationType);
    return h;
  }

  /** Builder for customers/{customer_id}/geographicViews/{country_criterion_id}~{location_type}. */
  public static class Builder {
    private String customerId;
    private String countryCriterionId;
    private String locationType;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getCountryCriterionId() {
      return countryCriterionId;
    }

    public String getLocationType() {
      return locationType;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCountryCriterionId(String countryCriterionId) {
      this.countryCriterionId = countryCriterionId;
      return this;
    }

    public Builder setLocationType(String locationType) {
      this.locationType = locationType;
      return this;
    }

    private Builder(GeographicViewName geographicViewName) {
      this.customerId = geographicViewName.customerId;
      this.countryCriterionId = geographicViewName.countryCriterionId;
      this.locationType = geographicViewName.locationType;
    }

    public GeographicViewName build() {
      return new GeographicViewName(this);
    }
  }
}

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

package com.google.ads.googleads.v20.resources;

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
public class UserLocationViewName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_COUNTRY_CRITERION_ID_IS_TARGETING_LOCATION =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/userLocationViews/{country_criterion_id}~{is_targeting_location}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String countryCriterionId;
  private final String isTargetingLocation;

  @Deprecated
  protected UserLocationViewName() {
    customerId = null;
    countryCriterionId = null;
    isTargetingLocation = null;
  }

  private UserLocationViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    countryCriterionId = Preconditions.checkNotNull(builder.getCountryCriterionId());
    isTargetingLocation = Preconditions.checkNotNull(builder.getIsTargetingLocation());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getCountryCriterionId() {
    return countryCriterionId;
  }

  public String getIsTargetingLocation() {
    return isTargetingLocation;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static UserLocationViewName of(
      String customerId, String countryCriterionId, String isTargetingLocation) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCountryCriterionId(countryCriterionId)
        .setIsTargetingLocation(isTargetingLocation)
        .build();
  }

  public static String format(
      String customerId, String countryCriterionId, String isTargetingLocation) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCountryCriterionId(countryCriterionId)
        .setIsTargetingLocation(isTargetingLocation)
        .build()
        .toString();
  }

  public static UserLocationViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_COUNTRY_CRITERION_ID_IS_TARGETING_LOCATION.validatedMatch(
            formattedString, "UserLocationViewName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("country_criterion_id"),
        matchMap.get("is_targeting_location"));
  }

  public static List<UserLocationViewName> parseList(List<String> formattedStrings) {
    List<UserLocationViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<UserLocationViewName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (UserLocationViewName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_COUNTRY_CRITERION_ID_IS_TARGETING_LOCATION.matches(formattedString);
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
          if (isTargetingLocation != null) {
            fieldMapBuilder.put("is_targeting_location", isTargetingLocation);
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
    return CUSTOMER_ID_COUNTRY_CRITERION_ID_IS_TARGETING_LOCATION.instantiate(
        "customer_id",
        customerId,
        "country_criterion_id",
        countryCriterionId,
        "is_targeting_location",
        isTargetingLocation);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      UserLocationViewName that = ((UserLocationViewName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.countryCriterionId, that.countryCriterionId)
          && Objects.equals(this.isTargetingLocation, that.isTargetingLocation);
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
    h ^= Objects.hashCode(isTargetingLocation);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/userLocationViews/{country_criterion_id}~{is_targeting_location}.
   */
  public static class Builder {
    private String customerId;
    private String countryCriterionId;
    private String isTargetingLocation;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getCountryCriterionId() {
      return countryCriterionId;
    }

    public String getIsTargetingLocation() {
      return isTargetingLocation;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCountryCriterionId(String countryCriterionId) {
      this.countryCriterionId = countryCriterionId;
      return this;
    }

    public Builder setIsTargetingLocation(String isTargetingLocation) {
      this.isTargetingLocation = isTargetingLocation;
      return this;
    }

    private Builder(UserLocationViewName userLocationViewName) {
      this.customerId = userLocationViewName.customerId;
      this.countryCriterionId = userLocationViewName.countryCriterionId;
      this.isTargetingLocation = userLocationViewName.isTargetingLocation;
    }

    public UserLocationViewName build() {
      return new UserLocationViewName(this);
    }
  }
}

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
public class CustomInterestName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/customInterests/{custom_interest_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String customInterestId;

  public String getCustomerId() {
    return customerId;
  }

  public String getCustomInterestId() {
    return customInterestId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private CustomInterestName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    customInterestId = Preconditions.checkNotNull(builder.getCustomInterestId());
  }

  public static CustomInterestName of(String customerId, String customInterestId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setCustomInterestId(customInterestId)
      .build();
  }

  public static String format(String customerId, String customInterestId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setCustomInterestId(customInterestId)
      .build()
      .toString();
  }

  public static CustomInterestName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "CustomInterestName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("custom_interest_id"));
  }

  public static List<CustomInterestName> parseList(List<String> formattedStrings) {
    List<CustomInterestName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CustomInterestName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (CustomInterestName value : values) {
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
          fieldMapBuilder.put("customInterestId", customInterestId);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "custom_interest_id", customInterestId);
  }

  /** Builder for CustomInterestName. */
  public static class Builder {

    private String customerId;
    private String customInterestId;

    public String getCustomerId() {
      return customerId;
    }

    public String getCustomInterestId() {
      return customInterestId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCustomInterestId(String customInterestId) {
      this.customInterestId = customInterestId;
      return this;
    }

    private Builder() {
    }

    private Builder(CustomInterestName customInterestName) {
      customerId = customInterestName.customerId;
      customInterestId = customInterestName.customInterestId;
    }

    public CustomInterestName build() {
      return new CustomInterestName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CustomInterestName) {
      CustomInterestName that = (CustomInterestName) o;
      return (this.customerId.equals(that.customerId))
          && (this.customInterestId.equals(that.customInterestId));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= customInterestId.hashCode();
    return h;
  }
}


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
public class CustomAudienceName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/customAudiences/{custom_audience_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String customAudienceId;

  public String getCustomerId() {
    return customerId;
  }

  public String getCustomAudienceId() {
    return customAudienceId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private CustomAudienceName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    customAudienceId = Preconditions.checkNotNull(builder.getCustomAudienceId());
  }

  public static CustomAudienceName of(String customerId, String customAudienceId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setCustomAudienceId(customAudienceId)
      .build();
  }

  public static String format(String customerId, String customAudienceId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setCustomAudienceId(customAudienceId)
      .build()
      .toString();
  }

  public static CustomAudienceName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "CustomAudienceName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("custom_audience_id"));
  }

  public static List<CustomAudienceName> parseList(List<String> formattedStrings) {
    List<CustomAudienceName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CustomAudienceName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (CustomAudienceName value : values) {
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
          fieldMapBuilder.put("customAudienceId", customAudienceId);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "custom_audience_id", customAudienceId);
  }

  /** Builder for CustomAudienceName. */
  public static class Builder {

    private String customerId;
    private String customAudienceId;

    public String getCustomerId() {
      return customerId;
    }

    public String getCustomAudienceId() {
      return customAudienceId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCustomAudienceId(String customAudienceId) {
      this.customAudienceId = customAudienceId;
      return this;
    }

    private Builder() {
    }

    private Builder(CustomAudienceName customAudienceName) {
      customerId = customAudienceName.customerId;
      customAudienceId = customAudienceName.customAudienceId;
    }

    public CustomAudienceName build() {
      return new CustomAudienceName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CustomAudienceName) {
      CustomAudienceName that = (CustomAudienceName) o;
      return (this.customerId.equals(that.customerId))
          && (this.customAudienceId.equals(that.customAudienceId));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= customAudienceId.hashCode();
    return h;
  }
}


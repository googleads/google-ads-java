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
public class CustomAudienceName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CUSTOM_AUDIENCE_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/customAudiences/{custom_audience_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String customAudienceId;

  @Deprecated
  protected CustomAudienceName() {
    customerId = null;
    customAudienceId = null;
  }

  private CustomAudienceName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    customAudienceId = Preconditions.checkNotNull(builder.getCustomAudienceId());
  }

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

  public static CustomAudienceName of(String customerId, String customAudienceId) {
    return newBuilder().setCustomerId(customerId).setCustomAudienceId(customAudienceId).build();
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
        CUSTOMER_ID_CUSTOM_AUDIENCE_ID.validatedMatch(
            formattedString, "CustomAudienceName.parse: formattedString not in valid format");
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
    List<String> list = new ArrayList<>(values.size());
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
    return CUSTOMER_ID_CUSTOM_AUDIENCE_ID.matches(formattedString);
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
          if (customAudienceId != null) {
            fieldMapBuilder.put("custom_audience_id", customAudienceId);
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
    return CUSTOMER_ID_CUSTOM_AUDIENCE_ID.instantiate(
        "customer_id", customerId, "custom_audience_id", customAudienceId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      CustomAudienceName that = ((CustomAudienceName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.customAudienceId, that.customAudienceId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(customAudienceId);
    return h;
  }

  /** Builder for customers/{customer_id}/customAudiences/{custom_audience_id}. */
  public static class Builder {
    private String customerId;
    private String customAudienceId;

    protected Builder() {}

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

    private Builder(CustomAudienceName customAudienceName) {
      this.customerId = customAudienceName.customerId;
      this.customAudienceId = customAudienceName.customAudienceId;
    }

    public CustomAudienceName build() {
      return new CustomAudienceName(this);
    }
  }
}

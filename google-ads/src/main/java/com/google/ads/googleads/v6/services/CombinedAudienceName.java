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
public class CombinedAudienceName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/combinedAudiences/{combined_audience_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String combinedAudienceId;

  public String getCustomerId() {
    return customerId;
  }

  public String getCombinedAudienceId() {
    return combinedAudienceId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private CombinedAudienceName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    combinedAudienceId = Preconditions.checkNotNull(builder.getCombinedAudienceId());
  }

  public static CombinedAudienceName of(String customerId, String combinedAudienceId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setCombinedAudienceId(combinedAudienceId)
      .build();
  }

  public static String format(String customerId, String combinedAudienceId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setCombinedAudienceId(combinedAudienceId)
      .build()
      .toString();
  }

  public static CombinedAudienceName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "CombinedAudienceName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("combined_audience_id"));
  }

  public static List<CombinedAudienceName> parseList(List<String> formattedStrings) {
    List<CombinedAudienceName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CombinedAudienceName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (CombinedAudienceName value : values) {
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
          fieldMapBuilder.put("combinedAudienceId", combinedAudienceId);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "combined_audience_id", combinedAudienceId);
  }

  /** Builder for CombinedAudienceName. */
  public static class Builder {

    private String customerId;
    private String combinedAudienceId;

    public String getCustomerId() {
      return customerId;
    }

    public String getCombinedAudienceId() {
      return combinedAudienceId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCombinedAudienceId(String combinedAudienceId) {
      this.combinedAudienceId = combinedAudienceId;
      return this;
    }

    private Builder() {
    }

    private Builder(CombinedAudienceName combinedAudienceName) {
      customerId = combinedAudienceName.customerId;
      combinedAudienceId = combinedAudienceName.combinedAudienceId;
    }

    public CombinedAudienceName build() {
      return new CombinedAudienceName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CombinedAudienceName) {
      CombinedAudienceName that = (CombinedAudienceName) o;
      return (this.customerId.equals(that.customerId))
          && (this.combinedAudienceId.equals(that.combinedAudienceId));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= combinedAudienceId.hashCode();
    return h;
  }
}


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
public class RecommendationName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/recommendations/{recommendation_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String recommendationId;

  public String getCustomerId() {
    return customerId;
  }

  public String getRecommendationId() {
    return recommendationId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private RecommendationName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    recommendationId = Preconditions.checkNotNull(builder.getRecommendationId());
  }

  public static RecommendationName of(String customerId, String recommendationId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setRecommendationId(recommendationId)
      .build();
  }

  public static String format(String customerId, String recommendationId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setRecommendationId(recommendationId)
      .build()
      .toString();
  }

  public static RecommendationName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "RecommendationName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("recommendation_id"));
  }

  public static List<RecommendationName> parseList(List<String> formattedStrings) {
    List<RecommendationName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<RecommendationName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (RecommendationName value : values) {
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
          fieldMapBuilder.put("recommendationId", recommendationId);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "recommendation_id", recommendationId);
  }

  /** Builder for RecommendationName. */
  public static class Builder {

    private String customerId;
    private String recommendationId;

    public String getCustomerId() {
      return customerId;
    }

    public String getRecommendationId() {
      return recommendationId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setRecommendationId(String recommendationId) {
      this.recommendationId = recommendationId;
      return this;
    }

    private Builder() {
    }

    private Builder(RecommendationName recommendationName) {
      customerId = recommendationName.customerId;
      recommendationId = recommendationName.recommendationId;
    }

    public RecommendationName build() {
      return new RecommendationName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof RecommendationName) {
      RecommendationName that = (RecommendationName) o;
      return (this.customerId.equals(that.customerId))
          && (this.recommendationId.equals(that.recommendationId));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= recommendationId.hashCode();
    return h;
  }
}


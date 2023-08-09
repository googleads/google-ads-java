/*
 * Copyright 2023 Google LLC
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
public class RecommendationName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_RECOMMENDATION_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/recommendations/{recommendation_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String recommendationId;

  @Deprecated
  protected RecommendationName() {
    customerId = null;
    recommendationId = null;
  }

  private RecommendationName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    recommendationId = Preconditions.checkNotNull(builder.getRecommendationId());
  }

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

  public static RecommendationName of(String customerId, String recommendationId) {
    return newBuilder().setCustomerId(customerId).setRecommendationId(recommendationId).build();
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
        CUSTOMER_ID_RECOMMENDATION_ID.validatedMatch(
            formattedString, "RecommendationName.parse: formattedString not in valid format");
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
    List<String> list = new ArrayList<>(values.size());
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
    return CUSTOMER_ID_RECOMMENDATION_ID.matches(formattedString);
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
          if (recommendationId != null) {
            fieldMapBuilder.put("recommendation_id", recommendationId);
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
    return CUSTOMER_ID_RECOMMENDATION_ID.instantiate(
        "customer_id", customerId, "recommendation_id", recommendationId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      RecommendationName that = ((RecommendationName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.recommendationId, that.recommendationId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(recommendationId);
    return h;
  }

  /** Builder for customers/{customer_id}/recommendations/{recommendation_id}. */
  public static class Builder {
    private String customerId;
    private String recommendationId;

    protected Builder() {}

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

    private Builder(RecommendationName recommendationName) {
      this.customerId = recommendationName.customerId;
      this.recommendationId = recommendationName.recommendationId;
    }

    public RecommendationName build() {
      return new RecommendationName(this);
    }
  }
}

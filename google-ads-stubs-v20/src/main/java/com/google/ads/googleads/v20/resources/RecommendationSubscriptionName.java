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
public class RecommendationSubscriptionName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_RECOMMENDATION_TYPE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/recommendationSubscriptions/{recommendation_type}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String recommendationType;

  @Deprecated
  protected RecommendationSubscriptionName() {
    customerId = null;
    recommendationType = null;
  }

  private RecommendationSubscriptionName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    recommendationType = Preconditions.checkNotNull(builder.getRecommendationType());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getRecommendationType() {
    return recommendationType;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static RecommendationSubscriptionName of(String customerId, String recommendationType) {
    return newBuilder().setCustomerId(customerId).setRecommendationType(recommendationType).build();
  }

  public static String format(String customerId, String recommendationType) {
    return newBuilder()
        .setCustomerId(customerId)
        .setRecommendationType(recommendationType)
        .build()
        .toString();
  }

  public static RecommendationSubscriptionName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_RECOMMENDATION_TYPE.validatedMatch(
            formattedString,
            "RecommendationSubscriptionName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("recommendation_type"));
  }

  public static List<RecommendationSubscriptionName> parseList(List<String> formattedStrings) {
    List<RecommendationSubscriptionName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<RecommendationSubscriptionName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (RecommendationSubscriptionName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_RECOMMENDATION_TYPE.matches(formattedString);
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
          if (recommendationType != null) {
            fieldMapBuilder.put("recommendation_type", recommendationType);
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
    return CUSTOMER_ID_RECOMMENDATION_TYPE.instantiate(
        "customer_id", customerId, "recommendation_type", recommendationType);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      RecommendationSubscriptionName that = ((RecommendationSubscriptionName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.recommendationType, that.recommendationType);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(recommendationType);
    return h;
  }

  /** Builder for customers/{customer_id}/recommendationSubscriptions/{recommendation_type}. */
  public static class Builder {
    private String customerId;
    private String recommendationType;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getRecommendationType() {
      return recommendationType;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setRecommendationType(String recommendationType) {
      this.recommendationType = recommendationType;
      return this;
    }

    private Builder(RecommendationSubscriptionName recommendationSubscriptionName) {
      this.customerId = recommendationSubscriptionName.customerId;
      this.recommendationType = recommendationSubscriptionName.recommendationType;
    }

    public RecommendationSubscriptionName build() {
      return new RecommendationSubscriptionName(this);
    }
  }
}

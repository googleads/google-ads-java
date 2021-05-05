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

package com.google.ads.googleads.v7.resources;

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
public class DistanceViewName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_PLACEHOLDER_CHAIN_ID_DISTANCE_BUCKET =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/distanceViews/{placeholder_chain_id}~{distance_bucket}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String placeholderChainId;
  private final String distanceBucket;

  @Deprecated
  protected DistanceViewName() {
    customerId = null;
    placeholderChainId = null;
    distanceBucket = null;
  }

  private DistanceViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    placeholderChainId = Preconditions.checkNotNull(builder.getPlaceholderChainId());
    distanceBucket = Preconditions.checkNotNull(builder.getDistanceBucket());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getPlaceholderChainId() {
    return placeholderChainId;
  }

  public String getDistanceBucket() {
    return distanceBucket;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static DistanceViewName of(
      String customerId, String placeholderChainId, String distanceBucket) {
    return newBuilder()
        .setCustomerId(customerId)
        .setPlaceholderChainId(placeholderChainId)
        .setDistanceBucket(distanceBucket)
        .build();
  }

  public static String format(String customerId, String placeholderChainId, String distanceBucket) {
    return newBuilder()
        .setCustomerId(customerId)
        .setPlaceholderChainId(placeholderChainId)
        .setDistanceBucket(distanceBucket)
        .build()
        .toString();
  }

  public static DistanceViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_PLACEHOLDER_CHAIN_ID_DISTANCE_BUCKET.validatedMatch(
            formattedString, "DistanceViewName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("placeholder_chain_id"),
        matchMap.get("distance_bucket"));
  }

  public static List<DistanceViewName> parseList(List<String> formattedStrings) {
    List<DistanceViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<DistanceViewName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (DistanceViewName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_PLACEHOLDER_CHAIN_ID_DISTANCE_BUCKET.matches(formattedString);
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
          if (placeholderChainId != null) {
            fieldMapBuilder.put("placeholder_chain_id", placeholderChainId);
          }
          if (distanceBucket != null) {
            fieldMapBuilder.put("distance_bucket", distanceBucket);
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
    return CUSTOMER_ID_PLACEHOLDER_CHAIN_ID_DISTANCE_BUCKET.instantiate(
        "customer_id",
        customerId,
        "placeholder_chain_id",
        placeholderChainId,
        "distance_bucket",
        distanceBucket);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      DistanceViewName that = ((DistanceViewName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.placeholderChainId, that.placeholderChainId)
          && Objects.equals(this.distanceBucket, that.distanceBucket);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(placeholderChainId);
    h *= 1000003;
    h ^= Objects.hashCode(distanceBucket);
    return h;
  }

  /** Builder for customers/{customer_id}/distanceViews/{placeholder_chain_id}~{distance_bucket}. */
  public static class Builder {
    private String customerId;
    private String placeholderChainId;
    private String distanceBucket;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getPlaceholderChainId() {
      return placeholderChainId;
    }

    public String getDistanceBucket() {
      return distanceBucket;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setPlaceholderChainId(String placeholderChainId) {
      this.placeholderChainId = placeholderChainId;
      return this;
    }

    public Builder setDistanceBucket(String distanceBucket) {
      this.distanceBucket = distanceBucket;
      return this;
    }

    private Builder(DistanceViewName distanceViewName) {
      customerId = distanceViewName.customerId;
      placeholderChainId = distanceViewName.placeholderChainId;
      distanceBucket = distanceViewName.distanceBucket;
    }

    public DistanceViewName build() {
      return new DistanceViewName(this);
    }
  }
}

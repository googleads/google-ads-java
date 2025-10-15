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

package com.google.ads.googleads.v22.resources;

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
public class BiddingDataExclusionName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_SEASONALITY_EVENT_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/biddingDataExclusions/{seasonality_event_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String seasonalityEventId;

  @Deprecated
  protected BiddingDataExclusionName() {
    customerId = null;
    seasonalityEventId = null;
  }

  private BiddingDataExclusionName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    seasonalityEventId = Preconditions.checkNotNull(builder.getSeasonalityEventId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getSeasonalityEventId() {
    return seasonalityEventId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static BiddingDataExclusionName of(String customerId, String seasonalityEventId) {
    return newBuilder().setCustomerId(customerId).setSeasonalityEventId(seasonalityEventId).build();
  }

  public static String format(String customerId, String seasonalityEventId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setSeasonalityEventId(seasonalityEventId)
        .build()
        .toString();
  }

  public static BiddingDataExclusionName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_SEASONALITY_EVENT_ID.validatedMatch(
            formattedString, "BiddingDataExclusionName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("seasonality_event_id"));
  }

  public static List<BiddingDataExclusionName> parseList(List<String> formattedStrings) {
    List<BiddingDataExclusionName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<BiddingDataExclusionName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (BiddingDataExclusionName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_SEASONALITY_EVENT_ID.matches(formattedString);
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
          if (seasonalityEventId != null) {
            fieldMapBuilder.put("seasonality_event_id", seasonalityEventId);
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
    return CUSTOMER_ID_SEASONALITY_EVENT_ID.instantiate(
        "customer_id", customerId, "seasonality_event_id", seasonalityEventId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      BiddingDataExclusionName that = ((BiddingDataExclusionName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.seasonalityEventId, that.seasonalityEventId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(seasonalityEventId);
    return h;
  }

  /** Builder for customers/{customer_id}/biddingDataExclusions/{seasonality_event_id}. */
  public static class Builder {
    private String customerId;
    private String seasonalityEventId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getSeasonalityEventId() {
      return seasonalityEventId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setSeasonalityEventId(String seasonalityEventId) {
      this.seasonalityEventId = seasonalityEventId;
      return this;
    }

    private Builder(BiddingDataExclusionName biddingDataExclusionName) {
      this.customerId = biddingDataExclusionName.customerId;
      this.seasonalityEventId = biddingDataExclusionName.seasonalityEventId;
    }

    public BiddingDataExclusionName build() {
      return new BiddingDataExclusionName(this);
    }
  }
}

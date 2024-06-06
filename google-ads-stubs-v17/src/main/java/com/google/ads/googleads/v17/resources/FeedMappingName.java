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

package com.google.ads.googleads.v17.resources;

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
public class FeedMappingName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_FEED_ID_FEED_MAPPING_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/feedMappings/{feed_id}~{feed_mapping_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String feedId;
  private final String feedMappingId;

  @Deprecated
  protected FeedMappingName() {
    customerId = null;
    feedId = null;
    feedMappingId = null;
  }

  private FeedMappingName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    feedId = Preconditions.checkNotNull(builder.getFeedId());
    feedMappingId = Preconditions.checkNotNull(builder.getFeedMappingId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getFeedId() {
    return feedId;
  }

  public String getFeedMappingId() {
    return feedMappingId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static FeedMappingName of(String customerId, String feedId, String feedMappingId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setFeedId(feedId)
        .setFeedMappingId(feedMappingId)
        .build();
  }

  public static String format(String customerId, String feedId, String feedMappingId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setFeedId(feedId)
        .setFeedMappingId(feedMappingId)
        .build()
        .toString();
  }

  public static FeedMappingName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_FEED_ID_FEED_MAPPING_ID.validatedMatch(
            formattedString, "FeedMappingName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"), matchMap.get("feed_id"), matchMap.get("feed_mapping_id"));
  }

  public static List<FeedMappingName> parseList(List<String> formattedStrings) {
    List<FeedMappingName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<FeedMappingName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (FeedMappingName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_FEED_ID_FEED_MAPPING_ID.matches(formattedString);
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
          if (feedId != null) {
            fieldMapBuilder.put("feed_id", feedId);
          }
          if (feedMappingId != null) {
            fieldMapBuilder.put("feed_mapping_id", feedMappingId);
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
    return CUSTOMER_ID_FEED_ID_FEED_MAPPING_ID.instantiate(
        "customer_id", customerId, "feed_id", feedId, "feed_mapping_id", feedMappingId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      FeedMappingName that = ((FeedMappingName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.feedId, that.feedId)
          && Objects.equals(this.feedMappingId, that.feedMappingId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(feedId);
    h *= 1000003;
    h ^= Objects.hashCode(feedMappingId);
    return h;
  }

  /** Builder for customers/{customer_id}/feedMappings/{feed_id}~{feed_mapping_id}. */
  public static class Builder {
    private String customerId;
    private String feedId;
    private String feedMappingId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getFeedId() {
      return feedId;
    }

    public String getFeedMappingId() {
      return feedMappingId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setFeedId(String feedId) {
      this.feedId = feedId;
      return this;
    }

    public Builder setFeedMappingId(String feedMappingId) {
      this.feedMappingId = feedMappingId;
      return this;
    }

    private Builder(FeedMappingName feedMappingName) {
      this.customerId = feedMappingName.customerId;
      this.feedId = feedMappingName.feedId;
      this.feedMappingId = feedMappingName.feedMappingId;
    }

    public FeedMappingName build() {
      return new FeedMappingName(this);
    }
  }
}

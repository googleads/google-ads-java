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
public class FeedMappingName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/feedMappings/{feed_id}~{feed_mapping_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String feedId;
  private final String feedMappingId;

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

  private FeedMappingName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    feedId = Preconditions.checkNotNull(builder.getFeedId());
    feedMappingId = Preconditions.checkNotNull(builder.getFeedMappingId());
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
        PATH_TEMPLATE.validatedMatch(formattedString, "FeedMappingName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("feed_id"), matchMap.get("feed_mapping_id"));
  }

  public static List<FeedMappingName> parseList(List<String> formattedStrings) {
    List<FeedMappingName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<FeedMappingName> values) {
    List<String> list = new ArrayList<String>(values.size());
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
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("customerId", customerId);
          fieldMapBuilder.put("feedId", feedId);
          fieldMapBuilder.put("feedMappingId", feedMappingId);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "feed_id", feedId, "feed_mapping_id", feedMappingId);
  }

  /** Builder for FeedMappingName. */
  public static class Builder {

    private String customerId;
    private String feedId;
    private String feedMappingId;

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

    private Builder() {
    }

    private Builder(FeedMappingName feedMappingName) {
      customerId = feedMappingName.customerId;
      feedId = feedMappingName.feedId;
      feedMappingId = feedMappingName.feedMappingId;
    }

    public FeedMappingName build() {
      return new FeedMappingName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FeedMappingName) {
      FeedMappingName that = (FeedMappingName) o;
      return (this.customerId.equals(that.customerId))
          && (this.feedId.equals(that.feedId))
          && (this.feedMappingId.equals(that.feedMappingId));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= feedId.hashCode();
    h *= 1000003;
    h ^= feedMappingId.hashCode();
    return h;
  }
}


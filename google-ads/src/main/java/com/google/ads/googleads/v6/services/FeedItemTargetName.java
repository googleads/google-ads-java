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
public class FeedItemTargetName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/feedItemTargets/{feed_id}~{feed_item_id}~{feed_item_target_type}~{feed_item_target_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String feedId;
  private final String feedItemId;
  private final String feedItemTargetType;
  private final String feedItemTargetId;

  public String getCustomerId() {
    return customerId;
  }

  public String getFeedId() {
    return feedId;
  }

  public String getFeedItemId() {
    return feedItemId;
  }

  public String getFeedItemTargetType() {
    return feedItemTargetType;
  }

  public String getFeedItemTargetId() {
    return feedItemTargetId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private FeedItemTargetName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    feedId = Preconditions.checkNotNull(builder.getFeedId());
    feedItemId = Preconditions.checkNotNull(builder.getFeedItemId());
    feedItemTargetType = Preconditions.checkNotNull(builder.getFeedItemTargetType());
    feedItemTargetId = Preconditions.checkNotNull(builder.getFeedItemTargetId());
  }

  public static FeedItemTargetName of(String customerId, String feedId, String feedItemId, String feedItemTargetType, String feedItemTargetId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setFeedId(feedId)
      .setFeedItemId(feedItemId)
      .setFeedItemTargetType(feedItemTargetType)
      .setFeedItemTargetId(feedItemTargetId)
      .build();
  }

  public static String format(String customerId, String feedId, String feedItemId, String feedItemTargetType, String feedItemTargetId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setFeedId(feedId)
      .setFeedItemId(feedItemId)
      .setFeedItemTargetType(feedItemTargetType)
      .setFeedItemTargetId(feedItemTargetId)
      .build()
      .toString();
  }

  public static FeedItemTargetName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "FeedItemTargetName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("feed_id"), matchMap.get("feed_item_id"), matchMap.get("feed_item_target_type"), matchMap.get("feed_item_target_id"));
  }

  public static List<FeedItemTargetName> parseList(List<String> formattedStrings) {
    List<FeedItemTargetName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<FeedItemTargetName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (FeedItemTargetName value : values) {
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
          fieldMapBuilder.put("feedItemId", feedItemId);
          fieldMapBuilder.put("feedItemTargetType", feedItemTargetType);
          fieldMapBuilder.put("feedItemTargetId", feedItemTargetId);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "feed_id", feedId, "feed_item_id", feedItemId, "feed_item_target_type", feedItemTargetType, "feed_item_target_id", feedItemTargetId);
  }

  /** Builder for FeedItemTargetName. */
  public static class Builder {

    private String customerId;
    private String feedId;
    private String feedItemId;
    private String feedItemTargetType;
    private String feedItemTargetId;

    public String getCustomerId() {
      return customerId;
    }

    public String getFeedId() {
      return feedId;
    }

    public String getFeedItemId() {
      return feedItemId;
    }

    public String getFeedItemTargetType() {
      return feedItemTargetType;
    }

    public String getFeedItemTargetId() {
      return feedItemTargetId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setFeedId(String feedId) {
      this.feedId = feedId;
      return this;
    }

    public Builder setFeedItemId(String feedItemId) {
      this.feedItemId = feedItemId;
      return this;
    }

    public Builder setFeedItemTargetType(String feedItemTargetType) {
      this.feedItemTargetType = feedItemTargetType;
      return this;
    }

    public Builder setFeedItemTargetId(String feedItemTargetId) {
      this.feedItemTargetId = feedItemTargetId;
      return this;
    }

    private Builder() {
    }

    private Builder(FeedItemTargetName feedItemTargetName) {
      customerId = feedItemTargetName.customerId;
      feedId = feedItemTargetName.feedId;
      feedItemId = feedItemTargetName.feedItemId;
      feedItemTargetType = feedItemTargetName.feedItemTargetType;
      feedItemTargetId = feedItemTargetName.feedItemTargetId;
    }

    public FeedItemTargetName build() {
      return new FeedItemTargetName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FeedItemTargetName) {
      FeedItemTargetName that = (FeedItemTargetName) o;
      return (this.customerId.equals(that.customerId))
          && (this.feedId.equals(that.feedId))
          && (this.feedItemId.equals(that.feedItemId))
          && (this.feedItemTargetType.equals(that.feedItemTargetType))
          && (this.feedItemTargetId.equals(that.feedItemTargetId));
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
    h ^= feedItemId.hashCode();
    h *= 1000003;
    h ^= feedItemTargetType.hashCode();
    h *= 1000003;
    h ^= feedItemTargetId.hashCode();
    return h;
  }
}


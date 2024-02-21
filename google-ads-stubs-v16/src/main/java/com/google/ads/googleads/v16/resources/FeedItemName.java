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

package com.google.ads.googleads.v16.resources;

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
public class FeedItemName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_FEED_ID_FEED_ITEM_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/feedItems/{feed_id}~{feed_item_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String feedId;
  private final String feedItemId;

  @Deprecated
  protected FeedItemName() {
    customerId = null;
    feedId = null;
    feedItemId = null;
  }

  private FeedItemName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    feedId = Preconditions.checkNotNull(builder.getFeedId());
    feedItemId = Preconditions.checkNotNull(builder.getFeedItemId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getFeedId() {
    return feedId;
  }

  public String getFeedItemId() {
    return feedItemId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static FeedItemName of(String customerId, String feedId, String feedItemId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setFeedId(feedId)
        .setFeedItemId(feedItemId)
        .build();
  }

  public static String format(String customerId, String feedId, String feedItemId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setFeedId(feedId)
        .setFeedItemId(feedItemId)
        .build()
        .toString();
  }

  public static FeedItemName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_FEED_ID_FEED_ITEM_ID.validatedMatch(
            formattedString, "FeedItemName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("feed_id"), matchMap.get("feed_item_id"));
  }

  public static List<FeedItemName> parseList(List<String> formattedStrings) {
    List<FeedItemName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<FeedItemName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (FeedItemName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_FEED_ID_FEED_ITEM_ID.matches(formattedString);
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
          if (feedItemId != null) {
            fieldMapBuilder.put("feed_item_id", feedItemId);
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
    return CUSTOMER_ID_FEED_ID_FEED_ITEM_ID.instantiate(
        "customer_id", customerId, "feed_id", feedId, "feed_item_id", feedItemId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      FeedItemName that = ((FeedItemName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.feedId, that.feedId)
          && Objects.equals(this.feedItemId, that.feedItemId);
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
    h ^= Objects.hashCode(feedItemId);
    return h;
  }

  /** Builder for customers/{customer_id}/feedItems/{feed_id}~{feed_item_id}. */
  public static class Builder {
    private String customerId;
    private String feedId;
    private String feedItemId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getFeedId() {
      return feedId;
    }

    public String getFeedItemId() {
      return feedItemId;
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

    private Builder(FeedItemName feedItemName) {
      this.customerId = feedItemName.customerId;
      this.feedId = feedItemName.feedId;
      this.feedItemId = feedItemName.feedItemId;
    }

    public FeedItemName build() {
      return new FeedItemName(this);
    }
  }
}

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

package com.google.ads.googleads.v18.resources;

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
public class FeedItemSetName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_FEED_ID_FEED_ITEM_SET_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/feedItemSets/{feed_id}~{feed_item_set_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String feedId;
  private final String feedItemSetId;

  @Deprecated
  protected FeedItemSetName() {
    customerId = null;
    feedId = null;
    feedItemSetId = null;
  }

  private FeedItemSetName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    feedId = Preconditions.checkNotNull(builder.getFeedId());
    feedItemSetId = Preconditions.checkNotNull(builder.getFeedItemSetId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getFeedId() {
    return feedId;
  }

  public String getFeedItemSetId() {
    return feedItemSetId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static FeedItemSetName of(String customerId, String feedId, String feedItemSetId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setFeedId(feedId)
        .setFeedItemSetId(feedItemSetId)
        .build();
  }

  public static String format(String customerId, String feedId, String feedItemSetId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setFeedId(feedId)
        .setFeedItemSetId(feedItemSetId)
        .build()
        .toString();
  }

  public static FeedItemSetName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_FEED_ID_FEED_ITEM_SET_ID.validatedMatch(
            formattedString, "FeedItemSetName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"), matchMap.get("feed_id"), matchMap.get("feed_item_set_id"));
  }

  public static List<FeedItemSetName> parseList(List<String> formattedStrings) {
    List<FeedItemSetName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<FeedItemSetName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (FeedItemSetName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_FEED_ID_FEED_ITEM_SET_ID.matches(formattedString);
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
          if (feedItemSetId != null) {
            fieldMapBuilder.put("feed_item_set_id", feedItemSetId);
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
    return CUSTOMER_ID_FEED_ID_FEED_ITEM_SET_ID.instantiate(
        "customer_id", customerId, "feed_id", feedId, "feed_item_set_id", feedItemSetId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      FeedItemSetName that = ((FeedItemSetName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.feedId, that.feedId)
          && Objects.equals(this.feedItemSetId, that.feedItemSetId);
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
    h ^= Objects.hashCode(feedItemSetId);
    return h;
  }

  /** Builder for customers/{customer_id}/feedItemSets/{feed_id}~{feed_item_set_id}. */
  public static class Builder {
    private String customerId;
    private String feedId;
    private String feedItemSetId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getFeedId() {
      return feedId;
    }

    public String getFeedItemSetId() {
      return feedItemSetId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setFeedId(String feedId) {
      this.feedId = feedId;
      return this;
    }

    public Builder setFeedItemSetId(String feedItemSetId) {
      this.feedItemSetId = feedItemSetId;
      return this;
    }

    private Builder(FeedItemSetName feedItemSetName) {
      this.customerId = feedItemSetName.customerId;
      this.feedId = feedItemSetName.feedId;
      this.feedItemSetId = feedItemSetName.feedItemSetId;
    }

    public FeedItemSetName build() {
      return new FeedItemSetName(this);
    }
  }
}

/*
 * Copyright 2022 Google LLC
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

package com.google.ads.googleads.v10.resources;

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
public class ExtensionFeedItemName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_FEED_ITEM_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/extensionFeedItems/{feed_item_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String feedItemId;

  @Deprecated
  protected ExtensionFeedItemName() {
    customerId = null;
    feedItemId = null;
  }

  private ExtensionFeedItemName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    feedItemId = Preconditions.checkNotNull(builder.getFeedItemId());
  }

  public String getCustomerId() {
    return customerId;
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

  public static ExtensionFeedItemName of(String customerId, String feedItemId) {
    return newBuilder().setCustomerId(customerId).setFeedItemId(feedItemId).build();
  }

  public static String format(String customerId, String feedItemId) {
    return newBuilder().setCustomerId(customerId).setFeedItemId(feedItemId).build().toString();
  }

  public static ExtensionFeedItemName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_FEED_ITEM_ID.validatedMatch(
            formattedString, "ExtensionFeedItemName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("feed_item_id"));
  }

  public static List<ExtensionFeedItemName> parseList(List<String> formattedStrings) {
    List<ExtensionFeedItemName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ExtensionFeedItemName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ExtensionFeedItemName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_FEED_ITEM_ID.matches(formattedString);
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
    return CUSTOMER_ID_FEED_ITEM_ID.instantiate(
        "customer_id", customerId, "feed_item_id", feedItemId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      ExtensionFeedItemName that = ((ExtensionFeedItemName) o);
      return Objects.equals(this.customerId, that.customerId)
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
    h ^= Objects.hashCode(feedItemId);
    return h;
  }

  /** Builder for customers/{customer_id}/extensionFeedItems/{feed_item_id}. */
  public static class Builder {
    private String customerId;
    private String feedItemId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getFeedItemId() {
      return feedItemId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setFeedItemId(String feedItemId) {
      this.feedItemId = feedItemId;
      return this;
    }

    private Builder(ExtensionFeedItemName extensionFeedItemName) {
      this.customerId = extensionFeedItemName.customerId;
      this.feedItemId = extensionFeedItemName.feedItemId;
    }

    public ExtensionFeedItemName build() {
      return new ExtensionFeedItemName(this);
    }
  }
}

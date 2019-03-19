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

package com.google.ads.googleads.v1.resources;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class FeedItemName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/feedItems/{feed_item}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String feedItem;

  public String getCustomer() {
    return customer;
  }

  public String getFeedItem() {
    return feedItem;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private FeedItemName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    feedItem = Preconditions.checkNotNull(builder.getFeedItem());
  }

  public static FeedItemName of(String customer, String feedItem) {
    return newBuilder()
      .setCustomer(customer)
      .setFeedItem(feedItem)
      .build();
  }

  public static String format(String customer, String feedItem) {
    return newBuilder()
      .setCustomer(customer)
      .setFeedItem(feedItem)
      .build()
      .toString();
  }

  public static FeedItemName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "FeedItemName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("feed_item"));
  }

  public static List<FeedItemName> parseList(List<String> formattedStrings) {
    List<FeedItemName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<FeedItemName> values) {
    List<String> list = new ArrayList<String>(values.size());
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
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("customer", customer);
          fieldMapBuilder.put("feedItem", feedItem);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "feed_item", feedItem);
  }

  /** Builder for FeedItemName. */
  public static class Builder {

    private String customer;
    private String feedItem;

    public String getCustomer() {
      return customer;
    }

    public String getFeedItem() {
      return feedItem;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setFeedItem(String feedItem) {
      this.feedItem = feedItem;
      return this;
    }

    private Builder() {
    }

    private Builder(FeedItemName feedItemName) {
      customer = feedItemName.customer;
      feedItem = feedItemName.feedItem;
    }

    public FeedItemName build() {
      return new FeedItemName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof FeedItemName) {
      FeedItemName that = (FeedItemName) o;
      return (this.customer.equals(that.customer))
          && (this.feedItem.equals(that.feedItem));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= feedItem.hashCode();
    return h;
  }
}


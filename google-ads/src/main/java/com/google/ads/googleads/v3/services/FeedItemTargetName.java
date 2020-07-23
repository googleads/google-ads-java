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

package com.google.ads.googleads.v3.services;

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
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/feedItemTargets/{feed_item_target}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String feedItemTarget;

  public String getCustomer() {
    return customer;
  }

  public String getFeedItemTarget() {
    return feedItemTarget;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private FeedItemTargetName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    feedItemTarget = Preconditions.checkNotNull(builder.getFeedItemTarget());
  }

  public static FeedItemTargetName of(String customer, String feedItemTarget) {
    return newBuilder()
      .setCustomer(customer)
      .setFeedItemTarget(feedItemTarget)
      .build();
  }

  public static String format(String customer, String feedItemTarget) {
    return newBuilder()
      .setCustomer(customer)
      .setFeedItemTarget(feedItemTarget)
      .build()
      .toString();
  }

  public static FeedItemTargetName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "FeedItemTargetName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("feed_item_target"));
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
          fieldMapBuilder.put("customer", customer);
          fieldMapBuilder.put("feedItemTarget", feedItemTarget);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "feed_item_target", feedItemTarget);
  }

  /** Builder for FeedItemTargetName. */
  public static class Builder {

    private String customer;
    private String feedItemTarget;

    public String getCustomer() {
      return customer;
    }

    public String getFeedItemTarget() {
      return feedItemTarget;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setFeedItemTarget(String feedItemTarget) {
      this.feedItemTarget = feedItemTarget;
      return this;
    }

    private Builder() {
    }

    private Builder(FeedItemTargetName feedItemTargetName) {
      customer = feedItemTargetName.customer;
      feedItemTarget = feedItemTargetName.feedItemTarget;
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
      return (this.customer.equals(that.customer))
          && (this.feedItemTarget.equals(that.feedItemTarget));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= feedItemTarget.hashCode();
    return h;
  }
}


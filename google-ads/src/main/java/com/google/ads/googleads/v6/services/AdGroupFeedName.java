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
public class AdGroupFeedName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/adGroupFeeds/{ad_group_id}~{feed_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String adGroupId;
  private final String feedId;

  public String getCustomerId() {
    return customerId;
  }

  public String getAdGroupId() {
    return adGroupId;
  }

  public String getFeedId() {
    return feedId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private AdGroupFeedName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    adGroupId = Preconditions.checkNotNull(builder.getAdGroupId());
    feedId = Preconditions.checkNotNull(builder.getFeedId());
  }

  public static AdGroupFeedName of(String customerId, String adGroupId, String feedId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setAdGroupId(adGroupId)
      .setFeedId(feedId)
      .build();
  }

  public static String format(String customerId, String adGroupId, String feedId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setAdGroupId(adGroupId)
      .setFeedId(feedId)
      .build()
      .toString();
  }

  public static AdGroupFeedName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "AdGroupFeedName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("ad_group_id"), matchMap.get("feed_id"));
  }

  public static List<AdGroupFeedName> parseList(List<String> formattedStrings) {
    List<AdGroupFeedName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AdGroupFeedName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (AdGroupFeedName value : values) {
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
          fieldMapBuilder.put("adGroupId", adGroupId);
          fieldMapBuilder.put("feedId", feedId);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "ad_group_id", adGroupId, "feed_id", feedId);
  }

  /** Builder for AdGroupFeedName. */
  public static class Builder {

    private String customerId;
    private String adGroupId;
    private String feedId;

    public String getCustomerId() {
      return customerId;
    }

    public String getAdGroupId() {
      return adGroupId;
    }

    public String getFeedId() {
      return feedId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setAdGroupId(String adGroupId) {
      this.adGroupId = adGroupId;
      return this;
    }

    public Builder setFeedId(String feedId) {
      this.feedId = feedId;
      return this;
    }

    private Builder() {
    }

    private Builder(AdGroupFeedName adGroupFeedName) {
      customerId = adGroupFeedName.customerId;
      adGroupId = adGroupFeedName.adGroupId;
      feedId = adGroupFeedName.feedId;
    }

    public AdGroupFeedName build() {
      return new AdGroupFeedName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AdGroupFeedName) {
      AdGroupFeedName that = (AdGroupFeedName) o;
      return (this.customerId.equals(that.customerId))
          && (this.adGroupId.equals(that.adGroupId))
          && (this.feedId.equals(that.feedId));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= adGroupId.hashCode();
    h *= 1000003;
    h ^= feedId.hashCode();
    return h;
  }
}


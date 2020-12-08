/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.resources;

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
public class CustomerFeedName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_FEED_ID =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/customerFeeds/{feed_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String feedId;

  @Deprecated
  protected CustomerFeedName() {
    customerId = null;
    feedId = null;
  }

  private CustomerFeedName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    feedId = Preconditions.checkNotNull(builder.getFeedId());
  }

  public String getCustomerId() {
    return customerId;
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

  public static CustomerFeedName of(String customerId, String feedId) {
    return newBuilder().setCustomerId(customerId).setFeedId(feedId).build();
  }

  public static String format(String customerId, String feedId) {
    return newBuilder().setCustomerId(customerId).setFeedId(feedId).build().toString();
  }

  public static CustomerFeedName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_FEED_ID.validatedMatch(
            formattedString, "CustomerFeedName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("feed_id"));
  }

  public static List<CustomerFeedName> parseList(List<String> formattedStrings) {
    List<CustomerFeedName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CustomerFeedName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CustomerFeedName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_FEED_ID.matches(formattedString);
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
    return CUSTOMER_ID_FEED_ID.instantiate("customer_id", customerId, "feed_id", feedId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      CustomerFeedName that = ((CustomerFeedName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.feedId, that.feedId);
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
    return h;
  }

  /** Builder for customers/{customer_id}/customerFeeds/{feed_id}. */
  public static class Builder {
    private String customerId;
    private String feedId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getFeedId() {
      return feedId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setFeedId(String feedId) {
      this.feedId = feedId;
      return this;
    }

    private Builder(CustomerFeedName customerFeedName) {
      customerId = customerFeedName.customerId;
      feedId = customerFeedName.feedId;
    }

    public CustomerFeedName build() {
      return new CustomerFeedName(this);
    }
  }
}

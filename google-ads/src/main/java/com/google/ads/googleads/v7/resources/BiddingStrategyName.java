/*
 * Copyright 2021 Google LLC
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

package com.google.ads.googleads.v7.resources;

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
public class BiddingStrategyName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_BIDDING_STRATEGY_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/biddingStrategies/{bidding_strategy_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String biddingStrategyId;

  @Deprecated
  protected BiddingStrategyName() {
    customerId = null;
    biddingStrategyId = null;
  }

  private BiddingStrategyName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    biddingStrategyId = Preconditions.checkNotNull(builder.getBiddingStrategyId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getBiddingStrategyId() {
    return biddingStrategyId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static BiddingStrategyName of(String customerId, String biddingStrategyId) {
    return newBuilder().setCustomerId(customerId).setBiddingStrategyId(biddingStrategyId).build();
  }

  public static String format(String customerId, String biddingStrategyId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setBiddingStrategyId(biddingStrategyId)
        .build()
        .toString();
  }

  public static BiddingStrategyName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_BIDDING_STRATEGY_ID.validatedMatch(
            formattedString, "BiddingStrategyName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("bidding_strategy_id"));
  }

  public static List<BiddingStrategyName> parseList(List<String> formattedStrings) {
    List<BiddingStrategyName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<BiddingStrategyName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (BiddingStrategyName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_BIDDING_STRATEGY_ID.matches(formattedString);
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
          if (biddingStrategyId != null) {
            fieldMapBuilder.put("bidding_strategy_id", biddingStrategyId);
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
    return CUSTOMER_ID_BIDDING_STRATEGY_ID.instantiate(
        "customer_id", customerId, "bidding_strategy_id", biddingStrategyId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      BiddingStrategyName that = ((BiddingStrategyName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.biddingStrategyId, that.biddingStrategyId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(biddingStrategyId);
    return h;
  }

  /** Builder for customers/{customer_id}/biddingStrategies/{bidding_strategy_id}. */
  public static class Builder {
    private String customerId;
    private String biddingStrategyId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getBiddingStrategyId() {
      return biddingStrategyId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setBiddingStrategyId(String biddingStrategyId) {
      this.biddingStrategyId = biddingStrategyId;
      return this;
    }

    private Builder(BiddingStrategyName biddingStrategyName) {
      customerId = biddingStrategyName.customerId;
      biddingStrategyId = biddingStrategyName.biddingStrategyId;
    }

    public BiddingStrategyName build() {
      return new BiddingStrategyName(this);
    }
  }
}

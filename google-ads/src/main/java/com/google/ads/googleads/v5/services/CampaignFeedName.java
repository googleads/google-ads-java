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

package com.google.ads.googleads.v5.services;

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
public class CampaignFeedName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/campaignFeeds/{campaign_feed}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String campaignFeed;

  public String getCustomer() {
    return customer;
  }

  public String getCampaignFeed() {
    return campaignFeed;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private CampaignFeedName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    campaignFeed = Preconditions.checkNotNull(builder.getCampaignFeed());
  }

  public static CampaignFeedName of(String customer, String campaignFeed) {
    return newBuilder()
      .setCustomer(customer)
      .setCampaignFeed(campaignFeed)
      .build();
  }

  public static String format(String customer, String campaignFeed) {
    return newBuilder()
      .setCustomer(customer)
      .setCampaignFeed(campaignFeed)
      .build()
      .toString();
  }

  public static CampaignFeedName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "CampaignFeedName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("campaign_feed"));
  }

  public static List<CampaignFeedName> parseList(List<String> formattedStrings) {
    List<CampaignFeedName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CampaignFeedName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (CampaignFeedName value : values) {
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
          fieldMapBuilder.put("campaignFeed", campaignFeed);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "campaign_feed", campaignFeed);
  }

  /** Builder for CampaignFeedName. */
  public static class Builder {

    private String customer;
    private String campaignFeed;

    public String getCustomer() {
      return customer;
    }

    public String getCampaignFeed() {
      return campaignFeed;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setCampaignFeed(String campaignFeed) {
      this.campaignFeed = campaignFeed;
      return this;
    }

    private Builder() {
    }

    private Builder(CampaignFeedName campaignFeedName) {
      customer = campaignFeedName.customer;
      campaignFeed = campaignFeedName.campaignFeed;
    }

    public CampaignFeedName build() {
      return new CampaignFeedName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CampaignFeedName) {
      CampaignFeedName that = (CampaignFeedName) o;
      return (this.customer.equals(that.customer))
          && (this.campaignFeed.equals(that.campaignFeed));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= campaignFeed.hashCode();
    return h;
  }
}


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
public class SearchTermViewName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/searchTermViews/{campaign_id}~{ad_group_id}~{query}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String campaignId;
  private final String adGroupId;
  private final String query;

  public String getCustomerId() {
    return customerId;
  }

  public String getCampaignId() {
    return campaignId;
  }

  public String getAdGroupId() {
    return adGroupId;
  }

  public String getQuery() {
    return query;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private SearchTermViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    campaignId = Preconditions.checkNotNull(builder.getCampaignId());
    adGroupId = Preconditions.checkNotNull(builder.getAdGroupId());
    query = Preconditions.checkNotNull(builder.getQuery());
  }

  public static SearchTermViewName of(String customerId, String campaignId, String adGroupId, String query) {
    return newBuilder()
      .setCustomerId(customerId)
      .setCampaignId(campaignId)
      .setAdGroupId(adGroupId)
      .setQuery(query)
      .build();
  }

  public static String format(String customerId, String campaignId, String adGroupId, String query) {
    return newBuilder()
      .setCustomerId(customerId)
      .setCampaignId(campaignId)
      .setAdGroupId(adGroupId)
      .setQuery(query)
      .build()
      .toString();
  }

  public static SearchTermViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "SearchTermViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("campaign_id"), matchMap.get("ad_group_id"), matchMap.get("query"));
  }

  public static List<SearchTermViewName> parseList(List<String> formattedStrings) {
    List<SearchTermViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<SearchTermViewName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (SearchTermViewName value : values) {
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
          fieldMapBuilder.put("campaignId", campaignId);
          fieldMapBuilder.put("adGroupId", adGroupId);
          fieldMapBuilder.put("query", query);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "campaign_id", campaignId, "ad_group_id", adGroupId, "query", query);
  }

  /** Builder for SearchTermViewName. */
  public static class Builder {

    private String customerId;
    private String campaignId;
    private String adGroupId;
    private String query;

    public String getCustomerId() {
      return customerId;
    }

    public String getCampaignId() {
      return campaignId;
    }

    public String getAdGroupId() {
      return adGroupId;
    }

    public String getQuery() {
      return query;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCampaignId(String campaignId) {
      this.campaignId = campaignId;
      return this;
    }

    public Builder setAdGroupId(String adGroupId) {
      this.adGroupId = adGroupId;
      return this;
    }

    public Builder setQuery(String query) {
      this.query = query;
      return this;
    }

    private Builder() {
    }

    private Builder(SearchTermViewName searchTermViewName) {
      customerId = searchTermViewName.customerId;
      campaignId = searchTermViewName.campaignId;
      adGroupId = searchTermViewName.adGroupId;
      query = searchTermViewName.query;
    }

    public SearchTermViewName build() {
      return new SearchTermViewName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SearchTermViewName) {
      SearchTermViewName that = (SearchTermViewName) o;
      return (this.customerId.equals(that.customerId))
          && (this.campaignId.equals(that.campaignId))
          && (this.adGroupId.equals(that.adGroupId))
          && (this.query.equals(that.query));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= campaignId.hashCode();
    h *= 1000003;
    h ^= adGroupId.hashCode();
    h *= 1000003;
    h ^= query.hashCode();
    return h;
  }
}


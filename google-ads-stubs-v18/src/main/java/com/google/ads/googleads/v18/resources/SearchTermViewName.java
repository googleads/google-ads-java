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
public class SearchTermViewName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CAMPAIGN_ID_AD_GROUP_ID_QUERY =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/searchTermViews/{campaign_id}~{ad_group_id}~{query}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String campaignId;
  private final String adGroupId;
  private final String query;

  @Deprecated
  protected SearchTermViewName() {
    customerId = null;
    campaignId = null;
    adGroupId = null;
    query = null;
  }

  private SearchTermViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    campaignId = Preconditions.checkNotNull(builder.getCampaignId());
    adGroupId = Preconditions.checkNotNull(builder.getAdGroupId());
    query = Preconditions.checkNotNull(builder.getQuery());
  }

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

  public static SearchTermViewName of(
      String customerId, String campaignId, String adGroupId, String query) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignId(campaignId)
        .setAdGroupId(adGroupId)
        .setQuery(query)
        .build();
  }

  public static String format(
      String customerId, String campaignId, String adGroupId, String query) {
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
        CUSTOMER_ID_CAMPAIGN_ID_AD_GROUP_ID_QUERY.validatedMatch(
            formattedString, "SearchTermViewName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("campaign_id"),
        matchMap.get("ad_group_id"),
        matchMap.get("query"));
  }

  public static List<SearchTermViewName> parseList(List<String> formattedStrings) {
    List<SearchTermViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<SearchTermViewName> values) {
    List<String> list = new ArrayList<>(values.size());
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
    return CUSTOMER_ID_CAMPAIGN_ID_AD_GROUP_ID_QUERY.matches(formattedString);
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
          if (campaignId != null) {
            fieldMapBuilder.put("campaign_id", campaignId);
          }
          if (adGroupId != null) {
            fieldMapBuilder.put("ad_group_id", adGroupId);
          }
          if (query != null) {
            fieldMapBuilder.put("query", query);
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
    return CUSTOMER_ID_CAMPAIGN_ID_AD_GROUP_ID_QUERY.instantiate(
        "customer_id",
        customerId,
        "campaign_id",
        campaignId,
        "ad_group_id",
        adGroupId,
        "query",
        query);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      SearchTermViewName that = ((SearchTermViewName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.campaignId, that.campaignId)
          && Objects.equals(this.adGroupId, that.adGroupId)
          && Objects.equals(this.query, that.query);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(campaignId);
    h *= 1000003;
    h ^= Objects.hashCode(adGroupId);
    h *= 1000003;
    h ^= Objects.hashCode(query);
    return h;
  }

  /** Builder for customers/{customer_id}/searchTermViews/{campaign_id}~{ad_group_id}~{query}. */
  public static class Builder {
    private String customerId;
    private String campaignId;
    private String adGroupId;
    private String query;

    protected Builder() {}

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

    private Builder(SearchTermViewName searchTermViewName) {
      this.customerId = searchTermViewName.customerId;
      this.campaignId = searchTermViewName.campaignId;
      this.adGroupId = searchTermViewName.adGroupId;
      this.query = searchTermViewName.query;
    }

    public SearchTermViewName build() {
      return new SearchTermViewName(this);
    }
  }
}

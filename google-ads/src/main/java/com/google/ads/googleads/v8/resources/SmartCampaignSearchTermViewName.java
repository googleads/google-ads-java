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

package com.google.ads.googleads.v8.resources;

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
public class SmartCampaignSearchTermViewName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CAMPAIGN_ID_QUERY =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/smartCampaignSearchTermViews/{campaign_id}~{query}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String campaignId;
  private final String query;

  @Deprecated
  protected SmartCampaignSearchTermViewName() {
    customerId = null;
    campaignId = null;
    query = null;
  }

  private SmartCampaignSearchTermViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    campaignId = Preconditions.checkNotNull(builder.getCampaignId());
    query = Preconditions.checkNotNull(builder.getQuery());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getCampaignId() {
    return campaignId;
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

  public static SmartCampaignSearchTermViewName of(
      String customerId, String campaignId, String query) {
    return newBuilder().setCustomerId(customerId).setCampaignId(campaignId).setQuery(query).build();
  }

  public static String format(String customerId, String campaignId, String query) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignId(campaignId)
        .setQuery(query)
        .build()
        .toString();
  }

  public static SmartCampaignSearchTermViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CAMPAIGN_ID_QUERY.validatedMatch(
            formattedString,
            "SmartCampaignSearchTermViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("campaign_id"), matchMap.get("query"));
  }

  public static List<SmartCampaignSearchTermViewName> parseList(List<String> formattedStrings) {
    List<SmartCampaignSearchTermViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<SmartCampaignSearchTermViewName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (SmartCampaignSearchTermViewName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CAMPAIGN_ID_QUERY.matches(formattedString);
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
    return CUSTOMER_ID_CAMPAIGN_ID_QUERY.instantiate(
        "customer_id", customerId, "campaign_id", campaignId, "query", query);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      SmartCampaignSearchTermViewName that = ((SmartCampaignSearchTermViewName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.campaignId, that.campaignId)
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
    h ^= Objects.hashCode(query);
    return h;
  }

  /** Builder for customers/{customer_id}/smartCampaignSearchTermViews/{campaign_id}~{query}. */
  public static class Builder {
    private String customerId;
    private String campaignId;
    private String query;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getCampaignId() {
      return campaignId;
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

    public Builder setQuery(String query) {
      this.query = query;
      return this;
    }

    private Builder(SmartCampaignSearchTermViewName smartCampaignSearchTermViewName) {
      customerId = smartCampaignSearchTermViewName.customerId;
      campaignId = smartCampaignSearchTermViewName.campaignId;
      query = smartCampaignSearchTermViewName.query;
    }

    public SmartCampaignSearchTermViewName build() {
      return new SmartCampaignSearchTermViewName(this);
    }
  }
}

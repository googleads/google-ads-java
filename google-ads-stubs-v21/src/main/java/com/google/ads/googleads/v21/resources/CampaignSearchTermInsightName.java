/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v21.resources;

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
public class CampaignSearchTermInsightName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CAMPAIGN_ID_CLUSTER_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/campaignSearchTermInsights/{campaign_id}~{cluster_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String campaignId;
  private final String clusterId;

  @Deprecated
  protected CampaignSearchTermInsightName() {
    customerId = null;
    campaignId = null;
    clusterId = null;
  }

  private CampaignSearchTermInsightName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    campaignId = Preconditions.checkNotNull(builder.getCampaignId());
    clusterId = Preconditions.checkNotNull(builder.getClusterId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getCampaignId() {
    return campaignId;
  }

  public String getClusterId() {
    return clusterId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static CampaignSearchTermInsightName of(
      String customerId, String campaignId, String clusterId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignId(campaignId)
        .setClusterId(clusterId)
        .build();
  }

  public static String format(String customerId, String campaignId, String clusterId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignId(campaignId)
        .setClusterId(clusterId)
        .build()
        .toString();
  }

  public static CampaignSearchTermInsightName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CAMPAIGN_ID_CLUSTER_ID.validatedMatch(
            formattedString,
            "CampaignSearchTermInsightName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("campaign_id"), matchMap.get("cluster_id"));
  }

  public static List<CampaignSearchTermInsightName> parseList(List<String> formattedStrings) {
    List<CampaignSearchTermInsightName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CampaignSearchTermInsightName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CampaignSearchTermInsightName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CAMPAIGN_ID_CLUSTER_ID.matches(formattedString);
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
          if (clusterId != null) {
            fieldMapBuilder.put("cluster_id", clusterId);
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
    return CUSTOMER_ID_CAMPAIGN_ID_CLUSTER_ID.instantiate(
        "customer_id", customerId, "campaign_id", campaignId, "cluster_id", clusterId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      CampaignSearchTermInsightName that = ((CampaignSearchTermInsightName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.campaignId, that.campaignId)
          && Objects.equals(this.clusterId, that.clusterId);
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
    h ^= Objects.hashCode(clusterId);
    return h;
  }

  /** Builder for customers/{customer_id}/campaignSearchTermInsights/{campaign_id}~{cluster_id}. */
  public static class Builder {
    private String customerId;
    private String campaignId;
    private String clusterId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getCampaignId() {
      return campaignId;
    }

    public String getClusterId() {
      return clusterId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCampaignId(String campaignId) {
      this.campaignId = campaignId;
      return this;
    }

    public Builder setClusterId(String clusterId) {
      this.clusterId = clusterId;
      return this;
    }

    private Builder(CampaignSearchTermInsightName campaignSearchTermInsightName) {
      this.customerId = campaignSearchTermInsightName.customerId;
      this.campaignId = campaignSearchTermInsightName.campaignId;
      this.clusterId = campaignSearchTermInsightName.clusterId;
    }

    public CampaignSearchTermInsightName build() {
      return new CampaignSearchTermInsightName(this);
    }
  }
}

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

package com.google.ads.googleads.v22.resources;

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
public class CampaignGroupName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CAMPAIGN_GROUP_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/campaignGroups/{campaign_group_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String campaignGroupId;

  @Deprecated
  protected CampaignGroupName() {
    customerId = null;
    campaignGroupId = null;
  }

  private CampaignGroupName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    campaignGroupId = Preconditions.checkNotNull(builder.getCampaignGroupId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getCampaignGroupId() {
    return campaignGroupId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static CampaignGroupName of(String customerId, String campaignGroupId) {
    return newBuilder().setCustomerId(customerId).setCampaignGroupId(campaignGroupId).build();
  }

  public static String format(String customerId, String campaignGroupId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignGroupId(campaignGroupId)
        .build()
        .toString();
  }

  public static CampaignGroupName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CAMPAIGN_GROUP_ID.validatedMatch(
            formattedString, "CampaignGroupName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("campaign_group_id"));
  }

  public static List<CampaignGroupName> parseList(List<String> formattedStrings) {
    List<CampaignGroupName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CampaignGroupName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CampaignGroupName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CAMPAIGN_GROUP_ID.matches(formattedString);
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
          if (campaignGroupId != null) {
            fieldMapBuilder.put("campaign_group_id", campaignGroupId);
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
    return CUSTOMER_ID_CAMPAIGN_GROUP_ID.instantiate(
        "customer_id", customerId, "campaign_group_id", campaignGroupId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      CampaignGroupName that = ((CampaignGroupName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.campaignGroupId, that.campaignGroupId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(campaignGroupId);
    return h;
  }

  /** Builder for customers/{customer_id}/campaignGroups/{campaign_group_id}. */
  public static class Builder {
    private String customerId;
    private String campaignGroupId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getCampaignGroupId() {
      return campaignGroupId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCampaignGroupId(String campaignGroupId) {
      this.campaignGroupId = campaignGroupId;
      return this;
    }

    private Builder(CampaignGroupName campaignGroupName) {
      this.customerId = campaignGroupName.customerId;
      this.campaignGroupId = campaignGroupName.campaignGroupId;
    }

    public CampaignGroupName build() {
      return new CampaignGroupName(this);
    }
  }
}

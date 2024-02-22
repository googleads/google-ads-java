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

package com.google.ads.googleads.v16.resources;

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
public class CampaignSharedSetName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CAMPAIGN_ID_SHARED_SET_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/campaignSharedSets/{campaign_id}~{shared_set_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String campaignId;
  private final String sharedSetId;

  @Deprecated
  protected CampaignSharedSetName() {
    customerId = null;
    campaignId = null;
    sharedSetId = null;
  }

  private CampaignSharedSetName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    campaignId = Preconditions.checkNotNull(builder.getCampaignId());
    sharedSetId = Preconditions.checkNotNull(builder.getSharedSetId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getCampaignId() {
    return campaignId;
  }

  public String getSharedSetId() {
    return sharedSetId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static CampaignSharedSetName of(String customerId, String campaignId, String sharedSetId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignId(campaignId)
        .setSharedSetId(sharedSetId)
        .build();
  }

  public static String format(String customerId, String campaignId, String sharedSetId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignId(campaignId)
        .setSharedSetId(sharedSetId)
        .build()
        .toString();
  }

  public static CampaignSharedSetName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CAMPAIGN_ID_SHARED_SET_ID.validatedMatch(
            formattedString, "CampaignSharedSetName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"), matchMap.get("campaign_id"), matchMap.get("shared_set_id"));
  }

  public static List<CampaignSharedSetName> parseList(List<String> formattedStrings) {
    List<CampaignSharedSetName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CampaignSharedSetName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CampaignSharedSetName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CAMPAIGN_ID_SHARED_SET_ID.matches(formattedString);
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
          if (sharedSetId != null) {
            fieldMapBuilder.put("shared_set_id", sharedSetId);
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
    return CUSTOMER_ID_CAMPAIGN_ID_SHARED_SET_ID.instantiate(
        "customer_id", customerId, "campaign_id", campaignId, "shared_set_id", sharedSetId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      CampaignSharedSetName that = ((CampaignSharedSetName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.campaignId, that.campaignId)
          && Objects.equals(this.sharedSetId, that.sharedSetId);
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
    h ^= Objects.hashCode(sharedSetId);
    return h;
  }

  /** Builder for customers/{customer_id}/campaignSharedSets/{campaign_id}~{shared_set_id}. */
  public static class Builder {
    private String customerId;
    private String campaignId;
    private String sharedSetId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getCampaignId() {
      return campaignId;
    }

    public String getSharedSetId() {
      return sharedSetId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCampaignId(String campaignId) {
      this.campaignId = campaignId;
      return this;
    }

    public Builder setSharedSetId(String sharedSetId) {
      this.sharedSetId = sharedSetId;
      return this;
    }

    private Builder(CampaignSharedSetName campaignSharedSetName) {
      this.customerId = campaignSharedSetName.customerId;
      this.campaignId = campaignSharedSetName.campaignId;
      this.sharedSetId = campaignSharedSetName.sharedSetId;
    }

    public CampaignSharedSetName build() {
      return new CampaignSharedSetName(this);
    }
  }
}

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

package com.google.ads.googleads.v10.resources;

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
public class CampaignAssetSetName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CAMPAIGN_ID_ASSET_SET_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/campaignAssetSets/{campaign_id}~{asset_set_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String campaignId;
  private final String assetSetId;

  @Deprecated
  protected CampaignAssetSetName() {
    customerId = null;
    campaignId = null;
    assetSetId = null;
  }

  private CampaignAssetSetName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    campaignId = Preconditions.checkNotNull(builder.getCampaignId());
    assetSetId = Preconditions.checkNotNull(builder.getAssetSetId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getCampaignId() {
    return campaignId;
  }

  public String getAssetSetId() {
    return assetSetId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static CampaignAssetSetName of(String customerId, String campaignId, String assetSetId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignId(campaignId)
        .setAssetSetId(assetSetId)
        .build();
  }

  public static String format(String customerId, String campaignId, String assetSetId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignId(campaignId)
        .setAssetSetId(assetSetId)
        .build()
        .toString();
  }

  public static CampaignAssetSetName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CAMPAIGN_ID_ASSET_SET_ID.validatedMatch(
            formattedString, "CampaignAssetSetName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"), matchMap.get("campaign_id"), matchMap.get("asset_set_id"));
  }

  public static List<CampaignAssetSetName> parseList(List<String> formattedStrings) {
    List<CampaignAssetSetName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CampaignAssetSetName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CampaignAssetSetName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CAMPAIGN_ID_ASSET_SET_ID.matches(formattedString);
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
          if (assetSetId != null) {
            fieldMapBuilder.put("asset_set_id", assetSetId);
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
    return CUSTOMER_ID_CAMPAIGN_ID_ASSET_SET_ID.instantiate(
        "customer_id", customerId, "campaign_id", campaignId, "asset_set_id", assetSetId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      CampaignAssetSetName that = ((CampaignAssetSetName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.campaignId, that.campaignId)
          && Objects.equals(this.assetSetId, that.assetSetId);
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
    h ^= Objects.hashCode(assetSetId);
    return h;
  }

  /** Builder for customers/{customer_id}/campaignAssetSets/{campaign_id}~{asset_set_id}. */
  public static class Builder {
    private String customerId;
    private String campaignId;
    private String assetSetId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getCampaignId() {
      return campaignId;
    }

    public String getAssetSetId() {
      return assetSetId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCampaignId(String campaignId) {
      this.campaignId = campaignId;
      return this;
    }

    public Builder setAssetSetId(String assetSetId) {
      this.assetSetId = assetSetId;
      return this;
    }

    private Builder(CampaignAssetSetName campaignAssetSetName) {
      this.customerId = campaignAssetSetName.customerId;
      this.campaignId = campaignAssetSetName.campaignId;
      this.assetSetId = campaignAssetSetName.assetSetId;
    }

    public CampaignAssetSetName build() {
      return new CampaignAssetSetName(this);
    }
  }
}

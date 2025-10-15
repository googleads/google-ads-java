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
public class TargetingExpansionViewName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CAMPAIGN_ID_TARGETING_EXPANSION_TYPE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/targetingExpansionViews/{campaign_id}~{targeting_expansion_type}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String campaignId;
  private final String targetingExpansionType;

  @Deprecated
  protected TargetingExpansionViewName() {
    customerId = null;
    campaignId = null;
    targetingExpansionType = null;
  }

  private TargetingExpansionViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    campaignId = Preconditions.checkNotNull(builder.getCampaignId());
    targetingExpansionType = Preconditions.checkNotNull(builder.getTargetingExpansionType());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getCampaignId() {
    return campaignId;
  }

  public String getTargetingExpansionType() {
    return targetingExpansionType;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static TargetingExpansionViewName of(
      String customerId, String campaignId, String targetingExpansionType) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignId(campaignId)
        .setTargetingExpansionType(targetingExpansionType)
        .build();
  }

  public static String format(String customerId, String campaignId, String targetingExpansionType) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignId(campaignId)
        .setTargetingExpansionType(targetingExpansionType)
        .build()
        .toString();
  }

  public static TargetingExpansionViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CAMPAIGN_ID_TARGETING_EXPANSION_TYPE.validatedMatch(
            formattedString,
            "TargetingExpansionViewName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("campaign_id"),
        matchMap.get("targeting_expansion_type"));
  }

  public static List<TargetingExpansionViewName> parseList(List<String> formattedStrings) {
    List<TargetingExpansionViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<TargetingExpansionViewName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (TargetingExpansionViewName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CAMPAIGN_ID_TARGETING_EXPANSION_TYPE.matches(formattedString);
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
          if (targetingExpansionType != null) {
            fieldMapBuilder.put("targeting_expansion_type", targetingExpansionType);
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
    return CUSTOMER_ID_CAMPAIGN_ID_TARGETING_EXPANSION_TYPE.instantiate(
        "customer_id",
        customerId,
        "campaign_id",
        campaignId,
        "targeting_expansion_type",
        targetingExpansionType);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      TargetingExpansionViewName that = ((TargetingExpansionViewName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.campaignId, that.campaignId)
          && Objects.equals(this.targetingExpansionType, that.targetingExpansionType);
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
    h ^= Objects.hashCode(targetingExpansionType);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/targetingExpansionViews/{campaign_id}~{targeting_expansion_type}.
   */
  public static class Builder {
    private String customerId;
    private String campaignId;
    private String targetingExpansionType;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getCampaignId() {
      return campaignId;
    }

    public String getTargetingExpansionType() {
      return targetingExpansionType;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCampaignId(String campaignId) {
      this.campaignId = campaignId;
      return this;
    }

    public Builder setTargetingExpansionType(String targetingExpansionType) {
      this.targetingExpansionType = targetingExpansionType;
      return this;
    }

    private Builder(TargetingExpansionViewName targetingExpansionViewName) {
      this.customerId = targetingExpansionViewName.customerId;
      this.campaignId = targetingExpansionViewName.campaignId;
      this.targetingExpansionType = targetingExpansionViewName.targetingExpansionType;
    }

    public TargetingExpansionViewName build() {
      return new TargetingExpansionViewName(this);
    }
  }
}

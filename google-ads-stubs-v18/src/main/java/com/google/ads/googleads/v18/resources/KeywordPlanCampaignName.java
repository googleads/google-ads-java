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
public class KeywordPlanCampaignName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_KEYWORD_PLAN_CAMPAIGN_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String keywordPlanCampaignId;

  @Deprecated
  protected KeywordPlanCampaignName() {
    customerId = null;
    keywordPlanCampaignId = null;
  }

  private KeywordPlanCampaignName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    keywordPlanCampaignId = Preconditions.checkNotNull(builder.getKeywordPlanCampaignId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getKeywordPlanCampaignId() {
    return keywordPlanCampaignId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static KeywordPlanCampaignName of(String customerId, String keywordPlanCampaignId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setKeywordPlanCampaignId(keywordPlanCampaignId)
        .build();
  }

  public static String format(String customerId, String keywordPlanCampaignId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setKeywordPlanCampaignId(keywordPlanCampaignId)
        .build()
        .toString();
  }

  public static KeywordPlanCampaignName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_KEYWORD_PLAN_CAMPAIGN_ID.validatedMatch(
            formattedString, "KeywordPlanCampaignName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("keyword_plan_campaign_id"));
  }

  public static List<KeywordPlanCampaignName> parseList(List<String> formattedStrings) {
    List<KeywordPlanCampaignName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<KeywordPlanCampaignName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (KeywordPlanCampaignName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_KEYWORD_PLAN_CAMPAIGN_ID.matches(formattedString);
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
          if (keywordPlanCampaignId != null) {
            fieldMapBuilder.put("keyword_plan_campaign_id", keywordPlanCampaignId);
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
    return CUSTOMER_ID_KEYWORD_PLAN_CAMPAIGN_ID.instantiate(
        "customer_id", customerId, "keyword_plan_campaign_id", keywordPlanCampaignId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      KeywordPlanCampaignName that = ((KeywordPlanCampaignName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.keywordPlanCampaignId, that.keywordPlanCampaignId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(keywordPlanCampaignId);
    return h;
  }

  /** Builder for customers/{customer_id}/keywordPlanCampaigns/{keyword_plan_campaign_id}. */
  public static class Builder {
    private String customerId;
    private String keywordPlanCampaignId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getKeywordPlanCampaignId() {
      return keywordPlanCampaignId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setKeywordPlanCampaignId(String keywordPlanCampaignId) {
      this.keywordPlanCampaignId = keywordPlanCampaignId;
      return this;
    }

    private Builder(KeywordPlanCampaignName keywordPlanCampaignName) {
      this.customerId = keywordPlanCampaignName.customerId;
      this.keywordPlanCampaignId = keywordPlanCampaignName.keywordPlanCampaignId;
    }

    public KeywordPlanCampaignName build() {
      return new KeywordPlanCampaignName(this);
    }
  }
}

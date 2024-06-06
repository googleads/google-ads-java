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

package com.google.ads.googleads.v17.resources;

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
public class KeywordPlanCampaignKeywordName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_KEYWORD_PLAN_CAMPAIGN_KEYWORD_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/keywordPlanCampaignKeywords/{keyword_plan_campaign_keyword_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String keywordPlanCampaignKeywordId;

  @Deprecated
  protected KeywordPlanCampaignKeywordName() {
    customerId = null;
    keywordPlanCampaignKeywordId = null;
  }

  private KeywordPlanCampaignKeywordName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    keywordPlanCampaignKeywordId =
        Preconditions.checkNotNull(builder.getKeywordPlanCampaignKeywordId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getKeywordPlanCampaignKeywordId() {
    return keywordPlanCampaignKeywordId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static KeywordPlanCampaignKeywordName of(
      String customerId, String keywordPlanCampaignKeywordId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setKeywordPlanCampaignKeywordId(keywordPlanCampaignKeywordId)
        .build();
  }

  public static String format(String customerId, String keywordPlanCampaignKeywordId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setKeywordPlanCampaignKeywordId(keywordPlanCampaignKeywordId)
        .build()
        .toString();
  }

  public static KeywordPlanCampaignKeywordName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_KEYWORD_PLAN_CAMPAIGN_KEYWORD_ID.validatedMatch(
            formattedString,
            "KeywordPlanCampaignKeywordName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("keyword_plan_campaign_keyword_id"));
  }

  public static List<KeywordPlanCampaignKeywordName> parseList(List<String> formattedStrings) {
    List<KeywordPlanCampaignKeywordName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<KeywordPlanCampaignKeywordName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (KeywordPlanCampaignKeywordName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_KEYWORD_PLAN_CAMPAIGN_KEYWORD_ID.matches(formattedString);
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
          if (keywordPlanCampaignKeywordId != null) {
            fieldMapBuilder.put("keyword_plan_campaign_keyword_id", keywordPlanCampaignKeywordId);
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
    return CUSTOMER_ID_KEYWORD_PLAN_CAMPAIGN_KEYWORD_ID.instantiate(
        "customer_id",
        customerId,
        "keyword_plan_campaign_keyword_id",
        keywordPlanCampaignKeywordId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      KeywordPlanCampaignKeywordName that = ((KeywordPlanCampaignKeywordName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.keywordPlanCampaignKeywordId, that.keywordPlanCampaignKeywordId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(keywordPlanCampaignKeywordId);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/keywordPlanCampaignKeywords/{keyword_plan_campaign_keyword_id}.
   */
  public static class Builder {
    private String customerId;
    private String keywordPlanCampaignKeywordId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getKeywordPlanCampaignKeywordId() {
      return keywordPlanCampaignKeywordId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setKeywordPlanCampaignKeywordId(String keywordPlanCampaignKeywordId) {
      this.keywordPlanCampaignKeywordId = keywordPlanCampaignKeywordId;
      return this;
    }

    private Builder(KeywordPlanCampaignKeywordName keywordPlanCampaignKeywordName) {
      this.customerId = keywordPlanCampaignKeywordName.customerId;
      this.keywordPlanCampaignKeywordId =
          keywordPlanCampaignKeywordName.keywordPlanCampaignKeywordId;
    }

    public KeywordPlanCampaignKeywordName build() {
      return new KeywordPlanCampaignKeywordName(this);
    }
  }
}

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

package com.google.ads.googleads.v7.resources;

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
public class AdScheduleViewName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CAMPAIGN_ID_CRITERION_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/adScheduleViews/{campaign_id}~{criterion_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String campaignId;
  private final String criterionId;

  @Deprecated
  protected AdScheduleViewName() {
    customerId = null;
    campaignId = null;
    criterionId = null;
  }

  private AdScheduleViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    campaignId = Preconditions.checkNotNull(builder.getCampaignId());
    criterionId = Preconditions.checkNotNull(builder.getCriterionId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getCampaignId() {
    return campaignId;
  }

  public String getCriterionId() {
    return criterionId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static AdScheduleViewName of(String customerId, String campaignId, String criterionId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignId(campaignId)
        .setCriterionId(criterionId)
        .build();
  }

  public static String format(String customerId, String campaignId, String criterionId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignId(campaignId)
        .setCriterionId(criterionId)
        .build()
        .toString();
  }

  public static AdScheduleViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CAMPAIGN_ID_CRITERION_ID.validatedMatch(
            formattedString, "AdScheduleViewName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"), matchMap.get("campaign_id"), matchMap.get("criterion_id"));
  }

  public static List<AdScheduleViewName> parseList(List<String> formattedStrings) {
    List<AdScheduleViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AdScheduleViewName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (AdScheduleViewName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CAMPAIGN_ID_CRITERION_ID.matches(formattedString);
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
          if (criterionId != null) {
            fieldMapBuilder.put("criterion_id", criterionId);
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
    return CUSTOMER_ID_CAMPAIGN_ID_CRITERION_ID.instantiate(
        "customer_id", customerId, "campaign_id", campaignId, "criterion_id", criterionId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      AdScheduleViewName that = ((AdScheduleViewName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.campaignId, that.campaignId)
          && Objects.equals(this.criterionId, that.criterionId);
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
    h ^= Objects.hashCode(criterionId);
    return h;
  }

  /** Builder for customers/{customer_id}/adScheduleViews/{campaign_id}~{criterion_id}. */
  public static class Builder {
    private String customerId;
    private String campaignId;
    private String criterionId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getCampaignId() {
      return campaignId;
    }

    public String getCriterionId() {
      return criterionId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCampaignId(String campaignId) {
      this.campaignId = campaignId;
      return this;
    }

    public Builder setCriterionId(String criterionId) {
      this.criterionId = criterionId;
      return this;
    }

    private Builder(AdScheduleViewName adScheduleViewName) {
      customerId = adScheduleViewName.customerId;
      campaignId = adScheduleViewName.campaignId;
      criterionId = adScheduleViewName.criterionId;
    }

    public AdScheduleViewName build() {
      return new AdScheduleViewName(this);
    }
  }
}

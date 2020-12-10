/*
 * Copyright 2020 Google LLC
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

package com.google.ads.googleads.v6.resources;

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
public class CampaignExperimentName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CAMPAIGN_EXPERIMENT_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/campaignExperiments/{campaign_experiment_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String campaignExperimentId;

  @Deprecated
  protected CampaignExperimentName() {
    customerId = null;
    campaignExperimentId = null;
  }

  private CampaignExperimentName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    campaignExperimentId = Preconditions.checkNotNull(builder.getCampaignExperimentId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getCampaignExperimentId() {
    return campaignExperimentId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static CampaignExperimentName of(String customerId, String campaignExperimentId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignExperimentId(campaignExperimentId)
        .build();
  }

  public static String format(String customerId, String campaignExperimentId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignExperimentId(campaignExperimentId)
        .build()
        .toString();
  }

  public static CampaignExperimentName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CAMPAIGN_EXPERIMENT_ID.validatedMatch(
            formattedString, "CampaignExperimentName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("campaign_experiment_id"));
  }

  public static List<CampaignExperimentName> parseList(List<String> formattedStrings) {
    List<CampaignExperimentName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CampaignExperimentName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (CampaignExperimentName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CAMPAIGN_EXPERIMENT_ID.matches(formattedString);
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
          if (campaignExperimentId != null) {
            fieldMapBuilder.put("campaign_experiment_id", campaignExperimentId);
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
    return CUSTOMER_ID_CAMPAIGN_EXPERIMENT_ID.instantiate(
        "customer_id", customerId, "campaign_experiment_id", campaignExperimentId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      CampaignExperimentName that = ((CampaignExperimentName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.campaignExperimentId, that.campaignExperimentId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(campaignExperimentId);
    return h;
  }

  /** Builder for customers/{customer_id}/campaignExperiments/{campaign_experiment_id}. */
  public static class Builder {
    private String customerId;
    private String campaignExperimentId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getCampaignExperimentId() {
      return campaignExperimentId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCampaignExperimentId(String campaignExperimentId) {
      this.campaignExperimentId = campaignExperimentId;
      return this;
    }

    private Builder(CampaignExperimentName campaignExperimentName) {
      customerId = campaignExperimentName.customerId;
      campaignExperimentId = campaignExperimentName.campaignExperimentId;
    }

    public CampaignExperimentName build() {
      return new CampaignExperimentName(this);
    }
  }
}

/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.ads.googleads.v6.services;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

/**
 * AUTO-GENERATED DOCUMENTATION AND CLASS
 */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class CampaignExperimentName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/campaignExperiments/{campaign_experiment_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String campaignExperimentId;

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

  private CampaignExperimentName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    campaignExperimentId = Preconditions.checkNotNull(builder.getCampaignExperimentId());
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
        PATH_TEMPLATE.validatedMatch(formattedString, "CampaignExperimentName.parse: formattedString not in valid format");
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
    List<String> list = new ArrayList<String>(values.size());
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
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("customerId", customerId);
          fieldMapBuilder.put("campaignExperimentId", campaignExperimentId);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "campaign_experiment_id", campaignExperimentId);
  }

  /** Builder for CampaignExperimentName. */
  public static class Builder {

    private String customerId;
    private String campaignExperimentId;

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

    private Builder() {
    }

    private Builder(CampaignExperimentName campaignExperimentName) {
      customerId = campaignExperimentName.customerId;
      campaignExperimentId = campaignExperimentName.campaignExperimentId;
    }

    public CampaignExperimentName build() {
      return new CampaignExperimentName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CampaignExperimentName) {
      CampaignExperimentName that = (CampaignExperimentName) o;
      return (this.customerId.equals(that.customerId))
          && (this.campaignExperimentId.equals(that.campaignExperimentId));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= campaignExperimentId.hashCode();
    return h;
  }
}


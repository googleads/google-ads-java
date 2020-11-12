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
public class CampaignDraftName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/campaignDrafts/{base_campaign_id}~{draft_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String baseCampaignId;
  private final String draftId;

  public String getCustomerId() {
    return customerId;
  }

  public String getBaseCampaignId() {
    return baseCampaignId;
  }

  public String getDraftId() {
    return draftId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private CampaignDraftName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    baseCampaignId = Preconditions.checkNotNull(builder.getBaseCampaignId());
    draftId = Preconditions.checkNotNull(builder.getDraftId());
  }

  public static CampaignDraftName of(String customerId, String baseCampaignId, String draftId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setBaseCampaignId(baseCampaignId)
      .setDraftId(draftId)
      .build();
  }

  public static String format(String customerId, String baseCampaignId, String draftId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setBaseCampaignId(baseCampaignId)
      .setDraftId(draftId)
      .build()
      .toString();
  }

  public static CampaignDraftName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "CampaignDraftName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("base_campaign_id"), matchMap.get("draft_id"));
  }

  public static List<CampaignDraftName> parseList(List<String> formattedStrings) {
    List<CampaignDraftName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CampaignDraftName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (CampaignDraftName value : values) {
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
          fieldMapBuilder.put("baseCampaignId", baseCampaignId);
          fieldMapBuilder.put("draftId", draftId);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "base_campaign_id", baseCampaignId, "draft_id", draftId);
  }

  /** Builder for CampaignDraftName. */
  public static class Builder {

    private String customerId;
    private String baseCampaignId;
    private String draftId;

    public String getCustomerId() {
      return customerId;
    }

    public String getBaseCampaignId() {
      return baseCampaignId;
    }

    public String getDraftId() {
      return draftId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setBaseCampaignId(String baseCampaignId) {
      this.baseCampaignId = baseCampaignId;
      return this;
    }

    public Builder setDraftId(String draftId) {
      this.draftId = draftId;
      return this;
    }

    private Builder() {
    }

    private Builder(CampaignDraftName campaignDraftName) {
      customerId = campaignDraftName.customerId;
      baseCampaignId = campaignDraftName.baseCampaignId;
      draftId = campaignDraftName.draftId;
    }

    public CampaignDraftName build() {
      return new CampaignDraftName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CampaignDraftName) {
      CampaignDraftName that = (CampaignDraftName) o;
      return (this.customerId.equals(that.customerId))
          && (this.baseCampaignId.equals(that.baseCampaignId))
          && (this.draftId.equals(that.draftId));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= baseCampaignId.hashCode();
    h *= 1000003;
    h ^= draftId.hashCode();
    return h;
  }
}


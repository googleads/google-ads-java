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
public class PaidOrganicSearchTermViewName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/paidOrganicSearchTermViews/{campaign_id}~{ad_group_id}~{base64_search_term}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String campaignId;
  private final String adGroupId;
  private final String base64SearchTerm;

  public String getCustomerId() {
    return customerId;
  }

  public String getCampaignId() {
    return campaignId;
  }

  public String getAdGroupId() {
    return adGroupId;
  }

  public String getBase64SearchTerm() {
    return base64SearchTerm;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private PaidOrganicSearchTermViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    campaignId = Preconditions.checkNotNull(builder.getCampaignId());
    adGroupId = Preconditions.checkNotNull(builder.getAdGroupId());
    base64SearchTerm = Preconditions.checkNotNull(builder.getBase64SearchTerm());
  }

  public static PaidOrganicSearchTermViewName of(String customerId, String campaignId, String adGroupId, String base64SearchTerm) {
    return newBuilder()
      .setCustomerId(customerId)
      .setCampaignId(campaignId)
      .setAdGroupId(adGroupId)
      .setBase64SearchTerm(base64SearchTerm)
      .build();
  }

  public static String format(String customerId, String campaignId, String adGroupId, String base64SearchTerm) {
    return newBuilder()
      .setCustomerId(customerId)
      .setCampaignId(campaignId)
      .setAdGroupId(adGroupId)
      .setBase64SearchTerm(base64SearchTerm)
      .build()
      .toString();
  }

  public static PaidOrganicSearchTermViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "PaidOrganicSearchTermViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("campaign_id"), matchMap.get("ad_group_id"), matchMap.get("base64_search_term"));
  }

  public static List<PaidOrganicSearchTermViewName> parseList(List<String> formattedStrings) {
    List<PaidOrganicSearchTermViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<PaidOrganicSearchTermViewName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (PaidOrganicSearchTermViewName value : values) {
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
          fieldMapBuilder.put("campaignId", campaignId);
          fieldMapBuilder.put("adGroupId", adGroupId);
          fieldMapBuilder.put("base64SearchTerm", base64SearchTerm);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "campaign_id", campaignId, "ad_group_id", adGroupId, "base64_search_term", base64SearchTerm);
  }

  /** Builder for PaidOrganicSearchTermViewName. */
  public static class Builder {

    private String customerId;
    private String campaignId;
    private String adGroupId;
    private String base64SearchTerm;

    public String getCustomerId() {
      return customerId;
    }

    public String getCampaignId() {
      return campaignId;
    }

    public String getAdGroupId() {
      return adGroupId;
    }

    public String getBase64SearchTerm() {
      return base64SearchTerm;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCampaignId(String campaignId) {
      this.campaignId = campaignId;
      return this;
    }

    public Builder setAdGroupId(String adGroupId) {
      this.adGroupId = adGroupId;
      return this;
    }

    public Builder setBase64SearchTerm(String base64SearchTerm) {
      this.base64SearchTerm = base64SearchTerm;
      return this;
    }

    private Builder() {
    }

    private Builder(PaidOrganicSearchTermViewName paidOrganicSearchTermViewName) {
      customerId = paidOrganicSearchTermViewName.customerId;
      campaignId = paidOrganicSearchTermViewName.campaignId;
      adGroupId = paidOrganicSearchTermViewName.adGroupId;
      base64SearchTerm = paidOrganicSearchTermViewName.base64SearchTerm;
    }

    public PaidOrganicSearchTermViewName build() {
      return new PaidOrganicSearchTermViewName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof PaidOrganicSearchTermViewName) {
      PaidOrganicSearchTermViewName that = (PaidOrganicSearchTermViewName) o;
      return (this.customerId.equals(that.customerId))
          && (this.campaignId.equals(that.campaignId))
          && (this.adGroupId.equals(that.adGroupId))
          && (this.base64SearchTerm.equals(that.base64SearchTerm));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= campaignId.hashCode();
    h *= 1000003;
    h ^= adGroupId.hashCode();
    h *= 1000003;
    h ^= base64SearchTerm.hashCode();
    return h;
  }
}


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

package com.google.ads.googleads.v3.services;

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
public class CampaignBidModifierName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/campaignBidModifiers/{campaign_bid_modifier}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String campaignBidModifier;

  public String getCustomer() {
    return customer;
  }

  public String getCampaignBidModifier() {
    return campaignBidModifier;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private CampaignBidModifierName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    campaignBidModifier = Preconditions.checkNotNull(builder.getCampaignBidModifier());
  }

  public static CampaignBidModifierName of(String customer, String campaignBidModifier) {
    return newBuilder()
      .setCustomer(customer)
      .setCampaignBidModifier(campaignBidModifier)
      .build();
  }

  public static String format(String customer, String campaignBidModifier) {
    return newBuilder()
      .setCustomer(customer)
      .setCampaignBidModifier(campaignBidModifier)
      .build()
      .toString();
  }

  public static CampaignBidModifierName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "CampaignBidModifierName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("campaign_bid_modifier"));
  }

  public static List<CampaignBidModifierName> parseList(List<String> formattedStrings) {
    List<CampaignBidModifierName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CampaignBidModifierName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (CampaignBidModifierName value : values) {
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
          fieldMapBuilder.put("customer", customer);
          fieldMapBuilder.put("campaignBidModifier", campaignBidModifier);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "campaign_bid_modifier", campaignBidModifier);
  }

  /** Builder for CampaignBidModifierName. */
  public static class Builder {

    private String customer;
    private String campaignBidModifier;

    public String getCustomer() {
      return customer;
    }

    public String getCampaignBidModifier() {
      return campaignBidModifier;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setCampaignBidModifier(String campaignBidModifier) {
      this.campaignBidModifier = campaignBidModifier;
      return this;
    }

    private Builder() {
    }

    private Builder(CampaignBidModifierName campaignBidModifierName) {
      customer = campaignBidModifierName.customer;
      campaignBidModifier = campaignBidModifierName.campaignBidModifier;
    }

    public CampaignBidModifierName build() {
      return new CampaignBidModifierName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CampaignBidModifierName) {
      CampaignBidModifierName that = (CampaignBidModifierName) o;
      return (this.customer.equals(that.customer))
          && (this.campaignBidModifier.equals(that.campaignBidModifier));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= campaignBidModifier.hashCode();
    return h;
  }
}


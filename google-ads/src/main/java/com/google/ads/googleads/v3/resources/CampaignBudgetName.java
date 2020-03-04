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

package com.google.ads.googleads.v3.resources;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class CampaignBudgetName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/campaignBudgets/{campaign_budget}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String campaignBudget;

  public String getCustomer() {
    return customer;
  }

  public String getCampaignBudget() {
    return campaignBudget;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private CampaignBudgetName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    campaignBudget = Preconditions.checkNotNull(builder.getCampaignBudget());
  }

  public static CampaignBudgetName of(String customer, String campaignBudget) {
    return newBuilder()
      .setCustomer(customer)
      .setCampaignBudget(campaignBudget)
      .build();
  }

  public static String format(String customer, String campaignBudget) {
    return newBuilder()
      .setCustomer(customer)
      .setCampaignBudget(campaignBudget)
      .build()
      .toString();
  }

  public static CampaignBudgetName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "CampaignBudgetName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("campaign_budget"));
  }

  public static List<CampaignBudgetName> parseList(List<String> formattedStrings) {
    List<CampaignBudgetName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CampaignBudgetName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (CampaignBudgetName value : values) {
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
          fieldMapBuilder.put("campaignBudget", campaignBudget);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "campaign_budget", campaignBudget);
  }

  /** Builder for CampaignBudgetName. */
  public static class Builder {

    private String customer;
    private String campaignBudget;

    public String getCustomer() {
      return customer;
    }

    public String getCampaignBudget() {
      return campaignBudget;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setCampaignBudget(String campaignBudget) {
      this.campaignBudget = campaignBudget;
      return this;
    }

    private Builder() {
    }

    private Builder(CampaignBudgetName campaignBudgetName) {
      customer = campaignBudgetName.customer;
      campaignBudget = campaignBudgetName.campaignBudget;
    }

    public CampaignBudgetName build() {
      return new CampaignBudgetName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CampaignBudgetName) {
      CampaignBudgetName that = (CampaignBudgetName) o;
      return (this.customer.equals(that.customer))
          && (this.campaignBudget.equals(that.campaignBudget));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= campaignBudget.hashCode();
    return h;
  }
}


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

package com.google.ads.googleads.v0.resources;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class CampaignGroupName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/campaignGroups/{campaign_group}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String campaignGroup;

  public String getCustomer() {
    return customer;
  }

  public String getCampaignGroup() {
    return campaignGroup;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private CampaignGroupName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    campaignGroup = Preconditions.checkNotNull(builder.getCampaignGroup());
  }

  public static CampaignGroupName of(String customer, String campaignGroup) {
    return newBuilder()
      .setCustomer(customer)
      .setCampaignGroup(campaignGroup)
      .build();
  }

  public static String format(String customer, String campaignGroup) {
    return newBuilder()
      .setCustomer(customer)
      .setCampaignGroup(campaignGroup)
      .build()
      .toString();
  }

  public static CampaignGroupName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "CampaignGroupName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("campaign_group"));
  }

  public static List<CampaignGroupName> parseList(List<String> formattedStrings) {
    List<CampaignGroupName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CampaignGroupName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (CampaignGroupName value : values) {
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
          fieldMapBuilder.put("campaignGroup", campaignGroup);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "campaign_group", campaignGroup);
  }

  /** Builder for CampaignGroupName. */
  public static class Builder {

    private String customer;
    private String campaignGroup;

    public String getCustomer() {
      return customer;
    }

    public String getCampaignGroup() {
      return campaignGroup;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setCampaignGroup(String campaignGroup) {
      this.campaignGroup = campaignGroup;
      return this;
    }

    private Builder() {
    }

    private Builder(CampaignGroupName campaignGroupName) {
      customer = campaignGroupName.customer;
      campaignGroup = campaignGroupName.campaignGroup;
    }

    public CampaignGroupName build() {
      return new CampaignGroupName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CampaignGroupName) {
      CampaignGroupName that = (CampaignGroupName) o;
      return (this.customer.equals(that.customer))
          && (this.campaignGroup.equals(that.campaignGroup));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= campaignGroup.hashCode();
    return h;
  }
}


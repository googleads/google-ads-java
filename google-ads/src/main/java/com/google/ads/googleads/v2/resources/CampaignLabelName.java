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

package com.google.ads.googleads.v2.resources;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class CampaignLabelName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/campaignLabels/{campaign_label}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String campaignLabel;

  public String getCustomer() {
    return customer;
  }

  public String getCampaignLabel() {
    return campaignLabel;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private CampaignLabelName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    campaignLabel = Preconditions.checkNotNull(builder.getCampaignLabel());
  }

  public static CampaignLabelName of(String customer, String campaignLabel) {
    return newBuilder()
      .setCustomer(customer)
      .setCampaignLabel(campaignLabel)
      .build();
  }

  public static String format(String customer, String campaignLabel) {
    return newBuilder()
      .setCustomer(customer)
      .setCampaignLabel(campaignLabel)
      .build()
      .toString();
  }

  public static CampaignLabelName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "CampaignLabelName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("campaign_label"));
  }

  public static List<CampaignLabelName> parseList(List<String> formattedStrings) {
    List<CampaignLabelName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CampaignLabelName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (CampaignLabelName value : values) {
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
          fieldMapBuilder.put("campaignLabel", campaignLabel);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "campaign_label", campaignLabel);
  }

  /** Builder for CampaignLabelName. */
  public static class Builder {

    private String customer;
    private String campaignLabel;

    public String getCustomer() {
      return customer;
    }

    public String getCampaignLabel() {
      return campaignLabel;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setCampaignLabel(String campaignLabel) {
      this.campaignLabel = campaignLabel;
      return this;
    }

    private Builder() {
    }

    private Builder(CampaignLabelName campaignLabelName) {
      customer = campaignLabelName.customer;
      campaignLabel = campaignLabelName.campaignLabel;
    }

    public CampaignLabelName build() {
      return new CampaignLabelName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CampaignLabelName) {
      CampaignLabelName that = (CampaignLabelName) o;
      return (this.customer.equals(that.customer))
          && (this.campaignLabel.equals(that.campaignLabel));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= campaignLabel.hashCode();
    return h;
  }
}


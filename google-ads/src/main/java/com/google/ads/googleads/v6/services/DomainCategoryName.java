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
public class DomainCategoryName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/domainCategories/{campaign_id}~{base64_category}~{language_code}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String campaignId;
  private final String base64Category;
  private final String languageCode;

  public String getCustomerId() {
    return customerId;
  }

  public String getCampaignId() {
    return campaignId;
  }

  public String getBase64Category() {
    return base64Category;
  }

  public String getLanguageCode() {
    return languageCode;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private DomainCategoryName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    campaignId = Preconditions.checkNotNull(builder.getCampaignId());
    base64Category = Preconditions.checkNotNull(builder.getBase64Category());
    languageCode = Preconditions.checkNotNull(builder.getLanguageCode());
  }

  public static DomainCategoryName of(String customerId, String campaignId, String base64Category, String languageCode) {
    return newBuilder()
      .setCustomerId(customerId)
      .setCampaignId(campaignId)
      .setBase64Category(base64Category)
      .setLanguageCode(languageCode)
      .build();
  }

  public static String format(String customerId, String campaignId, String base64Category, String languageCode) {
    return newBuilder()
      .setCustomerId(customerId)
      .setCampaignId(campaignId)
      .setBase64Category(base64Category)
      .setLanguageCode(languageCode)
      .build()
      .toString();
  }

  public static DomainCategoryName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "DomainCategoryName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("campaign_id"), matchMap.get("base64_category"), matchMap.get("language_code"));
  }

  public static List<DomainCategoryName> parseList(List<String> formattedStrings) {
    List<DomainCategoryName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<DomainCategoryName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (DomainCategoryName value : values) {
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
          fieldMapBuilder.put("base64Category", base64Category);
          fieldMapBuilder.put("languageCode", languageCode);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "campaign_id", campaignId, "base64_category", base64Category, "language_code", languageCode);
  }

  /** Builder for DomainCategoryName. */
  public static class Builder {

    private String customerId;
    private String campaignId;
    private String base64Category;
    private String languageCode;

    public String getCustomerId() {
      return customerId;
    }

    public String getCampaignId() {
      return campaignId;
    }

    public String getBase64Category() {
      return base64Category;
    }

    public String getLanguageCode() {
      return languageCode;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCampaignId(String campaignId) {
      this.campaignId = campaignId;
      return this;
    }

    public Builder setBase64Category(String base64Category) {
      this.base64Category = base64Category;
      return this;
    }

    public Builder setLanguageCode(String languageCode) {
      this.languageCode = languageCode;
      return this;
    }

    private Builder() {
    }

    private Builder(DomainCategoryName domainCategoryName) {
      customerId = domainCategoryName.customerId;
      campaignId = domainCategoryName.campaignId;
      base64Category = domainCategoryName.base64Category;
      languageCode = domainCategoryName.languageCode;
    }

    public DomainCategoryName build() {
      return new DomainCategoryName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DomainCategoryName) {
      DomainCategoryName that = (DomainCategoryName) o;
      return (this.customerId.equals(that.customerId))
          && (this.campaignId.equals(that.campaignId))
          && (this.base64Category.equals(that.base64Category))
          && (this.languageCode.equals(that.languageCode));
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
    h ^= base64Category.hashCode();
    h *= 1000003;
    h ^= languageCode.hashCode();
    return h;
  }
}


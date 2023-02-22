/*
 * Copyright 2022 Google LLC
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

package com.google.ads.googleads.v13.resources;

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
public class DomainCategoryName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CAMPAIGN_ID_BASE64_CATEGORY_LANGUAGE_CODE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/domainCategories/{campaign_id}~{base64_category}~{language_code}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String campaignId;
  private final String base64Category;
  private final String languageCode;

  @Deprecated
  protected DomainCategoryName() {
    customerId = null;
    campaignId = null;
    base64Category = null;
    languageCode = null;
  }

  private DomainCategoryName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    campaignId = Preconditions.checkNotNull(builder.getCampaignId());
    base64Category = Preconditions.checkNotNull(builder.getBase64Category());
    languageCode = Preconditions.checkNotNull(builder.getLanguageCode());
  }

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

  public static DomainCategoryName of(
      String customerId, String campaignId, String base64Category, String languageCode) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCampaignId(campaignId)
        .setBase64Category(base64Category)
        .setLanguageCode(languageCode)
        .build();
  }

  public static String format(
      String customerId, String campaignId, String base64Category, String languageCode) {
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
        CUSTOMER_ID_CAMPAIGN_ID_BASE64_CATEGORY_LANGUAGE_CODE.validatedMatch(
            formattedString, "DomainCategoryName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("campaign_id"),
        matchMap.get("base64_category"),
        matchMap.get("language_code"));
  }

  public static List<DomainCategoryName> parseList(List<String> formattedStrings) {
    List<DomainCategoryName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<DomainCategoryName> values) {
    List<String> list = new ArrayList<>(values.size());
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
    return CUSTOMER_ID_CAMPAIGN_ID_BASE64_CATEGORY_LANGUAGE_CODE.matches(formattedString);
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
          if (base64Category != null) {
            fieldMapBuilder.put("base64_category", base64Category);
          }
          if (languageCode != null) {
            fieldMapBuilder.put("language_code", languageCode);
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
    return CUSTOMER_ID_CAMPAIGN_ID_BASE64_CATEGORY_LANGUAGE_CODE.instantiate(
        "customer_id",
        customerId,
        "campaign_id",
        campaignId,
        "base64_category",
        base64Category,
        "language_code",
        languageCode);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      DomainCategoryName that = ((DomainCategoryName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.campaignId, that.campaignId)
          && Objects.equals(this.base64Category, that.base64Category)
          && Objects.equals(this.languageCode, that.languageCode);
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
    h ^= Objects.hashCode(base64Category);
    h *= 1000003;
    h ^= Objects.hashCode(languageCode);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/domainCategories/{campaign_id}~{base64_category}~{language_code}.
   */
  public static class Builder {
    private String customerId;
    private String campaignId;
    private String base64Category;
    private String languageCode;

    protected Builder() {}

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

    private Builder(DomainCategoryName domainCategoryName) {
      this.customerId = domainCategoryName.customerId;
      this.campaignId = domainCategoryName.campaignId;
      this.base64Category = domainCategoryName.base64Category;
      this.languageCode = domainCategoryName.languageCode;
    }

    public DomainCategoryName build() {
      return new DomainCategoryName(this);
    }
  }
}

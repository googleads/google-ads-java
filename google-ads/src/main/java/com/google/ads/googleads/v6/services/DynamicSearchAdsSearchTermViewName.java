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
public class DynamicSearchAdsSearchTermViewName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/dynamicSearchAdsSearchTermViews/{ad_group_id}~{search_term_fingerprint}~{headline_fingerprint}~{landing_page_fingerprint}~{page_url_fingerprint}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String adGroupId;
  private final String searchTermFingerprint;
  private final String headlineFingerprint;
  private final String landingPageFingerprint;
  private final String pageUrlFingerprint;

  public String getCustomerId() {
    return customerId;
  }

  public String getAdGroupId() {
    return adGroupId;
  }

  public String getSearchTermFingerprint() {
    return searchTermFingerprint;
  }

  public String getHeadlineFingerprint() {
    return headlineFingerprint;
  }

  public String getLandingPageFingerprint() {
    return landingPageFingerprint;
  }

  public String getPageUrlFingerprint() {
    return pageUrlFingerprint;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private DynamicSearchAdsSearchTermViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    adGroupId = Preconditions.checkNotNull(builder.getAdGroupId());
    searchTermFingerprint = Preconditions.checkNotNull(builder.getSearchTermFingerprint());
    headlineFingerprint = Preconditions.checkNotNull(builder.getHeadlineFingerprint());
    landingPageFingerprint = Preconditions.checkNotNull(builder.getLandingPageFingerprint());
    pageUrlFingerprint = Preconditions.checkNotNull(builder.getPageUrlFingerprint());
  }

  public static DynamicSearchAdsSearchTermViewName of(String customerId, String adGroupId, String searchTermFingerprint, String headlineFingerprint, String landingPageFingerprint, String pageUrlFingerprint) {
    return newBuilder()
      .setCustomerId(customerId)
      .setAdGroupId(adGroupId)
      .setSearchTermFingerprint(searchTermFingerprint)
      .setHeadlineFingerprint(headlineFingerprint)
      .setLandingPageFingerprint(landingPageFingerprint)
      .setPageUrlFingerprint(pageUrlFingerprint)
      .build();
  }

  public static String format(String customerId, String adGroupId, String searchTermFingerprint, String headlineFingerprint, String landingPageFingerprint, String pageUrlFingerprint) {
    return newBuilder()
      .setCustomerId(customerId)
      .setAdGroupId(adGroupId)
      .setSearchTermFingerprint(searchTermFingerprint)
      .setHeadlineFingerprint(headlineFingerprint)
      .setLandingPageFingerprint(landingPageFingerprint)
      .setPageUrlFingerprint(pageUrlFingerprint)
      .build()
      .toString();
  }

  public static DynamicSearchAdsSearchTermViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "DynamicSearchAdsSearchTermViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("ad_group_id"), matchMap.get("search_term_fingerprint"), matchMap.get("headline_fingerprint"), matchMap.get("landing_page_fingerprint"), matchMap.get("page_url_fingerprint"));
  }

  public static List<DynamicSearchAdsSearchTermViewName> parseList(List<String> formattedStrings) {
    List<DynamicSearchAdsSearchTermViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<DynamicSearchAdsSearchTermViewName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (DynamicSearchAdsSearchTermViewName value : values) {
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
          fieldMapBuilder.put("adGroupId", adGroupId);
          fieldMapBuilder.put("searchTermFingerprint", searchTermFingerprint);
          fieldMapBuilder.put("headlineFingerprint", headlineFingerprint);
          fieldMapBuilder.put("landingPageFingerprint", landingPageFingerprint);
          fieldMapBuilder.put("pageUrlFingerprint", pageUrlFingerprint);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "ad_group_id", adGroupId, "search_term_fingerprint", searchTermFingerprint, "headline_fingerprint", headlineFingerprint, "landing_page_fingerprint", landingPageFingerprint, "page_url_fingerprint", pageUrlFingerprint);
  }

  /** Builder for DynamicSearchAdsSearchTermViewName. */
  public static class Builder {

    private String customerId;
    private String adGroupId;
    private String searchTermFingerprint;
    private String headlineFingerprint;
    private String landingPageFingerprint;
    private String pageUrlFingerprint;

    public String getCustomerId() {
      return customerId;
    }

    public String getAdGroupId() {
      return adGroupId;
    }

    public String getSearchTermFingerprint() {
      return searchTermFingerprint;
    }

    public String getHeadlineFingerprint() {
      return headlineFingerprint;
    }

    public String getLandingPageFingerprint() {
      return landingPageFingerprint;
    }

    public String getPageUrlFingerprint() {
      return pageUrlFingerprint;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setAdGroupId(String adGroupId) {
      this.adGroupId = adGroupId;
      return this;
    }

    public Builder setSearchTermFingerprint(String searchTermFingerprint) {
      this.searchTermFingerprint = searchTermFingerprint;
      return this;
    }

    public Builder setHeadlineFingerprint(String headlineFingerprint) {
      this.headlineFingerprint = headlineFingerprint;
      return this;
    }

    public Builder setLandingPageFingerprint(String landingPageFingerprint) {
      this.landingPageFingerprint = landingPageFingerprint;
      return this;
    }

    public Builder setPageUrlFingerprint(String pageUrlFingerprint) {
      this.pageUrlFingerprint = pageUrlFingerprint;
      return this;
    }

    private Builder() {
    }

    private Builder(DynamicSearchAdsSearchTermViewName dynamicSearchAdsSearchTermViewName) {
      customerId = dynamicSearchAdsSearchTermViewName.customerId;
      adGroupId = dynamicSearchAdsSearchTermViewName.adGroupId;
      searchTermFingerprint = dynamicSearchAdsSearchTermViewName.searchTermFingerprint;
      headlineFingerprint = dynamicSearchAdsSearchTermViewName.headlineFingerprint;
      landingPageFingerprint = dynamicSearchAdsSearchTermViewName.landingPageFingerprint;
      pageUrlFingerprint = dynamicSearchAdsSearchTermViewName.pageUrlFingerprint;
    }

    public DynamicSearchAdsSearchTermViewName build() {
      return new DynamicSearchAdsSearchTermViewName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof DynamicSearchAdsSearchTermViewName) {
      DynamicSearchAdsSearchTermViewName that = (DynamicSearchAdsSearchTermViewName) o;
      return (this.customerId.equals(that.customerId))
          && (this.adGroupId.equals(that.adGroupId))
          && (this.searchTermFingerprint.equals(that.searchTermFingerprint))
          && (this.headlineFingerprint.equals(that.headlineFingerprint))
          && (this.landingPageFingerprint.equals(that.landingPageFingerprint))
          && (this.pageUrlFingerprint.equals(that.pageUrlFingerprint));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= adGroupId.hashCode();
    h *= 1000003;
    h ^= searchTermFingerprint.hashCode();
    h *= 1000003;
    h ^= headlineFingerprint.hashCode();
    h *= 1000003;
    h ^= landingPageFingerprint.hashCode();
    h *= 1000003;
    h ^= pageUrlFingerprint.hashCode();
    return h;
  }
}


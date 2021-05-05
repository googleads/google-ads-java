/*
 * Copyright 2021 Google LLC
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

package com.google.ads.googleads.v7.resources;

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
public class DynamicSearchAdsSearchTermViewName implements ResourceName {
  private static final PathTemplate
      CUSTOMER_ID_AD_GROUP_ID_SEARCH_TERM_FINGERPRINT_HEADLINE_FINGERPRINT_LANDING_PAGE_FINGERPRINT_PAGE_URL_FINGERPRINT =
          PathTemplate.createWithoutUrlEncoding(
              "customers/{customer_id}/dynamicSearchAdsSearchTermViews/{ad_group_id}~{search_term_fingerprint}~{headline_fingerprint}~{landing_page_fingerprint}~{page_url_fingerprint}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String adGroupId;
  private final String searchTermFingerprint;
  private final String headlineFingerprint;
  private final String landingPageFingerprint;
  private final String pageUrlFingerprint;

  @Deprecated
  protected DynamicSearchAdsSearchTermViewName() {
    customerId = null;
    adGroupId = null;
    searchTermFingerprint = null;
    headlineFingerprint = null;
    landingPageFingerprint = null;
    pageUrlFingerprint = null;
  }

  private DynamicSearchAdsSearchTermViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    adGroupId = Preconditions.checkNotNull(builder.getAdGroupId());
    searchTermFingerprint = Preconditions.checkNotNull(builder.getSearchTermFingerprint());
    headlineFingerprint = Preconditions.checkNotNull(builder.getHeadlineFingerprint());
    landingPageFingerprint = Preconditions.checkNotNull(builder.getLandingPageFingerprint());
    pageUrlFingerprint = Preconditions.checkNotNull(builder.getPageUrlFingerprint());
  }

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

  public static DynamicSearchAdsSearchTermViewName of(
      String customerId,
      String adGroupId,
      String searchTermFingerprint,
      String headlineFingerprint,
      String landingPageFingerprint,
      String pageUrlFingerprint) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAdGroupId(adGroupId)
        .setSearchTermFingerprint(searchTermFingerprint)
        .setHeadlineFingerprint(headlineFingerprint)
        .setLandingPageFingerprint(landingPageFingerprint)
        .setPageUrlFingerprint(pageUrlFingerprint)
        .build();
  }

  public static String format(
      String customerId,
      String adGroupId,
      String searchTermFingerprint,
      String headlineFingerprint,
      String landingPageFingerprint,
      String pageUrlFingerprint) {
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
        CUSTOMER_ID_AD_GROUP_ID_SEARCH_TERM_FINGERPRINT_HEADLINE_FINGERPRINT_LANDING_PAGE_FINGERPRINT_PAGE_URL_FINGERPRINT
            .validatedMatch(
                formattedString,
                "DynamicSearchAdsSearchTermViewName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("ad_group_id"),
        matchMap.get("search_term_fingerprint"),
        matchMap.get("headline_fingerprint"),
        matchMap.get("landing_page_fingerprint"),
        matchMap.get("page_url_fingerprint"));
  }

  public static List<DynamicSearchAdsSearchTermViewName> parseList(List<String> formattedStrings) {
    List<DynamicSearchAdsSearchTermViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<DynamicSearchAdsSearchTermViewName> values) {
    List<String> list = new ArrayList<>(values.size());
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
    return CUSTOMER_ID_AD_GROUP_ID_SEARCH_TERM_FINGERPRINT_HEADLINE_FINGERPRINT_LANDING_PAGE_FINGERPRINT_PAGE_URL_FINGERPRINT
        .matches(formattedString);
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
          if (adGroupId != null) {
            fieldMapBuilder.put("ad_group_id", adGroupId);
          }
          if (searchTermFingerprint != null) {
            fieldMapBuilder.put("search_term_fingerprint", searchTermFingerprint);
          }
          if (headlineFingerprint != null) {
            fieldMapBuilder.put("headline_fingerprint", headlineFingerprint);
          }
          if (landingPageFingerprint != null) {
            fieldMapBuilder.put("landing_page_fingerprint", landingPageFingerprint);
          }
          if (pageUrlFingerprint != null) {
            fieldMapBuilder.put("page_url_fingerprint", pageUrlFingerprint);
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
    return CUSTOMER_ID_AD_GROUP_ID_SEARCH_TERM_FINGERPRINT_HEADLINE_FINGERPRINT_LANDING_PAGE_FINGERPRINT_PAGE_URL_FINGERPRINT
        .instantiate(
            "customer_id",
            customerId,
            "ad_group_id",
            adGroupId,
            "search_term_fingerprint",
            searchTermFingerprint,
            "headline_fingerprint",
            headlineFingerprint,
            "landing_page_fingerprint",
            landingPageFingerprint,
            "page_url_fingerprint",
            pageUrlFingerprint);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      DynamicSearchAdsSearchTermViewName that = ((DynamicSearchAdsSearchTermViewName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.adGroupId, that.adGroupId)
          && Objects.equals(this.searchTermFingerprint, that.searchTermFingerprint)
          && Objects.equals(this.headlineFingerprint, that.headlineFingerprint)
          && Objects.equals(this.landingPageFingerprint, that.landingPageFingerprint)
          && Objects.equals(this.pageUrlFingerprint, that.pageUrlFingerprint);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(adGroupId);
    h *= 1000003;
    h ^= Objects.hashCode(searchTermFingerprint);
    h *= 1000003;
    h ^= Objects.hashCode(headlineFingerprint);
    h *= 1000003;
    h ^= Objects.hashCode(landingPageFingerprint);
    h *= 1000003;
    h ^= Objects.hashCode(pageUrlFingerprint);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/dynamicSearchAdsSearchTermViews/{ad_group_id}~{search_term_fingerprint}~{headline_fingerprint}~{landing_page_fingerprint}~{page_url_fingerprint}.
   */
  public static class Builder {
    private String customerId;
    private String adGroupId;
    private String searchTermFingerprint;
    private String headlineFingerprint;
    private String landingPageFingerprint;
    private String pageUrlFingerprint;

    protected Builder() {}

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
}

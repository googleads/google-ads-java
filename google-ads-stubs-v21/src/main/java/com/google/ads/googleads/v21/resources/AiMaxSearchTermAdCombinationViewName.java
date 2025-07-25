/*
 * Copyright 2025 Google LLC
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

package com.google.ads.googleads.v21.resources;

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
public class AiMaxSearchTermAdCombinationViewName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_AD_GROUP_ID_SEARCH_TERM_LANDING_PAGE_HEADLINE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/aiMaxSearchTermAdCombinationViews/{ad_group_id}~{search_term}~{landing_page}~{headline}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String adGroupId;
  private final String searchTerm;
  private final String landingPage;
  private final String headline;

  @Deprecated
  protected AiMaxSearchTermAdCombinationViewName() {
    customerId = null;
    adGroupId = null;
    searchTerm = null;
    landingPage = null;
    headline = null;
  }

  private AiMaxSearchTermAdCombinationViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    adGroupId = Preconditions.checkNotNull(builder.getAdGroupId());
    searchTerm = Preconditions.checkNotNull(builder.getSearchTerm());
    landingPage = Preconditions.checkNotNull(builder.getLandingPage());
    headline = Preconditions.checkNotNull(builder.getHeadline());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getAdGroupId() {
    return adGroupId;
  }

  public String getSearchTerm() {
    return searchTerm;
  }

  public String getLandingPage() {
    return landingPage;
  }

  public String getHeadline() {
    return headline;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static AiMaxSearchTermAdCombinationViewName of(
      String customerId, String adGroupId, String searchTerm, String landingPage, String headline) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAdGroupId(adGroupId)
        .setSearchTerm(searchTerm)
        .setLandingPage(landingPage)
        .setHeadline(headline)
        .build();
  }

  public static String format(
      String customerId, String adGroupId, String searchTerm, String landingPage, String headline) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAdGroupId(adGroupId)
        .setSearchTerm(searchTerm)
        .setLandingPage(landingPage)
        .setHeadline(headline)
        .build()
        .toString();
  }

  public static AiMaxSearchTermAdCombinationViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_AD_GROUP_ID_SEARCH_TERM_LANDING_PAGE_HEADLINE.validatedMatch(
            formattedString,
            "AiMaxSearchTermAdCombinationViewName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("ad_group_id"),
        matchMap.get("search_term"),
        matchMap.get("landing_page"),
        matchMap.get("headline"));
  }

  public static List<AiMaxSearchTermAdCombinationViewName> parseList(
      List<String> formattedStrings) {
    List<AiMaxSearchTermAdCombinationViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AiMaxSearchTermAdCombinationViewName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (AiMaxSearchTermAdCombinationViewName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_AD_GROUP_ID_SEARCH_TERM_LANDING_PAGE_HEADLINE.matches(formattedString);
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
          if (searchTerm != null) {
            fieldMapBuilder.put("search_term", searchTerm);
          }
          if (landingPage != null) {
            fieldMapBuilder.put("landing_page", landingPage);
          }
          if (headline != null) {
            fieldMapBuilder.put("headline", headline);
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
    return CUSTOMER_ID_AD_GROUP_ID_SEARCH_TERM_LANDING_PAGE_HEADLINE.instantiate(
        "customer_id",
        customerId,
        "ad_group_id",
        adGroupId,
        "search_term",
        searchTerm,
        "landing_page",
        landingPage,
        "headline",
        headline);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      AiMaxSearchTermAdCombinationViewName that = ((AiMaxSearchTermAdCombinationViewName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.adGroupId, that.adGroupId)
          && Objects.equals(this.searchTerm, that.searchTerm)
          && Objects.equals(this.landingPage, that.landingPage)
          && Objects.equals(this.headline, that.headline);
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
    h ^= Objects.hashCode(searchTerm);
    h *= 1000003;
    h ^= Objects.hashCode(landingPage);
    h *= 1000003;
    h ^= Objects.hashCode(headline);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/aiMaxSearchTermAdCombinationViews/{ad_group_id}~{search_term}~{landing_page}~{headline}.
   */
  public static class Builder {
    private String customerId;
    private String adGroupId;
    private String searchTerm;
    private String landingPage;
    private String headline;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getAdGroupId() {
      return adGroupId;
    }

    public String getSearchTerm() {
      return searchTerm;
    }

    public String getLandingPage() {
      return landingPage;
    }

    public String getHeadline() {
      return headline;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setAdGroupId(String adGroupId) {
      this.adGroupId = adGroupId;
      return this;
    }

    public Builder setSearchTerm(String searchTerm) {
      this.searchTerm = searchTerm;
      return this;
    }

    public Builder setLandingPage(String landingPage) {
      this.landingPage = landingPage;
      return this;
    }

    public Builder setHeadline(String headline) {
      this.headline = headline;
      return this;
    }

    private Builder(AiMaxSearchTermAdCombinationViewName aiMaxSearchTermAdCombinationViewName) {
      this.customerId = aiMaxSearchTermAdCombinationViewName.customerId;
      this.adGroupId = aiMaxSearchTermAdCombinationViewName.adGroupId;
      this.searchTerm = aiMaxSearchTermAdCombinationViewName.searchTerm;
      this.landingPage = aiMaxSearchTermAdCombinationViewName.landingPage;
      this.headline = aiMaxSearchTermAdCombinationViewName.headline;
    }

    public AiMaxSearchTermAdCombinationViewName build() {
      return new AiMaxSearchTermAdCombinationViewName(this);
    }
  }
}

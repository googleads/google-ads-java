/*
 * Copyright 2026 Google LLC
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

package com.google.ads.googleads.v26.resources;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@NullMarked
@Generated("by gapic-generator-java")
public class SearchLiftKeywordBundleName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_SEARCH_LIFT_KEYWORD_BUNDLE_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/searchLiftKeywordBundles/{search_lift_keyword_bundle_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String searchLiftKeywordBundleId;

  @Deprecated
  protected SearchLiftKeywordBundleName() {
    customerId = null;
    searchLiftKeywordBundleId = null;
  }

  private SearchLiftKeywordBundleName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    searchLiftKeywordBundleId = Preconditions.checkNotNull(builder.getSearchLiftKeywordBundleId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getSearchLiftKeywordBundleId() {
    return searchLiftKeywordBundleId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static SearchLiftKeywordBundleName of(
      String customerId, String searchLiftKeywordBundleId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setSearchLiftKeywordBundleId(searchLiftKeywordBundleId)
        .build();
  }

  public static String format(String customerId, String searchLiftKeywordBundleId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setSearchLiftKeywordBundleId(searchLiftKeywordBundleId)
        .build()
        .toString();
  }

  public static @Nullable SearchLiftKeywordBundleName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_SEARCH_LIFT_KEYWORD_BUNDLE_ID.validatedMatch(
            formattedString,
            "SearchLiftKeywordBundleName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("search_lift_keyword_bundle_id"));
  }

  public static List<SearchLiftKeywordBundleName> parseList(List<String> formattedStrings) {
    List<SearchLiftKeywordBundleName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<@Nullable SearchLiftKeywordBundleName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (SearchLiftKeywordBundleName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_SEARCH_LIFT_KEYWORD_BUNDLE_ID.matches(formattedString);
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
          if (searchLiftKeywordBundleId != null) {
            fieldMapBuilder.put("search_lift_keyword_bundle_id", searchLiftKeywordBundleId);
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
    return CUSTOMER_ID_SEARCH_LIFT_KEYWORD_BUNDLE_ID.instantiate(
        "customer_id", customerId, "search_lift_keyword_bundle_id", searchLiftKeywordBundleId);
  }

  @Override
  public boolean equals(@Nullable Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      SearchLiftKeywordBundleName that = ((SearchLiftKeywordBundleName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.searchLiftKeywordBundleId, that.searchLiftKeywordBundleId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(searchLiftKeywordBundleId);
    return h;
  }

  /**
   * Builder for customers/{customer_id}/searchLiftKeywordBundles/{search_lift_keyword_bundle_id}.
   */
  public static class Builder {
    private String customerId;
    private String searchLiftKeywordBundleId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getSearchLiftKeywordBundleId() {
      return searchLiftKeywordBundleId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setSearchLiftKeywordBundleId(String searchLiftKeywordBundleId) {
      this.searchLiftKeywordBundleId = searchLiftKeywordBundleId;
      return this;
    }

    private Builder(SearchLiftKeywordBundleName searchLiftKeywordBundleName) {
      this.customerId = searchLiftKeywordBundleName.customerId;
      this.searchLiftKeywordBundleId = searchLiftKeywordBundleName.searchLiftKeywordBundleId;
    }

    public SearchLiftKeywordBundleName build() {
      return new SearchLiftKeywordBundleName(this);
    }
  }
}

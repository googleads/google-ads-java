/*
 * Copyright 2023 Google LLC
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

package com.google.ads.googleads.v14.resources;

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
public class ExpandedLandingPageViewName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_EXPANDED_FINAL_URL_FINGERPRINT =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/expandedLandingPageViews/{expanded_final_url_fingerprint}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String expandedFinalUrlFingerprint;

  @Deprecated
  protected ExpandedLandingPageViewName() {
    customerId = null;
    expandedFinalUrlFingerprint = null;
  }

  private ExpandedLandingPageViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    expandedFinalUrlFingerprint =
        Preconditions.checkNotNull(builder.getExpandedFinalUrlFingerprint());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getExpandedFinalUrlFingerprint() {
    return expandedFinalUrlFingerprint;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static ExpandedLandingPageViewName of(
      String customerId, String expandedFinalUrlFingerprint) {
    return newBuilder()
        .setCustomerId(customerId)
        .setExpandedFinalUrlFingerprint(expandedFinalUrlFingerprint)
        .build();
  }

  public static String format(String customerId, String expandedFinalUrlFingerprint) {
    return newBuilder()
        .setCustomerId(customerId)
        .setExpandedFinalUrlFingerprint(expandedFinalUrlFingerprint)
        .build()
        .toString();
  }

  public static ExpandedLandingPageViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_EXPANDED_FINAL_URL_FINGERPRINT.validatedMatch(
            formattedString,
            "ExpandedLandingPageViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("expanded_final_url_fingerprint"));
  }

  public static List<ExpandedLandingPageViewName> parseList(List<String> formattedStrings) {
    List<ExpandedLandingPageViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ExpandedLandingPageViewName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ExpandedLandingPageViewName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_EXPANDED_FINAL_URL_FINGERPRINT.matches(formattedString);
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
          if (expandedFinalUrlFingerprint != null) {
            fieldMapBuilder.put("expanded_final_url_fingerprint", expandedFinalUrlFingerprint);
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
    return CUSTOMER_ID_EXPANDED_FINAL_URL_FINGERPRINT.instantiate(
        "customer_id", customerId, "expanded_final_url_fingerprint", expandedFinalUrlFingerprint);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      ExpandedLandingPageViewName that = ((ExpandedLandingPageViewName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.expandedFinalUrlFingerprint, that.expandedFinalUrlFingerprint);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(expandedFinalUrlFingerprint);
    return h;
  }

  /**
   * Builder for customers/{customer_id}/expandedLandingPageViews/{expanded_final_url_fingerprint}.
   */
  public static class Builder {
    private String customerId;
    private String expandedFinalUrlFingerprint;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getExpandedFinalUrlFingerprint() {
      return expandedFinalUrlFingerprint;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setExpandedFinalUrlFingerprint(String expandedFinalUrlFingerprint) {
      this.expandedFinalUrlFingerprint = expandedFinalUrlFingerprint;
      return this;
    }

    private Builder(ExpandedLandingPageViewName expandedLandingPageViewName) {
      this.customerId = expandedLandingPageViewName.customerId;
      this.expandedFinalUrlFingerprint = expandedLandingPageViewName.expandedFinalUrlFingerprint;
    }

    public ExpandedLandingPageViewName build() {
      return new ExpandedLandingPageViewName(this);
    }
  }
}

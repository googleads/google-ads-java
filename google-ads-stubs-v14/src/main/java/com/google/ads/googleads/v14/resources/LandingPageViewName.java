/*
 * Copyright 2024 Google LLC
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
public class LandingPageViewName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_UNEXPANDED_FINAL_URL_FINGERPRINT =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/landingPageViews/{unexpanded_final_url_fingerprint}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String unexpandedFinalUrlFingerprint;

  @Deprecated
  protected LandingPageViewName() {
    customerId = null;
    unexpandedFinalUrlFingerprint = null;
  }

  private LandingPageViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    unexpandedFinalUrlFingerprint =
        Preconditions.checkNotNull(builder.getUnexpandedFinalUrlFingerprint());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getUnexpandedFinalUrlFingerprint() {
    return unexpandedFinalUrlFingerprint;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static LandingPageViewName of(String customerId, String unexpandedFinalUrlFingerprint) {
    return newBuilder()
        .setCustomerId(customerId)
        .setUnexpandedFinalUrlFingerprint(unexpandedFinalUrlFingerprint)
        .build();
  }

  public static String format(String customerId, String unexpandedFinalUrlFingerprint) {
    return newBuilder()
        .setCustomerId(customerId)
        .setUnexpandedFinalUrlFingerprint(unexpandedFinalUrlFingerprint)
        .build()
        .toString();
  }

  public static LandingPageViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_UNEXPANDED_FINAL_URL_FINGERPRINT.validatedMatch(
            formattedString, "LandingPageViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("unexpanded_final_url_fingerprint"));
  }

  public static List<LandingPageViewName> parseList(List<String> formattedStrings) {
    List<LandingPageViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<LandingPageViewName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (LandingPageViewName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_UNEXPANDED_FINAL_URL_FINGERPRINT.matches(formattedString);
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
          if (unexpandedFinalUrlFingerprint != null) {
            fieldMapBuilder.put("unexpanded_final_url_fingerprint", unexpandedFinalUrlFingerprint);
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
    return CUSTOMER_ID_UNEXPANDED_FINAL_URL_FINGERPRINT.instantiate(
        "customer_id",
        customerId,
        "unexpanded_final_url_fingerprint",
        unexpandedFinalUrlFingerprint);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      LandingPageViewName that = ((LandingPageViewName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.unexpandedFinalUrlFingerprint, that.unexpandedFinalUrlFingerprint);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(unexpandedFinalUrlFingerprint);
    return h;
  }

  /** Builder for customers/{customer_id}/landingPageViews/{unexpanded_final_url_fingerprint}. */
  public static class Builder {
    private String customerId;
    private String unexpandedFinalUrlFingerprint;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getUnexpandedFinalUrlFingerprint() {
      return unexpandedFinalUrlFingerprint;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setUnexpandedFinalUrlFingerprint(String unexpandedFinalUrlFingerprint) {
      this.unexpandedFinalUrlFingerprint = unexpandedFinalUrlFingerprint;
      return this;
    }

    private Builder(LandingPageViewName landingPageViewName) {
      this.customerId = landingPageViewName.customerId;
      this.unexpandedFinalUrlFingerprint = landingPageViewName.unexpandedFinalUrlFingerprint;
    }

    public LandingPageViewName build() {
      return new LandingPageViewName(this);
    }
  }
}

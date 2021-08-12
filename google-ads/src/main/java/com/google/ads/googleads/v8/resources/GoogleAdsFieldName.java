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

package com.google.ads.googleads.v8.resources;

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
public class GoogleAdsFieldName implements ResourceName {
  private static final PathTemplate GOOGLE_ADS_FIELD =
      PathTemplate.createWithoutUrlEncoding("googleAdsFields/{google_ads_field}");
  private volatile Map<String, String> fieldValuesMap;
  private final String googleAdsField;

  @Deprecated
  protected GoogleAdsFieldName() {
    googleAdsField = null;
  }

  private GoogleAdsFieldName(Builder builder) {
    googleAdsField = Preconditions.checkNotNull(builder.getGoogleAdsField());
  }

  public String getGoogleAdsField() {
    return googleAdsField;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static GoogleAdsFieldName of(String googleAdsField) {
    return newBuilder().setGoogleAdsField(googleAdsField).build();
  }

  public static String format(String googleAdsField) {
    return newBuilder().setGoogleAdsField(googleAdsField).build().toString();
  }

  public static GoogleAdsFieldName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        GOOGLE_ADS_FIELD.validatedMatch(
            formattedString, "GoogleAdsFieldName.parse: formattedString not in valid format");
    return of(matchMap.get("google_ads_field"));
  }

  public static List<GoogleAdsFieldName> parseList(List<String> formattedStrings) {
    List<GoogleAdsFieldName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<GoogleAdsFieldName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (GoogleAdsFieldName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return GOOGLE_ADS_FIELD.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (googleAdsField != null) {
            fieldMapBuilder.put("google_ads_field", googleAdsField);
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
    return GOOGLE_ADS_FIELD.instantiate("google_ads_field", googleAdsField);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      GoogleAdsFieldName that = ((GoogleAdsFieldName) o);
      return Objects.equals(this.googleAdsField, that.googleAdsField);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(googleAdsField);
    return h;
  }

  /** Builder for googleAdsFields/{google_ads_field}. */
  public static class Builder {
    private String googleAdsField;

    protected Builder() {}

    public String getGoogleAdsField() {
      return googleAdsField;
    }

    public Builder setGoogleAdsField(String googleAdsField) {
      this.googleAdsField = googleAdsField;
      return this;
    }

    private Builder(GoogleAdsFieldName googleAdsFieldName) {
      this.googleAdsField = googleAdsFieldName.googleAdsField;
    }

    public GoogleAdsFieldName build() {
      return new GoogleAdsFieldName(this);
    }
  }
}

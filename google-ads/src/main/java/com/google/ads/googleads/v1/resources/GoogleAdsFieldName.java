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

package com.google.ads.googleads.v1.resources;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class GoogleAdsFieldName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("googleAdsFields/{google_ads_field}");

  private volatile Map<String, String> fieldValuesMap;

  private final String googleAdsField;

  public String getGoogleAdsField() {
    return googleAdsField;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private GoogleAdsFieldName(Builder builder) {
    googleAdsField = Preconditions.checkNotNull(builder.getGoogleAdsField());
  }

  public static GoogleAdsFieldName of(String googleAdsField) {
    return newBuilder()
      .setGoogleAdsField(googleAdsField)
      .build();
  }

  public static String format(String googleAdsField) {
    return newBuilder()
      .setGoogleAdsField(googleAdsField)
      .build()
      .toString();
  }

  public static GoogleAdsFieldName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "GoogleAdsFieldName.parse: formattedString not in valid format");
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
    List<String> list = new ArrayList<String>(values.size());
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
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("googleAdsField", googleAdsField);
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
    return PATH_TEMPLATE.instantiate("google_ads_field", googleAdsField);
  }

  /** Builder for GoogleAdsFieldName. */
  public static class Builder {

    private String googleAdsField;

    public String getGoogleAdsField() {
      return googleAdsField;
    }

    public Builder setGoogleAdsField(String googleAdsField) {
      this.googleAdsField = googleAdsField;
      return this;
    }

    private Builder() {
    }

    private Builder(GoogleAdsFieldName googleAdsFieldName) {
      googleAdsField = googleAdsFieldName.googleAdsField;
    }

    public GoogleAdsFieldName build() {
      return new GoogleAdsFieldName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof GoogleAdsFieldName) {
      GoogleAdsFieldName that = (GoogleAdsFieldName) o;
      return (this.googleAdsField.equals(that.googleAdsField));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= googleAdsField.hashCode();
    return h;
  }
}


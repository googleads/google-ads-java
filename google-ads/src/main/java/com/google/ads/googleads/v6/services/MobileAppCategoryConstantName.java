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
public class MobileAppCategoryConstantName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("mobileAppCategoryConstants/{mobile_app_category_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String mobileAppCategoryId;

  public String getMobileAppCategoryId() {
    return mobileAppCategoryId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private MobileAppCategoryConstantName(Builder builder) {
    mobileAppCategoryId = Preconditions.checkNotNull(builder.getMobileAppCategoryId());
  }

  public static MobileAppCategoryConstantName of(String mobileAppCategoryId) {
    return newBuilder()
      .setMobileAppCategoryId(mobileAppCategoryId)
      .build();
  }

  public static String format(String mobileAppCategoryId) {
    return newBuilder()
      .setMobileAppCategoryId(mobileAppCategoryId)
      .build()
      .toString();
  }

  public static MobileAppCategoryConstantName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "MobileAppCategoryConstantName.parse: formattedString not in valid format");
    return of(matchMap.get("mobile_app_category_id"));
  }

  public static List<MobileAppCategoryConstantName> parseList(List<String> formattedStrings) {
    List<MobileAppCategoryConstantName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<MobileAppCategoryConstantName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (MobileAppCategoryConstantName value : values) {
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
          fieldMapBuilder.put("mobileAppCategoryId", mobileAppCategoryId);
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
    return PATH_TEMPLATE.instantiate("mobile_app_category_id", mobileAppCategoryId);
  }

  /** Builder for MobileAppCategoryConstantName. */
  public static class Builder {

    private String mobileAppCategoryId;

    public String getMobileAppCategoryId() {
      return mobileAppCategoryId;
    }

    public Builder setMobileAppCategoryId(String mobileAppCategoryId) {
      this.mobileAppCategoryId = mobileAppCategoryId;
      return this;
    }

    private Builder() {
    }

    private Builder(MobileAppCategoryConstantName mobileAppCategoryConstantName) {
      mobileAppCategoryId = mobileAppCategoryConstantName.mobileAppCategoryId;
    }

    public MobileAppCategoryConstantName build() {
      return new MobileAppCategoryConstantName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MobileAppCategoryConstantName) {
      MobileAppCategoryConstantName that = (MobileAppCategoryConstantName) o;
      return (this.mobileAppCategoryId.equals(that.mobileAppCategoryId));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= mobileAppCategoryId.hashCode();
    return h;
  }
}


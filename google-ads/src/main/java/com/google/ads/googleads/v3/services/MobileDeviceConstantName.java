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

package com.google.ads.googleads.v3.services;

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
public class MobileDeviceConstantName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("mobileDeviceConstants/{mobile_device_constant}");

  private volatile Map<String, String> fieldValuesMap;

  private final String mobileDeviceConstant;

  public String getMobileDeviceConstant() {
    return mobileDeviceConstant;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private MobileDeviceConstantName(Builder builder) {
    mobileDeviceConstant = Preconditions.checkNotNull(builder.getMobileDeviceConstant());
  }

  public static MobileDeviceConstantName of(String mobileDeviceConstant) {
    return newBuilder()
      .setMobileDeviceConstant(mobileDeviceConstant)
      .build();
  }

  public static String format(String mobileDeviceConstant) {
    return newBuilder()
      .setMobileDeviceConstant(mobileDeviceConstant)
      .build()
      .toString();
  }

  public static MobileDeviceConstantName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "MobileDeviceConstantName.parse: formattedString not in valid format");
    return of(matchMap.get("mobile_device_constant"));
  }

  public static List<MobileDeviceConstantName> parseList(List<String> formattedStrings) {
    List<MobileDeviceConstantName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<MobileDeviceConstantName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (MobileDeviceConstantName value : values) {
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
          fieldMapBuilder.put("mobileDeviceConstant", mobileDeviceConstant);
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
    return PATH_TEMPLATE.instantiate("mobile_device_constant", mobileDeviceConstant);
  }

  /** Builder for MobileDeviceConstantName. */
  public static class Builder {

    private String mobileDeviceConstant;

    public String getMobileDeviceConstant() {
      return mobileDeviceConstant;
    }

    public Builder setMobileDeviceConstant(String mobileDeviceConstant) {
      this.mobileDeviceConstant = mobileDeviceConstant;
      return this;
    }

    private Builder() {
    }

    private Builder(MobileDeviceConstantName mobileDeviceConstantName) {
      mobileDeviceConstant = mobileDeviceConstantName.mobileDeviceConstant;
    }

    public MobileDeviceConstantName build() {
      return new MobileDeviceConstantName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MobileDeviceConstantName) {
      MobileDeviceConstantName that = (MobileDeviceConstantName) o;
      return (this.mobileDeviceConstant.equals(that.mobileDeviceConstant));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= mobileDeviceConstant.hashCode();
    return h;
  }
}


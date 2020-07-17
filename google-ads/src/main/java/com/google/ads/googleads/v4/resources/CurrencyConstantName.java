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

package com.google.ads.googleads.v4.resources;

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
public class CurrencyConstantName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("currencyConstants/{currency_constant}");

  private volatile Map<String, String> fieldValuesMap;

  private final String currencyConstant;

  public String getCurrencyConstant() {
    return currencyConstant;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private CurrencyConstantName(Builder builder) {
    currencyConstant = Preconditions.checkNotNull(builder.getCurrencyConstant());
  }

  public static CurrencyConstantName of(String currencyConstant) {
    return newBuilder()
      .setCurrencyConstant(currencyConstant)
      .build();
  }

  public static String format(String currencyConstant) {
    return newBuilder()
      .setCurrencyConstant(currencyConstant)
      .build()
      .toString();
  }

  public static CurrencyConstantName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "CurrencyConstantName.parse: formattedString not in valid format");
    return of(matchMap.get("currency_constant"));
  }

  public static List<CurrencyConstantName> parseList(List<String> formattedStrings) {
    List<CurrencyConstantName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CurrencyConstantName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (CurrencyConstantName value : values) {
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
          fieldMapBuilder.put("currencyConstant", currencyConstant);
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
    return PATH_TEMPLATE.instantiate("currency_constant", currencyConstant);
  }

  /** Builder for CurrencyConstantName. */
  public static class Builder {

    private String currencyConstant;

    public String getCurrencyConstant() {
      return currencyConstant;
    }

    public Builder setCurrencyConstant(String currencyConstant) {
      this.currencyConstant = currencyConstant;
      return this;
    }

    private Builder() {
    }

    private Builder(CurrencyConstantName currencyConstantName) {
      currencyConstant = currencyConstantName.currencyConstant;
    }

    public CurrencyConstantName build() {
      return new CurrencyConstantName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CurrencyConstantName) {
      CurrencyConstantName that = (CurrencyConstantName) o;
      return (this.currencyConstant.equals(that.currencyConstant));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= currencyConstant.hashCode();
    return h;
  }
}


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

package com.google.ads.googleads.v19.resources;

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
public class CurrencyConstantName implements ResourceName {
  private static final PathTemplate CODE =
      PathTemplate.createWithoutUrlEncoding("currencyConstants/{code}");
  private volatile Map<String, String> fieldValuesMap;
  private final String code;

  @Deprecated
  protected CurrencyConstantName() {
    code = null;
  }

  private CurrencyConstantName(Builder builder) {
    code = Preconditions.checkNotNull(builder.getCode());
  }

  public String getCode() {
    return code;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static CurrencyConstantName of(String code) {
    return newBuilder().setCode(code).build();
  }

  public static String format(String code) {
    return newBuilder().setCode(code).build().toString();
  }

  public static CurrencyConstantName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CODE.validatedMatch(
            formattedString, "CurrencyConstantName.parse: formattedString not in valid format");
    return of(matchMap.get("code"));
  }

  public static List<CurrencyConstantName> parseList(List<String> formattedStrings) {
    List<CurrencyConstantName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CurrencyConstantName> values) {
    List<String> list = new ArrayList<>(values.size());
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
    return CODE.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (code != null) {
            fieldMapBuilder.put("code", code);
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
    return CODE.instantiate("code", code);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      CurrencyConstantName that = ((CurrencyConstantName) o);
      return Objects.equals(this.code, that.code);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(code);
    return h;
  }

  /** Builder for currencyConstants/{code}. */
  public static class Builder {
    private String code;

    protected Builder() {}

    public String getCode() {
      return code;
    }

    public Builder setCode(String code) {
      this.code = code;
      return this;
    }

    private Builder(CurrencyConstantName currencyConstantName) {
      this.code = currencyConstantName.code;
    }

    public CurrencyConstantName build() {
      return new CurrencyConstantName(this);
    }
  }
}

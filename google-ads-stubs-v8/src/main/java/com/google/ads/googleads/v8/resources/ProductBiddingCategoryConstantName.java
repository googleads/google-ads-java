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
public class ProductBiddingCategoryConstantName implements ResourceName {
  private static final PathTemplate COUNTRY_CODE_LEVEL_ID =
      PathTemplate.createWithoutUrlEncoding(
          "productBiddingCategoryConstants/{country_code}~{level}~{id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String countryCode;
  private final String level;
  private final String id;

  @Deprecated
  protected ProductBiddingCategoryConstantName() {
    countryCode = null;
    level = null;
    id = null;
  }

  private ProductBiddingCategoryConstantName(Builder builder) {
    countryCode = Preconditions.checkNotNull(builder.getCountryCode());
    level = Preconditions.checkNotNull(builder.getLevel());
    id = Preconditions.checkNotNull(builder.getId());
  }

  public String getCountryCode() {
    return countryCode;
  }

  public String getLevel() {
    return level;
  }

  public String getId() {
    return id;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static ProductBiddingCategoryConstantName of(String countryCode, String level, String id) {
    return newBuilder().setCountryCode(countryCode).setLevel(level).setId(id).build();
  }

  public static String format(String countryCode, String level, String id) {
    return newBuilder().setCountryCode(countryCode).setLevel(level).setId(id).build().toString();
  }

  public static ProductBiddingCategoryConstantName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        COUNTRY_CODE_LEVEL_ID.validatedMatch(
            formattedString,
            "ProductBiddingCategoryConstantName.parse: formattedString not in valid format");
    return of(matchMap.get("country_code"), matchMap.get("level"), matchMap.get("id"));
  }

  public static List<ProductBiddingCategoryConstantName> parseList(List<String> formattedStrings) {
    List<ProductBiddingCategoryConstantName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ProductBiddingCategoryConstantName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ProductBiddingCategoryConstantName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return COUNTRY_CODE_LEVEL_ID.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (countryCode != null) {
            fieldMapBuilder.put("country_code", countryCode);
          }
          if (level != null) {
            fieldMapBuilder.put("level", level);
          }
          if (id != null) {
            fieldMapBuilder.put("id", id);
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
    return COUNTRY_CODE_LEVEL_ID.instantiate("country_code", countryCode, "level", level, "id", id);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      ProductBiddingCategoryConstantName that = ((ProductBiddingCategoryConstantName) o);
      return Objects.equals(this.countryCode, that.countryCode)
          && Objects.equals(this.level, that.level)
          && Objects.equals(this.id, that.id);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(countryCode);
    h *= 1000003;
    h ^= Objects.hashCode(level);
    h *= 1000003;
    h ^= Objects.hashCode(id);
    return h;
  }

  /** Builder for productBiddingCategoryConstants/{country_code}~{level}~{id}. */
  public static class Builder {
    private String countryCode;
    private String level;
    private String id;

    protected Builder() {}

    public String getCountryCode() {
      return countryCode;
    }

    public String getLevel() {
      return level;
    }

    public String getId() {
      return id;
    }

    public Builder setCountryCode(String countryCode) {
      this.countryCode = countryCode;
      return this;
    }

    public Builder setLevel(String level) {
      this.level = level;
      return this;
    }

    public Builder setId(String id) {
      this.id = id;
      return this;
    }

    private Builder(ProductBiddingCategoryConstantName productBiddingCategoryConstantName) {
      this.countryCode = productBiddingCategoryConstantName.countryCode;
      this.level = productBiddingCategoryConstantName.level;
      this.id = productBiddingCategoryConstantName.id;
    }

    public ProductBiddingCategoryConstantName build() {
      return new ProductBiddingCategoryConstantName(this);
    }
  }
}

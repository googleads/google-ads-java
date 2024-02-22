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

package com.google.ads.googleads.v15.resources;

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
public class ProductCategoryConstantName implements ResourceName {
  private static final PathTemplate LEVEL_CATEGORY_ID =
      PathTemplate.createWithoutUrlEncoding("productCategoryConstants/{level}~{category_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String level;
  private final String categoryId;

  @Deprecated
  protected ProductCategoryConstantName() {
    level = null;
    categoryId = null;
  }

  private ProductCategoryConstantName(Builder builder) {
    level = Preconditions.checkNotNull(builder.getLevel());
    categoryId = Preconditions.checkNotNull(builder.getCategoryId());
  }

  public String getLevel() {
    return level;
  }

  public String getCategoryId() {
    return categoryId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static ProductCategoryConstantName of(String level, String categoryId) {
    return newBuilder().setLevel(level).setCategoryId(categoryId).build();
  }

  public static String format(String level, String categoryId) {
    return newBuilder().setLevel(level).setCategoryId(categoryId).build().toString();
  }

  public static ProductCategoryConstantName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        LEVEL_CATEGORY_ID.validatedMatch(
            formattedString,
            "ProductCategoryConstantName.parse: formattedString not in valid format");
    return of(matchMap.get("level"), matchMap.get("category_id"));
  }

  public static List<ProductCategoryConstantName> parseList(List<String> formattedStrings) {
    List<ProductCategoryConstantName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ProductCategoryConstantName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ProductCategoryConstantName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return LEVEL_CATEGORY_ID.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (level != null) {
            fieldMapBuilder.put("level", level);
          }
          if (categoryId != null) {
            fieldMapBuilder.put("category_id", categoryId);
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
    return LEVEL_CATEGORY_ID.instantiate("level", level, "category_id", categoryId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      ProductCategoryConstantName that = ((ProductCategoryConstantName) o);
      return Objects.equals(this.level, that.level)
          && Objects.equals(this.categoryId, that.categoryId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(level);
    h *= 1000003;
    h ^= Objects.hashCode(categoryId);
    return h;
  }

  /** Builder for productCategoryConstants/{level}~{category_id}. */
  public static class Builder {
    private String level;
    private String categoryId;

    protected Builder() {}

    public String getLevel() {
      return level;
    }

    public String getCategoryId() {
      return categoryId;
    }

    public Builder setLevel(String level) {
      this.level = level;
      return this;
    }

    public Builder setCategoryId(String categoryId) {
      this.categoryId = categoryId;
      return this;
    }

    private Builder(ProductCategoryConstantName productCategoryConstantName) {
      this.level = productCategoryConstantName.level;
      this.categoryId = productCategoryConstantName.categoryId;
    }

    public ProductCategoryConstantName build() {
      return new ProductCategoryConstantName(this);
    }
  }
}

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

package com.google.ads.googleads.v20.resources;

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
public class KeywordThemeConstantName implements ResourceName {
  private static final PathTemplate EXPRESS_CATEGORY_ID_EXPRESS_SUB_CATEGORY_ID =
      PathTemplate.createWithoutUrlEncoding(
          "keywordThemeConstants/{express_category_id}~{express_sub_category_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String expressCategoryId;
  private final String expressSubCategoryId;

  @Deprecated
  protected KeywordThemeConstantName() {
    expressCategoryId = null;
    expressSubCategoryId = null;
  }

  private KeywordThemeConstantName(Builder builder) {
    expressCategoryId = Preconditions.checkNotNull(builder.getExpressCategoryId());
    expressSubCategoryId = Preconditions.checkNotNull(builder.getExpressSubCategoryId());
  }

  public String getExpressCategoryId() {
    return expressCategoryId;
  }

  public String getExpressSubCategoryId() {
    return expressSubCategoryId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static KeywordThemeConstantName of(String expressCategoryId, String expressSubCategoryId) {
    return newBuilder()
        .setExpressCategoryId(expressCategoryId)
        .setExpressSubCategoryId(expressSubCategoryId)
        .build();
  }

  public static String format(String expressCategoryId, String expressSubCategoryId) {
    return newBuilder()
        .setExpressCategoryId(expressCategoryId)
        .setExpressSubCategoryId(expressSubCategoryId)
        .build()
        .toString();
  }

  public static KeywordThemeConstantName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        EXPRESS_CATEGORY_ID_EXPRESS_SUB_CATEGORY_ID.validatedMatch(
            formattedString, "KeywordThemeConstantName.parse: formattedString not in valid format");
    return of(matchMap.get("express_category_id"), matchMap.get("express_sub_category_id"));
  }

  public static List<KeywordThemeConstantName> parseList(List<String> formattedStrings) {
    List<KeywordThemeConstantName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<KeywordThemeConstantName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (KeywordThemeConstantName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return EXPRESS_CATEGORY_ID_EXPRESS_SUB_CATEGORY_ID.matches(formattedString);
  }

  @Override
  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          if (expressCategoryId != null) {
            fieldMapBuilder.put("express_category_id", expressCategoryId);
          }
          if (expressSubCategoryId != null) {
            fieldMapBuilder.put("express_sub_category_id", expressSubCategoryId);
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
    return EXPRESS_CATEGORY_ID_EXPRESS_SUB_CATEGORY_ID.instantiate(
        "express_category_id", expressCategoryId, "express_sub_category_id", expressSubCategoryId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      KeywordThemeConstantName that = ((KeywordThemeConstantName) o);
      return Objects.equals(this.expressCategoryId, that.expressCategoryId)
          && Objects.equals(this.expressSubCategoryId, that.expressSubCategoryId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(expressCategoryId);
    h *= 1000003;
    h ^= Objects.hashCode(expressSubCategoryId);
    return h;
  }

  /** Builder for keywordThemeConstants/{express_category_id}~{express_sub_category_id}. */
  public static class Builder {
    private String expressCategoryId;
    private String expressSubCategoryId;

    protected Builder() {}

    public String getExpressCategoryId() {
      return expressCategoryId;
    }

    public String getExpressSubCategoryId() {
      return expressSubCategoryId;
    }

    public Builder setExpressCategoryId(String expressCategoryId) {
      this.expressCategoryId = expressCategoryId;
      return this;
    }

    public Builder setExpressSubCategoryId(String expressSubCategoryId) {
      this.expressSubCategoryId = expressSubCategoryId;
      return this;
    }

    private Builder(KeywordThemeConstantName keywordThemeConstantName) {
      this.expressCategoryId = keywordThemeConstantName.expressCategoryId;
      this.expressSubCategoryId = keywordThemeConstantName.expressSubCategoryId;
    }

    public KeywordThemeConstantName build() {
      return new KeywordThemeConstantName(this);
    }
  }
}

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

package com.google.ads.googleads.v9.resources;

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
public class FeedPlaceholderViewName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_PLACEHOLDER_TYPE =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/feedPlaceholderViews/{placeholder_type}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String placeholderType;

  @Deprecated
  protected FeedPlaceholderViewName() {
    customerId = null;
    placeholderType = null;
  }

  private FeedPlaceholderViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    placeholderType = Preconditions.checkNotNull(builder.getPlaceholderType());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getPlaceholderType() {
    return placeholderType;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static FeedPlaceholderViewName of(String customerId, String placeholderType) {
    return newBuilder().setCustomerId(customerId).setPlaceholderType(placeholderType).build();
  }

  public static String format(String customerId, String placeholderType) {
    return newBuilder()
        .setCustomerId(customerId)
        .setPlaceholderType(placeholderType)
        .build()
        .toString();
  }

  public static FeedPlaceholderViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_PLACEHOLDER_TYPE.validatedMatch(
            formattedString, "FeedPlaceholderViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("placeholder_type"));
  }

  public static List<FeedPlaceholderViewName> parseList(List<String> formattedStrings) {
    List<FeedPlaceholderViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<FeedPlaceholderViewName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (FeedPlaceholderViewName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_PLACEHOLDER_TYPE.matches(formattedString);
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
          if (placeholderType != null) {
            fieldMapBuilder.put("placeholder_type", placeholderType);
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
    return CUSTOMER_ID_PLACEHOLDER_TYPE.instantiate(
        "customer_id", customerId, "placeholder_type", placeholderType);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      FeedPlaceholderViewName that = ((FeedPlaceholderViewName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.placeholderType, that.placeholderType);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(placeholderType);
    return h;
  }

  /** Builder for customers/{customer_id}/feedPlaceholderViews/{placeholder_type}. */
  public static class Builder {
    private String customerId;
    private String placeholderType;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getPlaceholderType() {
      return placeholderType;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setPlaceholderType(String placeholderType) {
      this.placeholderType = placeholderType;
      return this;
    }

    private Builder(FeedPlaceholderViewName feedPlaceholderViewName) {
      this.customerId = feedPlaceholderViewName.customerId;
      this.placeholderType = feedPlaceholderViewName.placeholderType;
    }

    public FeedPlaceholderViewName build() {
      return new FeedPlaceholderViewName(this);
    }
  }
}

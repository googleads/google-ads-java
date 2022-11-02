/*
 * Copyright 2022 Google LLC
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

package com.google.ads.googleads.v12.resources;

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
public class AdName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_AD_ID =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/ads/{ad_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String adId;

  @Deprecated
  protected AdName() {
    customerId = null;
    adId = null;
  }

  private AdName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    adId = Preconditions.checkNotNull(builder.getAdId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getAdId() {
    return adId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static AdName of(String customerId, String adId) {
    return newBuilder().setCustomerId(customerId).setAdId(adId).build();
  }

  public static String format(String customerId, String adId) {
    return newBuilder().setCustomerId(customerId).setAdId(adId).build().toString();
  }

  public static AdName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_AD_ID.validatedMatch(
            formattedString, "AdName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("ad_id"));
  }

  public static List<AdName> parseList(List<String> formattedStrings) {
    List<AdName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AdName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (AdName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_AD_ID.matches(formattedString);
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
          if (adId != null) {
            fieldMapBuilder.put("ad_id", adId);
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
    return CUSTOMER_ID_AD_ID.instantiate("customer_id", customerId, "ad_id", adId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      AdName that = ((AdName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.adId, that.adId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(adId);
    return h;
  }

  /** Builder for customers/{customer_id}/ads/{ad_id}. */
  public static class Builder {
    private String customerId;
    private String adId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getAdId() {
      return adId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setAdId(String adId) {
      this.adId = adId;
      return this;
    }

    private Builder(AdName adName) {
      this.customerId = adName.customerId;
      this.adId = adName.adId;
    }

    public AdName build() {
      return new AdName(this);
    }
  }
}

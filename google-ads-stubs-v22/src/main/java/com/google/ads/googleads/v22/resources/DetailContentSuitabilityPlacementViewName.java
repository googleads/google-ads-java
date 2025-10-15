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

package com.google.ads.googleads.v22.resources;

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
public class DetailContentSuitabilityPlacementViewName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_PLACEMENT_FINGERPRINT =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/detailContentSuitabilityPlacementViews/{placement_fingerprint}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String placementFingerprint;

  @Deprecated
  protected DetailContentSuitabilityPlacementViewName() {
    customerId = null;
    placementFingerprint = null;
  }

  private DetailContentSuitabilityPlacementViewName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    placementFingerprint = Preconditions.checkNotNull(builder.getPlacementFingerprint());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getPlacementFingerprint() {
    return placementFingerprint;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static DetailContentSuitabilityPlacementViewName of(
      String customerId, String placementFingerprint) {
    return newBuilder()
        .setCustomerId(customerId)
        .setPlacementFingerprint(placementFingerprint)
        .build();
  }

  public static String format(String customerId, String placementFingerprint) {
    return newBuilder()
        .setCustomerId(customerId)
        .setPlacementFingerprint(placementFingerprint)
        .build()
        .toString();
  }

  public static DetailContentSuitabilityPlacementViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_PLACEMENT_FINGERPRINT.validatedMatch(
            formattedString,
            "DetailContentSuitabilityPlacementViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("placement_fingerprint"));
  }

  public static List<DetailContentSuitabilityPlacementViewName> parseList(
      List<String> formattedStrings) {
    List<DetailContentSuitabilityPlacementViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<DetailContentSuitabilityPlacementViewName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (DetailContentSuitabilityPlacementViewName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_PLACEMENT_FINGERPRINT.matches(formattedString);
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
          if (placementFingerprint != null) {
            fieldMapBuilder.put("placement_fingerprint", placementFingerprint);
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
    return CUSTOMER_ID_PLACEMENT_FINGERPRINT.instantiate(
        "customer_id", customerId, "placement_fingerprint", placementFingerprint);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      DetailContentSuitabilityPlacementViewName that =
          ((DetailContentSuitabilityPlacementViewName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.placementFingerprint, that.placementFingerprint);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(placementFingerprint);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/detailContentSuitabilityPlacementViews/{placement_fingerprint}.
   */
  public static class Builder {
    private String customerId;
    private String placementFingerprint;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getPlacementFingerprint() {
      return placementFingerprint;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setPlacementFingerprint(String placementFingerprint) {
      this.placementFingerprint = placementFingerprint;
      return this;
    }

    private Builder(
        DetailContentSuitabilityPlacementViewName detailContentSuitabilityPlacementViewName) {
      this.customerId = detailContentSuitabilityPlacementViewName.customerId;
      this.placementFingerprint = detailContentSuitabilityPlacementViewName.placementFingerprint;
    }

    public DetailContentSuitabilityPlacementViewName build() {
      return new DetailContentSuitabilityPlacementViewName(this);
    }
  }
}

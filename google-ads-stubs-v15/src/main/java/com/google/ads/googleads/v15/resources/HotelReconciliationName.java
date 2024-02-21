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
public class HotelReconciliationName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_COMMISSION_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/hotelReconciliations/{commission_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String commissionId;

  @Deprecated
  protected HotelReconciliationName() {
    customerId = null;
    commissionId = null;
  }

  private HotelReconciliationName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    commissionId = Preconditions.checkNotNull(builder.getCommissionId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getCommissionId() {
    return commissionId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static HotelReconciliationName of(String customerId, String commissionId) {
    return newBuilder().setCustomerId(customerId).setCommissionId(commissionId).build();
  }

  public static String format(String customerId, String commissionId) {
    return newBuilder().setCustomerId(customerId).setCommissionId(commissionId).build().toString();
  }

  public static HotelReconciliationName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_COMMISSION_ID.validatedMatch(
            formattedString, "HotelReconciliationName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("commission_id"));
  }

  public static List<HotelReconciliationName> parseList(List<String> formattedStrings) {
    List<HotelReconciliationName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<HotelReconciliationName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (HotelReconciliationName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_COMMISSION_ID.matches(formattedString);
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
          if (commissionId != null) {
            fieldMapBuilder.put("commission_id", commissionId);
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
    return CUSTOMER_ID_COMMISSION_ID.instantiate(
        "customer_id", customerId, "commission_id", commissionId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      HotelReconciliationName that = ((HotelReconciliationName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.commissionId, that.commissionId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(commissionId);
    return h;
  }

  /** Builder for customers/{customer_id}/hotelReconciliations/{commission_id}. */
  public static class Builder {
    private String customerId;
    private String commissionId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getCommissionId() {
      return commissionId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCommissionId(String commissionId) {
      this.commissionId = commissionId;
      return this;
    }

    private Builder(HotelReconciliationName hotelReconciliationName) {
      this.customerId = hotelReconciliationName.customerId;
      this.commissionId = hotelReconciliationName.commissionId;
    }

    public HotelReconciliationName build() {
      return new HotelReconciliationName(this);
    }
  }
}

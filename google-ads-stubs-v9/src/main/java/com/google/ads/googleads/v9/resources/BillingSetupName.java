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
public class BillingSetupName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_BILLING_SETUP_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/billingSetups/{billing_setup_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String billingSetupId;

  @Deprecated
  protected BillingSetupName() {
    customerId = null;
    billingSetupId = null;
  }

  private BillingSetupName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    billingSetupId = Preconditions.checkNotNull(builder.getBillingSetupId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getBillingSetupId() {
    return billingSetupId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static BillingSetupName of(String customerId, String billingSetupId) {
    return newBuilder().setCustomerId(customerId).setBillingSetupId(billingSetupId).build();
  }

  public static String format(String customerId, String billingSetupId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setBillingSetupId(billingSetupId)
        .build()
        .toString();
  }

  public static BillingSetupName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_BILLING_SETUP_ID.validatedMatch(
            formattedString, "BillingSetupName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("billing_setup_id"));
  }

  public static List<BillingSetupName> parseList(List<String> formattedStrings) {
    List<BillingSetupName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<BillingSetupName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (BillingSetupName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_BILLING_SETUP_ID.matches(formattedString);
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
          if (billingSetupId != null) {
            fieldMapBuilder.put("billing_setup_id", billingSetupId);
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
    return CUSTOMER_ID_BILLING_SETUP_ID.instantiate(
        "customer_id", customerId, "billing_setup_id", billingSetupId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      BillingSetupName that = ((BillingSetupName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.billingSetupId, that.billingSetupId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(billingSetupId);
    return h;
  }

  /** Builder for customers/{customer_id}/billingSetups/{billing_setup_id}. */
  public static class Builder {
    private String customerId;
    private String billingSetupId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getBillingSetupId() {
      return billingSetupId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setBillingSetupId(String billingSetupId) {
      this.billingSetupId = billingSetupId;
      return this;
    }

    private Builder(BillingSetupName billingSetupName) {
      this.customerId = billingSetupName.customerId;
      this.billingSetupId = billingSetupName.billingSetupId;
    }

    public BillingSetupName build() {
      return new BillingSetupName(this);
    }
  }
}

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
public class PaymentsAccountName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_PAYMENTS_ACCOUNT_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/paymentsAccounts/{payments_account_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String paymentsAccountId;

  @Deprecated
  protected PaymentsAccountName() {
    customerId = null;
    paymentsAccountId = null;
  }

  private PaymentsAccountName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    paymentsAccountId = Preconditions.checkNotNull(builder.getPaymentsAccountId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getPaymentsAccountId() {
    return paymentsAccountId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static PaymentsAccountName of(String customerId, String paymentsAccountId) {
    return newBuilder().setCustomerId(customerId).setPaymentsAccountId(paymentsAccountId).build();
  }

  public static String format(String customerId, String paymentsAccountId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setPaymentsAccountId(paymentsAccountId)
        .build()
        .toString();
  }

  public static PaymentsAccountName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_PAYMENTS_ACCOUNT_ID.validatedMatch(
            formattedString, "PaymentsAccountName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("payments_account_id"));
  }

  public static List<PaymentsAccountName> parseList(List<String> formattedStrings) {
    List<PaymentsAccountName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<PaymentsAccountName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (PaymentsAccountName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_PAYMENTS_ACCOUNT_ID.matches(formattedString);
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
          if (paymentsAccountId != null) {
            fieldMapBuilder.put("payments_account_id", paymentsAccountId);
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
    return CUSTOMER_ID_PAYMENTS_ACCOUNT_ID.instantiate(
        "customer_id", customerId, "payments_account_id", paymentsAccountId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      PaymentsAccountName that = ((PaymentsAccountName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.paymentsAccountId, that.paymentsAccountId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(paymentsAccountId);
    return h;
  }

  /** Builder for customers/{customer_id}/paymentsAccounts/{payments_account_id}. */
  public static class Builder {
    private String customerId;
    private String paymentsAccountId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getPaymentsAccountId() {
      return paymentsAccountId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setPaymentsAccountId(String paymentsAccountId) {
      this.paymentsAccountId = paymentsAccountId;
      return this;
    }

    private Builder(PaymentsAccountName paymentsAccountName) {
      this.customerId = paymentsAccountName.customerId;
      this.paymentsAccountId = paymentsAccountName.paymentsAccountId;
    }

    public PaymentsAccountName build() {
      return new PaymentsAccountName(this);
    }
  }
}

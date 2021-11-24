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
public class AccountBudgetName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_ACCOUNT_BUDGET_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/accountBudgets/{account_budget_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String accountBudgetId;

  @Deprecated
  protected AccountBudgetName() {
    customerId = null;
    accountBudgetId = null;
  }

  private AccountBudgetName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    accountBudgetId = Preconditions.checkNotNull(builder.getAccountBudgetId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getAccountBudgetId() {
    return accountBudgetId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static AccountBudgetName of(String customerId, String accountBudgetId) {
    return newBuilder().setCustomerId(customerId).setAccountBudgetId(accountBudgetId).build();
  }

  public static String format(String customerId, String accountBudgetId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setAccountBudgetId(accountBudgetId)
        .build()
        .toString();
  }

  public static AccountBudgetName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_ACCOUNT_BUDGET_ID.validatedMatch(
            formattedString, "AccountBudgetName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("account_budget_id"));
  }

  public static List<AccountBudgetName> parseList(List<String> formattedStrings) {
    List<AccountBudgetName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AccountBudgetName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (AccountBudgetName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_ACCOUNT_BUDGET_ID.matches(formattedString);
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
          if (accountBudgetId != null) {
            fieldMapBuilder.put("account_budget_id", accountBudgetId);
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
    return CUSTOMER_ID_ACCOUNT_BUDGET_ID.instantiate(
        "customer_id", customerId, "account_budget_id", accountBudgetId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      AccountBudgetName that = ((AccountBudgetName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.accountBudgetId, that.accountBudgetId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(accountBudgetId);
    return h;
  }

  /** Builder for customers/{customer_id}/accountBudgets/{account_budget_id}. */
  public static class Builder {
    private String customerId;
    private String accountBudgetId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getAccountBudgetId() {
      return accountBudgetId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setAccountBudgetId(String accountBudgetId) {
      this.accountBudgetId = accountBudgetId;
      return this;
    }

    private Builder(AccountBudgetName accountBudgetName) {
      this.customerId = accountBudgetName.customerId;
      this.accountBudgetId = accountBudgetName.accountBudgetId;
    }

    public AccountBudgetName build() {
      return new AccountBudgetName(this);
    }
  }
}

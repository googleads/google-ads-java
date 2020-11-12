/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.ads.googleads.v6.services;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

/**
 * AUTO-GENERATED DOCUMENTATION AND CLASS
 */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class AccountBudgetProposalName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/accountBudgetProposals/{account_budget_proposal_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String accountBudgetProposalId;

  public String getCustomerId() {
    return customerId;
  }

  public String getAccountBudgetProposalId() {
    return accountBudgetProposalId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private AccountBudgetProposalName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    accountBudgetProposalId = Preconditions.checkNotNull(builder.getAccountBudgetProposalId());
  }

  public static AccountBudgetProposalName of(String customerId, String accountBudgetProposalId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setAccountBudgetProposalId(accountBudgetProposalId)
      .build();
  }

  public static String format(String customerId, String accountBudgetProposalId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setAccountBudgetProposalId(accountBudgetProposalId)
      .build()
      .toString();
  }

  public static AccountBudgetProposalName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "AccountBudgetProposalName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("account_budget_proposal_id"));
  }

  public static List<AccountBudgetProposalName> parseList(List<String> formattedStrings) {
    List<AccountBudgetProposalName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<AccountBudgetProposalName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (AccountBudgetProposalName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("customerId", customerId);
          fieldMapBuilder.put("accountBudgetProposalId", accountBudgetProposalId);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "account_budget_proposal_id", accountBudgetProposalId);
  }

  /** Builder for AccountBudgetProposalName. */
  public static class Builder {

    private String customerId;
    private String accountBudgetProposalId;

    public String getCustomerId() {
      return customerId;
    }

    public String getAccountBudgetProposalId() {
      return accountBudgetProposalId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setAccountBudgetProposalId(String accountBudgetProposalId) {
      this.accountBudgetProposalId = accountBudgetProposalId;
      return this;
    }

    private Builder() {
    }

    private Builder(AccountBudgetProposalName accountBudgetProposalName) {
      customerId = accountBudgetProposalName.customerId;
      accountBudgetProposalId = accountBudgetProposalName.accountBudgetProposalId;
    }

    public AccountBudgetProposalName build() {
      return new AccountBudgetProposalName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AccountBudgetProposalName) {
      AccountBudgetProposalName that = (AccountBudgetProposalName) o;
      return (this.customerId.equals(that.customerId))
          && (this.accountBudgetProposalId.equals(that.accountBudgetProposalId));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= accountBudgetProposalId.hashCode();
    return h;
  }
}


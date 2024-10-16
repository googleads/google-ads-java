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

package com.google.ads.googleads.v18.resources;

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
public class ProductLinkInvitationName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CUSTOMER_INVITATION_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/productLinkInvitations/{customer_invitation_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String customerInvitationId;

  @Deprecated
  protected ProductLinkInvitationName() {
    customerId = null;
    customerInvitationId = null;
  }

  private ProductLinkInvitationName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    customerInvitationId = Preconditions.checkNotNull(builder.getCustomerInvitationId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getCustomerInvitationId() {
    return customerInvitationId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static ProductLinkInvitationName of(String customerId, String customerInvitationId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCustomerInvitationId(customerInvitationId)
        .build();
  }

  public static String format(String customerId, String customerInvitationId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setCustomerInvitationId(customerInvitationId)
        .build()
        .toString();
  }

  public static ProductLinkInvitationName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CUSTOMER_INVITATION_ID.validatedMatch(
            formattedString,
            "ProductLinkInvitationName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("customer_invitation_id"));
  }

  public static List<ProductLinkInvitationName> parseList(List<String> formattedStrings) {
    List<ProductLinkInvitationName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ProductLinkInvitationName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ProductLinkInvitationName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CUSTOMER_INVITATION_ID.matches(formattedString);
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
          if (customerInvitationId != null) {
            fieldMapBuilder.put("customer_invitation_id", customerInvitationId);
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
    return CUSTOMER_ID_CUSTOMER_INVITATION_ID.instantiate(
        "customer_id", customerId, "customer_invitation_id", customerInvitationId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      ProductLinkInvitationName that = ((ProductLinkInvitationName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.customerInvitationId, that.customerInvitationId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(customerInvitationId);
    return h;
  }

  /** Builder for customers/{customer_id}/productLinkInvitations/{customer_invitation_id}. */
  public static class Builder {
    private String customerId;
    private String customerInvitationId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getCustomerInvitationId() {
      return customerInvitationId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setCustomerInvitationId(String customerInvitationId) {
      this.customerInvitationId = customerInvitationId;
      return this;
    }

    private Builder(ProductLinkInvitationName productLinkInvitationName) {
      this.customerId = productLinkInvitationName.customerId;
      this.customerInvitationId = productLinkInvitationName.customerInvitationId;
    }

    public ProductLinkInvitationName build() {
      return new ProductLinkInvitationName(this);
    }
  }
}

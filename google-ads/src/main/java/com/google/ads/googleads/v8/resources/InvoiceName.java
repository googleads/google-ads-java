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
public class InvoiceName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_INVOICE_ID =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/invoices/{invoice_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String invoiceId;

  @Deprecated
  protected InvoiceName() {
    customerId = null;
    invoiceId = null;
  }

  private InvoiceName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    invoiceId = Preconditions.checkNotNull(builder.getInvoiceId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getInvoiceId() {
    return invoiceId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static InvoiceName of(String customerId, String invoiceId) {
    return newBuilder().setCustomerId(customerId).setInvoiceId(invoiceId).build();
  }

  public static String format(String customerId, String invoiceId) {
    return newBuilder().setCustomerId(customerId).setInvoiceId(invoiceId).build().toString();
  }

  public static InvoiceName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_INVOICE_ID.validatedMatch(
            formattedString, "InvoiceName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("invoice_id"));
  }

  public static List<InvoiceName> parseList(List<String> formattedStrings) {
    List<InvoiceName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<InvoiceName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (InvoiceName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_INVOICE_ID.matches(formattedString);
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
          if (invoiceId != null) {
            fieldMapBuilder.put("invoice_id", invoiceId);
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
    return CUSTOMER_ID_INVOICE_ID.instantiate("customer_id", customerId, "invoice_id", invoiceId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null || getClass() == o.getClass()) {
      InvoiceName that = ((InvoiceName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.invoiceId, that.invoiceId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(invoiceId);
    return h;
  }

  /** Builder for customers/{customer_id}/invoices/{invoice_id}. */
  public static class Builder {
    private String customerId;
    private String invoiceId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getInvoiceId() {
      return invoiceId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setInvoiceId(String invoiceId) {
      this.invoiceId = invoiceId;
      return this;
    }

    private Builder(InvoiceName invoiceName) {
      this.customerId = invoiceName.customerId;
      this.invoiceId = invoiceName.invoiceId;
    }

    public InvoiceName build() {
      return new InvoiceName(this);
    }
  }
}

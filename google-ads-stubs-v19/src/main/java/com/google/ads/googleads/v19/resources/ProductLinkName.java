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

package com.google.ads.googleads.v19.resources;

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
public class ProductLinkName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_PRODUCT_LINK_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/productLinks/{product_link_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String productLinkId;

  @Deprecated
  protected ProductLinkName() {
    customerId = null;
    productLinkId = null;
  }

  private ProductLinkName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    productLinkId = Preconditions.checkNotNull(builder.getProductLinkId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getProductLinkId() {
    return productLinkId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static ProductLinkName of(String customerId, String productLinkId) {
    return newBuilder().setCustomerId(customerId).setProductLinkId(productLinkId).build();
  }

  public static String format(String customerId, String productLinkId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setProductLinkId(productLinkId)
        .build()
        .toString();
  }

  public static ProductLinkName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_PRODUCT_LINK_ID.validatedMatch(
            formattedString, "ProductLinkName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("product_link_id"));
  }

  public static List<ProductLinkName> parseList(List<String> formattedStrings) {
    List<ProductLinkName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ProductLinkName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ProductLinkName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_PRODUCT_LINK_ID.matches(formattedString);
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
          if (productLinkId != null) {
            fieldMapBuilder.put("product_link_id", productLinkId);
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
    return CUSTOMER_ID_PRODUCT_LINK_ID.instantiate(
        "customer_id", customerId, "product_link_id", productLinkId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      ProductLinkName that = ((ProductLinkName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.productLinkId, that.productLinkId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(productLinkId);
    return h;
  }

  /** Builder for customers/{customer_id}/productLinks/{product_link_id}. */
  public static class Builder {
    private String customerId;
    private String productLinkId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getProductLinkId() {
      return productLinkId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setProductLinkId(String productLinkId) {
      this.productLinkId = productLinkId;
      return this;
    }

    private Builder(ProductLinkName productLinkName) {
      this.customerId = productLinkName.customerId;
      this.productLinkId = productLinkName.productLinkId;
    }

    public ProductLinkName build() {
      return new ProductLinkName(this);
    }
  }
}

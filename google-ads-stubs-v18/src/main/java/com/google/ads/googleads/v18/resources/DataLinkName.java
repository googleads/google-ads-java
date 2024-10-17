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
public class DataLinkName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_PRODUCT_LINK_ID_DATA_LINK_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/dataLinks/{product_link_id}~{data_link_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String productLinkId;
  private final String dataLinkId;

  @Deprecated
  protected DataLinkName() {
    customerId = null;
    productLinkId = null;
    dataLinkId = null;
  }

  private DataLinkName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    productLinkId = Preconditions.checkNotNull(builder.getProductLinkId());
    dataLinkId = Preconditions.checkNotNull(builder.getDataLinkId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getProductLinkId() {
    return productLinkId;
  }

  public String getDataLinkId() {
    return dataLinkId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static DataLinkName of(String customerId, String productLinkId, String dataLinkId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setProductLinkId(productLinkId)
        .setDataLinkId(dataLinkId)
        .build();
  }

  public static String format(String customerId, String productLinkId, String dataLinkId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setProductLinkId(productLinkId)
        .setDataLinkId(dataLinkId)
        .build()
        .toString();
  }

  public static DataLinkName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_PRODUCT_LINK_ID_DATA_LINK_ID.validatedMatch(
            formattedString, "DataLinkName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"), matchMap.get("product_link_id"), matchMap.get("data_link_id"));
  }

  public static List<DataLinkName> parseList(List<String> formattedStrings) {
    List<DataLinkName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<DataLinkName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (DataLinkName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_PRODUCT_LINK_ID_DATA_LINK_ID.matches(formattedString);
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
          if (dataLinkId != null) {
            fieldMapBuilder.put("data_link_id", dataLinkId);
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
    return CUSTOMER_ID_PRODUCT_LINK_ID_DATA_LINK_ID.instantiate(
        "customer_id", customerId, "product_link_id", productLinkId, "data_link_id", dataLinkId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      DataLinkName that = ((DataLinkName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.productLinkId, that.productLinkId)
          && Objects.equals(this.dataLinkId, that.dataLinkId);
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
    h *= 1000003;
    h ^= Objects.hashCode(dataLinkId);
    return h;
  }

  /** Builder for customers/{customer_id}/dataLinks/{product_link_id}~{data_link_id}. */
  public static class Builder {
    private String customerId;
    private String productLinkId;
    private String dataLinkId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getProductLinkId() {
      return productLinkId;
    }

    public String getDataLinkId() {
      return dataLinkId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setProductLinkId(String productLinkId) {
      this.productLinkId = productLinkId;
      return this;
    }

    public Builder setDataLinkId(String dataLinkId) {
      this.dataLinkId = dataLinkId;
      return this;
    }

    private Builder(DataLinkName dataLinkName) {
      this.customerId = dataLinkName.customerId;
      this.productLinkId = dataLinkName.productLinkId;
      this.dataLinkId = dataLinkName.dataLinkId;
    }

    public DataLinkName build() {
      return new DataLinkName(this);
    }
  }
}

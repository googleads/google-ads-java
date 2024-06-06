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

package com.google.ads.googleads.v17.resources;

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
public class OfflineConversionUploadClientSummaryName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_CLIENT =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/offlineConversionUploadClientSummaries/{client}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String client;

  @Deprecated
  protected OfflineConversionUploadClientSummaryName() {
    customerId = null;
    client = null;
  }

  private OfflineConversionUploadClientSummaryName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    client = Preconditions.checkNotNull(builder.getClient());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getClient() {
    return client;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static OfflineConversionUploadClientSummaryName of(String customerId, String client) {
    return newBuilder().setCustomerId(customerId).setClient(client).build();
  }

  public static String format(String customerId, String client) {
    return newBuilder().setCustomerId(customerId).setClient(client).build().toString();
  }

  public static OfflineConversionUploadClientSummaryName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_CLIENT.validatedMatch(
            formattedString,
            "OfflineConversionUploadClientSummaryName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("client"));
  }

  public static List<OfflineConversionUploadClientSummaryName> parseList(
      List<String> formattedStrings) {
    List<OfflineConversionUploadClientSummaryName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<OfflineConversionUploadClientSummaryName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (OfflineConversionUploadClientSummaryName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_CLIENT.matches(formattedString);
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
          if (client != null) {
            fieldMapBuilder.put("client", client);
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
    return CUSTOMER_ID_CLIENT.instantiate("customer_id", customerId, "client", client);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      OfflineConversionUploadClientSummaryName that =
          ((OfflineConversionUploadClientSummaryName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.client, that.client);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(client);
    return h;
  }

  /** Builder for customers/{customer_id}/offlineConversionUploadClientSummaries/{client}. */
  public static class Builder {
    private String customerId;
    private String client;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getClient() {
      return client;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setClient(String client) {
      this.client = client;
      return this;
    }

    private Builder(
        OfflineConversionUploadClientSummaryName offlineConversionUploadClientSummaryName) {
      this.customerId = offlineConversionUploadClientSummaryName.customerId;
      this.client = offlineConversionUploadClientSummaryName.client;
    }

    public OfflineConversionUploadClientSummaryName build() {
      return new OfflineConversionUploadClientSummaryName(this);
    }
  }
}

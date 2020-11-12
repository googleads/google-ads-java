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
public class BatchJobName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/batchJobs/{batch_job_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String batchJobId;

  public String getCustomerId() {
    return customerId;
  }

  public String getBatchJobId() {
    return batchJobId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private BatchJobName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    batchJobId = Preconditions.checkNotNull(builder.getBatchJobId());
  }

  public static BatchJobName of(String customerId, String batchJobId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setBatchJobId(batchJobId)
      .build();
  }

  public static String format(String customerId, String batchJobId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setBatchJobId(batchJobId)
      .build()
      .toString();
  }

  public static BatchJobName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "BatchJobName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("batch_job_id"));
  }

  public static List<BatchJobName> parseList(List<String> formattedStrings) {
    List<BatchJobName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<BatchJobName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (BatchJobName value : values) {
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
          fieldMapBuilder.put("batchJobId", batchJobId);
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
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "batch_job_id", batchJobId);
  }

  /** Builder for BatchJobName. */
  public static class Builder {

    private String customerId;
    private String batchJobId;

    public String getCustomerId() {
      return customerId;
    }

    public String getBatchJobId() {
      return batchJobId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setBatchJobId(String batchJobId) {
      this.batchJobId = batchJobId;
      return this;
    }

    private Builder() {
    }

    private Builder(BatchJobName batchJobName) {
      customerId = batchJobName.customerId;
      batchJobId = batchJobName.batchJobId;
    }

    public BatchJobName build() {
      return new BatchJobName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BatchJobName) {
      BatchJobName that = (BatchJobName) o;
      return (this.customerId.equals(that.customerId))
          && (this.batchJobId.equals(that.batchJobId));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= batchJobId.hashCode();
    return h;
  }
}


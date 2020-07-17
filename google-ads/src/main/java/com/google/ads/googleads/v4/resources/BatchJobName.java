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

package com.google.ads.googleads.v4.resources;

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
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/batchJobs/{batch_job}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String batchJob;

  public String getCustomer() {
    return customer;
  }

  public String getBatchJob() {
    return batchJob;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private BatchJobName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    batchJob = Preconditions.checkNotNull(builder.getBatchJob());
  }

  public static BatchJobName of(String customer, String batchJob) {
    return newBuilder()
      .setCustomer(customer)
      .setBatchJob(batchJob)
      .build();
  }

  public static String format(String customer, String batchJob) {
    return newBuilder()
      .setCustomer(customer)
      .setBatchJob(batchJob)
      .build()
      .toString();
  }

  public static BatchJobName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "BatchJobName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("batch_job"));
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
          fieldMapBuilder.put("customer", customer);
          fieldMapBuilder.put("batchJob", batchJob);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "batch_job", batchJob);
  }

  /** Builder for BatchJobName. */
  public static class Builder {

    private String customer;
    private String batchJob;

    public String getCustomer() {
      return customer;
    }

    public String getBatchJob() {
      return batchJob;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setBatchJob(String batchJob) {
      this.batchJob = batchJob;
      return this;
    }

    private Builder() {
    }

    private Builder(BatchJobName batchJobName) {
      customer = batchJobName.customer;
      batchJob = batchJobName.batchJob;
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
      return (this.customer.equals(that.customer))
          && (this.batchJob.equals(that.batchJob));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= batchJob.hashCode();
    return h;
  }
}


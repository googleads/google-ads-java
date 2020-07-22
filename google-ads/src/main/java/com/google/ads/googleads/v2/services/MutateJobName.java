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

package com.google.ads.googleads.v2.services;

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
public class MutateJobName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/mutateJobs/{mutate_job}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String mutateJob;

  public String getCustomer() {
    return customer;
  }

  public String getMutateJob() {
    return mutateJob;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private MutateJobName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    mutateJob = Preconditions.checkNotNull(builder.getMutateJob());
  }

  public static MutateJobName of(String customer, String mutateJob) {
    return newBuilder()
      .setCustomer(customer)
      .setMutateJob(mutateJob)
      .build();
  }

  public static String format(String customer, String mutateJob) {
    return newBuilder()
      .setCustomer(customer)
      .setMutateJob(mutateJob)
      .build()
      .toString();
  }

  public static MutateJobName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "MutateJobName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("mutate_job"));
  }

  public static List<MutateJobName> parseList(List<String> formattedStrings) {
    List<MutateJobName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<MutateJobName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (MutateJobName value : values) {
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
          fieldMapBuilder.put("mutateJob", mutateJob);
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
    return PATH_TEMPLATE.instantiate("customer", customer, "mutate_job", mutateJob);
  }

  /** Builder for MutateJobName. */
  public static class Builder {

    private String customer;
    private String mutateJob;

    public String getCustomer() {
      return customer;
    }

    public String getMutateJob() {
      return mutateJob;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setMutateJob(String mutateJob) {
      this.mutateJob = mutateJob;
      return this;
    }

    private Builder() {
    }

    private Builder(MutateJobName mutateJobName) {
      customer = mutateJobName.customer;
      mutateJob = mutateJobName.mutateJob;
    }

    public MutateJobName build() {
      return new MutateJobName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof MutateJobName) {
      MutateJobName that = (MutateJobName) o;
      return (this.customer.equals(that.customer))
          && (this.mutateJob.equals(that.mutateJob));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= mutateJob.hashCode();
    return h;
  }
}


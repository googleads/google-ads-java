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
public class ExperimentArmName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_TRIAL_ID_TRIAL_ARM_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/experimentArms/{trial_id}~{trial_arm_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String trialId;
  private final String trialArmId;

  @Deprecated
  protected ExperimentArmName() {
    customerId = null;
    trialId = null;
    trialArmId = null;
  }

  private ExperimentArmName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    trialId = Preconditions.checkNotNull(builder.getTrialId());
    trialArmId = Preconditions.checkNotNull(builder.getTrialArmId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getTrialId() {
    return trialId;
  }

  public String getTrialArmId() {
    return trialArmId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static ExperimentArmName of(String customerId, String trialId, String trialArmId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setTrialId(trialId)
        .setTrialArmId(trialArmId)
        .build();
  }

  public static String format(String customerId, String trialId, String trialArmId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setTrialId(trialId)
        .setTrialArmId(trialArmId)
        .build()
        .toString();
  }

  public static ExperimentArmName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_TRIAL_ID_TRIAL_ARM_ID.validatedMatch(
            formattedString, "ExperimentArmName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("trial_id"), matchMap.get("trial_arm_id"));
  }

  public static List<ExperimentArmName> parseList(List<String> formattedStrings) {
    List<ExperimentArmName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ExperimentArmName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (ExperimentArmName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_TRIAL_ID_TRIAL_ARM_ID.matches(formattedString);
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
          if (trialId != null) {
            fieldMapBuilder.put("trial_id", trialId);
          }
          if (trialArmId != null) {
            fieldMapBuilder.put("trial_arm_id", trialArmId);
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
    return CUSTOMER_ID_TRIAL_ID_TRIAL_ARM_ID.instantiate(
        "customer_id", customerId, "trial_id", trialId, "trial_arm_id", trialArmId);
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      ExperimentArmName that = ((ExperimentArmName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(this.trialId, that.trialId)
          && Objects.equals(this.trialArmId, that.trialArmId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(trialId);
    h *= 1000003;
    h ^= Objects.hashCode(trialArmId);
    return h;
  }

  /** Builder for customers/{customer_id}/experimentArms/{trial_id}~{trial_arm_id}. */
  public static class Builder {
    private String customerId;
    private String trialId;
    private String trialArmId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getTrialId() {
      return trialId;
    }

    public String getTrialArmId() {
      return trialArmId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setTrialId(String trialId) {
      this.trialId = trialId;
      return this;
    }

    public Builder setTrialArmId(String trialArmId) {
      this.trialArmId = trialArmId;
      return this;
    }

    private Builder(ExperimentArmName experimentArmName) {
      this.customerId = experimentArmName.customerId;
      this.trialId = experimentArmName.trialId;
      this.trialArmId = experimentArmName.trialArmId;
    }

    public ExperimentArmName build() {
      return new ExperimentArmName(this);
    }
  }
}

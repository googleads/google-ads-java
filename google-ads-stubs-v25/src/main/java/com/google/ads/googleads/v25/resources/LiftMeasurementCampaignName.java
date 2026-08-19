/*
 * Copyright 2026 Google LLC
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

package com.google.ads.googleads.v25.resources;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Generated;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
@NullMarked
@Generated("by gapic-generator-java")
public class LiftMeasurementCampaignName implements ResourceName {
  private static final PathTemplate CUSTOMER_ID_LIFT_MEASUREMENT_CONFIGURATION_ID_CAMPAIGN_ID =
      PathTemplate.createWithoutUrlEncoding(
          "customers/{customer_id}/liftMeasurementCampaigns/{lift_measurement_configuration_id}~{campaign_id}");
  private volatile Map<String, String> fieldValuesMap;
  private final String customerId;
  private final String liftMeasurementConfigurationId;
  private final String campaignId;

  @Deprecated
  protected LiftMeasurementCampaignName() {
    customerId = null;
    liftMeasurementConfigurationId = null;
    campaignId = null;
  }

  private LiftMeasurementCampaignName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    liftMeasurementConfigurationId =
        Preconditions.checkNotNull(builder.getLiftMeasurementConfigurationId());
    campaignId = Preconditions.checkNotNull(builder.getCampaignId());
  }

  public String getCustomerId() {
    return customerId;
  }

  public String getLiftMeasurementConfigurationId() {
    return liftMeasurementConfigurationId;
  }

  public String getCampaignId() {
    return campaignId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  public static LiftMeasurementCampaignName of(
      String customerId, String liftMeasurementConfigurationId, String campaignId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setLiftMeasurementConfigurationId(liftMeasurementConfigurationId)
        .setCampaignId(campaignId)
        .build();
  }

  public static String format(
      String customerId, String liftMeasurementConfigurationId, String campaignId) {
    return newBuilder()
        .setCustomerId(customerId)
        .setLiftMeasurementConfigurationId(liftMeasurementConfigurationId)
        .setCampaignId(campaignId)
        .build()
        .toString();
  }

  public static @Nullable LiftMeasurementCampaignName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        CUSTOMER_ID_LIFT_MEASUREMENT_CONFIGURATION_ID_CAMPAIGN_ID.validatedMatch(
            formattedString,
            "LiftMeasurementCampaignName.parse: formattedString not in valid format");
    return of(
        matchMap.get("customer_id"),
        matchMap.get("lift_measurement_configuration_id"),
        matchMap.get("campaign_id"));
  }

  public static List<LiftMeasurementCampaignName> parseList(List<String> formattedStrings) {
    List<LiftMeasurementCampaignName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<@Nullable LiftMeasurementCampaignName> values) {
    List<String> list = new ArrayList<>(values.size());
    for (LiftMeasurementCampaignName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return CUSTOMER_ID_LIFT_MEASUREMENT_CONFIGURATION_ID_CAMPAIGN_ID.matches(formattedString);
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
          if (liftMeasurementConfigurationId != null) {
            fieldMapBuilder.put(
                "lift_measurement_configuration_id", liftMeasurementConfigurationId);
          }
          if (campaignId != null) {
            fieldMapBuilder.put("campaign_id", campaignId);
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
    return CUSTOMER_ID_LIFT_MEASUREMENT_CONFIGURATION_ID_CAMPAIGN_ID.instantiate(
        "customer_id",
        customerId,
        "lift_measurement_configuration_id",
        liftMeasurementConfigurationId,
        "campaign_id",
        campaignId);
  }

  @Override
  public boolean equals(@Nullable Object o) {
    if (o == this) {
      return true;
    }
    if (o != null && getClass() == o.getClass()) {
      LiftMeasurementCampaignName that = ((LiftMeasurementCampaignName) o);
      return Objects.equals(this.customerId, that.customerId)
          && Objects.equals(
              this.liftMeasurementConfigurationId, that.liftMeasurementConfigurationId)
          && Objects.equals(this.campaignId, that.campaignId);
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= Objects.hashCode(customerId);
    h *= 1000003;
    h ^= Objects.hashCode(liftMeasurementConfigurationId);
    h *= 1000003;
    h ^= Objects.hashCode(campaignId);
    return h;
  }

  /**
   * Builder for
   * customers/{customer_id}/liftMeasurementCampaigns/{lift_measurement_configuration_id}~{campaign_id}.
   */
  public static class Builder {
    private String customerId;
    private String liftMeasurementConfigurationId;
    private String campaignId;

    protected Builder() {}

    public String getCustomerId() {
      return customerId;
    }

    public String getLiftMeasurementConfigurationId() {
      return liftMeasurementConfigurationId;
    }

    public String getCampaignId() {
      return campaignId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setLiftMeasurementConfigurationId(String liftMeasurementConfigurationId) {
      this.liftMeasurementConfigurationId = liftMeasurementConfigurationId;
      return this;
    }

    public Builder setCampaignId(String campaignId) {
      this.campaignId = campaignId;
      return this;
    }

    private Builder(LiftMeasurementCampaignName liftMeasurementCampaignName) {
      this.customerId = liftMeasurementCampaignName.customerId;
      this.liftMeasurementConfigurationId =
          liftMeasurementCampaignName.liftMeasurementConfigurationId;
      this.campaignId = liftMeasurementCampaignName.campaignId;
    }

    public LiftMeasurementCampaignName build() {
      return new LiftMeasurementCampaignName(this);
    }
  }
}
